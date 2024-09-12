// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

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
    callConstructor(ENGINECLASS_ZIPPACKER, scriptIndex)
  }

  /**
   * Opens a zip file for writing at the given path using the specified write mode.
   * This must be called before everything else.
   */
  @JvmOverloads
  public final fun `open`(path: String, append: ZipAppend = ZIPPacker.ZipAppend.APPEND_CREATE):
      GodotError {
    TransferContext.writeArguments(STRING to path, LONG to append.id)
    TransferContext.callMethod(rawPtr, MethodBindings.openPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Starts writing to a file within the archive. Only one file can be written at the same time.
   * Must be called after [open].
   */
  public final fun startFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.startFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Write the given [data] to the file.
   * Needs to be called after [startFile].
   */
  public final fun writeFile(`data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.writeFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Stops writing to a file within the archive.
   * It will fail if there is no open file.
   */
  public final fun closeFile(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closeFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the underlying resources used by this instance.
   */
  public final fun close(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
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
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPPacker", "open", 1936816515)

    public val startFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "start_file", 166001499)

    public val writeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "write_file", 680677267)

    public val closeFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPPacker", "close_file", 166280745)

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPPacker", "close", 166280745)
  }
}
