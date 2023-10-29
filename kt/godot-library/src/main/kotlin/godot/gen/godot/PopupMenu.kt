// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
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
 * A modal window used to display a list of options.
 *
 * [godot.PopupMenu] is a modal window used to display a list of options. Useful for toolbars and context menus.
 *
 * The size of a [godot.PopupMenu] can be limited by using [godot.Window.maxSize]. If the height of the list of items is larger than the maximum height of the [godot.PopupMenu], a [godot.ScrollContainer] within the popup will allow the user to scroll the contents. If no maximum size is set, or if it is set to `0`, the [godot.PopupMenu] height will be limited by its parent rect.
 *
 * All `set_*` methods allow negative item indices, i.e. `-1` to access the last item, `-2` to select the second-to-last item, and so on.
 *
 * **Incremental search:** Like [godot.ItemList] and [godot.Tree], [godot.PopupMenu] supports searching within the list while the control is focused. Press a key that matches the first letter of an item's name to select the first item starting with the given letter. After that point, there are two ways to perform incremental search: 1) Press the same key again before the timeout duration to select the next item starting with the same letter. 2) Press letter keys that match the rest of the word before the timeout duration to match to select the item in question directly. Both of these actions will be reset to the beginning of the list if the timeout duration has passed since the last keystroke was registered. You can adjust the timeout duration by changing [godot.ProjectSettings.gui/timers/incrementalSearchMaxIntervalMsec].
 *
 * **Note:** The ID values used for items are limited to 32 bits, not full 64 bits of [int]. This has a range of `-2^32` to `2^32 - 1`, i.e. `-2147483648` to `2147483647`.
 */
@GodotBaseType
public open class PopupMenu : Popup() {
  /**
   * Emitted when an item of some [id] is pressed or its accelerator is activated.
   *
   * **Note:** If [id] is negative (either explicitly or due to overflow), this will return the corresponding index instead.
   */
  public val idPressed: Signal1<Long> by signal("id")

  /**
   * Emitted when the user navigated to an item of some [id] using the [godot.ProjectSettings.input/uiUp] or [godot.ProjectSettings.input/uiDown] input action.
   */
  public val idFocused: Signal1<Long> by signal("id")

  /**
   * Emitted when an item of some [index] is pressed or its accelerator is activated.
   */
  public val indexPressed: Signal1<Long> by signal("index")

  /**
   * Emitted when any item is added, modified or removed.
   */
  public val menuChanged: Signal0 by signal()

