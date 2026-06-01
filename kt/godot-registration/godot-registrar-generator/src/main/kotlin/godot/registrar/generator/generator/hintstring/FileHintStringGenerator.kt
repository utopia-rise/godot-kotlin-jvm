package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.ext.fqName
import godot.registrar.generator.ext.fqNameIsJvmType
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.FileHint
import godot.registration.model.types.ScriptClass

class FileHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<FileHint>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.STRING)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.STRING.fqName)
        }

        return propertyHintAnnotation?.extensions?.joinToString(",") ?: ""
    }
}
