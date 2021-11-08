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
import godot.core.VariantType.STRING
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modified version of [godot.FileDialog] used by the editor.
 */
@GodotBaseType
public open class EditorFileDialog : ConfirmationDialog() {
  /**
   * Emitted when a directory is selected.
   */
  public val dirSelected: Signal1<String> by signal("dir")

  /**
   * Emitted when a file is selected.
   */
  public val fileSelected: Signal1<String> by signal("path")

  /**
   * Emitted when multiple files are selected.
   */
  public val filesSelected: Signal1<PoolStringArray> by signal("paths")

  /**
   * The location from which the user may select a file, including `res://`, `user://`, and the local file system.
   */
  public open var access: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_ACCESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_ACCESS, NIL)
    }

  /**
   * The currently occupied directory.
   */
  public open var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_DIR,
          NIL)
    }

  /**
   * The currently selected file.
   */
  public open var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_FILE,
          NIL)
    }

  /**
   * The file system path in the address bar.
   */
  public open var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_PATH,
          NIL)
    }

  /**
   * If `true`, the [godot.EditorFileDialog] will not warn the user before overwriting files.
   */
  public open var disableOverwriteWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_DISABLE_OVERWRITE_WARNING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_DISABLE_OVERWRITE_WARNING, NIL)
    }

  /**
   * The view format in which the [godot.EditorFileDialog] displays resources to the user.
   */
  public open var displayMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_DISPLAY_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_DISPLAY_MODE,
          NIL)
    }

  /**
   * The purpose of the [godot.EditorFileDialog], which defines the allowed behaviors.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_MODE, NIL)
    }

  /**
   * If `true`, hidden files and directories will be visible in the [godot.EditorFileDialog].
   */
  public open var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_SHOW_HIDDEN_FILES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_SHOW_HIDDEN_FILES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFILEDIALOG)
  }

  public open fun _actionPressed(): Unit {
  }

  public open fun _cancelPressed(): Unit {
  }

  public open fun _dirEntered(arg0: String): Unit {
  }

  public open fun _favoriteMoveDown(): Unit {
  }

  public open fun _favoriteMoveUp(): Unit {
  }

  public open fun _favoritePressed(): Unit {
  }

  public open fun _favoriteSelected(arg0: Long): Unit {
  }

  public open fun _fileEntered(arg0: String): Unit {
  }

  public open fun _filterSelected(arg0: Long): Unit {
  }

  public open fun _goBack(): Unit {
  }

  public open fun _goForward(): Unit {
  }

  public open fun _goUp(): Unit {
  }

  public open fun _itemDbSelected(arg0: Long): Unit {
  }

  public open fun _itemListItemRmbSelected(arg0: Long, arg1: Vector2): Unit {
  }

  public open fun _itemListRmbClicked(arg0: Vector2): Unit {
  }

  public open fun _itemMenuIdPressed(arg0: Long): Unit {
  }

  public open fun _itemSelected(arg0: Long): Unit {
  }

  public open fun _itemsClearSelection(): Unit {
  }

  public open fun _makeDir(): Unit {
  }

  public open fun _makeDirConfirm(): Unit {
  }

  public open fun _multiSelected(arg0: Long, arg1: Boolean): Unit {
  }

  public open fun _recentSelected(arg0: Long): Unit {
  }

  public open fun _saveConfirmPressed(): Unit {
  }

  public open fun _selectDrive(arg0: Long): Unit {
  }

  public open fun _thumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ): Unit {
  }

  public open fun _thumbnailResult(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ): Unit {
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
   * Adds a comma-delimited file extension filter option to the [godot.EditorFileDialog] with an optional semi-colon-delimited label.
   *
   * For example, `"*.tscn, *.scn; Scenes"` results in filter text "Scenes (*.tscn, *.scn)".
   */
  public open fun addFilter(filter: String): Unit {
    TransferContext.writeArguments(STRING to filter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_ADD_FILTER, NIL)
  }

  /**
   * Removes all filters except for "All Files (*)".
   */
  public open fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_CLEAR_FILTERS, NIL)
  }

  /**
   * Returns the `VBoxContainer` used to display the file system.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_VBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?
  }

  /**
   * Notify the [godot.EditorFileDialog] that its view of the data is no longer accurate. Updates the view contents on next view update.
   */
  public open fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_INVALIDATE, NIL)
  }

  public enum class DisplayMode(
    id: Long
  ) {
    /**
     * The [godot.EditorFileDialog] displays resources as thumbnails.
     */
    DISPLAY_THUMBNAILS(0),
    /**
     * The [godot.EditorFileDialog] displays resources as a list of filenames.
     */
    DISPLAY_LIST(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will open the file.
     */
    MODE_OPEN_FILE(0),
    /**
     * The [godot.EditorFileDialog] can select multiple files. Accepting the window will open all files.
     */
    MODE_OPEN_FILES(1),
    /**
     * The [godot.EditorFileDialog] can select only one directory. Accepting the window will open the directory.
     */
    MODE_OPEN_DIR(2),
    /**
     * The [godot.EditorFileDialog] can select a file or directory. Accepting the window will open it.
     */
    MODE_OPEN_ANY(3),
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will save the file.
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
     * The [godot.EditorFileDialog] can only view `res://` directory contents.
     */
    ACCESS_RESOURCES(0),
    /**
     * The [godot.EditorFileDialog] can only view `user://` directory contents.
     */
    ACCESS_USERDATA(1),
    /**
     * The [godot.EditorFileDialog] can view the entire local file system.
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
     * The [godot.EditorFileDialog] can view the entire local file system.
     */
    public final const val ACCESS_FILESYSTEM: Long = 2

    /**
     * The [godot.EditorFileDialog] can only view `res://` directory contents.
     */
    public final const val ACCESS_RESOURCES: Long = 0

    /**
     * The [godot.EditorFileDialog] can only view `user://` directory contents.
     */
    public final const val ACCESS_USERDATA: Long = 1

    /**
     * The [godot.EditorFileDialog] displays resources as a list of filenames.
     */
    public final const val DISPLAY_LIST: Long = 1

    /**
     * The [godot.EditorFileDialog] displays resources as thumbnails.
     */
    public final const val DISPLAY_THUMBNAILS: Long = 0

    /**
     * The [godot.EditorFileDialog] can select a file or directory. Accepting the window will open it.
     */
    public final const val MODE_OPEN_ANY: Long = 3

    /**
     * The [godot.EditorFileDialog] can select only one directory. Accepting the window will open the directory.
     */
    public final const val MODE_OPEN_DIR: Long = 2

    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will open the file.
     */
    public final const val MODE_OPEN_FILE: Long = 0

    /**
     * The [godot.EditorFileDialog] can select multiple files. Accepting the window will open all files.
     */
    public final const val MODE_OPEN_FILES: Long = 1

    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will save the file.
     */
    public final const val MODE_SAVE_FILE: Long = 4
  }
}
