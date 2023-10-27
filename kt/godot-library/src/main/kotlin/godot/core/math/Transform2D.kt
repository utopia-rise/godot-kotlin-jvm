@file:Suppress("PackageDirectoryMismatch", "unused")

package godot.core

import godot.annotation.CoreTypeHelper
import godot.annotation.CoreTypeLocalCopy
import godot.util.RealT
import godot.util.isEqualApprox
import godot.util.lerpAngle
import godot.util.toRealT
import kotlincompile.definitions.GodotJvmBuildConfig
import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sign
import kotlin.math.sin

class Transform2D(
    p_x: Vector2,
    p_y: Vector2,
    p_origin: Vector2
) : CoreType {

    @PublishedApi
    internal var _x = Vector2(p_x)

    @PublishedApi
    internal var _y = Vector2(p_y)

    @PublishedApi
    internal var _origin = Vector2(p_origin)

    //PROPERTIES
    /** Return a copy of the x Vector2
     * Warning: Writing x.x = 2 will only modify a copy, not the actual object.
     * To modify it, use x().
     * */
    @CoreTypeLocalCopy
    var x
        get() = Vector2(_x)
        set(value) {
            _x = Vector2(value)
        }

    @CoreTypeHelper
    inline fun <T> x(block: Vector2.() -> T): T {
        return _x.block()
    }

    /** Return a copy of the y Vector2
     * Warning: Writing y.x = 2 will only modify a copy, not the actual object.
     * To modify it, use y().
     * */
    @CoreTypeLocalCopy
    var y
        get() = Vector2(_y)
        set(value) {
            _y = Vector2(value)
        }

    @CoreTypeHelper
    inline fun <T> y(block: Vector2.() -> T): T {
        return _y.block()
    }

    /** Return a copy of the origin Vector2
     * Warning: Writing origin.x = 2 will only modify a copy, not the actual object.
     * To modify it, use origin().
     * */
    @CoreTypeLocalCopy
    var origin
        get() = Vector2(_origin)
        set(value) {
            _origin = Vector2(value)
        }

    @CoreTypeHelper
    inline fun <T> origin(block: Vector2.() -> T): T {
        return _origin.block()
    }


    //CONSTANTS
    companion object {
        inline val IDENTITY: Transform2D
            get() = Transform2D(1, 0, 0, 1, 0, 0)
        inline val FLIP_X: Transform2D
            get() = Transform2D(-1, 0, 0, 1, 0, 0)
        inline val FLIP_Y: Transform2D
            get() = Transform2D(1, 0, 0, -1, 0, 0)
    }


    //CONSTRUCTOR
    constructor() : this(Vector2(1, 0), Vector2(0, 1), Vector2())

    constructor(other: Transform2D) : this(other._x, other._y, other._origin)

    constructor(rotation: Number, position: Vector2) : this(
        Vector2(cos(rotation.toRealT()), sin(rotation.toRealT())),
        Vector2(-sin(rotation.toRealT()), cos(rotation.toRealT())),
        position
    )

    constructor(rotation: Number, scale: Vector2, skew: Number, position: Vector2) : this(
        Vector2(
            cos(rotation.toRealT()) * scale.x,
            sin(rotation.toRealT()) * scale.x
        ),
        Vector2(
            -sin(rotation.toRealT() + skew.toRealT()) * scale.y,
            cos(rotation.toRealT() + skew.toRealT()) * scale.y
        ),
        position
    )

    constructor(xx: Number, xy: Number, yx: Number, yy: Number, ox: Number, oy: Number) : this(
        Vector2(xx.toRealT(), xy.toRealT()),
        Vector2(yx.toRealT(), yy.toRealT()),
        Vector2(ox.toRealT(), oy.toRealT())
    )

    //API
    /**
     * Returns the inverse of the matrix.
     */
    fun affineInverse(): Transform2D {
        val inv = Transform2D(this._x, this._y, this._origin)
        inv.affineInvert()
        return inv
    }

    /**
     * Returns the inverse of the matrix.
     */
    internal fun affineInvert() {
        val det = determinant()
        if (GodotJvmBuildConfig.DEBUG) {
            require(!det.isEqualApprox(0.0)) { "Determinant is 0!" }
        }
        val idet = -1.0 / det
        val copy = _x.x
        _x.x = _y.y
        _y.y = copy
        this._x *= Vector2(idet, -idet)
        this._y *= Vector2(-idet, idet)

        this._origin = basisXform(-this._origin)
    }

    private fun determinant(): RealT {
        return this._x.x * this._y.y - this._x.y * this._y.x
    }

    /**
     * Transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXform(v: Vector2) = Vector2(tdotx(v), tdoty(v))

    /**
     * Inverse-transforms the given vector by this transform’s basis (no translation).
     */
    fun basisXformInv(v: Vector2) = Vector2(this._x.dot(v), this._y.dot(v))

    /**
     * Returns the transform’s rotation (in radians).
     */
    fun getRotation(): RealT {
        return atan2(_x.y, _x.x)
    }

    /**
     * Returns the scale.
     */
    fun getScale(): Vector2 {
        val detSign: RealT = if (determinant() > 0.0) 1.0 else -1.0
        return detSign * Vector2(this._x.length(), this._y.length())
    }

    /**
     * Returns the transform's skew (in radians).
     */
    fun getSkew(): RealT {
        val det = determinant();
        return acos(x.normalized().dot(det.sign * y.normalized())) - PI * 0.5f;
    }

    /**
     * Returns a transform interpolated between this transform and another by a given weight (0-1).
     */
    fun interpolateWith(transform: Transform2D, weight: RealT): Transform2D {
        return Transform2D(
            lerpAngle(getRotation(), transform.getRotation(), weight),
            getScale().lerp(transform.getScale(), weight),
            lerpAngle(getSkew(), transform.getSkew(), weight),
            origin.lerp(transform.origin, weight)
        );
    }

    /**
     * Returns the inverse of the transform, under the assumption that the transformation is composed of rotation and translation (no scaling, use affine_inverse for transforms with scaling).
     */
    fun inverse(): Transform2D {
        val inv = Transform2D(this._x, this._y, this._origin)
        inv.invert()
        return inv
    }

    internal fun invert() {
        val copy = _x.y
        _x.y = _y.x
        _y.x = copy
        _origin = basisXform(-_origin)
    }

    /**
     * Returns true if this transform and transform are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(transform: Transform2D): Boolean {
        return transform._x.isEqualApprox(this._x)
            && transform._y.isEqualApprox(this._y)
            && transform._origin.isEqualApprox(this._origin)
    }

    /**
     * Returns true if this transform is finite, by calling @GlobalScope.is_finite on each component.
     */
    fun isFinite() = x.isFinite() && y.isFinite() && origin.isFinite()

    /**
     * Returns the transform with the basis orthogonal (90 degrees), and normalized axis vectors.
     */
    fun orthonormalized(): Transform2D {
        val on = Transform2D(this._x, this._y, this._origin)
        on.orthonormalize()
        return on
    }

    internal fun orthonormalize() {
        val x = this._x
        var y = this._y

        x.normalize()
        y = (y - x * (x.dot(y)))
        y.normalize()

        this._x = x
        this._y = y
    }

    /**
     * Returns a copy of the transform rotated by the given angle (in radians).
     * This method is an optimized version of multiplying the given transform X with a corresponding rotation transform R from the left, i.e., R * X.
     * This can be seen as transforming with respect to the global/parent frame.
     */
    fun rotated(phi: RealT): Transform2D {
        return Transform2D(phi, Vector2()) * this
    }

    /**
     * Returns a copy of the transform rotated by the given angle (in radians).
     * This method is an optimized version of multiplying the given transform X with a corresponding rotation transform R from the right, i.e., X * R.
     * This can be seen as transforming with respect to the local frame.
     */
    fun rotatedLocal(phi: RealT): Transform2D {
        return this * Transform2D(phi, Vector2())
    }


    /**
     * Returns a copy of the transform scaled by the given scale factor.
     * This method is an optimized version of multiplying the given transform X with a corresponding scaling transform S from the left, i.e., S * X.
     * This can be seen as transforming with respect to the global/parent frame.
     */
    fun scaled(scale: Vector2): Transform2D {
        val copy = Transform2D(this._x, this._y, this._origin)
        copy.scale(scale)
        return copy
    }

    internal fun scale(scale: Vector2) {
        scaleBasis(scale)
        this._origin *= scale
    }

    private fun scaleBasis(scale: Vector2) {
        _x.x *= scale.x
        _x.y *= scale.y
        this._y[0] *= scale.x
        _y.y *= scale.y
    }

    /**
     * Returns a copy of the transform scaled by the given scale factor.
     * This method is an optimized version of multiplying the given transform X with a corresponding scaling transform S from the right, i.e., X * S.
     * This can be seen as transforming with respect to the local frame.
     */
    fun scaledLocal(scale: Vector2): Transform2D {
        return Transform2D(this._x * scale.x, this._y * scale.y, this._origin)
    }

    /**
     * Returns a copy of the transform translated by the given offset.
     * This method is an optimized version of multiplying the given transform X with a corresponding translation transform T from the left, i.e., T * X.
     * This can be seen as transforming with respect to the global/parent frame.
     */
    fun translated(offset: Vector2): Transform2D {
        return Transform2D(this._x, this._y, this._origin + offset)
    }

    /**
     * Returns a copy of the transform translated by the given offset.
     * This method is an optimized version of multiplying the given transform X with a corresponding translation transform T from the right, i.e., X * T.
     * This can be seen as transforming with respect to the local frame.
     */
    fun translatedLocal(offset: Vector2): Transform2D {
        return Transform2D(this._x, this._y, this._origin + basisXform(offset))
    }


    /**
     * Transforms the given Vector2 by this transform.
     */
    private fun xform(v: Vector2): Vector2 {
        return Vector2(tdotx(v), tdoty(v)) + this._origin
    }

    /**
     * Transforms the given Rect2 by this transform.
     */
    private fun xform(rect: Rect2): Rect2 {
        val x = this._x * rect._size.x
        val y = this._y * rect._size.y
        val pos = xform(rect._position)

        val newRect = Rect2()
        newRect._position = pos
        newRect.expandTo(pos + x)
        newRect.expandTo(pos + y)
        newRect.expandTo(pos + x + y)
        return newRect
    }

    /**
     * Inverse-transforms the given Vector2 by this transform.
     */
    private fun xformInv(vec: Vector2): Vector2 {
        val v = vec - this._origin
        return Vector2(this._x.dot(v), this._y.dot(v))
    }

    /**
     * Inverse-transforms the given Rect2 by this transform.
     */
    private fun xformInv(rect: Rect2): Rect2 {
        val ends = arrayOf(
            xformInv(rect._position),
            xformInv(Vector2(rect._position.x, rect._position.y + rect._size.y)),
            xformInv(Vector2(rect._position.x + rect._size.x, rect._position.y + rect._size.y)),
            xformInv(Vector2(rect._position.x + rect._size.x, rect._position.y))
        )

        val newRect = Rect2()
        newRect._position = ends[0]
        newRect.expandTo(ends[1])
        newRect.expandTo(ends[2])
        newRect.expandTo(ends[3])

        return newRect
    }

    private fun tdotx(v: Vector2): RealT {
        return _x.x * v.x + _y.x * v.y
    }

    private fun tdoty(v: Vector2): RealT {
        return _x.y * v.x + _y.y * v.y
    }

    operator fun times(other: Transform2D): Transform2D {
        val origin = xform(other._origin)
        val x0 = tdotx(other._x)
        val x1 = tdoty(other._x)
        val y0 = tdotx(other._y)
        val y1 = tdoty(other._y)

        return Transform2D(x0, x1, y0, y1, origin.x, origin.y)
    }

    override fun toString(): String {
        return "${this._x}, ${this._y}, ${this._origin}"
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Transform2D -> this._x == other._x && this._y == other._y && this._origin == other._origin
        else -> false
    }

    override fun hashCode(): Int {
        var result = _x.hashCode()
        result = 31 * result + _y.hashCode()
        result = 31 * result + _origin.hashCode()
        return result
    }
}
