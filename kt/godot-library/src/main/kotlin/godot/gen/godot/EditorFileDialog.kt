// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A modified version of [godot.FileDialog] used by the editor.
 *
 * [godot.EditorFileDialog] is an enhanced version of [godot.FileDialog] available only to editor plugins. Additional features include list of favorited/recent files and the ability to see files as thumbnails grid instead of list.
 */
@GodotBaseType
public open class EditorFileDialog : ConfirmationDialog() {
  /**
   * Emitted when a file is selected.
   */
  public val fileSelected: Signal1<String> by signal("path")

  /**
   * Emitted when multiple files are selected.
   */
  public val filesSelected: Signal1<PackedStringArray> by signal("paths")

  /**
   * Emitted when a directory is selected.
   */
  public val dirSelected: Signal1<String> by signal("dir")

  /**
   * The location from which the user may select a file, including `res://`, `user://`, and the local file system.
   */
  public var access: Access
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessPtr, LONG)
      return EditorFileDialog.Access.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessPtr, NIL)
    }

  /**
   * The view format in which the [godot.EditorFileDialog] displays resources to the user.
   */
  public var displayMode: DisplayMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisplayModePtr, LONG)
      return EditorFileDialog.DisplayMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisplayModePtr, NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See [enum FileMode].
   */
  public var fileMode: FileMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFileModePtr, LONG)
      return EditorFileDialog.FileMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFileModePtr, NIL)
    }

  /**
   * The currently occupied directory.
   */
  public var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentDirPtr, NIL)
    }

  /**
   * The currently selected file.
   */
  public var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentFilePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentFilePtr, NIL)
    }

  /**
   * The file system path in the address bar.
   */
  public var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentPathPtr, NIL)
    }

  /**
   * The available file type filters. For example, this shows only `.png` and `.gd` files: `set_filters(PackedStringArray(["*.png ; PNG Images","*.gd ; GDScript Files"]))`. Multiple file types can also be specified in a single filter. `"*.png, *.jpg, *.jpeg ; Supported Images"` will show both PNG and JPEG files when selected.
   */
  public var filters: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFiltersPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFiltersPtr, NIL)
    }

  /**
   * If `true`, hidden files and directories will be visible in the [godot.EditorFileDialog]. This property is synchronized with [godot.EditorSettings.filesystem/fileDialog/showHiddenFiles].
   */
  public var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingHiddenFilesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowHiddenFilesPtr, NIL)
    }

  /**
   * If `true`, the [godot.EditorFileDialog] will not warn the user before overwriting files.
   */
  public var disableOverwriteWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverwriteWarningDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableOverwriteWarningPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILEDIALOG, scriptIndex)
    return true
  }

  /**
   * Removes all filters except for "All Files (*)".
   */
  public fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearFiltersPtr, NIL)
  }

  /**
   * Adds a comma-delimited file name [filter] option to the [godot.EditorFileDialog] with an optional [description], which restricts what files can be picked.
   *
   * A [filter] should be of the form `"filename.extension"`, where filename and extension can be `*` to match any string. Filters starting with `.` (i.e. empty filenames) are not allowed.
   *
   * For example, a [filter] of `"*.tscn, *.scn"` and a [description] of `"Scenes"` results in filter text "Scenes (*.tscn, *.scn)".
   */
  @JvmOverloads
  public fun addFilter(filter: String, description: String = ""): Unit {
    TransferContext.writeArguments(STRING to filter, STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.addFilterPtr, NIL)
  }

  /**
   * Returns the [godot.VBoxContainer] used to display the file system.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  /**
   * Returns the LineEdit for the selected file.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  /**
   * Adds the given [menu] to the side of the file dialog with the given [title] text on top. Only one side menu is allowed.
   */
  @JvmOverloads
  public fun addSideMenu(menu: Control, title: String = ""): Unit {
    TransferContext.writeArguments(OBJECT to menu, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_ADD_SIDE_MENU, NIL)
  }

  /**
   * Notify the [godot.EditorFileDialog] that its view of the data is no longer accurate. Updates the view contents on next view update.
   */
  public fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.invalidatePtr, NIL)
  }

  public enum class FileMode(
    id: Long,
  ) {
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will open the file.
     */
    FILE_MODE_OPEN_FILE(0),
    /**
     * The [godot.EditorFileDialog] can select multiple files. Accepting the window will open all files.
     */
    FILE_MODE_OPEN_FILES(1),
    /**
     * The [godot.EditorFileDialog] can select only one directory. Accepting the window will open the directory.
     */
    FILE_MODE_OPEN_DIR(2),
    /**
     * The [godot.EditorFileDialog] can select a file or directory. Accepting the window will open it.
     */
    FILE_MODE_OPEN_ANY(3),
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will save the file.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DisplayMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "clear_filters")

    public val addFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "add_filter")

    public val setFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_filters")

    public val getFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_filters")

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_dir")

    public val getCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_file")

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_current_path")

    public val setCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_dir")

    public val setCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_file")

    public val setCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_current_path")

    public val setFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_file_mode")

    public val getFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_file_mode")

    public val getVboxPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorFileDialog", "get_vbox")

    public val getLineEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_line_edit")

    public val setAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_access")

    public val getAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_access")

    public val setShowHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_show_hidden_files")

    public val isShowingHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "is_showing_hidden_files")

    public val setDisplayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_display_mode")

    public val getDisplayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "get_display_mode")

    public val setDisableOverwriteWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "set_disable_overwrite_warning")

    public val isOverwriteWarningDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "is_overwrite_warning_disabled")

    public val invalidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileDialog", "invalidate")
  }
}
