// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Int
import kotlin.Suppress

/**
 * A synchronization mutex (mutual exclusion).
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/threads/using_multiple_threads.html](https://docs.godotengine.org/en/3.3/tutorials/threads/using_multiple_threads.html)
 *
 * A synchronization mutex (mutual exclusion). This is used to synchronize multiple [godot.Thread]s, and is equivalent to a binary [godot.Semaphore]. It guarantees that only one thread can ever acquire the lock at a time. A mutex can be used to protect a critical section; however, be careful to avoid deadlocks.
 */
@GodotBaseType
open class Mutex : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS__MUTEX)
  }

  /**
   * Locks this [godot.Mutex], blocks until it is unlocked by the current owner.
   */
  open fun lock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MUTEX_LOCK, NIL)
  }

  /**
   * Tries locking this [godot.Mutex], but does not block. Returns [OK] on success, [ERR_BUSY] otherwise.
   */
  open fun tryLock(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MUTEX_TRY_LOCK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Unlocks this [godot.Mutex], leaving it to other threads.
   */
  open fun unlock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MUTEX_UNLOCK, NIL)
  }
}
