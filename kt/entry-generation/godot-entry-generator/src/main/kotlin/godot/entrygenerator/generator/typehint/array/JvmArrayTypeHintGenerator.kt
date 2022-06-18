package godot.entrygenerator.generator.typehint.array

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongPropertyAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.RegisteredProperty

class JvmArrayTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            null -> ClassName("godot.core.PropertyHint", "NONE")
            else -> throw WrongPropertyAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}
