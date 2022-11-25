// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
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
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITOREXPORTPLUGIN)
  }

  /**
   * Virtual method to be overridden by the user. Called for each exported file, providing arguments that can be used to identify the file. [path] is the path of the file, [type] is the [godot.Resource] represented by the file (e.g. [godot.PackedScene]) and [features] is the list of features for the export.
   *
   * Calling [skip] inside this callback will make the file not included in the export.
   */
  public open fun _exportFile(
    path: String,
    type: String,
    features: PackedStringArray
  ): Unit {
  }

  /**
   * Virtual method to be overridden by the user. It is called when the export starts and provides all information about the export. [features] is the list of features for the export, [isDebug] is `true` for debug builds, [path] is the target path for the exported project. [flags] is only used when running a runnable profile, e.g. when using native run on Android.
   */
  public open fun _exportBegin(
    features: PackedStringArray,
    isDebug: Boolean,
    path: String,
    flags: Long
  ): Unit {
  }

  /**
   * Virtual method to be overridden by the user. Called when the export is finished.
   */
  public open fun _exportEnd(): Unit {
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
    target: String
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
    remap: Boolean
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

  public fun addOsxPluginFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_OSX_PLUGIN_FILE, NIL)
  }

  /**
   * To be called inside [_exportFile]. Skips the current file, so it's not included in the export.
   */
  public fun skip(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_SKIP, NIL)
  }

  public companion object
}
