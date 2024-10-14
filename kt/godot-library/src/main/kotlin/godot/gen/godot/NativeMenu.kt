// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
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
import kotlin.jvm.JvmStatic

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
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_NATIVEMENU)
  }

  /**
   * Returns `true` if the specified [feature] is supported by the current [NativeMenu], `false`
   * otherwise.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(ptr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a special system menu is supported.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun hasSystemMenu(menuId: SystemMenus): Boolean {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(ptr, MethodBindings.hasSystemMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns RID of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getSystemMenu(menuId: SystemMenus): RID {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(ptr, MethodBindings.getSystemMenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns readable name of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getSystemMenuName(menuId: SystemMenus): String {
    TransferContext.writeArguments(LONG to menuId.id)
    TransferContext.callMethod(ptr, MethodBindings.getSystemMenuNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Creates a new global menu object.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun createMenu(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createMenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns `true` if [rid] is valid global menu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun hasMenu(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.hasMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Frees a global menu object created by this [NativeMenu].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun freeMenu(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.freeMenuPtr, NIL)
  }

  /**
   * Returns global menu size.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getSize(rid: RID): Vector2 {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Shows the global menu at [position] in the screen coordinates.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun popup(rid: RID, position: Vector2i): Unit {
    TransferContext.writeArguments(_RID to rid, VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.popupPtr, NIL)
  }

  /**
   * Sets the menu text layout direction from right-to-left if [isRtl] is `true`.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setInterfaceDirection(rid: RID, isRtl: Boolean): Unit {
    TransferContext.writeArguments(_RID to rid, BOOL to isRtl)
    TransferContext.callMethod(ptr, MethodBindings.setInterfaceDirectionPtr, NIL)
  }

  /**
   * Registers callable to emit after the menu is closed.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setPopupOpenCallback(rid: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to rid, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.setPopupOpenCallbackPtr, NIL)
  }

  /**
   * Returns global menu open callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getPopupOpenCallback(rid: RID): Callable {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.getPopupOpenCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Registers callable to emit when the menu is about to show.
   * **Note:** The OS can simulate menu opening to track menu item changes and global shortcuts, in
   * which case the corresponding close callback is not triggered. Use [isOpened] to check if the menu
   * is currently opened.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setPopupCloseCallback(rid: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to rid, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.setPopupCloseCallbackPtr, NIL)
  }

  /**
   * Returns global menu close callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getPopupCloseCallback(rid: RID): Callable {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.getPopupCloseCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Sets the minimum width of the global menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setMinimumWidth(rid: RID, width: Float): Unit {
    TransferContext.writeArguments(_RID to rid, DOUBLE to width.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMinimumWidthPtr, NIL)
  }

  /**
   * Returns global menu minimum width.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getMinimumWidth(rid: RID): Float {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.getMinimumWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if the menu is currently opened.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isOpened(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.isOpenedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds an item that will act as a submenu of the global menu [rid]. The [submenuRid] argument is
   * the RID of the global menu that will be shown when the item is clicked.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun addSubmenuItem(
    rid: RID,
    label: String,
    submenuRid: RID,
    tag: Any? = null,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, _RID to submenuRid, ANY to tag, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addSubmenuItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addCheckItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addIconItem(
    rid: RID,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addIconCheckItem(
    rid: RID,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addIconCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addRadioCheckItem(
    rid: RID,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addIconRadioCheckItem(
    rid: RID,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addIconRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
  @JvmStatic
  public final fun addMultistateItem(
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
    TransferContext.callMethod(ptr, MethodBindings.addMultistateItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a separator between items to the global menu [rid]. Separators also occupy an index.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun addSeparator(rid: RID, index: Int = -1): Int {
    TransferContext.writeArguments(_RID to rid, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addSeparatorPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [text]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithText(rid: RID, text: String): Int {
    TransferContext.writeArguments(_RID to rid, STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.findItemIndexWithTextPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [tag]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithTag(rid: RID, tag: Any?): Int {
    TransferContext.writeArguments(_RID to rid, ANY to tag)
    TransferContext.callMethod(ptr, MethodBindings.findItemIndexWithTagPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the submenu specified by [submenuRid]. Indices are
   * automatically assigned to each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithSubmenu(rid: RID, submenuRid: RID): Int {
    TransferContext.writeArguments(_RID to rid, _RID to submenuRid)
    TransferContext.callMethod(ptr, MethodBindings.findItemIndexWithSubmenuPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the item at index [idx] is checked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemChecked(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is checkable in some way, i.e. if it has a checkbox
   * or radio button.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemCheckable(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemRadioCheckable(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the callback of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemCallback(rid: RID, idx: Int): Callable {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the callback of the item accelerator at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemKeyCallback(rid: RID, idx: Int): Callable {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemKeyCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [setItemTag], which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemTag(rid: RID, idx: Int): Any? {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTagPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the text of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemText(rid: RID, idx: Int): String {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the submenu ID of the item at index [idx]. See [addSubmenuItem] for more info on how to
   * add a submenu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemSubmenu(rid: RID, idx: Int): RID {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemSubmenuPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the accelerator of the item at index [idx]. Accelerators are special combinations of
   * keys that activate the item, no matter which control is focused.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemAccelerator(rid: RID, idx: Int): Key {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the item at index [idx] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [setItemDisabled] for more info on how to disable an item.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemDisabled(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is hidden.
   * See [setItemHidden] for more info on how to hide an item.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isItemHidden(rid: RID, idx: Int): Boolean {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isItemHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the tooltip associated with the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemTooltip(rid: RID, idx: Int): String {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemState(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemStatePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns number of states of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemMaxStates(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemMaxStatesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the icon of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemIcon(rid: RID, idx: Int): Texture2D? {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemIndentationLevel(rid: RID, idx: Int): Int {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemIndentationLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the checkstate status of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemChecked(
    rid: RID,
    idx: Int,
    checked: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checked)
    TransferContext.callMethod(ptr, MethodBindings.setItemCheckedPtr, NIL)
  }

  /**
   * Sets whether the item at index [idx] has a checkbox. If `false`, sets the type of the item to
   * plain text.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemCheckable(
    rid: RID,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(ptr, MethodBindings.setItemCheckablePtr, NIL)
  }

  /**
   * Sets the type of the item at the specified index [idx] to radio button. If `false`, sets the
   * type of the item to plain text.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemRadioCheckable(
    rid: RID,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(ptr, MethodBindings.setItemRadioCheckablePtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when an item is pressed.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemCallback(
    rid: RID,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.setItemCallbackPtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. The callback is emitted when an item is hovered.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemHoverCallbacks(
    rid: RID,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.setItemHoverCallbacksPtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when its accelerator is
   * activated.
   * **Note:** The [keyCallback] Callable needs to accept exactly one Variant parameter, the
   * parameter passed to the Callable will be the value passed to the `tag` parameter when the menu
   * item was created.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemKeyCallback(
    rid: RID,
    idx: Int,
    keyCallback: Callable,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to keyCallback)
    TransferContext.callMethod(ptr, MethodBindings.setItemKeyCallbackPtr, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with [getItemTag],
   * which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemTag(
    rid: RID,
    idx: Int,
    tag: Any?,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), ANY to tag)
    TransferContext.callMethod(ptr, MethodBindings.setItemTagPtr, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemText(
    rid: RID,
    idx: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setItemTextPtr, NIL)
  }

  /**
   * Sets the submenu RID of the item at index [idx]. The submenu is a global menu that would be
   * shown when the item is clicked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemSubmenu(
    rid: RID,
    idx: Int,
    submenuRid: RID,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), _RID to submenuRid)
    TransferContext.callMethod(ptr, MethodBindings.setItemSubmenuPtr, NIL)
  }

  /**
   * Sets the accelerator of the item at index [idx]. [keycode] can be a single [Key], or a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemAccelerator(
    rid: RID,
    idx: Int,
    keycode: Key,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to keycode.id)
    TransferContext.callMethod(ptr, MethodBindings.setItemAcceleratorPtr, NIL)
  }

  /**
   * Enables/disables the item at index [idx]. When it is disabled, it can't be selected and its
   * action can't be invoked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemDisabled(
    rid: RID,
    idx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setItemDisabledPtr, NIL)
  }

  /**
   * Hides/shows the item at index [idx]. When it is hidden, an item does not appear in a menu and
   * its action cannot be invoked.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemHidden(
    rid: RID,
    idx: Int,
    hidden: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setItemHiddenPtr, NIL)
  }

  /**
   * Sets the [String] tooltip of the item at the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemTooltip(
    rid: RID,
    idx: Int,
    tooltip: String,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.setItemTooltipPtr, NIL)
  }

  /**
   * Sets the state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemState(
    rid: RID,
    idx: Int,
    state: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to state.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemStatePtr, NIL)
  }

  /**
   * Sets number of state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setItemMaxStates(
    rid: RID,
    idx: Int,
    maxStates: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to maxStates.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemMaxStatesPtr, NIL)
  }

  /**
   * Replaces the [Texture2D] icon of the specified [idx].
   * **Note:** This method is implemented on macOS and Windows.
   * **Note:** This method is not supported by macOS Dock menu items.
   */
  @JvmStatic
  public final fun setItemIcon(
    rid: RID,
    idx: Int,
    icon: Texture2D?,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setItemIconPtr, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setItemIndentationLevel(
    rid: RID,
    idx: Int,
    level: Int,
  ): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to level.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setItemIndentationLevelPtr, NIL)
  }

  /**
   * Returns number of items in the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemCount(rid: RID): Int {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.getItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Return `true` is global menu is a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isSystemMenu(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.isSystemMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the item at index [idx] from the global menu [rid].
   * **Note:** The indices of items after the removed item will be shifted by one.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun removeItem(rid: RID, idx: Int): Unit {
    TransferContext.writeArguments(_RID to rid, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun clear(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
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
      public fun from(`value`: Long): Feature = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): SystemMenus = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "has_feature", 1708975490)

    public val hasSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "has_system_menu", 718213027)

    public val getSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_system_menu", 469707506)

    public val getSystemMenuNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_system_menu_name", 1281499290)

    public val createMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "create_menu", 529393457)

    public val hasMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "has_menu", 4155700596)

    public val freeMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "free_menu", 2722037293)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_size", 2440833711)

    public val popupPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "popup", 2450610377)

    public val setInterfaceDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_interface_direction", 1265174801)

    public val setPopupOpenCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_popup_open_callback", 3379118538)

    public val getPopupOpenCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_popup_open_callback", 3170603026)

    public val setPopupCloseCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_popup_close_callback", 3379118538)

    public val getPopupCloseCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_popup_close_callback", 3170603026)

    public val setMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_minimum_width", 1794382983)

    public val getMinimumWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_minimum_width", 866169185)

    public val isOpenedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_opened", 4155700596)

    public val addSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_submenu_item", 1002030223)

    public val addItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_item", 2553375659)

    public val addCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_check_item", 2553375659)

    public val addIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_icon_item", 2987595282)

    public val addIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_icon_check_item", 2987595282)

    public val addRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_radio_check_item", 2553375659)

    public val addIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_icon_radio_check_item", 2987595282)

    public val addMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_multistate_item", 1558592568)

    public val addSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "add_separator", 448810126)

    public val findItemIndexWithTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_text", 1362438794)

    public val findItemIndexWithTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_tag", 1260085030)

    public val findItemIndexWithSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "find_item_index_with_submenu", 893635918)

    public val isItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_checked", 3120086654)

    public val isItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_checkable", 3120086654)

    public val isItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_radio_checkable", 3120086654)

    public val getItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_callback", 1639989698)

    public val getItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_key_callback", 1639989698)

    public val getItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_tag", 4069510997)

    public val getItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_text", 1464764419)

    public val getItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_submenu", 1066463050)

    public val getItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_accelerator", 316800700)

    public val isItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_disabled", 3120086654)

    public val isItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_item_hidden", 3120086654)

    public val getItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_tooltip", 1464764419)

    public val getItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_state", 1120910005)

    public val getItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_max_states", 1120910005)

    public val getItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_icon", 3391850701)

    public val getItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_indentation_level", 1120910005)

    public val setItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_checked", 2658558584)

    public val setItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_checkable", 2658558584)

    public val setItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_radio_checkable", 2658558584)

    public val setItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_callback", 2779810226)

    public val setItemHoverCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_hover_callbacks", 2779810226)

    public val setItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_key_callback", 2779810226)

    public val setItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_tag", 2706844827)

    public val setItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_text", 4153150897)

    public val setItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_submenu", 2310537182)

    public val setItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_accelerator", 786300043)

    public val setItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_disabled", 2658558584)

    public val setItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_hidden", 2658558584)

    public val setItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_tooltip", 4153150897)

    public val setItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_state", 4288446313)

    public val setItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_max_states", 4288446313)

    public val setItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_icon", 1388763257)

    public val setItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "set_item_indentation_level", 4288446313)

    public val getItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "get_item_count", 2198884583)

    public val isSystemMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "is_system_menu", 4155700596)

    public val removeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NativeMenu", "remove_item", 3411492887)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("NativeMenu", "clear", 2722037293)
  }
}
