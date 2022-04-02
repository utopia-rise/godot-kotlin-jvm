// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.PacketPeerDTLS
import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * DTLS packet peer.
 *
 * This class represents a DTLS peer connection. It can be used to connect to a DTLS server, and is returned by [godot.DTLSServer.takeConnection].
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 *
 * **Warning:** SSL/TLS certificate revocation and certificate pinning are currently not supported. Revoked certificates are accepted as long as they are otherwise valid. If this is a concern, you may want to use automatically managed certificates with a short validity period.
 */
@GodotBaseType
public open class PacketPeerDTLS : PacketPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKETPEERDTLS)
  }

  /**
   * Poll the connection to check for incoming packets. Call this frequently to update the status and keep the connection working.
   */
  public open fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_POLL, NIL)
  }

  /**
   * Connects a `peer` beginning the DTLS handshake using the underlying [godot.PacketPeerUDP] which must be connected (see [godot.PacketPeerUDP.connectToHost]). If `validate_certs` is `true`, [godot.PacketPeerDTLS] will validate that the certificate presented by the remote peer and match it with the `for_hostname` argument. You can specify a custom [godot.X509Certificate] to use for validation via the `valid_certificate` argument.
   */
  public open fun connectToPeer(
    packetPeer: PacketPeerUDP,
    validateCerts: Boolean = true,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to packetPeer, BOOL to validateCerts, STRING to forHostname, OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_CONNECT_TO_PEER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the status of the connection. See [enum Status] for values.
   */
  public open fun getStatus(): PacketPeerDTLS.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_GET_STATUS, LONG)
    return PacketPeerDTLS.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects this peer, terminating the DTLS session.
   */
  public open fun disconnectFromPeer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_DISCONNECT_FROM_PEER,
        NIL)
  }

  public enum class Status(
    id: Long
  ) {
    /**
     * A status representing a [godot.PacketPeerDTLS] that is disconnected.
     */
    STATUS_DISCONNECTED(0),
    /**
     * A status representing a [godot.PacketPeerDTLS] that is currently performing the handshake with a remote peer.
     */
    STATUS_HANDSHAKING(1),
    /**
     * A status representing a [godot.PacketPeerDTLS] that is connected to a remote peer.
     */
    STATUS_CONNECTED(2),
    /**
     * A status representing a [godot.PacketPeerDTLS] in a generic error state.
     */
    STATUS_ERROR(3),
    /**
     * An error status that shows a mismatch in the DTLS certificate domain presented by the host and the domain requested for validation.
     */
    STATUS_ERROR_HOSTNAME_MISMATCH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
