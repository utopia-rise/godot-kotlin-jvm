package godot.registrar.generator.generator.hint

import godot.core.GodotEnum
import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumFlagHintStringHint
import godot.registration.model.hint.property.EnumListHintStringHint

class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<EnumHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = when (propertyHintAnnotation) {
        is EnumListHintStringHint -> GodotPropertyHint.TYPE_STRING
        is EnumFlagHintStringHint -> GodotPropertyHint.FLAGS
        else -> GodotPropertyHint.ENUM
    }

    override fun getHintString(): String {
        val enumFqName = propertyHintAnnotation?.enumFqName ?: registeredProperty.type.fqName
        if (enumFqName.isEmpty()) return ""

        val baseHintString = Class.forName(enumFqName)
            .enumConstants
            ?.filterIsInstance<Enum<*>>()
            .orEmpty()
            .joinToString(",") { entry ->
                if (entry is GodotEnum) "${entry.name}:${entry.value}" else entry.name
            }

        return if (propertyHintAnnotation is EnumListHintStringHint) {
            "${godot.core.VariantParser.LONG.id}/${godot.core.VariantParser.LONG.id}:$baseHintString"
        } else {
            baseHintString
        }
    }
}
