// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

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
public open class AnimationNodeStateMachinePlayback : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK)
  }

  /**
   *
   */
  public open fun getCurrentLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the currently playing animation state.
   */
  public open fun getCurrentNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the playback position within the current animation state.
   */
  public open fun getCurrentPlayPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_PLAY_POSITION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the current travel path as computed internally by the A* algorithm.
   */
  public open fun getTravelPath(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_TRAVEL_PATH,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if an animation is playing.
   */
  public open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts playing the given animation.
   */
  public open fun start(node: String): Unit {
    TransferContext.writeArguments(STRING to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_START, NIL)
  }

  /**
   * Stops the currently playing animation.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_STOP, NIL)
  }

  /**
   * Transitions from the current state to another one, following the shortest path.
   */
  public open fun travel(toNode: String): Unit {
    TransferContext.writeArguments(STRING to toNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_TRAVEL, NIL)
  }
}
