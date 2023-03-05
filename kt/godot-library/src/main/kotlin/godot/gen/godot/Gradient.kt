// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A color interpolator resource which can be used to generate colors between user-defined color points.
 *
 * Given a set of colors, this resource will interpolate them in order. This means that if you have color 1, color 2 and color 3, the gradient will interpolate from color 1 to color 2 and from color 2 to color 3. The gradient will initially have 2 colors (black and white), one (black) at gradient lower offset 0 and the other (white) at the gradient higher offset 1.
 *
 * See also [godot.Curve] which supports more complex easing methods, but does not support colors.
 */
@GodotBaseType
public open class Gradient : Resource() {
  /**
   * Defines how the colors between points of the gradient are interpolated. See [enum InterpolationMode] for available modes.
   */
  public var interpolationMode: InterpolationMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_INTERPOLATION_MODE,
          LONG)
      return Gradient.InterpolationMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_INTERPOLATION_MODE,
          NIL)
    }

  /**
   * Gradient's offsets returned as a [godot.PackedFloat32Array].
   */
  public var offsets: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_OFFSETS,
          PACKED_FLOAT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_OFFSETS, NIL)
    }

  /**
   * Gradient's colors returned as a [godot.PackedColorArray].
   */
  public var colors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_COLORS,
          PACKED_COLOR_ARRAY)
      return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_COLORS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRADIENT, scriptIndex)
    return true
  }

  /**
   * Adds the specified color to the end of the gradient, with the specified offset.
   */
  public fun addPoint(offset: Double, color: Color): Unit {
    TransferContext.writeArguments(DOUBLE to offset, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_ADD_POINT, NIL)
  }

  /**
   * Removes the color at the index [point].
   */
  public fun removePoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_REMOVE_POINT, NIL)
  }

  /**
   * Sets the offset for the gradient color at index [point].
   */
  public fun setOffset(point: Long, offset: Double): Unit {
    TransferContext.writeArguments(LONG to point, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_OFFSET, NIL)
  }

  /**
   * Returns the offset of the gradient color at index [point].
   */
  public fun getOffset(point: Long): Double {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Reverses/mirrors the gradient.
   */
  public fun reverse(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_REVERSE, NIL)
  }

  /**
   * Sets the color of the gradient color at index [point].
   */
  public fun setColor(point: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to point, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_COLOR, NIL)
  }

  /**
   * Returns the color of the gradient color at index [point].
   */
  public fun getColor(point: Long): Color {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the interpolated color specified by `offset`.
   */
  public fun sample(offset: Double): Color {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SAMPLE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the number of colors in the gradient.
   */
  public fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class InterpolationMode(
    id: Long,
  ) {
    /**
     * Linear interpolation.
     */
    GRADIENT_INTERPOLATE_LINEAR(0),
    /**
     * Constant interpolation, color changes abruptly at each point and stays uniform between. This might cause visible aliasing when used for a gradient texture in some cases.
     */
    GRADIENT_INTERPOLATE_CONSTANT(1),
    /**
     * Cubic interpolation.
     */
    GRADIENT_INTERPOLATE_CUBIC(2),
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
