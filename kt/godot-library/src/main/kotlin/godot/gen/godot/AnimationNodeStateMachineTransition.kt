// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The path generated when using [AnimationNodeStateMachinePlayback.travel] is limited to the nodes
 * connected by [AnimationNodeStateMachineTransition].
 * You can set the timing and conditions of the transition in detail.
 */
@GodotBaseType
public open class AnimationNodeStateMachineTransition : Resource() {
  /**
   * Emitted when [advanceCondition] is changed.
   */
  public val advanceConditionChanged: Signal0 by signal()

  /**
   * The time to cross-fade between this state and the next.
   * **Note:** [AnimationNodeStateMachine] transitions the current state immediately after the start
   * of the fading. The precise remaining time can only be inferred from the main animation. When
   * [AnimationNodeOutput] is considered as the most upstream, so the [xfadeTime] is not scaled
   * depending on the downstream delta. See also [AnimationNodeOneShot.fadeoutTime].
   */
  public var xfadeTime: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXfadeTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setXfadeTimePtr, NIL)
    }

  /**
   * Ease curve for better control over cross-fade between this state and the next.
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
   * If `true`, breaks the loop at the end of the loop cycle for transition, even if the animation
   * is looping.
   */
  public var breakLoopAtEnd: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLoopBrokenAtEndPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBreakLoopAtEndPtr, NIL)
    }

  /**
   * If `true`, the destination animation is played back from the beginning when switched.
   */
  public var reset: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResetPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetPtr, NIL)
    }

  /**
   * Lower priority transitions are preferred when travelling through the tree via
   * [AnimationNodeStateMachinePlayback.travel] or [advanceMode] is set to [ADVANCE_MODE_AUTO].
   */
  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  /**
   * The transition type.
   */
  public var switchMode: SwitchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwitchModePtr, LONG)
      return AnimationNodeStateMachineTransition.SwitchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwitchModePtr, NIL)
    }

  /**
   * Determines whether the transition should disabled, enabled when using
   * [AnimationNodeStateMachinePlayback.travel], or traversed automatically if the [advanceCondition]
   * and [advanceExpression] checks are true (if assigned).
   */
  public var advanceMode: AdvanceMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceModePtr, LONG)
      return AnimationNodeStateMachineTransition.AdvanceMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceModePtr, NIL)
    }

  /**
   * Turn on auto advance when this condition is set. The provided name will become a boolean
   * parameter on the [AnimationTree] that can be controlled from code (see
   * [url=$DOCS_URL/tutorials/animation/animation_tree.html#controlling-from-code]Using
   * AnimationTree[/url]). For example, if [AnimationTree.treeRoot] is an [AnimationNodeStateMachine]
   * and [advanceCondition] is set to `"idle"`:
   *
   * gdscript:
   * ```gdscript
   * $animation_tree.set("parameters/conditions/idle", is_on_floor and (linear_velocity.x == 0))
   * ```
   * csharp:
   * ```csharp
   * GetNode<AnimationTree>("animation_tree").Set("parameters/conditions/idle", IsOnFloor &&
   * (LinearVelocity.X == 0));
   * ```
   */
  public var advanceCondition: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceConditionPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceConditionPtr, NIL)
    }

  /**
   * Use an expression as a condition for state machine transitions. It is possible to create
   * complex animation advance conditions for switching between states and gives much greater
   * flexibility for creating complex state machines by directly interfacing with the script code.
   */
  public var advanceExpression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceExpressionPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceExpressionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION, scriptIndex)
  }

  public enum class SwitchMode(
    id: Long,
  ) {
    /**
     * Switch to the next state immediately. The current state will end and blend into the beginning
     * of the new one.
     */
    SWITCH_MODE_IMMEDIATE(0),
    /**
     * Switch to the next state immediately, but will seek the new state to the playback position of
     * the old state.
     */
    SWITCH_MODE_SYNC(1),
    /**
     * Wait for the current state playback to end, then switch to the beginning of the next state
     * animation.
     */
    SWITCH_MODE_AT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AdvanceMode(
    id: Long,
  ) {
    /**
     * Don't use this transition.
     */
    ADVANCE_MODE_DISABLED(0),
    /**
     * Only use this transition during [AnimationNodeStateMachinePlayback.travel].
     */
    ADVANCE_MODE_ENABLED(1),
    /**
     * Automatically use this transition if the [advanceCondition] and [advanceExpression] checks
     * are true (if assigned).
     */
    ADVANCE_MODE_AUTO(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_switch_mode")

    public val getSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_switch_mode")

    public val setAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_mode")

    public val getAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_mode")

    public val setAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_condition")

    public val getAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_condition")

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_time")

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_time")

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_curve")

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_curve")

    public val setBreakLoopAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_break_loop_at_end")

    public val isLoopBrokenAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "is_loop_broken_at_end")

    public val setResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_reset")

    public val isResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "is_reset")

    public val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_priority")

    public val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_priority")

    public val setAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_expression")

    public val getAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_expression")
  }
}
