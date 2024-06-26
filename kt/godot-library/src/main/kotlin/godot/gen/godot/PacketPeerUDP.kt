// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * UDP packet peer.
 *
 * UDP packet peer. Can be used to send raw UDP packets as well as [Variant]s.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeerUDP : PacketPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKETPEERUDP, scriptIndex)
    return true
  }

  /**
   * Binds this [godot.PacketPeerUDP] to the specified [port] and [bindAddress] with a buffer size [recvBufSize], allowing it to receive incoming packets.
   *
   * If [bindAddress] is set to `"*"` (default), the peer will be bound on all available addresses (both IPv4 and IPv6).
   *
   * If [bindAddress] is set to `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the peer will be bound to all available addresses matching that IP type.
   *
   * If [bindAddress] is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc), the peer will only be bound to the interface with that addresses (or fail if no interface with the given address exists).
   */
  @JvmOverloads
  public fun bind(
    port: Int,
    bindAddress: String = "*",
    recvBufSize: Int = 65536,
  ): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress, LONG to recvBufSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bindPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the [godot.PacketPeerUDP]'s underlying UDP socket.
   */
  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
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
   * socket.put_packet("Time to stop".to_ascii_buffer())
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
   * var socket = new PacketPeerUdp();
   *
   * // Server
   *
   * socket.SetDestAddress("127.0.0.1", 789);
   *
   * socket.PutPacket("Time to stop".ToAsciiBuffer());
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
  public fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether this [godot.PacketPeerUDP] is bound to an address and can receive packets.
   */
  public fun isBound(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBoundPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Calling this method connects this UDP peer to the given [host]/[port] pair. UDP is in reality connectionless, so this option only means that incoming packets from different addresses are automatically discarded, and that outgoing packets are always sent to the connected address (future calls to [setDestAddress] are not allowed). This method does not send any data to the remote peer, to do that, use [godot.PacketPeer.putVar] or [godot.PacketPeer.putPacket] as usual. See also [godot.UDPServer].
   *
   * **Note:** Connecting to the remote peer does not help to protect from malicious attacks like IP spoofing, etc. Think about using an encryption technique like TLS or DTLS if you feel like your application is transferring sensitive information.
   */
  public fun connectToHost(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the UDP socket is open and has been connected to a remote address. See [connectToHost].
   */
  public fun isSocketConnected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSocketConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the IP of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  public fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketIpPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the port of the remote peer that sent the last packet(that was received with [godot.PacketPeer.getPacket] or [godot.PacketPeer.getVar]).
   */
  public fun getPacketPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the destination address and port for sending packets and variables. A hostname will be resolved using DNS if needed.
   *
   * **Note:** [setBroadcastEnabled] must be enabled before sending packets to a broadcast address (e.g. `255.255.255.255`).
   */
  public fun setDestAddress(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDestAddressPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Enable or disable sending of broadcast packets (e.g. `set_dest_address("255.255.255.255", 4343)`. This option is disabled by default.
   *
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission and this option to be enabled to receive broadcast packets too.
   */
  public fun setBroadcastEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBroadcastEnabledPtr, NIL)
  }

  /**
   * Joins the multicast group specified by [multicastAddress] using the interface identified by [interfaceName].
   *
   * You can join the same multicast group with multiple interfaces. Use [godot.IP.getLocalInterfaces] to know which are available.
   *
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission for multicast to work.
   */
  public fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, MethodBindings.joinMulticastGroupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the interface identified by [interfaceName] from the multicast group specified by [multicastAddress].
   */
  public fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GodotError {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(rawPtr, MethodBindings.leaveMulticastGroupPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val bindPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "bind")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "close")

    public val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "wait")

    public val isBoundPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "is_bound")

    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "connect_to_host")

    public val isSocketConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "is_socket_connected")

    public val getPacketIpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_ip")

    public val getPacketPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_port")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_local_port")

    public val setDestAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_dest_address")

    public val setBroadcastEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_broadcast_enabled")

    public val joinMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "join_multicast_group")

    public val leaveMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "leave_multicast_group")
  }
}
