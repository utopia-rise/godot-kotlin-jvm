// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A script that is executed when exporting projects.
 */
@GodotBaseType
open class EditorExportPlugin : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITOREXPORTPLUGIN)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Virtual method to be overridden by the user. It is called when the export starts and provides all information about the export.
   */
  open fun _exportBegin(
    features: PoolStringArray,
    isDebug: Boolean,
    path: String,
    flags: Long
  ) {
  }

  /**
   * Virtual method to be overridden by the user. Called when the export is finished.
   */
  open fun _exportEnd() {
  }

  /**
   *
   */
  open fun _exportFile(
    path: String,
    type: String,
    features: PoolStringArray
  ) {
  }

  /**
   *
   */
  open fun addFile(
    path: String,
    file: PoolByteArray,
    remap: Boolean
  ) {
    TransferContext.writeArguments(STRING to path, POOL_BYTE_ARRAY to file, BOOL to remap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_FILE, NIL)
  }

  /**
   *
   */
  open fun addIosBundleFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_BUNDLE_FILE, NIL)
  }

  /**
   *
   */
  open fun addIosCppCode(code: String) {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_CPP_CODE,
        NIL)
  }

  /**
   * Adds a static library (*.a) or dynamic library (*.dylib, *.framework) to Linking Phase in iOS's Xcode project.
   */
  open fun addIosFramework(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_FRAMEWORK, NIL)
  }

  /**
   *
   */
  open fun addIosLinkerFlags(flags: String) {
    TransferContext.writeArguments(STRING to flags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_LINKER_FLAGS, NIL)
  }

  /**
   *
   */
  open fun addIosPlistContent(plistContent: String) {
    TransferContext.writeArguments(STRING to plistContent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_PLIST_CONTENT, NIL)
  }

  /**
   *
   */
  open fun addIosProjectStaticLib(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_IOS_PROJECT_STATIC_LIB, NIL)
  }

  /**
   *
   */
  open fun addSharedObject(path: String, tags: PoolStringArray) {
    TransferContext.writeArguments(STRING to path, POOL_STRING_ARRAY to tags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_ADD_SHARED_OBJECT, NIL)
  }

  /**
   *
   */
  open fun skip() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITOREXPORTPLUGIN_SKIP, NIL)
  }
}
