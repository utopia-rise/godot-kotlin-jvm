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
 * A unit of execution in a process.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A unit of execution in a process. Can run methods on [godot.Object]s simultaneously. The use of synchronization via [godot.Mutex] or [godot.Semaphore] is advised if working with shared objects.
 *
 * **Note:** Breakpoints won't break on code if it's running in a thread. This is a current limitation of the GDScript debugger.
 *
 * **Warning:**
 *
 * To ensure proper cleanup without crashes or deadlocks, when a [godot.Thread]'s reference count reaches zero and it is therefore destroyed, the following conditions must be met:
 *
 * - It must not have any [godot.Mutex] objects locked.
 *
 * - It must not be waiting on any [godot.Semaphore] objects.
 *
 * - [waitToFinish] should have been called on it.
 */
@GodotBaseType
public open class Thread : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_THREAD, scriptIndex)
    return true
  }

  /**
   * Starts a new [godot.Thread] that calls [callable].
   *
   * If the method takes some arguments, you can pass them using [godot.Callable.bind].
   *
   * The [priority] of the [godot.Thread] can be changed by passing a value from the [enum Priority] enum.
   *
   * Returns [OK] on success, or [ERR_CANT_CREATE] on failure.
   */
  @JvmOverloads
  public fun start(callable: Callable, priority: Priority = Thread.Priority.PRIORITY_NORMAL):
      GodotError {
    TransferContext.writeArguments(CALLABLE to callable, LONG to priority.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the current [godot.Thread]'s ID, uniquely identifying it among all threads. If the [godot.Thread] has not started running or if [waitToFinish] has been called, this returns an empty string.
   */
  public fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if this [godot.Thread] has been started. Once started, this will return `true` until it is joined using [waitToFinish]. For checking if a [godot.Thread] is still executing its task, use [isAlive].
   */
  public fun isStarted(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStartedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if this [godot.Thread] is currently running the provided function. This is useful for determining if [waitToFinish] can be called without blocking the calling thread.
   *
   * To check if a [godot.Thread] is joinable, use [isStarted].
   */
  public fun isAlive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAlivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Joins the [godot.Thread] and waits for it to finish. Returns the output of the [godot.Callable] passed to [start].
   *
   * Should either be used when you want to retrieve the value returned from the method called by the [godot.Thread] or before freeing the instance that contains the [godot.Thread].
   *
   * To determine if this can be called without blocking the calling thread, check if [isAlive] is `false`.
   */
  public fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitToFinishPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sets whether the thread safety checks the engine normally performs in methods of certain classes (e.g., [godot.Node]) should happen **on the current thread**.
     *
     * The default, for every thread, is that they are enabled (as if called with [enabled] being `true`).
     *
     * Those checks are conservative. That means that they will only succeed in considering a call thread-safe (and therefore allow it to happen) if the engine can guarantee such safety.
     *
     * Because of that, there may be cases where the user may want to disable them ([enabled] being `false`) to make certain operations allowed again. By doing so, it becomes the user's responsibility to ensure thread safety (e.g., by using [godot.Mutex]) for those objects that are otherwise protected by the engine.
     *
     * **Note:** This is an advanced usage of the engine. You are advised to use it only if you know what you are doing and there is no safer way.
     *
     * **Note:** This is useful for scripts running on either arbitrary [godot.Thread] objects or tasks submitted to the [godot.WorkerThreadPool]. It doesn't apply to code running during [godot.Node] group processing, where the checks will be always performed.
     *
     * **Note:** Even in the case of having disabled the checks in a [godot.WorkerThreadPool] task, there's no need to re-enable them at the end. The engine will do so.
     */
    public fun setThreadSafetyChecksEnabled(enabled: Boolean): Unit {
      TransferContext.writeArguments(BOOL to enabled)
      TransferContext.callMethod(0, MethodBindings.setThreadSafetyChecksEnabledPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "start")

    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "get_id")

    public val isStartedPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "is_started")

    public val isAlivePtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "is_alive")

    public val waitToFinishPtr: VoidPtr = TypeManager.getMethodBindPtr("Thread", "wait_to_finish")

    public val setThreadSafetyChecksEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Thread", "set_thread_safety_checks_enabled")
  }
}
