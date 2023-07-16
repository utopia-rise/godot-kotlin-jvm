// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides methods for managing directories and their content.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/scripting/filesystem.html]($DOCS_URL/tutorials/scripting/filesystem.html)
 *
 * This class is used to manage directories and their content, even outside of the project folder.
 *
 * [godot.DirAccess] can't be instantiated directly. Instead it is created with a static method that takes a path for which it will be opened.
 *
 * Most of the methods have a static alternative that can be used without creating a [godot.DirAccess]. Static methods only support absolute paths (including `res://` and `user://`).
 *
 * ```
 * 		# Standard
 * 		var dir = DirAccess.open("user://levels")
 * 		dir.make_dir("world1")
 * 		# Static
 * 		DirAccess.make_dir_absolute("user://levels/world1")
 * 		```
 *
 * **Note:** Many resources types are imported (e.g. textures or sound files), and their source asset will not be included in the exported game, as only the imported version is used. Use [godot.ResourceLoader] to access imported resources.
 *
 * Here is an example on how to iterate through the files of a directory:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func dir_contents(path):
 *
 *     var dir = DirAccess.open(path)
 *
 *     if dir:
 *
 *         dir.list_dir_begin()
 *
 *         var file_name = dir.get_next()
 *
 *         while file_name != "":
 *
 *             if dir.current_is_dir():
 *
 *                 print("Found directory: " + file_name)
 *
 *             else:
 *
 *                 print("Found file: " + file_name)
 *
 *             file_name = dir.get_next()
 *
 *     else:
 *
 *         print("An error occurred when trying to access the path.")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public void DirContents(string path)
 *
 * {
 *
 *     using var dir = DirAccess.Open(path);
 *
 *     if (dir != null)
 *
 *     {
 *
 *         dir.ListDirBegin();
 *
 *         string fileName = dir.GetNext();
 *
 *         while (fileName != "")
 *
 *         {
 *
 *             if (dir.CurrentIsDir())
 *
 *             {
 *
 *                 GD.Print($"Found directory: {fileName}");
 *
 *             }
 *
 *             else
 *
 *             {
 *
 *                 GD.Print($"Found file: {fileName}");
 *
 *             }
 *
 *             fileName = dir.GetNext();
 *
 *         }
 *
 *     }
 *
 *     else
 *
 *     {
 *
 *         GD.Print("An error occurred when trying to access the path.");
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class DirAccess internal constructor() : RefCounted() {
  /**
   * If `true`, `.` and `..` are included when navigating the directory.
   *
   * Affects [listDirBegin] and [getDirectories].
   */
  public var includeNavigational: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_INCLUDE_NAVIGATIONAL, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DIRACCESS_SET_INCLUDE_NAVIGATIONAL, NIL)
    }

  /**
   * If `true`, hidden files are included when navigating the directory.
   *
   * Affects [listDirBegin], [getDirectories] and [getFiles].
   */
  public var includeHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_INCLUDE_HIDDEN,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_SET_INCLUDE_HIDDEN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DIRACCESS, scriptIndex)
    return true
  }

  /**
   * Initializes the stream used to list all files and directories using the [getNext] function, closing the currently opened stream if needed. Once the stream has been processed, it should typically be closed with [listDirEnd].
   *
   * Affected by [includeHidden] and [includeNavigational].
   *
   * **Note:** The order of files and directories returned by this method is not deterministic, and can vary between operating systems. If you want a list of all files or folders sorted alphabetically, use [getFiles] or [getDirectories].
   */
  public fun listDirBegin(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_LIST_DIR_BEGIN, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the next element (file or directory) in the current directory.
   *
   * The name of the file or directory is returned (and not its full path). Once the stream has been fully processed, the method returns an empty [godot.String] and closes the stream automatically (i.e. [listDirEnd] would not be mandatory in such a case).
   */
  public fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_NEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns whether the current item processed with the last [getNext] call is a directory (`.` and `..` are considered directories).
   */
  public fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_CURRENT_IS_DIR, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Closes the current stream opened with [listDirBegin] (whether it has been fully processed with [getNext] does not matter).
   */
  public fun listDirEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_LIST_DIR_END, NIL)
  }

  /**
   * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding directories. The array is sorted alphabetically.
   *
   * Affected by [includeHidden].
   *
   * **Note:** When used on a `res://` path in an exported project, only the files actually included in the PCK at the given folder level are returned. In practice, this means that since imported resources are stored in a top-level `.godot/` folder, only paths to `*.gd` and `*.import` files are returned (plus a few files such as `project.godot` or `project.binary` and the project icon). In an exported project, the list of returned files will also vary depending on whether [godot.ProjectSettings.editor/export/convertTextResourcesToBinary] is `true`.
   */
  public fun getFiles(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_FILES,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding files. The array is sorted alphabetically.
   *
   * Affected by [includeHidden] and [includeNavigational].
   */
  public fun getDirectories(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_DIRECTORIES,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the currently opened directory's drive index. See [getDriveName] to convert returned index to the name of the drive.
   */
  public fun getCurrentDrive(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_CURRENT_DRIVE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes the currently opened directory to the one passed as an argument. The argument can be relative to the current directory (e.g. `newdir` or `../newdir`), or an absolute path (e.g. `/tmp/newdir` or `res://somedir/newdir`).
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun changeDir(toDir: String): GodotError {
    TransferContext.writeArguments(STRING to toDir)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_CHANGE_DIR, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the absolute path to the currently opened directory (e.g. `res://folder` or `C:\tmp\folder`).
   */
  @JvmOverloads
  public fun getCurrentDir(includeDrive: Boolean = true): String {
    TransferContext.writeArguments(BOOL to includeDrive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_CURRENT_DIR, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Creates a directory. The argument can be relative to the current directory, or an absolute path. The target directory should be placed in an already existing directory (to create the full path recursively, see [makeDirRecursive]).
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_MAKE_DIR, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Creates a target directory and all necessary intermediate directories in its path, by calling [makeDir] recursively. The argument can be relative to the current directory, or an absolute path.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_MAKE_DIR_RECURSIVE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns whether the target file exists. The argument can be relative to the current directory, or an absolute path.
   *
   * For a static equivalent, use [godot.FileAccess.fileExists].
   */
  public fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_FILE_EXISTS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the target directory exists. The argument can be relative to the current directory, or an absolute path.
   */
  public fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_DIR_EXISTS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the available space on the current directory's disk, in bytes. Returns `0` if the platform-specific method to query the available space fails.
   */
  public fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_GET_SPACE_LEFT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Copies the [from] file to the [to] destination. Both arguments should be paths to files, either relative or absolute. If the destination file exists and is not access-protected, it will be overwritten.
   *
   * If [chmodFlags] is different than `-1`, the Unix permissions for the destination path will be set to the provided value, if available on the current operating system.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  @JvmOverloads
  public fun copy(
    from: String,
    to: String,
    chmodFlags: Int = -1,
  ): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_COPY, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Renames (move) the [from] file or directory to the [to] destination. Both arguments should be paths to files or directories, either relative or absolute. If the destination file or directory exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_RENAME, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Permanently deletes the target file or an empty directory. The argument can be relative to the current directory, or an absolute path. If the target directory is not empty, the operation will fail.
   *
   * If you don't want to delete the file/directory permanently, use [godot.OS.moveToTrash] instead.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun remove(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRACCESS_REMOVE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public companion object
}
