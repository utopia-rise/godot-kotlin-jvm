package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.ext.fqName
import godot.registrar.generator.ext.fqNameIsJvmType
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.IntFlagHint
import godot.registration.model.types.ScriptClass

class IntFlagHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<IntFlagHint>(registeredProperty, settings, registeredClassesByFqName) {

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
