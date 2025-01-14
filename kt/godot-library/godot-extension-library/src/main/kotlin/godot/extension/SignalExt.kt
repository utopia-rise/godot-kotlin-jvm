package godot.extension

import godot.core.Callable
import godot.core.Signal
import godot.api.Node
import godot.core.asStringName

private val connectMethodName = "connect".asStringName()

fun Signal.connectThreadSafe(callable: Callable, flags: Int = 0) =
    (godotObject as? Node)?.callThreadSafe(
        connectMethodName,
        name,
        callable,
        flags.toLong()
    ) ?: godotObject.connect(
        name,
        callable,
        flags.toLong()
    )

