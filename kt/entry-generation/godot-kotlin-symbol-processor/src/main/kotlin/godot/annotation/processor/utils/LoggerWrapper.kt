package godot.annotation.processor.utils

import com.google.devtools.ksp.processing.KSPLogger
import godot.entrygenerator.utils.Logger

internal class LoggerWrapper(
    private val kspLogger: KSPLogger
) : Logger {
    override fun logging(message: String) = kspLogger.logging(message)

    override fun info(message: String) = kspLogger.info(message)

    override fun warn(message: String) = kspLogger.warn(message)

    override fun error(message: String) = kspLogger.error(message)

    override fun exception(e: Throwable) = kspLogger.exception(e)
}
