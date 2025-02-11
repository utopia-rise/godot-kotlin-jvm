package godot.entrygenerator.checks

import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isEnum
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.ext.isJavaCollection
import godot.entrygenerator.ext.isKotlinCollection
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isRefCounted
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.utils.Logger

class PropertyTypeCheck(logger: Logger, registeredClasses: List<RegisteredClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false
        registeredClasses
            .flatMap { it.properties }
            .filter { registeredProperty ->
                registeredProperty.annotations.filterIsInstance<RegisterPropertyAnnotation>().isNotEmpty()
            }
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
                        exportedProperty,
                        "Registered property can only be of type primitive, core type, node type or ref counted"
                    )
                }
            }
        return hasIssue
    }
}
