package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class RangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<RangeHintAnnotation<Number>>(registeredProperty) {
    override fun getHintString(): String {
        //FIXME: once rebased onto language independent branch, add other numeric types
//        if (registeredProperty.type.fqName != Double::class.qualifiedName) {
//            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, Double::class.qualifiedName)
//        }
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
