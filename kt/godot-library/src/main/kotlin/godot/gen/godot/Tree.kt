// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Control to show a tree of items.
 *
 * This shows a tree of items that can be selected, expanded and collapsed. The tree can have multiple columns with custom controls like text editing, buttons and popups. It can be useful for structured displays and interactions.
 *
 * Trees are built via code, using [godot.TreeItem] objects to create the structure. They have a single root but multiple roots can be simulated if a dummy hidden root is added.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     var tree = Tree.new()
 *
 *     var root = tree.create_item()
 *
 *     tree.hide_root = true
 *
 *     var child1 = tree.create_item(root)
 *
 *     var child2 = tree.create_item(root)
 *
 *     var subchild1 = tree.create_item(child1)
 *
 *     subchild1.set_text(0, "Subchild1")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     var tree = new Tree();
 *
 *     TreeItem root = tree.CreateItem();
 *
 *     tree.HideRoot = true;
 *
 *     TreeItem child1 = tree.CreateItem(root);
 *
 *     TreeItem child2 = tree.CreateItem(root);
 *
 *     TreeItem subchild1 = tree.CreateItem(child1);
 *
 *     subchild1.SetText(0, "Subchild1");
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To iterate over all the [godot.TreeItem] objects in a [godot.Tree] object, use [godot.TreeItem.getNext] and [godot.TreeItem.getFirstChild] after getting the root through [getRoot]. You can use [godot.Object.free] on a [godot.TreeItem] to remove it from the [godot.Tree].
 */
@GodotBaseType
public open class Tree : Control() {
  /**
   * Emitted when an item's label is double-clicked.
   */
  public val itemActivated: Signal0 by signal()

  /**
   * Emitted instead of `item_selected` if `select_mode` is [SELECT_MULTI].
   */
  public val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  /**
   * Emitted when a column's title is pressed.
   */
  public val columnTitlePressed: Signal1<Long> by signal("column")

  /**
   * Emitted when a cell with the [godot.TreeItem.CELL_MODE_CUSTOM] is clicked to be edited.
   */
  public val customPopupEdited: Signal1<Boolean> by signal("arrowClicked")

  /**
   * Emitted when [godot.TreeItem.propagateCheck] is called. Connect to this signal to process the items that are affected when [godot.TreeItem.propagateCheck] is invoked. The order that the items affected will be processed is as follows: the item that invoked the method, children of that item, and finally parents of that item.
   */
  public val checkPropagatedToItem: Signal2<TreeItem, Long> by signal("item", "column")

  /**
   * Emitted when an item is collapsed by a click on the folding arrow.
   */
  public val itemCollapsed: Signal1<TreeItem> by signal("item")

  /**
   * Emitted when an item is edited using the right mouse button.
   */
  public val itemRmbEdited: Signal0 by signal()

  /**
   * Emitted when an item is edited.
   */
  public val itemEdited: Signal0 by signal()

  /**
   * Emitted when the right mouse button is pressed if right mouse button selection is active and the tree is empty.
   */
  public val emptyTreeRmbSelected: Signal1<Vector2> by signal("position")

  /**
   * Emitted when a left mouse button click does not select any item.
   */
  public val nothingSelected: Signal0 by signal()

  /**
   * Emitted when an item's icon is double-clicked.
   */
  public val itemDoubleClicked: Signal0 by signal()

  /**
   * Emitted when the right mouse button is pressed in the empty space of the tree.
   */
  public val emptyRmb: Signal1<Vector2> by signal("position")

  /**
   * Emitted when an item is selected with the right mouse button.
   */
  public val itemRmbSelected: Signal1<Vector2> by signal("position")

  /**
   * Emitted when an item is selected.
   */
  public val itemSelected: Signal0 by signal()

  /**
   * Emitted when a cell is selected.
   */
  public val cellSelected: Signal0 by signal()

  /**
   * Emitted when a button on the tree was pressed (see [godot.TreeItem.addButton]).
   */
  public val buttonPressed: Signal3<TreeItem, Long, Long> by signal("item", "column", "id")

  /**
   * Emitted when a custom button is pressed (i.e. in a [godot.TreeItem.CELL_MODE_CUSTOM] mode cell).
   */
  public val itemCustomButtonPressed: Signal0 by signal()

