// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
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
    Internals.callConstructor(this, ENGINE_CLASS_PACKETPEER_INDEX, scriptIndex)
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
    Internals.writeArguments(BOOL to allowObjects)
    Internals.callMethod(rawPtr, MethodBindings.getVarPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sends a [Variant] as a packet. If [fullObjects] is `true`, encoding objects is allowed (and can
   * potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public final fun putVar(`var`: Any?, fullObjects: Boolean = false): Error {
    Internals.writeArguments(ANY to `var`, BOOL to fullObjects)
    Internals.callMethod(rawPtr, MethodBindings.putVarPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Gets a raw packet.
   */
  public final fun getPacket(): PackedByteArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPacketPtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Sends a raw packet.
   */
  public final fun putPacket(buffer: PackedByteArray): Error {
    Internals.writeArguments(PACKED_BYTE_ARRAY to buffer)
    Internals.callMethod(rawPtr, MethodBindings.putPacketPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the error state of the last packet received (via [getPacket] and [getVar]).
   */
  public final fun getPacketError(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPacketErrorPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of packets currently available in the ring-buffer.
   */
  public final fun getAvailablePacketCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvailablePacketCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getEncodeBufferMaxSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEncodeBufferMaxSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setEncodeBufferMaxSize(maxSize: Int): Unit {
    Internals.writeArguments(LONG to maxSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setEncodeBufferMaxSizePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getVarPtr: VoidPtr = Internals.getMethodBindPtr("PacketPeer", "get_var", 3442865206)

    public val putVarPtr: VoidPtr = Internals.getMethodBindPtr("PacketPeer", "put_var", 2436251611)

    public val getPacketPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "get_packet", 2115431945)

    public val putPacketPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "put_packet", 680677267)

    public val getPacketErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "get_packet_error", 3185525595)

    public val getAvailablePacketCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "get_available_packet_count", 3905245786)

    public val getEncodeBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "get_encode_buffer_max_size", 3905245786)

    public val setEncodeBufferMaxSizePtr: VoidPtr =
        Internals.getMethodBindPtr("PacketPeer", "set_encode_buffer_max_size", 1286410249)
  }
}
