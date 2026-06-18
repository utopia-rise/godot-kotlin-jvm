package godot.registrar.generator.generator.hint

import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.IntFlagHint

class IntFlagHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<IntFlagHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = GodotPropertyHint.FLAGS

    override fun getHintString(): String {
        return propertyHintAnnotation
            ?.names
            ?.joinToString(",") { it.removeSurrounding("\"") }
            ?: ""
    }
}
