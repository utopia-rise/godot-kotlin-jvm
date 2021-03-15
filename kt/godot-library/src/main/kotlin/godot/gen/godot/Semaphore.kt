// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import kotlin.Int
import kotlin.Suppress

/**
 * A synchronization semaphore.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/threads/using_multiple_threads.html](https://docs.godotengine.org/en/latest/tutorials/threads/using_multiple_threads.html)
 *
 * A synchronization semaphore which can be used to synchronize multiple [godot.Thread]s. Initialized to zero on creation. Be careful to avoid deadlocks. For a binary version, see [godot.Mutex].
 */
@GodotBaseType
open class Semaphore : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS__SEMAPHORE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Lowers the [godot.Semaphore], allowing one more thread in. Returns [OK] on success, [ERR_BUSY] otherwise.
   */
  open fun post(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__SEMAPHORE_POST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Tries to wait for the [godot.Semaphore], if its value is zero, blocks until non-zero. Returns [OK] on success, [ERR_BUSY] otherwise.
   */
  open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__SEMAPHORE_WAIT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
