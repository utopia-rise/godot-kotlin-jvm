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
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Counts down a specified interval and emits a signal on reaching 0. Can be set to repeat or
 * "one-shot" mode.
 * **Note:** Timers are affected by [Engine.timeScale], a higher scale means quicker timeouts, and
 * vice versa.
 * **Note:** To create a one-shot timer without instantiating a node, use [SceneTree.createTimer].
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
      TransferContext.callMethod(rawPtr, MethodBindings.getTimerProcessCallbackPtr, LONG)
      return Timer.TimerProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTimerProcessCallbackPtr, NIL)
    }

  /**
   * The wait time in seconds.
   * **Note:** Timers can only emit once per rendered frame at most (or once per physics frame if
   * [processCallback] is [constant TIMER_PROCESS_PHYSICS]). This means very low wait times (lower than
   * 0.05 seconds) will behave in significantly different ways depending on the rendered framerate. For
   * very low wait times, it is recommended to use a process loop in a script instead of using a Timer
   * node. Timers are affected by [Engine.timeScale], a higher scale means quicker timeouts, and vice
   * versa.
   */
  public var waitTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWaitTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWaitTimePtr, NIL)
    }

  /**
   * If `true`, the timer will stop when reaching 0. If `false`, it will restart.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
    }

  /**
   * If `true`, the timer will automatically start when entering the scene tree.
   * **Note:** This property is automatically set to `false` after the timer enters the scene tree
   * and starts.
   */
  public var autostart: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutostartPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutostartPtr, NIL)
    }

  /**
   * If `true`, the timer is paused and will not process until it is unpaused again, even if [start]
   * is called.
   */
  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausedPtr, NIL)
    }

  /**
   * The timer's remaining time in seconds. Returns 0 if the timer is inactive.
   * **Note:** This value is read-only and cannot be set. It is based on [waitTime], which can be
   * set using [start].
   */
  public val timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeLeftPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TIMER, scriptIndex)
    return true
  }

  /**
   * Starts the timer. Sets [waitTime] to [param time_sec] if `time_sec > 0`. This also resets the
   * remaining time to [waitTime].
   * **Note:** This method will not resume a paused timer. See [paused].
   */
  @JvmOverloads
  public fun start(timeSec: Double = -1.0): Unit {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * Stops the timer.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if the timer is stopped.
   */
  public fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStoppedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class TimerProcessCallback(
    id: Long,
  ) {
    /**
     * Update the timer during physics frames (see [constant
     * Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    TIMER_PROCESS_PHYSICS(0),
    /**
     * Update the timer during process frames (see [constant Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    TIMER_PROCESS_IDLE(1),
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
    public val setWaitTimePtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_wait_time")

    public val getWaitTimePtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "get_wait_time")

    public val setOneShotPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_one_shot")

    public val isOneShotPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_one_shot")

    public val setAutostartPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_autostart")

    public val hasAutostartPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "has_autostart")

    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "start")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "stop")

    public val setPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "set_paused")

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_paused")

    public val isStoppedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_stopped")

    public val getTimeLeftPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "get_time_left")

    public val setTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_timer_process_callback")

    public val getTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "get_timer_process_callback")
  }
}
