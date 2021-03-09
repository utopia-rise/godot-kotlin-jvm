// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Int
import kotlin.Suppress

/**
 * Helper class to implement a DTLS server.
 *
 * This class is used to store the state of a DTLS server. Upon [setup] it converts connected [godot.PacketPeerUDP] to [godot.PacketPeerDTLS] accepting them via [takeConnection] as DTLS clients. Under the hood, this class is used to store the DTLS state and cookies of the server. The reason of why the state and cookies are needed is outside of the scope of this documentation.
 *
 * Below a small example of how to use it:
 *
 * ```
 * 		# server.gd
 * 		extends Node
 *
 * 		var dtls := DTLSServer.new()
 * 		var server := UDPServer.new()
 * 		var peers = []
 *
 * 		func _ready():
 * 		    server.listen(4242)
 * 		    var key = load("key.key") # Your private key.
 * 		    var cert = load("cert.crt") # Your X509 certificate.
 * 		    dtls.setup(key, cert)
 *
 * 		func _process(delta):
 * 		    while server.is_connection_available():
 * 		        var peer : PacketPeerUDP = server.take_connection()
 * 		        var dtls_peer : PacketPeerDTLS = dtls.take_connection(peer)
 * 		        if dtls_peer.get_status() != PacketPeerDTLS.STATUS_HANDSHAKING:
 * 		            continue # It is normal that 50% of the connections fails due to cookie exchange.
 * 		        print("Peer connected!")
 * 		        peers.append(dtls_peer)
 * 		    for p in peers:
 * 		        p.poll() # Must poll to update the state.
 * 		        if p.get_status() == PacketPeerDTLS.STATUS_CONNECTED:
 * 		            while p.get_available_packet_count() > 0:
 * 		                print("Received message from client: %s" % p.get_packet().get_string_from_utf8())
 * 		                p.put_packet("Hello DTLS client".to_utf8())
 * 		```
 *
 * ```
 * 		# client.gd
 * 		extends Node
 *
 * 		var dtls := PacketPeerDTLS.new()
 * 		var udp := PacketPeerUDP.new()
 * 		var connected = false
 *
 * 		func _ready():
 * 		    udp.connect_to_host("127.0.0.1", 4242)
 * 		    dtls.connect_to_peer(udp, false) # Use true in production for certificate validation!
 *
 * 		func _process(delta):
 * 		    dtls.poll()
 * 		    if dtls.get_status() == PacketPeerDTLS.STATUS_CONNECTED:
 * 		        if !connected:
 * 		            # Try to contact server
 * 		            dtls.put_packet("The answer is... 42!".to_utf8())
 * 		        while dtls.get_available_packet_count() > 0:
 * 		            print("Connected: %s" % dtls.get_packet().get_string_from_utf8())
 * 		            connected = true
 * 		```
 */
@GodotBaseType
open class DTLSServer : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_DTLSSERVER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Setup the DTLS server to use the given `private_key` and provide the given `certificate` to clients. You can pass the optional `chain` parameter to provide additional CA chain information along with the certificate.
   */
  open fun setup(
    key: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to key, OBJECT to certificate, OBJECT to chain)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DTLSSERVER_SETUP, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Try to initiate the DTLS handshake with the given `udp_peer` which must be already connected (see [godot.PacketPeerUDP.connectToHost]).
   *
   * **Note**: You must check that the state of the return PacketPeerUDP is [godot.PacketPeerDTLS.STATUS_HANDSHAKING], as it is normal that 50% of the new connections will be invalid due to cookie exchange.
   */
  open fun takeConnection(udpPeer: PacketPeerUDP): PacketPeerDTLS? {
    TransferContext.writeArguments(OBJECT to udpPeer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DTLSSERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PacketPeerDTLS?
  }
}
