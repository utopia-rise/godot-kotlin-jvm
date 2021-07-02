package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<ColorNoAlphaHintAnnotation>(registeredProperty) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != "godot.core.Color") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "Color")
        }
        return "" //hint string is empty for this typehint
    }
}
