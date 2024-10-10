package godot.utils

import godot.api.GD

internal object GodotLogging {
    fun info(message: String) = GD.print("Godot-JVM: ", message)
    fun warning(message: String) = GD.pushWarning("Godot-JVM: ", message)
    fun error(message: String) = GD.printErr("Godot-JVM: ", message)
}
