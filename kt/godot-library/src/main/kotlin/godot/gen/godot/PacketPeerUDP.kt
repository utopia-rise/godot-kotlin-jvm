// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * UDP packet peer.
 *
 * UDP packet peer. Can be used to send raw UDP packets as well as [Variant]s.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeerUDP : PacketPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKETPEERUDP)
  }

  /**
   * Binds this [godot.PacketPeerUDP] to the specified `port` and `address` with a buffer size `recv_buf_size`, allowing it to receive incoming packets.
   *
   * If `address` is set to `"*"` (default), the peer will be bound on all available addresses (both IPv4 and IPv6).
   *
   * If `address` is set to `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the peer will be bound to all available addresses matching that IP type.
   *
   * If `address` is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc), the peer will only be bound to the interface with that addresses (or fail if no interface with the given address exists).
   */
  public open fun bind(
    port: Long,
    bindAddress: String = "*",
    recvBufSize: Long = 65536
  ): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress, LONG to recvBufSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_BIND, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Closes the [godot.PacketPeerUDP]'s underlying UDP socket.
   */
  public open fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CLOSE, NIL)
  }

  /**
   * Waits for a packet to arrive on the bound address. See [bind].
   *
   * **Note:** [wait] can't be interrupted once it has been called. This can be worked around by allowing the other party to send a specific "death pill" packet like this:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * socket = PacketPeerUDP.new()
   *
   * # Server
   *
   * socket.set_dest_address("127.0.0.1", 789)
   *
   * socket.put_packet("Time to stop".to_ascii())
   *
   *
   *
   * # Client
   *
   * while socket.wait() == OK:
   *
   *     var data = socket.get_packet().get_string_from_ascii()
   *
   *     if data == "Time to stop":
   *
   *         return
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var socket = new PacketPeerUDP();
   *
   * // Server
   *
   * socket.SetDestAddress("127.0.0.1", 789);
   *
   * socket.PutPacket("Time to stop".ToAscii());
   *
   *
   *
   * // Client
   *
   * while (socket.Wait() == OK)
   *
   * {
   *
   *     string data = socket.GetPacket().GetStringFromASCII();
   *
   *     if (data == "Time to stop")
   *
   *     {
   *
   *         return;
   *
   *     }
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_WAIT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns whether this [godot.PacketPeerUDP] is bound to an address and can receive packets.
   */
  public open fun isBound(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_BOUND, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Calling this method connects this UDP peer to the given `host`/`port` pair. UDP is in reality connectionless, so this option only means that incoming packets from different addresses are automatically discarded, and that outgoing packets are always sent to the connected address (future calls to [setDestAddress] are not allowed). This method does not send any data to the remote peer, to do that, use [godot.PacketPeer.putVar] or [godot.PacketPeer.putPacket] as usual. See also [godot.UDPServer].
   *
   * **Note:** Connecting to the remote peer does not help to protect from malicious attacks like IP spoofing, etc. Think about using an encryption technique like SSL or DTLS if you feel like your application is transferring sensitive information.
   */
  public open fun connectToHost(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the UDP socket is open and has been connected to a remote address. See [connectToHost].
   */
  public open fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the IP of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  public open fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_IP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the port of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  public open fun getPacketPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public open fun getLocalPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_LOCAL_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the destination address and port for sending packets and variables. A hostname will be resolved using DNS if needed.
   *
   * **Note:** [setBroadcastEnabled] must be enabled before sending packets to a broadcast address (e.g. `255.255.255.255`).
   */
  public open fun setDestAddress(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_DEST_ADDRESS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Enable or disable sending of broadcast packets (e.g. `set_dest_address("255.255.255.255", 4343)`. This option is disabled by default.
   *
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission and this option to be enabled to receive broadcast packets too.
   */
  public open fun setBroadcastEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_BROADCAST_ENABLED,
        NIL)
  }

  /**
   * Joins the multicast group specified by `multicast_address` using the interface identified by `interface_name`.
   *
   * You can join the same multicast group with multiple interfaces. Use [godot.IP.getLocalInterfaces] to know which are available.
   *
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission for multicast to work.
   */
  public open fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_JOIN_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the interface identified by `interface_name` from the multicast group specified by `multicast_address`.
   */
  public open fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_LEAVE_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
