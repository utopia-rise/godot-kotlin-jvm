// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Vertical split container.
 *
 * Vertical split container. See [godot.SplitContainer]. This goes from top to bottom.
 */
@GodotBaseType
open class VSplitContainer : SplitContainer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VSPLITCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
