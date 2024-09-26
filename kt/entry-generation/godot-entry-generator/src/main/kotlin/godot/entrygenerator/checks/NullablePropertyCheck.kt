package godot.entrygenerator.checks

import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class NullablePropertyCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute(): Boolean {
        var hasIssue = false
        sourceFiles
            .flatMap { it.registeredClasses }
            .flatMap { it.properties }
            .filter { registeredProperty -> registeredProperty.annotations.filterIsInstance<RegisterPropertyAnnotation>().isNotEmpty() }
            .forEach { exportedProperty ->
                if (exportedProperty.type.isNullable && (exportedProperty.type.isCoreType() || exportedProperty.type.isGodotPrimitive())) {
                    hasIssue = true
                    logger.error(exportedProperty, "Registered property which is a godot primitive, godot core type or inheriting godot.Object cannot be nullable. Assign a default value")
                }
            }
        return hasIssue
    }
}
