// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A binary [godot.Semaphore] for synchronization of multiple [godot.Thread]s.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/thread_safe_apis.html]($DOCS_URL/tutorials/performance/thread_safe_apis.html)
 *
 * A synchronization mutex (mutual exclusion). This is used to synchronize multiple [godot.Thread]s, and is equivalent to a binary [godot.Semaphore]. It guarantees that only one thread can access a critical section at a time.
 *
 * This is a reentrant mutex, meaning that it can be locked multiple times by one thread, provided it also unlocks it as many times.
 *
 * **Warning:** Mutexes must be used carefully to avoid deadlocks.
 *
 * **Warning:** To ensure proper cleanup without crashes or deadlocks, the following conditions must be met:
 *
 * - When a [godot.Mutex]'s reference count reaches zero and it is therefore destroyed, no threads (including the one on which the destruction will happen) must have it locked.
 *
 * - When a [godot.Thread]'s reference count reaches zero and it is therefore destroyed, it must not have any mutex locked.
 */
@GodotBaseType
public open class Mutex : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MUTEX, scriptIndex)
    return true
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
   * Tries locking this [godot.Mutex], but does not block. Returns `true` on success, `false` otherwise.
   *
   * **Note:** This function returns `true` if the thread already has ownership of the mutex.
   */
  public fun tryLock(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MUTEX_TRY_LOCK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Unlocks this [godot.Mutex], leaving it to other threads.
   *
   * **Note:** If a thread called [lock] or [tryLock] multiple times while already having ownership of the mutex, it must also call [unlock] the same number of times in order to unlock it correctly.
   *
   * **Warning:** Calling [unlock] more times that [lock] on a given thread, thus ending up trying to unlock a non-locked mutex, is wrong and may causes crashes or deadlocks.
   */
  public fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MUTEX_UNLOCK, NIL)
  }

  public companion object
}
