// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.StringName
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.internal.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val advanceConditionChanged: Signal0 by Signal0

  /**
   * The time to cross-fade between this state and the next.
   * **Note:** [AnimationNodeStateMachine] transitions the current state immediately after the start
   * of the fading. The precise remaining time can only be inferred from the main animation. When
   * [AnimationNodeOutput] is considered as the most upstream, so the [xfadeTime] is not scaled
   * depending on the downstream delta. See also [AnimationNodeOneShot.fadeoutTime].
   */
  public final inline var xfadeTime: Float
    @JvmName("xfadeTimeProperty")
    get() = getXfadeTime()
    @JvmName("xfadeTimeProperty")
    set(`value`) {
      setXfadeTime(value)
    }

  /**
   * Ease curve for better control over cross-fade between this state and the next.
   */
  public final inline var xfadeCurve: Curve?
    @JvmName("xfadeCurveProperty")
    get() = getXfadeCurve()
    @JvmName("xfadeCurveProperty")
    set(`value`) {
      setXfadeCurve(value)
    }

  /**
   * If `true`, breaks the loop at the end of the loop cycle for transition, even if the animation
   * is looping.
   */
  public final inline var breakLoopAtEnd: Boolean
    @JvmName("breakLoopAtEndProperty")
    get() = isLoopBrokenAtEnd()
    @JvmName("breakLoopAtEndProperty")
    set(`value`) {
      setBreakLoopAtEnd(value)
    }

  /**
   * If `true`, the destination animation is played back from the beginning when switched.
   */
  public final inline var reset: Boolean
    @JvmName("resetProperty")
    get() = isReset()
    @JvmName("resetProperty")
    set(`value`) {
      setReset(value)
    }

  /**
   * Lower priority transitions are preferred when travelling through the tree via
   * [AnimationNodeStateMachinePlayback.travel] or [advanceMode] is set to [ADVANCE_MODE_AUTO].
   */
  public final inline var priority: Int
    @JvmName("priorityProperty")
    get() = getPriority()
    @JvmName("priorityProperty")
    set(`value`) {
      setPriority(value)
    }

  /**
   * The transition type.
   */
  public final inline var switchMode: SwitchMode
    @JvmName("switchModeProperty")
    get() = getSwitchMode()
    @JvmName("switchModeProperty")
    set(`value`) {
      setSwitchMode(value)
    }

  /**
   * Determines whether the transition should disabled, enabled when using
   * [AnimationNodeStateMachinePlayback.travel], or traversed automatically if the [advanceCondition]
   * and [advanceExpression] checks are true (if assigned).
   */
  public final inline var advanceMode: AdvanceMode
    @JvmName("advanceModeProperty")
    get() = getAdvanceMode()
    @JvmName("advanceModeProperty")
    set(`value`) {
      setAdvanceMode(value)
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
  public final inline var advanceCondition: StringName
    @JvmName("advanceConditionProperty")
    get() = getAdvanceCondition()
    @JvmName("advanceConditionProperty")
    set(`value`) {
      setAdvanceCondition(value)
    }

  /**
   * Use an expression as a condition for state machine transitions. It is possible to create
   * complex animation advance conditions for switching between states and gives much greater
   * flexibility for creating complex state machines by directly interfacing with the script code.
   */
  public final inline var advanceExpression: String
    @JvmName("advanceExpressionProperty")
    get() = getAdvanceExpression()
    @JvmName("advanceExpressionProperty")
    set(`value`) {
      setAdvanceExpression(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION, scriptIndex)
  }

  public final fun setSwitchMode(mode: SwitchMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSwitchModePtr, NIL)
  }

  public final fun getSwitchMode(): SwitchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwitchModePtr, LONG)
    return AnimationNodeStateMachineTransition.SwitchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAdvanceMode(mode: AdvanceMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAdvanceModePtr, NIL)
  }

  public final fun getAdvanceMode(): AdvanceMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdvanceModePtr, LONG)
    return AnimationNodeStateMachineTransition.AdvanceMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAdvanceCondition(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setAdvanceConditionPtr, NIL)
  }

  public final fun getAdvanceCondition(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdvanceConditionPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setXfadeTime(secs: Float): Unit {
    TransferContext.writeArguments(DOUBLE to secs.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setXfadeTimePtr, NIL)
  }

  public final fun getXfadeTime(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getXfadeTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setBreakLoopAtEnd(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBreakLoopAtEndPtr, NIL)
  }

  public final fun isLoopBrokenAtEnd(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLoopBrokenAtEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setReset(reset: Boolean): Unit {
    TransferContext.writeArguments(BOOL to reset)
    TransferContext.callMethod(ptr, MethodBindings.setResetPtr, NIL)
  }

  public final fun isReset(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isResetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPriorityPtr, NIL)
  }

  public final fun getPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAdvanceExpression(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setAdvanceExpressionPtr, NIL)
  }

  public final fun getAdvanceExpression(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdvanceExpressionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
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
      public fun from(`value`: Long): SwitchMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): AdvanceMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_switch_mode", 2074906633)

    public val getSwitchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_switch_mode", 2138562085)

    public val setAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_mode", 1210869868)

    public val getAdvanceModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_mode", 61101689)

    public val setAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_condition", 3304788590)

    public val getAdvanceConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_condition", 2002593661)

    public val setXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_time", 373806689)

    public val getXfadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_time", 1740695150)

    public val setXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_xfade_curve", 270443179)

    public val getXfadeCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_xfade_curve", 2460114913)

    public val setBreakLoopAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_break_loop_at_end", 2586408642)

    public val isLoopBrokenAtEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "is_loop_broken_at_end", 36873697)

    public val setResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_reset", 2586408642)

    public val isResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "is_reset", 36873697)

    public val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_priority", 1286410249)

    public val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_priority", 3905245786)

    public val setAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "set_advance_expression", 83702148)

    public val getAdvanceExpressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachineTransition", "get_advance_expression", 201670096)
  }
}
