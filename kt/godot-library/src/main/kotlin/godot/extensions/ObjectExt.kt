@file:JvmName("ObjectUtils")
package godot.extensions

import godot.Object
import godot.core.Callable
import godot.core.VariantArray
import godot.extensions.asStringName
import godot.signals.Signal
import godot.util.camelToSnakeCase
import kotlin.reflect.KFunction

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callDeferred] to call functions by string or [callDeferredRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callDeferred(function: T, vararg args: Any?) =
    callDeferred(function.name.camelToSnakeCase().asStringName(), *args)

/**
 * Same as [callDeferred] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callDeferredRawName(function: T, vararg args: Any?) =
    callDeferred(function.name.asStringName(), *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.call] to call functions by string or [callRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.call(function: T, vararg args: Any?) =
    call(function.name.camelToSnakeCase().asStringName(), *args)

/**
 * Same as [call] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callRawName(function: T, vararg args: Any?) =
    call(function.name.asStringName(), *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callv] to call functions by string or [callvRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callv(function: T, argArray: VariantArray<Any?>) =
    callv(function.name.camelToSnakeCase().asStringName(), argArray)

/**
 * Same as [callv] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callvRawName(function: T, argArray: VariantArray<Any?>) =
    callv(function.name.asStringName(), argArray)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.hasMethod] to check function existence by string or [hasMethodRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.hasMethod(function: T) =
    hasMethod(function.name.camelToSnakeCase().asStringName())

/**
 * Same as [hasMethod] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.hasMethodRawName(function: T) =
    hasMethod(function.name.asStringName())

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.isConnected] to check connections by string or [hasMethodRawName] for an unconverted version of this function
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.isConnected(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, Callable(target, function.name.camelToSnakeCase().asStringName()))

/**
 * Same as [isConnected] but the function name is not converted to snake_case
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.isConnectedRawName(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, Callable(target, function.name.asStringName()))

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.connect] to connect by string or [hasMethodRawName] for an unconverted version of this function
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.connect(
    signal: Signal,
    target: Object,
    function: T,
    flags: Int = 0
) = connect(
    signal.name,
    Callable(target, function.name.camelToSnakeCase().asStringName()),
    flags.toLong()
)

/**
 * Same as [connect] but the function name is not converted to snake_case
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.connectRawName(
    signal: Signal,
    target: Object,
    function: T,
    flags: Int = 0
) = connect(signal.name, Callable(target, function.name.asStringName()), flags.toLong())

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.disconnect] to connect by string or [disconnectRawName] for an unconverted version of this function
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.disconnect(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, Callable(target, function.name.camelToSnakeCase().asStringName()))

/**
 * Same as [disconnect] but the function name is not converted to snake_case
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.disconnectRawName(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, Callable(target, function.name.asStringName()))
