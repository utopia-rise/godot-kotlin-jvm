package godot.entrygenerator.utils

import godot.entrygenerator.model.GodotJvmSourceElement

interface Logger {
    fun logging(message: String, sourceElement: GodotJvmSourceElement? = null)
    fun info(message: String, sourceElement: GodotJvmSourceElement? = null)
    fun warn(message: String, sourceElement: GodotJvmSourceElement? = null)
    fun error(message: String, sourceElement: GodotJvmSourceElement? = null)

    fun exception(e: Throwable)
}
