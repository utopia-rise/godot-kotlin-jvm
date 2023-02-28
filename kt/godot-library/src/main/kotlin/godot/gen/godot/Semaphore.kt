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
import kotlin.jvm.JvmName

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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEMAPHORE, scriptIndex)
    return true
  }

  /**
   * Waits for the [godot.Semaphore], if its value is zero, blocks until non-zero.
   */
  @JvmName("semaphoreWait")
  public fun wait(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_WAIT, NIL)
  }

  /**
   * Like [wait], but won't block, so if the value is zero, fails immediately and returns `false`. If non-zero, it returns `true` to report success.
   */
  public fun tryWait(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_TRY_WAIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Lowers the [godot.Semaphore], allowing one more thread in.
   */
  public fun post(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEMAPHORE_POST, NIL)
  }

  public companion object
}
