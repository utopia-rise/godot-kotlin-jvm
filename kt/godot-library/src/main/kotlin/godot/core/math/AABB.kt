@file:Suppress("PackageDirectoryMismatch", "unused")

package godot.core

import godot.annotation.CoreTypeHelper
import godot.annotation.CoreTypeLocalCopy
import godot.util.RealT
import kotlincompile.definitions.GodotJvmBuildConfig
import kotlin.math.min

class AABB(
    position: Vector3,
    size: Vector3
) : CoreType {

    @PublishedApi
    internal var _position = Vector3(position)

    @PublishedApi
    internal var _size = Vector3(size)


    //PROPERTIES
    /** Return a copy of the position Vector3
     * Warning: Writing position.x = 2 will only modify a copy, not the actual object.
     * To modify it, use position().
     * */
    @CoreTypeLocalCopy
    var position
        get() = Vector3(_position)
        set(value) {
            _position = Vector3(value)
        }

    @CoreTypeHelper
    inline fun <T> position(block: Vector3.() -> T): T {
        return _position.block()
    }

    /** Return a copy of the size Vector3
     * Warning: Writing size.x = 2 will only modify a copy, not the actual object.
     * To modify it, use size().
     * */
    @CoreTypeLocalCopy
    var size
        get() = Vector3(_size)
        set(value) {
            _size = Vector3(value)
        }

    @CoreTypeHelper
    inline fun <T> size(block: Vector3.() -> T): T {
        return _size.block()
    }

    /** Return a copy of the end Vector3
     * Warning: Writing end.x = 2 will only modify a copy, not the actual object.
     * To modify it, use end().
     * */
    @CoreTypeLocalCopy
    inline var end: Vector3
        get() = _position + _size
        set(value) {
            _size = value - _position
        }

    @CoreTypeHelper
    inline fun <T> end(block: Vector3.() -> T): T {
        val vec = end
        val ret = vec.block()
        end = vec
        return ret
    }


    //CONSTRUCTOR
    constructor() :
        this(Vector3(), Vector3())

    constructor(other: AABB) :
        this(other._position, other._size)

    //API
    /**
     * Returns an AABB with equivalent position and size, modified so that the most-negative corner is the origin and
     * the size is positive.
     */
    fun abs() = AABB(
        Vector3(
            position.x + min(size.x, 0.0),
            position.y + min(size.y, 0.0),
            position.z + min(size.z, 0.0)
        ),
        size.abs()
    )

    /**
     * Returns true if this AABB completely encloses another one.
     */
    fun encloses(other: AABB): Boolean {
        val srcMin = _position
        val srcMax = _position + _size
        val dstMin = other._position
        val dstMax = other._position + other._size
        return ((srcMin.x <= dstMin.x) &&
            (srcMax.x >= dstMax.x) &&
            (srcMin.y <= dstMin.y) &&
            (srcMax.y >= dstMax.y) &&
            (srcMin.z <= dstMin.z) &&
            (srcMax.z >= dstMax.z))
    }

    /**
     * Returns this AABB expanded to include a given point.
     */
    fun expand(p_vector: Vector3): AABB {
        val aabb = AABB(this)
        aabb.expandTo(p_vector)
        return aabb
    }

    internal fun expandTo(vector: Vector3) {
        val begin = _position
        val end = _position + _size

        if (vector.x < begin.x) {
            begin.x = vector.x
        }
        if (vector.y < begin.y) {
            begin.y = vector.y
        }
        if (vector.z < begin.z) {
            begin.z = vector.z
        }

        if (vector.x > end.x) {
            end.x = vector.x
        }
        if (vector.y > end.y) {
            end.y = vector.y
        }
        if (vector.z > end.z) {
            end.z = vector.z
        }

        _position = begin
        _size = end - begin
    }

    /**
     * Returns the center of the [AABB], which is equal to [position] + ([size] / 2).
     */
    fun getCenter() = position + (size * 0.5)

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getEndpoint(point: Int): Vector3 {
        return when (point) {
            0 -> Vector3(_position.x, _position.y, _position.z)
            1 -> Vector3(_position.x, _position.y, _position.z + _size.z)
            2 -> Vector3(_position.x, _position.y + _size.y, _position.z)
            3 -> Vector3(_position.x, _position.y + _size.y, _position.z + _size.z)
            4 -> Vector3(_position.x + _size.x, _position.y, _position.z)
            5 -> Vector3(_position.x + _size.x, _position.y, _position.z + _size.z)
            6 -> Vector3(_position.x + _size.x, _position.y + _size.y, _position.z)
            7 -> Vector3(_position.x + _size.x, _position.y + _size.y, _position.z + _size.z)
            else -> Vector3()
        }
    }

    /**
     * Returns the normalized longest axis of the AABB.
     */
    fun getLongestAxisVector(): Vector3 {
        var axis = Vector3.RIGHT
        var maxSize = _size.x

        if (_size.y > maxSize) {
            axis = Vector3.UP
            maxSize = _size.y
        }

        if (_size.z > maxSize) {
            axis = Vector3.BACK
        }

        return axis
    }

    /**
     * Returns the index of the longest axis of the AABB (according to Vector3’s AXIS_* constants).
     */
    fun getLongestAxis(): Vector3.Axis {
        var axis = 0L
        var maxSize = _size.x

        if (_size.y > maxSize) {
            axis = 1L
            maxSize = _size.y
        }

        if (_size.z > maxSize) {
            axis = 2L
        }

        return Vector3.Axis.from(axis)
    }

    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getLongestAxisSize(): RealT {
        var maxSize = _size.x
        if (_size.y > maxSize) {
            maxSize = _size.y
        }
        if (_size.z > maxSize) {
            maxSize = _size.z
        }
        return maxSize
    }


    /**
     *  Returns the scalar length of the longest axis of the AABB.
     */
    fun getShortestAxisVector(): Vector3 {
        var axis = Vector3.RIGHT
        var minSize = _size.x

        if (_size.y < minSize) {
            axis = Vector3.UP
            minSize = _size.y
        }

        if (_size.z < minSize) {
            axis = Vector3.BACK
        }

        return axis
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxis(): Vector3.Axis {
        var axis = 0L
        var maxSize = _size.x

        if (_size.y < maxSize) {
            axis = 1L
            maxSize = _size.y
        }

        if (_size.z < maxSize) {
            axis = 2L
        }

        return Vector3.Axis.from(axis)
    }

    /**
     * Gets the position of the 8 endpoints of the AABB in space.
     */
    fun getShortestAxisSize(): RealT {
        var minSize = _size.x
        if (_size.y < minSize) {
            minSize = _size.y
        }

        if (_size.z < minSize) {
            minSize = _size.z
        }

        return minSize
    }

    /**
     * Returns the support point in a given direction. This is useful for collision detection algorithms.
     */
    fun getSupport(normal: Vector3): Vector3 {
        val halfExtents = _size * 0.5
        val ofs = _position + halfExtents

        return Vector3(
            if (normal.x > 0.0) halfExtents.x else -halfExtents.x,
            if (normal.y > 0.0) halfExtents.y else -halfExtents.y,
            if (normal.z > 0.0) halfExtents.z else -halfExtents.z
        ) + ofs
    }

    /**
     * Returns the volume of the AABB.
     */
    fun getVolume(): RealT {
        return _size.x * _size.y * _size.z
    }

    /**
     * Returns a copy of the AABB grown a given amount of units towards all the sides.
     */
    fun grow(p_by: RealT): AABB {
        val aabb = AABB(this)
        aabb.growBy(p_by)
        return aabb
    }

    internal fun growBy(amount: RealT) {
        _position.x -= amount
        _position.y -= amount
        _position.z -= amount
        _size.x += 2.0 * amount
        _size.y += 2.0 * amount
        _size.z += 2.0 * amount
    }

    /**
     * Returns true if the AABB contains a point.
     */
    fun hasPoint(point: Vector3): Boolean {
        return when {
            point.x < _position.x -> false
            point.y < _position.y -> false
            point.z < _position.z -> false
            point.x > _position.x + _size.x -> false
            point.y > _position.y + _size.y -> false
            point.z > _position.z + _size.z -> false
            else -> true
        }
    }

    /**
     * Returns `true` if the [AABB] has a surface or a length, and `false` if the [AABB] is empty (all components of
     * [size] are zero or negative).
     */
    fun hasSurface(): Boolean {
        return (_size.x > 0.0 || _size.y > 0.0 || _size.z > 0.0)
    }

    /**
     * Returns `true` if the [AABB] has a volume, and `false` if the [AABB] is flat, empty, or has a negative [size].
     */
    fun hasVolume(): Boolean {
        return (_size.x > 0.0 && _size.y > 0.0 && _size.z > 0.0)
    }

    /**
     * Returns the intersection between two AABB. An empty AABB (size 0,0,0) is returned on failure.
     */
    fun intersection(other: AABB): AABB {
        val srcMin = _position
        val srcMax = _position + _size
        val dstMin = other._position
        val dstMax = other._position + other._size

        val min = Vector3()
        val max = Vector3()

        if (srcMin.x > dstMax.x || srcMax.x < dstMin.x) {
            return AABB()
        } else {
            min.x = if (srcMin.x > dstMin.x) srcMin.x else dstMin.x
            max.x = if (srcMax.x < dstMax.x) srcMax.x else dstMax.x
        }

        if (srcMin.y > dstMax.y || srcMax.y < dstMin.y) {
            return AABB()
        } else {
            min.y = if (srcMin.y > dstMin.y) srcMin.y else dstMin.y
            max.y = if (srcMax.y < dstMax.y) srcMax.y else dstMax.y
        }

        if (srcMin.z > dstMax.z || srcMax.z < dstMin.z) {
            return AABB()
        } else {
            min.z = if (srcMin.z > dstMin.z) srcMin.z else dstMin.z
            max.z = if (srcMax.z < dstMax.z) srcMax.z else dstMax.z
        }

        return AABB(min, max - min)
    }

    /**
     * Returns true if the AABB overlaps with another.
     */
    fun intersects(other: AABB): Boolean {
        return when {
            _position.x >= (other._position.x + other._size.x) -> false
            (_position.x + _size.x) <= other._position.x -> false
            _position.y >= (other._position.y + other._size.y) -> false
            (_position.y + _size.y) <= other._position.y -> false
            _position.z >= (other._position.z + other._size.z) -> false
            (_position.z + _size.z) <= other._position.z -> false
            else -> true
        }
    }

    /**
     * Returns true if the AABB is on both sides of a plane.
     */
    fun intersectsPlane(p_plane: Plane): Boolean {
        val points = arrayOf(
            Vector3(_position.x, _position.y, _position.z),
            Vector3(_position.x, _position.y, _position.z + _size.z),
            Vector3(_position.x, _position.y + _size.y, _position.z),
            Vector3(_position.x, _position.y + _size.y, _position.z + _size.z),
            Vector3(_position.x + _size.x, _position.y, _position.z),
            Vector3(_position.x + _size.x, _position.y, _position.z + _size.z),
            Vector3(_position.x + _size.x, _position.y + _size.y, _position.z),
            Vector3(_position.x + _size.x, _position.y + _size.y, _position.z + _size.z)
        )

        var over = false
        var under = false
        for (i in 0..7) {
            if (p_plane.distanceTo(points[i]) > 0)
                over = true
            else
                under = true
        }

        return under && over
    }

    /**
     * Returns `true` if the given ray intersects with this [AABB]. Ray length is infinite.
     */
    fun intersectsRay(from: Vector3, dir: Vector3): Boolean {
        if (GodotJvmBuildConfig.DEBUG) {
            require(size.x >= 0 && size.y >= 0 && size.z >= 0) {
                "AABB size is negative, this is not supported. Use AABB.abs() to get an AABB with a positive size."
            }
        }

        var c1 = Vector3()
        var c2 = Vector3()
        val end = position + size
        var near = -1e20
        var far = 1e20

        for (i in 0..2) {
            if (dir[i] == 0.0) {
                if (from[i] < position[i] || from[i] > end[i]) {
                    return false
                }
            } else { // ray not parallel to planes in this direction
                c1[i] = (position[i] - from[i]) / dir[i]
                c2[i] = (end[i] - from[i]) / dir[i]
                if (c1[i] > c2[i]) {
                    val aux = c1
                    c1 = c2
                    c2 = aux
                }
                if (c1[i] > near) {
                    near = c1[i]
                }
                if (c2[i] < far) {
                    far = c2[i]
                }
                if (near > far || far < 0) {
                    return false
                }
            }
        }

        return true
    }

    /**
     * Returns true if the AABB intersects the line segment between from and to.
     */
    fun intersectsSegment(from: Vector3, to: Vector3): Boolean {
        var min = 0.0
        var max = 1.0

        for (i in 0..2) {
            val segFrom = from[i]
            val segTo = to[i]
            val boxBegin = _position[i]
            val boxEnd = boxBegin + _size[i]
            val cmin: RealT
            val cmax: RealT

            if (segFrom < segTo) {
                if (segFrom > boxEnd || segTo < boxBegin) {
                    return false
                }
                val length = segTo - segFrom
                cmin = if (segFrom < boxBegin) ((boxBegin - segFrom) / length) else 0.0
                cmax = if (segTo > boxEnd) ((boxEnd - segFrom) / length) else 1.0
            } else {
                if (segTo > boxEnd || segFrom < boxBegin) {
                    return false
                }
                val length = segTo - segFrom
                cmin = if (segFrom > boxEnd) (boxEnd - segFrom) / length else 0.0
                cmax = if (segTo < boxBegin) (boxBegin - segFrom) / length else 1.0
            }
            if (cmin > min) {
                min = cmin
            }
            if (cmax < max)
                max = cmax
            if (max < min) {
                return false
            }
        }
        return true
    }

    /**
     * Returns true if this AABB and aabb are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(other: AABB): Boolean {
        return this._position.isEqualApprox(other._position) && this._size.isEqualApprox(other._size)
    }

    /**
     * Returns `true` if this [AABB] is finite, by calling [Vector3.isFinite] on each component.
     */
    fun isFinite() = position.isFinite() && size.isFinite()

    /**
     * Returns a larger AABB that contains both this AABB and with.
     */
    fun merge(p_with: AABB): AABB {
        val aabb = AABB(this)
        aabb.mergeWith(p_with)
        return aabb
    }

    internal fun mergeWith(other: AABB) {
        val beg1 = _position
        val beg2 = other._position
        val end1 = _position + _size
        val end2 = other._position + other._size

        val min = Vector3()
        val max = Vector3()

        min.x = if (beg1.x < beg2.x) beg1.x else beg2.x
        min.y = if (beg1.y < beg2.y) beg1.y else beg2.y
        min.z = if (beg1.z < beg2.z) beg1.z else beg2.z

        max.x = if (end1.x > end2.x) end1.x else end2.x
        max.y = if (end1.y > end2.y) end1.y else end2.y
        max.z = if (end1.z > end2.z) end1.z else end2.z

        _position = min
        _size = max - min
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is AABB -> (_position == other._position && _size == other._size)
        else -> false
    }

    override fun toString(): String {
        return "[P: $position, S: $size]"
    }

    override fun hashCode(): Int {
        var result = _position.hashCode()
        result = 31 * result + _size.hashCode()
        return result
    }
}
