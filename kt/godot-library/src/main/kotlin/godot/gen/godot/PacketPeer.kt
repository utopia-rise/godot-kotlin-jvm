// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * PacketPeer is an abstraction and base class for packet-based protocols (such as UDP). It provides
 * an API for sending and receiving packets both as raw data or variables. This makes it easy to
 * transfer data over a protocol, without having to encode data as low-level bytes or having to worry
 * about network ordering.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class PacketPeer internal constructor() : RefCounted() {
  /**
   * Maximum buffer size allowed when encoding [Variant]s. Raise this value to support heavier
   * memory allocations.
   * The [putVar] method allocates memory on the stack, and the buffer used will grow automatically
   * to the closest power of two to match the size of the [Variant]. If the [Variant] is bigger than
   * [encodeBufferMaxSize], the method will error out with [ERR_OUT_OF_MEMORY].
   */
  public var encodeBufferMaxSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEncodeBufferMaxSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setEncodeBufferMaxSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PACKETPEER, scriptIndex)
  }

  /**
   * Gets a Variant. If [allowObjects] is `true`, decoding objects is allowed.
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threats such as
   * remote code execution.
   */
  @JvmOverloads
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.getVarPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sends a [Variant] as a packet. If [fullObjects] is `true`, encoding objects is allowed (and can
   * potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public fun putVar(_var: Any?, fullObjects: Boolean = false): GodotError {
    TransferContext.writeArguments(ANY to _var, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.putVarPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets a raw packet.
   */
  public fun getPacket(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Sends a raw packet.
   */
  public fun putPacket(buffer: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.putPacketPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the error state of the last packet received (via [getPacket] and [getVar]).
   */
  public fun getPacketError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketErrorPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of packets currently available in the ring-buffer.
   */
  public fun getAvailablePacketCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailablePacketCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_var", 3442865206)

    public val putVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "put_var", 2436251611)

    public val getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_packet", 2115431945)

    public val putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "put_packet", 680677267)

    public val getPacketErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_packet_error", 3185525595)

    public val getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_available_packet_count", 3905245786)

    public val getEncodeBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_encode_buffer_max_size", 3905245786)

    public val setEncodeBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "set_encode_buffer_max_size", 1286410249)
  }
}
