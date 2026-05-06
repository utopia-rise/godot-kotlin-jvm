package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import godot.common.extensions.convertToCamelCase
import godot.core.CoreType
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.settings.Settings
import godot.tools.common.names.API
import godot.tools.common.names.Kotlin
import godot.tools.common.names.Util
import godot.tools.common.names.VariantConverter
import godot.tools.common.names.qualifiedName
import java.util.*
import godot.tools.common.names.CoreType as CoreEntity

fun Type?.toGodotVariantMemberName(): MemberName = this?.let {
    when (it.fqName) {
        Byte::class.qualifiedName, Int::class.qualifiedName -> VariantConverter.long
        Float::class.qualifiedName -> VariantConverter.double
        else -> toKtVariantMemberName()
    }
} ?: toKtVariantMemberName()

fun Type?.toKtVariantMemberName(): MemberName = when {
    this == null || fqName == Unit::class.qualifiedName -> VariantConverter.nil
    this.kind == TypeKind.ENUM_CLASS -> VariantConverter.enum
    fqName == Byte::class.qualifiedName -> VariantConverter.byte
    fqName == Int::class.qualifiedName -> VariantConverter.int
    fqName == Util.naturalT.qualifiedName || fqName == Long::class.qualifiedName -> VariantConverter.long
    fqName == Float::class.qualifiedName -> VariantConverter.float
    fqName == Util.realT.qualifiedName || fqName == Double::class.qualifiedName -> VariantConverter.double

    fqName == String::class.qualifiedName -> VariantConverter.string
    fqName == Boolean::class.qualifiedName -> VariantConverter.bool
    fqName == CoreEntity.variantArray.qualifiedName -> VariantConverter.array
    fqName == CoreEntity.stringName.qualifiedName -> VariantConverter.stringName
    fqName == CoreEntity.rid.qualifiedName -> VariantConverter.rid
    fqName == CoreEntity.aabb.qualifiedName -> VariantConverter.aabb
    fqName == CoreEntity.nodePath.qualifiedName -> VariantConverter.nodePath
    fqName == CoreEntity.transform2D.qualifiedName -> VariantConverter.transform2D
    fqName == CoreEntity.transform3D.qualifiedName -> VariantConverter.transform3D
    fqName == CoreEntity.packedByteArray.qualifiedName -> VariantConverter.packedByteArray
    fqName == CoreEntity.packedInt32Array.qualifiedName -> VariantConverter.packedInt32Array
    fqName == CoreEntity.packedInt64Array.qualifiedName -> VariantConverter.packedInt64Array
    fqName == CoreEntity.packedFloat32Array.qualifiedName -> VariantConverter.packedFloat32Array
    fqName == CoreEntity.packedFloat64Array.qualifiedName -> VariantConverter.packedFloat64Array
    fqName == CoreEntity.packedStringArray.qualifiedName -> VariantConverter.packedStringArray
    fqName == CoreEntity.packedVector2Array.qualifiedName -> VariantConverter.packedVector2Array
    fqName == CoreEntity.packedVector3Array.qualifiedName -> VariantConverter.packedVector3Array
    fqName == CoreEntity.packedVector4Array.qualifiedName -> VariantConverter.packedVector4Array
    fqName == CoreEntity.packedColorArray.qualifiedName -> VariantConverter.packedColorArray
    fqName.startsWith(CoreEntity.lambdaCallable.qualifiedName) -> VariantConverter.callable
    isCoreType() -> VariantConverter.parserName(fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault()))


    fqName == Any::class.qualifiedName -> VariantConverter.any
    else -> VariantConverter.obj
}

fun Type.isCoreType(): Boolean {
    return supertypes.any { it.fqName == CoreType::class.qualifiedName || it.allSuperTypes.any { superType -> superType.fqName == CoreType::class.qualifiedName } }
}

fun Type.isNodeType(): Boolean {
    return fqName == API.node.qualifiedName || allSuperTypes.any { supertype -> supertype.fqName == API.node.qualifiedName }
}

fun Type.baseGodotType(): Type? {
    return if (API.isFromPackage(fqName)) {
        this
    } else {
        allSuperTypes.firstOrNull { supertype -> API.isFromPackage(supertype.fqName) }
    }
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun Type.isCompatibleList(): Boolean = when (fqName) {
    CoreEntity.variantArray.qualifiedName -> true
    else -> allSuperTypes.any { it.fqName == CoreEntity.variantArray.qualifiedName }
}

fun Type.isDictionary(): Boolean = when (fqName) {
    CoreEntity.dictionary.qualifiedName -> true
    else -> allSuperTypes.any { it.fqName == CoreEntity.dictionary.qualifiedName }
}

fun Type.isKotlinCollection(): Boolean = Kotlin.isCollectionsType(fqName)

private val javaCollection = arrayOf(
    "java.util.ArrayList",
    "java.util.LinkedList",
    "java.util.Vector",
    "java.util.Stack",
    "java.util.HashSet",
    "java.util.LinkedHashSet",
    "java.util.TreeSet",
    "java.util.PriorityQueue",
    "java.util.ArrayDeque",
    "java.util.HashMap",
    "java.util.LinkedHashMap",
    "java.util.TreeMap",
    "java.util.Hashtable",
    "java.util.List",
    "java.util.Set",
    "java.util.Queue",
    "java.util.Deque",
    "java.util.Map",
    "java.util.SortedSet",
    "java.util.NavigableSet",
    "java.util.SortedMap",
    "java.util.NavigableMap"
)

fun Type.isJavaCollection(): Boolean = javaCollection.contains(fqName)
fun String.isJavaCollection(): Boolean = javaCollection.contains(this)

fun Type.isEnum(): Boolean = kind == TypeKind.ENUM_CLASS

fun Type.isRefCounted(): Boolean = fqName == API.refCounted.qualifiedName || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == API.refCounted.qualifiedName }

