package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.MultilineTextHint
import godot.registration.model.types.ScriptClass


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<MultilineTextHint>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String = ""
}
