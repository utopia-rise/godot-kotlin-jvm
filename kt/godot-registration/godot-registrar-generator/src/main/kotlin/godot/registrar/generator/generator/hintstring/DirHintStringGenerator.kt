package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.DirHint

class DirHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<DirHint>(registeredProperty, context) {

    override fun getHintString(): String {
        return "" //hint string is empty for this typehint
    }
}
