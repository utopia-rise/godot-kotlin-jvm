// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Base container control for popups and dialogs.
 *
 * Popup is a base [godot.Control] used to show dialogs and popups. It's a subwindow and modal by default (see [godot.Control]) and has helpers for custom popup behavior.
 */
@GodotBaseType
public open class Popup : Window() {
  /**
   * Emitted when a popup is hidden.
   */
  public val popupHide: Signal0 by signal()

  /**
   * If `true`, the [godot.Popup] will close when its parent is focused.
   */
  public open var closeOnParentFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_GET_CLOSE_ON_PARENT_FOCUS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_SET_CLOSE_ON_PARENT_FOCUS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POPUP)
  }

  public companion object
}
