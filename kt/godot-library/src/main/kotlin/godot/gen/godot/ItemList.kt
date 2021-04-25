// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Control that provides a list of selectable items (and/or icons) in a single column, or optionally in multiple columns.
 *
 * This control provides a selectable list of items that may be in a single (or multiple columns) with option of text, icons, or both text and icon. Tooltips are supported and may be different for every item in the list.
 *
 * Selectable items in the list may be selected or deselected and multiple selection may be enabled. Selection with right mouse button may also be enabled to allow use of popup context menus. Items may also be "activated" by double-clicking them or by pressing Enter.
 *
 * Item text only supports single-line strings, newline characters (e.g. `\n`) in the string won't produce a newline. Text wrapping is enabled in [ICON_MODE_TOP] mode, but column's width is adjusted to fully fit its content by default. You need to set [fixedColumnWidth] greater than zero to wrap the text.
 */
@GodotBaseType
open class ItemList : Control() {
  /**
   * Triggered when specified list item is activated via double-clicking or by pressing Enter.
   */
  val itemActivated: Signal1<Long> by signal("index")

  /**
   * Triggered when specified list item has been selected via right mouse clicking.
   *
   * The click position is also provided to allow appropriate popup of context menus at the correct location.
   *
   * [allowRmbSelect] must be enabled.
   */
  val itemRmbSelected: Signal2<Long, Vector2> by signal("index", "at_position")

  /**
   * Triggered when specified item has been selected.
   *
   * [allowReselect] must be enabled to reselect an item.
   */
  val itemSelected: Signal1<Long> by signal("index")

  /**
   * Triggered when a multiple selection is altered on a list allowing multiple selection.
   */
  val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  /**
   * Triggered when a left mouse click is issued within the rect of the list but on empty space.
   */
  val nothingSelected: Signal0 by signal()

  /**
   * Triggered when a right mouse click is issued within the rect of the list but on empty space.
   *
   * [allowRmbSelect] must be enabled.
   */
  val rmbClicked: Signal1<Vector2> by signal("at_position")

