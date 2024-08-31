// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Simple state machine for cases which don't require a more advanced [AnimationNodeStateMachine].
 * Animations can be connected to the inputs and transition times can be specified.
 * After setting the request and changing the animation playback, the transition node automatically
 * clears the request on the next process frame by setting its `transition_request` value to empty.
 * **Note:** When using a cross-fade, `current_state` and `current_index` change to the next state
 * immediately after the cross-fade begins.
 *
 * gdscript:
 * ```gdscript
 * # Play child animation connected to "state_2" port.
 * animation_tree.set("parameters/Transition/transition_request", "state_2")
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/Transition/transition_request"] = "state_2"
 *
 * # Get current state name (read-only).
 * animation_tree.get("parameters/Transition/current_state")
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/Transition/current_state"]
 *
 * # Get current state index (read-only).
 * animation_tree.get("parameters/Transition/current_index")
 * # Alternative syntax (same result as above).
 * animation_tree["parameters/Transition/current_index"]
 * ```
 * csharp:
 * ```csharp
 * // Play child animation connected to "state_2" port.
 * animationTree.Set("parameters/Transition/transition_request", "state_2");
 *
 * // Get current state name (read-only).
 * animationTree.Get("parameters/Transition/current_state");
 *
 * // Get current state index (read-only).
 * animationTree.Get("parameters/Transition/current_index");
 * ```
 */
@GodotBaseType
public open class AnimationNodeTransition : AnimationNodeSync() {
  /**
   * Cross-fading time (in seconds) between each animation connected to the inputs.
   * **Note:** [AnimationNodeTransition] transitions the current state immediately after the start
   * of the fading. The precise remaining time can only be inferred from the main animation. When
   * [AnimationNodeOutput] is considered as the most upstream, so the [xfadeTime] is not scaled
   * depending on the downstream delta. See also [AnimationNodeOneShot.fadeoutTime].
   */
  public var xfadeTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXfadeTimePtr, NIL)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public var xfadeCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXfadeCurvePtr, NIL)
    }

  /**
   * If `true`, allows transition to the self state. When the reset option is enabled in input, the
   * animation is restarted. If `false`, nothing happens on the transition to the self state.
   */
  public var allowTransitionToSelf: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowTransitionToSelfPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowTransitionToSelfPtr, NIL)
    }

  /**
   * The number of enabled input ports for this animation node.
   */
  public var inputCount: Int
    @JvmName("getInputCount_prop")
    get() = super.getInputCount()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInputCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION, scriptIndex)
  }

  /**
   * Enables or disables auto-advance for the given [input] index. If enabled, state changes to the
   * next input after playing the animation once. If enabled for the last input state, it loops to the
   * first.
   */
  public fun setInputAsAutoAdvance(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputAsAutoAdvancePtr, NIL)
  }

  /**
   * Returns `true` if auto-advance is enabled for the given [input] index.
   */
  public fun isInputSetAsAutoAdvance(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputSetAsAutoAdvancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, breaks the loop at the end of the loop cycle for transition, even if the animation
   * is looping.
   */
  public fun setInputBreakLoopAtEnd(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputBreakLoopAtEndPtr, NIL)
  }

  /**
   * Returns whether the animation breaks the loop at the end of the loop cycle for transition.
   */
  public fun isInputLoopBrokenAtEnd(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputLoopBrokenAtEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, the destination animation is restarted when the animation transitions.
   */
  public fun setInputReset(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputResetPtr, NIL)
  }

  /**
   * Returns whether the animation restarts when the animation transitions from the other animation.
   */
  public fun isInputReset(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputResetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_count")

    public val setInputAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_as_auto_advance")

    public val isInputSetAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_set_as_auto_advance")

    public val setInputBreakLoopAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_break_loop_at_end")

    public val isInputLoopBrokenAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_loop_broken_at_end")

    public val setInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_reset")

    public val isInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_reset")

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_time")

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_time")

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_curve")

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_curve")

    public val setAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_allow_transition_to_self")

    public val isAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_allow_transition_to_self")
  }
}
