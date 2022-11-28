package godot.entrygenerator.checks

import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class ExportedMutablilityCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.registeredProperties }
            .filter { registeredProperty -> registeredProperty.annotations.filterIsInstance<ExportAnnotation>().isNotEmpty() }
            .forEach { exportedProperty ->
                if (!exportedProperty.isMutable) {
                    logger.error("Exported property is not mutable: ${exportedProperty.fqName}")
                }
            }
    }
}
