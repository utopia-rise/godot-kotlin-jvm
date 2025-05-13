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
import godot.core.MethodStringName1
import godot.core.MethodStringName3
import godot.core.MethodStringName4
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * The [PCKPacker] is used to create packages that can be loaded into a running project using
 * [ProjectSettings.loadResourcePack].
 *
 * ```gdscript
 * //gdscript
 * var packer = PCKPacker.new()
 * packer.pck_start("test.pck")
 * packer.add_file("res://text.txt", "text.txt")
 * packer.flush()
 * ```
 *
 * ```csharp
 * //csharp
 * var packer = new PckPacker();
 * packer.PckStart("test.pck");
 * packer.AddFile("res://text.txt", "text.txt");
 * packer.Flush();
 * ```
 *
 * The above [PCKPacker] creates package `test.pck`, then adds a file named `text.txt` at the root
 * of the package.
 *
 * **Note:** PCK is Godot's own pack file format. To create ZIP archives that can be read by any
 * program, use [ZIPPacker] instead.
 */
@GodotBaseType
public open class PCKPacker : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(434, scriptIndex)
  }

  /**
   * Creates a new PCK file at the file path [pckPath]. The `.pck` file extension isn't added
   * automatically, so it should be part of [pckPath] (even though it's not required).
   */
  @JvmOverloads
  public final fun pckStart(
    pckPath: String,
    alignment: Int = 32,
    key: String = "0000000000000000000000000000000000000000000000000000000000000000",
    encryptDirectory: Boolean = false,
  ): Error {
    TransferContext.writeArguments(STRING to pckPath, LONG to alignment.toLong(), STRING to key, BOOL to encryptDirectory)
    TransferContext.callMethod(ptr, MethodBindings.pckStartPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds the [sourcePath] file to the current PCK package at the [targetPath] internal path. The
   * `res://` prefix for [targetPath] is optional and stripped internally.
   */
  @JvmOverloads
  public final fun addFile(
    targetPath: String,
    sourcePath: String,
    encrypt: Boolean = false,
  ): Error {
    TransferContext.writeArguments(STRING to targetPath, STRING to sourcePath, BOOL to encrypt)
    TransferContext.callMethod(ptr, MethodBindings.addFilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Registers a file removal of the [targetPath] internal path to the PCK. This is mainly used for
   * patches. If the file at this path has been loaded from a previous PCK, it will be removed. The
   * `res://` prefix for [targetPath] is optional and stripped internally.
   */
  public final fun addFileRemoval(targetPath: String): Error {
    TransferContext.writeArguments(STRING to targetPath)
    TransferContext.callMethod(ptr, MethodBindings.addFileRemovalPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Writes the files specified using all [addFile] calls since the last flush. If [verbose] is
   * `true`, a list of files added will be printed to the console for easier debugging.
   */
  @JvmOverloads
  public final fun flush(verbose: Boolean = false): Error {
    TransferContext.writeArguments(BOOL to verbose)
    TransferContext.callMethod(ptr, MethodBindings.flushPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object {
    @JvmStatic
    public val pckStartName: MethodStringName4<PCKPacker, Error, String, Int, String, Boolean> =
        MethodStringName4<PCKPacker, Error, String, Int, String, Boolean>("pck_start")

    @JvmStatic
    public val addFileName: MethodStringName3<PCKPacker, Error, String, String, Boolean> =
        MethodStringName3<PCKPacker, Error, String, String, Boolean>("add_file")

    @JvmStatic
    public val addFileRemovalName: MethodStringName1<PCKPacker, Error, String> =
        MethodStringName1<PCKPacker, Error, String>("add_file_removal")

    @JvmStatic
    public val flushName: MethodStringName1<PCKPacker, Error, Boolean> =
        MethodStringName1<PCKPacker, Error, Boolean>("flush")
  }

  public object MethodBindings {
    internal val pckStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PCKPacker", "pck_start", 508410629)

    internal val addFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PCKPacker", "add_file", 2215643711)

    internal val addFileRemovalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PCKPacker", "add_file_removal", 166001499)

    internal val flushPtr: VoidPtr = TypeManager.getMethodBindPtr("PCKPacker", "flush", 1633102583)
  }
}
