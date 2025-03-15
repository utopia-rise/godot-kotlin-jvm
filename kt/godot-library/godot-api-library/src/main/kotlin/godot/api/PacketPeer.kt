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
import godot.core.PackedByteArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
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
  public final inline var encodeBufferMaxSize: Int
    @JvmName("encodeBufferMaxSizeProperty")
    get() = getEncodeBufferMaxSize()
    @JvmName("encodeBufferMaxSizeProperty")
    set(`value`) {
      setEncodeBufferMaxSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(441, scriptIndex)
  }

  /**
   * Gets a Variant. If [allowObjects] is `true`, decoding objects is allowed.
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threats such as
   * remote code execution.
   */
  @JvmOverloads
  public final fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(ptr, MethodBindings.getVarPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sends a [Variant] as a packet. If [fullObjects] is `true`, encoding objects is allowed (and can
   * potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public final fun putVar(`var`: Any?, fullObjects: Boolean = false): Error {
    TransferContext.writeArguments(ANY to `var`, BOOL to fullObjects)
    TransferContext.callMethod(ptr, MethodBindings.putVarPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets a raw packet.
   */
  public final fun getPacket(): PackedByteArray {
    TransferContext.callMethod(ptr, MethodBindings.getPacketPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Sends a raw packet.
   */
  public final fun putPacket(buffer: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(ptr, MethodBindings.putPacketPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the error state of the last packet received (via [getPacket] and [getVar]).
   */
  public final fun getPacketError(): Error {
    TransferContext.callMethod(ptr, MethodBindings.getPacketErrorPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of packets currently available in the ring-buffer.
   */
  public final fun getAvailablePacketCount(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getAvailablePacketCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getEncodeBufferMaxSize(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getEncodeBufferMaxSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setEncodeBufferMaxSize(maxSize: Int): Unit {
    TransferContext.writeArguments(LONG to maxSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEncodeBufferMaxSizePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_var", 3442865206)

    internal val putVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "put_var", 2436251611)

    internal val getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_packet", 2115431945)

    internal val putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "put_packet", 680677267)

    internal val getPacketErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_packet_error", 3185525595)

    internal val getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_available_packet_count", 3905245786)

    internal val getEncodeBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "get_encode_buffer_max_size", 3905245786)

    internal val setEncodeBufferMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PacketPeer", "set_encode_buffer_max_size", 1286410249)
  }
}
