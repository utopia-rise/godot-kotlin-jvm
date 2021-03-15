// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * A countdown timer.
 *
 * Counts down a specified interval and emits a signal on reaching 0. Can be set to repeat or "one-shot" mode.
 *
 * **Note:** To create an one-shot timer without instantiating a node, use [godot.SceneTree.createTimer].
 */
@GodotBaseType
open class Timer : Node() {
  /**
   * Emitted when the timer reaches 0.
   */
  val timeout: Signal0 by signal()

  /**
   * If `true`, the timer will automatically start when entering the scene tree.
   *
   * **Note:** This property is automatically set to `false` after the timer enters the scene tree and starts.
   */
  open var autostart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_AUTOSTART, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_AUTOSTART, NIL)
    }

  /**
   * If `true`, the timer will stop when reaching 0. If `false`, it will restart.
   */
  open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_ONE_SHOT, NIL)
    }

  /**
   * If `true`, the timer is paused and will not process until it is unpaused again, even if [start] is called.
   */
  open var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_PAUSED, NIL)
    }

  /**
   * Processing mode. See [enum TimerProcessMode].
   */
  open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_PROCESS_MODE, NIL)
    }

  /**
   * The timer's remaining time in seconds. Returns 0 if the timer is inactive.
   *
   * **Note:** You cannot set this value. To change the timer's remaining time, use [start].
   */
  open val timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_TIME_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * Wait time in seconds.
   */
  open var waitTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_WAIT_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_WAIT_TIME, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TIMER, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns `true` if the timer is stopped.
   */
  open fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_IS_STOPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts the timer. Sets `wait_time` to `time_sec` if `time_sec > 0`. This also resets the remaining time to `wait_time`.
   *
   * **Note:** this method will not resume a paused timer. See [paused].
   */
  open fun start(timeSec: Double = -1.0) {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_START, NIL)
  }

  /**
   * Stops the timer.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_STOP, NIL)
  }

  enum class TimerProcessMode(
    id: Long
  ) {
    /**
     * Update the timer during the physics step at each frame (fixed framerate processing).
     */
    TIMER_PROCESS_PHYSICS(0),

    /**
     * Update the timer during the idle time at each frame.
     */
    TIMER_PROCESS_IDLE(1);

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
     * Update the timer during the idle time at each frame.
     */
    final const val TIMER_PROCESS_IDLE: Long = 1

    /**
     * Update the timer during the physics step at each frame (fixed framerate processing).
     */
    final const val TIMER_PROCESS_PHYSICS: Long = 0
  }
}
