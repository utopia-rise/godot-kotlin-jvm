package godot.core

class KtVariant {
    constructor(value: Int) { TODO() }
    constructor(value: Long) { TODO() }
    constructor(value: Float) { TODO() }
    constructor(value: Double) { TODO() }
    constructor(value: Boolean) { TODO() }
    constructor(value: String) { TODO() }
    constructor(value: Vector2) { TODO() }
    constructor(value: Rect2) { TODO() }
    constructor(value: Vector3) { TODO() }
    constructor(value: Transform2D) { TODO() }
    constructor(value: Plane) { TODO() }
    constructor(value: Quat) { TODO() }
    constructor(value: AABB) { TODO() }
    constructor(value: Basis) { TODO() }
    constructor(value: Transform) { TODO() }

    fun asInt(): Int  { TODO() }
    fun asLong(): Long  { TODO() }
    fun asFloat(): Float  { TODO() }
    fun asDouble(): Double  { TODO() }
    fun asBoolean(): Boolean  { TODO() }
    fun asString(): String { TODO() }
    fun asVector2(): Vector2  { TODO() }
    fun asRect2(): Rect2  { TODO() }
    fun asVector3(): Vector3 { TODO() }
    fun asTransform2D(): Transform2D { TODO() }
    fun asPlane(): Plane { TODO() }
    fun asQuat(): Quat { TODO() }
    fun asAABB(): AABB { TODO() }
    fun asBasis(): Basis { TODO() }
    fun asTransform(): Transform { TODO() }

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
        TRANSFORM
    }
}