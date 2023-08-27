// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A transition within an [godot.AnimationNodeStateMachine] connecting two [godot.AnimationRootNode]s.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * The path generated when using [godot.AnimationNodeStateMachinePlayback.travel] is limited to the nodes connected by [godot.AnimationNodeStateMachineTransition].
 *
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
   */
  public var xfadeTime: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_XFADE_TIME, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_XFADE_TIME, NIL)
    }

  /**
   * Ease curve for better control over cross-fade between this state and the next.
   */
  public var xfadeCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_XFADE_CURVE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_XFADE_CURVE, NIL)
    }

  /**
   * If `true`, the destination animation is played back from the beginning when switched.
   */
  public var reset: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_IS_RESET, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_RESET, NIL)
    }

  /**
   * Lower priority transitions are preferred when travelling through the tree via [godot.AnimationNodeStateMachinePlayback.travel] or [advanceMode] is set to [ADVANCE_MODE_AUTO].
   */
  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_PRIORITY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_PRIORITY, NIL)
    }

  /**
   * The transition type.
   */
  public var switchMode: SwitchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_SWITCH_MODE, LONG)
      return AnimationNodeStateMachineTransition.SwitchMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_SWITCH_MODE, NIL)
    }

  /**
   * Determines whether the transition should disabled, enabled when using [godot.AnimationNodeStateMachinePlayback.travel], or traversed automatically if the [advanceCondition] and [advanceExpression] checks are true (if assigned).
   */
  public var advanceMode: AdvanceMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_ADVANCE_MODE, LONG)
      return AnimationNodeStateMachineTransition.AdvanceMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_ADVANCE_MODE, NIL)
    }

  /**
   * Turn on auto advance when this condition is set. The provided name will become a boolean parameter on the [godot.AnimationTree] that can be controlled from code (see [godot.Using AnimationTree]($DOCS_URL/tutorials/animation/animation_tree.html#controlling-from-code)). For example, if [godot.AnimationTree.treeRoot] is an [godot.AnimationNodeStateMachine] and [advanceCondition] is set to `"idle"`:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * $animation_tree.set("parameters/conditions/idle", is_on_floor and (linear_velocity.x == 0))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GetNode<AnimationTree>("animation_tree").Set("parameters/conditions/idle", IsOnFloor && (LinearVelocity.X == 0));
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public var advanceCondition: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_ADVANCE_CONDITION,
          STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_ADVANCE_CONDITION, NIL)
    }

  /**
   * Use an expression as a condition for state machine transitions. It is possible to create complex animation advance conditions for switching between states and gives much greater flexibility for creating complex state machines by directly interfacing with the script code.
   */
  public var advanceExpression: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_ADVANCE_EXPRESSION,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_ADVANCE_EXPRESSION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION, scriptIndex)
    return true
  }

  public enum class SwitchMode(
    id: Long,
  ) {
    /**
     * Switch to the next state immediately. The current state will end and blend into the beginning of the new one.
     */
    SWITCH_MODE_IMMEDIATE(0),
    /**
     * Switch to the next state immediately, but will seek the new state to the playback position of the old state.
     */
    SWITCH_MODE_SYNC(1),
    /**
     * Wait for the current state playback to end, then switch to the beginning of the next state animation.
     */
    SWITCH_MODE_AT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
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
     * Only use this transition during [godot.AnimationNodeStateMachinePlayback.travel].
     */
    ADVANCE_MODE_ENABLED(1),
    /**
     * Automatically use this transition if the [advanceCondition] and [advanceExpression] checks are true (if assigned).
     */
    ADVANCE_MODE_AUTO(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
