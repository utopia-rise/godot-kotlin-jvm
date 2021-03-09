// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress

/**
 * Blends two animations additively inside of an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Blends two animations additively based on an amount value in the `[0.0, 1.0]` range.
 */
@GodotBaseType
open class AnimationNodeAdd2 : AnimationNode() {
  /**
   * If `true`, sets the `optimization` to `false` when calling [godot.AnimationNode.blendInput], forcing the blended animations to update every frame.
   */
  open var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEADD2_GET_SYNC, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEADD2_SET_SYNC, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODEADD2)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
