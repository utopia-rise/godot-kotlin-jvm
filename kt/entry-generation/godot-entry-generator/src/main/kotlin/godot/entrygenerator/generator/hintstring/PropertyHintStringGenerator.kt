package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

abstract class PropertyHintStringGenerator<PROPERTY_HINT_ANNOTATION_TYPE: PropertyHintAnnotation> (
    val registeredProperty: RegisteredProperty
) {
    @Suppress("UNCHECKED_CAST")
    protected val propertyHintAnnotation = registeredProperty
        .annotations
        .firstOrNull { it is PropertyHintAnnotation } as PROPERTY_HINT_ANNOTATION_TYPE?

    /**
     * Hint string formatting: https://github.com/godotengine/godot/blob/dcd11faad3802679a43b27155f1b6bc59aa39b60/core/object.h
     */
    abstract fun getHintString(): String
}
