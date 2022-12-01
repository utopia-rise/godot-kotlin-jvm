// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Dialog for confirmation of actions.
 *
 * Dialog for confirmation of actions. This dialog inherits from [godot.AcceptDialog], but has by default an OK and Cancel button (in host OS order).
 *
 * To get cancel action, you can use:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * get_cancel_button().pressed.connect(self.cancelled)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * GetCancelButton().Pressed += Cancelled;
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class ConfirmationDialog : AcceptDialog() {
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONFIRMATIONDIALOG_GET_CANCEL_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  public companion object
}
