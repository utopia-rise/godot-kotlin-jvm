// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This control provides a vertical list of selectable items that may be in a single or in multiple
 * columns, with each item having options for text and an icon. Tooltips are supported and may be
 * different for every item in the list.
 * Selectable items in the list may be selected or deselected and multiple selection may be enabled.
 * Selection with right mouse button may also be enabled to allow use of popup context menus. Items may
 * also be "activated" by double-clicking them or by pressing [kbd]Enter[/kbd].
 * Item text only supports single-line strings. Newline characters (e.g. `\n`) in the string won't
 * produce a newline. Text wrapping is enabled in [ICON_MODE_TOP] mode, but the column's width is
 * adjusted to fully fit its content by default. You need to set [fixedColumnWidth] greater than zero
 * to wrap the text.
 * All `set_*` methods allow negative item indices, i.e. `-1` to access the last item, `-2` to
 * select the second-to-last item, and so on.
 * **Incremental search:** Like [PopupMenu] and [Tree], [ItemList] supports searching within the
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
public open class ItemList : Control() {
  /**
   * Triggered when specified item has been selected.
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by signal("index")

  /**
   * Triggered when any mouse click is issued within the rect of the list but on empty space.
   */
  public val emptyClicked: Signal2<Vector2, Long> by signal("atPosition", "mouseButtonIndex")

  /**
   * Triggered when specified list item has been clicked with any mouse button.
   * The click position is also provided to allow appropriate popup of context menus at the correct
   * location.
   */
  public val itemClicked: Signal3<Long, Vector2, Long> by signal("index", "atPosition",
      "mouseButtonIndex")

  /**
   * Triggered when a multiple selection is altered on a list allowing multiple selection.
   */
  public val multiSelected: Signal2<Long, Boolean> by signal("index", "selected")

  /**
   * Triggered when specified list item is activated via double-clicking or by pressing
   * [kbd]Enter[/kbd].
   */
  public val itemActivated: Signal1<Long> by signal("index")

  /**
   * Allows single or multiple item selection. See the [SelectMode] constants.
   */
  public final inline var selectMode: SelectMode
    @JvmName("selectModeProperty")
    get() = getSelectMode()
    @JvmName("selectModeProperty")
    set(`value`) {
      setSelectMode(value)
    }

  /**
   * If `true`, the currently selected item can be selected again.
   */
  public final inline var allowReselect: Boolean
    @JvmName("allowReselectProperty")
    get() = getAllowReselect()
    @JvmName("allowReselectProperty")
    set(`value`) {
      setAllowReselect(value)
    }

  /**
   * If `true`, right mouse button click can select items.
   */
  public final inline var allowRmbSelect: Boolean
    @JvmName("allowRmbSelectProperty")
    get() = getAllowRmbSelect()
    @JvmName("allowRmbSelectProperty")
    set(`value`) {
      setAllowRmbSelect(value)
    }

  /**
   * If `true`, allows navigating the [ItemList] with letter keys through incremental search.
   */
  public final inline var allowSearch: Boolean
    @JvmName("allowSearchProperty")
    get() = getAllowSearch()
    @JvmName("allowSearchProperty")
    set(`value`) {
      setAllowSearch(value)
    }

  /**
   * Maximum lines of text allowed in each item. Space will be reserved even when there is not
   * enough lines of text to display.
   * **Note:** This property takes effect only when [iconMode] is [ICON_MODE_TOP]. To make the text
   * wrap, [fixedColumnWidth] should be greater than zero.
   */
  public final inline var maxTextLines: Int
    @JvmName("maxTextLinesProperty")
    get() = getMaxTextLines()
    @JvmName("maxTextLinesProperty")
    set(`value`) {
      setMaxTextLines(value)
    }

  /**
   * If `true`, the control will automatically resize the height to fit its content.
   */
  public final inline var autoHeight: Boolean
    @JvmName("autoHeightProperty")
    get() = hasAutoHeight()
    @JvmName("autoHeightProperty")
    set(`value`) {
      setAutoHeight(value)
    }

