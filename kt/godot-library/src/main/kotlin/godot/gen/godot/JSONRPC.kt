// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class JSONRPC : Object() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_JSONRPC)

  open fun makeNotification(method: String, params: Any): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_MAKE_NOTIFICATION,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun makeRequest(
    method: String,
    params: Any,
    id: Any
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params, ANY to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_MAKE_REQUEST, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun makeResponse(result: Any, id: Any): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(ANY to result, ANY to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_MAKE_RESPONSE, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun makeResponseError(
    code: Long,
    message: String,
    id: Any? = null
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to code, STRING to message, ANY to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_MAKE_RESPONSE_ERROR,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun processAction(action: Any, recurse: Boolean = false): Any? {
    TransferContext.writeArguments(ANY to action, BOOL to recurse)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_PROCESS_ACTION, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun processString(action: String): String {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_PROCESS_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun setScope(scope: String, target: Object) {
    TransferContext.writeArguments(STRING to scope, OBJECT to target)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONRPC_SET_SCOPE, NIL)
  }

  enum class ErrorCode(
    id: Long
  ) {
    PARSE_ERROR(-32700),

    INTERNAL_ERROR(-32603),

    INVALID_PARAMS(-32602),

    METHOD_NOT_FOUND(-32601),

    INVALID_REQUEST(-32600);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val INTERNAL_ERROR: Long = -32603

    final const val INVALID_PARAMS: Long = -32602

    final const val INVALID_REQUEST: Long = -32600

    final const val METHOD_NOT_FOUND: Long = -32601

    final const val PARSE_ERROR: Long = -32700
  }
}
