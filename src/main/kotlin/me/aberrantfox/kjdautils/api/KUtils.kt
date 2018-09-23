package me.aberrantfox.kjdautils.api

import com.google.common.eventbus.Subscribe
import me.aberrantfox.kjdautils.api.dsl.CommandEvent
import me.aberrantfox.kjdautils.api.dsl.CommandsContainer
import me.aberrantfox.kjdautils.api.dsl.KJDAConfiguration
import me.aberrantfox.kjdautils.api.dsl.produceContainer
import me.aberrantfox.kjdautils.internal.command.CommandExecutor
import me.aberrantfox.kjdautils.internal.command.CommandRecommender
import me.aberrantfox.kjdautils.internal.command.HelpService
import me.aberrantfox.kjdautils.internal.command.PreconditionResult
import me.aberrantfox.kjdautils.internal.di.DIService
import me.aberrantfox.kjdautils.internal.event.EventRegister
import me.aberrantfox.kjdautils.internal.listeners.CommandListener
import me.aberrantfox.kjdautils.internal.logging.BotLogger
import me.aberrantfox.kjdautils.internal.logging.DefaultLogger
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder
import org.reflections.Reflections
import org.reflections.scanners.MethodAnnotationsScanner
import java.io.File


class KUtils(val config: KJDAConfiguration) {
    private var listener: CommandListener? = null
    private var executor: CommandExecutor? = null
    private val helpService: HelpService
    private val diService = DIService()

    val container = CommandsContainer()

    val jda = JDABuilder(AccountType.BOT).setToken(config.token).buildBlocking()
    var logger: BotLogger = DefaultLogger()

    init {
        jda.addEventListener(EventRegister)
        helpService = HelpService(container, config)
    }

    fun registerInjectionObject(vararg obj: Any) = obj.forEach { diService.addElement(it) }

    fun registerCommands(commandPath: String): CommandsContainer {
        config.commandPath = commandPath

        val localContainer = produceContainer(commandPath, diService)
        CommandRecommender.addAll(localContainer.listCommands())

        val executor = CommandExecutor()
        val listener = CommandListener(config, container, logger, executor)

        this.container.join(localContainer)
        this.executor = executor
        this.listener = listener

        registerListeners(listener)
        return container
    }

    fun registerCommandPreconditions(vararg conditions: (CommandEvent) -> PreconditionResult) = listener?.addPreconditions(*conditions)

    fun registerListeners(vararg listeners: Any) =
            listeners.forEach {
                EventRegister.eventBus.register(it)
            }

    fun registerListenersByPath(path: String) {
        config.listenerPath = path
        Reflections(path, MethodAnnotationsScanner()).getMethodsAnnotatedWith(Subscribe::class.java)
                .map { it.declaringClass }
                .distinct()
                .map { diService.invokeConstructor(it) }
                .forEach { registerListeners(it) }
    }
    
    fun configure(setup: KJDAConfiguration.() -> Unit) {
        val lastCommandPath = config.commandPath
        val lastListenerPath = config.listenerPath

        config.setup()

        if (lastCommandPath != config.commandPath)
            registerCommands(config.commandPath)
        if (lastListenerPath != config.listenerPath)
            registerListenersByPath(config.listenerPath)
    }
}

fun startBot(token: String, operate: KUtils.() -> Unit = {}): KUtils {
    val util = KUtils(KJDAConfiguration(token))
    util.operate()
    return util
}