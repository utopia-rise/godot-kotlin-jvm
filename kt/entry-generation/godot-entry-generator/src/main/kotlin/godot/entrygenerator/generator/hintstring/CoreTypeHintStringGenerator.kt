package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class CoreTypeHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String {
        return when (propertyHintAnnotation) {
            ColorNoAlphaHintAnnotation -> getColorNoAlphaHintString()
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ""
            else -> throw IllegalStateException("Unknown annotation $propertyHintAnnotation")
        }
    }

    private fun getColorNoAlphaHintString(): String {
        if (registeredProperty.type.fqName != "godot.core.Color") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "Color")
        }
        return "" //hint string is empty for this typehint
    }
}
