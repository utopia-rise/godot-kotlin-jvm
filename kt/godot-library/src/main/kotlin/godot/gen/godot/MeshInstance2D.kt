// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress
import kotlin.Unit

/**
 * Node used for displaying a [godot.Mesh] in 2D.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_meshes.html]($DOCS_URL/tutorials/2d/2d_meshes.html)
 *
 * Node used for displaying a [godot.Mesh] in 2D. A [godot.MeshInstance2D] can be automatically created from an existing [godot.Sprite] via a tool in the editor toolbar. Select the [godot.Sprite] node, then choose **Sprite > Convert to MeshInstance2D** at the top of the 2D editor viewport.
 */
@GodotBaseType
public open class MeshInstance2D : Node2D() {
  /**
   * Emitted when the [texture] is changed.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * The [godot.Mesh] that will be drawn by the [godot.MeshInstance2D].
   */
  public open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_MESH, NIL)
    }

  /**
   * The normal map that will be used if using the default [godot.CanvasItemMaterial].
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  public open var normalMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_NORMAL_MAP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_NORMAL_MAP,
          NIL)
    }

  /**
   * The [godot.Texture] that will be used if using the default [godot.CanvasItemMaterial]. Can be accessed as `TEXTURE` in CanvasItem shader.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_TEXTURE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESHINSTANCE2D)
  }
}
