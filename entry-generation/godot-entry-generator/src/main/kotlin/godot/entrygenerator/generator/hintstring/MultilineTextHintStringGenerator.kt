package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<MultilineTextHintAnnotation>(registeredProperty) {

    override fun getHintString(): String = ""
}
