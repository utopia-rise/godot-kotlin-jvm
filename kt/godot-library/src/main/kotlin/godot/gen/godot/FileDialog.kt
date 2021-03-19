// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
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

/**
 * Dialog for selecting files or directories in the filesystem.
 *
 * FileDialog is a preset dialog used to choose files and directories in the filesystem. It supports filter masks. The FileDialog automatically sets its window title according to the [mode]. If you want to use a custom title, disable this by setting [modeOverridesTitle] to `false`.
 */
@GodotBaseType
open class FileDialog : ConfirmationDialog() {
  /**
   * Emitted when the user selects a directory.
   */
  val dirSelected: Signal1<String> by signal("dir")

  /**
   * Emitted when the user selects a file by double-clicking it or pressing the **OK** button.
   */
  val fileSelected: Signal1<String> by signal("path")

  /**
   * Emitted when the user selects multiple files.
   */
  val filesSelected: Signal1<PoolStringArray> by signal("paths")

  /**
   * The file system access scope. See enum `Access` constants.
   *
   * **Warning:** Currently, in sandboxed environments such as HTML5 builds or sandboxed macOS apps, FileDialog cannot access the host file system. See [godot-proposals#1123](https://github.com/godotengine/godot-proposals/issues/1123).
   */
  open var access: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_ACCESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_ACCESS, NIL)
    }

  /**
   * The current working directory of the file dialog.
   */
  open var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_DIR, NIL)
    }

  /**
   * The currently selected file of the file dialog.
   */
  open var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_FILE, NIL)
    }

  /**
   * The currently selected file path of the file dialog.
   */
  open var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_PATH, NIL)
    }

  /**
   * The available file type filters. For example, this shows only `.png` and `.gd` files: `set_filters(PoolStringArray(["*.png ; PNG Images","*.gd ; GDScript Files"]))`.
   */
  open var filters: PoolStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_FILTERS,
          POOL_STRING_ARRAY)
      return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_FILTERS, NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See enum `Mode` constants.
   */
  open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE, NIL)
    }

  /**
   * If `true`, changing the `Mode` property will set the window title accordingly (e.g. setting mode to [MODE_OPEN_FILE] will change the window title to "Open a File").
   */
  open var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE_OVERRIDES_TITLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE_OVERRIDES_TITLE, NIL)
    }

  /**
   * If `true`, the dialog will show hidden files.
   */
  open var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_SHOW_HIDDEN_FILES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_SHOW_HIDDEN_FILES,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_FILEDIALOG)
  }

  open fun _actionPressed() {
  }

  open fun _cancelPressed() {
  }

  open fun _dirEntered(arg0: String) {
  }

  open fun _fileEntered(arg0: String) {
  }

  open fun _filterSelected(arg0: Long) {
  }

  open fun _goUp() {
  }

  open fun _makeDir() {
  }

  open fun _makeDirConfirm() {
  }

  open fun _saveConfirmPressed() {
  }

  open fun _selectDrive(arg0: Long) {
  }

  open fun _treeItemActivated() {
  }

  open fun _treeMultiSelected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _treeSelected() {
  }

  override fun _unhandledInput(event: InputEvent) {
  }

  open fun _updateDir() {
  }

  open fun _updateFileList() {
  }

  open fun _updateFileName() {
  }

  /**
   * Adds `filter` as a custom filter; `filter` should be of the form `"filename.extension ; Description"`. For example, `"*.png ; PNG Images"`.
   */
  open fun addFilter(filter: String) {
    TransferContext.writeArguments(STRING to filter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_ADD_FILTER, NIL)
  }

  /**
   * Clear all the added filters in the dialog.
   */
  open fun clearFilters() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_CLEAR_FILTERS, NIL)
  }

  /**
   * Clear currently selected items in the dialog.
   */
  open fun deselectItems() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_DESELECT_ITEMS, NIL)
  }

  /**
   * Returns the LineEdit for the selected file.
   */
  open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }

  /**
   * Returns the vertical box container of the dialog, custom controls can be added to it.
   */
  open fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_VBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?
  }

  /**
   * Invalidate and update the current dialog content list.
   */
  open fun invalidate() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_INVALIDATE, NIL)
  }

  enum class Mode(
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
    MODE_SAVE_FILE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Access(
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
    ACCESS_FILESYSTEM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The dialog allows accessing files on the whole file system.
     */
    final const val ACCESS_FILESYSTEM: Long = 2

    /**
     * The dialog only allows accessing files under the [godot.Resource] path (`res://`).
     */
    final const val ACCESS_RESOURCES: Long = 0

    /**
     * The dialog only allows accessing files under user data path (`user://`).
     */
    final const val ACCESS_USERDATA: Long = 1

    /**
     * The dialog allows selecting one file or directory.
     */
    final const val MODE_OPEN_ANY: Long = 3

    /**
     * The dialog only allows selecting a directory, disallowing the selection of any file.
     */
    final const val MODE_OPEN_DIR: Long = 2

    /**
     * The dialog allows selecting one, and only one file.
     */
    final const val MODE_OPEN_FILE: Long = 0

    /**
     * The dialog allows selecting multiple files.
     */
    final const val MODE_OPEN_FILES: Long = 1

    /**
     * The dialog will warn when a file exists.
     */
    final const val MODE_SAVE_FILE: Long = 4
  }
}
