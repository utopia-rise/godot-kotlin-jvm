// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A synchronization mutex (mutual exclusion).
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_multiple_threads.html]($DOCS_URL/tutorials/performance/using_multiple_threads.html)
 *
 * A synchronization mutex (mutual exclusion). This is used to synchronize multiple [godot.Thread]s, and is equivalent to a binary [godot.Semaphore]. It guarantees that only one thread can ever acquire the lock at a time. A mutex can be used to protect a critical section; however, be careful to avoid deadlocks.
 */
@GodotBaseType
public open class Mutex : RefCounted() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MUTEX, scriptIndex)
  }

  /**
   * Locks this [godot.Mutex], blocks until it is unlocked by the current owner.
   *
   * **Note:** This function returns without blocking if the thread already has ownership of the mutex.
   */
  public fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MUTEX_LOCK, NIL)
  }

  /**
   * Tries locking this [godot.Mutex], but does not block. Returns [OK] on success, [ERR_BUSY] otherwise.
   *
   * **Note:** This function returns [OK] if the thread already has ownership of the mutex.
   */
  public fun tryLock(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MUTEX_TRY_LOCK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Unlocks this [godot.Mutex], leaving it to other threads.
   *
   * **Note:** If a thread called [lock] or [tryLock] multiple times while already having ownership of the mutex, it must also call [unlock] the same number of times in order to unlock it correctly.
   */
  public fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MUTEX_UNLOCK, NIL)
  }

  public companion object
}
