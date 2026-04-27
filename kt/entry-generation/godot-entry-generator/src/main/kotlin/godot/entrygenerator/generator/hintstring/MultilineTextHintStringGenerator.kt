package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
) : PropertyHintStringGenerator<MultilineTextHintAnnotation>(registeredProperty, settings) {

    override fun getHintString(): String = ""
}
