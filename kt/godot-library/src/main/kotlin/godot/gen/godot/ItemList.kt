// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Control that provides a list of selectable items (and/or icons) in a single column, or optionally in multiple columns.
 *
 * This control provides a selectable list of items that may be in a single (or multiple columns) with option of text, icons, or both text and icon. Tooltips are supported and may be different for every item in the list.
 *
 * Selectable items in the list may be selected or deselected and multiple selection may be enabled. Selection with right mouse button may also be enabled to allow use of popup context menus. Items may also be "activated" by double-clicking them or by pressing [kbd]Enter[/kbd].
 *
 * Item text only supports single-line strings, newline characters (e.g. `\n`) in the string won't produce a newline. Text wrapping is enabled in [ICON_MODE_TOP] mode, but column's width is adjusted to fully fit its content by default. You need to set [fixedColumnWidth] greater than zero to wrap the text.
 *
 * All `set_*` methods allow negative item index, which makes the item accessed from the last one.
 */
@GodotBaseType
public open class ItemList : Control() {
  /**
   * Triggered when specified list item is activated via double-clicking or by pressing [kbd]Enter[/kbd].
   */
  public val itemActivated: Signal1<Long> by signal("index")

  /**
   * Triggered when a multiple selection is altered on a list allowing multiple selection.
   */
  public val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  public val nothingSelected: Signal0 by signal()

  public val rmbClicked: Signal1<Vector2> by signal("atPosition")

  public val itemRmbSelected: Signal2<Long, Vector2> by signal("index", "atPosition")

