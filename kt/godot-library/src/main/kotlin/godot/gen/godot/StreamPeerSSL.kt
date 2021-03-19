// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.StreamPeerSSL
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
 * SSL stream peer.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/networking/ssl_certificates.html](https://docs.godotengine.org/en/latest/tutorials/networking/ssl_certificates.html)
 *
 * SSL stream peer. This object can be used to connect to an SSL server or accept a single SSL client connection.
 */
@GodotBaseType
open class StreamPeerSSL : StreamPeer() {
  /**
   *
   */
  open var blockingHandshake: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_BLOCKING_HANDSHAKE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_SET_BLOCKING_HANDSHAKE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_STREAMPEERSSL)
  }

  /**
   * Accepts a peer connection as a server using the given `private_key` and providing the given `certificate` to the client. You can pass the optional `chain` parameter to provide additional CA chain information along with the certificate.
   */
  open fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to privateKey, OBJECT to certificate,
        OBJECT to chain)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_ACCEPT_STREAM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects to a peer using an underlying [godot.StreamPeer] `stream`. If `validate_certs` is `true`, [godot.StreamPeerSSL] will validate that the certificate presented by the peer matches the `for_hostname`.
   *
   * **Note:** Specifying a custom `valid_certificate` is not supported in HTML5 exports due to browsers restrictions.
   */
  open fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, BOOL to validateCerts, STRING to forHostname,
        OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_CONNECT_TO_STREAM,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects from host.
   */
  open fun disconnectFromStream() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_DISCONNECT_FROM_STREAM, NIL)
  }

  /**
   * Returns the status of the connection. See [enum Status] for values.
   */
  open fun getStatus(): StreamPeerSSL.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_STATUS, LONG)
    return StreamPeerSSL.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Poll the connection to check for incoming bytes. Call this right before [godot.StreamPeer.getAvailableBytes] for it to work properly.
   */
  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_POLL, NIL)
  }

  enum class Status(
    id: Long
  ) {
    /**
     * A status representing a [godot.StreamPeerSSL] that is disconnected.
     */
    STATUS_DISCONNECTED(0),

    /**
     * A status representing a [godot.StreamPeerSSL] during handshaking.
     */
    STATUS_HANDSHAKING(1),

    /**
     * A status representing a [godot.StreamPeerSSL] that is connected to a host.
     */
    STATUS_CONNECTED(2),

    /**
     * A status representing a [godot.StreamPeerSSL] in error state.
     */
    STATUS_ERROR(3),

    /**
     * An error status that shows a mismatch in the SSL certificate domain presented by the host and the domain requested for validation.
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
     * A status representing a [godot.StreamPeerSSL] that is connected to a host.
     */
    final const val STATUS_CONNECTED: Long = 2

    /**
     * A status representing a [godot.StreamPeerSSL] that is disconnected.
     */
    final const val STATUS_DISCONNECTED: Long = 0

    /**
     * A status representing a [godot.StreamPeerSSL] in error state.
     */
    final const val STATUS_ERROR: Long = 3

    /**
     * An error status that shows a mismatch in the SSL certificate domain presented by the host and the domain requested for validation.
     */
    final const val STATUS_ERROR_HOSTNAME_MISMATCH: Long = 4

    /**
     * A status representing a [godot.StreamPeerSSL] during handshaking.
     */
    final const val STATUS_HANDSHAKING: Long = 1
  }
}
