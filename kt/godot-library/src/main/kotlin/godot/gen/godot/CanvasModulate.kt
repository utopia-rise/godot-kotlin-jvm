// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import kotlin.Suppress
import kotlin.Unit

/**
 * Tint the entire canvas.
 *
 * [godot.CanvasModulate] tints the canvas elements using its assigned [color].
 */
@GodotBaseType
open class CanvasModulate : Node2D() {
  /**
   * The tint color to apply.
   */
  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASMODULATE_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASMODULATE_SET_COLOR, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CANVASMODULATE)
  }

  @CoreTypeHelper
  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }

}
