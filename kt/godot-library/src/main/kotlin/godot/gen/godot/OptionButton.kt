// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A button that brings up a dropdown with selectable options when pressed.
 *
 * [godot.OptionButton] is a type of button that brings up a dropdown with selectable items when pressed. The item selected becomes the "current" item and is displayed as the button text.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 *
 * **Note:** Properties [godot.Button.text] and [godot.Button.icon] are automatically set based on the selected item. They shouldn't be changed manually.
 *
 * **Note:** The ID values used for items are limited to 32 bits, not full 64 bits of [int]. This has a range of `-2^32` to `2^32 - 1`, i.e. `-2147483648` to `2147483647`.
 *
 * **Note:** The ID values used for items are 32-bit, unlike [int] which is always 64-bit. They go from `-2147483648` to `2147483647`.
 *
 * **Note:** The [godot.Button.text] and [godot.Button.icon] properties are set automatically based on the selected item. They shouldn't be changed manually.
 */
@GodotBaseType
public open class OptionButton : Button() {
  /**
   * Emitted when the current item has been changed by the user. The index of the item selected is passed as argument.
   *
   * [allowReselect] must be enabled to reselect an item.
   */
  public val itemSelected: Signal1<Long> by signal("index")

  /**
   * Emitted when the user navigates to an item using the [godot.ProjectSettings.input/uiUp] or [godot.ProjectSettings.input/uiDown] input actions. The index of the item selected is passed as argument.
   */
  public val itemFocused: Signal1<Long> by signal("index")

  /**
   * The number of items to select from.
   */
  public var itemCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_COUNT, NIL)
    }

  /**
   * The index of the currently selected item, or `-1` if no item is selected.
   */
  public val selected: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * If `true`, minimum size will be determined by the longest item's text, instead of the currently selected one's.
   *
   * **Note:** For performance reasons, the minimum size doesn't update immediately when adding, removing or modifying items.
   */
  public var fitToLongestItem: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_FIT_TO_LONGEST_ITEM, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_FIT_TO_LONGEST_ITEM, NIL)
    }

  /**
   * If `true`, the currently selected item can be selected again.
   */
  public var allowReselect: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ALLOW_RESELECT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ALLOW_RESELECT,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPTIONBUTTON, scriptIndex)
    return true
  }

  /**
   * Adds an item, with text [label] and (optionally) [id]. If no [id] is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  public fun addItem(label: String, id: Long = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ITEM, NIL)
  }

  /**
   * Adds an item, with a [texture] icon, text [label] and (optionally) [id]. If no [id] is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Long = -1,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ICON_ITEM, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   */
  public fun setItemText(idx: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets the icon of the item at index [idx].
   */
  public fun setItemIcon(idx: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets whether the item at index [idx] is disabled.
   *
   * Disabled items are drawn differently in the dropdown and are not selectable by the user. If the current selected item is set as disabled, it will remain selected.
   */
  public fun setItemDisabled(idx: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets the ID of the item at index [idx].
   */
  public fun setItemId(idx: Long, id: Long): Unit {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ID, NIL)
  }

  /**
   * Sets the metadata of an item. Metadata may be of any type and can be used to store extra information about an item, such as an external string ID.
   */
  public fun setItemMetadata(idx: Long, metadata: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_METADATA, NIL)
  }

  /**
   * Sets the tooltip of the item at index [idx].
   */
  public fun setItemTooltip(idx: Long, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Returns the text of the item at index [idx].
   */
  public fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the icon of the item at index [idx].
   */
  public fun getItemIcon(idx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns the ID of the item at index [idx].
   */
  public fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item with the given [id].
   */
  public fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Retrieves the metadata of an item. Metadata may be any type and can be used to store extra information about an item, such as an external string ID.
   */
  public fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the tooltip of the item at index [idx].
   */
  public fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_TOOLTIP,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the item at index [idx] is disabled.
   */
  public fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index [idx] is marked as a separator.
   */
  public fun isItemSeparator(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_ITEM_SEPARATOR,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a separator to the list of items. Separators help to group items, and can optionally be given a [text] header. A separator also gets an index assigned, and is appended at the end of the item list.
   */
  public fun addSeparator(text: String = ""): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_SEPARATOR, NIL)
  }

  /**
   * Clears all the items in the [godot.OptionButton].
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_CLEAR, NIL)
  }

  /**
   * Selects an item by index and makes it the current item. This will work even if the item is disabled.
   *
   * Passing `-1` as the index deselects any currently selected item.
   */
  public fun select(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SELECT, NIL)
  }

  /**
   * Returns the ID of the selected item, or `-1` if no item is selected.
   */
  public fun getSelectedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the metadata of the selected item. Metadata for items can be set using [setItemMetadata].
   */
  public fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Removes the item at index [idx].
   */
  public fun removeItem(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_REMOVE_ITEM, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] contained in this button.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Adjusts popup position and sizing for the [godot.OptionButton], then shows the [godot.PopupMenu]. Prefer this over using `get_popup().popup()`.
   */
  public fun showPopup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SHOW_POPUP, NIL)
  }

  /**
   * Returns `true` if this button contains at least one item which is not disabled, or marked as a separator.
   */
  public fun hasSelectableItems(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_HAS_SELECTABLE_ITEMS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the index of the first item which is not disabled, or marked as a separator. If [fromLast] is `true`, the items will be searched in reverse order.
   *
   * Returns `-1` if no item is found.
   */
  public fun getSelectableItem(fromLast: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to fromLast)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTABLE_ITEM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
