// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Dialog for selecting files or directories in the filesystem.
 *
 * FileDialog is a preset dialog used to choose files and directories in the filesystem. It supports filter masks. The FileDialog automatically sets its window title according to the [mode]. If you want to use a custom title, disable this by setting [modeOverridesTitle] to `false`.
 */
@GodotBaseType
public open class FileDialog : ConfirmationDialog() {
  /**
   * Emitted when the user selects a directory.
   */
  public val dirSelected: Signal1<String> by signal("dir")

  /**
   * Emitted when the user selects a file by double-clicking it or pressing the **OK** button.
   */
  public val fileSelected: Signal1<String> by signal("path")

  /**
   * Emitted when the user selects multiple files.
   */
  public val filesSelected: Signal1<PoolStringArray> by signal("paths")

  /**
   * The file system access scope. See enum `Access` constants.
   *
   * **Warning:** Currently, in sandboxed environments such as HTML5 builds or sandboxed macOS apps, FileDialog cannot access the host file system. See [godot-proposals#1123](https://github.com/godotengine/godot-proposals/issues/1123).
   */
  public open var access: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_ACCESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_ACCESS, NIL)
    }

  /**
   * The current working directory of the file dialog.
   */
  public open var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_DIR, NIL)
    }

  /**
   * The currently selected file of the file dialog.
   */
  public open var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_FILE, NIL)
    }

  /**
   * The currently selected file path of the file dialog.
   */
  public open var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_PATH, NIL)
    }

  /**
   * The available file type filters. For example, this shows only `.png` and `.gd` files: `set_filters(PoolStringArray(["*.png ; PNG Images","*.gd ; GDScript Files"]))`.
   */
  public open var filters: PoolStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_FILTERS,
          POOL_STRING_ARRAY)
      return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_FILTERS, NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See enum `Mode` constants.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE, NIL)
    }

  /**
   * If `true`, changing the `Mode` property will set the window title accordingly (e.g. setting mode to [MODE_OPEN_FILE] will change the window title to "Open a File").
   */
  public open var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE_OVERRIDES_TITLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE_OVERRIDES_TITLE, NIL)
    }

  /**
   * If `true`, the dialog will show hidden files.
   */
  public open var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_SHOW_HIDDEN_FILES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_SHOW_HIDDEN_FILES,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FILEDIALOG)
  }

  public open fun _actionPressed(): Unit {
  }

  public open fun _cancelPressed(): Unit {
  }

  public open fun _dirEntered(arg0: String): Unit {
  }

  public open fun _fileEntered(arg0: String): Unit {
  }

  public open fun _filterSelected(arg0: Long): Unit {
  }

  public open fun _goUp(): Unit {
  }

  public open fun _makeDir(): Unit {
  }

  public open fun _makeDirConfirm(): Unit {
  }

  public open fun _saveConfirmPressed(): Unit {
  }

  public open fun _selectDrive(arg0: Long): Unit {
  }

  public open fun _treeItemActivated(): Unit {
  }

  public open fun _treeMultiSelected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ): Unit {
  }

  public open fun _treeSelected(): Unit {
  }

  public override fun _unhandledInput(event: InputEvent): Unit {
  }

  public open fun _updateDir(): Unit {
  }

  public open fun _updateFileList(): Unit {
  }

  public open fun _updateFileName(): Unit {
  }

  /**
   * Adds `filter` as a custom filter; `filter` should be of the form `"filename.extension ; Description"`. For example, `"*.png ; PNG Images"`.
   */
  public open fun addFilter(filter: String): Unit {
    TransferContext.writeArguments(STRING to filter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_ADD_FILTER, NIL)
  }

  /**
   * Clear all the added filters in the dialog.
   */
  public open fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_CLEAR_FILTERS, NIL)
  }

  /**
   * Clear currently selected items in the dialog.
   */
  public open fun deselectItems(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_DESELECT_ITEMS, NIL)
  }

  /**
   * Returns the LineEdit for the selected file.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }

  /**
   * Returns the vertical box container of the dialog, custom controls can be added to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_VBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?
  }

  /**
   * Invalidate and update the current dialog content list.
   */
  public open fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_INVALIDATE, NIL)
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * The dialog allows selecting one, and only one file.
     */
    MODE_OPEN_FILE(0),
    /**
     * The dialog allows selecting multiple files.
     */
    MODE_OPEN_FILES(1),
    /**
     * The dialog only allows selecting a directory, disallowing the selection of any file.
     */
    MODE_OPEN_DIR(2),
    /**
     * The dialog allows selecting one file or directory.
     */
    MODE_OPEN_ANY(3),
    /**
     * The dialog will warn when a file exists.
     */
    MODE_SAVE_FILE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Access(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The dialog allows accessing files on the whole file system.
     */
    public final const val ACCESS_FILESYSTEM: Long = 2

    /**
     * The dialog only allows accessing files under the [godot.Resource] path (`res://`).
     */
    public final const val ACCESS_RESOURCES: Long = 0

    /**
     * The dialog only allows accessing files under user data path (`user://`).
     */
    public final const val ACCESS_USERDATA: Long = 1

    /**
     * The dialog allows selecting one file or directory.
     */
    public final const val MODE_OPEN_ANY: Long = 3

    /**
     * The dialog only allows selecting a directory, disallowing the selection of any file.
     */
    public final const val MODE_OPEN_DIR: Long = 2

    /**
     * The dialog allows selecting one, and only one file.
     */
    public final const val MODE_OPEN_FILE: Long = 0

    /**
     * The dialog allows selecting multiple files.
     */
    public final const val MODE_OPEN_FILES: Long = 1

    /**
     * The dialog will warn when a file exists.
     */
    public final const val MODE_SAVE_FILE: Long = 4
  }
}
