package godot.registration.model.checks

import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isGodotPrimitive
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class NullablePropertyCheck(logger: Logger, registeredClasses: List<ScriptClass>) :
    BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .forEach { exportedProperty ->
                if (exportedProperty.type.isNullable && (exportedProperty.type.isCoreType() || exportedProperty.type.isGodotPrimitive())) {
                    hasIssue = true
                    logger.error(
                        "Registered property which is a Kotlin/Java primitive or Godot core type cannot be nullable. Assign a default value",
                        exportedProperty
                    )
                }
            }
        return hasIssue
    }
}
