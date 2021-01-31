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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Thread : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS__THREAD)

  open fun getId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_GET_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

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

  open fun waitToFinish(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__THREAD_WAIT_TO_FINISH, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  enum class Priority(
    id: Long
  ) {
    PRIORITY_LOW(0),

    PRIORITY_NORMAL(1),

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
    final const val PRIORITY_HIGH: Long = 2

    final const val PRIORITY_LOW: Long = 0

    final const val PRIORITY_NORMAL: Long = 1
  }
}
