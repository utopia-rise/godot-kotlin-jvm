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
 * A TCP server. Listens to connections on a port and returns a [StreamPeerTCP] when it gets an
 * incoming connection.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class TCPServer : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TCPSERVER, scriptIndex)
  }

  /**
   * Listen on the [port] binding to [bindAddress].
   * If [bindAddress] is set as `"*"` (default), the server will listen on all available addresses
   * (both IPv4 and IPv6).
   * If [bindAddress] is set as `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the server will listen
   * on all available addresses matching that IP type.
   * If [bindAddress] is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc.), the
   * server will only listen on the interface with that address (or fail if no interface with the given
   * address exists).
   */
  @JvmOverloads
  public fun listen(port: Int, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(rawPtr, MethodBindings.listenPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a connection is available for taking.
   */
  public fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the server is currently listening for connections.
   */
  public fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isListeningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the local port this server is listening to.
   */
  public fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * If a connection is available, returns a StreamPeerTCP with the connection.
   */
  public fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StreamPeerTCP?)
  }

  /**
   * Stops listening.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val listenPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "listen", 3167955072)

    public val isConnectionAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "is_connection_available", 36873697)

    public val isListeningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "is_listening", 36873697)

    public val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "get_local_port", 3905245786)

    public val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "take_connection", 30545006)

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "stop", 3218959716)
  }
}
