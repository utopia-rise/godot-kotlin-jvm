package godot.annotation.processor.utils

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSNode
import godot.entrygenerator.model.GodotJvmSourceElement
import godot.entrygenerator.utils.Logger

internal class LoggerWrapper(
    private val kspLogger: KSPLogger
) : Logger {
    override fun logging(message: String, sourceElement: GodotJvmSourceElement?) = kspLogger.logging(message, sourceElement?.symbolProcessorSource as? KSNode)

    override fun info(message: String, sourceElement: GodotJvmSourceElement?) = kspLogger.info(message, sourceElement?.symbolProcessorSource as? KSNode)

    override fun warn(message: String, sourceElement: GodotJvmSourceElement?) = kspLogger.warn(message, sourceElement?.symbolProcessorSource as? KSNode)

    override fun error(message: String, sourceElement: GodotJvmSourceElement?) = kspLogger.error(message, sourceElement?.symbolProcessorSource as? KSNode)

    override fun exception(e: Throwable) = kspLogger.exception(e)
}
