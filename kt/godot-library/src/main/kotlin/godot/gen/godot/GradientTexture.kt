// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

/**
 * Gradient-filled texture.
 *
 * GradientTexture uses a [godot.Gradient] to fill the texture data. The gradient will be filled from left to right using colors obtained from the gradient. This means the texture does not necessarily represent an exact copy of the gradient, but instead an interpolation of samples obtained from the gradient at fixed steps (see [width]).
 */
@GodotBaseType
open class GradientTexture : Texture() {
  /**
   * The [godot.Gradient] that will be used to fill the texture.
   */
  open var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_GET_GRADIENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_SET_GRADIENT, NIL)
    }

  /**
   * The number of color samples that will be obtained from the [godot.Gradient].
   */
  open var width: Long
    get() = super.getTextureWidth()
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE_SET_WIDTH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_GRADIENTTEXTURE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _update() {
  }
}
