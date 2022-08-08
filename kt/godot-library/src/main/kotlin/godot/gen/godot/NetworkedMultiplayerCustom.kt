// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.NetworkedMultiplayerPeer] implementation that can be controlled from a script.
 *
 * A [godot.NetworkedMultiplayerPeer] implementation that can be used as a [godot.MultiplayerAPI.networkPeer] and controlled from a script.
 *
 * Its purpose is to allow adding a new backend for the high-Level multiplayer API without needing to use GDNative.
 */
@GodotBaseType
public open class NetworkedMultiplayerCustom : NetworkedMultiplayerPeer() {
  /**
   * Emitted when the local [godot.MultiplayerAPI] generates a packet.
   *
   * Your script should take this packet and send it to the requested peer over the network (which should call [deliverPacket] with the data when it's received).
   */
  public val packetGenerated: Signal3<Long, PoolByteArray, Long> by signal("peer_id", "buffer",
      "transfer_mode")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NETWORKEDMULTIPLAYERCUSTOM)
  }

  /**
   * Deliver a packet to the local [godot.MultiplayerAPI].
   *
   * When your script receives a packet from other peers over the network (originating from the [packetGenerated] signal on the sending peer), passing it to this method will deliver it locally.
   */
  public open fun deliverPacket(buffer: PoolByteArray, fromPeerId: Long): Unit {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer, LONG to fromPeerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERCUSTOM_DELIVER_PACKET, NIL)
  }

  /**
   * Initialize the peer with the given `peer_id` (must be between 1 and 2147483647).
   *
   * Can only be called if the connection status is [godot.NetworkedMultiplayerPeer.CONNECTION_CONNECTING]. See [setConnectionStatus].
   */
  public open fun initialize(selfPeerId: Long): Unit {
    TransferContext.writeArguments(LONG to selfPeerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERCUSTOM_INITIALIZE, NIL)
  }

  /**
   * Set the state of the connection. See [enum NetworkedMultiplayerPeer.ConnectionStatus].
   *
   * This will emit the [godot.NetworkedMultiplayerPeer.connectionSucceeded], [godot.NetworkedMultiplayerPeer.connectionFailed] or [godot.NetworkedMultiplayerPeer.serverDisconnected] signals depending on the status and if the peer has the unique network id of `1`.
   *
   * You can only change to [godot.NetworkedMultiplayerPeer.CONNECTION_CONNECTING] from [godot.NetworkedMultiplayerPeer.CONNECTION_DISCONNECTED] and to [godot.NetworkedMultiplayerPeer.CONNECTION_CONNECTED] from [godot.NetworkedMultiplayerPeer.CONNECTION_CONNECTING].
   */
  public open fun setConnectionStatus(connectionStatus: Long): Unit {
    TransferContext.writeArguments(LONG to connectionStatus)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERCUSTOM_SET_CONNECTION_STATUS, NIL)
  }

  /**
   * Set the max packet size that this peer can handle.
   */
  public open fun setMaxPacketSize(maxPacketSize: Long): Unit {
    TransferContext.writeArguments(LONG to maxPacketSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERCUSTOM_SET_MAX_PACKET_SIZE, NIL)
  }
}
