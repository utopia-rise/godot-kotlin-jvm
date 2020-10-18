package godot.core

import godot.util.toGodotReal
import godot.util.toRealT
import godot.wire.Wire

class KtVariant {
    var data: Wire.Value

    constructor(data: Wire.Value) {
        this.data = data
    }

    constructor(value: Int) : this(value.toLong())

    constructor(value: Long) {
        data = build { setLongValue(value) }
    }

    constructor(value: Float) : this(value.toDouble())

    constructor(value: Double) {
        data = build { setRealValue(value) }
    }

    constructor(value: String) {
        data = build { setStringValue(value) }
    }

    constructor(value: Boolean) {
        data = build { setBoolValue(value)}
    }

    constructor(value: Unit) {
        data = build { setNilValue(0) }
    }

    constructor(value: Vector2) {
        data = build {
            setVector2Value(value.toWireVector2())
        }
    }

    constructor(value: Rect2) {
        data = build {
            val rect2 = Wire.Rect2.newBuilder()
                    .setPosition(value.position.toWireVector2())
                    .setSize(value.size.toWireVector2())
                    .build()

            setRect2Value(rect2)
        }
    }

    constructor(value: Vector3) {
        data = build {
            setVector3Value(value.toWireVector3())
        }
    }

    constructor(value: Transform2D) {
        data = build {
            val transform2D = Wire.Transform2D.newBuilder()
                    .setX(value.x.toWireVector2())
                    .setY(value.y.toWireVector2())
                    .setOrigin(value.origin.toWireVector2())
                    .build()
            setTransform2DValue(transform2D)
        }
    }

    constructor(value: Plane) {
        data = build {
            val plane = Wire.Plane.newBuilder()
                    .setNormal(value.normal.toWireVector3())
                    .setD(value.d.toGodotReal())
                    .build()

            setPlaneValue(plane)
        }
    }

    constructor(value: Quat) {
        data = build {
            val quat = Wire.Quat.newBuilder()
                    .setX(value.x.toGodotReal())
                    .setY(value.y.toGodotReal())
                    .setZ(value.z.toGodotReal())
                    .setW(value.w.toGodotReal())
                    .build()

            setQuatValue(quat)
        }
    }

    constructor(value: AABB) {
        data = build {
            val aabb = Wire.AABB.newBuilder()
                    .setPosition(value.position.toWireVector3())
                    .setSize(value.size.toWireVector3())
                    .build()

            setAabbValue(aabb)
        }
    }

    constructor(value: Basis) {
        data = build {
            setBasisValue(value.toWireBasis())
        }
    }

    constructor(value: Transform) {
        data = build {
            val transform = Wire.Transform.newBuilder()
                    .setBasis(value.basis.toWireBasis())
                    .setOrigin(value.origin.toWireVector3())
                    .build()

            setTransformValue(transform)
        }
    }

    constructor(value: VariantArray) {
        data = build {
            setVariantArrayValue(Wire.VariantArray.newBuilder().build())
        }
    }

    constructor(value: KtObject) {
        data = build {
            val obj = Wire.Object.newBuilder()
                    .setPtr(value.rawPtr)
                    .setEngineConstructorIndex(0)
                    .build()

            setObjectValue(obj)
        }
    }

    fun asNil(): Unit {
        check(data.typeCase == Wire.Value.TypeCase.NIL_VALUE) {
            "Expecting a NIL but got ${data.typeCase}"
        }
        return Unit
    }

    fun asInt() = asLong().toInt()

    fun asLong(): Long {
        return data.longValue
    }

    fun asFloat() = asDouble().toFloat()

    fun asDouble(): Double {
        return data.realValue
    }

    fun asString(): String {
        return data.stringValue
    }

    fun asBoolean(): Boolean {
        return data.boolValue
    }

    fun asVector2(): Vector2 {
        val vec2 = data.vector2Value
        return Vector2(vec2.x, vec2.y)
    }

    fun asRect2(): Rect2 {
        val rect2 = data.rect2Value
        return Rect2(
                rect2.position.x.toRealT(),
                rect2.position.y.toRealT(),
                rect2.size.x.toRealT(),
                rect2.size.y.toRealT()
        )
    }

    fun asVector3(): Vector3 {
        val vec3 = data.vector3Value
        return Vector3(vec3.x, vec3.y, vec3.z)
    }

    fun asTransform2D(): Transform2D {
        val transform2D = data.transform2DValue
        val x = transform2D.x.toKVector2()
        val y = transform2D.y.toKVector2()
        val origin = transform2D.origin.toKVector2()
        return Transform2D(x, y, origin)
    }

