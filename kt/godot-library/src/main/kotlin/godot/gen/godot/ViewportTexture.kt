// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A [ViewportTexture] provides the content of a [Viewport] as a dynamic [Texture2D]. This can be
 * used to combine the rendering of [Control], [Node2D] and [Node3D] nodes. For example, you can use
 * this texture to display a 3D scene inside a [TextureRect], or a 2D overlay in a [Sprite3D].
 * To get a [ViewportTexture] in code, use the [Viewport.getTexture] method on the target viewport.
 * **Note:** A [ViewportTexture] is always local to its scene (see [Resource.resourceLocalToScene]).
 * If the scene root is not ready, it may return incorrect data (see [signal Node.ready]).
 * **Note:** Instantiating scenes containing a high-resolution [ViewportTexture] may cause
 * noticeable stutter.
 */
@GodotBaseType
public open class ViewportTexture : Texture2D() {
  /**
   * The path to the [Viewport] node to display. This is relative to the local scene root (see
   * [Resource.getLocalScene]), **not** to the nodes that use this texture.
   * **Note:** In the editor, this path is automatically updated when the target viewport or one of
   * its ancestors is renamed or moved. At runtime, this path may not automatically update if the scene
   * root cannot be found.
   */
  public var viewportPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getViewportPathInScenePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setViewportPathInScenePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIEWPORTTEXTURE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setViewportPathInScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ViewportTexture", "set_viewport_path_in_scene")

    public val getViewportPathInScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ViewportTexture", "get_viewport_path_in_scene")
  }
}
