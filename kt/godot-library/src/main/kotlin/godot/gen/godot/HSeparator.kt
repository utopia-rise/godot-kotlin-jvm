// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Horizontal separator.
 *
 * Horizontal separator. See [godot.Separator]. Even though it looks horizontal, it is used to separate objects vertically.
 */
@GodotBaseType
open class HSeparator : Separator() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_HSEPARATOR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
