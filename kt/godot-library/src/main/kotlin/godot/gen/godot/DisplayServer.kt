// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType.VECTOR3I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Singleton for window management functions.
 *
 * [godot.DisplayServer] handles everything related to window management. This is separated from [OS] as a single operating system may support multiple display servers.
 *
 * **Headless mode:** Starting the engine with the `--headless` [command line argument]($DOCS_URL/tutorials/editor/command_line_tutorial.html) disables all rendering and window management functions. Most functions from [godot.DisplayServer] will return dummy values in this case.
 */
@GodotBaseType
public object DisplayServer : Object() {
  /**
   * Represents the primary screen.
   */
  public final const val SCREEN_PRIMARY: Long = -2

  /**
   * Represents the screen where the main window is located. This is usually the default value in functions that allow specifying one of several screens.
   */
  public final const val SCREEN_OF_MAIN_WINDOW: Long = -1

  /**
   * The ID of the main window spawned by the engine, which can be passed to methods expecting a `window_id`.
   */
  public final const val MAIN_WINDOW_ID: Long = 0

  /**
   * The ID that refers to a nonexisting window. This is be returned by some [godot.DisplayServer] methods if no window matches the requested result.
   */
  public final const val INVALID_WINDOW_ID: Long = -1

  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_DISPLAYSERVER)
    return false
  }

  /**
   * Returns `true` if the specified [feature] is supported by the current [godot.DisplayServer], `false` otherwise.
   */
  public fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the name of the [godot.DisplayServer] currently in use. Most operating systems only have a single [godot.DisplayServer], but Linux has access to more than one [godot.DisplayServer] (although only X11 is currently implemented in Godot).
   *
   * The names of built-in display servers are `Windows`, `macOS`, `X11` (Linux), `Android`, `iOS`, `web` (HTML5) and `headless` (when started with the `--headless` [command line argument]($DOCS_URL/tutorials/editor/command_line_tutorial.html)).
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Adds an item that will act as a submenu of the global menu [menuRoot]. The [submenu] argument is the ID of the global menu root that will be shown when the item is clicked.
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddSubmenuItem(
    menuRoot: String,
    label: String,
    submenu: String,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, STRING to submenu, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_SUBMENU_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new item with text [label] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_ITEM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new checkable item with text [label] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_CHECK_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new item with text [label] and icon [icon] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddIconItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_ICON_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new checkable item with text [label] and icon [icon] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddIconCheckItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_ICON_CHECK_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new radio-checkable item with text [label] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [globalMenuSetItemChecked] for more info on how to control it.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddRadioCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_RADIO_CHECK_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new radio-checkable item with text [label] and icon [icon] to the global menu with ID [menuRoot].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking behavior and must be checked/unchecked manually. See [globalMenuSetItemChecked] for more info on how to control it.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddIconRadioCheckItem(
    menuRoot: String,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_ICON_RADIO_CHECK_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new item with text [labe] to the global menu with ID [menuRoot].
   *
   * Contrarily to normal binary items, multistate items can have more than two states, as defined by [maxStates]. Each press or activate of the item will increase the state by one. The default value is defined by [defaultState].
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** By default, there's no indication of the current item state, it should be changed manually.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddMultistateItem(
    menuRoot: String,
    labe: String,
    maxStates: Long,
    defaultState: Long,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Long = -1
  ): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to labe, LONG to maxStates, LONG to defaultState, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_MULTISTATE_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a separator between items to the global menu with ID [menuRoot]. Separators also occupy an index.
   *
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuAddSeparator(menuRoot: String, index: Long = -1): Long {
    TransferContext.writeArguments(STRING to menuRoot, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_SEPARATOR, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item with the specified [text]. Index is automatically assigned to each item by the engine. Index can not be set manually.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemIndexFromText(menuRoot: String, text: String): Long {
    TransferContext.writeArguments(STRING to menuRoot, STRING to text)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_INDEX_FROM_TEXT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the item with the specified [tag]. Index is automatically assigned to each item by the engine. Index can not be set manually.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemIndexFromTag(menuRoot: String, tag: Any): Long {
    TransferContext.writeArguments(STRING to menuRoot, ANY to tag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_INDEX_FROM_TAG, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the item at index [idx] is checked.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuIsItemChecked(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index [idx] is checkable in some way, i.e. if it has a checkbox or radio button.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuIsItemCheckable(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_CHECKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the item at index [idx] has radio button-style checkability.
   *
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in radio groups.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuIsItemRadioCheckable(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_RADIO_CHECKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the callback of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemCallback(menuRoot: String, idx: Long): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_CALLBACK, CALLABLE)
    return TransferContext.readReturnValue(CALLABLE, false) as Callable
  }

  /**
   * Returns the callback of the item accelerator at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemKeyCallback(menuRoot: String, idx: Long): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_KEY_CALLBACK, CALLABLE)
    return TransferContext.readReturnValue(CALLABLE, false) as Callable
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with [globalMenuSetItemTag], which provides a simple way of assigning context data to items.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemTag(menuRoot: String, idx: Long): Any? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_TAG, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the text of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemText(menuRoot: String, idx: Long): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the submenu ID of the item at index [idx]. See [globalMenuAddSubmenuItem] for more info on how to add a submenu.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemSubmenu(menuRoot: String, idx: Long): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_SUBMENU, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the accelerator of the item at index [idx]. Accelerators are special combinations of keys that activate the item, no matter which control is focused.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemAccelerator(menuRoot: String, idx: Long): Key {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_ACCELERATOR, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the item at index [idx] is disabled. When it is disabled it can't be selected, or its action invoked.
   *
   * See [globalMenuSetItemDisabled] for more info on how to disable an item.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuIsItemDisabled(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the tooltip associated with the specified index index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemTooltip(menuRoot: String, idx: Long): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the state of an multistate item. See [globalMenuAddMultistateItem] for details.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemState(menuRoot: String, idx: Long): Long {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_STATE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns number of states of an multistate item. See [globalMenuAddMultistateItem] for details.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemMaxStates(menuRoot: String, idx: Long): Long {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_MAX_STATES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the icon of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemIcon(menuRoot: String, idx: Long): Texture2D? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns the horizontal offset of the item at the given [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemIndentationLevel(menuRoot: String, idx: Long): Long {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_INDENTATION_LEVEL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the checkstate status of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemChecked(
    menuRoot: String,
    idx: Long,
    checked: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to checked)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CHECKED, NIL)
  }

  /**
   * Sets whether the item at index [idx] has a checkbox. If `false`, sets the type of the item to plain text.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemCheckable(
    menuRoot: String,
    idx: Long,
    checkable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to checkable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CHECKABLE, NIL)
  }

  /**
   * Sets the type of the item at the specified index [idx] to radio button. If `false`, sets the type of the item to plain text
   *
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in radio groups.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemRadioCheckable(
    menuRoot: String,
    idx: Long,
    checkable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to checkable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_RADIO_CHECKABLE, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when an item is pressed.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemCallback(
    menuRoot: String,
    idx: Long,
    callback: Callable
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CALLBACK, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when its accelerator is activated.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemKeyCallback(
    menuRoot: String,
    idx: Long,
    keyCallback: Callable
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, CALLABLE to keyCallback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_KEY_CALLBACK, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [globalMenuGetItemTag], which provides a simple way of assigning context data to items.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemTag(
    menuRoot: String,
    idx: Long,
    tag: Any
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, ANY to tag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_TAG, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemText(
    menuRoot: String,
    idx: Long,
    text: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_TEXT, NIL)
  }

  /**
   * Sets the submenu of the item at index [idx]. The submenu is the ID of a global menu root that would be shown when the item is clicked.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemSubmenu(
    menuRoot: String,
    idx: Long,
    submenu: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, STRING to submenu)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_SUBMENU, NIL)
  }

  /**
   * Sets the accelerator of the item at index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemAccelerator(
    menuRoot: String,
    idx: Long,
    keycode: Key
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, LONG to keycode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_ACCELERATOR, NIL)
  }

  /**
   * Enables/disables the item at index [idx]. When it is disabled, it can't be selected and its action can't be invoked.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemDisabled(
    menuRoot: String,
    idx: Long,
    disabled: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_DISABLED, NIL)
  }

  /**
   * Sets the [godot.String] tooltip of the item at the specified index [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemTooltip(
    menuRoot: String,
    idx: Long,
    tooltip: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, STRING to tooltip)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_TOOLTIP, NIL)
  }

  /**
   * Sets the state of an multistate item. See [globalMenuAddMultistateItem] for details.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemState(
    menuRoot: String,
    idx: Long,
    state: Long
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, LONG to state)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_STATE, NIL)
  }

  /**
   * Sets number of state of an multistate item. See [globalMenuAddMultistateItem] for details.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemMaxStates(
    menuRoot: String,
    idx: Long,
    maxStates: Long
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, LONG to maxStates)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_MAX_STATES, NIL)
  }

  /**
   * Replaces the [godot.Texture2D] icon of the specified [idx].
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Note:** This method is not supported by macOS "_dock" menu items.
   */
  public fun globalMenuSetItemIcon(
    menuRoot: String,
    idx: Long,
    icon: Texture2D
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, OBJECT to icon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_ICON, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [idx].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuSetItemIndentationLevel(
    menuRoot: String,
    idx: Long,
    level: Long
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, LONG to level)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_INDENTATION_LEVEL, NIL)
  }

  /**
   * Returns number of items in the global menu with ID [menuRoot].
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuGetItemCount(menuRoot: String): Long {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the item at index [idx] from the global menu [menuRoot].
   *
   * **Note:** The indices of items after the removed item will be shifted by one.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuRemoveItem(menuRoot: String, idx: Long): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_REMOVE_ITEM, NIL)
  }

  /**
   * Removes all items from the global menu with ID [menuRoot].
   *
   * **Note:** This method is implemented on macOS.
   *
   * **Supported system menu IDs:**
   *
   * ```
   * 				"_main" - Main menu (macOS).
   * 				"_dock" - Dock popup menu (macOS).
   * 				```
   */
  public fun globalMenuClear(menuRoot: String): Unit {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_CLEAR,
        NIL)
  }

  /**
   * Returns `true` if the synthesizer is generating speech, or have utterance waiting in the queue.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsIsSpeaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_IS_SPEAKING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the synthesizer is in a paused state.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsIsPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_IS_PAUSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an [godot.Array] of voice information dictionaries.
   *
   * Each [godot.core.Dictionary] contains two [godot.String] entries:
   *
   * - `name` is voice name.
   *
   * - `id` is voice identifier.
   *
   * - `language` is language code in `lang_Variant` format. `lang` part is a 2 or 3-letter code based on the ISO-639 standard, in lowercase. And `Variant` part is an engine dependent string describing country, region or/and dialect.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsGetVoices(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_GET_VOICES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns an [godot.PackedStringArray] of voice identifiers for the [language].
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsGetVoicesForLanguage(language: String): PackedStringArray {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_GET_VOICES_FOR_LANGUAGE, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Adds an utterance to the queue. If [interrupt] is `true`, the queue is cleared first.
   *
   * - [voice] identifier is one of the `"id"` values returned by [ttsGetVoices] or one of the values returned by [ttsGetVoicesForLanguage].
   *
   * - [volume] ranges from `0` (lowest) to `100` (highest).
   *
   * - [pitch] ranges from `0.0` (lowest) to `2.0` (highest), `1.0` is default pitch for the current voice.
   *
   * - [rate] ranges from `0.1` (lowest) to `10.0` (highest), `1.0` is a normal speaking rate. Other values act as a percentage relative.
   *
   * - [utteranceId] is passed as a parameter to the callback functions.
   *
   * **Note:** On Windows and Linux (X11), utterance [text] can use SSML markup. SSML support is engine and voice dependent. If the engine does not support SSML, you should strip out all XML markup before calling [ttsSpeak].
   *
   * **Note:** The granularity of pitch, rate, and volume is engine and voice dependent. Values may be truncated.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsSpeak(
    text: String,
    voice: String,
    volume: Long = 50,
    pitch: Double = 1.0,
    rate: Double = 1.0,
    utteranceId: Long = 0,
    interrupt: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to text, STRING to voice, LONG to volume, DOUBLE to pitch, DOUBLE to rate, LONG to utteranceId, BOOL to interrupt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_SPEAK, NIL)
  }

  /**
   * Puts the synthesizer into a paused state.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsPause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_PAUSE, NIL)
  }

  /**
   * Resumes the synthesizer if it was paused.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsResume(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_RESUME, NIL)
  }

  /**
   * Stops synthesis in progress and removes all utterances from the queue.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsStop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_STOP, NIL)
  }

  /**
   * Adds a callback, which is called when the utterance has started, finished, canceled or reached a text boundary.
   *
   * - [TTS_UTTERANCE_STARTED], [TTS_UTTERANCE_ENDED], and [TTS_UTTERANCE_CANCELED] callable's method should take one [int] parameter, the utterance id.
   *
   * - [TTS_UTTERANCE_BOUNDARY] callable's method should take two [int] parameters, the index of the character and the utterance id.
   *
   * **Note:** The granularity of the boundary callbacks is engine dependent.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11), macOS, and Windows.
   */
  public fun ttsSetUtteranceCallback(event: TTSUtteranceEvent, callable: Callable): Unit {
    TransferContext.writeArguments(LONG to event.id, CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TTS_SET_UTTERANCE_CALLBACK, NIL)
  }

  /**
   * Returns `true` if OS supports dark mode.
   *
   * **Note:** This method is implemented on macOS, Windows and Linux (X11).
   */
  public fun isDarkModeSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IS_DARK_MODE_SUPPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if OS is using dark mode.
   *
   * **Note:** This method is implemented on macOS, Windows and Linux (X11).
   */
  public fun isDarkMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IS_DARK_MODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns OS theme accent color. Returns `Color(0, 0, 0, 0)`, if accent color is unknown.
   *
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getAccentColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_ACCENT_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets the current mouse mode. See also [mouseGetMode].
   */
  public fun mouseSetMode(mouseMode: MouseMode): Unit {
    TransferContext.writeArguments(LONG to mouseMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_SET_MODE, NIL)
  }

  /**
   * Returns the current mouse mode. See also [mouseSetMode].
   */
  public fun mouseGetMode(): MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_MODE, LONG)
    return DisplayServer.MouseMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the mouse cursor position to the given [position] relative to an origin at the upper left corner of the currently focused game Window Manager window.
   */
  public fun warpMouse(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WARP_MOUSE, NIL)
  }

  /**
   * Returns the mouse cursor's current position.
   */
  public fun mouseGetPosition(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the current state of mouse buttons (whether each button is pressed) as a bitmask. If multiple mouse buttons are pressed at the same time, the bits are added together. Equivalent to [godot.Input.getMouseButtonMask].
   */
  public fun mouseGetButtonState(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_BUTTON_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, false) as Long
  }

  /**
   * Sets the user's clipboard content to the given string.
   */
  public fun clipboardSet(clipboard: String): Unit {
    TransferContext.writeArguments(STRING to clipboard)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_SET, NIL)
  }

  /**
   * Returns the user's clipboard as a string if possible.
   */
  public fun clipboardGet(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_GET, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if there is content on the user's clipboard.
   */
  public fun clipboardHas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the user's [primary](https://unix.stackexchange.com/questions/139191/whats-the-difference-between-primary-selection-and-clipboard-buffer) clipboard content to the given string. This is the clipboard that is set when the user selects text in any application, rather than when pressing [kbd]Ctrl + C[/kbd]. The clipboard data can then be pasted by clicking the middle mouse button in any application that supports the primary clipboard mechanism.
   *
   * **Note:** This method is only implemented on Linux (X11).
   */
  public fun clipboardSetPrimary(clipboardPrimary: String): Unit {
    TransferContext.writeArguments(STRING to clipboardPrimary)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_SET_PRIMARY,
        NIL)
  }

  /**
   * Returns the user's [primary](https://unix.stackexchange.com/questions/139191/whats-the-difference-between-primary-selection-and-clipboard-buffer) clipboard as a string if possible. This is the clipboard that is set when the user selects text in any application, rather than when pressing [kbd]Ctrl + C[/kbd]. The clipboard data can then be pasted by clicking the middle mouse button in any application that supports the primary clipboard mechanism.
   *
   * **Note:** This method is only implemented on Linux (X11).
   */
  public fun clipboardGetPrimary(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_GET_PRIMARY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an [godot.Array] of [godot.core.Rect2], each of which is the bounding rectangle for a display cutout or notch. These are non-functional areas on edge-to-edge screens used by cameras and sensors. Returns an empty array if the device does not have cutouts. See also [getDisplaySafeArea].
   *
   * **Note:** Currently only implemented on Android. Other platforms will return an empty array even if they do have display cutouts or notches.
   */
  public fun getDisplayCutouts(): VariantArray<Rect2> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_DISPLAY_CUTOUTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Rect2>
  }

  /**
   * Returns the unobscured area of the display where interactive controls should be rendered. See also [getDisplayCutouts].
   */
  public fun getDisplaySafeArea(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_DISPLAY_SAFE_AREA,
        RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * Returns the number of displays available.
   */
  public fun getScreenCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_SCREEN_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns index of the primary screen.
   */
  public fun getPrimaryScreen(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_PRIMARY_SCREEN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns index of the screen which contains specified rectangle.
   */
  public fun getScreenFromRect(rect: Rect2): Long {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_SCREEN_FROM_RECT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the screen's top-left corner position in pixels. On multi-monitor setups, the screen position is relative to the virtual desktop area. On multi-monitor setups with different screen resolutions or orientations, the origin may be located outside any display like this:
   *
   * ```
   * 				* (0, 0)        +-------+
   * 				                |       |
   * 				+-------------+ |       |
   * 				|             | |       |
   * 				|             | |       |
   * 				+-------------+ +-------+
   * 				```
   *
   * See also [screenGetSize].
   */
  public fun screenGetPosition(screen: Long = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the screen's size in pixels. See also [screenGetPosition] and [screenGetUsableRect].
   */
  public fun screenGetSize(screen: Long = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the portion of the screen that is not obstructed by a status bar in pixels. See also [screenGetSize].
   */
  public fun screenGetUsableRect(screen: Long = -1): Rect2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_USABLE_RECT, RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * Returns the dots per inch density of the specified screen. If [screen] is [SCREEN_OF_MAIN_WINDOW] (the default value), a screen with the main window will be used.
   *
   * **Note:** On macOS, returned value is inaccurate if fractional display scaling mode is used.
   *
   * **Note:** On Android devices, the actual screen densities are grouped into six generalized densities:
   *
   * ```
   * 				   ldpi - 120 dpi
   * 				   mdpi - 160 dpi
   * 				   hdpi - 240 dpi
   * 				  xhdpi - 320 dpi
   * 				 xxhdpi - 480 dpi
   * 				xxxhdpi - 640 dpi
   * 				```
   *
   * **Note:** This method is implemented on Android, Linux (X11), macOS and Windows. Returns `72` on unsupported platforms.
   */
  public fun screenGetDpi(screen: Long = -1): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_DPI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the scale factor of the specified screen by index.
   *
   * **Note:** On macOS returned value is `2.0` for hiDPI (Retina) screen, and `1.0` for all other cases.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun screenGetScale(screen: Long = -1): Double {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if touch events are available (Android or iOS), the capability is detected on the Webplatform or if [godot.ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is `true`.
   */
  public fun isTouchscreenAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IS_TOUCHSCREEN_AVAILABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the greatest scale factor of all screens.
   *
   * **Note:** On macOS returned value is `2.0` if there is at least one hiDPI (Retina) screen in the system, and `1.0` in all other cases.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun screenGetMaxScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_MAX_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the current refresh rate of the specified screen. If [screen] is [SCREEN_OF_MAIN_WINDOW] (the default value), a screen with the main window will be used.
   *
   * **Note:** Returns `-1.0` if the DisplayServer fails to find the refresh rate for the specified screen. On Web, [screenGetRefreshRate] will always return `-1.0` as there is no way to retrieve the refresh rate on that platform.
   *
   * To fallback to a default refresh rate if the method fails, try:
   *
   * ```
   * 				var refresh_rate = DisplayServer.screen_get_refresh_rate()
   * 				if refresh_rate < 0:
   * 				    refresh_rate = 60.0
   * 				```
   */
  public fun screenGetRefreshRate(screen: Long = -1): Double {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_REFRESH_RATE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the [screen]'s [orientation]. See also [screenGetOrientation].
   */
  public fun screenSetOrientation(orientation: ScreenOrientation, screen: Long = -1): Unit {
    TransferContext.writeArguments(LONG to orientation.id, LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_SET_ORIENTATION, NIL)
  }

  /**
   * Returns the [screen]'s current orientation. See also [screenSetOrientation].
   *
   * **Note:** This method is implemented on Android and iOS.
   */
  public fun screenGetOrientation(screen: Long = -1): ScreenOrientation {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_ORIENTATION, LONG)
    return DisplayServer.ScreenOrientation.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets whether the screen should never be turned off by the operating system's power-saving measures. See also [screenIsKeptOn].
   */
  public fun screenSetKeepOn(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_SET_KEEP_ON,
        NIL)
  }

  /**
   * Returns `true` if the screen should never be turned off by the operating system's power-saving measures. See also [screenSetKeepOn].
   */
  public fun screenIsKeptOn(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_IS_KEPT_ON,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the list of Godot window IDs belonging to this process.
   *
   * **Note:** Native dialogs are not included in this list.
   */
  public fun getWindowList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_WINDOW_LIST,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns the ID of the window at the specified screen [position] (in pixels). On multi-monitor setups, the screen position is relative to the virtual desktop area. On multi-monitor setups with different screen resolutions or orientations, the origin may be located outside any display like this:
   *
   * ```
   * 				* (0, 0)        +-------+
   * 				                |       |
   * 				+-------------+ |       |
   * 				|             | |       |
   * 				|             | |       |
   * 				+-------------+ +-------+
   * 				```
   */
  public fun getWindowAtScreenPosition(position: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_WINDOW_AT_SCREEN_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns internal structure pointers for use in plugins.
   *
   * **Note:** This method is implemented on Android, Linux (X11), macOS and Windows.
   */
  public fun windowGetNativeHandle(handleType: HandleType, windowId: Long = 0): Long {
    TransferContext.writeArguments(LONG to handleType.id, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_NATIVE_HANDLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns ID of the active popup window, or [INVALID_WINDOW_ID] if there is none.
   */
  public fun windowGetActivePopup(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_ACTIVE_POPUP, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bounding box of control, or menu item that was used to open the popup window, in the screen coordinate system. Clicking this area will not auto-close this popup.
   */
  public fun windowSetPopupSafeRect(window: Long, rect: Rect2i): Unit {
    TransferContext.writeArguments(LONG to window, RECT2I to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_POPUP_SAFE_RECT, NIL)
  }

  /**
   * Returns the bounding box of control, or menu item that was used to open the popup window, in the screen coordinate system.
   */
  public fun windowGetPopupSafeRect(window: Long): Rect2i {
    TransferContext.writeArguments(LONG to window)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_POPUP_SAFE_RECT, RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * Sets the title of the given window to [title].
   *
   * **Note:** Avoid changing the window title every frame, as this can cause performance issues on certain window managers. Try to change the window title only a few times per second at most.
   */
  public fun windowSetTitle(title: String, windowId: Long = 0): Unit {
    TransferContext.writeArguments(STRING to title, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_TITLE, NIL)
  }

  /**
   * Sets a polygonal region of the window which accepts mouse events. Mouse events outside the region will be passed through.
   *
   * Passing an empty array will disable passthrough support (all mouse events will be intercepted by the window, which is the default behavior).
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Set region, using Path2D node.
   *
   * DisplayServer.window_set_mouse_passthrough($Path2D.curve.get_baked_points())
   *
   *
   *
   * # Set region, using Polygon2D node.
   *
   * DisplayServer.window_set_mouse_passthrough($Polygon2D.polygon)
   *
   *
   *
   * # Reset region to default.
   *
   * DisplayServer.window_set_mouse_passthrough([])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Set region, using Path2D node.
   *
   * DisplayServer.WindowSetMousePassthrough(GetNode<Path2D>("Path2D").Curve.GetBakedPoints());
   *
   *
   *
   * // Set region, using Polygon2D node.
   *
   * DisplayServer.WindowSetMousePassthrough(GetNode<Polygon2D>("Polygon2D").Polygon);
   *
   *
   *
   * // Reset region to default.
   *
   * DisplayServer.WindowSetMousePassthrough(new Vector2[] {});
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while on Linux (X11) and macOS it is.
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun windowSetMousePassthrough(region: PackedVector2Array, windowId: Long = 0): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to region, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MOUSE_PASSTHROUGH, NIL)
  }

  /**
   * Returns the screen the window specified by [windowId] is currently positioned on. If the screen overlaps multiple displays, the screen where the window's center is located is returned. See also [windowSetCurrentScreen].
   */
  public fun windowGetCurrentScreen(windowId: Long = 0): Long {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_CURRENT_SCREEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves the window specified by [windowId] to the specified [screen]. See also [windowGetCurrentScreen].
   */
  public fun windowSetCurrentScreen(screen: Long, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to screen, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_CURRENT_SCREEN, NIL)
  }

  /**
   * Returns the position of the client area of the given window on the screen.
   */
  public fun windowGetPosition(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the position of the given window on the screen including the borders drawn by the operating system. See also [windowGetPosition].
   */
  public fun windowGetPositionWithDecorations(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_POSITION_WITH_DECORATIONS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the position of the given window to [position]. On multi-monitor setups, the screen position is relative to the virtual desktop area. On multi-monitor setups with different screen resolutions or orientations, the origin may be located outside any display like this:
   *
   * ```
   * 				* (0, 0)        +-------+
   * 				                |       |
   * 				+-------------+ |       |
   * 				|             | |       |
   * 				|             | |       |
   * 				+-------------+ +-------+
   * 				```
   *
   * See also [windowGetPosition] and [windowSetSize].
   */
  public fun windowSetPosition(position: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_POSITION,
        NIL)
  }

  /**
   * Returns the size of the window specified by [windowId] (in pixels), excluding the borders drawn by the operating system. This is also called the "client area". See also [windowGetSizeWithDecorations], [windowSetSize] and [windowGetPosition].
   */
  public fun windowGetSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the size of the given window to [size] (in pixels). See also [windowGetSize] and [windowGetPosition].
   */
  public fun windowSetSize(size: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to size, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_SIZE, NIL)
  }

  /**
   * Sets the [callback] that will be called when the window specified by [windowId] is moved or resized.
   */
  public fun windowSetRectChangedCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_RECT_CHANGED_CALLBACK, NIL)
  }

  /**
   * Sets the [callback] that will be called when an event occurs in the window specified by [windowId].
   */
  public fun windowSetWindowEventCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_WINDOW_EVENT_CALLBACK, NIL)
  }

  /**
   * Sets the [callback] that should be called when any [godot.InputEvent] is sent to the window specified by [windowId].
   */
  public fun windowSetInputEventCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_INPUT_EVENT_CALLBACK, NIL)
  }

  /**
   * Sets the [callback] that should be called when text is entered using the virtual keyboard to the window specified by [windowId].
   */
  public fun windowSetInputTextCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_INPUT_TEXT_CALLBACK, NIL)
  }

  /**
   * Sets the [callback] that should be called when files are dropped from the operating system's file manager to the window specified by [windowId].
   *
   * **Note:** This method is implemented on Windows, macOS, Linux (X11) and Web.
   */
  public fun windowSetDropFilesCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_DROP_FILES_CALLBACK, NIL)
  }

  /**
   * Returns the [godot.Object.getInstanceId] of the [godot.Window] the [windowId] is attached to. also [windowGetAttachedInstanceId].
   */
  public fun windowGetAttachedInstanceId(windowId: Long = 0): Long {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_ATTACHED_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the window's maximum size (in pixels). See also [windowSetMaxSize].
   */
  public fun windowGetMaxSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MAX_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the maximum size of the window specified by [windowId] in pixels. Normally, the user will not be able to drag the window to make it smaller than the specified size. See also [windowGetMaxSize].
   *
   * **Note:** Using third-party tools, it is possible for users to disable window geometry restrictions and therefore bypass this limit.
   */
  public fun windowSetMaxSize(maxSize: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to maxSize, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MAX_SIZE,
        NIL)
  }

  /**
   * Returns the window's minimum size (in pixels). See also [windowSetMinSize].
   */
  public fun windowGetMinSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MIN_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the minimum size for the given window to [minSize] (in pixels). Normally, the user will not be able to drag the window to make it larger than the specified size. See also [windowGetMinSize].
   *
   * **Note:** By default, the main window has a minimum size of `Vector2i(64, 64)`. This prevents issues that can arise when the window is resized to a near-zero size.
   *
   * **Note:** Using third-party tools, it is possible for users to disable window geometry restrictions and therefore bypass this limit.
   */
  public fun windowSetMinSize(minSize: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to minSize, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MIN_SIZE,
        NIL)
  }

  /**
   * Returns the size of the window specified by [windowId] (in pixels), including the borders drawn by the operating system. See also [windowGetSize].
   */
  public fun windowGetSizeWithDecorations(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_SIZE_WITH_DECORATIONS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the mode of the given window.
   */
  public fun windowGetMode(windowId: Long = 0): WindowMode {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MODE, LONG)
    return DisplayServer.WindowMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets window mode for the given window to [mode]. See [enum WindowMode] for possible values and how each mode behaves.
   *
   * **Note:** Setting the window to full screen forcibly sets the borderless flag to `true`, so make sure to set it back to `false` when not wanted.
   */
  public fun windowSetMode(mode: WindowMode, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to mode.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MODE, NIL)
  }

  /**
   * Enables or disables the given window's given [flag]. See [enum WindowFlags] for possible values and their behavior.
   */
  public fun windowSetFlag(
    flag: WindowFlags,
    enabled: Boolean,
    windowId: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_FLAG, NIL)
  }

  /**
   * Returns the current value of the given window's [flag].
   */
  public fun windowGetFlag(flag: WindowFlags, windowId: Long = 0): Boolean {
    TransferContext.writeArguments(LONG to flag.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * When [WINDOW_FLAG_EXTEND_TO_TITLE] flag is set, set offset to the center of the first titlebar button.
   *
   * **Note:** This flag is implemented on macOS.
   */
  public fun windowSetWindowButtonsOffset(offset: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to offset, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_WINDOW_BUTTONS_OFFSET, NIL)
  }

  /**
   * Returns left margins (`x`), right margins (`y`) and height (`z`) of the title that are safe to use (contains no buttons or other elements) when [WINDOW_FLAG_EXTEND_TO_TITLE] flag is set.
   */
  public fun windowGetSafeTitleMargins(windowId: Long = 0): Vector3i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_SAFE_TITLE_MARGINS, VECTOR3I)
    return TransferContext.readReturnValue(VECTOR3I, false) as Vector3i
  }

  /**
   * Makes the window specified by [windowId] request attention, which is materialized by the window title and taskbar entry blinking until the window is focused. This usually has no visible effect if the window is currently focused. The exact behavior varies depending on the operating system.
   */
  public fun windowRequestAttention(windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_REQUEST_ATTENTION, NIL)
  }

  /**
   * Moves the window specified by [windowId] to the foreground, so that it is visible over other windows.
   */
  public fun windowMoveToForeground(windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_MOVE_TO_FOREGROUND, NIL)
  }

  /**
   * Returns `true` if anything can be drawn in the window specified by [windowId], `false` otherwise. Using the `--disable-render-loop` command line argument or a headless build will return `false`.
   */
  public fun windowCanDraw(windowId: Long = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets window transient parent. Transient window is will be destroyed with its transient parent and will return focus to their parent when closed. The transient window is displayed on top of a non-exclusive full-screen parent window. Transient windows can't enter full-screen mode.
   *
   * Note that behavior might be different depending on the platform.
   */
  public fun windowSetTransient(windowId: Long, parentWindowId: Long): Unit {
    TransferContext.writeArguments(LONG to windowId, LONG to parentWindowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_TRANSIENT,
        NIL)
  }

  /**
   * If set to `true`, this window will always stay on top of its parent window, parent window will ignore input while this window is opened.
   *
   * **Note:** On macOS, exclusive windows are confined to the same space (virtual desktop or screen) as the parent window.
   *
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun windowSetExclusive(windowId: Long, exclusive: Boolean): Unit {
    TransferContext.writeArguments(LONG to windowId, BOOL to exclusive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_EXCLUSIVE,
        NIL)
  }

  /**
   * Sets whether [godot.Input Method Editor](https://en.wikipedia.org/wiki/Input_method) should be enabled for the window specified by [windowId]. See also [windowSetImePosition].
   */
  public fun windowSetImeActive(active: Boolean, windowId: Long = 0): Unit {
    TransferContext.writeArguments(BOOL to active, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_IME_ACTIVE,
        NIL)
  }

  /**
   * Sets the position of the [godot.Input Method Editor](https://en.wikipedia.org/wiki/Input_method) popup for the specified [windowId]. Only effective if [windowSetImeActive] was set to `true` for the specified [windowId].
   */
  public fun windowSetImePosition(position: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_IME_POSITION, NIL)
  }

  /**
   * Sets the V-Sync mode of the given window.
   *
   * See [enum DisplayServer.VSyncMode] for possible values and how they affect the behavior of your application.
   *
   * Depending on the platform and used renderer, the engine will fall back to [VSYNC_ENABLED], if the desired mode is not supported.
   */
  public fun windowSetVsyncMode(vsyncMode: VSyncMode, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to vsyncMode.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_VSYNC_MODE,
        NIL)
  }

  /**
   * Returns the V-Sync mode of the given window.
   */
  public fun windowGetVsyncMode(windowId: Long = 0): VSyncMode {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_VSYNC_MODE,
        LONG)
    return DisplayServer.VSyncMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the given window can be maximized (the maximize button is enabled).
   */
  public fun windowIsMaximizeAllowed(windowId: Long = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_IS_MAXIMIZE_ALLOWED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true`, if double-click on a window title should maximize it.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun windowMaximizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_MAXIMIZE_ON_TITLE_DBL_CLICK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true`, if double-click on a window title should minimize it.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun windowMinimizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_MINIMIZE_ON_TITLE_DBL_CLICK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the text selection in the [godot.Input Method Editor](https://en.wikipedia.org/wiki/Input_method) composition string, with the [godot.Vector2i]'s `x` component being the caret position and `y` being the length of the selection.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun imeGetSelection(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IME_GET_SELECTION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the composition string contained within the [godot.Input Method Editor](https://en.wikipedia.org/wiki/Input_method) window.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun imeGetText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IME_GET_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Shows the virtual keyboard if the platform has one.
   *
   * [existingText] parameter is useful for implementing your own [godot.LineEdit] or [godot.TextEdit], as it tells the virtual keyboard what text has already been typed (the virtual keyboard uses it for auto-correct and predictions).
   *
   * [position] parameter is the screen space [godot.core.Rect2] of the edited text.
   *
   * [type] parameter allows configuring which type of virtual keyboard to show.
   *
   * [maxLength] limits the number of characters that can be entered if different from `-1`.
   *
   * [cursorStart] can optionally define the current text cursor position if [cursorEnd] is not set.
   *
   * [cursorStart] and [cursorEnd] can optionally define the current text selection.
   *
   * **Note:** This method is implemented on Android, iOS and Web.
   */
  public fun virtualKeyboardShow(
    existingText: String,
    position: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    type: VirtualKeyboardType = DisplayServer.VirtualKeyboardType.KEYBOARD_TYPE_DEFAULT,
    maxLength: Long = -1,
    cursorStart: Long = -1,
    cursorEnd: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING to existingText, RECT2 to position, LONG to type.id, LONG to maxLength, LONG to cursorStart, LONG to cursorEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_SHOW,
        NIL)
  }

  /**
   * Hides the virtual keyboard if it is shown, does nothing otherwise.
   */
  public fun virtualKeyboardHide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_HIDE,
        NIL)
  }

  /**
   * Returns the on-screen keyboard's height in pixels. Returns 0 if there is no keyboard or if it is currently hidden.
   */
  public fun virtualKeyboardGetHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the default mouse cursor shape. The cursor's appearance will vary depending on the user's operating system and mouse cursor theme. See also [cursorGetShape] and [cursorSetCustomImage].
   */
  public fun cursorSetShape(shape: CursorShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_SET_SHAPE, NIL)
  }

  /**
   * Returns the default mouse cursor shape set by [cursorSetShape].
   */
  public fun cursorGetShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_GET_SHAPE,
        LONG)
    return DisplayServer.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets a custom mouse cursor image for the defined [shape]. This means the user's operating system and mouse cursor theme will no longer influence the mouse cursor's appearance. The image must be `256x256` or smaller for correct appearance. [hotspot] can optionally be set to define the area where the cursor will click. By default, [hotspot] is set to `Vector2(0, 0)`, which is the top-left corner of the image. See also [cursorSetShape].
   */
  public fun cursorSetCustomImage(
    cursor: Resource,
    shape: CursorShape = DisplayServer.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0, 0)
  ): Unit {
    TransferContext.writeArguments(OBJECT to cursor, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_SET_CUSTOM_IMAGE, NIL)
  }

  /**
   * Returns `true` if positions of **OK** and **Cancel** buttons are swapped in dialogs. This is enabled by default on Windows and UWP to follow interface conventions, and be toggled by changing [godot.ProjectSettings.gui/common/swapCancelOk].
   *
   * **Note:** This doesn't affect native dialogs such as the ones spawned by [godot.DisplayServer.dialogShow].
   */
  public fun getSwapCancelOk(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_SWAP_CANCEL_OK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Allows the [processId] PID to steal focus from this window. In other words, this disables the operating system's focus stealing protection for the specified PID.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun enableForStealingFocus(processId: Long): Unit {
    TransferContext.writeArguments(LONG to processId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_ENABLE_FOR_STEALING_FOCUS, NIL)
  }

  /**
   * Shows a text dialog which uses the operating system's native look-and-feel. [callback] will be called when the dialog is closed for any reason.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun dialogShow(
    title: String,
    description: String,
    buttons: PackedStringArray,
    callback: Callable
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, PACKED_STRING_ARRAY to buttons, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_DIALOG_SHOW, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Shows a text input dialog which uses the operating system's native look-and-feel. [callback] will be called with a [godot.String] argument equal to the text field's contents when the dialog is closed for any reason.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun dialogInputText(
    title: String,
    description: String,
    existingText: String,
    callback: Callable
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, STRING to existingText, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_DIALOG_INPUT_TEXT,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the number of keyboard layouts.
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardGetLayoutCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns active keyboard layout index.
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardGetCurrentLayout(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_CURRENT_LAYOUT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the active keyboard layout.
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardSetCurrentLayout(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_SET_CURRENT_LAYOUT, NIL)
  }

  /**
   * Returns the ISO-639/BCP-47 language code of the keyboard layout at position [index].
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardGetLayoutLanguage(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_LANGUAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the localized name of the keyboard layout at position [index].
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardGetLayoutName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Converts a physical (US QWERTY) [keycode] to one in the active keyboard layout.
   *
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  public fun keyboardGetKeycodeFromPhysical(keycode: Key): Key {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_KEYCODE_FROM_PHYSICAL, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Perform window manager processing, including input flushing. See also [forceProcessAndDropEvents], [godot.Input.flushBufferedEvents] and [godot.Input.useAccumulatedInput].
   */
  public fun processEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_PROCESS_EVENTS, NIL)
  }

  /**
   * Forces window manager processing while ignoring all [godot.InputEvent]s. See also [processEvents].
   *
   * **Note:** This method is implemented on Windows and macOS.
   */
  public fun forceProcessAndDropEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_FORCE_PROCESS_AND_DROP_EVENTS, NIL)
  }

  /**
   * Sets the window icon (usually displayed in the top-left corner) in the operating system's *native* format. The file at [filename] must be in `.ico` format on Windows or `.icns` on macOS. By using specially crafted `.ico` or `.icns` icons, [setNativeIcon] allows specifying different icons depending on the size the icon is displayed at. This size is determined by the operating system and user preferences (including the display scale factor). To use icons in other formats, use [setIcon] instead.
   */
  public fun setNativeIcon(filename: String): Unit {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SET_NATIVE_ICON, NIL)
  }

  /**
   * Sets the window icon (usually displayed in the top-left corner) in the operating system's *native* format. To use icons in the operating system's native format, use [setNativeIcon] instead.
   */
  public fun setIcon(image: Image): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SET_ICON, NIL)
  }

  /**
   * Returns the total number of available tablet drivers.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun tabletGetDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TABLET_GET_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tablet driver name for the given index.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun tabletGetDriverName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TABLET_GET_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns current active tablet driver name.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun tabletGetCurrentDriver(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TABLET_GET_CURRENT_DRIVER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Set active tablet driver name.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun tabletSetCurrentDriver(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TABLET_SET_CURRENT_DRIVER, NIL)
  }

  public enum class Feature(
    id: Long
  ) {
    /**
     * Display server supports global menu. This allows the application to display its menu items in the operating system's top bar. **macOS**
     */
    FEATURE_GLOBAL_MENU(0),
    /**
     * Display server supports multiple windows that can be moved outside of the main window. **Windows, macOS, Linux (X11)**
     */
    FEATURE_SUBWINDOWS(1),
    /**
     * Display server supports touchscreen input. **Windows, Linux (X11), Android, iOS, Web**
     */
    FEATURE_TOUCHSCREEN(2),
    /**
     * Display server supports mouse input. **Windows, macOS, Linux (X11), Android, Web**
     */
    FEATURE_MOUSE(3),
    /**
     * Display server supports warping mouse coordinates to keep the mouse cursor constrained within an area, but looping when one of the edges is reached. **Windows, macOS, Linux (X11)**
     */
    FEATURE_MOUSE_WARP(4),
    /**
     * Display server supports setting and getting clipboard data. See also [FEATURE_CLIPBOARD_PRIMARY]. **Windows, macOS, Linux (X11), Android, iOS, Web**
     */
    FEATURE_CLIPBOARD(5),
    /**
     * Display server supports popping up a virtual keyboard when requested to input text without a physical keyboard. **Android, iOS, Web**
     */
    FEATURE_VIRTUAL_KEYBOARD(6),
    /**
     * Display server supports setting the mouse cursor shape to be different from the default. **Windows, macOS, Linux (X11), Android, Web**
     */
    FEATURE_CURSOR_SHAPE(7),
    /**
     * Display server supports setting the mouse cursor shape to a custom image. **Windows, macOS, Linux (X11), Web**
     */
    FEATURE_CUSTOM_CURSOR_SHAPE(8),
    /**
     * Display server supports spawning dialogs using the operating system's native look-and-feel. **macOS**
     */
    FEATURE_NATIVE_DIALOG(9),
    /**
     * Display server supports [godot.Input Method Editor](https://en.wikipedia.org/wiki/Input_method), which is commonly used for inputting Chinese/Japanese/Korean text. This is handled by the operating system, rather than by Godot. **Windows, macOS, Linux (X11)**
     */
    FEATURE_IME(10),
    /**
     * Display server supports windows can use per-pixel transparency to make windows behind them partially or fully visible. **Windows, macOS, Linux (X11)**
     */
    FEATURE_WINDOW_TRANSPARENCY(11),
    /**
     * Display server supports querying the operating system's display scale factor. This allows for *reliable* automatic hiDPI display detection, as opposed to guessing based on the screen resolution and reported display DPI (which can be unreliable due to broken monitor EDID). **Windows, macOS**
     */
    FEATURE_HIDPI(12),
    /**
     * Display server supports changing the window icon (usually displayed in the top-left corner). **Windows, macOS, Linux (X11)**
     */
    FEATURE_ICON(13),
    /**
     * Display server supports changing the window icon (usually displayed in the top-left corner). **Windows, macOS**
     */
    FEATURE_NATIVE_ICON(14),
    /**
     * Display server supports changing the screen orientation. **Android, iOS**
     */
    FEATURE_ORIENTATION(15),
    /**
     * Display server supports V-Sync status can be changed from the default (which is forced to be enabled platforms not supporting this feature). **Windows, macOS, Linux (X11)**
     */
    FEATURE_SWAP_BUFFERS(16),
    /**
     * Display server supports Primary clipboard can be used. This is a different clipboard from [FEATURE_CLIPBOARD]. **Linux (X11)**
     */
    FEATURE_CLIPBOARD_PRIMARY(18),
    /**
     * Display server supports text-to-speech. See `tts_*` methods. **Windows, macOS, Linux (X11), Android, iOS, Web**
     */
    FEATURE_TEXT_TO_SPEECH(19),
    /**
     * Display server supports expanding window content to the title. See [WINDOW_FLAG_EXTEND_TO_TITLE]. **macOS**
     */
    FEATURE_EXTEND_TO_TITLE(20),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MouseMode(
    id: Long
  ) {
    /**
     * Makes the mouse cursor visible if it is hidden.
     */
    MOUSE_MODE_VISIBLE(0),
    /**
     * Makes the mouse cursor hidden if it is visible.
     */
    MOUSE_MODE_HIDDEN(1),
    /**
     * Captures the mouse. The mouse will be hidden and its position locked at the center of the window manager's window.
     *
     * **Note:** If you want to process the mouse's movement in this mode, you need to use [godot.InputEventMouseMotion.relative].
     */
    MOUSE_MODE_CAPTURED(2),
    /**
     * Confines the mouse cursor to the game window, and make it visible.
     */
    MOUSE_MODE_CONFINED(3),
    /**
     * Confines the mouse cursor to the game window, and make it hidden.
     */
    MOUSE_MODE_CONFINED_HIDDEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ScreenOrientation(
    id: Long
  ) {
    /**
     * Default landscape orientation.
     */
    SCREEN_LANDSCAPE(0),
    /**
     * Default portrait orienstation.
     */
    SCREEN_PORTRAIT(1),
    /**
     * Reverse landscape orientation (upside down).
     */
    SCREEN_REVERSE_LANDSCAPE(2),
    /**
     * Reverse portrait orientation (upside down).
     */
    SCREEN_REVERSE_PORTRAIT(3),
    /**
     * Automatic landscape orientation (default or reverse depending on sensor).
     */
    SCREEN_SENSOR_LANDSCAPE(4),
    /**
     * Automatic portrait orientation (default or reverse depending on sensor).
     */
    SCREEN_SENSOR_PORTRAIT(5),
    /**
     * Automatic landscape or portrait orientation (default or reverse depending on sensor).
     */
    SCREEN_SENSOR(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VirtualKeyboardType(
    id: Long
  ) {
    /**
     * Default text virtual keyboard.
     */
    KEYBOARD_TYPE_DEFAULT(0),
    /**
     * Multiline virtual keyboard.
     */
    KEYBOARD_TYPE_MULTILINE(1),
    /**
     * Virtual number keypad, useful for PIN entry.
     */
    KEYBOARD_TYPE_NUMBER(2),
    /**
     * Virtual number keypad, useful for entering fractional numbers.
     */
    KEYBOARD_TYPE_NUMBER_DECIMAL(3),
    /**
     * Virtual phone number keypad.
     */
    KEYBOARD_TYPE_PHONE(4),
    /**
     * Virtual keyboard with additional keys to assist with typing email addresses.
     */
    KEYBOARD_TYPE_EMAIL_ADDRESS(5),
    /**
     * Virtual keyboard for entering a password. On most platforms, this should disable autocomplete and autocapitalization.
     *
     * **Note:** This is not supported on Web. Instead, this behaves identically to [KEYBOARD_TYPE_DEFAULT].
     */
    KEYBOARD_TYPE_PASSWORD(6),
    /**
     * Virtual keyboard with additional keys to assist with typing URLs.
     */
    KEYBOARD_TYPE_URL(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CursorShape(
    id: Long
  ) {
    /**
     * Arrow cursor shape. This is the default when not pointing anything that overrides the mouse cursor, such as a [godot.LineEdit] or [godot.TextEdit].
     */
    CURSOR_ARROW(0),
    /**
     * I-beam cursor shape. This is used by default when hovering a control that accepts text input, such as [godot.LineEdit] or [godot.TextEdit].
     */
    CURSOR_IBEAM(1),
    /**
     * Pointing hand cursor shape. This is used by default when hovering a [godot.LinkButton] or an URL tag in a [godot.RichTextLabel].⋅
     */
    CURSOR_POINTING_HAND(2),
    /**
     * Crosshair cursor. This is intended to be displayed when the user needs precise aim over an element, such as a rectangle selection tool or a color picker.
     */
    CURSOR_CROSS(3),
    /**
     * Wait cursor. On most cursor themes, this displays a spinning icon *besides* the arrow. Intended to be used for non-blocking operations (when the user can do something else at the moment). See also [CURSOR_BUSY].
     */
    CURSOR_WAIT(4),
    /**
     * Wait cursor. On most cursor themes, this *replaces* the arrow with a spinning icon. Intended to be used for blocking operations (when the user can't do anything else at the moment). See also [CURSOR_WAIT].
     */
    CURSOR_BUSY(5),
    /**
     * Dragging hand cursor. This is displayed during drag-and-drop operations. See also [CURSOR_CAN_DROP].
     */
    CURSOR_DRAG(6),
    /**
     * "Can drop" cursor. This is displayed during drag-and-drop operations if hovering over a [godot.Control] that can accept the drag-and-drop event. On most cursor themes, this displays a dragging hand with an arrow symbol besides it. See also [CURSOR_DRAG].
     */
    CURSOR_CAN_DROP(7),
    /**
     * Forbidden cursor. This is displayed during drag-and-drop operations if the hovered [godot.Control] can't accept the drag-and-drop event.
     */
    CURSOR_FORBIDDEN(8),
    /**
     * Vertical resize cursor. Intended to be displayed when the hovered [godot.Control] can be vertically resized using the mouse. See also [CURSOR_VSPLIT].
     */
    CURSOR_VSIZE(9),
    /**
     * Horizontal resize cursor. Intended to be displayed when the hovered [godot.Control] can be horizontally resized using the mouse. See also [CURSOR_HSPLIT].
     */
    CURSOR_HSIZE(10),
    /**
     * Secondary diagonal resize cursor (top-right/bottom-left). Intended to be displayed when the hovered [godot.Control] can be resized on both axes at once using the mouse.
     */
    CURSOR_BDIAGSIZE(11),
    /**
     * Main diagonal resize cursor (top-left/bottom-right). Intended to be displayed when the hovered [godot.Control] can be resized on both axes at once using the mouse.
     */
    CURSOR_FDIAGSIZE(12),
    /**
     * Move cursor. Intended to be displayed when the hovered [godot.Control] can be moved using the mouse.
     */
    CURSOR_MOVE(13),
    /**
     * Vertical split cursor. This is displayed when hovering a [godot.Control] with splits that can be vertically resized using the mouse, such as [godot.VSplitContainer]. On some cursor themes, this cursor may have the same appearance as [CURSOR_VSIZE].
     */
    CURSOR_VSPLIT(14),
    /**
     * Horizontal split cursor. This is displayed when hovering a [godot.Control] with splits that can be horizontally resized using the mouse, such as [godot.HSplitContainer]. On some cursor themes, this cursor may have the same appearance as [CURSOR_HSIZE].
     */
    CURSOR_HSPLIT(15),
    /**
     * Help cursor. On most cursor themes, this displays a question mark icon instead of the mouse cursor. Intended to be used when the user has requested help on the next element that will be clicked.
     */
    CURSOR_HELP(16),
    /**
     * Represents the size of the [enum CursorShape] enum.
     */
    CURSOR_MAX(17),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class WindowMode(
    id: Long
  ) {
    /**
     * Windowed mode, i.e. [godot.Window] doesn't occupy the whole screen (unless set to the size of the screen).
     */
    WINDOW_MODE_WINDOWED(0),
    /**
     * Minimized window mode, i.e. [godot.Window] is not visible and available on window manager's window list. Normally happens when the minimize button is pressed.
     */
    WINDOW_MODE_MINIMIZED(1),
    /**
     * Maximized window mode, i.e. [godot.Window] will occupy whole screen area except task bar and still display its borders. Normally happens when the minimize button is pressed.
     */
    WINDOW_MODE_MAXIMIZED(2),
    /**
     * Full screen mode with full multi-window support.
     *
     * Full screen window cover the entire display area of a screen, have no border or decorations. Display video mode is not changed.
     *
     * **Note:** Regardless of the platform, enabling full screen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling full screen mode.
     */
    WINDOW_MODE_FULLSCREEN(3),
    /**
     * A single window full screen mode. This mode has less overhead, but only one window can be open on a given screen at a time (opening a child window or application switching will trigger a full screen transition).
     *
     * Full screen window cover the entire display area of a screen, have no border or decorations. Display video mode is not changed.
     *
     * **On Windows:** Depending on video driver, full screen transition might cause screens to go black for a moment.
     *
     * **On macOS:** Exclusive full screen mode prevents Dock and Menu from showing up when the mouse pointer is hovering the edge of the screen.
     *
     * **On Linux (X11):** Exclusive full screen mode bypasses compositor.
     *
     * **Note:** Regardless of the platform, enabling full screen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling full screen mode.
     */
    WINDOW_MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class WindowFlags(
    id: Long
  ) {
    /**
     * The window can't be resizing by dragging its resize grip. It's still possible to resize the window using [windowSetSize]. This flag is ignored for full screen windows.
     */
    WINDOW_FLAG_RESIZE_DISABLED(0),
    /**
     * The window do not have native title bar and other decorations. This flag is ignored for full-screen windows.
     */
    WINDOW_FLAG_BORDERLESS(1),
    /**
     * The window is floating on top of all other windows. This flag is ignored for full-screen windows.
     */
    WINDOW_FLAG_ALWAYS_ON_TOP(2),
    /**
     * The window background can be transparent.
     *
     * **Note:** This flag has no effect if [godot.ProjectSettings.display/window/perPixelTransparency/allowed] is set to `false`.
     *
     * **Note:** Transparency support is implemented on Linux (X11), macOS and Windows, but availability might vary depending on GPU driver, display manager, and compositor capabilities.
     */
    WINDOW_FLAG_TRANSPARENT(3),
    /**
     * The window can't be focused. No-focus window will ignore all input, except mouse clicks.
     */
    WINDOW_FLAG_NO_FOCUS(4),
    /**
     * Window is part of menu or [godot.OptionButton] dropdown. This flag can't be changed when the window is visible. An active popup window will exclusively receive all input, without stealing focus from its parent. Popup windows are automatically closed when uses click outside it, or when an application is switched. Popup window must have `transient parent` set (see [windowSetTransient]).
     */
    WINDOW_FLAG_POPUP(5),
    /**
     * Window content is expanded to the full size of the window. Unlike borderless window, the frame is left intact and can be used to resize the window, title bar is transparent, but have minimize/maximize/close buttons.
     *
     * Use [windowSetWindowButtonsOffset] to adjust minimize/maximize/close buttons offset.
     *
     * Use [windowGetSafeTitleMargins] to determine area under the title bar that is not covered by decorations.
     *
     * **Note:** This flag is implemented on macOS.
     */
    WINDOW_FLAG_EXTEND_TO_TITLE(6),
    /**
     * All mouse events are passed to the underlying window of the same application.
     */
    WINDOW_FLAG_MOUSE_PASSTHROUGH(7),
    /**
     * Max value of the [enum WindowFlags].
     */
    WINDOW_FLAG_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class WindowEvent(
    id: Long
  ) {
    /**
     * Sent when the mouse pointer enters the window, see [windowSetWindowEventCallback].
     */
    WINDOW_EVENT_MOUSE_ENTER(0),
    /**
     * Sent when the mouse pointer exits the window, see [windowSetWindowEventCallback].
     */
    WINDOW_EVENT_MOUSE_EXIT(1),
    /**
     * Sent when the window grabs focus, see [windowSetWindowEventCallback].
     */
    WINDOW_EVENT_FOCUS_IN(2),
    /**
     * Sent when the window loses focus, see [windowSetWindowEventCallback].
     */
    WINDOW_EVENT_FOCUS_OUT(3),
    /**
     * Sent when the user has attempted to close the window (e.g. close button is pressed), see [windowSetWindowEventCallback].
     */
    WINDOW_EVENT_CLOSE_REQUEST(4),
    /**
     * Sent when the device "Back" button is pressed, see [windowSetWindowEventCallback].
     *
     * **Note:** This event is implemented on Android.
     */
    WINDOW_EVENT_GO_BACK_REQUEST(5),
    /**
     * Sent when the window is moved to the display with different DPI, or display DPI is changed, see [windowSetWindowEventCallback].
     *
     * **Note:** This flag is implemented on macOS.
     */
    WINDOW_EVENT_DPI_CHANGE(6),
    /**
     * Sent when the window title bar decoration is changed (e.g. [WINDOW_FLAG_EXTEND_TO_TITLE] is set or window entered/exited full screen mode), see [windowSetWindowEventCallback].
     *
     * **Note:** This flag is implemented on macOS.
     */
    WINDOW_EVENT_TITLEBAR_CHANGE(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VSyncMode(
    id: Long
  ) {
    /**
     * No vertical synchronization, which means the engine will display frames as fast as possible (tearing may be visible). Framerate is unlimited (nonwithstanding [godot.Engine.maxFps]).
     */
    VSYNC_DISABLED(0),
    /**
     * Default vertical synchronization mode, the image is displayed only on vertical blanking intervals (no tearing is visible). Framerate is limited by the monitor refresh rate (nonwithstanding [godot.Engine.maxFps]).
     */
    VSYNC_ENABLED(1),
    /**
     * Behaves like [VSYNC_DISABLED] when the framerate drops below the screen's refresh rate to reduce stuttering (tearing may be visible). Otherwise, vertical synchronization is enabled to avoid tearing. Framerate is limited by the monitor refresh rate (nonwithstanding [godot.Engine.maxFps]).
     */
    VSYNC_ADAPTIVE(2),
    /**
     * Displays the most recent image in the queue on vertical blanking intervals, while rendering to the other images (no tearing is visible). Framerate is unlimited (nonwithstanding [godot.Engine.maxFps]).
     *
     * Although not guaranteed, the images can be rendered as fast as possible, which may reduce input lag (also called "Fast" V-Sync mode). [VSYNC_MAILBOX] works best when at least twice as many frames as the display refresh rate are rendered.
     */
    VSYNC_MAILBOX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class HandleType(
    id: Long
  ) {
    /**
     * Display handle:
     *
     * - Linux (X11): `X11::Display*` for the display.
     *
     * - Android: `EGLDisplay` for the display.
     */
    DISPLAY_HANDLE(0),
    /**
     * Window handle:
     *
     * - Windows: `HWND` for the window.
     *
     * - Linux (X11): `X11::Window*` for the window.
     *
     * - macOS: `NSWindow*` for the window.
     *
     * - iOS: `UIViewController*` for the view controller.
     *
     * - Android: `jObject` for the activity.
     */
    WINDOW_HANDLE(1),
    /**
     * Window view:
     *
     * - Windows: `HDC` for the window (only with the GL Compatibility renderer).
     *
     * - macOS: `NSView*` for the window main view.
     *
     * - iOS: `UIView*` for the window main view.
     */
    WINDOW_VIEW(2),
    /**
     * OpenGL context (only with the GL Compatibility renderer):
     *
     * - Windows: `HGLRC` for the window.
     *
     * - Linux: `GLXContext*` for the window.
     *
     * - MacOS: `NSOpenGLContext*` for the window.
     *
     * - Android: `EGLContext` for the window.
     */
    OPENGL_CONTEXT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TTSUtteranceEvent(
    id: Long
  ) {
    /**
     * Utterance has begun to be spoken.
     */
    TTS_UTTERANCE_STARTED(0),
    /**
     * Utterance was successfully finished.
     */
    TTS_UTTERANCE_ENDED(1),
    /**
     * Utterance was canceled, or TTS service was unable to process it.
     */
    TTS_UTTERANCE_CANCELED(2),
    /**
     * Utterance reached a word or sentence boundary.
     */
    TTS_UTTERANCE_BOUNDARY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
