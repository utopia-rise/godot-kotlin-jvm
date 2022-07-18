// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.StreamPeerSSL
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
 * SSL stream peer.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/networking/ssl_certificates.html]($DOCS_URL/tutorials/networking/ssl_certificates.html)
 *
 * SSL stream peer. This object can be used to connect to an SSL server or accept a single SSL client connection.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerSSL : StreamPeer() {
  /**
   *
   */
  public var blockingHandshake: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_IS_BLOCKING_HANDSHAKE_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_SET_BLOCKING_HANDSHAKE_ENABLED, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STREAMPEERSSL)
  }

  /**
   * Poll the connection to check for incoming bytes. Call this right before [godot.StreamPeer.getAvailableBytes] for it to work properly.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_POLL, NIL.ordinal)
  }

  /**
   * Accepts a peer connection as a server using the given `private_key` and providing the given `certificate` to the client. You can pass the optional `chain` parameter to provide additional CA chain information along with the certificate.
   */
  public fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to privateKey, OBJECT to certificate, OBJECT to chain)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_ACCEPT_STREAM,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects to a peer using an underlying [godot.StreamPeer] `stream`. If `validate_certs` is `true`, [godot.StreamPeerSSL] will validate that the certificate presented by the peer matches the `for_hostname`.
   *
   * **Note:** Specifying a custom `valid_certificate` is not supported in HTML5 exports due to browsers restrictions.
   */
  public fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, BOOL to validateCerts, STRING to forHostname, OBJECT to validCertificate)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_CONNECT_TO_STREAM,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the status of the connection. See [enum Status] for values.
   */
  public fun getStatus(): StreamPeerSSL.Status {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_STATUS, LONG.ordinal)
    return StreamPeerSSL.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects from host.
   */
  public fun disconnectFromStream(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_DISCONNECT_FROM_STREAM,
        NIL.ordinal)
  }

  public enum class Status(
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
