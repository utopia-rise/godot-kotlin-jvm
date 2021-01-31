// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorVCSInterface : Object() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORVCSINTERFACE)

  open fun _commit(msg: String) {
  }

  open fun _get_file_diff(filePath: String): VariantArray<Any?> {
    throw NotImplementedError("_get_file_diff is not implemented for EditorVCSInterface")
  }

  open fun _get_modified_files_data(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_modified_files_data is not implemented for EditorVCSInterface")
  }

  open fun _get_project_name(): String {
    throw NotImplementedError("_get_project_name is not implemented for EditorVCSInterface")
  }

  open fun _get_vcs_name(): String {
    throw NotImplementedError("_get_vcs_name is not implemented for EditorVCSInterface")
  }

  open fun _initialize(projectRootPath: String): Boolean {
    throw NotImplementedError("_initialize is not implemented for EditorVCSInterface")
  }

  open fun _is_vcs_initialized(): Boolean {
    throw NotImplementedError("_is_vcs_initialized is not implemented for EditorVCSInterface")
  }

  open fun _shut_down(): Boolean {
    throw NotImplementedError("_shut_down is not implemented for EditorVCSInterface")
  }

  open fun _stage_file(filePath: String) {
  }

  open fun _unstage_file(filePath: String) {
  }

  open fun commit(msg: String) {
    TransferContext.writeArguments(STRING to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_COMMIT, NIL)
  }

  open fun getFileDiff(filePath: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_FILE_DIFF,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getModifiedFilesData(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_MODIFIED_FILES_DATA, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun getProjectName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_PROJECT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getVcsName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_VCS_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun initialize(projectRootPath: String): Boolean {
    TransferContext.writeArguments(STRING to projectRootPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_INITIALIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isAddonReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_ADDON_READY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isVcsInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_VCS_INITIALIZED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun shutDown(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_SHUT_DOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun stageFile(filePath: String) {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_STAGE_FILE, NIL)
  }

  open fun unstageFile(filePath: String) {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_UNSTAGE_FILE,
        NIL)
  }

  companion object
}
