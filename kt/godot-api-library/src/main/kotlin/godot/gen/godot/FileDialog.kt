// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_FILEDIALOG_INDEX: Int = 223

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
  public val fileSelected: Signal1<String> by Signal1

  /**
   * Emitted when the user selects multiple files.
   */
  public val filesSelected: Signal1<PackedStringArray> by Signal1

  /**
   * Emitted when the user selects a directory.
   */
  public val dirSelected: Signal1<String> by Signal1

  /**
   * If `true`, changing the [fileMode] property will set the window title accordingly (e.g. setting
   * [fileMode] to [FILE_MODE_OPEN_FILE] will change the window title to "Open a File").
   */
  public final inline var modeOverridesTitle: Boolean
    @JvmName("modeOverridesTitleProperty")
    get() = isModeOverridingTitle()
    @JvmName("modeOverridesTitleProperty")
    set(`value`) {
      setModeOverridesTitle(value)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See [FileMode].
   */
  public final inline var fileMode: FileMode
    @JvmName("fileModeProperty")
    get() = getFileMode()
    @JvmName("fileModeProperty")
    set(`value`) {
      setFileMode(value)
    }

  /**
   * The file system access scope. See [Access] constants.
   * **Warning:** In Web builds, FileDialog cannot access the host file system. In sandboxed Linux
   * and macOS environments, [useNativeDialog] is automatically used to allow limited access to host
   * file system.
   */
  public final inline var access: Access
    @JvmName("accessProperty")
    get() = getAccess()
    @JvmName("accessProperty")
    set(`value`) {
      setAccess(value)
    }

  /**
   * If non-empty, the given sub-folder will be "root" of this [FileDialog], i.e. user won't be able
   * to go to its parent directory.
   * **Note:** This property is ignored by native file dialogs.
   */
  public final inline var rootSubfolder: String
    @JvmName("rootSubfolderProperty")
    get() = getRootSubfolder()
    @JvmName("rootSubfolderProperty")
    set(`value`) {
      setRootSubfolder(value)
    }

  /**
   * The available file type filters. Each filter string in the array should be formatted like this:
   * `*.txt,*.doc;Text Files`. The description text of the filter is optional and can be omitted.
   */
  public final inline var filters: PackedStringArray
    @JvmName("filtersProperty")
    get() = getFilters()
    @JvmName("filtersProperty")
    set(`value`) {
      setFilters(value)
    }

  /**
   * The number of additional [OptionButton]s and [CheckBox]es in the dialog.
   */
  public final inline var optionCount: Int
    @JvmName("optionCountProperty")
    get() = getOptionCount()
    @JvmName("optionCountProperty")
    set(`value`) {
      setOptionCount(value)
    }

  /**
   * If `true`, the dialog will show hidden files.
   * **Note:** This property is ignored by native file dialogs on Linux.
   */
  public final inline var showHiddenFiles: Boolean
    @JvmName("showHiddenFilesProperty")
    get() = isShowingHiddenFiles()
    @JvmName("showHiddenFilesProperty")
    set(`value`) {
      setShowHiddenFiles(value)
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
  public final inline var useNativeDialog: Boolean
    @JvmName("useNativeDialogProperty")
    get() = getUseNativeDialog()
    @JvmName("useNativeDialogProperty")
    set(`value`) {
      setUseNativeDialog(value)
    }

  /**
   * The current working directory of the file dialog.
   * **Note:** For native file dialogs, this property is only treated as a hint and may not be
   * respected by specific OS implementations.
   */
  public final inline var currentDir: String
    @JvmName("currentDirProperty")
    get() = getCurrentDir()
    @JvmName("currentDirProperty")
    set(`value`) {
      setCurrentDir(value)
    }

  /**
   * The currently selected file of the file dialog.
   */
  public final inline var currentFile: String
    @JvmName("currentFileProperty")
    get() = getCurrentFile()
    @JvmName("currentFileProperty")
    set(`value`) {
      setCurrentFile(value)
    }

  /**
   * The currently selected file path of the file dialog.
   */
  public final inline var currentPath: String
    @JvmName("currentPathProperty")
    get() = getCurrentPath()
    @JvmName("currentPathProperty")
    set(`value`) {
      setCurrentPath(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_FILEDIALOG_INDEX, scriptIndex)
  }

  /**
   * Clear all the added filters in the dialog.
   */
  public final fun clearFilters(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearFiltersPtr, NIL)
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
  public final fun addFilter(filter: String, description: String = ""): Unit {
    Internals.writeArguments(STRING to filter, STRING to description)
    Internals.callMethod(rawPtr, MethodBindings.addFilterPtr, NIL)
  }

  public final fun setFilters(filters: PackedStringArray): Unit {
    Internals.writeArguments(PACKED_STRING_ARRAY to filters)
    Internals.callMethod(rawPtr, MethodBindings.setFiltersPtr, NIL)
  }

  public final fun getFilters(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFiltersPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the name of the [OptionButton] or [CheckBox] with index [option].
   */
  public final fun getOptionName(option: Int): String {
    Internals.writeArguments(LONG to option.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getOptionNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of values of the [OptionButton] with index [option].
   */
  public final fun getOptionValues(option: Int): PackedStringArray {
    Internals.writeArguments(LONG to option.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getOptionValuesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the default value index of the [OptionButton] or [CheckBox] with index [option].
   */
  public final fun getOptionDefault(option: Int): Int {
    Internals.writeArguments(LONG to option.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getOptionDefaultPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the name of the [OptionButton] or [CheckBox] with index [option].
   */
  public final fun setOptionName(option: Int, name: String): Unit {
    Internals.writeArguments(LONG to option.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setOptionNamePtr, NIL)
  }

  /**
   * Sets the option values of the [OptionButton] with index [option].
   */
  public final fun setOptionValues(option: Int, values: PackedStringArray): Unit {
    Internals.writeArguments(LONG to option.toLong(), PACKED_STRING_ARRAY to values)
    Internals.callMethod(rawPtr, MethodBindings.setOptionValuesPtr, NIL)
  }

  /**
   * Sets the default value index of the [OptionButton] or [CheckBox] with index [option].
   */
  public final fun setOptionDefault(option: Int, defaultValueIndex: Int): Unit {
    Internals.writeArguments(LONG to option.toLong(), LONG to defaultValueIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOptionDefaultPtr, NIL)
  }

  public final fun setOptionCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOptionCountPtr, NIL)
  }

  public final fun getOptionCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOptionCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds an additional [OptionButton] to the file dialog. If [values] is empty, a [CheckBox] is
   * added instead.
   * [defaultValueIndex] should be an index of the value in the [values]. If [values] is empty it
   * should be either `1` (checked), or `0` (unchecked).
   */
  public final fun addOption(
    name: String,
    values: PackedStringArray,
    defaultValueIndex: Int,
  ): Unit {
    Internals.writeArguments(STRING to name, PACKED_STRING_ARRAY to values, LONG to defaultValueIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addOptionPtr, NIL)
  }

  /**
   * Returns a [Dictionary] with the selected values of the additional [OptionButton]s and/or
   * [CheckBox]es. [Dictionary] keys are names and values are selected value indices.
   */
  public final fun getSelectedOptions(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSelectedOptionsPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getCurrentDir(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentDirPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun getCurrentFile(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentFilePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun getCurrentPath(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentPathPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setCurrentDir(dir: String): Unit {
    Internals.writeArguments(STRING to dir)
    Internals.callMethod(rawPtr, MethodBindings.setCurrentDirPtr, NIL)
  }

  public final fun setCurrentFile(`file`: String): Unit {
    Internals.writeArguments(STRING to file)
    Internals.callMethod(rawPtr, MethodBindings.setCurrentFilePtr, NIL)
  }

  public final fun setCurrentPath(path: String): Unit {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.setCurrentPathPtr, NIL)
  }

  public final fun setModeOverridesTitle(`override`: Boolean): Unit {
    Internals.writeArguments(BOOL to override)
    Internals.callMethod(rawPtr, MethodBindings.setModeOverridesTitlePtr, NIL)
  }

  public final fun isModeOverridingTitle(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isModeOverridingTitlePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFileMode(mode: FileMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setFileModePtr, NIL)
  }

  public final fun getFileMode(): FileMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFileModePtr, LONG)
    return FileDialog.FileMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the vertical box container of the dialog, custom controls can be added to it.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   * **Note:** Changes to this node are ignored by native file dialogs, use [addOption] to add
   * custom elements to the dialog instead.
   */
  public final fun getVbox(): VBoxContainer? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVboxPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as VBoxContainer?)
  }

  /**
   * Returns the LineEdit for the selected file.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getLineEdit(): LineEdit? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as LineEdit?)
  }

  public final fun setAccess(access: Access): Unit {
    Internals.writeArguments(LONG to access.id)
    Internals.callMethod(rawPtr, MethodBindings.setAccessPtr, NIL)
  }

  public final fun getAccess(): Access {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAccessPtr, LONG)
    return FileDialog.Access.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setRootSubfolder(dir: String): Unit {
    Internals.writeArguments(STRING to dir)
    Internals.callMethod(rawPtr, MethodBindings.setRootSubfolderPtr, NIL)
  }

  public final fun getRootSubfolder(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootSubfolderPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setShowHiddenFiles(show: Boolean): Unit {
    Internals.writeArguments(BOOL to show)
    Internals.callMethod(rawPtr, MethodBindings.setShowHiddenFilesPtr, NIL)
  }

  public final fun isShowingHiddenFiles(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isShowingHiddenFilesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseNativeDialog(native: Boolean): Unit {
    Internals.writeArguments(BOOL to native)
    Internals.callMethod(rawPtr, MethodBindings.setUseNativeDialogPtr, NIL)
  }

  public final fun getUseNativeDialog(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseNativeDialogPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clear all currently selected items in the dialog.
   */
  public final fun deselectAll(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Invalidate and update the current dialog content list.
   * **Note:** This method does nothing on native file dialogs.
   */
  public final fun invalidate(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.invalidatePtr, NIL)
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
        Internals.getMethodBindPtr("FileDialog", "clear_filters", 3218959716)

    public val addFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "add_filter", 3388804757)

    public val setFiltersPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_filters", 4015028928)

    public val getFiltersPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_filters", 1139954409)

    public val getOptionNamePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_option_name", 844755477)

    public val getOptionValuesPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_option_values", 647634434)

    public val getOptionDefaultPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_option_default", 923996154)

    public val setOptionNamePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_option_name", 501894301)

    public val setOptionValuesPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_option_values", 3353661094)

    public val setOptionDefaultPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_option_default", 3937882851)

    public val setOptionCountPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_option_count", 1286410249)

    public val getOptionCountPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_option_count", 3905245786)

    public val addOptionPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "add_option", 149592325)

    public val getSelectedOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_selected_options", 3102165223)

    public val getCurrentDirPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_current_dir", 201670096)

    public val getCurrentFilePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_current_file", 201670096)

    public val getCurrentPathPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_current_path", 201670096)

    public val setCurrentDirPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_current_dir", 83702148)

    public val setCurrentFilePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_current_file", 83702148)

    public val setCurrentPathPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_current_path", 83702148)

    public val setModeOverridesTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_mode_overrides_title", 2586408642)

    public val isModeOverridingTitlePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "is_mode_overriding_title", 36873697)

    public val setFileModePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_file_mode", 3654936397)

    public val getFileModePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_file_mode", 4074825319)

    public val getVboxPtr: VoidPtr = Internals.getMethodBindPtr("FileDialog", "get_vbox", 915758477)

    public val getLineEditPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_line_edit", 4071694264)

    public val setAccessPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_access", 4104413466)

    public val getAccessPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_access", 3344081076)

    public val setRootSubfolderPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_root_subfolder", 83702148)

    public val getRootSubfolderPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_root_subfolder", 201670096)

    public val setShowHiddenFilesPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_show_hidden_files", 2586408642)

    public val isShowingHiddenFilesPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "is_showing_hidden_files", 36873697)

    public val setUseNativeDialogPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "set_use_native_dialog", 2586408642)

    public val getUseNativeDialogPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "get_use_native_dialog", 36873697)

    public val deselectAllPtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "deselect_all", 3218959716)

    public val invalidatePtr: VoidPtr =
        Internals.getMethodBindPtr("FileDialog", "invalidate", 3218959716)
  }
}
