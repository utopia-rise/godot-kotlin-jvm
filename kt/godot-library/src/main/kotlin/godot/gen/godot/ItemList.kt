// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A vertical list of selectable items with one or multiple columns.
 *
 * This control provides a vertical list of selectable items that may be in a single or in multiple columns, with each item having options for text and an icon. Tooltips are supported and may be different for every item in the list.
 *
 * Selectable items in the list may be selected or deselected and multiple selection may be enabled. Selection with right mouse button may also be enabled to allow use of popup context menus. Items may also be "activated" by double-clicking them or by pressing [kbd]Enter[/kbd].
 *
 * Item text only supports single-line strings. Newline characters (e.g. `\n`) in the string won't produce a newline. Text wrapping is enabled in [ICON_MODE_TOP] mode, but the column's width is adjusted to fully fit its content by default. You need to set [fixedColumnWidth] greater than zero to wrap the text.
 *
 * All `set_*` methods allow negative item indices, i.e. `-1` to access the last item, `-2` to select the second-to-last item, and so on.
 *
 * **Incremental search:** Like [godot.PopupMenu] and [godot.Tree], [godot.ItemList] supports searching within the list while the control is focused. Press a key that matches the first letter of an item's name to select the first item starting with the given letter. After that point, there are two ways to perform incremental search: 1) Press the same key again before the timeout duration to select the next item starting with the same letter. 2) Press letter keys that match the rest of the word before the timeout duration to match to select the item in question directly. Both of these actions will be reset to the beginning of the list if the timeout duration has passed since the last keystroke was registered. You can adjust the timeout duration by changing [godot.ProjectSettings.gui/timers/incrementalSearchMaxIntervalMsec].
 */
@GodotBaseType
public open class ItemList : Control() {
  /**
   * Triggered when specified item has been selected.
   *
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by signal("index")

  /**
   * Triggered when any mouse click is issued within the rect of the list but on empty space.
   */
  public val emptyClicked: Signal2<Vector2, Long> by signal("atPosition", "mouseButtonIndex")

  /**
   * Triggered when specified list item has been clicked with any mouse button.
   *
   * The click position is also provided to allow appropriate popup of context menus at the correct location.
   */
  public val itemClicked: Signal3<Long, Vector2, Long> by signal("index", "atPosition",
      "mouseButtonIndex")

  /**
   * Triggered when a multiple selection is altered on a list allowing multiple selection.
   */
  public val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  /**
   * Triggered when specified list item is activated via double-clicking or by pressing [kbd]Enter[/kbd].
   */
  public val itemActivated: Signal1<Long> by signal("index")

