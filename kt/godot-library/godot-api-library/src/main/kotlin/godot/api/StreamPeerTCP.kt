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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A stream peer that handles TCP connections. This object can be used to connect to TCP servers, or
 * also is returned by a TCP server.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeerTCP : StreamPeer() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(623, scriptIndex)
  }

  /**
   * Opens the TCP socket, and binds it to the specified local address.
   * This method is generally not needed, and only used to force the subsequent call to
   * [connectToHost] to use the specified [host] and [port] as source address. This can be desired in
   * some NAT punchthrough techniques, or when forcing the source network interface.
   */
  @JvmOverloads
  public final fun bind(port: Int, host: String = "*"): Error {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to host)
    TransferContext.callMethod(ptr, MethodBindings.bindPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Connects to the specified `host:port` pair. A hostname will be resolved if valid. Returns [OK]
   * on success.
   */
  public final fun connectToHost(host: String, port: Int): Error {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.connectToHostPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Poll the socket, updating its state. See [getStatus].
   */
  public final fun poll(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pollPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of the connection, see [Status].
   */
  public final fun getStatus(): Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStatusPtr, LONG)
    return StreamPeerTCP.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the IP of this peer.
   */
  public final fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectedHostPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the port of this peer.
   */
  public final fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectedPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the local port to which this peer is bound.
   */
  public final fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Disconnects from host.
   */
  public final fun disconnectFromHost(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.disconnectFromHostPtr, NIL)
  }

  /**
   * If [enabled] is `true`, packets will be sent immediately. If [enabled] is `false` (the
   * default), packet transfers will be delayed and combined using
   * [url=https://en.wikipedia.org/wiki/Nagle&#37;27s_algorithm]Nagle's algorithm[/url].
   * **Note:** It's recommended to leave this disabled for applications that send large packets or
   * need to transfer a lot of data, as enabling this can decrease the total available bandwidth.
   */
  public final fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setNoDelayPtr, NIL)
  }

  public enum class Status(
    id: Long,
  ) {
    /**
     * The initial status of the [StreamPeerTCP]. This is also the status after disconnecting.
     */
    STATUS_NONE(0),
    /**
     * A status representing a [StreamPeerTCP] that is connecting to a host.
     */
    STATUS_CONNECTING(1),
    /**
     * A status representing a [StreamPeerTCP] that is connected to a host.
     */
    STATUS_CONNECTED(2),
    /**
     * A status representing a [StreamPeerTCP] in error state.
     */
    STATUS_ERROR(3),
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
    internal val bindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "bind", 3167955072)

    internal val connectToHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "connect_to_host", 993915709)

    internal val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeerTCP", "poll", 166280745)

    internal val getStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_status", 859471121)

    internal val getConnectedHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_host", 201670096)

    internal val getConnectedPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_connected_port", 3905245786)

    internal val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "get_local_port", 3905245786)

    internal val disconnectFromHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "disconnect_from_host", 3218959716)

    internal val setNoDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerTCP", "set_no_delay", 2586408642)
  }
}
