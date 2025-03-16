// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
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
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(642, scriptIndex)
  }

  /**
   * Poll the connection to check for incoming bytes. Call this right before
   * [StreamPeer.getAvailableBytes] for it to work properly.
   */
  public final fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pollPtr, NIL)
  }

  /**
   * Accepts a peer connection as a server using the given [serverOptions]. See [TLSOptions.server].
   */
  public final fun acceptStream(stream: StreamPeer?, serverOptions: TLSOptions?): Error {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to serverOptions)
    TransferContext.callMethod(ptr, MethodBindings.acceptStreamPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Connects to a peer using an underlying [StreamPeer] [stream] and verifying the remote
   * certificate is correctly signed for the given [commonName]. You can pass the optional
   * [clientOptions] parameter to customize the trusted certification authorities, or disable the
   * common name verification. See [TLSOptions.client] and [TLSOptions.clientUnsafe].
   */
  @JvmOverloads
  public final fun connectToStream(
    stream: StreamPeer?,
    commonName: String,
    clientOptions: TLSOptions? = null,
  ): Error {
    TransferContext.writeArguments(OBJECT to stream, STRING to commonName, OBJECT to clientOptions)
    TransferContext.callMethod(ptr, MethodBindings.connectToStreamPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of the connection. See [Status] for values.
   */
  public final fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTLS.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the underlying [StreamPeer] connection, used in [acceptStream] or [connectToStream].
   */
  public final fun getStream(): StreamPeer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StreamPeer?)
  }

  /**
   * Disconnects from host.
   */
  public final fun disconnectFromStream(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.disconnectFromStreamPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    /**
     * A status representing a [StreamPeerTLS] that is disconnected.
     */
    DISCONNECTED(0),
    /**
     * A status representing a [StreamPeerTLS] during handshaking.
     */
    HANDSHAKING(1),
    /**
     * A status representing a [StreamPeerTLS] that is connected to a host.
     */
    CONNECTED(2),
    /**
     * A status representing a [StreamPeerTLS] in error state.
     */
    ERROR(3),
    /**
     * An error status that shows a mismatch in the TLS certificate domain presented by the host and
     * the domain requested for validation.
     */
    ERROR_HOSTNAME_MISMATCH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Status = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val pollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "poll", 3218959716)

    internal val acceptStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "accept_stream", 4292689651)

    internal val connectToStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "connect_to_stream", 57169517)

    internal val getStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "get_status", 1128380576)

    internal val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "get_stream", 2741655269)

    internal val disconnectFromStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTLS", "disconnect_from_stream", 3218959716)
  }
}
