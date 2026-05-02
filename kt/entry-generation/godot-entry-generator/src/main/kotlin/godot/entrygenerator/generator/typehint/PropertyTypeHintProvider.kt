package godot.entrygenerator.generator.typehint

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
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
import godot.entrygenerator.utils.asEnumName

object PropertyTypeHintProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): MemberName {
        return when {
            registeredProperty.type.fqName == Int::class.qualifiedName -> if (registeredProperty.annotations.hasAnnotation<IntFlagHintAnnotation>()) {
                PropertyHint.FLAGS.asEnumName()
            } else {
                JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            }

            registeredProperty.type.fqName == String::class.qualifiedName -> when {
                registeredProperty.annotations.hasAnnotation<MultilineTextHintAnnotation>() -> {
                    PropertyHint.MULTILINE_TEXT.asEnumName()
                }

                registeredProperty.annotations.hasAnnotation<PlaceHolderTextHintAnnotation>() -> {
                    PropertyHint.PLACEHOLDER_TEXT.asEnumName()
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

            registeredProperty.type.kind == TypeKind.ENUM_CLASS -> PropertyHint.ENUM.asEnumName()

            registeredProperty.type.isCoreType() && !registeredProperty.type.isCompatibleList() && !registeredProperty.type.isDictionary() -> JvmCoreTypeTypeHintGenerator(
                registeredProperty
            ).getPropertyTypeHint()

            registeredProperty.type.isRefCounted() -> PropertyHint.RESOURCE_TYPE.asEnumName()

            registeredProperty.type.isDictionary() -> JvmArrayAndDictionaryTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.isCompatibleList() -> JvmArrayAndDictionaryTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) -> PropertyHint.RESOURCE_TYPE.asEnumName()

            registeredProperty.type.isNodeType() -> PropertyHint.NODE_TYPE.asEnumName()
            else -> PropertyHint.NONE.asEnumName()
        }
    }
}

