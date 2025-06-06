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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class implements a writer that allows storing the multiple blobs in a ZIP archive. See also
 * [ZIPReader] and [PCKPacker].
 *
 * ```
 * # Create a ZIP archive with a single file at its root.
 * func write_zip_file():
 *     var writer = ZIPPacker.new()
 *     var err = writer.open("user://archive.zip")
 *     if err != OK:
 *         return err
 *     writer.start_file("hello.txt")
 *     writer.write_file("Hello World".to_utf8_buffer())
 *     writer.close_file()
 *
 *     writer.close()
 *     return OK
 * ```
 */
@GodotBaseType
public open class ZIPPacker : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(877, scriptIndex)
  }

  /**
   * Opens a zip file for writing at the given path using the specified write mode.
   *
   * This must be called before everything else.
   */
  @JvmOverloads
  public final fun `open`(path: String, append: ZipAppend = ZIPPacker.ZipAppend.APPEND_CREATE):
      Error {
    TransferContext.writeArguments(STRING to path, LONG to append.id)
    TransferContext.callMethod(ptr, MethodBindings.openPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Starts writing to a file within the archive. Only one file can be written at the same time.
   *
   * Must be called after [open].
   */
  public final fun startFile(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.startFilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Write the given [data] to the file.
   *
   * Needs to be called after [startFile].
   */
  public final fun writeFile(`data`: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.writeFilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Stops writing to a file within the archive.
   *
   * It will fail if there is no open file.
   */
  public final fun closeFile(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.closeFilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the underlying resources used by this instance.
   */
  public final fun close(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.closePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val openPtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPPacker", "open", 1936816515)

    internal val startFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "start_file", 166001499)

    internal val writeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "write_file", 680677267)

    internal val closeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "close_file", 166280745)

    internal val closePtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPPacker", "close", 166280745)
  }
}
