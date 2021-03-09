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
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Abstraction and base class for packet-based protocols.
 *
 * PacketPeer is an abstraction and base class for packet-based protocols (such as UDP). It provides an API for sending and receiving packets both as raw data or variables. This makes it easy to transfer data over a protocol, without having to encode data as low-level bytes or having to worry about network ordering.
 */
@GodotBaseType
open class PacketPeer : Reference() {
  /**
   * *Deprecated.* Use `get_var` and `put_var` parameters instead.
   *
   * If `true`, the PacketPeer will allow encoding and decoding of object via [getVar] and [putVar].
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
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

  /**
   * Maximum buffer size allowed when encoding [Variant]s. Raise this value to support heavier memory allocations.
   *
   * The [putVar] method allocates memory on the stack, and the buffer used will grow automatically to the closest power of two to match the size of the [Variant]. If the [Variant] is bigger than `encode_buffer_max_size`, the method will error out with [ERR_OUT_OF_MEMORY].
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PACKETPEER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the number of packets currently available in the ring-buffer.
   */
  open fun getAvailablePacketCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_AVAILABLE_PACKET_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets a raw packet.
   */
  open fun getPacket(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns the error state of the last packet received (via [getPacket] and [getVar]).
   */
  open fun getPacketError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets a Variant. If `allow_objects` (or [allowObjectDecoding]) is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sends a raw packet.
   */
  open fun putPacket(buffer: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_PACKET, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sends a [Variant] as a packet. If `full_objects` (or [allowObjectDecoding]) is `true`, encoding objects is allowed (and can potentially include code).
   */
  open fun putVar(_var: Any?, fullObjects: Boolean = false): GodotError {
    TransferContext.writeArguments(ANY to _var, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_VAR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
