// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Playback control for [godot.AnimationNodeStateMachine].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * Allows control of [godot.AnimationTree] state machines created with [godot.AnimationNodeStateMachine]. Retrieve with `$AnimationTree.get("parameters/playback")`.
 *
 * **Example:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var state_machine = $AnimationTree.get("parameters/playback")
 *
 * state_machine.travel("some_state")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var stateMachine = GetNode<AnimationTree>("AnimationTree").Get("parameters/playback") as AnimationNodeStateMachinePlayback;
 *
 * stateMachine.Travel("some_state");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeStateMachinePlayback : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK)
  }

  /**
   * Transitions from the current state to another one, following the shortest path.
   */
  public fun travel(toNode: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to toNode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_TRAVEL,
        NIL.ordinal)
  }

  /**
   * Starts playing the given animation.
   */
  public fun start(node: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to node)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_START,
        NIL.ordinal)
  }

  /**
   * Stops the currently playing animation.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_STOP,
        NIL.ordinal)
  }

  /**
   * Returns `true` if an animation is playing.
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_IS_PLAYING, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the currently playing animation state.
   */
  public fun getCurrentNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_NODE,
        STRING_NAME.ordinal)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the playback position within the current animation state.
   */
  public fun getCurrentPlayPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_PLAY_POSITION,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun getCurrentLength(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_LENGTH,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the current travel path as computed internally by the A* algorithm.
   */
  public fun getTravelPath(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_TRAVEL_PATH,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  public companion object
}
