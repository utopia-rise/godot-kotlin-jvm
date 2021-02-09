// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class FileDialog : ConfirmationDialog() {
  val dirSelected: Signal1<String> by signal("dir")

  val fileSelected: Signal1<String> by signal("path")

  val filesSelected: Signal1<PoolStringArray> by signal("paths")

  open var access: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_ACCESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_ACCESS, NIL)
    }

  open var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_DIR, NIL)
    }

  open var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_FILE, NIL)
    }

  open var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_CURRENT_PATH, NIL)
    }

  open var filters: PoolStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_FILTERS,
          POOL_STRING_ARRAY)
      return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_FILTERS, NIL)
    }

  open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE, NIL)
    }

  open var modeOverridesTitle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_MODE_OVERRIDES_TITLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_MODE_OVERRIDES_TITLE, NIL)
    }

  open var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_SHOW_HIDDEN_FILES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_SET_SHOW_HIDDEN_FILES,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_FILEDIALOG)

  open fun _action_pressed() {
  }

  open fun _cancel_pressed() {
  }

  open fun _dir_entered(arg0: String) {
  }

  open fun _file_entered(arg0: String) {
  }

  open fun _filter_selected(arg0: Long) {
  }

  open fun _go_up() {
  }

  open fun _make_dir() {
  }

  open fun _make_dir_confirm() {
  }

  open fun _save_confirm_pressed() {
  }

  open fun _select_drive(arg0: Long) {
  }

  open fun _tree_item_activated() {
  }

  open fun _tree_multi_selected(
    arg0: Object,
    arg1: Long,
    arg2: Boolean
  ) {
  }

  open fun _tree_selected() {
  }

  override fun _unhandled_input(event: InputEvent) {
  }

  open fun _update_dir() {
  }

  open fun _update_file_list() {
  }

  open fun _update_file_name() {
  }

  open fun addFilter(filter: String) {
    TransferContext.writeArguments(STRING to filter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_ADD_FILTER, NIL)
  }

  open fun clearFilters() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_CLEAR_FILTERS, NIL)
  }

  open fun deselectItems() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_DESELECT_ITEMS, NIL)
  }

  open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }

  open fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_GET_VBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?
  }

  open fun invalidate() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILEDIALOG_INVALIDATE, NIL)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_OPEN_FILE(0),

    MODE_OPEN_FILES(1),

    MODE_OPEN_DIR(2),

    MODE_OPEN_ANY(3),

    MODE_SAVE_FILE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Access(
    id: Long
  ) {
    ACCESS_RESOURCES(0),

    ACCESS_USERDATA(1),

    ACCESS_FILESYSTEM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ACCESS_FILESYSTEM: Long = 2

    final const val ACCESS_RESOURCES: Long = 0

    final const val ACCESS_USERDATA: Long = 1

    final const val MODE_OPEN_ANY: Long = 3

    final const val MODE_OPEN_DIR: Long = 2

    final const val MODE_OPEN_FILE: Long = 0

    final const val MODE_OPEN_FILES: Long = 1

    final const val MODE_SAVE_FILE: Long = 4
  }
}
