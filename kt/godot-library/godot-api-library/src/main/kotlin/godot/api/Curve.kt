// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.addPointPtr
import godot.bakePtr
import godot.cleanDupesPtr
import godot.clearPointsPtr
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.getBakeResolutionPtr
import godot.getMaxValuePtr
import godot.getMinValuePtr
import godot.getPointCountPtr
import godot.getPointLeftModePtr
import godot.getPointLeftTangentPtr
import godot.getPointPositionPtr
import godot.getPointRightModePtr
import godot.getPointRightTangentPtr
import godot.removePointPtr
import godot.sampleBakedPtr
import godot.samplePtr
import godot.setBakeResolutionPtr
import godot.setMaxValuePtr
import godot.setMinValuePtr
import godot.setPointCountPtr
import godot.setPointLeftModePtr
import godot.setPointLeftTangentPtr
import godot.setPointOffsetPtr
import godot.setPointRightModePtr
import godot.setPointRightTangentPtr
import godot.setPointValuePtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_CURVE: Int = 216

/**
 * This resource describes a mathematical curve by defining a set of points and tangents at each
 * point. By default, it ranges between `0` and `1` on the Y axis and positions points relative to the
 * `0.5` Y position.
 * See also [Gradient] which is designed for color interpolation. See also [Curve2D] and [Curve3D].
 */
@GodotBaseType
public open class Curve : Resource() {
  /**
   * Emitted when [maxValue] or [minValue] is changed.
   */
  public val rangeChanged: Signal0 by Signal0

  /**
   * The minimum value the curve can reach.
   */
  public final inline var minValue: Float
    @JvmName("minValueProperty")
    get() = getMinValue()
    @JvmName("minValueProperty")
    set(`value`) {
      setMinValue(value)
    }

  /**
   * The maximum value the curve can reach.
   */
  public final inline var maxValue: Float
    @JvmName("maxValueProperty")
    get() = getMaxValue()
    @JvmName("maxValueProperty")
    set(`value`) {
      setMaxValue(value)
    }

  /**
   * The number of points to include in the baked (i.e. cached) curve data.
   */
  public final inline var bakeResolution: Int
    @JvmName("bakeResolutionProperty")
    get() = getBakeResolution()
    @JvmName("bakeResolutionProperty")
    set(`value`) {
      setBakeResolution(value)
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
    createNativeObject(ENGINECLASS_CURVE, scriptIndex)
  }

  public final fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPointCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPointCountPtr, NIL)
  }

  /**
   * Adds a point to the curve. For each side, if the `*_mode` is [TANGENT_LINEAR], the `*_tangent`
   * angle (in degrees) uses the slope of the curve halfway to the adjacent point. Allows custom
   * assignments to the `*_tangent` angle if `*_mode` is set to [TANGENT_FREE].
   */
  @JvmOverloads
  public final fun addPoint(
    position: Vector2,
    leftTangent: Float = 0.0f,
    rightTangent: Float = 0.0f,
    leftMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
    rightMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
  ): Int {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent.toDouble(), DOUBLE to rightTangent.toDouble(), LONG to leftMode.id, LONG to rightMode.id)
    TransferContext.callMethod(ptr, MethodBindings.addPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the point at [index] from the curve.
   */
  public final fun removePoint(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public final fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPointsPtr, NIL)
  }

  /**
   * Returns the curve coordinates for the point at [index].
   */
  public final fun getPointPosition(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Assigns the vertical position [y] to the point at [index].
   */
  public final fun setPointValue(index: Int, y: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to y.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointValuePtr, NIL)
  }

  /**
   * Sets the offset from `0.5`.
   */
  public final fun setPointOffset(index: Int, offset: Float): Int {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve.
   */
  public final fun sample(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.samplePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve
   * using the baked cache. Bakes the curve's points if not already baked.
   */
  public final fun sampleBaked(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.sampleBakedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the left tangent angle (in degrees) for the point at [index].
   */
  public final fun getPointLeftTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointLeftTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the right tangent angle (in degrees) for the point at [index].
   */
  public final fun getPointRightTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointRightTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the left [TangentMode] for the point at [index].
   */
  public final fun getPointLeftMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointLeftModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the right [TangentMode] for the point at [index].
   */
  public final fun getPointRightMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointRightModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the left tangent angle for the point at [index] to [tangent].
   */
  public final fun setPointLeftTangent(index: Int, tangent: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointLeftTangentPtr, NIL)
  }

  /**
   * Sets the right tangent angle for the point at [index] to [tangent].
   */
  public final fun setPointRightTangent(index: Int, tangent: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointRightTangentPtr, NIL)
  }

  /**
   * Sets the left [TangentMode] for the point at [index] to [mode].
   */
  public final fun setPointLeftMode(index: Int, mode: TangentMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setPointLeftModePtr, NIL)
  }

  /**
   * Sets the right [TangentMode] for the point at [index] to [mode].
   */
  public final fun setPointRightMode(index: Int, mode: TangentMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setPointRightModePtr, NIL)
  }

  public final fun getMinValue(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMinValue(min: Float): Unit {
    TransferContext.writeArguments(DOUBLE to min.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMinValuePtr, NIL)
  }

  public final fun getMaxValue(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxValue(max: Float): Unit {
    TransferContext.writeArguments(DOUBLE to max.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxValuePtr, NIL)
  }

  /**
   * Removes duplicate points, i.e. points that are less than 0.00001 units (engine epsilon value)
   * away from their neighbor on the curve.
   */
  public final fun cleanDupes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.cleanDupesPtr, NIL)
  }

  /**
   * Recomputes the baked cache of points for the curve.
   */
  public final fun bake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.bakePtr, NIL)
  }

  public final fun getBakeResolution(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeResolutionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBakeResolution(resolution: Int): Unit {
    TransferContext.writeArguments(LONG to resolution.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBakeResolutionPtr, NIL)
  }

  public enum class TangentMode(
    id: Long,
  ) {
    /**
     * The tangent on this side of the point is user-defined.
     */
    TANGENT_FREE(0),
    /**
     * The curve calculates the tangent on this side of the point as the slope halfway towards the
     * adjacent point.
     */
    TANGENT_LINEAR(1),
    /**
     * The total number of available tangent modes.
     */
    TANGENT_MODE_COUNT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TangentMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_count", 3905245786)

    internal val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_count", 1286410249)

    internal val addPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "add_point", 434072736)

    internal val removePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "remove_point", 1286410249)

    internal val clearPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "clear_points", 3218959716)

    internal val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_position", 2299179447)

    internal val setPointValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_value", 1602489585)

    internal val setPointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_offset", 3780573764)

    internal val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "sample", 3919130443)

    internal val sampleBakedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "sample_baked", 3919130443)

    internal val getPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_tangent", 2339986948)

    internal val getPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_tangent", 2339986948)

    internal val getPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_mode", 426950354)

    internal val getPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_mode", 426950354)

    internal val setPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_tangent", 1602489585)

    internal val setPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_tangent", 1602489585)

    internal val setPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_mode", 1217242874)

    internal val setPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_mode", 1217242874)

    internal val getMinValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_min_value", 1740695150)

    internal val setMinValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_min_value", 373806689)

    internal val getMaxValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_max_value", 1740695150)

    internal val setMaxValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_max_value", 373806689)

    internal val cleanDupesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "clean_dupes", 3218959716)

    internal val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "bake", 3218959716)

    internal val getBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_bake_resolution", 3905245786)

    internal val setBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_bake_resolution", 1286410249)
  }
}
