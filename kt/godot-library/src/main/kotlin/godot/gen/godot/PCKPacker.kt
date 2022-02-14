// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates packages that can be loaded into a running project.
 *
 * The [godot.PCKPacker] is used to create packages that can be loaded into a running project using [godot.ProjectSettings.loadResourcePack].
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var packer = PCKPacker.new()
 *
 * packer.pck_start("test.pck")
 *
 * packer.add_file("res://text.txt", "text.txt")
 *
 * packer.flush()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var packer = new PCKPacker();
 *
 * packer.PckStart("test.pck");
 *
 * packer.AddFile("res://text.txt", "text.txt");
 *
 * packer.Flush();
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The above [godot.PCKPacker] creates package `test.pck`, then adds a file named `text.txt` at the root of the package.
 */
@GodotBaseType
public open class PCKPacker : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PCKPACKER)
  }

  /**
   * Creates a new PCK file with the name `pck_name`. The `.pck` file extension isn't added automatically, so it should be part of `pck_name` (even though it's not required).
   */
  public open fun pckStart(
    pckName: String,
    alignment: Long = 32,
    key: String = "0000000000000000000000000000000000000000000000000000000000000000",
    encryptDirectory: Boolean = false
  ): GodotError {
    TransferContext.writeArguments(STRING to pckName, LONG to alignment, STRING to key, BOOL to
        encryptDirectory)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_PCK_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Adds the `source_path` file to the current PCK package at the `pck_path` internal path (should start with `res://`).
   */
  public open fun addFile(
    pckPath: String,
    sourcePath: String,
    encrypt: Boolean = false
  ): GodotError {
    TransferContext.writeArguments(STRING to pckPath, STRING to sourcePath, BOOL to encrypt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_ADD_FILE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Writes the files specified using all [addFile] calls since the last flush. If `verbose` is `true`, a list of files added will be printed to the console for easier debugging.
   */
  public open fun flush(verbose: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to verbose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_FLUSH, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
