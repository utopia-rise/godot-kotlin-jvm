// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * UDP packet peer.
 *
 * UDP packet peer. Can be used to send raw UDP packets as well as [Variant]s.
 */
@GodotBaseType
open class PacketPeerUDP : PacketPeer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PACKETPEERUDP, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Closes the UDP socket the [godot.PacketPeerUDP] is currently listening on.
   */
  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CLOSE, NIL)
  }

  /**
   * Calling this method connects this UDP peer to the given `host`/`port` pair. UDP is in reality connectionless, so this option only means that incoming packets from different addresses are automatically discarded, and that outgoing packets are always sent to the connected address (future calls to [setDestAddress] are not allowed). This method does not send any data to the remote peer, to do that, use [godot.PacketPeer.putVar] or [godot.PacketPeer.putPacket] as usual. See also [godot.UDPServer].
   *
   * Note: Connecting to the remote peer does not help to protect from malicious attacks like IP spoofing, etc. Think about using an encryption technique like SSL or DTLS if you feel like your application is transfering sensitive information.
   */
  open fun connectToHost(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the IP of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  open fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_IP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the port of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  open fun getPacketPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_GET_PACKET_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the UDP socket is open and has been connected to a remote address. See [connectToHost].
   */
  open fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether this [godot.PacketPeerUDP] is listening.
   */
  open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Joins the multicast group specified by `multicast_address` using the interface identified by `interface_name`.
   *
   * You can join the same multicast group with multiple interfaces. Use [godot.IP.getLocalInterfaces] to know which are available.
   *
   * Note: Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission for multicast to work.
   */
  open fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_JOIN_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the interface identified by `interface_name` from the multicast group specified by `multicast_address`.
   */
  open fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_LEAVE_MULTICAST_GROUP,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Makes this [godot.PacketPeerUDP] listen on the `port` binding to `bind_address` with a buffer size `recv_buf_size`.
   *
   * If `bind_address` is set to `"*"` (default), the peer will listen on all available addresses (both IPv4 and IPv6).
   *
   * If `bind_address` is set to `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the peer will listen on all available addresses matching that IP type.
   *
   * If `bind_address` is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc), the peer will only listen on the interface with that addresses (or fail if no interface with the given address exists).
   */
  open fun listen(
    port: Long,
    bindAddress: String = "*",
    recvBufSize: Long = 65536
  ): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress, LONG to recvBufSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Enable or disable sending of broadcast packets (e.g. `set_dest_address("255.255.255.255", 4343)`. This option is disabled by default.
   *
   * Note: Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission and this option to be enabled to receive broadcast packets too.
   */
  open fun setBroadcastEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_BROADCAST_ENABLED,
        NIL)
  }

  /**
   * Sets the destination address and port for sending packets and variables. A hostname will be resolved using DNS if needed.
   *
   * Note: [setBroadcastEnabled] must be enabled before sending packets to a broadcast address (e.g. `255.255.255.255`).
   */
  open fun setDestAddress(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_SET_DEST_ADDRESS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Waits for a packet to arrive on the listening port. See [listen].
   */
  open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERUDP_WAIT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
