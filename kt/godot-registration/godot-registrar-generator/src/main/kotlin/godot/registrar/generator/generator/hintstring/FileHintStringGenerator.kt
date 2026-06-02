package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.FileHint

class FileHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<FileHint>(registeredProperty, context) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.extensions?.joinToString(",") ?: ""
    }
}
