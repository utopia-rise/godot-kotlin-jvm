package godot.codegen.models.traits

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import godot.tools.common.names.API
import godot.tools.common.names.CoreType
import godot.tools.common.names.VariantConverter
import java.util.*

enum class Nature {
    VOID,
    PRIMITIVE,
    CORE,
    TYPED_ARRAY,
    CLASS,
    ENUM,
    BITFIELD,
    NATIVE
}

interface TypeGenerationTrait {
    val identifier: String
    val nature: Nature
    val className: ClassName

    fun getVariantConverter(): MemberName = when {
        isVoid() -> VariantConverter.nil
        isEnum() -> VariantConverter.long
        isBitField() -> VariantConverter.long
        identifier == CoreType.boolIdentifier -> VariantConverter.bool
        identifier == CoreType.intIdentifier -> VariantConverter.long
        identifier == CoreType.floatIdentifier -> VariantConverter.double
        identifier == CoreType.nodePath.simpleName -> VariantConverter.nodePath
        identifier == CoreType.stringName.simpleName -> VariantConverter.stringName
        identifier == CoreType.rid.simpleName -> VariantConverter.rid
        identifier == CoreType.arrayIdentifier || isTypedArray() -> VariantConverter.array
        identifier == CoreType.packedByteArray.simpleName -> VariantConverter.packedByteArray
        identifier == CoreType.packedInt32Array.simpleName -> VariantConverter.packedInt32Array
        identifier == CoreType.packedInt64Array.simpleName -> VariantConverter.packedInt64Array
        identifier == CoreType.packedFloat32Array.simpleName -> VariantConverter.packedFloat32Array
        identifier == CoreType.packedFloat64Array.simpleName -> VariantConverter.packedFloat64Array
        identifier == CoreType.packedStringArray.simpleName -> VariantConverter.packedStringArray
        identifier == CoreType.packedVector2Array.simpleName -> VariantConverter.packedVector2Array
        identifier == CoreType.packedVector3Array.simpleName -> VariantConverter.packedVector3Array
        identifier == CoreType.packedColorArray.simpleName -> VariantConverter.packedColorArray
        identifier == CoreType.variantIdentifier -> VariantConverter.any
        isCoreType() || isPrimitive() -> VariantConverter.parserName(identifier.uppercase(Locale.US))
        else -> VariantConverter.obj
    }

    fun isVoid() = nature == Nature.VOID
    fun isCoreType() = nature == Nature.CORE || nature == Nature.TYPED_ARRAY
    fun isPrimitive() = nature == Nature.PRIMITIVE
    fun isLocalCopyCoreTypes() = CoreType.isLocalCopyCoreTypeIdentifier(identifier)
    fun isLocalIndexedCopyCoreTypes() = CoreType.isLocalIndexedCopyCoreTypeIdentifier(identifier)
    fun isEnum() = nature == Nature.ENUM
    fun isBitField() = nature == Nature.BITFIELD
    fun isTypedArray() = nature == Nature.TYPED_ARRAY
    fun isObjectSubClass() = nature == Nature.CLASS
    fun isNullable() = isObjectSubClass() || identifier == CoreType.variantIdentifier
}

fun ClassName.Companion.from(type: TypeGenerationTrait) = when {
    type.isVoid() -> UNIT
    type.identifier.startsWith("Signal") -> CoreType.signal(type.identifier.removePrefix("Signal").toInt())
    type.isEnum() || type.isBitField() -> {
        val containerAndEnum = type.identifier.split('.')
        val enumPackage = if (containerAndEnum.size == 1 || CoreType.isCoreTypeIdentifier(containerAndEnum[0])) {
            CoreType.color.packageName
        } else {
            API.`object`.packageName
        }
        ClassName(enumPackage, containerAndEnum)
    }

    type.identifier == CoreType.boolIdentifier -> BOOLEAN
    type.identifier == CoreType.intIdentifier -> LONG
    type.identifier == CoreType.floatIdentifier -> DOUBLE
    type.identifier == CoreType.string.simpleName -> STRING
    type.identifier == CoreType.variantIdentifier -> ANY
    type.identifier == CoreType.callable.simpleName -> CoreType.callable
    type.identifier == CoreType.arrayIdentifier || type.isTypedArray() -> CoreType.variantArray
    type.identifier == CoreType.dictionary.simpleName -> CoreType.dictionary
    type.isCoreType() -> ClassName(CoreType.color.packageName, type.identifier)
    else -> ClassName(API.`object`.packageName, type.identifier)
}

fun TypeName.Companion.from(type: TypeGenerationTrait, genericParameters: List<TypeName> = emptyList(), isNullable: Boolean? = null): TypeName {
    val className = type.className

    return when {
        type.identifier.startsWith("Signal") && !type.identifier.endsWith("0") -> {
            val nonNullableGenericParameters = genericParameters.map { it.copy(nullable = false) }
            className.parameterizedBy(nonNullableGenericParameters)
        }

        type.isTypedArray() -> {
            val genericType = type.identifier.removePrefix("${CoreType.typedArrayIdentifier}::")
            val subType = GenerationType(genericType)
            className.parameterizedBy(from(subType).copy(nullable = false))
        }

        type.identifier == CoreType.arrayIdentifier -> className.parameterizedBy(ANY.copy(nullable = true))
        type.identifier == CoreType.dictionary.simpleName -> className.parameterizedBy(ANY.copy(nullable = true), ANY.copy(nullable = true))
        else -> className
    }.copy(nullable = isNullable ?: type.isNullable())
}

const val enumPrefix = "enum::"
const val bitfieldPrefix = "bitfield::"

class GenerationType(rawIdentifier: String) : TypeGenerationTrait {
    override val identifier = sanitizeIdentifier(rawIdentifier)
    override val nature = getNature(rawIdentifier)
    override val className = ClassName.from(this)

    private fun sanitizeIdentifier(identifier: String): String {
        return identifier.removePrefix(enumPrefix).removePrefix(bitfieldPrefix)
    }

    private fun getNature(identifier: String) = when {
        identifier == "void" -> Nature.VOID
        CoreType.primitiveIdentifiers.any { it == identifier } -> Nature.PRIMITIVE
        identifier.startsWith("Signal") -> Nature.CORE
        CoreType.isCoreTypeIdentifier(identifier) -> Nature.CORE
        identifier.startsWith(enumPrefix) -> Nature.ENUM
        identifier.startsWith(bitfieldPrefix) -> Nature.BITFIELD
        identifier.startsWith(CoreType.typedArrayIdentifier) -> Nature.TYPED_ARRAY
        else -> Nature.CLASS
    }
}
