// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Vertical version of [godot.Separator].
 *
 * Vertical version of [godot.Separator]. Even though it looks vertical, it is used to separate objects horizontally.
 */
@GodotBaseType
open class VSeparator : Separator() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VSEPARATOR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
