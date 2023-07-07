package godot.core

import godot.util.NaturalT
import godot.util.RealT
import kotlin.math.sqrt

class Vector3i(
    var x: Int,
    var y: Int,
    var z: Int
) : Comparable<Vector3i>, CoreType {
    //CONSTANTS
    enum class Axis(val id: NaturalT) {
        X(0),
        Y(1),
        Z(2);

        companion object {
            fun from(value: NaturalT) = when (value) {
                0L -> X
                1L -> Y
                2L -> Z
                else -> throw AssertionError("Unknown axis for Vector3i: $value")
            }
        }
    }

    companion object {
        val AXIS_X = Axis.X.id
        val AXIS_Y = Axis.Y.id
        val AXIS_Z = Axis.Z.id
        val ZERO: Vector3i
            get() = Vector3i(0, 0, 0)
        val ONE: Vector3i
            get() = Vector3i(1, 1, 1)
        val LEFT: Vector3i
            get() = Vector3i(-1, 0, 0)
        val RIGHT: Vector3i
            get() = Vector3i(1, 0, 0)
        val UP: Vector3i
            get() = Vector3i(0, 1, 0)
        val DOWN: Vector3i
            get() = Vector3i(0, -1, 0)
        val FORWARD: Vector3i
            get() = Vector3i(0, 0, -1)
        val BACK: Vector3i
            get() = Vector3i(0, 0, 1)
    }

    //CONSTRUCTOR
    constructor() : this(0, 0, 0)

    constructor(vec: Vector3i) : this(vec.x, vec.y, vec.z)

    constructor(vec: Vector3) : this(vec.x, vec.y, vec.z)

    constructor(x: Number, y: Number, z: Number) : this(x.toInt(), y.toInt(), z.toInt())

    //API

    /**
     * Returns a new vector with all components in absolute values (i.e. positive).
     */
    fun abs(): Vector3i {
        return Vector3i(kotlin.math.abs(x), kotlin.math.abs(y), kotlin.math.abs(z))
    }

    /**
     * Returns a new vector with all components clamped between the components of min and max, by running
     * @GlobalScope.clamp on each component.
     */
    fun clamp(min: Vector3i, max: Vector3i) = Vector3i(
        x.coerceIn(min.x, max.x),
        y.coerceIn(min.y, max.y),
        z.coerceIn(min.z, max.z)
    )

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
    fun lengthSquared(): RealT {
        return (x * x + y * y + z * z).toDouble()
    }

    /**
     * Returns the axis of the vector's highest value. See AXIS_* constants.
     * If all components are equal, this method returns AXIS_X.
     */
    fun maxAxisIndex() = if (x < y) {
        if (y < z) {
            Vector3i.AXIS_Z
        } else {
            Vector3i.AXIS_Y
        }
    } else {
        if (x < z) {
            Vector3i.AXIS_Z
        } else {
            Vector3i.AXIS_X
        }
    }

    /**
     * Returns the axis of the vector’s smallest value. See AXIS_* constants.
     */
    fun minAxisIndex() = if (x < y) {
        if (x < z) {
            Vector3i.AXIS_X
        } else {
            Vector3i.AXIS_Z
        }
    } else {
        if (y < z) {
            Vector3i.AXIS_Y
        } else {
            Vector3i.AXIS_Z
        }
    }

    /**
     * Returns the vector with each component set to one or negative one, depending on the signs of the components.
     */
    fun sign(): Vector3i {
        return Vector3i(kotlin.math.sign(x.toDouble()), kotlin.math.sign(y.toDouble()), kotlin.math.sign(z.toDouble()))
    }

    /**
     * Returns a new vector with each component snapped to the closest multiple of the corresponding component in [step].
     */
    fun snapped(step: Vector3i) = Vector3i(
        snapped(x, step.x),
        snapped(y, step.y),
        snapped(z, step.z)
    )

    fun mod(other: Vector3i) = Vector3i(
        x.mod(other.x),
        y.mod(other.y),
        z.mod(other.z)
    )

    fun mod(scalar: Int) = Vector3i(
        x.mod(scalar),
        y.mod(scalar),
        z.mod(scalar)
    )

    operator fun get(n: Int): Int =
        when (n) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IndexOutOfBoundsException()
        }

    operator fun set(n: Int, i: Int): Unit =
        when (n) {
            0 -> x = i
            1 -> y = i
            2 -> z = i
            else -> throw IndexOutOfBoundsException()
        }

    operator fun plus(vec: Vector3i) = Vector3i(x + vec.x, y + vec.y, z + vec.z)
    operator fun plus(scalar: Int) = Vector3i(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Long) = Vector3i(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Float) = Vector3i(x + scalar, y + scalar, z + scalar)
    operator fun plus(scalar: Double) = Vector3i(x + scalar, y + scalar, z + scalar)

    operator fun minus(vec: Vector3i) = Vector3i(x - vec.x, y - vec.y, z - vec.z)
    operator fun minus(scalar: Int) = Vector3i(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Long) = Vector3i(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Float) = Vector3i(x - scalar, y - scalar, z - scalar)
    operator fun minus(scalar: Double) = Vector3i(x - scalar, y - scalar, z - scalar)

    operator fun times(vec: Vector3i) = Vector3i(x * vec.x, y * vec.y, z * vec.z)
    operator fun times(scalar: Int) = Vector3i(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Long) = Vector3i(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Float) = Vector3i(x * scalar, y * scalar, z * scalar)
    operator fun times(scalar: Double) = Vector3i(x * scalar, y * scalar, z * scalar)

    operator fun div(vec: Vector3i) = Vector3i(x / vec.x, y / vec.y, z / vec.z)
    operator fun div(scalar: Int) = Vector3i(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Long) = Vector3i(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Float) = Vector3i(x / scalar, y / scalar, z / scalar)
    operator fun div(scalar: Double) = Vector3i(x / scalar, y / scalar, z / scalar)

    operator fun unaryMinus() = Vector3i(-x, -y, -z)

    fun toVector3() = Vector3(x, y, z)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Vector3i -> (x == other.x && y == other.y && z == other.z)
            else -> false
        }

    override fun compareTo(other: Vector3i): Int {
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