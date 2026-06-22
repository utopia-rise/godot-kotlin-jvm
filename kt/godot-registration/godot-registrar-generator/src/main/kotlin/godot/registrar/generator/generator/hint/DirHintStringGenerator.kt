package godot.registrar.generator.generator.hint

import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.DirHint
import godot.core.PropertyHint as GodotPropertyHint

class DirHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<DirHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint =
        if (propertyHintAnnotation?.global == true) GodotPropertyHint.GLOBAL_DIR else GodotPropertyHint.DIR

    override fun getHintString(): String = ""
}
