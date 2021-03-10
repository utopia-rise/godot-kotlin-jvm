// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Texture with 3 dimensions.
 *
 * Texture3D is a 3-dimensional texture that has a width, height, and depth.
 */
@GodotBaseType
open class Texture3D : TextureLayered() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TEXTURE3D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
