// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Simple texture that uses a mesh to draw itself.
 *
 * Simple texture that uses a mesh to draw itself. It's limited because flags can't be changed and region drawing is not supported.
 */
@GodotBaseType
public open class MeshTexture : Texture2D() {
  /**
   * Sets the mesh used to draw. It must be a mesh using 2D vertices.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_MESH, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_MESH, NIL)
    }

  /**
   * Sets the base texture that the Mesh will use to draw.
   */
  public var baseTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_BASE_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_BASE_TEXTURE, NIL)
    }

  /**
   * Sets the size of the image, needed for reference.
   */
  public var imageSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_GET_IMAGE_SIZE,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHTEXTURE_SET_IMAGE_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHTEXTURE, scriptIndex)
    return true
  }

  /**
   * Sets the size of the image, needed for reference.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = meshtexture.imageSize
   * //Your changes
   * meshtexture.imageSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun imageSize(block: Vector2.() -> Unit): Vector2 = imageSize.apply{
      block(this)
      imageSize = this
  }


  public companion object
}
