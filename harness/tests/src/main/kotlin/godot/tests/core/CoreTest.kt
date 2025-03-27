package godot.tests.core

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.api.Node
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
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
import godot.core.Plane
import godot.core.Projection
import godot.core.Quaternion
import godot.core.RID
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.StringName
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3
import godot.core.Vector3i
import godot.core.Vector4
import godot.core.Vector4i
import godot.core.variantArrayOf

@RegisterClass
class CoreTest : Node() {
    private val shortStringValue = "short core string"
    private val longStringValue =
        "This is a deliberately long core string used for transport verification. " +
            "It includes enough text to cross the tiny-value case and make sure the buffer " +
            "still preserves longer payloads without trimming, reordering, or accidental reuse."
    private val vector2Value = Vector2(1.25, 2.5)
    private val vector2iValue = Vector2i(11, 22)
    private val rect2Value = Rect2(1.5, 2.5, 3.5, 4.5)
    private val rect2iValue = Rect2i(3, 4, 5, 6)
    private val vector3Value = Vector3(1.25, 2.5, 3.75)
    private val vector3iValue = Vector3i(7, 8, 9)
    private val transform2DValue = Transform2D(1, 2, 3, 4, 5, 6)
    private val vector4Value = Vector4(1.25, 2.5, 3.75, 4.125)
    private val vector4iValue = Vector4i(10, 11, 12, 13)
    private val planeValue = Plane(1.5, 2.5, 3.5, 4.5)
    private val quaternionValue = Quaternion(0.5, 1.5, 2.5, 3.5)
    private val aabbValue = AABB(Vector3(1, 2, 3), Vector3(4, 5, 6))
    private val basisValue = Basis(Vector3(1, 2, 3), Vector3(4, 5, 6), Vector3(7, 8, 9))
    private val transform3DValue =
        Transform3D(Vector3(1, 2, 3), Vector3(4, 5, 6), Vector3(7, 8, 9), Vector3(10, 11, 12))
    private val projectionValue = Projection.createPerspective(75.0, 1.6, 0.2, 250.0)
    private val colorValue = Color(0.11, 0.22, 0.33, 0.44)
    private val stringNameValue = StringName("core_test_string_name")
    private val nodePathValue = NodePath("Root/Branch:leaf")
    private val ridValue = RID()
    private val packedByteArrayValue = PackedByteArray(byteArrayOf(1, 3, 5, 7))
    private val packedInt32ArrayValue = PackedInt32Array(intArrayOf(11, 22, 33))
    private val packedInt64ArrayValue = PackedInt64Array(longArrayOf(101L, 202L, 303L))
    private val packedFloat32ArrayValue = PackedFloat32Array(floatArrayOf(1.25f, 2.5f, 3.75f))
    private val packedFloat64ArrayValue = PackedFloat64Array(doubleArrayOf(1.125, 2.25, 3.375))
    private val packedStringArrayValue = PackedStringArray(variantArrayOf("alpha", "beta", "gamma"))
    private val packedVector2ArrayValue = PackedVector2Array(listOf(Vector2(1, 2), Vector2(3, 4)))
    private val packedVector3ArrayValue = PackedVector3Array(listOf(Vector3(1, 2, 3), Vector3(4, 5, 6)))
    private val packedColorArrayValue = PackedColorArray(listOf(Color(0.1, 0.2, 0.3, 0.4), Color(0.5, 0.6, 0.7, 0.8)))

    @RegisterFunction
    fun readVector2() = vector2Value

    @RegisterFunction
    fun echoVector2(value: Vector2) = value

    @RegisterFunction
    fun readShortString() = shortStringValue

    @RegisterFunction
    fun echoShortString(value: String) = value

    @RegisterFunction
    fun readLongString() = longStringValue

    @RegisterFunction
    fun echoLongString(value: String) = value

    @RegisterFunction
    fun readVector2i() = vector2iValue

    @RegisterFunction
    fun echoVector2i(value: Vector2i) = value

    @RegisterFunction
    fun readRect2() = rect2Value

    @RegisterFunction
    fun echoRect2(value: Rect2) = value

