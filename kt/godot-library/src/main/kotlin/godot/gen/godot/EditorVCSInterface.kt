// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Int
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

  public fun isAddonReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_ADDON_READY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun initialize(projectRootPath: String): Boolean {
    TransferContext.writeArguments(STRING to projectRootPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_INITIALIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun isVcsInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_IS_VCS_INITIALIZED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getModifiedFilesData(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_MODIFIED_FILES_DATA, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public fun stageFile(filePath: String): Unit {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_STAGE_FILE, NIL)
  }

  public fun unstageFile(filePath: String): Unit {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_UNSTAGE_FILE,
        NIL)
  }

  public fun commit(msg: String): Unit {
    TransferContext.writeArguments(STRING to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_COMMIT, NIL)
  }

  public fun getFileDiff(filePath: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to filePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_FILE_DIFF,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun shutDown(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_SHUT_DOWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getProjectName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_PROJECT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getVcsName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORVCSINTERFACE_GET_VCS_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
