// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Provides an opaque background for [godot.Control] children.
 *
 * Panel is a [godot.Control] that displays an opaque background. It's commonly used as a parent and container for other types of [godot.Control] nodes.
 */
@GodotBaseType
open class Panel : Control() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PANEL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
