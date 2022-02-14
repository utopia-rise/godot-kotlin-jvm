package godot.codegen.extensions

import com.squareup.kotlinpoet.*
import godot.codegen.constants.*
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.poet.ClassTypeNameWrapper
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait
import godot.codegen.traits.WithDefaultValueTrait

fun TypedTrait.isCoreType() = GodotTypes.coreTypes.find { s -> s == this.type } != null
fun TypedTrait.isPrimitive() = GodotTypes.primitives.find { s -> s == this.type } != null
fun TypedTrait.isCoreTypeReimplementedInKotlin() = GodotTypes.coreTypesReimplementedInKotlin.find { s ->
    s == this.type
} != null
fun TypedTrait.isEnum() = type?.startsWith("enum::") ?: false

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
        type == GodotTypes.error -> ClassTypeNameWrapper(ClassName(godotCorePackage, KotlinTypes.error))
        isEnum() -> {
            ClassTypeNameWrapper(
                ClassName(
                    godotApiPackage,
                    type!!.replace("enum::", "")
                )
            )
        }
        type == GodotTypes.bool -> ClassTypeNameWrapper(BOOLEAN)
        type == GodotTypes.int -> ClassTypeNameWrapper(LONG)
        type == GodotTypes.float -> ClassTypeNameWrapper(DOUBLE)
        type == GodotTypes.string -> ClassTypeNameWrapper(STRING)
        type == GodotTypes.array -> ClassTypeNameWrapper(ClassName(godotCorePackage, KotlinTypes.array))
            .parameterizedBy(ANY.copy(nullable = true))
        type == GodotTypes.dictionary -> ClassTypeNameWrapper(ClassName(godotCorePackage, KotlinTypes.dictionary))
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

fun TypedTrait.isObjectSubClass() = !(type.isNullOrEmpty() || isEnum() || isPrimitive() || isCoreType())

val TypedTrait.jvmVariantTypeValue: ClassName
    get() {
        return when {
            type.isNullOrEmpty() -> ClassName(variantTypePackage, "NIL")
            isEnum() -> ClassName(variantTypePackage, "LONG")
            type == GodotTypes.bool -> ClassName(variantTypePackage, "BOOL")
            type == GodotTypes.int -> ClassName(variantTypePackage, "LONG")
            type == GodotTypes.float -> ClassName(variantTypePackage, "DOUBLE")
            type == GodotTypes.nodePath -> ClassName(variantTypePackage, "NODE_PATH")
            type == GodotTypes.stringName -> ClassName(variantTypePackage, "STRING_NAME")
            type == GodotTypes.rid -> ClassName(variantTypePackage, "_RID")
            type == GodotTypes.array -> ClassName(variantTypePackage, "ARRAY")
            type == GodotTypes.packedByteArray -> ClassName(variantTypePackage, "PACKED_BYTE_ARRAY")
            type == GodotTypes.packedInt32Array -> ClassName(variantTypePackage, "PACKED_INT_32_ARRAY")
            type == GodotTypes.packedInt64Array -> ClassName(variantTypePackage, "PACKED_INT_64_ARRAY")
            type == GodotTypes.packedFloat32Array -> ClassName(variantTypePackage, "PACKED_FLOAT_32_ARRAY")
            type == GodotTypes.packedFloat64Array -> ClassName(variantTypePackage, "PACKED_FLOAT_64_ARRAY")
            type == GodotTypes.packedStringArray -> ClassName(variantTypePackage, "PACKED_STRING_ARRAY")
            type == GodotTypes.packedVector2Array -> ClassName(variantTypePackage, "PACKED_VECTOR2_ARRAY")
            type == GodotTypes.packedVector3Array -> ClassName(variantTypePackage, "PACKED_VECTOR3_ARRAY")
            type == GodotTypes.packedColorArray -> ClassName(variantTypePackage, "POOL_COLOR_ARRAY")
            type == GodotTypes.variant -> ClassName(variantTypePackage, "ANY")
            isCoreType() || isPrimitive() -> ClassName(variantTypePackage, type!!.toUpperCase())
            else -> ClassName(variantTypePackage, "OBJECT")
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
        when (type) {
            GodotTypes.color -> "${KotlinTypes.color}($defaultValueString)"
            GodotTypes.variant -> "${KotlinTypes.variant}($defaultValueString)"
            GodotTypes.bool -> defaultValueString.toLowerCase()
            GodotTypes.float -> intToFloat(defaultValueString)

            GodotTypes.vector2,
            GodotTypes.vector3,
            GodotTypes.vector2i,
            GodotTypes.vector3i,
            GodotTypes.rect2,
            GodotTypes.rect2i
            -> "$type${
                defaultValueString.replace(",", ".0,")
                    .replace(")", ".0)")}"

            GodotTypes.dictionary,
            GodotTypes.transform2D,
            GodotTypes.transform3D,
            GodotTypes.array,
            GodotTypes.packedByteArray,
            GodotTypes.packedColorArray,
            GodotTypes.packedFloat32Array,
            GodotTypes.packedFloat64Array,
            GodotTypes.packedStringArray,
            GodotTypes.packedInt32Array,
            GodotTypes.packedInt64Array,
            GodotTypes.packedVector2Array,
            GodotTypes.packedVector3Array,
            -> "$type()"

            GodotTypes.nodePath -> {
                val parameter = if (defaultValueString.isEmpty()) "" else "\"$defaultValueString\""
                "${KotlinTypes.nodePath}($parameter)"
            }

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