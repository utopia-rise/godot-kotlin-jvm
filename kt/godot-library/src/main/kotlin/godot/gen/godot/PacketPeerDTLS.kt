// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class represents a DTLS peer connection. It can be used to connect to a DTLS server, and is
 * returned by [DTLSServer.takeConnection].
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 * **Warning:** TLS certificate revocation and certificate pinning are currently not supported.
 * Revoked certificates are accepted as long as they are otherwise valid. If this is a concern, you may
 * want to use automatically managed certificates with a short validity period.
 */
@GodotBaseType
public open class PacketPeerDTLS : PacketPeer() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PACKETPEERDTLS, scriptIndex)
  }

  /**
   * Poll the connection to check for incoming packets. Call this frequently to update the status
   * and keep the connection working.
   */
  public final fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  /**
   * Connects a [packetPeer] beginning the DTLS handshake using the underlying [PacketPeerUDP] which
   * must be connected (see [PacketPeerUDP.connectToHost]). You can optionally specify the
   * [clientOptions] to be used while verifying the TLS connections. See [TLSOptions.client] and
   * [TLSOptions.clientUnsafe].
   */
  @JvmOverloads
  public final fun connectToPeer(
    packetPeer: PacketPeerUDP?,
    hostname: String,
    clientOptions: TLSOptions? = null,
  ): Error {
    TransferContext.writeArguments(OBJECT to packetPeer, STRING to hostname, OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToPeerPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of the connection. See [Status] for values.
   */
  public final fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return PacketPeerDTLS.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Disconnects this peer, terminating the DTLS session.
   */
  public final fun disconnectFromPeer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromPeerPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    /**
     * A status representing a [PacketPeerDTLS] that is disconnected.
     */
    STATUS_DISCONNECTED(0),
    /**
     * A status representing a [PacketPeerDTLS] that is currently performing the handshake with a
     * remote peer.
     */
    STATUS_HANDSHAKING(1),
    /**
     * A status representing a [PacketPeerDTLS] that is connected to a remote peer.
     */
    STATUS_CONNECTED(2),
    /**
     * A status representing a [PacketPeerDTLS] in a generic error state.
     */
    STATUS_ERROR(3),
    /**
     * An error status that shows a mismatch in the DTLS certificate domain presented by the host
     * and the domain requested for validation.
     */
    STATUS_ERROR_HOSTNAME_MISMATCH(4),
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

  internal object MethodBindings {
    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("PacketPeerDTLS", "poll", 3218959716)

    public val connectToPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerDTLS", "connect_to_peer", 2880188099)

    public val getStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerDTLS", "get_status", 3248654679)

    public val disconnectFromPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeerDTLS", "disconnect_from_peer", 3218959716)
  }
}
