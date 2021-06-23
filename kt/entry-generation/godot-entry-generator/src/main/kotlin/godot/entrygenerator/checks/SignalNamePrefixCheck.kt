package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class SignalNamePrefixCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.signals }
            .forEach { registeredSignal ->
                if (!registeredSignal.name.startsWith("signal")) {
                    logger.error("RegisteredSignal ${registeredSignal.fqName} is not prefixed with \"signal\"")
                }
            }
    }
}
