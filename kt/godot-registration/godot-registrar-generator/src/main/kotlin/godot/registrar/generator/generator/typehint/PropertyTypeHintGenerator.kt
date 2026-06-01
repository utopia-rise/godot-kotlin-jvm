package godot.registrar.generator.generator.typehint

import com.squareup.kotlinpoet.MemberName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.PropertyHint

abstract class PropertyTypeHintGenerator(
    registeredProperty: RegisteredProperty
) {
    protected val propertyHintAnnotation = registeredProperty.hints.firstOrNull { it is PropertyHint } as PropertyHint?
    abstract fun getPropertyTypeHint(): MemberName
}
