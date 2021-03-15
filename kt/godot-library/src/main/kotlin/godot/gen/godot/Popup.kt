// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Base container control for popups and dialogs.
 *
 * Popup is a base [godot.Control] used to show dialogs and popups. It's a subwindow and modal by default (see [godot.Control]) and has helpers for custom popup behavior. All popup methods ensure correct placement within the viewport.
 */
@GodotBaseType
open class Popup : Control() {
  /**
   * Emitted when a popup is about to be shown. This is often used in [godot.PopupMenu] to clear the list of options then create a new one according to the current context.
   */
  val aboutToShow: Signal0 by signal()

  /**
   * Emitted when a popup is hidden.
   */
  val popupHide: Signal0 by signal()

  /**
   * If `true`, the popup will not be hidden when a click event occurs outside of it, or when it receives the `ui_cancel` action event.
   *
   * **Note:** Enabling this property doesn't affect the Close or Cancel buttons' behavior in dialogs that inherit from this class. As a workaround, you can use [godot.WindowDialog.getCloseButton] or [godot.ConfirmationDialog.getCancel] and hide the buttons in question by setting their [godot.CanvasItem.visible] property to `false`.
   */
  open var popupExclusive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_GET_POPUP_EXCLUSIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_SET_POPUP_EXCLUSIVE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POPUP, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Popup (show the control in modal form).
   */
  open fun popup(bounds: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)) {
    TransferContext.writeArguments(RECT2 to bounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP, NIL)
  }

  /**
   * Popup (show the control in modal form) in the center of the screen relative to its current canvas transform, at the current size, or at a size determined by `size`.
   */
  open fun popupCentered(size: Vector2 = Vector2(0.0, 0.0)) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED, NIL)
  }

  /**
   * Popup (show the control in modal form) in the center of the screen relative to the current canvas transform, clamping the size to `size`, then ensuring the popup is no larger than the viewport size multiplied by `fallback_ratio`.
   */
  open fun popupCenteredClamped(size: Vector2 = Vector2(0.0, 0.0), fallbackRatio: Double = 0.75) {
    TransferContext.writeArguments(VECTOR2 to size, DOUBLE to fallbackRatio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_CLAMPED, NIL)
  }

  /**
   * Popup (show the control in modal form) in the center of the screen relative to the current canvas transform, ensuring the size is never smaller than `minsize`.
   */
  open fun popupCenteredMinsize(minsize: Vector2 = Vector2(0.0, 0.0)) {
    TransferContext.writeArguments(VECTOR2 to minsize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_MINSIZE, NIL)
  }

  /**
   * Popup (show the control in modal form) in the center of the screen relative to the current canvas transform, scaled at a ratio of size of the screen.
   */
  open fun popupCenteredRatio(ratio: Double = 0.75) {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_RATIO, NIL)
  }

  /**
   * Shrink popup to keep to the minimum size of content.
   */
  open fun setAsMinsize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_SET_AS_MINSIZE, NIL)
  }

  companion object {
    /**
     * Notification sent right after the popup is hidden.
     */
    final const val NOTIFICATION_POPUP_HIDE: Long = 81

    /**
     * Notification sent right after the popup is shown.
     */
    final const val NOTIFICATION_POST_POPUP: Long = 80
  }
}
