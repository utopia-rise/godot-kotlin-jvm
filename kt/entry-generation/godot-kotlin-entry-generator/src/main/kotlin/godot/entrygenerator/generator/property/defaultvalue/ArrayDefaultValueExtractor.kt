package godot.entrygenerator.generator.property.defaultvalue

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.typeUtil.isEnum

class ArrayDefaultValueExtractor(propertyDescriptor: PropertyDescriptor, bindingContext: BindingContext) : DefaultValueExtractor(propertyDescriptor, bindingContext) {

    override fun getDefaultValue(variantClassName: ClassName?): Pair<String, Array<out Any>> {
        return if (propertyDescriptor.type.arguments.firstOrNull()?.type?.isEnum() == true) {
            if (propertyDescriptor.isLateInit || !isVisibleInEditor()) {
                return "%L" to arrayOf("null")
            }
            getDefaultValueTemplateStringWithTemplateArguments(propertyDescriptor.assignmentPsi) ?: throw IllegalStateException("") //TODO: error
        } else {
            super.getDefaultValue(variantClassName)
        }
    }
}
