// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.HorizontalAlignment
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.Signal4
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
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
  public val itemSelected: Signal0 by Signal0

  /**
   * Emitted when a cell is selected.
   */
  public val cellSelected: Signal0 by Signal0

  /**
   * Emitted instead of [signal item_selected] if [selectMode] is set to [SELECT_MULTI].
   */
  public val multiSelected: Signal3<TreeItem, Long, Boolean> by Signal3

  /**
   * Emitted when an item is selected with a mouse button.
   */
  public val itemMouseSelected: Signal2<Vector2, Long> by Signal2

  /**
   * Emitted when a mouse button is clicked in the empty space of the tree.
   */
  public val emptyClicked: Signal2<Vector2, Long> by Signal2

  /**
   * Emitted when an item is edited.
   */
  public val itemEdited: Signal0 by Signal0

  /**
   * Emitted when an item with [TreeItem.CELL_MODE_CUSTOM] is clicked with a mouse button.
   */
  public val customItemClicked: Signal1<Long> by Signal1

  /**
   * Emitted when an item's icon is double-clicked. For a signal that emits when any part of the
   * item is double-clicked, see [signal item_activated].
   */
  public val itemIconDoubleClicked: Signal0 by Signal0

  /**
   * Emitted when an item is collapsed by a click on the folding arrow.
   */
  public val itemCollapsed: Signal1<TreeItem> by Signal1

  /**
   * Emitted when [TreeItem.propagateCheck] is called. Connect to this signal to process the items
   * that are affected when [TreeItem.propagateCheck] is invoked. The order that the items affected
   * will be processed is as follows: the item that invoked the method, children of that item, and
   * finally parents of that item.
   */
  public val checkPropagatedToItem: Signal2<TreeItem, Long> by Signal2

  /**
   * Emitted when a button on the tree was pressed (see [TreeItem.addButton]).
   */
  public val buttonClicked: Signal4<TreeItem, Long, Long, Long> by Signal4

  /**
   * Emitted when a cell with the [TreeItem.CELL_MODE_CUSTOM] is clicked to be edited.
   */
  public val customPopupEdited: Signal1<Boolean> by Signal1

  /**
   * Emitted when an item is double-clicked, or selected with a `ui_accept` input event (e.g. using
   * [kbd]Enter[/kbd] or [kbd]Space[/kbd] on the keyboard).
   */
  public val itemActivated: Signal0 by Signal0

  /**
   * Emitted when a column's title is clicked with either [MOUSE_BUTTON_LEFT] or
   * [MOUSE_BUTTON_RIGHT].
   */
  public val columnTitleClicked: Signal2<Long, Long> by Signal2

  /**
   * Emitted when a left mouse button click does not select any item.
   */
  public val nothingSelected: Signal0 by Signal0

  /**
   * The number of columns.
   */
  public final inline var columns: Int
    @JvmName("columnsProperty")
    get() = getColumns()
    @JvmName("columnsProperty")
    set(`value`) {
      setColumns(value)
    }

  /**
   * If `true`, column titles are visible.
   */
  public final inline var columnTitlesVisible: Boolean
    @JvmName("columnTitlesVisibleProperty")
    get() = areColumnTitlesVisible()
    @JvmName("columnTitlesVisibleProperty")
    set(`value`) {
      setColumnTitlesVisible(value)
    }

  /**
   * If `true`, the currently selected cell may be selected again.
   */
  public final inline var allowReselect: Boolean
    @JvmName("allowReselectProperty")
    get() = getAllowReselect()
    @JvmName("allowReselectProperty")
    set(`value`) {
      setAllowReselect(value)
    }

  /**
   * If `true`, a right mouse button click can select items.
   */
  public final inline var allowRmbSelect: Boolean
    @JvmName("allowRmbSelectProperty")
    get() = getAllowRmbSelect()
    @JvmName("allowRmbSelectProperty")
    set(`value`) {
      setAllowRmbSelect(value)
    }

  /**
   * If `true`, allows navigating the [Tree] with letter keys through incremental search.
   */
  public final inline var allowSearch: Boolean
    @JvmName("allowSearchProperty")
    get() = getAllowSearch()
    @JvmName("allowSearchProperty")
    set(`value`) {
      setAllowSearch(value)
    }

  /**
   * If `true`, the folding arrow is hidden.
   */
  public final inline var hideFolding: Boolean
    @JvmName("hideFoldingProperty")
    get() = isFoldingHidden()
    @JvmName("hideFoldingProperty")
    set(`value`) {
      setHideFolding(value)
    }

  /**
   * If `true`, recursive folding is enabled for this [Tree]. Holding down [kbd]Shift[/kbd] while
   * clicking the fold arrow or using `ui_right`/`ui_left` shortcuts collapses or uncollapses the
   * [TreeItem] and all its descendants.
   */
  public final inline var enableRecursiveFolding: Boolean
    @JvmName("enableRecursiveFoldingProperty")
    get() = isRecursiveFoldingEnabled()
    @JvmName("enableRecursiveFoldingProperty")
    set(`value`) {
      setEnableRecursiveFolding(value)
    }

  /**
   * If `true`, the tree's root is hidden.
   */
  public final inline var hideRoot: Boolean
    @JvmName("hideRootProperty")
    get() = isRootHidden()
    @JvmName("hideRootProperty")
    set(`value`) {
      setHideRoot(value)
    }

  /**
   * The drop mode as an OR combination of flags. See [DropModeFlags] constants. Once dropping is
   * done, reverts to [DROP_MODE_DISABLED]. Setting this during [Control.CanDropData] is recommended.
   * This controls the drop sections, i.e. the decision and drawing of possible drop locations based
   * on the mouse position.
   */
  public final inline var dropModeFlags: Int
    @JvmName("dropModeFlagsProperty")
    get() = getDropModeFlags()
    @JvmName("dropModeFlagsProperty")
    set(`value`) {
      setDropModeFlags(value)
    }

  /**
   * Allows single or multiple selection. See the [SelectMode] constants.
   */
  public final inline var selectMode: SelectMode
    @JvmName("selectModeProperty")
    get() = getSelectMode()
    @JvmName("selectModeProperty")
    set(`value`) {
      setSelectMode(value)
    }

  /**
   * If `true`, enables horizontal scrolling.
   */
  public final inline var scrollHorizontalEnabled: Boolean
    @JvmName("scrollHorizontalEnabledProperty")
    get() = isHScrollEnabled()
    @JvmName("scrollHorizontalEnabledProperty")
    set(`value`) {
      setHScrollEnabled(value)
    }

  /**
   * If `true`, enables vertical scrolling.
   */
  public final inline var scrollVerticalEnabled: Boolean
    @JvmName("scrollVerticalEnabledProperty")
    get() = isVScrollEnabled()
    @JvmName("scrollVerticalEnabledProperty")
    set(`value`) {
      setVScrollEnabled(value)
    }

  /**
   * If `true`, tree items with no tooltip assigned display their text as their tooltip. See also
   * [TreeItem.getTooltipText] and [TreeItem.getButtonTooltipText].
   */
  public final inline var autoTooltip: Boolean
    @JvmName("autoTooltipProperty")
    get() = isAutoTooltipEnabled()
    @JvmName("autoTooltipProperty")
    set(`value`) {
      setAutoTooltip(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(698, scriptIndex)
  }

  /**
   * Clears the tree. This removes all items.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
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
  public final fun createItem(parent: TreeItem? = null, index: Int = -1): TreeItem? {
    TransferContext.writeArguments(OBJECT to parent, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createItemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Returns the tree's root item, or `null` if the tree is empty.
   */
  public final fun getRoot(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Overrides the calculated minimum width of a column. It can be set to `0` to restore the default
   * behavior. Columns that have the "Expand" flag will use their "min_width" in a similar fashion to
   * [Control.sizeFlagsStretchRatio].
   */
  public final fun setColumnCustomMinimumWidth(column: Int, minWidth: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to minWidth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setColumnCustomMinimumWidthPtr, NIL)
  }

  /**
   * If `true`, the column will have the "Expand" flag of [Control]. Columns that have the "Expand"
   * flag will use their expand ratio in a similar fashion to [Control.sizeFlagsStretchRatio] (see
   * [setColumnExpandRatio]).
   */
  public final fun setColumnExpand(column: Int, expand: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand)
    TransferContext.callMethod(ptr, MethodBindings.setColumnExpandPtr, NIL)
  }

  /**
   * Sets the relative expand ratio for a column. See [setColumnExpand].
   */
  public final fun setColumnExpandRatio(column: Int, ratio: Int): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to ratio.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setColumnExpandRatioPtr, NIL)
  }

  /**
   * Allows to enable clipping for column's content, making the content size ignored.
   */
  public final fun setColumnClipContent(column: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setColumnClipContentPtr, NIL)
  }

  /**
   * Returns `true` if the column has enabled expanding (see [setColumnExpand]).
   */
  public final fun isColumnExpanding(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isColumnExpandingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the column has enabled clipping (see [setColumnClipContent]).
   */
  public final fun isColumnClippingContent(column: Int): Boolean {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isColumnClippingContentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the expand ratio assigned to the column.
   */
  public final fun getColumnExpandRatio(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnExpandRatioPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the column's width in pixels.
   */
  public final fun getColumnWidth(column: Int): Int {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHideRoot(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setHideRootPtr, NIL)
  }

  public final fun isRootHidden(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRootHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the next selected [TreeItem] after the given one, or `null` if the end is reached.
   * If [from] is `null`, this returns the first selected item.
   */
  public final fun getNextSelected(from: TreeItem?): TreeItem? {
    TransferContext.writeArguments(OBJECT to from)
    TransferContext.callMethod(ptr, MethodBindings.getNextSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Returns the currently focused item, or `null` if no item is focused.
   * In [SELECT_ROW] and [SELECT_SINGLE] modes, the focused item is same as the selected item. In
   * [SELECT_MULTI] mode, the focused item is the item under the focus cursor, not necessarily
   * selected.
   * To get the currently selected item(s), use [getNextSelected].
   */
  public final fun getSelected(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Selects the specified [TreeItem] and column.
   */
  public final fun setSelected(item: TreeItem?, column: Int): Unit {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSelectedPtr, NIL)
  }

  /**
   * Returns the currently focused column, or -1 if no column is focused.
   * In [SELECT_SINGLE] mode, the focused column is the selected column. In [SELECT_ROW] mode, the
   * focused column is always 0 if any item is selected. In [SELECT_MULTI] mode, the focused column is
   * the column under the focus cursor, and there are not necessarily any column selected.
   * To tell whether a column of an item is selected, use [TreeItem.isSelected].
   */
  public final fun getSelectedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the last pressed button's index.
   */
  public final fun getPressedButton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPressedButtonPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSelectMode(mode: SelectMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSelectModePtr, NIL)
  }

  public final fun getSelectMode(): SelectMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectModePtr, LONG)
    return Tree.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Deselects all tree items (rows and columns). In [SELECT_MULTI] mode also removes selection
   * cursor.
   */
  public final fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.deselectAllPtr, NIL)
  }

  public final fun setColumns(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setColumnsPtr, NIL)
  }

  public final fun getColumns(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  public final fun getEdited(): TreeItem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEditedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Returns the column for the currently edited item.
   */
  public final fun getEditedColumn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEditedColumnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Edits the selected tree item as if it was clicked.
   * Either the item must be set editable with [TreeItem.setEditable] or [forceEdit] must be `true`.
   * Returns `true` if the item could be edited. Fails if no item is selected.
   */
  @JvmOverloads
  public final fun editSelected(forceEdit: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to forceEdit)
    TransferContext.callMethod(ptr, MethodBindings.editSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the rectangle for custom popups. Helper to create custom cell controls that display a
   * popup. See [TreeItem.setCellMode].
   */
  public final fun getCustomPopupRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomPopupRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns the rectangle area for the specified [TreeItem]. If [column] is specified, only get the
   * position and size of that column, otherwise get the rectangle containing all columns. If a button
   * index is specified, the rectangle of that button will be returned.
   */
  @JvmOverloads
  public final fun getItemAreaRect(
    item: TreeItem?,
    column: Int = -1,
    buttonIndex: Int = -1,
  ): Rect2 {
    TransferContext.writeArguments(OBJECT to item, LONG to column.toLong(), LONG to buttonIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemAreaRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns the tree item at the specified position (relative to the tree origin position).
   */
  public final fun getItemAtPosition(position: Vector2): TreeItem? {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.getItemAtPositionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TreeItem?)
  }

  /**
   * Returns the column index at [position], or -1 if no item is there.
   */
  public final fun getColumnAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.getColumnAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the drop section at [position], or -100 if no item is there.
   * Values -1, 0, or 1 will be returned for the "above item", "on item", and "below item" drop
   * sections, respectively. See [DropModeFlags] for a description of each drop section.
   * To get the item which the returned drop section is relative to, use [getItemAtPosition].
   */
  public final fun getDropSectionAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.getDropSectionAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the button ID at [position], or -1 if no button is there.
   */
  public final fun getButtonIdAtPosition(position: Vector2): Int {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.getButtonIdAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Makes the currently focused cell visible.
   * This will scroll the tree if necessary. In [SELECT_ROW] mode, this will not do horizontal
   * scrolling, as all the cells in the selected row is focused logically.
   * **Note:** Despite the name of this method, the focus cursor itself is only visible in
   * [SELECT_MULTI] mode.
   */
  public final fun ensureCursorIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ensureCursorIsVisiblePtr, NIL)
  }

  public final fun setColumnTitlesVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setColumnTitlesVisiblePtr, NIL)
  }

  public final fun areColumnTitlesVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areColumnTitlesVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the title of a column.
   */
  public final fun setColumnTitle(column: Int, title: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setColumnTitlePtr, NIL)
  }

  /**
   * Returns the column's title.
   */
  public final fun getColumnTitle(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the column title alignment. Note that [@GlobalScope.HORIZONTAL_ALIGNMENT_FILL] is not
   * supported for column titles.
   */
  public final fun setColumnTitleAlignment(column: Int, titleAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to titleAlignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setColumnTitleAlignmentPtr, NIL)
  }

  /**
   * Returns the column title alignment.
   */
  public final fun getColumnTitleAlignment(column: Int): HorizontalAlignment {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnTitleAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets column title base writing direction.
   */
  public final fun setColumnTitleDirection(column: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setColumnTitleDirectionPtr, NIL)
  }

  /**
   * Returns column title base writing direction.
   */
  public final fun getColumnTitleDirection(column: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnTitleDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of column title used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setColumnTitleLanguage(column: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setColumnTitleLanguagePtr, NIL)
  }

  /**
   * Returns column title language code.
   */
  public final fun getColumnTitleLanguage(column: Int): String {
    TransferContext.writeArguments(LONG to column.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColumnTitleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current scrolling position.
   */
  public final fun getScroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScrollPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Causes the [Tree] to jump to the specified [TreeItem].
   */
  @JvmOverloads
  public final fun scrollToItem(item: TreeItem?, centerOnItem: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to item, BOOL to centerOnItem)
    TransferContext.callMethod(ptr, MethodBindings.scrollToItemPtr, NIL)
  }

  public final fun setHScrollEnabled(hScroll: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hScroll)
    TransferContext.callMethod(ptr, MethodBindings.setHScrollEnabledPtr, NIL)
  }

  public final fun isHScrollEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHScrollEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVScrollEnabled(hScroll: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hScroll)
    TransferContext.callMethod(ptr, MethodBindings.setVScrollEnabledPtr, NIL)
  }

  public final fun isVScrollEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVScrollEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHideFolding(hide: Boolean): Unit {
    TransferContext.writeArguments(BOOL to hide)
    TransferContext.callMethod(ptr, MethodBindings.setHideFoldingPtr, NIL)
  }

  public final fun isFoldingHidden(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFoldingHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableRecursiveFolding(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableRecursiveFoldingPtr, NIL)
  }

  public final fun isRecursiveFoldingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRecursiveFoldingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDropModeFlags(flags: Int): Unit {
    TransferContext.writeArguments(LONG to flags.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDropModeFlagsPtr, NIL)
  }

  public final fun getDropModeFlags(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDropModeFlagsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAllowRmbSelect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowRmbSelectPtr, NIL)
  }

  public final fun getAllowRmbSelect(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllowRmbSelectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowReselect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowReselectPtr, NIL)
  }

  public final fun getAllowReselect(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllowReselectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowSearch(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowSearchPtr, NIL)
  }

  public final fun getAllowSearch(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllowSearchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoTooltip(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoTooltipPtr, NIL)
  }

  public final fun isAutoTooltipEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    SINGLE(0),
    /**
     * Allows selection of a single row at a time. From the perspective of items, only a single
     * items is allowed to be selected. And all the columns are selected in the selected item.
     * The focus cursor is always hidden in this mode, but it is positioned at the first column of
     * the current selection, making the currently selected item the currently focused item.
     */
    ROW(1),
    /**
     * Allows selection of multiple cells at the same time. From the perspective of items, multiple
     * items are allowed to be selected. And there can be multiple columns selected in each selected
     * item.
     * The focus cursor is visible in this mode, the item or column under the cursor is not
     * necessarily selected.
     */
    MULTI(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SelectMode = entries.single { it.id == `value` }
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
    DISABLED(0),
    /**
     * Enables the "on item" drop section. This drop section covers the entire item.
     * When combined with [DROP_MODE_INBETWEEN], this drop section halves the height and stays
     * centered vertically.
     */
    ON_ITEM(1),
    /**
     * Enables "above item" and "below item" drop sections. The "above item" drop section covers the
     * top half of the item, and the "below item" drop section covers the bottom half.
     * When combined with [DROP_MODE_ON_ITEM], these drop sections halves the height and stays on
     * top / bottom accordingly.
     */
    INBETWEEN(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DropModeFlags = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "clear", 3218959716)

    internal val createItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "create_item", 528467046)

    internal val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("Tree", "get_root", 1514277247)

    internal val setColumnCustomMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_custom_minimum_width", 3937882851)

    internal val setColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand", 300928843)

    internal val setColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_expand_ratio", 3937882851)

    internal val setColumnClipContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_clip_content", 300928843)

    internal val isColumnExpandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_expanding", 1116898809)

    internal val isColumnClippingContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_column_clipping_content", 1116898809)

    internal val getColumnExpandRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_expand_ratio", 923996154)

    internal val getColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_width", 923996154)

    internal val setHideRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_hide_root", 2586408642)

    internal val isRootHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_root_hidden", 36873697)

    internal val getNextSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_next_selected", 873446299)

    internal val getSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_selected", 1514277247)

    internal val setSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_selected", 2662547442)

    internal val getSelectedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_selected_column", 3905245786)

    internal val getPressedButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_pressed_button", 3905245786)

    internal val setSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_select_mode", 3223887270)

    internal val getSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_select_mode", 100748571)

    internal val deselectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "deselect_all", 3218959716)

    internal val setColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_columns", 1286410249)

    internal val getColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_columns", 3905245786)

    internal val getEditedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_edited", 1514277247)

    internal val getEditedColumnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_edited_column", 3905245786)

    internal val editSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "edit_selected", 2595650253)

    internal val getCustomPopupRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_custom_popup_rect", 1639390495)

    internal val getItemAreaRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_area_rect", 47968679)

    internal val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_item_at_position", 4193340126)

    internal val getColumnAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_at_position", 3820158470)

    internal val getDropSectionAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_section_at_position", 3820158470)

    internal val getButtonIdAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_button_id_at_position", 3820158470)

    internal val ensureCursorIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "ensure_cursor_is_visible", 3218959716)

    internal val setColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_titles_visible", 2586408642)

    internal val areColumnTitlesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "are_column_titles_visible", 36873697)

    internal val setColumnTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title", 501894301)

    internal val getColumnTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title", 844755477)

    internal val setColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_alignment", 3276431499)

    internal val getColumnTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_alignment", 4171562184)

    internal val setColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_direction", 1707680378)

    internal val getColumnTitleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_direction", 4235602388)

    internal val setColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_column_title_language", 501894301)

    internal val getColumnTitleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_column_title_language", 844755477)

    internal val getScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_scroll", 3341600327)

    internal val scrollToItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "scroll_to_item", 1314737213)

    internal val setHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_h_scroll_enabled", 2586408642)

    internal val isHScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_h_scroll_enabled", 36873697)

    internal val setVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_v_scroll_enabled", 2586408642)

    internal val isVScrollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_v_scroll_enabled", 36873697)

    internal val setHideFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_hide_folding", 2586408642)

    internal val isFoldingHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_folding_hidden", 36873697)

    internal val setEnableRecursiveFoldingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_enable_recursive_folding", 2586408642)

    internal val isRecursiveFoldingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_recursive_folding_enabled", 36873697)

    internal val setDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_drop_mode_flags", 1286410249)

    internal val getDropModeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_drop_mode_flags", 3905245786)

    internal val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_rmb_select", 2586408642)

    internal val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_rmb_select", 36873697)

    internal val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_reselect", 2586408642)

    internal val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_reselect", 36873697)

    internal val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_allow_search", 2586408642)

    internal val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "get_allow_search", 36873697)

    internal val setAutoTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "set_auto_tooltip", 2586408642)

    internal val isAutoTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tree", "is_auto_tooltip_enabled", 36873697)
  }
}
