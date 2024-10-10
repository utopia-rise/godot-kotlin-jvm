// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
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

private const val ENGINE_CLASS_PCKPACKER_INDEX: Int = 395

/**
 * The [PCKPacker] is used to create packages that can be loaded into a running project using
 * [ProjectSettings.loadResourcePack].
 *
 * gdscript:
 * ```gdscript
 * var packer = PCKPacker.new()
 * packer.pck_start("test.pck")
 * packer.add_file("res://text.txt", "text.txt")
 * packer.flush()
 * ```
 * csharp:
 * ```csharp
 * var packer = new PckPacker();
 * packer.PckStart("test.pck");
 * packer.AddFile("res://text.txt", "text.txt");
 * packer.Flush();
 * ```
 *
 * The above [PCKPacker] creates package `test.pck`, then adds a file named `text.txt` at the root
 * of the package.
 */
@GodotBaseType
public open class PCKPacker : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PCKPACKER_INDEX, scriptIndex)
  }

  /**
   * Creates a new PCK file with the name [pckName]. The `.pck` file extension isn't added
   * automatically, so it should be part of [pckName] (even though it's not required).
   */
  @JvmOverloads
  public final fun pckStart(
    pckName: String,
    alignment: Int = 32,
    key: String = "0000000000000000000000000000000000000000000000000000000000000000",
    encryptDirectory: Boolean = false,
  ): Error {
    Internals.writeArguments(STRING to pckName, LONG to alignment.toLong(), STRING to key, BOOL to encryptDirectory)
    Internals.callMethod(rawPtr, MethodBindings.pckStartPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Adds the [sourcePath] file to the current PCK package at the [pckPath] internal path (should
   * start with `res://`).
   */
  @JvmOverloads
  public final fun addFile(
    pckPath: String,
    sourcePath: String,
    encrypt: Boolean = false,
  ): Error {
    Internals.writeArguments(STRING to pckPath, STRING to sourcePath, BOOL to encrypt)
    Internals.callMethod(rawPtr, MethodBindings.addFilePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Writes the files specified using all [addFile] calls since the last flush. If [verbose] is
   * `true`, a list of files added will be printed to the console for easier debugging.
   */
  @JvmOverloads
  public final fun flush(verbose: Boolean = false): Error {
    Internals.writeArguments(BOOL to verbose)
    Internals.callMethod(rawPtr, MethodBindings.flushPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val pckStartPtr: VoidPtr =
        Internals.getMethodBindPtr("PCKPacker", "pck_start", 508410629)

    public val addFilePtr: VoidPtr = Internals.getMethodBindPtr("PCKPacker", "add_file", 2215643711)

    public val flushPtr: VoidPtr = Internals.getMethodBindPtr("PCKPacker", "flush", 1633102583)
  }
}
