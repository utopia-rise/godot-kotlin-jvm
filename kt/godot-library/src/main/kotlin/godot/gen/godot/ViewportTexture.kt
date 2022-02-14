// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture which displays the content of a [godot.Viewport].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/586](https://godotengine.org/asset-library/asset/586)
 *
 * Displays the content of a [godot.Viewport] node as a dynamic [godot.Texture2D]. This can be used to mix controls, 2D, and 3D elements in the same scene.
 *
 * To create a ViewportTexture in code, use the [godot.Viewport.getTexture] method on the target viewport.
 */
@GodotBaseType
public open class ViewportTexture : Texture2D() {
  /**
   * The path to the [godot.Viewport] node to display. This is relative to the scene root, not to the node which uses the texture.
   */
  public open var viewportPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORTTEXTURE_GET_VIEWPORT_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORTTEXTURE_SET_VIEWPORT_PATH,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VIEWPORTTEXTURE)
  }

  public companion object
}
