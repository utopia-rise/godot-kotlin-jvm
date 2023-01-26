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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
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
 * [codeblocks]
 *
 * [gdscript]
 *
 * func save(content):
 *
 *     var file = FileAccess.open("user://save_game.dat", FileAccess.WRITE)
 *
 *     file.store_string(content)
 *
 *
 *
 * func load():
 *
 *     var file = FileAccess.open("user://save_game.dat", FileAccess.READ)
 *
 *     var content = file.get_as_text()
 *
 *     return content
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public void Save(string content)
 *
 * {
 *
 *     using var file = FileAccess.Open("user://save_game.dat", FileAccess.ModeFlags.Write);
 *
 *     file.StoreString(content);
 *
 * }
 *
 *
 *
 * public string Load()
 *
 * {
 *
 *     using var file = FileAccess.Open("user://save_game.dat", FileAccess.ModeFlags.Read);
 *
 *     string content = file.GetAsText();
 *
 *     return content;
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * In the example above, the file will be saved in the user data folder as specified in the [godot.Data paths]($DOCS_URL/tutorials/io/data_paths.html) documentation.
 *
 * [godot.FileAccess] will close when it's freed, which happens when it goes out of scope or when it gets assigned with `null`. In C# the reference must be disposed after we are done using it, this can be done with the `using` statement or calling the `Dispose` method directly.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var file = FileAccess.open("res://something") # File is opened and locked for use.
 *
 * file = null # File is closed.
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using var file = FileAccess.Open("res://something"); // File is opened and locked for use.
 *
 * // The using statement calls Dispose when going out of scope.
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** To access project resources once exported, it is recommended to use [godot.ResourceLoader] instead of the [godot.FileAccess] API, as some files are converted to engine-specific formats and their original source files might not be present in the exported PCK package.
 *
 * **Note:** Files are automatically closed only if the process exits "normally" (such as by clicking the window manager's close button or pressing **Alt + F4**). If you stop the project execution by pressing **F8** while the project is running, the file won't be closed as the game process will be killed. You can work around this by calling [flush] at regular intervals.
 */
@GodotBaseType
public open class FileAccess internal constructor() : RefCounted() {
  /**
   * If `true`, the file is read with big-endian [endianness](https://en.wikipedia.org/wiki/Endianness). If `false`, the file is read with little-endian endianness. If in doubt, leave this to `false` as most files are written with little-endian endianness.
   *
   * **Note:** [bigEndian] is only about the file format, not the CPU type. The CPU endianness doesn't affect the default endianness for files written.
   *
   * **Note:** This is always reset to `false` whenever you open the file. Therefore, you must set [bigEndian] *after* opening the file, not before.
   */
  public var bigEndian: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_IS_BIG_ENDIAN, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_SET_BIG_ENDIAN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILEACCESS, scriptIndex)
    return true
  }

  /**
   * Writes the file's buffer to disk. Flushing is automatically performed when the file is closed. This means you don't need to call [flush] manually before closing a file. Still, calling [flush] can be used to ensure the data is safe even if the project crashes instead of being closed gracefully.
   *
   * **Note:** Only call [flush] when you actually need it. Otherwise, it will decrease performance due to constant disk writes.
   */
  public fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_FLUSH, NIL)
  }

  /**
   * Returns the path as a [godot.String] for the current open file.
   */
  public fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_PATH, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the absolute path as a [godot.String] for the current open file.
   */
  public fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_PATH_ABSOLUTE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the file is currently opened.
   */
  public fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_IS_OPEN, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the beginning of the file).
   */
  public fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_SEEK, NIL)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the end of the file).
   *
   * **Note:** This is an offset, so you should use negative numbers or the cursor will be at the end of the file.
   */
  public fun seekEnd(position: Long = 0): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_SEEK_END, NIL)
  }

  /**
   * Returns the file cursor's position.
   */
  public fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_POSITION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the size of the file in bytes.
   */
  public fun getLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_LENGTH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the file cursor has already read past the end of the file.
   *
   * **Note:** `eof_reached() == false` cannot be used to check whether there is more data available. To loop while there is more data available, use:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * while file.get_position() < file.get_length():
   *
   *     # Read data
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * while (file.GetPosition() < file.GetLength())
   *
   * {
   *
   *     // Read data
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_EOF_REACHED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the next 8 bits from the file as an integer. See [store8] for details on what values can be stored and retrieved this way.
   */
  public fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_8, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next 16 bits from the file as an integer. See [store16] for details on what values can be stored and retrieved this way.
   */
  public fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_16, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next 32 bits from the file as an integer. See [store32] for details on what values can be stored and retrieved this way.
   */
  public fun get32(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_32, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next 64 bits from the file as an integer. See [store64] for details on what values can be stored and retrieved this way.
   */
  public fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_64, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the next 32 bits from the file as a floating-point number.
   */
  public fun getFloat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_FLOAT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the next 64 bits from the file as a floating-point number.
   */
  public fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_DOUBLE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the next bits from the file as a floating-point number.
   */
  public fun getReal(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_REAL, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns next [length] bytes of the file as a [godot.PackedByteArray].
   */
  public fun getBuffer(length: Long): PackedByteArray {
    TransferContext.writeArguments(LONG to length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_BUFFER,
        PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Returns the next line of the file as a [godot.String].
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_LINE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the next value of the file in CSV (Comma-Separated Values) format. You can pass a different delimiter [delim] to use other than the default `","` (comma). This delimiter must be one-character long, and cannot be a double quotation mark.
   *
   * Text is interpreted as being UTF-8 encoded. Text values must be enclosed in double quotes if they include the delimiter character. Double quotes within a text value can be escaped by doubling their occurrence.
   *
   * For example, the following CSV lines are valid and will be properly parsed as two strings each:
   *
   * ```
   * 				Alice,"Hello, Bob!"
   * 				Bob,Alice! What a surprise!
   * 				Alice,"I thought you'd reply with ""Hello, world""."
   * 				```
   *
   * Note how the second line can omit the enclosing quotes as it does not include the delimiter. However it *could* very well use quotes, it was only written without for demonstration purposes. The third line must use `""` for each quotation mark that needs to be interpreted as such instead of the end of a text value.
   */
  public fun getCsvLine(delim: String = ","): PackedStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_CSV_LINE,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the whole file as a [godot.String]. Text is interpreted as being UTF-8 encoded.
   *
   * If [skipCr] is `true`, carriage return characters (`\r`, CR) will be ignored when parsing the UTF-8, so that only line feed characters (`\n`, LF) represent a new line (Unix convention).
   */
  public fun getAsText(skipCr: Boolean = false): String {
    TransferContext.writeArguments(BOOL to skipCr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_AS_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the last error that happened when trying to perform operations. Compare with the `ERR_FILE_*` constants from [enum Error].
   */
  public fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_ERROR, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the next [Variant] value from the file. If [allowObjects] is `true`, decoding objects is allowed.
   *
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_VAR, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Stores an integer as 8 bits in the file.
   *
   * **Note:** The [value] should lie in the interval `[0, 255]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an example).
   */
  public fun store8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_8, NIL)
  }

  /**
   * Stores an integer as 16 bits in the file.
   *
   * **Note:** The [value] should lie in the interval `[0, 2^16 - 1]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64] or store a signed integer from the interval `[-2^15, 2^15 - 1]` (i.e. keeping one bit for the signedness) and compute its sign manually when reading. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * const MAX_15B = 1 << 15
   *
   * const MAX_16B = 1 << 16
   *
   *
   *
   * func unsigned16_to_signed(unsigned):
   *
   *     return (unsigned + MAX_15B) % MAX_16B - MAX_15B
   *
   *
   *
   * func _ready():
   *
   *     var f = FileAccess.open("user://file.dat", FileAccess.WRITE_READ)
   *
   *     f.store_16(-42) # This wraps around and stores 65494 (2^16 - 42).
   *
   *     f.store_16(121) # In bounds, will store 121.
   *
   *     f.seek(0) # Go back to start to read the stored value.
   *
   *     var read1 = f.get_16() # 65494
   *
   *     var read2 = f.get_16() # 121
   *
   *     var converted1 = unsigned16_to_signed(read1) # -42
   *
   *     var converted2 = unsigned16_to_signed(read2) # 121
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     using var f = FileAccess.Open("user://file.dat", FileAccess.ModeFlags.WriteRead);
   *
   *     f.Store16(unchecked((ushort)-42)); // This wraps around and stores 65494 (2^16 - 42).
   *
   *     f.Store16(121); // In bounds, will store 121.
   *
   *     f.Seek(0); // Go back to start to read the stored value.
   *
   *     ushort read1 = f.Get16(); // 65494
   *
   *     ushort read2 = f.Get16(); // 121
   *
   *     short converted1 = (short)read1; // -42
   *
   *     short converted2 = (short)read2; // 121
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun store16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_16, NIL)
  }

  /**
   * Stores an integer as 32 bits in the file.
   *
   * **Note:** The [value] should lie in the interval `[0, 2^32 - 1]`. Any other value will overflow and wrap around.
   *
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an example).
   */
  public fun store32(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_32, NIL)
  }

  /**
   * Stores an integer as 64 bits in the file.
   *
   * **Note:** The [value] must lie in the interval `[-2^63, 2^63 - 1]` (i.e. be a valid [int] value).
   */
  public fun store64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_64, NIL)
  }

  /**
   * Stores a floating-point number as 32 bits in the file.
   */
  public fun storeFloat(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_FLOAT, NIL)
  }

  /**
   * Stores a floating-point number as 64 bits in the file.
   */
  public fun storeDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_DOUBLE, NIL)
  }

  /**
   * Stores a floating-point number in the file.
   */
  public fun storeReal(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_REAL, NIL)
  }

  /**
   * Stores the given array of bytes in the file.
   */
  public fun storeBuffer(buffer: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_BUFFER, NIL)
  }

  /**
   * Appends [line] to the file followed by a line return character (`\n`), encoding the text as UTF-8.
   */
  public fun storeLine(line: String): Unit {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_LINE, NIL)
  }

  /**
   * Store the given [godot.PackedStringArray] in the file as a line formatted in the CSV (Comma-Separated Values) format. You can pass a different delimiter [delim] to use other than the default `","` (comma). This delimiter must be one-character long.
   *
   * Text will be encoded as UTF-8.
   */
  public fun storeCsvLine(values: PackedStringArray, delim: String = ","): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_CSV_LINE, NIL)
  }

  /**
   * Appends [string] to the file without a line return, encoding the text as UTF-8.
   *
   * **Note:** This method is intended to be used to write text files. The string is stored as a UTF-8 encoded buffer without string length or terminating zero, which means that it can't be loaded back easily. If you want to store a retrievable string in a binary file, consider using [storePascalString] instead. For retrieving strings from a text file, you can use `get_buffer(length).get_string_from_utf8()` (if you know the length) or [getAsText].
   */
  public fun storeString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_STRING, NIL)
  }

  /**
   * Stores any Variant value in the file. If [fullObjects] is `true`, encoding objects is allowed (and can potentially include code).
   *
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   *
   * **Note:** Not all properties are included. Only properties that are configured with the [PROPERTY_USAGE_STORAGE] flag set will be serialized. You can add a new usage flag to a property by overriding the [godot.Object.GetPropertyList] method in your class. You can also check how property usage is configured by calling [godot.Object.GetPropertyList]. See [enum PropertyUsageFlags] for the possible usage flags.
   */
  public fun storeVar(`value`: Any, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_VAR, NIL)
  }

  /**
   * Stores the given [godot.String] as a line in the file in Pascal format (i.e. also store the length of the string).
   *
   * Text will be encoded as UTF-8.
   */
  public fun storePascalString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_STORE_PASCAL_STRING, NIL)
  }

  /**
   * Returns a [godot.String] saved in Pascal format from the file.
   *
   * Text is interpreted as being UTF-8 encoded.
   */
  public fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_GET_PASCAL_STRING,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Closes the currently opened file and prevents subsequent read/write operations. Use [flush] to persist the data to disk without closing the file.
   *
   * **Note:** [godot.FileAccess] will automatically close when it's freed, which happens when it goes out of scope or when it gets assigned with `null`. In C# the reference must be disposed after we are done using it, this can be done with the `using` statement or calling the `Dispose` method directly.
   */
  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEACCESS_CLOSE, NIL)
  }

  public enum class ModeFlags(
    id: Long,
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

  public enum class CompressionMode(
    id: Long,
  ) {
    /**
     * Uses the [godot.FastLZ](https://fastlz.org/) compression method.
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
    COMPRESSION_BROTLI(4),
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
