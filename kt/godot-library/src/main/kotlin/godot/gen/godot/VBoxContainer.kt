// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Vertical box container.
 *
 * Vertical box container. See [godot.BoxContainer].
 */
@GodotBaseType
open class VBoxContainer : BoxContainer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VBOXCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
