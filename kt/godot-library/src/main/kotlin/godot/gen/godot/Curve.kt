// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Curve
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A mathematic curve.
 *
 * A curve that can be saved and re-used for other objects. By default, it ranges between `0` and `1` on the Y axis and positions points relative to the `0.5` Y position.
 *
 * See also [godot.Gradient] which is designed for color interpolation. See also [godot.Curve2D] and [godot.Curve3D].
 */
@GodotBaseType
public open class Curve : Resource() {
  /**
   * Emitted when [maxValue] or [minValue] is changed.
   */
  public val rangeChanged: Signal0 by signal()

  /**
   * The minimum value the curve can reach.
   */
  public var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MIN_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MIN_VALUE, NIL)
    }

  /**
   * The maximum value the curve can reach.
   */
  public var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MAX_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MAX_VALUE, NIL)
    }

  /**
   * The number of points to include in the baked (i.e. cached) curve data.
   */
  public var bakeResolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_BAKE_RESOLUTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_BAKE_RESOLUTION, NIL)
    }

  /**
   * The number of points describing the curve.
   */
  public var pointCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVE, scriptIndex)
    return true
  }

  /**
   * Adds a point to the curve. For each side, if the `*_mode` is [TANGENT_LINEAR], the `*_tangent` angle (in degrees) uses the slope of the curve halfway to the adjacent point. Allows custom assignments to the `*_tangent` angle if `*_mode` is set to [TANGENT_FREE].
   */
  public fun addPoint(
    position: Vector2,
    leftTangent: Double = 0.0,
    rightTangent: Double = 0.0,
    leftMode: Curve.TangentMode = Curve.TangentMode.TANGENT_FREE,
    rightMode: Curve.TangentMode = Curve.TangentMode.TANGENT_FREE
  ): Long {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent, DOUBLE to rightTangent, LONG to leftMode.id, LONG to rightMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_ADD_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the point at `index` from the curve.
   */
  public fun removePoint(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_REMOVE_POINT, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAR_POINTS, NIL)
  }

  /**
   * Returns the curve coordinates for the point at [index].
   */
  public fun getPointPosition(index: Long): Vector2 {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Assigns the vertical position [y] to the point at [index].
   */
  public fun setPointValue(index: Long, y: Double): Unit {
    TransferContext.writeArguments(LONG to index, DOUBLE to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_VALUE, NIL)
  }

  /**
   * Sets the offset from `0.5`.
   */
  public fun setPointOffset(index: Long, offset: Double): Long {
    TransferContext.writeArguments(LONG to index, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve.
   */
  public fun sample(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SAMPLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve using the baked cache. Bakes the curve's points if not already baked.
   */
  public fun sampleBaked(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SAMPLE_BAKED, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the left tangent angle (in degrees) for the point at [index].
   */
  public fun getPointLeftTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the right tangent angle (in degrees) for the point at [index].
   */
  public fun getPointRightTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the left [enum TangentMode] for the point at [index].
   */
  public fun getPointLeftMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the right [enum TangentMode] for the point at [index].
   */
  public fun getPointRightMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the left tangent angle for the point at [index] to [tangent].
   */
  public fun setPointLeftTangent(index: Long, tangent: Double): Unit {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_TANGENT, NIL)
  }

  /**
   * Sets the right tangent angle for the point at [index] to [tangent].
   */
  public fun setPointRightTangent(index: Long, tangent: Double): Unit {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_TANGENT, NIL)
  }

  /**
   * Sets the left [enum TangentMode] for the point at [index] to [mode].
   */
  public fun setPointLeftMode(index: Long, mode: Curve.TangentMode): Unit {
    TransferContext.writeArguments(LONG to index, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_MODE, NIL)
  }

  /**
   * Sets the right [enum TangentMode] for the point at [index] to [mode].
   */
  public fun setPointRightMode(index: Long, mode: Curve.TangentMode): Unit {
    TransferContext.writeArguments(LONG to index, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_MODE, NIL)
  }

  /**
   * Removes duplicate points, i.e. points that are less than 0.00001 units (engine epsilon value) away from their neighbor on the curve.
   */
  public fun cleanDupes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAN_DUPES, NIL)
  }

  /**
   * Recomputes the baked cache of points for the curve.
   */
  public fun bake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_BAKE, NIL)
  }

  public enum class TangentMode(
    id: Long
  ) {
    /**
     * The tangent on this side of the point is user-defined.
     */
    TANGENT_FREE(0),
    /**
     * The curve calculates the tangent on this side of the point as the slope halfway towards the adjacent point.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
