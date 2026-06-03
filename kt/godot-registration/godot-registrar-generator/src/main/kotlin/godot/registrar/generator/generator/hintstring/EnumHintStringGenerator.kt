package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.EnumHint

class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<EnumHint>(registeredProperty, context) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.enumValues?.toGodotHintString() ?: ""
    }
}
