// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A unit of execution in a process. Can run methods on [Object]s simultaneously. The use of
 * synchronization via [Mutex] or [Semaphore] is advised if working with shared objects.
 * **Warning:**
 * To ensure proper cleanup without crashes or deadlocks, when a [Thread]'s reference count reaches
 * zero and it is therefore destroyed, the following conditions must be met:
 * - It must not have any [Mutex] objects locked.
 * - It must not be waiting on any [Semaphore] objects.
 * - [waitToFinish] should have been called on it.
 */
@GodotBaseType
public open class Thread : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_THREAD, scriptIndex)
  }

  /**
   * Starts a new [Thread] that calls [callable].
   * If the method takes some arguments, you can pass them using [Callable.bind].
   * The [priority] of the [Thread] can be changed by passing a value from the [Priority] enum.
   * Returns [OK] on success, or [ERR_CANT_CREATE] on failure.
   */
  @JvmOverloads
  public final fun start(callable: Callable, priority: Priority = Thread.Priority.PRIORITY_NORMAL):
      GodotError {
    TransferContext.writeArguments(CALLABLE to callable, LONG to priority.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the current [Thread]'s ID, uniquely identifying it among all threads. If the [Thread]
   * has not started running or if [waitToFinish] has been called, this returns an empty string.
   */
  public final fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if this [Thread] has been started. Once started, this will return `true` until
   * it is joined using [waitToFinish]. For checking if a [Thread] is still executing its task, use
   * [isAlive].
   */
  public final fun isStarted(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStartedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this [Thread] is currently running the provided function. This is useful for
   * determining if [waitToFinish] can be called without blocking the calling thread.
   * To check if a [Thread] is joinable, use [isStarted].
   */
  public final fun isAlive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAlivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Joins the [Thread] and waits for it to finish. Returns the output of the [Callable] passed to
   * [start].
   * Should either be used when you want to retrieve the value returned from the method called by
   * the [Thread] or before freeing the instance that contains the [Thread].
   * To determine if this can be called without blocking the calling thread, check if [isAlive] is
   * `false`.
   */
  public final fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitToFinishPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public enum class Priority(
    id: Long,
  ) {
    /**
     * A thread running with lower priority than normally.
     */
    PRIORITY_LOW(0),
    /**
     * A thread with a standard priority.
     */
    PRIORITY_NORMAL(1),
    /**
     * A thread running with higher priority than normally.
     */
    PRIORITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Priority = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sets whether the thread safety checks the engine normally performs in methods of certain
     * classes (e.g., [Node]) should happen **on the current thread**.
     * The default, for every thread, is that they are enabled (as if called with [enabled] being
     * `true`).
     * Those checks are conservative. That means that they will only succeed in considering a call
     * thread-safe (and therefore allow it to happen) if the engine can guarantee such safety.
     * Because of that, there may be cases where the user may want to disable them ([enabled] being
     * `false`) to make certain operations allowed again. By doing so, it becomes the user's
     * responsibility to ensure thread safety (e.g., by using [Mutex]) for those objects that are
     * otherwise protected by the engine.
     * **Note:** This is an advanced usage of the engine. You are advised to use it only if you know
     * what you are doing and there is no safer way.
     * **Note:** This is useful for scripts running on either arbitrary [Thread] objects or tasks
     * submitted to the [WorkerThreadPool]. It doesn't apply to code running during [Node] group
     * processing, where the checks will be always performed.
     * **Note:** Even in the case of having disabled the checks in a [WorkerThreadPool] task,
     * there's no need to re-enable them at the end. The engine will do so.
     */
    public final fun setThreadSafetyChecksEnabled(enabled: Boolean): Unit {
      TransferContext.writeArguments(BOOL to enabled)
      TransferContext.callMethod(0, MethodBindings.setThreadSafetyChecksEnabledPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "start", 1327203254)

    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "get_id", 201670096)

    public val isStartedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Thread", "is_started", 36873697)

    public val isAlivePtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "is_alive", 36873697)

    public val waitToFinishPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Thread", "wait_to_finish", 1460262497)

    public val setThreadSafetyChecksEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Thread", "set_thread_safety_checks_enabled", 2586408642)
  }
}
