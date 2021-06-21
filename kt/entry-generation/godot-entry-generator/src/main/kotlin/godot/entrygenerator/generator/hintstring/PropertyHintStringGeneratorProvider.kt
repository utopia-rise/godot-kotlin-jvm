package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isReference
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): PropertyHintStringGenerator {
        return when {
            registeredProperty.type.fqName == "kotlin.Int" ->
                if (registeredProperty.annotations.hasAnnotation<IntFlagHintAnnotation>()) {
                    IntFlagHintStringGenerator(registeredProperty)
                } else {
                    PrimitivesHintStringGenerator(registeredProperty)
                }

            registeredProperty.type.fqName == "kotlin.String" -> when {
                registeredProperty.annotations.hasAnnotation<MultilineTextHintAnnotation>() -> {
                    MultilineTextHintStringGenerator(registeredProperty)
                }
                registeredProperty.annotations.hasAnnotation<PlaceHolderTextHintAnnotation>() -> {
                    PlaceHolderTextHintStringGenerator(registeredProperty)
                }
                else -> PrimitivesHintStringGenerator(registeredProperty)
            }

            registeredProperty.type.fqName == "kotlin.Long" ||
                registeredProperty.type.fqName == "kotlin.Float" ||
                registeredProperty.type.fqName == "kotlin.Double" ||
                registeredProperty.type.fqName == "kotlin.Boolean" -> PrimitivesHintStringGenerator(registeredProperty)
            registeredProperty.type.kind == TypeKind.ENUM_CLASS -> EnumHintStringGenerator(registeredProperty)
            registeredProperty.type.isCoreType() && !registeredProperty.type.isCompatibleList() -> CoreTypeHintStringGenerator(registeredProperty)
            registeredProperty.type.isReference() -> ResourceHintStringGenerator(registeredProperty)
            registeredProperty.type.isCompatibleList() -> ArrayHintStringGenerator(registeredProperty)
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) -> EnumHintStringGenerator(
                registeredProperty
            )
            else -> object : PropertyHintStringGenerator(registeredProperty) {
                override fun getHintString(): String {
                    return ""
                }
            }
        }
    }
}
