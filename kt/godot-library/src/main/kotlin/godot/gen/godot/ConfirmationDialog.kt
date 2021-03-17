// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import kotlin.Suppress

@GodotBaseType
open class ConfirmationDialog : AcceptDialog() {
  override fun __new() {
    callConstructor(ENGINECLASS_CONFIRMATIONDIALOG)
  }

  open fun getCancel(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIRMATIONDIALOG_GET_CANCEL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }
}
