// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Version Control System (VCS) interface which reads and writes to the local VCS in use.
 *
 * Used by the editor to display VCS extracted information in the editor. The implementation of this API is included in VCS addons, which are essentially GDNative plugins that need to be put into the project folder. These VCS addons are scripts which are attached (on demand) to the object instance of `EditorVCSInterface`. All the functions listed below, instead of performing the task themselves, they call the internally defined functions in the VCS addons to provide a plug-n-play experience.
 */
@GodotBaseType
open class EditorVCSInterface : Object() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORVCSINTERFACE)
  }

  open fun _commit(msg: String) {
  }

  open fun _getFileDiff(filePath: String): VariantArray<Any?> {
    throw NotImplementedError("_get_file_diff is not implemented for EditorVCSInterface")
  }

  open fun _getModifiedFilesData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_modified_files_data is not implemented for EditorVCSInterface")
  }

  open fun _getProjectName(): String {
    throw NotImplementedError("_get_project_name is not implemented for EditorVCSInterface")
  }

  open fun _getVcsName(): String {
    throw NotImplementedError("_get_vcs_name is not implemented for EditorVCSInterface")
  }

  open fun _initialize(projectRootPath: String): Boolean {
    throw NotImplementedError("_initialize is not implemented for EditorVCSInterface")
  }

  open fun _isVcsInitialized(): Boolean {
    throw NotImplementedError("_is_vcs_initialized is not implemented for EditorVCSInterface")
  }

  open fun _shutDown(): Boolean {
    throw NotImplementedError("_shut_down is not implemented for EditorVCSInterface")
  }

  open fun _stageFile(filePath: String) {
  }

  open fun _unstageFile(filePath: String) {
  }

  /**
   * Creates a version commit if the addon is initialized, else returns without doing anything. Uses the files which have been staged previously, with the commit message set to a value as provided as in the argument.
   */
  open fun commit(msg: String) {
    TransferContext.writeArguments(STRING to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_COMMIT, NIL)
  }

  /**
   * Returns an [godot.Array] of [godot.core.Dictionary] objects containing the diff output from the VCS in use, if a VCS addon is initialized, else returns an empty [godot.Array] object. The diff contents also consist of some contextual lines which provide context to the observed line change in the file.
   *
   * Each [godot.core.Dictionary] object has the line diff contents under the keys:
   *
   * - `"content"` to store a [godot.String] containing the line contents
   *
   * - `"status"` to store a [godot.String] which contains `"+"` in case the content is a line addition but it stores a `"-"` in case of deletion and an empty string in the case the line content is neither an addition nor a deletion.
   *
   * - `"new_line_number"` to store an integer containing the new line number of the line content.
   *
   * - `"line_count"` to store an integer containing the number of lines in the line content.
   *
   * - `"old_line_number"` to store an integer containing the old line number of the line content.
   *
   * - `"offset"` to store the offset of the line change since the first contextual line content.
   */
  open fun getFileDiff(filePath: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_FILE_DIFF,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a [godot.core.Dictionary] containing the path of the detected file change mapped to an integer signifying what kind of a change the corresponding file has experienced.
   *
   * The following integer values are being used to signify that the detected file is:
   *
   * - `0`: New to the VCS working directory
   *
   * - `1`: Modified
   *
   * - `2`: Renamed
   *
   * - `3`: Deleted
   *
   * - `4`: Typechanged
   */
  open fun getModifiedFilesData(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_MODIFIED_FILES_DATA, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the project name of the VCS working directory.
   */
  open fun getProjectName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_PROJECT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the VCS if the VCS has been initialized, else return an empty string.
   */
  open fun getVcsName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_VCS_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Initializes the VCS addon if not already. Uses the argument value as the path to the working directory of the project. Creates the initial commit if required. Returns `true` if no failure occurs, else returns `false`.
   */
  open fun initialize(projectRootPath: String): Boolean {
    TransferContext.writeArguments(STRING to projectRootPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_INITIALIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the addon is ready to respond to function calls, else returns `false`.
   */
  open fun isAddonReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_ADDON_READY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the VCS addon has been initialized, else returns `false`.
   */
  open fun isVcsInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_VCS_INITIALIZED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Shuts down the VCS addon to allow cleanup code to run on call. Returns `true` is no failure occurs, else returns `false`.
   */
  open fun shutDown(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_SHUT_DOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stages the file which should be committed when [godot.EditorVCSInterface.commit] is called. Argument should contain the absolute path.
   */
  open fun stageFile(filePath: String) {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_STAGE_FILE, NIL)
  }

  /**
   * Unstages the file which was staged previously to be committed, so that it is no longer committed when [godot.EditorVCSInterface.commit] is called. Argument should contain the absolute path.
   */
  open fun unstageFile(filePath: String) {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_UNSTAGE_FILE,
        NIL)
  }
}
