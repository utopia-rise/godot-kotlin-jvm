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
 * A time-seeking animation node to be used with [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * This node can be used to cause a seek command to happen to any sub-children of the animation graph. Use this node type to play an [godot.Animation] from the start or a certain playback position inside the [godot.AnimationNodeBlendTree].
 *
 * After setting the time and changing the animation playback, the time seek node automatically goes into sleep mode on the next process frame by setting its `seek_request` value to `-1.0`.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Play child animation from the start.
 *
 * animation_tree.set("parameters/TimeSeek/seek_request", 0.0)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/TimeSeek/seek_request"] = 0.0
 *
 *
 *
 * # Play child animation from 12 second timestamp.
 *
 * animation_tree.set("parameters/TimeSeek/seek_request", 12.0)
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/TimeSeek/seek_request"] = 12.0
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Play child animation from the start.
 *
 * animationTree.Set("parameters/TimeSeek/seek_request", 0.0);
 *
 *
 *
 * // Play child animation from 12 second timestamp.
 *
 * animationTree.Set("parameters/TimeSeek/seek_request", 12.0);
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeTimeSeek : AnimationNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODETIMESEEK, scriptIndex)
    return true
  }

  public companion object
}
