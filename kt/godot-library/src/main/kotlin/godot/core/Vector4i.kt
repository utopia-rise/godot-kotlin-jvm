package godot.core

import godot.util.*
import kotlin.math.*


@Suppress("MemberVisibilityCanBePrivate")
class Vector4i(
    var x: Int,
    var y: Int,
    var z: Int,
    var w: Int
) : Comparable<Vector4i>, CoreType {

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
        val ZERO: Vector4i
            get() = Vector4i(0, 0, 0, 0)
        val ONE: Vector4i
            get() = Vector4i(1, 1, 1, 1)
    }


    //CONSTRUCTOR
    constructor() :
            this(0, 0, 0, 0)

    constructor(vec: Vector4i) :
            this(vec.x, vec.y, vec.z, vec.w)

    constructor(vec: Vector4) : this(vec.x, vec.y, vec.z, vec.w)

    constructor(x: Number, y: Number, z: Number, w: Number) :
            this(x.toInt(), y.toInt(), z.toInt(), w.toInt())

    //API

    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector4i {
        return Vector4i(abs(x), abs(y), abs(z), abs(w))
    }

    /**
     * Returns a new vector with all components clamped between the components of min and max, by running
     * @GlobalScope.clamp on each component.
     */
    fun clamp(min: Vector4i, max: Vector4i) = Vector4i(
        x.coerceIn(min.x, max.x),
        y.coerceIn(min.y, max.y),
        z.coerceIn(min.z, max.z),
        w.coerceIn(min.w, max.w)
    )

    /**
     * Returns the vector’s length.
     */
    fun length(): Double {
        return sqrt(lengthSquared().toDouble())
    }

    /**
     * Returns the vector’s length squared.
     * Prefer this function over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared() = x * (x.toLong()) + y * (y.toLong()) + z * (z.toLong()) + w * (w.toLong())

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
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector4i {
        return Vector4i(x.sign, y.sign, z.sign, w.sign)
    }

    /**
     * Returns a diagonal matrix with the vector as main diagonal.
     */
// TODO: fix me
//    fun toDiagonalMatrix(): Basis {
//        return Basis()
//    }


    operator fun get(n: Int): Int =
        when (n) {
            0 -> x
            1 -> y
            2 -> z
            3 -> w
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, i: Int): Unit =
        when (n) {
            0 -> x = i
            1 -> y = i
            2 -> z = i
            3 -> w = i
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(vec: Vector4i) = Vector4i(x + vec.x, y + vec.y, z + vec.z, w + vec.w)
    operator fun plus(scalar: Int) = Vector4i(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Long) = Vector4i(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Float) = Vector4i(x + scalar, y + scalar, z + scalar, w + scalar)
    operator fun plus(scalar: Double) = Vector4i(x + scalar, y + scalar, z + scalar, w + scalar)

    operator fun minus(vec: Vector4i) = Vector4i(x - vec.x, y - vec.y, z - vec.z, w - vec.w)
    operator fun minus(scalar: Int) = Vector4i(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Long) = Vector4i(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Float) = Vector4i(x - scalar, y - scalar, z - scalar, w - scalar)
    operator fun minus(scalar: Double) = Vector4i(x - scalar, y - scalar, z - scalar, w - scalar)

    operator fun times(vec: Vector4i) = Vector4i(x * vec.x, y * vec.y, z * vec.z, w * vec.w)
    operator fun times(scalar: Int) = Vector4i(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Long) = Vector4i(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Float) = Vector4i(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Double) = Vector4i(x * scalar, y * scalar, z * scalar, w * scalar)

    operator fun div(vec: Vector4i) = Vector4i(x / vec.x, y / vec.y, z / vec.z, w / vec.w)
    operator fun div(scalar: Int) = Vector4i(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Long) = Vector4i(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Float) = Vector4i(x / scalar, y / scalar, z / scalar, w / scalar)
    operator fun div(scalar: Double) = Vector4i(x / scalar, y / scalar, z / scalar, w / scalar)

    operator fun unaryMinus() = Vector4i(-x, -y, -z, -w)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector4i -> (x == other.x && y == other.y && z == other.z && w == other.w)
            else -> false
        }

    override fun compareTo(other: Vector4i): Int {
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

operator fun Int.plus(vec: Vector4i) = vec + this
operator fun Long.plus(vec: Vector4i) = vec + this
operator fun Float.plus(vec: Vector4i) = vec + this
operator fun Double.plus(vec: Vector4i) = vec + this

operator fun Int.minus(vec: Vector4i) = Vector4i(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Long.minus(vec: Vector4i) = Vector4i(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Float.minus(vec: Vector4i) = Vector4i(this - vec.x, this - vec.y, this - vec.z, this - vec.w)
operator fun Double.minus(vec: Vector4i) = Vector4i(this - vec.x, this - vec.y, this - vec.z, this - vec.w)

operator fun Int.times(vec: Vector4i) = vec * this
operator fun Long.times(vec: Vector4i) = vec * this
operator fun Float.times(vec: Vector4i) = vec * this
operator fun Double.times(vec: Vector4i) = vec * this
