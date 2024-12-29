package godot.codegen.extensions

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.UNIT
import godot.codegen.constants.GodotMeta
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.poet.ClassTypeNameWrapper
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.tools.common.constants.GODOT_ARRAY
import godot.tools.common.constants.GODOT_CALLABLE
import godot.tools.common.constants.GODOT_CALLABLE_BASE
import godot.tools.common.constants.GODOT_DICTIONARY
import godot.tools.common.constants.GODOT_ERROR
import godot.tools.common.constants.GODOT_VARIANT_TYPE
import godot.tools.common.constants.GodotKotlinJvmTypes
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

const val enumPrefix = "enum::"
const val bitfieldPrefix = "bitfield::"

fun TypedTrait.isCoreType() = isTypedArray() || GodotTypes.coreTypes.find { s -> s == this.type } != null
fun TypedTrait.isPrimitive() = GodotTypes.primitives.find { s -> s == this.type } != null
fun TypedTrait.isLocalCopyCoreTypes() = GodotTypes.localCopyCoreTypes.find { s ->
    s == this.type
} != null
fun TypedTrait.isEnum() = type?.startsWith(enumPrefix) ?: false
fun TypedTrait.isBitField() = type?.startsWith(bitfieldPrefix) ?: false
fun TypedTrait.isTypedArray() = type?.startsWith(GodotTypes.typedArray) ?: false

fun TypedTrait.getTypeClassName(): ClassTypeNameWrapper {
    val typeNameWrapper = when {
        type.isNullOrEmpty() -> ClassTypeNameWrapper(UNIT)
        type == "Signal0" -> ClassTypeNameWrapper(ClassName(godotCorePackage, type!!))
        type!!.startsWith("Signal") -> {
            this as EnrichedSignal
            val className = ClassName(godotCorePackage, type)
            ClassTypeNameWrapper(className).parameterizedBy(
                *arguments
                    .map {
                        it.getCastedType().typeName
                    }
                    .toTypedArray()
            )
        }
        type == GodotTypes.error -> ClassTypeNameWrapper(GODOT_ERROR)
        isEnum() -> {
            val enumType = type!!.removePrefix(enumPrefix)
            if (enumType == GodotTypes.variantType) {
                ClassTypeNameWrapper(GODOT_VARIANT_TYPE)
            } else {
                val containerAndEnum = enumType.split('.')
                val packageName = object : TypedTrait {
                    override val type = containerAndEnum.first()
                }.getTypeClassName().className.packageName
                ClassTypeNameWrapper(
                    ClassName(
                        packageName,
                        containerAndEnum
                    )
                )
            }
        }
        isBitField() -> {
            val containerAndBitfield = type!!.removePrefix(bitfieldPrefix).split('.')
            val packageName = object : TypedTrait {
                override val type = containerAndBitfield.first()
            }.getTypeClassName().className.packageName
            ClassTypeNameWrapper(
                ClassName(
                    packageName,
                    containerAndBitfield
                )
            )
        }
        type == GodotTypes.bool -> ClassTypeNameWrapper(BOOLEAN)
        type == GodotTypes.int -> ClassTypeNameWrapper(LONG)
        type == GodotTypes.float -> ClassTypeNameWrapper(DOUBLE)
        type == GodotTypes.string -> ClassTypeNameWrapper(STRING)
        isTypedArray() -> {
            val parameterType = object : TypedTrait {
                override val type: String = this@getTypeClassName.type!!
                    .removePrefix("${GodotTypes.typedArray}::")
            }
            ClassTypeNameWrapper(GODOT_ARRAY)
                .parameterizedBy(
                    parameterType.getTypeClassName().typeName
                )
        }
        type == GodotTypes.array -> ClassTypeNameWrapper(GODOT_ARRAY)
            .parameterizedBy(ANY.copy(nullable = true))
        type == GodotTypes.dictionary -> ClassTypeNameWrapper(GODOT_DICTIONARY)
            .parameterizedBy(ANY.copy(nullable = true), ANY.copy(nullable = true))
        type == GodotTypes.variant -> ClassTypeNameWrapper(ANY)
        type == GodotTypes.callable -> ClassTypeNameWrapper(GODOT_CALLABLE_BASE)
        isCoreType() -> ClassTypeNameWrapper(ClassName(godotCorePackage, type!!))
    else -> ClassTypeNameWrapper(ClassName(godotApiPackage, type!!))
    }

    if (this is NullableTrait) {
        typeNameWrapper.modify(nullable = nullable)
    }

    return typeNameWrapper
}

fun TypedTrait.isObjectSubClass() = !(type.isNullOrEmpty() || isEnum() || isPrimitive() || isCoreType() || isBitField())

