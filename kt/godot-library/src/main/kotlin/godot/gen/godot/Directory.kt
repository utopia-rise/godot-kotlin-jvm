// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Type used to handle the filesystem.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/step_by_step/filesystem.html](https://docs.godotengine.org/en/latest/getting_started/step_by_step/filesystem.html)
 *
 * Directory type. It is used to manage directories and their content (not restricted to the project folder).
 *
 * When creating a new [godot.Directory], its default opened directory will be `res://`. This may change in the future, so it is advised to always use [open] to initialize your [godot.Directory] where you want to operate, with explicit error checking.
 *
 * Here is an example on how to iterate through the files of a directory:
 *
 * ```
 * 		func dir_contents(path):
 * 		    var dir = Directory.new()
 * 		    if dir.open(path) == OK:
 * 		        dir.list_dir_begin()
 * 		        var file_name = dir.get_next()
 * 		        while file_name != "":
 * 		            if dir.current_is_dir():
 * 		                print("Found directory: " + file_name)
 * 		            else:
 * 		                print("Found file: " + file_name)
 * 		            file_name = dir.get_next()
 * 		    else:
 * 		        print("An error occurred when trying to access the path.")
 * 		```
 */
@GodotBaseType
open class Directory : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS__DIRECTORY)
  }

  /**
   * Changes the currently opened directory to the one passed as an argument. The argument can be relative to the current directory (e.g. `newdir` or `../newdir`), or an absolute path (e.g. `/tmp/newdir` or `res://somedir/newdir`).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun changeDir(todir: String): GodotError {
    TransferContext.writeArguments(STRING to todir)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_CHANGE_DIR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Copies the `from` file to the `to` destination. Both arguments should be paths to files, either relative or absolute. If the destination file exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun copy(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_COPY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns whether the current item processed with the last [getNext] call is a directory (`.` and `..` are considered directories).
   */
  open fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_CURRENT_IS_DIR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the target directory exists. The argument can be relative to the current directory, or an absolute path.
   */
  open fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_DIR_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the target file exists. The argument can be relative to the current directory, or an absolute path.
   */
  open fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_FILE_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the absolute path to the currently opened directory (e.g. `res://folder` or `C:\tmp\folder`).
   */
  open fun getCurrentDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_CURRENT_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the currently opened directory's drive index. See [getDrive] to convert returned index to the name of the drive.
   */
  open fun getCurrentDrive(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_CURRENT_DRIVE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * On Windows, returns the name of the drive (partition) passed as an argument (e.g. `C:`). On other platforms, or if the requested drive does not existed, the method returns an empty String.
   */
  open fun getDrive(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_DRIVE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * On Windows, returns the number of drives (partitions) mounted on the current filesystem. On other platforms, the method returns 0.
   */
  open fun getDriveCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_DRIVE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next element (file or directory) in the current directory (including `.` and `..`, unless `skip_navigational` was given to [listDirBegin]).
   *
   * The name of the file or directory is returned (and not its full path). Once the stream has been fully processed, the method returns an empty String and closes the stream automatically (i.e. [listDirEnd] would not be mandatory in such a case).
   */
  open fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_NEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * On UNIX desktop systems, returns the available space on the current directory's disk. On other platforms, this information is not available and the method returns 0 or -1.
   */
  open fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_GET_SPACE_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Initializes the stream used to list all files and directories using the [getNext] function, closing the current opened stream if needed. Once the stream has been processed, it should typically be closed with [listDirEnd].
   *
   * If `skip_navigational` is `true`, `.` and `..` are filtered out.
   *
   * If `skip_hidden` is `true`, hidden files are filtered out.
   */
  open fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false):
      GodotError {
    TransferContext.writeArguments(BOOL to skipNavigational, BOOL to skipHidden)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_LIST_DIR_BEGIN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Closes the current stream opened with [listDirBegin] (whether it has been fully processed with [getNext] or not does not matter).
   */
  open fun listDirEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_LIST_DIR_END, NIL)
  }

  /**
   * Creates a directory. The argument can be relative to the current directory, or an absolute path. The target directory should be placed in an already existing directory (to create the full path recursively, see [makeDirRecursive]).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_MAKE_DIR, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates a target directory and all necessary intermediate directories in its path, by calling [makeDir] recursively. The argument can be relative to the current directory, or an absolute path.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_MAKE_DIR_RECURSIVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Opens an existing directory of the filesystem. The `path` argument can be within the project tree (`res://folder`), the user directory (`user://folder`) or an absolute path of the user filesystem (e.g. `/tmp/folder` or `C:\tmp\folder`).
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun open(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Deletes the target file or an empty directory. The argument can be relative to the current directory, or an absolute path. If the target directory is not empty, the operation will fail.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun remove(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_REMOVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Renames (move) the `from` file to the `to` destination. Both arguments should be paths to files, either relative or absolute. If the destination file exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants (`OK` on success).
   */
  open fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__DIRECTORY_RENAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
