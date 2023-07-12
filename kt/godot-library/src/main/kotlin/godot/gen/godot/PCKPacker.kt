// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PCKPACKER, scriptIndex)
    return true
  }

  /**
   * Creates a new PCK file with the name [pckName]. The `.pck` file extension isn't added automatically, so it should be part of [pckName] (even though it's not required).
   */
  public fun pckStart(
    pckName: String,
    alignment: Int = 32,
    key: String = "0000000000000000000000000000000000000000000000000000000000000000",
    encryptDirectory: Boolean = false,
  ): GodotError {
    TransferContext.writeArguments(STRING to pckName, LONG to alignment.toLong(), STRING to key, BOOL to encryptDirectory)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_PCK_START, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Adds the [sourcePath] file to the current PCK package at the [pckPath] internal path (should start with `res://`).
   */
  public fun addFile(
    pckPath: String,
    sourcePath: String,
    encrypt: Boolean = false,
  ): GodotError {
    TransferContext.writeArguments(STRING to pckPath, STRING to sourcePath, BOOL to encrypt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_ADD_FILE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Writes the files specified using all [addFile] calls since the last flush. If [verbose] is `true`, a list of files added will be printed to the console for easier debugging.
   */
  public fun flush(verbose: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to verbose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_FLUSH, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public companion object
}
