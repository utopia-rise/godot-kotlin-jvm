// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getIncludeNavigationalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIncludeNavigationalPtr, NIL)
    }

  /**
   * If `true`, hidden files are included when navigating the directory.
   *
   * Affects [listDirBegin], [getDirectories] and [getFiles].
   */
  public var includeHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIncludeHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIncludeHiddenPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.listDirBeginPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the next element (file or directory) in the current directory.
   *
   * The name of the file or directory is returned (and not its full path). Once the stream has been fully processed, the method returns an empty [godot.String] and closes the stream automatically (i.e. [listDirEnd] would not be mandatory in such a case).
   */
  public fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns whether the current item processed with the last [getNext] call is a directory (`.` and `..` are considered directories).
   */
  public fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.currentIsDirPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Closes the current stream opened with [listDirBegin] (whether it has been fully processed with [getNext] does not matter).
   */
  public fun listDirEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.listDirEndPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding files. The array is sorted alphabetically.
   *
   * Affected by [includeHidden] and [includeNavigational].
   */
  public fun getDirectories(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDirectoriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the currently opened directory's drive index. See [getDriveName] to convert returned index to the name of the drive.
   */
  public fun getCurrentDrive(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDrivePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes the currently opened directory to the one passed as an argument. The argument can be relative to the current directory (e.g. `newdir` or `../newdir`), or an absolute path (e.g. `/tmp/newdir` or `res://somedir/newdir`).
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun changeDir(toDir: String): GodotError {
    TransferContext.writeArguments(STRING to toDir)
    TransferContext.callMethod(rawPtr, MethodBindings.changeDirPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the absolute path to the currently opened directory (e.g. `res://folder` or `C:\tmp\folder`).
   */
  @JvmOverloads
  public fun getCurrentDir(includeDrive: Boolean = true): String {
    TransferContext.writeArguments(BOOL to includeDrive)
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Creates a directory. The argument can be relative to the current directory, or an absolute path. The target directory should be placed in an already existing directory (to create the full path recursively, see [makeDirRecursive]).
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun makeDir(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.makeDirPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a target directory and all necessary intermediate directories in its path, by calling [makeDir] recursively. The argument can be relative to the current directory, or an absolute path.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun makeDirRecursive(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.makeDirRecursivePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether the target file exists. The argument can be relative to the current directory, or an absolute path.
   *
   * For a static equivalent, use [godot.FileAccess.fileExists].
   */
  public fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.fileExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the target directory exists. The argument can be relative to the current directory, or an absolute path.
   */
  public fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.dirExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the available space on the current directory's disk, in bytes. Returns `0` if the platform-specific method to query the available space fails.
   */
  public fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpaceLeftPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.copyPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Renames (move) the [from] file or directory to the [to] destination. Both arguments should be paths to files or directories, either relative or absolute. If the destination file or directory exists and is not access-protected, it will be overwritten.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun rename(from: String, to: String): GodotError {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr, MethodBindings.renamePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
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
    TransferContext.callMethod(rawPtr, MethodBindings.removePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object {
    /**
     * Creates a new [godot.DirAccess] object and opens an existing directory of the filesystem. The [path] argument can be within the project tree (`res://folder`), the user directory (`user://folder`) or an absolute path of the user filesystem (e.g. `/tmp/folder` or `C:\tmp\folder`).
     *
     * Returns `null` if opening the directory failed. You can use [getOpenError] to check the error that occurred.
     */
    public fun `open`(path: String): DirAccess? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.openPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as DirAccess?)
    }

    /**
     * Returns the result of the last [open] call in the current thread.
     */
    public fun getOpenError(): GodotError {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getOpenErrorPtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding directories, at the given [path]. The array is sorted alphabetically.
     *
     * Use [getFiles] if you want more control of what gets included.
     */
    public fun getFilesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFilesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }

    /**
     * Returns a [godot.PackedStringArray] containing filenames of the directory contents, excluding files, at the given [path]. The array is sorted alphabetically.
     *
     * Use [getDirectories] if you want more control of what gets included.
     */
    public fun getDirectoriesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getDirectoriesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
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
    public fun getDriveCount(): Int {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getDriveCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
    public fun getDriveName(idx: Int): String {
      TransferContext.writeArguments(LONG to idx.toLong())
      TransferContext.callMethod(0, MethodBindings.getDriveNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

    /**
     * Static version of [makeDir]. Supports only absolute paths.
     */
    public fun makeDirAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [makeDirRecursive]. Supports only absolute paths.
     */
    public fun makeDirRecursiveAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirRecursiveAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [dirExists]. Supports only absolute paths.
     */
    public fun dirExistsAbsolute(path: String): Boolean {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.dirExistsAbsolutePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

    /**
     * Static version of [copy]. Supports only absolute paths.
     */
    @JvmOverloads
    public fun copyAbsolute(
      from: String,
      to: String,
      chmodFlags: Int = -1,
    ): GodotError {
      TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
      TransferContext.callMethod(0, MethodBindings.copyAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [rename]. Supports only absolute paths.
     */
    public fun renameAbsolute(from: String, to: String): GodotError {
      TransferContext.writeArguments(STRING to from, STRING to to)
      TransferContext.callMethod(0, MethodBindings.renameAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [remove]. Supports only absolute paths.
     */
    public fun removeAbsolute(path: String): GodotError {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.removeAbsolutePtr, LONG)
      return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
    }
  }

  internal object MethodBindings {
    public val openPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "open")

    public val getOpenErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_open_error")

    public val listDirBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "list_dir_begin")

    public val getNextPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_next")

    public val currentIsDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "current_is_dir")

    public val listDirEndPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "list_dir_end")

    public val getFilesPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_files")

    public val getFilesAtPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "get_files_at")

    public val getDirectoriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories")

    public val getDirectoriesAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories_at")

    public val getDriveCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_count")

    public val getDriveNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_name")

    public val getCurrentDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_drive")

    public val changeDirPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "change_dir")

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_dir")

    public val makeDirPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "make_dir")

    public val makeDirAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_absolute")

    public val makeDirRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive")

    public val makeDirRecursiveAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive_absolute")

    public val fileExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "file_exists")

    public val dirExistsPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "dir_exists")

    public val dirExistsAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "dir_exists_absolute")

    public val getSpaceLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_space_left")

    public val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "copy")

    public val copyAbsolutePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "copy_absolute")

    public val renamePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "rename")

    public val renameAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "rename_absolute")

    public val removePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "remove")

    public val removeAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "remove_absolute")

    public val setIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_navigational")

    public val getIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_navigational")

    public val setIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_hidden")

    public val getIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_hidden")
  }
}
