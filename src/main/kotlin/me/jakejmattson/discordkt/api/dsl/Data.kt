package me.jakejmattson.discordkt.api.dsl

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.*
import java.io.File

@PublishedApi
internal var module: SerializersModule = SerializersModule {}

@PublishedApi
internal val serializer: Json
    get() = Json {
        prettyPrint = true
        encodeDefaults = true
        ignoreUnknownKeys = true
        serializersModule = module
    }

/**
 * A serializable class that represents some data.
 */
@Serializable
@Polymorphic
public abstract class Data {
    @PublishedApi
    @Transient
    internal lateinit var file: File

    /**
     * Write the data object content to its file as JSON.
     */
    public fun save() {
        val parent = file.parentFile

        if (parent != null && !parent.exists())
            parent.mkdirs()

        file.writeText(serializer.encodeToString(this))
    }
}

@PublishedApi
internal inline fun <reified T : Data> registerSubclass() {
    module += SerializersModule {
        polymorphic(Data::class) {
            subclass(T::class)
        }
    }
}

@PublishedApi
internal inline fun <reified T : Data> readDataOrDefault(targetFile: File, fallback: T): T {
    registerSubclass<T>()

    val data =
        if (targetFile.exists())
            serializer.decodeFromString(targetFile.readText())
        else
            fallback

    data.file = targetFile
    data.save()
    return data
}