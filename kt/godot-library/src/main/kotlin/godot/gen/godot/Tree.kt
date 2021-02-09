// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Tree : Control() {
  val buttonPressed: Signal3<TreeItem, Long, Long> by signal("item", "column", "id")

  val cellSelected: Signal0 by signal()

  val columnTitlePressed: Signal1<Long> by signal("column")

  val customPopupEdited: Signal1<Boolean> by signal("arrow_clicked")

  val emptyRmb: Signal1<Vector2> by signal("position")

  val emptyTreeRmbSelected: Signal1<Vector2> by signal("position")

  val itemActivated: Signal0 by signal()

  val itemCollapsed: Signal1<TreeItem> by signal("item")

  val itemCustomButtonPressed: Signal0 by signal()

  val itemDoubleClicked: Signal0 by signal()

  val itemEdited: Signal0 by signal()

  val itemRmbEdited: Signal0 by signal()

  val itemRmbSelected: Signal1<Vector2> by signal("position")

  val itemSelected: Signal0 by signal()

  val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  val nothingSelected: Signal0 by signal()

  open var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ALLOW_RESELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_ALLOW_RESELECT, NIL)
    }

  open var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ALLOW_RMB_SELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_ALLOW_RMB_SELECT, NIL)
    }

  open var columns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMNS, NIL)
    }

  open var dropModeFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_DROP_MODE_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_DROP_MODE_FLAGS, NIL)
    }

  open var hideFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_HIDE_FOLDING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_HIDE_FOLDING, NIL)
    }

  open var hideRoot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_HIDE_ROOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_HIDE_ROOT, NIL)
    }

  open var selectMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_SELECT_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TREE)

  override fun _guiInput(event: InputEvent) {
  }

  open fun _popupSelect(arg0: Long) {
  }

  open fun _rangeClickTimeout() {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _textEditorEnter(arg0: String) {
  }

  open fun _textEditorModalClose() {
  }

  open fun _valueEditorChanged(arg0: Double) {
  }

  open fun areColumnTitlesVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ARE_COLUMN_TITLES_VISIBLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CLEAR, NIL)
  }

  open fun createItem(parent: Object? = null, idx: Long = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CREATE_ITEM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun ensureCursorIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ENSURE_CURSOR_IS_VISIBLE, NIL)
  }

  open fun getColumnAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getColumnTitle(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getColumnWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_CUSTOM_POPUP_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getDropSectionAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_DROP_SECTION_AT_POSITION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getEditedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemAreaRect(item: Object, column: Long = -1): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AREA_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AT_POSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getNextSelected(from: Object): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_NEXT_SELECTED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getPressedButton(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_PRESSED_BUTTON, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ROOT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SCROLL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getSelected(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECTED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  open fun getSelectedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECTED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setColumnExpand(column: Long, expand: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to expand)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_EXPAND, NIL)
  }

  open fun setColumnMinWidth(column: Long, minWidth: Long) {
    TransferContext.writeArguments(LONG to column, LONG to minWidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_MIN_WIDTH, NIL)
  }

  open fun setColumnTitle(column: Long, title: String) {
    TransferContext.writeArguments(LONG to column, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE, NIL)
  }

  open fun setColumnTitlesVisible(visible: Boolean) {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLES_VISIBLE, NIL)
  }

  enum class SelectMode(
    id: Long
  ) {
    SELECT_SINGLE(0),

    SELECT_ROW(1),

    SELECT_MULTI(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DropModeFlags(
    id: Long
  ) {
    DROP_MODE_DISABLED(0),

    DROP_MODE_ON_ITEM(1),

    DROP_MODE_INBETWEEN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val DROP_MODE_DISABLED: Long = 0

    final const val DROP_MODE_INBETWEEN: Long = 2

    final const val DROP_MODE_ON_ITEM: Long = 1

    final const val SELECT_MULTI: Long = 2

    final const val SELECT_ROW: Long = 1

    final const val SELECT_SINGLE: Long = 0
  }
}
