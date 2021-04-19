package godot.entrygenerator.generator.property.hintstring

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class EnumFlagHintStringGenerator(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {

    override fun getHintString(): String =
        throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
}
