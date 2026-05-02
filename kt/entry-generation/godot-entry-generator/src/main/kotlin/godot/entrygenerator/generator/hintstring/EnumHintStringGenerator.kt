package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<EnumAnnotation>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.enumValueNames?.joinToString(",") ?: ""
    }
}
