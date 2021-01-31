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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ScriptEditor : PanelContainer() {
  val editorScriptChanged: Signal1<Script> by signal("script")

  val scriptClose: Signal1<Script> by signal("script")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SCRIPTEDITOR)

  open fun _add_callback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ) {
  }

  open fun _autosave_scripts() {
  }

  open fun _breaked(arg0: Boolean, arg1: Boolean) {
  }

  open fun _clear_execution(arg0: Reference) {
  }

  open fun _close_all_tabs() {
  }

  open fun _close_current_tab() {
  }

  open fun _close_discard_current_tab(arg0: String) {
  }

  open fun _close_docs_tab() {
  }

  open fun _close_other_tabs() {
  }

  open fun _copy_script_path() {
  }

  open fun _editor_pause() {
  }

  open fun _editor_play() {
  }

  open fun _editor_settings_changed() {
  }

  open fun _editor_stop() {
  }

  open fun _file_dialog_action(arg0: String) {
  }

  open fun _filter_methods_text_changed(arg0: String) {
  }

  open fun _filter_scripts_text_changed(arg0: String) {
  }

  open fun _get_debug_tooltip(arg0: String, arg1: Node): String {
    throw NotImplementedError("_get_debug_tooltip is not implemented for ScriptEditor")
  }

  open fun _goto_script_line(arg0: Reference, arg1: Long) {
  }

  open fun _goto_script_line2(arg0: Long) {
  }

  open fun _help_class_goto(arg0: String) {
  }

  open fun _help_class_open(arg0: String) {
  }

  open fun _help_overview_selected(arg0: Long) {
  }

  open fun _help_search(arg0: String) {
  }

  open fun _history_back() {
  }

  open fun _history_forward() {
  }

  open fun _live_auto_reload_running_scripts() {
  }

  open fun _members_overview_selected(arg0: Long) {
  }

  open fun _menu_option(arg0: Long) {
  }

  open fun _on_find_in_files_modified_files(arg0: PoolStringArray) {
  }

  open fun _on_find_in_files_requested(arg0: String) {
  }

  open fun _on_find_in_files_result_selected(
    arg0: String,
    arg1: Long,
    arg2: Long,
    arg3: Long
  ) {
  }

  open fun _open_recent_script(arg0: Long) {
  }

  open fun _reload_scripts() {
  }

  open fun _request_help(arg0: String) {
  }

  open fun _res_saved_callback(arg0: Resource) {
  }

  open fun _resave_scripts(arg0: String) {
  }

  open fun _save_history() {
  }

  open fun _script_changed() {
  }

  open fun _script_created(arg0: Script) {
  }

  open fun _script_list_gui_input(arg0: InputEvent) {
  }

  open fun _script_selected(arg0: Long) {
  }

  open fun _script_split_dragged(arg0: Double) {
  }

  open fun _set_execution(arg0: Reference, arg1: Long) {
  }

  open fun _show_debugger(arg0: Boolean) {
  }

  open fun _start_find_in_files(arg0: Boolean) {
  }

  open fun _tab_changed(arg0: Long) {
  }

  open fun _theme_option(arg0: Long) {
  }

  open fun _toggle_members_overview_alpha_sort(arg0: Boolean) {
  }

  open fun _tree_changed() {
  }

  override fun _unhandled_input(event: InputEvent) {
  }

  open fun _update_autosave_timer() {
  }

  open fun _update_members_overview() {
  }

  open fun _update_recent_scripts() {
  }

  open fun _update_script_connections() {
  }

  open fun _update_script_names() {
  }

  open fun canDropDataFw(
    point: Vector2,
    data: Any,
    from: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_CAN_DROP_DATA_FW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun dropDataFw(
    point: Vector2,
    data: Any,
    from: Control
  ) {
    TransferContext.writeArguments(VECTOR2 to point, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_DROP_DATA_FW, NIL)
  }

  open fun getCurrentScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_CURRENT_SCRIPT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Script?
  }

  open fun getDragDataFw(point: Vector2, from: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to point, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_DRAG_DATA_FW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getOpenScripts(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GET_OPEN_SCRIPTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun gotoLine(lineNumber: Long) {
    TransferContext.writeArguments(LONG to lineNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_GOTO_LINE, NIL)
  }

  open fun openScriptCreateDialog(baseName: String, basePath: String) {
    TransferContext.writeArguments(STRING to baseName, STRING to basePath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCRIPTEDITOR_OPEN_SCRIPT_CREATE_DIALOG, NIL)
  }
}
