package godot.registration.model.checks

import godot.registration.model.ext.isBitField
import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isEnum
import godot.registration.model.ext.isGodotPrimitive
import godot.registration.model.ext.isJavaCollection
import godot.registration.model.ext.isKotlinCollection
import godot.registration.model.ext.isNodeType
import godot.registration.model.ext.isRefCounted
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class PropertyTypeCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .forEach { exportedProperty ->
                val type = exportedProperty.type
                val isAllowed = type.isGodotPrimitive()
                    || type.isCoreType()
                    || type.isNodeType()
                    || type.isRefCounted()
                    || type.isKotlinCollection()
                    || type.isJavaCollection()
                    || type.isEnum()
                    || type.isBitField()

                if (!isAllowed) {
                    hasIssue = true
                    logger.error(
                        "Registered property can only be of type primitive, core type, node type or ref counted",
                        exportedProperty
                    )
                } else if (type.isBitField() && type.genericArguments.firstOrNull()?.isEnum() != true) {
                    hasIssue = true
                    logger.error(
                        "A bitfield property must be a BitField<E> where E is an enum. " +
                            "Engine bitfields cannot be exported directly; wrap your enum in BitField<…>.",
                        exportedProperty
                    )
                }
            }
        return hasIssue
    }
}
