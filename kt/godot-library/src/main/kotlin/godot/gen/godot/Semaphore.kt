// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
 * A synchronization semaphore.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_multiple_threads.html]($DOCS_URL/tutorials/performance/using_multiple_threads.html)
 *
 * A synchronization semaphore which can be used to synchronize multiple [godot.Thread]s. Initialized to zero on creation. Be careful to avoid deadlocks. For a binary version, see [godot.Mutex].
 */
@GodotBaseType
public open class Semaphore : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SEMAPHORE)
  }

  /**
   * Waits for the [godot.Semaphore], if its value is zero, blocks until non-zero.
   */
  public open fun wait(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_WAIT, NIL)
  }

  /**
   * Like [wait], but won't block, so if the value is zero, fails immediately and returns [ERR_BUSY]. If non-zero, it returns [OK] to report success.
   */
  public open fun tryWait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_TRY_WAIT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Lowers the [godot.Semaphore], allowing one more thread in.
   */
  public open fun post(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_POST, NIL)
  }

  public companion object
}
