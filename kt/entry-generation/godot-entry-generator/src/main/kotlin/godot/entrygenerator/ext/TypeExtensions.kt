package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import godot.entrygenerator.model.Type
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.VARIANT_CASTER_BYTE
import godot.tools.common.constants.VARIANT_CASTER_FLOAT
import godot.tools.common.constants.VARIANT_CASTER_INT
import godot.tools.common.constants.VARIANT_TYPE_AABB
import godot.tools.common.constants.VARIANT_TYPE_ANY
import godot.tools.common.constants.VARIANT_TYPE_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_BOOL
import godot.tools.common.constants.VARIANT_TYPE_DOUBLE
import godot.tools.common.constants.VARIANT_TYPE_LONG
import godot.tools.common.constants.VARIANT_TYPE_NIL
import godot.tools.common.constants.VARIANT_TYPE_NODE_PATH
import godot.tools.common.constants.VARIANT_TYPE_OBJECT
import godot.tools.common.constants.VARIANT_TYPE_PACKED_BYTE_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_CALLABLE
import godot.tools.common.constants.VARIANT_TYPE_PACKED_COLOR_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_FLOAT_32_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_FLOAT_64_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_INT_32_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_INT_64_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_STRING_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_VECTOR2_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_PACKED_VECTOR3_ARRAY
import godot.tools.common.constants.VARIANT_TYPE_STRING
import godot.tools.common.constants.VARIANT_TYPE_STRING_NAME
import godot.tools.common.constants.VARIANT_TYPE_TRANSFORM2D
import godot.tools.common.constants.VARIANT_TYPE_TRANSFORM3D
import godot.tools.common.constants.VARIANT_TYPE__RID
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCallablePackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotUtilPackage
import godot.tools.common.constants.variantTypePackage
import godot.tools.common.extensions.convertToCamelCase
import java.util.*

//TODO: make compatible with other languages
fun Type?.toKtVariantType(): ClassName = when {
    this == null || fqName == Unit::class.qualifiedName -> VARIANT_TYPE_NIL
    fqName == Byte::class.qualifiedName -> VARIANT_CASTER_BYTE
    fqName == Int::class.qualifiedName -> VARIANT_CASTER_INT
    fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}" ||
        fqName == Long::class.qualifiedName -> VARIANT_TYPE_LONG
    fqName == Float::class.qualifiedName -> VARIANT_CASTER_FLOAT
    fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.realT}" ||
        fqName == Double::class.qualifiedName -> VARIANT_TYPE_DOUBLE
    fqName == String::class.qualifiedName -> VARIANT_TYPE_STRING
    fqName == Boolean::class.qualifiedName -> VARIANT_TYPE_BOOL
    fqName == "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" -> VARIANT_TYPE_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.stringName}" -> VARIANT_TYPE_STRING_NAME
    fqName == "$godotCorePackage.${GodotTypes.rid}" -> VARIANT_TYPE__RID
    fqName == "$godotCorePackage.${GodotTypes.aabb}" -> VARIANT_TYPE_AABB
    fqName == "$godotCorePackage.${GodotTypes.nodePath}" -> VARIANT_TYPE_NODE_PATH
    fqName == "$godotCorePackage.${GodotTypes.transform2D}" -> VARIANT_TYPE_TRANSFORM2D
    fqName == "$godotCorePackage.${GodotTypes.transform3D}" -> VARIANT_TYPE_TRANSFORM3D
    fqName == "$godotCorePackage.${GodotTypes.packedByteArray}" -> VARIANT_TYPE_PACKED_BYTE_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedInt32Array}" -> VARIANT_TYPE_PACKED_INT_32_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedInt64Array}" -> VARIANT_TYPE_PACKED_INT_64_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedFloat32Array}" -> VARIANT_TYPE_PACKED_FLOAT_32_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedFloat64Array}" -> VARIANT_TYPE_PACKED_FLOAT_64_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedStringArray}" -> VARIANT_TYPE_PACKED_STRING_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedVector2Array}" -> VARIANT_TYPE_PACKED_VECTOR2_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedVector3Array}" -> VARIANT_TYPE_PACKED_VECTOR3_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedColorArray}" -> VARIANT_TYPE_PACKED_COLOR_ARRAY
    fqName.startsWith("$godotCallablePackage.${GodotTypes.ktCallable}") -> VARIANT_TYPE_PACKED_CALLABLE
    isCoreType() -> ClassName(
        variantTypePackage,
        fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault())
    )
    fqName == Any::class.qualifiedName -> VARIANT_TYPE_ANY
    else -> VARIANT_TYPE_OBJECT
}

/**
 * Same as [toKtVariantType] but resolves JVM_* types to actual godot types.
 *
 * Calls [toKtVariantType] under the hood for all other types
 */
fun Type?.toGodotVariantType(): ClassName = this?.let {
    when (it.fqName) {
        Byte::class.qualifiedName, Int::class.qualifiedName -> VARIANT_TYPE_LONG
        Float::class.qualifiedName -> VARIANT_TYPE_DOUBLE
        else -> toKtVariantType()
    }
} ?: toKtVariantType()

fun Type.isCoreType(): Boolean {
    return listOf(
        *GodotTypes.coreTypes.map { "$godotCorePackage.$it" }.toTypedArray(),
        "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}"
    ).contains(fqName)
}

fun Type.isNodeType(): Boolean {
    return fqName == "$godotApiPackage.${GodotTypes.node}" || allSuperTypes.any { supertype -> supertype.fqName == "$godotApiPackage.${GodotTypes.node}" }
}

