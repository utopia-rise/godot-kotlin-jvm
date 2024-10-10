// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_ZIPPACKER_INDEX: Int = 765

/**
 * This class implements a writer that allows storing the multiple blobs in a zip archive.
 * [codeblock]
 * func write_zip_file():
 *     var writer := ZIPPacker.new()
 *     var err := writer.open("user://archive.zip")
 *     if err != OK:
 *         return err
 *     writer.start_file("hello.txt")
 *     writer.write_file("Hello World".to_utf8_buffer())
 *     writer.close_file()
 *
 *     writer.close()
 *     return OK
 * [/codeblock]
 */
@GodotBaseType
public open class ZIPPacker : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ZIPPACKER_INDEX, scriptIndex)
  }

  /**
   * Opens a zip file for writing at the given path using the specified write mode.
   * This must be called before everything else.
   */
  @JvmOverloads
  public final fun `open`(path: String, append: ZipAppend = ZIPPacker.ZipAppend.APPEND_CREATE):
      Error {
    Internals.writeArguments(STRING to path, LONG to append.id)
    Internals.callMethod(rawPtr, MethodBindings.openPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Starts writing to a file within the archive. Only one file can be written at the same time.
   * Must be called after [open].
   */
  public final fun startFile(path: String): Error {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.startFilePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Write the given [data] to the file.
   * Needs to be called after [startFile].
   */
  public final fun writeFile(`data`: PackedByteArray): Error {
    Internals.writeArguments(PACKED_BYTE_ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.writeFilePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Stops writing to a file within the archive.
   * It will fail if there is no open file.
   */
  public final fun closeFile(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.closeFilePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the underlying resources used by this instance.
   */
  public final fun close(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.closePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class ZipAppend(
    id: Long,
  ) {
    /**
     * Create a new zip archive at the given path.
     */
    APPEND_CREATE(0),
    /**
     * Append a new zip archive to the end of the already existing file at the given path.
     */
    APPEND_CREATEAFTER(1),
    /**
     * Add new files to the existing zip archive at the given path.
     */
    APPEND_ADDINZIP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ZipAppend = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val openPtr: VoidPtr = Internals.getMethodBindPtr("ZIPPacker", "open", 1936816515)

    public val startFilePtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPPacker", "start_file", 166001499)

    public val writeFilePtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPPacker", "write_file", 680677267)

    public val closeFilePtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPPacker", "close_file", 166280745)

    public val closePtr: VoidPtr = Internals.getMethodBindPtr("ZIPPacker", "close", 166280745)
  }
}
