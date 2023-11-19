// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A dialog used for confirmation of actions.
 *
 * A dialog used for confirmation of actions. This window is similar to [godot.AcceptDialog], but pressing its Cancel button can have a different outcome from pressing the OK button. The order of the two buttons varies depending on the host OS.
 *
 * To get cancel action, you can use:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * get_cancel_button().pressed.connect(self.canceled)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * GetCancelButton().Pressed += Canceled;
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class ConfirmationDialog : AcceptDialog() {
  /**
   * The text displayed by the cancel button (see [getCancelButton]).
   */
  public var cancelButtonText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCancelButtonTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCancelButtonTextPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONFIRMATIONDIALOG, scriptIndex)
    return true
  }

  /**
   * Returns the cancel button.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getCancelButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  public companion object

  internal object MethodBindings {
    public val getCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button")

    public val setCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "set_cancel_button_text")

    public val getCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button_text")
  }
}
