// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
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
 * [PopupMenu] is a modal window used to display a list of options. Useful for toolbars and context
 * menus.
 * The size of a [PopupMenu] can be limited by using [Window.maxSize]. If the height of the list of
 * items is larger than the maximum height of the [PopupMenu], a [ScrollContainer] within the popup
 * will allow the user to scroll the contents. If no maximum size is set, or if it is set to `0`, the
 * [PopupMenu] height will be limited by its parent rect.
 * All `set_*` methods allow negative item indices, i.e. `-1` to access the last item, `-2` to
 * select the second-to-last item, and so on.
 * **Incremental search:** Like [ItemList] and [Tree], [PopupMenu] supports searching within the
 * list while the control is focused. Press a key that matches the first letter of an item's name to
 * select the first item starting with the given letter. After that point, there are two ways to
 * perform incremental search: 1) Press the same key again before the timeout duration to select the
 * next item starting with the same letter. 2) Press letter keys that match the rest of the word before
 * the timeout duration to match to select the item in question directly. Both of these actions will be
 * reset to the beginning of the list if the timeout duration has passed since the last keystroke was
 * registered. You can adjust the timeout duration by changing
 * [ProjectSettings.gui/timers/incrementalSearchMaxIntervalMsec].
 * **Note:** The ID values used for items are limited to 32 bits, not full 64 bits of [int]. This
 * has a range of `-2^32` to `2^32 - 1`, i.e. `-2147483648` to `2147483647`.
 */
@GodotBaseType
public open class PopupMenu : Popup() {
  /**
   * Emitted when an item of some [id] is pressed or its accelerator is activated.
   * **Note:** If [id] is negative (either explicitly or due to overflow), this will return the
   * corresponding index instead.
   */
  public val idPressed: Signal1<Long> by signal("id")

