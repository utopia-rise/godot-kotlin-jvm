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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Control to show a tree of items.
 *
 * This shows a tree of items that can be selected, expanded and collapsed. The tree can have multiple columns with custom controls like text editing, buttons and popups. It can be useful for structured displays and interactions.
 *
 * Trees are built via code, using [godot.TreeItem] objects to create the structure. They have a single root but multiple roots can be simulated if a dummy hidden root is added.
 *
 * ```
 * 		func _ready():
 * 		    var tree = Tree.new()
 * 		    var root = tree.create_item()
 * 		    tree.set_hide_root(true)
 * 		    var child1 = tree.create_item(root)
 * 		    var child2 = tree.create_item(root)
 * 		    var subchild1 = tree.create_item(child1)
 * 		    subchild1.set_text(0, "Subchild1")
 * 		```
 *
 * To iterate over all the [godot.TreeItem] objects in a [godot.Tree] object, use [godot.TreeItem.getNext] and [godot.TreeItem.getChildren] after getting the root through [getRoot]. You can use [godot.Object.free] on a [godot.TreeItem] to remove it from the [godot.Tree].
 */
@GodotBaseType
open class Tree : Control() {
  /**
   * Emitted when a button on the tree was pressed (see [godot.TreeItem.addButton]).
   */
  val buttonPressed: Signal3<TreeItem, Long, Long> by signal("item", "column", "id")

  /**
   * Emitted when a cell is selected.
   */
  val cellSelected: Signal0 by signal()

  /**
   * Emitted when a column's title is pressed.
   */
  val columnTitlePressed: Signal1<Long> by signal("column")

  /**
   * Emitted when a cell with the [godot.TreeItem.CELL_MODE_CUSTOM] is clicked to be edited.
   */
  val customPopupEdited: Signal1<Boolean> by signal("arrow_clicked")

  /**
   * Emitted when the right mouse button is pressed in the empty space of the tree.
   */
  val emptyRmb: Signal1<Vector2> by signal("position")

  /**
   * Emitted when the right mouse button is pressed if right mouse button selection is active and the tree is empty.
   */
  val emptyTreeRmbSelected: Signal1<Vector2> by signal("position")

  /**
   * Emitted when an item's label is double-clicked.
   */
  val itemActivated: Signal0 by signal()

  /**
   * Emitted when an item is collapsed by a click on the folding arrow.
   */
  val itemCollapsed: Signal1<TreeItem> by signal("item")

  /**
   * Emitted when a custom button is pressed (i.e. in a [godot.TreeItem.CELL_MODE_CUSTOM] mode cell).
   */
  val itemCustomButtonPressed: Signal0 by signal()

  /**
   * Emitted when an item's icon is double-clicked.
   */
  val itemDoubleClicked: Signal0 by signal()

  /**
   * Emitted when an item is edited.
   */
  val itemEdited: Signal0 by signal()

  /**
   * Emitted when an item is edited using the right mouse button.
   */
  val itemRmbEdited: Signal0 by signal()

  /**
   * Emitted when an item is selected with the right mouse button.
   */
  val itemRmbSelected: Signal1<Vector2> by signal("position")

  /**
   * Emitted when an item is selected.
   */
  val itemSelected: Signal0 by signal()

  /**
   * Emitted instead of `item_selected` if `select_mode` is [SELECT_MULTI].
   */
  val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  /**
   * Emitted when a left mouse button click does not select any item.
   */
  val nothingSelected: Signal0 by signal()

  /**
   * If `true`, the currently selected cell may be selected again.
   */
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

  /**
   * If `true`, a right mouse button click can select items.
   */
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

  /**
   * The number of columns.
   */
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

  /**
   * The drop mode as an OR combination of flags. See [enum DropModeFlags] constants. Once dropping is done, reverts to [DROP_MODE_DISABLED]. Setting this during [godot.Control.canDropData] is recommended.
   *
   * This controls the drop sections, i.e. the decision and drawing of possible drop locations based on the mouse position.
   */
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

  /**
   * If `true`, the folding arrow is hidden.
   */
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

