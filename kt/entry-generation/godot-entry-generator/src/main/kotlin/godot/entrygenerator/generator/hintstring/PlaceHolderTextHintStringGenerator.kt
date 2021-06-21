package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.RegisteredProperty


class PlaceHolderTextHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String = ""
}
