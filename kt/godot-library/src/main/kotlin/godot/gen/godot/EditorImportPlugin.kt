// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Registers a custom resource importer in the editor. Use the class to parse any file and import it as a new resource type.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/import_plugins.html]($DOCS_URL/tutorials/plugins/editor/import_plugins.html)
 *
 * [godot.EditorImportPlugin]s provide a way to extend the editor's resource import functionality. Use them to import resources from custom files or to provide alternatives to the editor's existing importers.
 *
 * EditorImportPlugins work by associating with specific file extensions and a resource type. See [_getRecognizedExtensions] and [_getResourceType]. They may optionally specify some import presets that affect the import process. EditorImportPlugins are responsible for creating the resources and saving them in the `.godot/imported` directory (see [godot.ProjectSettings.application/config/useHiddenProjectDataDirectory]).
 *
 * Below is an example EditorImportPlugin that imports a [godot.Mesh] from a file with the extension ".special" or ".spec":
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * @tool
 *
 * extends EditorImportPlugin
 *
 *
 *
 * func _get_importer_name():
 *
 *     return "my.special.plugin"
 *
 *
 *
 * func _get_visible_name():
 *
 *     return "Special Mesh"
 *
 *
 *
 * func _get_recognized_extensions():
 *
 *     return ["special", "spec"]
 *
 *
 *
 * func _get_save_extension():
 *
 *     return "mesh"
 *
 *
 *
 * func _get_resource_type():
 *
 *     return "Mesh"
 *
 *
 *
 * func _get_preset_count():
 *
 *     return 1
 *
 *
 *
 * func _get_preset_name(preset_index):
 *
 *     return "Default"
 *
 *
 *
 * func _get_import_options(path, preset_index):
 *
 *     return [{"name": "my_option", "default_value": false}]
 *
 *
 *
 * func _import(source_file, save_path, options, platform_variants, gen_files):
 *
 *     var file = FileAccess.open(source_file, FileAccess.READ)
 *
 *     if file == null:
 *
 *         return FAILED
 *
 *     var mesh = ArrayMesh.new()
 *
 *     # Fill the Mesh with data read in "file", left as an exercise to the reader.
 *
 *
 *
 *     var filename = save_path + "." + _get_save_extension()
 *
 *     return ResourceSaver.save(mesh, filename)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 *
 *
 * public partial class MySpecialPlugin : EditorImportPlugin
 *
 * {
 *
 *     public override string _GetImporterName()
 *
 *     {
 *
 *         return "my.special.plugin";
 *
 *     }
 *
 *
 *
 *     public override string _GetVisibleName()
 *
 *     {
 *
 *         return "Special Mesh";
 *
 *     }
 *
 *
 *
 *     public override string[] _GetRecognizedExtensions()
 *
 *     {
 *
 *         return new string[] { "special", "spec" };
 *
 *     }
 *
 *
 *
 *     public override string _GetSaveExtension()
 *
 *     {
 *
 *         return "mesh";
 *
 *     }
 *
 *
 *
 *     public override string _GetResourceType()
 *
 *     {
 *
 *         return "Mesh";
 *
 *     }
 *
 *
 *
 *     public override int _GetPresetCount()
 *
 *     {
 *
 *         return 1;
 *
 *     }
 *
 *
 *
 *     public override string _GetPresetName(int presetIndex)
 *
 *     {
 *
 *         return "Default";
 *
 *     }
 *
 *
 *
 *     public override Godot.Collections.Array<Godot.Collections.Dictionary> _GetImportOptions(string path, int presetIndex)
 *
 *     {
 *
 *         return new Godot.Collections.Array<Godot.Collections.Dictionary>
 *
 *         {
 *
 *             new Godot.Collections.Dictionary
 *
 *             {
 *
 *                 { "name", "myOption" },
 *
 *                 { "default_value", false },
 *
 *             }
 *
 *         };
 *
 *     }
 *
 *
 *
 *     public override int _Import(string sourceFile, string savePath, Godot.Collections.Dictionary options, Godot.Collections.Array<string> platformVariants, Godot.Collections.Array<string> genFiles)
 *
 *     {
 *
 *         using var file = FileAccess.Open(sourceFile, FileAccess.ModeFlags.Read);
 *
 *         if (file.GetError() != Error.Ok)
 *
 *         {
 *
 *             return (int)Error.Failed;
 *
 *         }
 *
 *
 *
 *         var mesh = new ArrayMesh();
 *
 *         // Fill the Mesh with data read in "file", left as an exercise to the reader.
 *
 *         string filename = $"{savePath}.{_GetSaveExtension()}";
 *
 *         return (int)ResourceSaver.Save(mesh, filename);
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To use [godot.EditorImportPlugin], register it using the [godot.EditorPlugin.addImportPlugin] method first.
 */
@GodotBaseType
public open class EditorImportPlugin internal constructor() : ResourceImporter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORIMPORTPLUGIN, scriptIndex)
    return true
  }

  /**
   * Gets the unique name of the importer.
   */
  public open fun _getImporterName(): String {
    throw NotImplementedError("_get_importer_name is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the name to display in the import window. You should choose this name as a continuation to "Import as", e.g. "Import as Special Mesh".
   */
  public open fun _getVisibleName(): String {
    throw NotImplementedError("_get_visible_name is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the number of initial presets defined by the plugin. Use [_getImportOptions] to get the default options for the preset and [_getPresetName] to get the name of the preset.
   */
  public open fun _getPresetCount(): Int {
    throw NotImplementedError("_get_preset_count is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the name of the options preset at this index.
   */
  public open fun _getPresetName(presetIndex: Int): String {
    throw NotImplementedError("_get_preset_name is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the list of file extensions to associate with this loader (case-insensitive). e.g. `["obj"]`.
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the options and default values for the preset at this index. Returns an Array of Dictionaries with the following keys: `name`, `default_value`, `property_hint` (optional), `hint_string` (optional), `usage` (optional).
   */
  public open fun _getImportOptions(path: String, presetIndex: Int):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_import_options is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the extension used to save this resource in the `.godot/imported` directory (see [godot.ProjectSettings.application/config/useHiddenProjectDataDirectory]).
   */
  public open fun _getSaveExtension(): String {
    throw NotImplementedError("_get_save_extension is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the Godot resource type associated with this loader. e.g. `"Mesh"` or `"Animation"`.
   */
  public open fun _getResourceType(): String {
    throw NotImplementedError("_get_resource_type is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the priority of this plugin for the recognized extension. Higher priority plugins will be preferred. The default priority is `1.0`.
   */
  public open fun _getPriority(): Float {
    throw NotImplementedError("_get_priority is not implemented for EditorImportPlugin")
  }

  /**
   * Gets the order of this importer to be run when importing resources. Importers with *lower* import orders will be called first, and higher values will be called later. Use this to ensure the importer runs after the dependencies are already imported. The default import order is `0` unless overridden by a specific importer. See [enum ResourceImporter.ImportOrder] for some predefined values.
   */
  public open fun _getImportOrder(): Int {
    throw NotImplementedError("_get_import_order is not implemented for EditorImportPlugin")
  }

  /**
   * This method can be overridden to hide specific import options if conditions are met. This is mainly useful for hiding options that depend on others if one of them is disabled. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _get_option_visibility(option, options):
   *
   *     # Only show the lossy quality setting if the compression mode is set to "Lossy".
   *
   *     if option == "compress/lossy_quality" and options.has("compress/mode"):
   *
   *         return int(options["compress/mode"]) == COMPRESS_LOSSY # This is a constant that you set
   *
   *
   *
   *     return true
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public void _GetOptionVisibility(string option, Godot.Collections.Dictionary options)
   *
   * {
   *
   *     // Only show the lossy quality setting if the compression mode is set to "Lossy".
   *
   *     if (option == "compress/lossy_quality" && options.ContainsKey("compress/mode"))
   *
   *     {
   *
   *         return (int)options["compress/mode"] == CompressLossy; // This is a constant you set
   *
   *     }
   *
   *
   *
   *     return true;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * Returns `true` to make all options always visible.
   */
  public open fun _getOptionVisibility(
    path: String,
    optionName: StringName,
    options: Dictionary<Any?, Any?>,
  ): Boolean {
    throw NotImplementedError("_get_option_visibility is not implemented for EditorImportPlugin")
  }

  /**
   * Imports [sourceFile] into [savePath] with the import [options] specified. The [platformVariants] and [genFiles] arrays will be modified by this function.
   *
   * This method must be overridden to do the actual importing work. See this class' description for an example of overriding this method.
   */
  public open fun _import(
    sourceFile: String,
    savePath: String,
    options: Dictionary<Any?, Any?>,
    platformVariants: VariantArray<String>,
    genFiles: VariantArray<String>,
  ): GodotError {
    throw NotImplementedError("_import is not implemented for EditorImportPlugin")
  }

  /**
   * This function can only be called during the [_import] callback and it allows manually importing resources from it. This is useful when the imported file generates external resources that require importing (as example, images). Custom parameters for the ".import" file can be passed via the [customOptions]. Additionally, in cases where multiple importers can handle a file, the [customImporter] ca be specified to force a specific one. This function performs a resource import and returns immediately with a success or error code. [generatorParameters] defines optional extra metadata which will be stored as `generator_parameters` in the `remap` section of the `.import` file, for example to store a md5 hash of the source data.
   */
  @JvmOverloads
  public fun appendImportExternalResource(
    path: String,
    customOptions: Dictionary<Any?, Any?> = Dictionary(),
    customImporter: String = "",
    generatorParameters: Any? = null,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, DICTIONARY to customOptions, STRING to customImporter, ANY to generatorParameters)
    TransferContext.callMethod(rawPtr, MethodBindings.appendImportExternalResourcePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val _getImporterNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_importer_name")

    public val _getVisibleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_visible_name")

    public val _getPresetCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_preset_count")

    public val _getPresetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_preset_name")

    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_recognized_extensions")

    public val _getImportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_import_options")

    public val _getSaveExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_save_extension")

    public val _getResourceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_resource_type")

    public val _getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_priority")

    public val _getImportOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_import_order")

    public val _getOptionVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "_get_option_visibility")

    public val _importPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorImportPlugin", "_import")

    public val appendImportExternalResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorImportPlugin", "append_import_external_resource")
  }
}
