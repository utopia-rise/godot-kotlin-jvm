package godot.codegen.constants

import com.squareup.kotlinpoet.ClassName

object KotlinTypes{
    const val color = "Color"
    const val stringName = "StringName"
    const val array = "VariantArray"
    const val callable = "Callable"
    const val dictionary = "Dictionary"
    const val error = "GodotError"
    const val nodePath = "NodePath"
    const val variant = "Any"
    const val refCounted = "RefCounted"
    const val obj = "Object"

    const val ktObject = "KtObject"

    const val variantType = "VariantType"
    const val transferContext = "TransferContext"
    const val typeManager = "TypeManager"
    const val objectID = "ObjectID"

    object Annotations {
        const val godotBaseType = "GodotBaseType"
        const val coreTypeHelper = "CoreTypeHelper"
    }
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
    val vector3 = CoreTypeTraits.VECTOR3.type!!
    const val vector3i = "Vector3i"
    const val vector4 = "Vector4"
    const val vector4i = "Vector4i"
    const val projection = "Projection"
    const val callable = "Callable"
    const val signal = "Signal"
    const val variant = "Variant"
    const val variantType = "enum::Variant.Type"

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
        vector4,
        vector4i,
        projection,
        callable,
        signal,
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
        vector3i,
        vector4,
        vector4i,
        projection
    )

    val primitives = listOf(
        bool,
        int,
        float,
        "", //void
        null //void
    )
}

val GODOT_ERROR = ClassName(godotCorePackage, KotlinTypes.error)
val GODOT_ARRAY = ClassName(godotCorePackage, KotlinTypes.array)
val GODOT_CALLABLE = ClassName(godotCorePackage, KotlinTypes.callable)
val GODOT_DICTIONARY = ClassName(godotCorePackage, KotlinTypes.dictionary)
val GODOT_OBJECT = ClassName(godotApiPackage, KotlinTypes.obj)
val KT_OBJECT = ClassName(godotCorePackage, KotlinTypes.ktObject)

val VARIANT_TYPE_NIL = ClassName(variantTypePackage, "NIL")
val VARIANT_TYPE_BOOL = ClassName(variantTypePackage, "BOOL")
val VARIANT_TYPE_LONG = ClassName(variantTypePackage, "LONG")
val VARIANT_TYPE_DOUBLE = ClassName(variantTypePackage, "DOUBLE")
val VARIANT_TYPE_NODE_PATH = ClassName(variantTypePackage, "NODE_PATH")
val VARIANT_TYPE_STRING_NAME = ClassName(variantTypePackage, "STRING_NAME")
val VARIANT_TYPE__RID = ClassName(variantTypePackage, "_RID")
val VARIANT_TYPE_ARRAY = ClassName(variantTypePackage, "ARRAY")
val VARIANT_TYPE_PACKED_BYTE_ARRAY = ClassName(variantTypePackage, "PACKED_BYTE_ARRAY")
val VARIANT_TYPE_PACKED_INT_32_ARRAY = ClassName(variantTypePackage, "PACKED_INT_32_ARRAY")
val VARIANT_TYPE_PACKED_INT_64_ARRAY = ClassName(variantTypePackage, "PACKED_INT_64_ARRAY")
val VARIANT_TYPE_PACKED_FLOAT_32_ARRAY = ClassName(variantTypePackage, "PACKED_FLOAT_32_ARRAY")
val VARIANT_TYPE_PACKED_FLOAT_64_ARRAY = ClassName(variantTypePackage, "PACKED_FLOAT_64_ARRAY")
val VARIANT_TYPE_PACKED_STRING_ARRAY = ClassName(variantTypePackage, "PACKED_STRING_ARRAY")
val VARIANT_TYPE_PACKED_VECTOR2_ARRAY = ClassName(variantTypePackage, "PACKED_VECTOR2_ARRAY")
val VARIANT_TYPE_PACKED_VECTOR3_ARRAY = ClassName(variantTypePackage, "PACKED_VECTOR3_ARRAY")
val VARIANT_TYPE_PACKED_COLOR_ARRAY = ClassName(variantTypePackage, "PACKED_COLOR_ARRAY")
val VARIANT_TYPE_OBJECT = ClassName(variantTypePackage, "OBJECT")
val VARIANT_TYPE_JVM_INT = ClassName(variantTypePackage, "JVM_INT")
val VARIANT_TYPE_ANY = ClassName(variantTypePackage, "ANY")

val GODOT_BASE_TYPE = ClassName(godotAnnotationPackage, KotlinTypes.Annotations.godotBaseType)
val CORE_TYPE_HELPER = ClassName(godotAnnotationPackage, KotlinTypes.Annotations.coreTypeHelper)

val TRANSFER_CONTEXT = ClassName(godotMemoryPackage, KotlinTypes.transferContext)
val TYPE_MANAGER = ClassName(godotCorePackage, KotlinTypes.typeManager)
val OBJECT_ID = ClassName(godotCorePackage, KotlinTypes.objectID)
