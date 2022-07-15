// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's script editor.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getScriptEditor].
 */
@GodotBaseType
public open class ScriptEditor : PanelContainer() {
  /**
   * Emitted when user changed active script. Argument is a freshly activated [godot.Script].
   */
  public val editorScriptChanged: Signal1<Script> by signal("script")

  /**
   * Emitted when editor is about to close the active script. Argument is a [godot.Script] that is going to be closed.
   */
  public val scriptClose: Signal1<Script> by signal("script")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCRIPTEDITOR)
  }

  public open fun _addCallback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ): Unit {
  }

  public open fun _autosaveScripts(): Unit {
  }

  public open fun _breaked(arg0: Boolean, arg1: Boolean): Unit {
  }

  public open fun _clearExecution(arg0: Reference): Unit {
  }

  public open fun _closeAllTabs(): Unit {
  }

  public open fun _closeCurrentTab(arg0: Boolean): Unit {
  }

  public open fun _closeDiscardCurrentTab(arg0: String): Unit {
  }

  public open fun _closeDocsTab(): Unit {
  }

  public open fun _closeOtherTabs(): Unit {
  }

  public open fun _copyScriptPath(): Unit {
  }

  public open fun _editorPause(): Unit {
  }

  public open fun _editorPlay(): Unit {
  }

  public open fun _editorSettingsChanged(): Unit {
  }

  public open fun _editorStop(): Unit {
  }

  public open fun _fileDialogAction(arg0: String): Unit {
  }

  public open fun _filterMethodsTextChanged(arg0: String): Unit {
  }

  public open fun _filterScriptsTextChanged(arg0: String): Unit {
  }

  public open fun _getDebugTooltip(arg0: String, arg1: Node): String {
    throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
  }

  public open fun _gotoScriptLine(arg0: Reference, arg1: Long): Unit {
  }

  public open fun _gotoScriptLine2(arg0: Long): Unit {
  }

  public open fun _helpClassGoto(arg0: String): Unit {
  }

  public open fun _helpClassOpen(arg0: String): Unit {
  }

  public open fun _helpOverviewSelected(arg0: Long): Unit {
  }

  public open fun _helpSearch(arg0: String): Unit {
  }

  public open fun _historyBack(): Unit {
  }

  public open fun _historyForward(): Unit {
  }

  public override fun _input(event: InputEvent): Unit {
  }

  public open fun _liveAutoReloadRunningScripts(): Unit {
  }

  public open fun _membersOverviewSelected(arg0: Long): Unit {
  }

  public open fun _menuOption(arg0: Long): Unit {
  }

  public open fun _onFindInFilesModifiedFiles(arg0: PoolStringArray): Unit {
  }

  public open fun _onFindInFilesRequested(arg0: String): Unit {
  }

  public open fun _onFindInFilesResultSelected(
    arg0: String,
    arg1: Long,
    arg2: Long,
    arg3: Long
  ): Unit {
  }

  public open fun _onReplaceInFilesRequested(arg0: String): Unit {
  }

  public open fun _openRecentScript(arg0: Long): Unit {
  }

  public open fun _prepareFileMenu(): Unit {
  }

  public open fun _queueCloseTabs(): Unit {
  }

  public open fun _requestHelp(arg0: String): Unit {
  }

  public open fun _resSavedCallback(arg0: Resource): Unit {
  }

  public open fun _resaveScripts(arg0: String): Unit {
  }

  public open fun _saveHistory(): Unit {
  }

  public open fun _sceneSavedCallback(arg0: String): Unit {
  }

  public open fun _scriptChanged(): Unit {
  }

  public open fun _scriptCreated(arg0: Script): Unit {
  }

  public open fun _scriptListGuiInput(arg0: InputEvent): Unit {
  }

  public open fun _scriptSelected(arg0: Long): Unit {
  }

  public open fun _scriptSplitDragged(arg0: Double): Unit {
  }

  public open fun _setExecution(arg0: Reference, arg1: Long): Unit {
  }

  public open fun _showDebugger(arg0: Boolean): Unit {
  }

  public open fun _startFindInFiles(arg0: Boolean): Unit {
  }

  public open fun _tabChanged(arg0: Long): Unit {
  }

  public open fun _themeOption(arg0: Long): Unit {
  }

  public open fun _toggleMembersOverviewAlphaSort(arg0: Boolean): Unit {
  }

  public open fun _treeChanged(): Unit {
  }

  public override fun _unhandledInput(event: InputEvent): Unit {
  }

  public open fun _updateAutosaveTimer(): Unit {
  }

  public open fun _updateMembersOverview(): Unit {
  }

  public open fun _updateRecentScripts(): Unit {
  }

  public open fun _updateScriptConnections(): Unit {
  }

  public open fun _updateScriptNames(): Unit {
  }

  /**
   *
   */
  public open fun canDropDataFw(
    point: Vector2,
    `data`: Any?,
    from: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_CAN_DROP_DATA_FW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun dropDataFw(
    point: Vector2,
    `data`: Any?,
    from: Control
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_DROP_DATA_FW, NIL)
  }

  /**
   * Returns a [godot.Script] that is currently active in editor.
   */
  public open fun getCurrentScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_CURRENT_SCRIPT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Script?
  }

  /**
   *
   */
  public open fun getDragDataFw(point: Vector2, from: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to point, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_DRAG_DATA_FW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns an array with all [godot.Script] objects which are currently open in editor.
   */
  public open fun getOpenScripts(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_OPEN_SCRIPTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Goes to the specified line in the current script.
   */
  public open fun gotoLine(lineNumber: Long): Unit {
    TransferContext.writeArguments(LONG to lineNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GOTO_LINE, NIL)
  }

  /**
   * Opens the script create dialog. The script will extend `base_name`. The file extension can be omitted from `base_path`. It will be added based on the selected scripting language.
   */
  public open fun openScriptCreateDialog(baseName: String, basePath: String): Unit {
    TransferContext.writeArguments(STRING to baseName, STRING to basePath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_OPEN_SCRIPT_CREATE_DIALOG, NIL)
  }

  /**
   * Reload all currently opened scripts from disk in case the file contents are newer.
   */
  public open fun reloadScripts(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_RELOAD_SCRIPTS, NIL)
  }
}
