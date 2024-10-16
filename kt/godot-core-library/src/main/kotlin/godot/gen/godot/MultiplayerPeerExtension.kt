// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.core.PackedByteArray
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class is designed to be inherited from a GDExtension plugin to implement custom networking
 * layers for the multiplayer API (such as WebRTC). All the methods below **must** be implemented to
 * have a working custom multiplayer implementation. See also [MultiplayerAPI].
 */
@GodotBaseType
public open class MultiplayerPeerExtension : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_MULTIPLAYERPEEREXTENSION, this, scriptIndex)
  }

  /**
   * Called when the available packet count is internally requested by the [MultiplayerAPI].
   */
  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the maximum allowed packet size (in bytes) is requested by the [MultiplayerAPI].
   */
  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be received by the [MultiplayerAPI], if [_getPacket] isn't
   * implemented. Use this when extending this class via GDScript.
   */
  public open fun _getPacketScript(): PackedByteArray {
    throw NotImplementedError("_get_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be sent by the [MultiplayerAPI], if [_putPacket] isn't
   * implemented. Use this when extending this class via GDScript.
   */
  public open fun _putPacketScript(pBuffer: PackedByteArray): Error {
    throw NotImplementedError("_put_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to get the channel over which the next available packet was received. See
   * [MultiplayerPeer.getPacketChannel].
   */
  public open fun _getPacketChannel(): Int {
    throw NotImplementedError("_get_packet_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to get the transfer mode the remote peer used to send the next available packet. See
   * [MultiplayerPeer.getPacketMode].
   */
  public open fun _getPacketMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_packet_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the channel to use is set for this [MultiplayerPeer] (see
   * [MultiplayerPeer.transferChannel]).
   */
  public open fun _setTransferChannel(pChannel: Int): Unit {
  }

  /**
   * Called when the transfer channel to use is read on this [MultiplayerPeer] (see
   * [MultiplayerPeer.transferChannel]).
   */
  public open fun _getTransferChannel(): Int {
    throw NotImplementedError("_get_transfer_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the transfer mode is set on this [MultiplayerPeer] (see
   * [MultiplayerPeer.transferMode]).
   */
  public open fun _setTransferMode(pMode: MultiplayerPeer.TransferMode): Unit {
  }

  /**
   * Called when the transfer mode to use is read on this [MultiplayerPeer] (see
   * [MultiplayerPeer.transferMode]).
   */
  public open fun _getTransferMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_transfer_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the target peer to use is set for this [MultiplayerPeer] (see
   * [MultiplayerPeer.setTargetPeer]).
   */
  public open fun _setTargetPeer(pPeer: Int): Unit {
  }

  /**
   * Called when the ID of the [MultiplayerPeer] who sent the most recent packet is requested (see
   * [MultiplayerPeer.getPacketPeer]).
   */
  public open fun _getPacketPeer(): Int {
    throw NotImplementedError("_get_packet_peer is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "is server" status is requested on the [MultiplayerAPI]. See
   * [MultiplayerAPI.isServer].
   */
  public open fun _isServer(): Boolean {
    throw NotImplementedError("_is_server is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the [MultiplayerAPI] is polled. See [MultiplayerAPI.poll].
   */
  public open fun _poll(): Unit {
  }

  /**
   * Called when the multiplayer peer should be immediately closed (see [MultiplayerPeer.close]).
   */
  public open fun _close(): Unit {
  }

  /**
   * Called when the connected [pPeer] should be forcibly disconnected (see
   * [MultiplayerPeer.disconnectPeer]).
   */
  public open fun _disconnectPeer(pPeer: Int, pForce: Boolean): Unit {
  }

  /**
   * Called when the unique ID of this [MultiplayerPeer] is requested (see
   * [MultiplayerPeer.getUniqueId]). The value must be between `1` and `2147483647`.
   */
  public open fun _getUniqueId(): Int {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "refuse new connections" status is set on this [MultiplayerPeer] (see
   * [MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _setRefuseNewConnections(pEnable: Boolean): Unit {
  }

  /**
   * Called when the "refuse new connections" status is requested on this [MultiplayerPeer] (see
   * [MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _isRefusingNewConnections(): Boolean {
    throw NotImplementedError("_is_refusing_new_connections is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to check if the server can act as a relay in the current configuration. See
   * [MultiplayerPeer.isServerRelaySupported].
   */
  public open fun _isServerRelaySupported(): Boolean {
    throw NotImplementedError("_is_server_relay_supported is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the connection status is requested on the [MultiplayerPeer] (see
   * [MultiplayerPeer.getConnectionStatus]).
   */
  public open fun _getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    throw NotImplementedError("_get_connection_status is not implemented for MultiplayerPeerExtension")
  }

  public companion object

  internal object MethodBindings
}
