// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Control
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * PopupMenu displays a list of options.
 *
 * [godot.PopupMenu] is a modal window used to display a list of options. They are popular in toolbars or context menus.
 *
 * The size of a [godot.PopupMenu] can be limited by using [godot.Window.maxSize]. If the height of the list of items is larger than the maximum height of the [godot.PopupMenu], a [godot.ScrollContainer] within the popup will allow the user to scroll the contents.
 *
 * If no maximum size is set, or if it is set to 0, the [godot.PopupMenu] height will be limited by its parent rect.
 *
 * All `set_*` methods allow negative item index, which makes the item accessed from the last one.
 *
 * **Incremental search:** Like [godot.ItemList] and [godot.Tree], [godot.PopupMenu] supports searching within the list while the control is focused. Press a key that matches the first letter of an item's name to select the first item starting with the given letter. After that point, there are two ways to perform incremental search: 1) Press the same key again before the timeout duration to select the next item starting with the same letter. 2) Press letter keys that match the rest of the word before the timeout duration to match to select the item in question directly. Both of these actions will be reset to the beginning of the list if the timeout duration has passed since the last keystroke was registered. You can adjust the timeout duration by changing [godot.ProjectSettings.gui/timers/incrementalSearchMaxIntervalMsec].
 */
@GodotBaseType
public open class PopupMenu : Popup() {
  /**
   * Emitted when an item of some `index` is pressed or its accelerator is activated.
   */
  public val indexPressed: Signal1<Long> by signal("index")

  /**
   * Emitted when user navigated to an item of some `id` using `ui_up` or `ui_down` action.
   */
  public val idFocused: Signal1<Long> by signal("id")

  /**
   * Emitted when an item of some `id` is pressed or its accelerator is activated.
   */
  public val idPressed: Signal1<Long> by signal("id")

