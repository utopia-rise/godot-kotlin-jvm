package godot.registrar.generator.generator.hint

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.MemberName
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.toTypeName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.EnumFlagHintStringHint
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumListHintStringHint
import godot.core.PropertyHint as GodotPropertyHint

class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<EnumHint>(registeredProperty, context) {
    override fun getTypeHint(): GodotPropertyHint = when (propertyHintAnnotation) {
        is EnumListHintStringHint -> GodotPropertyHint.TYPE_STRING
        is EnumFlagHintStringHint -> GodotPropertyHint.FLAGS
        else -> GodotPropertyHint.ENUM
    }

    override fun getHintString(): String = ""

    override fun generate(): GeneratedPropertyHint =
        GeneratedPropertyHint(getTypeHint(), enumHintStringCode())

    private fun enumHintStringCode(): CodeBlock {
        val enumType = propertyHintAnnotation?.enumType ?: registeredProperty.type
        if (enumType.fqName.isEmpty()) {
            return CodeBlock.of("%S", "")
        }

        val helper = if (propertyHintAnnotation is EnumListHintStringHint) {
            MemberName("godot.registration", "enumListHintString")
        } else {
            MemberName("godot.registration", "enumHintString")
        }

        return CodeBlock.of("%M(enumValues<%T>())", helper, enumType.toTypeName())
    }
}
