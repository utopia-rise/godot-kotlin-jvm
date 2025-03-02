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
 * This class implements a reader that can extract the content of individual files inside a ZIP
 * archive. See also [ZIPPacker].
 * [codeblock]
 * # Read a single file from a ZIP archive.
 * func read_zip_file():
 *     var reader = ZIPReader.new()
 *     var err = reader.open("user://archive.zip")
 *     if err != OK:
 *         return PackedByteArray()
 *     var res = reader.read_file("hello.txt")
 *     reader.close()
 *     return res
 *
 * # Extract all files from a ZIP archive, preserving the directories within.
 * # This acts like the "Extract all" functionality from most archive managers.
 * func extract_all_from_zip():
 *     var reader = ZIPReader.new()
 *     reader.open("res://archive.zip")
 *
 *     # Destination directory for the extracted files (this folder must exist before extraction).
 *     # Not all ZIP archives put everything in a single root folder,
 *     # which means several files/folders may be created in `root_dir` after extraction.
 *     var root_dir = DirAccess.open("user://")
 *
 *     var files = reader.get_files()
 *     for file_path in files:
 *         # If the current entry is a directory.
 *         if file_path.ends_with("/"):
 *             root_dir.make_dir_recursive(file_path)
 *             continue
 *
 *         # Write file contents, creating folders automatically when needed.
 *         # Not all ZIP archives are strictly ordered, so we need to do this in case
 *         # the file entry comes before the folder entry.
 *        
 * root_dir.make_dir_recursive(root_dir.get_current_dir().path_join(file_path).get_base_dir())
 *         var file = FileAccess.open(root_dir.get_current_dir().path_join(file_path),
 * FileAccess.WRITE)
 *         var buffer = reader.read_file(file_path)
 *         file.store_buffer(buffer)
 * [/codeblock]
 */
@GodotBaseType
public open class ZIPReader : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(881, scriptIndex)
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

  public object MethodBindings {
    internal val openPtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPReader", "open", 166001499)

    internal val closePtr: VoidPtr = TypeManager.getMethodBindPtr("ZIPReader", "close", 166280745)

    internal val getFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "get_files", 2981934095)

    internal val readFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "read_file", 740857591)

    internal val fileExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ZIPReader", "file_exists", 35364943)
  }
}
