// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class FileSystemDock : VBoxContainer() {
  val displayModeChanged: Signal0 by signal()

  val fileRemoved: Signal1<String> by signal("file")

  val filesMoved: Signal2<String, String> by signal("old_file", "new_file")

  val folderMoved: Signal2<String, String> by signal("old_folder", "new_file")

  val folderRemoved: Signal1<String> by signal("folder")

  val inherit: Signal1<String> by signal("file")

  val instance: Signal1<PoolStringArray> by signal("files")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_FILESYSTEMDOCK)

  open fun _bw_history() {
  }

  open fun _duplicate_operation_confirm() {
  }

  open fun _feature_profile_changed() {
  }

  open fun _file_list_activate_file(arg0: Long) {
  }

  open fun _file_list_gui_input(arg0: InputEvent) {
  }

  open fun _file_list_rmb_option(option: Long) {
  }

  open fun _file_list_rmb_pressed(arg0: Vector2) {
  }

  open fun _file_list_rmb_select(arg0: Long, arg1: Vector2) {
  }

  open fun _file_list_thumbnail_done(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any
  ) {
  }

  open fun _file_multi_selected(arg0: Long, arg1: Boolean) {
  }

  open fun _file_removed(arg0: String) {
  }

  open fun _folder_removed(arg0: String) {
  }

  open fun _fs_changed() {
  }

  open fun _fw_history() {
  }

  open fun _make_dir_confirm() {
  }

  open fun _make_scene_confirm() {
  }

  open fun _move_operation_confirm(toPath: String, overwrite: Boolean = false) {
  }

  open fun _move_with_overwrite() {
  }

  open fun _navigate_to_path(arg0: String, arg1: Boolean = false) {
  }

  open fun _preview_invalidated(arg0: String) {
  }

  open fun _rename_operation_confirm() {
  }

  open fun _rescan() {
  }

  open fun _resource_created() {
  }

  open fun _search_changed(arg0: String, arg1: Control) {
  }

  open fun _select_file(arg0: String, arg1: Boolean) {
  }

  open fun _toggle_file_display() {
  }

  open fun _toggle_split_mode(arg0: Boolean) {
  }

  open fun _tree_activate_file() {
  }

  open fun _tree_empty_selected() {
  }

  open fun _tree_gui_input(arg0: InputEvent) {
  }

  open fun _tree_multi_selected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _tree_rmb_empty(arg0: Vector2) {
  }

  open fun _tree_rmb_option(option: Long) {
  }

  open fun _tree_rmb_select(arg0: Vector2) {
  }

  open fun _tree_thumbnail_done(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any
  ) {
  }

  open fun _update_import_dock() {
  }

  open fun _update_tree(
    arg0: PoolStringArray,
    arg1: Boolean,
    arg2: Boolean,
    arg3: Boolean
  ) {
  }

  open fun canDropDataFw(
    arg0: Vector2,
    arg1: Any,
    arg2: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to arg0, ANY to arg1, OBJECT to arg2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_CAN_DROP_DATA_FW,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun dropDataFw(
    arg0: Vector2,
    arg1: Any,
    arg2: Control
  ) {
    TransferContext.writeArguments(VECTOR2 to arg0, ANY to arg1, OBJECT to arg2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_DROP_DATA_FW, NIL)
  }

  open fun getDragDataFw(arg0: Vector2, arg1: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to arg0, OBJECT to arg1)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_GET_DRAG_DATA_FW,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun navigateToPath(arg0: String) {
    TransferContext.writeArguments(STRING to arg0)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_NAVIGATE_TO_PATH,
        NIL)
  }

  companion object
}
