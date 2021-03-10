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
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Helper class to implement a UDP server.
 *
 * A simple server that opens a UDP socket and returns connected [godot.PacketPeerUDP] upon receiving new packets. See also [godot.PacketPeerUDP.connectToHost].
 *
 * After starting the server ([listen]), you will need to [poll] it at regular intervals (e.g. inside [godot.Node.Process]) for it to process new packets, delivering them to the appropriate [godot.PacketPeerUDP], and taking new connections.
 *
 * Below a small example of how it can be used:
 *
 * ```
 * 		# server.gd
 * 		extends Node
 *
 * 		var server := UDPServer.new()
 * 		var peers = []
 *
 * 		func _ready():
 * 		    server.listen(4242)
 *
 * 		func _process(delta):
 * 		    server.poll() # Important!
 * 		    if server.is_connection_available():
 * 		        var peer : PacketPeerUDP = server.take_connection()
 * 		        var pkt = peer.get_packet()
 * 		        print("Accepted peer: %s:%s" % [peer.get_packet_ip(), peer.get_packet_port()])
 * 		        print("Received data: %s" % [pkt.get_string_from_utf8()])
 * 		        # Reply so it knows we received the message.
 * 		        peer.put_packet(pkt)
 * 		        # Keep a reference so we can keep contacting the remote peer.
 * 		        peers.append(peer)
 *
 * 		    for i in range(0, peers.size()):
 * 		        pass # Do something with the connected peers.
 *
 * 		```
 *
 * ```
 * 		# client.gd
 * 		extends Node
 *
 * 		var udp := PacketPeerUDP.new()
 * 		var connected = false
 *
 * 		func _ready():
 * 		    udp.connect_to_host("127.0.0.1", 4242)
 *
 * 		func _process(delta):
 * 		    if !connected:
 * 		        # Try to contact server
 * 		        udp.put_packet("The answer is... 42!".to_utf8())
 * 		    if udp.get_available_packet_count() > 0:
 * 		        print("Connected: %s" % udp.get_packet().get_string_from_utf8())
 * 		        connected = true
 * 		```
 */
@GodotBaseType
open class UDPServer : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_UDPSERVER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns `true` if a packet with a new address/port combination was received on the socket.
   */
  open fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_IS_CONNECTION_AVAILABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the socket is open and listening on a port.
   */
  open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts the server by opening a UDP socket listening on the given port. You can optionally specify a `bind_address` to only listen for packets sent to that address. See also [godot.PacketPeerUDP.listen].
   */
  open fun listen(port: Long, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Stops the server, closing the UDP socket if open. Will close all connected [godot.PacketPeerUDP] accepted via [takeConnection] (remote peers will not be notified).
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_STOP, NIL)
  }

  /**
   * Returns the first pending connection (connected to the appropriate address/port). Will return `null` if no new connection is available. See also [isConnectionAvailable], [godot.PacketPeerUDP.connectToHost].
   */
  open fun takeConnection(): PacketPeerUDP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UDPSERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PacketPeerUDP?
  }
}
