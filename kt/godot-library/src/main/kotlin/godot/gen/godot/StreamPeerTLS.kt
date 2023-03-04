// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.JVM_INT
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

/**
 * TLS stream peer.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/networking/ssl_certificates.html]($DOCS_URL/tutorials/networking/ssl_certificates.html)
 *
 * TLS stream peer. This object can be used to connect to an TLS server or accept a single TLS client connection.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerTLS : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERTLS, scriptIndex)
    return true
  }

  /**
   * Poll the connection to check for incoming bytes. Call this right before [godot.StreamPeer.getAvailableBytes] for it to work properly.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_POLL, NIL)
  }

  /**
   * Accepts a peer connection as a server using the given [serverOptions]. See [godot.TLSOptions.server].
   */
  public fun acceptStream(stream: StreamPeer, serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_ACCEPT_STREAM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects to a peer using an underlying [godot.StreamPeer] [stream] and verifying the remote certificate is correctly signed for the given [commonName]. You can pass the optional [clientOptions] parameter to customize the trusted certification authorities, or disable the common name verification. See [godot.TLSOptions.client] and [godot.TLSOptions.clientUnsafe].
   */
  public fun connectToStream(
    stream: StreamPeer,
    commonName: String,
    clientOptions: TLSOptions? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, STRING to commonName, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_CONNECT_TO_STREAM,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the status of the connection. See [enum Status] for values.
   */
  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_GET_STATUS, LONG)
    return StreamPeerTLS.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the underlying [godot.StreamPeer] connection, used in [acceptStream] or [connectToStream].
   */
  public fun getStream(): StreamPeer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_GET_STREAM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeer?
  }

  /**
   * Disconnects from host.
   */
  public fun disconnectFromStream(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STREAMPEERTLS_DISCONNECT_FROM_STREAM, NIL)
  }

  public enum class Status(
    id: Long
  ) {
    /**
     * A status representing a [godot.StreamPeerTLS] that is disconnected.
     */
    STATUS_DISCONNECTED(0),
    /**
     * A status representing a [godot.StreamPeerTLS] during handshaking.
     */
    STATUS_HANDSHAKING(1),
    /**
     * A status representing a [godot.StreamPeerTLS] that is connected to a host.
     */
    STATUS_CONNECTED(2),
    /**
     * A status representing a [godot.StreamPeerTLS] in error state.
     */
    STATUS_ERROR(3),
    /**
     * An error status that shows a mismatch in the TLS certificate domain presented by the host and the domain requested for validation.
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
