package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.ext.fqName
import godot.entrygenerator.ext.fqNameIsJvmType
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings

class IntFlagHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<IntFlagHintAnnotation>(registeredProperty, settings, registeredClassesByFqName) {

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
