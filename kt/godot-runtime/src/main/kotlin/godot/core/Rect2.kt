package godot.core

import godot.util.*
import kotlin.math.max
import kotlin.math.min

class Rect2(
    p_position: Vector2,
    p_size: Vector2
) : CoreType {

    @PublishedApi
    internal var _position = Vector2(p_position)
    @PublishedApi
    internal var _size = Vector2(p_size)


    //PROPERTIES
    /** Return a copy of the position Vector3
     * Warning: Writing position.x = 2 will only modify a copy, not the actual object.
     * To modify it, use position().
     * */
    var position
        get() = Vector2(_position)
        set(value) {
            _position = Vector2(value)
        }

    inline fun <T> position(block: Vector2.() -> T): T {
        return _position.block()
    }

    /** Return a copy of the size Vector2
     * Warning: Writing size.x = 2 will only modify a copy, not the actual object.
     * To modify it, use size().
     * */
    var size
        get() = Vector2(_size)
        set(value) {
            _size = Vector2(value)
        }

    inline fun <T> size(block: Vector2.() -> T): T {
        return _size.block()
    }

    /** Return a copy of the end Vector2
     * Warning: Writing end.x = 2 will only modify a copy, not the actual object.
     * To modify it, use end().
     * */
    inline var end: Vector2
        get() = _position + _size
        set(value) {
            _size = value - _position
        }

    inline fun <T> end(block: Vector2.() -> T): T {
        val vec = end
        val ret = vec.block()
        end = vec
        return ret
    }

    //CONSTANTS
    enum class Margin(val value: Int) {
        LEFT(0),
        TOP(1),
        RIGHT(2),
        BOTTOM(3)
    }

    companion object {
        val MARGIN_LEFT = Margin.LEFT.value
        val MARGIN_TOP = Margin.TOP.value
        val MARGIN_RIGHT = Margin.RIGHT.value
        val MARGIN_BOTTOM = Margin.BOTTOM.value
    }

    //CONSTRUCTOR
    constructor() :
            this(Vector2(), Vector2())

    constructor(other: Rect2) :
            this(other._position, other._size)

    constructor(x: RealT, y: RealT, width: RealT, height: RealT) :
            this(Vector2(x, y), Vector2(width, height))

    //API
    /**
     *Returns a Rect2 with equivalent position and area, modified so that
     * the top-left corner is the origin and width and height are positive.
     */
    fun abs(): Rect2 {
        return Rect2(
            _position.x - min(_size.x, 0.0),
            _position.x - min(_size.x, 0.0),
            kotlin.math.abs(_size.x),
            kotlin.math.abs(_size.y)
        )
    }

    /**
     * Returns the intersection of this Rect2 and b.
     */
    fun clip(b: Rect2): Rect2 {
        if (!intersects(b)) return Rect2()

        b._position.x = max(b._position.x, _position.x)
        b._position.y = max(b._position.y, _position.y)

        val rectEnd = b._position + b._size
        val end = _position + _size

        b._size.x = min(rectEnd.x, end.x) - b._position.x
        b._size.y = min(rectEnd.y, end.y) - b._position.y

        return b
    }

    /**
     * Returns true if this Rect2 completely encloses another one.
     */
    fun encloses(b: Rect2): Boolean {
        return (b._position.x >= _position.x) && (b._position.y >= _position.y) &&
                ((b._position.x + b._size.x) < (_position.x + _size.x)) &&
                ((b._position.y + b._size.y) < (_position.y + _size.y))
    }

    /**
     * Returns this Rect2 expanded to include a given point.
     */
    fun expand(vector: Vector2): Rect2 {
        val r = Rect2(this._position, this._size)
        r.expandTo(vector)
        return r
    }


    internal fun expandTo(vector: Vector2) {
        val begin = _position
        val end = _position + _size

        if (vector.x < begin.x) {
            begin.x = vector.x
        }
        if (vector.y < begin.y) {
            begin.y = vector.y
        }
        if (vector.x > end.x) {
            end.x = vector.x
        }
        if (vector.y > end.y) {
            end.y = vector.y
        }

        _position = begin
        _size = end - begin
    }

    /**
     * Returns the area of the Rect2.
     */
    fun getArea(): RealT {
        return _size.x * _size.y
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun grow(by: RealT): Rect2 {
        val g = Rect2(this._position, this._size)
        g._position.x -= by
        g._position.y -= by
        g._size.x += by * 2
        g._size.y += by * 2
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growIndividual(left: RealT, top: RealT, right: RealT, bottom: RealT): Rect2 {
        val g = Rect2(this._position, this._size)
        g._position.x -= left
        g._position.y -= top
        g._size.x += left + right
        g._size.y += top + bottom
        return g
    }

    /**
     * Returns a copy of the Rect2 grown a given amount of units towards all the sides.
     */
    fun growMargin(margin: Margin, by: RealT): Rect2 {
        val g = Rect2(this._position, this._size)
        when (margin) {
            Margin.LEFT -> {
                g._position.x -= by
                g._size.x += by
            }
            Margin.RIGHT -> {
                g._size.x += by
            }
            Margin.TOP -> {
                g._position.y -= by
                g._size.y += by
            }
            Margin.BOTTOM -> {
                g._size.y += by
            }
        }
        return g
    }

    /**
     * Returns true if the Rect2 is flat or empty.
     */
    fun hasNoArea(): Boolean {
        return _size.x <= 0 || _size.y <= 0
    }

    /**
     * Returns true if the Rect2 contains a point.
     */
    fun hasPoint(point: Vector2): Boolean {
        return when {
            point.x < _position.x -> false
            point.y < _position.y -> false
            point.x >= (_position.x + _size.x) -> false
            point.y >= (_position.y + _size.y) -> false
            else -> true
        }
    }

    /**
     * Returns true if the Rect2 overlaps with b (i.e. they have at least one point in common).
     * If include_borders is true, they will also be considered overlapping if their borders touch, even without intersection.
     */
    fun intersects(b: Rect2, includeBorders: Boolean = false): Boolean {
        if (includeBorders) {
            return when {
                _position.x > (b._position.x + b._size.x) -> false
                (_position.x + _size.x) < b._position.x -> false
                _position.y > (b._position.y + b._size.y) -> false
                (_position.y + _size.y) < b._position.y -> false
                else -> true
            }
        } else {
            return when {
                _position.x >= (b._position.x + b._size.x) -> false
                (_position.x + _size.x) <= b._position.x -> false
                _position.y >= (b._position.y + b._size.y) -> false
                (_position.y + _size.y) <= b._position.y -> false
                else -> true
            }
        }
    }

    /**
     * Returns true if this Rect2 and rect are approximately equal, by calling is_equal_approx on each component.
     */
    fun isEqualApprox(b: Rect2): Boolean {
        return b._position.isEqualApprox(this._position) && b._size.isEqualApprox(this._size)
    }

    /**
     * Returns a larger Rect2 that contains this Rect2 and b.
     */
    fun merge(b: Rect2): Rect2 {
        val ret = Rect2()

        ret._position.x = min(b._position.x, _position.x)
        ret._position.y = min(b._position.y, _position.y)

        ret._size.x = max(b._position.x + b._size.x, _position.x + _size.x)
        ret._size.y = max(b._position.y + b._size.y, _position.y + _size.y)

        ret._size = b._size - b._position //make relative again

        return ret
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Rect2 -> _position == other._position && _size == other._size
            else -> false
        }
    }

    override fun toString(): String {
        return "$_position, $_size"
    }


    override fun hashCode(): Int {
        var result = _position.hashCode()
        result = 31 * result + _size.hashCode()
        return result
    }
}