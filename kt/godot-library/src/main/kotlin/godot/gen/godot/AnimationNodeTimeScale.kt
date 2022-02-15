// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A time-scaling animation node to be used with [godot.AnimationTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/125](https://godotengine.org/asset-library/asset/125)
 *
 * Allows scaling the speed of the animation (or reversing it) in any children nodes. Setting it to 0 will pause the animation.
 */
@GodotBaseType
public open class AnimationNodeTimeScale : AnimationNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODETIMESCALE)
  }

  public companion object
}
