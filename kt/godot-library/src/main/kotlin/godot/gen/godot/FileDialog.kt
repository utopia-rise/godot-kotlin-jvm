// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [FileDialog] is a preset dialog used to choose files and directories in the filesystem. It
 * supports filter masks. [FileDialog] automatically sets its window title according to the [fileMode].
 * If you want to use a custom title, disable this by setting [modeOverridesTitle] to `false`.
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
   * If `true`, changing the [fileMode] property will set the window title accordingly (e.g. setting
   * [fileMode] to [FILE_MODE_OPEN_FILE] will change the window title to "Open a File").
   */
  public var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isModeOverridingTitlePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModeOverridesTitlePtr, NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See [FileMode].
   */
  public var fileMode: FileMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFileModePtr, LONG)
      return FileDialog.FileMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFileModePtr, NIL)
    }

  /**
   * The file system access scope. See [Access] constants.
   * **Warning:** In Web builds, FileDialog cannot access the host file system. In sandboxed Linux
   * and macOS environments, [useNativeDialog] is automatically used to allow limited access to host
   * file system.
   */
  public var access: Access
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessPtr, LONG)
      return FileDialog.Access.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessPtr, NIL)
    }

  /**
   * If non-empty, the given sub-folder will be "root" of this [FileDialog], i.e. user won't be able
   * to go to its parent directory.
   * **Note:** This property is ignored by native file dialogs.
   */
  public var rootSubfolder: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootSubfolderPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootSubfolderPtr, NIL)
    }

  /**
   * The available file type filters. Each filter string in the array should be formatted like this:
   * `*.txt,*.doc;Text Files`. The description text of the filter is optional and can be omitted.
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
   * The number of additional [OptionButton]s and [CheckBox]es in the dialog.
   */
  public var optionCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOptionCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOptionCountPtr, NIL)
    }

  /**
   * If `true`, the dialog will show hidden files.
   * **Note:** This property is ignored by native file dialogs on Linux.
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
   * If `true`, [access] is set to [ACCESS_FILESYSTEM], and it is supported by the current
   * [DisplayServer], OS native dialog will be used instead of custom one.
   * **Note:** On Linux and macOS, sandboxed apps always use native dialogs to access the host file
   * system.
   * **Note:** On macOS, sandboxed apps will save security-scoped bookmarks to retain access to the
   * opened folders across multiple sessions. Use [OS.getGrantedPermissions] to get a list of saved
   * bookmarks.
   * **Note:** Native dialogs are isolated from the base process, file dialog properties can't be
   * modified once the dialog is shown.
   */
  public var useNativeDialog: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseNativeDialogPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseNativeDialogPtr, NIL)
    }

  /**
   * The current working directory of the file dialog.
   * **Note:** For native file dialogs, this property is only treated as a hint and may not be
   * respected by specific OS implementations.
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
   * The currently selected file of the file dialog.
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
   * The currently selected file path of the file dialog.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_FILEDIALOG, scriptIndex)
  }

  /**
   * Clear all the added filters in the dialog.
   */
  public fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearFiltersPtr, NIL)
  }

  /**
   * Adds a comma-delimited file name [filter] option to the [FileDialog] with an optional
   * [description], which restricts what files can be picked.
   * A [filter] should be of the form `"filename.extension"`, where filename and extension can be
   * `*` to match any string. Filters starting with `.` (i.e. empty filenames) are not allowed.
   * For example, a [filter] of `"*.png, *.jpg"` and a [description] of `"Images"` results in filter
   * text "Images (*.png, *.jpg)".
   */
  @JvmOverloads
  public fun addFilter(filter: String, description: String = ""): Unit {
    TransferContext.writeArguments(STRING to filter, STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.addFilterPtr, NIL)
  }

  /**
   * Returns the name of the [OptionButton] or [CheckBox] with index [option].
   */
  public fun getOptionName(option: Int): String {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOptionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns an array of values of the [OptionButton] with index [option].
   */
  public fun getOptionValues(option: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOptionValuesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the default value index of the [OptionButton] or [CheckBox] with index [option].
   */
  public fun getOptionDefault(option: Int): Int {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOptionDefaultPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the name of the [OptionButton] or [CheckBox] with index [option].
   */
  public fun setOptionName(option: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to option.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setOptionNamePtr, NIL)
  }

  /**
   * Sets the option values of the [OptionButton] with index [option].
   */
  public fun setOptionValues(option: Int, values: PackedStringArray): Unit {
    TransferContext.writeArguments(LONG to option.toLong(), PACKED_STRING_ARRAY to values)
    TransferContext.callMethod(rawPtr, MethodBindings.setOptionValuesPtr, NIL)
  }

  /**
   * Sets the default value index of the [OptionButton] or [CheckBox] with index [option].
   */
  public fun setOptionDefault(option: Int, defaultValueIndex: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong(), LONG to defaultValueIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOptionDefaultPtr, NIL)
  }

  /**
   * Adds an additional [OptionButton] to the file dialog. If [values] is empty, a [CheckBox] is
   * added instead.
   * [defaultValueIndex] should be an index of the value in the [values]. If [values] is empty it
   * should be either `1` (checked), or `0` (unchecked).
   */
  public fun addOption(
    name: String,
    values: PackedStringArray,
    defaultValueIndex: Int,
  ): Unit {
    TransferContext.writeArguments(STRING to name, PACKED_STRING_ARRAY to values, LONG to defaultValueIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOptionPtr, NIL)
  }

  /**
   * Returns a [Dictionary] with the selected values of the additional [OptionButton]s and/or
   * [CheckBox]es. [Dictionary] keys are names and values are selected value indices.
   */
  public fun getSelectedOptions(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedOptionsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the vertical box container of the dialog, custom controls can be added to it.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   * **Note:** Changes to this node are ignored by native file dialogs, use [addOption] to add
   * custom elements to the dialog instead.
   */
  public fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  /**
   * Returns the LineEdit for the selected file.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  /**
   * Clear all currently selected items in the dialog.
   */
  public fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Invalidate and update the current dialog content list.
   * **Note:** This method does nothing on native file dialogs.
   */
  public fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.invalidatePtr, NIL)
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
      public fun from(`value`: Long): FileMode = entries.single { it.id == `value` }
    }
  }

  public enum class Access(
    id: Long,
  ) {
    /**
     * The dialog only allows accessing files under the [Resource] path (`res://`).
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
      public fun from(`value`: Long): Access = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "clear_filters", 3218959716)

    public val addFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "add_filter", 3388804757)

    public val setFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_filters", 4015028928)

    public val getFiltersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_filters", 1139954409)

    public val getOptionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_option_name", 844755477)

    public val getOptionValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_option_values", 647634434)

    public val getOptionDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_option_default", 923996154)

    public val setOptionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_option_name", 501894301)

    public val setOptionValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_option_values", 3353661094)

    public val setOptionDefaultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_option_default", 3937882851)

    public val setOptionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_option_count", 1286410249)

    public val getOptionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_option_count", 3905245786)

    public val addOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "add_option", 149592325)

    public val getSelectedOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_selected_options", 3102165223)

    public val getCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_dir", 201670096)

    public val getCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_file", 201670096)

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_current_path", 201670096)

    public val setCurrentDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_dir", 83702148)

    public val setCurrentFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_file", 83702148)

    public val setCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_current_path", 83702148)

    public val setModeOverridesTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_mode_overrides_title", 2586408642)

    public val isModeOverridingTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "is_mode_overriding_title", 36873697)

    public val setFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_file_mode", 3654936397)

    public val getFileModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_file_mode", 4074825319)

    public val getVboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_vbox", 915758477)

    public val getLineEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_line_edit", 4071694264)

    public val setAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_access", 4104413466)

    public val getAccessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_access", 3344081076)

    public val setRootSubfolderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_root_subfolder", 83702148)

    public val getRootSubfolderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_root_subfolder", 201670096)

    public val setShowHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_show_hidden_files", 2586408642)

    public val isShowingHiddenFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "is_showing_hidden_files", 36873697)

    public val setUseNativeDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "set_use_native_dialog", 2586408642)

    public val getUseNativeDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "get_use_native_dialog", 36873697)

    public val deselectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "deselect_all", 3218959716)

    public val invalidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FileDialog", "invalidate", 3218959716)
  }
}
