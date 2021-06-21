package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.RegisteredProperty


class MultilineTextHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String = ""
}
