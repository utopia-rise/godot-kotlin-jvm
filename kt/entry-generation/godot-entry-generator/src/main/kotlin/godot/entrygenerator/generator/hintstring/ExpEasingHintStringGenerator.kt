package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class ExpEasingHintStringGenerator(registeredProperty: RegisteredProperty) :
    PropertyHintStringGenerator<ExpEasingHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (!listOf(Float::class.qualifiedName, Double::class.qualifiedName).contains(registeredProperty.type.fqName)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "${Float::class.qualifiedName}s and ${Double::class.qualifiedName}s")
        }

        if (propertyHintAnnotation == null) {
            return ""
        }

        return when {
            propertyHintAnnotation.attenuation && propertyHintAnnotation.inOut -> "attenuation,inout"
            propertyHintAnnotation.attenuation -> "attenuation"
            propertyHintAnnotation.inOut -> "inout"
            else -> ""
        }
    }
}
