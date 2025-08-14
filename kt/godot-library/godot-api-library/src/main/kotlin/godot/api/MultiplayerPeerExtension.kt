// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Error
import godot.core.PackedByteArray
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * This class is designed to be inherited from a GDExtension plugin to implement custom networking layers for the multiplayer API (such as WebRTC). All the methods below **must** be implemented to have a working custom multiplayer implementation. See also [MultiplayerAPI].
 */
@GodotBaseType
public abstract class MultiplayerPeerExtension : MultiplayerPeer() {
  override fun new(scriptIndex: Int) {
    createNativeObject(369, scriptIndex)
  }

  /**
   * Called when the available packet count is internally requested by the [MultiplayerAPI].
   */
  public abstract fun _getAvailablePacketCount(): Int

  /**
   * Called when the maximum allowed packet size (in bytes) is requested by the [MultiplayerAPI].
   */
  public abstract fun _getMaxPacketSize(): Int

  /**
   * Called when a packet needs to be received by the [MultiplayerAPI], if [_getPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _getPacketScript(): PackedByteArray {
    throw NotImplementedError("MultiplayerPeerExtension::_getPacketScript is not implemented.")
  }

  /**
   * Called when a packet needs to be sent by the [MultiplayerAPI], if [_putPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _putPacketScript(pBuffer: PackedByteArray): Error {
    throw NotImplementedError("MultiplayerPeerExtension::_putPacketScript is not implemented.")
  }

  /**
   * Called to get the channel over which the next available packet was received. See [MultiplayerPeer.getPacketChannel].
   */
  public abstract fun _getPacketChannel(): Int

  /**
   * Called to get the transfer mode the remote peer used to send the next available packet. See [MultiplayerPeer.getPacketMode].
   */
  public abstract fun _getPacketMode(): MultiplayerPeer.TransferMode

  /**
   * Called when the channel to use is set for this [MultiplayerPeer] (see [MultiplayerPeer.transferChannel]).
   */
  public abstract fun _setTransferChannel(pChannel: Int)

  /**
   * Called when the transfer channel to use is read on this [MultiplayerPeer] (see [MultiplayerPeer.transferChannel]).
   */
  public abstract fun _getTransferChannel(): Int

  /**
   * Called when the transfer mode is set on this [MultiplayerPeer] (see [MultiplayerPeer.transferMode]).
   */
  public abstract fun _setTransferMode(pMode: MultiplayerPeer.TransferMode)

  /**
   * Called when the transfer mode to use is read on this [MultiplayerPeer] (see [MultiplayerPeer.transferMode]).
   */
  public abstract fun _getTransferMode(): MultiplayerPeer.TransferMode

  /**
   * Called when the target peer to use is set for this [MultiplayerPeer] (see [MultiplayerPeer.setTargetPeer]).
   */
  public abstract fun _setTargetPeer(pPeer: Int)

  /**
   * Called when the ID of the [MultiplayerPeer] who sent the most recent packet is requested (see [MultiplayerPeer.getPacketPeer]).
   */
  public abstract fun _getPacketPeer(): Int

  /**
   * Called when the "is server" status is requested on the [MultiplayerAPI]. See [MultiplayerAPI.isServer].
   */
  public abstract fun _isServer(): Boolean

  /**
   * Called when the [MultiplayerAPI] is polled. See [MultiplayerAPI.poll].
   */
  public abstract fun _poll()

  /**
   * Called when the multiplayer peer should be immediately closed (see [MultiplayerPeer.close]).
   */
  public abstract fun _close()

  /**
   * Called when the connected [pPeer] should be forcibly disconnected (see [MultiplayerPeer.disconnectPeer]).
   */
  public abstract fun _disconnectPeer(pPeer: Int, pForce: Boolean)

  /**
   * Called when the unique ID of this [MultiplayerPeer] is requested (see [MultiplayerPeer.getUniqueId]). The value must be between `1` and `2147483647`.
   */
  public abstract fun _getUniqueId(): Int

  /**
   * Called when the "refuse new connections" status is set on this [MultiplayerPeer] (see [MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _setRefuseNewConnections(pEnable: Boolean) {
    throw NotImplementedError("MultiplayerPeerExtension::_setRefuseNewConnections is not implemented.")
  }

  /**
   * Called when the "refuse new connections" status is requested on this [MultiplayerPeer] (see [MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _isRefusingNewConnections(): Boolean {
    throw NotImplementedError("MultiplayerPeerExtension::_isRefusingNewConnections is not implemented.")
  }

  /**
   * Called to check if the server can act as a relay in the current configuration. See [MultiplayerPeer.isServerRelaySupported].
   */
  public open fun _isServerRelaySupported(): Boolean {
    throw NotImplementedError("MultiplayerPeerExtension::_isServerRelaySupported is not implemented.")
  }

  /**
   * Called when the connection status is requested on the [MultiplayerPeer] (see [MultiplayerPeer.getConnectionStatus]).
   */
  public abstract fun _getConnectionStatus(): MultiplayerPeer.ConnectionStatus

  public companion object

  public object MethodBindings
}
