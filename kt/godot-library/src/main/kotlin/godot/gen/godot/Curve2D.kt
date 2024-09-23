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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
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
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This class describes a Bézier curve in 2D space. It is mainly used to give a shape to a [Path2D],
 * but can be manually sampled for other purposes.
 * It keeps a cache of precalculated points along the curve, to speed up further calculations.
 */
@GodotBaseType
public open class Curve2D : Resource() {
  /**
   * The distance in pixels between two adjacent cached points. Changing it forces the cache to be
   * recomputed the next time the [getBakedPoints] or [getBakedLength] function is called. The smaller
   * the distance, the more points in the cache and the more memory it will consume, so use with care.
   */
  public final inline var bakeInterval: Float
    @JvmName("bakeIntervalProperty")
    get() = getBakeInterval()
    @JvmName("bakeIntervalProperty")
    set(`value`) {
      setBakeInterval(value)
    }

  /**
   * The number of points describing the curve.
   */
  public final inline var pointCount: Int
    @JvmName("pointCountProperty")
    get() = getPointCount()
    @JvmName("pointCountProperty")
    set(`value`) {
      setPointCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CURVE2D, scriptIndex)
  }

  public final fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPointCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointCountPtr, NIL)
  }

  /**
   * Adds a point with the specified [position] relative to the curve's own position, with control
   * points [in] and [out]. Appends the new point at the end of the point list.
   * If [index] is given, the new point is inserted before the existing point identified by index
   * [index]. Every existing point starting from [index] is shifted further down the list of points.
   * The index must be greater than or equal to `0` and must not exceed the number of existing points
   * in the line. See [pointCount].
   */
  @JvmOverloads
  public final fun addPoint(
    position: Vector2,
    _in: Vector2 = Vector2(0, 0),
    `out`: Vector2 = Vector2(0, 0),
    index: Int = -1,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, VECTOR2 to _in, VECTOR2 to out, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Sets the position for the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console.
   */
  public final fun setPointPosition(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console, and returns `(0, 0)`.
   */
  public final fun getPointPosition(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the position of the control point leading to the vertex [idx]. If the index is out of
   * bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public final fun setPointIn(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointInPtr, NIL)
  }

  /**
   * Returns the position of the control point leading to the vertex [idx]. The returned position is
   * relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the
   * console, and returns `(0, 0)`.
   */
  public final fun getPointIn(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointInPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the position of the control point leading out of the vertex [idx]. If the index is out of
   * bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public final fun setPointOut(idx: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOutPtr, NIL)
  }

  /**
   * Returns the position of the control point leading out of the vertex [idx]. The returned
   * position is relative to the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console, and returns `(0, 0)`.
   */
  public final fun getPointOut(idx: Int): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointOutPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Deletes the point [idx] from the curve. Sends an error to the console if [idx] is out of
   * bounds.
   */
  public final fun removePoint(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public final fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  /**
   * Returns the position between the vertex [idx] and the vertex `idx + 1`, where [t] controls if
   * the point is the first vertex (`t = 0.0`), the last vertex (`t = 1.0`), or in between. Values of
   * [t] outside the range (`0.0 >= t <=1`) give strange, but predictable results.
   * If [idx] is out of bounds it is truncated to the first or last vertex, and [t] is ignored. If
   * the curve has no points, the function sends an error to the console, and returns `(0, 0)`.
   */
  public final fun sample(idx: Int, t: Float): Vector2 {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to t.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the position at the vertex [fofs]. It calls [sample] using the integer part of [fofs]
   * as `idx`, and its fractional part as `t`.
   */
  public final fun samplef(fofs: Float): Vector2 {
    TransferContext.writeArguments(DOUBLE to fofs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplefPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setBakeInterval(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBakeIntervalPtr, NIL)
  }

  public final fun getBakeInterval(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakeIntervalPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see
   * [bakeInterval]), it should be approximate enough.
   */
  public final fun getBakedLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a point within the curve at position [offset], where [offset] is measured as a pixel
   * distance along the curve.
   * To do that, it finds the two cached points where the [offset] lies between, then interpolates
   * the values. This interpolation is cubic if [cubic] is set to `true`, or linear if set to `false`.
   * Cubic interpolation tends to follow the curves better, but linear is faster (and often, precise
   * enough).
   */
  @JvmOverloads
  public final fun sampleBaked(offset: Float = 0.0f, cubic: Boolean = false): Vector2 {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Similar to [sampleBaked], but returns [Transform2D] that includes a rotation along the curve,
   * with [Transform2D.origin] as the point position and the [Transform2D.x] vector pointing in the
   * direction of the path at that point. Returns an empty transform if the length of the curve is `0`.
   * [codeblock]
   * var baked = curve.sample_baked_with_rotation(offset)
   * # The returned Transform2D can be set directly.
   * transform = baked
   * # You can also read the origin and rotation separately from the returned Transform2D.
   * position = baked.get_origin()
   * rotation = baked.get_rotation()
   * [/codeblock]
   */
  @JvmOverloads
  public final fun sampleBakedWithRotation(offset: Float = 0.0f, cubic: Boolean = false):
      Transform2D {
    TransferContext.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedWithRotationPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the cache of points as a [PackedVector2Array].
   */
  public final fun getBakedPoints(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakedPointsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns the closest point on baked segments (in curve's local space) to [toPoint].
   * [toPoint] must be in this curve's local space.
   */
  public final fun getClosestPoint(toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the closest offset to [toPoint]. This offset is meant to be used in [sampleBaked].
   * [toPoint] must be in this curve's local space.
   */
  public final fun getClosestOffset(toPoint: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a list of points along the curve, with a curvature controlled point density. That is,
   * the curvier parts will have more points than the straighter parts.
   * This approximation makes straight segments between each point, then subdivides those segments
   * until the resulting shape is similar enough.
   * [maxStages] controls how many subdivisions a curve segment may face before it is considered
   * approximate enough. Each subdivision splits the segment in half, so the default 5 stages may mean
   * up to 32 subdivisions per curve segment. Increase with care!
   * [toleranceDegrees] controls how many degrees the midpoint of a segment may deviate from the
   * real curve, before the segment has to be subdivided.
   */
  @JvmOverloads
  public final fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f):
      PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceDegrees.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellatePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns a list of points along the curve, with almost uniform density. [maxStages] controls how
   * many subdivisions a curve segment may face before it is considered approximate enough. Each
   * subdivision splits the segment in half, so the default 5 stages may mean up to 32 subdivisions per
   * curve segment. Increase with care!
   * [toleranceLength] controls the maximal distance between two neighboring points, before the
   * segment has to be subdivided.
   */
  @JvmOverloads
  public final fun tessellateEvenLength(maxStages: Int = 5, toleranceLength: Float = 20.0f):
      PackedVector2Array {
    TransferContext.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceLength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.tessellateEvenLengthPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_count", 3905245786)

    public val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_count", 1286410249)

    public val addPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "add_point", 4175465202)

    public val setPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_position", 163021252)

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_position", 2299179447)

    public val setPointInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_in", 163021252)

    public val getPointInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_in", 2299179447)

    public val setPointOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_point_out", 163021252)

    public val getPointOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_point_out", 2299179447)

    public val removePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "remove_point", 1286410249)

    public val clearPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "clear_points", 3218959716)

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "sample", 26514310)

    public val samplefPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve2D", "samplef", 3588506812)

    public val setBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "set_bake_interval", 373806689)

    public val getBakeIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_bake_interval", 1740695150)

    public val getBakedLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_length", 1740695150)

    public val sampleBakedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "sample_baked", 3464257706)

    public val sampleBakedWithRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "sample_baked_with_rotation", 3296056341)

    public val getBakedPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_baked_points", 2961356807)

    public val getClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_point", 2656412154)

    public val getClosestOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "get_closest_offset", 2276447920)

    public val tessellatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "tessellate", 958145977)

    public val tessellateEvenLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve2D", "tessellate_even_length", 2319761637)
  }
}
