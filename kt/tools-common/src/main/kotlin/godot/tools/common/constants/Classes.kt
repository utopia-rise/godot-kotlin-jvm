package godot.tools.common.constants

import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.STRING

object GodotKotlinJvmTypes {
    const val color = "Color"
    const val stringName = "StringName"
    const val array = "VariantArray"
    const val callable = "Callable"
    const val callableBase = "Callable"
    const val dictionary = "Dictionary"
    const val error = "Error"
    const val nodePath = "NodePath"
    const val variant = "Any"
    const val refCounted = "RefCounted"
    const val resource = "Resource"
    const val obj = "Object"
    const val signal = "Signal"
    const val variantType = "VariantType"

    const val ktObject = "KtObject"
    const val ktFunctionArgument = "KtFunctionArgument"
    const val ktRpcConfig = "KtRpcConfig"

    const val variantConverter = "VariantConverter"
    const val variantParser = "VariantParser"
    const val variantCaster = "VariantCaster"
    const val variantArray = "VariantArray"
    const val transferContext = "TransferContext"
    const val memoryManager = "MemoryManager"
    const val typeManager = "TypeManager"
    const val objectID = "ObjectID"

    const val classRegistry = "ClassRegistry"
    const val classRegistrar = "ClassRegistrar"
    const val entry = "Entry"
    const val context = "Context"

    const val naturalT = "NaturalT"
    const val realT = "RealT"

    const val transferMode = "TransferMode"
    const val rpcMode = "RpcMode"

    object Annotations {
        const val godotBaseType = "GodotBaseType"
        const val coreTypeHelper = "CoreTypeHelper"
        const val coreTypeLocalCopy = "CoreTypeLocalCopy"

        const val registerClass = "RegisterClass"
        const val registerConstructor = "RegisterConstructor"
        const val registerProperty = "RegisterProperty"
        const val registerFunction = "RegisterFunction"
        const val registerSignal = "RegisterSignal"

        const val tool = "Tool"
        const val export = "Export"
        const val rpc = "Rpc"

        const val range = "Range"
        const val intRange = "IntRange"
        const val longRange = "LongRange"
        const val floatRange = "FloatRange"
        const val doubleRange = "DoubleRange"
        const val expRange = "ExpRange"
        const val expEasing = "ExpEasing"
        const val enumTypeHint = "EnumTypeHint"
        const val enumFlag = "EnumFlag"
        const val intFlag = "IntFlag"
        const val file = "File"
        const val dir = "Dir"
        const val multilineText = "MultilineText"
        const val placeHolderText = "PlaceHolderText"
        const val colorNoAlpha = "ColorNoAlpha"
    }
}

object GodotTypes {
    const val bool = "bool"
    const val int = "int"
    const val float = "float"
    const val error = "enum::Error"
    const val typedArray = "typedarray"
    const val array = "Array"
    const val basis = "Basis"
    const val color = "Color"
    const val dictionary = "Dictionary"
    const val nodePath = "NodePath"
    const val godotObject = "Object"
    const val refCounted = "RefCounted"
    const val node = "Node"
    const val plane = "Plane"
    const val coreType = "CoreType"
    const val packedByteArray = "PackedByteArray"
    const val packedInt32Array = "PackedInt32Array"
    const val packedInt64Array = "PackedInt64Array"
    const val packedFloat32Array = "PackedFloat32Array"
    const val packedFloat64Array = "PackedFloat64Array"
    const val packedStringArray = "PackedStringArray"
    const val packedVector2Array = "PackedVector2Array"
    const val packedVector3Array = "PackedVector3Array"
    const val packedVector4Array = "PackedVector4Array"
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
    const val vector4 = "Vector4"
    const val vector4i = "Vector4i"
    const val projection = "Projection"
    const val lambdaCallable = "LambdaCallable"
    const val callable = "Callable"
    const val signal = "Signal"
    const val variant = "Variant"
    const val propertyHint = "PropertyHint"
    const val propertyUsage = "PropertyUsageFlags"
    const val rpcMode = "MultiplayerAPI.RPCMode"
    const val transferMode = "MultiplayerPeer.TransferMode"

