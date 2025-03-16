// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * UDP packet peer. Can be used to send and receive raw UDP packets as well as [Variant]s.
 * **Example:** Send a packet:
 * [codeblock]
 * var peer = PacketPeerUDP.new()
 *
 * # Optionally, you can select the local port used to send the packet.
 * peer.bind(4444)
 *
 * peer.set_dest_address("1.1.1.1", 4433)
 * peer.put_packet("hello".to_utf8_buffer())
 * [/codeblock]
 * **Example:** Listen for packets:
 * [codeblock]
 * var peer
 *
 * func _ready():
 *     peer = PacketPeerUDP.new()
 *     peer.bind(4433)
 *
 *
 * func _process(_delta):
 *     if peer.get_available_packet_count() > 0:
 *         var array_bytes = peer.get_packet()
 *         var packet_string = array_bytes.get_string_from_ascii()
 *         print("Received message: ", packet_string)
 * [/codeblock]
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeerUDP : PacketPeer() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(445, scriptIndex)
  }

  /**
   * Binds this [PacketPeerUDP] to the specified [port] and [bindAddress] with a buffer size
   * [recvBufSize], allowing it to receive incoming packets.
   * If [bindAddress] is set to `"*"` (default), the peer will be bound on all available addresses
   * (both IPv4 and IPv6).
   * If [bindAddress] is set to `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the peer will be bound
   * to all available addresses matching that IP type.
   * If [bindAddress] is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc.), the peer
   * will only be bound to the interface with that address (or fail if no interface with the given
   * address exists).
   */
  @JvmOverloads
  public final fun bind(
    port: Int,
    bindAddress: String = "*",
    recvBufSize: Int = 65536,
  ): Error {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress, LONG to recvBufSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.bindPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the [PacketPeerUDP]'s underlying UDP socket.
   */
  public final fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.closePtr, NIL)
  }

  /**
   * Waits for a packet to arrive on the bound address. See [bind].
   * **Note:** [wait] can't be interrupted once it has been called. This can be worked around by
   * allowing the other party to send a specific "death pill" packet like this:
   *
   * gdscript:
   * ```gdscript
   * socket = PacketPeerUDP.new()
   * # Server
   * socket.set_dest_address("127.0.0.1", 789)
   * socket.put_packet("Time to stop".to_ascii_buffer())
   *
   * # Client
   * while socket.wait() == OK:
   *     var data = socket.get_packet().get_string_from_ascii()
   *     if data == "Time to stop":
   *         return
   * ```
   * csharp:
   * ```csharp
   * var socket = new PacketPeerUdp();
   * // Server
   * socket.SetDestAddress("127.0.0.1", 789);
   * socket.PutPacket("Time to stop".ToAsciiBuffer());
   *
   * // Client
   * while (socket.Wait() == OK)
   * {
   *     string data = socket.GetPacket().GetStringFromASCII();
   *     if (data == "Time to stop")
   *     {
   *         return;
   *     }
   * }
   * ```
   */
  public final fun wait(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.waitPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether this [PacketPeerUDP] is bound to an address and can receive packets.
   */
  public final fun isBound(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBoundPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Calling this method connects this UDP peer to the given [host]/[port] pair. UDP is in reality
   * connectionless, so this option only means that incoming packets from different addresses are
   * automatically discarded, and that outgoing packets are always sent to the connected address
   * (future calls to [setDestAddress] are not allowed). This method does not send any data to the
   * remote peer, to do that, use [PacketPeer.putVar] or [PacketPeer.putPacket] as usual. See also
   * [UDPServer].
   * **Note:** Connecting to the remote peer does not help to protect from malicious attacks like IP
   * spoofing, etc. Think about using an encryption technique like TLS or DTLS if you feel like your
   * application is transferring sensitive information.
   */
  public final fun connectToHost(host: String, port: Int): Error {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.connectToHostPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the UDP socket is open and has been connected to a remote address. See
   * [connectToHost].
   */
  public final fun isSocketConnected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSocketConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the IP of the remote peer that sent the last packet(that was received with
   * [PacketPeer.getPacket] or [PacketPeer.getVar]).
   */
  public final fun getPacketIp(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPacketIpPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the port of the remote peer that sent the last packet(that was received with
   * [PacketPeer.getPacket] or [PacketPeer.getVar]).
   */
  public final fun getPacketPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPacketPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public final fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the destination address and port for sending packets and variables. A hostname will be
   * resolved using DNS if needed.
   * **Note:** [setBroadcastEnabled] must be enabled before sending packets to a broadcast address
   * (e.g. `255.255.255.255`).
   */
  public final fun setDestAddress(host: String, port: Int): Error {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDestAddressPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Enable or disable sending of broadcast packets (e.g. `set_dest_address("255.255.255.255",
   * 4343)`. This option is disabled by default.
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission and
   * this option to be enabled to receive broadcast packets too.
   */
  public final fun setBroadcastEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setBroadcastEnabledPtr, NIL)
  }

  /**
   * Joins the multicast group specified by [multicastAddress] using the interface identified by
   * [interfaceName].
   * You can join the same multicast group with multiple interfaces. Use [IP.getLocalInterfaces] to
   * know which are available.
   * **Note:** Some Android devices might require the `CHANGE_WIFI_MULTICAST_STATE` permission for
   * multicast to work.
   */
  public final fun joinMulticastGroup(multicastAddress: String, interfaceName: String): Error {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(ptr, MethodBindings.joinMulticastGroupPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the interface identified by [interfaceName] from the multicast group specified by
   * [multicastAddress].
   */
  public final fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): Error {
    TransferContext.writeArguments(STRING to multicastAddress, STRING to interfaceName)
    TransferContext.callMethod(ptr, MethodBindings.leaveMulticastGroupPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val bindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "bind", 4051239242)

    internal val closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "close", 3218959716)

    internal val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerUDP", "wait", 166280745)

    internal val isBoundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "is_bound", 36873697)

    internal val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "connect_to_host", 993915709)

    internal val isSocketConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "is_socket_connected", 36873697)

    internal val getPacketIpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_ip", 201670096)

    internal val getPacketPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_packet_port", 3905245786)

    internal val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "get_local_port", 3905245786)

    internal val setDestAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_dest_address", 993915709)

    internal val setBroadcastEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "set_broadcast_enabled", 2586408642)

    internal val joinMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "join_multicast_group", 852856452)

    internal val leaveMulticastGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerUDP", "leave_multicast_group", 852856452)
  }
}
