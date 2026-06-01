package godot.registration.model.logging

import org.slf4j.Logger

class LoggerWrapper(private val logger: Logger) : godot.registration.model.logging.Logger {
    override fun logging(message: String, sourceElement: Any?) = logger.info(format(message, sourceElement))

    override fun info(message: String, sourceElement: Any?) = logger.info(format(message, sourceElement))

    override fun warn(message: String, sourceElement: Any?) = logger.warn(format(message, sourceElement))

    override fun error(message: String, sourceElement: Any?) = logger.error(format(message, sourceElement))

    override fun exception(e: Throwable) = logger.error(e.toString())

    private fun format(message: String, sourceElement: Any?): String =
        if (sourceElement == null) {
            message
        } else {
            "$message: $sourceElement"
        }
}
