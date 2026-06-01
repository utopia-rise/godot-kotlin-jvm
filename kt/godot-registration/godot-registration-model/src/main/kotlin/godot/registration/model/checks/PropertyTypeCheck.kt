package godot.registration.model.checks

import godot.registration.model.ext.*
import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger

class PropertyTypeCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .forEach { exportedProperty ->
                if (
                    !exportedProperty.type.isGodotPrimitive()
                    && !exportedProperty.type.isCoreType()
                    && !exportedProperty.type.isNodeType()
                    && !exportedProperty.type.isRefCounted()
                    && !exportedProperty.type.isKotlinCollection()
                    && !exportedProperty.type.isJavaCollection()
                    && !exportedProperty.type.isEnum()
                ) {
                    hasIssue = true
                    logger.error(
                        "Registered property can only be of type primitive, core type, node type or ref counted",
                        exportedProperty
                    )
                }
            }
        return hasIssue
    }
}
