// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MultiplayerPeer
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Class that can be inherited to implement custom multiplayer API networking layers via GDExtension.
 *
 * This class is designed to be inherited from a GDExtension plugin to implement custom networking layers for the multiplayer API (such as WebRTC). All the methods below **must** be implemented to have a working custom multiplayer implementation. See also [godot.MultiplayerAPI].
 */
@GodotBaseType
public open class MultiplayerPeerExtension : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEEREXTENSION, scriptIndex)
    return true
  }

  /**
   * Called when the available packet count is internally requested by the [godot.MultiplayerAPI].
   */
  public open fun _getAvailablePacketCount(): Long {
    throw NotImplementedError("_get_available_packet_count is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the maximum allowed packet size (in bytes) is requested by the [godot.MultiplayerAPI].
   */
  public open fun _getMaxPacketSize(): Long {
    throw NotImplementedError("_get_max_packet_size is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be received by the [godot.MultiplayerAPI], if [_getPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _getPacketScript(): PackedByteArray {
    throw NotImplementedError("_get_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be sent by the [godot.MultiplayerAPI], if [_putPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _putPacketScript(pBuffer: PackedByteArray): GodotError {
    throw NotImplementedError("_put_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the channel to use is set for this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferChannel]).
   */
  public open fun _setTransferChannel(pChannel: Long): Unit {
  }

  /**
   * Called when the transfer channel to use is read on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferChannel]).
   */
  public open fun _getTransferChannel(): Long {
    throw NotImplementedError("_get_transfer_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the transfer mode is set on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferMode]).
   */
  public open fun _setTransferMode(pMode: MultiplayerPeer.TransferMode): Unit {
  }

  /**
   * Called when the transfer mode to use is read on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferMode]).
   */
  public open fun _getTransferMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_transfer_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the target peer to use is set for this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.setTargetPeer]).
   */
  public open fun _setTargetPeer(pPeer: Long): Unit {
  }

  /**
   * Called when the ID of the [godot.MultiplayerPeer] who sent the most recent packet is requested (see [godot.MultiplayerPeer.getPacketPeer]).
   */
  public open fun _getPacketPeer(): Long {
    throw NotImplementedError("_get_packet_peer is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "is server" status is requested on the [godot.MultiplayerAPI]. See [godot.MultiplayerAPI.isServer].
   */
  public open fun _isServer(): Boolean {
    throw NotImplementedError("_is_server is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the [godot.MultiplayerAPI] is polled. See [godot.MultiplayerAPI.poll].
   */
  public open fun _poll(): Unit {
  }

  /**
   * Called when the multiplayer peer should be immediately closed (see [godot.MultiplayerPeer.close]).
   */
  public open fun _close(): Unit {
  }

  /**
   * Called when the connected [pPeer] should be forcibly disconnected (see [godot.MultiplayerPeer.disconnectPeer]).
   */
  public open fun _disconnectPeer(pPeer: Long, pForce: Boolean): Unit {
  }

  /**
   * Called when the unique ID of this [godot.MultiplayerPeer] is requested (see [godot.MultiplayerPeer.getUniqueId]).
   */
  public open fun _getUniqueId(): Long {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "refuse new connections" status is set on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _setRefuseNewConnections(pEnable: Boolean): Unit {
  }

  /**
   * Called when the "refuse new connections" status is requested on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _isRefusingNewConnections(): Boolean {
    throw NotImplementedError("_is_refusing_new_connections is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the connection status is requested on the [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.getConnectionStatus]).
   */
  public open fun _getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    throw NotImplementedError("_get_connection_status is not implemented for MultiplayerPeerExtension")
  }

  public companion object
}
