// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * A time-scaling animation node to be used with [godot.AnimationTree].
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 * 
 * Allows scaling the speed of the animation (or reversing it) in any children nodes. Setting it to 0 will pause the animation.
 */
@GodotBaseType
open class AnimationNodeTimeScale : AnimationNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_ANIMATIONNODETIMESCALE)
  }
}
