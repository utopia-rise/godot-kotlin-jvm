package godot.entrygenerator.checks

import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class LateinitPropertyCheck(logger: Logger, registeredClasses: List<RegisteredClass>): BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
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
