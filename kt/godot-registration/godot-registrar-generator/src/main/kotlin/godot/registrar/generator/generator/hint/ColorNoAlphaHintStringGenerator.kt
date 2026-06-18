package godot.registrar.generator.generator.hint

import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ColorNoAlphaHint

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<ColorNoAlphaHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.COLOR_NO_ALPHA

    override fun getHintString(): String = ""
}
