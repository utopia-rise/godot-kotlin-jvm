package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.baseGodotType
import godot.registrar.generator.ext.getRegisteredName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.ScriptClass
import godot.core.PropertyHint as GodotPropertyHint

class NodeTypeHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<PropertyHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.NODE_TYPE

    override fun getHintString(): String {
        return (registeredProperty.type as? ScriptClass)
            ?.takeIf { scriptClass -> scriptClass.isRegistered }
            ?.getRegisteredName(context.settings)
            ?: context.registeredClassesByFqName[registeredProperty.type.fqName]?.getRegisteredName(context.settings)
            ?: registeredProperty.type.baseGodotType()?.fqName?.substringAfterLast(".") ?: ""
    }
}
