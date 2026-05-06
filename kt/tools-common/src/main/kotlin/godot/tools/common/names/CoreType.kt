@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.STRING

object CoreType {
    const val boolIdentifier = "bool"
    const val intIdentifier = "int"
    const val floatIdentifier = "float"
    const val typedArrayIdentifier = "typedarray"
    const val arrayIdentifier = "Array"
    const val variantIdentifier = "Variant"
    const val coreTypeIdentifier = "CoreType"

    @Suppress("NOTHING_TO_INLINE")
    private inline fun coreName(simpleName: String) = ClassName(godotCorePackage, simpleName)

    val color = coreName("Color")
    val coreType = coreName("CoreType")
    val stringName = coreName("StringName")
    val variantArray = coreName("VariantArray")
    val callable = coreName("Callable")
    val methodCallable = coreName("MethodCallable")
    val lambdaCallable = coreName("LambdaCallable")
    val lambdaContainer = coreName("LambdaContainer")
    val dictionary = coreName("Dictionary")
    val godotEnum = coreName("GodotEnum")
    val error = coreName("Error")
    val nodePath = coreName("NodePath")
    val signal = coreName("Signal")
    val variantType = coreName("VariantType")
    val ktObject = coreName("KtObject")
    val ktRpcConfig = coreName("KtRpcConfig")
    val basis = coreName("Basis")
    val plane = coreName("Plane")
    val packedByteArray = coreName("PackedByteArray")
    val packedInt32Array = coreName("PackedInt32Array")
    val packedInt64Array = coreName("PackedInt64Array")
    val packedFloat32Array = coreName("PackedFloat32Array")
    val packedFloat64Array = coreName("PackedFloat64Array")
    val packedStringArray = coreName("PackedStringArray")
    val packedVector2Array = coreName("PackedVector2Array")
    val packedVector3Array = coreName("PackedVector3Array")
    val packedVector4Array = coreName("PackedVector4Array")
    val packedColorArray = coreName("PackedColorArray")
    val quaternion = coreName("Quaternion")
    val rect2 = coreName("Rect2")
    val rect2i = coreName("Rect2i")
    val aabb = coreName("AABB")
    val rid = coreName("RID")
    val string = coreName("String")
    val transform3D = coreName("Transform3D")
    val transform2D = coreName("Transform2D")
    val vector2 = coreName("Vector2")
    val vector2i = coreName("Vector2i")
    val vector3 = coreName("Vector3")
    val vector3i = coreName("Vector3i")
    val vector4 = coreName("Vector4")
    val vector4i = coreName("Vector4i")
    val projection = coreName("Projection")
    val propertyHint = coreName("PropertyHint")
    val propertyUsageFlags = coreName("PropertyUsageFlags")
    val invalidJvmLambdaException = coreName("InvalidJvmLambdaException")
    val ktConstructor = coreName("KtConstructor")
    val signalConnector = ClassName(godotExtensionPackage, "SignalConnector")

    fun callable(argCount: Int) = callable.sibling("${callable.simpleName}$argCount")

    fun methodCallable(argCount: Int) = methodCallable.sibling("${methodCallable.simpleName}$argCount")

    fun lambdaCallable(argCount: Int) = lambdaCallable.sibling("${lambdaCallable.simpleName}$argCount")

    fun lambdaContainer(argCount: Int) = lambdaContainer.sibling("${lambdaContainer.simpleName}$argCount")

    fun signal(argCount: Int) = signal.sibling("${signal.simpleName}$argCount")

    fun propertyHint(simpleName: String) = propertyHint.member(simpleName)

    fun propertyUsage(simpleName: String) = propertyUsageFlags.member(simpleName)

    fun isCoreTypeIdentifier(identifier: String) = coreTypeIdentifiers.contains(identifier)

    fun isLocalCopyCoreTypeIdentifier(identifier: String) = localCopyCoreTypeIdentifiers.contains(identifier)

    fun isLocalIndexedCopyCoreTypeIdentifier(identifier: String) = indexedLocalCopyCoreTypeIdentifiers.contains(identifier)

    val coreTypes = listOf(
        variantArray,
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
    )

    val coreTypeIdentifiers = listOf(
        typedArrayIdentifier,
        arrayIdentifier,
        *coreTypes.map { it.simpleName }.toTypedArray(),
        variantIdentifier,
    )

    val localCopyCoreTypeIdentifiers = listOf(
        aabb.simpleName,
        basis.simpleName,
        color.simpleName,
        plane.simpleName,
        quaternion.simpleName,
        rect2.simpleName,
        rect2i.simpleName,
        transform2D.simpleName,
        transform3D.simpleName,
        vector2.simpleName,
        vector2i.simpleName,
        vector3.simpleName,
        vector3i.simpleName,
        vector4.simpleName,
        vector4i.simpleName,
        projection.simpleName,
        packedByteArray.simpleName,
        packedInt32Array.simpleName,
        packedInt64Array.simpleName,
        packedFloat32Array.simpleName,
        packedFloat64Array.simpleName,
        packedStringArray.simpleName,
        packedVector2Array.simpleName,
        packedVector3Array.simpleName,
        packedVector3Array.simpleName,
    )

    val indexedLocalCopyCoreTypeIdentifiers = listOf(
        packedByteArray.simpleName,
        packedInt32Array.simpleName,
        packedInt64Array.simpleName,
        packedFloat32Array.simpleName,
        packedFloat64Array.simpleName,
        packedStringArray.simpleName,
        packedVector2Array.simpleName,
        packedVector3Array.simpleName,
        packedVector4Array.simpleName,
    )

    val indexedLocalCopyCoreTypeElementMap = mapOf(
        packedByteArray.simpleName to BYTE,
        packedInt32Array.simpleName to INT,
        packedInt64Array.simpleName to LONG,
        packedFloat32Array.simpleName to FLOAT,
        packedFloat64Array.simpleName to DOUBLE,
        packedStringArray.simpleName to STRING,
        packedVector2Array.simpleName to vector2,
        packedVector3Array.simpleName to vector3,
        packedVector4Array.simpleName to vector4,
    )

    val primitiveIdentifiers = listOf(
        boolIdentifier,
        intIdentifier,
        floatIdentifier,
        "",
        null,
    )
}
