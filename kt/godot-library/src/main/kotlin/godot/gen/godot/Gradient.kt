// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * A color interpolator resource which can be used to generate colors between user-defined color points.
 *
 * Given a set of colors, this resource will interpolate them in order. This means that if you have color 1, color 2 and color 3, the ramp will interpolate from color 1 to color 2 and from color 2 to color 3. The ramp will initially have 2 colors (black and white), one (black) at ramp lower offset 0 and the other (white) at the ramp higher offset 1.
 */
@GodotBaseType
open class Gradient : Resource() {
  /**
   * Gradient's colors returned as a [godot.core.PoolColorArray].
   */
  open var colors: PoolColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_COLORS,
          POOL_COLOR_ARRAY)
      return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_COLORS, NIL)
    }

  /**
   * Gradient's offsets returned as a [godot.core.PoolRealArray].
   */
  open var offsets: PoolRealArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_OFFSETS,
          POOL_REAL_ARRAY)
      return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_REAL_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_OFFSETS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_GRADIENT)

  /**
   * Adds the specified color to the end of the ramp, with the specified offset.
   */
  open fun addPoint(offset: Double, color: Color) {
    TransferContext.writeArguments(DOUBLE to offset, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_ADD_POINT, NIL)
  }

  /**
   * Returns the color of the ramp color at index `point`.
   */
  open fun getColor(point: Long): Color {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the offset of the ramp color at index `point`.
   */
  open fun getOffset(point: Long): Double {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the number of colors in the ramp.
   */
  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the interpolated color specified by `offset`.
   */
  open fun interpolate(offset: Double): Color {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_INTERPOLATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Removes the color at the index `offset`.
   */
  open fun removePoint(offset: Long) {
    TransferContext.writeArguments(LONG to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_REMOVE_POINT, NIL)
  }

  /**
   * Sets the color of the ramp color at index `point`.
   */
  open fun setColor(point: Long, color: Color) {
    TransferContext.writeArguments(LONG to point, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_COLOR, NIL)
  }

  /**
   * Sets the offset for the ramp color at index `point`.
   */
  open fun setOffset(point: Long, offset: Double) {
    TransferContext.writeArguments(LONG to point, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_OFFSET, NIL)
  }
}
