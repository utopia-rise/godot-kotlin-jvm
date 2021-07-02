// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Dialog for confirmation of actions.
 *
 * Dialog for confirmation of actions. This dialog inherits from [godot.AcceptDialog], but has by default an OK and Cancel button (in host OS order).
 *
 * To get cancel action, you can use:
 *
 * ```
 * 		get_cancel().connect("pressed", self, "cancelled")
 * 		```.
 */
@GodotBaseType
public open class ConfirmationDialog : AcceptDialog() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONFIRMATIONDIALOG)
  }

  /**
   * Returns the cancel button.
   */
  public open fun getCancel(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIRMATIONDIALOG_GET_CANCEL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }
}
