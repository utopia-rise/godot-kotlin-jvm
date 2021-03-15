// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
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
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Button control that provides selectable options when pressed.
 *
 * OptionButton is a type button that provides a selectable list of items when pressed. The item selected becomes the "current" item and is displayed as the button text.
 */
@GodotBaseType
open class OptionButton : Button() {
  /**
   * Emitted when the user navigates to an item using the `ui_up` or `ui_down` actions. The index of the item selected is passed as argument.
   */
  val itemFocused: Signal1<Long> by signal("index")

  /**
   * Emitted when the current item has been changed by the user. The index of the item selected is passed as argument.
   */
  val itemSelected: Signal1<Long> by signal("index")

  /**
   * The index of the currently selected item, or `-1` if no item is selected.
   */
  open val selected: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_OPTIONBUTTON, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _focused(arg0: Long) {
  }

  open fun _getItems(): VariantArray<Any?> {
    throw NotImplementedError("_get_items is not implemented for OptionButton")
  }

  open fun _selectInt(arg0: Long) {
  }

  open fun _selected(arg0: Long) {
  }

  open fun _setItems(arg0: VariantArray<Any?>) {
  }

  /**
   * Adds an item, with a `texture` icon, text `label` and (optionally) `id`. If no `id` is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ICON_ITEM, NIL)
  }

  /**
   * Adds an item, with text `label` and (optionally) `id`. If no `id` is passed, the item index will be used as the item's ID. New items are appended at the end.
   */
  open fun addItem(label: String, id: Long = -1) {
    TransferContext.writeArguments(STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ITEM, NIL)
  }

  /**
   * Adds a separator to the list of items. Separators help to group items. Separator also takes up an index and is appended at the end.
   */
  open fun addSeparator() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_SEPARATOR, NIL)
  }

  /**
   * Clears all the items in the [godot.OptionButton].
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_CLEAR, NIL)
  }

  /**
   * Returns the amount of items in the OptionButton, including separators.
   */
  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the icon of the item at index `idx`.
   */
  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the ID of the item at index `idx`.
   */
  open fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item with the given `id`.
   */
  open fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Retrieves the metadata of an item. Metadata may be any type and can be used to store extra information about an item, such as an external string ID.
   */
  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the text of the item at index `idx`.
   */
  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the [godot.PopupMenu] contained in this button.
   */
  open fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns the ID of the selected item, or `0` if no item is selected.
   */
  open fun getSelectedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the metadata of the selected item. Metadata for items can be set using [setItemMetadata].
   */
  open fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the item at index `idx` is disabled.
   */
  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the item at index `idx`.
   */
  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_REMOVE_ITEM, NIL)
  }

  /**
   * Selects an item by index and makes it the current item. This will work even if the item is disabled.
   */
  open fun select(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SELECT, NIL)
  }

  /**
   * Sets whether the item at index `idx` is disabled.
   *
   * Disabled items are drawn differently in the dropdown and are not selectable by the user. If the current selected item is set as disabled, it will remain selected.
   */
  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets the icon of the item at index `idx`.
   */
  open fun setItemIcon(idx: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets the ID of the item at index `idx`.
   */
  open fun setItemId(idx: Long, id: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ID, NIL)
  }

  /**
   * Sets the metadata of an item. Metadata may be of any type and can be used to store extra information about an item, such as an external string ID.
   */
  open fun setItemMetadata(idx: Long, metadata: Any?) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_METADATA, NIL)
  }

  /**
   * Sets the text of the item at index `idx`.
   */
  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_TEXT, NIL)
  }
}
