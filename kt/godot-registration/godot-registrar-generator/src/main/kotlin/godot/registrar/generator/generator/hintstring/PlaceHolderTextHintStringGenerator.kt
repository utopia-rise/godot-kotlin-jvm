package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PlaceHolderTextHint
import godot.registration.model.types.ScriptClass


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<PlaceHolderTextHint>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String = ""
}
