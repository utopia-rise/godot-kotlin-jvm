package godot.codegen.constants

data class TypeIdentifier(
    val name: String,
    val isPrimitive: Boolean = false,
    val isLocalCopy: Boolean = true,
    val isIndexCopy: Boolean = false,
) {

    companion object {
        val BOOL = TypeIdentifier("bool", isPrimitive = true, isLocalCopy = false)
        val INT = TypeIdentifier("int", isPrimitive = true, isLocalCopy = false)
        val FLOAT = TypeIdentifier("float", isPrimitive = true, isLocalCopy = false)
        val STRING = TypeIdentifier("String", isPrimitive = false, isLocalCopy = false)
        val TYPED_ARRAY = TypeIdentifier("typedarray", isLocalCopy = false)
        val ARRAY = TypeIdentifier("Array", isLocalCopy = false)
        val BASIS = TypeIdentifier("Basis")
        val COLOR = TypeIdentifier("Color")
        val DICTIONARY = TypeIdentifier("Dictionary", isLocalCopy = false)
        val NODE_PATH = TypeIdentifier("NodePath", isLocalCopy = false)
        val PLANE = TypeIdentifier("Plane")
        val PACKED_BYTE_ARRAY = TypeIdentifier("PackedByteArray", isIndexCopy = true)
        val PACKED_INT32_ARRAY = TypeIdentifier("PackedInt32Array", isIndexCopy = true)
        val PACKED_INT64_ARRAY = TypeIdentifier("PackedInt64Array", isIndexCopy = true)
        val PACKED_FLOAT32_ARRAY = TypeIdentifier("PackedFloat32Array", isIndexCopy = true)
        val PACKED_FLOAT64_ARRAY = TypeIdentifier("PackedFloat64Array", isIndexCopy = true)
        val PACKED_STRING_ARRAY = TypeIdentifier("PackedStringArray", isIndexCopy = true)
        val PACKED_VECTOR2_ARRAY = TypeIdentifier("PackedVector2Array", isIndexCopy = true)
        val PACKED_VECTOR3_ARRAY = TypeIdentifier("PackedVector3Array", isIndexCopy = true)
        val PACKED_VECTOR4_ARRAY = TypeIdentifier("PackedVector4Array", isIndexCopy = true)
        val PACKED_COLOR_ARRAY = TypeIdentifier("PackedColorArray", isLocalCopy = false)
        val QUATERNION = TypeIdentifier("Quaternion")
        val RECT2 = TypeIdentifier("Rect2")
        val RECT2I = TypeIdentifier("Rect2i")
        val AABB = TypeIdentifier("AABB")
        val RID = TypeIdentifier("RID", isLocalCopy = false)
        val STRING_NAME = TypeIdentifier("StringName", isLocalCopy = false)
        val TRANSFORM3D = TypeIdentifier("Transform3D")
        val TRANSFORM2D = TypeIdentifier("Transform2D")
        val VECTOR2 = TypeIdentifier("Vector2")
        val VECTOR2I = TypeIdentifier("Vector2i")
        val VECTOR3 = TypeIdentifier("Vector3")
        val VECTOR3I = TypeIdentifier("Vector3i")
        val VECTOR4 = TypeIdentifier("Vector4")
        val VECTOR4I = TypeIdentifier("Vector4i")
        val PROJECTION = TypeIdentifier("Projection")
        val CALLABLE = TypeIdentifier("Callable", isLocalCopy = false)
        val SIGNAL = TypeIdentifier("Signal", isLocalCopy = false)


        val OBJECT = TypeIdentifier("Variant", isLocalCopy = false, isIndexCopy = false, isPrimitive = false)
        val VARIANT = TypeIdentifier("Variant", isLocalCopy = false, isIndexCopy = false, isPrimitive = false)

        val all = listOf(
            BOOL,
            INT,
            FLOAT,
            STRING,
            VECTOR2,
            VECTOR2I,
            RECT2,
            RECT2I,
            VECTOR3,
            VECTOR3I,
            TRANSFORM2D,
            VECTOR4,
            VECTOR4I,
            PLANE,
            QUATERNION,
            AABB,
            BASIS,
            TRANSFORM3D,
            PROJECTION,
            COLOR,
            STRING_NAME,
            NODE_PATH,
            RID,
            // OBJECT  Not a core type
            CALLABLE,
            SIGNAL,
            DICTIONARY,
            ARRAY,
            PACKED_BYTE_ARRAY,
            PACKED_INT32_ARRAY,
            PACKED_INT64_ARRAY,
            PACKED_FLOAT32_ARRAY,
            PACKED_FLOAT64_ARRAY,
            PACKED_STRING_ARRAY,
            PACKED_VECTOR2_ARRAY,
            PACKED_VECTOR3_ARRAY,
            PACKED_COLOR_ARRAY,
            PACKED_VECTOR4_ARRAY,
        )

        val localCopyCoreTypesMap = mapOf(
            PACKED_BYTE_ARRAY.name to com.squareup.kotlinpoet.BYTE,
            PACKED_INT32_ARRAY.name to com.squareup.kotlinpoet.INT,
            PACKED_INT64_ARRAY.name to com.squareup.kotlinpoet.LONG,
            PACKED_FLOAT32_ARRAY.name to com.squareup.kotlinpoet.FLOAT,
            PACKED_FLOAT64_ARRAY.name to com.squareup.kotlinpoet.DOUBLE,
            PACKED_STRING_ARRAY.name to com.squareup.kotlinpoet.STRING,
            PACKED_VECTOR2_ARRAY.name to Core.vector2,
            PACKED_VECTOR3_ARRAY.name to Core.vector3,
            PACKED_VECTOR4_ARRAY.name to Core.vector4,
        )

        val primitives = all.filter { it.isPrimitive }.map { it.name }
        val core = all.filterNot { it.isPrimitive }.map { it.name }
        val localCopies = all.filter { it.isLocalCopy }.map { it.name }
        val indexedLocalCopies = all.filter { it.isIndexCopy }.map { it.name }
    }
}
