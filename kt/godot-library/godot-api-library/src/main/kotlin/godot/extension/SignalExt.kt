@file:JvmName("SignalExt")
package godot.extension

import godot.Node
import godot.core.Callable
import godot.core.Signal
import godot.core.asStringName

private val connectMethodName = "connect".asStringName()

fun Signal.connectThreadSafe(
    callable: Callable,
    flags: Int = 0
): Any? {
    val obj = godotObject
    return if(obj is Node){
        obj.callThreadSafe(connectMethodName, name, callable, flags.toLong())
    } else {
        obj.connect(name, callable, flags.toLong())
    }
}
