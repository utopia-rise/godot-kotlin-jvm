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
      TransferContext.callMethod(rawPtr, MethodBindings.getSelectModePtr, LONG)
      return ItemList.SelectMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectModePtr, NIL)
    }

  /**
   * If `true`, the currently selected item can be selected again.
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
   * If `true`, right mouse button click can select items.
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
   * If `true`, allows navigating the [godot.ItemList] with letter keys through incremental search.
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
   * Maximum lines of text allowed in each item. Space will be reserved even when there is not enough lines of text to display.
   *
   * **Note:** This property takes effect only when [iconMode] is [ICON_MODE_TOP]. To make the text wrap, [fixedColumnWidth] should be greater than zero.
   */
  public var maxTextLines: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxTextLinesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxTextLinesPtr, NIL)
    }

  /**
   * If `true`, the control will automatically resize the height to fit its content.
   */
  public var autoHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutoHeightPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoHeightPtr, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds an item's bounding rectangle. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setItemCountPtr, NIL)
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
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxColumnsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxColumnsPtr, NIL)
    }

  /**
   * Whether all columns will have the same width.
   *
   * If `true`, the width is equal to the largest column width of all columns.
   */
  public var sameColumnWidth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSameColumnWidthPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSameColumnWidthPtr, NIL)
    }

  /**
   * The width all columns will be adjusted to.
   *
   * A value of zero disables the adjustment, each item will have a width equal to the width of its content and the columns will have an uneven width.
   */
  public var fixedColumnWidth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedColumnWidthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedColumnWidthPtr, NIL)
    }

  /**
   * The icon position, whether above or to the left of the text. See the [enum IconMode] constants.
   */
  public var iconMode: IconMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconModePtr, LONG)
      return ItemList.IconMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setIconModePtr, NIL)
    }

  /**
   * The scale of icon applied after [fixedIconSize] and transposing takes effect.
   */
  public var iconScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setIconScalePtr, NIL)
    }

  /**
   * The size all icons will be adjusted to.
   *
   * If either X or Y component is not greater than zero, icon size won't be affected.
   */
  @CoreTypeLocalCopy
  public var fixedIconSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFixedIconSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFixedIconSizePtr, NIL)
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
  public open fun fixedIconSizeMutate(block: Vector2i.() -> Unit): Vector2i = fixedIconSize.apply{
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
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an item to the item list with no text, only an icon. Returns the index of an added item.
   */
  @JvmOverloads
  public fun addIconItem(icon: Texture2D, selectable: Boolean = true): Int {
    TransferContext.writeArguments(OBJECT to icon, BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets text of the item associated with the specified index.
   */
  public fun setItemText(idx: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Returns the text associated with the specified index.
   */
  public fun getItemText(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets (or replaces) the icon's [godot.Texture2D] associated with the specified index.
   */
  public fun setItemIcon(idx: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Returns the icon associated with the specified index.
   */
  public fun getItemIcon(idx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(idx: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(idx: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setItemLanguage(idx: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets whether the item icon will be drawn transposed.
   */
  public fun setItemIconTransposed(idx: Int, transposed: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to transposed)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconTransposedPtr, NIL)
  }

  /**
   * Returns `true` if the item icon will be drawn transposed, i.e. the X and Y axes are swapped.
   */
  public fun isItemIconTransposed(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemIconTransposedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun setItemIconRegion(idx: Int, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconRegionPtr, NIL)
  }

  /**
   * Returns the region of item's icon used. The whole icon will be used if the region has no area.
   */
  public fun getItemIconRegion(idx: Int): Rect2 {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets a modulating [godot.core.Color] of the item associated with the specified index.
   */
  public fun setItemIconModulate(idx: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  /**
   * Returns a [godot.core.Color] modulating item's icon at the specified index.
   */
  public fun getItemIconModulate(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Allows or disallows selection of the item associated with the specified index.
   */
  public fun setItemSelectable(idx: Int, selectable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSelectablePtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is selectable.
   */
  public fun isItemSelectable(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Disables (or enables) the item at the specified index.
   *
   * Disabled items cannot be selected and do not trigger activation signals (when double-clicking or pressing [kbd]Enter[/kbd]).
   */
  public fun setItemDisabled(idx: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is disabled.
   */
  public fun isItemDisabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a value (of any type) to be stored with the item associated with the specified index.
   */
  public fun setItemMetadata(idx: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Returns the metadata value of the specified index.
   */
  public fun getItemMetadata(idx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the background color of the item specified by [idx] index to the specified [godot.core.Color].
   */
  public fun setItemCustomBgColor(idx: Int, customBgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customBgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomBgColorPtr, NIL)
  }

  /**
   * Returns the custom background color of the item specified by [idx] index.
   */
  public fun getItemCustomBgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Sets the foreground color of the item specified by [idx] index to the specified [godot.core.Color].
   */
  public fun setItemCustomFgColor(idx: Int, customFgColor: Color): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), COLOR to customFgColor)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCustomFgColorPtr, NIL)
  }

  /**
   * Returns the custom foreground color of the item specified by [idx] index.
   */
  public fun getItemCustomFgColor(idx: Int): Color {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCustomFgColorPtr, COLOR)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getItemRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets whether the tooltip hint is enabled for specified item index.
   */
  public fun setItemTooltipEnabled(idx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the tooltip is enabled for specified item index.
   */
  public fun isItemTooltipEnabled(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the tooltip hint for the item associated with the specified index.
   */
  public fun setItemTooltip(idx: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Returns the tooltip hint associated with the specified index.
   */
  public fun getItemTooltip(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
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
    TransferContext.callMethod(rawPtr, MethodBindings.selectPtr, NIL)
  }

  /**
   * Ensures the item associated with the specified index is not selected.
   */
  public fun deselect(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * Ensures there are no items selected.
   */
  public fun deselectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectAllPtr, NIL)
  }

  /**
   * Returns `true` if the item at the specified index is currently selected.
   */
  public fun isSelected(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array with the indexes of the selected items.
   */
  public fun getSelectedItems(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedItemsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Moves item from index [fromIdx] to [toIdx].
   */
  public fun moveItem(fromIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to fromIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveItemPtr, NIL)
  }

  /**
   * Removes the item specified by [idx] index from the list.
   */
  public fun removeItem(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the list.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Sorts items in the list by their text.
   */
  public fun sortItemsByText(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sortItemsByTextPtr, NIL)
  }

  /**
   * Returns `true` if one or more items are selected.
   */
  public fun isAnythingSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAnythingSelectedPtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAtPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Ensure current selection is visible, adjusting the scroll position as necessary.
   */
  public fun ensureCurrentIsVisible(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.ensureCurrentIsVisiblePtr, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
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

  internal object MethodBindings {
    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "add_item")

    public val addIconItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "add_icon_item")

    public val setItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_text")

    public val getItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_text")

    public val setItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_icon")

    public val getItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_icon")

    public val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_text_direction")

    public val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_text_direction")

    public val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_language")

    public val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_language")

    public val setItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_transposed")

    public val isItemIconTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_icon_transposed")

    public val setItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_region")

    public val getItemIconRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_region")

    public val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_icon_modulate")

    public val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_icon_modulate")

    public val setItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_selectable")

    public val isItemSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_selectable")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_disabled")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_disabled")

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_metadata")

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_metadata")

    public val setItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_bg_color")

    public val getItemCustomBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_bg_color")

    public val setItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_custom_fg_color")

    public val getItemCustomFgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_custom_fg_color")

    public val getItemRectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_rect")

    public val setItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip_enabled")

    public val isItemTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_item_tooltip_enabled")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_item_tooltip")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_tooltip")

    public val selectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "select")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "deselect")

    public val deselectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "deselect_all")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "is_selected")

    public val getSelectedItemsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_selected_items")

    public val moveItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "move_item")

    public val setItemCountPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_item_count")

    public val getItemCountPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_item_count")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "remove_item")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "clear")

    public val sortItemsByTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "sort_items_by_text")

    public val setFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_column_width")

    public val getFixedColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_column_width")

    public val setSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_same_column_width")

    public val isSameColumnWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_same_column_width")

    public val setMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_text_lines")

    public val getMaxTextLinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_text_lines")

    public val setMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_max_columns")

    public val getMaxColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_max_columns")

    public val setSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_select_mode")

    public val getSelectModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_select_mode")

    public val setIconModePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_icon_mode")

    public val getIconModePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_icon_mode")

    public val setFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_fixed_icon_size")

    public val getFixedIconSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_fixed_icon_size")

    public val setIconScalePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "set_icon_scale")

    public val getIconScalePtr: VoidPtr = TypeManager.getMethodBindPtr("ItemList", "get_icon_scale")

    public val setAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_rmb_select")

    public val getAllowRmbSelectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_rmb_select")

    public val setAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_reselect")

    public val getAllowReselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_reselect")

    public val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_allow_search")

    public val setAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_auto_height")

    public val hasAutoHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "has_auto_height")

    public val isAnythingSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "is_anything_selected")

    public val getItemAtPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_item_at_position")

    public val ensureCurrentIsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "ensure_current_is_visible")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_v_scroll_bar")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ItemList", "get_text_overrun_behavior")
  }
}
