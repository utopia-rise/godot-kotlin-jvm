package godot.entrygenerator.generator.hintstring

import godot.core.Color
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<ColorNoAlphaHintAnnotation>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != Color::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, setOf(Color::class.qualifiedName!!))
        }
        return "" //hint string is empty for this typehint
    }
}
