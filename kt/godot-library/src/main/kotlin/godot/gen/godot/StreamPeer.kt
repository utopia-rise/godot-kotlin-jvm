// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Abstraction and base class for stream-based protocols.
 *
 * StreamPeer is an abstraction and base class for stream-based protocols (such as TCP or UNIX sockets). It provides an API for sending and receiving data through streams as raw data or strings.
 */
@GodotBaseType
open class StreamPeer : Reference() {
  /**
   * If `true`, this [godot.StreamPeer] will using big-endian format for encoding and decoding.
   */
  open var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_BIG_ENDIAN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_SET_BIG_ENDIAN, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_STREAMPEER)
  }

  /**
   * Gets a signed 16-bit value from the stream.
   */
  open fun get16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets a signed 32-bit value from the stream.
   */
  open fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets a signed 64-bit value from the stream.
   */
  open fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets a signed byte from the stream.
   */
  open fun get8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of bytes this [godot.StreamPeer] has available.
   */
  open fun getAvailableBytes(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_AVAILABLE_BYTES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a chunk data with the received bytes. The amount of bytes to be received can be requested in the `bytes` argument. If not enough bytes are available, the function will block until the desired amount is received. This function returns two values, an [enum @GlobalScope.Error] code and a data array.
   */
  open fun getData(bytes: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_DATA, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets a double-precision float from the stream.
   */
  open fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_DOUBLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Gets a single-precision float from the stream.
   */
  open fun getFloat(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_FLOAT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a chunk data with the received bytes. The amount of bytes to be received can be requested in the "bytes" argument. If not enough bytes are available, the function will return how many were actually received. This function returns two values, an [enum @GlobalScope.Error] code, and a data array.
   */
  open fun getPartialData(bytes: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to bytes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_PARTIAL_DATA, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets a string with byte-length `bytes` from the stream. If `bytes` is negative (default) the length will be read from the stream using the reverse process of [putString].
   */
  open fun getString(bytes: Long = -1): String {
    TransferContext.writeArguments(LONG to bytes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets an unsigned 16-bit value from the stream.
   */
  open fun getU16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an unsigned 32-bit value from the stream.
   */
  open fun getU32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an unsigned 64-bit value from the stream.
   */
  open fun getU64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an unsigned byte from the stream.
   */
  open fun getU8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_U8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an UTF-8 string with byte-length `bytes` from the stream (this decodes the string sent as UTF-8). If `bytes` is negative (default) the length will be read from the stream using the reverse process of [putUtf8String].
   */
  open fun getUtf8String(bytes: Long = -1): String {
    TransferContext.writeArguments(LONG to bytes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_UTF8_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets a Variant from the stream. If `allow_objects` is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Puts a signed 16-bit value into the stream.
   */
  open fun put16(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_16, NIL)
  }

  /**
   * Puts a signed 32-bit value into the stream.
   */
  open fun put32(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_32, NIL)
  }

  /**
   * Puts a signed 64-bit value into the stream.
   */
  open fun put64(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_64, NIL)
  }

  /**
   * Puts a signed byte into the stream.
   */
  open fun put8(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_8, NIL)
  }

  /**
   * Sends a chunk of data through the connection, blocking if necessary until the data is done sending. This function returns an [enum @GlobalScope.Error] code.
   */
  open fun putData(data: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_DATA, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Puts a double-precision float into the stream.
   */
  open fun putDouble(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_DOUBLE, NIL)
  }

  /**
   * Puts a single-precision float into the stream.
   */
  open fun putFloat(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_FLOAT, NIL)
  }

  /**
   * Sends a chunk of data through the connection. If all the data could not be sent at once, only part of it will. This function returns two values, an [enum @GlobalScope.Error] code and an integer, describing how much data was actually sent.
   */
  open fun putPartialData(data: PoolByteArray): VariantArray<Any?> {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_PARTIAL_DATA, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Puts a zero-terminated ASCII string into the stream prepended by a 32-bit unsigned integer representing its size.
   *
   * Note: To put an ASCII string without prepending its size, you can use [putData]:
   *
   * ```
   * 				put_data("Hello world".to_ascii())
   * 				```
   */
  open fun putString(value: String) {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_STRING, NIL)
  }

  /**
   * Puts an unsigned 16-bit value into the stream.
   */
  open fun putU16(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U16, NIL)
  }

  /**
   * Puts an unsigned 32-bit value into the stream.
   */
  open fun putU32(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U32, NIL)
  }

  /**
   * Puts an unsigned 64-bit value into the stream.
   */
  open fun putU64(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U64, NIL)
  }

  /**
   * Puts an unsigned byte into the stream.
   */
  open fun putU8(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_U8, NIL)
  }

  /**
   * Puts a zero-terminated UTF-8 string into the stream prepended by a 32 bits unsigned integer representing its size.
   *
   * Note: To put an UTF-8 string without prepending its size, you can use [putData]:
   *
   * ```
   * 				put_data("Hello world".to_utf8())
   * 				```
   */
  open fun putUtf8String(value: String) {
    TransferContext.writeArguments(STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_UTF8_STRING, NIL)
  }

  /**
   * Puts a Variant into the stream. If `full_objects` is `true` encoding objects is allowed (and can potentially include code).
   */
  open fun putVar(value: Any?, fullObjects: Boolean = false) {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEER_PUT_VAR, NIL)
  }
}
