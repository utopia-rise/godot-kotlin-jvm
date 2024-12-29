@file:JvmName("ObjectUtils")

package godot.extensions

import godot.api.Object
import godot.api.RefCounted
import godot.core.Callable
import godot.core.VariantArray
import godot.internal.memory.MemoryManager
import godot.core.Signal
import godot.core.asCachedStringName
import godot.core.toGodotName
import kotlin.reflect.KFunction

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callDeferred] to call functions by string or [callDeferredRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callDeferred(function: T, vararg args: Any?) =
    callDeferred(function.name.toGodotName(), *args)

/**
 * Same as [callDeferred] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callDeferredRawName(function: T, vararg args: Any?) =
    callDeferred(function.name.asCachedStringName(), *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.call] to call functions by string or [callRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.call(function: T, vararg args: Any?) =
    call(function.name.toGodotName(), *args)

/**
 * Same as [call] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callRawName(function: T, vararg args: Any?) =
    call(function.name.asCachedStringName(), *args)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.callv] to call functions by string or [callvRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.callv(function: T, argArray: VariantArray<Any?>) =
    callv(function.name.toGodotName(), argArray)

/**
 * Same as [callv] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.callvRawName(function: T, argArray: VariantArray<Any?>) =
    callv(function.name.asCachedStringName(), argArray)

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.hasMethod] to check function existence by string or [hasMethodRawName] for an unconverted version of this function
 */
inline fun <reified T : KFunction<*>> Object.hasMethod(function: T) =
    hasMethod(function.name.toGodotName())

/**
 * Same as [hasMethod] but the function name is not converted to snake_case
 */
inline fun <reified T : KFunction<*>> Object.hasMethodRawName(function: T) =
    hasMethod(function.name.asCachedStringName())

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.isConnected] to check connections by string or [hasMethodRawName] for an unconverted version of this function
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.isConnected(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, Callable(target, function.name.toGodotName()))

/**
 * Same as [isConnected] but the function name is not converted to snake_case
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.isConnectedRawName(
    signal: Signal,
    target: Object,
    function: T
) = isConnected(signal.name, Callable(target, function.name.asCachedStringName()))

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
    Callable(target, function.name.toGodotName()),
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
) = connect(signal.name, Callable(target, function.name.asCachedStringName()), flags.toLong())

/**
 * **Note:** The function name is converted to snake_case
 * Use [Object.disconnect] to connect by string or [disconnectRawName] for an unconverted version of this function
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.disconnect(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, Callable(target, function.name.toGodotName()))

/**
 * Same as [disconnect] but the function name is not converted to snake_case
 */
//TODO/4.0: Check if still correct
inline fun <reified T : KFunction<*>> Object.disconnectRawName(
    signal: Signal,
    target: Object,
    function: T
) = disconnect(signal.name, Callable(target, function.name.asCachedStringName()))


/**
 * Instance will be automatically freed when the engine closes.
 */
fun <T : Object?> T.asStatic(): T {
    if (this == null || this is RefCounted) {
        return this
    }
    MemoryManager.registerCallback {
        if (!MemoryManager.isInstanceValid(this)) {
            return@registerCallback
        }
        free()

    }
    return this
}

