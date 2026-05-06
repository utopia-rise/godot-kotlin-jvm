package godot.entrygenerator.generator.typehint.array

import com.squareup.kotlinpoet.MemberName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.names.CoreType

class JvmArrayAndDictionaryTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            null -> CoreType.propertyHint("TYPE_STRING")
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

