// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.BOOL
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
 * A TCP server.
 *
 * A TCP server. Listens to connections on a port and returns a [godot.StreamPeerTCP] when it gets an incoming connection.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class TCPServer : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TCPSERVER, scriptIndex)
    return true
  }

  /**
   * Listen on the [port] binding to [bindAddress].
   *
   * If [bindAddress] is set as `"*"` (default), the server will listen on all available addresses (both IPv4 and IPv6).
   *
   * If [bindAddress] is set as `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the server will listen on all available addresses matching that IP type.
   *
   * If [bindAddress] is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc), the server will only listen on the interface with that addresses (or fail if no interface with the given address exists).
   */
  public fun listen(port: Long, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if a connection is available for taking.
   */
  public fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_IS_CONNECTION_AVAILABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the server is currently listening for connections.
   */
  public fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the local port this server is listening to.
   */
  public fun getLocalPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_GET_LOCAL_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If a connection is available, returns a StreamPeerTCP with the connection.
   */
  public fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeerTCP?
  }

  /**
   * Stops listening.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCPSERVER_STOP, NIL)
  }

  public companion object
}
