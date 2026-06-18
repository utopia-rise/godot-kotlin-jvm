package godot.registrar.generator.generator.hint

import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.getRegisteredName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.ScriptClass

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<PropertyHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.RESOURCE_TYPE

    override fun getHintString(): String {
        return (registeredProperty.type as? ScriptClass)
            ?.takeIf { scriptClass -> scriptClass.isRegistered }
            ?.getRegisteredName(context.settings)
            ?: context.registeredClassesByFqName[registeredProperty.type.fqName]?.getRegisteredName(context.settings)
            ?: registeredProperty.type.fqName.substringAfterLast(".")
    }
}
