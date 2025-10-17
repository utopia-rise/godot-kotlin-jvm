// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Stores variables that can be accessed from everywhere. Use [getSetting], [setSetting] or
 * [hasSetting] to access them. Variables stored in `project.godot` are also loaded into
 * [ProjectSettings], making this object very useful for reading custom game configuration options.
 *
 * When naming a Project Settings property, use the full path to the setting including the category.
 * For example, `"application/config/name"` for the project name. Category and property names can be
 * viewed in the Project Settings dialog.
 *
 * **Feature tags:** Project settings can be overridden for specific platforms and configurations
 * (debug, release, ...) using [url=$DOCS_URL/tutorials/export/feature_tags.html]feature tags[/url].
 *
 * **Overriding:** Any project setting can be overridden by creating a file named `override.cfg` in
 * the project's root directory. This can also be used in exported projects by placing this file in the
 * same directory as the project binary. Overriding will still take the base project settings'
 * [url=$DOCS_URL/tutorials/export/feature_tags.html]feature tags[/url] in account. Therefore, make
 * sure to *also* override the setting with the desired feature tags if you want them to override base
 * project settings on all platforms and configurations.
 */
@GodotBaseType
public object ProjectSettings : Object() {
  /**
   * Emitted when any setting is changed, up to once per process frame.
   */
  @JvmStatic
  public val settingsChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(25)
  }

  /**
   * Returns `true` if a configuration value is present.
   *
   * **Note:** In order to be be detected, custom settings have to be either defined with
   * [setSetting], or exist in the `project.godot` file. This is especially relevant when using
   * [setInitialValue].
   */
  @JvmStatic
  public final fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.hasSettingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the value of a setting.
   *
   * ```gdscript
   * //gdscript
   * ProjectSettings.set_setting("application/config/name", "Example")
   * ```
   *
   * ```csharp
   * //csharp
   * ProjectSettings.SetSetting("application/config/name", "Example");
   * ```
   *
   * This can also be used to erase custom project settings. To do this change the setting value to
   * `null`.
   */
  @JvmStatic
  public final fun setSetting(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setSettingPtr, NIL)
  }

  /**
   * Returns the value of the setting identified by [name]. If the setting doesn't exist and
   * [defaultValue] is specified, the value of [defaultValue] is returned. Otherwise, `null` is
   * returned.
   *
   * ```gdscript
   * //gdscript
   * print(ProjectSettings.get_setting("application/config/name"))
   * print(ProjectSettings.get_setting("application/config/custom_description", "No description
   * specified."))
   * ```
   *
   * ```csharp
   * //csharp
   * GD.Print(ProjectSettings.GetSetting("application/config/name"));
   * GD.Print(ProjectSettings.GetSetting("application/config/custom_description", "No description
   * specified."));
   * ```
   *
   * **Note:** This method doesn't take potential feature overrides into account automatically. Use
   * [getSettingWithOverride] to handle seamlessly.
   *
   * See also [hasSetting] to check whether a setting exists.
   */
  @JvmOverloads
  @JvmStatic
  public final fun getSetting(name: String, defaultValue: Any? = null): Any? {
    TransferContext.writeArguments(STRING to name, ANY to defaultValue)
    TransferContext.callMethod(ptr, MethodBindings.getSettingPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Similar to [getSetting], but applies feature tag overrides if any exists and is valid.
   *
   * **Example:** If the setting override `"application/config/name.windows"` exists, and the
   * following code is executed on a *Windows* operating system, the overridden setting is printed
   * instead:
   *
   * ```gdscript
   * //gdscript
   * print(ProjectSettings.get_setting_with_override("application/config/name"))
   * ```
   *
   * ```csharp
   * //csharp
   * GD.Print(ProjectSettings.GetSettingWithOverride("application/config/name"));
   * ```
   */
  @JvmStatic
  public final fun getSettingWithOverride(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getSettingWithOverridePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns an [Array] of registered global classes. Each global class is represented as a
   * [Dictionary] that contains the following entries:
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
   * **Note:** Both the script and the icon paths are local to the project filesystem, i.e. they
   * start with `res://`.
   */
  @JvmStatic
  public final fun getGlobalClassList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalClassListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Similar to [getSettingWithOverride], but applies feature tag overrides instead of current OS
   * features.
   */
  @JvmStatic
  public final fun getSettingWithOverrideAndCustomFeatures(name: StringName,
      features: PackedStringArray): Any? {
    TransferContext.writeArguments(STRING_NAME to name, PACKED_STRING_ARRAY to features)
    TransferContext.callMethod(ptr, MethodBindings.getSettingWithOverrideAndCustomFeaturesPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the order of a configuration value (influences when saved to the config file).
   */
  @JvmStatic
  public final fun setOrder(name: String, position: Int): Unit {
    TransferContext.writeArguments(STRING to name, LONG to position.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOrderPtr, NIL)
  }

  /**
   * Returns the order of a configuration value (influences when saved to the config file).
   */
  @JvmStatic
  public final fun getOrder(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.getOrderPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the specified setting's initial value. This is the value the setting reverts to. The
   * setting should already exist before calling this method. Note that project settings equal to their
   * default value are not saved, so your code needs to account for that.
   *
   * ```
   * extends EditorPlugin
   *
   * const SETTING_NAME = "addons/my_setting"
   * const SETTING_DEFAULT = 10.0
   *
   * func _enter_tree():
   * 	if not ProjectSettings.has_setting(SETTING_NAME):
   * 		ProjectSettings.set_setting(SETTING_NAME, SETTING_DEFAULT)
   *
   * 	ProjectSettings.set_initial_value(SETTING_NAME, SETTING_DEFAULT)
   * ```
   *
   * If you have a project setting defined by an [EditorPlugin], but want to use it in a running
   * project, you will need a similar code at runtime.
   */
  @JvmStatic
  public final fun setInitialValue(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setInitialValuePtr, NIL)
  }

  /**
   * Defines if the specified setting is considered basic or advanced. Basic settings will always be
   * shown in the project settings. Advanced settings will only be shown if the user enables the
   * "Advanced Settings" option.
   */
  @JvmStatic
  public final fun setAsBasic(name: String, basic: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to basic)
    TransferContext.callMethod(ptr, MethodBindings.setAsBasicPtr, NIL)
  }

  /**
   * Defines if the specified setting is considered internal. An internal setting won't show up in
   * the Project Settings dialog. This is mostly useful for addons that need to store their own
   * internal settings without exposing them directly to the user.
   */
  @JvmStatic
  public final fun setAsInternal(name: String, `internal`: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to internal)
    TransferContext.callMethod(ptr, MethodBindings.setAsInternalPtr, NIL)
  }

  /**
   * Adds a custom property info to a property. The dictionary must contain:
   *
   * - `"name"`: [String] (the property's name)
   *
   * - `"type"`: [int] (see [Variant.Type])
   *
   * - optionally `"hint"`: [int] (see [PropertyHint]) and `"hint_string"`: [String]
   *
   * ```gdscript
   * //gdscript
   * ProjectSettings.set("category/property_name", 0)
   *
   * var property_info = {
   * 	"name": "category/property_name",
   * 	"type": TYPE_INT,
   * 	"hint": PROPERTY_HINT_ENUM,
   * 	"hint_string": "one,two,three"
   * }
   *
   * ProjectSettings.add_property_info(property_info)
   * ```
   *
   * ```csharp
   * //csharp
   * ProjectSettings.Singleton.Set("category/property_name", 0);
   *
   * var propertyInfo = new Godot.Collections.Dictionary
   * {
   * 	{ "name", "category/propertyName" },
   * 	{ "type", (int)Variant.Type.Int },
   * 	{ "hint", (int)PropertyHint.Enum },
   * 	{ "hint_string", "one,two,three" },
   * };
   *
   * ProjectSettings.AddPropertyInfo(propertyInfo);
   * ```
   *
   * **Note:** Setting `"usage"` for the property is not supported. Use [setAsBasic],
   * [setRestartIfChanged], and [setAsInternal] to modify usage flags.
   */
  @JvmStatic
  public final fun addPropertyInfo(hint: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to hint)
    TransferContext.callMethod(ptr, MethodBindings.addPropertyInfoPtr, NIL)
  }

  /**
   * Sets whether a setting requires restarting the editor to properly take effect.
   *
   * **Note:** This is just a hint to display to the user that the editor must be restarted for
   * changes to take effect. Enabling [setRestartIfChanged] does *not* delay the setting being set when
   * changed.
   */
  @JvmStatic
  public final fun setRestartIfChanged(name: String, restart: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to restart)
    TransferContext.callMethod(ptr, MethodBindings.setRestartIfChangedPtr, NIL)
  }

  /**
   * Clears the whole configuration (not recommended, may break things).
   */
  @JvmStatic
  public final fun clear(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the localized path (starting with `res://`) corresponding to the absolute, native OS
   * [path]. See also [globalizePath].
   */
  @JvmStatic
  public final fun localizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.localizePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the absolute, native OS path corresponding to the localized [path] (starting with
   * `res://` or `user://`). The returned path will vary depending on the operating system and user
   * preferences. See [url=$DOCS_URL/tutorials/io/data_paths.html]File paths in Godot projects[/url] to
   * see what those paths convert to. See also [localizePath].
   *
   * **Note:** [globalizePath] with `res://` will not work in an exported project. Instead, prepend
   * the executable's base directory to the path when running from an exported project:
   *
   * ```
   * var path = ""
   * if OS.has_feature("editor"):
   * 	# Running from an editor binary.
   * 	# `path` will contain the absolute path to `hello.txt` located in the project root.
   * 	path = ProjectSettings.globalize_path("res://hello.txt")
   * else:
   * 	# Running from an exported project.
   * 	# `path` will contain the absolute path to `hello.txt` next to the executable.
   * 	# This is *not* identical to using `ProjectSettings.globalize_path()` with a `res://` path,
   * 	# but is close enough in spirit.
   * 	path = OS.get_executable_path().get_base_dir().path_join("hello.txt")
   * ```
   */
  @JvmStatic
  public final fun globalizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.globalizePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Saves the configuration to the `project.godot` file.
   *
   * **Note:** This method is intended to be used by editor plugins, as modified [ProjectSettings]
   * can't be loaded back in the running app. If you want to change project settings in exported
   * projects, use [saveCustom] to save `override.cfg` file.
   */
  @JvmStatic
  public final fun save(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.savePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads the contents of the .pck or .zip file specified by [pack] into the resource filesystem
   * (`res://`). Returns `true` on success.
   *
   * **Note:** If a file from [pack] shares the same path as a file already in the resource
   * filesystem, any attempts to load that file will use the file from [pack] unless [replaceFiles] is
   * set to `false`.
   *
   * **Note:** The optional [offset] parameter can be used to specify the offset in bytes to the
   * start of the resource pack. This is only supported for .pck files.
   *
   * **Note:** [DirAccess] will not show changes made to the contents of `res://` after calling this
   * function.
   */
  @JvmOverloads
  @JvmStatic
  public final fun loadResourcePack(
    pack: String,
    replaceFiles: Boolean = true,
    offset: Int = 0,
  ): Boolean {
    TransferContext.writeArguments(STRING to pack, BOOL to replaceFiles, LONG to offset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.loadResourcePackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Saves the configuration to a custom file. The file extension must be `.godot` (to save in
   * text-based [ConfigFile] format) or `.binary` (to save in binary format). You can also save
   * `override.cfg` file, which is also text, but can be used in exported projects unlike other
   * formats.
   */
  @JvmStatic
  public final fun saveCustom(`file`: String): Error {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(ptr, MethodBindings.saveCustomPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Similar to [getSetting], but applies feature tag overrides if any exists and is valid.
   *
   * **Example:** If the setting override `"application/config/name.windows"` exists, and the
   * following code is executed on a *Windows* operating system, the overridden setting is printed
   * instead:
   *
   * ```gdscript
   * //gdscript
   * print(ProjectSettings.get_setting_with_override("application/config/name"))
   * ```
   *
   * ```csharp
   * //csharp
   * GD.Print(ProjectSettings.GetSettingWithOverride("application/config/name"));
   * ```
   */
  @JvmStatic
  public final fun getSettingWithOverride(name: String): Any? =
      getSettingWithOverride(name.asCachedStringName())

  /**
   * Similar to [getSettingWithOverride], but applies feature tag overrides instead of current OS
   * features.
   */
  @JvmStatic
  public final fun getSettingWithOverrideAndCustomFeatures(name: String,
      features: PackedStringArray): Any? =
      getSettingWithOverrideAndCustomFeatures(name.asCachedStringName(), features)

  public object MethodBindings {
    internal val hasSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "has_setting", 3927539163)

    internal val setSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_setting", 402577236)

    internal val getSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_setting", 223050753)

    internal val getSettingWithOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_setting_with_override", 2760726917)

    internal val getGlobalClassListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_global_class_list", 2915620761)

    internal val getSettingWithOverrideAndCustomFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_setting_with_override_and_custom_features", 2434817427)

    internal val setOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_order", 2956805083)

    internal val getOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "get_order", 1321353865)

    internal val setInitialValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_initial_value", 402577236)

    internal val setAsBasicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_as_basic", 2678287736)

    internal val setAsInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_as_internal", 2678287736)

    internal val addPropertyInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "add_property_info", 4155329257)

    internal val setRestartIfChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "set_restart_if_changed", 2678287736)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "clear", 83702148)

    internal val localizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "localize_path", 3135753539)

    internal val globalizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "globalize_path", 3135753539)

    internal val savePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "save", 166280745)

    internal val loadResourcePackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "load_resource_pack", 708980503)

    internal val saveCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProjectSettings", "save_custom", 166001499)
  }
}
