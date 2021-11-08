// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for window dialogs.
 *
 * Windowdialog is the base class for all window-based dialogs. It's a by-default toplevel [godot.Control] that draws a window decoration and allows motion and resizing.
 */
@GodotBaseType
public open class WindowDialog : Popup() {
  /**
   * If `true`, the user can resize the window.
   */
  public open var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_SET_RESIZABLE, NIL)
    }

  /**
   * The text displayed in the window's title bar.
   */
  public open var windowTitle: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_WINDOW_TITLE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_SET_WINDOW_TITLE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WINDOWDIALOG)
  }

  public open fun _closed(): Unit {
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  /**
   * Returns the close [godot.TextureButton].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getCloseButton(): TextureButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOWDIALOG_GET_CLOSE_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TextureButton?
  }
}
