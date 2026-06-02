package godot.registrar.generator.generator.typehint

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.registrar.generator.ext.isCompatibleList
import godot.registrar.generator.ext.isDictionary
import godot.registrar.generator.generator.typehint.array.JvmArrayAndDictionaryTypeHintGenerator
import godot.registrar.generator.generator.typehint.coretypes.JvmCoreTypeTypeHintGenerator
import godot.registrar.generator.generator.typehint.primitives.JvmPrimitivesTypeHintGenerator
import godot.registrar.generator.ext.asEnumName
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isNodeType
import godot.registration.model.ext.isRefCounted
import godot.registration.model.hint.property.IntFlagHint
import godot.registration.model.hint.property.MultilineTextHint
import godot.registration.model.hint.property.PlaceHolderTextHint
import godot.registration.model.types.TypeKind

object PropertyTypeHintProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): MemberName {
        return when {
            registeredProperty.type.fqName == Int::class.qualifiedName -> if (registeredProperty.hints.any { it is IntFlagHint }) {
                PropertyHint.FLAGS.asEnumName()
            } else {
                JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
            }

            registeredProperty.type.fqName == String::class.qualifiedName -> when {
                registeredProperty.hints.any { it is MultilineTextHint } -> {
                    PropertyHint.MULTILINE_TEXT.asEnumName()
                }

                registeredProperty.hints.any { it is PlaceHolderTextHint } -> {
                    PropertyHint.PLACEHOLDER_TEXT.asEnumName()
                }

                else -> {
                    JvmPrimitivesTypeHintGenerator(registeredProperty).getPropertyTypeHint()
                }
            }

            registeredProperty.type.fqName == Long::class.qualifiedName ||
                registeredProperty.type.fqName == Float::class.qualifiedName ||
                registeredProperty.type.fqName == Double::class.qualifiedName ||
                registeredProperty.type.fqName == Boolean::class.qualifiedName -> JvmPrimitivesTypeHintGenerator(
                registeredProperty
            )
                .getPropertyTypeHint()

            registeredProperty.type.kind == TypeKind.ENUM -> PropertyHint.ENUM.asEnumName()

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
