// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Blends two of three animations linearly inside of an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Blends two animations together linearly out of three based on a value in the `[-1.0, 1.0]` range.
 *
 * This node has three inputs:
 *
 * - The base animation
 *
 * - A -blend animation to blend with when the blend amount is in the `[-1.0, 0.0]` range.
 *
 * - A +blend animation to blend with when the blend amount is in the `[0.0, 1.0]` range
 */
@GodotBaseType
public open class AnimationNodeBlend3 : AnimationNode() {
  /**
   * If `true`, sets the `optimization` to `false` when calling [godot.AnimationNode.blendInput], forcing the blended animations to update every frame.
   */
  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLEND3_IS_USING_SYNC,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLEND3_SET_USE_SYNC,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLEND3)
  }

  public companion object
}
