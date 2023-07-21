// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A script that is executed when exporting the project.
 *
 * [godot.EditorExportPlugin]s are automatically invoked whenever the user exports the project. Their most common use is to determine what files are being included in the exported project. For each plugin, [_exportBegin] is called at the beginning of the export process and then [_exportFile] is called for each exported file.
 *
 * To use [godot.EditorExportPlugin], register it using the [godot.EditorPlugin.addExportPlugin] method first.
 */
@GodotBaseType
public open class EditorExportPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITOREXPORTPLUGIN, scriptIndex)
    return true
  }

  /**
   * Virtual method to be overridden by the user. Called for each exported file, providing arguments that can be used to identify the file. [path] is the path of the file, [type] is the [godot.Resource] represented by the file (e.g. [godot.PackedScene]) and [features] is the list of features for the export.
   *
   * Calling [skip] inside this callback will make the file not included in the export.
   */
  public open fun _exportFile(
    path: String,
    type: String,
    features: PackedStringArray,
  ): Unit {
  }

  /**
   * Virtual method to be overridden by the user. It is called when the export starts and provides all information about the export. [features] is the list of features for the export, [isDebug] is `true` for debug builds, [path] is the target path for the exported project. [flags] is only used when running a runnable profile, e.g. when using native run on Android.
   */
  public open fun _exportBegin(
    features: PackedStringArray,
    isDebug: Boolean,
    path: String,
    flags: Long,
  ): Unit {
  }

  /**
   * Virtual method to be overridden by the user. Called when the export is finished.
   */
  public open fun _exportEnd(): Unit {
  }

  /**
   * Return `true` if this plugin will customize resources based on the platform and features used.
   *
   * When enabled, [_getCustomizationConfigurationHash], [_customizeResource] and [_customizeScene] will be called and must be implemented.
   */
  public open fun _beginCustomizeResources(platform: EditorExportPlatform,
      features: PackedStringArray): Boolean {
    throw NotImplementedError("_begin_customize_resources is not implemented for EditorExportPlugin")
  }

  /**
   * Customize a resource. If changes are made to it, return the same or a new resource. Otherwise, return `null`.
   *
   * The *path* argument is only used when customizing an actual file, otherwise this means that this resource is part of another one and it will be empty.
   *
   * Implementing this method is required if [_beginCustomizeResources] returns `true`.
   */
  public open fun _customizeResource(resource: Resource, path: String): Resource? {
    throw NotImplementedError("_customize_resource is not implemented for EditorExportPlugin")
  }

  /**
   * Return true if this plugin will customize scenes based on the platform and features used.
   */
  public open fun _beginCustomizeScenes(platform: EditorExportPlatform,
      features: PackedStringArray): Boolean {
    throw NotImplementedError("_begin_customize_scenes is not implemented for EditorExportPlugin")
  }

  /**
   * Customize a scene. If changes are made to it, return the same or a new scene. Otherwise, return `null`. If a new scene is returned, it is up to you to dispose of the old one.
   *
   * Implementing this method is required if [_beginCustomizeResources] returns `true`.
   */
  public open fun _customizeScene(scene: Node, path: String): Node? {
    throw NotImplementedError("_customize_scene is not implemented for EditorExportPlugin")
  }

  /**
   * Return a hash based on the configuration passed (for both scenes and resources). This helps keep separate caches for separate export configurations.
   *
   * Implementing this method is required if [_beginCustomizeResources] returns `true`.
   */
  public open fun _getCustomizationConfigurationHash(): Long {
    throw NotImplementedError("_get_customization_configuration_hash is not implemented for EditorExportPlugin")
  }

  /**
   * This is called when the customization process for scenes ends.
   */
  public open fun _endCustomizeScenes(): Unit {
  }

  /**
   * This is called when the customization process for resources ends.
   */
  public open fun _endCustomizeResources(): Unit {
  }

  /**
   * Return a list of export options that can be configured for this export plugin.
   *
   * Each element in the return value is a [godot.core.Dictionary] with the following keys:
   *
   * - `option`: A dictionary with the structure documented by [godot.Object.getPropertyList], but all keys are optional.
   *
   * - `default_value`: The default value for this option.
   *
   * - `update_visibility`: An optional boolean value. If set to `true`, the preset will emit [godot.Object.propertyListChanged] when the option is changed.
   */
  public open fun _getExportOptions(platform: EditorExportPlatform):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_export_options is not implemented for EditorExportPlugin")
  }

  /**
   * Return `true`, if the result of [_getExportOptions] has changed and the export options of preset corresponding to [platform] should be updated.
   */
  public open fun _shouldUpdateExportOptions(platform: EditorExportPlatform): Boolean {
    throw NotImplementedError("_should_update_export_options is not implemented for EditorExportPlugin")
  }

  /**
   * Return a [godot.PackedStringArray] of additional features this preset, for the given [platform], should have.
   */
  public open fun _getExportFeatures(platform: EditorExportPlatform, debug: Boolean):
      PackedStringArray {
    throw NotImplementedError("_get_export_features is not implemented for EditorExportPlugin")
  }

  /**
   * Return the name identifier of this plugin (for future identification by the exporter). The plugins are sorted by name before exporting.
   *
   * Implementing this method is required.
   */
  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for EditorExportPlugin")
  }

  /**
   * Adds a shared object or a directory containing only shared objects with the given [tags] and destination [path].
   *
   * **Note:** In case of macOS exports, those shared objects will be added to `Frameworks` directory of app bundle.
   *
   * In case of a directory code-sign will error if you place non code object in directory.
   */
  public fun addSharedObject(
    path: String,
    tags: PackedStringArray,
    target: String,
  ): Unit {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to tags, STRING to target)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_SHARED_OBJECT, NIL)
  }

  /**
   * Adds a static lib from the given [path] to the iOS project.
   */
  public fun addIosProjectStaticLib(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_PROJECT_STATIC_LIB, NIL)
  }

  /**
   * Adds a custom file to be exported. [path] is the virtual path that can be used to load the file, [file] is the binary data of the file. If [remap] is `true`, file will not be exported, but instead remapped to the given [path].
   */
  public fun addFile(
    path: String,
    `file`: PackedByteArray,
    remap: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to file, BOOL to remap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_FILE, NIL)
  }

  /**
   * Adds a static library (*.a) or dynamic library (*.dylib, *.framework) to Linking Phase in iOS's Xcode project.
   */
  public fun addIosFramework(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_FRAMEWORK, NIL)
  }

  /**
   * Adds a dynamic library (*.dylib, *.framework) to Linking Phase in iOS's Xcode project and embeds it into resulting binary.
   *
   * **Note:** For static libraries (*.a) works in same way as `add_ios_framework`.
   *
   * This method should not be used for System libraries as they are already present on the device.
   */
  public fun addIosEmbeddedFramework(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_EMBEDDED_FRAMEWORK, NIL)
  }

  /**
   * Adds content for iOS Property List files.
   */
  public fun addIosPlistContent(plistContent: String): Unit {
    TransferContext.writeArguments(STRING to plistContent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_PLIST_CONTENT, NIL)
  }

  /**
   * Adds linker flags for the iOS export.
   */
  public fun addIosLinkerFlags(flags: String): Unit {
    TransferContext.writeArguments(STRING to flags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_LINKER_FLAGS, NIL)
  }

  /**
   * Adds an iOS bundle file from the given [path] to the exported project.
   */
  public fun addIosBundleFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_BUNDLE_FILE, NIL)
  }

  /**
   * Adds a C++ code to the iOS export. The final code is created from the code appended by each active export plugin.
   */
  public fun addIosCppCode(code: String): Unit {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_CPP_CODE,
        NIL)
  }

  /**
   * Adds file or directory matching [path] to `PlugIns` directory of macOS app bundle.
   *
   * **Note:** This is useful only for macOS exports.
   */
  public fun addMacosPluginFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_MACOS_PLUGIN_FILE, NIL)
  }

  /**
   * To be called inside [_exportFile]. Skips the current file, so it's not included in the export.
   */
  public fun skip(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_SKIP, NIL)
  }

  /**
   * Returns the current value of an export option supplied by [_getExportOptions].
   */
  public fun getOption(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_GET_OPTION, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object
}
