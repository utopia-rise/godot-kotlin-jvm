package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<ColorNoAlphaHintAnnotation>(registeredProperty) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != "$godotCorePackage.${GodotTypes.color}") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, setOf("${godotCorePackage}.${GodotTypes.color}"))
        }
        return "" //hint string is empty for this typehint
    }
}
