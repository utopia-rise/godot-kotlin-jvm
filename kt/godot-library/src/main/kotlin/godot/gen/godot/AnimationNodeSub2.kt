// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Blends two animations subtractively inside of an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Blends two animations subtractively based on the amount value.
 *
 * This animation node is usually used for pre-calculation to cancel out any extra poses from the animation for the "add" animation source in [godot.AnimationNodeAdd2] or [godot.AnimationNodeAdd3].
 *
 * In general, the blend value should be in the `[0.0, 1.0]` range, but values outside of this range can be used for amplified or inverted animations.
 *
 * **Note:** This calculation is different from using a negative value in [godot.AnimationNodeAdd2], since the transformation matrices do not satisfy the commutative law. [godot.AnimationNodeSub2] multiplies the transformation matrix of the inverted animation from the left side, while negative [godot.AnimationNodeAdd2] multiplies it from the right side.
 */
@GodotBaseType
public open class AnimationNodeSub2 : AnimationNodeSync() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESUB2, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
