// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.changeDirPtr
import godot.common.interop.VoidPtr
import godot.copyAbsolutePtr
import godot.copyPtr
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.createLinkPtr
import godot.currentIsDirPtr
import godot.dirExistsAbsolutePtr
import godot.dirExistsPtr
import godot.fileExistsPtr
import godot.getCurrentDirPtr
import godot.getCurrentDrivePtr
import godot.getDirectoriesAtPtr
import godot.getDirectoriesPtr
import godot.getDriveCountPtr
import godot.getDriveNamePtr
import godot.getFilesAtPtr
import godot.getFilesPtr
import godot.getIncludeHiddenPtr
import godot.getIncludeNavigationalPtr
import godot.getNextPtr
import godot.getOpenErrorPtr
import godot.getSpaceLeftPtr
import godot.isCaseSensitivePtr
import godot.isLinkPtr
import godot.listDirBeginPtr
import godot.listDirEndPtr
import godot.makeDirAbsolutePtr
import godot.makeDirPtr
import godot.makeDirRecursiveAbsolutePtr
import godot.makeDirRecursivePtr
import godot.openPtr
import godot.readLinkPtr
import godot.removeAbsolutePtr
import godot.removePtr
import godot.renameAbsolutePtr
import godot.renamePtr
import godot.setIncludeHiddenPtr
import godot.setIncludeNavigationalPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_DIRACCESS: Int = 226

