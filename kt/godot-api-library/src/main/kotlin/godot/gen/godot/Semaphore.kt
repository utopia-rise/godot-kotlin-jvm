// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SEMAPHORE_INDEX: Int = 510

/**
 * A synchronization semaphore that can be used to synchronize multiple [Thread]s. Initialized to
 * zero on creation. For a binary version, see [Mutex].
 * **Warning:** Semaphores must be used carefully to avoid deadlocks.
 * **Warning:** To guarantee that the operating system is able to perform proper cleanup (no
 * crashes, no deadlocks), these conditions must be met:
 * - When a [Semaphore]'s reference count reaches zero and it is therefore destroyed, no threads
 * must be waiting on it.
 * - When a [Thread]'s reference count reaches zero and it is therefore destroyed, it must not be
 * waiting on any semaphore.
 */
@GodotBaseType
public open class Semaphore : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SEMAPHORE_INDEX, scriptIndex)
  }

  /**
   * Waits for the [Semaphore], if its value is zero, blocks until non-zero.
   */
  @JvmName("semaphoreWait")
  public final fun wait(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.waitPtr, NIL)
  }

  /**
   * Like [wait], but won't block, so if the value is zero, fails immediately and returns `false`.
   * If non-zero, it returns `true` to report success.
   */
  public final fun tryWait(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.tryWaitPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Lowers the [Semaphore], allowing one more thread in.
   */
  public final fun post(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.postPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val waitPtr: VoidPtr = Internals.getMethodBindPtr("Semaphore", "wait", 3218959716)

    public val tryWaitPtr: VoidPtr = Internals.getMethodBindPtr("Semaphore", "try_wait", 2240911060)

    public val postPtr: VoidPtr = Internals.getMethodBindPtr("Semaphore", "post", 3218959716)
  }
}
