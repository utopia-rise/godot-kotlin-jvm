package godot.entrygenerator.generator.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

abstract class PropertyTypeHintGenerator(
    registeredProperty: RegisteredProperty
) {
    protected val propertyHintAnnotation = registeredProperty.annotations.firstOrNull { it is PropertyHintAnnotation } as PropertyHintAnnotation?
    abstract fun getPropertyTypeHint(): ClassName
}
