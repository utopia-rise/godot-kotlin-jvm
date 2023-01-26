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
 * Texture which displays the content of a [godot.Viewport].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * Displays the content of a [godot.Viewport] node as a dynamic [godot.Texture2D]. This can be used to mix controls, 2D, and 3D elements in the same scene.
 *
 * To create a ViewportTexture in code, use the [godot.Viewport.getTexture] method on the target viewport.
 *
 * **Note:** When local to scene, this texture uses [godot.Resource.setupLocalToScene] to set the proxy texture and flags in the local viewport.
 */
@GodotBaseType
public open class ViewportTexture : Texture2D() {
  /**
   * The path to the [godot.Viewport] node to display. This is relative to the scene root, not to the node which uses the texture.
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
