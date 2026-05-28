package godot.entrygenerator.ext

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeName
import godot.api.Node
import godot.api.Object
import godot.api.RefCounted
import godot.api.Resource
import godot.common.extensions.convertToCamelCase
import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.core.AABB
import godot.core.Basis
import godot.core.Callable
import godot.core.Color
import godot.core.CoreType
import godot.core.Dictionary
import godot.core.LambdaCallable
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.PackedVector4Array
import godot.core.Plane
import godot.core.Projection
import godot.core.Quaternion
import godot.core.RID
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.Signal
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.Vector3i
import godot.core.Vector4
import godot.core.Vector4i
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.Settings
import godot.tools.common.constants.GODOT_AABB
import godot.tools.common.constants.GODOT_ARRAY
import godot.tools.common.constants.GODOT_BOOL
import godot.tools.common.constants.GODOT_CALLABLE
import godot.tools.common.constants.GODOT_COLOR
import godot.tools.common.constants.GODOT_DICTIONARY
import godot.tools.common.constants.GODOT_FLOAT
import godot.tools.common.constants.GODOT_INT
import godot.tools.common.constants.GODOT_NIL
import godot.tools.common.constants.GODOT_NODE_PATH
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GODOT_PLANE
import godot.tools.common.constants.GODOT_PACKED_BYTE_ARRAY
import godot.tools.common.constants.GODOT_PACKED_COLOR_ARRAY
import godot.tools.common.constants.GODOT_PACKED_FLOAT32_ARRAY
import godot.tools.common.constants.GODOT_PACKED_FLOAT64_ARRAY
import godot.tools.common.constants.GODOT_PACKED_INT32_ARRAY
import godot.tools.common.constants.GODOT_PACKED_INT64_ARRAY
import godot.tools.common.constants.GODOT_PACKED_STRING_ARRAY
import godot.tools.common.constants.GODOT_PACKED_VECTOR2_ARRAY
import godot.tools.common.constants.GODOT_PACKED_VECTOR3_ARRAY
import godot.tools.common.constants.GODOT_PACKED_VECTOR4_ARRAY
import godot.tools.common.constants.GODOT_PROJECTION
import godot.tools.common.constants.GODOT_QUATERNION
import godot.tools.common.constants.GODOT_RECT2
import godot.tools.common.constants.GODOT_RECT2I
import godot.tools.common.constants.GODOT_RID
import godot.tools.common.constants.GODOT_SIGNAL
import godot.tools.common.constants.GODOT_STRING
import godot.tools.common.constants.GODOT_STRING_NAME
import godot.tools.common.constants.GODOT_TRANSFORM2D
import godot.tools.common.constants.GODOT_TRANSFORM3D
import godot.tools.common.constants.GODOT_BASIS
import godot.tools.common.constants.GODOT_VECTOR2
import godot.tools.common.constants.GODOT_VECTOR2I
import godot.tools.common.constants.GODOT_VECTOR3
import godot.tools.common.constants.GODOT_VECTOR3I
import godot.tools.common.constants.GODOT_VECTOR4
import godot.tools.common.constants.GODOT_VECTOR4I
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.isCollectionsType
import godot.tools.common.constants.isFromPackage
import godot.tools.common.constants.variantCaster
import godot.tools.common.constants.variantParser
import java.util.*

object VariantConverterNames {
    private val parserName = "$godotCorePackage.$variantParser"
    private val casterName = "$godotCorePackage.$variantCaster"

