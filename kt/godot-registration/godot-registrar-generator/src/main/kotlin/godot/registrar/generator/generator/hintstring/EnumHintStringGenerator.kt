package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.types.ScriptClass

class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<EnumHint>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.enumValueNames?.joinToString(",") ?: ""
    }
}
