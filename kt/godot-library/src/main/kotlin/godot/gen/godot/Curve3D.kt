// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var bakeInterval: Double
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
  public var upVectorEnabled: Boolean
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

  public fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a point with the specified [position] relative to the curve's own position, with control points [in] and [out]. Appends the new point at the end of the point list.
   *
   * If [index] is given, the new point is inserted before the existing point identified by index [index]. Every existing point starting from [index] is shifted further down the list of points. The index must be greater than or equal to `0` and must not exceed the number of existing points in the line. See [pointCount].
   */
  public fun addPoint(
    position: Vector3,
    _in: Vector3 = Vector3(0, 0, 0),
    `out`: Vector3 = Vector3(0, 0, 0),
    atPosition: Long = -1
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to _in, VECTOR3 to out, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_ADD_POINT, NIL)
  }

  /**
   * Sets the position for the vertex [idx]. If the index is out of bounds, the function sends an error to the console.
   */
  public fun setPointPosition(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_POSITION, NIL)
  }

  /**
   * Returns the position of the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public fun getPointPosition(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the tilt angle in radians for the point [idx]. If the index is out of bounds, the function sends an error to the console.
   *
   * The tilt controls the rotation along the look-at axis an object traveling the path would have. In the case of a curve controlling a [godot.PathFollow3D], this tilt is an offset over the natural tilt the [godot.PathFollow3D] calculates.
   */
  public fun setPointTilt(idx: Long, tilt: Double): Unit {
    TransferContext.writeArguments(LONG to idx, DOUBLE to tilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_TILT, NIL)
  }

  /**
   * Returns the tilt angle in radians for the point [idx]. If the index is out of bounds, the function sends an error to the console, and returns `0`.
   */
  public fun getPointTilt(idx: Long): Double {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_TILT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the position of the control point leading to the vertex [idx]. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public fun setPointIn(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_IN, NIL)
  }

  /**
   * Returns the position of the control point leading to the vertex [idx]. The returned position is relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public fun getPointIn(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_IN, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the position of the control point leading out of the vertex [idx]. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public fun setPointOut(idx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_OUT, NIL)
  }

  /**
   * Returns the position of the control point leading out of the vertex [idx]. The returned position is relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public fun getPointOut(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_OUT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Deletes the point `idx` from the curve. Sends an error to the console if `idx` is out of bounds.
   */
  public fun removePoint(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_REMOVE_POINT, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_CLEAR_POINTS, NIL)
  }

  public fun interpolate(idx: Long, t: Double): Vector3 {
    TransferContext.writeArguments(LONG to idx, DOUBLE to t)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public fun interpolatef(fofs: Double): Vector3 {
    TransferContext.writeArguments(DOUBLE to fofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATEF, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see [bakeInterval]), it should be approximate enough.
   */
  public fun getBakedLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to cubic)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public fun interpolateBakedUpVector(offset: Double, applyTilt: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to applyTilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED_UP_VECTOR,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the cache of points as a [godot.PackedVector3Array].
   */
  public fun getBakedPoints(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_POINTS,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the cache of tilts as a [godot.PackedFloat32Array].
   */
  public fun getBakedTilts(): PackedFloat32Array {
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
  public fun getBakedUpVectors(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_UP_VECTORS,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the closest baked point (in curve's local space) to [toPoint].
   *
   * [toPoint] must be in this curve's local space.
   */
  public fun getClosestPoint(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the closest offset to [toPoint]. This offset is meant to be used in [sampleBaked] or [sampleBakedUpVector].
   *
   * [toPoint] must be in this curve's local space.
   */
  public fun getClosestOffset(toPoint: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a list of points along the curve, with a curvature controlled point density. That is, the curvier parts will have more points than the straighter parts.
   *
   * This approximation makes straight segments between each point, then subdivides those segments until the resulting shape is similar enough.
   *
   * [maxStages] controls how many subdivisions a curve segment may face before it is considered approximate enough. Each subdivision splits the segment in half, so the default 5 stages may mean up to 32 subdivisions per curve segment. Increase with care!
   *
   * [toleranceDegrees] controls how many degrees the midpoint of a segment may deviate from the real curve, before the segment has to be subdivided.
   */
  public fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0): PackedVector3Array {
    TransferContext.writeArguments(LONG to maxStages, DOUBLE to toleranceDegrees)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_TESSELLATE,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  public companion object
}
