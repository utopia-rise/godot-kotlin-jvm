package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class IntFlagHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != "kotlin.Int") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, Int::class.qualifiedName)
        }

        return (propertyHintAnnotation as? IntFlagHintAnnotation)
            ?.names
            ?.joinToString(",") { it.removeSurrounding("\"") }
            ?: ""
    }
}
