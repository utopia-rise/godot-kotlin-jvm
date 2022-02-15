// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A unit of execution in a process.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A unit of execution in a process. Can run methods on [godot.Object]s simultaneously. The use of synchronization via [godot.Mutex] or [godot.Semaphore] is advised if working with shared objects.
 *
 * **Note:** Breakpoints won't break on code if it's running in a thread. This is a current limitation of the GDScript debugger.
 */
@GodotBaseType
public open class Thread : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_THREAD)
  }

  /**
   * Starts a new [godot.Thread] that calls `callable` with `userdata` passed as an argument. Even if no userdata is passed, `callable` must accept one argument and it will be null. The `priority` of the [godot.Thread] can be changed by passing a value from the [enum Priority] enum.
   *
   * Returns [OK] on success, or [ERR_CANT_CREATE] on failure.
   */
  public open fun start(
    callable: Callable,
    userdata: Any? = null,
    priority: Thread.Priority = Priority.PRIORITY_NORMAL
  ): GodotError {
    TransferContext.writeArguments(OBJECT to callable, ANY to userdata, LONG to priority.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THREAD_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the current [godot.Thread]'s ID, uniquely identifying it among all threads. If the [godot.Thread] is not running this returns an empty string.
   */
  public open fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THREAD_GET_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if this [godot.Thread] has been started. Once started, this will return `true` until it is joined using [waitToFinish]. For checking if a [godot.Thread] is still executing its task, use [isAlive].
   */
  public open fun isStarted(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THREAD_IS_STARTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this [godot.Thread] is currently running. This is useful for determining if [waitToFinish] can be called without blocking the calling thread.
   *
   * To check if a [godot.Thread] is joinable, use [isStarted].
   */
  public open fun isAlive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THREAD_IS_ALIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Joins the [godot.Thread] and waits for it to finish. Returns the output of the [godot.Callable] passed to [start].
   *
   * Should either be used when you want to retrieve the value returned from the method called by the [godot.Thread] or before freeing the instance that contains the [godot.Thread].
   *
   * To determine if this can be called without blocking the calling thread, check if [isAlive] is `false`.
   *
   * **Note:** After the [godot.Thread] finishes joining it will be disposed. If you want to use it again you will have to create a new instance of it.
   */
  public open fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THREAD_WAIT_TO_FINISH, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public enum class Priority(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