/**
 * This class is used to manage directories and their content, even outside of the project folder.
 * [DirAccess] can't be instantiated directly. Instead it is created with a static method that takes
 * a path for which it will be opened.
 * Most of the methods have a static alternative that can be used without creating a [DirAccess].
 * Static methods only support absolute paths (including `res://` and `user://`).
 * [codeblock]
 * # Standard
 * var dir = DirAccess.open("user://levels")
 * dir.make_dir("world1")
 * # Static
 * DirAccess.make_dir_absolute("user://levels/world1")
 * [/codeblock]
 * **Note:** Many resources types are imported (e.g. textures or sound files), and their source
 * asset will not be included in the exported game, as only the imported version is used. Use
 * [ResourceLoader] to access imported resources.
 * Here is an example on how to iterate through the files of a directory:
 *
 * gdscript:
 * ```gdscript
 * func dir_contents(path):
 *     var dir = DirAccess.open(path)
 *     if dir:
 *         dir.list_dir_begin()
 *         var file_name = dir.get_next()
 *         while file_name != "":
 *             if dir.current_is_dir():
 *                 print("Found directory: " + file_name)
 *             else:
 *                 print("Found file: " + file_name)
 *             file_name = dir.get_next()
 *     else:
 *         print("An error occurred when trying to access the path.")
 * ```
 * csharp:
 * ```csharp
 * public void DirContents(string path)
 * {
 *     using var dir = DirAccess.Open(path);
 *     if (dir != null)
 *     {
 *         dir.ListDirBegin();
 *         string fileName = dir.GetNext();
 *         while (fileName != "")
 *         {
 *             if (dir.CurrentIsDir())
 *             {
 *                 GD.Print($"Found directory: {fileName}");
 *             }
 *             else
 *             {
 *                 GD.Print($"Found file: {fileName}");
 *             }
 *             fileName = dir.GetNext();
 *         }
 *     }
 *     else
 *     {
 *         GD.Print("An error occurred when trying to access the path.");
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class DirAccess internal constructor() : RefCounted() {
  /**
   * If `true`, `.` and `..` are included when navigating the directory.
   * Affects [listDirBegin] and [getDirectories].
   */
  public final inline var includeNavigational: Boolean
    @JvmName("includeNavigationalProperty")
    get() = getIncludeNavigational()
    @JvmName("includeNavigationalProperty")
    set(`value`) {
      setIncludeNavigational(value)
    }

  /**
   * If `true`, hidden files are included when navigating the directory.
   * Affects [listDirBegin], [getDirectories] and [getFiles].
   */
  public final inline var includeHidden: Boolean
    @JvmName("includeHiddenProperty")
    get() = getIncludeHidden()
    @JvmName("includeHiddenProperty")
    set(`value`) {
      setIncludeHidden(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_DIRACCESS, scriptIndex)
  }

  /**
   * Initializes the stream used to list all files and directories using the [getNext] function,
   * closing the currently opened stream if needed. Once the stream has been processed, it should
   * typically be closed with [listDirEnd].
   * Affected by [includeHidden] and [includeNavigational].
   * **Note:** The order of files and directories returned by this method is not deterministic, and
   * can vary between operating systems. If you want a list of all files or folders sorted
   * alphabetically, use [getFiles] or [getDirectories].
   */
  public final fun listDirBegin(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.listDirBeginPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the next element (file or directory) in the current directory.
   * The name of the file or directory is returned (and not its full path). Once the stream has been
   * fully processed, the method returns an empty [String] and closes the stream automatically (i.e.
   * [listDirEnd] would not be mandatory in such a case).
   */
  public final fun getNext(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns whether the current item processed with the last [getNext] call is a directory (`.` and
   * `..` are considered directories).
   */
  public final fun currentIsDir(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.currentIsDirPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Closes the current stream opened with [listDirBegin] (whether it has been fully processed with
   * [getNext] does not matter).
   */
  public final fun listDirEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.listDirEndPtr, NIL)
  }

  /**
   * Returns a [PackedStringArray] containing filenames of the directory contents, excluding
   * directories. The array is sorted alphabetically.
   * Affected by [includeHidden].
   * **Note:** When used on a `res://` path in an exported project, only the files actually included
   * in the PCK at the given folder level are returned. In practice, this means that since imported
   * resources are stored in a top-level `.godot/` folder, only paths to `*.gd` and `*.import` files
   * are returned (plus a few files such as `project.godot` or `project.binary` and the project icon).
   * In an exported project, the list of returned files will also vary depending on whether
   * [ProjectSettings.editor/export/convertTextResourcesToBinary] is `true`.
   */
  public final fun getFiles(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFilesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a [PackedStringArray] containing filenames of the directory contents, excluding files.
   * The array is sorted alphabetically.
   * Affected by [includeHidden] and [includeNavigational].
   */
  public final fun getDirectories(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectoriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the currently opened directory's drive index. See [getDriveName] to convert returned
   * index to the name of the drive.
   */
  public final fun getCurrentDrive(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentDrivePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Changes the currently opened directory to the one passed as an argument. The argument can be
   * relative to the current directory (e.g. `newdir` or `../newdir`), or an absolute path (e.g.
   * `/tmp/newdir` or `res://somedir/newdir`).
   * Returns one of the [Error] code constants ([OK] on success).
   * **Note:** The new directory must be within the same scope, e.g. when you had opened a directory
   * inside `res://`, you can't change it to `user://` directory. If you need to open a directory in
   * another access scope, use [open] to create a new instance instead.
   */
  public final fun changeDir(toDir: String): Error {
    TransferContext.writeArguments(STRING to toDir)
    TransferContext.callMethod(ptr, MethodBindings.changeDirPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the absolute path to the currently opened directory (e.g. `res://folder` or
   * `C:\tmp\folder`).
   */
  @JvmOverloads
  public final fun getCurrentDir(includeDrive: Boolean = true): String {
    TransferContext.writeArguments(BOOL to includeDrive)
    TransferContext.callMethod(ptr, MethodBindings.getCurrentDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Creates a directory. The argument can be relative to the current directory, or an absolute
   * path. The target directory should be placed in an already existing directory (to create the full
   * path recursively, see [makeDirRecursive]).
   * Returns one of the [Error] code constants ([OK] on success).
   */
  public final fun makeDir(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.makeDirPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a target directory and all necessary intermediate directories in its path, by calling
   * [makeDir] recursively. The argument can be relative to the current directory, or an absolute path.
   * Returns one of the [Error] code constants ([OK] on success).
   */
  public final fun makeDirRecursive(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.makeDirRecursivePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns whether the target file exists. The argument can be relative to the current directory,
   * or an absolute path.
   * For a static equivalent, use [FileAccess.fileExists].
   */
  public final fun fileExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.fileExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether the target directory exists. The argument can be relative to the current
   * directory, or an absolute path.
   */
  public final fun dirExists(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.dirExistsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the available space on the current directory's disk, in bytes. Returns `0` if the
   * platform-specific method to query the available space fails.
   */
  public final fun getSpaceLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpaceLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Copies the [from] file to the [to] destination. Both arguments should be paths to files, either
   * relative or absolute. If the destination file exists and is not access-protected, it will be
   * overwritten.
   * If [chmodFlags] is different than `-1`, the Unix permissions for the destination path will be
   * set to the provided value, if available on the current operating system.
   * Returns one of the [Error] code constants ([OK] on success).
   */
  @JvmOverloads
  public final fun copy(
    from: String,
    to: String,
    chmodFlags: Int = -1,
  ): Error {
    TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
    TransferContext.callMethod(ptr, MethodBindings.copyPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Renames (move) the [from] file or directory to the [to] destination. Both arguments should be
   * paths to files or directories, either relative or absolute. If the destination file or directory
   * exists and is not access-protected, it will be overwritten.
   * Returns one of the [Error] code constants ([OK] on success).
   */
  public final fun rename(from: String, to: String): Error {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(ptr, MethodBindings.renamePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Permanently deletes the target file or an empty directory. The argument can be relative to the
   * current directory, or an absolute path. If the target directory is not empty, the operation will
   * fail.
   * If you don't want to delete the file/directory permanently, use [OS.moveToTrash] instead.
   * Returns one of the [Error] code constants ([OK] on success).
   */
  public final fun remove(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.removePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the file or directory is a symbolic link, directory junction, or other
   * reparse point.
   * **Note:** This method is implemented on macOS, Linux, and Windows.
   */
  public final fun isLink(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.isLinkPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns target of the symbolic link.
   * **Note:** This method is implemented on macOS, Linux, and Windows.
   */
  public final fun readLink(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.readLinkPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Creates symbolic link between files or folders.
   * **Note:** On Windows, this method works only if the application is running with elevated
   * privileges or Developer Mode is enabled.
   * **Note:** This method is implemented on macOS, Linux, and Windows.
   */
  public final fun createLink(source: String, target: String): Error {
    TransferContext.writeArguments(STRING to source, STRING to target)
    TransferContext.callMethod(ptr, MethodBindings.createLinkPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIncludeNavigational(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setIncludeNavigationalPtr, NIL)
  }

  public final fun getIncludeNavigational(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIncludeNavigationalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIncludeHidden(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setIncludeHiddenPtr, NIL)
  }

  public final fun getIncludeHidden(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIncludeHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the file system or directory use case sensitive file names.
   * **Note:** This method is implemented on macOS, Linux (for EXT4 and F2FS filesystems only) and
   * Windows. On other platforms, it always returns `true`.
   */
  public final fun isCaseSensitive(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.isCaseSensitivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    /**
     * Creates a new [DirAccess] object and opens an existing directory of the filesystem. The
     * [path] argument can be within the project tree (`res://folder`), the user directory
     * (`user://folder`) or an absolute path of the user filesystem (e.g. `/tmp/folder` or
     * `C:\tmp\folder`).
     * Returns `null` if opening the directory failed. You can use [getOpenError] to check the error
     * that occurred.
     */
    public final fun `open`(path: String): DirAccess? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.openPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as DirAccess?)
    }

    /**
     * Returns the result of the last [open] call in the current thread.
     */
    public final fun getOpenError(): Error {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getOpenErrorPtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Returns a [PackedStringArray] containing filenames of the directory contents, excluding
     * directories, at the given [path]. The array is sorted alphabetically.
     * Use [getFiles] if you want more control of what gets included.
     */
    public final fun getFilesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getFilesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
    }

    /**
     * Returns a [PackedStringArray] containing filenames of the directory contents, excluding
     * files, at the given [path]. The array is sorted alphabetically.
     * Use [getDirectories] if you want more control of what gets included.
     */
    public final fun getDirectoriesAt(path: String): PackedStringArray {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.getDirectoriesAtPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
    }

    /**
     * On Windows, returns the number of drives (partitions) mounted on the current filesystem.
     * On macOS, returns the number of mounted volumes.
     * On Linux, returns the number of mounted volumes and GTK 3 bookmarks.
     * On other platforms, the method returns 0.
     */
    public final fun getDriveCount(): Int {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.getDriveCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG) as Long).toInt()
    }

    /**
     * On Windows, returns the name of the drive (partition) passed as an argument (e.g. `C:`).
     * On macOS, returns the path to the mounted volume passed as an argument.
     * On Linux, returns the path to the mounted volume or GTK 3 bookmark passed as an argument.
     * On other platforms, or if the requested drive does not exist, the method returns an empty
     * String.
     */
    public final fun getDriveName(idx: Int): String {
      TransferContext.writeArguments(LONG to idx.toLong())
      TransferContext.callMethod(0, MethodBindings.getDriveNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING) as String)
    }

    /**
     * Static version of [makeDir]. Supports only absolute paths.
     */
    public final fun makeDirAbsolute(path: String): Error {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirAbsolutePtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [makeDirRecursive]. Supports only absolute paths.
     */
    public final fun makeDirRecursiveAbsolute(path: String): Error {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.makeDirRecursiveAbsolutePtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [dirExists]. Supports only absolute paths.
     */
    public final fun dirExistsAbsolute(path: String): Boolean {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.dirExistsAbsolutePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }

    /**
     * Static version of [copy]. Supports only absolute paths.
     */
    @JvmOverloads
    public final fun copyAbsolute(
      from: String,
      to: String,
      chmodFlags: Int = -1,
    ): Error {
      TransferContext.writeArguments(STRING to from, STRING to to, LONG to chmodFlags.toLong())
      TransferContext.callMethod(0, MethodBindings.copyAbsolutePtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [rename]. Supports only absolute paths.
     */
    public final fun renameAbsolute(from: String, to: String): Error {
      TransferContext.writeArguments(STRING to from, STRING to to)
      TransferContext.callMethod(0, MethodBindings.renameAbsolutePtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }

    /**
     * Static version of [remove]. Supports only absolute paths.
     */
    public final fun removeAbsolute(path: String): Error {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.removeAbsolutePtr, LONG)
      return Error.from(TransferContext.readReturnValue(LONG) as Long)
    }
  }

  public object MethodBindings {
    internal val openPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "open", 1923528528)

    internal val getOpenErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_open_error", 166280745)

    internal val listDirBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "list_dir_begin", 2610976713)

    internal val getNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_next", 2841200299)

    internal val currentIsDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "current_is_dir", 36873697)

    internal val listDirEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "list_dir_end", 3218959716)

    internal val getFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_files", 2981934095)

    internal val getFilesAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_files_at", 3538744774)

    internal val getDirectoriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories", 2981934095)

    internal val getDirectoriesAtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_directories_at", 3538744774)

    internal val getDriveCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_count", 2455072627)

    internal val getDriveNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_drive_name", 990163283)

    internal val getCurrentDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_drive", 2455072627)

    internal val changeDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "change_dir", 166001499)

    internal val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_current_dir", 1287308131)

    internal val makeDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir", 166001499)

    internal val makeDirAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_absolute", 166001499)

    internal val makeDirRecursivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive", 166001499)

    internal val makeDirRecursiveAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "make_dir_recursive_absolute", 166001499)

    internal val fileExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "file_exists", 2323990056)

    internal val dirExistsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "dir_exists", 2323990056)

    internal val dirExistsAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "dir_exists_absolute", 2323990056)

    internal val getSpaceLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_space_left", 2455072627)

    internal val copyPtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "copy", 1063198817)

    internal val copyAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "copy_absolute", 1063198817)

    internal val renamePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "rename", 852856452)

    internal val renameAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "rename_absolute", 852856452)

    internal val removePtr: VoidPtr = TypeManager.getMethodBindPtr("DirAccess", "remove", 166001499)

    internal val removeAbsolutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "remove_absolute", 166001499)

    internal val isLinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "is_link", 2323990056)

    internal val readLinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "read_link", 1703090593)

    internal val createLinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "create_link", 852856452)

    internal val setIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_navigational", 2586408642)

    internal val getIncludeNavigationalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_navigational", 36873697)

    internal val setIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "set_include_hidden", 2586408642)

    internal val getIncludeHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "get_include_hidden", 36873697)

    internal val isCaseSensitivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirAccess", "is_case_sensitive", 3927539163)
  }
}
