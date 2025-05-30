// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A synchronization semaphore that can be used to synchronize multiple [Thread]s. Initialized to
 * zero on creation. For a binary version, see [Mutex].
 *
 * **Warning:** Semaphores must be used carefully to avoid deadlocks.
 *
 * **Warning:** To guarantee that the operating system is able to perform proper cleanup (no
 * crashes, no deadlocks), these conditions must be met:
 *
 * - When a [Semaphore]'s reference count reaches zero and it is therefore destroyed, no threads
 * must be waiting on it.
 *
 * - When a [Thread]'s reference count reaches zero and it is therefore destroyed, it must not be
 * waiting on any semaphore.
 */
@GodotBaseType
public open class Semaphore : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(579, scriptIndex)
  }

  /**
   * Waits for the [Semaphore], if its value is zero, blocks until non-zero.
   */
  public final fun waitFor(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.waitPtr, NIL)
  }

  /**
   * Like [wait], but won't block, so if the value is zero, fails immediately and returns `false`.
   * If non-zero, it returns `true` to report success.
   */
  public final fun tryWait(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.tryWaitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Lowers the [Semaphore], allowing one thread in, or more if [count] is specified.
   */
  @JvmOverloads
  public final fun post(count: Int = 1): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.postPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "wait", 3218959716)

    internal val tryWaitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Semaphore", "try_wait", 2240911060)

    internal val postPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "post", 1667783136)
  }
}
