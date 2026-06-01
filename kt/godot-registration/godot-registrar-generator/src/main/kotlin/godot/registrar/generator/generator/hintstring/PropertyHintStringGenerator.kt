package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.ScriptClass

abstract class PropertyHintStringGenerator<ANNOTATION_TYPE : PropertyHint>(
    val registeredProperty: RegisteredProperty,
    protected val settings: Settings,
    protected val registeredClassesByFqName: Map<String, ScriptClass>,
) {
    @Suppress("UNCHECKED_CAST")
    protected val propertyHintAnnotation = registeredProperty
        .hints
        .firstOrNull { it is PropertyHint } as ANNOTATION_TYPE?

    /**
     * Hint string formatting: https://github.com/godotengine/godot/blob/dcd11faad3802679a43b27155f1b6bc59aa39b60/core/object.h
     */
    abstract fun getHintString(): String
}
