// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress

/**
 * Node used for displaying a [godot.Mesh] in 2D.
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/2d_meshes.html](https://docs.godotengine.org/en/latest/tutorials/2d/2d_meshes.html)
 * 
 * Node used for displaying a [godot.Mesh] in 2D. Can be constructed from an existing [godot.Sprite] via a tool in the editor toolbar. Select "Sprite" then "Convert to Mesh2D", select settings in popup and press "Create Mesh2D".
 */
@GodotBaseType
open class MeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  val textureChanged: Signal0 by signal()

  /**
   * The [godot.Mesh] that will be drawn by the [godot.MeshInstance2D].
   */
  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_MESH, NIL)
    }

  /**
   * The normal map that will be used if using the default [godot.CanvasItemMaterial].
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_NORMAL_MAP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_NORMAL_MAP,
          NIL)
    }

  /**
   * The [godot.Texture] that will be used if using the default [godot.CanvasItemMaterial]. Can be accessed as `TEXTURE` in CanvasItem shader.
   */
  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_TEXTURE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_MESHINSTANCE2D)
  }
}
