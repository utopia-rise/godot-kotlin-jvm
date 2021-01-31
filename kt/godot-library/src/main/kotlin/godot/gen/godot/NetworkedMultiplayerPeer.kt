// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.NetworkedMultiplayerPeer
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class NetworkedMultiplayerPeer : PacketPeer() {
  val connectionFailed: Signal0 by signal()

  val connectionSucceeded: Signal0 by signal()

  val peerConnected: Signal1<Long> by signal("id")

  val peerDisconnected: Signal1<Long> by signal("id")

  val serverDisconnected: Signal0 by signal()

  open var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_REFUSE_NEW_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  open var transferMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_TRANSFER_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_TRANSFER_MODE, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_NETWORKEDMULTIPLAYERPEER)

  open fun getConnectionStatus(): NetworkedMultiplayerPeer.ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_CONNECTION_STATUS, LONG)
    return NetworkedMultiplayerPeer.ConnectionStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getPacketPeer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_PACKET_PEER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_POLL, NIL)
  }

  open fun setTargetPeer(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_TARGET_PEER, NIL)
  }

  enum class ConnectionStatus(
    id: Long
  ) {
    CONNECTION_DISCONNECTED(0),

    CONNECTION_CONNECTING(1),

    CONNECTION_CONNECTED(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TransferMode(
    id: Long
  ) {
    TRANSFER_MODE_UNRELIABLE(0),

    TRANSFER_MODE_UNRELIABLE_ORDERED(1),

    TRANSFER_MODE_RELIABLE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CONNECTION_CONNECTED: Long = 2

    final const val CONNECTION_CONNECTING: Long = 1

    final const val CONNECTION_DISCONNECTED: Long = 0

    final const val TARGET_PEER_BROADCAST: Long = 0

    final const val TARGET_PEER_SERVER: Long = 1

    final const val TRANSFER_MODE_RELIABLE: Long = 2

    final const val TRANSFER_MODE_UNRELIABLE: Long = 0

    final const val TRANSFER_MODE_UNRELIABLE_ORDERED: Long = 1
  }
}
