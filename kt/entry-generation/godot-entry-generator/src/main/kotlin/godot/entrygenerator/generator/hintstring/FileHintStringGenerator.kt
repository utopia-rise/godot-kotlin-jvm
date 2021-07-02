package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class FileHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<FileHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (registeredProperty.type.fqName != "kotlin.String") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "String")
        }

        return propertyHintAnnotation?.extensions?.joinToString(",") ?: ""
    }
}
