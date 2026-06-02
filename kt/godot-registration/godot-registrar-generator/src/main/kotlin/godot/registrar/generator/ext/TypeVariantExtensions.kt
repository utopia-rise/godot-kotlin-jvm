package godot.registrar.generator.ext

import godot.api.Object
import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.core.AABB
import godot.core.Basis
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
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
import godot.registration.model.types.Type
import godot.tools.common.constants.godotCorePackage

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
