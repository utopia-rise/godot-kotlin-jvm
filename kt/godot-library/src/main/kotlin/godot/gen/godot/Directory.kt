// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Type used to handle the filesystem.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/scripting/filesystem.html]($DOCS_URL/tutorials/scripting/filesystem.html)
 *
 * Directory type. It is used to manage directories and their content (not restricted to the project folder).
 *
 * When creating a new [godot.Directory], it must be explicitly opened using [open] before most methods can be used. However, [fileExists] and [dirExists] can be used without opening a directory. If so, they use a path relative to `res://`.
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
 *     var dir = Directory.new()
 *
 *     if dir.open(path) == OK:
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
 *     var dir = new Directory();
 *
 *     if (dir.Open(path) == Error.Ok)
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
 *                 GD.Print("Found directory: " + fileName);
 *
 *             }
 *
 *             else
 *
 *             {
 *
 *                 GD.Print("Found file: " + fileName);
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
public open class Directory : RefCounted() {
  /**
   * If `true`, `.` and `..` are included when navigating the directory.
   *
   * Affects [listDirBegin] and [getDirectories].
   */
  public var includeNavigational: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_INCLUDE_NAVIGATIONAL,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_SET_INCLUDE_NAVIGATIONAL,
          NIL.ordinal)
    }

  /**
   * If `true`, hidden files are included when the navigating directory.
   *
   * Affects [listDirBegin], [getDirectories] and [getFiles].
   */
  public var includeHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_INCLUDE_HIDDEN,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_SET_INCLUDE_HIDDEN,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DIRECTORY)
  }

  /**
   * Opens an existing directory of the filesystem. The `path` argument can be within the project tree (`res://folder`), the user directory (`user://folder`) or an absolute path of the user filesystem (e.g. `/tmp/folder` or `C:\tmp\folder`).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun `open`(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_OPEN, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_LIST_DIR_BEGIN, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the next element (file or directory) in the current directory (including `.` and `..`, unless `skip_navigational` was given to [listDirBegin]).
   *
   * The name of the file or directory is returned (and not its full path). Once the stream has been fully processed, the method returns an empty String and closes the stream automatically (i.e. [listDirEnd] would not be mandatory in such a case).
   */
  public fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_NEXT, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns whether the current item processed with the last [getNext] call is a directory (`.` and `..` are considered directories).
   */
  public fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_CURRENT_IS_DIR, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Closes the current stream opened with [listDirBegin] (whether it has been fully processed with [getNext] does not matter).
   */
  public fun listDirEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_LIST_DIR_END, NIL.ordinal)
  }

  /**
   * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding directories. The array is sorted alphabetically.
   *
   * Affected by [includeHidden].
   */
  public fun getFiles(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_FILES,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding files. The array is sorted alphabetically.
   *
   * Affected by [includeHidden] and [includeNavigational].
   */
  public fun getDirectories(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_DIRECTORIES,
        PACKED_STRING_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * On Windows, returns the number of drives (partitions) mounted on the current filesystem.
   *
   * On macOS, returns the number of mounted volumes.
   *
   * On Linux, returns the number of mounted volumes and GTK 3 bookmarks.
   *
   * On other platforms, the method returns 0.
   */
  public fun getDriveCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_DRIVE_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * On Windows, returns the name of the drive (partition) passed as an argument (e.g. `C:`).
   *
   * On macOS, returns the path to the mounted volume passed as an argument.
   *
   * On Linux, returns the path to the mounted volume or GTK 3 bookmark passed as an argument.
   *
   * On other platforms, or if the requested drive does not exist, the method returns an empty String.
   */
  public fun getDrive(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_DRIVE, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the currently opened directory's drive index. See [getDrive] to convert returned index to the name of the drive.
   */
  public fun getCurrentDrive(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_CURRENT_DRIVE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Changes the currently opened directory to the one passed as an argument. The argument can be relative to the current directory (e.g. `newdir` or `../newdir`), or an absolute path (e.g. `/tmp/newdir` or `res://somedir/newdir`).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun changeDir(todir: String): GodotError {
    TransferContext.writeArguments(STRING to todir)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_CHANGE_DIR, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the absolute path to the currently opened directory (e.g. `res://folder` or `C:\tmp\folder`).
   */
  public fun getCurrentDir(): String {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_CURRENT_DIR,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Creates a directory. The argument can be relative to the current directory, or an absolute path. The target directory should be placed in an already existing directory (to create the full path recursively, see [makeDirRecursive]).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_MAKE_DIR, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates a target directory and all necessary intermediate directories in its path, by calling [makeDir] recursively. The argument can be relative to the current directory, or an absolute path.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_MAKE_DIR_RECURSIVE,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns whether the target file exists. The argument can be relative to the current directory, or an absolute path.
   *
   * If the [godot.Directory] is not open, the path is relative to `res://`.
   */
  public fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_FILE_EXISTS, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the target directory exists. The argument can be relative to the current directory, or an absolute path.
   *
   * If the [godot.Directory] is not open, the path is relative to `res://`.
   */
  public fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_DIR_EXISTS, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * On UNIX desktop systems, returns the available space on the current directory's disk. On other platforms, this information is not available and the method returns 0 or -1.
   */
  public fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_GET_SPACE_LEFT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Copies the `from` file to the `to` destination. Both arguments should be paths to files, either relative or absolute. If the destination file exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun copy(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_COPY, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Renames (move) the `from` file or directory to the `to` destination. Both arguments should be paths to files or directories, either relative or absolute. If the destination file or directory exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_RENAME, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Permanently deletes the target file or an empty directory. The argument can be relative to the current directory, or an absolute path. If the target directory is not empty, the operation will fail.
   *
   * If you don't want to delete the file/directory permanently, use [godot.OS.moveToTrash] instead.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  public fun remove(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DIRECTORY_REMOVE, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
