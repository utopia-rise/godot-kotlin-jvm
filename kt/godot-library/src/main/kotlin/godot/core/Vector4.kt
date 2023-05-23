package godot.core

import godot.util.*
import kotlin.math.*


@Suppress("MemberVisibilityCanBePrivate")
class Vector4(
    var x: RealT,
    var y: RealT,
    var z: RealT,
    var w: RealT
) : Comparable<Vector4>, CoreType {

    //CONSTANTS
    enum class Axis(val id: NaturalT) {
        X(0),
        Y(1),
        Z(2),
        W(3);

        companion object {
            fun from(value: NaturalT) = when (value) {
                0L -> X
                1L -> Y
                2L -> Z
                3L -> W
                else -> throw AssertionError("Unknown axis for Vector4: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.id
        val AXIS_Y = Axis.Y.id
        val AXIS_Z = Axis.Z.id
        val ZERO: Vector4
            get() = Vector4(0, 0, 0, 0)
        val ONE: Vector4
            get() = Vector4(1, 1, 1, 1)
        val INF: Vector4
            get() = Vector4(RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY, RealT.POSITIVE_INFINITY)
    }


    //CONSTRUCTOR
    constructor() :
            this(0.0, 0.0, 0.0, 0.0)

    constructor(vec: Vector4) :
            this(vec.x, vec.y, vec.z, vec.w)

    constructor(other: Vector4i) : this(other.x, other.y, other.z, other.w)

    constructor(x: Number, y: Number, z: Number, w: Number) :
            this(x.toRealT(), y.toRealT(), z.toRealT(), w.toRealT())

    //API

    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector4 {
        return Vector4(abs(x), abs(y), abs(z), abs(w))
    }

    /**
     * Returns the vector “bounced off” from a plane defined by the given normal.
     */
    fun bounce(n: Vector4): Vector4 {
        return -reflect(n)
    }

    /**
     * Returns a new vector with all components rounded up.
     */
    fun ceil(): Vector4 {
        return Vector4(ceil(x), ceil(y), ceil(z), ceil(w))
    }

    /**
     * Returns a new vector with all components clamped between the components of min and max, by running
     * @GlobalScope.clamp on each component.
     */
    fun clamp(min: Vector4, max: Vector4) = Vector4(
        x.coerceIn(min.x, max.x),
        y.coerceIn(min.y, max.y),
        z.coerceIn(min.z, max.z),
        w.coerceIn(min.w, max.w)
    )

    /**
     * Performs a cubic interpolation between vectors pre_a, a, b, post_b (a is current), by the given amount t.
     * t is in the range of 0.0 - 1.0, representing the amount of interpolation.
     */
    fun cubicInterpolate(b: Vector4, pre: Vector4, post: Vector4, t: RealT): Vector4 {
        val t2 = t * t
        val t3 = t2 * t

        return ((this * 2.0) +
                (-pre + b) * t +
                (pre * 2.0 - this * 5.0 + b * 4.0 - post) * t2 +
                (-pre + this * 3.0 - b * 3.0 + post) * t3) * 0.5
    }

    /**
     * Cubically interpolates between this vector and b using pre_a and post_b as handles, and returns the result at
     * position weight. weight is on the range of 0.0 to 1.0, representing the amount of interpolation.
     */
    fun cubicInterpolateInTime(
        b: Vector4,
        preA: Vector4,
        postB: Vector4,
        weight: RealT,
        bT: RealT,
        preAT: RealT,
        postBT: RealT
    ) = Vector4(this).also {
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
        it.z = cubicInterpolateInTime(
            it.z,
            b.z,
            preA.z,
            postB.z,
            weight,
            bT,
            preAT,
            postBT
        )
        it.w = cubicInterpolateInTime(
            it.w,
            b.w,
            preA.w,
            postB.w,
            weight,
            bT,
            preAT,
            postBT
        )
    }

    /**
     * Returns the normalized vector pointing from this vector to b.
     */
    fun directionTo(other: Vector4): Vector4 {
        val ret = Vector4(other.x - x, other.y - y, other.z - z, other.w - w)
        ret.normalize()
        return ret
    }

    /**
     * Returns the squared distance to b.
     * Prefer this function over distance_to if you need to sort vectors or need the squared distance for some formula.
     */
    fun distanceSquaredTo(other: Vector4): RealT {
        return (other - this).lengthSquared()
    }

    /**
     * Returns the distance to b.
     */
    fun distanceTo(other: Vector4): RealT {
        return (other - this).length()
    }

    /**
     * Returns the dot product with b.
     */
    fun dot(b: Vector4): RealT {
        return x * b.x + y * b.y + z * b.z + w * b.w
    }

    /**
     * Returns a new vector with all components rounded down.
     */
    fun floor(): Vector4 {
        return Vector4(floor(x), floor(y), floor(z), floor(w))
    }

    /**
     * Returns the inverse of the vector. This is the same as Vector3( 1.0 / v.x, 1.0 / v.y, 1.0 / v.z ).
     */
    fun inverse() = Vector4(1.0 / x, 1.0 / y, 1.0 / z, 1.0 / w)

    /**
     * Returns true if this vector and v are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Vector4): Boolean {
        return isEqualApprox(
            other.x,
            x
        ) && isEqualApprox(
            other.y,
            y
        ) && isEqualApprox(
            other.z,
            z
        ) && isEqualApprox(
            other.w,
            w
        )
    }

    /**
     * Returns true if this vector's values are approximately zero
     */
    fun isZeroApprox() = isEqualApprox(ZERO)

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
        return sqrt(lengthSquared())
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this function over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared() = this.dot(this)

    /**
     * Returns the result of the linear interpolation between this vector and to by amount weight. weight is on the
     * range of 0.0 to 1.0, representing the amount of interpolation.
     */
    fun lerp(to: Vector4, weight: RealT) = Vector4(
        x + (weight * (to.x - x)),
        y + (weight * (to.y - y)),
        z + (weight * (to.z - z)),
        w + (weight * (to.w - w))
    )

    /**
     * Returns the vector with a maximum length by limiting its length to length.
     */
    fun limitLength(length: RealT = 1.0): Vector4 {
        val l = length()
        var v = Vector4(this)
        if (l > 0 && length < l) {
            v /= l
            v *= length
        }

        return v
    }

    /**
     * Returns the axis of the vector's highest value. See AXIS_* constants.
     * If all components are equal, this method returns AXIS_X.
     */
    fun maxAxisIndex(): NaturalT {
        var maxIndex = 0
        var maxValue = x
        for (i in 1 until 4) {
            val axisValue = this[i]
            if (axisValue <= maxValue) {
                continue
            }
            maxIndex = i
            maxValue = axisValue
        }
        return maxIndex.toNaturalT()
    }

    /**
     * Returns the axis of the vector’s smallest value. See AXIS_* constants.
     */
    fun minAxisIndex(): NaturalT {
        var minIndex = 0
        var minValue = x
        for (i in 1 until 4) {
            val axisValue = this[i]
            if (axisValue > minValue) {
                continue
            }
            minIndex = i
            minValue = axisValue
        }
        return minIndex.toNaturalT()
    }

    /**
     * Moves the vector toward to by the fixed delta amount.
     */
    fun moveToward(to: Vector4, delta: RealT): Vector4 {
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
    fun normalized(): Vector4 {
        val v = Vector4(this)
        v.normalize()
        return v
    }

    internal fun normalize() {
        val l = this.length()
        if (isEqualApprox(l, 0.0)) {
            x = 0.0
            y = 0.0
            z = 0.0
            w = 0.0
        } else {
            x /= l
            y /= l
            z /= l
            w /= l
        }
    }

    /**
     * Returns the outer product with b.
     */
    fun outer(b: Vector4) = Basis(
        Vector3(x * b.x, x * b.y, x * b.z),
        Vector3(y * b.x, y * b.y, y * b.z),
        Vector3(z * b.x, z * b.y, z * b.z)
    )

    /**
     * Returns a vector composed of the fposmod of this vector’s components and mod.
     */
    fun posmod(mod: RealT) = Vector4(x.rem(mod), y.rem(mod), z.rem(mod), w.rem(mod))

    /**
     * Returns a vector composed of the fposmod of this vector’s components and modv’s components.
     */
    fun posmodv(modv: Vector4) = Vector4(x.rem(modv.x), y.rem(modv.y), z.rem(modv.z), w.rem(modv.w))

    /**
     * Returns the vector reflected from a plane defined by the given normal.
     */
    fun reflect(by: Vector4): Vector4 {
        return by - this * this.dot(by) * 2.0
    }

    /**
     * Returns the vector with all components rounded to the nearest integer, with halfway cases rounded away from zero.
     */
    fun round(): Vector4 {
        return Vector4(round(x), round(y), round(z), round(w))
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector4 {
        return Vector4(sign(x), sign(y), sign(z), sign(w))
    }

    /**
     * Returns the component of the vector along a plane defined by the given normal.
     */
    fun slide(vec: Vector4): Vector4 {
        return vec - this * this.dot(vec)
    }

    /**
     * Returns a copy of the vector snapped to the lowest neared multiple.
     */
    fun snapped(by: RealT) = Vector4(this).also {
        it.snap(by)
    }

    internal fun snap(vecal: RealT) {
        if (isEqualApprox(vecal, 0.0)) {
            x = (floor(x / vecal + 0.5) * vecal)
            y = (floor(y / vecal + 0.5) * vecal)
            z = (floor(z / vecal + 0.5) * vecal)
            w = (floor(w / vecal + 0.5) * vecal)
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
            3 -> w
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, f: RealT): Unit =
        when (n) {
            0 -> x = f
            1 -> y = f
            2 -> z = f
            3 -> w = f
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(vec: Vector4) = Vector4(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    operator fun plus(scalar: Int) = Vector4(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Long) = Vector4(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Float) = Vector4(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Double) = Vector4(x + scalar, y + scalar, z + scalar, w + scalar)

    operator fun minus(vec: Vector4) = Vector4(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    operator fun minus(scalar: Int) = Vector4(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Long) = Vector4(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Float) = Vector4(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Double) = Vector4(x - scalar, y - scalar, z - scalar, w - scalar)

    operator fun times(vec: Vector4) = Vector4(x * vec.x, y * vec.y, z * vec.z, w * vec.w)
    operator fun times(scalar: Int) = Vector4(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Long) = Vector4(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Float) = Vector4(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Double) = Vector4(x * scalar, y * scalar, z * scalar, w * scalar)

    operator fun div(vec: Vector4) = Vector4(x / vec.x, y / vec.y, z / vec.z, w / vec.w)
    operator fun div(scalar: Int) = Vector4(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Long) = Vector4(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Float) = Vector4(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Double) = Vector4(x / scalar, y / scalar, z / scalar, w / scalar)

    operator fun unaryMinus() = Vector4(-x, -y, -z, -w)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector4 -> (x == other.x && y == other.y && z == other.z && w == other.w)
            else -> false
        }

    override fun compareTo(other: Vector4): Int {
        if (x == other.x) {
            if (y == other.y) {
                return if (z == other.z) {
                    when {
                        w < other.w -> -1
                        w == other.w -> 0
                        else -> 1
                    }
                } else {
                    when {
                        z < other.z -> -1
                        else -> 1
                    }
                }
            }
            else {
                return when {
                    y < other.y -> -1
                    else -> 1
                }
            }
        } else {
            return when {
                x < other.x -> -1
                else -> 1
            }
        }
    }

    override fun toString(): String {
        return "($x, $y, $z, $w)"
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }
}

operator fun Int.plus(vec: Vector4) = vec + this
operator fun Long.plus(vec: Vector4) = vec + this
operator fun Float.plus(vec: Vector4) = vec + this
operator fun Double.plus(vec: Vector4) = vec + this

operator fun Int.minus(vec: Vector4) = Vector4(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Long.minus(vec: Vector4) = Vector4(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Float.minus(vec: Vector4) = Vector4(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Double.minus(vec: Vector4) = Vector4(this - vec.x, this - vec.y, this - vec.z, this - vec.w)

operator fun Int.times(vec: Vector4) = vec * this
operator fun Long.times(vec: Vector4) = vec * this
operator fun Float.times(vec: Vector4) = vec * this
operator fun Double.times(vec: Vector4) = vec * this
