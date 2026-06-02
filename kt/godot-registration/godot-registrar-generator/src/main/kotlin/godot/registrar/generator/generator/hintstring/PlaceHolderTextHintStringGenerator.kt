package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PlaceHolderTextHint


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<PlaceHolderTextHint>(registeredProperty, context) {

    override fun getHintString(): String = ""
}
