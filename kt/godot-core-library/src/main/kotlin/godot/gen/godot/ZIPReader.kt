// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class implements a reader that can extract the content of individual files inside a zip
 * archive.
 * [codeblock]
 * func read_zip_file():
 *     var reader := ZIPReader.new()
 *     var err := reader.open("user://archive.zip")
 *     if err != OK:
 *         return PackedByteArray()
 *     var res := reader.read_file("hello.txt")
 *     reader.close()
 *     return res
 * [/codeblock]
 */
@GodotBaseType
public open class ZIPReader : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_ZIPREADER, this, scriptIndex)
  }

  /**
   * Opens the zip archive at the given [path] and reads its file index.
   */
  public final fun `open`(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.openPtr, LONG)
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

  /**
   * Returns the list of names of all files in the loaded archive.
   * Must be called after [open].
   */
  public final fun getFiles(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFilesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Loads the whole content of a file in the loaded zip archive into memory and returns it.
   * Must be called after [open].
   */
  @JvmOverloads
  public final fun readFile(path: String, caseSensitive: Boolean = true): PackedByteArray {
    TransferContext.writeArguments(STRING to path, BOOL to caseSensitive)
    TransferContext.callMethod(ptr, MethodBindings.readFilePtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns `true` if the file exists in the loaded zip archive.
   * Must be called after [open].
   */
  @JvmOverloads
  public final fun fileExists(path: String, caseSensitive: Boolean = true): Boolean {
    TransferContext.writeArguments(STRING to path, BOOL to caseSensitive)
    TransferContext.callMethod(ptr, MethodBindings.fileExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPReader", "open", 166001499)

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPReader", "close", 166280745)

    public val getFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "get_files", 2981934095)

    public val readFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "read_file", 740857591)

    public val fileExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "file_exists", 35364943)
  }
}