    val nil = MemberName(parserName, "NIL")
    val bool = MemberName(parserName, "BOOL")
    val byte = MemberName(casterName, "BYTE")
    val int = MemberName(casterName, "INT")
    val long = MemberName(parserName, "LONG")
    val float = MemberName(casterName, "FLOAT")
    val double = MemberName(parserName, "DOUBLE")
    val string = MemberName(parserName, "STRING")
    val array = MemberName(parserName, "ARRAY")
    val stringName = MemberName(parserName, "STRING_NAME")
    val rid = MemberName(parserName, "_RID")
    val aabb = MemberName(parserName, "AABB")
    val nodePath = MemberName(parserName, "NODE_PATH")
    val transform2D = MemberName(parserName, "TRANSFORM2D")
    val transform3D = MemberName(parserName, "TRANSFORM3D")
    val packedByteArray = MemberName(parserName, "PACKED_BYTE_ARRAY")
    val packedInt32Array = MemberName(parserName, "PACKED_INT_32_ARRAY")
    val packedInt64Array = MemberName(parserName, "PACKED_INT_64_ARRAY")
    val packedFloat32Array = MemberName(parserName, "PACKED_FLOAT_32_ARRAY")
    val packedFloat64Array = MemberName(parserName, "PACKED_FLOAT_64_ARRAY")
    val packedStringArray = MemberName(parserName, "PACKED_STRING_ARRAY")
    val packedVector2Array = MemberName(parserName, "PACKED_VECTOR2_ARRAY")
    val packedVector3Array = MemberName(parserName, "PACKED_VECTOR3_ARRAY")
    val packedVector4Array = MemberName(parserName, "PACKED_VECTOR4_ARRAY")
    val packedColorArray = MemberName(parserName, "PACKED_COLOR_ARRAY")
    val callable = MemberName(parserName, "CALLABLE")
    val any = MemberName(casterName, "ANY")
    val enum = MemberName(casterName, "ENUM")
    val obj = MemberName(parserName, "OBJECT")

    fun parserName(name: String) = MemberName(parserName, name.uppercase(Locale.getDefault()))
}

fun Type?.toGodotVariantMemberName(): MemberName = this?.let {
    when (it.fqName) {
        Byte::class.qualifiedName, Int::class.qualifiedName -> VariantConverterNames.long
        Float::class.qualifiedName -> VariantConverterNames.double
        else -> toKtVariantMemberName()
    }
} ?: toKtVariantMemberName()

fun Type?.toKtVariantMemberName(): MemberName = when {
    this == null || fqName == Unit::class.qualifiedName -> VariantConverterNames.nil
    this.kind == TypeKind.ENUM_CLASS -> VariantConverterNames.enum
    fqName == Byte::class.qualifiedName -> VariantConverterNames.byte
    fqName == Int::class.qualifiedName -> VariantConverterNames.int
    fqName == NaturalT::class.qualifiedName || fqName == Long::class.qualifiedName -> VariantConverterNames.long
    fqName == Float::class.qualifiedName -> VariantConverterNames.float
    fqName == RealT::class.qualifiedName || fqName == Double::class.qualifiedName -> VariantConverterNames.double

    fqName == String::class.qualifiedName -> VariantConverterNames.string
    fqName == Boolean::class.qualifiedName -> VariantConverterNames.bool
    fqName == VariantArray::class.qualifiedName -> VariantConverterNames.array
    fqName == StringName::class.qualifiedName -> VariantConverterNames.stringName
    fqName == RID::class.qualifiedName -> VariantConverterNames.rid
    fqName == AABB::class.qualifiedName -> VariantConverterNames.aabb
    fqName == NodePath::class.qualifiedName -> VariantConverterNames.nodePath
    fqName == Transform2D::class.qualifiedName -> VariantConverterNames.transform2D
    fqName == Transform3D::class.qualifiedName -> VariantConverterNames.transform3D
    fqName == PackedByteArray::class.qualifiedName -> VariantConverterNames.packedByteArray
    fqName == PackedInt32Array::class.qualifiedName -> VariantConverterNames.packedInt32Array
    fqName == PackedInt64Array::class.qualifiedName -> VariantConverterNames.packedInt64Array
    fqName == PackedFloat32Array::class.qualifiedName -> VariantConverterNames.packedFloat32Array
    fqName == PackedFloat64Array::class.qualifiedName -> VariantConverterNames.packedFloat64Array
    fqName == PackedStringArray::class.qualifiedName -> VariantConverterNames.packedStringArray
    fqName == PackedVector2Array::class.qualifiedName -> VariantConverterNames.packedVector2Array
    fqName == PackedVector3Array::class.qualifiedName -> VariantConverterNames.packedVector3Array
    fqName == PackedVector4Array::class.qualifiedName -> VariantConverterNames.packedVector4Array
    fqName == PackedColorArray::class.qualifiedName -> VariantConverterNames.packedColorArray
    fqName.startsWith(LambdaCallable::class.qualifiedName!!) -> VariantConverterNames.callable
    isCoreType() -> VariantConverterNames.parserName(fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault()))


    fqName == Any::class.qualifiedName -> VariantConverterNames.any
    else -> VariantConverterNames.obj
}

