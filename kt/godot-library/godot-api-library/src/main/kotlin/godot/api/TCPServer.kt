// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * A TCP server. Listens to connections on a port and returns a [StreamPeerTCP] when it gets an incoming connection.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class TCPServer : RefCounted() {
  override fun new(scriptIndex: Int) {
    createNativeObject(651, scriptIndex)
  }

  /**
   * Listen on the [port] binding to [bindAddress].
   *
   * If [bindAddress] is set as `"*"` (default), the server will listen on all available addresses (both IPv4 and IPv6).
   *
   * If [bindAddress] is set as `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the server will listen on all available addresses matching that IP type.
   *
   * If [bindAddress] is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc.), the server will only listen on the interface with that address (or fail if no interface with the given address exists).
   */
  @JvmOverloads
  public final fun listen(port: Int, bindAddress: String = "*"): Error {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress)
    TransferContext.callMethod(ptr, MethodBindings.listenPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a connection is available for taking.
   */
  public final fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isConnectionAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the server is currently listening for connections.
   */
  public final fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isListeningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the local port this server is listening to.
   */
  public final fun getLocalPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If a connection is available, returns a StreamPeerTCP with the connection.
   */
  public final fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StreamPeerTCP?)
  }

  /**
   * Stops listening.
   */
  public final fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val listenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "listen", 3_167_955_072)

    internal val isConnectionAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "is_connection_available", 36_873_697)

    internal val isListeningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "is_listening", 36_873_697)

    internal val getLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "get_local_port", 3_905_245_786)

    internal val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TCPServer", "take_connection", 30_545_006)

    internal val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("TCPServer", "stop", 3_218_959_716)
  }
}
