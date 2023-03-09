// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
   * Processing callback. See [enum TimerProcessCallback].
   */
  public var processCallback: TimerProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_TIMER_PROCESS_CALLBACK,
          LONG)
      return Timer.TimerProcessCallback.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_TIMER_PROCESS_CALLBACK,
          NIL)
    }

  /**
   * The wait time in seconds.
   *
   * **Note:** Timers can only emit once per rendered frame at most (or once per physics frame if [processCallback] is [TIMER_PROCESS_PHYSICS]). This means very low wait times (lower than 0.05 seconds) will behave in significantly different ways depending on the rendered framerate. For very low wait times, it is recommended to use a process loop in a script instead of using a Timer node.
   */
  public var waitTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_WAIT_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_WAIT_TIME, NIL)
    }

  /**
   * If `true`, the timer will stop when reaching 0. If `false`, it will restart.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_IS_ONE_SHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_ONE_SHOT, NIL)
    }

  /**
   * If `true`, the timer will automatically start when entering the scene tree.
   *
   * **Note:** This property is automatically set to `false` after the timer enters the scene tree and starts.
   */
  public var autostart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_HAS_AUTOSTART, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_AUTOSTART, NIL)
    }

  /**
   * If `true`, the timer is paused and will not process until it is unpaused again, even if [start] is called.
   */
  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_IS_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_SET_PAUSED, NIL)
    }

  /**
   * The timer's remaining time in seconds. Returns 0 if the timer is inactive.
   *
   * **Note:** This value is read-only and cannot be set. It is based on [waitTime], which can be set using [start].
   */
  public val timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_GET_TIME_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TIMER, scriptIndex)
    return true
  }

  /**
   * Starts the timer. Sets [waitTime] to [timeSec] if `time_sec > 0`. This also resets the remaining time to [waitTime].
   *
   * **Note:** This method will not resume a paused timer. See [paused].
   */
  public fun start(timeSec: Double = -1.0): Unit {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_START, NIL)
  }

  /**
   * Stops the timer.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_STOP, NIL)
  }

  /**
   * Returns `true` if the timer is stopped.
   */
  public fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TIMER_IS_STOPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class TimerProcessCallback(
    id: Long,
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

  public companion object
}
