// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A time-seeking animation node to be used with [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * This node can be used to cause a seek command to happen to any sub-children of the animation graph. Use this node type to play an [godot.Animation] from the start or a certain playback position inside the [godot.AnimationNodeBlendTree]. After setting the time and changing the animation playback, the seek node automatically goes into sleep mode on the next process frame by setting its `seek_position` value to `-1.0`.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Play child animation from the start.
 *
 * animation_tree.set("parameters/Seek/seek_position", 0.0)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/Seek/seek_position"] = 0.0
 *
 *
 *
 * # Play child animation from 12 second timestamp.
 *
 * animation_tree.set("parameters/Seek/seek_position", 12.0)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/Seek/seek_position"] = 12.0
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Play child animation from the start.
 *
 * animationTree.Set("parameters/Seek/seek_position", 0.0);
 *
 *
 *
 * // Play child animation from 12 second timestamp.
 *
 * animationTree.Set("parameters/Seek/seek_position", 12.0);
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeTimeSeek : AnimationNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODETIMESEEK)
  }

  public companion object
}
