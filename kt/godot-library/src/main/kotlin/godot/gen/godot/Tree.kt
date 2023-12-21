// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A control used to show a set of internal [TreeItem]s in a hierarchical structure. The tree items
 * can be selected, expanded and collapsed. The tree can have multiple columns with custom controls
 * like [LineEdit]s, buttons and popups. It can be useful for structured displays and interactions.
 * Trees are built via code, using [TreeItem] objects to create the structure. They have a single
 * root, but multiple roots can be simulated with [hideRoot]:
 *
 * gdscript:
 * ```gdscript
 * func _ready():
 *     var tree = Tree.new()
 *     var root = tree.create_item()
 *     tree.hide_root = true
 *     var child1 = tree.create_item(root)
 *     var child2 = tree.create_item(root)
 *     var subchild1 = tree.create_item(child1)
 *     subchild1.set_text(0, "Subchild1")
 * ```
 * csharp:
 * ```csharp
 * public override void _Ready()
 * {
 *     var tree = new Tree();
 *     TreeItem root = tree.CreateItem();
 *     tree.HideRoot = true;
 *     TreeItem child1 = tree.CreateItem(root);
 *     TreeItem child2 = tree.CreateItem(root);
 *     TreeItem subchild1 = tree.CreateItem(child1);
 *     subchild1.SetText(0, "Subchild1");
 * }
 * ```
 *
 * To iterate over all the [TreeItem] objects in a [Tree] object, use [TreeItem.getNext] and
 * [TreeItem.getFirstChild] after getting the root through [getRoot]. You can use [Object.free] on a
 * [TreeItem] to remove it from the [Tree].
 * **Incremental search:** Like [ItemList] and [PopupMenu], [Tree] supports searching within the
 * list while the control is focused. Press a key that matches the first letter of an item's name to
 * select the first item starting with the given letter. After that point, there are two ways to
 * perform incremental search: 1) Press the same key again before the timeout duration to select the
 * next item starting with the same letter. 2) Press letter keys that match the rest of the word before
 * the timeout duration to match to select the item in question directly. Both of these actions will be
 * reset to the beginning of the list if the timeout duration has passed since the last keystroke was
 * registered. You can adjust the timeout duration by changing
 * [ProjectSettings.gui/timers/incrementalSearchMaxIntervalMsec].
 */
@GodotBaseType
public open class Tree : Control() {
  /**
   * Emitted when an item is selected.
   */
  public val itemSelected: Signal0 by signal()

  /**
   * Emitted when a cell is selected.
   */
  public val cellSelected: Signal0 by signal()

  /**
   * Emitted instead of [signal item_selected] if [selectMode] is set to [SELECTMULTI].
   */
  public val multiSelected: Signal3<TreeItem, Long, Boolean> by signal("item", "column", "selected")

  /**
   * Emitted when an item is selected with a mouse button.
   */
  public val itemMouseSelected: Signal2<Vector2, Long> by signal("position", "mouseButtonIndex")

  /**
   * Emitted when a mouse button is clicked in the empty space of the tree.
   */
  public val emptyClicked: Signal2<Vector2, Long> by signal("position", "mouseButtonIndex")

  /**
   * Emitted when an item is edited.
   */
  public val itemEdited: Signal0 by signal()

  /**
   * Emitted when an item with [TreeItem.CELLMODECUSTOM] is clicked with a mouse button.
   */
  public val customItemClicked: Signal1<Long> by signal("mouseButtonIndex")

  /**
   * Emitted when an item's icon is double-clicked. For a signal that emits when any part of the
   * item is double-clicked, see [signal item_activated].
   */
  public val itemIconDoubleClicked: Signal0 by signal()

  /**
   * Emitted when an item is collapsed by a click on the folding arrow.
   */
  public val itemCollapsed: Signal1<TreeItem> by signal("item")

  /**
   * Emitted when [TreeItem.propagateCheck] is called. Connect to this signal to process the items
   * that are affected when [TreeItem.propagateCheck] is invoked. The order that the items affected
   * will be processed is as follows: the item that invoked the method, children of that item, and
   * finally parents of that item.
   */
  public val checkPropagatedToItem: Signal2<TreeItem, Long> by signal("item", "column")

  /**
   * Emitted when a button on the tree was pressed (see [TreeItem.addButton]).
   */
  public val buttonClicked: Signal4<TreeItem, Long, Long, Long> by signal("item", "column", "id",
      "mouseButtonIndex")

  /**
   * Emitted when a cell with the [TreeItem.CELLMODECUSTOM] is clicked to be edited.
   */
  public val customPopupEdited: Signal1<Boolean> by signal("arrowClicked")

