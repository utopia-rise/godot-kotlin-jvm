// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Translation : Resource() {
  open var locale: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_LOCALE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_SET_LOCALE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TRANSLATION)

  open fun _get_messages(): PoolStringArray {
    throw NotImplementedError("_get_messages is not implemented for Translation")
  }

  open fun _set_messages(arg0: PoolStringArray) {
  }

  open fun addMessage(srcMessage: String, xlatedMessage: String) {
    TransferContext.writeArguments(STRING to srcMessage, STRING to xlatedMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ADD_MESSAGE, NIL)
  }

  open fun eraseMessage(srcMessage: String) {
    TransferContext.writeArguments(STRING to srcMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ERASE_MESSAGE, NIL)
  }

  open fun getMessage(srcMessage: String): String {
    TransferContext.writeArguments(STRING to srcMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getMessageCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMessageList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  companion object
}
