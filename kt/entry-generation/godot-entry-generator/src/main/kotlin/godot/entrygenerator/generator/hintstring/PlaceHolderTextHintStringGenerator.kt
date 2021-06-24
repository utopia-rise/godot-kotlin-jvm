package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<PlaceHolderTextHintAnnotation>(registeredProperty) {

    override fun getHintString(): String = ""
}
