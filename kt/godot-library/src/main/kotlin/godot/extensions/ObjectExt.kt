package godot.extensions

import godot.Object
import godot.core.VariantArray
import godot.signals.Signal
import godot.util.camelToSnakeCase
import kotlin.reflect.KFunction

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callDeferred] to call functions by string or [callDeferredRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callDeferred(function: T, vararg args: Any?) =
    callDeferred(function.name.camelToSnakeCase(), *args)

/**
 * Same as [callDeferred] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callDeferredRawName(function: T, vararg args: Any?) =
    callDeferred(function.name, *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.call] to call functions by string or [callRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.call(function: T, vararg args: Any?) =
    call(function.name.camelToSnakeCase(), *args)

/**
 * Same as [call] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callRawName(function: T, vararg args: Any?) =
    call(function.name, *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callv] to call functions by string or [callvRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callv(function: T, argArray: VariantArray<Any?>) =
    callv(function.name.camelToSnakeCase(), argArray)

/**
 * Same as [callv] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callvRawName(function: T, argArray: VariantArray<Any?>) =
    callv(function.name, argArray)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.hasMethod] to check function existence by string or [hasMethodRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.hasMethod(function: T) =
    hasMethod(function.name.camelToSnakeCase())

/**
 * Same as [hasMethod] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.hasMethodRawName(function: T) =
    hasMethod(function.name)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.isConnected] to check connections by string or [hasMethodRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.isConnected(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, target, function.name.camelToSnakeCase())

/**
 * Same as [isConnected] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.isConnectedRawName(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, target, function.name)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.connect] to connect by string or [hasMethodRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.connect(
    signal: Signal,
    target: Object,
    function: T,
    binds: VariantArray<Any?> = VariantArray(),
    flags: Long = 0
) = connect(signal.name, target, function.name.camelToSnakeCase(), binds, flags)

/**
 * Same as [connect] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.connectRawName(
    signal: Signal,
    target: Object,
    function: T,
    binds: VariantArray<Any?> = VariantArray(),
    flags: Long = 0
) = connect(signal.name, target, function.name, binds, flags)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.disconnect] to connect by string or [disconnectRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.disconnect(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, target, function.name.camelToSnakeCase())

/**
 * Same as [disconnect] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.disconnectRawName(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, target, function.name)
