@file:Suppress("unused")

package godot.codegen.constants

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName
import godot.common.interop.VariantConverter
import godot.tools.common.constants.godotAnnotationPackage
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotCoroutinePackage
import godot.tools.common.constants.godotExtensionPackage
import godot.tools.common.constants.godotInteropPackage
import godot.tools.common.constants.godotMemoryPackage
import godot.tools.common.constants.godotReflectionPackage
import godot.tools.common.constants.kotlinCollectionsPackage
import godot.tools.common.constants.kotlinCoroutinePackage
import godot.tools.common.constants.kotlinReflectPackage
import godot.tools.common.constants.kotlinTextPackage
import godot.tools.common.constants.kotlinxCoroutinePackage
import godot.tools.common.constants.variantCaster
import godot.tools.common.constants.variantParser
import java.util.*


object API {
    val ktObject = ClassName(godotCorePackage, "KtObject")
    val `object` = ClassName(godotApiPackage, "Object")
    val refCounted = ClassName(godotApiPackage, "RefCounted")
    val resource = ClassName(godotApiPackage, "Resource")
    val node = ClassName(godotApiPackage, "Node")

    val connectFlags = ClassName(godotApiPackage, "Object", "ConnectFlags")
    val rpcMode = ClassName(godotApiPackage, "MultiplayerAPI", "RPCMode")
    val transferMode = ClassName(godotApiPackage, "MultiplayerPeer", "TransferMode")
    val rpcModeDisabled = MemberName(ClassName(godotApiPackage, "MultiplayerAPI"), "DISABLED")
    val transferModeUnreliableOrdered = MemberName(ClassName(godotApiPackage, "MultiplayerPeer", "TransferMode"), "UNRELIABLE_ORDERED")

    const val methodBindingsInnerClassName = "MethodBindings"
}


object Core {
    val string = ClassName(godotCorePackage, "String")
    val vector2 = ClassName(godotCorePackage, "Vector2")
    val vector2i = ClassName(godotCorePackage, "Vector2i")
    val rect2 = ClassName(godotCorePackage, "Rect2")
    val rect2i = ClassName(godotCorePackage, "Rect2i")
    val vector3 = ClassName(godotCorePackage, "Vector3")
    val vector3i = ClassName(godotCorePackage, "Vector3i")
    val transform2D = ClassName(godotCorePackage, "Transform2D")
    val vector4 = ClassName(godotCorePackage, "Vector4")
    val vector4i = ClassName(godotCorePackage, "Vector4i")
    val plane = ClassName(godotCorePackage, "Plane")
    val quaternion = ClassName(godotCorePackage, "Quaternion")
    val aabb = ClassName(godotCorePackage, "AABB")
    val basis = ClassName(godotCorePackage, "Basis")
    val transform3D = ClassName(godotCorePackage, "Transform3D")
    val projection = ClassName(godotCorePackage, "Projection")
    val color = ClassName(godotCorePackage, "Color")
    val stringName = ClassName(godotCorePackage, "StringName")
    val nodePath = ClassName(godotCorePackage, "NodePath")
    val rid = ClassName(godotCorePackage, "RID")
    val callable = ClassName(godotCorePackage, "Callable")
    val signal = ClassName(godotCorePackage, "Signal")
    val dictionary = ClassName(godotCorePackage, "Dictionary")
    val variantArray = ClassName(godotCorePackage, "VariantArray")
    val packedByteArray = ClassName(godotCorePackage, "PackedByteArray")
    val packedInt32Array = ClassName(godotCorePackage, "PackedInt32Array")
    val packedInt64Array = ClassName(godotCorePackage, "PackedInt64Array")
    val packedFloat32Array = ClassName(godotCorePackage, "PackedFloat32Array")
    val packedFloat64Array = ClassName(godotCorePackage, "PackedFloat64Array")
    val packedStringArray = ClassName(godotCorePackage, "PackedStringArray")
    val packedVector2Array = ClassName(godotCorePackage, "PackedVector2Array")
    val packedVector3Array = ClassName(godotCorePackage, "PackedVector3Array")
    val packedColorArray = ClassName(godotCorePackage, "PackedColorArray")
    val packedVector4Array = ClassName(godotCorePackage, "PackedVector4Array")

    val coreType = ClassName(godotCorePackage, "CoreType")
    val methodCallable = ClassName(godotCorePackage, "MethodCallable")
    val lambdaCallable = ClassName(godotCorePackage, "LambdaCallable")
    val lambdaContainer = ClassName(godotCorePackage, "LambdaContainer")
    val godotEnum = ClassName(godotCorePackage, "GodotEnum")
    val error = ClassName(godotCorePackage, "Error")
    val variantType = ClassName(godotCorePackage, "VariantType")
    val ktRpcConfig = ClassName(godotCorePackage, "KtRpcConfig")
    val signalConnector = ClassName(godotExtensionPackage, "SignalConnector")

    fun callable(argCount: Int) = ClassName(godotCorePackage, "Callable$argCount")
    fun methodCallable(argCount: Int) = ClassName(godotCorePackage, "MethodCallable$argCount")
    fun lambdaCallable(argCount: Int) = ClassName(godotCorePackage, "LambdaCallable$argCount")
    fun lambdaContainer(argCount: Int) = ClassName(godotCorePackage, "LambdaContainer$argCount")
    fun signal(argCount: Int) = ClassName(godotCorePackage, "Signal$argCount")
    fun signalArguments(argCount: Int) = ClassName(godotCoroutinePackage, "SignalArguments$argCount")

