package godot.entrygenerator.generator.property.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

class CoreTypeHintStringGenerator(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {

    override fun getHintString(): String {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.ColorNoAlpha" -> getColorNoAlphaHintString()
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${propertyHintAnnotation.fqName}")
        }
    }

    private fun getColorNoAlphaHintString(): String {
        if (propertyDescriptor.type.toString() != "Color") {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, "Color")
        }
        return "" //hint string is empty for this typehint
    }
}