fun Type.baseGodotType(): Type? {
    return if (fqName.startsWith(godotApiPackage)) {
        this
    } else {
        allSuperTypes.firstOrNull { supertype -> supertype.fqName.startsWith(godotApiPackage) }
    }
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun Type.isCompatibleList(): Boolean = when (fqName) {
    "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" -> true
    else -> allSuperTypes.any { it.fqName == "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" }
}

fun Type.isReference(): Boolean = fqName == "$godotApiPackage.${GodotKotlinJvmTypes.refCounted}" || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == "$godotApiPackage.${GodotKotlinJvmTypes.refCounted}" }

fun Type.isResource(): Boolean = fqName == "$godotApiPackage.${GodotKotlinJvmTypes.resource}" || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == "$godotApiPackage.${GodotKotlinJvmTypes.resource}" }

fun Type.isGodotPrimitive(): Boolean = when (fqName) {
    Int::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}",
    Long::class.qualifiedName,
    Float::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.realT}",
    Double::class.qualifiedName,
    Boolean::class.qualifiedName,
    Byte::class.qualifiedName,
    Short::class.qualifiedName,
    String::class.qualifiedName -> true
    else -> false
}

// ordinals can be found in core/variant/variant.h
fun Type.getAsVariantTypeOrdinal(): Int? = when (fqName) {
    Boolean::class.qualifiedName -> 1
    Int::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}",
    Long::class.qualifiedName,
    Byte::class.qualifiedName,
    Short::class.qualifiedName,
    Enum::class.qualifiedName -> 2
    Float::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.realT}",
    Double::class.qualifiedName -> 3
    String::class.qualifiedName -> 4
    "$godotCorePackage.${GodotTypes.vector2}" -> 5
    "$godotCorePackage.${GodotTypes.vector2i}" -> 6
    "$godotCorePackage.${GodotTypes.rect2}" -> 7
    "$godotCorePackage.${GodotTypes.rect2i}" -> 8
    "$godotCorePackage.${GodotTypes.vector3}" -> 9
    "$godotCorePackage.${GodotTypes.vector3i}" -> 10
    "$godotCorePackage.${GodotTypes.transform2D}" -> 11
    "$godotCorePackage.${GodotTypes.vector4}" -> 12
    "$godotCorePackage.${GodotTypes.vector4i}" -> 13
    "$godotCorePackage.${GodotTypes.plane}" -> 14
    "$godotCorePackage.${GodotTypes.quaternion}" -> 15
    "$godotCorePackage.${GodotTypes.aabb}" -> 16
    "$godotCorePackage.${GodotTypes.basis}" -> 17
    "$godotCorePackage.${GodotTypes.transform3D}" -> 18
    "$godotCorePackage.${GodotTypes.projection}" -> 19
    "$godotCorePackage.${GodotTypes.color}" -> 20
    "$godotCorePackage.${GodotTypes.stringName}" -> 21
    "$godotCorePackage.${GodotTypes.nodePath}" -> 22
    "$godotCorePackage.${GodotTypes.rid}" -> 23
    "$godotCorePackage.${GodotKotlinJvmTypes.obj}" -> 24
    "$godotCorePackage.${GodotTypes.callable}" -> 25
    "$godotCorePackage.${GodotTypes.signal}" -> 26
    "$godotCorePackage.${GodotTypes.dictionary}" -> 27
    //Array -> handled in else branch
    "$godotCorePackage.${GodotTypes.packedByteArray}" -> 29
    "$godotCorePackage.${GodotTypes.packedInt32Array}" -> 30
    "$godotCorePackage.${GodotTypes.packedInt64Array}" -> 31
    "$godotCorePackage.${GodotTypes.packedFloat32Array}" -> 32
    "$godotCorePackage.${GodotTypes.packedFloat64Array}" -> 33
    "$godotCorePackage.${GodotTypes.packedStringArray}" -> 34
    "$godotCorePackage.${GodotTypes.packedVector2Array}" -> 35
    "$godotCorePackage.${GodotTypes.packedVector3Array}" -> 36
    "$godotCorePackage.${GodotTypes.packedColorArray}" -> 37
    else -> if (this.isCompatibleListType()) {
        28
    } else {
        null
    }
}

fun Type.getAsGodotClassName(): String = when {
    fqName == Boolean::class.qualifiedName -> "bool"
    fqName == Int::class.qualifiedName ||
        fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}" ||
        fqName == Long::class.qualifiedName ||
        fqName == Byte::class.qualifiedName ||
        fqName == Short::class.qualifiedName ||
        fqName == Enum::class.qualifiedName -> "int"
    fqName == Float::class.qualifiedName ||
        fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.realT}" ||
        fqName == Double::class.qualifiedName -> "float"
    fqName == String::class.qualifiedName -> "String"
    fqName.startsWith(godotCorePackage) -> fqName.substringAfterLast(".")
    else -> registeredName() ?: fqName.substringAfterLast(".")
}

fun Type.isCompatibleListType(): Boolean {
    return this.getCompatibleListType().isNotEmpty()
}

// TODO: 4.0: fix ordinals: https://github.com/godotengine/godot/blob/0810ecaafdbee3ea747219e6ab3a8de5d2216a09/editor/editor_properties_array_dict.cpp
fun Type.getCompatibleListType() = when (fqName) {
    "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" -> "17"
    else -> ""
}
