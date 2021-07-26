package godot.core

import godot.util.*
import kotlin.math.*


class Vector3(
    var x: RealT,
    var y: RealT,
    var z: RealT
) : Comparable<Vector3>, CoreType {

    //CONSTANTS
    enum class Axis(val value: NaturalT) {
        X(0),
        Y(1),
        Z(2);

        companion object {
            fun from(value: NaturalT) = when (value) {
                0L -> X
                1L -> Y
                2L -> Z
                else -> throw AssertionError("Unknown axis for Vector3: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.value
        val AXIS_Y = Axis.Y.value
        val AXIS_Z = Axis.Z.value
        val ZERO: Vector3
            get() = Vector3(0, 0, 0)
        val ONE: Vector3
            get() = Vector3(1, 1, 1)
        val INF: Vector3
            get() = Vector3(RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY)
        val LEFT: Vector3
            get() = Vector3(-1, 0, 0)
        val RIGHT: Vector3
            get() = Vector3(1, 0, 0)
        val UP: Vector3
            get() = Vector3(0, 1, 0)
        val DOWN: Vector3
            get() = Vector3(0, -1, 0)
        val FORWARD: Vector3
            get() = Vector3(0, 0, -1)
        val BACK: Vector3
            get() = Vector3(0, 0, 1)
    }


    //CONSTRUCTOR
    constructor() :
            this(0.0, 0.0, 0.0)

    constructor(vec: Vector3) :
            this(vec.x, vec.y, vec.z)

    constructor(x: Number, y: Number, z: Number) :
            this(x.toRealT(), y.toRealT(), z.toRealT())

    //API
    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector3 {
        return Vector3(abs(x), abs(y), abs(z))
    }

    /**
     * Returns the minimum angle to the given vector.
     */
    fun angleTo(to: Vector3): RealT {
        return atan2(cross(to).length(), dot(to))
    }

    /**
     * Returns the vector “bounced off” from a plane defined by the given normal.
     */
    fun bounce(n: Vector3): Vector3 {
        return -reflect(n)
    }

    /**
     * Returns a new vector with all components rounded up.
     */
    fun ceil(): Vector3 {
        return Vector3(ceil(x), ceil(y), ceil(z))
    }

    /**
     * Returns the cross product with b.
     */
    fun cross(b: Vector3): Vector3 {
        return Vector3((y * b.z) - (z * b.y), (z * b.x) - (x * b.z), (x * b.y) - (y * b.x))
    }

    /**
     * Performs a cubic interpolation between vectors pre_a, a, b, post_b (a is current), by the given amount t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     */
    fun cubicInterpolate(b: Vector3, pre: Vector3, post: Vector3, t: RealT): Vector3 {
        val p0: Vector3 = pre
        val p1: Vector3 = this
        val p2: Vector3 = b
        val p3: Vector3 = post

        val t2 = t * t
        val t3 = t2 * t

        return ((p1 * 2.0) +
                (-p0 + p2) * t +
                (p0 * 2.0 - p1 * 5.0 + p2 * 4.0 - p3) * t2 +
                (-p0 + p1 * 3.0 - p2 * 3.0 + p3) * t3) * 0.5
    }

    /**
     * Returns the normalized vector pointing from this vector to b.
     */
    fun directionTo(other: Vector3): Vector3 {
        val ret = Vector3(other.x - x, other.y - y, other.z - z)
        ret.normalize()
        return ret
    }

    /**
     * Returns the squared distance to b.
     * Prefer this function over distance_to if you need to sort vectors or need the squared distance for some formula.
     */
    fun distanceSquaredTo(other: Vector3): RealT {
        return (other - this).lengthSquared()
    }

    /**
     * Returns the distance to b.
     */
    fun distanceTo(other: Vector3): RealT {
        return (other - this).length()
    }

    /**
     * Returns the dot product with b.
     */
    fun dot(b: Vector3): RealT {
        return x * b.x + y * b.y + z * b.z
    }

    /**
     * Returns a new vector with all components rounded down.
     */
    fun floor(): Vector3 {
        return Vector3(floor(x), floor(y), floor(z))
    }

    /**
     * Returns the inverse of the vector. This is the same as Vector3( 1.0 / v.x, 1.0 / v.y, 1.0 / v.z ).
     */
    fun inverse(): Vector3 {
        return Vector3(1.0 / x, 1.0 / y, 1.0 / z)
    }

    /**
     * Returns true if this vector and v are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Vector3): Boolean {
        return isEqualApprox(
            other.x,
            x
        ) && isEqualApprox(
            other.y,
            y
        ) && isEqualApprox(other.z, z)
    }

    /**
     * Returns true if the vector is normalized.
     */
    fun isNormalized(): Boolean {
        return isEqualApprox(this.length(), 1.0)
    }

    /**
     * Returns the vector’s length.
     */
    fun length(): RealT {
        return sqrt(x * x + y * y + z * z)
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this function over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared(): RealT {
        return x * x + y * y + z * z
    }

    /**
     * Returns the result of the linear interpolation between this vector and b by amount t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     */
    fun linearInterpolate(b: Vector3, t: RealT): Vector3 {
        return Vector3(x + (t * (b.x - x)), y + (t * (b.y - y)), z + (t * (b.z - z)))
    }

    /**
     * Returns the axis of the vector’s largest value. See AXIS_* constants.
     */
    fun maxAxis(): Int {
        return if (x < y) {
            if (y < z) {
                2
            } else {
                1
            }
        } else {
            if (x < z) {
                2
            } else {
                0
            }
        }
    }

    /**
     * Returns the axis of the vector’s smallest value. See AXIS_* constants.
     */
    fun minAxis(): Int {
        return if (x < y) {
            if (x < z) {
                0
            } else {
                2
            }
        } else {
            if (y < z) {
                1
            } else {
                2
            }
        }
    }

    /**
     * Moves the vector toward to by the fixed delta amount.
     */
    fun moveToward(to: Vector3, delta: RealT): Vector3 {
        val vd = to - this
        val len = vd.length()
        return if (len <= delta || len < CMP_EPSILON) {
            to
        } else {
            this + vd / len * delta
        }
    }

    /**
     * Returns the vector scaled to unit length. Equivalent to v / v.length().
     */
    fun normalized(): Vector3 {
        val v: Vector3 = Vector3(this)
        v.normalize()
        return v
    }

    internal fun normalize() {
        val l = this.length()
        if (isEqualApprox(l, 0.0)) {
            x = 0.0
            y = 0.0
            z = 0.0
        } else {
            x /= l
            y /= l
            z /= l
        }
    }

    /**
     * Returns the outer product with b.
     */
    fun outer(b: Vector3) = Basis(
        Vector3(x * b.x, x * b.y, x * b.z),
        Vector3(y * b.x, y * b.y, y * b.z),
        Vector3(z * b.x, z * b.y, z * b.z)
    )

    /**
     * Returns a vector composed of the fposmod of this vector’s components and mod.
     */
    fun posmod(mod: RealT): Vector3 {
        return Vector3(x.rem(mod), y.rem(mod), z.rem(mod))
    }

    /**
     * Returns a vector composed of the fposmod of this vector’s components and modv’s components.
     */
    fun posmodv(modv: Vector3): Vector3 {
        return Vector3(x.rem(modv.x), y.rem(modv.y), z.rem(modv.z))
    }

    /**
     * Returns the vector projected onto the vector b.
     */
    fun project(vec: Vector3): Vector3 {
        val v1: Vector3 = vec
        val v2: Vector3 = this
        return v2 * (v1.dot(v2) / v2.dot(v2))
    }

    /**
     * Returns the vector reflected from a plane defined by the given normal.
     */
    fun reflect(by: Vector3): Vector3 {
        return by - this * this.dot(by) * 2.0
    }

    /**
     * Rotates the vector around a given axis by phi radians. The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: RealT): Vector3 {
        require(axis.isNormalized()) { "Axis not normalized!" }
        val v = Vector3(this)
        v.rotate(axis, phi)
        return v
    }

    internal fun rotate(axis: Vector3, phi: RealT) {
        val ret = Basis(axis, phi).xform(this)
        this.x = ret.x
        this.y = ret.y
        this.z = ret.z
    }

    /**
     * Returns the vector with all components rounded to the nearest integer, with halfway cases rounded away from zero.
     */
    fun round(): Vector3 {
        return Vector3(round(x), round(y), round(z))
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector3 {
        return Vector3(sign(x), sign(y), sign(z))
    }

    /**
     * Returns the result of spherical linear interpolation between this vector and b, by amount t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     *
     * Note: Both vectors must be normalized.
     */
    fun slerp(b: Vector3, t: RealT): Vector3 {
        require(this.isNormalized() && b.isNormalized()) { "Both this and b vectors must be normalized!" }
        val theta: RealT = angleTo(b)
        return rotated(cross(b).normalized(), theta * t)
    }

    /**
     * Returns the component of the vector along a plane defined by the given normal.
     */
    fun slide(vec: Vector3): Vector3 {
        return vec - this * this.dot(vec)
    }

    /**
     * Returns a copy of the vector snapped to the lowest neared multiple.
     */
    fun snapped(by: RealT): Vector3 {
        val v: Vector3 = Vector3(this)
        v.snap(by)
        return v
    }

    internal fun snap(vecal: RealT) {
        if (isEqualApprox(vecal, 0.0)) {
            x = (floor(x / vecal + 0.5) * vecal)
            y = (floor(y / vecal + 0.5) * vecal)
            z = (floor(z / vecal + 0.5) * vecal)
        }
    }

    /**
     * Returns a diagonal matrix with the vector as main diagonal.
     */
// TODO: fix me
//    fun toDiagonalMatrix(): Basis {
//        return Basis()
//    }


    operator fun get(n: Int): RealT =
        when (n) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, f: RealT): Unit =
        when (n) {
            0 -> x = f
            1 -> y = f
            2 -> z = f
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(vec: Vector3) = Vector3(x + vec.x, y + vec.y, z + vec.z)
    operator fun plus(scalar: Int) = Vector3(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Long) = Vector3(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Float) = Vector3(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Double) = Vector3(x + scalar, y + scalar, z + scalar)

    operator fun minus(vec: Vector3) = Vector3(x - vec.x, y - vec.y, z - vec.z)
    operator fun minus(scalar: Int) = Vector3(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Long) = Vector3(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Float) = Vector3(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Double) = Vector3(x - scalar, y - scalar, z - scalar)

    operator fun times(vec: Vector3) = Vector3(x * vec.x, y * vec.y, z * vec.z)
    operator fun times(scalar: Int) = Vector3(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Long) = Vector3(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Float) = Vector3(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Double) = Vector3(x * scalar, y * scalar, z * scalar)

    operator fun div(vec: Vector3) = Vector3(x / vec.x, y / vec.y, z / vec.z)
    operator fun div(scalar: Int) = Vector3(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Long) = Vector3(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Float) = Vector3(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Double) = Vector3(x / scalar, y / scalar, z / scalar)

    operator fun unaryMinus() = Vector3(-x, -y, -z)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector3 -> (x == other.x && y == other.y && z == other.z)
            else -> false
        }

    override fun compareTo(other: Vector3): Int {
        if (x == other.x) {
            return if (y == other.y)
                when {
                    z < other.z -> -1
                    z == other.z -> 0
                    else -> 1
                }
            else
                when {
                    y < other.y -> -1
                    else -> 1
                }
        } else
            return when {
                x < other.x -> -1
                else -> 1
            }
    }

    override fun toString(): String {
        return "($x, $y, $z)"
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }
}

operator fun Int.plus(vec: Vector3) = vec + this
operator fun Long.plus(vec: Vector3) = vec + this
operator fun Float.plus(vec: Vector3) = vec + this
operator fun Double.plus(vec: Vector3) = vec + this

operator fun Int.minus(vec: Vector3) = Vector3(this - vec.x, this - vec.y, this - vec.z)
operator fun Long.minus(vec: Vector3) = Vector3(this - vec.x, this - vec.y, this - vec.z)
operator fun Float.minus(vec: Vector3) = Vector3(this - vec.x, this - vec.y, this - vec.z)
operator fun Double.minus(vec: Vector3) = Vector3(this - vec.x, this - vec.y, this - vec.z)

operator fun Int.times(vec: Vector3) = vec * this
operator fun Long.times(vec: Vector3) = vec * this
operator fun Float.times(vec: Vector3) = vec * this
operator fun Double.times(vec: Vector3) = vec * this
