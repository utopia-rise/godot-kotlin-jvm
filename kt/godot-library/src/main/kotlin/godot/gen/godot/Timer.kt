// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * A countdown timer.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * Counts down a specified interval and emits a signal on reaching 0. Can be set to repeat or "one-shot" mode.
 *
 * **Note:** To create a one-shot timer without instantiating a node, use [godot.SceneTree.createTimer].
 */
@GodotBaseType
public open class Timer : Node() {
  /**
   * Emitted when the timer reaches 0.
   */
  public val timeout: Signal0 by signal()

  /**
   * If `true`, the timer will automatically start when entering the scene tree.
   *
   * **Note:** This property is automatically set to `false` after the timer enters the scene tree and starts.
   */
  public open var autostart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_AUTOSTART, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_AUTOSTART, NIL)
    }

  /**
   * If `true`, the timer will stop when reaching 0. If `false`, it will restart.
   */
  public open var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_ONE_SHOT, NIL)
    }

  /**
   * If `true`, the timer is paused and will not process until it is unpaused again, even if [start] is called.
   */
  public open var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_PAUSED, NIL)
    }

  /**
   * Processing mode. See [enum TimerProcessMode].
   */
  public open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_PROCESS_MODE, NIL)
    }

  /**
   * The timer's remaining time in seconds. Returns 0 if the timer is inactive.
   *
   * **Note:** You cannot set this value. To change the timer's remaining time, use [start].
   */
  public open val timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_TIME_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The wait time in seconds.
   *
   * **Note:** Timers can only emit once per rendered frame at most (or once per physics frame if [processMode] is [TIMER_PROCESS_PHYSICS]). This means very low wait times (lower than 0.05 seconds) will behave in significantly different ways depending on the rendered framerate. For very low wait times, it is recommended to use a process loop in a script instead of using a Timer node.
   */
  public open var waitTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_WAIT_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_WAIT_TIME, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TIMER)
  }

  /**
   * Returns `true` if the timer is stopped.
   */
  public open fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_IS_STOPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts the timer. Sets `wait_time` to `time_sec` if `time_sec > 0`. This also resets the remaining time to `wait_time`.
   *
   * **Note:** This method will not resume a paused timer. See [paused].
   */
  public open fun start(timeSec: Double = -1.0): Unit {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_START, NIL)
  }

  /**
   * Stops the timer.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_STOP, NIL)
  }

  public enum class TimerProcessMode(
    id: Long
  ) {
    /**
     * Update the timer during the physics step at each frame (fixed framerate processing).
     */
    TIMER_PROCESS_PHYSICS(0),
    /**
     * Update the timer during the idle time at each frame.
     */
    TIMER_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Update the timer during the idle time at each frame.
     */
    public final const val TIMER_PROCESS_IDLE: Long = 1

    /**
     * Update the timer during the physics step at each frame (fixed framerate processing).
     */
    public final const val TIMER_PROCESS_PHYSICS: Long = 0
  }
}
