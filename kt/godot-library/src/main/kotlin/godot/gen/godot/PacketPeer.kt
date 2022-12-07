// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstraction and base class for packet-based protocols.
 *
 * PacketPeer is an abstraction and base class for packet-based protocols (such as UDP). It provides an API for sending and receiving packets both as raw data or variables. This makes it easy to transfer data over a protocol, without having to encode data as low-level bytes or having to worry about network ordering.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeer internal constructor() : RefCounted() {
  /**
   * Maximum buffer size allowed when encoding [Variant]s. Raise this value to support heavier memory allocations.
   *
   * The [putVar] method allocates memory on the stack, and the buffer used will grow automatically to the closest power of two to match the size of the [Variant]. If the [Variant] is bigger than `encode_buffer_max_size`, the method will error out with [ERR_OUT_OF_MEMORY].
   */
  public var encodeBufferMaxSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_ENCODE_BUFFER_MAX_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PACKETPEER_SET_ENCODE_BUFFER_MAX_SIZE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKETPEER)
  }

  /**
   * Gets a Variant. If [allowObjects] is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sends a [Variant] as a packet. If [fullObjects] is `true`, encoding objects is allowed (and can potentially include code).
   */
  public fun putVar(_var: Any, fullObjects: Boolean = false): GodotError {
    TransferContext.writeArguments(ANY to _var, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_VAR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets a raw packet.
   */
  public fun getPacket(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Sends a raw packet.
   */
  public fun putPacket(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_PUT_PACKET, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the error state of the last packet received (via [getPacket] and [getVar]).
   */
  public fun getPacketError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_PACKET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the number of packets currently available in the ring-buffer.
   */
  public fun getAvailablePacketCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PACKETPEER_GET_AVAILABLE_PACKET_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
