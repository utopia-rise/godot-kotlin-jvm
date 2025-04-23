package godot.annotation.processor.classgraph.logging

import godot.entrygenerator.model.GodotJvmSourceElement
import org.slf4j.Logger

class LoggerWrapper(private val logger: Logger) : godot.entrygenerator.utils.Logger {
    override fun logging(message: String, sourceElement: GodotJvmSourceElement?) = logger.info(message)

    override fun info(message: String, sourceElement: GodotJvmSourceElement?) = logger.info(message)

    override fun warn(message: String, sourceElement: GodotJvmSourceElement?) = logger.warn(message)

    override fun error(message: String, sourceElement: GodotJvmSourceElement?) = logger.error(message)

    override fun exception(e: Throwable) = logger.error(e.toString())
}