  /**
   * Allows single or multiple item selection. See the [enum SelectMode] constants.
   */
  public var selectMode: SelectMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECT_MODE, LONG)
      return ItemList.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_SELECT_MODE, NIL)
    }

  /**
   * If `true`, the currently selected item can be selected again.
   */
  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_RESELECT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_RMB_SELECT,
          NIL)
    }

  /**
   * If `true`, allows navigating the [godot.ItemList] with letter keys through incremental search.
   */
  public var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ALLOW_SEARCH, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ALLOW_SEARCH, NIL)
    }

  /**
   * Maximum lines of text allowed in each item. Space will be reserved even when there is not enough lines of text to display.
   *
   * **Note:** This property takes effect only when [iconMode] is [ICON_MODE_TOP]. To make the text wrap, [fixedColumnWidth] should be greater than zero.
   */
  public var maxTextLines: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_TEXT_LINES, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_MAX_TEXT_LINES, NIL)
    }

  /**
   * If `true`, the control will automatically resize the height to fit its content.
   */
  public var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_HAS_AUTO_HEIGHT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_AUTO_HEIGHT, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds an item's bounding rectangle. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_TEXT_OVERRUN_BEHAVIOR, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_TEXT_OVERRUN_BEHAVIOR, NIL)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_COUNT, NIL)
    }

  /**
   * Maximum columns the list will have.
   *
   * If greater than zero, the content will be split among the specified columns.
   *
   * A value of zero means unlimited columns, i.e. all items will be put in the same row.
   */
  public var maxColumns: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_MAX_COLUMNS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
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
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
  public var fixedColumnWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_COLUMN_WIDTH,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_COLUMN_WIDTH,
          NIL)
    }

  /**
   * The icon position, whether above or to the left of the text. See the [enum IconMode] constants.
   */
  public var iconMode: IconMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_MODE, LONG)
      return ItemList.IconMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_MODE, NIL)
    }

  /**
   * The scale of icon applied after [fixedIconSize] and transposing takes effect.
   */
  public var iconScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ICON_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ICON_SCALE, NIL)
    }

  /**
   * The size all icons will be adjusted to.
   *
   * If either X or Y component is not greater than zero, icon size won't be affected.
   */
  public var fixedIconSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_FIXED_ICON_SIZE,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_FIXED_ICON_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ITEMLIST, scriptIndex)
    return true
  }

  /**
   * The size all icons will be adjusted to.
   *
   * If either X or Y component is not greater than zero, icon size won't be affected.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = itemlist.fixedIconSize
   * //Your changes
   * itemlist.fixedIconSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fixedIconSize(block: Vector2i.() -> Unit): Vector2i = fixedIconSize.apply{
      block(this)
      fixedIconSize = this
  }


  /**
   * Adds an item to the item list with specified text. Returns the index of an added item.
   *
   * Specify an [icon], or use `null` as the [icon] for a list item with no icon.
   *
   * If selectable is `true`, the list item will be selectable.
   */
  @JvmOverloads
  public fun addItem(
    text: String,
    icon: Texture2D? = null,
    selectable: Boolean = true,
  ): Int {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ITEM, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an item to the item list with no text, only an icon. Returns the index of an added item.
   */
  @JvmOverloads
  public fun addIconItem(icon: Texture2D, selectable: Boolean = true): Int {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_ADD_ICON_ITEM, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  public fun setItemText(idx: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT, NIL)
  }

  /**
   * Returns the text associated with the specified index.
   */
  public fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets (or replaces) the icon's [godot.Texture2D] associated with the specified index.
   */
  public fun setItemIcon(idx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON, NIL)
  }

  /**
   * Returns the icon associated with the specified index.
   */
  public fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(idx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TEXT_DIRECTION,
        NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(idx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TEXT_DIRECTION,
        LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setItemLanguage(idx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_LANGUAGE, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_LANGUAGE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  public fun setItemIconTransposed(idx: Int, transposed: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to transposed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_TRANSPOSED,
        NIL)
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  public fun isItemIconTransposed(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_ICON_TRANSPOSED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun setItemIconRegion(idx: Int, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_REGION, NIL)
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun getItemIconRegion(idx: Int): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_REGION,
        RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets a modulating [godot.core.Color] of the item associated with the specified index.
   */
  public fun setItemIconModulate(idx: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_ICON_MODULATE,
        NIL)
  }

  /**
   * Returns a [godot.core.Color] modulating item's icon at the specified index.
   */
  public fun getItemIconModulate(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_ICON_MODULATE,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  public fun setItemSelectable(idx: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_SELECTABLE, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  public fun isItemSelectable(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_SELECTABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Disables (or enables) the item at the specified index.
   *
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking or pressing [kbd]Enter[/kbd]).
   */
  public fun setItemDisabled(idx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  public fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_DISABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  public fun setItemMetadata(idx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_METADATA, NIL)
  }

  /**
   * Returns the metadata value of the specified index.
   */
  public fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_METADATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the background color of the item specified by [idx] index to the specified [godot.core.Color].
   */
  public fun setItemCustomBgColor(idx: Int, customBgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_BG_COLOR,
        NIL)
  }

  /**
   * Returns the custom background color of the item specified by [idx] index.
   */
  public fun getItemCustomBgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_BG_COLOR,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the foreground color of the item specified by [idx] index to the specified [godot.core.Color].
   */
  public fun setItemCustomFgColor(idx: Int, customFgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_CUSTOM_FG_COLOR,
        NIL)
  }

  /**
   * Returns the custom foreground color of the item specified by [idx] index.
   */
  public fun getItemCustomFgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_CUSTOM_FG_COLOR,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the position and size of the item with the specified index, in the coordinate system of the [godot.ItemList] node. If [expand] is `true` the last column expands to fill the rest of the row.
   *
   * **Note:** The returned value is unreliable if called right after modifying the [godot.ItemList], before it redraws in the next frame.
   */
  @JvmOverloads
  public fun getItemRect(idx: Int, expand: Boolean = true): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to expand)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  public fun setItemTooltipEnabled(idx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP_ENABLED,
        NIL)
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  public fun isItemTooltipEnabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_ITEM_TOOLTIP_ENABLED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  public fun setItemTooltip(idx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  public fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_TOOLTIP, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Select the item at the specified index.
   *
   * **Note:** This method does not trigger the item selection signal.
   */
  @JvmOverloads
  public fun select(idx: Int, single: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to single)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_SELECT, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  public fun deselect(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
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
  public fun isSelected(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_IS_SELECTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  public fun getSelectedItems(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_SELECTED_ITEMS,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Moves item from index [fromIdx] to [toIdx].
   */
  public fun moveItem(fromIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to fromIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_MOVE_ITEM, NIL)
  }

  /**
   * Removes the item specified by [idx] index from the list.
   */
  public fun removeItem(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
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
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the item index at the given [position].
   *
   * When there is no item at that point, -1 will be returned if [exact] is `true`, and the closest item index will be returned otherwise.
   *
   * **Note:** The returned value is unreliable if called right after modifying the [godot.ItemList], before it redraws in the next frame.
   */
  @JvmOverloads
  public fun getItemAtPosition(position: Vector2, exact: Boolean = false): Int {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ITEMLIST_GET_ITEM_AT_POSITION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public enum class IconMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SelectMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