  /**
   * Emitted when an item is double-clicked, or selected with a `ui_accept` input event (e.g. using
   * [kbd]Enter[/kbd] or [kbd]Space[/kbd] on the keyboard).
   */
  public val itemActivated: Signal0 by signal()

  /**
   * Emitted when a column's title is clicked with either [MOUSEBUTTONLEFT] or [MOUSEBUTTONRIGHT].
   */
  public val columnTitleClicked: Signal2<Long, Long> by signal("column", "mouseButtonIndex")

  /**
   * Emitted when a left mouse button click does not select any item.
   */
  public val nothingSelected: Signal0 by signal()

  /**
   * The number of columns.
   */
  public var columns: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColumnsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setColumnsPtr, NIL)
    }

  /**
   * If `true`, column titles are visible.
   */
  public var columnTitlesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areColumnTitlesVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitlesVisiblePtr, NIL)
    }

  /**
   * If `true`, the currently selected cell may be selected again.
   */
  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowReselectPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowReselectPtr, NIL)
    }

  /**
   * If `true`, a right mouse button click can select items.
   */
  public var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowRmbSelectPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowRmbSelectPtr, NIL)
    }

  /**
   * If `true`, allows navigating the [Tree] with letter keys through incremental search.
   */
  public var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAllowSearchPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowSearchPtr, NIL)
    }

  /**
   * If `true`, the folding arrow is hidden.
   */
  public var hideFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFoldingHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideFoldingPtr, NIL)
    }

  /**
   * If `true`, recursive folding is enabled for this [Tree]. Holding down Shift while clicking the
   * fold arrow collapses or uncollapses the [TreeItem] and all its descendants.
   */
  public var enableRecursiveFolding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRecursiveFoldingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableRecursiveFoldingPtr, NIL)
    }

  /**
   * If `true`, the tree's root is hidden.
   */
  public var hideRoot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRootHiddenPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideRootPtr, NIL)
    }

  /**
   * The drop mode as an OR combination of flags. See [DropModeFlags] constants. Once dropping is
   * done, reverts to [DROPMODEDISABLED]. Setting this during [Control.CanDropData] is recommended.
   * This controls the drop sections, i.e. the decision and drawing of possible drop locations based
   * on the mouse position.
   */
  public var dropModeFlags: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDropModeFlagsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDropModeFlagsPtr, NIL)
    }

  /**
   * Allows single or multiple selection. See the [SelectMode] constants.
   */
  public var selectMode: SelectMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectModePtr, LONG)
      return Tree.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectModePtr, NIL)
    }

  /**
   * If `true`, enables horizontal scrolling.
   */
  public var scrollHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollEnabledPtr, NIL)
    }

  /**
   * If `true`, enables vertical scrolling.
   */
  public var scrollVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVScrollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TREE, scriptIndex)
    return true
  }

  /**
   * Clears the tree. This removes all items.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Creates an item in the tree and adds it as a child of [parent], which can be either a valid
   * [TreeItem] or `null`.
   * If [parent] is `null`, the root item will be the parent, or the new item will be the root
   * itself if the tree is empty.
   * The new item will be the [index]-th child of parent, or it will be the last child if there are
   * not enough siblings.
   */
  @JvmOverloads
  public fun createItem(parent: TreeItem? = null, index: Int = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createItemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the tree's root item, or `null` if the tree is empty.
   */
  public fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Overrides the calculated minimum width of a column. It can be set to `0` to restore the default
   * behavior. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to
   * [Control.sizeFlagsStretchRatio].
   */
  public fun setColumnCustomMinimumWidth(column: Int, minWidth: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to minWidth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnCustomMinimumWidthPtr, NIL)
  }

  /**
   * If `true`, the column will have the "Expand" flag of [Control]. Columns that have the "Expand"
   * flag will use their expand ratio in a similar fashion to [Control.sizeFlagsStretchRatio] (see
   * [setColumnExpandRatio]).
   */
  public fun setColumnExpand(column: Int, expand: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnExpandPtr, NIL)
  }

  /**
   * Sets the relative expand ratio for a column. See [setColumnExpand].
   */
  public fun setColumnExpandRatio(column: Int, ratio: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to ratio.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnExpandRatioPtr, NIL)
  }

  /**
   * Allows to enable clipping for column's content, making the content size ignored.
   */
  public fun setColumnClipContent(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnClipContentPtr, NIL)
  }

  /**
   * Returns `true` if the column has enabled expanding (see [setColumnExpand]).
   */
  public fun isColumnExpanding(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isColumnExpandingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the column has enabled clipping (see [setColumnClipContent]).
   */
  public fun isColumnClippingContent(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isColumnClippingContentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the expand ratio assigned to the column.
   */
  public fun getColumnExpandRatio(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnExpandRatioPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the column's width in pixels.
   */
  public fun getColumnWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the next selected [TreeItem] after the given one, or `null` if the end is reached.
   * If [from] is `null`, this returns the first selected item.
   */
  public fun getNextSelected(from: TreeItem): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the currently focused item, or `null` if no item is focused.
   * In [SELECTROW] and [SELECTSINGLE] modes, the focused item is same as the selected item. In
   * [SELECTMULTI] mode, the focused item is the item under the focus cursor, not necessarily selected.
   * To get the currently selected item(s), use [getNextSelected].
   */
  public fun getSelected(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Selects the specified [TreeItem] and column.
   */
  public fun setSelected(item: TreeItem, column: Int): Unit {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
  }

  /**
   * Returns the currently focused column, or -1 if no column is focused.
   * In [SELECTSINGLE] mode, the focused column is the selected column. In [SELECTROW] mode, the
   * focused column is always 0 if any item is selected. In [SELECTMULTI] mode, the focused column is
   * the column under the focus cursor, and there are not necessarily any column selected.
   * To tell whether a column of an item is selected, use [TreeItem.isSelected].
   */
  public fun getSelectedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the last pressed button's index.
   */
  public fun getPressedButton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPressedButtonPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Deselects all tree items (rows and columns). In [SELECTMULTI] mode also removes selection
   * cursor.
   */
  public fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Returns the currently edited item. Can be used with [signal item_edited] to get the item that
   * was modified.
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     $Tree.item_edited.connect(on_Tree_item_edited)
   *
   * func on_Tree_item_edited():
   *     print($Tree.get_edited()) # This item just got edited (e.g. checked).
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     GetNode<Tree>("Tree").ItemEdited += OnTreeItemEdited;
   * }
   *
   * public void OnTreeItemEdited()
   * {
   *     GD.Print(GetNode<Tree>("Tree").GetEdited()); // This item just got edited (e.g. checked).
   * }
   * ```
   */
  public fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the column for the currently edited item.
   */
  public fun getEditedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Edits the selected tree item as if it was clicked.
   * Either the item must be set editable with [TreeItem.setEditable] or [forceEdit] must be `true`.
   * Returns `true` if the item could be edited. Fails if no item is selected.
   */
  @JvmOverloads
  public fun editSelected(forceEdit: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to forceEdit)
    TransferContext.callMethod(rawPtr, MethodBindings.editSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the rectangle for custom popups. Helper to create custom cell controls that display a
   * popup. See [TreeItem.setCellMode].
   */
  public fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomPopupRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns the rectangle area for the specified [TreeItem]. If [column] is specified, only get the
   * position and size of that column, otherwise get the rectangle containing all columns. If a button
   * index is specified, the rectangle of that button will be returned.
   */
  @JvmOverloads
  public fun getItemAreaRect(
    item: TreeItem,
    column: Int = -1,
    buttonIndex: Int = -1,
  ): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAreaRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns the tree item at the specified position (relative to the tree origin position).
   */
  public fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAtPositionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TreeItem?)
  }

  /**
   * Returns the column index at [position], or -1 if no item is there.
   */
  public fun getColumnAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the drop section at [position], or -100 if no item is there.
   * Values -1, 0, or 1 will be returned for the "above item", "on item", and "below item" drop
   * sections, respectively. See [DropModeFlags] for a description of each drop section.
   * To get the item which the returned drop section is relative to, use [getItemAtPosition].
   */
  public fun getDropSectionAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getDropSectionAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the button ID at [position], or -1 if no button is there.
   */
  public fun getButtonIdAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonIdAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Makes the currently focused cell visible.
   * This will scroll the tree if necessary. In [SELECTROW] mode, this will not do horizontal
   * scrolling, as all the cells in the selected row is focused logically.
   * **Note:** Despite the name of this method, the focus cursor itself is only visible in
   * [SELECTMULTI] mode.
   */
  public fun ensureCursorIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ensureCursorIsVisiblePtr, NIL)
  }

  /**
   * Sets the title of a column.
   */
  public fun setColumnTitle(column: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitlePtr, NIL)
  }

  /**
   * Returns the column's title.
   */
  public fun getColumnTitle(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the column title alignment. Note that [@GlobalScope.HORIZONTALALIGNMENTFILL] is not
   * supported for column titles.
   */
  public fun setColumnTitleAlignment(column: Int, titleAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to titleAlignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleAlignmentPtr, NIL)
  }

  /**
   * Returns the column title alignment.
   */
  public fun getColumnTitleAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets column title base writing direction.
   */
  public fun setColumnTitleDirection(column: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleDirectionPtr, NIL)
  }

  /**
   * Returns column title base writing direction.
   */
  public fun getColumnTitleDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of column title used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public fun setColumnTitleLanguage(column: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setColumnTitleLanguagePtr, NIL)
  }

  /**
   * Returns column title language code.
   */
  public fun getColumnTitleLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColumnTitleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current scrolling position.
   */
  public fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Causes the [Tree] to jump to the specified [TreeItem].
   */
  @JvmOverloads
  public fun scrollToItem(item: TreeItem, centerOnItem: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to item, BOOL to centerOnItem)
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToItemPtr, NIL)
  }

  public enum class SelectMode(
    id: Long,
  ) {
    /**
     * Allows selection of a single cell at a time. From the perspective of items, only a single
     * item is allowed to be selected. And there is only one column selected in the selected item.
     * The focus cursor is always hidden in this mode, but it is positioned at the current
     * selection, making the currently selected item the currently focused item.
     */
    SELECT_SINGLE(0),
    /**
     * Allows selection of a single row at a time. From the perspective of items, only a single
     * items is allowed to be selected. And all the columns are selected in the selected item.
     * The focus cursor is always hidden in this mode, but it is positioned at the first column of
     * the current selection, making the currently selected item the currently focused item.
     */
    SELECT_ROW(1),
    /**
     * Allows selection of multiple cells at the same time. From the perspective of items, multiple
     * items are allowed to be selected. And there can be multiple columns selected in each selected
     * item.
     * The focus cursor is visible in this mode, the item or column under the cursor is not
     * necessarily selected.
     */
    SELECT_MULTI(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DropModeFlags(
    id: Long,
  ) {
    /**
     * Disables all drop sections, but still allows to detect the "on item" drop section by
     * [getDropSectionAtPosition].
     * **Note:** This is the default flag, it has no effect when combined with other flags.
     */
    DROP_MODE_DISABLED(0),
    /**
     * Enables the "on item" drop section. This drop section covers the entire item.
     * When combined with [DROPMODEINBETWEEN], this drop section halves the height and stays
     * centered vertically.
     */
    DROP_MODE_ON_ITEM(1),
    /**
     * Enables "above item" and "below item" drop sections. The "above item" drop section covers the
     * top half of the item, and the "below item" drop section covers the bottom half.
     * When combined with [DROPMODEONITEM], these drop sections halves the height and stays on top /
     * bottom accordingly.
     */
    DROP_MODE_INBETWEEN(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "clear")

    public val createItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "create_item")

    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_root")

    public val setColumnCustomMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_custom_minimum_width")

    public val setColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand")

    public val setColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand_ratio")

    public val setColumnClipContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_clip_content")

    public val isColumnExpandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_expanding")

    public val isColumnClippingContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_clipping_content")

    public val getColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_expand_ratio")

    public val getColumnWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_column_width")

    public val setHideRootPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_hide_root")

    public val isRootHiddenPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "is_root_hidden")

    public val getNextSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_next_selected")

    public val getSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_selected")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_selected")

    public val getSelectedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_selected_column")

    public val getPressedButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_pressed_button")

    public val setSelectModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_select_mode")

    public val getSelectModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_select_mode")

    public val deselectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "deselect_all")

    public val setColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_columns")

    public val getColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_columns")

    public val getEditedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_edited")

    public val getEditedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_edited_column")

    public val editSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "edit_selected")

    public val getCustomPopupRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_custom_popup_rect")

    public val getItemAreaRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_area_rect")

    public val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_at_position")

    public val getColumnAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_at_position")

    public val getDropSectionAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_section_at_position")

    public val getButtonIdAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_button_id_at_position")

    public val ensureCursorIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "ensure_cursor_is_visible")

    public val setColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_titles_visible")

    public val areColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "are_column_titles_visible")

    public val setColumnTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_column_title")

    public val getColumnTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_column_title")

    public val setColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_alignment")

    public val getColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_alignment")

    public val setColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_direction")

    public val getColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_direction")

    public val setColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_language")

    public val getColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_language")

    public val getScrollPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_scroll")

    public val scrollToItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "scroll_to_item")

    public val setHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_h_scroll_enabled")

    public val isHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_h_scroll_enabled")

    public val setVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_v_scroll_enabled")

    public val isVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_v_scroll_enabled")

    public val setHideFoldingPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_hide_folding")

    public val isFoldingHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_folding_hidden")

    public val setEnableRecursiveFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_enable_recursive_folding")

    public val isRecursiveFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_recursive_folding_enabled")

    public val setDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_drop_mode_flags")

    public val getDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_mode_flags")

    public val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_rmb_select")

    public val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_rmb_select")

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_reselect")

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_reselect")

    public val setAllowSearchPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_allow_search")
  }
}
