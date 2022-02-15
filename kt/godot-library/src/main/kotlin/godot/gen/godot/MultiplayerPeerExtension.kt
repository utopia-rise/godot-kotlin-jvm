// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class MultiplayerPeerExtension : MultiplayerPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERPEEREXTENSION)
  }

  /**
   *
   */
  public open fun _getPacket(rBuffer: `const uint8_t **`, rBufferSize: `int32_t*`): Long {
    throw NotImplementedError("_get_packet is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _putPacket(pBuffer: `const uint8_t*`, pBufferSize: Long): Long {
    throw NotImplementedError("_put_packet is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _getAvailablePacketCount(): Long {
    throw
        NotImplementedError("_get_available_packet_count is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _getMaxPacketSize(): Long {
    throw
        NotImplementedError("_get_max_packet_size is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _setTransferChannel(pChannel: Long): Unit {
  }

  /**
   *
   */
  public open fun _getTransferChannel(): Long {
    throw
        NotImplementedError("_get_transfer_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _setTransferMode(pMode: Long): Unit {
  }

  /**
   *
   */
  public open fun _getTransferMode(): Long {
    throw NotImplementedError("_get_transfer_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _setTargetPeer(pPeer: Long): Unit {
  }

  /**
   *
   */
  public open fun _getPacketPeer(): Long {
    throw NotImplementedError("_get_packet_peer is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _isServer(): Boolean {
    throw NotImplementedError("_is_server is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _poll(): Long {
    throw NotImplementedError("_poll is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _getUniqueId(): Long {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _setRefuseNewConnections(pEnable: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _isRefusingNewConnections(): Boolean {
    throw
        NotImplementedError("_is_refusing_new_connections is not implemented for MultiplayerPeerExtension")
  }

  /**
   *
   */
  public open fun _getConnectionStatus(): Long {
    throw
        NotImplementedError("_get_connection_status is not implemented for MultiplayerPeerExtension")
  }

  public companion object
}
