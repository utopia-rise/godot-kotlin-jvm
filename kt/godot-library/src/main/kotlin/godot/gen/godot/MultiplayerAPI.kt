// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class MultiplayerAPI : Reference() {
  val connectedToServer: Signal0 by signal()

  val connectionFailed: Signal0 by signal()

  val networkPeerConnected: Signal1<Long> by signal("id")

  val networkPeerDisconnected: Signal1<Long> by signal("id")

  val networkPeerPacket: Signal2<Long, PoolByteArray> by signal("id", "packet")

  val serverDisconnected: Signal0 by signal()

  open var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_ALLOW_OBJECT_DECODING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ALLOW_OBJECT_DECODING, NIL)
    }

  open var networkPeer: NetworkedMultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_PEER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NetworkedMultiplayerPeer?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_NETWORK_PEER,
          NIL)
    }

  open var refuseNewNetworkConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_REFUSE_NEW_NETWORK_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_REFUSE_NEW_NETWORK_CONNECTIONS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MULTIPLAYERAPI)

  open fun _addPeer(id: Long) {
  }

  open fun _connectedToServer() {
  }

  open fun _connectionFailed() {
  }

  open fun _delPeer(id: Long) {
  }

  open fun _serverDisconnected() {
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_CLEAR, NIL)
  }

  open fun getNetworkConnectedPeers(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_CONNECTED_PEERS, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getNetworkUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_NETWORK_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getRpcSenderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_GET_RPC_SENDER_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasNetworkPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_HAS_NETWORK_PEER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isNetworkServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_IS_NETWORK_SERVER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_POLL, NIL)
  }

  open fun sendBytes(
    bytes: PoolByteArray,
    id: Long = 0,
    mode: Long = 2
  ): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to bytes, LONG to id, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SEND_BYTES, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setRootNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERAPI_SET_ROOT_NODE, NIL)
  }

  enum class RPCMode(
    id: Long
  ) {
    RPC_MODE_DISABLED(0),

    RPC_MODE_REMOTE(1),

    RPC_MODE_MASTER(2),

    RPC_MODE_PUPPET(3),

    RPC_MODE_SLAVE(3),

    RPC_MODE_REMOTESYNC(4),

    RPC_MODE_SYNC(4),

    RPC_MODE_MASTERSYNC(5),

    RPC_MODE_PUPPETSYNC(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val RPC_MODE_DISABLED: Long = 0

    final const val RPC_MODE_MASTER: Long = 2

    final const val RPC_MODE_MASTERSYNC: Long = 5

    final const val RPC_MODE_PUPPET: Long = 3

    final const val RPC_MODE_PUPPETSYNC: Long = 6

    final const val RPC_MODE_REMOTE: Long = 1

    final const val RPC_MODE_REMOTESYNC: Long = 4

    final const val RPC_MODE_SLAVE: Long = 3

    final const val RPC_MODE_SYNC: Long = 4
  }
}
