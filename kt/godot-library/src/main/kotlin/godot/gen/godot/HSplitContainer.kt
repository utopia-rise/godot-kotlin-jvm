// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Horizontal split container.
 *
 * Horizontal split container. See [godot.SplitContainer]. This goes from left to right.
 */
@GodotBaseType
open class HSplitContainer : SplitContainer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_HSPLITCONTAINER,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
