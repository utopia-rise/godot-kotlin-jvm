// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A generic animation transition node for [godot.AnimationTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Simple state machine for cases which don't require a more advanced [godot.AnimationNodeStateMachine]. Animations can be connected to the inputs and transition times can be specified.
 *
 * After setting the request and changing the animation playback, the transition node automatically clears the request on the next process frame by setting its `transition_request` value to empty.
 *
 * **Note:** When using a cross-fade, `current_state` and `current_index` change to the next state immediately after the cross-fade begins.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Play child animation connected to "state_2" port.
 *
 * animation_tree.set("parameters/Transition/transition_request", "state_2")
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/Transition/transition_request"] = "state_2"
 *
 *
 *
 * # Get current state name (read-only).
 *
 * animation_tree.get("parameters/Transition/current_state")
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/Transition/current_state"]
 *
 *
 *
 * # Get current state index (read-only).
 *
 * animation_tree.get("parameters/Transition/current_index"))
 *
 * # Alternative syntax (same result as above).
 *
 * animation_tree["parameters/Transition/current_index"]
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Play child animation connected to "state_2" port.
 *
 * animationTree.Set("parameters/Transition/transition_request", "state_2");
 *
 *
 *
 * // Get current state name (read-only).
 *
 * animationTree.Get("parameters/Transition/current_state");
 *
 *
 *
 * // Get current state index (read-only).
 *
 * animationTree.Get("parameters/Transition/current_index");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeTransition : AnimationNodeSync() {
  /**
   * Cross-fading time (in seconds) between each animation connected to the inputs.
   */
  public var xfadeTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_XFADE_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_XFADE_TIME, NIL)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be linear.
   */
  public var xfadeCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_XFADE_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_XFADE_CURVE, NIL)
    }

  /**
   * If `true`, allows transition to the self state. When the reset option is enabled in input, the animation is restarted. If `false`, nothing happens on the transition to the self state.
   */
  public var allowTransitionToSelf: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_ALLOW_TRANSITION_TO_SELF, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_ALLOW_TRANSITION_TO_SELF, NIL)
    }

  /**
   * The number of enabled input ports for this node.
   */
  public var inputCount: Long
    @JvmName("getInputCount_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getInputCount()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION, scriptIndex)
    return true
  }

  /**
   * Enables or disables auto-advance for the given [input] index. If enabled, state changes to the next input after playing the animation once. If enabled for the last input state, it loops to the first.
   */
  public fun setInputAsAutoAdvance(input: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_AS_AUTO_ADVANCE, NIL)
  }

  /**
   * Returns `true` if auto-advance is enabled for the given [input] index.
   */
  public fun isInputSetAsAutoAdvance(input: Long): Boolean {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_SET_AS_AUTO_ADVANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the destination animation is restarted when the animation transitions.
   */
  public fun setInputReset(input: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_SET_INPUT_RESET, NIL)
  }

  /**
   * Returns whether the animation restarts when the animation transitions from the other animation.
   */
  public fun isInputReset(input: Long): Boolean {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_IS_INPUT_RESET, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
