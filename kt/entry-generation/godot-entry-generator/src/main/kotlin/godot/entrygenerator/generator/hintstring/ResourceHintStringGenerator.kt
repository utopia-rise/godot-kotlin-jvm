package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
) : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty, settings) {

    override fun getHintString(): String {
        // we first try to use the registered class name in case it's a user type extending a godot type
        // if that is not the case (null) we get the simple name instead
        return registeredProperty.type.registeredName(settings) ?: registeredProperty.type.fqName.substringAfterLast(".")
    }
}
