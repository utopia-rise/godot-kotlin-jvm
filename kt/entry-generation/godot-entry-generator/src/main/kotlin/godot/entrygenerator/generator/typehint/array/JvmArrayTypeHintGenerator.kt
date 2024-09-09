package godot.entrygenerator.generator.typehint.array

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotApiPackage

class JvmArrayTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            null -> ClassName("$godotApiPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}
