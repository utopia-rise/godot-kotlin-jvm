// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * A unit of execution in a process.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/threads/thread_safe_apis.html](https://docs.godotengine.org/en/latest/tutorials/threads/thread_safe_apis.html)
 *
 * A unit of execution in a process. Can run methods on [godot.Object]s simultaneously. The use of synchronization via [godot.Mutex] or [godot.Semaphore] is advised if working with shared objects.
 *
 * **Note:** Breakpoints won't break on code if it's running in a thread. This is a current limitation of the GDScript debugger.
 */
@GodotBaseType
open class Thread : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS__THREAD)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the current [godot.Thread]'s ID, uniquely identifying it among all threads. If the [godot.Thread] is not running this returns an empty string.
   */
  open fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_GET_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if this [godot.Thread] is currently active. An active [godot.Thread] cannot start work on a new method but can be joined with [waitToFinish].
   */
  open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts a new [godot.Thread] that runs `method` on object `instance` with `userdata` passed as an argument. Even if no userdata is passed, `method` must accept one argument and it will be null. The `priority` of the [godot.Thread] can be changed by passing a value from the [enum Priority] enum.
   *
   * Returns [OK] on success, or [ERR_CANT_CREATE] on failure.
   */
  open fun start(
    instance: Object,
    method: String,
    userdata: Any? = null,
    priority: Long = 1
  ): GodotError {
    TransferContext.writeArguments(OBJECT to instance, STRING to method, ANY to userdata, LONG to
        priority)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Joins the [godot.Thread] and waits for it to finish. Returns what the method called returned.
   */
  open fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_WAIT_TO_FINISH, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  enum class Priority(
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
    PRIORITY_HIGH(2);

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
     * A thread running with higher priority than normally.
     */
    final const val PRIORITY_HIGH: Long = 2

    /**
     * A thread running with lower priority than normally.
     */
    final const val PRIORITY_LOW: Long = 0

    /**
     * A thread with a standard priority.
     */
    final const val PRIORITY_NORMAL: Long = 1
  }
}
