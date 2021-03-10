// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Panel container type.
 *
 * Panel container type. This container fits controls inside of the delimited area of a stylebox. It's useful for giving controls an outline.
 */
@GodotBaseType
open class PanelContainer : Container() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PANELCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
