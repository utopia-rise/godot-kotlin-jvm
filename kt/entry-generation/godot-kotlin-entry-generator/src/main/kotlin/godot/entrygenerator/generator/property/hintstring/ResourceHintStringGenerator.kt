package godot.entrygenerator.generator.property.hintstring

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class ResourceHintStringGenerator(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {

    override fun getHintString(): String = propertyDescriptor.type.toString()
}