package godot.core

import godot.util.*
import kotlin.math.*

@Suppress("MemberVisibilityCanBePrivate")
class Vector2(
    var x: RealT,
    var y: RealT
) : Comparable<Vector2>, CoreType {

    //CONSTANTS
    enum class Axis(val value: Int) {
        X(0),
        Y(1);

        companion object {
            fun from(value: Int) = when (value) {
                0 -> X
                1 -> Y
                else -> throw AssertionError("Unknown axis for Vector2: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.value
        val AXIS_Y = Axis.Y.value
        val ZERO: Vector2
            get() = Vector2(0, 0)
        val ONE: Vector2
            get() = Vector2(1, 1)
        val INF: Vector2
            get() = Vector2(RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY)
        val LEFT: Vector2
            get() = Vector2(-1, 0)
        val RIGHT: Vector2
            get() = Vector2(1, 0)
        val UP: Vector2
            get() = Vector2(0, -1)
        val DOWN: Vector2
            get() = Vector2(0, 1)
    }


    //CONSTRUCTOR
    constructor() :
        this(0.0, 0.0)

    constructor(vec: Vector2) :
        this(vec.x, vec.y)

    constructor(other: Vector2i) : this(other.x, other.y)

    constructor(x: Number, y: Number) :
        this(x.toRealT(), y.toRealT())


    //API
    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector2 {
        return Vector2(abs(x), abs(y))
    }

    /**
     * Returns the vector’s angle in radians with respect to the x-axis, or (1, 0) vector.
     * Equivalent to the result of atan2 when called with the vector’s x and y as parameters: atan2(x, y).
     */
    fun angle(): RealT {
        return atan2(y, x)
    }

    /**
     * Returns the angle in radians between the two vectors.
     */
    fun angleTo(to: Vector2): RealT {
        return atan2(cross(to), dot(to))
    }

    /**
     * Returns the angle in radians between the line connecting the two points and the x coordinate.
     */
    fun angleToPoint(other: Vector2): RealT {
        return atan2(y - other.y, x - other.x)
    }

    /**
     * Returns the ratio of x to y.
     */
    fun aspect(): RealT {
        return this.x / this.y
    }

    /**
     * Returns the derivative at the given [t] on the Bézier curve defined by this vector and the given [control1],
     * [control2], and [end] points.
     */
    fun bezierDerivative(
        control1: Vector2,
        control2: Vector2,
        end: Vector2,
        t: RealT
    ) = Vector2(
        bezierDerivative(this.x, control1.x, control2.x, end.x, t),
        bezierDerivative(this.y, control1.y, control2.y, end.y, t)
    )

    /**
     * Returns the point at the given [t] on the Bézier curve defined by this vector and the given [control1],
     * [control2], and [end] points.
     */
    fun bezierInterpolate(
        control1: Vector2,
        control2: Vector2,
        end: Vector2,
        t: RealT
    ) = Vector2(
        bezierInterpolate(this.x, control1.x, control2.x, end.x, t),
        bezierInterpolate(this.y, control1.y, control2.y, end.y, t)
    )

    /**
     * Returns the vector “bounced off” from a plane defined by the given normal.
     */
    fun bounce(n: Vector2): Vector2 {
        return -reflect(n)
    }

    /**
     * Returns the vector with all components rounded up.
     */
    fun ceil(): Vector2 {
        return Vector2(ceil(x), ceil(y))
    }

    /**
     * Returns a new vector with all components clamped between the components of min and max, by running
     * @GlobalScope.clamp on each component.
     */
    fun clamp(min: Vector2, max: Vector2) = Vector2(x.coerceIn(min.x, max.x), y.coerceIn(min.y, max.y))

    /**
     * Returns the 2 dimensional analog of the cross product with the given vector.
     */
    fun cross(other: Vector2): RealT {
        return x * other.y - y * other.x
    }

    /**
     * Cubicly interpolates between this vector and b using pre_a and post_b as handles, and returns the result at position t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     */
    fun cubicInterpolate(v: Vector2, pre: Vector2, post: Vector2, t: RealT): Vector2 {
        val p0: Vector2 = pre
        val p1: Vector2 = this
        val p2: Vector2 = v
        val p3: Vector2 = post

        val t2: RealT = t * t
        val t3: RealT = t2 * t

        return ((p1 * 2.0) +
            (-p0 + p2) * t +
            (p0 * 2.0 - p1 * 5.0 + p2 * 4.0 - p3) * t2 +
            (-p0 + p1 * 3.0 - p2 * 3.0 + p3) * t3) * 0.5
    }

    /**
     * Cubically interpolates between this vector and b using pre_a and post_b as handles, and returns the result at
     * position weight. weight is on the range of 0.0 to 1.0, representing the amount of interpolation.
     */
    fun cubicInterpolateInTime(
        b: Vector2,
        preA: Vector2,
        postB: Vector2,
        weight: RealT,
        bT: RealT,
        preAT: RealT,
        postBT: RealT
    ) = Vector2(this).also {
        it.x = cubicInterpolateInTime(
            it.x,
            b.x,
            preA.x,
            postB.x,
            weight,
            bT,
            preAT,
            postBT
        )
        it.y = cubicInterpolateInTime(
            it.y,
            b.y,
            preA.y,
            postB.y,
            weight,
            bT,
            preAT,
            postBT
        )
    }

    /**
     * Returns the normalized vector pointing from this vector to b.
     */
    fun directionTo(other: Vector2): Vector2 {
        val ret = Vector2(other.x - x, other.y - y)
        ret.normalize()
        return ret
    }

    /**
     * Returns the squared distance to vector b.
     * Prefer this function over distance_to if you need to sort vectors or need the squared distance for some formula.
     */
    fun distanceSquaredTo(other: Vector2): RealT {
        return (x - other.x) * (x - other.x) + (y - other.y) * (y - other.y)
    }

    /**
     * Returns the distance to vector b.
     */
    fun distanceTo(other: Vector2): RealT {
        return sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y))
    }

    /**
     * Returns the dot product with vector b.
     */
    fun dot(other: Vector2): RealT {
        return x * other.x + y * other.y
    }

    /**
     * Returns the vector with all components rounded down.
     */
    fun floor(): Vector2 {
        return Vector2(floor(x), floor(y))
    }

    /**
     * Creates a unit Vector2 rotated to the given angle in radians. This is equivalent to doing
     * Vector2(cos(angle), sin(angle)) or Vector2.RIGHT.rotated(angle).
     */
    fun fromAngle(angle: RealT) = Vector2(cos(angle), sin(angle))

    /**
     * Returns true if this vector and v are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Vector2): Boolean {
        return isEqualApprox(
            other.x,
            x
        ) && isEqualApprox(other.y, y)
    }

    /**
     * Returns true if this vector is finite, by calling @GlobalScope.is_finite on each component.
     */
    fun isFinite() = x.isFinite() && y.isFinite()

    /**
     * Returns true if the vector is normalized.
     */
    fun isNormalized(): Boolean {
        return isEqualApprox(this.length(), 1.0)
    }

    /**
     * Returns true if this vector's values are approximately zero
     */
    fun isZeroApprox() = isEqualApprox(Vector2.ZERO)

    /**
     * Returns the vector’s length.
     */
    fun length(): RealT {
        return sqrt(x * x + y * y)
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this method over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared(): RealT {
        return x * x + y * y
    }

    /**
     * Returns the result of the linear interpolation between this vector and to by amount weight. weight is on the
     * range of 0.0 to 1.0, representing the amount of interpolation.
     */
    fun lerp(to: Vector2, weight: RealT) = Vector2(
        x + (weight * (to.x - x)),
        y + (weight * (to.y - y))
    )

    /**
     * Returns the vector with a maximum length by limiting its length to length.
     */
    fun limitLenght(length: RealT = 1.0): Vector2 {
        val l = length()
        var v = Vector2(this)
        if (l > 0 && length < l) {
            v /= l
            v *= length
        }

        return v
    }

    /**
     * Returns the axis of the vector's highest value. See AXIS_* constants. If all components are equal,
     * this method returns AXIS_X.
     */
    fun maxAxisIndex() = if (x < y) AXIS_Y else AXIS_X

    /**
     * Returns the axis of the vector's lowest value. See AXIS_* constants. If all components are equal,
     * this method returns AXIS_Y.
     */
    fun minAxisIndex() = if (x < y) AXIS_X else AXIS_Y

    /**
     * Moves the vector toward to by the fixed delta amount.
     */
    fun moveToward(to: Vector2, delta: RealT): Vector2 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON)
            to
        else
            this + vd / len * delta
    }

    /**
     * Returns the vector scaled to unit length. Equivalent to v / v.length().
     */
    fun normalized(): Vector2 {
        val v: Vector2 = Vector2(this)

        v.normalize()
        return v
    }

    internal fun normalize() {
        val l: RealT = length()
        if (isEqualApprox(l, 0.0)) {
            x = 0.0
            y = 0.0
        } else {
            x /= l
            y /= l
        }
    }

    /**
     * Returns a perpendicular vector rotated 90 degrees counter-clockwise compared to the original,
     * with the same length.
     */
    fun orthogonal() = Vector2(y, -x)

    /**
     * Returns a vector composed of the fposmod of this vector’s components and mod.
     */
    fun posmod(mod: RealT): Vector2 {
        return Vector2(x.rem(mod), y.rem(mod))
    }

    /**
     * Returns a vector composed of the fposmod of this vector’s components and modv’s components.
     */
    fun posmodv(modv: Vector2): Vector2 {
        return Vector2(x.rem(modv.x), y.rem(modv.y))
    }

    /**
     * Returns the vector projected onto the vector b.
     */
    fun project(vec: Vector2): Vector2 {
        val v1: Vector2 = vec
        val v2: Vector2 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    /**
     * Returns the vector reflected from a plane defined by the given normal.
     */
    fun reflect(vec: Vector2): Vector2 {
        return vec * this.dot(vec) * 2.0 - this
    }

    /**
     * Returns the vector rotated by phi radians.
     */
    fun rotated(by: RealT): Vector2 {
        var v = Vector2(0.0, 0.0)
        v.rotate(this.angle() + by)
        v *= length()
        return v
    }

    internal fun rotate(radians: RealT) {
        x = cos(radians)
        y = sin(radians)
    }

    /**
     * Returns the vector with all components rounded to the nearest integer, with halfway cases rounded away from zero.
     */
    fun round(): Vector2 {
        return Vector2(round(x), round(y))
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector2 {
        return Vector2(sign(x), sign(y))
    }

    /**
     * Returns the result of spherical linear interpolation between this vector and b, by amount t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     *
     * Note: Both vectors must be normalized.
     */
    fun slerp(b: Vector2, t: RealT): Vector2 {
        require(this.isNormalized() && b.isNormalized()) { "Both this and b vector must be normalized!" }
        val theta: RealT = angleTo(b)
        return rotated((theta * t))
    }

    /**
     * Returns the component of the vector along a plane defined by the given normal.
     */
    fun slide(vec: Vector2): Vector2 {
        return vec - this * this.dot(vec)
    }

    /**
     * Returns the vector snapped to a grid with the given size.
     */
    fun snapped(by: Vector2): Vector2 {
        val newX = if (isEqualApprox(by.x, 0.0)) {
            floor(x / by.x + 0.5).toRealT()
        } else {
            x
        }
        val newY = if (isEqualApprox(by.x, 0.0)) {
            floor(y / by.y + 0.5).toRealT()
        } else {
            y
        }
        return Vector2(newX, newY)
    }

    operator fun get(idx: Int): RealT =
        when (idx) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, f: RealT) =
        when (n) {
            0 -> x = f
            1 -> y = f
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(v: Vector2) = Vector2(x + v.x, y + v.y)
    operator fun plus(scalar: Int) = Vector2(x + scalar, y + scalar)
    operator fun plus(scalar: Long) = Vector2(x + scalar, y + scalar)
    operator fun plus(scalar: Float) = Vector2(x + scalar, y + scalar)
    operator fun plus(scalar: Double) = Vector2(x + scalar, y + scalar)

    operator fun minus(v: Vector2) = Vector2(x - v.x, y - v.y)
    operator fun minus(scalar: Int) = Vector2(x - scalar, y - scalar)
    operator fun minus(scalar: Long) = Vector2(x - scalar, y - scalar)
    operator fun minus(scalar: Float) = Vector2(x - scalar, y - scalar)
    operator fun minus(scalar: Double) = Vector2(x - scalar, y - scalar)

    operator fun times(v1: Vector2) = Vector2(x * v1.x, y * v1.y)
    operator fun times(scalar: Int) = Vector2(x * scalar, y * scalar)
    operator fun times(scalar: Long) = Vector2(x * scalar, y * scalar)
    operator fun times(scalar: Float) = Vector2(x * scalar, y * scalar)
    operator fun times(scalar: Double) = Vector2(x * scalar, y * scalar)

    operator fun div(v1: Vector2) = Vector2(x / v1.x, y / v1.y)
    operator fun div(scalar: Int) = Vector2(x / scalar, y / scalar)
    operator fun div(scalar: Long) = Vector2(x / scalar, y / scalar)
    operator fun div(scalar: Float) = Vector2(x / scalar, y / scalar)
    operator fun div(scalar: Double) = Vector2(x / scalar, y / scalar)

    operator fun unaryMinus() = Vector2(-x, -y)

    fun toVector2i() = Vector2i(x.toInt(), x.toInt())

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector2 -> (isEqualApprox(x, other.x) && isEqualApprox(y, other.y))
            else -> false
        }

    override fun compareTo(other: Vector2): Int =
        if (isEqualApprox(x, other.x)) {
            when {
                y < other.y -> -1
                isEqualApprox(y, other.y) -> 0
                else -> 1
            }
        } else {
            when {
                x < other.x -> -1
                else -> 1
            }
        }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}

operator fun Int.plus(vec: Vector2) = vec + this
operator fun Long.plus(vec: Vector2) = vec + this
operator fun Float.plus(vec: Vector2) = vec + this
operator fun Double.plus(vec: Vector2) = vec + this

operator fun Int.minus(vec: Vector2) = Vector2(this - vec.x, this - vec.y)
operator fun Long.minus(vec: Vector2) = Vector2(this - vec.x, this - vec.y)
operator fun Float.minus(vec: Vector2) = Vector2(this - vec.x, this - vec.y)
operator fun Double.minus(vec: Vector2) = Vector2(this - vec.x, this - vec.y)

operator fun Int.times(vec: Vector2) = vec * this
operator fun Long.times(vec: Vector2) = vec * this
operator fun Float.times(vec: Vector2) = vec * this
operator fun Double.times(vec: Vector2) = vec * this
