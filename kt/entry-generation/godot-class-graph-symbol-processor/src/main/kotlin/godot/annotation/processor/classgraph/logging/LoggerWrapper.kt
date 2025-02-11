package godot.annotation.processor.classgraph.logging

import godot.entrygenerator.model.GodotJvmSourceElement
import org.slf4j.Logger

class LoggerWrapper(private val logger: Logger) : godot.entrygenerator.utils.Logger {
    override fun logging(sourceElement: GodotJvmSourceElement, message: String) = logger.info(message)

    override fun info(sourceElement: GodotJvmSourceElement, message: String) = logger.info(message)

    override fun warn(sourceElement: GodotJvmSourceElement, message: String) = logger.warn(message)

    override fun error(sourceElement: GodotJvmSourceElement, message: String) = logger.error(message)

    override fun exception(e: Throwable) = logger.error(e.toString())
}
