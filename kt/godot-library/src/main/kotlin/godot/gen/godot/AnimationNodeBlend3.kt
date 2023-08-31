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
 * Blends two of three animations linearly inside of an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Blends two animations out of three linearly out of three based on the amount value.
 *
 * This animation node has three inputs:
 *
 * - The base animation to blend with
 *
 * - A "-blend" animation to blend with when the blend amount is negative value
 *
 * - A "+blend" animation to blend with when the blend amount is positive value
 *
 * In general, the blend value should be in the `[-1.0, 1.0]` range. Values outside of this range can blend amplified animations, however, [godot.AnimationNodeAdd3] works better for this purpose.
 */
@GodotBaseType
public open class AnimationNodeBlend3 : AnimationNodeSync() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLEND3, scriptIndex)
    return true
  }

  public companion object
}
