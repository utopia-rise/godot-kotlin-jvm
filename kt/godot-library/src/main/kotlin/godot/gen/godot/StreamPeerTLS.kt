// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A stream peer that handles TLS connections. This object can be used to connect to a TLS server or
 * accept a single TLS client connection.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerTLS : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERTLS, scriptIndex)
    return true
  }

  /**
   * Poll the connection to check for incoming bytes. Call this right before
   * [StreamPeer.getAvailableBytes] for it to work properly.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  /**
   * Accepts a peer connection as a server using the given [serverOptions]. See [TLSOptions.server].
   */
  public fun acceptStream(stream: StreamPeer, serverOptions: TLSOptions): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to serverOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.acceptStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Connects to a peer using an underlying [StreamPeer] [stream] and verifying the remote
   * certificate is correctly signed for the given [commonName]. You can pass the optional
   * [clientOptions] parameter to customize the trusted certification authorities, or disable the
   * common name verification. See [TLSOptions.client] and [TLSOptions.clientUnsafe].
   */
  @JvmOverloads
  public fun connectToStream(
    stream: StreamPeer,
    commonName: String,
    clientOptions: TLSOptions? = null,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, STRING to commonName, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of the connection. See [Status] for values.
   */
  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTLS.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the underlying [StreamPeer] connection, used in [acceptStream] or [connectToStream].
   */
  public fun getStream(): StreamPeer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeer?)
  }

  /**
   * Disconnects from host.
   */
  public fun disconnectFromStream(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromStreamPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    /**
     * A status representing a [StreamPeerTLS] that is disconnected.
     */
    STATUS_DISCONNECTED(0),
    /**
     * A status representing a [StreamPeerTLS] during handshaking.
     */
    STATUS_HANDSHAKING(1),
    /**
     * A status representing a [StreamPeerTLS] that is connected to a host.
     */
    STATUS_CONNECTED(2),
    /**
     * A status representing a [StreamPeerTLS] in error state.
     */
    STATUS_ERROR(3),
    /**
     * An error status that shows a mismatch in the TLS certificate domain presented by the host and
     * the domain requested for validation.
     */
    STATUS_ERROR_HOSTNAME_MISMATCH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "poll")

    public val acceptStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "accept_stream")

    public val connectToStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "connect_to_stream")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "get_status")

    public val getStreamPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTLS", "get_stream")

    public val disconnectFromStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "disconnect_from_stream")
  }
}
