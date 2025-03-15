// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
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
   * Emitted when specified item has been selected. Only applicable in single selection mode.
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by Signal1

  /**
   * Emitted when any mouse click is issued within the rect of the list but on empty space.
   * [atPosition] is the click position in this control's local coordinate system.
   */
  public val emptyClicked: Signal2<Vector2, Long> by Signal2

  /**
   * Emitted when specified list item has been clicked with any mouse button.
   * [atPosition] is the click position in this control's local coordinate system.
   */
  public val itemClicked: Signal3<Long, Vector2, Long> by Signal3

  /**
   * Emitted when a multiple selection is altered on a list allowing multiple selection.
   */
  public val multiSelected: Signal2<Long, Boolean> by Signal2

  /**
   * Emitted when specified list item is activated via double-clicking or by pressing
   * [kbd]Enter[/kbd].
   */
  public val itemActivated: Signal1<Long> by Signal1

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
   * If `true`, the control will automatically resize the width to fit its content.
   */
  public final inline var autoWidth: Boolean
    @JvmName("autoWidthProperty")
    get() = hasAutoWidth()
    @JvmName("autoWidthProperty")
    set(`value`) {
      setAutoWidth(value)
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
   * If `true`, the control will automatically move items into a new row to fit its content. See
   * also [HFlowContainer] for this behavior.
   * If `false`, the control will add a horizontal scrollbar to make all items visible.
   */
  public final inline var wraparoundItems: Boolean
    @JvmName("wraparoundItemsProperty")
    get() = hasWraparoundItems()
    @JvmName("wraparoundItemsProperty")
    set(`value`) {
      setWraparoundItems(value)
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
    createNativeObject(312, scriptIndex)
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
   * If [selectable] is `true`, the list item will be selectable.
   */
  @JvmOverloads
  public final fun addItem(
    text: String,
    icon: Texture2D? = null,
    selectable: Boolean = true,
  ): Int {
    TransferContext.writeArguments(STRING to text, OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(ptr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds an item to the item list with no text, only an icon. Returns the index of an added item.
   */
  @JvmOverloads
  public final fun addIconItem(icon: Texture2D?, selectable: Boolean = true): Int {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(ptr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  public final fun setItemText(idx: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Returns the text associated with the specified index.
   */
  public final fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets (or replaces) the icon's [Texture2D] associated with the specified index.
   */
  public final fun setItemIcon(idx: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Returns the icon associated with the specified index.
   */
  public final fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets item's text base writing direction.
   */
  public final fun setItemTextDirection(idx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public final fun getItemTextDirection(idx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setItemLanguage(idx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setItemLanguagePtr, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public final fun getItemLanguage(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the auto translate mode of the item associated with the specified index.
   * Items use [Node.AUTO_TRANSLATE_MODE_INHERIT] by default, which uses the same auto translate
   * mode as the [ItemList] itself.
   */
  public final fun setItemAutoTranslateMode(idx: Int, mode: Node.AutoTranslateMode): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setItemAutoTranslateModePtr, NIL)
  }

  /**
   * Returns item's auto translate mode.
   */
  public final fun getItemAutoTranslateMode(idx: Int): Node.AutoTranslateMode {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemAutoTranslateModePtr, LONG)
    return Node.AutoTranslateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  public final fun setItemIconTransposed(idx: Int, transposed: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to transposed)
    TransferContext.callMethod(ptr, MethodBindings.setItemIconTransposedPtr, NIL)
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  public final fun isItemIconTransposed(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemIconTransposedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public final fun setItemIconRegion(idx: Int, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.setItemIconRegionPtr, NIL)
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public final fun getItemIconRegion(idx: Int): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Sets a modulating [Color] of the item associated with the specified index.
   */
  public final fun setItemIconModulate(idx: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  /**
   * Returns a [Color] modulating item's icon at the specified index.
   */
  public final fun getItemIconModulate(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  public final fun setItemSelectable(idx: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to selectable)
    TransferContext.callMethod(ptr, MethodBindings.setItemSelectablePtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  public final fun isItemSelectable(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Disables (or enables) the item at the specified index.
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking
   * or pressing [kbd]Enter[/kbd]).
   */
  public final fun setItemDisabled(idx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  public final fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  public final fun setItemMetadata(idx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(ptr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value of the specified index.
   */
  public final fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets the background color of the item specified by [idx] index to the specified [Color].
   */
  public final fun setItemCustomBgColor(idx: Int, customBgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customBgColor)
    TransferContext.callMethod(ptr, MethodBindings.setItemCustomBgColorPtr, NIL)
  }

  /**
   * Returns the custom background color of the item specified by [idx] index.
   */
  public final fun getItemCustomBgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the foreground color of the item specified by [idx] index to the specified [Color].
   */
  public final fun setItemCustomFgColor(idx: Int, customFgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customFgColor)
    TransferContext.callMethod(ptr, MethodBindings.setItemCustomFgColorPtr, NIL)
  }

  /**
   * Returns the custom foreground color of the item specified by [idx] index.
   */
  public final fun getItemCustomFgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemCustomFgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
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
    TransferContext.callMethod(ptr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  public final fun setItemTooltipEnabled(idx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setItemTooltipEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  public final fun isItemTooltipEnabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  public final fun setItemTooltip(idx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  public final fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Select the item at the specified index.
   * **Note:** This method does not trigger the item selection signal.
   */
  @JvmOverloads
  public final fun select(idx: Int, single: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to single)
    TransferContext.callMethod(ptr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  public final fun deselect(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Ensures there are no items selected.
   */
  public final fun deselectAll(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is currently selected.
   */
  public final fun isSelected(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  public final fun getSelectedItems(): PackedInt32Array {
    TransferContext.callMethod(ptr, MethodBindings.getSelectedItemsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Moves item from index [fromIdx] to [toIdx].
   */
  public final fun moveItem(fromIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to fromIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveItemPtr, NIL)
  }

  public final fun setItemCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemCountPtr, NIL)
  }

  public final fun getItemCount(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the item specified by [idx] index from the list.
   */
  public final fun removeItem(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the list.
   */
  public final fun clear(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Sorts items in the list by their text.
   */
  public final fun sortItemsByText(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.sortItemsByTextPtr, NIL)
  }

  public final fun setFixedColumnWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFixedColumnWidthPtr, NIL)
  }

  public final fun getFixedColumnWidth(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getFixedColumnWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSameColumnWidth(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSameColumnWidthPtr, NIL)
  }

  public final fun isSameColumnWidth(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isSameColumnWidthPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaxTextLines(lines: Int): Unit {
    TransferContext.writeArguments(LONG to lines.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxTextLinesPtr, NIL)
  }

  public final fun getMaxTextLines(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getMaxTextLinesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxColumns(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxColumnsPtr, NIL)
  }

  public final fun getMaxColumns(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getMaxColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSelectMode(mode: SelectMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSelectModePtr, NIL)
  }

  public final fun getSelectMode(): SelectMode {
    TransferContext.callMethod(ptr, MethodBindings.getSelectModePtr, LONG)
    return ItemList.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIconMode(mode: IconMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setIconModePtr, NIL)
  }

  public final fun getIconMode(): IconMode {
    TransferContext.callMethod(ptr, MethodBindings.getIconModePtr, LONG)
    return ItemList.IconMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFixedIconSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setFixedIconSizePtr, NIL)
  }

  public final fun getFixedIconSize(): Vector2i {
    TransferContext.callMethod(ptr, MethodBindings.getFixedIconSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setIconScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setIconScalePtr, NIL)
  }

  public final fun getIconScale(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getIconScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAllowRmbSelect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowRmbSelectPtr, NIL)
  }

  public final fun getAllowRmbSelect(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getAllowRmbSelectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowReselect(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowReselectPtr, NIL)
  }

  public final fun getAllowReselect(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getAllowReselectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowSearch(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowSearchPtr, NIL)
  }

  public final fun getAllowSearch(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getAllowSearchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoWidth(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoWidthPtr, NIL)
  }

  public final fun hasAutoWidth(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.hasAutoWidthPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoHeight(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoHeightPtr, NIL)
  }

  public final fun hasAutoHeight(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.hasAutoHeightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if one or more items are selected.
   */
  public final fun isAnythingSelected(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isAnythingSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    TransferContext.callMethod(ptr, MethodBindings.getItemAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Ensure current selection is visible, adjusting the scroll position as necessary.
   */
  public final fun ensureCurrentIsVisible(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.ensureCurrentIsVisiblePtr, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getVScrollBar(): VScrollBar? {
    TransferContext.callMethod(ptr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as VScrollBar?)
  }

  /**
   * Returns the horizontal scrollbar.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getHScrollBar(): HScrollBar? {
    TransferContext.callMethod(ptr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HScrollBar?)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.callMethod(ptr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setWraparoundItems(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setWraparoundItemsPtr, NIL)
  }

  public final fun hasWraparoundItems(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.hasWraparoundItemsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces an update to the list size based on its items. This happens automatically whenever size
   * of the items, or other relevant settings like [autoHeight], change. The method can be used to
   * trigger the update ahead of next drawing pass.
   */
  public final fun forceUpdateListSize(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.forceUpdateListSizePtr, NIL)
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
    /**
     * Allows selecting multiple items by toggling them on and off.
     */
    SELECT_TOGGLE(2),
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

  public object MethodBindings {
    internal val addItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "add_item", 359861678)

    internal val addIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "add_icon_item", 4256579627)

    internal val setItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text", 501894301)

    internal val getItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text", 844755477)

    internal val setItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon", 666127730)

    internal val getItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon", 3536238170)

    internal val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text_direction", 1707680378)

    internal val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text_direction", 4235602388)

    internal val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_language", 501894301)

    internal val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_language", 844755477)

    internal val setItemAutoTranslateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_auto_translate_mode", 287402019)

    internal val getItemAutoTranslateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_auto_translate_mode", 906302372)

    internal val setItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_transposed", 300928843)

    internal val isItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_icon_transposed", 1116898809)

    internal val setItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_region", 1356297692)

    internal val getItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_region", 3327874267)

    internal val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_modulate", 2878471219)

    internal val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_modulate", 3457211756)

    internal val setItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_selectable", 300928843)

    internal val isItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_selectable", 1116898809)

    internal val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_disabled", 300928843)

    internal val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_disabled", 1116898809)

    internal val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_metadata", 2152698145)

    internal val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_metadata", 4227898402)

    internal val setItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_bg_color", 2878471219)

    internal val getItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_bg_color", 3457211756)

    internal val setItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_fg_color", 2878471219)

    internal val getItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_fg_color", 3457211756)

    internal val getItemRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_rect", 159227807)

    internal val setItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip_enabled", 300928843)

    internal val isItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_tooltip_enabled", 1116898809)

    internal val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip", 501894301)

    internal val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_tooltip", 844755477)

    internal val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "select", 972357352)

    internal val deselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "deselect", 1286410249)

    internal val deselectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "deselect_all", 3218959716)

    internal val isSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_selected", 1116898809)

    internal val getSelectedItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_selected_items", 969006518)

    internal val moveItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "move_item", 3937882851)

    internal val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_count", 1286410249)

    internal val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_count", 3905245786)

    internal val removeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "remove_item", 1286410249)

    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "clear", 3218959716)

    internal val sortItemsByTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "sort_items_by_text", 3218959716)

    internal val setFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_column_width", 1286410249)

    internal val getFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_column_width", 3905245786)

    internal val setSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_same_column_width", 2586408642)

    internal val isSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_same_column_width", 36873697)

    internal val setMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_text_lines", 1286410249)

    internal val getMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_text_lines", 3905245786)

    internal val setMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_columns", 1286410249)

    internal val getMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_columns", 3905245786)

    internal val setSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_select_mode", 928267388)

    internal val getSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_select_mode", 1191945842)

    internal val setIconModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_icon_mode", 2025053633)

    internal val getIconModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_icon_mode", 3353929232)

    internal val setFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_icon_size", 1130785943)

    internal val getFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_icon_size", 3690982128)

    internal val setIconScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_icon_scale", 373806689)

    internal val getIconScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_icon_scale", 1740695150)

    internal val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_rmb_select", 2586408642)

    internal val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_rmb_select", 36873697)

    internal val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_reselect", 2586408642)

    internal val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_reselect", 36873697)

    internal val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_search", 2586408642)

    internal val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_search", 36873697)

    internal val setAutoWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_auto_width", 2586408642)

    internal val hasAutoWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_auto_width", 36873697)

    internal val setAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_auto_height", 2586408642)

    internal val hasAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_auto_height", 36873697)

    internal val isAnythingSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_anything_selected", 2240911060)

    internal val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_at_position", 2300324924)

    internal val ensureCurrentIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "ensure_current_is_visible", 3218959716)

    internal val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_v_scroll_bar", 2630340773)

    internal val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_h_scroll_bar", 4004517983)

    internal val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_text_overrun_behavior", 1008890932)

    internal val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_text_overrun_behavior", 3779142101)

    internal val setWraparoundItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_wraparound_items", 2586408642)

    internal val hasWraparoundItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_wraparound_items", 36873697)

    internal val forceUpdateListSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "force_update_list_size", 3218959716)
  }
}
