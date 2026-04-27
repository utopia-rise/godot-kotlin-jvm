package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
) : PropertyHintStringGenerator<PlaceHolderTextHintAnnotation>(registeredProperty, settings) {

    override fun getHintString(): String = ""
}
