package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.ext.fqName
import godot.registrar.generator.ext.fqNameIsJvmType
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.Range
import godot.registration.model.hint.property.RangeHint
import godot.registration.model.types.ScriptClass
import java.util.*

class RangeHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<RangeHint<Number>>(registeredProperty, settings, registeredClassesByFqName) {
    override fun getHintString(): String {
        if (!registeredProperty.type.fqName.fqNameIsJvmType(JvmType.DOUBLE, JvmType.FLOAT, JvmType.INT, JvmType.LONG)) {
            throw WrongAnnotationUsageException(
                registeredProperty,
                propertyHintAnnotation,
                setOf(
                    *JvmType.DOUBLE.fqName.toTypedArray(),
                    *JvmType.FLOAT.fqName.toTypedArray(),
                    *JvmType.INT.fqName.toTypedArray(),
                    *JvmType.LONG.fqName.toTypedArray()
                )
            )
        }
        if (propertyHintAnnotation == null) {
            return ""
        }

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(propertyHintAnnotation.start)
        argumentsForStringTemplate.add(propertyHintAnnotation.end)

        if (propertyHintAnnotation.step.toDouble() >= 0) {
            argumentsForStringTemplate.add(propertyHintAnnotation.step)
        }

        if (propertyHintAnnotation.or != Range.NONE) {
            argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
        }

        if (propertyHintAnnotation.hideSlider) {
            argumentsForStringTemplate.add("hide_slider")
        }

        if (propertyHintAnnotation.isRadians) {
            argumentsForStringTemplate.add("radians")
        }

        if (propertyHintAnnotation.isDegrees) {
            argumentsForStringTemplate.add("degrees")
        }

        if (propertyHintAnnotation.isExp) {
            argumentsForStringTemplate.add("exp")
        }

        if (propertyHintAnnotation.suffix != null) {
            argumentsForStringTemplate.add("suffix:${propertyHintAnnotation.suffix}")
        }

        return argumentsForStringTemplate.joinToString(",")
    }
}
