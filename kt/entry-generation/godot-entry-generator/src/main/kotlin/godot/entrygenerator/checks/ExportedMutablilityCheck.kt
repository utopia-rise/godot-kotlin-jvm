package godot.entrygenerator.checks

import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ExportedMutablilityCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.properties }
            .filter { registeredProperty -> registeredProperty.annotations.filterIsInstance<ExportAnnotation>().isNotEmpty() }
            .forEach { exportedProperty ->
                if (!exportedProperty.isMutable) {
                    hasIssue = true
                    logger.error("Exported property is not mutable: ${exportedProperty.fqName}")
                }
            }
        return hasIssue
    }
}
