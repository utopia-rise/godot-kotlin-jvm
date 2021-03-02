// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KFunction0
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction10
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8
import kotlin.reflect.KFunction9
import kotlin.reflect.KMutableProperty

@GodotBaseType
open class Node : Object() {
  val ready: Signal0 by signal()

  val renamed: Signal0 by signal()

  val treeEntered: Signal0 by signal()

  val treeExited: Signal0 by signal()

  val treeExiting: Signal0 by signal()

  open var customMultiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CUSTOM_MULTIPLAYER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_CUSTOM_MULTIPLAYER, NIL)
    }

  open var filename: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_FILENAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_FILENAME, NIL)
    }

  open val multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_MULTIPLAYER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }

  open var name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_NAME, NIL)
    }

  open var owner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_OWNER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_OWNER, NIL)
    }

  open var pauseMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PAUSE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PAUSE_MODE, NIL)
    }

  open var processPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_PRIORITY, NIL)
    }

  inline fun <reified FUNCTION : KFunction0<*>> rpc(function: FUNCTION) =
      rpc(function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcId(id: Long, function: FUNCTION) = rpcId(id,
      function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcUnreliable(function: FUNCTION) =
      rpcUnreliable(function.name.camelToSnakeCase())

  inline fun <reified FUNCTION : KFunction0<*>> rpcUnreliableId(id: Long, function: FUNCTION) =
      rpcUnreliableId(id, function.name.camelToSnakeCase())

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpc(function: FUNCTION, arg0: ARG0) =
      rpc(function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcUnreliable(function: FUNCTION,
      arg0: ARG0) = rpcUnreliable(function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION : KFunction4<ARG0, ARG1, ARG2, ARG3, *>>
      rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION : KFunction5<ARG0, ARG1, ARG2, ARG3,
      ARG4, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION : KFunction6<ARG0, ARG1, ARG2,
      ARG3, ARG4, ARG5, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION : KFunction7<ARG0, ARG1,
      ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION : KFunction8<ARG0,
      ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpc(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8,
      arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8, arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcUnreliable(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcUnreliable(function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8, arg9)

  inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcUnreliableId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcUnreliableId(id, function.name.camelToSnakeCase(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8, arg9)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rset(property: PROPERTY, value: TYPE)
      = rset(property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetId(
    id: Long,
    property: PROPERTY,
    value: TYPE
  ) = rsetId(id, property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetUnreliable(property: PROPERTY,
      value: TYPE) = rsetUnreliable(property.name.camelToSnakeCase(), value)

  inline fun <TYPE, reified PROPERTY : KMutableProperty<TYPE>> rsetUnreliableId(
    id: Long,
    property: PROPERTY,
    value: TYPE
  ) = rsetUnreliableId(id, property.name.camelToSnakeCase(), value)

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_NODE)

  open fun _enterTree() {
  }

  open fun _exitTree() {
  }

  open fun _getConfigurationWarning(): String {
    throw NotImplementedError("_get_configuration_warning is not implemented for Node")
  }

  open fun _getEditorDescription(): String {
    throw NotImplementedError("_get_editor_description is not implemented for Node")
  }

  open fun _getImportPath(): NodePath {
    throw NotImplementedError("_get_import_path is not implemented for Node")
  }

  open fun _input(event: InputEvent) {
  }

  open fun _physicsProcess(delta: Double) {
  }

  open fun _process(delta: Double) {
  }

  open fun _ready() {
  }

  open fun _setEditorDescription(editorDescription: String) {
  }

  open fun _setImportPath(importPath: NodePath) {
  }

  open fun _unhandledInput(event: InputEvent) {
  }

  open fun _unhandledKeyInput(event: InputEventKey) {
  }

  open fun addChild(node: Node, legibleUniqueName: Boolean = false) {
    TransferContext.writeArguments(OBJECT to node, BOOL to legibleUniqueName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_CHILD, NIL)
  }

  open fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to node, OBJECT to childNode, BOOL to legibleUniqueName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_CHILD_BELOW_NODE, NIL)
  }

  open fun addToGroup(group: String, persistent: Boolean = false) {
    TransferContext.writeArguments(STRING to group, BOOL to persistent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_TO_GROUP, NIL)
  }

  open fun canProcess(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_CAN_PROCESS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun duplicate(flags: Long = 15): Node? {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun findNode(
    mask: String,
    recursive: Boolean = true,
    owned: Boolean = true
  ): Node? {
    TransferContext.writeArguments(STRING to mask, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun findParent(mask: String): Node? {
    TransferContext.writeArguments(STRING to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getChild(idx: Long): Node? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getChildCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getChildren(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILDREN, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getGroups(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_GROUPS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNetworkMaster(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NETWORK_MASTER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNode(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getNodeAndResource(path: NodePath): VariantArray<Any?> {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_AND_RESOURCE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getNodeOrNull(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_OR_NULL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getParent(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getPathTo(node: Node): NodePath {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH_TO, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  open fun getPhysicsProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PHYSICS_PROCESS_DELTA_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getPositionInParent(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_POSITION_IN_PARENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_DELTA_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getSceneInstanceLoadPlaceholder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_GET_SCENE_INSTANCE_LOAD_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTree(): SceneTree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_TREE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTree?
  }

  open fun getViewport(): Viewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_VIEWPORT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Viewport?
  }

  open fun hasNode(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasNodeAndResource(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE_AND_RESOURCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isAParentOf(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_A_PARENT_OF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isDisplayedFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_DISPLAYED_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isGreaterThan(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_GREATER_THAN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isInGroup(group: String): Boolean {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_IN_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isInsideTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_INSIDE_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isNetworkMaster(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_NETWORK_MASTER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isPhysicsProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isPhysicsProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING_INTERNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isProcessingInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INTERNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isProcessingUnhandledInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_INPUT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isProcessingUnhandledKeyInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_KEY_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun moveChild(childNode: Node, toPosition: Long) {
    TransferContext.writeArguments(OBJECT to childNode, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_MOVE_CHILD, NIL)
  }

  open fun printStrayNodes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_STRAY_NODES, NIL)
  }

  open fun printTree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE, NIL)
  }

  open fun printTreePretty() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE_PRETTY, NIL)
  }

  open fun propagateCall(
    method: String,
    args: VariantArray<Any?> = VariantArray(),
    parentFirst: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to method, ARRAY to args, BOOL to parentFirst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_CALL, NIL)
  }

  open fun propagateNotification(what: Long) {
    TransferContext.writeArguments(LONG to what)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_NOTIFICATION, NIL)
  }

  open fun queueFree() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_QUEUE_FREE, NIL)
  }

  open fun raise() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RAISE, NIL)
  }

  open fun removeAndSkip() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_AND_SKIP, NIL)
  }

  open fun removeChild(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_CHILD, NIL)
  }

  open fun removeFromGroup(group: String) {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_FROM_GROUP, NIL)
  }

  open fun replaceBy(node: Node, keepData: Boolean = false) {
    TransferContext.writeArguments(OBJECT to node, BOOL to keepData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REPLACE_BY, NIL)
  }

  open fun requestReady() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REQUEST_READY, NIL)
  }

  open fun rpc(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun rpcConfig(method: String, mode: Long) {
    TransferContext.writeArguments(STRING to method, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_CONFIG, NIL)
  }

  open fun rpcId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(LONG to peerId, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_ID, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun rpcUnreliable(method: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_UNRELIABLE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun rpcUnreliableId(
    peerId: Long,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(LONG to peerId, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_UNRELIABLE_ID, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun rset(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET, NIL)
  }

  open fun rsetConfig(property: String, mode: Long) {
    TransferContext.writeArguments(STRING to property, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_CONFIG, NIL)
  }

  open fun rsetId(
    peerId: Long,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to peerId, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_ID, NIL)
  }

  open fun rsetUnreliable(property: String, value: Any?) {
    TransferContext.writeArguments(STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_UNRELIABLE, NIL)
  }

  open fun rsetUnreliableId(
    peerId: Long,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to peerId, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RSET_UNRELIABLE_ID, NIL)
  }

  open fun setDisplayFolded(fold: Boolean) {
    TransferContext.writeArguments(BOOL to fold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_DISPLAY_FOLDED, NIL)
  }

  open fun setNetworkMaster(id: Long, recursive: Boolean = true) {
    TransferContext.writeArguments(LONG to id, BOOL to recursive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_NETWORK_MASTER, NIL)
  }

  open fun setPhysicsProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS, NIL)
  }

  open fun setPhysicsProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS_INTERNAL,
        NIL)
  }

  open fun setProcess(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS, NIL)
  }

  open fun setProcessInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INPUT, NIL)
  }

  open fun setProcessInternal(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INTERNAL, NIL)
  }

  open fun setProcessUnhandledInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_INPUT,
        NIL)
  }

  open fun setProcessUnhandledKeyInput(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_KEY_INPUT, NIL)
  }

  open fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    TransferContext.writeArguments(BOOL to loadPlaceholder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_SCENE_INSTANCE_LOAD_PLACEHOLDER, NIL)
  }

  open fun updateConfigurationWarning() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_UPDATE_CONFIGURATION_WARNING,
        NIL)
  }

  enum class PauseMode(
    id: Long
  ) {
    PAUSE_MODE_INHERIT(0),

    PAUSE_MODE_STOP(1),

    PAUSE_MODE_PROCESS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DuplicateFlags(
    id: Long
  ) {
    DUPLICATE_SIGNALS(1),

    DUPLICATE_GROUPS(2),

    DUPLICATE_SCRIPTS(4),

    DUPLICATE_USE_INSTANCING(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DUPLICATE_GROUPS: Long = 2

    final const val DUPLICATE_SCRIPTS: Long = 4

    final const val DUPLICATE_SIGNALS: Long = 1

    final const val DUPLICATE_USE_INSTANCING: Long = 8

    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    final const val NOTIFICATION_CRASH: Long = 1012

    final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    final const val NOTIFICATION_DRAG_END: Long = 22

    final const val NOTIFICATION_ENTER_TREE: Long = 10

    final const val NOTIFICATION_EXIT_TREE: Long = 11

    final const val NOTIFICATION_INSTANCED: Long = 20

    final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    final const val NOTIFICATION_PARENTED: Long = 18

    final const val NOTIFICATION_PATH_CHANGED: Long = 23

    final const val NOTIFICATION_PAUSED: Long = 14

    final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    final const val NOTIFICATION_PROCESS: Long = 17

    final const val NOTIFICATION_READY: Long = 13

    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    final const val NOTIFICATION_UNPARENTED: Long = 19

    final const val NOTIFICATION_UNPAUSED: Long = 15

    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008

    final const val PAUSE_MODE_INHERIT: Long = 0

    final const val PAUSE_MODE_PROCESS: Long = 2

    final const val PAUSE_MODE_STOP: Long = 1
  }
}
