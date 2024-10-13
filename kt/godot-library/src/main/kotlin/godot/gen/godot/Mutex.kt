// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A synchronization mutex (mutual exclusion). This is used to synchronize multiple [Thread]s, and
 * is equivalent to a binary [Semaphore]. It guarantees that only one thread can access a critical
 * section at a time.
 * This is a reentrant mutex, meaning that it can be locked multiple times by one thread, provided
 * it also unlocks it as many times.
 * **Warning:** Mutexes must be used carefully to avoid deadlocks.
 * **Warning:** To ensure proper cleanup without crashes or deadlocks, the following conditions must
 * be met:
 * - When a [Mutex]'s reference count reaches zero and it is therefore destroyed, no threads
 * (including the one on which the destruction will happen) must have it locked.
 * - When a [Thread]'s reference count reaches zero and it is therefore destroyed, it must not have
 * any mutex locked.
 */
@GodotBaseType
public open class Mutex : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MUTEX, scriptIndex)
  }

  /**
   * Locks this [Mutex], blocks until it is unlocked by the current owner.
   * **Note:** This function returns without blocking if the thread already has ownership of the
   * mutex.
   */
  public final fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.lockPtr, NIL)
  }

  /**
   * Tries locking this [Mutex], but does not block. Returns `true` on success, `false` otherwise.
   * **Note:** This function returns `true` if the thread already has ownership of the mutex.
   */
  public final fun tryLock(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.tryLockPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Unlocks this [Mutex], leaving it to other threads.
   * **Note:** If a thread called [lock] or [tryLock] multiple times while already having ownership
   * of the mutex, it must also call [unlock] the same number of times in order to unlock it correctly.
   * **Warning:** Calling [unlock] more times that [lock] on a given thread, thus ending up trying
   * to unlock a non-locked mutex, is wrong and may causes crashes or deadlocks.
   */
  public final fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.unlockPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val lockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "lock", 3218959716)

    public val tryLockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "try_lock", 2240911060)

    public val unlockPtr: VoidPtr = TypeManager.getMethodBindPtr("Mutex", "unlock", 3218959716)
  }
}
