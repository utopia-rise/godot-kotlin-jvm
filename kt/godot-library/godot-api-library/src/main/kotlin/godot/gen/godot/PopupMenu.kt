// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
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
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_POPUPMENU_INDEX: Int = 499

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
  public val idPressed: Signal1<Long> by Signal1

  /**
   * Emitted when the user navigated to an item of some [id] using the [ProjectSettings.input/uiUp]
   * or [ProjectSettings.input/uiDown] input action.
   */
  public val idFocused: Signal1<Long> by Signal1

  /**
   * Emitted when an item of some [index] is pressed or its accelerator is activated.
   */
  public val indexPressed: Signal1<Long> by Signal1

  /**
   * Emitted when any item is added, modified or removed.
   */
  public val menuChanged: Signal0 by Signal0

  /**
   * If `true`, hides the [PopupMenu] when an item is selected.
   */
  public final inline var hideOnItemSelection: Boolean
    @JvmName("hideOnItemSelectionProperty")
    get() = isHideOnItemSelection()
    @JvmName("hideOnItemSelectionProperty")
    set(`value`) {
      setHideOnItemSelection(value)
    }

  /**
   * If `true`, hides the [PopupMenu] when a checkbox or radio button is selected.
   */
  public final inline var hideOnCheckableItemSelection: Boolean
    @JvmName("hideOnCheckableItemSelectionProperty")
    get() = isHideOnCheckableItemSelection()
    @JvmName("hideOnCheckableItemSelectionProperty")
    set(`value`) {
      setHideOnCheckableItemSelection(value)
    }

  /**
   * If `true`, hides the [PopupMenu] when a state item is selected.
   */
  public final inline var hideOnStateItemSelection: Boolean
    @JvmName("hideOnStateItemSelectionProperty")
    get() = isHideOnStateItemSelection()
    @JvmName("hideOnStateItemSelectionProperty")
    set(`value`) {
      setHideOnStateItemSelection(value)
    }

  /**
   * Sets the delay time in seconds for the submenu item to popup on mouse hovering. If the popup
   * menu is added as a child of another (acting as a submenu), it will inherit the delay time of the
   * parent menu item.
   */
  public final inline var submenuPopupDelay: Float
    @JvmName("submenuPopupDelayProperty")
    get() = getSubmenuPopupDelay()
    @JvmName("submenuPopupDelayProperty")
    set(`value`) {
      setSubmenuPopupDelay(value)
    }

  /**
   * If `true`, allows navigating [PopupMenu] with letter keys.
   */
  public final inline var allowSearch: Boolean
    @JvmName("allowSearchProperty")
    get() = getAllowSearch()
    @JvmName("allowSearchProperty")
    set(`value`) {
      setAllowSearch(value)
    }

  /**
   * If set to one of the values of [NativeMenu.SystemMenus], this [PopupMenu] is bound to the
   * special system menu. Only one [PopupMenu] can be bound to each special menu at a time.
   */
  public final inline var systemMenuId: NativeMenu.SystemMenus
    @JvmName("systemMenuIdProperty")
    get() = getSystemMenu()
    @JvmName("systemMenuIdProperty")
    set(`value`) {
      setSystemMenu(value)
    }

  /**
   * If `true`, [MenuBar] will use native menu when supported.
   * **Note:** If [PopupMenu] is linked to [StatusIndicator], [MenuBar], or another [PopupMenu] item
   * it can use native menu regardless of this property, use [isNativeMenu] to check it.
   */
  public final inline var preferNativeMenu: Boolean
    @JvmName("preferNativeMenuProperty")
    get() = isPreferNativeMenu()
    @JvmName("preferNativeMenuProperty")
    set(`value`) {
      setPreferNativeMenu(value)
    }

  /**
   * The number of items currently in the list.
   */
  public final inline var itemCount: Int
    @JvmName("itemCountProperty")
    get() = getItemCount()
    @JvmName("itemCountProperty")
    set(`value`) {
      setItemCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_POPUPMENU_INDEX, scriptIndex)
  }

  /**
   * Checks the provided [event] against the [PopupMenu]'s shortcuts and accelerators, and activates
   * the first item with matching events. If [forGlobalOnly] is `true`, only shortcuts and accelerators
   * with `global` set to `true` will be called.
   * Returns `true` if an item was successfully activated.
   * **Note:** Certain [Control]s, such as [MenuButton], will call this method automatically.
   */
  @JvmOverloads
  public final fun activateItemByEvent(event: InputEvent?, forGlobalOnly: Boolean = false):
      Boolean {
    Internals.writeArguments(OBJECT to event, BOOL to forGlobalOnly)
    Internals.callMethod(rawPtr, MethodBindings.activateItemByEventPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPreferNativeMenu(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPreferNativeMenuPtr, NIL)
  }

  public final fun isPreferNativeMenu(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPreferNativeMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the system native menu is supported and currently used by this [PopupMenu].
   */
  public final fun isNativeMenu(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isNativeMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
  public final fun addItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addItemPtr, NIL)
  }

  /**
   * Adds a new item with text [label] and icon [texture].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   */
  @JvmOverloads
  public final fun addIconItem(
    texture: Texture2D?,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addIconItemPtr, NIL)
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
  public final fun addCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addCheckItemPtr, NIL)
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
  public final fun addIconCheckItem(
    texture: Texture2D?,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addIconCheckItemPtr, NIL)
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
  public final fun addRadioCheckItem(
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addRadioCheckItemPtr, NIL)
  }

  /**
   * Same as [addIconCheckItem], but uses a radio check button.
   */
  @JvmOverloads
  public final fun addIconRadioCheckItem(
    texture: Texture2D?,
    label: String,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, STRING to label, LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addIconRadioCheckItemPtr, NIL)
  }

  /**
   * Adds a new multistate item with text [label].
   * Contrarily to normal binary items, multistate items can have more than two states, as defined
   * by [maxStates]. The default value is defined by [defaultState].
   * An [id] can optionally be provided, as well as an accelerator ([accel]). If no [id] is
   * provided, one will be created from the index. If no [accel] is provided, then the default value of
   * 0 (corresponding to [@GlobalScope.KEY_NONE]) will be assigned to the item (which means it won't
   * have any accelerator). See [getItemAccelerator] for more info on accelerators.
   * **Note:** Multistate items don't update their state automatically and must be done manually.
   * See [toggleItemMultistate], [setItemMultistate] and [getItemMultistate] for more info on how to
   * control it.
   * Example usage:
   * [codeblock]
   * func _ready():
   *     add_multistate_item("Item", 3, 0)
   *
   *     index_pressed.connect(func(index: int):
   *             toggle_item_multistate(index)
   *             match get_item_multistate(index):
   *                 0:
   *                     print("First state")
   *                 1:
   *                     print("Second state")
   *                 2:
   *                     print("Third state")
   *         )
   * [/codeblock]
   */
  @JvmOverloads
  public final fun addMultistateItem(
    label: String,
    maxStates: Int,
    defaultState: Int = 0,
    id: Int = -1,
    accel: Key = Key.KEY_NONE,
  ): Unit {
    Internals.writeArguments(STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), LONG to id.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.addMultistateItemPtr, NIL)
  }

  /**
   * Adds a [Shortcut].
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   * If [allowEcho] is `true`, the shortcut can be activated with echo events.
   */
  @JvmOverloads
  public final fun addShortcut(
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
    allowEcho: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global, BOOL to allowEcho)
    Internals.callMethod(rawPtr, MethodBindings.addShortcutPtr, NIL)
  }

  /**
   * Adds a new item and assigns the specified [Shortcut] and icon [texture] to it. Sets the label
   * of the checkbox to the [Shortcut]'s name.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   * If [allowEcho] is `true`, the shortcut can be activated with echo events.
   */
  @JvmOverloads
  public final fun addIconShortcut(
    texture: Texture2D?,
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
    allowEcho: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global, BOOL to allowEcho)
    Internals.callMethod(rawPtr, MethodBindings.addIconShortcutPtr, NIL)
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
  public final fun addCheckShortcut(
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    Internals.callMethod(rawPtr, MethodBindings.addCheckShortcutPtr, NIL)
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
  public final fun addIconCheckShortcut(
    texture: Texture2D?,
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    Internals.callMethod(rawPtr, MethodBindings.addIconCheckShortcutPtr, NIL)
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
  public final fun addRadioCheckShortcut(
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    Internals.callMethod(rawPtr, MethodBindings.addRadioCheckShortcutPtr, NIL)
  }

  /**
   * Same as [addIconCheckShortcut], but uses a radio check button.
   */
  @JvmOverloads
  public final fun addIconRadioCheckShortcut(
    texture: Texture2D?,
    shortcut: Shortcut?,
    id: Int = -1,
    global: Boolean = false,
  ): Unit {
    Internals.writeArguments(OBJECT to texture, OBJECT to shortcut, LONG to id.toLong(), BOOL to global)
    Internals.callMethod(rawPtr, MethodBindings.addIconRadioCheckShortcutPtr, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the parent [PopupMenu] node when clicked. The
   * [submenu] argument must be the name of an existing [PopupMenu] that has been added as a child to
   * this node. This submenu will be shown when the item is clicked, hovered for long enough, or
   * activated using the `ui_select` or `ui_right` input actions.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   */
  @JvmOverloads
  public final fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int = -1,
  ): Unit {
    Internals.writeArguments(STRING to label, STRING to submenu, LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addSubmenuItemPtr, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the parent [PopupMenu] node when clicked. This
   * submenu will be shown when the item is clicked, hovered for long enough, or activated using the
   * `ui_select` or `ui_right` input actions.
   * [submenu] must be either child of this [PopupMenu] or has no parent node (in which case it will
   * be automatically added as a child). If the [submenu] popup has another parent, this method will
   * fail.
   * An [id] can optionally be provided. If no [id] is provided, one will be created from the index.
   */
  @JvmOverloads
  public final fun addSubmenuNodeItem(
    label: String,
    submenu: PopupMenu?,
    id: Int = -1,
  ): Unit {
    Internals.writeArguments(STRING to label, OBJECT to submenu, LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addSubmenuNodeItemPtr, NIL)
  }

  /**
   * Sets the text of the item at the given [index].
   */
  public final fun setItemText(index: Int, text: String): Unit {
    Internals.writeArguments(LONG to index.toLong(), STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Sets item's text base writing direction.
   */
  public final fun setItemTextDirection(index: Int, direction: Control.TextDirection): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setItemTextDirectionPtr, NIL)
  }

  /**
   * Sets language code of item's text used for line-breaking and text shaping algorithms, if left
   * empty current locale is used instead.
   */
  public final fun setItemLanguage(index: Int, language: String): Unit {
    Internals.writeArguments(LONG to index.toLong(), STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setItemLanguagePtr, NIL)
  }

  /**
   * Replaces the [Texture2D] icon of the item at the given [index].
   */
  public final fun setItemIcon(index: Int, icon: Texture2D?): Unit {
    Internals.writeArguments(LONG to index.toLong(), OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Sets the maximum allowed width of the icon for the item at the given [index]. This limit is
   * applied on top of the default size of the icon and on top of [theme_item icon_max_width]. The
   * height is adjusted according to the icon's ratio.
   */
  public final fun setItemIconMaxWidth(index: Int, width: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemIconMaxWidthPtr, NIL)
  }

  /**
   * Sets a modulating [Color] of the item's icon at the given [index].
   */
  public final fun setItemIconModulate(index: Int, modulate: Color): Unit {
    Internals.writeArguments(LONG to index.toLong(), COLOR to modulate)
    Internals.callMethod(rawPtr, MethodBindings.setItemIconModulatePtr, NIL)
  }

  /**
   * Sets the checkstate status of the item at the given [index].
   */
  public final fun setItemChecked(index: Int, checked: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to checked)
    Internals.callMethod(rawPtr, MethodBindings.setItemCheckedPtr, NIL)
  }

  /**
   * Sets the [id] of the item at the given [index].
   * The [id] is used in [signal id_pressed] and [signal id_focused] signals.
   */
  public final fun setItemId(index: Int, id: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemIdPtr, NIL)
  }

  /**
   * Sets the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut
   * that can be pressed to trigger the menu button even if it's not currently open. [accel] is
   * generally a combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL |
   * KEY_A` ([kbd]Ctrl + A[/kbd]).
   */
  public final fun setItemAccelerator(index: Int, accel: Key): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to accel.id)
    Internals.callMethod(rawPtr, MethodBindings.setItemAcceleratorPtr, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with
   * [getItemMetadata], which provides a simple way of assigning context data to items.
   */
  public final fun setItemMetadata(index: Int, metadata: Any?): Unit {
    Internals.writeArguments(LONG to index.toLong(), ANY to metadata)
    Internals.callMethod(rawPtr, MethodBindings.setItemMetadataPtr, NIL)
  }

  /**
   * Enables/disables the item at the given [index]. When it is disabled, it can't be selected and
   * its action can't be invoked.
   */
  public final fun setItemDisabled(index: Int, disabled: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Sets the submenu of the item at the given [index]. The submenu is the name of a child
   * [PopupMenu] node that would be shown when the item is clicked.
   */
  public final fun setItemSubmenu(index: Int, submenu: String): Unit {
    Internals.writeArguments(LONG to index.toLong(), STRING to submenu)
    Internals.callMethod(rawPtr, MethodBindings.setItemSubmenuPtr, NIL)
  }

  /**
   * Sets the submenu of the item at the given [index]. The submenu is a [PopupMenu] node that would
   * be shown when the item is clicked. It must either be a child of this [PopupMenu] or has no parent
   * (in which case it will be automatically added as a child). If the [submenu] popup has another
   * parent, this method will fail.
   */
  public final fun setItemSubmenuNode(index: Int, submenu: PopupMenu?): Unit {
    Internals.writeArguments(LONG to index.toLong(), OBJECT to submenu)
    Internals.callMethod(rawPtr, MethodBindings.setItemSubmenuNodePtr, NIL)
  }

  /**
   * Mark the item at the given [index] as a separator, which means that it would be displayed as a
   * line. If `false`, sets the type of the item to plain text.
   */
  public final fun setItemAsSeparator(index: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setItemAsSeparatorPtr, NIL)
  }

  /**
   * Sets whether the item at the given [index] has a checkbox. If `false`, sets the type of the
   * item to plain text.
   * **Note:** Checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually.
   */
  public final fun setItemAsCheckable(index: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setItemAsCheckablePtr, NIL)
  }

  /**
   * Sets the type of the item at the given [index] to radio button. If `false`, sets the type of
   * the item to plain text.
   */
  public final fun setItemAsRadioCheckable(index: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setItemAsRadioCheckablePtr, NIL)
  }

  /**
   * Sets the [String] tooltip of the item at the given [index].
   */
  public final fun setItemTooltip(index: Int, tooltip: String): Unit {
    Internals.writeArguments(LONG to index.toLong(), STRING to tooltip)
    Internals.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Sets a [Shortcut] for the item at the given [index].
   */
  @JvmOverloads
  public final fun setItemShortcut(
    index: Int,
    shortcut: Shortcut?,
    global: Boolean = false,
  ): Unit {
    Internals.writeArguments(LONG to index.toLong(), OBJECT to shortcut, BOOL to global)
    Internals.callMethod(rawPtr, MethodBindings.setItemShortcutPtr, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [index].
   */
  public final fun setItemIndent(index: Int, indent: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to indent.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemIndentPtr, NIL)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   */
  public final fun setItemMultistate(index: Int, state: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to state.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemMultistatePtr, NIL)
  }

  /**
   * Sets the max states of a multistate item. See [addMultistateItem] for details.
   */
  public final fun setItemMultistateMax(index: Int, maxStates: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to maxStates.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemMultistateMaxPtr, NIL)
  }

  /**
   * Disables the [Shortcut] of the item at the given [index].
   */
  public final fun setItemShortcutDisabled(index: Int, disabled: Boolean): Unit {
    Internals.writeArguments(LONG to index.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setItemShortcutDisabledPtr, NIL)
  }

  /**
   * Toggles the check state of the item at the given [index].
   */
  public final fun toggleItemChecked(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.toggleItemCheckedPtr, NIL)
  }

  /**
   * Cycle to the next state of a multistate item. See [addMultistateItem] for details.
   */
  public final fun toggleItemMultistate(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.toggleItemMultistatePtr, NIL)
  }

  /**
   * Returns the text of the item at the given [index].
   */
  public final fun getItemText(index: Int): String {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns item's text base writing direction.
   */
  public final fun getItemTextDirection(index: Int): Control.TextDirection {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTextDirectionPtr, LONG)
    return Control.TextDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns item's text language code.
   */
  public final fun getItemLanguage(index: Int): String {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the icon of the item at the given [index].
   */
  public final fun getItemIcon(index: Int): Texture2D? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the maximum allowed width of the icon for the item at the given [index].
   */
  public final fun getItemIconMaxWidth(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIconMaxWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [Color] modulating the item's icon at the given [index].
   */
  public final fun getItemIconModulate(index: Int): Color {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIconModulatePtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns `true` if the item at the given [index] is checked.
   */
  public final fun isItemChecked(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemCheckedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the ID of the item at the given [index]. `id` can be manually assigned, while index can
   * not.
   */
  public final fun getItemId(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item containing the specified [id]. Index is automatically assigned to
   * each item by the engine and can not be set manually.
   */
  public final fun getItemIndex(id: Int): Int {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the accelerator of the item at the given [index]. An accelerator is a keyboard shortcut
   * that can be pressed to trigger the menu button even if it's not currently open. The return value
   * is an integer which is generally a combination of [KeyModifierMask]s and [Key]s using bitwise OR
   * such as `KEY_MASK_CTRL | KEY_A` ([kbd]Ctrl + A[/kbd]). If no accelerator is defined for the
   * specified [index], [getItemAccelerator] returns `0` (corresponding to [@GlobalScope.KEY_NONE]).
   */
  public final fun getItemAccelerator(index: Int): Key {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [setItemMetadata], which provides a simple way of assigning context data to items.
   */
  public final fun getItemMetadata(index: Int): Any? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMetadataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if the item at the given [index] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [setItemDisabled] for more info on how to disable an item.
   */
  public final fun isItemDisabled(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the submenu name of the item at the given [index]. See [addSubmenuItem] for more info
   * on how to add a submenu.
   */
  public final fun getItemSubmenu(index: Int): String {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemSubmenuPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the submenu of the item at the given [index], or `null` if no submenu was added. See
   * [addSubmenuNodeItem] for more info on how to add a submenu.
   */
  public final fun getItemSubmenuNode(index: Int): PopupMenu? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemSubmenuNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PopupMenu?)
  }

  /**
   * Returns `true` if the item is a separator. If it is, it will be displayed as a line. See
   * [addSeparator] for more info on how to add a separator.
   */
  public final fun isItemSeparator(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemSeparatorPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] is checkable in some way, i.e. if it has a
   * checkbox or radio button.
   * **Note:** Checkable items just display a checkmark or radio button, but don't have any built-in
   * checking behavior and must be checked/unchecked manually.
   */
  public final fun isItemCheckable(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemCheckablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at the given [index] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   */
  public final fun isItemRadioCheckable(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the specified item's shortcut is disabled.
   */
  public final fun isItemShortcutDisabled(index: Int): Boolean {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemShortcutDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the tooltip associated with the item at the given [index].
   */
  public final fun getItemTooltip(index: Int): String {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the [Shortcut] associated with the item at the given [index].
   */
  public final fun getItemShortcut(index: Int): Shortcut? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemShortcutPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Shortcut?)
  }

  /**
   * Returns the horizontal offset of the item at the given [index].
   */
  public final fun getItemIndent(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIndentPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the max states of the item at the given [index].
   */
  public final fun getItemMultistateMax(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMultistateMaxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the state of the item at the given [index].
   */
  public final fun getItemMultistate(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMultistatePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the currently focused item as the given [index].
   * Passing `-1` as the index makes so that no item is focused.
   */
  public final fun setFocusedItem(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFocusedItemPtr, NIL)
  }

  /**
   * Returns the index of the currently focused item. Returns `-1` if no item is focused.
   */
  public final fun getFocusedItem(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFocusedItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setItemCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemCountPtr, NIL)
  }

  public final fun getItemCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Moves the scroll view to make the item at the given [index] visible.
   */
  public final fun scrollToItem(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.scrollToItemPtr, NIL)
  }

  /**
   * Removes the item at the given [index] from the menu.
   * **Note:** The indices of items after the removed item will be shifted by one.
   */
  public final fun removeItem(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Adds a separator between items. Separators also occupy an index, which you can set by using the
   * [id] parameter.
   * A [label] can optionally be provided, which will appear at the center of the separator.
   */
  @JvmOverloads
  public final fun addSeparator(label: String = "", id: Int = -1): Unit {
    Internals.writeArguments(STRING to label, LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addSeparatorPtr, NIL)
  }

  /**
   * Removes all items from the [PopupMenu]. If [freeSubmenus] is `true`, the submenu nodes are
   * automatically freed.
   */
  @JvmOverloads
  public final fun clear(freeSubmenus: Boolean = false): Unit {
    Internals.writeArguments(BOOL to freeSubmenus)
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public final fun setHideOnItemSelection(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHideOnItemSelectionPtr, NIL)
  }

  public final fun isHideOnItemSelection(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHideOnItemSelectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHideOnCheckableItemSelection(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHideOnCheckableItemSelectionPtr, NIL)
  }

  public final fun isHideOnCheckableItemSelection(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHideOnCheckableItemSelectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHideOnStateItemSelection(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHideOnStateItemSelectionPtr, NIL)
  }

  public final fun isHideOnStateItemSelection(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHideOnStateItemSelectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSubmenuPopupDelay(seconds: Float): Unit {
    Internals.writeArguments(DOUBLE to seconds.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSubmenuPopupDelayPtr, NIL)
  }

  public final fun getSubmenuPopupDelay(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSubmenuPopupDelayPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAllowSearch(allow: Boolean): Unit {
    Internals.writeArguments(BOOL to allow)
    Internals.callMethod(rawPtr, MethodBindings.setAllowSearchPtr, NIL)
  }

  public final fun getAllowSearch(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAllowSearchPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the menu is bound to the special system menu.
   */
  public final fun isSystemMenu(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSystemMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSystemMenu(systemMenuId: NativeMenu.SystemMenus): Unit {
    Internals.writeArguments(LONG to systemMenuId.id)
    Internals.callMethod(rawPtr, MethodBindings.setSystemMenuPtr, NIL)
  }

  public final fun getSystemMenu(): NativeMenu.SystemMenus {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSystemMenuPtr, LONG)
    return NativeMenu.SystemMenus.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val activateItemByEventPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "activate_item_by_event", 3716412023)

    internal val setPreferNativeMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_prefer_native_menu", 2586408642)

    internal val isPreferNativeMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_prefer_native_menu", 36873697)

    internal val isNativeMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_native_menu", 36873697)

    internal val addItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_item", 3674230041)

    internal val addIconItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_item", 1086190128)

    internal val addCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_check_item", 3674230041)

    internal val addIconCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_check_item", 1086190128)

    internal val addRadioCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_radio_check_item", 3674230041)

    internal val addIconRadioCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_radio_check_item", 1086190128)

    internal val addMultistateItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_multistate_item", 150780458)

    internal val addShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_shortcut", 3451850107)

    internal val addIconShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_shortcut", 2997871092)

    internal val addCheckShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_check_shortcut", 1642193386)

    internal val addIconCheckShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_check_shortcut", 3856247530)

    internal val addRadioCheckShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_radio_check_shortcut", 1642193386)

    internal val addIconRadioCheckShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_icon_radio_check_shortcut", 3856247530)

    internal val addSubmenuItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_submenu_item", 2979222410)

    internal val addSubmenuNodeItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_submenu_node_item", 1325455216)

    internal val setItemTextPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_text", 501894301)

    internal val setItemTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_text_direction", 1707680378)

    internal val setItemLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_language", 501894301)

    internal val setItemIconPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_icon", 666127730)

    internal val setItemIconMaxWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_icon_max_width", 3937882851)

    internal val setItemIconModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_icon_modulate", 2878471219)

    internal val setItemCheckedPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_checked", 300928843)

    internal val setItemIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_id", 3937882851)

    internal val setItemAcceleratorPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_accelerator", 2992817551)

    internal val setItemMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_metadata", 2152698145)

    internal val setItemDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_disabled", 300928843)

    internal val setItemSubmenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_submenu", 501894301)

    internal val setItemSubmenuNodePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_submenu_node", 1068370740)

    internal val setItemAsSeparatorPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_as_separator", 300928843)

    internal val setItemAsCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_as_checkable", 300928843)

    internal val setItemAsRadioCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_as_radio_checkable", 300928843)

    internal val setItemTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_tooltip", 501894301)

    internal val setItemShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_shortcut", 825127832)

    internal val setItemIndentPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_indent", 3937882851)

    internal val setItemMultistatePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_multistate", 3937882851)

    internal val setItemMultistateMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_multistate_max", 3937882851)

    internal val setItemShortcutDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_shortcut_disabled", 300928843)

    internal val toggleItemCheckedPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "toggle_item_checked", 1286410249)

    internal val toggleItemMultistatePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "toggle_item_multistate", 1286410249)

    internal val getItemTextPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_text", 844755477)

    internal val getItemTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_text_direction", 4235602388)

    internal val getItemLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_language", 844755477)

    internal val getItemIconPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_icon", 3536238170)

    internal val getItemIconMaxWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_icon_max_width", 923996154)

    internal val getItemIconModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_icon_modulate", 3457211756)

    internal val isItemCheckedPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_checked", 1116898809)

    internal val getItemIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_id", 923996154)

    internal val getItemIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_index", 923996154)

    internal val getItemAcceleratorPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_accelerator", 253789942)

    internal val getItemMetadataPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_metadata", 4227898402)

    internal val isItemDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_disabled", 1116898809)

    internal val getItemSubmenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_submenu", 844755477)

    internal val getItemSubmenuNodePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_submenu_node", 2100501353)

    internal val isItemSeparatorPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_separator", 1116898809)

    internal val isItemCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_checkable", 1116898809)

    internal val isItemRadioCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_radio_checkable", 1116898809)

    internal val isItemShortcutDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_item_shortcut_disabled", 1116898809)

    internal val getItemTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_tooltip", 844755477)

    internal val getItemShortcutPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_shortcut", 1449483325)

    internal val getItemIndentPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_indent", 923996154)

    internal val getItemMultistateMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_multistate_max", 923996154)

    internal val getItemMultistatePtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_multistate", 923996154)

    internal val setFocusedItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_focused_item", 1286410249)

    internal val getFocusedItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_focused_item", 3905245786)

    internal val setItemCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_item_count", 1286410249)

    internal val getItemCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_item_count", 3905245786)

    internal val scrollToItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "scroll_to_item", 1286410249)

    internal val removeItemPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "remove_item", 1286410249)

    internal val addSeparatorPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "add_separator", 2266703459)

    internal val clearPtr: VoidPtr = Internals.getMethodBindPtr("PopupMenu", "clear", 107499316)

    internal val setHideOnItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_hide_on_item_selection", 2586408642)

    internal val isHideOnItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_hide_on_item_selection", 36873697)

    internal val setHideOnCheckableItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_hide_on_checkable_item_selection", 2586408642)

    internal val isHideOnCheckableItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_hide_on_checkable_item_selection", 36873697)

    internal val setHideOnStateItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_hide_on_state_item_selection", 2586408642)

    internal val isHideOnStateItemSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_hide_on_state_item_selection", 36873697)

    internal val setSubmenuPopupDelayPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_submenu_popup_delay", 373806689)

    internal val getSubmenuPopupDelayPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_submenu_popup_delay", 1740695150)

    internal val setAllowSearchPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_allow_search", 2586408642)

    internal val getAllowSearchPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_allow_search", 36873697)

    internal val isSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "is_system_menu", 36873697)

    internal val setSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "set_system_menu", 600639674)

    internal val getSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("PopupMenu", "get_system_menu", 1222557358)
  }
}
