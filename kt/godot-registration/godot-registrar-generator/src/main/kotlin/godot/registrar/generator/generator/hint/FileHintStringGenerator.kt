package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.FileHint
import godot.core.PropertyHint as GodotPropertyHint

class FileHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<FileHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint =
        if (propertyHintAnnotation?.global == true) GodotPropertyHint.GLOBAL_FILE else GodotPropertyHint.FILE

    override fun getHintString(): String {
        return propertyHintAnnotation?.extensions?.joinToString(",") ?: ""
    }
}
