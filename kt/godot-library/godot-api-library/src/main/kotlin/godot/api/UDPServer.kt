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
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A simple server that opens a UDP socket and returns connected [PacketPeerUDP] upon receiving new
 * packets. See also [PacketPeerUDP.connectToHost].
 *
 * After starting the server ([listen]), you will need to [poll] it at regular intervals (e.g.
 * inside [Node.Process]) for it to process new packets, delivering them to the appropriate
 * [PacketPeerUDP], and taking new connections.
 *
 * Below a small example of how it can be used:
 *
 * ```gdscript
 * //gdscript
 * # server_node.gd
 * class_name ServerNode
 * extends Node
 *
 * var server = UDPServer.new()
 * var peers = []
 *
 * func _ready():
 *     server.listen(4242)
 *
 * func _process(delta):
 *     server.poll() # Important!
 *     if server.is_connection_available():
 *         var peer = server.take_connection()
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
 *
 * ```csharp
 * //csharp
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
 * ```gdscript
 * //gdscript
 * # client_node.gd
 * class_name ClientNode
 * extends Node
 *
 * var udp = PacketPeerUDP.new()
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
 *
 * ```csharp
 * //csharp
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
    createNativeObject(705, scriptIndex)
  }

  /**
   * Starts the server by opening a UDP socket listening on the given [port]. You can optionally
   * specify a [bindAddress] to only listen for packets sent to that address. See also
   * [PacketPeerUDP.bind].
   */
  @JvmOverloads
  public final fun listen(port: Int, bindAddress: String = "*"): Error {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(ptr, MethodBindings.listenPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Call this method at regular intervals (e.g. inside [Node.Process]) to process new packets. And
   * packet from known address/port pair will be delivered to the appropriate [PacketPeerUDP], any
   * packet received from an unknown address/port pair will be added as a pending connection (see
   * [isConnectionAvailable], [takeConnection]). The maximum number of pending connection is defined
   * via [maxPendingConnections].
   */
  public final fun poll(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pollPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a packet with a new address/port combination was received on the socket.
   */
  public final fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the local port this server is listening to.
   */
  public final fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the socket is open and listening on a port.
   */
  public final fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isListeningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the first pending connection (connected to the appropriate address/port). Will return
   * `null` if no new connection is available. See also [isConnectionAvailable],
   * [PacketPeerUDP.connectToHost].
   */
  public final fun takeConnection(): PacketPeerUDP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PacketPeerUDP?)
  }

  /**
   * Stops the server, closing the UDP socket if open. Will close all connected [PacketPeerUDP]
   * accepted via [takeConnection] (remote peers will not be notified).
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  public final fun setMaxPendingConnections(maxPendingConnections: Int): Unit {
    TransferContext.writeArguments(LONG to maxPendingConnections.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxPendingConnectionsPtr, NIL)
  }

  public final fun getMaxPendingConnections(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPendingConnectionsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val listenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "listen", 3167955072)

    internal val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "poll", 166280745)

    internal val isConnectionAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "is_connection_available", 36873697)

    internal val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "get_local_port", 3905245786)

    internal val isListeningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "is_listening", 36873697)

    internal val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "take_connection", 808734560)

    internal val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("UDPServer", "stop", 3218959716)

    internal val setMaxPendingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "set_max_pending_connections", 1286410249)

    internal val getMaxPendingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDPServer", "get_max_pending_connections", 3905245786)
  }
}
