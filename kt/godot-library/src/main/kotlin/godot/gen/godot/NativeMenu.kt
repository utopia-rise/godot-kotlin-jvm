// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
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
 * [NativeMenu] handles low-level access to the OS native global menu bar and popup menus.
 * **Note:** This is low-level API, consider using [MenuBar] with [MenuBar.preferGlobalMenu] set to
 * `true`, and [PopupMenu] with [PopupMenu.preferNativeMenu] set to `true`.
 * To create a menu, use [createMenu], add menu items using `add_*_item` methods. To remove a menu,
 * use [freeMenu].
 * [codeblock]
 * var menu
 *
 * func _menu_callback(item_id):
 *     if item_id == "ITEM_CUT":
 *         cut()
 *     elif item_id == "ITEM_COPY":
 *         copy()
 *     elif item_id == "ITEM_PASTE":
 *         paste()
 *
 * func _enter_tree():
 *     # Create new menu and add items:
 *     menu = NativeMenu.create_menu()
 *     NativeMenu.add_item(menu, "Cut", _menu_callback, Callable(), "ITEM_CUT")
 *     NativeMenu.add_item(menu, "Copy", _menu_callback, Callable(), "ITEM_COPY")
 *     NativeMenu.add_separator(menu)
 *     NativeMenu.add_item(menu, "Paste", _menu_callback, Callable(), "ITEM_PASTE")
 *
 * func _on_button_pressed():
 *     # Show popup menu at mouse position:
 *     NativeMenu.popup(menu, DisplayServer.mouse_get_position())
 *
 * func _exit_tree():
 *     # Remove menu when it's no longer needed:
 *     NativeMenu.free_menu(menu)
 * [/codeblock]
 */
