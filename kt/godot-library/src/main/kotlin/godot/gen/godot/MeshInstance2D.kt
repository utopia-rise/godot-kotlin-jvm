// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Node used for displaying a [godot.Mesh] in 2D.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_meshes.html]($DOCS_URL/tutorials/2d/2d_meshes.html)
 *
 * Node used for displaying a [godot.Mesh] in 2D. A [godot.MeshInstance2D] can be automatically created from an existing [godot.Sprite2D] via a tool in the editor toolbar. Select the [godot.Sprite2D] node, then choose **Sprite2D > Convert to MeshInstance2D** at the top of the 2D editor viewport.
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
  public var mesh: Mesh?
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
   * The [godot.Texture2D] that will be used if using the default [godot.CanvasItemMaterial]. Can be accessed as `TEXTURE` in CanvasItem shader.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE2D_SET_TEXTURE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHINSTANCE2D, scriptIndex)
    return true
  }

  public companion object
}
