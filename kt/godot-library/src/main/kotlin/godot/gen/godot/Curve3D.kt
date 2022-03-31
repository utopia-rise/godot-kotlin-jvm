// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Describes a Bézier curve in 3D space.
 *
 * This class describes a Bézier curve in 3D space. It is mainly used to give a shape to a [godot.Path3D], but can be manually sampled for other purposes.
 *
 * It keeps a cache of precalculated points along the curve, to speed up further calculations.
 */
@GodotBaseType
public open class Curve3D : Resource() {
  /**
   * The distance in meters between two adjacent cached points. Changing it forces the cache to be recomputed the next time the [getBakedPoints] or [getBakedLength] function is called. The smaller the distance, the more points in the cache and the more memory it will consume, so use with care.
   */
  public open var bakeInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKE_INTERVAL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_BAKE_INTERVAL, NIL)
    }

  /**
   * If `true`, the curve will bake up vectors used for orientation. This is used when [godot.PathFollow3D.rotationMode] is set to [godot.PathFollow3D.ROTATION_ORIENTED]. Changing it forces the cache to be recomputed.
   */
  public open var upVectorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_IS_UP_VECTOR_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_UP_VECTOR_ENABLED,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CURVE3D)
  }

  /**
   * Returns the number of points describing the curve.
   */
  public open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a point to a curve at `position` relative to the [godot.Curve3D]'s position, with control points `in` and `out`.
   *
   * If `at_position` is given, the point is inserted before the point number `at_position`, moving that point (and every point after) after the inserted point. If `at_position` is not given, or is an illegal value (`at_position <0` or `at_position >= [getPointCount]`), the point will be appended at the end of the point list.
   */
  public open fun addPoint(
    position: Vector3,
    _in: Vector3 = Vector3(0.0, 0.0, 0.0),
    `out`: Vector3 = Vector3(0.0, 0.0, 0.0),
    atPosition: Long = -1
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to _in, VECTOR3 to out, LONG to
        atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_ADD_POINT, NIL)
  }

  /**
   * Sets the position for the vertex `idx`. If the index is out of bounds, the function sends an error to the console.
   */
  public open fun setPointPosition(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_POSITION, NIL)
  }

  /**
   * Returns the position of the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public open fun getPointPosition(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the tilt angle in radians for the point `idx`. If the index is out of bounds, the function sends an error to the console.
   *
   * The tilt controls the rotation along the look-at axis an object traveling the path would have. In the case of a curve controlling a [godot.PathFollow3D], this tilt is an offset over the natural tilt the [godot.PathFollow3D] calculates.
   */
  public open fun setPointTilt(idx: Long, tilt: Double): Unit {
    TransferContext.writeArguments(LONG to idx, DOUBLE to tilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_TILT, NIL)
  }

  /**
   * Returns the tilt angle in radians for the point `idx`. If the index is out of bounds, the function sends an error to the console, and returns `0`.
   */
  public open fun getPointTilt(idx: Long): Double {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_TILT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the position of the control point leading to the vertex `idx`. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public open fun setPointIn(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_IN, NIL)
  }

  /**
   * Returns the position of the control point leading to the vertex `idx`. The returned position is relative to the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public open fun getPointIn(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_IN, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the position of the control point leading out of the vertex `idx`. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public open fun setPointOut(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_OUT, NIL)
  }

  /**
   * Returns the position of the control point leading out of the vertex `idx`. The returned position is relative to the vertex `idx`. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public open fun getPointOut(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_OUT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Deletes the point `idx` from the curve. Sends an error to the console if `idx` is out of bounds.
   */
  public open fun removePoint(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_REMOVE_POINT, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public open fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_CLEAR_POINTS, NIL)
  }

  /**
   * Returns the position between the vertex `idx` and the vertex `idx + 1`, where `t` controls if the point is the first vertex (`t = 0.0`), the last vertex (`t = 1.0`), or in between. Values of `t` outside the range (`0.0 >= t <=1`) give strange, but predictable results.
   *
   * If `idx` is out of bounds it is truncated to the first or last vertex, and `t` is ignored. If the curve has no points, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public open fun interpolate(idx: Long, t: Double): Vector3 {
    TransferContext.writeArguments(LONG to idx, DOUBLE to t)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the position at the vertex `fofs`. It calls [interpolate] using the integer part of `fofs` as `idx`, and its fractional part as `t`.
   */
  public open fun interpolatef(fofs: Double): Vector3 {
    TransferContext.writeArguments(DOUBLE to fofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATEF, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see [bakeInterval]), it should be approximate enough.
   */
  public open fun getBakedLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a point within the curve at position `offset`, where `offset` is measured as a distance in 3D units along the curve.
   *
   * To do that, it finds the two cached points where the `offset` lies between, then interpolates the values. This interpolation is cubic if `cubic` is set to `true`, or linear if set to `false`.
   *
   * Cubic interpolation tends to follow the curves better, but linear is faster (and often, precise enough).
   */
  public open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to cubic)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns an up vector within the curve at position `offset`, where `offset` is measured as a distance in 3D units along the curve.
   *
   * To do that, it finds the two cached up vectors where the `offset` lies between, then interpolates the values. If `apply_tilt` is `true`, an interpolated tilt is applied to the interpolated up vector.
   *
   * If the curve has no up vectors, the function sends an error to the console, and returns `(0, 1, 0)`.
   */
  public open fun interpolateBakedUpVector(offset: Double, applyTilt: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to applyTilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED_UP_VECTOR,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the cache of points as a [godot.PackedVector3Array].
   */
  public open fun getBakedPoints(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_POINTS,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the cache of tilts as a [godot.PackedFloat32Array].
   */
  public open fun getBakedTilts(): PackedFloat32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_TILTS,
        PACKED_FLOAT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
  }

  /**
   * Returns the cache of up vectors as a [godot.PackedVector3Array].
   *
   * If [upVectorEnabled] is `false`, the cache will be empty.
   */
  public open fun getBakedUpVectors(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_UP_VECTORS,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the closest baked point (in curve's local space) to `to_point`.
   *
   * `to_point` must be in this curve's local space.
   */
  public open fun getClosestPoint(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the closest offset to `to_point`. This offset is meant to be used in [interpolateBaked] or [interpolateBakedUpVector].
   *
   * `to_point` must be in this curve's local space.
   */
  public open fun getClosestOffset(toPoint: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
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
      PackedVector3Array {
    TransferContext.writeArguments(LONG to maxStages, DOUBLE to toleranceDegrees)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_TESSELLATE,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  public companion object
}
