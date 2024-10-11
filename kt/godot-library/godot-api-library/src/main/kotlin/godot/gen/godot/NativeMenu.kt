// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.RID
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
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_NATIVEMENU_INDEX: Int = 31

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
    Internals.getSingleton(this, ENGINE_CLASS_NATIVEMENU_INDEX)
  }

  /**
   * Returns `true` if the specified [feature] is supported by the current [NativeMenu], `false`
   * otherwise.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun hasFeature(feature: Feature): Boolean {
    Internals.writeArguments(LONG to feature.id)
    Internals.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a special system menu is supported.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun hasSystemMenu(menuId: SystemMenus): Boolean {
    Internals.writeArguments(LONG to menuId.id)
    Internals.callMethod(rawPtr, MethodBindings.hasSystemMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns RID of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getSystemMenu(menuId: SystemMenus): RID {
    Internals.writeArguments(LONG to menuId.id)
    Internals.callMethod(rawPtr, MethodBindings.getSystemMenuPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns readable name of a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getSystemMenuName(menuId: SystemMenus): String {
    Internals.writeArguments(LONG to menuId.id)
    Internals.callMethod(rawPtr, MethodBindings.getSystemMenuNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Creates a new global menu object.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun createMenu(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createMenuPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns `true` if [rid] is valid global menu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun hasMenu(rid: RID): Boolean {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.hasMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Frees a global menu object created by this [NativeMenu].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun freeMenu(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.freeMenuPtr, NIL)
  }

  /**
   * Returns global menu size.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getSize(rid: RID): Vector2 {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Shows the global menu at [position] in the screen coordinates.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun popup(rid: RID, position: Vector2i): Unit {
    Internals.writeArguments(_RID to rid, VECTOR2I to position)
    Internals.callMethod(rawPtr, MethodBindings.popupPtr, NIL)
  }

  /**
   * Sets the menu text layout direction from right-to-left if [isRtl] is `true`.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun setInterfaceDirection(rid: RID, isRtl: Boolean): Unit {
    Internals.writeArguments(_RID to rid, BOOL to isRtl)
    Internals.callMethod(rawPtr, MethodBindings.setInterfaceDirectionPtr, NIL)
  }

  /**
   * Registers callable to emit after the menu is closed.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setPopupOpenCallback(rid: RID, callback: Callable): Unit {
    Internals.writeArguments(_RID to rid, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setPopupOpenCallbackPtr, NIL)
  }

  /**
   * Returns global menu open callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getPopupOpenCallback(rid: RID): Callable {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.getPopupOpenCallbackPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
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
    Internals.writeArguments(_RID to rid, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setPopupCloseCallbackPtr, NIL)
  }

  /**
   * Returns global menu close callback.
   * b]Note:[/b] This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getPopupCloseCallback(rid: RID): Callable {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.getPopupCloseCallbackPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Sets the minimum width of the global menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun setMinimumWidth(rid: RID, width: Float): Unit {
    Internals.writeArguments(_RID to rid, DOUBLE to width.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMinimumWidthPtr, NIL)
  }

  /**
   * Returns global menu minimum width.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getMinimumWidth(rid: RID): Float {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.getMinimumWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if the menu is currently opened.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isOpened(rid: RID): Boolean {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.isOpenedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
    Internals.writeArguments(_RID to rid, STRING to label, _RID to submenuRid, ANY to tag, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addSubmenuItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addCheckItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addIconItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addIconCheckItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addRadioCheckItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addIconRadioCheckItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addMultistateItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a separator between items to the global menu [rid]. Separators also occupy an index.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun addSeparator(rid: RID, index: Int = -1): Int {
    Internals.writeArguments(_RID to rid, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addSeparatorPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [text]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithText(rid: RID, text: String): Int {
    Internals.writeArguments(_RID to rid, STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.findItemIndexWithTextPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [tag]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithTag(rid: RID, tag: Any?): Int {
    Internals.writeArguments(_RID to rid, ANY to tag)
    Internals.callMethod(rawPtr, MethodBindings.findItemIndexWithTagPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the submenu specified by [submenuRid]. Indices are
   * automatically assigned to each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun findItemIndexWithSubmenu(rid: RID, submenuRid: RID): Int {
    Internals.writeArguments(_RID to rid, _RID to submenuRid)
    Internals.callMethod(rawPtr, MethodBindings.findItemIndexWithSubmenuPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the item at index [idx] is checked.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemChecked(rid: RID, idx: Int): Boolean {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemCheckedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is checkable in some way, i.e. if it has a checkbox
   * or radio button.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemCheckable(rid: RID, idx: Int): Boolean {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemCheckablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemRadioCheckable(rid: RID, idx: Int): Boolean {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemRadioCheckablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the callback of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemCallback(rid: RID, idx: Int): Callable {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemCallbackPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the callback of the item accelerator at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemKeyCallback(rid: RID, idx: Int): Callable {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemKeyCallbackPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [setItemTag], which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemTag(rid: RID, idx: Int): Any? {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTagPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the text of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemText(rid: RID, idx: Int): String {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the submenu ID of the item at index [idx]. See [addSubmenuItem] for more info on how to
   * add a submenu.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemSubmenu(rid: RID, idx: Int): RID {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemSubmenuPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the accelerator of the item at index [idx]. Accelerators are special combinations of
   * keys that activate the item, no matter which control is focused.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemAccelerator(rid: RID, idx: Int): Key {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemAcceleratorPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the item at index [idx] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [setItemDisabled] for more info on how to disable an item.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun isItemDisabled(rid: RID, idx: Int): Boolean {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is hidden.
   * See [setItemHidden] for more info on how to hide an item.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isItemHidden(rid: RID, idx: Int): Boolean {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isItemHiddenPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the tooltip associated with the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemTooltip(rid: RID, idx: Int): String {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemTooltipPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the state of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemState(rid: RID, idx: Int): Int {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemStatePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns number of states of a multistate item. See [addMultistateItem] for details.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemMaxStates(rid: RID, idx: Int): Int {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMaxStatesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the icon of the item at index [idx].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemIcon(rid: RID, idx: Int): Texture2D? {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun getItemIndentationLevel(rid: RID, idx: Int): Int {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemIndentationLevelPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checked)
    Internals.callMethod(rawPtr, MethodBindings.setItemCheckedPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    Internals.callMethod(rawPtr, MethodBindings.setItemCheckablePtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to checkable)
    Internals.callMethod(rawPtr, MethodBindings.setItemRadioCheckablePtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setItemCallbackPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setItemHoverCallbacksPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), CALLABLE to keyCallback)
    Internals.callMethod(rawPtr, MethodBindings.setItemKeyCallbackPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), ANY to tag)
    Internals.callMethod(rawPtr, MethodBindings.setItemTagPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setItemTextPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), _RID to submenuRid)
    Internals.callMethod(rawPtr, MethodBindings.setItemSubmenuPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to keycode.id)
    Internals.callMethod(rawPtr, MethodBindings.setItemAcceleratorPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setItemDisabledPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), BOOL to hidden)
    Internals.callMethod(rawPtr, MethodBindings.setItemHiddenPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), STRING to tooltip)
    Internals.callMethod(rawPtr, MethodBindings.setItemTooltipPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to state.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemStatePtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to maxStates.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemMaxStatesPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setItemIconPtr, NIL)
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
    Internals.writeArguments(_RID to rid, LONG to idx.toLong(), LONG to level.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setItemIndentationLevelPtr, NIL)
  }

  /**
   * Returns number of items in the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getItemCount(rid: RID): Int {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.getItemCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Return `true` is global menu is a special system menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun isSystemMenu(rid: RID): Boolean {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.isSystemMenuPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the item at index [idx] from the global menu [rid].
   * **Note:** The indices of items after the removed item will be shifted by one.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun removeItem(rid: RID, idx: Int): Unit {
    Internals.writeArguments(_RID to rid, LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Removes all items from the global menu [rid].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun clear(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
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

  public object MethodBindings {
    internal val hasFeaturePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "has_feature", 1708975490)

    internal val hasSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "has_system_menu", 718213027)

    internal val getSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_system_menu", 469707506)

    internal val getSystemMenuNamePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_system_menu_name", 1281499290)

    internal val createMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "create_menu", 529393457)

    internal val hasMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "has_menu", 4155700596)

    internal val freeMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "free_menu", 2722037293)

    internal val getSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_size", 2440833711)

    internal val popupPtr: VoidPtr = Internals.getMethodBindPtr("NativeMenu", "popup", 2450610377)

    internal val setInterfaceDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_interface_direction", 1265174801)

    internal val setPopupOpenCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_popup_open_callback", 3379118538)

    internal val getPopupOpenCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_popup_open_callback", 3170603026)

    internal val setPopupCloseCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_popup_close_callback", 3379118538)

    internal val getPopupCloseCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_popup_close_callback", 3170603026)

    internal val setMinimumWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_minimum_width", 1794382983)

    internal val getMinimumWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_minimum_width", 866169185)

    internal val isOpenedPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_opened", 4155700596)

    internal val addSubmenuItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_submenu_item", 1002030223)

    internal val addItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_item", 2553375659)

    internal val addCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_check_item", 2553375659)

    internal val addIconItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_icon_item", 2987595282)

    internal val addIconCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_icon_check_item", 2987595282)

    internal val addRadioCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_radio_check_item", 2553375659)

    internal val addIconRadioCheckItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_icon_radio_check_item", 2987595282)

    internal val addMultistateItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_multistate_item", 1558592568)

    internal val addSeparatorPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "add_separator", 448810126)

    internal val findItemIndexWithTextPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "find_item_index_with_text", 1362438794)

    internal val findItemIndexWithTagPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "find_item_index_with_tag", 1260085030)

    internal val findItemIndexWithSubmenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "find_item_index_with_submenu", 893635918)

    internal val isItemCheckedPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_item_checked", 3120086654)

    internal val isItemCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_item_checkable", 3120086654)

    internal val isItemRadioCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_item_radio_checkable", 3120086654)

    internal val getItemCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_callback", 1639989698)

    internal val getItemKeyCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_key_callback", 1639989698)

    internal val getItemTagPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_tag", 4069510997)

    internal val getItemTextPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_text", 1464764419)

    internal val getItemSubmenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_submenu", 1066463050)

    internal val getItemAcceleratorPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_accelerator", 316800700)

    internal val isItemDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_item_disabled", 3120086654)

    internal val isItemHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_item_hidden", 3120086654)

    internal val getItemTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_tooltip", 1464764419)

    internal val getItemStatePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_state", 1120910005)

    internal val getItemMaxStatesPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_max_states", 1120910005)

    internal val getItemIconPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_icon", 3391850701)

    internal val getItemIndentationLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_indentation_level", 1120910005)

    internal val setItemCheckedPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_checked", 2658558584)

    internal val setItemCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_checkable", 2658558584)

    internal val setItemRadioCheckablePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_radio_checkable", 2658558584)

    internal val setItemCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_callback", 2779810226)

    internal val setItemHoverCallbacksPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_hover_callbacks", 2779810226)

    internal val setItemKeyCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_key_callback", 2779810226)

    internal val setItemTagPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_tag", 2706844827)

    internal val setItemTextPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_text", 4153150897)

    internal val setItemSubmenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_submenu", 2310537182)

    internal val setItemAcceleratorPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_accelerator", 786300043)

    internal val setItemDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_disabled", 2658558584)

    internal val setItemHiddenPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_hidden", 2658558584)

    internal val setItemTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_tooltip", 4153150897)

    internal val setItemStatePtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_state", 4288446313)

    internal val setItemMaxStatesPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_max_states", 4288446313)

    internal val setItemIconPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_icon", 1388763257)

    internal val setItemIndentationLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "set_item_indentation_level", 4288446313)

    internal val getItemCountPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "get_item_count", 2198884583)

    internal val isSystemMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "is_system_menu", 4155700596)

    internal val removeItemPtr: VoidPtr =
        Internals.getMethodBindPtr("NativeMenu", "remove_item", 3411492887)

    internal val clearPtr: VoidPtr = Internals.getMethodBindPtr("NativeMenu", "clear", 2722037293)
  }
}
