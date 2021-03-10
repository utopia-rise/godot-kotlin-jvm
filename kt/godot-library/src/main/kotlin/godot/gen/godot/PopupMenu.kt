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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * PopupMenu displays a list of options.
 *
 * [godot.PopupMenu] is a [godot.Control] that displays a list of options. They are popular in toolbars or context menus.
 */
@GodotBaseType
open class PopupMenu : Popup() {
  /**
   * Emitted when user navigated to an item of some `id` using `ui_up` or `ui_down` action.
   */
  val idFocused: Signal1<Long> by signal("id")

  /**
   * Emitted when an item of some `id` is pressed or its accelerator is activated.
   */
  val idPressed: Signal1<Long> by signal("id")

  /**
   * Emitted when an item of some `index` is pressed or its accelerator is activated.
   */
  val indexPressed: Signal1<Long> by signal("index")

  /**
   * If `true`, allows to navigate [godot.PopupMenu] with letter keys.
   */
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

  /**
   * If `true`, hides the [godot.PopupMenu] when a checkbox or radio button is selected.
   */
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

  /**
   * If `true`, hides the [godot.PopupMenu] when an item is selected.
   */
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

  /**
   * If `true`, hides the [godot.PopupMenu] when a state item is selected.
   */
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

  /**
   * Sets the delay time in seconds for the submenu item to popup on mouse hovering. If the popup menu is added as a child of another (acting as a submenu), it will inherit the delay time of the parent menu item.
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POPUPMENU)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getItems(): VariantArray<Any?> {
    throw NotImplementedError("_get_items is not implemented for PopupMenu")
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _setItems(arg0: VariantArray<Any?>) {
  }

  open fun _submenuTimeout() {
  }

  /**
   * Adds a new checkable item with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  open fun addCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_ITEM, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.ShortCut] to it. Sets the label of the checkbox to the [godot.ShortCut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  open fun addCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_SHORTCUT, NIL)
  }

  /**
   * Adds a new checkable item with text `label` and icon `texture`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  open fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_ITEM, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.ShortCut] and icon `texture` to it. Sets the label of the checkbox to the [godot.ShortCut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
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

  /**
   * Adds a new item with text `label` and icon `texture`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   */
  open fun addIconItem(
    texture: Texture,
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_ITEM, NIL)
  }

  /**
   * Same as [addIconCheckItem], but uses a radio check button.
   */
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

  /**
   * Same as [addIconCheckShortcut], but uses a radio check button.
   */
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

  /**
   * Adds a new item and assigns the specified [godot.ShortCut] and icon `texture` to it. Sets the label of the checkbox to the [godot.ShortCut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
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

  /**
   * Adds a new item with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   */
  open fun addItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ITEM, NIL)
  }

  /**
   * Adds a new multistate item with text `label`.
   *
   * Contrarily to normal binary items, multistate items can have more than two states, as defined by `max_states`. Each press or activate of the item will increase the state by one. The default value is defined by `default_state`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   */
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

  /**
   * Adds a new radio check button with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  open fun addRadioCheckItem(
    label: String,
    id: Long = -1,
    accel: Long = 0
  ) {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_ITEM, NIL)
  }

  /**
   * Adds a new radio check button and assigns a [godot.ShortCut] to it. Sets the label of the checkbox to the [godot.ShortCut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  open fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_SHORTCUT,
        NIL)
  }

  /**
   * Adds a separator between items. Separators also occupy an index.
   */
  open fun addSeparator(label: String = "") {
    TransferContext.writeArguments(STRING to label)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SEPARATOR, NIL)
  }

  /**
   * Adds a [godot.ShortCut].
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
  open fun addShortcut(
    shortcut: ShortCut,
    id: Long = -1,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SHORTCUT, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the parent [godot.PopupMenu] node when clicked. The `submenu` argument is the name of the child [godot.PopupMenu] node that will be shown when the item is clicked.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
  open fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Long = -1
  ) {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SUBMENU_ITEM, NIL)
  }

  /**
   * Removes all items from the [godot.PopupMenu].
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_CLEAR, NIL)
  }

  /**
   *
   */
  open fun getCurrentIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_CURRENT_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the accelerator of the item at index `idx`. Accelerators are special combinations of keys that activate the item, no matter which control is focused.
   */
  open fun getItemAccelerator(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ACCELERATOR,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of items in the [godot.PopupMenu].
   */
  open fun getItemCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the icon of the item at index `idx`.
   */
  open fun getItemIcon(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the id of the item at index `idx`. `id` can be manually assigned, while index can not.
   */
  open fun getItemId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item containing the specified `id`. Index is automatically assigned to each item by the engine. Index can not be set manually.
   */
  open fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with [setItemMetadata], which provides a simple way of assigning context data to items.
   */
  open fun getItemMetadata(idx: Long): Any? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_METADATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the [godot.ShortCut] associated with the specified `idx` item.
   */
  open fun getItemShortcut(idx: Long): ShortCut? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SHORTCUT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ShortCut?
  }

  /**
   * Returns the submenu name of the item at index `idx`. See [addSubmenuItem] for more info on how to add a submenu.
   */
  open fun getItemSubmenu(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SUBMENU, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the text of the item at index `idx`.
   */
  open fun getItemText(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the tooltip associated with the specified index index `idx`.
   */
  open fun getItemTooltip(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the popup will be hidden when the window loses focus or not.
   */
  open fun isHideOnWindowLoseFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_WINDOW_LOSE_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index `idx` is checkable in some way, i.e. if it has a checkbox or radio button.
   *
   * **Note:** Checkable items just display a checkmark or radio button, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  open fun isItemCheckable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index `idx` is checked.
   */
  open fun isItemChecked(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index `idx` is disabled. When it is disabled it can't be selected, or its action invoked.
   *
   * See [setItemDisabled] for more info on how to disable an item.
   */
  open fun isItemDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index `idx` has radio button-style checkability.
   *
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in radio groups.
   */
  open fun isItemRadioCheckable(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_RADIO_CHECKABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item is a separator. If it is, it will be displayed as a line. See [addSeparator] for more info on how to add a separator.
   */
  open fun isItemSeparator(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SEPARATOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified item's shortcut is disabled.
   */
  open fun isItemShortcutDisabled(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SHORTCUT_DISABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the item at index `idx` from the menu.
   *
   * **Note:** The indices of items after the removed item will be shifted by one.
   */
  open fun removeItem(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_REMOVE_ITEM, NIL)
  }

  /**
   * Hides the [godot.PopupMenu] when the window loses focus.
   */
  open fun setHideOnWindowLoseFocus(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_WINDOW_LOSE_FOCUS, NIL)
  }

  /**
   * Sets the accelerator of the item at index `idx`. Accelerators are special combinations of keys that activate the item, no matter which control is focused.
   */
  open fun setItemAccelerator(idx: Long, accel: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to accel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ACCELERATOR, NIL)
  }

  /**
   * Sets whether the item at index `idx` has a checkbox. If `false`, sets the type of the item to plain text.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  open fun setItemAsCheckable(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_CHECKABLE,
        NIL)
  }

  /**
   * Sets the type of the item at the specified index `idx` to radio button. If `false`, sets the type of the item to plain text.
   */
  open fun setItemAsRadioCheckable(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_RADIO_CHECKABLE, NIL)
  }

  /**
   * Mark the item at index `idx` as a separator, which means that it would be displayed as a line. If `false`, sets the type of the item to plain text.
   */
  open fun setItemAsSeparator(idx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_SEPARATOR,
        NIL)
  }

  /**
   * Sets the checkstate status of the item at index `idx`.
   */
  open fun setItemChecked(idx: Long, checked: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_CHECKED, NIL)
  }

  /**
   * Enables/disables the item at index `idx`. When it is disabled, it can't be selected and its action can't be invoked.
   */
  open fun setItemDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Replaces the [godot.Texture] icon of the specified `idx`.
   */
  open fun setItemIcon(idx: Long, icon: Texture) {
    TransferContext.writeArguments(LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets the `id` of the item at index `idx`.
   */
  open fun setItemId(idx: Long, id: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ID, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [getItemMetadata], which provides a simple way of assigning context data to items.
   */
  open fun setItemMetadata(idx: Long, metadata: Any?) {
    TransferContext.writeArguments(LONG to idx, ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_METADATA, NIL)
  }

  /**
   * Sets the state of an multistate item. See [addMultistateItem] for details.
   */
  open fun setItemMultistate(idx: Long, state: Long) {
    TransferContext.writeArguments(LONG to idx, LONG to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_MULTISTATE, NIL)
  }

  /**
   * Sets a [godot.ShortCut] for the specified item `idx`.
   */
  open fun setItemShortcut(
    idx: Long,
    shortcut: ShortCut,
    global: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to idx, OBJECT to shortcut, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT, NIL)
  }

  /**
   * Disables the [godot.ShortCut] of the specified index `idx`.
   */
  open fun setItemShortcutDisabled(idx: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT_DISABLED, NIL)
  }

  /**
   * Sets the submenu of the item at index `idx`. The submenu is the name of a child [godot.PopupMenu] node that would be shown when the item is clicked.
   */
  open fun setItemSubmenu(idx: Long, submenu: String) {
    TransferContext.writeArguments(LONG to idx, STRING to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SUBMENU, NIL)
  }

  /**
   * Sets the text of the item at index `idx`.
   */
  open fun setItemText(idx: Long, text: String) {
    TransferContext.writeArguments(LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets the [godot.String] tooltip of the item at the specified index `idx`.
   */
  open fun setItemTooltip(idx: Long, tooltip: String) {
    TransferContext.writeArguments(LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Toggles the check state of the item of the specified index `idx`.
   */
  open fun toggleItemChecked(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_CHECKED, NIL)
  }

  /**
   * Cycle to the next state of an multistate item. See [addMultistateItem] for details.
   */
  open fun toggleItemMultistate(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_MULTISTATE,
        NIL)
  }
}
