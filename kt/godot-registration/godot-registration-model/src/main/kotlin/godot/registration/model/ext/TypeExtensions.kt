package godot.registration.model.ext

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
import godot.core.*
import godot.core.Dictionary
import godot.registration.model.types.GodotClass
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import godot.tools.common.constants.*
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
    this.kind == TypeKind.ENUM -> VariantConverterNames.enum
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
    isCoreType() -> VariantConverterNames.parserName(
        fqName.substringAfterLast(".").convertToCamelCase().uppercase(Locale.getDefault())
    )


    fqName == Any::class.qualifiedName -> VariantConverterNames.any
    else -> VariantConverterNames.obj
}

/** Best-effort reflection fallback for non-Godot hierarchy checks that are not modeled yet. */
private fun Type.isSubtypeOf(target: Class<*>): Boolean = runCatching {
    target.isAssignableFrom(Class.forName(fqName))
}.getOrDefault(false)

private fun Type.hasGodotAncestor(fqName: String): Boolean {
    if (kind != TypeKind.CLASS) {
        return false
    }

    val godotClass = this as? GodotClass ?: return false
    return godotClass.fqName == fqName || godotClass.allAncestry.any { it.fqName == fqName }
}

fun Type.isCoreType(): Boolean = kind == TypeKind.CORE_TYPE

fun Type.isNodeType(): Boolean {
    return hasGodotAncestor(requireNotNull(Node::class.qualifiedName))
}

fun Type.baseGodotType(): Type? {
    if (fqName.isFromPackage(godotApiPackage)) return this
    val loaded = runCatching { Class.forName(fqName) }.getOrNull() ?: return null
    var current: Class<*>? = loaded.superclass
    while (current != null) {
        if (current.name.isFromPackage(godotApiPackage)) {
            return Type(fqName = current.name, kind = TypeKind.CLASS, isNullable = false)
        }
        current = current.superclass
    }
    return null
}


fun Type.toTypeName(): TypeName = ClassName(
    fqName.substringBeforeLast("."),
    fqName.substringAfterLast(".")
)

fun Type.isCompatibleList(): Boolean = isSubtypeOf(VariantArray::class.java)

fun Type.isDictionary(): Boolean = isSubtypeOf(Dictionary::class.java)

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

fun Type.isEnum(): Boolean = kind == TypeKind.ENUM

fun Type.isRefCounted(): Boolean =
    hasGodotAncestor(requireNotNull(RefCounted::class.qualifiedName))

fun Type.isResource(): Boolean =
    hasGodotAncestor(requireNotNull(Resource::class.qualifiedName))

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
