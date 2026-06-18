package godot.registrar.generator.generator.hint

import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.MultilineTextHint


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<MultilineTextHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.MULTILINE_TEXT

    override fun getHintString(): String = ""
}
