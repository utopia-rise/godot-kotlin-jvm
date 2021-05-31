// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.NetworkedMultiplayerPeer
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A high-level network interface to simplify multiplayer interactions.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/537](https://godotengine.org/asset-library/asset/537)
 *
 * Manages the connection to network peers. Assigns unique IDs to each client connected to the server. See also [godot.MultiplayerAPI].
 *
 * **Note:** The high-level multiplayer API protocol is an implementation detail and isn't meant to be used by non-Godot servers. It may change without notice.
 */
@GodotBaseType
public open class NetworkedMultiplayerPeer : PacketPeer() {
  /**
   * Emitted when a connection attempt fails.
   */
  public val connectionFailed: Signal0 by signal()

  /**
   * Emitted when a connection attempt succeeds.
   */
  public val connectionSucceeded: Signal0 by signal()

  /**
   * Emitted by the server when a client connects.
   */
  public val peerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted by the server when a client disconnects.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted by clients when the server disconnects.
   */
  public val serverDisconnected: Signal0 by signal()

  /**
   * If `true`, this [godot.NetworkedMultiplayerPeer] refuses new connections.
   */
  public open var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_REFUSE_NEW_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  /**
   * The manner in which to send packets to the `target_peer`. See [enum TransferMode].
   */
  public open var transferMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_TRANSFER_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_TRANSFER_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NETWORKEDMULTIPLAYERPEER)
  }

  /**
   * Returns the current state of the connection. See [enum ConnectionStatus].
   */
  public open fun getConnectionStatus(): NetworkedMultiplayerPeer.ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_CONNECTION_STATUS, LONG)
    return NetworkedMultiplayerPeer.ConnectionStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the ID of the [godot.NetworkedMultiplayerPeer] who sent the most recent packet.
   */
  public open fun getPacketPeer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_PACKET_PEER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ID of this [godot.NetworkedMultiplayerPeer].
   */
  public open fun getUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_GET_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Waits up to 1 second to receive a new network event.
   */
  public open fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_POLL, NIL)
  }

  /**
   * Sets the peer to which packets will be sent.
   *
   * The `id` can be one of: [TARGET_PEER_BROADCAST] to send to all connected peers, [TARGET_PEER_SERVER] to send to the peer acting as server, a valid peer ID to send to that specific peer, a negative peer ID to send to all peers except that one. By default, the target peer is [TARGET_PEER_BROADCAST].
   */
  public open fun setTargetPeer(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERPEER_SET_TARGET_PEER, NIL)
  }

  public enum class ConnectionStatus(
    id: Long
  ) {
    /**
     * The ongoing connection disconnected.
     */
    CONNECTION_DISCONNECTED(0),
    /**
     * A connection attempt is ongoing.
     */
    CONNECTION_CONNECTING(1),
    /**
     * The connection attempt succeeded.
     */
    CONNECTION_CONNECTED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TransferMode(
    id: Long
  ) {
    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets may arrive in any order. Potentially faster than [TRANSFER_MODE_UNRELIABLE_ORDERED]. Use for non-critical data, and always consider whether the order matters.
     */
    TRANSFER_MODE_UNRELIABLE(0),
    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets are received in the order they were sent in. Potentially faster than [TRANSFER_MODE_RELIABLE]. Use for non-critical data or data that would be outdated if received late due to resend attempt(s) anyway, for example movement and positional data.
     */
    TRANSFER_MODE_UNRELIABLE_ORDERED(1),
    /**
     * Packets must be received and resend attempts should be made until the packets are acknowledged. Packets must be received in the order they were sent in. Most reliable transfer mode, but potentially the slowest due to the overhead. Use for critical data that must be transmitted and arrive in order, for example an ability being triggered or a chat message. Consider carefully if the information really is critical, and use sparingly.
     */
    TRANSFER_MODE_RELIABLE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The connection attempt succeeded.
     */
    public final const val CONNECTION_CONNECTED: Long = 2

    /**
     * A connection attempt is ongoing.
     */
    public final const val CONNECTION_CONNECTING: Long = 1

    /**
     * The ongoing connection disconnected.
     */
    public final const val CONNECTION_DISCONNECTED: Long = 0

    /**
     * Packets are sent to the server and then redistributed to other peers.
     */
    public final const val TARGET_PEER_BROADCAST: Long = 0

    /**
     * Packets are sent to the server alone.
     */
    public final const val TARGET_PEER_SERVER: Long = 1

    /**
     * Packets must be received and resend attempts should be made until the packets are acknowledged. Packets must be received in the order they were sent in. Most reliable transfer mode, but potentially the slowest due to the overhead. Use for critical data that must be transmitted and arrive in order, for example an ability being triggered or a chat message. Consider carefully if the information really is critical, and use sparingly.
     */
    public final const val TRANSFER_MODE_RELIABLE: Long = 2

    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets may arrive in any order. Potentially faster than [TRANSFER_MODE_UNRELIABLE_ORDERED]. Use for non-critical data, and always consider whether the order matters.
     */
    public final const val TRANSFER_MODE_UNRELIABLE: Long = 0

    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets are received in the order they were sent in. Potentially faster than [TRANSFER_MODE_RELIABLE]. Use for non-critical data or data that would be outdated if received late due to resend attempt(s) anyway, for example movement and positional data.
     */
    public final const val TRANSFER_MODE_UNRELIABLE_ORDERED: Long = 1
  }
}
