package godot

import godot.core.NodePath
import godot.core.VariantArray
import godot.util.camelToSnakeCase
import jdk.internal.misc.Signal
import kotlin.reflect.KFunction

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Node> Node.getNode(path: String) = getNode(NodePath(path)) as T

inline fun <reified T : KFunction<*>> Object.callDeferred(method: T, vararg args: Any?) =
    callDeferred(method.name.camelToSnakeCase(), args)


inline fun <reified T : KFunction<*>> Object.call(method: T, vararg args: Any?) =
    call(method.name.camelToSnakeCase(), args)


inline fun <reified T : KFunction<*>> Object.callv(method: T, argArray: VariantArray<Any?>) =
    callv(method.name.camelToSnakeCase(), argArray)


inline fun <reified T : KFunction<*>> Object.hasMethod(method: T) =
    hasMethod(method.name.camelToSnakeCase())

inline fun <reified T : KFunction<*>> Object.isConnected(
    signal: Signal,
    target: Object,
    method: T
) = isConnected(signal.name, target, method.name.camelToSnakeCase())

inline fun <reified T : KFunction<*>> Object.connect(
    signal: Signal,
    target: Object,
    method: T,
    binds: VariantArray<Any?> = VariantArray(),
    flags: Long = 0
) = connect(signal.name, target, method.name.camelToSnakeCase(), binds, flags)

inline fun <reified T : KFunction<*>> Object.disconnect(
    signal: Signal,
    target: Object,
    method: T
) = disconnect(signal.name, target, method.name.camelToSnakeCase())
