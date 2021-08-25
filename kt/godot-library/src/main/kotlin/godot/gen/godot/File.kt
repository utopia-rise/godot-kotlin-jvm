// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * Type to handle file reading and writing operations.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
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
 * In the example above, the file will be saved in the user data folder as specified in the [godot.Data paths](https://docs.godotengine.org/en/3.3/tutorials/io/data_paths.html) documentation.
 *
 * **Note:** To access project resources once exported, it is recommended to use [godot.ResourceLoader] instead of the [godot.File] API, as some files are converted to engine-specific formats and their original source files might not be present in the exported PCK package.
 *
 * **Note:** Files are automatically closed only if the process exits "normally" (such as by clicking the window manager's close button or pressing **Alt + F4**). If you stop the project execution by pressing **F8** while the project is running, the file won't be closed as the game process will be killed. You can work around this by calling [flush] at regular intervals.
 */
@GodotBaseType
public open class File : Reference() {
  /**
   * If `true`, the file is read with big-endian [endianness](https://en.wikipedia.org/wiki/Endianness). If `false`, the file is read with little-endian endianness. If in doubt, leave this to `false` as most files are written with little-endian endianness.
   *
   * **Note:** [endianSwap] is only about the file format, not the CPU type. The CPU endianness doesn't affect the default endianness for files written.
   *
   * **Note:** This is always reset to `false` whenever you open the file. Therefore, you must set [endianSwap] *after* opening the file, not before.
   */
  public open var endianSwap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_ENDIAN_SWAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SET_ENDIAN_SWAP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS__FILE)
  }

  /**
   * Closes the currently opened file and prevents subsequent read/write operations. Use [flush] to persist the data to disk without closing the file.
   */
  public open fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_CLOSE, NIL)
  }

  /**
   * Returns `true` if the file cursor has read past the end of the file.
   *
   * **Note:** This function will still return `false` while at the end of the file and only activates when reading past it. This can be confusing but it conforms to how low-level file access works in all operating systems. There is always [getLen] and [getPosition] to implement a custom logic.
   */
  public open fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_EOF_REACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the file exists in the given path.
   *
   * **Note:** Many resources types are imported (e.g. textures or sound files), and their source asset will not be included in the exported game, as only the imported version is used. See [godot.ResourceLoader.exists] for an alternative approach that takes resource remapping into account.
   */
  public open fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_FILE_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Writes the file's buffer to disk. Flushing is automatically performed when the file is closed. This means you don't need to call [flush] manually before closing a file using [close]. Still, calling [flush] can be used to ensure the data is safe even if the project crashes instead of being closed gracefully.
   *
   * **Note:** Only call [flush] when you actually need it. Otherwise, it will decrease performance due to constant disk writes.
   */
  public open fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_FLUSH, NIL)
  }

  /**
   * Returns the next 16 bits from the file as an integer. See [store16] for details on what values can be stored and retrieved this way.
   */
  public open fun get16(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_16, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 32 bits from the file as an integer. See [store32] for details on what values can be stored and retrieved this way.
   */
  public open fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_32, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 64 bits from the file as an integer. See [store64] for details on what values can be stored and retrieved this way.
   */
  public open fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_64, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next 8 bits from the file as an integer. See [store8] for details on what values can be stored and retrieved this way.
   */
  public open fun get8(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_8, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the whole file as a [godot.String].
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public open fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns next `len` bytes of the file as a [godot.core.PoolByteArray].
   */
  public open fun getBuffer(len: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to len)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_BUFFER, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns the next value of the file in CSV (Comma-Separated Values) format. You can pass a different delimiter `delim` to use other than the default `","` (comma). This delimiter must be one-character long.
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public open fun getCsvLine(delim: String = ","): PoolStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_CSV_LINE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the next 64 bits from the file as a floating-point number.
   */
  public open fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_DOUBLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the last error that happened when trying to perform operations. Compare with the `ERR_FILE_*` constants from [enum Error].
   */
  public open fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_ERROR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the next 32 bits from the file as a floating-point number.
   */
  public open fun getFloat(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_FLOAT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the size of the file in bytes.
   */
  public open fun getLen(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next line of the file as a [godot.String].
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public open fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_LINE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an MD5 String representing the file at the given path or an empty [godot.String] on failure.
   */
  public open fun getMd5(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MD5, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the last time the `file` was modified in unix timestamp format or returns a [godot.String] "ERROR IN `file`". This unix timestamp can be converted to datetime by using [godot.OS.getDatetimeFromUnixTime].
   */
  public open fun getModifiedTime(`file`: String): Long {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_MODIFIED_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.String] saved in Pascal format from the file.
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public open fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PASCAL_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path as a [godot.String] for the current open file.
   */
  public open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the absolute path as a [godot.String] for the current open file.
   */
  public open fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_PATH_ABSOLUTE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the file cursor's position.
   */
  public open fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next bits from the file as a floating-point number.
   */
  public open fun getReal(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_REAL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a SHA-256 [godot.String] representing the file at the given path or an empty [godot.String] on failure.
   */
  public open fun getSha256(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_SHA256, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the next [Variant] value from the file. If `allow_objects` is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public open fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_GET_VAR, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the file is currently opened.
   */
  public open fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_IS_OPEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Opens the file for writing or reading, depending on the flags.
   */
  public open fun `open`(path: String, flags: Long): GodotError {
    TransferContext.writeArguments(STRING to path, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens a compressed file for reading or writing.
   *
   * **Note:** [openCompressed] can only read files that were saved by Godot, not third-party compression formats. See [godot.GitHub issue #28999](https://github.com/godotengine/godot/issues/28999) for a workaround.
   */
  public open fun openCompressed(
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
  public open fun openEncrypted(
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
  public open fun openEncryptedWithPass(
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
  public open fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_SEEK, NIL)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the end of the file).
   *
   * **Note:** This is an offset, so you should use negative numbers or the cursor will be at the end of the file.
   */
  public open fun seekEnd(position: Long = 0): Unit {
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
  public open fun store16(`value`: Long): Unit {
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
  public open fun store32(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_32, NIL)
  }

  /**
   * Stores an integer as 64 bits in the file.
   *
   * **Note:** The `value` must lie in the interval `[-2^63, 2^63 - 1]` (i.e. be a valid [int] value).
   */
  public open fun store64(`value`: Long): Unit {
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
  public open fun store8(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_8, NIL)
  }

  /**
   * Stores the given array of bytes in the file.
   */
  public open fun storeBuffer(buffer: PoolByteArray): Unit {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_BUFFER, NIL)
  }

  /**
   * Store the given [godot.core.PoolStringArray] in the file as a line formatted in the CSV (Comma-Separated Values) format. You can pass a different delimiter `delim` to use other than the default `","` (comma). This delimiter must be one-character long.
   *
   * Text will be encoded as UTF-8.
   */
  public open fun storeCsvLine(values: PoolStringArray, delim: String = ","): Unit {
    TransferContext.writeArguments(POOL_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_CSV_LINE, NIL)
  }

  /**
   * Stores a floating-point number as 64 bits in the file.
   */
  public open fun storeDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_DOUBLE, NIL)
  }

  /**
   * Stores a floating-point number as 32 bits in the file.
   */
  public open fun storeFloat(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_FLOAT, NIL)
  }

  /**
   * Appends `line` to the file followed by a line return character (`\n`), encoding the text as UTF-8.
   */
  public open fun storeLine(line: String): Unit {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_LINE, NIL)
  }

  /**
   * Stores the given [godot.String] as a line in the file in Pascal format (i.e. also store the length of the string).
   *
   * Text will be encoded as UTF-8.
   */
  public open fun storePascalString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_PASCAL_STRING, NIL)
  }

  /**
   * Stores a floating-point number in the file.
   */
  public open fun storeReal(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_REAL, NIL)
  }

  /**
   * Appends `string` to the file without a line return, encoding the text as UTF-8.
   */
  public open fun storeString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_STRING, NIL)
  }

  /**
   * Stores any Variant value in the file. If `full_objects` is `true`, encoding objects is allowed (and can potentially include code).
   *
   * **Note:** Not all properties are included. Only properties that are configured with the [PROPERTY_USAGE_STORAGE] flag set will be serialized. You can add a new usage flag to a property by overriding the [godot.Object.GetPropertyList] method in your class. You can also check how property usage is configured by calling [godot.Object.GetPropertyList]. See [enum PropertyUsageFlags] for the possible usage flags.
   */
  public open fun storeVar(`value`: Any?, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__FILE_STORE_VAR, NIL)
  }

  public enum class CompressionMode(
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

  public companion object {
    /**
     * Uses the [DEFLATE](https://en.wikipedia.org/wiki/DEFLATE) compression method.
     */
    public final const val COMPRESSION_DEFLATE: Long = 1

    /**
     * Uses the [godot.FastLZ](http://fastlz.org/) compression method.
     */
    public final const val COMPRESSION_FASTLZ: Long = 0

    /**
     * Uses the [gzip](https://www.gzip.org/) compression method.
     */
    public final const val COMPRESSION_GZIP: Long = 3

    /**
     * Uses the [godot.Zstandard](https://facebook.github.io/zstd/) compression method.
     */
    public final const val COMPRESSION_ZSTD: Long = 2

    /**
     * Opens the file for read operations. The cursor is positioned at the beginning of the file.
     */
    public final const val READ: Long = 1

    /**
     * Opens the file for read and write operations. Does not truncate the file. The cursor is positioned at the beginning of the file.
     */
    public final const val READ_WRITE: Long = 3

    /**
     * Opens the file for write operations. The file is created if it does not exist, and truncated if it does.
     */
    public final const val WRITE: Long = 2

    /**
     * Opens the file for read and write operations. The file is created if it does not exist, and truncated if it does. The cursor is positioned at the beginning of the file.
     */
    public final const val WRITE_READ: Long = 7
  }
}
