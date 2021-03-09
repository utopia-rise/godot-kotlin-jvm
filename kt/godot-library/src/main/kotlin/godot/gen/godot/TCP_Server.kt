// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A TCP server.
 *
 * A TCP server. Listens to connections on a port and returns a [godot.StreamPeerTCP] when it gets an incoming connection.
 */
@GodotBaseType
open class TCP_Server : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TCP_SERVER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns `true` if a connection is available for taking.
   */
  open fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_IS_CONNECTION_AVAILABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the server is currently listening for connections.
   */
  open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Listen on the `port` binding to `bind_address`.
   *
   * If `bind_address` is set as `"*"` (default), the server will listen on all available addresses (both IPv4 and IPv6).
   *
   * If `bind_address` is set as `"0.0.0.0"` (for IPv4) or `"::"` (for IPv6), the server will listen on all available addresses matching that IP type.
   *
   * If `bind_address` is set to any valid address (e.g. `"192.168.1.101"`, `"::1"`, etc), the server will only listen on the interface with that addresses (or fail if no interface with the given address exists).
   */
  open fun listen(port: Long, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Stops listening.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_STOP, NIL)
  }

  /**
   * If a connection is available, returns a StreamPeerTCP with the connection.
   */
  open fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeerTCP?
  }
}
