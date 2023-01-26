// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Contains global variables accessible from everywhere.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * Contains global variables accessible from everywhere. Use [getSetting], [setSetting] or [hasSetting] to access them. Variables stored in `project.godot` are also loaded into ProjectSettings, making this object very useful for reading custom game configuration options.
 *
 * When naming a Project Settings property, use the full path to the setting including the category. For example, `"application/config/name"` for the project name. Category and property names can be viewed in the Project Settings dialog.
 *
 * **Feature tags:** Project settings can be overridden for specific platforms and configurations (debug, release, ...) using [feature tags]($DOCS_URL/tutorials/export/feature_tags.html).
 *
 * **Overriding:** Any project setting can be overridden by creating a file named `override.cfg` in the project's root directory. This can also be used in exported projects by placing this file in the same directory as the project binary. Overriding will still take the base project settings' [feature tags]($DOCS_URL/tutorials/export/feature_tags.html) in account. Therefore, make sure to *also* override the setting with the desired feature tags if you want them to override base project settings on all platforms and configurations.
 */
@GodotBaseType
public object ProjectSettings : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_PROJECTSETTINGS)
    return false
  }

  /**
   * Returns `true` if a configuration value is present.
   */
  public fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_HAS_SETTING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the value of a setting.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * ProjectSettings.set_setting("application/config/name", "Example")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * ProjectSettings.SetSetting("application/config/name", "Example");
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * This can also be used to erase custom project settings. To do this change the setting value to `null`.
   */
  public fun setSetting(name: String, `value`: Any): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_SETTING, NIL)
  }

  /**
   * Returns the value of the setting identified by [name]. If the setting doesn't exist and [defaultValue] is specified, the value of [defaultValue] is returned. Otherwise, `null` is returned.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * print(ProjectSettings.get_setting("application/config/name"))
   *
   * print(ProjectSettings.get_setting("application/config/custom_description", "No description specified."))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GD.Print(ProjectSettings.GetSetting("application/config/name"));
   *
   * GD.Print(ProjectSettings.GetSetting("application/config/custom_description", "No description specified."));
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** This method doesn't take potential feature overrides into account automatically. Use [getSettingWithOverride] to handle seamlessly.
   */
  public fun getSetting(name: String, defaultValue: Any? = null): Any? {
    TransferContext.writeArguments(STRING to name, ANY to defaultValue)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_SETTING, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Similar to [getSetting], but applies feature tag overrides if any exists and is valid.
   *
   * **Example:**
   *
   * If the following setting override exists "application/config/name.windows", and the following code is executed:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * print(ProjectSettings.get_setting_with_override("application/config/name"))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GD.Print(ProjectSettings.GetSettingWithOverride("application/config/name"));
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * Then the overridden setting will be returned instead if the project is running on the *Windows* operating system.
   */
  public fun getSettingWithOverride(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_SETTING_WITH_OVERRIDE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns an [godot.Array] of registered global classes. Each global class is represented as a [godot.core.Dictionary] that contains the following entries:
   *
   * - `base` is a name of the base class;
   *
   * - `class` is a name of the registered global class;
   *
   * - `icon` is a path to a custom icon of the global class, if it has any;
   *
   * - `language` is a name of a programming language in which the global class is written;
   *
   * - `path` is a path to a file containing the global class.
   *
   * **Note:** Both the script and the icon paths are local to the project filesystem, i.e. they start with `res://`.
   */
  public fun getGlobalClassList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_GLOBAL_CLASS_LIST, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Sets the order of a configuration value (influences when saved to the config file).
   */
  public fun setOrder(name: String, position: Int): Unit {
    TransferContext.writeArguments(STRING to name, LONG to position.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_ORDER, NIL)
  }

  /**
   * Returns the order of a configuration value (influences when saved to the config file).
   */
  public fun getOrder(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_ORDER, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the specified property's initial value. This is the value the property reverts to.
   */
  public fun setInitialValue(name: String, `value`: Any): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_INITIAL_VALUE,
        NIL)
  }

  public fun setAsBasic(name: String, basic: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to basic)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_AS_BASIC, NIL)
  }

  public fun setAsInternal(name: String, `internal`: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to internal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_AS_INTERNAL,
        NIL)
  }

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
   * [codeblocks]
   *
   * [gdscript]
   *
   * ProjectSettings.set("category/property_name", 0)
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
   * ProjectSettings.add_property_info(property_info)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * ProjectSettings.Singleton.Set("category/property_name", 0);
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
   *     {"hint_string", "one,two,three"},
   *
   * };
   *
   *
   *
   * ProjectSettings.AddPropertyInfo(propertyInfo);
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun addPropertyInfo(hint: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to hint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_ADD_PROPERTY_INFO,
        NIL)
  }

  /**
   * Sets whether a setting requires restarting the editor to properly take effect.
   *
   * **Note:** This is just a hint to display to the user that the editor must be restarted for changes to take effect. Enabling [setRestartIfChanged] does *not* delay the setting being set when changed.
   */
  public fun setRestartIfChanged(name: String, restart: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to restart)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_RESTART_IF_CHANGED, NIL)
  }

  /**
   * Clears the whole configuration (not recommended, may break things).
   */
  public fun clear(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_CLEAR, NIL)
  }

  /**
   * Returns the localized path (starting with `res://`) corresponding to the absolute, native OS [path]. See also [globalizePath].
   */
  public fun localizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOCALIZE_PATH,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the absolute, native OS path corresponding to the localized [path] (starting with `res://` or `user://`). The returned path will vary depending on the operating system and user preferences. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) to see what those paths convert to. See also [localizePath].
   *
   * **Note:** [globalizePath] with `res://` will not work in an exported project. Instead, prepend the executable's base directory to the path when running from an exported project:
   *
   * ```
   * 				var path = ""
   * 				if OS.has_feature("editor"):
   * 				    # Running from an editor binary.
   * 				    # `path` will contain the absolute path to `hello.txt` located in the project root.
   * 				    path = ProjectSettings.globalize_path("res://hello.txt")
   * 				else:
   * 				    # Running from an exported project.
   * 				    # `path` will contain the absolute path to `hello.txt` next to the executable.
   * 				    # This is *not* identical to using `ProjectSettings.globalize_path()` with a `res://` path,
   * 				    # but is close enough in spirit.
   * 				    path = OS.get_executable_path().get_base_dir().path_join("hello.txt")
   * 				```
   */
  public fun globalizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GLOBALIZE_PATH,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Saves the configuration to the `project.godot` file.
   *
   * **Note:** This method is intended to be used by editor plugins, as modified [godot.ProjectSettings] can't be loaded back in the running app. If you want to change project settings in exported projects, use [saveCustom] to save `override.cfg` file.
   */
  public fun save(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Loads the contents of the .pck or .zip file specified by [pack] into the resource filesystem (`res://`). Returns `true` on success.
   *
   * **Note:** If a file from [pack] shares the same path as a file already in the resource filesystem, any attempts to load that file will use the file from [pack] unless [replaceFiles] is set to `false`.
   *
   * **Note:** The optional [offset] parameter can be used to specify the offset in bytes to the start of the resource pack. This is only supported for .pck files.
   */
  public fun loadResourcePack(
    pack: String,
    replaceFiles: Boolean = true,
    offset: Int = 0,
  ): Boolean {
    TransferContext.writeArguments(STRING to pack, BOOL to replaceFiles, LONG to offset.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOAD_RESOURCE_PACK,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Saves the configuration to a custom file. The file extension must be `.godot` (to save in text-based [godot.ConfigFile] format) or `.binary` (to save in binary format). You can also save `override.cfg` file, which is also text, but can be used in exported projects unlike other formats.
   */
  public fun saveCustom(`file`: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE_CUSTOM, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }
}