    fun asPlane(): Plane {
        val plane = data.planeValue
        val normal = plane.normal.toKVector3()
        val d = plane.d.toRealT()
        return Plane(normal, d)
    }

    fun asQuat(): Quat {
        val quat = data.quatValue
        val x = quat.x.toRealT()
        val y = quat.y.toRealT()
        val z = quat.z.toRealT()
        val w = quat.w.toRealT()

        return Quat(x, y, z, w)
    }

    fun asAABB(): AABB {
        val aabb = data.aabbValue
        val position = aabb.position.toKVector3()
        val size = aabb.size.toKVector3()
        return AABB(position, size)
    }

    fun asBasis(): Basis {
        return data.basisValue.toKBasis()
    }

    fun asTransform(): Transform {
        val transform = data.transformValue
        val basis = transform.basis.toKBasis()
        val origin = transform.origin.toKVector3()
        return Transform(basis, origin)
    }

    fun asVariantArray() = VariantArray()

    inline fun <reified T : KtObject> asObject(): T {
        val objectValue = data.objectValue
        val constructorIndex = objectValue.engineConstructorIndex
        return KtObject.instantiateWith(
                objectValue.ptr,
                TypeManager.engineTypesConstructors[constructorIndex]
        ) as T
    }

    enum class Type {
        NIL,
        LONG,
        DOUBLE,
        STRING,
        BOOL,
        VECTOR2,
        RECT2,
        VECTOR3,
        TRANSFORM2D,
        PLANE,
        QUAT,
        AABB,
        BASIS,
        TRANSFORM,
        ARRAY,
        OBJECT
    }

    companion object {
        internal val TYPE_TO_WIRE_VALUE_TYPE = mapOf(
                Type.NIL to Wire.Value.TypeCase.NIL_VALUE,
                Type.LONG to Wire.Value.TypeCase.LONG_VALUE,
                Type.DOUBLE to Wire.Value.TypeCase.REAL_VALUE,
                Type.STRING to Wire.Value.TypeCase.STRING_VALUE,
                Type.BOOL to Wire.Value.TypeCase.BOOL_VALUE,
                Type.VECTOR2 to Wire.Value.TypeCase.VECTOR2_VALUE,
                Type.RECT2 to Wire.Value.TypeCase.RECT2_VALUE,
                Type.VECTOR3 to Wire.Value.TypeCase.VECTOR3_VALUE,
                Type.TRANSFORM2D to Wire.Value.TypeCase.TRANSFORM2D_VALUE,
                Type.PLANE to Wire.Value.TypeCase.PLANE_VALUE,
                Type.QUAT to Wire.Value.TypeCase.QUAT_VALUE,
                Type.AABB to Wire.Value.TypeCase.AABB_VALUE,
                Type.BASIS to Wire.Value.TypeCase.BASIS_VALUE,
                Type.TRANSFORM to Wire.Value.TypeCase.TRANSFORM_VALUE,
                Type.ARRAY to Wire.Value.TypeCase.VARIANT_ARRAY_VALUE,
                Type.OBJECT to Wire.Value.TypeCase.OBJECT_VALUE
        )

        private inline fun build(cb: Wire.Value.Builder.() -> Unit): Wire.Value {
            val builder = Wire.Value.newBuilder()
            builder.cb()
            return builder.build()
        }

        private fun Vector2.toWireVector2(): Wire.Vector2 {
            return Wire.Vector2.newBuilder()
                    .setX(x.toGodotReal())
                    .setY(y.toGodotReal())
                    .build()
        }

        private fun Vector3.toWireVector3(): Wire.Vector3 {
            return Wire.Vector3.newBuilder()
                    .setX(x.toGodotReal())
                    .setY(y.toGodotReal())
                    .setZ(z.toGodotReal())
                    .build()
        }

        private fun Basis.toWireBasis(): Wire.Basis {
            // read the internal values directly
            return Wire.Basis.newBuilder()
                    .setX(_x.toWireVector3())
                    .setY(_y.toWireVector3())
                    .setZ(_z.toWireVector3())
                    .build()
        }

        private fun Wire.Vector2.toKVector2(): Vector2 {
            return Vector2(x, y)
        }

        private fun Wire.Vector3.toKVector3(): Vector3 {
            return Vector3(x, y, z)
        }

        private fun Wire.Basis.toKBasis(): Basis {
            // write to the internal values directly
            return Basis().also {
                it._x = Vector3(this.x.x, this.x.y, this.x.z)
                it._y = Vector3(this.y.x, this.y.y, this.y.z)
                it._z = Vector3(this.z.x, this.z.y, this.z.z)
            }
        }
    }
}
