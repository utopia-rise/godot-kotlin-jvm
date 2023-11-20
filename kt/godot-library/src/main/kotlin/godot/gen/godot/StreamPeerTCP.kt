// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
 * A stream peer that handles TCP connections.
 *
 * A stream peer that handles TCP connections. This object can be used to connect to TCP servers, or also is returned by a TCP server.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerTCP : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERTCP, scriptIndex)
    return true
  }

  /**
   * Opens the TCP socket, and binds it to the specified local address.
   *
   * This method is generally not needed, and only used to force the subsequent call to [connectToHost] to use the specified [host] and [port] as source address. This can be desired in some NAT punchthrough techniques, or when forcing the source network interface.
   */
  @JvmOverloads
  public fun bind(port: Int, host: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to host)
    TransferContext.callMethod(rawPtr, MethodBindings.bindPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Connects to the specified `host:port` pair. A hostname will be resolved if valid. Returns [OK] on success.
   */
  public fun connectToHost(host: String, port: Int): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectToHostPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Poll the socket, updating its state. See [getStatus].
   */
  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of the connection, see [enum Status].
   */
  public fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTCP.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the IP of this peer.
   */
  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedHostPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the port of this peer.
   */
  public fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Disconnects from host.
   */
  public fun disconnectFromHost(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectFromHostPtr, NIL)
  }

  /**
   * If [enabled] is `true`, packets will be sent immediately. If [enabled] is `false` (the default), packet transfers will be delayed and combined using [godot.Nagle's algorithm](https://en.wikipedia.org/wiki/Nagle%27s_algorithm).
   *
   * **Note:** It's recommended to leave this disabled for applications that send large packets or need to transfer a lot of data, as enabling this can decrease the total available bandwidth.
   */
  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setNoDelayPtr, NIL)
  }

  public enum class Status(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val bindPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "bind")

    public val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "connect_to_host")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "poll")

    public val getStatusPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "get_status")

    public val getConnectedHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_host")

    public val getConnectedPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_port")

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_local_port")

    public val disconnectFromHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "disconnect_from_host")

    public val setNoDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "set_no_delay")
  }
}
