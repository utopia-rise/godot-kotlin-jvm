// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.PacketPeerDTLS
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
 * DTLS packet peer.
 *
 * This class represents a DTLS peer connection. It can be used to connect to a DTLS server, and is returned by [godot.DTLSServer.takeConnection].
 */
@GodotBaseType
open class PacketPeerDTLS : PacketPeer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PACKETPEERDTLS, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Connects a `peer` beginning the DTLS handshake using the underlying [godot.PacketPeerUDP] which must be connected (see [godot.PacketPeerUDP.connectToHost]). If `validate_certs` is `true`, [godot.PacketPeerDTLS] will validate that the certificate presented by the remote peer and match it with the `for_hostname` argument. You can specify a custom [godot.X509Certificate] to use for validation via the `valid_certificate` argument.
   */
  open fun connectToPeer(
    packetPeer: PacketPeerUDP,
    validateCerts: Boolean = true,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to packetPeer, BOOL to validateCerts, STRING to
        forHostname, OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_CONNECT_TO_PEER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects this peer, terminating the DTLS session.
   */
  open fun disconnectFromPeer() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_DISCONNECT_FROM_PEER,
        NIL)
  }

  /**
   * Returns the status of the connection. See [enum Status] for values.
   */
  open fun getStatus(): PacketPeerDTLS.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_GET_STATUS, LONG)
    return PacketPeerDTLS.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Poll the connection to check for incoming packets. Call this frequently to update the status and keep the connection working.
   */
  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEERDTLS_POLL, NIL)
  }

  enum class Status(
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
    STATUS_ERROR_HOSTNAME_MISMATCH(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * A status representing a [godot.PacketPeerDTLS] that is connected to a remote peer.
     */
    final const val STATUS_CONNECTED: Long = 2

    /**
     * A status representing a [godot.PacketPeerDTLS] that is disconnected.
     */
    final const val STATUS_DISCONNECTED: Long = 0

    /**
     * A status representing a [godot.PacketPeerDTLS] in a generic error state.
     */
    final const val STATUS_ERROR: Long = 3

    /**
     * An error status that shows a mismatch in the DTLS certificate domain presented by the host and the domain requested for validation.
     */
    final const val STATUS_ERROR_HOSTNAME_MISMATCH: Long = 4

    /**
     * A status representing a [godot.PacketPeerDTLS] that is currently performing the handshake with a remote peer.
     */
    final const val STATUS_HANDSHAKING: Long = 1
  }
}
