package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class RangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<RangeHintAnnotation<Number>>(registeredProperty) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.DOUBLE, JvmType.FLOAT, JvmType.INT, JvmType.LONG)) {
            throw WrongAnnotationUsageException(
                registeredProperty,
                propertyHintAnnotation,
                setOf(
                    *JvmType.DOUBLE.fqName.toTypedArray(),
                    *JvmType.FLOAT.fqName.toTypedArray(),
                    *JvmType.INT.fqName.toTypedArray(),
                    *JvmType.LONG.fqName.toTypedArray()
                )
            )
        }
        if (propertyHintAnnotation == null) {
            return ""
        }

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(propertyHintAnnotation.start)
        argumentsForStringTemplate.add(propertyHintAnnotation.end)

        if (propertyHintAnnotation.step.toDouble() >= 0) {
            argumentsForStringTemplate.add(propertyHintAnnotation.step)
        }

        if (propertyHintAnnotation.or != Range.NONE) {
            argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
        }

        if (propertyHintAnnotation.hideSlider) {
            argumentsForStringTemplate.add("hide_slider")
        }

        if (propertyHintAnnotation.isRadians) {
            argumentsForStringTemplate.add("radians")
        }

        if (propertyHintAnnotation.isDegrees) {
            argumentsForStringTemplate.add("degrees")
        }

        if (propertyHintAnnotation.isExp) {
            argumentsForStringTemplate.add("exp")
        }

        if (propertyHintAnnotation.suffix != null) {
            argumentsForStringTemplate.add("suffix:${propertyHintAnnotation.suffix}")
        }

        return argumentsForStringTemplate.joinToString(",")
    }
}
