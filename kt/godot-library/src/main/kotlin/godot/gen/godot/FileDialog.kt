// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A dialog for selecting files or directories in the filesystem.
 *
 * [godot.FileDialog] is a preset dialog used to choose files and directories in the filesystem. It supports filter masks. [godot.FileDialog] automatically sets its window title according to the [fileMode]. If you want to use a custom title, disable this by setting [modeOverridesTitle] to `false`.
 */
@GodotBaseType
public open class FileDialog : ConfirmationDialog() {
  /**
   * Emitted when the user selects a file by double-clicking it or pressing the **OK** button.
   */
  public val fileSelected: Signal1<String> by signal("path")

  /**
   * Emitted when the user selects multiple files.
   */
  public val filesSelected: Signal1<PackedStringArray> by signal("paths")

  /**
   * Emitted when the user selects a directory.
   */
  public val dirSelected: Signal1<String> by signal("dir")

  /**
   * If `true`, changing the [fileMode] property will set the window title accordingly (e.g. setting [fileMode] to [FILE_MODE_OPEN_FILE] will change the window title to "Open a File").
   */
  public var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_IS_MODE_OVERRIDING_TITLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE_OVERRIDES_TITLE, NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See [enum FileMode].
   */
  public var fileMode: FileMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_FILE_MODE, LONG)
      return FileDialog.FileMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_FILE_MODE, NIL)
    }

  /**
   * The file system access scope. See [enum Access] constants.
   *
   * **Warning:** Currently, in sandboxed environments such as Web builds or sandboxed macOS apps, FileDialog cannot access the host file system. See [godot-proposals#1123](https://github.com/godotengine/godot-proposals/issues/1123).
   */
  public var access: Access
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_ACCESS, LONG)
      return FileDialog.Access.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_ACCESS, NIL)
    }

  /**
   * If non-empty, the given sub-folder will be "root" of this [godot.FileDialog], i.e. user won't be able to go to its parent directory.
   */
  public var rootSubfolder: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_ROOT_SUBFOLDER,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_ROOT_SUBFOLDER,
          NIL)
    }

  /**
   * The available file type filters. For example, this shows only `.png` and `.gd` files: `set_filters(PackedStringArray(["*.png ; PNG Images","*.gd ; GDScript Files"]))`. Multiple file types can also be specified in a single filter. `"*.png, *.jpg, *.jpeg ; Supported Images"` will show both PNG and JPEG files when selected.
   */
  public var filters: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_FILTERS,
          PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_FILTERS, NIL)
    }

  /**
   * If `true`, the dialog will show hidden files.
   */
  public var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_IS_SHOWING_HIDDEN_FILES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_SHOW_HIDDEN_FILES,
          NIL)
    }

  /**
   * The current working directory of the file dialog.
   */
  public var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_DIR, NIL)
    }

  /**
   * The currently selected file of the file dialog.
   */
  public var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_FILE, NIL)
    }

  /**
   * The currently selected file path of the file dialog.
   */
  public var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_PATH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILEDIALOG, scriptIndex)
    return true
  }

  /**
   * Clear all the added filters in the dialog.
   */
  public fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_CLEAR_FILTERS, NIL)
  }

  /**
   * Adds a comma-delimited file name [filter] option to the [godot.FileDialog] with an optional [description], which restricts what files can be picked.
   *
   * A [filter] should be of the form `"filename.extension"`, where filename and extension can be `*` to match any string. Filters starting with `.` (i.e. empty filenames) are not allowed.
   *
   * For example, a [filter] of `"*.png, *.jpg"` and a [description] of `"Images"` results in filter text "Images (*.png, *.jpg)".
   */
  @JvmOverloads
  public fun addFilter(filter: String, description: String = ""): Unit {
    TransferContext.writeArguments(STRING to filter, STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_ADD_FILTER, NIL)
  }

  /**
   * Returns the vertical box container of the dialog, custom controls can be added to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_VBOX, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  /**
   * Returns the LineEdit for the selected file.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_LINE_EDIT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  /**
   * Clear all currently selected items in the dialog.
   */
  public fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_DESELECT_ALL, NIL)
  }

  /**
   * Invalidate and update the current dialog content list.
   */
  public fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_INVALIDATE, NIL)
  }

  public enum class FileMode(
    id: Long,
  ) {
    /**
     * The dialog allows selecting one, and only one file.
     */
    FILE_MODE_OPEN_FILE(0),
    /**
     * The dialog allows selecting multiple files.
     */
    FILE_MODE_OPEN_FILES(1),
    /**
     * The dialog only allows selecting a directory, disallowing the selection of any file.
     */
    FILE_MODE_OPEN_DIR(2),
    /**
     * The dialog allows selecting one file or directory.
     */
    FILE_MODE_OPEN_ANY(3),
    /**
     * The dialog will warn when a file exists.
     */
    FILE_MODE_SAVE_FILE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Access(
    id: Long,
  ) {
    /**
     * The dialog only allows accessing files under the [godot.Resource] path (`res://`).
     */
    ACCESS_RESOURCES(0),
    /**
     * The dialog only allows accessing files under user data path (`user://`).
     */
    ACCESS_USERDATA(1),
    /**
     * The dialog allows accessing files on the whole file system.
     */
    ACCESS_FILESYSTEM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