  /**
   * If `true`, hides the [godot.PopupMenu] when an item is selected.
   */
  public var hideOnItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_ITEM_SELECTION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_ITEM_SELECTION, NIL)
    }

  /**
   * If `true`, hides the [godot.PopupMenu] when a checkbox or radio button is selected.
   */
  public var hideOnCheckableItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_CHECKABLE_ITEM_SELECTION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_CHECKABLE_ITEM_SELECTION, NIL)
    }

  /**
   * If `true`, hides the [godot.PopupMenu] when a state item is selected.
   */
  public var hideOnStateItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_HIDE_ON_STATE_ITEM_SELECTION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_HIDE_ON_STATE_ITEM_SELECTION, NIL)
    }

  /**
   * Sets the delay time in seconds for the submenu item to popup on mouse hovering. If the popup menu is added as a child of another (acting as a submenu), it will inherit the delay time of the parent menu item.
   */
  public var submenuPopupDelay: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_SUBMENU_POPUP_DELAY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_SUBMENU_POPUP_DELAY,
          NIL)
    }

  /**
   * If `true`, allows navigating [godot.PopupMenu] with letter keys.
   */
  public var allowSearch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ALLOW_SEARCH, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ALLOW_SEARCH, NIL)
    }

  /**
   * The number of items currently in the list.
   */
  public var itemCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POPUPMENU, scriptIndex)
    return true
  }

  /**
   * Checks the provided [event] against the [godot.PopupMenu]'s shortcuts and accelerators, and activates the first item with matching events. If [forGlobalOnly] is `true`, only shortcuts and accelerators with `global` set to `true` will be called.
   *
   * Returns `true` if an item was successfully activated.
   *
   * **Note:** Certain [godot.Control]s, such as [godot.MenuButton], will call this method automatically.
   */
  @JvmOverloads
  public fun activateItemByEvent(event: InputEvent, forGlobalOnly: Boolean = false): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to forGlobalOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ACTIVATE_ITEM_BY_EVENT,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a new item with text [label].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** The provided [id] is used only in [idPressed] and [idFocused] signals. It's not related to the `index` arguments in e.g. [setItemChecked].
   */
  @JvmOverloads
  public fun addItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ITEM, NIL)
  }

  /**
   * Adds a new item with text [label] and icon [texture].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   */
  @JvmOverloads
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_ITEM, NIL)
  }

  /**
   * Adds a new checkable item with text [label].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_ITEM, NIL)
  }

  /**
   * Adds a new checkable item with text [label] and icon [texture].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addIconCheckItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_ITEM, NIL)
  }

  /**
   * Adds a new radio check button with text [label].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addRadioCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_ITEM, NIL)
  }

  /**
   * Same as [addIconCheckItem], but uses a radio check button.
   */
  @JvmOverloads
  public fun addIconRadioCheckItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_ITEM,
        NIL)
  }

  /**
   * Adds a new multistate item with text [label].
   *
   * Contrarily to normal binary items, multistate items can have more than two states, as defined by [maxStates]. Each press or activate of the item will increase the state by one. The default value is defined by [defaultState].
   *
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is provided, one will be created from the index. If no [accel] is provided, then the default value of 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't have any accelerator). See [getItemAccelerator] for more info on accelerators.
   */
  @JvmOverloads
  public fun addMultistateItem(
    label: String,
    maxStates: Int,
    defaultState: Int = 0,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_MULTISTATE_ITEM, NIL)
  }

  /**
   * Adds a [godot.Shortcut].
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   *
   * If [allowEcho] is `true`, the shortcut can be activated with echo events.
   */
  @JvmOverloads
  public fun addShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
    allowEcho: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global, BOOL to allowEcho)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SHORTCUT, NIL)
  }

  /**
   * Adds a new item and assigns the specified [godot.Shortcut] and icon [texture] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   *
   * If [allowEcho] is `true`, the shortcut can be activated with echo events.
   */
  @JvmOverloads
  public fun addIconShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
    allowEcho: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global, BOOL to allowEcho)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_SHORTCUT, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.Shortcut] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_CHECK_SHORTCUT, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [godot.Shortcut] and icon [texture] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addIconCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_CHECK_SHORTCUT,
        NIL)
  }

  /**
   * Adds a new radio check button and assigns a [godot.Shortcut] to it. Sets the label of the checkbox to the [godot.Shortcut]'s name.
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to control it.
   */
  @JvmOverloads
  public fun addRadioCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_RADIO_CHECK_SHORTCUT,
        NIL)
  }

  /**
   * Same as [addIconCheckShortcut], but uses a radio check button.
   */
  @JvmOverloads
  public fun addIconRadioCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_ICON_RADIO_CHECK_SHORTCUT, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the parent [godot.PopupMenu] node when clicked. The [submenu] argument is the name of the child [godot.PopupMenu] node that will be shown when the item is clicked.
   *
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   */
  @JvmOverloads
  public fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int = -1,
  ): Unit {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SUBMENU_ITEM, NIL)
  }

  /**
   * Sets the text of the item at the given [index].
   */
  public fun setItemText(index: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(index: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TEXT_DIRECTION,
        NIL)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public fun setItemLanguage(index: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_LANGUAGE, NIL)
  }

  /**
   * Replaces the [godot.Texture2D] icon of the item at the given [index].
   */
  public fun setItemIcon(index: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets the maximum allowed width of the icon for the item at the given [index]. This limit is applied on top of the default size of the icon and on top of [theme_item icon_max_width]. The height is adjusted according to the icon's ratio.
   */
  public fun setItemIconMaxWidth(index: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON_MAX_WIDTH,
        NIL)
  }

  /**
   * Sets a modulating [godot.core.Color] of the item's icon at the given [index].
   */
  public fun setItemIconModulate(index: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ICON_MODULATE,
        NIL)
  }

  /**
   * Sets the checkstate status of the item at the given [index].
   */
  public fun setItemChecked(index: Int, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_CHECKED, NIL)
  }

  /**
   * Sets the [id] of the item at the given [index].
   *
   * The [id] is used in [idPressed] and [idFocused] signals.
   */
  public fun setItemId(index: Int, id: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ID, NIL)
  }

  /**
   * Sets the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut that can be pressed to trigger the menu button even if it's not currently open. [accel] is generally a combination of [enum KeyModifierMask]s and [enum Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A` ([kbd]Ctrl + A[/kbd]).
   */
  public fun setItemAccelerator(index: Int, accel: Key): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_ACCELERATOR, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [getItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun setItemMetadata(index: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_METADATA, NIL)
  }

  /**
   * Enables/disables the item at the given [index]. When it is disabled, it can't be selected and its action can't be invoked.
   */
  public fun setItemDisabled(index: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets the submenu of the item at the given [index]. The submenu is the name of a child [godot.PopupMenu] node that would be shown when the item is clicked.
   */
  public fun setItemSubmenu(index: Int, submenu: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SUBMENU, NIL)
  }

  /**
   * Mark the item at the given [index] as a separator, which means that it would be displayed as a line. If `false`, sets the type of the item to plain text.
   */
  public fun setItemAsSeparator(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_SEPARATOR,
        NIL)
  }

  /**
   * Sets whether the item at the given [index] has a checkbox. If `false`, sets the type of the item to plain text.
   *
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  public fun setItemAsCheckable(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_CHECKABLE,
        NIL)
  }

  /**
   * Sets the type of the item at the given [index] to radio button. If `false`, sets the type of the item to plain text.
   */
  public fun setItemAsRadioCheckable(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_AS_RADIO_CHECKABLE, NIL)
  }

  /**
   * Sets the [godot.String] tooltip of the item at the given [index].
   */
  public fun setItemTooltip(index: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Sets a [godot.Shortcut] for the item at the given [index].
   */
  @JvmOverloads
  public fun setItemShortcut(
    index: Int,
    shortcut: Shortcut,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to shortcut, BOOL to global)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [index].
   */
  public fun setItemIndent(index: Int, indent: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to indent.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_INDENT, NIL)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   */
  public fun setItemMultistate(index: Int, state: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to state.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_MULTISTATE, NIL)
  }

  /**
   * Disables the [godot.Shortcut] of the item at the given [index].
   */
  public fun setItemShortcutDisabled(index: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_ITEM_SHORTCUT_DISABLED, NIL)
  }

  /**
   * Toggles the check state of the item at the given [index].
   */
  public fun toggleItemChecked(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_CHECKED, NIL)
  }

  /**
   * Cycle to the next state of a multistate item. See [addMultistateItem] for details.
   */
  public fun toggleItemMultistate(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_TOGGLE_ITEM_MULTISTATE,
        NIL)
  }

  /**
   * Returns the text of the item at the given [index].
   */
  public fun getItemText(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(index: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TEXT_DIRECTION,
        LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_LANGUAGE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the icon of the item at the given [index].
   */
  public fun getItemIcon(index: Int): Texture2D? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the maximum allowed width of the icon for the item at the given [index].
   */
  public fun getItemIconMaxWidth(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON_MAX_WIDTH,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [godot.core.Color] modulating the item's icon at the given [index].
   */
  public fun getItemIconModulate(index: Int): Color {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ICON_MODULATE,
        COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns `true` if the item at the given [index] is checked.
   */
  public fun isItemChecked(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the ID of the item at the given [index]. `id` can be manually assigned, while index can not.
   */
  public fun getItemId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the item containing the specified [id]. Index is automatically assigned to each item by the engine and can not be set manually.
   */
  public fun getItemIndex(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut that can be pressed to trigger the menu button even if it's not currently open. The return value is an integer which is generally a combination of [enum KeyModifierMask]s and [enum Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A` ([kbd]Ctrl + A[/kbd]). If no accelerator is defined for the specified [index], [getItemAccelerator] returns `0` (corresponding to [@GlobalScope.KEY_NONE]).
   */
  public fun getItemAccelerator(index: Int): Key {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_ACCELERATOR,
        LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with [setItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun getItemMetadata(index: Int): Any? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_METADATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the item at the given [index] is disabled. When it is disabled it can't be selected, or its action invoked.
   *
   * See [setItemDisabled] for more info on how to disable an item.
   */
  public fun isItemDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_DISABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the submenu name of the item at the given [index]. See [addSubmenuItem] for more info on how to add a submenu.
   */
  public fun getItemSubmenu(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SUBMENU, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the item is a separator. If it is, it will be displayed as a line. See [addSeparator] for more info on how to add a separator.
   */
  public fun isItemSeparator(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SEPARATOR, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] is checkable in some way, i.e. if it has a checkbox or radio button.
   *
   * **Note:** Checkable items just display a checkmark or radio button, but don't have any built-in checking behavior and must be checked/unchecked manually.
   */
  public fun isItemCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_CHECKABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] has radio button-style checkability.
   *
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in radio groups.
   */
  public fun isItemRadioCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_RADIO_CHECKABLE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the specified item's shortcut is disabled.
   */
  public fun isItemShortcutDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_IS_ITEM_SHORTCUT_DISABLED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the tooltip associated with the item at the given [index].
   */
  public fun getItemTooltip(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_TOOLTIP, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the [godot.Shortcut] associated with the item at the given [index].
   */
  public fun getItemShortcut(index: Int): Shortcut? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_SHORTCUT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
  }

  /**
   * Returns the horizontal offset of the item at the given [index].
   */
  public fun getItemIndent(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_ITEM_INDENT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the currently focused item as the given [index].
   *
   * Passing `-1` as the index makes so that no item is focused.
   */
  public fun setFocusedItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SET_FOCUSED_ITEM, NIL)
  }

  /**
   * Returns the index of the currently focused item. Returns `-1` if no item is focused.
   */
  public fun getFocusedItem(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_GET_FOCUSED_ITEM, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves the scroll view to make the item at the given [index] visible.
   */
  public fun scrollToItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_SCROLL_TO_ITEM, NIL)
  }

  /**
   * Removes the item at the given [index] from the menu.
   *
   * **Note:** The indices of items after the removed item will be shifted by one.
   */
  public fun removeItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_REMOVE_ITEM, NIL)
  }

  /**
   * Adds a separator between items. Separators also occupy an index, which you can set by using the [id] parameter.
   *
   * A [label] can optionally be provided, which will appear at the center of the separator.
   */
  @JvmOverloads
  public fun addSeparator(label: String = "", id: Int = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_ADD_SEPARATOR, NIL)
  }

  /**
   * Removes all items from the [godot.PopupMenu]. If [freeSubmenus] is `true`, the submenu nodes are automatically freed.
   */
  @JvmOverloads
  public fun clear(freeSubmenus: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to freeSubmenus)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUPMENU_CLEAR, NIL)
  }

  public companion object
}
