package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.ext.fqName
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.DirHint
import godot.registration.model.types.ScriptClass

class DirHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, ScriptClass>
) : PropertyHintStringGenerator<DirHint>(registeredProperty, settings, registeredClassesByFqName) {

    override fun getHintString(): String {
        if (registeredProperty.type.fqName != String::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, JvmType.STRING.fqName)
        }

        return "" //hint string is empty for this typehint
    }
}

