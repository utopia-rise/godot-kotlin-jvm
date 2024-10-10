// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_ZIPREADER_INDEX: Int = 766

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
    Internals.callConstructor(this, ENGINE_CLASS_ZIPREADER_INDEX, scriptIndex)
  }

  /**
   * Opens the zip archive at the given [path] and reads its file index.
   */
  public final fun `open`(path: String): Error {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.openPtr, LONG)
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

  /**
   * Returns the list of names of all files in the loaded archive.
   * Must be called after [open].
   */
  public final fun getFiles(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Loads the whole content of a file in the loaded zip archive into memory and returns it.
   * Must be called after [open].
   */
  @JvmOverloads
  public final fun readFile(path: String, caseSensitive: Boolean = true): PackedByteArray {
    Internals.writeArguments(STRING to path, BOOL to caseSensitive)
    Internals.callMethod(rawPtr, MethodBindings.readFilePtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns `true` if the file exists in the loaded zip archive.
   * Must be called after [open].
   */
  @JvmOverloads
  public final fun fileExists(path: String, caseSensitive: Boolean = true): Boolean {
    Internals.writeArguments(STRING to path, BOOL to caseSensitive)
    Internals.callMethod(rawPtr, MethodBindings.fileExistsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val openPtr: VoidPtr = Internals.getMethodBindPtr("ZIPReader", "open", 166001499)

    public val closePtr: VoidPtr = Internals.getMethodBindPtr("ZIPReader", "close", 166280745)

    public val getFilesPtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPReader", "get_files", 2981934095)

    public val readFilePtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPReader", "read_file", 740857591)

    public val fileExistsPtr: VoidPtr =
        Internals.getMethodBindPtr("ZIPReader", "file_exists", 35364943)
  }
}
