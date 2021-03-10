// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Class for displaying popups with a panel background.
 *
 * Class for displaying popups with a panel background. In some cases it might be simpler to use than [godot.Popup], since it provides a configurable background. If you are making windows, better check [godot.WindowDialog].
 */
@GodotBaseType
open class PopupPanel : Popup() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POPUPPANEL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
