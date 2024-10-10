package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import godot.core.CoreType
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_CASTER_BYTE
import godot.tools.common.constants.VARIANT_CASTER_FLOAT
import godot.tools.common.constants.VARIANT_CASTER_INT
import godot.tools.common.constants.VARIANT_PARSER_AABB
import godot.tools.common.constants.VARIANT_PARSER_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_BOOL
import godot.tools.common.constants.VARIANT_PARSER_DOUBLE
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.VARIANT_PARSER_NODE_PATH
import godot.tools.common.constants.VARIANT_PARSER_OBJECT
import godot.tools.common.constants.VARIANT_PARSER_PACKED_BYTE_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_CALLABLE
import godot.tools.common.constants.VARIANT_PARSER_PACKED_COLOR_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_FLOAT_32_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_FLOAT_64_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_INT_32_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_INT_64_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_STRING_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_VECTOR2_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_PACKED_VECTOR3_ARRAY
import godot.tools.common.constants.VARIANT_PARSER_STRING
import godot.tools.common.constants.VARIANT_PARSER_STRING_NAME
import godot.tools.common.constants.VARIANT_PARSER_TRANSFORM2D
import godot.tools.common.constants.VARIANT_PARSER_TRANSFORM3D
import godot.tools.common.constants.VARIANT_PARSER__RID
import godot.tools.common.constants.godotPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotUtilPackage
import godot.tools.common.constants.kotlinCollectionsPackage
import godot.tools.common.constants.variantParserPackage
import godot.tools.common.extensions.convertToCamelCase
import java.util.*

//TODO: make compatible with other languages
fun Type?.toKtVariantType(): ClassName = when {
    this == null || fqName == Unit::class.qualifiedName -> VARIANT_PARSER_NIL
    fqName == Byte::class.qualifiedName -> VARIANT_CASTER_BYTE
    fqName == Int::class.qualifiedName -> VARIANT_CASTER_INT
    fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}" ||
        fqName == Long::class.qualifiedName -> VARIANT_PARSER_LONG

    fqName == Float::class.qualifiedName -> VARIANT_CASTER_FLOAT
    fqName == "$godotUtilPackage.${GodotKotlinJvmTypes.realT}" ||
        fqName == Double::class.qualifiedName -> VARIANT_PARSER_DOUBLE

    fqName == String::class.qualifiedName -> VARIANT_PARSER_STRING
    fqName == Boolean::class.qualifiedName -> VARIANT_PARSER_BOOL
    fqName == "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" -> VARIANT_PARSER_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.stringName}" -> VARIANT_PARSER_STRING_NAME
    fqName == "$godotCorePackage.${GodotTypes.rid}" -> VARIANT_PARSER__RID
    fqName == "$godotCorePackage.${GodotTypes.aabb}" -> VARIANT_PARSER_AABB
    fqName == "$godotCorePackage.${GodotTypes.nodePath}" -> VARIANT_PARSER_NODE_PATH
    fqName == "$godotCorePackage.${GodotTypes.transform2D}" -> VARIANT_PARSER_TRANSFORM2D
    fqName == "$godotCorePackage.${GodotTypes.transform3D}" -> VARIANT_PARSER_TRANSFORM3D
    fqName == "$godotCorePackage.${GodotTypes.packedByteArray}" -> VARIANT_PARSER_PACKED_BYTE_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedInt32Array}" -> VARIANT_PARSER_PACKED_INT_32_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedInt64Array}" -> VARIANT_PARSER_PACKED_INT_64_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedFloat32Array}" -> VARIANT_PARSER_PACKED_FLOAT_32_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedFloat64Array}" -> VARIANT_PARSER_PACKED_FLOAT_64_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedStringArray}" -> VARIANT_PARSER_PACKED_STRING_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedVector2Array}" -> VARIANT_PARSER_PACKED_VECTOR2_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedVector3Array}" -> VARIANT_PARSER_PACKED_VECTOR3_ARRAY
    fqName == "$godotCorePackage.${GodotTypes.packedColorArray}" -> VARIANT_PARSER_PACKED_COLOR_ARRAY
    fqName.startsWith("$godotCorePackage.${GodotTypes.lambdaCallable}") -> VARIANT_PARSER_PACKED_CALLABLE
    isCoreType() -> ClassName(
        variantParserPackage,
        fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault())
    )

    fqName == Any::class.qualifiedName -> VARIANT_CASTER_ANY
    else -> VARIANT_PARSER_OBJECT
}

/**
 * Same as [toKtVariantType] but resolves JVM_* types to actual godot types.
 *
 * Calls [toKtVariantType] under the hood for all other types
 */
fun Type?.toGodotVariantType(): ClassName = this?.let {
    when (it.fqName) {
        Byte::class.qualifiedName, Int::class.qualifiedName -> VARIANT_PARSER_LONG
        Float::class.qualifiedName -> VARIANT_PARSER_DOUBLE
        else -> toKtVariantType()
    }
} ?: toKtVariantType()

fun Type.isCoreType(): Boolean {
    return supertypes.any { it.fqName == CoreType::class.qualifiedName || it.allSuperTypes.any { superType -> superType.fqName == CoreType::class.qualifiedName } }
}

fun Type.isNodeType(): Boolean {
    return fqName == "$godotPackage.${GodotTypes.node}" || allSuperTypes.any { supertype -> supertype.fqName == "$godotPackage.${GodotTypes.node}" }
}

fun Type.baseGodotType(): Type? {
    return if (fqName.startsWith(godotPackage)) {
        this
    } else {
        allSuperTypes.firstOrNull { supertype -> supertype.fqName.startsWith(godotPackage) }
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

fun Type.isKotlinCollection(): Boolean = fqName.contains(kotlinCollectionsPackage)

fun Type.isEnum(): Boolean = kind == TypeKind.ENUM_CLASS

fun Type.isRefCounted(): Boolean = fqName == "$godotPackage.${GodotKotlinJvmTypes.refCounted}" || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == "$godotPackage.${GodotKotlinJvmTypes.refCounted}" }

fun Type.isResource(): Boolean = fqName == "$godotPackage.${GodotKotlinJvmTypes.resource}" || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == "$godotPackage.${GodotKotlinJvmTypes.resource}" }

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
