package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PlaceHolderTextHint
import godot.core.PropertyHint as GodotPropertyHint


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<PlaceHolderTextHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.PLACEHOLDER_TEXT

    override fun getHintString(): String = ""
}
