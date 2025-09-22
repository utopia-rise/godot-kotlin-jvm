package godot.codegen.models.traits

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.UNIT
import godot.tools.common.constants.GODOT_ARRAY
import godot.tools.common.constants.GODOT_CALLABLE_BASE
import godot.tools.common.constants.GODOT_DICTIONARY
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_PARSER_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_BOOL
import godot.tools.common.constants.VARIANT_PARSER_DOUBLE
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.VARIANT_PARSER_NODE_PATH
import godot.tools.common.constants.VARIANT_PARSER_OBJECT
import godot.tools.common.constants.VARIANT_PARSER_PACKED_BYTE_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_COLOR_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_FLOAT_32_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_FLOAT_64_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_INT_32_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_INT_64_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_STRING_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_VECTOR2_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_VECTOR3_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_STRING_NAME
import godot.tools.common.constants.VARIANT_PARSER__RID
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.variantParserPackage
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

    fun getVariantConverter() = when {
        isVoid() -> VARIANT_PARSER_NIL
        isEnum() -> VARIANT_PARSER_LONG
        isBitField() -> VARIANT_PARSER_LONG
        identifier == GodotTypes.bool -> VARIANT_PARSER_BOOL
        identifier == GodotTypes.int -> VARIANT_PARSER_LONG
        identifier == GodotTypes.float -> VARIANT_PARSER_DOUBLE
        identifier == GodotTypes.nodePath -> VARIANT_PARSER_NODE_PATH
        identifier == GodotTypes.stringName -> VARIANT_PARSER_STRING_NAME
        identifier == GodotTypes.rid -> VARIANT_PARSER__RID
        identifier == GodotTypes.array || isTypedArray() -> VARIANT_PARSER_ARRAY
        identifier == GodotTypes.packedByteArray -> VARIANT_PARSER_PACKED_BYTE_ARRAY
        identifier == GodotTypes.packedInt32Array -> VARIANT_PARSER_PACKED_INT_32_ARRAY
        identifier == GodotTypes.packedInt64Array -> VARIANT_PARSER_PACKED_INT_64_ARRAY
        identifier == GodotTypes.packedFloat32Array -> VARIANT_PARSER_PACKED_FLOAT_32_ARRAY
        identifier == GodotTypes.packedFloat64Array -> VARIANT_PARSER_PACKED_FLOAT_64_ARRAY
        identifier == GodotTypes.packedStringArray -> VARIANT_PARSER_PACKED_STRING_ARRAY
        identifier == GodotTypes.packedVector2Array -> VARIANT_PARSER_PACKED_VECTOR2_ARRAY
        identifier == GodotTypes.packedVector3Array -> VARIANT_PARSER_PACKED_VECTOR3_ARRAY
        identifier == GodotTypes.packedColorArray -> VARIANT_PARSER_PACKED_COLOR_ARRAY
        identifier == GodotTypes.variant -> VARIANT_CASTER_ANY
        isCoreType() || isPrimitive() -> ClassName(variantParserPackage, identifier.uppercase(Locale.US))
        else -> VARIANT_PARSER_OBJECT
    }


    fun isVoid() = nature == Nature.VOID
    fun isCoreType() = nature == Nature.CORE || nature == Nature.TYPED_ARRAY
    fun isPrimitive() = nature == Nature.PRIMITIVE
    fun isLocalCopyCoreTypes() = GodotTypes.localCopyCoreTypes.find { s -> s == identifier } != null
    fun isLocalIndexedCopyCoreTypes() = GodotTypes.indexedLocalCopyCoreTypes.find { s -> s == identifier } != null
    fun isEnum() = nature == Nature.ENUM
    fun isBitField() = nature == Nature.BITFIELD
    fun isTypedArray() = nature == Nature.TYPED_ARRAY
    fun isObjectSubClass() = nature == Nature.CLASS
    fun isVariant() = isCoreType() && identifier == GodotTypes.variant
    fun isCoreClass() = identifier == GodotTypes.godotObject || identifier == GodotTypes.refCounted || identifier == GodotTypes.resource
}

fun ClassName.Companion.from(type: TypeGenerationTrait) = when {
    type.isVoid() -> UNIT
    type.identifier.startsWith("Signal") -> ClassName(godotCorePackage, type.identifier)
    type.isEnum() || type.isBitField() -> {
        val containerAndEnum = type.identifier.split('.')
        val enumPackage = if (containerAndEnum.size == 1 || containerAndEnum[0] in GodotTypes.coreTypes) {
            godotCorePackage
        } else {
            godotApiPackage
        }
        ClassName(
            enumPackage,
            containerAndEnum
        )
    }

    type.identifier == GodotTypes.bool -> BOOLEAN
    type.identifier == GodotTypes.int -> LONG
    type.identifier == GodotTypes.float -> DOUBLE
    type.identifier == GodotTypes.string -> STRING
    type.identifier == GodotTypes.variant -> ANY
    type.identifier == GodotTypes.callable -> GODOT_CALLABLE_BASE
    type.identifier == GodotTypes.array || type.isTypedArray() -> GODOT_ARRAY
    type.identifier == GodotTypes.dictionary -> GODOT_DICTIONARY
    type.isCoreType() -> ClassName(godotCorePackage, type.identifier)
    else -> ClassName(godotApiPackage, type.identifier)
}

fun TypeName.Companion.from(type: TypeGenerationTrait, nullable: Boolean = false, genericParameters: List<TypeName> = emptyList()): TypeName {
    val className = type.className
    return when {
        type.identifier.startsWith("Signal") && !type.identifier.endsWith("0") -> className.parameterizedBy(genericParameters)
        type.isTypedArray() -> {
            val genericType = type.identifier.removePrefix("${GodotTypes.typedArray}::")
            val subType = GenerationType(genericType)
            className.parameterizedBy(from(subType))
        }

        type.identifier == GodotTypes.array -> className.parameterizedBy(ANY.copy(nullable = true))
        type.identifier == GodotTypes.dictionary -> className.parameterizedBy(ANY.copy(nullable = true), ANY.copy(nullable = true))
        else -> className
    }.copy(nullable = nullable)
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
        GodotTypes.primitives.find { s -> s == identifier } != null -> Nature.PRIMITIVE
        identifier.startsWith("Signal") -> Nature.CORE
        GodotTypes.coreTypes.find { s -> s == identifier } != null -> Nature.CORE
        identifier.startsWith(enumPrefix) -> Nature.ENUM
        identifier.startsWith(bitfieldPrefix) -> Nature.BITFIELD
        identifier.startsWith(GodotTypes.typedArray) == true -> Nature.TYPED_ARRAY
        else -> Nature.CLASS
    }
}



