package godot.core

import godot.util.*
import kotlin.math.*

class Quat(
    var x: RealT,
    var y: RealT,
    var z: RealT,
    var w: RealT
) : CoreType {

    //CONSTANTS
    companion object {
        val IDENTITY: Quat
            get() = Quat(0.0, 0.0, 0.0, 1.0)
    }


    //CONSTRUCTOR
    constructor() :
            this(0.0, 0.0, 0.0, 1.0)

    constructor(other: Quat) : this(other.x, other.y, other.z, other.w)

    constructor(x: Number, y: Number, z: Number, w: Number = 1.0) :
            this(x.toRealT(), y.toRealT(), z.toRealT(), w.toRealT())

    constructor(axis: Vector3, angle: RealT) : this() {
        val d: RealT = axis.length()
        if (d == 0.0) {
            set(0.0, 0.0, 0.0, 0.0)
        } else {
            val sinAngle: RealT = sin(angle * 0.5)
            val cosAngle: RealT = cos(angle * 0.5)
            val s: RealT = sinAngle / d
            set(axis.x * s, axis.y * s, axis.z * s, cosAngle)
        }
    }

    constructor(v0: Vector3, v1: Vector3) : this() {
        val c = v0.cross(v1)
        val d = v0.dot(v1)

        if (d < -1.0 + CMP_EPSILON) {
            x = 0.0
            y = 1.0
            z = 0.0
            w = 0.0
        } else {
            val s = sqrt((1.0 + d) * 2.0)
            val rs = 1.0 / s
            x = c.x * rs
            y = c.y * rs
            z = c.z * rs
            w = s * 0.5
        }
    }

    //API
    /**
     * Performs a cubic spherical-linear interpolation with another quaternion.
     */
    fun cubicSlerp(q: Quat, prep: Quat, postq: Quat, t: RealT): Quat {
        val t2: RealT = (1.0 - t) * t * 2
        val sp = this.slerp(q, t)
        val sq = prep.slerpni(postq, t)
        return sp.slerpni(sq, t2)
    }

    /**
     * Returns the dot product of two quaternions.5
     */
    fun dot(q: Quat): RealT {
        return x * q.x + y * q.y + z * q.z + w * q.w
    }

    /**
     * Returns Euler angles (in the YXZ convention: first Z, then X, and Y last) corresponding to the rotation represented by the unit quaternion. Returned vector contains the rotation angles in the format (X angle, Y angle, Z angle).
     */
    fun getEuler(): Vector3 {
        return getEulerYxz()
    }

    /**
     * getEulerYxz returns a vector containing the Euler angles in the format
     *(ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * This implementation uses YXZ convention (Z is the first rotation).
     */
    internal fun getEulerYxz(): Vector3 {
        val m = Basis(this)
        return m.getEulerYxz()
    }

    internal fun getEulerXyz(): Vector3 {
        val m = Basis(this)
        return m.getEulerXyz()
    }

    /**
     * Returns the inverse of the quaternion.
     */
    fun inverse(): Quat {
        return Quat(-x, -y, -z, -w)
    }

    /**
     * Returns true if this quaterion and quat are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: Quat): Boolean {
        return isEqualApprox(other.x, x)
                && isEqualApprox(other.y, y)
                && isEqualApprox(other.z, z)
                && isEqualApprox(other.w, w)
    }

    /**
     * Returns whether the quaternion is normalized or not.
     */
    fun isNormalized(): Boolean {
        return abs(lengthSquared() - 1.0) < CMP_EPSILON
    }

    /**
     * Returns the length of the quaternion.
     */
    fun length(): RealT {
        return sqrt(this.lengthSquared())
    }

    /**
     * Returns the length of the quaternion, squared.
     */
    fun lengthSquared(): RealT {
        return dot(this)
    }

    /**
     * Returns a copy of the quaternion, normalized to unit length.
     */
    fun normalized(): Quat {
        return this / this.length()
    }

    internal fun normalize() {
        val l = this.length()
        x /= l
        y /= l
        z /= l
        w /= l
    }

    /**
     * Sets the quaternion to a rotation which rotates around axis by the specified angle, in radians. The axis must be a normalized vector.
     */
    fun setAxisAndAngle(axis: Vector3, angle: RealT) {
        require(axis.isNormalized()) { "Axis must be normalized!" }

        val d = axis.length()
        if (isEqualApprox(d, 0.0)) {
            set(0.0, 0.0, 0.0, 0.0)
        } else {
            val sin = sin(angle * 0.5)
            val cos = cos(angle * 0.5)
            val s = sin / d
            set(axis.x * s, axis.y * s, axis.z * s, cos)
        }
    }

    /**
     * Sets the quaternion to a rotation specified by Euler angles (in the YXZ convention: first Z, then X, and Y last), given in the vector format as (X angle, Y angle, Z angle).
     */
    fun setEuler(p_euler: Vector3) {
        setEulerYxz(p_euler)
    }

    /**
     * setEulerXyz expects a vector containing the Euler angles in the format
     * (ax,ay,az), where ax is the angle of rotation around x axis,
     * and similar for other axes.
     * This implementation uses XYZ convention (Z is the first rotation).
     */
    internal fun setEulerXyz(p_euler: Vector3) {
        val half1: RealT = p_euler.x * 0.5
        val half2: RealT = p_euler.y * 0.5
        val half3: RealT = p_euler.z * 0.5

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: RealT = cos(half1)
        val cos2: RealT = cos(half2)
        val cos3: RealT = cos(half3)
        val sin1: RealT = sin(half1)
        val sin2: RealT = sin(half2)
        val sin3: RealT = sin(half3)

        set(
            sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
            sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
            -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
            sin1 * sin2 * sin3 + cos1 * cos2 * cos3
        )
    }

    internal fun setEulerYxz(p_euler: Vector3) {
        val half1: RealT = p_euler.y * 0.5
        val half2: RealT = p_euler.x * 0.5
        val half3: RealT = p_euler.z * 0.5

        // R = X(a1).Y(a2).Z(a3) convention for Euler angles.
        // Conversion to quaternion as listed in https://ntrs.nasa.gov/archive/nasa/casi.ntrs.nasa.gov/19770024290.pdf (page A-2)
        // a3 is the angle of the first rotation, following the notation in this reference.

        val cos1: RealT = cos(half1)
        val cos2: RealT = cos(half2)
        val cos3: RealT = cos(half3)
        val sin1: RealT = sin(half1)
        val sin2: RealT = sin(half2)
        val sin3: RealT = sin(half3)

        set(
            sin1 * cos2 * sin3 + cos1 * sin2 * cos3,
            sin1 * cos2 * cos3 - cos1 * sin2 * sin3,
            -sin1 * sin2 * cos3 + cos1 * sin2 * sin3,
            sin1 * sin2 * sin3 + cos1 * cos2 * cos3
        )
    }

    /**
     * Performs a spherical-linear interpolation with another quaternion.
     */
    fun slerp(q: Quat, t: RealT): Quat {
        val to1 = Quat()
        val omega: RealT
        var cosom: RealT
        val sinom: RealT
        val scale0: RealT
        val scale1: RealT

        cosom = dot(q)

        if (cosom < 0) {
            cosom = -cosom
            to1.x = -q.x
            to1.y = -q.y
            to1.z = -q.z
            to1.w = -q.w
        } else {
            to1.x = q.x
            to1.y = q.y
            to1.z = q.z
            to1.w = q.w
        }

        if ((1.0 - cosom) > CMP_EPSILON) {
            // standard case (slerp)
            omega = acos(cosom)
            sinom = sin(omega)
            scale0 = sin((1.0 - t) * omega) / sinom
            scale1 = sin(t * omega) / sinom
        } else {
            // "from" and "to" quaternions are very close
            //  ... so we can do a linear interpolation
            scale0 = 1.0 - t
            scale1 = t
        }
        // calculate final values
        return Quat(
            scale0 * x + scale1 * to1.x,
            scale0 * y + scale1 * to1.y,
            scale0 * z + scale1 * to1.z,
            scale0 * w + scale1 * to1.w
        )
    }

    /**
     * Performs a spherical-linear interpolation with another quaterion without checking if the rotation path is not bigger than 90°.
     */
    fun slerpni(q: Quat, t: RealT): Quat {
        val from = this
        val dot: RealT = from.dot(q)

        if (abs(dot) > 0.9999) return from

        val theta = acos(dot)
        val sinT = 1.0 / sin(theta)
        val newFactor: RealT = sin(t * theta) * sinT
        val invFactor: RealT = sin((1.0 - t) * theta) * sinT

        return Quat(
            invFactor * from.x + newFactor * q.x,
            invFactor * from.y + newFactor * q.y,
            invFactor * from.z + newFactor * q.z,
            invFactor * from.w + newFactor * q.w
        )
    }

    /**
     * Transforms the vector v by this quaternion.
     */
    fun xform(v: Vector3): Vector3 {
        var q = this * v
        q *= this.inverse()
        return Vector3(q.x, q.y, q.z)
    }

    fun set(px: RealT, py: RealT, pz: RealT, pw: RealT) {
        x = px
        y = py
        z = pz
        w = pw
    }

    operator fun times(v: Vector3) =
        Quat(
            w * v.x + y * v.z - z * v.y,
            w * v.y + z * v.x - x * v.z,
            w * v.z + x * v.y - y * v.x,
            -x * v.x - y * v.y - z * v.z
        )

    operator fun plus(q2: Quat) = Quat(this.x + q2.x, this.y + q2.y, this.z + q2.z, this.w + q2.w)

    operator fun minus(q2: Quat) = Quat(this.x - q2.x, this.y - q2.y, this.z - q2.z, this.w - q2.w)

    operator fun times(q2: Quat) = Quat(this.x * q2.x, this.y * q2.y, this.z * q2.z, this.w * q2.w)
    operator fun times(scalar: Int) = Quat(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Long) = Quat(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Float) = Quat(x * scalar, y * scalar, z * scalar, w * scalar)
    operator fun times(scalar: Double) = Quat(x * scalar, y * scalar, z * scalar, w * scalar)

    operator fun div(f: RealT) = Quat(x / f, y / f, z / f, w / f)

    operator fun unaryMinus() = Quat(-this.x, -this.y, -this.z, -this.w)

    override fun equals(other: Any?): Boolean =
        when (other) {
            is Quat -> (x == other.x && y == other.y && z == other.z && w == other.w)
            else -> false
        }

    override fun toString(): String {
        return "($x, $y, $z, $w)"
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        result = 31 * result + z.hashCode()
        result = 31 * result + w.hashCode()
        return result
    }

    /*
     * GDScript related members
     */
    constructor(from: Basis) : this() {
        from.getQuat().also {
            set(it.x, it.y, it.z, it.w)
        }
    }
}

operator fun Int.times(quat: Quat) = quat * this
operator fun Long.times(quat: Quat) = quat * this
operator fun Float.times(quat: Quat) = quat * this
operator fun Double.times(quat: Quat) = quat * this
