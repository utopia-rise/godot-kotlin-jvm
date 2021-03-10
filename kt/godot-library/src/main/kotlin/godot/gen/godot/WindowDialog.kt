// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * Base class for window dialogs.
 *
 * Windowdialog is the base class for all window-based dialogs. It's a by-default toplevel [godot.Control] that draws a window decoration and allows motion and resizing.
 */
@GodotBaseType
open class WindowDialog : Popup() {
  /**
   * If `true`, the user can resize the window.
   */
  open var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_SET_RESIZABLE, NIL)
    }

  /**
   * The text displayed in the window's title bar.
   */
  open var windowTitle: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_WINDOW_TITLE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_SET_WINDOW_TITLE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WINDOWDIALOG)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _closed() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  /**
   * Returns the close [godot.TextureButton].
   */
  open fun getCloseButton(): TextureButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_CLOSE_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextureButton?
  }
}