    val invalidJvmLambdaException = ClassName(godotCorePackage, "InvalidJvmLambdaException")
}

object Annotations {
    val GODOT_BASE_TYPE = ClassName(godotAnnotationPackage, "GodotBaseType")
    val CORE_TYPE_HELPER = ClassName(godotAnnotationPackage, "CoreTypeHelper")
    val CORE_TYPE_LOCAL_COPY = ClassName(godotAnnotationPackage, "CoreTypeLocalCopy")
}

object VariantConverter {
    val BASE = VariantConverter::class.asClassName()
    val PARSER = ClassName(godotCorePackage, variantParser)
    val CASTER = ClassName(godotCorePackage, variantCaster)

    val NIL = MemberName(PARSER.canonicalName, "NIL")
    val BOOL = MemberName(PARSER.canonicalName, "BOOL")
    val LONG = MemberName(PARSER.canonicalName, "LONG")
    val DOUBLE = MemberName(PARSER.canonicalName, "DOUBLE")
    val NODE_PATH = MemberName(PARSER.canonicalName, "NODE_PATH")
    val STRING_NAME = MemberName(PARSER.canonicalName, "STRING_NAME")
    val STRING = MemberName(PARSER.canonicalName, "STRING")
    val RID = MemberName(PARSER.canonicalName, "_RID")
    val ARRAY = MemberName(PARSER.canonicalName, "ARRAY")
    val AABB = MemberName(PARSER.canonicalName, "AABB")
    val TRANSFORM2D = MemberName(PARSER.canonicalName, "TRANSFORM2D")
    val TRANSFORM3D = MemberName(PARSER.canonicalName, "TRANSFORM3D")
    val PACKED_BYTE_ARRAY = MemberName(PARSER.canonicalName, "PACKED_BYTE_ARRAY")
    val PACKED_INT_32_ARRAY = MemberName(PARSER.canonicalName, "PACKED_INT_32_ARRAY")
    val PACKED_INT_64_ARRAY = MemberName(PARSER.canonicalName, "PACKED_INT_64_ARRAY")
    val PACKED_FLOAT_32_ARRAY = MemberName(PARSER.canonicalName, "PACKED_FLOAT_32_ARRAY")
    val PACKED_FLOAT_64_ARRAY = MemberName(PARSER.canonicalName, "PACKED_FLOAT_64_ARRAY")
    val PACKED_STRING_ARRAY = MemberName(PARSER.canonicalName, "PACKED_STRING_ARRAY")
    val PACKED_VECTOR2_ARRAY = MemberName(PARSER.canonicalName, "PACKED_VECTOR2_ARRAY")
    val PACKED_VECTOR3_ARRAY = MemberName(PARSER.canonicalName, "PACKED_VECTOR3_ARRAY")
    val PACKED_VECTOR4_ARRAY = MemberName(PARSER.canonicalName, "PACKED_VECTOR4_ARRAY")
    val PACKED_COLOR_ARRAY = MemberName(PARSER.canonicalName, "PACKED_COLOR_ARRAY")
    val PACKED_CALLABLE = MemberName(PARSER.canonicalName, "CALLABLE")
    val OBJECT = MemberName(PARSER.canonicalName, "OBJECT")

    val BYTE = MemberName(CASTER.canonicalName, "BYTE")
    val INT = MemberName(CASTER.canonicalName, "INT")
    val FLOAT = MemberName(CASTER.canonicalName, "FLOAT")
    val ANY = MemberName(CASTER.canonicalName, "ANY")
    val ENUM = MemberName(CASTER.canonicalName, "ENUM")

    val MAPPER = MemberName(godotCorePackage, "variantMapper")

    fun parse(name: String) = MemberName(PARSER.canonicalName, name.uppercase(Locale.US))
}

object Coroutines {
    val await = ClassName(godotCoroutinePackage, "Await")
    val promise = MemberName(godotExtensionPackage, "promise")
    val resume = MemberName(kotlinCoroutinePackage, "resume")
    val suspendCancellableCoroutine = MemberName(kotlinxCoroutinePackage, "suspendCancellableCoroutine")
    val cancellableContinuation = ClassName(kotlinxCoroutinePackage, "CancellableContinuation")
    const val cancel = "cancel"
}


object Internal {
    val transferContext = ClassName(godotMemoryPackage, "TransferContext")
    val memoryManager = ClassName(godotMemoryPackage, "MemoryManager")
    val typeManager = ClassName(godotReflectionPackage, "TypeManager")
    val objectId = ClassName(godotInteropPackage, "ObjectID")
    val voidPtr = ClassName(godotInteropPackage, "VoidPtr")
}


object Kotlin {
    val listOf = MemberName(kotlinCollectionsPackage, "listOf")
    val trimIndent = MemberName(kotlinTextPackage, "trimIndent")

    fun kFunction(argCount: Int) = ClassName(kotlinReflectPackage, "KFunction$argCount")
}


object Utils {
    val toGodotName = MemberName(godotCorePackage, "toGodotName")
    val variantArrayOf = MemberName(godotCorePackage, "variantArrayOf")
    val variantMapper = MemberName(godotCorePackage, "variantMapper")
    val asCallable = MemberName(godotCorePackage, "asCallable")
    val asCachedStringName = MemberName(godotCorePackage, "asCachedStringName")
    val asCachedNodePath = MemberName(godotCorePackage, "asCachedNodePath")
    val promise = MemberName(godotExtensionPackage, "promise")
}
