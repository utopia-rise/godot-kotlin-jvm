// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class File : RefCounted() {
  public var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_IS_BIG_ENDIAN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_SET_BIG_ENDIAN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILE, scriptIndex)
    return true
  }

  public fun openEncrypted(
    path: String,
    modeFlags: File.ModeFlags,
    key: PackedByteArray
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_OPEN_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun openEncryptedWithPass(
    path: String,
    modeFlags: File.ModeFlags,
    pass: String
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, STRING to pass)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_OPEN_ENCRYPTED_WITH_PASS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun openCompressed(
    path: String,
    modeFlags: File.ModeFlags,
    compressionMode: File.CompressionMode = File.CompressionMode.COMPRESSION_FASTLZ
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, LONG to compressionMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_OPEN_COMPRESSED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun `open`(path: String, flags: File.ModeFlags): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to flags.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_FLUSH, NIL)
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_CLOSE, NIL)
  }

  public fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_PATH_ABSOLUTE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_IS_OPEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_SEEK, NIL)
  }

  public fun seekEnd(position: Long = 0): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_SEEK_END, NIL)
  }

  public fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_LENGTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_EOF_REACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun get8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun get16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getFloat(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_FLOAT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_DOUBLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getReal(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_REAL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getBuffer(length: Long): PackedByteArray {
    TransferContext.writeArguments(LONG to length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_BUFFER, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  public fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getCsvLine(delim: String = ","): PackedStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_CSV_LINE,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  public fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getMd5(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_MD5, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getSha256(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_SHA256, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public fun store8(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_8, NIL)
  }

  public fun store16(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_16, NIL)
  }

  public fun store32(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_32, NIL)
  }

  public fun store64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_64, NIL)
  }

  public fun storeFloat(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_FLOAT, NIL)
  }

  public fun storeDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_DOUBLE, NIL)
  }

  public fun storeReal(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_REAL, NIL)
  }

  public fun storeBuffer(buffer: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_BUFFER, NIL)
  }

  public fun storeLine(line: String): Unit {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_LINE, NIL)
  }

  public fun storeCsvLine(values: PackedStringArray, delim: String = ","): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_CSV_LINE, NIL)
  }

  public fun storeString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_STRING, NIL)
  }

  public fun storeVar(`value`: Any, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_VAR, NIL)
  }

  public fun storePascalString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_STORE_PASCAL_STRING, NIL)
  }

  public fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_PASCAL_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getModifiedTime(`file`: String): Long {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILE_GET_MODIFIED_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class CompressionMode(
    id: Long
  ) {
    COMPRESSION_FASTLZ(0),
    COMPRESSION_DEFLATE(1),
    COMPRESSION_ZSTD(2),
    COMPRESSION_GZIP(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ModeFlags(
    id: Long
  ) {
    READ(1),
    WRITE(2),
    READ_WRITE(3),
    WRITE_READ(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
