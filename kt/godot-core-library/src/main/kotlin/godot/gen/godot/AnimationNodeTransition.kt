// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.internal.memory.TransferContext
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
  public final inline var xfadeTime: Double
    @JvmName("xfadeTimeProperty")
    get() = getXfadeTime()
    @JvmName("xfadeTimeProperty")
    set(`value`) {
      setXfadeTime(value)
    }

  /**
   * Determines how cross-fading between animations is eased. If empty, the transition will be
   * linear.
   */
  public final inline var xfadeCurve: Curve?
    @JvmName("xfadeCurveProperty")
    get() = getXfadeCurve()
    @JvmName("xfadeCurveProperty")
    set(`value`) {
      setXfadeCurve(value)
    }

  /**
   * If `true`, allows transition to the self state. When the reset option is enabled in input, the
   * animation is restarted. If `false`, nothing happens on the transition to the self state.
   */
  public final inline var allowTransitionToSelf: Boolean
    @JvmName("allowTransitionToSelfProperty")
    get() = isAllowTransitionToSelf()
    @JvmName("allowTransitionToSelfProperty")
    set(`value`) {
      setAllowTransitionToSelf(value)
    }

  /**
   * The number of enabled input ports for this animation node.
   */
  public final inline var inputCount: Int
    @JvmName("inputCountProperty")
    get() = getInputCount()
    @JvmName("inputCountProperty")
    set(`value`) {
      setInputCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODETRANSITION, scriptIndex)
  }

  public final fun setInputCount(inputCount: Int): Unit {
    TransferContext.writeArguments(LONG to inputCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setInputCountPtr, NIL)
  }

  /**
   * Enables or disables auto-advance for the given [input] index. If enabled, state changes to the
   * next input after playing the animation once. If enabled for the last input state, it loops to the
   * first.
   */
  public final fun setInputAsAutoAdvance(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setInputAsAutoAdvancePtr, NIL)
  }

  /**
   * Returns `true` if auto-advance is enabled for the given [input] index.
   */
  public final fun isInputSetAsAutoAdvance(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isInputSetAsAutoAdvancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, breaks the loop at the end of the loop cycle for transition, even if the animation
   * is looping.
   */
  public final fun setInputBreakLoopAtEnd(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setInputBreakLoopAtEndPtr, NIL)
  }

  /**
   * Returns whether the animation breaks the loop at the end of the loop cycle for transition.
   */
  public final fun isInputLoopBrokenAtEnd(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isInputLoopBrokenAtEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the destination animation is restarted when the animation transitions.
   */
  public final fun setInputReset(input: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to input.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setInputResetPtr, NIL)
  }

  /**
   * Returns whether the animation restarts when the animation transitions from the other animation.
   */
  public final fun isInputReset(input: Int): Boolean {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isInputResetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setXfadeTime(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(ptr, MethodBindings.setXfadeTimePtr, NIL)
  }

  public final fun getXfadeTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getXfadeTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setXfadeCurve(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setXfadeCurvePtr, NIL)
  }

  public final fun getXfadeCurve(): Curve? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getXfadeCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setAllowTransitionToSelf(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAllowTransitionToSelfPtr, NIL)
  }

  public final fun isAllowTransitionToSelf(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAllowTransitionToSelfPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_count", 1286410249)

    public val setInputAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_as_auto_advance", 300928843)

    public val isInputSetAsAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_set_as_auto_advance", 1116898809)

    public val setInputBreakLoopAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_break_loop_at_end", 300928843)

    public val isInputLoopBrokenAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_loop_broken_at_end", 1116898809)

    public val setInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_input_reset", 300928843)

    public val isInputResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_input_reset", 1116898809)

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_time", 373806689)

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_time", 1740695150)

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_xfade_curve", 270443179)

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "get_xfade_curve", 2460114913)

    public val setAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "set_allow_transition_to_self", 2586408642)

    public val isAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeTransition", "is_allow_transition_to_self", 36873697)
  }
}
