package godot.entrygenerator.utils

import godot.entrygenerator.model.GodotJvmSourceElement

interface Logger {
    fun logging(sourceElement: GodotJvmSourceElement, message: String)
    fun info(sourceElement: GodotJvmSourceElement, message: String)
    fun warn(sourceElement: GodotJvmSourceElement, message: String)
    fun error(sourceElement: GodotJvmSourceElement, message: String)

    fun exception(e: Throwable)
}
