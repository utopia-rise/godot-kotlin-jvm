// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Registers a custom resource importer in the editor. Use the class to parse any file and import it as a new resource type.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/plugins/editor/import_plugins.html](https://docs.godotengine.org/en/3.4/tutorials/plugins/editor/import_plugins.html)
 *
 * EditorImportPlugins provide a way to extend the editor's resource import functionality. Use them to import resources from custom files or to provide alternatives to the editor's existing importers. Register your [godot.EditorPlugin] with [godot.EditorPlugin.addImportPlugin].
 *
 * EditorImportPlugins work by associating with specific file extensions and a resource type. See [getRecognizedExtensions] and [getResourceType]. They may optionally specify some import presets that affect the import process. EditorImportPlugins are responsible for creating the resources and saving them in the `.import` directory (see [godot.ProjectSettings.application/config/useHiddenProjectDataDirectory]).
 *
 * Below is an example EditorImportPlugin that imports a [godot.Mesh] from a file with the extension ".special" or ".spec":
 *
 * ```
 * 		tool
 * 		extends EditorImportPlugin
 *
 * 		func get_importer_name():
 * 		    return "my.special.plugin"
 *
 * 		func get_visible_name():
 * 		    return "Special Mesh"
 *
 * 		func get_recognized_extensions():
 * 		    return ["special", "spec"]
 *
 * 		func get_save_extension():
 * 		    return "mesh"
 *
 * 		func get_resource_type():
 * 		    return "Mesh"
 *
 * 		func get_preset_count():
 * 		    return 1
 *
 * 		func get_preset_name(i):
 * 		    return "Default"
 *
 * 		func get_import_options(i):
 * 		    return [{"name": "my_option", "default_value": false}]
 *
 * 		func import(source_file, save_path, options, platform_variants, gen_files):
 * 		    var file = File.new()
 * 		    if file.open(source_file, File.READ) != OK:
 * 		        return FAILED
 *
 * 		    var mesh = Mesh.new()
 * 		    # Fill the Mesh with data read in "file", left as an exercise to the reader
 *
 * 		    var filename = save_path + "." + get_save_extension()
 * 		    return ResourceSaver.save(filename, mesh)
 * 		```
 */
@GodotBaseType
public open class EditorImportPlugin : ResourceImporter() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORIMPORTPLUGIN)
  }

  /**
   * Gets the options and default values for the preset at this index. Returns an Array of Dictionaries with the following keys: `name`, `default_value`, `property_hint` (optional), `hint_string` (optional), `usage` (optional).
   */
  public open fun _getImportOptions(preset: Long): VariantArray<Any?> {
    throw NotImplementedError("get_import_options is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the order of this importer to be run when importing resources. Importers with *lower* import orders will be called first, and higher values will be called later. Use this to ensure the importer runs after the dependencies are already imported. The default import order is `0` unless overridden by a specific importer. See [enum ResourceImporter.ImportOrder] for some predefined values.
   */
  public open fun _getImportOrder(): Long {
    throw NotImplementedError("get_import_order is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the unique name of the importer.
   */
  public open fun _getImporterName(): String {
    throw NotImplementedError("get_importer_name is not implemented for EditorImportPlugin")
  }

  /**
   * This method can be overridden to hide specific import options if conditions are met. This is mainly useful for hiding options that depend on others if one of them is disabled. For example:
   *
   * ```
   * 				func get_option_visibility(option, options):
   * 				    # Only show the lossy quality setting if the compression mode is set to "Lossy".
   * 				    if option == "compress/lossy_quality" and options.has("compress/mode"):
   * 				        return int(options["compress/mode"]) == COMPRESS_LOSSY
   *
   * 				    return true
   * 				```
   *
   * Return `true` to make all options always visible.
   */
  public open fun _getOptionVisibility(option: String, options: Dictionary<Any?, Any?>): Boolean {
    throw NotImplementedError("get_option_visibility is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the number of initial presets defined by the plugin. Use [getImportOptions] to get the default options for the preset and [getPresetName] to get the name of the preset.
   */
  public open fun _getPresetCount(): Long {
    throw NotImplementedError("get_preset_count is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the name of the options preset at this index.
   */
  public open fun _getPresetName(preset: Long): String {
    throw NotImplementedError("get_preset_name is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the priority of this plugin for the recognized extension. Higher priority plugins will be preferred. The default priority is `1.0`.
   */
  public open fun _getPriority(): Double {
    throw NotImplementedError("get_priority is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the list of file extensions to associate with this loader (case-insensitive). e.g. `["obj"]`.
   */
  public open fun _getRecognizedExtensions(): VariantArray<Any?> {
    throw NotImplementedError("get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the Godot resource type associated with this loader. e.g. `"Mesh"` or `"Animation"`.
   */
  public open fun _getResourceType(): String {
    throw NotImplementedError("get_resource_type is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the extension used to save this resource in the `.import` directory (see [godot.ProjectSettings.application/config/useHiddenProjectDataDirectory]).
   */
  public open fun _getSaveExtension(): String {
    throw NotImplementedError("get_save_extension is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the name to display in the import window. You should choose this name as a continuation to "Import as", e.g. "Import as Special Mesh".
   */
  public open fun _getVisibleName(): String {
    throw NotImplementedError("get_visible_name is not implemented for EditorImportPlugin")
  }

  /**
   * Imports `source_file` into `save_path` with the import `options` specified. The `platform_variants` and `gen_files` arrays will be modified by this function.
   *
   * This method must be overridden to do the actual importing work. See this class' description for an example of overriding this method.
   */
  public open fun _import(
    sourceFile: String,
    savePath: String,
    options: Dictionary<Any?, Any?>,
    platformVariants: VariantArray<Any?>,
    genFiles: VariantArray<Any?>
  ): Long {
    throw NotImplementedError("import is not implemented for EditorImportPlugin")
  }
}
