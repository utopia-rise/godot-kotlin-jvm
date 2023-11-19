// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

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
  public var bakeInterval: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeIntervalPtr, NIL)
    }

  /**
   * The number of points describing the curve.
   */
  public var pointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPointCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVE2D, scriptIndex)
    return true
  }

  /**
   * Adds a point with the specified [position] relative to the curve's own position, with control points [in] and [out]. Appends the new point at the end of the point list.
   *
   * If [index] is given, the new point is inserted before the existing point identified by index [index]. Every existing point starting from [index] is shifted further down the list of points. The index must be greater than or equal to `0` and must not exceed the number of existing points in the line. See [pointCount].
   */
  @JvmOverloads
  public fun addPoint(
    position: Vector2,
    _in: Vector2 = Vector2(0, 0),
    `out`: Vector2 = Vector2(0, 0),
    index: Int = -1,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, VECTOR2 to _in, VECTOR2 to out, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Sets the position for the vertex [idx]. If the index is out of bounds, the function sends an error to the console.
   */
  public fun setPointPosition(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public fun getPointPosition(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the position of the control point leading to the vertex [idx]. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public fun setPointIn(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointInPtr, NIL)
  }

  /**
   * Returns the position of the control point leading to the vertex [idx]. The returned position is relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public fun getPointIn(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointInPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the position of the control point leading out of the vertex [idx]. If the index is out of bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public fun setPointOut(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOutPtr, NIL)
  }

  /**
   * Returns the position of the control point leading out of the vertex [idx]. The returned position is relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the console, and returns `(0, 0)`.
   */
  public fun getPointOut(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointOutPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Deletes the point [idx] from the curve. Sends an error to the console if [idx] is out of bounds.
   */
  public fun removePoint(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  /**
   * Returns the position between the vertex [idx] and the vertex `idx + 1`, where [t] controls if the point is the first vertex (`t = 0.0`), the last vertex (`t = 1.0`), or in between. Values of [t] outside the range (`0.0 >= t <=1`) give strange, but predictable results.
   *
   * If [idx] is out of bounds it is truncated to the first or last vertex, and [t] is ignored. If the curve has no points, the function sends an error to the console, and returns `(0, 0)`.
   */
  public fun sample(idx: Int, t: Float): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to t.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the position at the vertex [fofs]. It calls [sample] using the integer part of [fofs] as `idx`, and its fractional part as `t`.
   */
  public fun samplef(fofs: Float): Vector2 {
    TransferContext.writeArguments(DOUBLE to fofs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplefPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see [bakeInterval]), it should be approximate enough.
   */
  public fun getBakedLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a point within the curve at position [offset], where [offset] is measured as a pixel distance along the curve.
   *
   * To do that, it finds the two cached points where the [offset] lies between, then interpolates the values. This interpolation is cubic if [cubic] is set to `true`, or linear if set to `false`.
   *
   * Cubic interpolation tends to follow the curves better, but linear is faster (and often, precise enough).
   */
  @JvmOverloads
  public fun sampleBaked(offset: Float = 0.0f, cubic: Boolean = false): Vector2 {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Similar to [sampleBaked], but returns [godot.core.Transform2D] that includes a rotation along the curve, with [godot.Transform2D.origin] as the point position, [godot.Transform2D.x] as the sideways vector, and [godot.Transform2D.y] as the forward vector. Returns an empty transform if the length of the curve is `0`.
   *
   * ```
   * 				var baked = curve.sample_baked_with_rotation(offset)
   * 				# This will rotate and position the node with the up direction pointing along the curve.
   * 				position = baked.get_origin()
   * 				rotation = baked.get_rotation()
   * 				# Alternatively, not preserving scale.
   * 				transform = baked * Transform2D.FLIP_Y
   * 				# To match the rotation of PathFollow2D, not preserving scale.
   * 				transform = Transform2D(baked.y, baked.x, baked.origin)
   * 				```
   */
  @JvmOverloads
  public fun sampleBakedWithRotation(offset: Float = 0.0f, cubic: Boolean = false): Transform2D {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedWithRotationPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the cache of points as a [godot.PackedVector2Array].
   */
  public fun getBakedPoints(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedPointsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns the closest point on baked segments (in curve's local space) to [toPoint].
   *
   * [toPoint] must be in this curve's local space.
   */
  public fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the closest offset to [toPoint]. This offset is meant to be used in [sampleBaked].
   *
   * [toPoint] must be in this curve's local space.
   */
  public fun getClosestOffset(toPoint: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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
  @JvmOverloads
  public fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f): PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceDegrees.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellatePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns a list of points along the curve, with almost uniform density. [maxStages] controls how many subdivisions a curve segment may face before it is considered approximate enough. Each subdivision splits the segment in half, so the default 5 stages may mean up to 32 subdivisions per curve segment. Increase with care!
   *
   * [toleranceLength] controls the maximal distance between two neighboring points, before the segment has to be subdivided.
   */
  @JvmOverloads
  public fun tessellateEvenLength(maxStages: Int = 5, toleranceLength: Float = 20.0f):
      PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceLength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellateEvenLengthPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_count")

    public val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_count")

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "add_point")

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_position")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_position")

    public val setPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "set_point_in")

    public val getPointInPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "get_point_in")

    public val setPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "set_point_out")

    public val getPointOutPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "get_point_out")

    public val removePointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "remove_point")

    public val clearPointsPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "clear_points")

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "sample")

    public val samplefPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "samplef")

    public val setBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_bake_interval")

    public val getBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_bake_interval")

    public val getBakedLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_length")

    public val sampleBakedPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "sample_baked")

    public val sampleBakedWithRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "sample_baked_with_rotation")

    public val getBakedPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_points")

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_point")

    public val getClosestOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_offset")

    public val tessellatePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "tessellate")

    public val tessellateEvenLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "tessellate_even_length")
  }
}
