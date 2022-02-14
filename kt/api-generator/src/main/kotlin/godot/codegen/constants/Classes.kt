package godot.codegen.constants

import com.squareup.kotlinpoet.ClassName

object KotlinTypes{
    const val color = "Color"
    const val array = "VariantArray"
    const val dictionary = "Dictionary"
    const val error = "GodotError"
    const val nodePath = "NodePath"
    const val variant = "Any"
    const val obj = "Object"

    const val variantType = "VariantType"
    const val transferContext = "TransferContext"
    const val typeManager = "TypeManager"
}

object GodotTypes {
    const val bool = "bool"
    const val int = "int"
    const val float = "float"
    const val error = "enum::Error"
    const val array = "Array"
    const val basis = "Basis"
    const val color = "Color"
    const val dictionary = "Dictionary"
    const val nodePath = "NodePath"
    const val plane = "Plane"
    const val packedByteArray = "PackedByteArray"
    const val packedInt32Array = "PackedInt32Array"
    const val packedInt64Array = "PackedInt64Array"
    const val packedFloat32Array = "PackedFloat32Array"
    const val packedFloat64Array = "PackedFloat64Array"
    const val packedStringArray = "PackedStringArray"
    const val packedVector2Array = "PackedVector2Array"
    const val packedVector3Array = "PackedVector3Array"
    const val packedColorArray = "PackedColorArray"
    const val quaternion = "Quaternion"
    const val rect2 = "Rect2"
    const val rect2i = "Rect2i"
    const val aabb = "AABB"
    const val rid = "RID"
    const val string = "String"
    const val stringName = "StringName"
    const val transform3D = "Transform3D"
    const val transform2D = "Transform2D"
    const val vector2 = "Vector2"
    const val vector2i = "Vector2i"
    const val vector3 = "Vector3"
    const val vector3i = "Vector3i"
    const val variant = "Variant"

    val coreTypes = listOf(
        error,
        array,
        basis,
        color,
        dictionary,
        nodePath,
        plane,
        packedByteArray,
        packedInt32Array,
        packedInt64Array,
        packedFloat32Array,
        packedFloat64Array,
        packedStringArray,
        packedVector2Array,
        packedVector3Array,
        packedColorArray,
        quaternion,
        rect2,
        rect2i,
        aabb,
        rid,
        string,
        stringName,
        transform3D,
        transform2D,
        vector2,
        vector2i,
        vector3,
        vector3i,
        variant
    )

    val coreTypesReimplementedInKotlin = listOf(
        aabb,
        basis,
        color,
        plane,
        quaternion,
        rect2,
        rect2i,
        transform2D,
        transform3D,
        vector2,
        vector2i,
        vector3,
        vector3i
    )

    val primitives = listOf(
        bool,
        int,
        float,
        "", //void
        null //void
    )
}

val GODOT_OBJECT = ClassName(godotApiPackage, KotlinTypes.obj)