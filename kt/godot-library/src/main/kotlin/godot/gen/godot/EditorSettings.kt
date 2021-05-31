// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Object that holds the project-independent editor settings.
 *
 * Object that holds the project-independent editor settings. These settings are generally visible in the **Editor > Editor Settings** menu.
 *
 * Property names use slash delimiters to distinguish sections. Setting values can be of any [Variant] type. It's recommended to use `snake_case` for editor settings to be consistent with the Godot editor itself.
 *
 * Accessing the settings can be done using the following methods, such as:
 *
 * ```
 * 		# `settings.set("some/property", value)` also works as this class overrides `_set()` internally.
 * 		settings.set_setting("some/property",value)
 *
 * 		# `settings.get("some/property", value)` also works as this class overrides `_get()` internally.
 * 		settings.get_setting("some/property")
 *
 * 		var list_of_settings = settings.get_property_list()
 * 		```
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getEditorSettings].
 */
@GodotBaseType
public open class EditorSettings : Resource() {
  /**
   * Emitted after any editor setting has changed.
   */
  public val settingsChanged: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSETTINGS)
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
   * ```
   * 				editor_settings.set("category/property_name", 0)
   *
   * 				var property_info = {
   * 				    "name": "category/property_name",
   * 				    "type": TYPE_INT,
   * 				    "hint": PROPERTY_HINT_ENUM,
   * 				    "hint_string": "one,two,three"
   * 				}
   *
   * 				editor_settings.add_property_info(property_info)
   * 				```
   */
  public open fun addPropertyInfo(info: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_ADD_PROPERTY_INFO,
        NIL)
  }

  /**
   * Erases the setting whose name is specified by `property`.
   */
  public open fun erase(`property`: String): Unit {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_ERASE, NIL)
  }

  /**
   * Returns the list of favorite files and directories for this project.
   */
  public open fun getFavorites(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_FAVORITES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns project-specific metadata for the `section` and `key` specified. If the metadata doesn't exist, `default` will be returned instead. See also [setProjectMetadata].
   */
  public open fun getProjectMetadata(
    section: String,
    key: String,
    default: Any? = null
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_PROJECT_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the project-specific settings path. Projects all have a unique subdirectory inside the settings path where project-specific settings are saved.
   */
  public open fun getProjectSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_PROJECT_SETTINGS_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the list of recently visited folders in the file dialog for this project.
   */
  public open fun getRecentDirs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_RECENT_DIRS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the value of the setting specified by `name`. This is equivalent to using [godot.Object.get] on the EditorSettings instance.
   */
  public open fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Gets the global settings path for the engine. Inside this path, you can find some standard paths such as:
   *
   * `settings/tmp` - Used for temporary storage of files
   *
   * `settings/templates` - Where export templates are located
   */
  public open fun getSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_SETTINGS_DIR,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the setting specified by `name` exists, `false` otherwise.
   */
  public open fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_HAS_SETTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the setting specified by `name` can have its value reverted to the default value, `false` otherwise. When this method returns `true`, a Revert button will display next to the setting in the Editor Settings.
   */
  public open fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default value of the setting specified by `name`. This is the value that would be applied when clicking the Revert button in the Editor Settings.
   */
  public open fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the list of favorite files and directories for this project.
   */
  public open fun setFavorites(dirs: PoolStringArray): Unit {
    TransferContext.writeArguments(POOL_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_FAVORITES, NIL)
  }

  /**
   * Sets the initial value of the setting specified by `name` to `value`. This is used to provide a value for the Revert button in the Editor Settings. If `update_current` is true, the current value of the setting will be set to `value` as well.
   */
  public open fun setInitialValue(
    name: String,
    `value`: Any?,
    updateCurrent: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value, BOOL to updateCurrent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_INITIAL_VALUE,
        NIL)
  }

  /**
   * Sets project-specific metadata with the `section`, `key` and `data` specified. This metadata is stored outside the project folder and therefore won't be checked into version control. See also [getProjectMetadata].
   */
  public open fun setProjectMetadata(
    section: String,
    key: String,
    `data`: Any?
  ): Unit {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_PROJECT_METADATA,
        NIL)
  }

  /**
   * Sets the list of recently visited folders in the file dialog for this project.
   */
  public open fun setRecentDirs(dirs: PoolStringArray): Unit {
    TransferContext.writeArguments(POOL_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_RECENT_DIRS, NIL)
  }

  /**
   * Sets the `value` of the setting specified by `name`. This is equivalent to using [godot.Object.set] on the EditorSettings instance.
   */
  public open fun setSetting(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_SETTING, NIL)
  }

  public companion object {
    /**
     * Emitted after any editor setting has changed. It's used by various editor plugins to update their visuals on theme changes or logic on configuration changes.
     */
    public final const val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Long = 10000
  }
}
