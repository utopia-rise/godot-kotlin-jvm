package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class FileHintStringGenerator(registeredProperty: RegisteredProperty, settings: Settings):
    PropertyHintStringGenerator<FileHintAnnotation>(registeredProperty, settings) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.STRING)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.STRING.fqName)
        }

        return propertyHintAnnotation?.extensions?.joinToString(",") ?: ""
    }
}