  /**
   * The number of columns.
   */
  public var columns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMNS, NIL)
    }

  /**
   * If `true`, column titles are visible.
   */
  public var columnTitlesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ARE_COLUMN_TITLES_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLES_VISIBLE,
          NIL)
    }

  /**
   * If `true`, the currently selected cell may be selected again.
   */
  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ALLOW_RESELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_ALLOW_RESELECT, NIL)
    }

  /**
   * If `true`, a right mouse button click can select items.
   */
  public var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ALLOW_RMB_SELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_ALLOW_RMB_SELECT, NIL)
    }

  /**
   * If `true`, the folding arrow is hidden.
   */
  public var hideFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_FOLDING_HIDDEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_HIDE_FOLDING, NIL)
    }

  /**
   * If `true`, the tree's root is hidden.
   */
  public var hideRoot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_ROOT_HIDDEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_HIDE_ROOT, NIL)
    }

  /**
   * The drop mode as an OR combination of flags. See [enum DropModeFlags] constants. Once dropping is done, reverts to [DROP_MODE_DISABLED]. Setting this during [godot.Control.CanDropData] is recommended.
   *
   * This controls the drop sections, i.e. the decision and drawing of possible drop locations based on the mouse position.
   */
  public var dropModeFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_DROP_MODE_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_DROP_MODE_FLAGS, NIL)
    }

  /**
   * Allows single or multiple selection. See the [enum SelectMode] constants.
   */
  public var selectMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_SELECT_MODE, NIL)
    }

  /**
   * If `true`, enables horizontal scrolling.
   */
  public var scrollHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_H_SCROLL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_H_SCROLL_ENABLED, NIL)
    }

  /**
   * If `true`, enables vertical scrolling.
   */
  public var scrollVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_V_SCROLL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_V_SCROLL_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TREE)
  }

  /**
   * Clears the tree. This removes all items.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CLEAR, NIL)
  }

  /**
   * Creates an item in the tree and adds it as a child of `parent`, which can be either a valid [godot.TreeItem] or `null`.
   *
   * If `parent` is `null`, the root item will be the parent, or the new item will be the root itself if the tree is empty.
   *
   * The new item will be the `idx`th child of parent, or it will be the last child if there are not enough siblings.
   */
  public fun createItem(parent: TreeItem? = null, idx: Long = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_CREATE_ITEM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the tree's root item, or `null` if the tree is empty.
   */
  public fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ROOT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Overrides the calculated minimum width of a column. It can be set to `0` to restore the default behavior. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to [godot.Control.sizeFlagsStretchRatio].
   */
  public fun setColumnCustomMinimumWidth(column: Long, minWidth: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to minWidth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_CUSTOM_MINIMUM_WIDTH, NIL)
  }

  /**
   * If `true`, the column will have the "Expand" flag of [godot.Control]. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to [godot.Control.sizeFlagsStretchRatio].
   */
  public fun setColumnExpand(column: Long, expand: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to expand)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_EXPAND, NIL)
  }

  /**
   *
   */
  public fun setColumnExpandRatio(column: Long, ratio: Long): Unit {
    TransferContext.writeArguments(LONG to column, LONG to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_EXPAND_RATIO, NIL)
  }

  /**
   *
   */
  public fun setColumnClipContent(column: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_CLIP_CONTENT, NIL)
  }

  /**
   *
   */
  public fun isColumnExpanding(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_COLUMN_EXPANDING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun isColumnClippingContent(column: Long): Boolean {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_IS_COLUMN_CLIPPING_CONTENT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getColumnExpandRatio(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_EXPAND_RATIO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the column's width in pixels.
   */
  public fun getColumnWidth(column: Long): Long {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the next selected [godot.TreeItem] after the given one, or `null` if the end is reached.
   *
   * If `from` is `null`, this returns the first selected item.
   */
  public fun getNextSelected(from: TreeItem): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_NEXT_SELECTED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the currently focused item, or `null` if no item is focused.
   *
   * In [SELECT_ROW] and [SELECT_SINGLE] modes, the focused item is same as the selected item. In [SELECT_MULTI] mode, the focused item is the item under the focus cursor, not necessarily selected.
   *
   * To get the currently selected item(s), use [getNextSelected].
   */
  public fun getSelected(): TreeItem? {
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
  public fun getSelectedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SELECTED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the last pressed button's index.
   */
  public fun getPressedButton(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_PRESSED_BUTTON, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the currently edited item. Can be used with [itemEdited] to get the item that was modified.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     $Tree.item_edited.connect(on_Tree_item_edited)
   *
   *
   *
   * func on_Tree_item_edited():
   *
   *     print($Tree.get_edited()) # This item just got edited (e.g. checked).
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     GetNode<Tree>("Tree").ItemEdited += OnTreeItemEdited;
   *
   * }
   *
   *
   *
   * public void OnTreeItemEdited()
   *
   * {
   *
   *     GD.Print(GetNode<Tree>("Tree").GetEdited()); // This item just got edited (e.g. checked).
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the column for the currently edited item.
   */
  public fun getEditedColumn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_EDITED_COLUMN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Edits the selected tree item as if it was clicked. The item must be set editable with [godot.TreeItem.setEditable]. Returns `true` if the item could be edited. Fails if no item is selected.
   */
  public fun editSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_EDIT_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the rectangle for custom popups. Helper to create custom cell controls that display a popup. See [godot.TreeItem.setCellMode].
   */
  public fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_CUSTOM_POPUP_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the rectangle area for the specified [godot.TreeItem]. If `column` is specified, only get the position and size of that column, otherwise get the rectangle containing all columns.
   */
  public fun getItemAreaRect(item: TreeItem, column: Long = -1): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AREA_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the tree item at the specified position (relative to the tree origin position).
   */
  public fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_ITEM_AT_POSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TreeItem?
  }

  /**
   * Returns the column index at `position`, or -1 if no item is there.
   */
  public fun getColumnAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the drop section at `position`, or -100 if no item is there.
   *
   * Values -1, 0, or 1 will be returned for the "above item", "on item", and "below item" drop sections, respectively. See [enum DropModeFlags] for a description of each drop section.
   *
   * To get the item which the returned drop section is relative to, use [getItemAtPosition].
   */
  public fun getDropSectionAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_DROP_SECTION_AT_POSITION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the button id at `position`, or -1 if no button is there.
   */
  public fun getButtonIdAtPosition(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_BUTTON_ID_AT_POSITION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Makes the currently focused cell visible.
   *
   * This will scroll the tree if necessary. In [SELECT_ROW] mode, this will not do horizontal scrolling, as all the cells in the selected row is focused logically.
   *
   * **Note:** Despite the name of this method, the focus cursor itself is only visible in [SELECT_MULTI] mode.
   */
  public fun ensureCursorIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_ENSURE_CURSOR_IS_VISIBLE, NIL)
  }

  /**
   * Sets the title of a column.
   */
  public fun setColumnTitle(column: Long, title: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE, NIL)
  }

  /**
   * Returns the column's title.
   */
  public fun getColumnTitle(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets column title base writing direction.
   */
  public fun setColumnTitleDirection(column: Long, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column, LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE_DIRECTION,
        NIL)
  }

  /**
   * Returns column title base writing direction.
   */
  public fun getColumnTitleDirection(column: Long): Control.TextDirection {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE_DIRECTION,
        LONG)
    return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets OpenType feature `tag` for the column title.
   */
  public fun setColumnTitleOpentypeFeature(
    column: Long,
    tag: String,
    `value`: Long
  ): Unit {
    TransferContext.writeArguments(LONG to column, STRING to tag, LONG to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE_OPENTYPE_FEATURE, NIL)
  }

  /**
   * Returns OpenType feature `tag` of the column title.
   */
  public fun getColumnTitleOpentypeFeature(column: Long, tag: String): Long {
    TransferContext.writeArguments(LONG to column, STRING to tag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE_OPENTYPE_FEATURE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all OpenType features from the item's text.
   */
  public fun clearColumnTitleOpentypeFeatures(column: Long): Unit {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TREE_CLEAR_COLUMN_TITLE_OPENTYPE_FEATURES, NIL)
  }

  /**
   * Sets language code of column title used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setColumnTitleLanguage(column: Long, language: String): Unit {
    TransferContext.writeArguments(LONG to column, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SET_COLUMN_TITLE_LANGUAGE, NIL)
  }

  /**
   * Returns column title language code.
   */
  public fun getColumnTitleLanguage(column: Long): String {
    TransferContext.writeArguments(LONG to column)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_COLUMN_TITLE_LANGUAGE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current scrolling position.
   */
  public fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_GET_SCROLL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Causes the [godot.Tree] to jump to the specified [godot.TreeItem].
   */
  public fun scrollToItem(item: TreeItem, centerOnItem: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to item, BOOL to centerOnItem)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TREE_SCROLL_TO_ITEM, NIL)
  }

  public enum class SelectMode(
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
    SELECT_MULTI(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DropModeFlags(
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
    DROP_MODE_INBETWEEN(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