  /**
   * If `true`, the tree's root is hidden.
   */
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

  /**
   * Allows single or multiple selection. See the [enum SelectMode] constants.
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TREE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

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

  /**
   * Returns `true` if the column titles are being shown.
   */
  open fun areColumnTitlesVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ARE_COLUMN_TITLES_VISIBLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears the tree. This removes all items.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CLEAR, NIL)
  }

  /**
   * Creates an item in the tree and adds it as a child of `parent`.
   *
   * If `parent` is `null`, the root item will be the parent, or the new item will be the root itself if the tree is empty.
   *
   * The new item will be the `idx`th child of parent, or it will be the last child if there are not enough siblings.
   */
  open fun createItem(parent: Object? = null, idx: Long = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CREATE_ITEM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Makes the currently focused cell visible.
   *
   * This will scroll the tree if necessary. In [SELECT_ROW] mode, this will not do horizontal scrolling, as all the cells in the selected row is focused logically.
   *
   * **Note:** Despite the name of this method, the focus cursor itself is only visible in [SELECT_MULTI] mode.
   */
  open fun ensureCursorIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ENSURE_CURSOR_IS_VISIBLE, NIL)
  }

  /**
   * Returns the column index at `position`, or -1 if no item is there.
   */
  open fun getColumnAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the column's title.
   */
  open fun getColumnTitle(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the column's width in pixels.
   */
  open fun getColumnWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the rectangle for custom popups. Helper to create custom cell controls that display a popup. See [godot.TreeItem.setCellMode].
   */
  open fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_CUSTOM_POPUP_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the drop section at `position`, or -100 if no item is there.
   *
   * Values -1, 0, or 1 will be returned for the "above item", "on item", and "below item" drop sections, respectively. See [enum DropModeFlags] for a description of each drop section.
   *
   * To get the item which the returned drop section is relative to, use [getItemAtPosition].
   */
  open fun getDropSectionAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_DROP_SECTION_AT_POSITION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the currently edited item. This is only available for custom cell mode.
   */
  open fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the column for the currently edited item. This is only available for custom cell mode.
   */
  open fun getEditedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the rectangle area for the specified item. If `column` is specified, only get the position and size of that column, otherwise get the rectangle containing all columns.
   */
  open fun getItemAreaRect(item: Object, column: Long = -1): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AREA_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the tree item at the specified position (relative to the tree origin position).
   */
  open fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AT_POSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the next selected item after the given one, or `null` if the end is reached.
   *
   * If `from` is `null`, this returns the first selected item.
   */
  open fun getNextSelected(from: Object): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_NEXT_SELECTED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the last pressed button's index.
   */
  open fun getPressedButton(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_PRESSED_BUTTON, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tree's root item, or `null` if the tree is empty.
   */
  open fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ROOT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the current scrolling position.
   */
  open fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SCROLL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the currently focused item, or `null` if no item is focused.
   *
   * In [SELECT_ROW] and [SELECT_SINGLE] modes, the focused item is same as the selected item. In [SELECT_MULTI] mode, the focused item is the item under the focus cursor, not necessarily selected.
   *
   * To get the currently selected item(s), use [getNextSelected].
   */
  open fun getSelected(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECTED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the currently focused column, or -1 if no column is focused.
   *
   * In [SELECT_SINGLE] mode, the focused column is the selected column. In [SELECT_ROW] mode, the focused column is always 0 if any item is selected. In [SELECT_MULTI] mode, the focused column is the column under the focus cursor, and there are not necessarily any column selected.
   *
   * To tell whether a column of an item is selected, use [godot.TreeItem.isSelected].
   */
  open fun getSelectedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECTED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If `true`, the column will have the "Expand" flag of [godot.Control]. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to [godot.Control.sizeFlagsStretchRatio].
   */
  open fun setColumnExpand(column: Long, expand: Boolean) {
    TransferContext.writeArguments(LONG to column, BOOL to expand)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_EXPAND, NIL)
  }

  /**
   * Sets the minimum width of a column. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to [godot.Control.sizeFlagsStretchRatio].
   */
  open fun setColumnMinWidth(column: Long, minWidth: Long) {
    TransferContext.writeArguments(LONG to column, LONG to minWidth)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_MIN_WIDTH, NIL)
  }

  /**
   * Sets the title of a column.
   */
  open fun setColumnTitle(column: Long, title: String) {
    TransferContext.writeArguments(LONG to column, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE, NIL)
  }

  /**
   * If `true`, column titles are visible.
   */
  open fun setColumnTitlesVisible(visible: Boolean) {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLES_VISIBLE, NIL)
  }

  enum class SelectMode(
    id: Long
  ) {
    /**
     * Allows selection of a single cell at a time. From the perspective of items, only a single item is allowed to be selected. And there is only one column selected in the selected item.
     *
     * The focus cursor is always hidden in this mode, but it is positioned at the current selection, making the currently selected item the currently focused item.
     */
    SELECT_SINGLE(0),

    /**
     * Allows selection of a single row at a time. From the perspective of items, only a single items is allowed to be selected. And all the columns are selected in the selected item.
     *
     * The focus cursor is always hidden in this mode, but it is positioned at the first column of the current selection, making the currently selected item the currently focused item.
     */
    SELECT_ROW(1),

    /**
     * Allows selection of multiple cells at the same time. From the perspective of items, multiple items are allowed to be selected. And there can be multiple columns selected in each selected item.
     *
     * The focus cursor is visible in this mode, the item or column under the cursor is not necessarily selected.
     */
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
    /**
     * Disables all drop sections, but still allows to detect the "on item" drop section by [getDropSectionAtPosition].
     *
     * **Note:** This is the default flag, it has no effect when combined with other flags.
     */
    DROP_MODE_DISABLED(0),

    /**
     * Enables the "on item" drop section. This drop section covers the entire item.
     *
     * When combined with [DROP_MODE_INBETWEEN], this drop section halves the height and stays centered vertically.
     */
    DROP_MODE_ON_ITEM(1),

    /**
     * Enables "above item" and "below item" drop sections. The "above item" drop section covers the top half of the item, and the "below item" drop section covers the bottom half.
     *
     * When combined with [DROP_MODE_ON_ITEM], these drop sections halves the height and stays on top / bottom accordingly.
     */
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
    /**
     * Disables all drop sections, but still allows to detect the "on item" drop section by [getDropSectionAtPosition].
     *
     * **Note:** This is the default flag, it has no effect when combined with other flags.
     */
    final const val DROP_MODE_DISABLED: Long = 0

    /**
     * Enables "above item" and "below item" drop sections. The "above item" drop section covers the top half of the item, and the "below item" drop section covers the bottom half.
     *
     * When combined with [DROP_MODE_ON_ITEM], these drop sections halves the height and stays on top / bottom accordingly.
     */
    final const val DROP_MODE_INBETWEEN: Long = 2

    /**
     * Enables the "on item" drop section. This drop section covers the entire item.
     *
     * When combined with [DROP_MODE_INBETWEEN], this drop section halves the height and stays centered vertically.
     */
    final const val DROP_MODE_ON_ITEM: Long = 1

    /**
     * Allows selection of multiple cells at the same time. From the perspective of items, multiple items are allowed to be selected. And there can be multiple columns selected in each selected item.
     *
     * The focus cursor is visible in this mode, the item or column under the cursor is not necessarily selected.
     */
    final const val SELECT_MULTI: Long = 2

    /**
     * Allows selection of a single row at a time. From the perspective of items, only a single items is allowed to be selected. And all the columns are selected in the selected item.
     *
     * The focus cursor is always hidden in this mode, but it is positioned at the first column of the current selection, making the currently selected item the currently focused item.
     */
    final const val SELECT_ROW: Long = 1

    /**
     * Allows selection of a single cell at a time. From the perspective of items, only a single item is allowed to be selected. And there is only one column selected in the selected item.
     *
     * The focus cursor is always hidden in this mode, but it is positioned at the current selection, making the currently selected item the currently focused item.
     */
    final const val SELECT_SINGLE: Long = 0
  }
}
