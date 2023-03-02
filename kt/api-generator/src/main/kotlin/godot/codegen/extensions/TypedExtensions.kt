package godot.codegen.extensions

import com.squareup.kotlinpoet.*
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.poet.ClassTypeNameWrapper
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.tools.common.constants.*

private const val enumPrefix = "enum::"
private const val bitfieldPrefix = "bitfield::"

fun TypedTrait.isCoreType() = isTypedArray() || GodotTypes.coreTypes.find { s -> s == this.type } != null
fun TypedTrait.isPrimitive() = GodotTypes.primitives.find { s -> s == this.type } != null
fun TypedTrait.isCoreTypeReimplementedInKotlin() = GodotTypes.coreTypesReimplementedInKotlin.find { s ->
    s == this.type
} != null
fun TypedTrait.isEnum() = type?.startsWith(enumPrefix) ?: false
fun TypedTrait.isBitField() = type?.startsWith(bitfieldPrefix) ?: false
fun TypedTrait.isTypedArray() = type?.startsWith(GodotTypes.typedArray) ?: false

fun TypedTrait.getTypeClassName(): ClassTypeNameWrapper{
    val typeNameWrapper = when {
        type.isNullOrEmpty() -> ClassTypeNameWrapper(UNIT)
        type == "Signal0" -> ClassTypeNameWrapper(ClassName(signalPackage, type!!))
        type!!.startsWith("Signal") -> {
            this as EnrichedSignal
            val className = ClassName(signalPackage, type)
            ClassTypeNameWrapper(className).parameterizedBy(
                *arguments
                    .map {
                        it.getTypeClassName().typeName
                    }
                    .toTypedArray()
            )
        }
        type == GodotTypes.error -> ClassTypeNameWrapper(GODOT_ERROR)
        isEnum() -> {
            val enumType = type!!.removePrefix(enumPrefix)
            if (enumType == GodotTypes.variantType) {
                ClassTypeNameWrapper(
                    ClassName(
                        godotCorePackage,
                        GodotKotlinJvmTypes.variantType
                    )
                )
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
        isBitField() -> ClassTypeNameWrapper(LONG)
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
            type.isNullOrEmpty() -> VARIANT_TYPE_NIL
            isEnum() -> VARIANT_TYPE_LONG
            type == GodotTypes.bool -> VARIANT_TYPE_BOOL
            type == GodotTypes.int -> VARIANT_TYPE_LONG
            type == GodotTypes.float -> VARIANT_TYPE_DOUBLE
            type == GodotTypes.nodePath -> VARIANT_TYPE_NODE_PATH
            type == GodotTypes.stringName -> VARIANT_TYPE_STRING_NAME
            type == GodotTypes.rid -> VARIANT_TYPE__RID
            type == GodotTypes.array || isTypedArray() -> VARIANT_TYPE_ARRAY
            type == GodotTypes.packedByteArray -> VARIANT_TYPE_PACKED_BYTE_ARRAY
            type == GodotTypes.packedInt32Array -> VARIANT_TYPE_PACKED_INT_32_ARRAY
            type == GodotTypes.packedInt64Array -> VARIANT_TYPE_PACKED_INT_64_ARRAY
            type == GodotTypes.packedFloat32Array -> VARIANT_TYPE_PACKED_FLOAT_32_ARRAY
            type == GodotTypes.packedFloat64Array -> VARIANT_TYPE_PACKED_FLOAT_64_ARRAY
            type == GodotTypes.packedStringArray -> VARIANT_TYPE_PACKED_STRING_ARRAY
            type == GodotTypes.packedVector2Array -> VARIANT_TYPE_PACKED_VECTOR2_ARRAY
            type == GodotTypes.packedVector3Array -> VARIANT_TYPE_PACKED_VECTOR3_ARRAY
            type == GodotTypes.packedColorArray -> VARIANT_TYPE_PACKED_COLOR_ARRAY
            type == GodotTypes.variant -> VARIANT_TYPE_ANY
            isCoreType() || isPrimitive() -> ClassName(variantTypePackage, type!!.toUpperCase())
            else -> VARIANT_TYPE_OBJECT
        }
    }

fun <T> T.getDefaultValueKotlinString(): String?
        where T : WithDefaultValueTrait,
              T : NullableTrait,
              T : TypedTrait {
    val defaultValueString = defaultValue
    return if (defaultValueString != null && nullable) {
        "null"
    } else if (defaultValueString != null) {
        when {
            type == GodotTypes.color -> "${GodotKotlinJvmTypes.color}($defaultValueString)"
            type == GodotTypes.variant -> defaultValueString
            type == GodotTypes.bool -> defaultValueString.toLowerCase()
            type == GodotTypes.float -> intToFloat(defaultValueString)
            type == GodotTypes.stringName -> "${GodotKotlinJvmTypes.stringName}(".plus(defaultValueString.replace("&", "")).plus(")")
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
                }

            type == GodotTypes.rect2 -> defaultValueString
                .replace(",", ".0,")
                .replace(")", ".0)")

            type == GodotTypes.rid ||
            type == GodotTypes.callable ||
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
            -> "$type()"

            else -> defaultValueString
        }
    } else {
        null
    }
}

private fun intToFloat(defaultValue: String): String {
    if (defaultValue.indexOf('.') != -1) return defaultValue

    return "$defaultValue.0"
}
