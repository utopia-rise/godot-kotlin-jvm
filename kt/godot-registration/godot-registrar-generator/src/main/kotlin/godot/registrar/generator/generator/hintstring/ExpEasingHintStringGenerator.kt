package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.ext.fqName
import godot.registrar.generator.ext.fqNameIsJvmType
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ExpEasingHint
import godot.registration.model.types.ScriptClass

class ExpEasingHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<ExpEasingHint>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.FLOAT, JvmType.DOUBLE)) {
            throw WrongAnnotationUsageException(
                registeredProperty,
                propertyHintAnnotation,
                setOf(*JvmType.FLOAT.fqName.toTypedArray(), *JvmType.DOUBLE.fqName.toTypedArray())
            )
        }

        if (propertyHintAnnotation == null) {
            return ""
        }

        return when {
            propertyHintAnnotation.attenuation && propertyHintAnnotation.isPositiveOnly -> "attenuation,positive_only"
            propertyHintAnnotation.attenuation -> "attenuation"
            propertyHintAnnotation.isPositiveOnly -> "positive_only"
            else -> ""
        }
    }
}
