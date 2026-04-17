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
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A Unix Domain Socket (UDS) server. Listens to connections on a socket path and returns a
 * [StreamPeerUDS] when it gets an incoming connection. Unix Domain Sockets provide inter-process
 * communication on the same machine using the filesystem namespace.
 *
 * **Note:** Unix Domain Sockets are only available on Unix-like systems (Linux, macOS, etc.) and
 * are not supported on Windows.
 */
@GodotBaseType
public open class UDSServer : SocketServer() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(163, scriptPtr)
  }

  /**
   * Listens on the socket at [path]. The socket file will be created at the specified path.
   *
   * **Note:** The socket file must not already exist at the specified path. You may need to remove
   * any existing socket file before calling this method.
   */
  public final fun listen(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.listenPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If a connection is available, returns a StreamPeerUDS with the connection.
   */
  public final fun takeConnection(): StreamPeerUDS? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.takeConnectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StreamPeerUDS?)
  }

  public companion object

  public object MethodBindings {
    internal val listenPtr: VoidPtr = TypeManager.getMethodBindPtr("UDSServer", "listen", 166001499)

    internal val takeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UDSServer", "take_connection", 1623851112)
  }
}
