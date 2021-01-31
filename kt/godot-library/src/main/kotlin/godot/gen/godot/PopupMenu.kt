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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class PopupMenu : Popup() {
  val idFocused: Signal1<Long> by signal("id")

  val idPressed: Signal1<Long> by signal("id")

  val indexPressed: Signal1<Long> by signal("index")

  open var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ALLOW_SEARCH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ALLOW_SEARCH, NIL)
    }

  open var hideOnCheckableItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_HIDE_ON_CHECKABLE_ITEM_SELECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_CHECKABLE_ITEM_SELECTION, NIL)
    }

  open var hideOnItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_HIDE_ON_ITEM_SELECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_ITEM_SELECTION, NIL)
    }

  open var hideOnStateItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_HIDE_ON_STATE_ITEM_SELECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_STATE_ITEM_SELECTION, NIL)
    }

  open var submenuPopupDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_SUBMENU_POPUP_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_SUBMENU_POPUP_DELAY,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_POPUPMENU)

  open fun _get_items(): VariantArray<Any?> {
    throw NotImplementedError("_get_items is not implemented for PopupMenu")
  }

  override fun _gui_input(event: InputEvent) {
  }

  open fun _set_items(arg0: VariantArray<Any?>) {
  }

  open fun _submenu_timeout() {
  }

  open fun addCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_ITEM, NIL)
  }

  open fun addCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_SHORTCUT, NIL)
  }

  open fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_ITEM, NIL)
  }

  open fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to
        global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_SHORTCUT,
        NIL)
  }

  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_ITEM, NIL)
  }

  open fun addIconRadioCheckItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_ITEM,
        NIL)
  }

  open fun addIconRadioCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to
        global)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_SHORTCUT, NIL)
  }

  open fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to
        global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_SHORTCUT, NIL)
  }

  open fun addItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ITEM, NIL)
  }

  open fun addMultistateItem(
    label: String,
    maxStates: Long,
    defaultState: Long = 0,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to maxStates, LONG to defaultState, LONG to
        id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_MULTISTATE_ITEM, NIL)
  }

  open fun addRadioCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_ITEM, NIL)
  }

  open fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_SHORTCUT,
        NIL)
  }

  open fun addSeparator(label: String = "") {
    TransferContext.writeArguments(STRING to label)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SEPARATOR, NIL)
  }

  open fun addShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SHORTCUT, NIL)
  }

  open fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Long = -1
  ) {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SUBMENU_ITEM, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_CLEAR, NIL)
  }

  open fun getCurrentIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_CURRENT_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemAccelerator(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ACCELERATOR,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getItemShortcut(idx: Long): ShortCut? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SHORTCUT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ShortCut?
  }

  open fun getItemSubmenu(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SUBMENU, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isHideOnWindowLoseFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_WINDOW_LOSE_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemCheckable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemChecked(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemRadioCheckable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_RADIO_CHECKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemSeparator(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SEPARATOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isItemShortcutDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SHORTCUT_DISABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_REMOVE_ITEM, NIL)
  }

  open fun setHideOnWindowLoseFocus(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_WINDOW_LOSE_FOCUS, NIL)
  }

  open fun setItemAccelerator(idx: Long, accel: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ACCELERATOR, NIL)
  }

  open fun setItemAsCheckable(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_CHECKABLE,
        NIL)
  }

  open fun setItemAsRadioCheckable(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_RADIO_CHECKABLE, NIL)
  }

  open fun setItemAsSeparator(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_SEPARATOR,
        NIL)
  }

  open fun setItemChecked(idx: Long, checked: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_CHECKED, NIL)
  }

  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_DISABLED, NIL)
  }

  open fun setItemIcon(idx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON, NIL)
  }

  open fun setItemId(idx: Long, id: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ID, NIL)
  }

  open fun setItemMetadata(idx: Long, metadata: Any) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_METADATA, NIL)
  }

  open fun setItemMultistate(idx: Long, state: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_MULTISTATE, NIL)
  }

  open fun setItemShortcut(
    idx: Long,
    shortcut: ShortCut,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to idx, OBJECT to shortcut, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT, NIL)
  }

  open fun setItemShortcutDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT_DISABLED, NIL)
  }

  open fun setItemSubmenu(idx: Long, submenu: String) {
    TransferContext.writeArguments(LONG to idx, STRING to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SUBMENU, NIL)
  }

  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT, NIL)
  }

  open fun setItemTooltip(idx: Long, tooltip: String) {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TOOLTIP, NIL)
  }

  open fun toggleItemChecked(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_CHECKED, NIL)
  }

  open fun toggleItemMultistate(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_MULTISTATE,
        NIL)
  }
}
