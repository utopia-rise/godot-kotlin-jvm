// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * Playback control for [godot.AnimationNodeStateMachine].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html)
 *
 * Allows control of [godot.AnimationTree] state machines created with [godot.AnimationNodeStateMachine]. Retrieve with `$AnimationTree.get("parameters/playback")`.
 *
 * **Example:**
 *
 * ```
 * 		var state_machine = $AnimationTree.get("parameters/playback")
 * 		state_machine.travel("some_state")
 * 		```
 */
@GodotBaseType
open class AnimationNodeStateMachinePlayback : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK)
  }

  /**
   * Returns the currently playing animation state.
   */
  open fun getCurrentNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current travel path as computed internally by the A* algorithm.
   */
  open fun getTravelPath(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_TRAVEL_PATH,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if an animation is playing.
   */
  open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts playing the given animation.
   */
  open fun start(node: String) {
    TransferContext.writeArguments(STRING to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_START, NIL)
  }

  /**
   * Stops the currently playing animation.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_STOP, NIL)
  }

  /**
   * Transitions from the current state to another one, following the shortest path.
   */
  open fun travel(toNode: String) {
    TransferContext.writeArguments(STRING to toNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_TRAVEL, NIL)
  }
}