val TypedTrait.jvmVariantTypeValue: ClassName
    get() {
        return when {
            type.isNullOrEmpty() -> VARIANT_PARSER_NIL
            isEnum() -> VARIANT_PARSER_LONG
            isBitField() -> VARIANT_PARSER_LONG
            type == GodotTypes.bool -> VARIANT_PARSER_BOOL
            type == GodotTypes.int -> VARIANT_PARSER_LONG
            type == GodotTypes.float -> VARIANT_PARSER_DOUBLE
            type == GodotTypes.nodePath -> VARIANT_PARSER_NODE_PATH
            type == GodotTypes.stringName -> VARIANT_PARSER_STRING_NAME
            type == GodotTypes.rid -> VARIANT_PARSER__RID
            type == GodotTypes.array || isTypedArray() -> VARIANT_PARSER_ARRAY
            type == GodotTypes.packedByteArray -> VARIANT_PARSER_PACKED_BYTE_ARRAY
            type == GodotTypes.packedInt32Array -> VARIANT_PARSER_PACKED_INT_32_ARRAY
            type == GodotTypes.packedInt64Array -> VARIANT_PARSER_PACKED_INT_64_ARRAY
            type == GodotTypes.packedFloat32Array -> VARIANT_PARSER_PACKED_FLOAT_32_ARRAY
            type == GodotTypes.packedFloat64Array -> VARIANT_PARSER_PACKED_FLOAT_64_ARRAY
            type == GodotTypes.packedStringArray -> VARIANT_PARSER_PACKED_STRING_ARRAY
            type == GodotTypes.packedVector2Array -> VARIANT_PARSER_PACKED_VECTOR2_ARRAY
            type == GodotTypes.packedVector3Array -> VARIANT_PARSER_PACKED_VECTOR3_ARRAY
            type == GodotTypes.packedColorArray -> VARIANT_PARSER_PACKED_COLOR_ARRAY
            type == GodotTypes.variant -> VARIANT_CASTER_ANY
            isCoreType() || isPrimitive() -> ClassName(variantParserPackage, type!!.uppercase(Locale.US))
            else -> VARIANT_PARSER_OBJECT
        }
    }

fun <T> T.getDefaultValueKotlinString(): Pair<String, Array<Any?>>?
    where T : WithDefaultValueTrait,
          T : NullableTrait,
          T : CastableTrait {
    val defaultValueString = defaultValue ?: return null
    return when {
        nullable && defaultValue == "null" -> defaultValueString to arrayOf()
        type == GodotTypes.color -> "${GodotKotlinJvmTypes.color}($defaultValueString)" to arrayOf()
        type == GodotTypes.variant -> defaultValueString to arrayOf()
        type == GodotTypes.bool -> defaultValueString.lowercase(Locale.US) to arrayOf()
        type == GodotTypes.float && meta == GodotMeta.Float.float -> "${intToFloat(defaultValueString)}f" to arrayOf()
        type == GodotTypes.float -> intToFloat(defaultValueString) to arrayOf()
        type == GodotTypes.stringName -> "${GodotKotlinJvmTypes.stringName}(".plus(defaultValueString.replace("&", ""))
            .plus(")") to arrayOf()

        type == GodotTypes.array || isTypedArray() ->
            if (defaultValueString.startsWith("Array")) {
                val defaultArrayValues = defaultValueString
                    .replace("Array.*\\(\\[".toRegex(), "")
                    .removeSuffix("])")
                "$godotCorePackage.variantArrayOf(".plus(defaultArrayValues).plus(")")
            } else {
                "$godotCorePackage.variantArrayOf("
                    .plus(defaultValueString.removePrefix("[").removeSuffix("]"))
                    .plus(")")
            } to arrayOf()

        type == GodotTypes.rect2 -> defaultValueString
            .replace(",", ".0,")
            .replace(")", ".0)") to arrayOf()

        type == GodotTypes.callable -> "%T()" to arrayOf(GODOT_CALLABLE)

        type == GodotTypes.rid ||
            type == GodotTypes.dictionary ||
            type == GodotTypes.transform2D ||
            type == GodotTypes.transform3D ||
            type == GodotTypes.packedByteArray ||
            type == GodotTypes.packedColorArray ||
            type == GodotTypes.packedFloat32Array ||
            type == GodotTypes.packedFloat64Array ||
            type == GodotTypes.packedStringArray ||
            type == GodotTypes.packedInt32Array ||
            type == GodotTypes.packedInt64Array ||
            type == GodotTypes.packedVector2Array ||
            type == GodotTypes.packedVector3Array
        -> "$type()" to arrayOf()

        else -> defaultValueString to arrayOf()
    }
}

private fun intToFloat(defaultValue: String): String {
    if (defaultValue.indexOf('.') != -1) return defaultValue

    return "$defaultValue.0"
}
