package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ExpEasingHint

class ExpEasingHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<ExpEasingHint>(registeredProperty, context) {
    override fun getHintString(): String {
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
