// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Describes a Bézier curve in 2D space.
 *
 * This class describes a Bézier curve in 2D space. It is mainly used to give a shape to a [godot.Path2D], but can be manually sampled for other purposes.
 *
 * It keeps a cache of precalculated points along the curve, to speed up further calculations.
 */
@GodotBaseType
public open class Curve2D : Resource() {
  /**
   * The distance in pixels between two adjacent cached points. Changing it forces the cache to be recomputed the next time the [getBakedPoints] or [getBakedLength] function is called. The smaller the distance, the more points in the cache and the more memory it will consume, so use with care.
   */
  public open var bakeInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_BAKE_INTERVAL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_SET_BAKE_INTERVAL, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CURVE2D)
  }

  public open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for Curve2D")
  }

  public open fun _setData(arg0: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Adds a point with the specified `position` relative to the curve's own position, with control points `in` and `out`. Appends the new point at the end of the point list.
   *
   * If `index` is given, the new point is inserted before the existing point identified by index `index`. Every existing point starting from `index` is shifted further down the list of points. The index must be greater than or equal to `0` and must not exceed the number of existing points in the line. See [getPointCount].
   */
  public open fun addPoint(
    position: Vector2,
    _in: Vector2 = Vector2(0.0, 0.0),
    `out`: Vector2 = Vector2(0.0, 0.0),
    index: Long = -1
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, VECTOR2 to _in, VECTOR2 to out, LONG to
        index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_ADD_POINT, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public open fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_CLEAR_POINTS, NIL)
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see [bakeInterval]), it should be approximate enough.
   */
  public open fun getBakedLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_BAKED_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the cache of points as a [godot.core.PoolVector2Array].
   */
  public open fun getBakedPoints(): PoolVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_BAKED_POINTS,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns the closest offset to `to_point`. This offset is meant to be used in [interpolateBaked].
   *
   * `to_point` must be in this curve's local space.
   */
  public open fun getClosestOffset(toPoint: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_CLOSEST_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the closest baked point (in curve's local space) to `to_point`.
   *
   * `to_point` must be in this curve's local space.
   */
  public open fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_CLOSEST_POINT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the number of points describing the curve.
   */
  public open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the control point leading to the vertex `idx`. The returned position is relative to the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public open fun getPointIn(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_POINT_IN, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the position of the control point leading out of the vertex `idx`. The returned position is relative to the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public open fun getPointOut(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_POINT_OUT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the position of the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public open fun getPointPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the position between the vertex `idx` and the vertex `idx + 1`, where `t` controls if the point is the first vertex (`t = 0.0`), the last vertex (`t = 1.0`), or in between. Values of `t` outside the range (`0.0 >= t <=1`) give strange, but predictable results.
   *
   * If `idx` is out of bounds it is truncated to the first or last vertex, and `t` is ignored. If the curve has no points, the function sends an error to the console, and returns `(0, 0)`.
   */
  public open fun interpolate(idx: Long, t: Double): Vector2 {
    TransferContext.writeArguments(LONG to idx, DOUBLE to t)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_INTERPOLATE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns a point within the curve at position `offset`, where `offset` is measured as a pixel distance along the curve.
   *
   * To do that, it finds the two cached points where the `offset` lies between, then interpolates the values. This interpolation is cubic if `cubic` is set to `true`, or linear if set to `false`.
   *
   * Cubic interpolation tends to follow the curves better, but linear is faster (and often, precise enough).
   */
  public open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector2 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to cubic)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_INTERPOLATE_BAKED, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the position at the vertex `fofs`. It calls [interpolate] using the integer part of `fofs` as `idx`, and its fractional part as `t`.
   */
  public open fun interpolatef(fofs: Double): Vector2 {
    TransferContext.writeArguments(DOUBLE to fofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_INTERPOLATEF, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Deletes the point `idx` from the curve. Sends an error to the console if `idx` is out of bounds.
   */
  public open fun removePoint(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_REMOVE_POINT, NIL)
  }

  /**
   * Sets the position of the control point leading to the vertex `idx`. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public open fun setPointIn(idx: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_SET_POINT_IN, NIL)
  }

  /**
   * Sets the position of the control point leading out of the vertex `idx`. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public open fun setPointOut(idx: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_SET_POINT_OUT, NIL)
  }

  /**
   * Sets the position for the vertex `idx`. If the index is out of bounds, the function sends an error to the console.
   */
  public open fun setPointPosition(idx: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_SET_POINT_POSITION, NIL)
  }

  /**
   * Returns a list of points along the curve, with a curvature controlled point density. That is, the curvier parts will have more points than the straighter parts.
   *
   * This approximation makes straight segments between each point, then subdivides those segments until the resulting shape is similar enough.
   *
   * `max_stages` controls how many subdivisions a curve segment may face before it is considered approximate enough. Each subdivision splits the segment in half, so the default 5 stages may mean up to 32 subdivisions per curve segment. Increase with care!
   *
   * `tolerance_degrees` controls how many degrees the midpoint of a segment may deviate from the real curve, before the segment has to be subdivided.
   */
  public open fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0):
      PoolVector2Array {
    TransferContext.writeArguments(LONG to maxStages, DOUBLE to toleranceDegrees)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE2D_TESSELLATE,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }
}
