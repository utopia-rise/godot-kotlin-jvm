// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Helper class to implement a UDP server.
 *
 * A simple server that opens a UDP socket and returns connected [godot.PacketPeerUDP] upon receiving new packets. See also [godot.PacketPeerUDP.connectToHost].
 *
 * After starting the server ([listen]), you will need to [poll] it at regular intervals (e.g. inside [godot.Node.Process]) for it to process new packets, delivering them to the appropriate [godot.PacketPeerUDP], and taking new connections.
 *
 * Below a small example of how it can be used:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # server_node.gd
 *
 * class_name ServerNode
 *
 * extends Node
 *
 *
 *
 * var server := UDPServer.new()
 *
 * var peers = []
 *
 *
 *
 * func _ready():
 *
 *     server.listen(4242)
 *
 *
 *
 * func _process(delta):
 *
 *     server.poll() # Important!
 *
 *     if server.is_connection_available():
 *
 *         var peer: PacketPeerUDP = server.take_connection()
 *
 *         var packet = peer.get_packet()
 *
 *         print("Accepted peer: %s:%s" % [peer.get_packet_ip(), peer.get_packet_port()])
 *
 *         print("Received data: %s" % [packet.get_string_from_utf8()])
 *
 *         # Reply so it knows we received the message.
 *
 *         peer.put_packet(packet)
 *
 *         # Keep a reference so we can keep contacting the remote peer.
 *
 *         peers.append(peer)
 *
 *
 *
 *     for i in range(0, peers.size()):
 *
 *         pass # Do something with the connected peers.
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // ServerNode.cs
 *
 * using Godot;
 *
 * using System.Collections.Generic;
 *
 *
 *
 * public partial class ServerNode : Node
 *
 * {
 *
 *     private UdpServer _server = new UdpServer();
 *
 *     private List<PacketPeerUdp> _peers  = new List<PacketPeerUdp>();
 *
 *
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         _server.Listen(4242);
 *
 *     }
 *
 *
 *
 *     public override void _Process(double delta)
 *
 *     {
 *
 *         _server.Poll(); // Important!
 *
 *         if (_server.IsConnectionAvailable())
 *
 *         {
 *
 *             PacketPeerUdp peer = _server.TakeConnection();
 *
 *             byte[] packet = peer.GetPacket();
 *
 *             GD.Print($"Accepted Peer: {peer.GetPacketIP()}:{peer.GetPacketPort()}");
 *
 *             GD.Print($"Received Data: {packet.GetStringFromUtf8()}");
 *
 *             // Reply so it knows we received the message.
 *
 *             peer.PutPacket(packet);
 *
 *             // Keep a reference so we can keep contacting the remote peer.
 *
 *             _peers.Add(peer);
 *
 *         }
 *
 *         foreach (var peer in _peers)
 *
 *         {
 *
 *             // Do something with the peers.
 *
 *         }
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # client_node.gd
 *
 * class_name ClientNode
 *
 * extends Node
 *
 *
 *
 * var udp := PacketPeerUDP.new()
 *
 * var connected = false
 *
 *
 *
 * func _ready():
 *
 *     udp.connect_to_host("127.0.0.1", 4242)
 *
 *
 *
 * func _process(delta):
 *
 *     if !connected:
 *
 *         # Try to contact server
 *
 *         udp.put_packet("The answer is... 42!".to_utf8_buffer())
 *
 *     if udp.get_available_packet_count() > 0:
 *
 *         print("Connected: %s" % udp.get_packet().get_string_from_utf8())
 *
 *         connected = true
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // ClientNode.cs
 *
 * using Godot;
 *
 *
 *
 * public partial class ClientNode : Node
 *
 * {
 *
 *     private PacketPeerUdp _udp = new PacketPeerUdp();
 *
 *     private bool _connected = false;
 *
 *
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         _udp.ConnectToHost("127.0.0.1", 4242);
 *
 *     }
 *
 *
 *
 *     public override void _Process(double delta)
 *
 *     {
 *
 *         if (!_connected)
 *
 *         {
 *
 *             // Try to contact server
 *
 *             _udp.PutPacket("The Answer Is..42!".ToUtf8Buffer());
 *
 *         }
 *
 *         if (_udp.GetAvailablePacketCount() > 0)
 *
 *         {
 *
 *             GD.Print($"Connected: {_udp.GetPacket().GetStringFromUtf8()}");
 *
 *             _connected = true;
 *
 *         }
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class UDPServer : RefCounted() {
  /**
   * Define the maximum number of pending connections, during [poll], any new pending connection exceeding that value will be automatically dropped. Setting this value to `0` effectively prevents any new pending connection to be accepted (e.g. when all your players have connected).
   */
  public var maxPendingConnections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_UDPSERVER_GET_MAX_PENDING_CONNECTIONS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_UDPSERVER_SET_MAX_PENDING_CONNECTIONS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UDPSERVER, scriptIndex)
    return true
  }

  /**
   * Starts the server by opening a UDP socket listening on the given [port]. You can optionally specify a [bindAddress] to only listen for packets sent to that address. See also [godot.PacketPeerUDP.bind].
   */
  @JvmOverloads
  public fun listen(port: Int, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_LISTEN, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Call this method at regular intervals (e.g. inside [godot.Node.Process]) to process new packets. And packet from known address/port pair will be delivered to the appropriate [godot.PacketPeerUDP], any packet received from an unknown address/port pair will be added as a pending connection (see [isConnectionAvailable], [takeConnection]). The maximum number of pending connection is defined via [maxPendingConnections].
   */
  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_POLL, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a packet with a new address/port combination was received on the socket.
   */
  public fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_IS_CONNECTION_AVAILABLE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the local port this server is listening to.
   */
  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_GET_LOCAL_PORT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the socket is open and listening on a port.
   */
  public fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_IS_LISTENING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the first pending connection (connected to the appropriate address/port). Will return `null` if no new connection is available. See also [isConnectionAvailable], [godot.PacketPeerUDP.connectToHost].
   */
  public fun takeConnection(): PacketPeerUDP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_TAKE_CONNECTION, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PacketPeerUDP?)
  }

  /**
   * Stops the server, closing the UDP socket if open. Will close all connected [godot.PacketPeerUDP] accepted via [takeConnection] (remote peers will not be notified).
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_STOP, NIL)
  }

  public companion object
}
