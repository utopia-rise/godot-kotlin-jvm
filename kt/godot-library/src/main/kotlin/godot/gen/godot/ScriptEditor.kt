// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * Godot editor's script editor.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getScriptEditor].
 */
@GodotBaseType
open class ScriptEditor : PanelContainer() {
  /**
   * Emitted when user changed active script. Argument is a freshly activated [godot.Script].
   */
  val editorScriptChanged: Signal1<Script> by signal("script")

  /**
   * Emitted when editor is about to close the active script. Argument is a [godot.Script] that is going to be closed.
   */
  val scriptClose: Signal1<Script> by signal("script")

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SCRIPTEDITOR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _addCallback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ) {
  }

  open fun _autosaveScripts() {
  }

  open fun _breaked(arg0: Boolean, arg1: Boolean) {
  }

  open fun _clearExecution(arg0: Reference) {
  }

  open fun _closeAllTabs() {
  }

  open fun _closeCurrentTab() {
  }

  open fun _closeDiscardCurrentTab(arg0: String) {
  }

  open fun _closeDocsTab() {
  }

  open fun _closeOtherTabs() {
  }

  open fun _copyScriptPath() {
  }

  open fun _editorPause() {
  }

  open fun _editorPlay() {
  }

  open fun _editorSettingsChanged() {
  }

  open fun _editorStop() {
  }

  open fun _fileDialogAction(arg0: String) {
  }

  open fun _filterMethodsTextChanged(arg0: String) {
  }

  open fun _filterScriptsTextChanged(arg0: String) {
  }

  open fun _getDebugTooltip(arg0: String, arg1: Node): String {
    throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
  }

  open fun _gotoScriptLine(arg0: Reference, arg1: Long) {
  }

  open fun _gotoScriptLine2(arg0: Long) {
  }

  open fun _helpClassGoto(arg0: String) {
  }

  open fun _helpClassOpen(arg0: String) {
  }

  open fun _helpOverviewSelected(arg0: Long) {
  }

  open fun _helpSearch(arg0: String) {
  }

  open fun _historyBack() {
  }

  open fun _historyForward() {
  }

  open fun _liveAutoReloadRunningScripts() {
  }

  open fun _membersOverviewSelected(arg0: Long) {
  }

  open fun _menuOption(arg0: Long) {
  }

  open fun _onFindInFilesModifiedFiles(arg0: PoolStringArray) {
  }

  open fun _onFindInFilesRequested(arg0: String) {
  }

  open fun _onFindInFilesResultSelected(
    arg0: String,
    arg1: Long,
    arg2: Long,
    arg3: Long
  ) {
  }

  open fun _openRecentScript(arg0: Long) {
  }

  open fun _reloadScripts() {
  }

  open fun _requestHelp(arg0: String) {
  }

  open fun _resSavedCallback(arg0: Resource) {
  }

  open fun _resaveScripts(arg0: String) {
  }

  open fun _saveHistory() {
  }

  open fun _scriptChanged() {
  }

  open fun _scriptCreated(arg0: Script) {
  }

  open fun _scriptListGuiInput(arg0: InputEvent) {
  }

  open fun _scriptSelected(arg0: Long) {
  }

  open fun _scriptSplitDragged(arg0: Double) {
  }

  open fun _setExecution(arg0: Reference, arg1: Long) {
  }

  open fun _showDebugger(arg0: Boolean) {
  }

  open fun _startFindInFiles(arg0: Boolean) {
  }

  open fun _tabChanged(arg0: Long) {
  }

  open fun _themeOption(arg0: Long) {
  }

  open fun _toggleMembersOverviewAlphaSort(arg0: Boolean) {
  }

  open fun _treeChanged() {
  }

  override fun _unhandledInput(event: InputEvent) {
  }

  open fun _updateAutosaveTimer() {
  }

  open fun _updateMembersOverview() {
  }

  open fun _updateRecentScripts() {
  }

  open fun _updateScriptConnections() {
  }

  open fun _updateScriptNames() {
  }

  /**
   *
   */
  open fun canDropDataFw(
    point: Vector2,
    data: Any?,
    from: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_CAN_DROP_DATA_FW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun dropDataFw(
    point: Vector2,
    data: Any?,
    from: Control
  ) {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_DROP_DATA_FW, NIL)
  }

  /**
   * Returns a [godot.Script] that is currently active in editor.
   */
  open fun getCurrentScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_CURRENT_SCRIPT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Script?
  }

  /**
   *
   */
  open fun getDragDataFw(point: Vector2, from: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to point, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_DRAG_DATA_FW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns an array with all [godot.Script] objects which are currently open in editor.
   */
  open fun getOpenScripts(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_OPEN_SCRIPTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Goes to the specified line in the current script.
   */
  open fun gotoLine(lineNumber: Long) {
    TransferContext.writeArguments(LONG to lineNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GOTO_LINE, NIL)
  }

  /**
   *
   */
  open fun openScriptCreateDialog(baseName: String, basePath: String) {
    TransferContext.writeArguments(STRING to baseName, STRING to basePath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_OPEN_SCRIPT_CREATE_DIALOG, NIL)
  }
}
