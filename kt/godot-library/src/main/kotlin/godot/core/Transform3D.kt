package godot.core

import godot.annotation.CoreTypeHelper
import godot.util.RealT

class Transform3D(
    p_basis: Basis,
    p_origin: Vector3 = Vector3()
) : CoreType {

    @PublishedApi
    internal var _basis = Basis(p_basis)

    @PublishedApi
    internal var _origin = Vector3(p_origin)


    //PROPERTIES
    /** Return a copy of the basis Basis.
     * Warning: Writing basis.x = 2 will only modify a copy, not the actual object.
     * To modify it, use basis().
     * */
    var basis
        get() = Basis(_basis)
        set(value) {
            _basis = Basis(value)
        }

    @CoreTypeHelper
    inline fun <T> basis(block: Basis.() -> T): T {
        return _basis.block()
    }

    /** Return a copy of the origin Vector3
     * Warning: Writing origin.x = 2 will only modify a copy, not the actual object.
     * To modify it, use origin().
     * */
    var origin
        get() = Vector3(_origin)
        set(value) {
            _origin = Vector3(value)
        }

    @CoreTypeHelper
    inline fun <T> origin(block: Vector3.() -> T): T {
        return _origin.block()
    }


    //CONSTANTS
    companion object {
        inline val IDENTITY: Transform3D
            get() = Transform3D(Basis(1, 0, 0, 0, 1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_X: Transform3D
            get() = Transform3D(Basis(-1, 0, 0, 0, 1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_Y: Transform3D
            get() = Transform3D(Basis(1, 0, 0, 0, -1, 0, 0, 0, 1), Vector3(0, 0, 0))
        inline val FLIP_Z: Transform3D
            get() = Transform3D(Basis(1, 0, 0, 0, 1, 0, 0, 0, -1), Vector3(0, 0, 0))
    }


    //CONSTRUCTOR
    constructor() :
        this(Basis(), Vector3(0, 0, 0))

    constructor(other: Transform3D) :
        this(other._basis, other._origin)

    constructor(
        xx: Number,
        xy: Number,
        xz: Number,
        yx: Number,
        yy: Number,
        yz: Number,
        zx: Number,
        zy: Number,
        zz: Number,
        tx: Number,
        ty: Number,
        tz: Number
    ) :
        this(Basis(xx, xy, xz, yx, yy, yz, zx, zy, zz), Vector3(tx, ty, tz))

    constructor(from: Quaternion) :
        this(Basis(from))

    //API
    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation, scaling and translation.
     */
    fun affineInverse(): Transform3D {
        val ret = Transform3D(this._basis, this._origin)
        ret.affineInvert()
        return ret
    }

    internal fun affineInvert() {
        _basis.invert()
        _origin = _basis.xform(-_origin)
    }

    /**
     * Interpolates the transform to other Transform by weight amount (0-1).
     */
    fun interpolateWith(transform3D: Transform3D, c: RealT): Transform3D {
        val srcScale = _basis.getScale()
        val srcRot = Quaternion(_basis)
        val srcLoc = _origin

        val dstScale = transform3D._basis.getScale()
        val dstRot = Quaternion(transform3D._basis)
        val dstLoc = transform3D._origin

        val dst = Transform3D()
        dst._basis = Basis(srcRot.slerp(dstRot, c))
        dst._basis.scale(srcScale.lerp(dstScale, c))
        dst._origin = srcLoc.lerp(dstLoc, c)

        return dst
    }

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform3D {
        val ret = Transform3D(this._basis, this._origin)
        ret.invert()
        return ret
    }

    internal fun invert() {
        _basis.transpose()
        _origin = _basis.xform(-_origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform3D: Transform3D): Boolean {
        return transform3D._basis.isEqualApprox(this._basis) && transform3D._origin.isEqualApprox(this._origin)
    }

    /**
     * Returns true if this transform is finite, by calling @GlobalScope.is_finite on each component.
     */
    fun isFinite() = basis.isFinite() && origin.isFinite()

    /**
     * Returns a copy of the transform rotated such that the forward axis (-Z) points towards the [target] position.
     * The up axis (+Y) points as close to the [up] vector as possible while staying perpendicular to the forward axis. The resulting transform is orthonormalized. The existing rotation, scale, and skew information from the original transform is discarded. The [target] and [up] vectors cannot be zero, cannot be parallel to each other, and are defined in global/parent space.
     * If [useModelFront] is true, the +Z axis (asset front) is treated as forward (implies +X is left) and points toward the [target] position. By default, the -Z axis (camera forward) is treated as forward (implies +X is right).
     */
    fun lookingAt(target: Vector3, up: Vector3 = Vector3(0, 1, 0), useModelFront: Boolean = false): Transform3D {
        val t = Transform3D(this._basis, this._origin)
        t.setLookAt(_origin, target, up, useModelFront)
        return t
    }

    internal fun setLookAt(eye: Vector3, target: Vector3, up: Vector3, useModelFront: Boolean) {
        require(!eye.isEqualApprox(target)) {
            "The eye and target vectors can't be equal."
        }
        _basis = Basis.lookingAt(target - eye, up, useModelFront);
        _origin = Vector3(eye)
    }

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform3D {
        val t = Transform3D(this._basis, this._origin)
        t.orthonormalize()
        return t
    }

    internal fun orthonormalize() {
        _basis.orthonormalize()
    }


    /**
     * Rotates the transform around the given axis by the given angle (in radians), using matrix multiplication. The axis must be a normalized vector.
     */
    fun rotated(axis: Vector3, phi: RealT): Transform3D {
        return Transform3D(Basis(axis, phi), Vector3()) * this
    }

    internal fun rotate(axis: Vector3, phi: RealT) {
        val t = rotated(axis, phi)
        this._basis = t._basis
        this._origin = t._origin
    }

    /**
     * Scales basis and origin of the transform by the given scale factor, using matrix multiplication.
     */
    fun scaled(scale: Vector3): Transform3D {
        val t = Transform3D(this._basis, this._origin)
        t.scale(scale)
        return t
    }

    fun scale(scale: Vector3) {
        _basis.scale(scale)
        _origin *= scale
    }

    /**
     * Translates the transform by the given offset, relative to the transform’s basis vectors.
     * Unlike rotated and scaled, this does not use matrix multiplication.
     */
    fun translated(translation: Vector3): Transform3D {
        val t = Transform3D(this._basis, this._origin)
        t.translate(translation)
        return t
    }

    fun translate(translation: Vector3) {
        _origin.x += _basis._x.dot(translation)
        _origin.y += _basis._y.dot(translation)
        _origin.z += _basis._z.dot(translation)
    }

    /**
     * Transforms the given Vector3 by this transform.
     */
    fun xform(vector: Vector3): Vector3 =
        Vector3(
            _basis._x.dot(vector) + _origin.x,
            _basis._y.dot(vector) + _origin.y,
            _basis._z.dot(vector) + _origin.z
        )

    /**
     * Transforms the given AABB by this transform.
     */
    fun xform(aabb: AABB): AABB {
        val x = _basis._x * aabb._size.x
        val y = _basis._y * aabb._size.y
        val z = _basis._z * aabb._size.z
        val pos = xform(aabb._position)

        val newAabb = AABB()
        newAabb._position = pos
        newAabb.expandTo(pos + x)
        newAabb.expandTo(pos + y)
        newAabb.expandTo(pos + z)
        newAabb.expandTo(pos + x + y)
        newAabb.expandTo(pos + x + z)
        newAabb.expandTo(pos + y + z)
        newAabb.expandTo(pos + x + y + z)
        return newAabb
    }

    /**
     * Transforms the given Plane by this transform.
     */
    fun xform(plane: Plane): Plane {
        var point = plane._normal * plane.d
        var pointDir = point + plane._normal
        point = xform(point)
        pointDir = xform(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    /**
     * Inverse-transforms the given Vector3 by this transform.
     */
    fun xformInv(vector: Vector3): Vector3 {
        val v = vector - _origin
        return Vector3(
            (_basis._x.x * v.x) + (_basis._y.x * v.y) + (_basis._z.x * v.z),
            (_basis._x.y * v.x) + (_basis._y.y * v.y) + (_basis._z.y * v.z),
            (_basis._x.z * v.x) + (_basis._y.z * v.y) + (_basis._z.z * v.z)
        )
    }

    /**
     * Inverse-transforms the given Plane by this transform.
     */
    fun xformInv(plane: Plane): Plane {
        var point = plane._normal * plane.d
        var pointDir = point + plane._normal
        point = xformInv(point)
        pointDir = xformInv(pointDir)

        val normal = pointDir - point
        normal.normalize()

        return Plane(normal, normal.dot(point))
    }

    /**
     * Inverse-transforms the given AABB by this transform.
     */
    fun xformInv(aabb: AABB): AABB {
        val vertices = arrayOf(
            Vector3(aabb._position.x + aabb._size.x, aabb._position.y + aabb._size.y, aabb._position.z + aabb._size.z),
            Vector3(aabb._position.x + aabb._size.x, aabb._position.y + aabb._size.y, aabb._position.z),
            Vector3(aabb._position.x + aabb._size.x, aabb._position.y, aabb._position.z + aabb._size.z),
            Vector3(aabb._position.x + aabb._size.x, aabb._position.y, aabb._position.z),
            Vector3(aabb._position.x, aabb._position.y + aabb._size.y, aabb._position.z + aabb._size.z),
            Vector3(aabb._position.x, aabb._position.y + aabb._size.y, aabb._position.z),
            Vector3(aabb._position.x, aabb._position.y, aabb._position.z + aabb._size.z),
            Vector3(aabb._position.x, aabb._position.y, aabb._position.z)
        )

        val ret = AABB()
        ret._position = xformInv(vertices[0])
        for (i in 1..7)
            ret.expandTo(xformInv(vertices[i]))

        return ret
    }

    operator fun times(transform3D: Transform3D): Transform3D {
        val t = this
        t._origin = xform(transform3D._origin)
        t._basis *= transform3D._basis
        return t
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Transform3D -> _basis == other._basis && _origin == other._origin
            else -> false
        }
    }

    override fun toString(): String {
        return "$_basis - $_origin"
    }

    override fun hashCode(): Int {
        var result = _basis.hashCode()
        result = 31 * result + _origin.hashCode()
        return result
    }

    /*
     * GDScript related members
     */
    constructor(x: Vector3, y: Vector3, z: Vector3, origin: Vector3) :
        this(Basis(x, y, z), origin)
}
