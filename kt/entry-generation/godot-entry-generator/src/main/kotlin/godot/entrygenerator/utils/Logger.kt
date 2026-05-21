package godot.entrygenerator.utils

interface Logger {
    fun logging(message: String, sourceElement: Any? = null)
    fun info(message: String, sourceElement: Any? = null)
    fun warn(message: String, sourceElement: Any? = null)
    fun error(message: String, sourceElement: Any? = null)

    fun exception(e: Throwable)
}