  /**
   * Sets the clipping behavior when the text exceeds an item's bounding rectangle. See
   * [TextServer.OverrunBehavior] for a description of all modes.
   */
  public final inline var textOverrunBehavior: TextServer.OverrunBehavior
    @JvmName("textOverrunBehaviorProperty")
    get() = getTextOverrunBehavior()
    @JvmName("textOverrunBehaviorProperty")
    set(`value`) {
      setTextOverrunBehavior(value)
    }

  /**
   * The number of items currently in the list.
   */
  public final inline var itemCount: Int
    @JvmName("itemCountProperty")
    get() = getItemCount()
    @JvmName("itemCountProperty")
    set(`value`) {
      setItemCount(value)
    }

  /**
   * Maximum columns the list will have.
   * If greater than zero, the content will be split among the specified columns.
   * A value of zero means unlimited columns, i.e. all items will be put in the same row.
   */
  public final inline var maxColumns: Int
    @JvmName("maxColumnsProperty")
    get() = getMaxColumns()
    @JvmName("maxColumnsProperty")
    set(`value`) {
      setMaxColumns(value)
    }

  /**
   * Whether all columns will have the same width.
   * If `true`, the width is equal to the largest column width of all columns.
   */
  public final inline var sameColumnWidth: Boolean
    @JvmName("sameColumnWidthProperty")
    get() = isSameColumnWidth()
    @JvmName("sameColumnWidthProperty")
    set(`value`) {
      setSameColumnWidth(value)
    }

  /**
   * The width all columns will be adjusted to.
   * A value of zero disables the adjustment, each item will have a width equal to the width of its
   * content and the columns will have an uneven width.
   */
  public final inline var fixedColumnWidth: Int
    @JvmName("fixedColumnWidthProperty")
    get() = getFixedColumnWidth()
    @JvmName("fixedColumnWidthProperty")
    set(`value`) {
      setFixedColumnWidth(value)
    }

  /**
   * The icon position, whether above or to the left of the text. See the [IconMode] constants.
   */
  public final inline var iconMode: IconMode
    @JvmName("iconModeProperty")
    get() = getIconMode()
    @JvmName("iconModeProperty")
    set(`value`) {
      setIconMode(value)
    }

  /**
   * The scale of icon applied after [fixedIconSize] and transposing takes effect.
   */
  public final inline var iconScale: Float
    @JvmName("iconScaleProperty")
    get() = getIconScale()
    @JvmName("iconScaleProperty")
    set(`value`) {
      setIconScale(value)
    }

