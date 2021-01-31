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

@GodotBaseType
open class Gradient : Resource() {
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

  open fun addPoint(offset: Double, color: Color) {
    TransferContext.writeArguments(DOUBLE to offset, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_ADD_POINT, NIL)
  }

  open fun getColor(point: Long): Color {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getOffset(point: Long): Double {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun interpolate(offset: Double): Color {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_INTERPOLATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun removePoint(offset: Long) {
    TransferContext.writeArguments(LONG to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_REMOVE_POINT, NIL)
  }

  open fun setColor(point: Long, color: Color) {
    TransferContext.writeArguments(LONG to point, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_COLOR, NIL)
  }

  open fun setOffset(point: Long, offset: Double) {
    TransferContext.writeArguments(LONG to point, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENT_SET_OFFSET, NIL)
  }

  companion object
}
