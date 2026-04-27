package godot.annotation.processor.classgraph.logging

import org.slf4j.Logger

class LoggerWrapper(private val logger: Logger) : godot.entrygenerator.utils.Logger {
    override fun logging(message: String, sourceElement: Any?) = logger.info(message)

    override fun info(message: String, sourceElement: Any?) = logger.info(message)

    override fun warn(message: String, sourceElement: Any?) = logger.warn(message)

    override fun error(message: String, sourceElement: Any?) = logger.error(message)

    override fun exception(e: Throwable) = logger.error(e.toString())
}
