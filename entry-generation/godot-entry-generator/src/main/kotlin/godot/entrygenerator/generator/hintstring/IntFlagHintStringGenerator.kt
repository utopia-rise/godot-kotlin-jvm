package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredProperty

class IntFlagHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator<IntFlagHintAnnotation>(registeredProperty) {

    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.INT)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.INT.fqName)
        }

        return propertyHintAnnotation
            ?.names
            ?.joinToString(",") { it.removeSurrounding("\"") }
            ?: ""
    }
}
