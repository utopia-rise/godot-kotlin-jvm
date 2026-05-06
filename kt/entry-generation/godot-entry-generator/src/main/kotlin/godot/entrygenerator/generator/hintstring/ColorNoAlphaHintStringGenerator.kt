package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings
import godot.tools.common.names.CoreType
import godot.tools.common.names.qualifiedName

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
) : PropertyHintStringGenerator<ColorNoAlphaHintAnnotation>(registeredProperty, settings) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != CoreType.color.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, setOf(CoreType.color.qualifiedName))
        }
        return "" //hint string is empty for this typehint
    }
}
