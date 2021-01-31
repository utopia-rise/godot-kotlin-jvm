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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class TCP_Server : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TCP_SERVER)

  open fun isConnectionAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_IS_CONNECTION_AVAILABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun listen(port: Long, bindAddress: String = "*"): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_STOP, NIL)
  }

  open fun takeConnection(): StreamPeerTCP? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TCP_SERVER_TAKE_CONNECTION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeerTCP?
  }
}
