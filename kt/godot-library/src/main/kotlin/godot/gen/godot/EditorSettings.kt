// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
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
 * Object that holds the project-independent editor settings.
 *
 * Object that holds the project-independent editor settings. These settings are generally visible in the **Editor > Editor Settings** menu.
 *
 * Property names use slash delimiters to distinguish sections. Setting values can be of any [Variant] type. It's recommended to use `snake_case` for editor settings to be consistent with the Godot editor itself.
 *
 * Accessing the settings can be done using the following methods, such as:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var settings = EditorInterface.get_editor_settings()
 *
 * # `settings.set("some/property", 10)` also works as this class overrides `_set()` internally.
 *
 * settings.set_setting("some/property", 10)
 *
 * # `settings.get("some/property")` also works as this class overrides `_get()` internally.
 *
 * settings.get_setting("some/property")
 *
 * var list_of_settings = settings.get_property_list()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * EditorSettings settings = EditorInterface.Singleton.GetEditorSettings();
 *
 * // `settings.set("some/property", value)` also works as this class overrides `_set()` internally.
 *
 * settings.SetSetting("some/property", Value);
 *
 * // `settings.get("some/property", value)` also works as this class overrides `_get()` internally.
 *
 * settings.GetSetting("some/property");
 *
 * Godot.Collections.Array<Godot.Collections.Dictionary> listOfSettings = settings.GetPropertyList();
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getEditorSettings].
 */
@GodotBaseType
public open class EditorSettings : Resource() {
  /**
   * Emitted after any editor setting has changed.
   */
  public val settingsChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSETTINGS, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the setting specified by [name] exists, `false` otherwise.
   */
  public fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSettingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [value] of the setting specified by [name]. This is equivalent to using [godot.Object.set] on the EditorSettings instance.
   */
  public fun setSetting(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setSettingPtr, NIL)
  }

  /**
   * Returns the value of the setting specified by [name]. This is equivalent to using [godot.Object.get] on the EditorSettings instance.
   */
  public fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSettingPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Erases the setting whose name is specified by [property].
   */
  public fun erase(`property`: String): Unit {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, MethodBindings.erasePtr, NIL)
  }

  /**
   * Sets the initial value of the setting specified by [name] to [value]. This is used to provide a value for the Revert button in the Editor Settings. If [updateCurrent] is true, the current value of the setting will be set to [value] as well.
   */
  public fun setInitialValue(
    name: StringName,
    `value`: Any?,
    updateCurrent: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value, BOOL to updateCurrent)
    TransferContext.callMethod(rawPtr, MethodBindings.setInitialValuePtr, NIL)
  }

  /**
   * Adds a custom property info to a property. The dictionary must contain:
   *
   * - `name`: [godot.String] (the name of the property)
   *
   * - `type`: [int] (see [enum Variant.Type])
   *
   * - optionally `hint`: [int] (see [enum PropertyHint]) and `hint_string`: [godot.String]
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var settings = EditorInterface.get_editor_settings()
   *
   * settings.set("category/property_name", 0)
   *
   *
   *
   * var property_info = {
   *
   *     "name": "category/property_name",
   *
   *     "type": TYPE_INT,
   *
   *     "hint": PROPERTY_HINT_ENUM,
   *
   *     "hint_string": "one,two,three"
   *
   * }
   *
   *
   *
   * settings.add_property_info(property_info)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var settings = GetEditorInterface().GetEditorSettings();
   *
   * settings.Set("category/property_name", 0);
   *
   *
   *
   * var propertyInfo = new Godot.Collections.Dictionary
   *
   * {
   *
   *     {"name", "category/propertyName"},
   *
   *     {"type", Variant.Type.Int},
   *
   *     {"hint", PropertyHint.Enum},
   *
   *     {"hint_string", "one,two,three"}
   *
   * };
   *
   *
   *
   * settings.AddPropertyInfo(propertyInfo);
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun addPropertyInfo(info: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to info)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyInfoPtr, NIL)
  }

  /**
   * Sets project-specific metadata with the [section], [key] and [data] specified. This metadata is stored outside the project folder and therefore won't be checked into version control. See also [getProjectMetadata].
   */
  public fun setProjectMetadata(
    section: String,
    key: String,
    `data`: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.setProjectMetadataPtr, NIL)
  }

  /**
   * Returns project-specific metadata for the [section] and [key] specified. If the metadata doesn't exist, [default] will be returned instead. See also [setProjectMetadata].
   */
  @JvmOverloads
  public fun getProjectMetadata(
    section: String,
    key: String,
    default: Any? = null,
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the list of favorite files and directories for this project.
   */
  public fun setFavorites(dirs: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, MethodBindings.setFavoritesPtr, NIL)
  }

  /**
   * Returns the list of favorite files and directories for this project.
   */
  public fun getFavorites(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFavoritesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Sets the list of recently visited folders in the file dialog for this project.
   */
  public fun setRecentDirs(dirs: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, MethodBindings.setRecentDirsPtr, NIL)
  }

  /**
   * Returns the list of recently visited folders in the file dialog for this project.
   */
  public fun getRecentDirs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRecentDirsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Overrides the built-in editor action [name] with the input actions defined in [actionsList].
   */
  public fun setBuiltinActionOverride(name: String, actionsList: VariantArray<InputEvent>): Unit {
    TransferContext.writeArguments(STRING to name, ARRAY to actionsList)
    TransferContext.callMethod(rawPtr, MethodBindings.setBuiltinActionOverridePtr, NIL)
  }

  /**
   * Checks if any settings with the prefix [settingPrefix] exist in the set of changed settings. See also [getChangedSettings].
   */
  public fun checkChangedSettingsInGroup(settingPrefix: String): Boolean {
    TransferContext.writeArguments(STRING to settingPrefix)
    TransferContext.callMethod(rawPtr, MethodBindings.checkChangedSettingsInGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets an array of the settings which have been changed since the last save. Note that internally `changed_settings` is cleared after a successful save, so generally the most appropriate place to use this method is when processing [NOTIFICATION_EDITOR_SETTINGS_CHANGED].
   */
  public fun getChangedSettings(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChangedSettingsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Marks the passed editor setting as being changed, see [getChangedSettings]. Only settings which exist (see [hasSetting]) will be accepted.
   */
  public fun markSettingChanged(setting: String): Unit {
    TransferContext.writeArguments(STRING to setting)
    TransferContext.callMethod(rawPtr, MethodBindings.markSettingChangedPtr, NIL)
  }

  public companion object {
    /**
     * Emitted after any editor setting has changed. It's used by various editor plugins to update their visuals on theme changes or logic on configuration changes.
     */
    public final const val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Long = 10000
  }

  internal object MethodBindings {
    public val hasSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "has_setting")

    public val setSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_setting")

    public val getSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_setting")

    public val erasePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSettings", "erase")

    public val setInitialValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_initial_value")

    public val addPropertyInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "add_property_info")

    public val setProjectMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_project_metadata")

    public val getProjectMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_project_metadata")

    public val setFavoritesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_favorites")

    public val getFavoritesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_favorites")

    public val setRecentDirsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_recent_dirs")

    public val getRecentDirsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_recent_dirs")

    public val setBuiltinActionOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "set_builtin_action_override")

    public val checkChangedSettingsInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "check_changed_settings_in_group")

    public val getChangedSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "get_changed_settings")

    public val markSettingChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSettings", "mark_setting_changed")
  }
}
