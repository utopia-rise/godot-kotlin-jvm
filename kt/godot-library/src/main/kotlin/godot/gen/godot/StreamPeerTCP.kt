// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.StreamPeerTCP
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * TCP stream peer.
 *
 * TCP stream peer. This object can be used to connect to TCP servers, or also is returned by a TCP server.
 */
@GodotBaseType
open class StreamPeerTCP : StreamPeer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_STREAMPEERTCP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Connects to the specified `host:port` pair. A hostname will be resolved if valid. Returns [OK] on success or [FAILED] on failure.
   */
  open fun connectToHost(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects from host.
   */
  open fun disconnectFromHost() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_DISCONNECT_FROM_HOST,
        NIL)
  }

  /**
   * Returns the IP of this peer.
   */
  open fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_CONNECTED_HOST,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the port of this peer.
   */
  open fun getConnectedPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_CONNECTED_PORT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the status of the connection, see [enum Status].
   */
  open fun getStatus(): StreamPeerTCP.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_STATUS, LONG)
    return StreamPeerTCP.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if this peer is currently connected to a host, `false` otherwise.
   */
  open fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Disables Nagle's algorithm to improve latency for small packets.
   *
   * **Note:** For applications that send large packets or need to transfer a lot of data, this can decrease the total available bandwidth.
   */
  open fun setNoDelay(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_SET_NO_DELAY, NIL)
  }

  enum class Status(
    id: Long
  ) {
    /**
     * The initial status of the [godot.StreamPeerTCP]. This is also the status after disconnecting.
     */
    STATUS_NONE(0),

    /**
     * A status representing a [godot.StreamPeerTCP] that is connecting to a host.
     */
    STATUS_CONNECTING(1),

    /**
     * A status representing a [godot.StreamPeerTCP] that is connected to a host.
     */
    STATUS_CONNECTED(2),

    /**
     * A status representing a [godot.StreamPeerTCP] in error state.
     */
    STATUS_ERROR(3);

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
     * A status representing a [godot.StreamPeerTCP] that is connected to a host.
     */
    final const val STATUS_CONNECTED: Long = 2

    /**
     * A status representing a [godot.StreamPeerTCP] that is connecting to a host.
     */
    final const val STATUS_CONNECTING: Long = 1

    /**
     * A status representing a [godot.StreamPeerTCP] in error state.
     */
    final const val STATUS_ERROR: Long = 3

    /**
     * The initial status of the [godot.StreamPeerTCP]. This is also the status after disconnecting.
     */
    final const val STATUS_NONE: Long = 0
  }
}