  /**
   * If `true`, the currently selected item can be selected again.
   */
  open var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RESELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RESELECT, NIL)
    }

  /**
   * If `true`, right mouse button click can select items.
   */
  open var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RMB_SELECT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RMB_SELECT,
          NIL)
    }

  /**
   * If `true`, the control will automatically resize the height to fit its content.
   */
  open var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_AUTO_HEIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_AUTO_HEIGHT, NIL)
    }

  /**
   * The width all columns will be adjusted to.
   *
   * A value of zero disables the adjustment, each item will have a width equal to the width of its content and the columns will have an uneven width.
   */
  open var fixedColumnWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_COLUMN_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_COLUMN_WIDTH,
          NIL)
    }

  /**
   * The size all icons will be adjusted to.
   *
   * If either X or Y component is not greater than zero, icon size won't be affected.
   */
  open var fixedIconSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_ICON_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_ICON_SIZE, NIL)
    }

  /**
   * The icon position, whether above or to the left of the text. See the [enum IconMode] constants.
   */
  open var iconMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_MODE, NIL)
    }

  /**
   * The scale of icon applied after [fixedIconSize] and transposing takes effect.
   */
  open var iconScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_SCALE, NIL)
    }

  /**
   * Maximum columns the list will have.
   *
   * If greater than zero, the content will be split among the specified columns.
   *
   * A value of zero means unlimited columns, i.e. all items will be put in the same row.
   */
  open var maxColumns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_COLUMNS, NIL)
    }

  /**
   * Maximum lines of text allowed in each item. Space will be reserved even when there is not enough lines of text to display.
   *
   * **Note:** This property takes effect only when [iconMode] is [ICON_MODE_TOP]. To make the text wrap, [fixedColumnWidth] should be greater than zero.
   */
  open var maxTextLines: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_TEXT_LINES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_TEXT_LINES, NIL)
    }

  /**
   * Whether all columns will have the same width.
   *
   * If `true`, the width is equal to the largest column width of all columns.
   */
  open var sameColumnWidth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SAME_COLUMN_WIDTH,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SAME_COLUMN_WIDTH,
          NIL)
    }

  /**
   * Allows single or multiple item selection. See the [enum SelectMode] constants.
   */
  open var selectMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SELECT_MODE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ITEMLIST)
  }

  @CoreTypeHelper
  open fun fixedIconSize(schedule: Vector2.() -> Unit): Vector2 = fixedIconSize.apply{
      schedule(this)
      fixedIconSize = this
  }


  open fun _getItems(): VariantArray<Any?> {
    throw NotImplementedError("_get_items is not implemented for ItemList")
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _scrollChanged(arg0: Double) {
  }

  open fun _setItems(arg0: VariantArray<Any?>) {
  }

  /**
   * Adds an item to the item list with no text, only an icon.
   */
  open fun addIconItem(icon: Texture, selectable: Boolean = true) {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ICON_ITEM, NIL)
  }

  /**
   * Adds an item to the item list with specified text. Specify an `icon`, or use `null` as the `icon` for a list item with no icon.
   *
   * If selectable is `true`, the list item will be selectable.
   */
  open fun addItem(
    text: String,
    icon: Texture? = null,
    selectable: Boolean = true
  ) {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ITEM, NIL)
  }

  /**
   * Removes all items from the list.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_CLEAR, NIL)
  }

  /**
   * Ensure current selection is visible, adjusting the scroll position as necessary.
   */
  open fun ensureCurrentIsVisible() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ENSURE_CURRENT_IS_VISIBLE,
        NIL)
  }

  /**
   * Returns the item index at the given `position`.
   *
   * When there is no item at that point, -1 will be returned if `exact` is `true`, and the closest item index will be returned otherwise.
   */
  open fun getItemAtPosition(position: Vector2, exact: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of items currently in the list.
   */
  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the custom background color of the item specified by `idx` index.
   */
  open fun getItemCustomBgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_BG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the custom foreground color of the item specified by `idx` index.
   */
  open fun getItemCustomFgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_FG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the icon associated with the specified index.
   */
  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns a [godot.core.Color] modulating item's icon at the specified index.
   */
  open fun getItemIconModulate(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_MODULATE,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  open fun getItemIconRegion(idx: Long): Rect2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_REGION,
        RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the metadata value of the specified index.
   */
  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the text associated with the specified index.
   */
  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  open fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  open fun getSelectedItems(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECTED_ITEMS,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the [godot.Object] ID associated with the list.
   */
  open fun getVScroll(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_V_SCROLL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  /**
   * Returns `true` if one or more items are selected.
   */
  open fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ANYTHING_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  open fun isItemIconTransposed(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_ICON_TRANSPOSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  open fun isItemSelectable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_SELECTABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  open fun isItemTooltipEnabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_TOOLTIP_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at the specified index is currently selected.
   */
  open fun isSelected(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves item from index `from_idx` to `to_idx`.
   */
  open fun moveItem(fromIdx: Long, toIdx: Long) {
    TransferContext.writeArguments(LONG to fromIdx, LONG to toIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_MOVE_ITEM, NIL)
  }

  /**
   * Removes the item specified by `idx` index from the list.
   */
  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_REMOVE_ITEM, NIL)
  }

  /**
   * Select the item at the specified index.
   *
   * **Note:** This method does not trigger the item selection signal.
   */
  open fun select(idx: Long, single: Boolean = true) {
    TransferContext.writeArguments(LONG to idx, BOOL to single)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SELECT, NIL)
  }

  /**
   * Sets the background color of the item specified by `idx` index to the specified [godot.core.Color].
   *
   * ```
   * 				var some_string = "Some text"
   * 				some_string.set_item_custom_bg_color(0,Color(1, 0, 0, 1) # This will set the background color of the first item of the control to red.
   * 				```
   */
  open fun setItemCustomBgColor(idx: Long, customBgColor: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_BG_COLOR,
        NIL)
  }

  /**
   * Sets the foreground color of the item specified by `idx` index to the specified [godot.core.Color].
   *
   * ```
   * 				var some_string = "Some text"
   * 				some_string.set_item_custom_fg_color(0,Color(1, 0, 0, 1) # This will set the foreground color of the first item of the control to red.
   * 				```
   */
  open fun setItemCustomFgColor(idx: Long, customFgColor: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_FG_COLOR,
        NIL)
  }

  /**
   * Disables (or enables) the item at the specified index.
   *
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking or pressing Enter).
   */
  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets (or replaces) the icon's [godot.Texture] associated with the specified index.
   */
  open fun setItemIcon(idx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets a modulating [godot.core.Color] of the item associated with the specified index.
   */
  open fun setItemIconModulate(idx: Long, modulate: Color) {
    TransferContext.writeArguments(LONG to idx, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_MODULATE,
        NIL)
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  open fun setItemIconRegion(idx: Long, rect: Rect2) {
    TransferContext.writeArguments(LONG to idx, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_REGION, NIL)
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  open fun setItemIconTransposed(idx: Long, transposed: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to transposed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_TRANSPOSED,
        NIL)
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  open fun setItemMetadata(idx: Long, metadata: Any?) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_METADATA, NIL)
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  open fun setItemSelectable(idx: Long, selectable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_SELECTABLE, NIL)
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  open fun setItemTooltip(idx: Long, tooltip: String) {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  open fun setItemTooltipEnabled(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP_ENABLED,
        NIL)
  }

  /**
   * Sorts items in the list by their text.
   */
  open fun sortItemsByText() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SORT_ITEMS_BY_TEXT, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  open fun unselect(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_UNSELECT, NIL)
  }

  /**
   * Ensures there are no items selected.
   */
  open fun unselectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_UNSELECT_ALL, NIL)
  }

  enum class SelectMode(
    id: Long
  ) {
    /**
     * Only allow selecting a single item.
     */
    SELECT_SINGLE(0),

    /**
     * Allows selecting multiple items by holding Ctrl or Shift.
     */
    SELECT_MULTI(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class IconMode(
    id: Long
  ) {
    /**
     * Icon is drawn above the text.
     */
    ICON_MODE_TOP(0),

    /**
     * Icon is drawn to the left of the text.
     */
    ICON_MODE_LEFT(1);

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
     * Icon is drawn to the left of the text.
     */
    final const val ICON_MODE_LEFT: Long = 1

    /**
     * Icon is drawn above the text.
     */
    final const val ICON_MODE_TOP: Long = 0

    /**
     * Allows selecting multiple items by holding Ctrl or Shift.
     */
    final const val SELECT_MULTI: Long = 1

    /**
     * Only allow selecting a single item.
     */
    final const val SELECT_SINGLE: Long = 0
  }
}