  /**
   * Triggered when specified item has been selected.
   *
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by signal("index")

  /**
   * Allows single or multiple item selection. See the [enum SelectMode] constants.
   */
  public var selectMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SELECT_MODE, NIL)
    }

  /**
   * If `true`, the currently selected item can be selected again.
   */
  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RESELECT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RESELECT, NIL)
    }

  /**
   * If `true`, right mouse button click can select items.
   */
  public var allowRmbSelect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RMB_SELECT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RMB_SELECT,
          NIL)
    }

  /**
   * Maximum lines of text allowed in each item. Space will be reserved even when there is not enough lines of text to display.
   *
   * **Note:** This property takes effect only when [iconMode] is [ICON_MODE_TOP]. To make the text wrap, [fixedColumnWidth] should be greater than zero.
   */
  public var maxTextLines: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_TEXT_LINES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_TEXT_LINES, NIL)
    }

  /**
   * If `true`, the control will automatically resize the height to fit its content.
   */
  public var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_HAS_AUTO_HEIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_AUTO_HEIGHT, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds an item's bounding rectangle. See [enum TextParagraph.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_TEXT_OVERRUN_BEHAVIOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_TEXT_OVERRUN_BEHAVIOR, NIL)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_COUNT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_COUNT, NIL)
    }

  /**
   * Maximum columns the list will have.
   *
   * If greater than zero, the content will be split among the specified columns.
   *
   * A value of zero means unlimited columns, i.e. all items will be put in the same row.
   */
  public var maxColumns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_COLUMNS, NIL)
    }

  /**
   * Whether all columns will have the same width.
   *
   * If `true`, the width is equal to the largest column width of all columns.
   */
  public var sameColumnWidth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_SAME_COLUMN_WIDTH,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SAME_COLUMN_WIDTH,
          NIL)
    }

  /**
   * The width all columns will be adjusted to.
   *
   * A value of zero disables the adjustment, each item will have a width equal to the width of its content and the columns will have an uneven width.
   */
  public var fixedColumnWidth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_COLUMN_WIDTH,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_COLUMN_WIDTH,
          NIL)
    }

  /**
   * The icon position, whether above or to the left of the text. See the [enum IconMode] constants.
   */
  public var iconMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_MODE, NIL)
    }

  /**
   * The scale of icon applied after [fixedIconSize] and transposing takes effect.
   */
  public var iconScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_SCALE, NIL)
    }

  /**
   * The size all icons will be adjusted to.
   *
   * If either X or Y component is not greater than zero, icon size won't be affected.
   */
  public var fixedIconSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_ICON_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_ICON_SIZE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ITEMLIST)
  }

  /**
   * Adds an item to the item list with specified text. Returns the index of an added item.
   *
   * Specify an `icon`, or use `null` as the `icon` for a list item with no icon.
   *
   * If selectable is `true`, the list item will be selectable.
   */
  public fun addItem(
    text: String,
    icon: Texture2D? = null,
    selectable: Boolean = true
  ): Long {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds an item to the item list with no text, only an icon. Returns the index of an added item.
   */
  public fun addIconItem(icon: Texture2D, selectable: Boolean = true): Long {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ICON_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  public fun setItemText(idx: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT, NIL)
  }

  /**
   * Returns the text associated with the specified index.
   */
  public fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets (or replaces) the icon's [godot.Texture2D] associated with the specified index.
   */
  public fun setItemIcon(idx: Long, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON, NIL)
  }

  /**
   * Returns the icon associated with the specified index.
   */
  public fun getItemIcon(idx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(idx: Long, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to idx, LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT_DIRECTION,
        NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(idx: Long): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT_DIRECTION,
        LONG)
    return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets OpenType feature `tag` for the item's text. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public fun setItemOpentypeFeature(
    idx: Long,
    tag: String,
    `value`: Long
  ): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to tag, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_OPENTYPE_FEATURE,
        NIL)
  }

  /**
   * Returns OpenType feature `tag` of the item's text.
   */
  public fun getItemOpentypeFeature(idx: Long, tag: String): Long {
    TransferContext.writeArguments(LONG to idx, STRING to tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_OPENTYPE_FEATURE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all OpenType features from the item's text.
   */
  public fun clearItemOpentypeFeatures(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ITEMLIST_CLEAR_ITEM_OPENTYPE_FEATURES, NIL)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setItemLanguage(idx: Long, language: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_LANGUAGE, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_LANGUAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  public fun setItemIconTransposed(idx: Long, transposed: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to transposed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_TRANSPOSED,
        NIL)
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  public fun isItemIconTransposed(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_ICON_TRANSPOSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun setItemIconRegion(idx: Long, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to idx, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_REGION, NIL)
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun getItemIconRegion(idx: Long): Rect2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_REGION,
        RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Sets a modulating [godot.core.Color] of the item associated with the specified index.
   */
  public fun setItemIconModulate(idx: Long, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_MODULATE,
        NIL)
  }

  /**
   * Returns a [godot.core.Color] modulating item's icon at the specified index.
   */
  public fun getItemIconModulate(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_MODULATE,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  public fun setItemSelectable(idx: Long, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_SELECTABLE, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  public fun isItemSelectable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_SELECTABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Disables (or enables) the item at the specified index.
   *
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking or pressing [kbd]Enter[/kbd]).
   */
  public fun setItemDisabled(idx: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  public fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  public fun setItemMetadata(idx: Long, metadata: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_METADATA, NIL)
  }

  /**
   * Returns the metadata value of the specified index.
   */
  public fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the background color of the item specified by `idx` index to the specified [godot.core.Color].
   */
  public fun setItemCustomBgColor(idx: Long, customBgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_BG_COLOR,
        NIL)
  }

  /**
   * Returns the custom background color of the item specified by `idx` index.
   */
  public fun getItemCustomBgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_BG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the foreground color of the item specified by `idx` index to the specified [godot.core.Color].
   */
  public fun setItemCustomFgColor(idx: Long, customFgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_FG_COLOR,
        NIL)
  }

  /**
   * Returns the custom foreground color of the item specified by `idx` index.
   */
  public fun getItemCustomFgColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_FG_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  public fun setItemTooltipEnabled(idx: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP_ENABLED,
        NIL)
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  public fun isItemTooltipEnabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_TOOLTIP_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  public fun setItemTooltip(idx: Long, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  public fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Select the item at the specified index.
   *
   * **Note:** This method does not trigger the item selection signal.
   */
  public fun select(idx: Long, single: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to single)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SELECT, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  public fun deselect(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_DESELECT, NIL)
  }

  /**
   * Ensures there are no items selected.
   */
  public fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_DESELECT_ALL, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is currently selected.
   */
  public fun isSelected(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  public fun getSelectedItems(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECTED_ITEMS,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Moves item from index `from_idx` to `to_idx`.
   */
  public fun moveItem(fromIdx: Long, toIdx: Long): Unit {
    TransferContext.writeArguments(LONG to fromIdx, LONG to toIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_MOVE_ITEM, NIL)
  }

  /**
   * Removes the item specified by `idx` index from the list.
   */
  public fun removeItem(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_REMOVE_ITEM, NIL)
  }

  /**
   * Removes all items from the list.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_CLEAR, NIL)
  }

  /**
   * Sorts items in the list by their text.
   */
  public fun sortItemsByText(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SORT_ITEMS_BY_TEXT, NIL)
  }

  /**
   * Returns `true` if one or more items are selected.
   */
  public fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ANYTHING_SELECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the item index at the given `position`.
   *
   * When there is no item at that point, -1 will be returned if `exact` is `true`, and the closest item index will be returned otherwise.
   */
  public fun getItemAtPosition(position: Vector2, exact: Boolean = false): Long {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_AT_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Ensure current selection is visible, adjusting the scroll position as necessary.
   */
  public fun ensureCurrentIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ENSURE_CURRENT_IS_VISIBLE,
        NIL)
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_V_SCROLL_BAR, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  public enum class SelectMode(
    id: Long
  ) {
    /**
     * Only allow selecting a single item.
     */
    SELECT_SINGLE(0),
    /**
     * Allows selecting multiple items by holding [kbd]Ctrl[/kbd] or [kbd]Shift[/kbd].
     */
    SELECT_MULTI(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class IconMode(
    id: Long
  ) {
    /**
     * Icon is drawn above the text.
     */
    ICON_MODE_TOP(0),
    /**
     * Icon is drawn to the left of the text.
     */
    ICON_MODE_LEFT(1),
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
