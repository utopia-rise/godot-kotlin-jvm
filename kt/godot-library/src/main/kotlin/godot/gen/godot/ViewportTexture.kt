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
 * Provides the content of a [godot.Viewport] as a dynamic texture.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * Provides the content of a [godot.Viewport] as a dynamic [godot.Texture2D]. This can be used to mix controls, 2D game objects, and 3D game objects in the same scene.
 *
 * To create a [godot.ViewportTexture] in code, use the [godot.Viewport.getTexture] method on the target viewport.
 *
 * **Note:** When local to scene, this texture uses [godot.Resource.setupLocalToScene] to set the proxy texture and flags in the local viewport. Local to scene [godot.ViewportTexture]s will return incorrect data until the scene root is ready (see [godot.Node.ready]).
 */
@GodotBaseType
public open class ViewportTexture : Texture2D() {
  /**
   * The path to the [godot.Viewport] node to display. This is relative to the scene root, not to the node that uses the texture.
   *
   * **Note:** In the editor, this path is automatically updated when the target viewport or one of its ancestors is renamed or moved. At runtime, the path may not be able to automatically update due to the inability to determine the scene root.
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
