package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class PropertyMutablilityCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.properties }
            .forEach { registeredProperty ->
                if (!registeredProperty.isMutable) {
                    hasIssue = true
                    logger.error(registeredProperty, "Registered property is not mutable")
                }
            }
        return hasIssue
    }
}
