// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class File : Reference() {
  open var endianSwap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_ENDIAN_SWAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SET_ENDIAN_SWAP, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS__FILE)

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_CLOSE, NIL)
  }

  open fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_EOF_REACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_FILE_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun get16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun get8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getBuffer(len: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to len)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_BUFFER, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun getCsvLine(delim: String = ","): PoolStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_CSV_LINE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_DOUBLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getFloat(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_FLOAT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getLen(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getMd5(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MD5, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getModifiedTime(file: String): Long {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MODIFIED_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PASCAL_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH_ABSOLUTE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getReal(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_REAL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getSha256(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_SHA256, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_IS_OPEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun open(path: String, flags: Long): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun openCompressed(
    path: String,
    modeFlags: Long,
    compressionMode: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags, LONG to compressionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN_COMPRESSED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun openEncrypted(
    path: String,
    modeFlags: Long,
    key: PoolByteArray
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun openEncryptedWithPass(
    path: String,
    modeFlags: Long,
    pass: String
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags, STRING to pass)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN_ENCRYPTED_WITH_PASS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun seek(position: Long) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SEEK, NIL)
  }

  open fun seekEnd(position: Long = 0) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SEEK_END, NIL)
  }

  open fun store16(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_16, NIL)
  }

  open fun store32(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_32, NIL)
  }

  open fun store64(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_64, NIL)
  }

  open fun store8(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_8, NIL)
  }

  open fun storeBuffer(buffer: PoolByteArray) {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_BUFFER, NIL)
  }

  open fun storeCsvLine(values: PoolStringArray, delim: String = ",") {
    TransferContext.writeArguments(POOL_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_CSV_LINE, NIL)
  }

  open fun storeDouble(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_DOUBLE, NIL)
  }

  open fun storeFloat(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_FLOAT, NIL)
  }

  open fun storeLine(line: String) {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_LINE, NIL)
  }

  open fun storePascalString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_PASCAL_STRING, NIL)
  }

  open fun storeReal(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_REAL, NIL)
  }

  open fun storeString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_STRING, NIL)
  }

  open fun storeVar(value: Any?, fullObjects: Boolean = false) {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_VAR, NIL)
  }

  enum class CompressionMode(
    id: Long
  ) {
    COMPRESSION_FASTLZ(0),

    COMPRESSION_DEFLATE(1),

    COMPRESSION_ZSTD(2),

    COMPRESSION_GZIP(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ModeFlags(
    id: Long
  ) {
    READ(1),

    WRITE(2),

    READ_WRITE(3),

    WRITE_READ(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COMPRESSION_DEFLATE: Long = 1

    final const val COMPRESSION_FASTLZ: Long = 0

    final const val COMPRESSION_GZIP: Long = 3

    final const val COMPRESSION_ZSTD: Long = 2

    final const val READ: Long = 1

    final const val READ_WRITE: Long = 3

    final const val WRITE: Long = 2

    final const val WRITE_READ: Long = 7
  }
}
