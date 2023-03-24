package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.ext.baseGodotType
import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class NodeTypeHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        return registeredProperty.type.baseGodotType()?.fqName?.substringAfterLast(".") ?: ""
    }
}