    @RegisterFunction
    fun readRect2i() = rect2iValue

    @RegisterFunction
    fun echoRect2i(value: Rect2i) = value

    @RegisterFunction
    fun readVector3() = vector3Value

    @RegisterFunction
    fun echoVector3(value: Vector3) = value

    @RegisterFunction
    fun readVector3i() = vector3iValue

    @RegisterFunction
    fun echoVector3i(value: Vector3i) = value

    @RegisterFunction
    fun readTransform2D() = transform2DValue

    @RegisterFunction
    fun echoTransform2D(value: Transform2D) = value

    @RegisterFunction
    fun readVector4() = vector4Value

    @RegisterFunction
    fun echoVector4(value: Vector4) = value

    @RegisterFunction
    fun readVector4i() = vector4iValue

    @RegisterFunction
    fun echoVector4i(value: Vector4i) = value

    @RegisterFunction
    fun readPlane() = planeValue

    @RegisterFunction
    fun echoPlane(value: Plane) = value

    @RegisterFunction
    fun readQuaternion() = quaternionValue

    @RegisterFunction
    fun echoQuaternion(value: Quaternion) = value

    @RegisterFunction
    fun readAabb() = aabbValue

    @RegisterFunction
    fun echoAabb(value: AABB) = value

    @RegisterFunction
    fun readBasis() = basisValue

    @RegisterFunction
    fun echoBasis(value: Basis) = value

    @RegisterFunction
    fun readTransform3D() = transform3DValue

    @RegisterFunction
    fun echoTransform3D(value: Transform3D) = value

    @RegisterFunction
    fun readProjection() = projectionValue

    @RegisterFunction
    fun echoProjection(value: Projection) = value

    @RegisterFunction
    fun readColor() = colorValue

    @RegisterFunction
    fun echoColor(value: Color) = value

    @RegisterFunction
    fun readStringName() = stringNameValue

    @RegisterFunction
    fun echoStringName(value: StringName) = value

    @RegisterFunction
    fun readNodePath() = nodePathValue

    @RegisterFunction
    fun echoNodePath(value: NodePath) = value

    @RegisterFunction
    fun readRid() = ridValue

    @RegisterFunction
    fun echoRid(value: RID) = value

    @RegisterFunction
    fun readPackedByteArray() = packedByteArrayValue

    @RegisterFunction
    fun echoPackedByteArray(value: PackedByteArray) = value

    @RegisterFunction
    fun readPackedInt32Array() = packedInt32ArrayValue

    @RegisterFunction
    fun echoPackedInt32Array(value: PackedInt32Array) = value

    @RegisterFunction
    fun readPackedInt64Array() = packedInt64ArrayValue

    @RegisterFunction
    fun echoPackedInt64Array(value: PackedInt64Array) = value

    @RegisterFunction
    fun readPackedFloat32Array() = packedFloat32ArrayValue

    @RegisterFunction
    fun echoPackedFloat32Array(value: PackedFloat32Array) = value

    @RegisterFunction
    fun readPackedFloat64Array() = packedFloat64ArrayValue

    @RegisterFunction
    fun echoPackedFloat64Array(value: PackedFloat64Array) = value

    @RegisterFunction
    fun readPackedStringArray() = packedStringArrayValue

    @RegisterFunction
    fun echoPackedStringArray(value: PackedStringArray) = value

    @RegisterFunction
    fun readPackedVector2Array() = packedVector2ArrayValue

    @RegisterFunction
    fun echoPackedVector2Array(value: PackedVector2Array) = value

    @RegisterFunction
    fun readPackedVector3Array() = packedVector3ArrayValue

    @RegisterFunction
    fun echoPackedVector3Array(value: PackedVector3Array) = value

    // PackedVector4Array is not covered yet here because this harness currently rejects it elsewhere and
    // I want this suite to stay build-stable until we confirm round-trip support separately.

    @RegisterFunction
    fun readPackedColorArray() = packedColorArrayValue

    @RegisterFunction
    fun echoPackedColorArray(value: PackedColorArray) = value
}
