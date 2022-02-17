// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.MultiplayerPeer
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
 * Manages the connection to multiplayer peers. Assigns unique IDs to each client connected to the server. See also [godot.MultiplayerAPI].
 *
 * **Note:** The high-level multiplayer API protocol is an implementation detail and isn't meant to be used by non-Godot servers. It may change without notice.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open abstract class MultiplayerPeer : PacketPeer() {
  /**
   * Emitted when a connection attempt fails.
   */
  public val connectionFailed: Signal0 by signal()

  /**
   * Emitted when a connection attempt succeeds.
   */
  public val connectionSucceeded: Signal0 by signal()

  /**
   * Emitted by the server when a client disconnects.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted by the server when a client connects.
   */
  public val peerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted by clients when the server disconnects.
   */
  public val serverDisconnected: Signal0 by signal()

  /**
   * If `true`, this [godot.MultiplayerPeer] refuses new connections.
   */
  public open var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_REFUSE_NEW_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_REFUSE_NEW_CONNECTIONS, NIL)
    }

  /**
   * The manner in which to send packets to the `target_peer`. See [enum TransferMode].
   */
  public open var transferMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_TRANSFER_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TRANSFER_MODE,
          NIL)
    }

  /**
   * The channel to use to send packets. Many network APIs such as ENet and WebRTC allow the creation of multiple independent channels which behaves, in a way, like separate connections. This means that reliable data will only block delivery of other packets on that channel, and ordering will only be in respect to the channel the packet is being sent on. Using different channels to send **different and independent** state updates is a common way to optimize network usage and decrease latency in fast-paced games.
   *
   * **Note:** The default channel (`0`) actually works as 3 separate channels (one for each [enum TransferMode]) so that [TRANSFER_MODE_RELIABLE] and [TRANSFER_MODE_UNRELIABLE_ORDERED] does not interact with each other by default. Refer to the specific network API documentation (e.g. ENet or WebRTC) to learn how to set up channels correctly.
   */
  public open var transferChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_TRANSFER_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TRANSFER_CHANNEL, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERPEER)
  }

  /**
   * Sets the peer to which packets will be sent.
   *
   * The `id` can be one of: [TARGET_PEER_BROADCAST] to send to all connected peers, [TARGET_PEER_SERVER] to send to the peer acting as server, a valid peer ID to send to that specific peer, a negative peer ID to send to all peers except that one. By default, the target peer is [TARGET_PEER_BROADCAST].
   */
  public open fun setTargetPeer(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_SET_TARGET_PEER,
        NIL)
  }

  /**
   * Returns the ID of the [godot.MultiplayerPeer] who sent the most recent packet.
   */
  public open fun getPacketPeer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_PACKET_PEER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Waits up to 1 second to receive a new network event.
   */
  public open fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_POLL, NIL)
  }

  /**
   * Returns the current state of the connection. See [enum ConnectionStatus].
   */
  public open fun getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_CONNECTION_STATUS, LONG)
    return MultiplayerPeer.ConnectionStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the ID of this [godot.MultiplayerPeer].
   */
  public open fun getUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GET_UNIQUE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a randomly generated integer that can be used as a network unique ID.
   */
  public open fun generateUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERPEER_GENERATE_UNIQUE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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

  public companion object {
    /**
     * Packets are sent to the server and then redistributed to other peers.
     */
    public final const val TARGET_PEER_BROADCAST: Long = 0

    /**
     * Packets are sent to the server alone.
     */
    public final const val TARGET_PEER_SERVER: Long = 1
  }
}
