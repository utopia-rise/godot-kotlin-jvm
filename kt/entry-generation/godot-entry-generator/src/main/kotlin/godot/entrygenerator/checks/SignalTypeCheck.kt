package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.signalPackage

class SignalTypeCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith("$signalPackage.${GodotKotlinJvmTypes.signal}")) {
                    hasIssue = true
                    logger.error("RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}")
                }
            }
        return hasIssue
    }
}
