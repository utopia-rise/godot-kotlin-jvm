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
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * StreamPeer is an abstract base class mostly used for stream-based protocols (such as TCP). It
 * provides an API for sending and receiving data through streams as raw data or strings.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public abstract class StreamPeer : RefCounted() {
  /**
   * If `true`, this [StreamPeer] will using big-endian format for encoding and decoding.
   */
  public final inline var bigEndian: Boolean
    @JvmName("bigEndianProperty")
    get() = isBigEndianEnabled()
    @JvmName("bigEndianProperty")
    set(`value`) {
      setBigEndian(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(650, scriptIndex)
  }

  /**
   * Sends a chunk of data through the connection, blocking if necessary until the data is done
   * sending. This function returns an [Error] code.
   */
  public final fun putData(`data`: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.putDataPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends a chunk of data through the connection. If all the data could not be sent at once, only
   * part of it will. This function returns two values, an [Error] code and an integer, describing how
   * much data was actually sent.
   */
  public final fun putPartialData(`data`: PackedByteArray): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.putPartialDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns a chunk data with the received bytes. The number of bytes to be received can be
   * requested in the [bytes] argument. If not enough bytes are available, the function will block
   * until the desired amount is received. This function returns two values, an [Error] code and a data
   * array.
   */
  public final fun getData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns a chunk data with the received bytes. The number of bytes to be received can be
   * requested in the [bytes] argument. If not enough bytes are available, the function will return how
   * many were actually received. This function returns two values: an [Error] code and a data array.
   */
  public final fun getPartialData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPartialDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns the number of bytes this [StreamPeer] has available.
   */
  public final fun getAvailableBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvailableBytesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBigEndian(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBigEndianPtr, NIL)
  }

  public final fun isBigEndianEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBigEndianEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Puts a signed byte into the stream.
   */
  public final fun put8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.put8Ptr, NIL)
  }

  /**
   * Puts an unsigned byte into the stream.
   */
  public final fun putU8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.putU8Ptr, NIL)
  }

  /**
   * Puts a signed 16-bit value into the stream.
   */
  public final fun put16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.put16Ptr, NIL)
  }

  /**
   * Puts an unsigned 16-bit value into the stream.
   */
  public final fun putU16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.putU16Ptr, NIL)
  }

  /**
   * Puts a signed 32-bit value into the stream.
   */
  public final fun put32(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.put32Ptr, NIL)
  }

  /**
   * Puts an unsigned 32-bit value into the stream.
   */
  public final fun putU32(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(ptr, MethodBindings.putU32Ptr, NIL)
  }

  /**
   * Puts a signed 64-bit value into the stream.
   */
  public final fun put64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(ptr, MethodBindings.put64Ptr, NIL)
  }

  /**
   * Puts an unsigned 64-bit value into the stream.
   */
  public final fun putU64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(ptr, MethodBindings.putU64Ptr, NIL)
  }

  /**
   * Puts a half-precision float into the stream.
   */
  public final fun putHalf(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.putHalfPtr, NIL)
  }

  /**
   * Puts a single-precision float into the stream.
   */
  public final fun putFloat(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.putFloatPtr, NIL)
  }

  /**
   * Puts a double-precision float into the stream.
   */
  public final fun putDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.putDoublePtr, NIL)
  }

  /**
   * Puts a zero-terminated ASCII string into the stream prepended by a 32-bit unsigned integer
   * representing its size.
   *
   * **Note:** To put an ASCII string without prepending its size, you can use [putData]:
   *
   * ```gdscript
   * //gdscript
   * put_data("Hello world".to_ascii_buffer())
   * ```
   *
   * ```csharp
   * //csharp
   * PutData("Hello World".ToAsciiBuffer());
   * ```
   */
  public final fun putString(`value`: String): Unit {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(ptr, MethodBindings.putStringPtr, NIL)
  }

  /**
   * Puts a zero-terminated UTF-8 string into the stream prepended by a 32 bits unsigned integer
   * representing its size.
   *
   * **Note:** To put a UTF-8 string without prepending its size, you can use [putData]:
   *
   * ```gdscript
   * //gdscript
   * put_data("Hello world".to_utf8_buffer())
   * ```
   *
   * ```csharp
   * //csharp
   * PutData("Hello World".ToUtf8Buffer());
   * ```
   */
  public final fun putUtf8String(`value`: String): Unit {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(ptr, MethodBindings.putUtf8StringPtr, NIL)
  }

  /**
   * Puts a Variant into the stream. If [fullObjects] is `true` encoding objects is allowed (and can
   * potentially include code).
   *
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public final fun putVar(`value`: Any?, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(ptr, MethodBindings.putVarPtr, NIL)
  }

  /**
   * Gets a signed byte from the stream.
   */
  public final fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.get8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets an unsigned byte from the stream.
   */
  public final fun getU8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getU8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets a signed 16-bit value from the stream.
   */
  public final fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.get16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets an unsigned 16-bit value from the stream.
   */
  public final fun getU16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getU16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets a signed 32-bit value from the stream.
   */
  public final fun get32(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.get32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets an unsigned 32-bit value from the stream.
   */
  public final fun getU32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getU32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets a signed 64-bit value from the stream.
   */
  public final fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.get64Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets an unsigned 64-bit value from the stream.
   */
  public final fun getU64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getU64Ptr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets a half-precision float from the stream.
   */
  public final fun getHalf(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHalfPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Gets a single-precision float from the stream.
   */
  public final fun getFloat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFloatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Gets a double-precision float from the stream.
   */
  public final fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDoublePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Gets an ASCII string with byte-length [bytes] from the stream. If [bytes] is negative (default)
   * the length will be read from the stream using the reverse process of [putString].
   */
  @JvmOverloads
  public final fun getString(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Gets a UTF-8 string with byte-length [bytes] from the stream (this decodes the string sent as
   * UTF-8). If [bytes] is negative (default) the length will be read from the stream using the reverse
   * process of [putUtf8String].
   */
  @JvmOverloads
  public final fun getUtf8String(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getUtf8StringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Gets a Variant from the stream. If [allowObjects] is `true`, decoding objects is allowed.
   *
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   *
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

  public companion object

  public object MethodBindings {
    internal val putDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_data", 680677267)

    internal val putPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_partial_data", 2934048347)

    internal val getDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_data", 1171824711)

    internal val getPartialDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_partial_data", 1171824711)

    internal val getAvailableBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_available_bytes", 3905245786)

    internal val setBigEndianPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "set_big_endian", 2586408642)

    internal val isBigEndianEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "is_big_endian_enabled", 36873697)

    internal val put8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "put_8", 1286410249)

    internal val putU8Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_u8", 1286410249)

    internal val put16Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_16", 1286410249)

    internal val putU16Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_u16", 1286410249)

    internal val put32Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_32", 1286410249)

    internal val putU32Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_u32", 1286410249)

    internal val put64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_64", 1286410249)

    internal val putU64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_u64", 1286410249)

    internal val putHalfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_half", 373806689)

    internal val putFloatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_float", 373806689)

    internal val putDoublePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_double", 373806689)

    internal val putStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_string", 83702148)

    internal val putUtf8StringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_utf8_string", 83702148)

    internal val putVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "put_var", 738511890)

    internal val get8Ptr: VoidPtr = TypeManager.getMethodBindPtr("StreamPeer", "get_8", 2455072627)

    internal val getU8Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_u8", 2455072627)

    internal val get16Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_16", 2455072627)

    internal val getU16Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_u16", 2455072627)

    internal val get32Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_32", 2455072627)

    internal val getU32Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_u32", 2455072627)

    internal val get64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_64", 2455072627)

    internal val getU64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_u64", 2455072627)

    internal val getHalfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_half", 191475506)

    internal val getFloatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_float", 191475506)

    internal val getDoublePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_double", 191475506)

    internal val getStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_string", 2309358862)

    internal val getUtf8StringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_utf8_string", 2309358862)

    internal val getVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeer", "get_var", 3442865206)
  }
}