fun Type.isCoreType(): Boolean {
    return supertypes.any { it.fqName == CoreType::class.qualifiedName || it.allSuperTypes.any { superType -> superType.fqName == CoreType::class.qualifiedName } }
}

fun Type.isNodeType(): Boolean {
    return fqName == Node::class.qualifiedName || allSuperTypes.any { supertype -> supertype.fqName == Node::class.qualifiedName }
}

fun Type.baseGodotType(): Type? {
    return if (fqName.isFromPackage(godotApiPackage)) {
        this
    } else {
        allSuperTypes.firstOrNull { supertype -> supertype.fqName.isFromPackage(godotApiPackage) }
    }
}

fun Type?.toGodotClassName(
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
): String = when {
    this == null || fqName == Unit::class.qualifiedName || fqName == Any::class.qualifiedName -> ""
    kind == TypeKind.ENUM_CLASS -> fqName.substringAfterLast(".")
    fqName == Boolean::class.qualifiedName -> GODOT_BOOL
    fqName == Byte::class.qualifiedName ||
        fqName == Short::class.qualifiedName ||
        fqName == Int::class.qualifiedName ||
        fqName == NaturalT::class.qualifiedName ||
        fqName == Long::class.qualifiedName -> GODOT_INT
    fqName == Float::class.qualifiedName ||
        fqName == RealT::class.qualifiedName ||
        fqName == Double::class.qualifiedName -> GODOT_FLOAT
    fqName == String::class.qualifiedName -> GODOT_STRING
    fqName == Vector2::class.qualifiedName -> GODOT_VECTOR2
    fqName == Vector2i::class.qualifiedName -> GODOT_VECTOR2I
    fqName == Rect2::class.qualifiedName -> GODOT_RECT2
    fqName == Rect2i::class.qualifiedName -> GODOT_RECT2I
    fqName == Vector3::class.qualifiedName -> GODOT_VECTOR3
    fqName == Vector3i::class.qualifiedName -> GODOT_VECTOR3I
    fqName == Vector4::class.qualifiedName -> GODOT_VECTOR4
    fqName == Vector4i::class.qualifiedName -> GODOT_VECTOR4I
    fqName == Plane::class.qualifiedName -> GODOT_PLANE
    fqName == Quaternion::class.qualifiedName -> GODOT_QUATERNION
    fqName == AABB::class.qualifiedName -> GODOT_AABB
    fqName == Basis::class.qualifiedName -> GODOT_BASIS
    fqName == Color::class.qualifiedName -> GODOT_COLOR
    fqName == Transform2D::class.qualifiedName -> GODOT_TRANSFORM2D
    fqName == Transform3D::class.qualifiedName -> GODOT_TRANSFORM3D
    fqName == Projection::class.qualifiedName -> GODOT_PROJECTION
    fqName == StringName::class.qualifiedName -> GODOT_STRING_NAME
    fqName == NodePath::class.qualifiedName -> GODOT_NODE_PATH
    fqName == RID::class.qualifiedName -> GODOT_RID
    fqName == Callable::class.qualifiedName || fqName.startsWith(LambdaCallable::class.qualifiedName!!) -> GODOT_CALLABLE
    fqName == Signal::class.qualifiedName -> GODOT_SIGNAL
    fqName == Dictionary::class.qualifiedName -> GODOT_DICTIONARY
    fqName == VariantArray::class.qualifiedName -> GODOT_ARRAY
    fqName == PackedByteArray::class.qualifiedName -> GODOT_PACKED_BYTE_ARRAY
    fqName == PackedInt32Array::class.qualifiedName -> GODOT_PACKED_INT32_ARRAY
    fqName == PackedInt64Array::class.qualifiedName -> GODOT_PACKED_INT64_ARRAY
    fqName == PackedFloat32Array::class.qualifiedName -> GODOT_PACKED_FLOAT32_ARRAY
    fqName == PackedFloat64Array::class.qualifiedName -> GODOT_PACKED_FLOAT64_ARRAY
    fqName == PackedStringArray::class.qualifiedName -> GODOT_PACKED_STRING_ARRAY
    fqName == PackedVector2Array::class.qualifiedName -> GODOT_PACKED_VECTOR2_ARRAY
    fqName == PackedVector3Array::class.qualifiedName -> GODOT_PACKED_VECTOR3_ARRAY
    fqName == PackedVector4Array::class.qualifiedName -> GODOT_PACKED_VECTOR4_ARRAY
    fqName == PackedColorArray::class.qualifiedName -> GODOT_PACKED_COLOR_ARRAY
    baseGodotType() != null -> registeredClassesByFqName[fqName]?.getRegisteredName(settings)
        ?: baseGodotType()!!.fqName.substringAfterLast(".")
    else -> fqName.substringAfterLast(".").ifEmpty { GODOT_NIL }.let { if (it == "Object") GODOT_OBJECT else it }
}

fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun Type.isCompatibleList(): Boolean = when (fqName) {
    VariantArray::class.qualifiedName -> true
    else -> allSuperTypes.any { it.fqName == VariantArray::class.qualifiedName }
}

fun Type.isDictionary(): Boolean = when (fqName) {
    Dictionary::class.qualifiedName -> true
    else -> allSuperTypes.any { it.fqName == Dictionary::class.qualifiedName }
}

fun Type.isKotlinCollection(): Boolean = isCollectionsType(fqName)

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

fun Type.isRefCounted(): Boolean = fqName == RefCounted::class.qualifiedName || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == RefCounted::class.qualifiedName }

fun Type.isResource(): Boolean = fqName == Resource::class.qualifiedName || this
    .allSuperTypes
    .any { supertype -> supertype.fqName == Resource::class.qualifiedName }

fun Type.isGodotPrimitive(): Boolean = when (fqName) {
    Int::class.qualifiedName,
    NaturalT::class.qualifiedName,
    Long::class.qualifiedName,
    Float::class.qualifiedName,
    RealT::class.qualifiedName,
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
    NaturalT::class.qualifiedName,
    Long::class.qualifiedName,
    Byte::class.qualifiedName,
    Short::class.qualifiedName,
    Enum::class.qualifiedName -> 2

    Float::class.qualifiedName,
    RealT::class.qualifiedName,
    Double::class.qualifiedName -> 3

    String::class.qualifiedName -> 4
    Vector2::class.qualifiedName -> 5
    Vector2i::class.qualifiedName -> 6
    Rect2::class.qualifiedName -> 7
    Rect2i::class.qualifiedName -> 8
    Vector3::class.qualifiedName -> 9
    Vector3i::class.qualifiedName -> 10
    Transform2D::class.qualifiedName -> 11
    Vector4::class.qualifiedName -> 12
    Vector4i::class.qualifiedName -> 13
    Plane::class.qualifiedName -> 14
    Quaternion::class.qualifiedName -> 15
    AABB::class.qualifiedName -> 16
    Basis::class.qualifiedName -> 17
    Transform3D::class.qualifiedName -> 18
    Projection::class.qualifiedName -> 19
    Color::class.qualifiedName -> 20
    StringName::class.qualifiedName -> 21
    NodePath::class.qualifiedName -> 22
    RID::class.qualifiedName -> 23
    Object::class.qualifiedName -> 24
    Callable::class.qualifiedName -> 25
    Signal::class.qualifiedName -> 26
    Dictionary::class.qualifiedName -> 27
    VariantArray::class.qualifiedName -> 28
    PackedByteArray::class.qualifiedName -> 29
    PackedInt32Array::class.qualifiedName -> 30
    PackedInt64Array::class.qualifiedName -> 31
    PackedFloat32Array::class.qualifiedName -> 32
    PackedFloat64Array::class.qualifiedName -> 33
    PackedStringArray::class.qualifiedName -> 34
    PackedVector2Array::class.qualifiedName -> 35
    PackedVector3Array::class.qualifiedName -> 36
    PackedColorArray::class.qualifiedName -> 37
    PackedVector4Array::class.qualifiedName -> 38
    else -> null
}

fun Type.getGodotCoreTypeName(): String = when {
    fqName == Boolean::class.qualifiedName -> "bool"
    fqName == Int::class.qualifiedName ||
        fqName == NaturalT::class.qualifiedName ||
        fqName == Long::class.qualifiedName ||
        fqName == Byte::class.qualifiedName ||
        fqName == Short::class.qualifiedName ||
        fqName == Enum::class.qualifiedName -> "int"

    fqName == Float::class.qualifiedName ||
        fqName == RealT::class.qualifiedName ||
        fqName == Double::class.qualifiedName -> "float"

    fqName == String::class.qualifiedName -> "String"
    fqName.startsWith(godotCorePackage) -> fqName.substringAfterLast(".")
    else -> throw IllegalArgumentException("Unsupported fq type $fqName")
}
