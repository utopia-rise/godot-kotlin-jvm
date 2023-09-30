// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class for interacting with streams.
 *
 * StreamPeer is an abstract base class mostly used for stream-based protocols (such as TCP). It provides an API for sending and receiving data through streams as raw data or strings.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class StreamPeer internal constructor() : RefCounted() {
  /**
   * If `true`, this [godot.StreamPeer] will using big-endian format for encoding and decoding.
   */
  public var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_IS_BIG_ENDIAN_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_SET_BIG_ENDIAN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEER, scriptIndex)
    return true
  }

  /**
   * Sends a chunk of data through the connection, blocking if necessary until the data is done sending. This function returns an [enum Error] code.
   */
  public fun putData(`data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_DATA, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends a chunk of data through the connection. If all the data could not be sent at once, only part of it will. This function returns two values, an [enum Error] code and an integer, describing how much data was actually sent.
   */
  public fun putPartialData(`data`: PackedByteArray): VariantArray<Any?> {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_PARTIAL_DATA, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns a chunk data with the received bytes. The number of bytes to be received can be requested in the [bytes] argument. If not enough bytes are available, the function will block until the desired amount is received. This function returns two values, an [enum Error] code and a data array.
   */
  public fun getData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_DATA, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns a chunk data with the received bytes. The number of bytes to be received can be requested in the "bytes" argument. If not enough bytes are available, the function will return how many were actually received. This function returns two values, an [enum Error] code, and a data array.
   */
  public fun getPartialData(bytes: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_PARTIAL_DATA, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns the number of bytes this [godot.StreamPeer] has available.
   */
  public fun getAvailableBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_AVAILABLE_BYTES,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Puts a signed byte into the stream.
   */
  public fun put8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_8, NIL)
  }

  /**
   * Puts an unsigned byte into the stream.
   */
  public fun putU8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U8, NIL)
  }

  /**
   * Puts a signed 16-bit value into the stream.
   */
  public fun put16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_16, NIL)
  }

  /**
   * Puts an unsigned 16-bit value into the stream.
   */
  public fun putU16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U16, NIL)
  }

  /**
   * Puts a signed 32-bit value into the stream.
   */
  public fun put32(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_32, NIL)
  }

  /**
   * Puts an unsigned 32-bit value into the stream.
   */
  public fun putU32(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U32, NIL)
  }

  /**
   * Puts a signed 64-bit value into the stream.
   */
  public fun put64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_64, NIL)
  }

  /**
   * Puts an unsigned 64-bit value into the stream.
   */
  public fun putU64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U64, NIL)
  }

  /**
   * Puts a single-precision float into the stream.
   */
  public fun putFloat(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_FLOAT, NIL)
  }

  /**
   * Puts a double-precision float into the stream.
   */
  public fun putDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_DOUBLE, NIL)
  }

  /**
   * Puts a zero-terminated ASCII string into the stream prepended by a 32-bit unsigned integer representing its size.
   *
   * **Note:** To put an ASCII string without prepending its size, you can use [putData]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * put_data("Hello world".to_ascii_buffer())
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * PutData("Hello World".ToAsciiBuffer());
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun putString(`value`: String): Unit {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_STRING, NIL)
  }

  /**
   * Puts a zero-terminated UTF-8 string into the stream prepended by a 32 bits unsigned integer representing its size.
   *
   * **Note:** To put a UTF-8 string without prepending its size, you can use [putData]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * put_data("Hello world".to_utf8_buffer())
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * PutData("Hello World".ToUtf8Buffer());
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun putUtf8String(`value`: String): Unit {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_UTF8_STRING, NIL)
  }

  /**
   * Puts a Variant into the stream. If [fullObjects] is `true` encoding objects is allowed (and can potentially include code).
   *
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public fun putVar(`value`: Any, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_VAR, NIL)
  }

  /**
   * Gets a signed byte from the stream.
   */
  public fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_8, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets an unsigned byte from the stream.
   */
  public fun getU8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U8, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets a signed 16-bit value from the stream.
   */
  public fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_16, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets an unsigned 16-bit value from the stream.
   */
  public fun getU16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U16, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets a signed 32-bit value from the stream.
   */
  public fun get32(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_32, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets an unsigned 32-bit value from the stream.
   */
  public fun getU32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U32, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Gets a signed 64-bit value from the stream.
   */
  public fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_64, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Gets an unsigned 64-bit value from the stream.
   */
  public fun getU64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U64, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Gets a single-precision float from the stream.
   */
  public fun getFloat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_FLOAT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Gets a double-precision float from the stream.
   */
  public fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_DOUBLE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Gets an ASCII string with byte-length [bytes] from the stream. If [bytes] is negative (default) the length will be read from the stream using the reverse process of [putString].
   */
  @JvmOverloads
  public fun getString(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_STRING, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets a UTF-8 string with byte-length [bytes] from the stream (this decodes the string sent as UTF-8). If [bytes] is negative (default) the length will be read from the stream using the reverse process of [putUtf8String].
   */
  @JvmOverloads
  public fun getUtf8String(bytes: Int = -1): String {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_UTF8_STRING, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Gets a Variant from the stream. If [allowObjects] is `true`, decoding objects is allowed.
   *
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  @JvmOverloads
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_VAR, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object
}
