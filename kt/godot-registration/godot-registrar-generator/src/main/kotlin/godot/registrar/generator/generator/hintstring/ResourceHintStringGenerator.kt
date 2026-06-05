package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.getRegisteredName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.ScriptClass

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<PropertyHint>(registeredProperty, context) {

    override fun getHintString(): String {
        // we first try to use the registered class name in case it's a user type extending a godot type
        // if that is not the case (null) we get the simple name instead
        return (registeredProperty.type as? ScriptClass)
            ?.takeIf { scriptClass -> scriptClass.isRegistered }
            ?.getRegisteredName(context.settings)
            ?: context.registeredClassesByFqName[registeredProperty.type.fqName]?.getRegisteredName(context.settings)
            ?: registeredProperty.type.fqName.substringAfterLast(".")
    }
}
