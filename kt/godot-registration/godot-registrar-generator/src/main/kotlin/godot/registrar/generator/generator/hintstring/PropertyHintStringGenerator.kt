package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint

abstract class PropertyHintStringGenerator<ANNOTATION_TYPE : PropertyHint>(
    val registeredProperty: RegisteredProperty,
    protected val context: GeneratorContext,
) {
    @Suppress("UNCHECKED_CAST")
    protected val propertyHintAnnotation = registeredProperty
        .hints
        .firstOrNull() as ANNOTATION_TYPE?

    /**
     * Hint string formatting: https://github.com/godotengine/godot/blob/dcd11faad3802679a43b27155f1b6bc59aa39b60/core/object.h
     */
    abstract fun getHintString(): String
}
