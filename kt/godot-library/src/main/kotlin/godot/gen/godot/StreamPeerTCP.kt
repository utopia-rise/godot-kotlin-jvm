// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.StreamPeerTCP
import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * TCP stream peer.
 *
 * TCP stream peer. This object can be used to connect to TCP servers, or also is returned by a TCP server.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerTCP : StreamPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STREAMPEERTCP)
  }

  /**
   * Opens the TCP socket, and binds it to the specified local address.
   *
   * This method is generally not needed, and only used to force the subsequent call to [connectToHost] to use the specified `host` and `port` as source address. This can be desired in some NAT punchthrough techniques, or when forcing the source network interface.
   */
  public fun bind(port: Long, host: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to host)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_BIND, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects to the specified `host:port` pair. A hostname will be resolved if valid. Returns [OK] on success.
   */
  public fun connectToHost(host: String, port: Long): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if this peer is currently connected or is connecting to a host, `false` otherwise.
   */
  public fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the status of the connection, see [enum Status].
   */
  public fun getStatus(): StreamPeerTCP.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_STATUS, LONG)
    return StreamPeerTCP.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the IP of this peer.
   */
  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_CONNECTED_HOST,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the port of this peer.
   */
  public fun getConnectedPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_CONNECTED_PORT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public fun getLocalPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_GET_LOCAL_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Disconnects from host.
   */
  public fun disconnectFromHost(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_DISCONNECT_FROM_HOST,
        NIL)
  }

  /**
   * If `enabled` is `true`, packets will be sent immediately. If `enabled` is `false` (the default), packet transfers will be delayed and combined using [godot.Nagle's algorithm](https://en.wikipedia.org/wiki/Nagle%27s_algorithm).
   *
   * **Note:** It's recommended to leave this disabled for applications that send large packets or need to transfer a lot of data, as enabling this can decrease the total available bandwidth.
   */
  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERTCP_SET_NO_DELAY, NIL)
  }

  public enum class Status(
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
    STATUS_ERROR(3),
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