  /**
   * If `true`, hides the [godot.PopupMenu] when an item is selected.
   */
  public var hideOnItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_ITEM_SELECTION,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_ITEM_SELECTION,
          NIL.ordinal)
    }

  /**
   * If `true`, hides the [godot.PopupMenu] when a checkbox or radio button is selected.
   */
  public var hideOnCheckableItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_CHECKABLE_ITEM_SELECTION, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_CHECKABLE_ITEM_SELECTION, NIL.ordinal)
    }

  /**
   * If `true`, hides the [godot.PopupMenu] when a state item is selected.
   */
  public var hideOnStateItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_STATE_ITEM_SELECTION, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_STATE_ITEM_SELECTION, NIL.ordinal)
    }

  /**
   * Sets the delay time in seconds for the submenu item to popup on mouse hovering. If the popup menu is added as a child of another (acting as a submenu), it will inherit the delay time of the parent menu item.
   */
  public var submenuPopupDelay: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_SUBMENU_POPUP_DELAY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_SUBMENU_POPUP_DELAY,
          NIL.ordinal)
    }

  /**
   * If `true`, allows navigating [godot.PopupMenu] with letter keys.
   */
  public var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ALLOW_SEARCH,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ALLOW_SEARCH,
          NIL.ordinal)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_COUNT,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_COUNT, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POPUPMENU)
  }

  /**
   * Adds a new item with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** The provided `id` is used only in [idPressed] and [idFocused] signals. It's not related to the `index` arguments in e.g. [setItemChecked].
   */
  public fun addItem(
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ITEM, NIL.ordinal)
  }

  /**
   * Adds a new item with text `label` and icon `texture`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   */
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_ITEM, NIL.ordinal)
  }

  /**
   * Adds a new checkable item with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addCheckItem(
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_ITEM, NIL.ordinal)
  }

  /**
   * Adds a new checkable item with text `label` and icon `texture`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addIconCheckItem(
    texture: Texture2D,
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_ITEM,
        NIL.ordinal)
  }

  /**
   * Adds a new radio check button with text `label`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addRadioCheckItem(
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_ITEM,
        NIL.ordinal)
  }

  /**
   * Same as [addIconCheckItem], but uses a radio check button.
   */
  public fun addIconRadioCheckItem(
    texture: Texture2D,
    label: String,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_ITEM,
        NIL.ordinal)
  }

  /**
   * Adds a new multistate item with text `label`.
   *
   * Contrarily to normal binary items, multistate items can have more than two states, as defined by `max_states`. Each press or activate of the item will increase the state by one. The default value is defined by `default_state`.
   *
   * An `id` can optionally be provided, as well as an accelerator (`accel`). If no `id` is provided, one will be created from the index. If no `accel` is provided then the default `0` will be assigned to it. See [getItemAccelerator] for more info on accelerators.
   */
  public fun addMultistateItem(
    label: String,
    maxStates: Long,
    defaultState: Long = 0,
    id: Long = -1,
    accel: Key = Key.KEY_NONE
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to maxStates, LONG to defaultState, LONG to id, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_MULTISTATE_ITEM,
        NIL.ordinal)
  }

  /**
   * Adds a [godot.Shortcut].
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
  public fun addShortcut(
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SHORTCUT, NIL.ordinal)
  }

  /**
   * Adds a new item and assigns the specified [godot.Shortcut] and icon `texture` to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
  public fun addIconShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_SHORTCUT, NIL.ordinal)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.Shortcut] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addCheckShortcut(
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_SHORTCUT,
        NIL.ordinal)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.Shortcut] and icon `texture` to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addIconCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_SHORTCUT,
        NIL.ordinal)
  }

  /**
   * Adds a new radio check button and assigns a [godot.Shortcut] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  public fun addRadioCheckShortcut(
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_SHORTCUT,
        NIL.ordinal)
  }

  /**
   * Same as [addIconCheckShortcut], but uses a radio check button.
   */
  public fun addIconRadioCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Long = -1,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_SHORTCUT,
        NIL.ordinal)
  }

  /**
   * Adds an item that will act as a submenu of the parent [godot.PopupMenu] node when clicked. The `submenu` argument is the name of the child [godot.PopupMenu] node that will be shown when the item is clicked.
   *
   * An `id` can optionally be provided. If no `id` is provided, one will be created from the index.
   */
  public fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SUBMENU_ITEM, NIL.ordinal)
  }

  /**
   * Sets the text of the item at the given `index`.
   */
  public fun setItemText(index: Long, text: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to text)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT, NIL.ordinal)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(index: Long, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to index, LONG to direction.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT_DIRECTION,
        NIL.ordinal)
  }

  public fun setItemOpentypeFeature(
    index: Long,
    tag: String,
    `value`: Long
  ): Unit {
    TransferContext.writeArguments(LONG to index, STRING to tag, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_OPENTYPE_FEATURE,
        NIL.ordinal)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setItemLanguage(index: Long, language: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to language)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_LANGUAGE, NIL.ordinal)
  }

  /**
   * Replaces the [godot.Texture2D] icon of the item at the given `index`.
   */
  public fun setItemIcon(index: Long, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to index, OBJECT to icon)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON, NIL.ordinal)
  }

  /**
   * Sets the checkstate status of the item at the given `index`.
   */
  public fun setItemChecked(index: Long, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to checked)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_CHECKED, NIL.ordinal)
  }

  /**
   * Sets the `id` of the item at the given `index`.
   *
   * The `id` is used in [idPressed] and [idFocused] signals.
   */
  public fun setItemId(index: Long, id: Long): Unit {
    TransferContext.writeArguments(LONG to index, LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ID, NIL.ordinal)
  }

  /**
   * Sets the accelerator of the item at the given `index`. Accelerators are special combinations of keys that activate the item, no matter which control is focused.
   */
  public fun setItemAccelerator(index: Long, accel: Key): Unit {
    TransferContext.writeArguments(LONG to index, LONG to accel.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ACCELERATOR,
        NIL.ordinal)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [getItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun setItemMetadata(index: Long, metadata: Any): Unit {
    TransferContext.writeArguments(LONG to index, ANY to metadata)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_METADATA, NIL.ordinal)
  }

  /**
   * Enables/disables the item at the given `index`. When it is disabled, it can't be selected and its action can't be invoked.
   */
  public fun setItemDisabled(index: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to disabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_DISABLED, NIL.ordinal)
  }

  /**
   * Sets the submenu of the item at the given `index`. The submenu is the name of a child [godot.PopupMenu] node that would be shown when the item is clicked.
   */
  public fun setItemSubmenu(index: Long, submenu: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to submenu)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SUBMENU, NIL.ordinal)
  }

  /**
   * Mark the item at the given `index` as a separator, which means that it would be displayed as a line. If `false`, sets the type of the item to plain text.
   */
  public fun setItemAsSeparator(index: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_SEPARATOR,
        NIL.ordinal)
  }

  /**
   * Sets whether the item at the given `index` has a checkbox. If `false`, sets the type of the item to plain text.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  public fun setItemAsCheckable(index: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_CHECKABLE,
        NIL.ordinal)
  }

  /**
   * Sets the type of the item at the given `index` to radio button. If `false`, sets the type of the item to plain text.
   */
  public fun setItemAsRadioCheckable(index: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_RADIO_CHECKABLE,
        NIL.ordinal)
  }

  /**
   * Sets the [godot.String] tooltip of the item at the given `index`.
   */
  public fun setItemTooltip(index: Long, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to tooltip)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TOOLTIP, NIL.ordinal)
  }

  /**
   * Sets a [godot.Shortcut] for the item at the given `index`.
   */
  public fun setItemShortcut(
    index: Long,
    shortcut: Shortcut,
    global: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to index, OBJECT to shortcut, BOOL to global)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT, NIL.ordinal)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   */
  public fun setItemMultistate(index: Long, state: Long): Unit {
    TransferContext.writeArguments(LONG to index, LONG to state)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_MULTISTATE,
        NIL.ordinal)
  }

  /**
   * Disables the [godot.Shortcut] of the item at the given `index`.
   */
  public fun setItemShortcutDisabled(index: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index, BOOL to disabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT_DISABLED,
        NIL.ordinal)
  }

  /**
   * Toggles the check state of the item at the given `index`.
   */
  public fun toggleItemChecked(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_CHECKED,
        NIL.ordinal)
  }

  /**
   * Cycle to the next state of a multistate item. See [addMultistateItem] for details.
   */
  public fun toggleItemMultistate(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_MULTISTATE,
        NIL.ordinal)
  }

  /**
   * Returns the text of the item at the given `index`.
   */
  public fun getItemText(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(index: Long): Control.TextDirection {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT_DIRECTION,
        LONG.ordinal)
    return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getItemOpentypeFeature(index: Long, tag: String): Long {
    TransferContext.writeArguments(LONG to index, STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_OPENTYPE_FEATURE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearItemOpentypeFeatures(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_CLEAR_ITEM_OPENTYPE_FEATURES,
        NIL.ordinal)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_LANGUAGE,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the icon of the item at the given `index`.
   */
  public fun getItemIcon(index: Long): Texture2D? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns `true` if the item at the given `index` is checked.
   */
  public fun isItemChecked(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the id of the item at the given `index`. `id` can be manually assigned, while index can not.
   */
  public fun getItemId(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item containing the specified `id`. Index is automatically assigned to each item by the engine and can not be set manually.
   */
  public fun getItemIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_INDEX, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the accelerator of the item at the given `index`. Accelerators are special combinations of keys that activate the item, no matter which control is focused.
   */
  public fun getItemAccelerator(index: Long): Key {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ACCELERATOR,
        LONG.ordinal)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with [setItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun getItemMetadata(index: Long): Any? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_METADATA, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the item at the given `index` is disabled. When it is disabled it can't be selected, or its action invoked.
   *
   * See [setItemDisabled] for more info on how to disable an item.
   */
  public fun isItemDisabled(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_DISABLED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the submenu name of the item at the given `index`. See [addSubmenuItem] for more info on how to add a submenu.
   */
  public fun getItemSubmenu(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SUBMENU,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the item is a separator. If it is, it will be displayed as a line. See [addSeparator] for more info on how to add a separator.
   */
  public fun isItemSeparator(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SEPARATOR,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at the given `index` is checkable in some way, i.e. if it has a checkbox or radio button.
   *
   * **Note:** Checkable items just display a checkmark or radio button, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  public fun isItemCheckable(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKABLE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at the given `index` has radio button-style checkability.
   *
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in radio groups.
   */
  public fun isItemRadioCheckable(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_RADIO_CHECKABLE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified item's shortcut is disabled.
   */
  public fun isItemShortcutDisabled(index: Long): Boolean {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SHORTCUT_DISABLED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the tooltip associated with the item at the given `index`.
   */
  public fun getItemTooltip(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TOOLTIP,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the [godot.Shortcut] associated with the item at the given `index`.
   */
  public fun getItemShortcut(index: Long): Shortcut? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SHORTCUT,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Shortcut?
  }

  /**
   * Sets the currently focused item as the given `index`.
   */
  public fun setCurrentIndex(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_CURRENT_INDEX, NIL.ordinal)
  }

  /**
   * Returns the index of the currently focused item. Returns `-1` if no item is focused.
   */
  public fun getCurrentIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_CURRENT_INDEX,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves the scroll view to make the item at the given `index` visible.
   */
  public fun scrollToItem(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SCROLL_TO_ITEM, NIL.ordinal)
  }

  /**
   * Removes the item at the given `index` from the menu.
   *
   * **Note:** The indices of items after the removed item will be shifted by one.
   */
  public fun removeItem(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_REMOVE_ITEM, NIL.ordinal)
  }

  /**
   * Adds a separator between items. Separators also occupy an index, which you can set by using the `id` parameter.
   *
   * A `label` can optionally be provided, which will appear at the center of the separator.
   */
  public fun addSeparator(label: String = "", id: Long = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SEPARATOR, NIL.ordinal)
  }

  /**
   * Removes all items from the [godot.PopupMenu].
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_CLEAR, NIL.ordinal)
  }

  public companion object
}
