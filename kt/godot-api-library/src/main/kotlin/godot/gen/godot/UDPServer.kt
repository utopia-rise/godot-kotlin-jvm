// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_UDPSERVER_INDEX: Int = 681

/**
 * A simple server that opens a UDP socket and returns connected [PacketPeerUDP] upon receiving new
 * packets. See also [PacketPeerUDP.connectToHost].
 * After starting the server ([listen]), you will need to [poll] it at regular intervals (e.g.
 * inside [Node.Process]) for it to process new packets, delivering them to the appropriate
 * [PacketPeerUDP], and taking new connections.
 * Below a small example of how it can be used:
 *
 * gdscript:
 * ```gdscript
 * # server_node.gd
 * class_name ServerNode
 * extends Node
 *
 * var server := UDPServer.new()
 * var peers = []
 *
 * func _ready():
 *     server.listen(4242)
 *
 * func _process(delta):
 *     server.poll() # Important!
 *     if server.is_connection_available():
 *         var peer: PacketPeerUDP = server.take_connection()
 *         var packet = peer.get_packet()
 *         print("Accepted peer: &#37;s:&#37;s" &#37; [peer.get_packet_ip(),
 * peer.get_packet_port()])
 *         print("Received data: &#37;s" &#37; [packet.get_string_from_utf8()])
 *         # Reply so it knows we received the message.
 *         peer.put_packet(packet)
 *         # Keep a reference so we can keep contacting the remote peer.
 *         peers.append(peer)
 *
 *     for i in range(0, peers.size()):
 *         pass # Do something with the connected peers.
 * ```
 * csharp:
 * ```csharp
 * // ServerNode.cs
 * using Godot;
 * using System.Collections.Generic;
 *
 * public partial class ServerNode : Node
 * {
 *     private UdpServer _server = new UdpServer();
 *     private List<PacketPeerUdp> _peers  = new List<PacketPeerUdp>();
 *
 *     public override void _Ready()
 *     {
 *         _server.Listen(4242);
 *     }
 *
 *     public override void _Process(double delta)
 *     {
 *         _server.Poll(); // Important!
 *         if (_server.IsConnectionAvailable())
 *         {
 *             PacketPeerUdp peer = _server.TakeConnection();
 *             byte[] packet = peer.GetPacket();
 *             GD.Print($"Accepted Peer: {peer.GetPacketIP()}:{peer.GetPacketPort()}");
 *             GD.Print($"Received Data: {packet.GetStringFromUtf8()}");
 *             // Reply so it knows we received the message.
 *             peer.PutPacket(packet);
 *             // Keep a reference so we can keep contacting the remote peer.
 *             _peers.Add(peer);
 *         }
 *         foreach (var peer in _peers)
 *         {
 *             // Do something with the peers.
 *         }
 *     }
 * }
 * ```
 *
 *
 * gdscript:
 * ```gdscript
 * # client_node.gd
 * class_name ClientNode
 * extends Node
 *
 * var udp := PacketPeerUDP.new()
 * var connected = false
 *
 * func _ready():
 *     udp.connect_to_host("127.0.0.1", 4242)
 *
 * func _process(delta):
 *     if !connected:
 *         # Try to contact server
 *         udp.put_packet("The answer is... 42!".to_utf8_buffer())
 *     if udp.get_available_packet_count() > 0:
 *         print("Connected: &#37;s" &#37; udp.get_packet().get_string_from_utf8())
 *         connected = true
 * ```
 * csharp:
 * ```csharp
 * // ClientNode.cs
 * using Godot;
 *
 * public partial class ClientNode : Node
 * {
 *     private PacketPeerUdp _udp = new PacketPeerUdp();
 *     private bool _connected = false;
 *
 *     public override void _Ready()
 *     {
 *         _udp.ConnectToHost("127.0.0.1", 4242);
 *     }
 *
 *     public override void _Process(double delta)
 *     {
 *         if (!_connected)
 *         {
 *             // Try to contact server
 *             _udp.PutPacket("The Answer Is..42!".ToUtf8Buffer());
 *         }
 *         if (_udp.GetAvailablePacketCount() > 0)
 *         {
 *             GD.Print($"Connected: {_udp.GetPacket().GetStringFromUtf8()}");
 *             _connected = true;
 *         }
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class UDPServer : RefCounted() {
  /**
   * Define the maximum number of pending connections, during [poll], any new pending connection
   * exceeding that value will be automatically dropped. Setting this value to `0` effectively prevents
   * any new pending connection to be accepted (e.g. when all your players have connected).
   */
  public final inline var maxPendingConnections: Int
    @JvmName("maxPendingConnectionsProperty")
    get() = getMaxPendingConnections()
    @JvmName("maxPendingConnectionsProperty")
    set(`value`) {
      setMaxPendingConnections(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_UDPSERVER_INDEX, scriptIndex)
  }

  /**
   * Starts the server by opening a UDP socket listening on the given [port]. You can optionally
   * specify a [bindAddress] to only listen for packets sent to that address. See also
   * [PacketPeerUDP.bind].
   */
  @JvmOverloads
  public final fun listen(port: Int, bindAddress: String = "*"): Error {
    Internals.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    Internals.callMethod(rawPtr, MethodBindings.listenPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Call this method at regular intervals (e.g. inside [Node.Process]) to process new packets. And
   * packet from known address/port pair will be delivered to the appropriate [PacketPeerUDP], any
   * packet received from an unknown address/port pair will be added as a pending connection (see
   * [isConnectionAvailable], [takeConnection]). The maximum number of pending connection is defined
   * via [maxPendingConnections].
   */
  public final fun poll(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a packet with a new address/port combination was received on the socket.
   */
  public final fun isConnectionAvailable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the local port this server is listening to.
   */
  public final fun getLocalPort(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the socket is open and listening on a port.
   */
  public final fun isListening(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isListeningPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the first pending connection (connected to the appropriate address/port). Will return
   * `null` if no new connection is available. See also [isConnectionAvailable],
   * [PacketPeerUDP.connectToHost].
   */
  public final fun takeConnection(): PacketPeerUDP? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.takeConnectionPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PacketPeerUDP?)
  }

  /**
   * Stops the server, closing the UDP socket if open. Will close all connected [PacketPeerUDP]
   * accepted via [takeConnection] (remote peers will not be notified).
   */
  public final fun stop(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public final fun setMaxPendingConnections(maxPendingConnections: Int): Unit {
    Internals.writeArguments(LONG to maxPendingConnections.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxPendingConnectionsPtr, NIL)
  }

  public final fun getMaxPendingConnections(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxPendingConnectionsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val listenPtr: VoidPtr = Internals.getMethodBindPtr("UDPServer", "listen", 3167955072)

    public val pollPtr: VoidPtr = Internals.getMethodBindPtr("UDPServer", "poll", 166280745)

    public val isConnectionAvailablePtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "is_connection_available", 36873697)

    public val getLocalPortPtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "get_local_port", 3905245786)

    public val isListeningPtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "is_listening", 36873697)

    public val takeConnectionPtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "take_connection", 808734560)

    public val stopPtr: VoidPtr = Internals.getMethodBindPtr("UDPServer", "stop", 3218959716)

    public val setMaxPendingConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "set_max_pending_connections", 1286410249)

    public val getMaxPendingConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("UDPServer", "get_max_pending_connections", 3905245786)
  }
}
