package godot.annotation.processor.utils

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSNode
import godot.entrygenerator.model.GodotJvmSourceElement
import godot.entrygenerator.utils.Logger

internal class LoggerWrapper(
    private val kspLogger: KSPLogger
) : Logger {
    override fun logging(sourceElement: GodotJvmSourceElement, message: String) = kspLogger.logging(message, sourceElement.source as? KSNode)

    override fun info(sourceElement: GodotJvmSourceElement, message: String) = kspLogger.info(message, sourceElement.source as? KSNode)

    override fun warn(sourceElement: GodotJvmSourceElement, message: String) = kspLogger.warn(message, sourceElement.source as? KSNode)

    override fun error(sourceElement: GodotJvmSourceElement, message: String) = kspLogger.error(message, sourceElement.source as? KSNode)

    override fun exception(e: Throwable) = kspLogger.exception(e)
}
