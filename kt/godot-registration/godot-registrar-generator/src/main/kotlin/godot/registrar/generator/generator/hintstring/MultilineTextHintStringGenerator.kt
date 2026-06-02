package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.MultilineTextHint


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<MultilineTextHint>(registeredProperty, context) {

    override fun getHintString(): String = ""
}