fun Type.isResource(): Boolean = fqName == API.resource.qualifiedName || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == API.resource.qualifiedName }

fun Type.isGodotPrimitive(): Boolean = when (fqName) {
    Int::class.qualifiedName,
    Util.naturalT.qualifiedName,
    Long::class.qualifiedName,
    Float::class.qualifiedName,
    Util.realT.qualifiedName,
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
    Util.naturalT.qualifiedName,
    Long::class.qualifiedName,
    Byte::class.qualifiedName,
    Short::class.qualifiedName,
    Enum::class.qualifiedName -> 2

    Float::class.qualifiedName,
    Util.realT.qualifiedName,
    Double::class.qualifiedName -> 3

    String::class.qualifiedName -> 4
    CoreEntity.vector2.qualifiedName -> 5
    CoreEntity.vector2i.qualifiedName -> 6
    CoreEntity.rect2.qualifiedName -> 7
    CoreEntity.rect2i.qualifiedName -> 8
    CoreEntity.vector3.qualifiedName -> 9
    CoreEntity.vector3i.qualifiedName -> 10
    CoreEntity.transform2D.qualifiedName -> 11
    CoreEntity.vector4.qualifiedName -> 12
    CoreEntity.vector4i.qualifiedName -> 13
    CoreEntity.plane.qualifiedName -> 14
    CoreEntity.quaternion.qualifiedName -> 15
    CoreEntity.aabb.qualifiedName -> 16
    CoreEntity.basis.qualifiedName -> 17
    CoreEntity.transform3D.qualifiedName -> 18
    CoreEntity.projection.qualifiedName -> 19
    CoreEntity.color.qualifiedName -> 20
    CoreEntity.stringName.qualifiedName -> 21
    CoreEntity.nodePath.qualifiedName -> 22
    CoreEntity.rid.qualifiedName -> 23
    API.`object`.qualifiedName -> 24
    CoreEntity.callable.qualifiedName -> 25
    CoreEntity.signal.qualifiedName -> 26
    CoreEntity.dictionary.qualifiedName -> 27
    //Array -> handled in else branch
    CoreEntity.packedByteArray.qualifiedName -> 29
    CoreEntity.packedInt32Array.qualifiedName -> 30
    CoreEntity.packedInt64Array.qualifiedName -> 31
    CoreEntity.packedFloat32Array.qualifiedName -> 32
    CoreEntity.packedFloat64Array.qualifiedName -> 33
    CoreEntity.packedStringArray.qualifiedName -> 34
    CoreEntity.packedVector2Array.qualifiedName -> 35
    CoreEntity.packedVector3Array.qualifiedName -> 36
    CoreEntity.packedColorArray.qualifiedName -> 37
    CoreEntity.packedVector4Array.qualifiedName -> 38
    else -> if (this.isCompatibleListType()) {
        28
    } else {
        null
    }
}

fun Type.getAsGodotClassName(settings: Settings): String = when {
    fqName == Boolean::class.qualifiedName -> "bool"
    fqName == Int::class.qualifiedName ||
        fqName == Util.naturalT.qualifiedName ||
        fqName == Long::class.qualifiedName ||
        fqName == Byte::class.qualifiedName ||
        fqName == Short::class.qualifiedName ||
        fqName == Enum::class.qualifiedName -> "int"

    fqName == Float::class.qualifiedName ||
        fqName == Util.realT.qualifiedName ||
        fqName == Double::class.qualifiedName -> "float"

    fqName == String::class.qualifiedName -> "String"
    fqName.startsWith(CoreEntity.color.packageName) -> fqName.substringAfterLast(".")
    else -> registeredName(settings) ?: fqName.substringAfterLast(".")
}

fun Type.isCompatibleListType(): Boolean {
    return this.getCompatibleListType().isNotEmpty()
}

// TODO: 4.0: fix ordinals: https://github.com/godotengine/godot/blob/0810ecaafdbee3ea747219e6ab3a8de5d2216a09/editor/editor_properties_array_dict.cpp
fun Type.getCompatibleListType() = when (fqName) {
    CoreEntity.variantArray.qualifiedName -> "17"
    else -> ""
}
