package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.baseGodotType
import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty) {

    override fun getHintString(): String {
        // we first try to use the registered class name in case it's a user type extending a godot type
        // if that is not the case (null) we get the simple name instead
        return registeredProperty.type.registeredName() ?: registeredProperty.type.fqName.substringAfterLast(".")
    }
}
