// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScriptFunctionCall : VisualScriptNode() {
  open var baseScript: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_BASE_SCRIPT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_BASE_SCRIPT, NIL)
    }

  open var baseType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_BASE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_BASE_TYPE, NIL)
    }

  open var basicType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_BASIC_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_BASIC_TYPE, NIL)
    }

  open var callMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_CALL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_CALL_MODE, NIL)
    }

  open var function: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_FUNCTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_FUNCTION, NIL)
    }

  open var nodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_NODE_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_NODE_PATH, NIL)
    }

  open var rpcCallMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_RPC_CALL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_RPC_CALL_MODE, NIL)
    }

  open var singleton: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_SINGLETON, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_SINGLETON, NIL)
    }

  open var useDefaultArgs: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_USE_DEFAULT_ARGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_USE_DEFAULT_ARGS, NIL)
    }

  open var validate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_GET_VALIDATE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTFUNCTIONCALL_SET_VALIDATE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTFUNCTIONCALL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getArgumentCache(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_argument_cache is not implemented for VisualScriptFunctionCall")
  }

  open fun _setArgumentCache(argumentCache: Dictionary<Any?, Any?>) {
  }

  enum class RPCCallMode(
    id: Long
  ) {
    RPC_DISABLED(0),

    RPC_RELIABLE(1),

    RPC_UNRELIABLE(2),

    RPC_RELIABLE_TO_ID(3),

    RPC_UNRELIABLE_TO_ID(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CallMode(
    id: Long
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3),

    CALL_MODE_SINGLETON(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CALL_MODE_BASIC_TYPE: Long = 3

    final const val CALL_MODE_INSTANCE: Long = 2

    final const val CALL_MODE_NODE_PATH: Long = 1

    final const val CALL_MODE_SELF: Long = 0

    final const val CALL_MODE_SINGLETON: Long = 4

    final const val RPC_DISABLED: Long = 0

    final const val RPC_RELIABLE: Long = 1

    final const val RPC_RELIABLE_TO_ID: Long = 3

    final const val RPC_UNRELIABLE: Long = 2

    final const val RPC_UNRELIABLE_TO_ID: Long = 4
  }
}
