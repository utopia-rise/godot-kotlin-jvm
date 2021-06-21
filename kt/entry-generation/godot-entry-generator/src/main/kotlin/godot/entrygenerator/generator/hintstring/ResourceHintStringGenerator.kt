package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.RegisteredProperty

class ResourceHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String = registeredProperty.type.fqName.substringAfterLast(".")
}
