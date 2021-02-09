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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class OptionButton : Button() {
  val itemFocused: Signal1<Long> by signal("index")

  val itemSelected: Signal1<Long> by signal("index")

  open val selected: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_OPTIONBUTTON)

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

  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ICON_ITEM, NIL)
  }

  open fun addItem(label: String, id: Long = -1) {
    TransferContext.writeArguments(STRING to label, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_ITEM, NIL)
  }

  open fun addSeparator() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_ADD_SEPARATOR, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_CLEAR, NIL)
  }

  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPopup(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  open fun getSelectedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSelectedMetadata(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_GET_SELECTED_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_REMOVE_ITEM, NIL)
  }

  open fun select(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SELECT, NIL)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_DISABLED, NIL)
  }

  open fun setItemIcon(idx: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ICON, NIL)
  }

  open fun setItemId(idx: Long, id: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_ID, NIL)
  }

  open fun setItemMetadata(idx: Long, metadata: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_METADATA, NIL)
  }

  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPTIONBUTTON_SET_ITEM_TEXT, NIL)
  }
}
