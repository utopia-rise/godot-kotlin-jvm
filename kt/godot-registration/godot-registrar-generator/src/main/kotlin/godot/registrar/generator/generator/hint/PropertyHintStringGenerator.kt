package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint
import godot.core.PropertyHint as GodotPropertyHint

abstract class PropertyHintStringGenerator<ANNOTATION_TYPE : PropertyHint>(
    val registeredProperty: RegisteredProperty,
    protected val context: GeneratorContext,
) : HintGenerator {
    @Suppress("UNCHECKED_CAST")
    protected val propertyHintAnnotation = registeredProperty
        .hints
        .singleOrNull() as ANNOTATION_TYPE?

    protected abstract fun getTypeHint(): GodotPropertyHint
    protected abstract fun getHintString(): String

    override fun generate(): GeneratedPropertyHint = GeneratedPropertyHint(getTypeHint(), getHintString())
}
