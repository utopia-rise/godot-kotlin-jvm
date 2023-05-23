package godot.core

import kotlin.math.sqrt

@Suppress("MemberVisibilityCanBePrivate")
class Vector2i(
    var x: Int,
    var y: Int
) : Comparable<Vector2i>, CoreType {
    var width: Int
        get() = x
        set(value) { x = value }

    var height: Int
        get() = y
        set(value) { y = value }

    //CONSTANTS
    enum class Axis(val value: Int) {
        X(0),
        Y(1);

        companion object {
            fun from(value: Int) = when (value) {
                0 -> X
                1 -> Y
                else -> throw AssertionError("Unknown axis for Vector2i: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Vector2i.Axis.X.value
        val AXIS_Y = Vector2i.Axis.Y.value
        val ZERO: Vector2i
            get() = Vector2i(0, 0)
        val ONE: Vector2i
            get() = Vector2i(1, 1)
        val LEFT: Vector2i
            get() = Vector2i(-1, 0)
        val RIGHT: Vector2i
            get() = Vector2i(1, 0)
        val UP: Vector2i
            get() = Vector2i(0, -1)
        val DOWN: Vector2i
            get() = Vector2i(0, 1)
    }

    //CONSTRUCTOR
    constructor() : this(0.0, 0.0)

    constructor(vec: Vector2i) : this(vec.x, vec.y)

    constructor(vec: Vector2) : this(vec.x, vec.y)

    constructor(x: Number, y: Number) : this(x.toInt(), y.toInt())

    //API

    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs() = Vector2i(kotlin.math.abs(x), kotlin.math.abs(y))

    /**
     * Returns the ratio of x to y.
     */
    fun aspect() = this.x / this.y

    /**
     * Returns a new vector with all components clamped between the components of min and max, by running
     * @GlobalScope.clamp on each component.
     */
    fun clamp(min: Vector2i, max: Vector2i) = Vector2(x.coerceIn(min.x, max.x), y.coerceIn(min.y, max.y))

    /**
     * Returns the vector’s length.
     */
    fun length() = sqrt(lengthSquared().toDouble())

    /**
     * Returns the vector’s length squared.
     * Prefer this method over length if you need to sort vectors or need the squared length for some formula.
     */
    fun lengthSquared() = x * x + y * y

    /**
     * Returns the axis of the vector's highest value. See AXIS_* constants. If all components are equal,
     * this method returns AXIS_X.
     */
    fun maxAxisIndex() = if (x < y) Vector2.AXIS_Y else Vector2.AXIS_X

    /**
     * Returns the axis of the vector's lowest value. See AXIS_* constants. If all components are equal,
     * this method returns AXIS_Y.
     */
    fun minAxisIndex() = if (x < y) Vector2.AXIS_X else Vector2.AXIS_Y

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign() = Vector2i(kotlin.math.sign(x.toFloat()), kotlin.math.sign(y.toFloat()))

    /**
     * Returns a new vector with each component snapped to the closest multiple of the corresponding component in [step].
     */
    fun snapped(step: Vector2i) = Vector2i(
        snapped(x, step.x),
        snapped(y, step.y)
    )

    fun mod(other: Vector2i) = Vector2i(
        x.mod(other.x),
        y.mod(other.y)
    )

    fun mod(scalar: Int) = Vector2i(
        x.mod(scalar),
        y.mod(scalar)
    )

    operator fun get(idx: Int): Int =
        when (idx) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, i: Int) =
        when (n) {
            0 -> x = i
            1 -> y = i
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(v: Vector2i) = Vector2i(x + v.x, y + v.y)
    operator fun plus(scalar: Int) = Vector2i(x + scalar, y + scalar)
    operator fun plus(scalar: Long) = Vector2i(x + scalar, y + scalar)
    operator fun plus(scalar: Float) = Vector2i(x + scalar, y + scalar)
    operator fun plus(scalar: Double) = Vector2i(x + scalar, y + scalar)

    operator fun minus(v: Vector2i) = Vector2i(x - v.x, y - v.y)
    operator fun minus(scalar: Int) = Vector2i(x - scalar, y - scalar)
    operator fun minus(scalar: Long) = Vector2i(x - scalar, y - scalar)
    operator fun minus(scalar: Float) = Vector2i(x - scalar, y - scalar)
    operator fun minus(scalar: Double) = Vector2i(x - scalar, y - scalar)

    operator fun times(v1: Vector2i) = Vector2i(x * v1.x, y * v1.y)
    operator fun times(scalar: Int) = Vector2i(x * scalar, y * scalar)
    operator fun times(scalar: Long) = Vector2i(x * scalar, y * scalar)
    operator fun times(scalar: Float) = Vector2i(x * scalar, y * scalar)
    operator fun times(scalar: Double) = Vector2i(x * scalar, y * scalar)

    operator fun div(v1: Vector2i) = Vector2i(x / v1.x, y / v1.y)
    operator fun div(scalar: Int) = Vector2i(x / scalar, y / scalar)
    operator fun div(scalar: Long) = Vector2i(x / scalar, y / scalar)
    operator fun div(scalar: Float) = Vector2i(x / scalar, y / scalar)
    operator fun div(scalar: Double) = Vector2i(x / scalar, y / scalar)

    operator fun unaryMinus() = Vector2i(-x, -y)

    fun toVector2() = Vector2(x, y)

    override fun compareTo(other: Vector2i): Int =
        if (x == other.x) {
            when {
                y < other.y -> -1
                y == other.y -> 0
                else -> 1
            }
        } else {
            when {
                x < other.x -> -1
                else -> 1
            }
        }

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector2i -> (x == other.x && y == other.y)
            else -> false
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