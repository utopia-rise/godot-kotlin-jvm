// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class FileSystemDock : VBoxContainer() {
  /**
   *
   */
  public val displayModeChanged: Signal0 by signal()

  /**
   *
   */
  public val fileRemoved: Signal1<String> by signal("file")

  /**
   *
   */
  public val filesMoved: Signal2<String, String> by signal("old_file", "new_file")

  /**
   *
   */
  public val folderMoved: Signal2<String, String> by signal("old_folder", "new_file")

  /**
   *
   */
  public val folderRemoved: Signal1<String> by signal("folder")

  /**
   *
   */
  public val inherit: Signal1<String> by signal("file")

  /**
   *
   */
  public val instance: Signal1<PoolStringArray> by signal("files")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FILESYSTEMDOCK)
  }

  public open fun _bwHistory(): Unit {
  }

  public open fun _duplicateOperationConfirm(): Unit {
  }

  public open fun _featureProfileChanged(): Unit {
  }

  public open fun _fileListActivateFile(arg0: Long): Unit {
  }

  public open fun _fileListGuiInput(arg0: InputEvent): Unit {
  }

  public open fun _fileListRmbOption(option: Long): Unit {
  }

  public open fun _fileListRmbPressed(arg0: Vector2): Unit {
  }

  public open fun _fileListRmbSelect(arg0: Long, arg1: Vector2): Unit {
  }

  public open fun _fileListThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ): Unit {
  }

  public open fun _fileMultiSelected(arg0: Long, arg1: Boolean): Unit {
  }

  public open fun _fileRemoved(arg0: String): Unit {
  }

  public open fun _folderRemoved(arg0: String): Unit {
  }

  public open fun _fsChanged(): Unit {
  }

  public open fun _fwHistory(): Unit {
  }

  public open fun _makeDirConfirm(): Unit {
  }

  public open fun _makeSceneConfirm(): Unit {
  }

  public open fun _moveOperationConfirm(toPath: String, overwrite: Boolean = false): Unit {
  }

  public open fun _moveWithOverwrite(): Unit {
  }

  public open fun _navigateToPath(arg0: String, arg1: Boolean = false): Unit {
  }

  public open fun _previewInvalidated(arg0: String): Unit {
  }

  public open fun _renameOperationConfirm(): Unit {
  }

  public open fun _rescan(): Unit {
  }

  public open fun _resourceCreated(): Unit {
  }

  public open fun _searchChanged(arg0: String, arg1: Control): Unit {
  }

  public open fun _selectFile(arg0: String, arg1: Boolean): Unit {
  }

  public open fun _toggleFileDisplay(): Unit {
  }

  public open fun _toggleSplitMode(arg0: Boolean): Unit {
  }

  public open fun _treeActivateFile(): Unit {
  }

  public open fun _treeEmptySelected(): Unit {
  }

  public open fun _treeGuiInput(arg0: InputEvent): Unit {
  }

  public open fun _treeMultiSelected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ): Unit {
  }

  public open fun _treeRmbEmpty(arg0: Vector2): Unit {
  }

  public open fun _treeRmbOption(option: Long): Unit {
  }

  public open fun _treeRmbSelect(arg0: Vector2): Unit {
  }

  public open fun _treeThumbnailDone(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Any?
  ): Unit {
  }

  public open fun _updateImportDock(): Unit {
  }

  public open fun _updateTree(
    arg0: PoolStringArray,
    arg1: Boolean,
    arg2: Boolean,
    arg3: Boolean
  ): Unit {
  }

  /**
   *
   */
  public open fun canDropDataFw(
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
  public open fun dropDataFw(
    arg0: Vector2,
    arg1: Any?,
    arg2: Control
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to arg0, ANY to arg1, OBJECT to arg2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_DROP_DATA_FW, NIL)
  }

  /**
   *
   */
  public open fun getDragDataFw(arg0: Vector2, arg1: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to arg0, OBJECT to arg1)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_GET_DRAG_DATA_FW,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  public open fun navigateToPath(arg0: String): Unit {
    TransferContext.writeArguments(STRING to arg0)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_NAVIGATE_TO_PATH,
        NIL)
  }
}
