package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ExpEasingHint
import godot.core.PropertyHint as GodotPropertyHint

class ExpEasingHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<ExpEasingHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.EXP_EASING

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
