package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredProperty

class ExpEasingHintStringGenerator(registeredProperty: RegisteredProperty) :
    PropertyHintStringGenerator<ExpEasingHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.FLOAT, JvmType.DOUBLE)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, setOf(*JvmType.FLOAT.fqName.toTypedArray(), *JvmType.DOUBLE.fqName.toTypedArray()))
        }

        if (propertyHintAnnotation == null) {
            return ""
        }

        return when {
            propertyHintAnnotation.attenuation && propertyHintAnnotation.isPositiveOnly -> "attenuation,positive_only"
            propertyHintAnnotation.attenuation -> "attenuation"
            propertyHintAnnotation.isPositiveOnly -> "positive_only"
            else -> ""
        }
    }
}
