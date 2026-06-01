package godot.registrar.generator.generator.typehint.array

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.generator.typehint.PropertyTypeHintGenerator
import godot.registrar.generator.utils.asEnumName
import godot.registration.model.RegisteredProperty

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

