// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
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
 * Version Control System (VCS) interface, which reads and writes to the local VCS in use.
 *
 * Defines the API that the editor uses to extract information from the underlying VCS. The implementation of this API is included in VCS plugins, which are GDExtension plugins that inherit [godot.EditorVCSInterface] and are attached (on demand) to the singleton instance of [godot.EditorVCSInterface]. Instead of performing the task themselves, all the virtual functions listed below are calling the internally overridden functions in the VCS plugins to provide a plug-n-play experience. A custom VCS plugin is supposed to inherit from [godot.EditorVCSInterface] and override each of these virtual functions.
 */
@GodotBaseType
public open class EditorVCSInterface internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORVCSINTERFACE, scriptIndex)
    return true
  }

  /**
   * Initializes the VCS plugin when called from the editor. Returns whether or not the plugin was successfully initialized. A VCS project is initialized at `project_path`.
   */
  public open fun _initialize(projectPath: String): Boolean {
    throw NotImplementedError("_initialize is not implemented for EditorVCSInterface")
  }

  /**
   * Set user credentials in the underlying VCS. `username` and `password` are used only during HTTPS authentication unless not already mentioned in the remote URL. `ssh_public_key_path`, `ssh_private_key_path`, and `ssh_passphrase` are only used during SSH authentication.
   */
  public open fun _setCredentials(
    username: String,
    password: String,
    sshPublicKeyPath: String,
    sshPrivateKeyPath: String,
    sshPassphrase: String,
  ): Unit {
  }

  /**
   * Returns an [godot.Array] of [godot.core.Dictionary] items (see [createStatusFile]), each containing the status data of every modified file in the project folder.
   */
  public open fun _getModifiedFilesData(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_modified_files_data is not implemented for EditorVCSInterface")
  }

  /**
   * Stages the file present at `file_path` to the staged area.
   */
  public open fun _stageFile(filePath: String): Unit {
  }

  /**
   * Unstages the file present at `file_path` from the staged area to the unstaged area.
   */
  public open fun _unstageFile(filePath: String): Unit {
  }

  /**
   * Discards the changes made in a file present at `file_path`.
   */
  public open fun _discardFile(filePath: String): Unit {
  }

  /**
   * Commits the currently staged changes and applies the commit `msg` to the resulting commit.
   */
  public open fun _commit(msg: String): Unit {
  }

  /**
   * Returns an array of [godot.core.Dictionary] items (see [createDiffFile], [createDiffHunk], [createDiffLine], [addLineDiffsIntoDiffHunk] and [addDiffHunksIntoDiffFile]), each containing information about a diff. If `identifier` is a file path, returns a file diff, and if it is a commit identifier, then returns a commit diff.
   */
  public open fun _getDiff(identifier: String, area: Int): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_diff is not implemented for EditorVCSInterface")
  }

  /**
   * Shuts down VCS plugin instance. Called when the user either closes the editor or shuts down the VCS plugin through the editor UI.
   */
  public open fun _shutDown(): Boolean {
    throw NotImplementedError("_shut_down is not implemented for EditorVCSInterface")
  }

  /**
   * Returns the name of the underlying VCS provider.
   */
  public open fun _getVcsName(): String {
    throw NotImplementedError("_get_vcs_name is not implemented for EditorVCSInterface")
  }

  /**
   * Returns an [godot.Array] of [godot.core.Dictionary] items (see [createCommit]), each containing the data for a past commit.
   */
  public open fun _getPreviousCommits(maxCommits: Int): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_previous_commits is not implemented for EditorVCSInterface")
  }

  /**
   * Gets an instance of an [godot.Array] of [godot.String]s containing available branch names in the VCS.
   */
  public open fun _getBranchList(): VariantArray<String> {
    throw NotImplementedError("_get_branch_list is not implemented for EditorVCSInterface")
  }

  /**
   * Returns an [godot.Array] of [godot.String]s, each containing the name of a remote configured in the VCS.
   */
  public open fun _getRemotes(): VariantArray<String> {
    throw NotImplementedError("_get_remotes is not implemented for EditorVCSInterface")
  }

  /**
   * Creates a new branch named `branch_name` in the VCS.
   */
  public open fun _createBranch(branchName: String): Unit {
  }

  /**
   * Remove a branch from the local VCS.
   */
  public open fun _removeBranch(branchName: String): Unit {
  }

  /**
   * Creates a new remote destination with name `remote_name` and points it to `remote_url`. This can be an HTTPS remote or an SSH remote.
   */
  public open fun _createRemote(remoteName: String, remoteUrl: String): Unit {
  }

  /**
   * Remove a remote from the local VCS.
   */
  public open fun _removeRemote(remoteName: String): Unit {
  }

  /**
   * Gets the current branch name defined in the VCS.
   */
  public open fun _getCurrentBranchName(): String {
    throw NotImplementedError("_get_current_branch_name is not implemented for EditorVCSInterface")
  }

  /**
   * Checks out a `branch_name` in the VCS.
   */
  public open fun _checkoutBranch(branchName: String): Boolean {
    throw NotImplementedError("_checkout_branch is not implemented for EditorVCSInterface")
  }

  /**
   * Pulls changes from the remote. This can give rise to merge conflicts.
   */
  public open fun _pull(remote: String): Unit {
  }

  /**
   * Pushes changes to the `remote`. Optionally, if `force` is set to true, a force push will override the change history already present on the remote.
   */
  public open fun _push(remote: String, force: Boolean): Unit {
  }

  /**
   * Fetches new changes from the remote, but doesn't write changes to the current working directory. Equivalent to `git fetch`.
   */
  public open fun _fetch(remote: String): Unit {
  }

  /**
   * Returns an [godot.Array] of [godot.core.Dictionary] items (see [createDiffHunk]), each containing a line diff between a file at `file_path` and the `text` which is passed in.
   */
  public open fun _getLineDiff(filePath: String, text: String):
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_line_diff is not implemented for EditorVCSInterface")
  }

  /**
   * Helper function to create a `Dictionary` for storing a line diff. `new_line_no` is the line number in the new file (can be `-1` if the line is deleted). `old_line_no` is the line number in the old file (can be `-1` if the line is added). `content` is the diff text. `status` is a single character string which stores the line origin.
   */
  public fun createDiffLine(
    newLineNo: Int,
    oldLineNo: Int,
    content: String,
    status: String,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to newLineNo.toLong(), LONG to oldLineNo.toLong(), STRING to content, STRING to status)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_CREATE_DIFF_LINE,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to create a `Dictionary` for storing diff hunk data. `old_start` is the starting line number in old file. `new_start` is the starting line number in new file. `old_lines` is the number of lines in the old file. `new_lines` is the number of lines in the new file.
   */
  public fun createDiffHunk(
    oldStart: Int,
    newStart: Int,
    oldLines: Int,
    newLines: Int,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to oldStart.toLong(), LONG to newStart.toLong(), LONG to oldLines.toLong(), LONG to newLines.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_CREATE_DIFF_HUNK,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to create a `Dictionary` for storing old and new diff file paths.
   */
  public fun createDiffFile(newFile: String, oldFile: String): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to newFile, STRING to oldFile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_CREATE_DIFF_FILE,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to create a commit [godot.core.Dictionary] item. `msg` is the commit message of the commit. `author` is a single human-readable string containing all the author's details, e.g. the email and name configured in the VCS. `id` is the identifier of the commit, in whichever format your VCS may provide an identifier to commits. `unix_timestamp` is the UTC Unix timestamp of when the commit was created. `offset_minutes` is the timezone offset in minutes, recorded from the system timezone where the commit was created.
   */
  public fun createCommit(
    msg: String,
    author: String,
    id: String,
    unixTimestamp: Long,
    offsetMinutes: Long,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to msg, STRING to author, STRING to id, LONG to unixTimestamp, LONG to offsetMinutes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_CREATE_COMMIT,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to create a `Dictionary` used by editor to read the status of a file.
   */
  public fun createStatusFile(
    filePath: String,
    changeType: ChangeType,
    area: TreeArea,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to filePath, LONG to changeType.id, LONG to area.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_CREATE_STATUS_FILE, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to add an array of `diff_hunks` into a `diff_file`.
   */
  public fun addDiffHunksIntoDiffFile(diffFile: Dictionary<Any?, Any?>,
      diffHunks: VariantArray<Dictionary<Any?, Any?>>): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(DICTIONARY to diffFile, ARRAY to diffHunks)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_ADD_DIFF_HUNKS_INTO_DIFF_FILE, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Helper function to add an array of `line_diffs` into a `diff_hunk`.
   */
  public fun addLineDiffsIntoDiffHunk(diffHunk: Dictionary<Any?, Any?>,
      lineDiffs: VariantArray<Dictionary<Any?, Any?>>): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(DICTIONARY to diffHunk, ARRAY to lineDiffs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_ADD_LINE_DIFFS_INTO_DIFF_HUNK, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Pops up an error message in the edior which is shown as coming from the underlying VCS. Use this to show VCS specific error messages.
   */
  public fun popupError(msg: String): Unit {
    TransferContext.writeArguments(STRING to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_POPUP_ERROR, NIL)
  }

  public enum class ChangeType(
    id: Long,
  ) {
    /**
     * A new file has been added.
     */
    CHANGE_TYPE_NEW(0),
    /**
     * An earlier added file has been modified.
     */
    CHANGE_TYPE_MODIFIED(1),
    /**
     * An earlier added file has been renamed.
     */
    CHANGE_TYPE_RENAMED(2),
    /**
     * An earlier added file has been deleted.
     */
    CHANGE_TYPE_DELETED(3),
    /**
     * An earlier added file has been typechanged.
     */
    CHANGE_TYPE_TYPECHANGE(4),
    /**
     * A file is left unmerged.
     */
    CHANGE_TYPE_UNMERGED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TreeArea(
    id: Long,
  ) {
    /**
     * A commit is encountered from the commit area.
     */
    TREE_AREA_COMMIT(0),
    /**
     * A file is encountered from the staged area.
     */
    TREE_AREA_STAGED(1),
    /**
     * A file is encountered from the unstaged area.
     */
    TREE_AREA_UNSTAGED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
