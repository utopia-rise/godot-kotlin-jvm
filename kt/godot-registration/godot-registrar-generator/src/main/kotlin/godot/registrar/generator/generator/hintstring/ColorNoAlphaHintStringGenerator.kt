package godot.registrar.generator.generator.hintstring

import godot.core.Color
import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ColorNoAlphaHint
import godot.registration.model.types.ScriptClass

class ColorNoAlphaHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>,
) : PropertyHintStringGenerator<ColorNoAlphaHint>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != Color::class.qualifiedName) {
            throw WrongAnnotationUsageException(
                registeredProperty,
                propertyHintAnnotation,
                setOf(Color::class.qualifiedName!!)
            )
        }
        return "" //hint string is empty for this typehint
    }
}
