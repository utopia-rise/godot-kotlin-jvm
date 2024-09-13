package godot.entrygenerator.generator.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.ext.*
import godot.entrygenerator.generator.typehint.array.JvmArrayTypeHintGenerator
import godot.entrygenerator.generator.typehint.coretypes.JvmCoreTypeTypeHintGenerator
import godot.entrygenerator.generator.typehint.primitives.JvmPrimitivesTypeHintGenerator
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotApiPackage

object PropertyTypeHintProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): ClassName {
        return when {
            registeredProperty.type.fqName == Int::class.qualifiedName -> if (registeredProperty.annotations.hasAnnotation<IntFlagHintAnnotation>()) {
                ClassName("$godotApiPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_FLAGS")
            } else {
                JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            }
            registeredProperty.type.fqName == String::class.qualifiedName -> when {
                registeredProperty.annotations.hasAnnotation<MultilineTextHintAnnotation>() -> {
                    ClassName(
                        "$godotApiPackage.${GodotTypes.propertyHint}",
                        "PROPERTY_HINT_MULTILINE_TEXT"
                    )
                }
                registeredProperty.annotations.hasAnnotation<PlaceHolderTextHintAnnotation>() -> {
                    ClassName(
                        "$godotApiPackage.${GodotTypes.propertyHint}",
                        "PROPERTY_HINT_PLACEHOLDER_TEXT"
                    )
                }
                else -> {
                    JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
                }
            }
            registeredProperty.type.fqName == Long::class.qualifiedName ||
            registeredProperty.type.fqName == Float::class.qualifiedName ||
            registeredProperty.type.fqName == Double::class.qualifiedName ||
            registeredProperty.type.fqName == Boolean::class.qualifiedName -> JvmPrimitivesTypeHintGenerator(registeredProperty)
                .getPropertyTypeHint()

            registeredProperty.type.kind == TypeKind.ENUM_CLASS -> throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")

            registeredProperty.type.isCoreType() && !registeredProperty.type.isCompatibleList() -> JvmCoreTypeTypeHintGenerator(
                registeredProperty
            ).getPropertyTypeHint()

            registeredProperty.type.isReference() -> ClassName(
                "$godotApiPackage.${GodotTypes.propertyHint}",
                "PROPERTY_HINT_RESOURCE_TYPE"
            )

            registeredProperty.type.isCompatibleList() -> JvmArrayTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) -> ClassName(
                "$godotApiPackage.${GodotTypes.propertyHint}",
                "PROPERTY_HINT_RESOURCE_TYPE"
            )

            registeredProperty.type.isNodeType() -> ClassName(
                "$godotApiPackage.${GodotTypes.propertyHint}",
                "PROPERTY_HINT_NODE_TYPE"
            )

            else -> ClassName("$godotApiPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_NONE")
        }
    }
}
