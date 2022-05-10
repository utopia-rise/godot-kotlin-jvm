// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Editor-only helper for setting up root motion in [godot.AnimationTree].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html#root-motion](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html#root-motion)
 *
 * *Root motion* refers to an animation technique where a mesh's skeleton is used to give impulse to a character. When working with 3D animations, a popular technique is for animators to use the root skeleton bone to give motion to the rest of the skeleton. This allows animating characters in a way where steps actually match the floor below. It also allows precise interaction with objects during cinematics. See also [godot.AnimationTree].
 *
 * **Note:** [godot.RootMotionView] is only visible in the editor. It will be hidden automatically in the running project, and will also be converted to a plain [godot.Node] in the running project. This means a script attached to a [godot.RootMotionView] node *must* have `extends Node` instead of `extends RootMotionView`. Additionally, it must not be a `tool` script.
 */
@GodotBaseType
public open class RootMotionView : VisualInstance() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ROOTMOTIONVIEW)
  }
}
