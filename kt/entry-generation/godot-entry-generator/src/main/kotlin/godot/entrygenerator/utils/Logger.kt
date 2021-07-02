package godot.entrygenerator.utils

interface Logger {
    fun logging(message: String)
    fun info(message: String)
    fun warn(message: String)
    fun error(message: String)

    fun exception(e: Throwable)
}
