// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
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
 * **Note:** A [godot.ViewportTexture] is always local to its scene (see [godot.Resource.resourceLocalToScene]). If the scene root is not ready, it may return incorrect data (see [godot.Node.ready]).
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
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORTTEXTURE_GET_VIEWPORT_PATH_IN_SCENE, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORTTEXTURE_SET_VIEWPORT_PATH_IN_SCENE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIEWPORTTEXTURE, scriptIndex)
    return true
  }

  public companion object
}
