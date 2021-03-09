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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Type to handle file reading and writing operations.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/step_by_step/filesystem.html](https://docs.godotengine.org/en/latest/getting_started/step_by_step/filesystem.html)
 *
 * File type. This is used to permanently store data into the user device's file system and to read from it. This can be used to store game save data or player configuration files, for example.
 *
 * Here's a sample on how to write and read from a file:
 *
 * ```
 * 		func save(content):
 * 		    var file = File.new()
 * 		    file.open("user://save_game.dat", File.WRITE)
 * 		    file.store_string(content)
 * 		    file.close()
 *
 * 		func load():
 * 		    var file = File.new()
 * 		    file.open("user://save_game.dat", File.READ)
 * 		    var content = file.get_as_text()
 * 		    file.close()
 * 		    return content
 * 		```
 *
 * In the example above, the file will be saved in the user data folder as specified in the [godot.Data paths](https://docs.godotengine.org/en/latest/tutorials/io/data_paths.html) documentation.
 */
@GodotBaseType
open class File : Reference() {
  /**
   * If `true`, the file's endianness is swapped. Use this if you're dealing with files written on big-endian machines.
   *
   * **Note:** This is about the file format, not CPU type. This is always reset to `false` whenever you open the file.
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS__FILE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Closes the currently opened file.
   */
  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_CLOSE, NIL)
  }

  /**
   * Returns `true` if the file cursor has read past the end of the file.
   *
   * **Note:** This function will still return `false` while at the end of the file and only activates when reading past it. This can be confusing but it conforms to how low-level file access works in all operating systems. There is always [getLen] and [getPosition] to implement a custom logic.
   */
  open fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_EOF_REACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the file exists in the given path.
   *
   * **Note:** Many resources types are imported (e.g. textures or sound files), and that their source asset will not be included in the exported game, as only the imported version is used (in the `res://.import` folder). To check for the existence of such resources while taking into account the remapping to their imported location, use [godot.ResourceLoader.exists]. Typically, using `File.file_exists` on an imported resource would work while you are developing in the editor (the source asset is present in `res://`, but fail when exported).
   */
  open fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_FILE_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the next 16 bits from the file as an integer. See [store16] for details on what values can be stored and retrieved this way.
   */
  open fun get16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 32 bits from the file as an integer. See [store32] for details on what values can be stored and retrieved this way.
   */
  open fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 64 bits from the file as an integer. See [store64] for details on what values can be stored and retrieved this way.
   */
  open fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 8 bits from the file as an integer. See [store8] for details on what values can be stored and retrieved this way.
   */
  open fun get8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the whole file as a [godot.String].
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  open fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns next `len` bytes of the file as a [godot.core.PoolByteArray].
   */
  open fun getBuffer(len: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to len)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_BUFFER, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns the next value of the file in CSV (Comma-Separated Values) format. You can pass a different delimiter `delim` to use other than the default `","` (comma). This delimiter must be one-character long.
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  open fun getCsvLine(delim: String = ","): PoolStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_CSV_LINE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the next 64 bits from the file as a floating-point number.
   */
  open fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_DOUBLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the last error that happened when trying to perform operations. Compare with the `ERR_FILE_*` constants from [enum Error].
   */
  open fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the next 32 bits from the file as a floating-point number.
   */
  open fun getFloat(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_FLOAT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the size of the file in bytes.
   */
  open fun getLen(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next line of the file as a [godot.String].
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  open fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an MD5 String representing the file at the given path or an empty [godot.String] on failure.
   */
  open fun getMd5(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MD5, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the last time the `file` was modified in unix timestamp format or returns a [godot.String] "ERROR IN `file`". This unix timestamp can be converted to datetime by using [godot.OS.getDatetimeFromUnixTime].
   */
  open fun getModifiedTime(file: String): Long {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MODIFIED_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] saved in Pascal format from the file.
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  open fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PASCAL_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path as a [godot.String] for the current open file.
   */
  open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the absolute path as a [godot.String] for the current open file.
   */
  open fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH_ABSOLUTE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the file cursor's position.
   */
  open fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next bits from the file as a floating-point number.
   */
  open fun getReal(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_REAL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a SHA-256 [godot.String] representing the file at the given path or an empty [godot.String] on failure.
   */
  open fun getSha256(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_SHA256, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the next [Variant] value from the file. If `allow_objects` is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the file is currently opened.
   */
  open fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_IS_OPEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Opens the file for writing or reading, depending on the flags.
   */
  open fun open(path: String, flags: Long): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens a compressed file for reading or writing.
   */
  open fun openCompressed(
    path: String,
    modeFlags: Long,
    compressionMode: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags, LONG to compressionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN_COMPRESSED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens an encrypted file in write or read mode. You need to pass a binary key to encrypt/decrypt it.
   *
   * **Note:** The provided key must be 32 bytes long.
   */
  open fun openEncrypted(
    path: String,
    modeFlags: Long,
    key: PoolByteArray
  ): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to modeFlags, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens an encrypted file in write or read mode. You need to pass a password to encrypt/decrypt it.
   */
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

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the beginning of the file).
   */
  open fun seek(position: Long) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SEEK, NIL)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the end of the file).
   *
   * **Note:** This is an offset, so you should use negative numbers or the cursor will be at the end of the file.
   */
  open fun seekEnd(position: Long = 0) {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SEEK_END, NIL)
  }

  /**
   * Stores an integer as 16 bits in the file.
   *
   * **Note:** The `value` should lie in the interval `[0, 2^16 - 1]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64] or store a signed integer from the interval `[-2^15, 2^15 - 1]` (i.e. keeping one bit for the signedness) and compute its sign manually when reading. For example:
   *
   * ```
   * 				const MAX_15B = 1 << 15
   * 				const MAX_16B = 1 << 16
   *
   * 				func unsigned16_to_signed(unsigned):
   * 				    return (unsigned + MAX_15B) % MAX_16B - MAX_15B
   *
   * 				func _ready():
   * 				    var f = File.new()
   * 				    f.open("user://file.dat", File.WRITE_READ)
   * 				    f.store_16(-42) # This wraps around and stores 65494 (2^16 - 42).
   * 				    f.store_16(121) # In bounds, will store 121.
   * 				    f.seek(0) # Go back to start to read the stored value.
   * 				    var read1 = f.get_16() # 65494
   * 				    var read2 = f.get_16() # 121
   * 				    var converted1 = unsigned16_to_signed(read1) # -42
   * 				    var converted2 = unsigned16_to_signed(read2) # 121
   * 				```
   */
  open fun store16(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_16, NIL)
  }

  /**
   * Stores an integer as 32 bits in the file.
   *
   * **Note:** The `value` should lie in the interval `[0, 2^32 - 1]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an example).
   */
  open fun store32(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_32, NIL)
  }

  /**
   * Stores an integer as 64 bits in the file.
   *
   * **Note:** The `value` must lie in the interval `[-2^63, 2^63 - 1]` (i.e. be a valid [int] value).
   */
  open fun store64(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_64, NIL)
  }

  /**
   * Stores an integer as 8 bits in the file.
   *
   * **Note:** The `value` should lie in the interval `[0, 255]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an example).
   */
  open fun store8(value: Long) {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_8, NIL)
  }

  /**
   * Stores the given array of bytes in the file.
   */
  open fun storeBuffer(buffer: PoolByteArray) {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_BUFFER, NIL)
  }

  /**
   * Store the given [godot.core.PoolStringArray] in the file as a line formatted in the CSV (Comma-Separated Values) format. You can pass a different delimiter `delim` to use other than the default `","` (comma). This delimiter must be one-character long.
   *
   * Text will be encoded as UTF-8.
   */
  open fun storeCsvLine(values: PoolStringArray, delim: String = ",") {
    TransferContext.writeArguments(POOL_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_CSV_LINE, NIL)
  }

  /**
   * Stores a floating-point number as 64 bits in the file.
   */
  open fun storeDouble(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_DOUBLE, NIL)
  }

  /**
   * Stores a floating-point number as 32 bits in the file.
   */
  open fun storeFloat(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_FLOAT, NIL)
  }

  /**
   * Stores the given [godot.String] as a line in the file.
   *
   * Text will be encoded as UTF-8.
   */
  open fun storeLine(line: String) {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_LINE, NIL)
  }

  /**
   * Stores the given [godot.String] as a line in the file in Pascal format (i.e. also store the length of the string).
   *
   * Text will be encoded as UTF-8.
   */
  open fun storePascalString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_PASCAL_STRING, NIL)
  }

  /**
   * Stores a floating-point number in the file.
   */
  open fun storeReal(value: Double) {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_REAL, NIL)
  }

  /**
   * Stores the given [godot.String] in the file.
   *
   * Text will be encoded as UTF-8.
   */
  open fun storeString(string: String) {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_STRING, NIL)
  }

  /**
   * Stores any Variant value in the file. If `full_objects` is `true`, encoding objects is allowed (and can potentially include code).
   */
  open fun storeVar(value: Any?, fullObjects: Boolean = false) {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_VAR, NIL)
  }

  enum class CompressionMode(
    id: Long
  ) {
    /**
     * Uses the [godot.FastLZ](http://fastlz.org/) compression method.
     */
    COMPRESSION_FASTLZ(0),

    /**
     * Uses the [DEFLATE](https://en.wikipedia.org/wiki/DEFLATE) compression method.
     */
    COMPRESSION_DEFLATE(1),

    /**
     * Uses the [godot.Zstandard](https://facebook.github.io/zstd/) compression method.
     */
    COMPRESSION_ZSTD(2),

    /**
     * Uses the [gzip](https://www.gzip.org/) compression method.
     */
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
    /**
     * Opens the file for read operations. The cursor is positioned at the beginning of the file.
     */
    READ(1),

    /**
     * Opens the file for write operations. The file is created if it does not exist, and truncated if it does.
     */
    WRITE(2),

    /**
     * Opens the file for read and write operations. Does not truncate the file. The cursor is positioned at the beginning of the file.
     */
    READ_WRITE(3),

    /**
     * Opens the file for read and write operations. The file is created if it does not exist, and truncated if it does. The cursor is positioned at the beginning of the file.
     */
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
    /**
     * Uses the [DEFLATE](https://en.wikipedia.org/wiki/DEFLATE) compression method.
     */
    final const val COMPRESSION_DEFLATE: Long = 1

    /**
     * Uses the [godot.FastLZ](http://fastlz.org/) compression method.
     */
    final const val COMPRESSION_FASTLZ: Long = 0

    /**
     * Uses the [gzip](https://www.gzip.org/) compression method.
     */
    final const val COMPRESSION_GZIP: Long = 3

    /**
     * Uses the [godot.Zstandard](https://facebook.github.io/zstd/) compression method.
     */
    final const val COMPRESSION_ZSTD: Long = 2

    /**
     * Opens the file for read operations. The cursor is positioned at the beginning of the file.
     */
    final const val READ: Long = 1

    /**
     * Opens the file for read and write operations. Does not truncate the file. The cursor is positioned at the beginning of the file.
     */
    final const val READ_WRITE: Long = 3

    /**
     * Opens the file for write operations. The file is created if it does not exist, and truncated if it does.
     */
    final const val WRITE: Long = 2

    /**
     * Opens the file for read and write operations. The file is created if it does not exist, and truncated if it does. The cursor is positioned at the beginning of the file.
     */
    final const val WRITE_READ: Long = 7
  }
}
