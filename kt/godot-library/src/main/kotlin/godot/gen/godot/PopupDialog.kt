// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Base class for popup dialogs.
 *
 * PopupDialog is a base class for popup dialogs, along with [godot.WindowDialog].
 */
@GodotBaseType
open class PopupDialog : Popup() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POPUPDIALOG)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
