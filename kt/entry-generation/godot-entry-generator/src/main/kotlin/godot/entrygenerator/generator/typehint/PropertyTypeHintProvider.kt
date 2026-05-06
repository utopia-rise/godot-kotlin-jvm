package godot.entrygenerator.generator.typehint

import com.squareup.kotlinpoet.MemberName
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isDictionary
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isRefCounted
import godot.entrygenerator.generator.typehint.array.JvmArrayAndDictionaryTypeHintGenerator
import godot.entrygenerator.generator.typehint.coretypes.JvmCoreTypeTypeHintGenerator
import godot.entrygenerator.generator.typehint.primitives.JvmPrimitivesTypeHintGenerator
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind
import godot.tools.common.names.CoreType

object PropertyTypeHintProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): MemberName {
        return when {
            registeredProperty.type.fqName == Int::class.qualifiedName -> if (registeredProperty.annotations.hasAnnotation<IntFlagHintAnnotation>()) {
                CoreType.propertyHint("FLAGS")
            } else {
                JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            }

            registeredProperty.type.fqName == String::class.qualifiedName -> when {
                registeredProperty.annotations.hasAnnotation<MultilineTextHintAnnotation>() -> {
                    CoreType.propertyHint("MULTILINE_TEXT")
                }

                registeredProperty.annotations.hasAnnotation<PlaceHolderTextHintAnnotation>() -> {
                    CoreType.propertyHint("PLACEHOLDER_TEXT")
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

            registeredProperty.type.kind == TypeKind.ENUM_CLASS -> CoreType.propertyHint("ENUM")

            registeredProperty.type.isCoreType() && !registeredProperty.type.isCompatibleList() && !registeredProperty.type.isDictionary() -> JvmCoreTypeTypeHintGenerator(
                registeredProperty
            ).getPropertyTypeHint()

            registeredProperty.type.isRefCounted() -> CoreType.propertyHint("RESOURCE_TYPE")

            registeredProperty.type.isDictionary() -> JvmArrayAndDictionaryTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.isCompatibleList() -> JvmArrayAndDictionaryTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) -> CoreType.propertyHint("RESOURCE_TYPE")

            registeredProperty.type.isNodeType() -> CoreType.propertyHint("NODE_TYPE")

            else -> CoreType.propertyHint("NONE")
        }
    }
}

