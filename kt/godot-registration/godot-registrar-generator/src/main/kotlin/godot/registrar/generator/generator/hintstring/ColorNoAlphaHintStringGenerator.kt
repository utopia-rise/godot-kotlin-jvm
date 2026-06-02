package godot.registrar.generator.generator.hintstring

import godot.core.Color
import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ColorNoAlphaHint

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<ColorNoAlphaHint>(registeredProperty, context) {

    override fun getHintString(): String {
        return "" //hint string is empty for this typehint
    }
}
