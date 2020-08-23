package godot.core


interface KtVariantFactory {
    fun create(value: Int): KtVariant
    fun create(value: Long): KtVariant
    fun create(value: Float): KtVariant
    fun create(value: Double): KtVariant
    fun create(value: Boolean): KtVariant
    fun create(value: String): KtVariant
    fun create(value: Vector2): KtVariant
    fun create(value: Rect2): KtVariant
    fun create(value: Vector3): KtVariant
    fun create(value: Transform2D): KtVariant
    fun create(value: Plane): KtVariant
    fun create(value: Quat): KtVariant
    fun create(value: AABB): KtVariant
    fun create(value: Basis): KtVariant
    fun create(value: Transform): KtVariant
}

interface KtVariant {
    fun asInt(): Int
    fun asLong(): Long
    fun asFloat(): Float
    fun asDouble(): Double
    fun asBoolean(): Boolean
    fun asString(): String
    fun asVector2(): Vector2
    fun asRect2(): Rect2
    fun asVector3(): Vector3
    fun asTransform2D(): Transform2D
    fun asPlane(): Plane
    fun asQuat(): Quat
    fun asAABB(): AABB
    fun asBasis(): Basis
    fun asTransform(): Transform

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