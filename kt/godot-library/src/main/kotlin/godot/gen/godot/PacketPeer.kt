// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class PacketPeer : Reference() {
  open var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_ALLOW_OBJECT_DECODING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_SET_ALLOW_OBJECT_DECODING, NIL)
    }

  open var encodeBufferMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_ENCODE_BUFFER_MAX_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_SET_ENCODE_BUFFER_MAX_SIZE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PACKETPEER)

  open fun getAvailablePacketCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_AVAILABLE_PACKET_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPacket(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun getPacketError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun putPacket(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_PACKET, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun putVar(_var: Any?, fullObjects: Boolean = false): GodotError {
    TransferContext.writeArguments(ANY to _var, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_VAR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