@GodotBaseType
public object NativeMenu : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NATIVEMENU)
    return false
  }

  /**
   * Returns `true` if the specified [feature] is supported by the current [NativeMenu], `false`
   * otherwise.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a special system menu is supported.
   * **Note:** This method is implemented only on macOS.
   */
  public fun hasSystemMenu(menuId: SystemMenus): Boolean {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSystemMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns RID of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  public fun getSystemMenu(menuId: SystemMenus): RID {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemMenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns readable name of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  public fun getSystemMenuName(menuId: SystemMenus): String {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemMenuNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Creates a new global menu object.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun createMenu(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createMenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns `true` if [rid] is valid global menu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun hasMenu(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.hasMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Frees a global menu object created by this [NativeMenu].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun freeMenu(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeMenuPtr, NIL)
  }

  /**
   * Returns global menu size.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getSize(rid: RID): Vector2 {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Shows the global menu at [position] in the screen coordinates.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun popup(rid: RID, position: Vector2i): Unit {
    TransferContext.writeArguments(_RID to rid, VECTOR2I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.popupPtr, NIL)
  }

  /**
   * Sets the menu text layout direction from right-to-left if [isRtl] is `true`.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setInterfaceDirection(rid: RID, isRtl: Boolean): Unit {
    TransferContext.writeArguments(_RID to rid, BOOL to isRtl)
    TransferContext.callMethod(rawPtr, MethodBindings.setInterfaceDirectionPtr, NIL)
  }

  /**
   * Registers callable to emit after the menu is closed.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setPopupOpenCallback(rid: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to rid, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setPopupOpenCallbackPtr, NIL)
  }

  /**
   * Returns global menu open callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  public fun getPopupOpenCallback(rid: RID): Callable {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupOpenCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  /**
   * Registers callable to emit when the menu is about to show.
   * **Note:** The OS can simulate menu opening to track menu item changes and global shortcuts, in
   * which case the corresponding close callback is not triggered. Use [isOpened] to check if the menu
   * is currently opened.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setPopupCloseCallback(rid: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to rid, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setPopupCloseCallbackPtr, NIL)
  }

  /**
   * Returns global menu close callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  public fun getPopupCloseCallback(rid: RID): Callable {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupCloseCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  /**
   * Sets the minimum width of the global menu.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setMinimumWidth(rid: RID, width: Float): Unit {
    TransferContext.writeArguments(_RID to rid, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMinimumWidthPtr, NIL)
  }

  /**
   * Returns global menu minimum width.
   * **Note:** This method is implemented only on macOS.
   */
  public fun getMinimumWidth(rid: RID): Float {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns `true` if the menu is currently opened.
   * **Note:** This method is implemented only on macOS.
   */
  public fun isOpened(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.isOpenedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds an item that will act as a submenu of the global menu [rid]. The [submenuRid] argument is
   * the RID of the global menu that will be shown when the item is clicked.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  public fun addSubmenuItem(
    rid: RID,
    label: String,
    submenuRid: RID,
    tag: Any? = null,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, _RID to submenuRid, ANY to tag, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSubmenuItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new checkable item with text [label] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addCheckItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] and icon [icon] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addIconItem(
    rid: RID,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new checkable item with text [label] and icon [icon] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addIconCheckItem(
    rid: RID,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIconCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new radio-checkable item with text [label] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addRadioCheckItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new radio-checkable item with text [label] and icon [icon] to the global menu [rid].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [setItemChecked] for more info on how to
   * control it.
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addIconRadioCheckItem(
    rid: RID,
    icon: Texture2D,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addIconRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] to the global menu [rid].
   * Contrarily to normal binary items, multistate items can have more than two states, as defined
   * by [maxStates]. Each press or activate of the item will increase the state by one. The default
   * value is defined by [defaultState].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** By default, there's no indication of the current item state, it should be changed
   * manually.
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** On Windows, [accelerator] and [keyCallback] are ignored.
   */
  @JvmOverloads
  public fun addMultistateItem(
    rid: RID,
    label: String,
    maxStates: Int,
    defaultState: Int,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addMultistateItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a separator between items to the global menu [rid]. Separators also occupy an index.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  public fun addSeparator(rid: RID, index: Int = -1): Int {
    TransferContext.writeArguments(_RID to rid, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSeparatorPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [text]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun findItemIndexWithText(rid: RID, text: String): Int {
    TransferContext.writeArguments(_RID to rid, STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.findItemIndexWithTextPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [tag]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun findItemIndexWithTag(rid: RID, tag: Any?): Int {
    TransferContext.writeArguments(_RID to rid, ANY to tag)
    TransferContext.callMethod(rawPtr, MethodBindings.findItemIndexWithTagPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the item with the submenu specified by [submenuRid]. Indices are
   * automatically assigned to each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun findItemIndexWithSubmenu(rid: RID, submenuRid: RID): Int {
    TransferContext.writeArguments(_RID to rid, _RID to submenuRid)
    TransferContext.callMethod(rawPtr, MethodBindings.findItemIndexWithSubmenuPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the item at index [idx] is checked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun isItemChecked(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is checkable in some way, i.e. if it has a checkbox
   * or radio button.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun isItemCheckable(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun isItemRadioCheckable(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the callback of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemCallback(rid: RID, idx: Int): Callable {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  /**
   * Returns the callback of the item accelerator at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  public fun getItemKeyCallback(rid: RID, idx: Int): Callable {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemKeyCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [setItemTag], which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemTag(rid: RID, idx: Int): Any? {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTagPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the text of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemText(rid: RID, idx: Int): String {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the submenu ID of the item at index [idx]. See [addSubmenuItem] for more info on how to
   * add a submenu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemSubmenu(rid: RID, idx: Int): RID {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemSubmenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the accelerator of the item at index [idx]. Accelerators are special combinations of
   * keys that activate the item, no matter which control is focused.
   * **Note:** This method is implemented only on macOS.
   */
  public fun getItemAccelerator(rid: RID, idx: Int): Key {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the item at index [idx] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [setItemDisabled] for more info on how to disable an item.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun isItemDisabled(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is hidden.
   * See [setItemHidden] for more info on how to hide an item.
   * **Note:** This method is implemented only on macOS.
   */
  public fun isItemHidden(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isItemHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the tooltip associated with the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  public fun getItemTooltip(rid: RID, idx: Int): String {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemState(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemStatePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns number of states of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemMaxStates(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemMaxStatesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the icon of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemIcon(rid: RID, idx: Int): Texture2D? {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  public fun getItemIndentationLevel(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getItemIndentationLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the checkstate status of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemChecked(
    rid: RID,
    idx: Int,
    checked: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checked)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCheckedPtr, NIL)
  }

  /**
   * Sets whether the item at index [idx] has a checkbox. If `false`, sets the type of the item to
   * plain text.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemCheckable(
    rid: RID,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCheckablePtr, NIL)
  }

  /**
   * Sets the type of the item at the specified index [idx] to radio button. If `false`, sets the
   * type of the item to plain text.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemRadioCheckable(
    rid: RID,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemRadioCheckablePtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when an item is pressed.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemCallback(
    rid: RID,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemCallbackPtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. The callback is emitted when an item is hovered.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemHoverCallbacks(
    rid: RID,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemHoverCallbacksPtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when its accelerator is
   * activated.
   * **Note:** The [keyCallback] Callable needs to accept exactly one Variant parameter, the
   * parameter passed to the Callable will be the value passed to the `tag` parameter when the menu
   * item was created.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemKeyCallback(
    rid: RID,
    idx: Int,
    keyCallback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to keyCallback)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemKeyCallbackPtr, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [getItemTag],
   * which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemTag(
    rid: RID,
    idx: Int,
    tag: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), ANY to tag)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTagPtr, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemText(
    rid: RID,
    idx: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Sets the submenu RID of the item at index [idx]. The submenu is a global menu that would be
   * shown when the item is clicked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemSubmenu(
    rid: RID,
    idx: Int,
    submenuRid: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), _RID to submenuRid)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemSubmenuPtr, NIL)
  }

  /**
   * Sets the accelerator of the item at index [idx]. [keycode] can be a single [Key], or a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemAccelerator(
    rid: RID,
    idx: Int,
    keycode: Key,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to keycode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemAcceleratorPtr, NIL)
  }

  /**
   * Enables/disables the item at index [idx]. When it is disabled, it can't be selected and its
   * action can't be invoked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemDisabled(
    rid: RID,
    idx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Hides/shows the item at index [idx]. When it is hidden, an item does not appear in a menu and
   * its action cannot be invoked.
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemHidden(
    rid: RID,
    idx: Int,
    hidden: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to hidden)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemHiddenPtr, NIL)
  }

  /**
   * Sets the [String] tooltip of the item at the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemTooltip(
    rid: RID,
    idx: Int,
    tooltip: String,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemState(
    rid: RID,
    idx: Int,
    state: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to state.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemStatePtr, NIL)
  }

  /**
   * Sets number of state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setItemMaxStates(
    rid: RID,
    idx: Int,
    maxStates: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to maxStates.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemMaxStatesPtr, NIL)
  }

  /**
   * Replaces the [Texture2D] icon of the specified [idx].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** This method is not supported by macOS Dock menu items.
   */
  public fun setItemIcon(
    rid: RID,
    idx: Int,
    icon: Texture2D,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  public fun setItemIndentationLevel(
    rid: RID,
    idx: Int,
    level: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to level.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setItemIndentationLevelPtr, NIL)
  }

  /**
   * Returns number of items in the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun getItemCount(rid: RID): Int {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Return `true` is global menu is a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  public fun isSystemMenu(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.isSystemMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes the item at index [idx] from the global menu [rid].
   * **Note:** The indices of items after the removed item will be shifted by one.
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun removeItem(rid: RID, idx: Int): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun clear(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public enum class Feature(
    id: Long,
  ) {
    /**
     * [NativeMenu] supports native global main menu.
     */
    FEATURE_GLOBAL_MENU(0),
    /**
     * [NativeMenu] supports native popup menus.
     */
    FEATURE_POPUP_MENU(1),
    /**
     * [NativeMenu] supports menu open and close callbacks.
     */
    FEATURE_OPEN_CLOSE_CALLBACK(2),
    /**
     * [NativeMenu] supports menu item hover callback.
     */
    FEATURE_HOVER_CALLBACK(3),
    /**
     * [NativeMenu] supports menu item accelerator/key callback.
     */
    FEATURE_KEY_CALLBACK(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SystemMenus(
    id: Long,
  ) {
    /**
     * Invalid special system menu ID.
     */
    INVALID_MENU_ID(0),
    /**
     * Global main menu ID.
     */
    MAIN_MENU_ID(1),
    /**
     * Application (first menu after "Apple" menu on macOS) menu ID.
     */
    APPLICATION_MENU_ID(2),
    /**
     * "Window" menu ID (on macOS this menu includes standard window control items and a list of
     * open windows).
     */
    WINDOW_MENU_ID(3),
    /**
     * "Help" menu ID (on macOS this menu includes help search bar).
     */
    HELP_MENU_ID(4),
    /**
     * Dock icon right-click menu ID (on macOS this menu include standard application control items
     * and a list of open windows).
     */
    DOCK_MENU_ID(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val hasFeaturePtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "has_feature")

    public val hasSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "has_system_menu")

    public val getSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_system_menu")

    public val getSystemMenuNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_system_menu_name")

    public val createMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "create_menu")

    public val hasMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "has_menu")

    public val freeMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "free_menu")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "get_size")

    public val popupPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "popup")

    public val setInterfaceDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_interface_direction")

    public val setPopupOpenCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_popup_open_callback")

    public val getPopupOpenCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_popup_open_callback")

    public val setPopupCloseCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_popup_close_callback")

    public val getPopupCloseCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_popup_close_callback")

    public val setMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_minimum_width")

    public val getMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_minimum_width")

    public val isOpenedPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "is_opened")

    public val addSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_submenu_item")

    public val addItemPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "add_item")

    public val addCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_check_item")

    public val addIconItemPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "add_icon_item")

    public val addIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_icon_check_item")

    public val addRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_radio_check_item")

    public val addIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_icon_radio_check_item")

    public val addMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_multistate_item")

    public val addSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_separator")

    public val findItemIndexWithTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_text")

    public val findItemIndexWithTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_tag")

    public val findItemIndexWithSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_submenu")

    public val isItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_checked")

    public val isItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_checkable")

    public val isItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_radio_checkable")

    public val getItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_callback")

    public val getItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_key_callback")

    public val getItemTagPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "get_item_tag")

    public val getItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "get_item_text")

    public val getItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_submenu")

    public val getItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_accelerator")

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_disabled")

    public val isItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_hidden")

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_tooltip")

    public val getItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_state")

    public val getItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_max_states")

    public val getItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "get_item_icon")

    public val getItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_indentation_level")

    public val setItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_checked")

    public val setItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_checkable")

    public val setItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_radio_checkable")

    public val setItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_callback")

    public val setItemHoverCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_hover_callbacks")

    public val setItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_key_callback")

    public val setItemTagPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "set_item_tag")

    public val setItemTextPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "set_item_text")

    public val setItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_submenu")

    public val setItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_accelerator")

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_disabled")

    public val setItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_hidden")

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_tooltip")

    public val setItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_state")

    public val setItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_max_states")

    public val setItemIconPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "set_item_icon")

    public val setItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_indentation_level")

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_count")

    public val isSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_system_menu")

    public val removeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "remove_item")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "clear")
  }
}
