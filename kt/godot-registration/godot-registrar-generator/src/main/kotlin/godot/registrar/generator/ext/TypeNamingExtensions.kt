package godot.registrar.generator.ext

import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.core.*
import godot.registrar.generator.GeneratorContext
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import godot.tools.common.constants.*

/** Maps a model [Type] to the Godot class name used in generated registration code. */
fun Type?.toGodotClassName(
    context: GeneratorContext,
): String = when {
    this == null || fqName == Unit::class.qualifiedName || fqName == Any::class.qualifiedName -> ""
    kind == TypeKind.ENUM -> fqName.substringAfterLast(".")
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
    else -> registeredOrBaseGodotClassName(context)
}

private fun Type.registeredOrBaseGodotClassName(context: GeneratorContext): String {
    val baseGodotType = baseGodotType()
    if (baseGodotType != null) {
        return context.registeredClassesByFqName[fqName]?.getRegisteredName(context.settings)
            ?: baseGodotType.fqName.substringAfterLast(".")
    }

    return fqName.substringAfterLast(".")
        .ifEmpty { GODOT_NIL }
        .let { if (it == "Object") GODOT_OBJECT else it }
}