  /**
   * Emitted when the user navigated to an item of some [id] using the [ProjectSettings.input/uiUp]
   * or [ProjectSettings.input/uiDown] input action.
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
   * If `true`, hides the [PopupMenu] when an item is selected.
   */
  public var hideOnItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnItemSelectionPtr, NIL)
    }

  /**
   * If `true`, hides the [PopupMenu] when a checkbox or radio button is selected.
   */
  public var hideOnCheckableItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnCheckableItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnCheckableItemSelectionPtr, NIL)
    }

  /**
   * If `true`, hides the [PopupMenu] when a state item is selected.
   */
  public var hideOnStateItemSelection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHideOnStateItemSelectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnStateItemSelectionPtr, NIL)
    }

  /**
   * Sets the delay time in seconds for the submenu item to popup on mouse hovering. If the popup
   * menu is added as a child of another (acting as a submenu), it will inherit the delay time of the
   * parent menu item.
   */
  public var submenuPopupDelay: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubmenuPopupDelayPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSubmenuPopupDelayPtr, NIL)
    }

  /**
   * If `true`, allows navigating [PopupMenu] with letter keys.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POPUPMENU, scriptIndex)
    return true
  }

  /**
   * Checks the provided [event] against the [PopupMenu]'s shortcuts and accelerators, and activates
   * the first item with matching events. If [forGlobalOnly] is `true`, only shortcuts and accelerators
   * with `global` set to `true` will be called.
   * Returns `true` if an item was successfully activated.
   * **Note:** Certain [Control]s, such as [MenuButton], will call this method automatically.
   */
  @JvmOverloads
  public fun activateItemByEvent(event: InputEvent, forGlobalOnly: Boolean = false): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to forGlobalOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.activateItemByEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a new item with text [label].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   * **Note:** The provided [id] is used only in [signal id_pressed] and [signal id_focused]
   * signals. It's not related to the `index` arguments in e.g. [setItemChecked].
   */
  @JvmOverloads
  public fun addItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, NIL)
  }

  /**
   * Adds a new item with text [label] and icon [texture].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   */
  @JvmOverloads
  public fun addIconItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, NIL)
  }

  /**
   * Adds a new checkable item with text [label].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addCheckItemPtr, NIL)
  }

  /**
   * Adds a new checkable item with text [label] and icon [texture].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addIconCheckItem(
    texture: Texture2D,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconCheckItemPtr, NIL)
  }

  /**
   * Adds a new radio check button with text [label].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addRadioCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addRadioCheckItemPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addIconRadioCheckItemPtr, NIL)
  }

  /**
   * Adds a new multistate item with text [label].
   * Contrarily to normal binary items, multistate items can have more than two states, as defined
   * by [maxStates]. Each press or activate of the item will increase the state by one. The default
   * value is defined by [defaultState].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
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
    TransferContext.callMethod(rawPtr, MethodBindings.addMultistateItemPtr, NIL)
  }

  /**
   * Adds a [Shortcut].
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
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
    TransferContext.callMethod(rawPtr, MethodBindings.addShortcutPtr, NIL)
  }

  /**
   * Adds a new item and assigns the specified [Shortcut] and icon [texture] to it. Sets the label
   * of the checkbox to the [Shortcut]'s name.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
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
    TransferContext.callMethod(rawPtr, MethodBindings.addIconShortcutPtr, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [Shortcut] to it. Sets the label of the
   * checkbox to the [Shortcut]'s name.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addCheckShortcutPtr, NIL)
  }

  /**
   * Adds a new checkable item and assigns the specified [Shortcut] and icon [texture] to it. Sets
   * the label of the checkbox to the [Shortcut]'s name.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addIconCheckShortcut(
    texture: Texture2D,
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addIconCheckShortcutPtr, NIL)
  }

  /**
   * Adds a new radio check button and assigns a [Shortcut] to it. Sets the label of the checkbox to
   * the [Shortcut]'s name.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   */
  @JvmOverloads
  public fun addRadioCheckShortcut(
    shortcut: Shortcut,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.addRadioCheckShortcutPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addIconRadioCheckShortcutPtr, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the parent [PopupMenu] node when clicked. The
   * [submenu] argument must be the name of an existing [PopupMenu] that has been added as a child to
   * this node. This submenu will be shown when the item is clicked, hovered for long enough, or
   * activated using the `ui_select` or `ui_right` input actions.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   */
  @JvmOverloads
  public fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int = -1,
  ): Unit {
    TransferContext.writeArguments(STRING to label, STRING to submenu, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSubmenuItemPtr, NIL)
  }

  /**
   * Sets the text of the item at the given [index].
   */
  public fun setItemText(index: Int, text: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Sets item's text base writing direction.
   */
  public fun setItemTextDirection(index: Int, direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public fun setItemLanguage(index: Int, language: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  /**
   * Replaces the [Texture2D] icon of the item at the given [index].
   */
  public fun setItemIcon(index: Int, icon: Texture2D): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Sets the maximum allowed width of the icon for the item at the given [index]. This limit is
   * applied on top of the default size of the icon and on top of [theme_item icon_max_width]. The
   * height is adjusted according to the icon's ratio.
   */
  public fun setItemIconMaxWidth(index: Int, width: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to width.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconMaxWidthPtr, NIL)
  }

  /**
   * Sets a modulating [Color] of the item's icon at the given [index].
   */
  public fun setItemIconModulate(index: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  /**
   * Sets the checkstate status of the item at the given [index].
   */
  public fun setItemChecked(index: Int, checked: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCheckedPtr, NIL)
  }

  /**
   * Sets the [id] of the item at the given [index].
   * The [id] is used in [signal id_pressed] and [signal id_focused] signals.
   */
  public fun setItemId(index: Int, id: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIdPtr, NIL)
  }

  /**
   * Sets the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut
   * that can be pressed to trigger the menu button even if it's not currently open. [accel] is
   * generally a combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL |
   * KEY_A` ([kbd]Ctrl + A[/kbd]).
   */
  public fun setItemAccelerator(index: Int, accel: Key): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to accel.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAcceleratorPtr, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with
   * [getItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun setItemMetadata(index: Int, metadata: Any?): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), ANY to metadata)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Enables/disables the item at the given [index]. When it is disabled, it can't be selected and
   * its action can't be invoked.
   */
  public fun setItemDisabled(index: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Sets the submenu of the item at the given [index]. The submenu is the name of a child
   * [PopupMenu] node that would be shown when the item is clicked.
   */
  public fun setItemSubmenu(index: Int, submenu: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to submenu)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSubmenuPtr, NIL)
  }

  /**
   * Mark the item at the given [index] as a separator, which means that it would be displayed as a
   * line. If `false`, sets the type of the item to plain text.
   */
  public fun setItemAsSeparator(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsSeparatorPtr, NIL)
  }

  /**
   * Sets whether the item at the given [index] has a checkbox. If `false`, sets the type of the
   * item to plain text.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually.
   */
  public fun setItemAsCheckable(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsCheckablePtr, NIL)
  }

  /**
   * Sets the type of the item at the given [index] to radio button. If `false`, sets the type of
   * the item to plain text.
   */
  public fun setItemAsRadioCheckable(index: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAsRadioCheckablePtr, NIL)
  }

  /**
   * Sets the [String] tooltip of the item at the given [index].
   */
  public fun setItemTooltip(index: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Sets a [Shortcut] for the item at the given [index].
   */
  @JvmOverloads
  public fun setItemShortcut(
    index: Int,
    shortcut: Shortcut,
    global: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to shortcut, BOOL to global)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemShortcutPtr, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [index].
   */
  public fun setItemIndent(index: Int, indent: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to indent.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIndentPtr, NIL)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   */
  public fun setItemMultistate(index: Int, state: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to state.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMultistatePtr, NIL)
  }

  /**
   * Disables the [Shortcut] of the item at the given [index].
   */
  public fun setItemShortcutDisabled(index: Int, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemShortcutDisabledPtr, NIL)
  }

  /**
   * Toggles the check state of the item at the given [index].
   */
  public fun toggleItemChecked(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleItemCheckedPtr, NIL)
  }

  /**
   * Cycle to the next state of a multistate item. See [addMultistateItem] for details.
   */
  public fun toggleItemMultistate(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.toggleItemMultistatePtr, NIL)
  }

  /**
   * Returns the text of the item at the given [index].
   */
  public fun getItemText(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns item's text base writing direction.
   */
  public fun getItemTextDirection(index: Int): Control.TextDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns item's text language code.
   */
  public fun getItemLanguage(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the icon of the item at the given [index].
   */
  public fun getItemIcon(index: Int): Texture2D? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the maximum allowed width of the icon for the item at the given [index].
   */
  public fun getItemIconMaxWidth(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconMaxWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [Color] modulating the item's icon at the given [index].
   */
  public fun getItemIconModulate(index: Int): Color {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns `true` if the item at the given [index] is checked.
   */
  public fun isItemChecked(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the ID of the item at the given [index]. `id` can be manually assigned, while index can
   * not.
   */
  public fun getItemId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the item containing the specified [id]. Index is automatically assigned to
   * each item by the engine and can not be set manually.
   */
  public fun getItemIndex(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut
   * that can be pressed to trigger the menu button even if it's not currently open. The return value
   * is an integer which is generally a combination of [KeyModifierMask]s and [Key]s using bitwise OR
   * such as `KEY_MASK_CTRL | KEY_A` ([kbd]Ctrl + A[/kbd]). If no accelerator is defined for the
   * specified [index], [getItemAccelerator] returns `0` (corresponding to [@GlobalScope.KEY_NONE]).
   */
  public fun getItemAccelerator(index: Int): Key {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [setItemMetadata], which provides a simple way of assigning context data to items.
   */
  public fun getItemMetadata(index: Int): Any? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the item at the given [index] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [setItemDisabled] for more info on how to disable an item.
   */
  public fun isItemDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the submenu name of the item at the given [index]. See [addSubmenuItem] for more info
   * on how to add a submenu.
   */
  public fun getItemSubmenu(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemSubmenuPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the item is a separator. If it is, it will be displayed as a line. See
   * [addSeparator] for more info on how to add a separator.
   */
  public fun isItemSeparator(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemSeparatorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] is checkable in some way, i.e. if it has a
   * checkbox or radio button.
   * **Note:** Checkable items just display a checkmark or radio button, but don't have any built-in
   * checking behavior and must be checked/unchecked manually.
   */
  public fun isItemCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   */
  public fun isItemRadioCheckable(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the specified item's shortcut is disabled.
   */
  public fun isItemShortcutDisabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemShortcutDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the tooltip associated with the item at the given [index].
   */
  public fun getItemTooltip(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the [Shortcut] associated with the item at the given [index].
   */
  public fun getItemShortcut(index: Int): Shortcut? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemShortcutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shortcut?)
  }

  /**
   * Returns the horizontal offset of the item at the given [index].
   */
  public fun getItemIndent(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the currently focused item as the given [index].
   * Passing `-1` as the index makes so that no item is focused.
   */
  public fun setFocusedItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusedItemPtr, NIL)
  }

  /**
   * Returns the index of the currently focused item. Returns `-1` if no item is focused.
   */
  public fun getFocusedItem(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusedItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves the scroll view to make the item at the given [index] visible.
   */
  public fun scrollToItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToItemPtr, NIL)
  }

  /**
   * Removes the item at the given [index] from the menu.
   * **Note:** The indices of items after the removed item will be shifted by one.
   */
  public fun removeItem(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Adds a separator between items. Separators also occupy an index, which you can set by using the
   * [id] parameter.
   * A [label] can optionally be provided, which will appear at the center of the separator.
   */
  @JvmOverloads
  public fun addSeparator(label: String = "", id: Int = -1): Unit {
    TransferContext.writeArguments(STRING to label, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSeparatorPtr, NIL)
  }

  /**
   * Removes all items from the [PopupMenu]. If [freeSubmenus] is `true`, the submenu nodes are
   * automatically freed.
   */
  @JvmOverloads
  public fun clear(freeSubmenus: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to freeSubmenus)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val activateItemByEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "activate_item_by_event")

    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_item")

    public val addIconItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_icon_item")

    public val addCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_check_item")

    public val addIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_check_item")

    public val addRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_radio_check_item")

    public val addIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_radio_check_item")

    public val addMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_multistate_item")

    public val addShortcutPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_shortcut")

    public val addIconShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_shortcut")

    public val addCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_check_shortcut")

    public val addIconCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_check_shortcut")

    public val addRadioCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_radio_check_shortcut")

    public val addIconRadioCheckShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_icon_radio_check_shortcut")

    public val addSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "add_submenu_item")

    public val setItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_text")

    public val setItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_text_direction")

    public val setItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_language")

    public val setItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon")

    public val setItemIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon_max_width")

    public val setItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_icon_modulate")

    public val setItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_checked")

    public val setItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "set_item_id")

    public val setItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_accelerator")

    public val setItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_metadata")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_disabled")

    public val setItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_submenu")

    public val setItemAsSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_separator")

    public val setItemAsCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_checkable")

    public val setItemAsRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_as_radio_checkable")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_tooltip")

    public val setItemShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_shortcut")

    public val setItemIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_indent")

    public val setItemMultistatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_multistate")

    public val setItemShortcutDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_shortcut_disabled")

    public val toggleItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "toggle_item_checked")

    public val toggleItemMultistatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "toggle_item_multistate")

    public val getItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_text")

    public val getItemTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_text_direction")

    public val getItemLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_language")

    public val getItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon")

    public val getItemIconMaxWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon_max_width")

    public val getItemIconModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_icon_modulate")

    public val isItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_checked")

    public val getItemIdPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "get_item_id")

    public val getItemIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_index")

    public val getItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_accelerator")

    public val getItemMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_metadata")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_disabled")

    public val getItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_submenu")

    public val isItemSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_separator")

    public val isItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_checkable")

    public val isItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_radio_checkable")

    public val isItemShortcutDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_item_shortcut_disabled")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_tooltip")

    public val getItemShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_shortcut")

    public val getItemIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_indent")

    public val setFocusedItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_focused_item")

    public val getFocusedItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_focused_item")

    public val setItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_item_count")

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_item_count")

    public val scrollToItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "scroll_to_item")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "remove_item")

    public val addSeparatorPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "add_separator")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("PopupMenu", "clear")

    public val setHideOnItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_item_selection")

    public val isHideOnItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_item_selection")

    public val setHideOnCheckableItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_checkable_item_selection")

    public val isHideOnCheckableItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_checkable_item_selection")

    public val setHideOnStateItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_hide_on_state_item_selection")

    public val isHideOnStateItemSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "is_hide_on_state_item_selection")

    public val setSubmenuPopupDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_submenu_popup_delay")

    public val getSubmenuPopupDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_submenu_popup_delay")

    public val setAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "set_allow_search")

    public val getAllowSearchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PopupMenu", "get_allow_search")
  }
}
