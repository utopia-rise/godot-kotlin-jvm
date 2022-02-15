// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Button control that provides selectable options when pressed.
 *
 * OptionButton is a type button that provides a selectable list of items when pressed. The item selected becomes the "current" item and is displayed as the button text.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class OptionButton : Button() {
  /**
   * Emitted when the user navigates to an item using the `ui_up` or `ui_down` actions. The index of the item selected is passed as argument.
   */
  public val itemFocused: Signal1<Long> by signal("index")

  /**
   * Emitted when the current item has been changed by the user. The index of the item selected is passed as argument.
   */
  public val itemSelected: Signal1<Long> by signal("index")

  /**
   * The number of items to select from.
   */
  public open var itemCount: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_COUNT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_COUNT, NIL)
    }

  /**
   * The index of the currently selected item, or `-1` if no item is selected.
   */
  public open val selected: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OPTIONBUTTON)
  }

  /**
   * Adds an item, with text `label` and (optionally) `id`. If no `id` is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  public open fun addItem(label: String, id: Long = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ITEM, NIL)
  }

  /**
   * Adds an item, with a `texture` icon, text `label` and (optionally) `id`. If no `id` is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  public open fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ICON_ITEM, NIL)
  }

  /**
   * Sets the text of the item at index `idx`.
   */
  public open fun setItemText(idx: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets the icon of the item at index `idx`.
   */
  public open fun setItemIcon(idx: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets whether the item at index `idx` is disabled.
   *
   * Disabled items are drawn differently in the dropdown and are not selectable by the user. If the current selected item is set as disabled, it will remain selected.
   */
  public open fun setItemDisabled(idx: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets the ID of the item at index `idx`.
   */
  public open fun setItemId(idx: Long, id: Long): Unit {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ID, NIL)
  }

  /**
   * Sets the metadata of an item. Metadata may be of any type and can be used to store extra information about an item, such as an external string ID.
   */
  public open fun setItemMetadata(idx: Long, metadata: Any): Unit {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_METADATA, NIL)
  }

  /**
   * Returns the text of the item at index `idx`.
   */
  public open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the icon of the item at index `idx`.
   */
  public open fun getItemIcon(idx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns the ID of the item at index `idx`.
   */
  public open fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item with the given `id`.
   */
  public open fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Retrieves the metadata of an item. Metadata may be any type and can be used to store extra information about an item, such as an external string ID.
   */
  public open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the item at index `idx` is disabled.
   */
  public open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a separator to the list of items. Separators help to group items. Separator also takes up an index and is appended at the end.
   */
  public open fun addSeparator(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_SEPARATOR, NIL)
  }

  /**
   * Clears all the items in the [godot.OptionButton].
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_CLEAR, NIL)
  }

  /**
   * Selects an item by index and makes it the current item. This will work even if the item is disabled.
   *
   * Passing `-1` as the index deselects any currently selected item.
   */
  public open fun select(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SELECT, NIL)
  }

  /**
   * Returns the ID of the selected item, or `-1` if no item is selected.
   */
  public open fun getSelectedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the metadata of the selected item. Metadata for items can be set using [setItemMetadata].
   */
  public open fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Removes the item at index `idx`.
   */
  public open fun removeItem(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_REMOVE_ITEM, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] contained in this button.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public open fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  public companion object
}
