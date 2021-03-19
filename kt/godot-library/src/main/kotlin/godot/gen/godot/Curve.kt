// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Curve
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * A mathematic curve.
 * 
 * A curve that can be saved and re-used for other objects. By default, it ranges between `0` and `1` on the Y axis and positions points relative to the `0.5` Y position.
 */
@GodotBaseType
open class Curve : Resource() {
  /**
   * Emitted when [maxValue] or [minValue] is changed.
   */
  val rangeChanged: Signal0 by signal()

  /**
   * The number of points to include in the baked (i.e. cached) curve data.
   */
  open var bakeResolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_BAKE_RESOLUTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_BAKE_RESOLUTION, NIL)
    }

  /**
   * The maximum value the curve can reach.
   */
  open var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MAX_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MAX_VALUE, NIL)
    }

  /**
   * The minimum value the curve can reach.
   */
  open var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MIN_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MIN_VALUE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CURVE)
  }

  open fun _getData(): VariantArray<Any?> {
    throw NotImplementedError("_get_data is not implemented for Curve")
  }

  open fun _setData(data: VariantArray<Any?>) {
  }

  /**
   * Adds a point to the curve. For each side, if the `*_mode` is [TANGENT_LINEAR], the `*_tangent` angle (in degrees) uses the slope of the curve halfway to the adjacent point. Allows custom assignments to the `*_tangent` angle if `*_mode` is set to [TANGENT_FREE].
   */
  open fun addPoint(
    position: Vector2,
    leftTangent: Double = 0.0,
    rightTangent: Double = 0.0,
    leftMode: Long = 0,
    rightMode: Long = 0
  ): Long {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent, DOUBLE to
        rightTangent, LONG to leftMode, LONG to rightMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_ADD_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Recomputes the baked cache of points for the curve.
   */
  open fun bake() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_BAKE, NIL)
  }

  /**
   * Removes points that are closer than `CMP_EPSILON` (0.00001) units to their neighbor on the curve.
   */
  open fun cleanDupes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAN_DUPES, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  open fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAR_POINTS, NIL)
  }

  /**
   * Returns the number of points describing the curve.
   */
  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the left [enum TangentMode] for the point at `index`.
   */
  open fun getPointLeftMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the left tangent angle (in degrees) for the point at `index`.
   */
  open fun getPointLeftTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the curve coordinates for the point at `index`.
   */
  open fun getPointPosition(index: Long): Vector2 {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the right [enum TangentMode] for the point at `index`.
   */
  open fun getPointRightMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the right tangent angle (in degrees) for the point at `index`.
   */
  open fun getPointRightTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the Y value for the point that would exist at the X position `offset` along the curve.
   */
  open fun interpolate(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_INTERPOLATE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the Y value for the point that would exist at the X position `offset` along the curve using the baked cache. Bakes the curve's points if not already baked.
   */
  open fun interpolateBaked(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_INTERPOLATE_BAKED, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Removes the point at `index` from the curve.
   */
  open fun removePoint(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_REMOVE_POINT, NIL)
  }

  /**
   * Sets the left [enum TangentMode] for the point at `index` to `mode`.
   */
  open fun setPointLeftMode(index: Long, mode: Long) {
    TransferContext.writeArguments(LONG to index, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_MODE, NIL)
  }

  /**
   * Sets the left tangent angle for the point at `index` to `tangent`.
   */
  open fun setPointLeftTangent(index: Long, tangent: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_TANGENT, NIL)
  }

  /**
   * Sets the offset from `0.5`.
   */
  open fun setPointOffset(index: Long, offset: Double): Long {
    TransferContext.writeArguments(LONG to index, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the right [enum TangentMode] for the point at `index` to `mode`.
   */
  open fun setPointRightMode(index: Long, mode: Long) {
    TransferContext.writeArguments(LONG to index, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_MODE, NIL)
  }

  /**
   * Sets the right tangent angle for the point at `index` to `tangent`.
   */
  open fun setPointRightTangent(index: Long, tangent: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_TANGENT, NIL)
  }

  /**
   * Assigns the vertical position `y` to the point at `index`.
   */
  open fun setPointValue(index: Long, y: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_VALUE, NIL)
  }

  enum class TangentMode(
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
    TANGENT_MODE_COUNT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The tangent on this side of the point is user-defined.
     */
    final const val TANGENT_FREE: Long = 0

    /**
     * The curve calculates the tangent on this side of the point as the slope halfway towards the adjacent point.
     */
    final const val TANGENT_LINEAR: Long = 1

    /**
     * The total number of available tangent modes.
     */
    final const val TANGENT_MODE_COUNT: Long = 2
  }
}
