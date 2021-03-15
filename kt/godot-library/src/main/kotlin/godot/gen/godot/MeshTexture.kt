// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 * Simple texture that uses a mesh to draw itself.
 *
 * Simple texture that uses a mesh to draw itself. It's limited because flags can't be changed and region drawing is not supported.
 */
@GodotBaseType
open class MeshTexture : Texture() {
  /**
   * Sets the base texture that the Mesh will use to draw.
   */
  open var baseTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_BASE_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_BASE_TEXTURE, NIL)
    }

  /**
   * Sets the size of the image, needed for reference.
   */
  open var imageSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_IMAGE_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_IMAGE_SIZE, NIL)
    }

  /**
   * Sets the mesh used to draw. It must be a mesh using 2D vertices.
   */
  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_MESH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MESHTEXTURE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun imageSize(schedule: Vector2.() -> Unit): Vector2 = imageSize.apply{
      schedule(this)
      imageSize = this
  }

}
