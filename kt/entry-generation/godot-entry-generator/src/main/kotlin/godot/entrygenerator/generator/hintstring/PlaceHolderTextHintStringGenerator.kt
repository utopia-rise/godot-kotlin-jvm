package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<PlaceHolderTextHintAnnotation>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String = ""
}
