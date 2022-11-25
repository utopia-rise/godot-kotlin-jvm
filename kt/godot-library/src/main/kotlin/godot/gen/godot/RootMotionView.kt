// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Editor-only helper for setting up root motion in [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html#root-motion]($DOCS_URL/tutorials/animation/animation_tree.html#root-motion)
 *
 * *Root motion* refers to an animation technique where a mesh's skeleton is used to give impulse to a character. When working with 3D animations, a popular technique is for animators to use the root skeleton bone to give motion to the rest of the skeleton. This allows animating characters in a way where steps actually match the floor below. It also allows precise interaction with objects during cinematics. See also [godot.AnimationTree].
 *
 * **Note:** [godot.RootMotionView] is only visible in the editor. It will be hidden automatically in the running project.
 */
@GodotBaseType
public open class RootMotionView internal constructor() : VisualInstance3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ROOTMOTIONVIEW)
  }

  public companion object
}
