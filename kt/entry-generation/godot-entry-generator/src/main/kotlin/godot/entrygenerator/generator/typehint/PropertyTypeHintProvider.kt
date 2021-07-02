package godot.entrygenerator.generator.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isReference
import godot.entrygenerator.generator.typehint.array.JvmArrayTypeHintGenerator
import godot.entrygenerator.generator.typehint.coretypes.JvmCoreTypeTypeHintGenerator
import godot.entrygenerator.generator.typehint.primitives.JvmPrimitivesTypeHintGenerator
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind

object PropertyTypeHintProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): ClassName {
        return when {
            registeredProperty.type.fqName == "kotlin.Int" -> if (registeredProperty.annotations.hasAnnotation<IntFlagHintAnnotation>()) {
                ClassName("godot.core.PropertyHint", "FLAGS")
            } else {
                JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            }
            registeredProperty.type.fqName == "kotlin.String" -> when {
                registeredProperty.annotations.hasAnnotation<MultilineTextHintAnnotation>() -> {
                    ClassName(
                        "godot.core.PropertyHint",
                        "MULTILINE_TEXT"
                    )
                }
                registeredProperty.annotations.hasAnnotation<PlaceHolderTextHintAnnotation>() -> {
                    ClassName(
                        "godot.core.PropertyHint",
                        "PLACEHOLDER_TEXT"
                    )
                }
                else -> {
                    JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
                }
            }
            registeredProperty.type.fqName == "kotlin.Long" ||
            registeredProperty.type.fqName == "kotlin.Float" ||
            registeredProperty.type.fqName == "kotlin.Double" ||
            registeredProperty.type.fqName == "kotlin.Boolean" -> JvmPrimitivesTypeHintGenerator(registeredProperty)
                .getPropertyTypeHint()

            registeredProperty.type.kind == TypeKind.ENUM_CLASS -> throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")

            registeredProperty.type.isCoreType() && !registeredProperty.type.isCompatibleList() -> JvmCoreTypeTypeHintGenerator(
                registeredProperty
            ).getPropertyTypeHint()

            registeredProperty.type.isReference() -> ClassName(
                "godot.core.PropertyHint",
                "RESOURCE_TYPE"
            )

            registeredProperty.type.isCompatibleList() -> JvmArrayTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) -> ClassName(
                "godot.core.PropertyHint",
                "RESOURCE_TYPE"
            )

            else -> ClassName("godot.core.PropertyHint", "NONE")
        }
    }
}
