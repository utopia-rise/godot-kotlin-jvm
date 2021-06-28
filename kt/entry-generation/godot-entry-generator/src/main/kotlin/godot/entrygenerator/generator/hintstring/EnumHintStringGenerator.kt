package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.RegisteredProperty

class EnumHintStringGenerator(registeredProperty: RegisteredProperty) :
    PropertyHintStringGenerator<EnumAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        return propertyHintAnnotation?.enumValueNames?.joinToString(",") ?: ""
    }
}
