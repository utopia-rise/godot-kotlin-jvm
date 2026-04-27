package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class EnumHintStringGenerator(registeredProperty: RegisteredProperty, settings: Settings) :
    PropertyHintStringGenerator<EnumAnnotation>(registeredProperty, settings) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.enumValueNames?.joinToString(",") ?: ""
    }
}
