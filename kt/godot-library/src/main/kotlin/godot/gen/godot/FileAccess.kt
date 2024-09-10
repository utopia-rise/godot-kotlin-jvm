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
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This class can be used to permanently store data in the user device's file system and to read
 * from it. This is useful for store game save data or player configuration files.
 * Here's a sample on how to write and read from a file:
 *
 * gdscript:
 * ```gdscript
 * func save_to_file(content):
 *     var file = FileAccess.open("user://save_game.dat", FileAccess.WRITE)
 *     file.store_string(content)
 *
 * func load_from_file():
 *     var file = FileAccess.open("user://save_game.dat", FileAccess.READ)
 *     var content = file.get_as_text()
 *     return content
 * ```
 * csharp:
 * ```csharp
 * public void SaveToFile(string content)
 * {
 *     using var file = FileAccess.Open("user://save_game.dat", FileAccess.ModeFlags.Write);
 *     file.StoreString(content);
 * }
 *
 * public string LoadFromFile()
 * {
 *     using var file = FileAccess.Open("user://save_game.dat", FileAccess.ModeFlags.Read);
 *     string content = file.GetAsText();
 *     return content;
 * }
 * ```
 *
 * In the example above, the file will be saved in the user data folder as specified in the
 * [url=$DOCS_URL/tutorials/io/data_paths.html]Data paths[/url] documentation.
 * [FileAccess] will close when it's freed, which happens when it goes out of scope or when it gets
 * assigned with `null`. [close] can be used to close it before then explicitly. In C# the reference
 * must be disposed manually, which can be done with the `using` statement or by calling the `Dispose`
 * method directly.
 * **Note:** To access project resources once exported, it is recommended to use [ResourceLoader]
 * instead of [FileAccess], as some files are converted to engine-specific formats and their original
 * source files might not be present in the exported PCK package.
 * **Note:** Files are automatically closed only if the process exits "normally" (such as by
 * clicking the window manager's close button or pressing **Alt + F4**). If you stop the project
 * execution by pressing **F8** while the project is running, the file won't be closed as the game
 * process will be killed. You can work around this by calling [flush] at regular intervals.
 */
@GodotBaseType
public open class FileAccess internal constructor() : RefCounted() {
  /**
   * If `true`, the file is read with big-endian
   * [url=https://en.wikipedia.org/wiki/Endianness]endianness[/url]. If `false`, the file is read with
   * little-endian endianness. If in doubt, leave this to `false` as most files are written with
   * little-endian endianness.
   * **Note:** [bigEndian] is only about the file format, not the CPU type. The CPU endianness
   * doesn't affect the default endianness for files written.
   * **Note:** This is always reset to `false` whenever you open the file. Therefore, you must set
   * [bigEndian] *after* opening the file, not before.
   */
  public final inline var bigEndian: Boolean
    @JvmName("bigEndianProperty")
    get() = isBigEndian()
    @JvmName("bigEndianProperty")
    set(`value`) {
      setBigEndian(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_FILEACCESS, scriptIndex)
  }

  /**
   * Resizes the file to a specified length. The file must be open in a mode that permits writing.
   * If the file is extended, NUL characters are appended. If the file is truncated, all data from the
   * end file to the original length of the file is lost.
   */
  public final fun resize(length: Long): GodotError {
    TransferContext.writeArguments(LONG to length)
    TransferContext.callMethod(rawPtr, MethodBindings.resizePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Writes the file's buffer to disk. Flushing is automatically performed when the file is closed.
   * This means you don't need to call [flush] manually before closing a file. Still, calling [flush]
   * can be used to ensure the data is safe even if the project crashes instead of being closed
   * gracefully.
   * **Note:** Only call [flush] when you actually need it. Otherwise, it will decrease performance
   * due to constant disk writes.
   */
  public final fun flush(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.flushPtr, NIL)
  }

  /**
   * Returns the path as a [String] for the current open file.
   */
  public final fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the absolute path as a [String] for the current open file.
   */
  public final fun getPathAbsolute(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathAbsolutePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the file is currently opened.
   */
  public final fun isOpen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOpenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the beginning
   * of the file).
   */
  public final fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Changes the file reading/writing cursor to the specified position (in bytes from the end of the
   * file).
   * **Note:** This is an offset, so you should use negative numbers or the cursor will be at the
   * end of the file.
   */
  @JvmOverloads
  public final fun seekEnd(position: Long = 0): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, MethodBindings.seekEndPtr, NIL)
  }

  /**
   * Returns the file cursor's position.
   */
  public final fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the size of the file in bytes.
   */
  public final fun getLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the file cursor has already read past the end of the file.
   * **Note:** `eof_reached() == false` cannot be used to check whether there is more data
   * available. To loop while there is more data available, use:
   *
   * gdscript:
   * ```gdscript
   * while file.get_position() < file.get_length():
   *     # Read data
   * ```
   * csharp:
   * ```csharp
   * while (file.GetPosition() < file.GetLength())
   * {
   *     // Read data
   * }
   * ```
   */
  public final fun eofReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.eofReachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the next 8 bits from the file as an integer. See [store8] for details on what values
   * can be stored and retrieved this way.
   */
  public final fun get8(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get8Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next 16 bits from the file as an integer. See [store16] for details on what values
   * can be stored and retrieved this way.
   */
  public final fun get16(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get16Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next 32 bits from the file as an integer. See [store32] for details on what values
   * can be stored and retrieved this way.
   */
  public final fun get32(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get32Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the next 64 bits from the file as an integer. See [store64] for details on what values
   * can be stored and retrieved this way.
   */
  public final fun get64(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.get64Ptr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the next 32 bits from the file as a floating-point number.
   */
  public final fun getFloat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFloatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the next 64 bits from the file as a floating-point number.
   */
  public final fun getDouble(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDoublePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the next bits from the file as a floating-point number.
   */
  public final fun getReal(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRealPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns next [length] bytes of the file as a [PackedByteArray].
   */
  public final fun getBuffer(length: Long): PackedByteArray {
    TransferContext.writeArguments(LONG to length)
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Returns the next line of the file as a [String]. The returned string doesn't include newline
   * (`\n`) or carriage return (`\r`) characters, but does include any other leading or trailing
   * whitespace.
   * Text is interpreted as being UTF-8 encoded.
   */
  public final fun getLine(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the next value of the file in CSV (Comma-Separated Values) format. You can pass a
   * different delimiter [delim] to use other than the default `","` (comma). This delimiter must be
   * one-character long, and cannot be a double quotation mark.
   * Text is interpreted as being UTF-8 encoded. Text values must be enclosed in double quotes if
   * they include the delimiter character. Double quotes within a text value can be escaped by doubling
   * their occurrence.
   * For example, the following CSV lines are valid and will be properly parsed as two strings each:
   * [codeblock lang=text]
   * Alice,"Hello, Bob!"
   * Bob,Alice! What a surprise!
   * Alice,"I thought you'd reply with ""Hello, world""."
   * [/codeblock]
   * Note how the second line can omit the enclosing quotes as it does not include the delimiter.
   * However it *could* very well use quotes, it was only written without for demonstration purposes.
   * The third line must use `""` for each quotation mark that needs to be interpreted as such instead
   * of the end of a text value.
   */
  @JvmOverloads
  public final fun getCsvLine(delim: String = ","): PackedStringArray {
    TransferContext.writeArguments(STRING to delim)
    TransferContext.callMethod(rawPtr, MethodBindings.getCsvLinePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the whole file as a [String]. Text is interpreted as being UTF-8 encoded.
   * If [skipCr] is `true`, carriage return characters (`\r`, CR) will be ignored when parsing the
   * UTF-8, so that only line feed characters (`\n`, LF) represent a new line (Unix convention).
   */
  @JvmOverloads
  public final fun getAsText(skipCr: Boolean = false): String {
    TransferContext.writeArguments(BOOL to skipCr)
    TransferContext.callMethod(rawPtr, MethodBindings.getAsTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public final fun isBigEndian(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBigEndianPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setBigEndian(bigEndian: Boolean): Unit {
    TransferContext.writeArguments(BOOL to bigEndian)
    TransferContext.callMethod(rawPtr, MethodBindings.setBigEndianPtr, NIL)
  }

  /**
   * Returns the last error that happened when trying to perform operations. Compare with the
   * `ERR_FILE_*` constants from [Error].
   */
  public final fun getError(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getErrorPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the next [Variant] value from the file. If [allowObjects] is `true`, decoding objects
   * is allowed.
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threats such as
   * remote code execution.
   */
  @JvmOverloads
  public final fun getVar(allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.getVarPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Stores an integer as 8 bits in the file.
   * **Note:** The [value] should lie in the interval `[0, 255]`. Any other value will overflow and
   * wrap around.
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an
   * example).
   */
  public final fun store8(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.store8Ptr, NIL)
  }

  /**
   * Stores an integer as 16 bits in the file.
   * **Note:** The [value] should lie in the interval `[0, 2^16 - 1]`. Any other value will overflow
   * and wrap around.
   * To store a signed integer, use [store64] or store a signed integer from the interval `[-2^15,
   * 2^15 - 1]` (i.e. keeping one bit for the signedness) and compute its sign manually when reading.
   * For example:
   *
   * gdscript:
   * ```gdscript
   * const MAX_15B = 1 << 15
   * const MAX_16B = 1 << 16
   *
   * func unsigned16_to_signed(unsigned):
   *     return (unsigned + MAX_15B) &#37; MAX_16B - MAX_15B
   *
   * func _ready():
   *     var f = FileAccess.open("user://file.dat", FileAccess.WRITE_READ)
   *     f.store_16(-42) # This wraps around and stores 65494 (2^16 - 42).
   *     f.store_16(121) # In bounds, will store 121.
   *     f.seek(0) # Go back to start to read the stored value.
   *     var read1 = f.get_16() # 65494
   *     var read2 = f.get_16() # 121
   *     var converted1 = unsigned16_to_signed(read1) # -42
   *     var converted2 = unsigned16_to_signed(read2) # 121
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     using var f = FileAccess.Open("user://file.dat", FileAccess.ModeFlags.WriteRead);
   *     f.Store16(unchecked((ushort)-42)); // This wraps around and stores 65494 (2^16 - 42).
   *     f.Store16(121); // In bounds, will store 121.
   *     f.Seek(0); // Go back to start to read the stored value.
   *     ushort read1 = f.Get16(); // 65494
   *     ushort read2 = f.Get16(); // 121
   *     short converted1 = (short)read1; // -42
   *     short converted2 = (short)read2; // 121
   * }
   * ```
   */
  public final fun store16(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.store16Ptr, NIL)
  }

  /**
   * Stores an integer as 32 bits in the file.
   * **Note:** The [value] should lie in the interval `[0, 2^32 - 1]`. Any other value will overflow
   * and wrap around.
   * To store a signed integer, use [store64], or convert it manually (see [store16] for an
   * example).
   */
  public final fun store32(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.store32Ptr, NIL)
  }

  /**
   * Stores an integer as 64 bits in the file.
   * **Note:** The [value] must lie in the interval `[-2^63, 2^63 - 1]` (i.e. be a valid [int]
   * value).
   */
  public final fun store64(`value`: Long): Unit {
    TransferContext.writeArguments(LONG to value)
    TransferContext.callMethod(rawPtr, MethodBindings.store64Ptr, NIL)
  }

  /**
   * Stores a floating-point number as 32 bits in the file.
   */
  public final fun storeFloat(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.storeFloatPtr, NIL)
  }

  /**
   * Stores a floating-point number as 64 bits in the file.
   */
  public final fun storeDouble(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.storeDoublePtr, NIL)
  }

  /**
   * Stores a floating-point number in the file.
   */
  public final fun storeReal(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.storeRealPtr, NIL)
  }

  /**
   * Stores the given array of bytes in the file.
   */
  public final fun storeBuffer(buffer: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
    TransferContext.callMethod(rawPtr, MethodBindings.storeBufferPtr, NIL)
  }

  /**
   * Appends [line] to the file followed by a line return character (`\n`), encoding the text as
   * UTF-8.
   */
  public final fun storeLine(line: String): Unit {
    TransferContext.writeArguments(STRING to line)
    TransferContext.callMethod(rawPtr, MethodBindings.storeLinePtr, NIL)
  }

  /**
   * Store the given [PackedStringArray] in the file as a line formatted in the CSV (Comma-Separated
   * Values) format. You can pass a different delimiter [delim] to use other than the default `","`
   * (comma). This delimiter must be one-character long.
   * Text will be encoded as UTF-8.
   */
  @JvmOverloads
  public final fun storeCsvLine(values: PackedStringArray, delim: String = ","): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to values, STRING to delim)
    TransferContext.callMethod(rawPtr, MethodBindings.storeCsvLinePtr, NIL)
  }

  /**
   * Appends [string] to the file without a line return, encoding the text as UTF-8.
   * **Note:** This method is intended to be used to write text files. The string is stored as a
   * UTF-8 encoded buffer without string length or terminating zero, which means that it can't be
   * loaded back easily. If you want to store a retrievable string in a binary file, consider using
   * [storePascalString] instead. For retrieving strings from a text file, you can use
   * `get_buffer(length).get_string_from_utf8()` (if you know the length) or [getAsText].
   */
  public final fun storeString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.storeStringPtr, NIL)
  }

  /**
   * Stores any Variant value in the file. If [fullObjects] is `true`, encoding objects is allowed
   * (and can potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   * **Note:** Not all properties are included. Only properties that are configured with the
   * [PROPERTY_USAGE_STORAGE] flag set will be serialized. You can add a new usage flag to a property
   * by overriding the [Object.GetPropertyList] method in your class. You can also check how property
   * usage is configured by calling [Object.GetPropertyList]. See [PropertyUsageFlags] for the possible
   * usage flags.
   */
  @JvmOverloads
  public final fun storeVar(`value`: Any?, fullObjects: Boolean = false): Unit {
    TransferContext.writeArguments(ANY to value, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.storeVarPtr, NIL)
  }

  /**
   * Stores the given [String] as a line in the file in Pascal format (i.e. also store the length of
   * the string).
   * Text will be encoded as UTF-8.
   */
  public final fun storePascalString(string: String): Unit {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.storePascalStringPtr, NIL)
  }

  /**
   * Returns a [String] saved in Pascal format from the file.
   * Text is interpreted as being UTF-8 encoded.
   */
  public final fun getPascalString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPascalStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Closes the currently opened file and prevents subsequent read/write operations. Use [flush] to
   * persist the data to disk without closing the file.
   * **Note:** [FileAccess] will automatically close when it's freed, which happens when it goes out
   * of scope or when it gets assigned with `null`. In C# the reference must be disposed after we are
   * done using it, this can be done with the `using` statement or calling the `Dispose` method
   * directly.
   */
  public final fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public enum class ModeFlags(
    id: Long,
  ) {
    /**
     * Opens the file for read operations. The cursor is positioned at the beginning of the file.
     */
    READ(1),
    /**
     * Opens the file for write operations. The file is created if it does not exist, and truncated
     * if it does.
     * **Note:** When creating a file it must be in an already existing directory. To recursively
     * create directories for a file path, see [DirAccess.makeDirRecursive].
     */
    WRITE(2),
    /**
     * Opens the file for read and write operations. Does not truncate the file. The cursor is
     * positioned at the beginning of the file.
     */
    READ_WRITE(3),
    /**
     * Opens the file for read and write operations. The file is created if it does not exist, and
     * truncated if it does. The cursor is positioned at the beginning of the file.
     * **Note:** When creating a file it must be in an already existing directory. To recursively
     * create directories for a file path, see [DirAccess.makeDirRecursive].
     */
    WRITE_READ(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ModeFlags = entries.single { it.id == `value` }
    }
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    /**
     * Uses the [url=https://fastlz.org/]FastLZ[/url] compression method.
     */
    COMPRESSION_FASTLZ(0),
    /**
     * Uses the [url=https://en.wikipedia.org/wiki/DEFLATE]DEFLATE[/url] compression method.
     */
    COMPRESSION_DEFLATE(1),
    /**
     * Uses the [url=https://facebook.github.io/zstd/]Zstandard[/url] compression method.
     */
    COMPRESSION_ZSTD(2),
    /**
     * Uses the [url=https://www.gzip.org/]gzip[/url] compression method.
     */
    COMPRESSION_GZIP(3),
    /**
     * Uses the [url=https://github.com/google/brotli]brotli[/url] compression method (only
     * decompression is supported).
     */
    COMPRESSION_BROTLI(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressionMode = entries.single { it.id == `value` }
    }
  }

  public sealed interface UnixPermissionFlags {
    public val flag: Long

    public infix fun or(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): UnixPermissionFlags = UnixPermissionFlagsValue(flag.or(other))

    public infix fun xor(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.xor(other))

    public infix fun and(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.and(other))

    public operator fun plus(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.plus(other))

    public operator fun minus(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.minus(other))

    public operator fun times(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.times(other))

    public operator fun div(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.div(other))

    public operator fun rem(other: UnixPermissionFlags): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): UnixPermissionFlags =
        UnixPermissionFlagsValue(flag.rem(other))

    public fun unaryPlus(): UnixPermissionFlags = UnixPermissionFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): UnixPermissionFlags = UnixPermissionFlagsValue(flag.unaryMinus())

    public fun inv(): UnixPermissionFlags = UnixPermissionFlagsValue(flag.inv())

    public infix fun shl(bits: Int): UnixPermissionFlags = UnixPermissionFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): UnixPermissionFlags = UnixPermissionFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): UnixPermissionFlags = UnixPermissionFlagsValue(flag ushr bits)

    public companion object {
      public val UNIX_READ_OWNER: UnixPermissionFlags = UnixPermissionFlagsValue(256)

      public val UNIX_WRITE_OWNER: UnixPermissionFlags = UnixPermissionFlagsValue(128)

      public val UNIX_EXECUTE_OWNER: UnixPermissionFlags = UnixPermissionFlagsValue(64)

      public val UNIX_READ_GROUP: UnixPermissionFlags = UnixPermissionFlagsValue(32)

      public val UNIX_WRITE_GROUP: UnixPermissionFlags = UnixPermissionFlagsValue(16)

      public val UNIX_EXECUTE_GROUP: UnixPermissionFlags = UnixPermissionFlagsValue(8)

      public val UNIX_READ_OTHER: UnixPermissionFlags = UnixPermissionFlagsValue(4)

      public val UNIX_WRITE_OTHER: UnixPermissionFlags = UnixPermissionFlagsValue(2)

      public val UNIX_EXECUTE_OTHER: UnixPermissionFlags = UnixPermissionFlagsValue(1)

      public val UNIX_SET_USER_ID: UnixPermissionFlags = UnixPermissionFlagsValue(2048)

      public val UNIX_SET_GROUP_ID: UnixPermissionFlags = UnixPermissionFlagsValue(1024)

      public val UNIX_RESTRICTED_DELETE: UnixPermissionFlags = UnixPermissionFlagsValue(512)
    }
  }

  @JvmInline
  internal value class UnixPermissionFlagsValue internal constructor(
    public override val flag: Long,
  ) : UnixPermissionFlags

  public companion object {
    /**
     * Creates a new [FileAccess] object and opens the file for writing or reading, depending on the
     * flags.
     * Returns `null` if opening the file failed. You can use [getOpenError] to check the error that
     * occurred.
     */
    public final fun `open`(path: String, flags: ModeFlags): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to flags.id)
      TransferContext.callMethod(0, MethodBindings.openPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    /**
     * Creates a new [FileAccess] object and opens an encrypted file in write or read mode. You need
     * to pass a binary key to encrypt/decrypt it.
     * **Note:** The provided key must be 32 bytes long.
     * Returns `null` if opening the file failed. You can use [getOpenError] to check the error that
     * occurred.
     */
    public final fun openEncrypted(
      path: String,
      modeFlags: ModeFlags,
      key: PackedByteArray,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, PACKED_BYTE_ARRAY to key)
      TransferContext.callMethod(0, MethodBindings.openEncryptedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    /**
     * Creates a new [FileAccess] object and opens an encrypted file in write or read mode. You need
     * to pass a password to encrypt/decrypt it.
     * Returns `null` if opening the file failed. You can use [getOpenError] to check the error that
     * occurred.
     */
    public final fun openEncryptedWithPass(
      path: String,
      modeFlags: ModeFlags,
      pass: String,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, STRING to pass)
      TransferContext.callMethod(0, MethodBindings.openEncryptedWithPassPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    /**
     * Creates a new [FileAccess] object and opens a compressed file for reading or writing.
     * **Note:** [openCompressed] can only read files that were saved by Godot, not third-party
     * compression formats. See [url=https://github.com/godotengine/godot/issues/28999]GitHub issue
     * #28999[/url] for a workaround.
     * Returns `null` if opening the file failed. You can use [getOpenError] to check the error that
     * occurred.
     */
    @JvmOverloads
    public final fun openCompressed(
      path: String,
      modeFlags: ModeFlags,
      compressionMode: CompressionMode = FileAccess.CompressionMode.COMPRESSION_FASTLZ,
    ): FileAccess? {
      TransferContext.writeArguments(STRING to path, LONG to modeFlags.id, LONG to compressionMode.id)
      TransferContext.callMethod(0, MethodBindings.openCompressedPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as FileAccess?)
    }

    /**
     * Returns the result of the last [open] call in the current thread.
     */
    public final fun getOpenError(): GodotError {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getOpenErrorPtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Returns the whole [path] file contents as a [PackedByteArray] without any decoding.
     * Returns an empty [PackedByteArray] if an error occurred while opening the file. You can use
     * [getOpenError] to check the error that occurred.
     */
    public final fun getFileAsBytes(path: String): PackedByteArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFileAsBytesPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }

    /**
     * Returns the whole [path] file contents as a [String]. Text is interpreted as being UTF-8
     * encoded.
     * Returns an empty [String] if an error occurred while opening the file. You can use
     * [getOpenError] to check the error that occurred.
     */
    public final fun getFileAsString(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFileAsStringPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    /**
     * Returns an MD5 String representing the file at the given path or an empty [String] on
     * failure.
     */
    public final fun getMd5(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getMd5Ptr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    /**
     * Returns an SHA-256 [String] representing the file at the given path or an empty [String] on
     * failure.
     */
    public final fun getSha256(path: String): String {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getSha256Ptr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    /**
     * Returns `true` if the file exists in the given path.
     * **Note:** Many resources types are imported (e.g. textures or sound files), and their source
     * asset will not be included in the exported game, as only the imported version is used. See
     * [ResourceLoader.exists] for an alternative approach that takes resource remapping into account.
     * For a non-static, relative equivalent, use [DirAccess.fileExists].
     */
    public final fun fileExists(path: String): Boolean {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.fileExistsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

    /**
     * Returns the last time the [file] was modified in Unix timestamp format, or `0` on error. This
     * Unix timestamp can be converted to another format using the [Time] singleton.
     */
    public final fun getModifiedTime(`file`: String): Long {
      TransferContext.writeArguments(STRING to file)
      TransferContext.callMethod(0, MethodBindings.getModifiedTimePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }

    /**
     * Returns file UNIX permissions.
     * **Note:** This method is implemented on iOS, Linux/BSD, and macOS.
     */
    public final fun getUnixPermissions(`file`: String): UnixPermissionFlags {
      TransferContext.writeArguments(STRING to file)
      TransferContext.callMethod(0, MethodBindings.getUnixPermissionsPtr, LONG)
      return UnixPermissionFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Sets file UNIX permissions.
     * **Note:** This method is implemented on iOS, Linux/BSD, and macOS.
     */
    public final fun setUnixPermissions(`file`: String, permissions: UnixPermissionFlags):
        GodotError {
      TransferContext.writeArguments(STRING to file, LONG to permissions.flag)
      TransferContext.callMethod(0, MethodBindings.setUnixPermissionsPtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Returns `true`, if file `hidden` attribute is set.
     * **Note:** This method is implemented on iOS, BSD, macOS, and Windows.
     */
    public final fun getHiddenAttribute(`file`: String): Boolean {
      TransferContext.writeArguments(STRING to file)
      TransferContext.callMethod(0, MethodBindings.getHiddenAttributePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

    /**
     * Sets file **hidden** attribute.
     * **Note:** This method is implemented on iOS, BSD, macOS, and Windows.
     */
    public final fun setHiddenAttribute(`file`: String, hidden: Boolean): GodotError {
      TransferContext.writeArguments(STRING to file, BOOL to hidden)
      TransferContext.callMethod(0, MethodBindings.setHiddenAttributePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Sets file **read only** attribute.
     * **Note:** This method is implemented on iOS, BSD, macOS, and Windows.
     */
    public final fun setReadOnlyAttribute(`file`: String, ro: Boolean): GodotError {
      TransferContext.writeArguments(STRING to file, BOOL to ro)
      TransferContext.callMethod(0, MethodBindings.setReadOnlyAttributePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Returns `true`, if file `read only` attribute is set.
     * **Note:** This method is implemented on iOS, BSD, macOS, and Windows.
     */
    public final fun getReadOnlyAttribute(`file`: String): Boolean {
      TransferContext.writeArguments(STRING to file)
      TransferContext.callMethod(0, MethodBindings.getReadOnlyAttributePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
  }

  internal object MethodBindings {
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "open", 1247358404)

    public val openEncryptedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_encrypted", 1482131466)

    public val openEncryptedWithPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_encrypted_with_pass", 790283377)

    public val openCompressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "open_compressed", 3686439335)

    public val getOpenErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_open_error", 166280745)

    public val getFileAsBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_file_as_bytes", 659035735)

    public val getFileAsStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_file_as_string", 1703090593)

    public val resizePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "resize", 844576869)

    public val flushPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "flush", 3218959716)

    public val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_path", 201670096)

    public val getPathAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_path_absolute", 201670096)

    public val isOpenPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "is_open", 36873697)

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "seek", 1286410249)

    public val seekEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "seek_end", 1995695955)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_position", 3905245786)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_length", 3905245786)

    public val eofReachedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "eof_reached", 36873697)

    public val get8Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_8", 3905245786)

    public val get16Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_16", 3905245786)

    public val get32Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_32", 3905245786)

    public val get64Ptr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_64", 3905245786)

    public val getFloatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_float", 1740695150)

    public val getDoublePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_double", 1740695150)

    public val getRealPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_real", 1740695150)

    public val getBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_buffer", 4131300905)

    public val getLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_line", 201670096)

    public val getCsvLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_csv_line", 2358116058)

    public val getAsTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_as_text", 1162154673)

    public val getMd5Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_md5", 1703090593)

    public val getSha256Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_sha256", 1703090593)

    public val isBigEndianPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "is_big_endian", 36873697)

    public val setBigEndianPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "set_big_endian", 2586408642)

    public val getErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_error", 3185525595)

    public val getVarPtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "get_var", 189129690)

    public val store8Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_8", 1286410249)

    public val store16Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_16", 1286410249)

    public val store32Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_32", 1286410249)

    public val store64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_64", 1286410249)

    public val storeFloatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_float", 373806689)

    public val storeDoublePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_double", 373806689)

    public val storeRealPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_real", 373806689)

    public val storeBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_buffer", 2971499966)

    public val storeLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_line", 83702148)

    public val storeCsvLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_csv_line", 2173791505)

    public val storeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_string", 83702148)

    public val storeVarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_var", 738511890)

    public val storePascalStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "store_pascal_string", 83702148)

    public val getPascalStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_pascal_string", 2841200299)

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("FileAccess", "close", 3218959716)

    public val fileExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "file_exists", 2323990056)

    public val getModifiedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_modified_time", 1597066294)

    public val getUnixPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_unix_permissions", 524341837)

    public val setUnixPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "set_unix_permissions", 846038644)

    public val getHiddenAttributePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_hidden_attribute", 2323990056)

    public val setHiddenAttributePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "set_hidden_attribute", 2892558115)

    public val setReadOnlyAttributePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "set_read_only_attribute", 2892558115)

    public val getReadOnlyAttributePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileAccess", "get_read_only_attribute", 2323990056)
  }
}

public infix fun Long.or(other: godot.FileAccess.UnixPermissionFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.FileAccess.UnixPermissionFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.FileAccess.UnixPermissionFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.FileAccess.UnixPermissionFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.FileAccess.UnixPermissionFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.FileAccess.UnixPermissionFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.FileAccess.UnixPermissionFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.FileAccess.UnixPermissionFlags): Long =
    this.rem(other.flag)
