package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class DirHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<DirHintAnnotation>(registeredProperty) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != String::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, String::class.qualifiedName)
        }

        return "" //hint string is empty for this typehint
    }
}
