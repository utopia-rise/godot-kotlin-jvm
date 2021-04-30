// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Reference frame for GUI.
 *
 * A rectangle box that displays only a [borderColor] border color around its rectangle. [godot.ReferenceRect] has no fill [godot.core.Color]. If you need to display a rectangle filled with a solid color, consider using [godot.ColorRect] instead.
 */
@GodotBaseType
open class ReferenceRect : Control() {
  /**
   * Sets the border [godot.core.Color] of the [godot.ReferenceRect].
   */
  open var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_GET_BORDER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_SET_BORDER_COLOR,
          NIL)
    }

  /**
   * If set to `true`, the [godot.ReferenceRect] will only be visible while in editor. Otherwise, [godot.ReferenceRect] will be visible in game.
   */
  open var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_GET_EDITOR_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_SET_EDITOR_ONLY,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_REFERENCERECT)
  }

  @CoreTypeHelper
  open fun borderColor(schedule: Color.() -> Unit): Color = borderColor.apply{
      schedule(this)
      borderColor = this
  }

}
