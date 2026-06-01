package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.baseGodotType
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.ScriptClass

class NodeTypeHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<PropertyHint>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        // we first try to use the registered class name in case it's a user type extending a godot type
        // if that is not the case (null) we get the simple name instead
        return registeredClassesByFqName[registeredProperty.type.fqName]?.getRegisteredName(settings)
            ?: registeredProperty.type.baseGodotType()?.fqName?.substringAfterLast(".") ?: ""
    }
}
