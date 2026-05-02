package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class DirHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
) : PropertyHintStringGenerator<DirHintAnnotation>(registeredProperty, settings) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != String::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.STRING.fqName)
        }

        return "" //hint string is empty for this typehint
    }
}
