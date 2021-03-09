// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Generic 3D position hint for editing.
 *
 * Generic 3D position hint for editing. It's just like a plain [godot.Spatial], but it displays as a cross in the 3D editor at all times.
 */
@GodotBaseType
open class Position3D : Spatial() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POSITION3D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
