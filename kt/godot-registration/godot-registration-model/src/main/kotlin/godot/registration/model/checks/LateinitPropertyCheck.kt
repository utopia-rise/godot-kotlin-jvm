package godot.registration.model.checks

import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isGodotPrimitive
import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger

class LateinitPropertyCheck(logger: Logger, registeredClasses: List<ScriptClass>) :
    BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .forEach { exportedProperty ->
                if (exportedProperty.isLateinit && (exportedProperty.type.isCoreType() || exportedProperty.type.isGodotPrimitive())) {
                    hasIssue = true
                    logger.error(
                        "Registered property with godot core type cannot be lateinit. Assign a default value",
                        exportedProperty
                    )
                }
            }
        return hasIssue
    }
}
