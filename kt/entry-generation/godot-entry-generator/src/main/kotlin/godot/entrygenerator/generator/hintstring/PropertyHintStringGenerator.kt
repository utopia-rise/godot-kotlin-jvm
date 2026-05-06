package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

abstract class PropertyHintStringGenerator<ANNOTATION_TYPE : PropertyHintAnnotation>(
    val registeredProperty: RegisteredProperty,
    protected val settings: Settings,
) {
    @Suppress("UNCHECKED_CAST")
    protected val propertyHintAnnotation = registeredProperty
        .annotations
        .firstOrNull { it is PropertyHintAnnotation } as ANNOTATION_TYPE?

    /**
     * Hint string formatting: https://github.com/godotengine/godot/blob/dcd11faad3802679a43b27155f1b6bc59aa39b60/core/object.h
     */
    abstract fun getHintString(): String
}
