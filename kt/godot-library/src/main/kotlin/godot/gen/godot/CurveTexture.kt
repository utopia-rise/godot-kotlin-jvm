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
 * A texture that shows a curve.
 *
 * Renders a given [godot.Curve] provided to it. Simplifies the task of drawing curves and/or saving them as image files.
 */
@GodotBaseType
open class CurveTexture : Texture() {
  /**
   * The `curve` rendered onto the texture.
   */
  open var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_SET_CURVE, NIL)
    }

  /**
   * The width of the texture.
   */
  open var width: Long
    get() = super.getTextureWidth()
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVETEXTURE_SET_WIDTH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CURVETEXTURE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _update() {
  }
}
