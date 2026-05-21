package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<MultilineTextHintAnnotation>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String = ""
}
