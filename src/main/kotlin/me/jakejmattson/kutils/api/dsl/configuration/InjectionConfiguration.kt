package me.jakejmattson.kutils.api.dsl.configuration

import me.jakejmattson.kutils.internal.utils.diService

/**
 * @suppress Used in sample
 */
class InjectionConfiguration {
    fun inject(vararg injectionObjects: Any) = injectionObjects.forEach { diService.inject(it) }
}