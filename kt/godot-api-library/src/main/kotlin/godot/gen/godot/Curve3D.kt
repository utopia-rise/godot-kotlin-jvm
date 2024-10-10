// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.PackedVector3Array
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
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

private const val ENGINE_CLASS_CURVE3D_INDEX: Int = 218

/**
 * This class describes a Bézier curve in 3D space. It is mainly used to give a shape to a [Path3D],
 * but can be manually sampled for other purposes.
 * It keeps a cache of precalculated points along the curve, to speed up further calculations.
 */
@GodotBaseType
public open class Curve3D : Resource() {
  /**
   * The distance in meters between two adjacent cached points. Changing it forces the cache to be
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

  /**
   * If `true`, the curve will bake up vectors used for orientation. This is used when
   * [PathFollow3D.rotationMode] is set to [PathFollow3D.ROTATION_ORIENTED]. Changing it forces the
   * cache to be recomputed.
   */
  public final inline var upVectorEnabled: Boolean
    @JvmName("upVectorEnabledProperty")
    get() = isUpVectorEnabled()
    @JvmName("upVectorEnabledProperty")
    set(`value`) {
      setUpVectorEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CURVE3D_INDEX, scriptIndex)
  }

  public final fun getPointCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPointCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setPointCountPtr, NIL)
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
    position: Vector3,
    `in`: Vector3 = Vector3(0, 0, 0),
    `out`: Vector3 = Vector3(0, 0, 0),
    index: Int = -1,
  ): Unit {
    Internals.writeArguments(VECTOR3 to position, VECTOR3 to `in`, VECTOR3 to out, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Sets the position for the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console.
   */
  public final fun setPointPosition(idx: Int, position: Vector3): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console, and returns `(0, 0, 0)`.
   */
  public final fun getPointPosition(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the tilt angle in radians for the point [idx]. If the index is out of bounds, the function
   * sends an error to the console.
   * The tilt controls the rotation along the look-at axis an object traveling the path would have.
   * In the case of a curve controlling a [PathFollow3D], this tilt is an offset over the natural tilt
   * the [PathFollow3D] calculates.
   */
  public final fun setPointTilt(idx: Int, tilt: Float): Unit {
    Internals.writeArguments(LONG to idx.toLong(), DOUBLE to tilt.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPointTiltPtr, NIL)
  }

  /**
   * Returns the tilt angle in radians for the point [idx]. If the index is out of bounds, the
   * function sends an error to the console, and returns `0`.
   */
  public final fun getPointTilt(idx: Int): Float {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointTiltPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the position of the control point leading to the vertex [idx]. If the index is out of
   * bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public final fun setPointIn(idx: Int, position: Vector3): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPointInPtr, NIL)
  }

  /**
   * Returns the position of the control point leading to the vertex [idx]. The returned position is
   * relative to the vertex [idx]. If the index is out of bounds, the function sends an error to the
   * console, and returns `(0, 0, 0)`.
   */
  public final fun getPointIn(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointInPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the position of the control point leading out of the vertex [idx]. If the index is out of
   * bounds, the function sends an error to the console. The position is relative to the vertex.
   */
  public final fun setPointOut(idx: Int, position: Vector3): Unit {
    Internals.writeArguments(LONG to idx.toLong(), VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPointOutPtr, NIL)
  }

  /**
   * Returns the position of the control point leading out of the vertex [idx]. The returned
   * position is relative to the vertex [idx]. If the index is out of bounds, the function sends an
   * error to the console, and returns `(0, 0, 0)`.
   */
  public final fun getPointOut(idx: Int): Vector3 {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointOutPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Deletes the point [idx] from the curve. Sends an error to the console if [idx] is out of
   * bounds.
   */
  public final fun removePoint(idx: Int): Unit {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public final fun clearPoints(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  /**
   * Returns the position between the vertex [idx] and the vertex `idx + 1`, where [t] controls if
   * the point is the first vertex (`t = 0.0`), the last vertex (`t = 1.0`), or in between. Values of
   * [t] outside the range (`0.0 >= t <=1`) give strange, but predictable results.
   * If [idx] is out of bounds it is truncated to the first or last vertex, and [t] is ignored. If
   * the curve has no points, the function sends an error to the console, and returns `(0, 0, 0)`.
   */
  public final fun sample(idx: Int, t: Float): Vector3 {
    Internals.writeArguments(LONG to idx.toLong(), DOUBLE to t.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.samplePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the position at the vertex [fofs]. It calls [sample] using the integer part of [fofs]
   * as `idx`, and its fractional part as `t`.
   */
  public final fun samplef(fofs: Float): Vector3 {
    Internals.writeArguments(DOUBLE to fofs.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.samplefPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setBakeInterval(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBakeIntervalPtr, NIL)
  }

  public final fun getBakeInterval(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakeIntervalPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUpVectorEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUpVectorEnabledPtr, NIL)
  }

  public final fun isUpVectorEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUpVectorEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the total length of the curve, based on the cached points. Given enough density (see
   * [bakeInterval]), it should be approximate enough.
   */
  public final fun getBakedLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakedLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a point within the curve at position [offset], where [offset] is measured as a distance
   * in 3D units along the curve. To do that, it finds the two cached points where the [offset] lies
   * between, then interpolates the values. This interpolation is cubic if [cubic] is set to `true`, or
   * linear if set to `false`.
   * Cubic interpolation tends to follow the curves better, but linear is faster (and often, precise
   * enough).
   */
  @JvmOverloads
  public final fun sampleBaked(offset: Float = 0.0f, cubic: Boolean = false): Vector3 {
    Internals.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic)
    Internals.callMethod(rawPtr, MethodBindings.sampleBakedPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns a [Transform3D] with `origin` as point position, `basis.x` as sideway vector, `basis.y`
   * as up vector, `basis.z` as forward vector. When the curve length is 0, there is no reasonable way
   * to calculate the rotation, all vectors aligned with global space axes. See also [sampleBaked].
   */
  @JvmOverloads
  public final fun sampleBakedWithRotation(
    offset: Float = 0.0f,
    cubic: Boolean = false,
    applyTilt: Boolean = false,
  ): Transform3D {
    Internals.writeArguments(DOUBLE to offset.toDouble(), BOOL to cubic, BOOL to applyTilt)
    Internals.callMethod(rawPtr, MethodBindings.sampleBakedWithRotationPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns an up vector within the curve at position [offset], where [offset] is measured as a
   * distance in 3D units along the curve. To do that, it finds the two cached up vectors where the
   * [offset] lies between, then interpolates the values. If [applyTilt] is `true`, an interpolated
   * tilt is applied to the interpolated up vector.
   * If the curve has no up vectors, the function sends an error to the console, and returns `(0, 1,
   * 0)`.
   */
  @JvmOverloads
  public final fun sampleBakedUpVector(offset: Float, applyTilt: Boolean = false): Vector3 {
    Internals.writeArguments(DOUBLE to offset.toDouble(), BOOL to applyTilt)
    Internals.callMethod(rawPtr, MethodBindings.sampleBakedUpVectorPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the cache of points as a [PackedVector3Array].
   */
  public final fun getBakedPoints(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakedPointsPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the cache of tilts as a [PackedFloat32Array].
   */
  public final fun getBakedTilts(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakedTiltsPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Returns the cache of up vectors as a [PackedVector3Array].
   * If [upVectorEnabled] is `false`, the cache will be empty.
   */
  public final fun getBakedUpVectors(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakedUpVectorsPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the closest point on baked segments (in curve's local space) to [toPoint].
   * [toPoint] must be in this curve's local space.
   */
  public final fun getClosestPoint(toPoint: Vector3): Vector3 {
    Internals.writeArguments(VECTOR3 to toPoint)
    Internals.callMethod(rawPtr, MethodBindings.getClosestPointPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the closest offset to [toPoint]. This offset is meant to be used in [sampleBaked] or
   * [sampleBakedUpVector].
   * [toPoint] must be in this curve's local space.
   */
  public final fun getClosestOffset(toPoint: Vector3): Float {
    Internals.writeArguments(VECTOR3 to toPoint)
    Internals.callMethod(rawPtr, MethodBindings.getClosestOffsetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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
      PackedVector3Array {
    Internals.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceDegrees.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.tessellatePtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
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
  public final fun tessellateEvenLength(maxStages: Int = 5, toleranceLength: Float = 0.2f):
      PackedVector3Array {
    Internals.writeArguments(LONG to maxStages.toLong(), DOUBLE to toleranceLength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.tessellateEvenLengthPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_point_count", 3905245786)

    public val setPointCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_point_count", 1286410249)

    public val addPointPtr: VoidPtr = Internals.getMethodBindPtr("Curve3D", "add_point", 2931053748)

    public val setPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_point_position", 1530502735)

    public val getPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_point_position", 711720468)

    public val setPointTiltPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_point_tilt", 1602489585)

    public val getPointTiltPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_point_tilt", 2339986948)

    public val setPointInPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_point_in", 1530502735)

    public val getPointInPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_point_in", 711720468)

    public val setPointOutPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_point_out", 1530502735)

    public val getPointOutPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_point_out", 711720468)

    public val removePointPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "remove_point", 1286410249)

    public val clearPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "clear_points", 3218959716)

    public val samplePtr: VoidPtr = Internals.getMethodBindPtr("Curve3D", "sample", 3285246857)

    public val samplefPtr: VoidPtr = Internals.getMethodBindPtr("Curve3D", "samplef", 2553580215)

    public val setBakeIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_bake_interval", 373806689)

    public val getBakeIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_bake_interval", 1740695150)

    public val setUpVectorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "set_up_vector_enabled", 2586408642)

    public val isUpVectorEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "is_up_vector_enabled", 36873697)

    public val getBakedLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_baked_length", 1740695150)

    public val sampleBakedPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "sample_baked", 1350085894)

    public val sampleBakedWithRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "sample_baked_with_rotation", 1939359131)

    public val sampleBakedUpVectorPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "sample_baked_up_vector", 1362627031)

    public val getBakedPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_baked_points", 497664490)

    public val getBakedTiltsPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_baked_tilts", 675695659)

    public val getBakedUpVectorsPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_baked_up_vectors", 497664490)

    public val getClosestPointPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_closest_point", 192990374)

    public val getClosestOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "get_closest_offset", 1109078154)

    public val tessellatePtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "tessellate", 1519759391)

    public val tessellateEvenLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("Curve3D", "tessellate_even_length", 133237049)
  }
}
