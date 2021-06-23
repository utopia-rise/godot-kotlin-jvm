package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class SignalTypeCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.type.fqName.startsWith("godot.signals.Signal")) {
                    logger.error("RegisteredSignal is not of type godot.signals.Signal! Resolved type: ${registeredSignal.type.fqName}")
                }
            }
    }
}
