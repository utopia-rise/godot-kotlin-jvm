package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.Range
import godot.registration.model.hint.property.RangeHint
import java.util.*

class RangeHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<RangeHint<Number>>(registeredProperty, context) {
    override fun getHintString(): String {
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
