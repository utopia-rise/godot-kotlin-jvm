package godot.entrygenerator.generator.property.hintstring

import godot.entrygenerator.extension.getPropertyHintAnnotation
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

abstract class PropertyHintStringGenerator(
    val propertyDescriptor: PropertyDescriptor,
    val bindingContext: BindingContext
) {
    protected val propertyHintAnnotation = propertyDescriptor.getPropertyHintAnnotation()

    /**
     * Hint string formatting: https://github.com/godotengine/godot/blob/dcd11faad3802679a43b27155f1b6bc59aa39b60/core/object.h
     */
    abstract fun getHintString(): String
}