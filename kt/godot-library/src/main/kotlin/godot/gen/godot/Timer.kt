// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * The [Timer] node is a countdown timer and is the simplest way to handle time-based logic in the
 * engine. When a timer reaches the end of its [waitTime], it will emit the [signal timeout] signal.
 * After a timer enters the tree, it can be manually started with [start]. A timer node is also
 * started automatically if [autostart] is `true`.
 * Without requiring much code, a timer node can be added and configured in the editor. The [signal
 * timeout] signal it emits can also be connected through the Node dock in the editor:
 * [codeblock]
 * func _on_timer_timeout():
 *     print("Time to attack!")
 * [/codeblock]
 * **Note:** To create a one-shot timer without instantiating a node, use [SceneTree.createTimer].
 * **Note:** Timers are affected by [Engine.timeScale]. The higher the time scale, the sooner timers
 * will end. How often a timer processes may depend on the framerate or [Engine.physicsTicksPerSecond].
 */
@GodotBaseType
public open class Timer : Node() {
  /**
   * Emitted when the timer reaches the end.
   */
  public val timeout: Signal0 by signal()

  /**
   * Specifies when the timer is updated during the main loop (see [TimerProcessCallback]).
   */
  public final inline var processCallback: TimerProcessCallback
    @JvmName("processCallbackProperty")
    get() = getTimerProcessCallback()
    @JvmName("processCallbackProperty")
    set(`value`) {
      setTimerProcessCallback(value)
    }

  /**
   * The time required for the timer to end, in seconds. This property can also be set every time
   * [start] is called.
   * **Note:** Timers can only process once per physics or process frame (depending on the
   * [processCallback]). An unstable framerate may cause the timer to end inconsistently, which is
   * especially noticeable if the wait time is lower than roughly `0.05` seconds. For very short
   * timers, it is recommended to write your own code instead of using a [Timer] node. Timers are also
   * affected by [Engine.timeScale].
   */
  public final inline var waitTime: Double
    @JvmName("waitTimeProperty")
    get() = getWaitTime()
    @JvmName("waitTimeProperty")
    set(`value`) {
      setWaitTime(value)
    }

  /**
   * If `true`, the timer will stop after reaching the end. Otherwise, as by default, the timer will
   * automatically restart.
   */
  public final inline var oneShot: Boolean
    @JvmName("oneShotProperty")
    get() = isOneShot()
    @JvmName("oneShotProperty")
    set(`value`) {
      setOneShot(value)
    }

  /**
   * If `true`, the timer will start immediately when it enters the scene tree.
   * **Note:** After the timer enters the tree, this property is automatically set to `false`.
   */
  public final inline var autostart: Boolean
    @JvmName("autostartProperty")
    get() = hasAutostart()
    @JvmName("autostartProperty")
    set(`value`) {
      setAutostart(value)
    }

  /**
   * If `true`, the timer is paused. A paused timer does not process until this property is set back
   * to `false`, even when [start] is called.
   */
  public final inline var paused: Boolean
    @JvmName("pausedProperty")
    get() = isPaused()
    @JvmName("pausedProperty")
    set(`value`) {
      setPaused(value)
    }

  /**
   * The timer's remaining time in seconds. This is always `0` if the timer is stopped.
   * **Note:** This property is read-only and cannot be modified. It is based on [waitTime].
   */
  public final inline val timeLeft: Double
    @JvmName("timeLeftProperty")
    get() = getTimeLeft()

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TIMER, scriptIndex)
  }

  public final fun setWaitTime(timeSec: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.setWaitTimePtr, NIL)
  }

  public final fun getWaitTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWaitTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setOneShot(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun isOneShot(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutostart(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutostartPtr, NIL)
  }

  public final fun hasAutostart(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutostartPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Starts the timer, if it was not started already. Fails if the timer is not inside the tree. If
   * [timeSec] is greater than `0`, this value is used for the [waitTime].
   * **Note:** This method does not resume a paused timer. See [paused].
   */
  @JvmOverloads
  public final fun start(timeSec: Double = -1.0): Unit {
    TransferContext.writeArguments(DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * Stops the timer.
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public final fun setPaused(paused: Boolean): Unit {
    TransferContext.writeArguments(BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.setPausedPtr, NIL)
  }

  public final fun isPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the timer is stopped or has not started.
   */
  public final fun isStopped(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStoppedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getTimeLeft(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeLeftPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setTimerProcessCallback(callback: TimerProcessCallback): Unit {
    TransferContext.writeArguments(LONG to callback.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTimerProcessCallbackPtr, NIL)
  }

  public final fun getTimerProcessCallback(): TimerProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimerProcessCallbackPtr, LONG)
    return Timer.TimerProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class TimerProcessCallback(
    id: Long,
  ) {
    /**
     * Update the timer every physics process frame (see
     * [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    TIMER_PROCESS_PHYSICS(0),
    /**
     * Update the timer every process (rendered) frame (see [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    TIMER_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TimerProcessCallback = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setWaitTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_wait_time", 373806689)

    public val getWaitTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "get_wait_time", 1740695150)

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_one_shot", 2586408642)

    public val isOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "is_one_shot", 36873697)

    public val setAutostartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_autostart", 2586408642)

    public val hasAutostartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "has_autostart", 36873697)

    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "start", 1392008558)

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "stop", 3218959716)

    public val setPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_paused", 2586408642)

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_paused", 36873697)

    public val isStoppedPtr: VoidPtr = TypeManager.getMethodBindPtr("Timer", "is_stopped", 36873697)

    public val getTimeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "get_time_left", 1740695150)

    public val setTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "set_timer_process_callback", 3469495063)

    public val getTimerProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Timer", "get_timer_process_callback", 2672570227)
  }
}
