// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper class to implement a DTLS server.
 *
 * This class is used to store the state of a DTLS server. Upon [setup] it converts connected [godot.PacketPeerUDP] to [godot.PacketPeerDTLS] accepting them via [takeConnection] as DTLS clients. Under the hood, this class is used to store the DTLS state and cookies of the server. The reason of why the state and cookies are needed is outside of the scope of this documentation.
 *
 * Below a small example of how to use it:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # ServerNode.gd
 *
 * extends Node
 *
 *
 *
 * var dtls := DTLSServer.new()
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
 *     var key = load("key.key") # Your private key.
 *
 *     var cert = load("cert.crt") # Your X509 certificate.
 *
 *     dtls.setup(key, cert)
 *
 *
 *
 * func _process(delta):
 *
 *     while server.is_connection_available():
 *
 *         var peer : PacketPeerUDP = server.take_connection()
 *
 *         var dtls_peer : PacketPeerDTLS = dtls.take_connection(peer)
 *
 *         if dtls_peer.get_status() != PacketPeerDTLS.STATUS_HANDSHAKING:
 *
 *             continue # It is normal that 50% of the connections fails due to cookie exchange.
 *
 *         print("Peer connected!")
 *
 *         peers.append(dtls_peer)
 *
 *
 *
 *     for p in peers:
 *
 *         p.poll() # Must poll to update the state.
 *
 *         if p.get_status() == PacketPeerDTLS.STATUS_CONNECTED:
 *
 *             while p.get_available_packet_count() > 0:
 *
 *                 print("Received message from client: %s" % p.get_packet().get_string_from_utf8())
 *
 *                 p.put_packet("Hello DTLS client".to_utf8())
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 * using System;
 *
 * // ServerNode.cs
 *
 * public class ServerNode : Node
 *
 * {
 *
 *     public DTLSServer Dtls = new DTLSServer();
 *
 *     public UDPServer Server = new UDPServer();
 *
 *     public Godot.Collections.Array<PacketPeerDTLS> Peers = new Godot.Collections.Array<PacketPeerDTLS>();
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         Server.Listen(4242);
 *
 *         var key = GD.Load<CryptoKey>("key.key"); // Your private key.
 *
 *         var cert = GD.Load<X509Certificate>("cert.crt"); // Your X509 certificate.
 *
 *         Dtls.Setup(key, cert);
 *
 *     }
 *
 *
 *
 *     public override void _Process(float delta)
 *
 *     {
 *
 *         while (Server.IsConnectionAvailable())
 *
 *         {
 *
 *             PacketPeerUDP peer = Server.TakeConnection();
 *
 *             PacketPeerDTLS dtlsPeer = Dtls.TakeConnection(peer);
 *
 *             if (dtlsPeer.GetStatus() != PacketPeerDTLS.Status.Handshaking)
 *
 *             {
 *
 *                 continue; // It is normal that 50% of the connections fails due to cookie exchange.
 *
 *             }
 *
 *             GD.Print("Peer connected!");
 *
 *             Peers.Add(dtlsPeer);
 *
 *         }
 *
 *
 *
 *         foreach (var p in Peers)
 *
 *         {
 *
 *             p.Poll(); // Must poll to update the state.
 *
 *             if (p.GetStatus() == PacketPeerDTLS.Status.Connected)
 *
 *             {
 *
 *                 while (p.GetAvailablePacketCount() > 0)
 *
 *                 {
 *
 *                     GD.Print("Received Message From Client: " + p.GetPacket().GetStringFromUTF8());
 *
 *                     p.PutPacket("Hello Dtls Client".ToUTF8());
 *
 *                 }
 *
 *             }
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
 * # ClientNode.gd
 *
 * extends Node
 *
 *
 *
 * var dtls := PacketPeerDTLS.new()
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
 *     dtls.connect_to_peer(udp, false) # Use true in production for certificate validation!
 *
 *
 *
 * func _process(delta):
 *
 *     dtls.poll()
 *
 *     if dtls.get_status() == PacketPeerDTLS.STATUS_CONNECTED:
 *
 *         if !connected:
 *
 *             # Try to contact server
 *
 *             dtls.put_packet("The answer is... 42!".to_utf8())
 *
 *         while dtls.get_available_packet_count() > 0:
 *
 *             print("Connected: %s" % dtls.get_packet().get_string_from_utf8())
 *
 *             connected = true
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 * using System.Text;
 *
 * // ClientNode.cs
 *
 * public class ClientNode : Node
 *
 * {
 *
 *     public PacketPeerDTLS Dtls = new PacketPeerDTLS();
 *
 *     public PacketPeerUDP Udp = new PacketPeerUDP();
 *
 *     public bool Connected = false;
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         Udp.ConnectToHost("127.0.0.1", 4242);
 *
 *         Dtls.ConnectToPeer(Udp, false); // Use true in production for certificate validation!
 *
 *     }
 *
 *
 *
 *     public override void _Process(float delta)
 *
 *     {
 *
 *         Dtls.Poll();
 *
 *         if (Dtls.GetStatus() == PacketPeerDTLS.Status.Connected)
 *
 *         {
 *
 *             if (!Connected)
 *
 *             {
 *
 *                 // Try to contact server
 *
 *                 Dtls.PutPacket("The Answer Is..42!".ToUTF8());
 *
 *             }
 *
 *             while (Dtls.GetAvailablePacketCount() > 0)
 *
 *             {
 *
 *                 GD.Print("Connected: " + Dtls.GetPacket().GetStringFromUTF8());
 *
 *                 Connected = true;
 *
 *             }
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
public open class DTLSServer : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DTLSSERVER)
  }

  /**
   * Setup the DTLS server to use the given `private_key` and provide the given `certificate` to clients. You can pass the optional `chain` parameter to provide additional CA chain information along with the certificate.
   */
  public open fun setup(
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
   * **Note:** You must check that the state of the return PacketPeerUDP is [godot.PacketPeerDTLS.STATUS_HANDSHAKING], as it is normal that 50% of the new connections will be invalid due to cookie exchange.
   */
  public open fun takeConnection(udpPeer: PacketPeerUDP): PacketPeerDTLS? {
    TransferContext.writeArguments(OBJECT to udpPeer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DTLSSERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PacketPeerDTLS?
  }

  public companion object
}
