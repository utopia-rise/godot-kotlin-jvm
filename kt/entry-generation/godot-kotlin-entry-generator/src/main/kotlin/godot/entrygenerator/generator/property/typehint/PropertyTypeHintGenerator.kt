package godot.entrygenerator.generator.property.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.getPropertyHintAnnotation
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

abstract class PropertyTypeHintGenerator(
    propertyDescriptor: PropertyDescriptor
) {
    protected val propertyHintAnnotation = propertyDescriptor.getPropertyHintAnnotation()
    abstract fun getPropertyTypeHint(): ClassName
}