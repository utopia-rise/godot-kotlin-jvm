// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Contains global variables accessible from everywhere.
 *
 * Contains global variables accessible from everywhere. Use [getSetting], [setSetting] or [hasSetting] to access them. Variables stored in `project.godot` are also loaded into ProjectSettings, making this object very useful for reading custom game configuration options.
 *
 * When naming a Project Settings property, use the full path to the setting including the category. For example, `"application/config/name"` for the project name. Category and property names can be viewed in the Project Settings dialog.
 *
 * **Overriding:** Any project setting can be overridden by creating a file named `override.cfg` in the project's root directory. This can also be used in exported projects by placing this file in the same directory as the project binary.
 */
@GodotBaseType
object ProjectSettings : Object() {
  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_PROJECTSETTINGS)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a custom property info to a property. The dictionary must contain:
   *
   * - `name`: [godot.String] (the property's name)
   *
   * - `type`: [int] (see [enum Variant.Type])
   *
   * - optionally `hint`: [int] (see [enum PropertyHint]) and `hint_string`: [godot.String]
   *
   * **Example:**
   *
   * ```
   * 				ProjectSettings.set("category/property_name", 0)
   *
   * 				var property_info = {
   * 				    "name": "category/property_name",
   * 				    "type": TYPE_INT,
   * 				    "hint": PROPERTY_HINT_ENUM,
   * 				    "hint_string": "one,two,three"
   * 				}
   *
   * 				ProjectSettings.add_property_info(property_info)
   * 				```
   */
  fun addPropertyInfo(hint: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to hint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_ADD_PROPERTY_INFO,
        NIL)
  }

  /**
   * Clears the whole configuration (not recommended, may break things).
   */
  fun clear(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_CLEAR, NIL)
  }

  /**
   * Returns the order of a configuration value (influences when saved to the config file).
   */
  fun getOrder(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_ORDER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of a setting.
   *
   * **Example:**
   *
   * ```
   * 				print(ProjectSettings.get_setting("application/config/name"))
   * 				```
   */
  fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Converts a localized path (`res://`) to a full native OS path.
   */
  fun globalizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GLOBALIZE_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if a configuration value is present.
   */
  fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_HAS_SETTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads the contents of the .pck or .zip file specified by `pack` into the resource filesystem (`res://`). Returns `true` on success.
   *
   * **Note:** If a file from `pack` shares the same path as a file already in the resource filesystem, any attempts to load that file will use the file from `pack` unless `replace_files` is set to `false`.
   */
  fun loadResourcePack(
    pack: String,
    replaceFiles: Boolean = true,
    offset: Long = 0
  ): Boolean {
    TransferContext.writeArguments(STRING to pack, BOOL to replaceFiles, LONG to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOAD_RESOURCE_PACK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Convert a path to a localized path (`res://` path).
   */
  fun localizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOCALIZE_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the specified property exists and its initial value differs from the current value.
   */
  fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the specified property's initial value. Returns `null` if the property does not exist.
   */
  fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Saves the configuration to the `project.godot` file.
   */
  fun save(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the configuration to a custom file. The file extension must be `.godot` (to save in text-based [godot.ConfigFile] format) or `.binary` (to save in binary format).
   */
  fun saveCustom(file: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE_CUSTOM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the specified property's initial value. This is the value the property reverts to.
   */
  fun setInitialValue(name: String, value: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_INITIAL_VALUE,
        NIL)
  }

  /**
   * Sets the order of a configuration value (influences when saved to the config file).
   */
  fun setOrder(name: String, position: Long) {
    TransferContext.writeArguments(STRING to name, LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_ORDER, NIL)
  }

  /**
   * Sets the value of a setting.
   *
   * **Example:**
   *
   * ```
   * 				ProjectSettings.set_setting("application/config/name", "Example")
   * 				```
   */
  fun setSetting(name: String, value: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_SETTING, NIL)
  }
}
