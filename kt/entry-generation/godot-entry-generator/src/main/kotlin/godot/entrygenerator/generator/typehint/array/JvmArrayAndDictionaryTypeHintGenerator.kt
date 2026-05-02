package godot.entrygenerator.generator.typehint.array

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.utils.asEnumName

class JvmArrayAndDictionaryTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            null -> PropertyHint.TYPE_STRING.asEnumName()
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

