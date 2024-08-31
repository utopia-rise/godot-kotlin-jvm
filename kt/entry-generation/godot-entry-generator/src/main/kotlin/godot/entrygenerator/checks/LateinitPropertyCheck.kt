package godot.entrygenerator.checks

import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class LateinitPropertyCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.properties }
            .filter { registeredProperty -> registeredProperty.annotations.filterIsInstance<RegisterPropertyAnnotation>().isNotEmpty() }
            .forEach { exportedProperty ->
                if (exportedProperty.isLateinit && (exportedProperty.type.isCoreType() || exportedProperty.type.isGodotPrimitive())) {
                    hasIssue = true
                    logger.error(exportedProperty, "Registered property with godot core type cannot be lateinit. Assign a default value")
                }
            }
        return hasIssue
    }
}