  /**
   * The size all icons will be adjusted to.
   * If either X or Y component is not greater than zero, icon size won't be affected.
   */
  @CoreTypeLocalCopy
  public final inline var fixedIconSize: Vector2i
    @JvmName("fixedIconSizeProperty")
    get() = getFixedIconSize()
    @JvmName("fixedIconSizeProperty")
    set(`value`) {
      setFixedIconSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ITEMLIST, scriptIndex)
  }

  /**
   * The size all icons will be adjusted to.
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
  public final fun fixedIconSizeMutate(block: Vector2i.() -> Unit): Vector2i = fixedIconSize.apply{
      block(this)
      fixedIconSize = this
  }


  /**
   * Adds an item to the item list with specified text. Returns the index of an added item.
   * Specify an [icon], or use `null` as the [icon] for a list item with no icon.
   * If selectable is `true`, the list item will be selectable.
   */
  @JvmOverloads
  public final fun addItem(
    text: String,
    icon: Texture2D? = null,
    selectable: Boolean = true,
  ): Int {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an item to the item list with no text, only an icon. Returns the index of an added item.
   */
  @JvmOverloads
  public final fun addIconItem(icon: Texture2D?, selectable: Boolean = true): Int {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  public final fun setItemText(idx: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Returns the text associated with the specified index.
   */
  public final fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets (or replaces) the icon's [Texture2D] associated with the specified index.
   */
  public final fun setItemIcon(idx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Returns the icon associated with the specified index.
   */
  public final fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets item's text base writing direction.
   */
  public final fun setItemTextDirection(idx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public final fun getItemTextDirection(idx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setItemLanguage(idx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public final fun getItemLanguage(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  public final fun setItemIconTransposed(idx: Int, transposed: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to transposed)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconTransposedPtr, NIL)
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  public final fun isItemIconTransposed(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemIconTransposedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public final fun setItemIconRegion(idx: Int, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconRegionPtr, NIL)
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public final fun getItemIconRegion(idx: Int): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets a modulating [Color] of the item associated with the specified index.
   */
  public final fun setItemIconModulate(idx: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  /**
   * Returns a [Color] modulating item's icon at the specified index.
   */
  public final fun getItemIconModulate(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  public final fun setItemSelectable(idx: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSelectablePtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  public final fun isItemSelectable(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Disables (or enables) the item at the specified index.
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking
   * or pressing [kbd]Enter[/kbd]).
   */
  public final fun setItemDisabled(idx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  public final fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  public final fun setItemMetadata(idx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value of the specified index.
   */
  public final fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the background color of the item specified by [idx] index to the specified [Color].
   */
  public final fun setItemCustomBgColor(idx: Int, customBgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomBgColorPtr, NIL)
  }

  /**
   * Returns the custom background color of the item specified by [idx] index.
   */
  public final fun getItemCustomBgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the foreground color of the item specified by [idx] index to the specified [Color].
   */
  public final fun setItemCustomFgColor(idx: Int, customFgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomFgColorPtr, NIL)
  }

  /**
   * Returns the custom foreground color of the item specified by [idx] index.
   */
  public final fun getItemCustomFgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomFgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the position and size of the item with the specified index, in the coordinate system of
   * the [ItemList] node. If [expand] is `true` the last column expands to fill the rest of the row.
   * **Note:** The returned value is unreliable if called right after modifying the [ItemList],
   * before it redraws in the next frame.
   */
  @JvmOverloads
  public final fun getItemRect(idx: Int, expand: Boolean = true): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to expand)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  public final fun setItemTooltipEnabled(idx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  public final fun isItemTooltipEnabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  public final fun setItemTooltip(idx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  public final fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Select the item at the specified index.
   * **Note:** This method does not trigger the item selection signal.
   */
  @JvmOverloads
  public final fun select(idx: Int, single: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to single)
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  public final fun deselect(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Ensures there are no items selected.
   */
  public final fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is currently selected.
   */
  public final fun isSelected(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  public final fun getSelectedItems(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedItemsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Moves item from index [fromIdx] to [toIdx].
   */
  public final fun moveItem(fromIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to fromIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveItemPtr, NIL)
  }

  public final fun setItemCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCountPtr, NIL)
  }

  public final fun getItemCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the item specified by [idx] index from the list.
   */
  public final fun removeItem(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the list.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Sorts items in the list by their text.
   */
  public final fun sortItemsByText(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sortItemsByTextPtr, NIL)
  }

  public final fun setFixedColumnWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFixedColumnWidthPtr, NIL)
  }

  public final fun getFixedColumnWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFixedColumnWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setSameColumnWidth(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSameColumnWidthPtr, NIL)
  }

  public final fun isSameColumnWidth(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSameColumnWidthPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setMaxTextLines(lines: Int): Unit {
    TransferContext.writeArguments(LONG to lines.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxTextLinesPtr, NIL)
  }

  public final fun getMaxTextLines(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxTextLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setMaxColumns(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxColumnsPtr, NIL)
  }

  public final fun getMaxColumns(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setSelectMode(mode: SelectMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectModePtr, NIL)
  }

  public final fun getSelectMode(): SelectMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectModePtr, LONG)
    return ItemList.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIconMode(mode: IconMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconModePtr, NIL)
  }

  public final fun getIconMode(): IconMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIconModePtr, LONG)
    return ItemList.IconMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFixedIconSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setFixedIconSizePtr, NIL)
  }

  public final fun getFixedIconSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFixedIconSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public final fun setIconScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setIconScalePtr, NIL)
  }

  public final fun getIconScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIconScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setAllowRmbSelect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowRmbSelectPtr, NIL)
  }

  public final fun getAllowRmbSelect(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowRmbSelectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setAllowReselect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowReselectPtr, NIL)
  }

  public final fun getAllowReselect(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowReselectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setAllowSearch(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowSearchPtr, NIL)
  }

  public final fun getAllowSearch(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowSearchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setAutoHeight(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoHeightPtr, NIL)
  }

  public final fun hasAutoHeight(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutoHeightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if one or more items are selected.
   */
  public final fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAnythingSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the item index at the given [position].
   * When there is no item at that point, -1 will be returned if [exact] is `true`, and the closest
   * item index will be returned otherwise.
   * **Note:** The returned value is unreliable if called right after modifying the [ItemList],
   * before it redraws in the next frame.
   */
  @JvmOverloads
  public final fun getItemAtPosition(position: Vector2, exact: Boolean = false): Int {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to exact)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Ensure current selection is visible, adjusting the scroll position as necessary.
   */
  public final fun ensureCurrentIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ensureCurrentIsVisiblePtr, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Forces an update to the list size based on its items. This happens automatically whenever size
   * of the items, or other relevant settings like [autoHeight], change. The method can be used to
   * trigger the update ahead of next drawing pass.
   */
  public final fun forceUpdateListSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateListSizePtr, NIL)
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
      public fun from(`value`: Long): IconMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): SelectMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "add_item", 359861678)

    public val addIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "add_icon_item", 4256579627)

    public val setItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text", 501894301)

    public val getItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text", 844755477)

    public val setItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon", 666127730)

    public val getItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon", 3536238170)

    public val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text_direction", 1707680378)

    public val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text_direction", 4235602388)

    public val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_language", 501894301)

    public val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_language", 844755477)

    public val setItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_transposed", 300928843)

    public val isItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_icon_transposed", 1116898809)

    public val setItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_region", 1356297692)

    public val getItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_region", 3327874267)

    public val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_modulate", 2878471219)

    public val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_modulate", 3457211756)

    public val setItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_selectable", 300928843)

    public val isItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_selectable", 1116898809)

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_disabled", 300928843)

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_disabled", 1116898809)

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_metadata", 2152698145)

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_metadata", 4227898402)

    public val setItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_bg_color", 2878471219)

    public val getItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_bg_color", 3457211756)

    public val setItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_fg_color", 2878471219)

    public val getItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_fg_color", 3457211756)

    public val getItemRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_rect", 159227807)

    public val setItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip_enabled", 300928843)

    public val isItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_tooltip_enabled", 1116898809)

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip", 501894301)

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_tooltip", 844755477)

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "select", 972357352)

    public val deselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "deselect", 1286410249)

    public val deselectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "deselect_all", 3218959716)

    public val isSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_selected", 1116898809)

    public val getSelectedItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_selected_items", 969006518)

    public val moveItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "move_item", 3937882851)

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_count", 1286410249)

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_count", 3905245786)

    public val removeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "remove_item", 1286410249)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "clear", 3218959716)

    public val sortItemsByTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "sort_items_by_text", 3218959716)

    public val setFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_column_width", 1286410249)

    public val getFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_column_width", 3905245786)

    public val setSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_same_column_width", 2586408642)

    public val isSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_same_column_width", 36873697)

    public val setMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_text_lines", 1286410249)

    public val getMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_text_lines", 3905245786)

    public val setMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_columns", 1286410249)

    public val getMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_columns", 3905245786)

    public val setSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_select_mode", 928267388)

    public val getSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_select_mode", 1191945842)

    public val setIconModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_icon_mode", 2025053633)

    public val getIconModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_icon_mode", 3353929232)

    public val setFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_icon_size", 1130785943)

    public val getFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_icon_size", 3690982128)

    public val setIconScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_icon_scale", 373806689)

    public val getIconScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_icon_scale", 1740695150)

    public val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_rmb_select", 2586408642)

    public val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_rmb_select", 36873697)

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_reselect", 2586408642)

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_reselect", 36873697)

    public val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_search", 2586408642)

    public val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_search", 36873697)

    public val setAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_auto_height", 2586408642)

    public val hasAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_auto_height", 36873697)

    public val isAnythingSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_anything_selected", 2240911060)

    public val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_at_position", 2300324924)

    public val ensureCurrentIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "ensure_current_is_visible", 3218959716)

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_v_scroll_bar", 2630340773)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_text_overrun_behavior", 3779142101)

    public val forceUpdateListSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "force_update_list_size", 3218959716)
  }
}
