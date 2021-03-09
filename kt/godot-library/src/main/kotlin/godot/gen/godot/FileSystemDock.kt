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
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class FileSystemDock : VBoxContainer() {
  /**
   *
   */
  val displayModeChanged: Signal0 by signal()

  /**
   *
   */
  val fileRemoved: Signal1<String> by signal("file")

  /**
   *
   */
  val filesMoved: Signal2<String, String> by signal("old_file", "new_file")

  /**
   *
   */
  val folderMoved: Signal2<String, String> by signal("old_folder", "new_file")

  /**
   *
   */
  val folderRemoved: Signal1<String> by signal("folder")

  /**
   *
   */
  val inherit: Signal1<String> by signal("file")

  /**
   *
   */
  val instance: Signal1<PoolStringArray> by signal("files")

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_FILESYSTEMDOCK)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _bwHistory() {
  }

  open fun _duplicateOperationConfirm() {
  }

  open fun _featureProfileChanged() {
  }

  open fun _fileListActivateFile(arg0: Long) {
  }

  open fun _fileListGuiInput(arg0: InputEvent) {
  }

  open fun _fileListRmbOption(option: Long) {
  }

  open fun _fileListRmbPressed(arg0: Vector2) {
  }

  open fun _fileListRmbSelect(arg0: Long, arg1: Vector2) {
  }

  open fun _fileListThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ) {
  }

  open fun _fileMultiSelected(arg0: Long, arg1: Boolean) {
  }

  open fun _fileRemoved(arg0: String) {
  }

  open fun _folderRemoved(arg0: String) {
  }

  open fun _fsChanged() {
  }

  open fun _fwHistory() {
  }

  open fun _makeDirConfirm() {
  }

  open fun _makeSceneConfirm() {
  }

  open fun _moveOperationConfirm(toPath: String, overwrite: Boolean = false) {
  }

  open fun _moveWithOverwrite() {
  }

  open fun _navigateToPath(arg0: String, arg1: Boolean = false) {
  }

  open fun _previewInvalidated(arg0: String) {
  }

  open fun _renameOperationConfirm() {
  }

  open fun _rescan() {
  }

  open fun _resourceCreated() {
  }

  open fun _searchChanged(arg0: String, arg1: Control) {
  }

  open fun _selectFile(arg0: String, arg1: Boolean) {
  }

  open fun _toggleFileDisplay() {
  }

  open fun _toggleSplitMode(arg0: Boolean) {
  }

  open fun _treeActivateFile() {
  }

  open fun _treeEmptySelected() {
  }

  open fun _treeGuiInput(arg0: InputEvent) {
  }

  open fun _treeMultiSelected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _treeRmbEmpty(arg0: Vector2) {
  }

  open fun _treeRmbOption(option: Long) {
  }

  open fun _treeRmbSelect(arg0: Vector2) {
  }

  open fun _treeThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ) {
  }

  open fun _updateImportDock() {
  }

  open fun _updateTree(
    arg0: PoolStringArray,
    arg1: Boolean,
    arg2: Boolean,
    arg3: Boolean
  ) {
  }

  /**
   *
   */
  open fun canDropDataFw(
    arg0: Vector2,
    arg1: Any?,
    arg2: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to arg0, ANY to arg1, OBJECT to arg2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_CAN_DROP_DATA_FW,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun dropDataFw(
    arg0: Vector2,
    arg1: Any?,
    arg2: Control
  ) {
    TransferContext.writeArguments(VECTOR2 to arg0, ANY to arg1, OBJECT to arg2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_DROP_DATA_FW, NIL)
  }

  /**
   *
   */
  open fun getDragDataFw(arg0: Vector2, arg1: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to arg0, OBJECT to arg1)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_GET_DRAG_DATA_FW,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  open fun navigateToPath(arg0: String) {
    TransferContext.writeArguments(STRING to arg0)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_NAVIGATE_TO_PATH,
        NIL)
  }
}