    val coreTypes = listOf(
        typedArray,
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
        packedVector4Array,
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

    // We don't include RID because this core type can't be modified anyway and is a simple wrapper around Long.
    val localCopyCoreTypes = listOf(
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
        projection,
        packedByteArray,
        packedInt32Array,
        packedInt64Array,
        packedFloat32Array,
        packedFloat64Array,
        packedStringArray,
        packedVector2Array,
        packedVector3Array,
        packedVector3Array,
    )

    val indexedLocalCopyCoreTypes = listOf(
        packedByteArray,
        packedInt32Array,
        packedInt64Array,
        packedFloat32Array,
        packedFloat64Array,
        packedStringArray,
        packedVector2Array,
        packedVector3Array,
        packedVector4Array,
    )

    val localCopyCoreTypesMap = mapOf(
        packedByteArray to BYTE,
        packedInt32Array to INT,
        packedInt64Array to LONG,
        packedFloat32Array to FLOAT,
        packedFloat64Array to DOUBLE,
        packedStringArray to STRING,
        packedVector2Array to ClassName(godotCorePackage, vector2),
        packedVector3Array to ClassName(godotCorePackage, vector3),
        packedVector4Array to ClassName(godotCorePackage, vector4),
    )

    val primitives = listOf(
        bool,
        int,
        float,
        "", //void
        null //void
    )

    val notificationFunctions = listOf(
        "_ready",
        "_enterTree",
        "_exitTree",
        "_process",
        "_physicsProcess",
        "_input",
        "_unhandledInput",
        "_draw",
    )
}

val GODOT_ERROR = ClassName(godotCorePackage, GodotKotlinJvmTypes.error)
val GODOT_ARRAY = ClassName(godotCorePackage, GodotKotlinJvmTypes.array)
val GODOT_CALLABLE = ClassName(godotCorePackage, GodotKotlinJvmTypes.callable)
val GODOT_CALLABLE_BASE = ClassName(godotCorePackage, GodotKotlinJvmTypes.callableBase)
val GODOT_DICTIONARY = ClassName(godotCorePackage, GodotKotlinJvmTypes.dictionary)
val GODOT_OBJECT = ClassName(godotApiPackage, GodotKotlinJvmTypes.obj)
val KT_OBJECT = ClassName(godotCorePackage, GodotKotlinJvmTypes.ktObject)

val VARIANT_PARSER_NIL = ClassName(variantParserPackage, "NIL")
val VARIANT_PARSER_BOOL = ClassName(variantParserPackage, "BOOL")
val VARIANT_PARSER_LONG = ClassName(variantParserPackage, "LONG")
val VARIANT_PARSER_DOUBLE = ClassName(variantParserPackage, "DOUBLE")
val VARIANT_PARSER_NODE_PATH = ClassName(variantParserPackage, "NODE_PATH")
val VARIANT_PARSER_STRING_NAME = ClassName(variantParserPackage, "STRING_NAME")
val VARIANT_PARSER_STRING = ClassName(variantParserPackage, "STRING")
val VARIANT_PARSER__RID = ClassName(variantParserPackage, "_RID")
val VARIANT_PARSER_ARRAY = ClassName(variantParserPackage, "ARRAY")
val VARIANT_PARSER_AABB = ClassName(variantParserPackage, "AABB")
val VARIANT_PARSER_TRANSFORM2D = ClassName(variantParserPackage, "TRANSFORM2D")
val VARIANT_PARSER_TRANSFORM3D = ClassName(variantParserPackage, "TRANSFORM3D")
val VARIANT_PARSER_PACKED_BYTE_ARRAY = ClassName(variantParserPackage, "PACKED_BYTE_ARRAY")
val VARIANT_PARSER_PACKED_INT_32_ARRAY = ClassName(variantParserPackage, "PACKED_INT_32_ARRAY")
val VARIANT_PARSER_PACKED_INT_64_ARRAY = ClassName(variantParserPackage, "PACKED_INT_64_ARRAY")
val VARIANT_PARSER_PACKED_FLOAT_32_ARRAY = ClassName(variantParserPackage, "PACKED_FLOAT_32_ARRAY")
val VARIANT_PARSER_PACKED_FLOAT_64_ARRAY = ClassName(variantParserPackage, "PACKED_FLOAT_64_ARRAY")
val VARIANT_PARSER_PACKED_STRING_ARRAY = ClassName(variantParserPackage, "PACKED_STRING_ARRAY")
val VARIANT_PARSER_PACKED_VECTOR2_ARRAY = ClassName(variantParserPackage, "PACKED_VECTOR2_ARRAY")
val VARIANT_PARSER_PACKED_VECTOR3_ARRAY = ClassName(variantParserPackage, "PACKED_VECTOR3_ARRAY")
val VARIANT_PARSER_PACKED_VECTOR4_ARRAY = ClassName(variantParserPackage, "PACKED_VECTOR4_ARRAY")
val VARIANT_PARSER_PACKED_COLOR_ARRAY = ClassName(variantParserPackage, "PACKED_COLOR_ARRAY")
val VARIANT_PARSER_PACKED_CALLABLE = ClassName(variantParserPackage, "CALLABLE")
val VARIANT_PARSER_OBJECT = ClassName(variantParserPackage, "OBJECT")

val VARIANT_CASTER_BYTE = ClassName(variantCasterPackage, "BYTE")
val VARIANT_CASTER_INT = ClassName(variantCasterPackage, "INT")
val VARIANT_CASTER_FLOAT = ClassName(variantCasterPackage, "FLOAT")
val VARIANT_CASTER_ANY = ClassName(variantCasterPackage, "ANY")

val GODOT_BASE_TYPE = ClassName(godotAnnotationPackage, GodotKotlinJvmTypes.Annotations.godotBaseType)
val CORE_TYPE_HELPER = ClassName(godotAnnotationPackage, GodotKotlinJvmTypes.Annotations.coreTypeHelper)
val CORE_TYPE_LOCAL_COPY = ClassName(godotAnnotationPackage, GodotKotlinJvmTypes.Annotations.coreTypeLocalCopy)

val TRANSFER_CONTEXT = ClassName(godotMemoryPackage, GodotKotlinJvmTypes.transferContext)
val MEMORY_MANAGER = ClassName(godotMemoryPackage, GodotKotlinJvmTypes.memoryManager)
val TYPE_MANAGER = ClassName(godotReflectionPackage, GodotKotlinJvmTypes.typeManager)
val OBJECT_ID = ClassName(godotInteropPackage, GodotKotlinJvmTypes.objectID)
val VOID_PTR = ClassName(godotInteropPackage, "VoidPtr")
