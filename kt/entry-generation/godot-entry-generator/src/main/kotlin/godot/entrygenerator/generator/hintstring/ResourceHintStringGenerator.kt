package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String {
        // we first try to use the registered class name in case it's a user type extending a godot type
        // if that is not the case (null) we get the simple name instead
        return registeredClassesByFqName[registeredProperty.type.fqName]?.getRegisteredName(settings)
            ?: registeredProperty.type.fqName.substringAfterLast(".")
    }
}
