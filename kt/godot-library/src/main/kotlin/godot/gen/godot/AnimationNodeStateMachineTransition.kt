// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * 
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 * 
 * 
 */
@GodotBaseType
open class AnimationNodeStateMachineTransition : Resource() {
  /**
   * Emitted when [advanceCondition] is changed.
   */
  val advanceConditionChanged: Signal0 by signal()

  /**
   * Turn on auto advance when this condition is set. The provided name will become a boolean parameter on the [godot.AnimationTree] that can be controlled from code (see [url=https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html#controlling-from-code][/url]). For example, if [godot.AnimationTree.treeRoot] is an [godot.AnimationNodeStateMachine] and [advanceCondition] is set to `"idle"`:
   *
   * ```
   * 			$animation_tree["parameters/conditions/idle"] = is_on_floor and (linear_velocity.x == 0)
   * 			```
   */
  open var advanceCondition: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_ADVANCE_CONDITION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_ADVANCE_CONDITION, NIL)
    }

  /**
   * Turn on the transition automatically when this state is reached. This works best with [SWITCH_MODE_AT_END].
   */
  open var autoAdvance: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_AUTO_ADVANCE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_AUTO_ADVANCE, NIL)
    }

  /**
   * Don't use this transition during [godot.AnimationNodeStateMachinePlayback.travel] or [autoAdvance].
   */
  open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_DISABLED, NIL)
    }

  /**
   * Lower priority transitions are preferred when travelling through the tree via [godot.AnimationNodeStateMachinePlayback.travel] or [autoAdvance].
   */
  open var priority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_PRIORITY, NIL)
    }

  /**
   * The transition type.
   */
  open var switchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_SWITCH_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_SWITCH_MODE, NIL)
    }

  /**
   * The time to cross-fade between this state and the next.
   */
  open var xfadeTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_GET_XFADE_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION_SET_XFADE_TIME, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINETRANSITION)
  }

  enum class SwitchMode(
    id: Long
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
    SWITCH_MODE_AT_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Wait for the current state playback to end, then switch to the beginning of the next state animation.
     */
    final const val SWITCH_MODE_AT_END: Long = 2

    /**
     * Switch to the next state immediately. The current state will end and blend into the beginning of the new one.
     */
    final const val SWITCH_MODE_IMMEDIATE: Long = 0

    /**
     * Switch to the next state immediately, but will seek the new state to the playback position of the old state.
     */
    final const val SWITCH_MODE_SYNC: Long = 1
  }
}
