// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser.VECTOR3I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
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
 * [DisplayServer] handles everything related to window management. It is separated from [OS] as a
 * single operating system may support multiple display servers.
 * **Headless mode:** Starting the engine with the `--headless`
 * [url=$DOCS_URL/tutorials/editor/command_line_tutorial.html]command line argument[/url] disables all
 * rendering and window management functions. Most functions from [DisplayServer] will return dummy
 * values in this case.
 */
@GodotBaseType
public object DisplayServer : Object() {
  /**
   * Represents the screen containing the mouse pointer.
   * **Note:** On Linux (Wayland), this constant always represents the screen at index `0`.
   */
  public final const val SCREEN_WITH_MOUSE_FOCUS: Long = -4

  /**
   * Represents the screen containing the window with the keyboard focus.
   * **Note:** On Linux (Wayland), this constant always represents the screen at index `0`.
   */
  public final const val SCREEN_WITH_KEYBOARD_FOCUS: Long = -3

  /**
   * Represents the primary screen.
   * **Note:** On Linux (Wayland), this constant always represents the screen at index `0`.
   */
  public final const val SCREEN_PRIMARY: Long = -2

  /**
   * Represents the screen where the main window is located. This is usually the default value in
   * functions that allow specifying one of several screens.
   * **Note:** On Linux (Wayland), this constant always represents the screen at index `0`.
   */
  public final const val SCREEN_OF_MAIN_WINDOW: Long = -1

  /**
   * The ID of the main window spawned by the engine, which can be passed to methods expecting a
   * `window_id`.
   */
  public final const val MAIN_WINDOW_ID: Long = 0

  /**
   * The ID that refers to a nonexistent window. This is returned by some [DisplayServer] methods if
   * no window matches the requested result.
   */
  public final const val INVALID_WINDOW_ID: Long = -1

  /**
   * The ID that refers to a nonexistent application status indicator.
   */
  public final const val INVALID_INDICATOR_ID: Long = -1

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_DISPLAYSERVER)
  }

  /**
   * Returns `true` if the specified [feature] is supported by the current [DisplayServer], `false`
   * otherwise.
   */
  @JvmStatic
  public final fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(ptr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the name of the [DisplayServer] currently in use. Most operating systems only have a
   * single [DisplayServer], but Linux has access to more than one [DisplayServer] (currently X11 and
   * Wayland).
   * The names of built-in display servers are `Windows`, `macOS`, `X11` (Linux), `Wayland` (Linux),
   * `Android`, `iOS`, `web` (HTML5), and `headless` (when started with the `--headless`
   * [url=$DOCS_URL/tutorials/editor/command_line_tutorial.html]command line argument[/url]).
   */
  @JvmStatic
  public final fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets native help system search callbacks.
   * [searchCallback] has the following arguments: `String search_string, int result_limit` and
   * return a [Dictionary] with "key, display name" pairs for the search results. Called when the user
   * enters search terms in the `Help` menu.
   * [actionCallback] has the following arguments: `String key`. Called when the user selects a
   * search result in the `Help` menu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun helpSetSearchCallbacks(searchCallback: Callable, actionCallback: Callable):
      Unit {
    TransferContext.writeArguments(CALLABLE to searchCallback, CALLABLE to actionCallback)
    TransferContext.callMethod(ptr, MethodBindings.helpSetSearchCallbacksPtr, NIL)
  }

  /**
   * Registers callables to emit when the menu is respectively about to show or closed. Callback
   * methods should have zero arguments.
   */
  @JvmStatic
  public final fun globalMenuSetPopupCallbacks(
    menuRoot: String,
    openCallback: Callable,
    closeCallback: Callable,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, CALLABLE to openCallback, CALLABLE to closeCallback)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetPopupCallbacksPtr, NIL)
  }

  /**
   * Adds an item that will act as a submenu of the global menu [menuRoot]. The [submenu] argument
   * is the ID of the global menu root that will be shown when the item is clicked.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddSubmenuItem(
    menuRoot: String,
    label: String,
    submenu: String,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, STRING to submenu, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddSubmenuItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] to the global menu with ID [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new checkable item with text [label] to the global menu with ID [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] and icon [icon] to the global menu with ID [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddIconItem(
    menuRoot: String,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddIconItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new checkable item with text [label] and icon [icon] to the global menu with ID
   * [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddIconCheckItem(
    menuRoot: String,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddIconCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new radio-checkable item with text [label] to the global menu with ID [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [globalMenuSetItemChecked] for more info on
   * how to control it.
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddRadioCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new radio-checkable item with text [label] and icon [icon] to the global menu with ID
   * [menuRoot].
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * An [accelerator] can optionally be defined, which is a keyboard shortcut that can be pressed to
   * trigger the menu button even if it's not currently open. The [accelerator] is generally a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** Radio-checkable items just display a checkmark, but don't have any built-in checking
   * behavior and must be checked/unchecked manually. See [globalMenuSetItemChecked] for more info on
   * how to control it.
   * **Note:** The [callback] and [keyCallback] Callables need to accept exactly one Variant
   * parameter, the parameter passed to the Callables will be the value passed to [tag].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddIconRadioCheckItem(
    menuRoot: String,
    icon: Texture2D?,
    label: String,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, OBJECT to icon, STRING to label, CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddIconRadioCheckItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a new item with text [label] to the global menu with ID [menuRoot].
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
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddMultistateItem(
    menuRoot: String,
    label: String,
    maxStates: Int,
    defaultState: Int,
    callback: Callable = Callable(),
    keyCallback: Callable = Callable(),
    tag: Any? = null,
    accelerator: Key = Key.KEY_NONE,
    index: Int = -1,
  ): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, LONG to maxStates.toLong(), LONG to defaultState.toLong(), CALLABLE to callback, CALLABLE to keyCallback, ANY to tag, LONG to accelerator.id, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddMultistateItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a separator between items to the global menu with ID [menuRoot]. Separators also occupy an
   * index.
   * Returns index of the inserted item, it's not guaranteed to be the same as [index] value.
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun globalMenuAddSeparator(menuRoot: String, index: Int = -1): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuAddSeparatorPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [text]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemIndexFromText(menuRoot: String, text: String): Int {
    TransferContext.writeArguments(STRING to menuRoot, STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemIndexFromTextPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the item with the specified [tag]. Indices are automatically assigned to
   * each item by the engine, and cannot be set manually.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemIndexFromTag(menuRoot: String, tag: Any?): Int {
    TransferContext.writeArguments(STRING to menuRoot, ANY to tag)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemIndexFromTagPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the item at index [idx] is checked.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuIsItemChecked(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuIsItemCheckedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is checkable in some way, i.e. if it has a checkbox
   * or radio button.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuIsItemCheckable(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuIsItemCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] has radio button-style checkability.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuIsItemRadioCheckable(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuIsItemRadioCheckablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the callback of the item at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemCallback(menuRoot: String, idx: Int): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the callback of the item accelerator at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemKeyCallback(menuRoot: String, idx: Int): Callable {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemKeyCallbackPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  /**
   * Returns the metadata of the specified item, which might be of any type. You can set it with
   * [globalMenuSetItemTag], which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemTag(menuRoot: String, idx: Int): Any? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemTagPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the text of the item at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemText(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the submenu ID of the item at index [idx]. See [globalMenuAddSubmenuItem] for more info
   * on how to add a submenu.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemSubmenu(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemSubmenuPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the accelerator of the item at index [idx]. Accelerators are special combinations of
   * keys that activate the item, no matter which control is focused.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemAccelerator(menuRoot: String, idx: Int): Key {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemAcceleratorPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the item at index [idx] is disabled. When it is disabled it can't be
   * selected, or its action invoked.
   * See [globalMenuSetItemDisabled] for more info on how to disable an item.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuIsItemDisabled(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuIsItemDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the item at index [idx] is hidden.
   * See [globalMenuSetItemHidden] for more info on how to hide an item.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuIsItemHidden(menuRoot: String, idx: Int): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuIsItemHiddenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the tooltip associated with the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemTooltip(menuRoot: String, idx: Int): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the state of a multistate item. See [globalMenuAddMultistateItem] for details.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemState(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemStatePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns number of states of a multistate item. See [globalMenuAddMultistateItem] for details.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemMaxStates(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemMaxStatesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the icon of the item at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemIcon(menuRoot: String, idx: Int): Texture2D? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemIndentationLevel(menuRoot: String, idx: Int): Int {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemIndentationLevelPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the checkstate status of the item at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemChecked(
    menuRoot: String,
    idx: Int,
    checked: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checked)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemCheckedPtr, NIL)
  }

  /**
   * Sets whether the item at index [idx] has a checkbox. If `false`, sets the type of the item to
   * plain text.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemCheckable(
    menuRoot: String,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemCheckablePtr, NIL)
  }

  /**
   * Sets the type of the item at the specified index [idx] to radio button. If `false`, sets the
   * type of the item to plain text.
   * **Note:** This is purely cosmetic; you must add the logic for checking/unchecking items in
   * radio groups.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemRadioCheckable(
    menuRoot: String,
    idx: Int,
    checkable: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to checkable)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemRadioCheckablePtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. Callback is emitted when an item is pressed.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemCallback(
    menuRoot: String,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemCallbackPtr, NIL)
  }

  /**
   * Sets the callback of the item at index [idx]. The callback is emitted when an item is hovered.
   * **Note:** The [callback] Callable needs to accept exactly one Variant parameter, the parameter
   * passed to the Callable will be the value passed to the `tag` parameter when the menu item was
   * created.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemHoverCallbacks(
    menuRoot: String,
    idx: Int,
    callback: Callable,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemHoverCallbacksPtr, NIL)
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
  public final fun globalMenuSetItemKeyCallback(
    menuRoot: String,
    idx: Int,
    keyCallback: Callable,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), CALLABLE to keyCallback)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemKeyCallbackPtr, NIL)
  }

  /**
   * Sets the metadata of an item, which may be of any type. You can later get it with
   * [globalMenuGetItemTag], which provides a simple way of assigning context data to items.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemTag(
    menuRoot: String,
    idx: Int,
    tag: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), ANY to tag)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemTagPtr, NIL)
  }

  /**
   * Sets the text of the item at index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemText(
    menuRoot: String,
    idx: Int,
    text: String,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemTextPtr, NIL)
  }

  /**
   * Sets the submenu of the item at index [idx]. The submenu is the ID of a global menu root that
   * would be shown when the item is clicked.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemSubmenu(
    menuRoot: String,
    idx: Int,
    submenu: String,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to submenu)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemSubmenuPtr, NIL)
  }

  /**
   * Sets the accelerator of the item at index [idx]. [keycode] can be a single [Key], or a
   * combination of [KeyModifierMask]s and [Key]s using bitwise OR such as `KEY_MASK_CTRL | KEY_A`
   * ([kbd]Ctrl + A[/kbd]).
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemAccelerator(
    menuRoot: String,
    idx: Int,
    keycode: Key,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to keycode.id)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemAcceleratorPtr, NIL)
  }

  /**
   * Enables/disables the item at index [idx]. When it is disabled, it can't be selected and its
   * action can't be invoked.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemDisabled(
    menuRoot: String,
    idx: Int,
    disabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemDisabledPtr, NIL)
  }

  /**
   * Hides/shows the item at index [idx]. When it is hidden, an item does not appear in a menu and
   * its action cannot be invoked.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemHidden(
    menuRoot: String,
    idx: Int,
    hidden: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemHiddenPtr, NIL)
  }

  /**
   * Sets the [String] tooltip of the item at the specified index [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemTooltip(
    menuRoot: String,
    idx: Int,
    tooltip: String,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemTooltipPtr, NIL)
  }

  /**
   * Sets the state of a multistate item. See [globalMenuAddMultistateItem] for details.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemState(
    menuRoot: String,
    idx: Int,
    state: Int,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to state.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemStatePtr, NIL)
  }

  /**
   * Sets number of state of a multistate item. See [globalMenuAddMultistateItem] for details.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemMaxStates(
    menuRoot: String,
    idx: Int,
    maxStates: Int,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to maxStates.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemMaxStatesPtr, NIL)
  }

  /**
   * Replaces the [Texture2D] icon of the specified [idx].
   * **Note:** This method is implemented only on macOS.
   * **Note:** This method is not supported by macOS "_dock" menu items.
   */
  @JvmStatic
  public final fun globalMenuSetItemIcon(
    menuRoot: String,
    idx: Int,
    icon: Texture2D?,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemIconPtr, NIL)
  }

  /**
   * Sets the horizontal offset of the item at the given [idx].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuSetItemIndentationLevel(
    menuRoot: String,
    idx: Int,
    level: Int,
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong(), LONG to level.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuSetItemIndentationLevelPtr, NIL)
  }

  /**
   * Returns number of items in the global menu with ID [menuRoot].
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetItemCount(menuRoot: String): Int {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetItemCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the item at index [idx] from the global menu [menuRoot].
   * **Note:** The indices of items after the removed item will be shifted by one.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuRemoveItem(menuRoot: String, idx: Int): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.globalMenuRemoveItemPtr, NIL)
  }

  /**
   * Removes all items from the global menu with ID [menuRoot].
   * **Note:** This method is implemented only on macOS.
   * **Supported system menu IDs:**
   * [codeblock lang=text]
   * "_main" - Main menu (macOS).
   * "_dock" - Dock popup menu (macOS).
   * "_apple" - Apple menu (macOS, custom items added before "Services").
   * "_window" - Window menu (macOS, custom items added after "Bring All to Front").
   * "_help" - Help menu (macOS).
   * [/codeblock]
   */
  @JvmStatic
  public final fun globalMenuClear(menuRoot: String): Unit {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(ptr, MethodBindings.globalMenuClearPtr, NIL)
  }

  /**
   * Returns Dictionary of supported system menu IDs and names.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun globalMenuGetSystemMenuRoots(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.globalMenuGetSystemMenuRootsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns `true` if the synthesizer is generating speech, or have utterance waiting in the queue.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsIsSpeaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsIsSpeakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the synthesizer is in a paused state.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsIsPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsIsPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an [Array] of voice information dictionaries.
   * Each [Dictionary] contains two [String] entries:
   * - `name` is voice name.
   * - `id` is voice identifier.
   * - `language` is language code in `lang_Variant` format. The `lang` part is a 2 or 3-letter code
   * based on the ISO-639 standard, in lowercase. The [code skip-lint]Variant[/code] part is an
   * engine-dependent string describing country, region or/and dialect.
   * Note that Godot depends on system libraries for text-to-speech functionality. These libraries
   * are installed by default on Windows and macOS, but not on all Linux distributions. If they are not
   * present, this method will return an empty list. This applies to both Godot users on Linux, as well
   * as end-users on Linux running Godot games that use text-to-speech.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsGetVoices(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsGetVoicesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an [PackedStringArray] of voice identifiers for the [language].
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsGetVoicesForLanguage(language: String): PackedStringArray {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.ttsGetVoicesForLanguagePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Adds an utterance to the queue. If [interrupt] is `true`, the queue is cleared first.
   * - [voice] identifier is one of the `"id"` values returned by [ttsGetVoices] or one of the
   * values returned by [ttsGetVoicesForLanguage].
   * - [volume] ranges from `0` (lowest) to `100` (highest).
   * - [pitch] ranges from `0.0` (lowest) to `2.0` (highest), `1.0` is default pitch for the current
   * voice.
   * - [rate] ranges from `0.1` (lowest) to `10.0` (highest), `1.0` is a normal speaking rate. Other
   * values act as a percentage relative.
   * - [utteranceId] is passed as a parameter to the callback functions.
   * **Note:** On Windows and Linux (X11/Wayland), utterance [text] can use SSML markup. SSML
   * support is engine and voice dependent. If the engine does not support SSML, you should strip out
   * all XML markup before calling [ttsSpeak].
   * **Note:** The granularity of pitch, rate, and volume is engine and voice dependent. Values may
   * be truncated.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmOverloads
  @JvmStatic
  public final fun ttsSpeak(
    text: String,
    voice: String,
    volume: Int = 50,
    pitch: Float = 1.0f,
    rate: Float = 1.0f,
    utteranceId: Int = 0,
    interrupt: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to text, STRING to voice, LONG to volume.toLong(), DOUBLE to pitch.toDouble(), DOUBLE to rate.toDouble(), LONG to utteranceId.toLong(), BOOL to interrupt)
    TransferContext.callMethod(ptr, MethodBindings.ttsSpeakPtr, NIL)
  }

  /**
   * Puts the synthesizer into a paused state.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsPause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsPausePtr, NIL)
  }

  /**
   * Resumes the synthesizer if it was paused.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsResume(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsResumePtr, NIL)
  }

  /**
   * Stops synthesis in progress and removes all utterances from the queue.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Linux), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsStop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.ttsStopPtr, NIL)
  }

  /**
   * Adds a callback, which is called when the utterance has started, finished, canceled or reached
   * a text boundary.
   * - [TTS_UTTERANCE_STARTED], [TTS_UTTERANCE_ENDED], and [TTS_UTTERANCE_CANCELED] callable's
   * method should take one [int] parameter, the utterance ID.
   * - [TTS_UTTERANCE_BOUNDARY] callable's method should take two [int] parameters, the index of the
   * character and the utterance ID.
   * **Note:** The granularity of the boundary callbacks is engine dependent.
   * **Note:** This method is implemented on Android, iOS, Web, Linux (X11/Wayland), macOS, and
   * Windows.
   * **Note:** [ProjectSettings.audio/general/textToSpeech] should be `true` to use text-to-speech.
   */
  @JvmStatic
  public final fun ttsSetUtteranceCallback(event: TTSUtteranceEvent, callable: Callable): Unit {
    TransferContext.writeArguments(LONG to event.id, CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.ttsSetUtteranceCallbackPtr, NIL)
  }

  /**
   * Returns `true` if OS supports dark mode.
   * **Note:** This method is implemented on Android, iOS, macOS, Windows, and Linux (X11/Wayland).
   */
  @JvmStatic
  public final fun isDarkModeSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDarkModeSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if OS is using dark mode.
   * **Note:** This method is implemented on Android, iOS, macOS, Windows, and Linux (X11/Wayland).
   */
  @JvmStatic
  public final fun isDarkMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDarkModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns OS theme accent color. Returns `Color(0, 0, 0, 0)`, if accent color is unknown.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getAccentColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccentColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the OS theme base color (default control background). Returns `Color(0, 0, 0, 0)` if
   * the base color is unknown.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun getBaseColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the [callable] that should be called when system theme settings are changed. Callback
   * method should have zero arguments.
   * **Note:** This method is implemented on Android, iOS, macOS, Windows, and Linux (X11/Wayland).
   */
  @JvmStatic
  public final fun setSystemThemeChangeCallback(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.setSystemThemeChangeCallbackPtr, NIL)
  }

  /**
   * Sets the current mouse mode. See also [mouseGetMode].
   */
  @JvmStatic
  public final fun mouseSetMode(mouseMode: MouseMode): Unit {
    TransferContext.writeArguments(LONG to mouseMode.id)
    TransferContext.callMethod(ptr, MethodBindings.mouseSetModePtr, NIL)
  }

  /**
   * Returns the current mouse mode. See also [mouseSetMode].
   */
  @JvmStatic
  public final fun mouseGetMode(): MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.mouseGetModePtr, LONG)
    return DisplayServer.MouseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the mouse cursor position to the given [position] relative to an origin at the upper left
   * corner of the currently focused game Window Manager window.
   * **Note:** [warpMouse] is only supported on Windows, macOS, and Linux (X11/Wayland). It has no
   * effect on Android, iOS, and Web.
   */
  @JvmStatic
  public final fun warpMouse(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.warpMousePtr, NIL)
  }

  /**
   * Returns the mouse cursor's current position in screen coordinates.
   */
  @JvmStatic
  public final fun mouseGetPosition(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.mouseGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the current state of mouse buttons (whether each button is pressed) as a bitmask. If
   * multiple mouse buttons are pressed at the same time, the bits are added together. Equivalent to
   * [Input.getMouseButtonMask].
   */
  @JvmStatic
  public final fun mouseGetButtonState(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.mouseGetButtonStatePtr, LONG)
    return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the user's clipboard content to the given string.
   */
  @JvmStatic
  public final fun clipboardSet(clipboard: String): Unit {
    TransferContext.writeArguments(STRING to clipboard)
    TransferContext.callMethod(ptr, MethodBindings.clipboardSetPtr, NIL)
  }

  /**
   * Returns the user's clipboard as a string if possible.
   */
  @JvmStatic
  public final fun clipboardGet(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clipboardGetPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the user's clipboard as an image if possible.
   * **Note:** This method uses the copied pixel data, e.g. from a image editing software or a web
   * browser, not an image file copied from file explorer.
   */
  @JvmStatic
  public final fun clipboardGetImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clipboardGetImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Returns `true` if there is a text content on the user's clipboard.
   */
  @JvmStatic
  public final fun clipboardHas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clipboardHasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is an image content on the user's clipboard.
   */
  @JvmStatic
  public final fun clipboardHasImage(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clipboardHasImagePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the user's
   * [url=https://unix.stackexchange.com/questions/139191/whats-the-difference-between-primary-selection-and-clipboard-buffer]primary[/url]
   * clipboard content to the given string. This is the clipboard that is set when the user selects
   * text in any application, rather than when pressing [kbd]Ctrl + C[/kbd]. The clipboard data can
   * then be pasted by clicking the middle mouse button in any application that supports the primary
   * clipboard mechanism.
   * **Note:** This method is only implemented on Linux (X11/Wayland).
   */
  @JvmStatic
  public final fun clipboardSetPrimary(clipboardPrimary: String): Unit {
    TransferContext.writeArguments(STRING to clipboardPrimary)
    TransferContext.callMethod(ptr, MethodBindings.clipboardSetPrimaryPtr, NIL)
  }

  /**
   * Returns the user's
   * [url=https://unix.stackexchange.com/questions/139191/whats-the-difference-between-primary-selection-and-clipboard-buffer]primary[/url]
   * clipboard as a string if possible. This is the clipboard that is set when the user selects text in
   * any application, rather than when pressing [kbd]Ctrl + C[/kbd]. The clipboard data can then be
   * pasted by clicking the middle mouse button in any application that supports the primary clipboard
   * mechanism.
   * **Note:** This method is only implemented on Linux (X11/Wayland).
   */
  @JvmStatic
  public final fun clipboardGetPrimary(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clipboardGetPrimaryPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an [Array] of [Rect2], each of which is the bounding rectangle for a display cutout or
   * notch. These are non-functional areas on edge-to-edge screens used by cameras and sensors. Returns
   * an empty array if the device does not have cutouts. See also [getDisplaySafeArea].
   * **Note:** Currently only implemented on Android. Other platforms will return an empty array
   * even if they do have display cutouts or notches.
   */
  @JvmStatic
  public final fun getDisplayCutouts(): VariantArray<Rect2> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisplayCutoutsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Rect2>)
  }

  /**
   * Returns the unobscured area of the display where interactive controls should be rendered. See
   * also [getDisplayCutouts].
   */
  @JvmStatic
  public final fun getDisplaySafeArea(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisplaySafeAreaPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns the number of displays available.
   */
  @JvmStatic
  public final fun getScreenCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScreenCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns index of the primary screen.
   */
  @JvmStatic
  public final fun getPrimaryScreen(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the screen containing the window with the keyboard focus, or the primary
   * screen if there's no focused window.
   */
  @JvmStatic
  public final fun getKeyboardFocusScreen(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getKeyboardFocusScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns index of the screen which contains specified rectangle.
   */
  @JvmStatic
  public final fun getScreenFromRect(rect: Rect2): Int {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.getScreenFromRectPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the screen's top-left corner position in pixels. On multi-monitor setups, the screen
   * position is relative to the virtual desktop area. On multi-monitor setups with different screen
   * resolutions or orientations, the origin may be located outside any display like this:
   * [codeblock lang=text]
   * * (0, 0)        +-------+
   *                 |       |
   * +-------------+ |       |
   * |             | |       |
   * |             | |       |
   * +-------------+ +-------+
   * [/codeblock]
   * See also [screenGetSize].
   * **Note:** On Linux (Wayland) this method always returns `(0, 0)`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetPosition(screen: Int = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the screen's size in pixels. See also [screenGetPosition] and [screenGetUsableRect].
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetSize(screen: Int = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the portion of the screen that is not obstructed by a status bar in pixels. See also
   * [screenGetSize].
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetUsableRect(screen: Int = -1): Rect2i {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetUsableRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns the dots per inch density of the specified screen. If [screen] is
   * [SCREEN_OF_MAIN_WINDOW] (the default value), a screen with the main window will be used.
   * **Note:** On macOS, returned value is inaccurate if fractional display scaling mode is used.
   * **Note:** On Android devices, the actual screen densities are grouped into six generalized
   * densities:
   * [codeblock lang=text]
   *    ldpi - 120 dpi
   *    mdpi - 160 dpi
   *    hdpi - 240 dpi
   *   xhdpi - 320 dpi
   *  xxhdpi - 480 dpi
   * xxxhdpi - 640 dpi
   * [/codeblock]
   * **Note:** This method is implemented on Android, Linux (X11/Wayland), macOS and Windows.
   * Returns `72` on unsupported platforms.
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetDpi(screen: Int = -1): Int {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetDpiPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the scale factor of the specified screen by index.
   * **Note:** On macOS, the returned value is `2.0` for hiDPI (Retina) screens, and `1.0` for all
   * other cases.
   * **Note:** On Linux (Wayland), the returned value is accurate only when [screen] is
   * [SCREEN_OF_MAIN_WINDOW]. Due to API limitations, passing a direct index will return a rounded-up
   * integer, if the screen has a fractional scale (e.g. `1.25` would get rounded up to `2.0`).
   * **Note:** This method is implemented only on macOS and Linux (Wayland).
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetScale(screen: Int = -1): Float {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if touch events are available (Android or iOS), the capability is detected on
   * the Web platform or if [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is `true`.
   */
  @JvmStatic
  public final fun isTouchscreenAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTouchscreenAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the greatest scale factor of all screens.
   * **Note:** On macOS returned value is `2.0` if there is at least one hiDPI (Retina) screen in
   * the system, and `1.0` in all other cases.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun screenGetMaxScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.screenGetMaxScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the current refresh rate of the specified screen. If [screen] is
   * [SCREEN_OF_MAIN_WINDOW] (the default value), a screen with the main window will be used.
   * **Note:** Returns `-1.0` if the DisplayServer fails to find the refresh rate for the specified
   * screen. On Web, [screenGetRefreshRate] will always return `-1.0` as there is no way to retrieve
   * the refresh rate on that platform.
   * To fallback to a default refresh rate if the method fails, try:
   * [codeblock]
   * var refresh_rate = DisplayServer.screen_get_refresh_rate()
   * if refresh_rate < 0:
   *     refresh_rate = 60.0
   * [/codeblock]
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetRefreshRate(screen: Int = -1): Float {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetRefreshRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns color of the display pixel at the [position].
   * **Note:** This method is implemented on Linux (X11), macOS, and Windows.
   * **Note:** On macOS, this method requires "Screen Recording" permission, if permission is not
   * granted it will return desktop wallpaper color.
   */
  @JvmStatic
  public final fun screenGetPixel(position: Vector2i): Color {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.screenGetPixelPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns screenshot of the [screen].
   * **Note:** This method is implemented on Linux (X11), macOS, and Windows.
   * **Note:** On macOS, this method requires "Screen Recording" permission, if permission is not
   * granted it will return desktop wallpaper color.
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetImage(screen: Int = -1): Image? {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Sets the [screen]'s [orientation]. See also [screenGetOrientation].
   * **Note:** On iOS, this method has no effect if
   * [ProjectSettings.display/window/handheld/orientation] is not set to [SCREEN_SENSOR].
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenSetOrientation(orientation: ScreenOrientation, screen: Int = -1): Unit {
    TransferContext.writeArguments(LONG to orientation.id, LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenSetOrientationPtr, NIL)
  }

  /**
   * Returns the [screen]'s current orientation. See also [screenSetOrientation].
   * **Note:** This method is implemented on Android and iOS.
   */
  @JvmOverloads
  @JvmStatic
  public final fun screenGetOrientation(screen: Int = -1): ScreenOrientation {
    TransferContext.writeArguments(LONG to screen.toLong())
    TransferContext.callMethod(ptr, MethodBindings.screenGetOrientationPtr, LONG)
    return DisplayServer.ScreenOrientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets whether the screen should never be turned off by the operating system's power-saving
   * measures. See also [screenIsKeptOn].
   */
  @JvmStatic
  public final fun screenSetKeepOn(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.screenSetKeepOnPtr, NIL)
  }

  /**
   * Returns `true` if the screen should never be turned off by the operating system's power-saving
   * measures. See also [screenSetKeepOn].
   */
  @JvmStatic
  public final fun screenIsKeptOn(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.screenIsKeptOnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the list of Godot window IDs belonging to this process.
   * **Note:** Native dialogs are not included in this list.
   */
  @JvmStatic
  public final fun getWindowList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWindowListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns the ID of the window at the specified screen [position] (in pixels). On multi-monitor
   * setups, the screen position is relative to the virtual desktop area. On multi-monitor setups with
   * different screen resolutions or orientations, the origin may be located outside any display like
   * this:
   * [codeblock lang=text]
   * * (0, 0)        +-------+
   *                 |       |
   * +-------------+ |       |
   * |             | |       |
   * |             | |       |
   * +-------------+ +-------+
   * [/codeblock]
   */
  @JvmStatic
  public final fun getWindowAtScreenPosition(position: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.getWindowAtScreenPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns internal structure pointers for use in plugins.
   * **Note:** This method is implemented on Android, Linux (X11/Wayland), macOS, and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetNativeHandle(handleType: HandleType, windowId: Int = 0): Long {
    TransferContext.writeArguments(LONG to handleType.id, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetNativeHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns ID of the active popup window, or [INVALID_WINDOW_ID] if there is none.
   */
  @JvmStatic
  public final fun windowGetActivePopup(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.windowGetActivePopupPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the bounding box of control, or menu item that was used to open the popup window, in the
   * screen coordinate system. Clicking this area will not auto-close this popup.
   */
  @JvmStatic
  public final fun windowSetPopupSafeRect(window: Int, rect: Rect2i): Unit {
    TransferContext.writeArguments(LONG to window.toLong(), RECT2I to rect)
    TransferContext.callMethod(ptr, MethodBindings.windowSetPopupSafeRectPtr, NIL)
  }

  /**
   * Returns the bounding box of control, or menu item that was used to open the popup window, in
   * the screen coordinate system.
   */
  @JvmStatic
  public final fun windowGetPopupSafeRect(window: Int): Rect2i {
    TransferContext.writeArguments(LONG to window.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetPopupSafeRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Sets the title of the given window to [title].
   * **Note:** It's recommended to change this value using [Window.title] instead.
   * **Note:** Avoid changing the window title every frame, as this can cause performance issues on
   * certain window managers. Try to change the window title only a few times per second at most.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetTitle(title: String, windowId: Int = 0): Unit {
    TransferContext.writeArguments(STRING to title, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetTitlePtr, NIL)
  }

  /**
   * Returns the estimated window title bar size (including text and window buttons) for the window
   * specified by [windowId] (in pixels). This method does not change the window title.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetTitleSize(title: String, windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(STRING to title, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetTitleSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets a polygonal region of the window which accepts mouse events. Mouse events outside the
   * region will be passed through.
   * Passing an empty array will disable passthrough support (all mouse events will be intercepted
   * by the window, which is the default behavior).
   *
   * gdscript:
   * ```gdscript
   * # Set region, using Path2D node.
   * DisplayServer.window_set_mouse_passthrough($Path2D.curve.get_baked_points())
   *
   * # Set region, using Polygon2D node.
   * DisplayServer.window_set_mouse_passthrough($Polygon2D.polygon)
   *
   * # Reset region to default.
   * DisplayServer.window_set_mouse_passthrough([])
   * ```
   * csharp:
   * ```csharp
   * // Set region, using Path2D node.
   * DisplayServer.WindowSetMousePassthrough(GetNode<Path2D>("Path2D").Curve.GetBakedPoints());
   *
   * // Set region, using Polygon2D node.
   * DisplayServer.WindowSetMousePassthrough(GetNode<Polygon2D>("Polygon2D").Polygon);
   *
   * // Reset region to default.
   * DisplayServer.WindowSetMousePassthrough(new Vector2[] {});
   * ```
   *
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while
   * on Linux (X11) and macOS it is.
   * **Note:** This method is implemented on Linux (X11), macOS and Windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetMousePassthrough(region: PackedVector2Array, windowId: Int = 0): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to region, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetMousePassthroughPtr, NIL)
  }

  /**
   * Returns the screen the window specified by [windowId] is currently positioned on. If the screen
   * overlaps multiple displays, the screen where the window's center is located is returned. See also
   * [windowSetCurrentScreen].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetCurrentScreen(windowId: Int = 0): Int {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetCurrentScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Moves the window specified by [windowId] to the specified [screen]. See also
   * [windowGetCurrentScreen].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetCurrentScreen(screen: Int, windowId: Int = 0): Unit {
    TransferContext.writeArguments(LONG to screen.toLong(), LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetCurrentScreenPtr, NIL)
  }

  /**
   * Returns the position of the client area of the given window on the screen.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetPosition(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the position of the given window on the screen including the borders drawn by the
   * operating system. See also [windowGetPosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetPositionWithDecorations(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetPositionWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the position of the given window to [position]. On multi-monitor setups, the screen
   * position is relative to the virtual desktop area. On multi-monitor setups with different screen
   * resolutions or orientations, the origin may be located outside any display like this:
   * [codeblock lang=text]
   * * (0, 0)        +-------+
   *                 |       |
   * +-------------+ |       |
   * |             | |       |
   * |             | |       |
   * +-------------+ +-------+
   * [/codeblock]
   * See also [windowGetPosition] and [windowSetSize].
   * **Note:** It's recommended to change this value using [Window.position] instead.
   * **Note:** On Linux (Wayland): this method is a no-op.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetPosition(position: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetPositionPtr, NIL)
  }

  /**
   * Returns the size of the window specified by [windowId] (in pixels), excluding the borders drawn
   * by the operating system. This is also called the "client area". See also
   * [windowGetSizeWithDecorations], [windowSetSize] and [windowGetPosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the size of the given window to [size] (in pixels). See also [windowGetSize] and
   * [windowGetPosition].
   * **Note:** It's recommended to change this value using [Window.size] instead.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetSize(size: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to size, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetSizePtr, NIL)
  }

  /**
   * Sets the [callback] that will be called when the window specified by [windowId] is moved or
   * resized.
   * **Warning:** Advanced users only! Adding such a callback to a [Window] node will override its
   * default implementation, which can introduce bugs.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetRectChangedCallback(callback: Callable, windowId: Int = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetRectChangedCallbackPtr, NIL)
  }

  /**
   * Sets the [callback] that will be called when an event occurs in the window specified by
   * [windowId].
   * **Warning:** Advanced users only! Adding such a callback to a [Window] node will override its
   * default implementation, which can introduce bugs.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetWindowEventCallback(callback: Callable, windowId: Int = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetWindowEventCallbackPtr, NIL)
  }

  /**
   * Sets the [callback] that should be called when any [InputEvent] is sent to the window specified
   * by [windowId].
   * **Warning:** Advanced users only! Adding such a callback to a [Window] node will override its
   * default implementation, which can introduce bugs.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetInputEventCallback(callback: Callable, windowId: Int = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetInputEventCallbackPtr, NIL)
  }

  /**
   * Sets the [callback] that should be called when text is entered using the virtual keyboard to
   * the window specified by [windowId].
   * **Warning:** Advanced users only! Adding such a callback to a [Window] node will override its
   * default implementation, which can introduce bugs.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetInputTextCallback(callback: Callable, windowId: Int = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetInputTextCallbackPtr, NIL)
  }

  /**
   * Sets the [callback] that should be called when files are dropped from the operating system's
   * file manager to the window specified by [windowId]. [callback] should take one [PackedStringArray]
   * argument, which is the list of dropped files.
   * **Warning:** Advanced users only! Adding such a callback to a [Window] node will override its
   * default implementation, which can introduce bugs.
   * **Note:** This method is implemented on Windows, macOS, Linux (X11/Wayland), and Web.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetDropFilesCallback(callback: Callable, windowId: Int = 0): Unit {
    TransferContext.writeArguments(CALLABLE to callback, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetDropFilesCallbackPtr, NIL)
  }

  /**
   * Returns the [Object.getInstanceId] of the [Window] the [windowId] is attached to.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetAttachedInstanceId(windowId: Int = 0): Long {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetAttachedInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the window's maximum size (in pixels). See also [windowSetMaxSize].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetMaxSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetMaxSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the maximum size of the window specified by [windowId] in pixels. Normally, the user will
   * not be able to drag the window to make it larger than the specified size. See also
   * [windowGetMaxSize].
   * **Note:** It's recommended to change this value using [Window.maxSize] instead.
   * **Note:** Using third-party tools, it is possible for users to disable window geometry
   * restrictions and therefore bypass this limit.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetMaxSize(maxSize: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to maxSize, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetMaxSizePtr, NIL)
  }

  /**
   * Returns the window's minimum size (in pixels). See also [windowSetMinSize].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetMinSize(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetMinSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the minimum size for the given window to [minSize] in pixels. Normally, the user will not
   * be able to drag the window to make it smaller than the specified size. See also
   * [windowGetMinSize].
   * **Note:** It's recommended to change this value using [Window.minSize] instead.
   * **Note:** By default, the main window has a minimum size of `Vector2i(64, 64)`. This prevents
   * issues that can arise when the window is resized to a near-zero size.
   * **Note:** Using third-party tools, it is possible for users to disable window geometry
   * restrictions and therefore bypass this limit.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetMinSize(minSize: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to minSize, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetMinSizePtr, NIL)
  }

  /**
   * Returns the size of the window specified by [windowId] (in pixels), including the borders drawn
   * by the operating system. See also [windowGetSize].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetSizeWithDecorations(windowId: Int = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetSizeWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the mode of the given window.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetMode(windowId: Int = 0): WindowMode {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetModePtr, LONG)
    return DisplayServer.WindowMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets window mode for the given window to [mode]. See [WindowMode] for possible values and how
   * each mode behaves.
   * **Note:** Setting the window to full screen forcibly sets the borderless flag to `true`, so
   * make sure to set it back to `false` when not wanted.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetMode(mode: WindowMode, windowId: Int = 0): Unit {
    TransferContext.writeArguments(LONG to mode.id, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetModePtr, NIL)
  }

  /**
   * Enables or disables the given window's given [flag]. See [WindowFlags] for possible values and
   * their behavior.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetFlag(
    flag: WindowFlags,
    enabled: Boolean,
    windowId: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetFlagPtr, NIL)
  }

  /**
   * Returns the current value of the given window's [flag].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetFlag(flag: WindowFlags, windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to flag.id, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * When [WINDOW_FLAG_EXTEND_TO_TITLE] flag is set, set offset to the center of the first titlebar
   * button.
   * **Note:** This flag is implemented only on macOS.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetWindowButtonsOffset(offset: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to offset, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetWindowButtonsOffsetPtr, NIL)
  }

  /**
   * Returns left margins (`x`), right margins (`y`) and height (`z`) of the title that are safe to
   * use (contains no buttons or other elements) when [WINDOW_FLAG_EXTEND_TO_TITLE] flag is set.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetSafeTitleMargins(windowId: Int = 0): Vector3i {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetSafeTitleMarginsPtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I) as Vector3i)
  }

  /**
   * Makes the window specified by [windowId] request attention, which is materialized by the window
   * title and taskbar entry blinking until the window is focused. This usually has no visible effect
   * if the window is currently focused. The exact behavior varies depending on the operating system.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowRequestAttention(windowId: Int = 0): Unit {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowRequestAttentionPtr, NIL)
  }

  /**
   * Moves the window specified by [windowId] to the foreground, so that it is visible over other
   * windows.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowMoveToForeground(windowId: Int = 0): Unit {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowMoveToForegroundPtr, NIL)
  }

  /**
   * Returns `true` if the window specified by [windowId] is focused.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowIsFocused(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowIsFocusedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if anything can be drawn in the window specified by [windowId], `false`
   * otherwise. Using the `--disable-render-loop` command line argument or a headless build will return
   * `false`.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowCanDraw(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowCanDrawPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets window transient parent. Transient window is will be destroyed with its transient parent
   * and will return focus to their parent when closed. The transient window is displayed on top of a
   * non-exclusive full-screen parent window. Transient windows can't enter full-screen mode.
   * **Note:** It's recommended to change this value using [Window.transient] instead.
   * **Note:** The behavior might be different depending on the platform.
   */
  @JvmStatic
  public final fun windowSetTransient(windowId: Int, parentWindowId: Int): Unit {
    TransferContext.writeArguments(LONG to windowId.toLong(), LONG to parentWindowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetTransientPtr, NIL)
  }

  /**
   * If set to `true`, this window will always stay on top of its parent window, parent window will
   * ignore input while this window is opened.
   * **Note:** On macOS, exclusive windows are confined to the same space (virtual desktop or
   * screen) as the parent window.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun windowSetExclusive(windowId: Int, exclusive: Boolean): Unit {
    TransferContext.writeArguments(LONG to windowId.toLong(), BOOL to exclusive)
    TransferContext.callMethod(ptr, MethodBindings.windowSetExclusivePtr, NIL)
  }

  /**
   * Sets whether [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] should
   * be enabled for the window specified by [windowId]. See also [windowSetImePosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetImeActive(active: Boolean, windowId: Int = 0): Unit {
    TransferContext.writeArguments(BOOL to active, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetImeActivePtr, NIL)
  }

  /**
   * Sets the position of the [url=https://en.wikipedia.org/wiki/Input_method]Input Method
   * Editor[/url] popup for the specified [windowId]. Only effective if [windowSetImeActive] was set to
   * `true` for the specified [windowId].
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetImePosition(position: Vector2i, windowId: Int = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetImePositionPtr, NIL)
  }

  /**
   * Sets the V-Sync mode of the given window. See also
   * [ProjectSettings.display/window/vsync/vsyncMode].
   * See [DisplayServer.VSyncMode] for possible values and how they affect the behavior of your
   * application.
   * Depending on the platform and used renderer, the engine will fall back to [VSYNC_ENABLED] if
   * the desired mode is not supported.
   * **Note:** V-Sync modes other than [VSYNC_ENABLED] are only supported in the Forward+ and Mobile
   * rendering methods, not Compatibility.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowSetVsyncMode(vsyncMode: VSyncMode, windowId: Int = 0): Unit {
    TransferContext.writeArguments(LONG to vsyncMode.id, LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowSetVsyncModePtr, NIL)
  }

  /**
   * Returns the V-Sync mode of the given window.
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowGetVsyncMode(windowId: Int = 0): VSyncMode {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowGetVsyncModePtr, LONG)
    return DisplayServer.VSyncMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the given window can be maximized (the maximize button is enabled).
   */
  @JvmOverloads
  @JvmStatic
  public final fun windowIsMaximizeAllowed(windowId: Int = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.windowIsMaximizeAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if double-click on a window title should maximize it.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun windowMaximizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.windowMaximizeOnTitleDblClickPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true`, if double-click on a window title should minimize it.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun windowMinimizeOnTitleDblClick(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.windowMinimizeOnTitleDblClickPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the text selection in the [url=https://en.wikipedia.org/wiki/Input_method]Input Method
   * Editor[/url] composition string, with the [Vector2i]'s `x` component being the caret position and
   * `y` being the length of the selection.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun imeGetSelection(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.imeGetSelectionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the composition string contained within the
   * [url=https://en.wikipedia.org/wiki/Input_method]Input Method Editor[/url] window.
   * **Note:** This method is implemented only on macOS.
   */
  @JvmStatic
  public final fun imeGetText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.imeGetTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Shows the virtual keyboard if the platform has one.
   * [existingText] parameter is useful for implementing your own [LineEdit] or [TextEdit], as it
   * tells the virtual keyboard what text has already been typed (the virtual keyboard uses it for
   * auto-correct and predictions).
   * [position] parameter is the screen space [Rect2] of the edited text.
   * [type] parameter allows configuring which type of virtual keyboard to show.
   * [maxLength] limits the number of characters that can be entered if different from `-1`.
   * [cursorStart] can optionally define the current text cursor position if [cursorEnd] is not set.
   * [cursorStart] and [cursorEnd] can optionally define the current text selection.
   * **Note:** This method is implemented on Android, iOS and Web.
   */
  @JvmOverloads
  @JvmStatic
  public final fun virtualKeyboardShow(
    existingText: String,
    position: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    type: VirtualKeyboardType = DisplayServer.VirtualKeyboardType.KEYBOARD_TYPE_DEFAULT,
    maxLength: Int = -1,
    cursorStart: Int = -1,
    cursorEnd: Int = -1,
  ): Unit {
    TransferContext.writeArguments(STRING to existingText, RECT2 to position, LONG to type.id, LONG to maxLength.toLong(), LONG to cursorStart.toLong(), LONG to cursorEnd.toLong())
    TransferContext.callMethod(ptr, MethodBindings.virtualKeyboardShowPtr, NIL)
  }

  /**
   * Hides the virtual keyboard if it is shown, does nothing otherwise.
   */
  @JvmStatic
  public final fun virtualKeyboardHide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.virtualKeyboardHidePtr, NIL)
  }

  /**
   * Returns the on-screen keyboard's height in pixels. Returns 0 if there is no keyboard or if it
   * is currently hidden.
   */
  @JvmStatic
  public final fun virtualKeyboardGetHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.virtualKeyboardGetHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the default mouse cursor shape. The cursor's appearance will vary depending on the user's
   * operating system and mouse cursor theme. See also [cursorGetShape] and [cursorSetCustomImage].
   */
  @JvmStatic
  public final fun cursorSetShape(shape: CursorShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.cursorSetShapePtr, NIL)
  }

  /**
   * Returns the default mouse cursor shape set by [cursorSetShape].
   */
  @JvmStatic
  public final fun cursorGetShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.cursorGetShapePtr, LONG)
    return DisplayServer.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets a custom mouse cursor image for the given [shape]. This means the user's operating system
   * and mouse cursor theme will no longer influence the mouse cursor's appearance.
   * [cursor] can be either a [Texture2D] or an [Image], and it should not be larger than 256×256 to
   * display correctly. Optionally, [hotspot] can be set to offset the image's position relative to the
   * click point. By default, [hotspot] is set to the top-left corner of the image. See also
   * [cursorSetShape].
   */
  @JvmOverloads
  @JvmStatic
  public final fun cursorSetCustomImage(
    cursor: Resource?,
    shape: CursorShape = DisplayServer.CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(OBJECT to cursor, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(ptr, MethodBindings.cursorSetCustomImagePtr, NIL)
  }

  /**
   * Returns `true` if positions of **OK** and **Cancel** buttons are swapped in dialogs. This is
   * enabled by default on Windows to follow interface conventions, and be toggled by changing
   * [ProjectSettings.gui/common/swapCancelOk].
   * **Note:** This doesn't affect native dialogs such as the ones spawned by
   * [DisplayServer.dialogShow].
   */
  @JvmStatic
  public final fun getSwapCancelOk(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwapCancelOkPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Allows the [processId] PID to steal focus from this window. In other words, this disables the
   * operating system's focus stealing protection for the specified PID.
   * **Note:** This method is implemented only on Windows.
   */
  @JvmStatic
  public final fun enableForStealingFocus(processId: Long): Unit {
    TransferContext.writeArguments(LONG to processId)
    TransferContext.callMethod(ptr, MethodBindings.enableForStealingFocusPtr, NIL)
  }

  /**
   * Shows a text dialog which uses the operating system's native look-and-feel. [callback] should
   * accept a single [int] parameter which corresponds to the index of the pressed button.
   * **Note:** This method is implemented if the display server has the [FEATURE_NATIVE_DIALOG]
   * feature. Supported platforms include macOS and Windows.
   */
  @JvmStatic
  public final fun dialogShow(
    title: String,
    description: String,
    buttons: PackedStringArray,
    callback: Callable,
  ): Error {
    TransferContext.writeArguments(STRING to title, STRING to description, PACKED_STRING_ARRAY to buttons, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.dialogShowPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Shows a text input dialog which uses the operating system's native look-and-feel. [callback]
   * should accept a single [String] parameter which contains the text field's contents.
   * **Note:** This method is implemented if the display server has the
   * [FEATURE_NATIVE_DIALOG_INPUT] feature. Supported platforms include macOS and Windows.
   */
  @JvmStatic
  public final fun dialogInputText(
    title: String,
    description: String,
    existingText: String,
    callback: Callable,
  ): Error {
    TransferContext.writeArguments(STRING to title, STRING to description, STRING to existingText, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.dialogInputTextPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Displays OS native dialog for selecting files or directories in the file system.
   * Each filter string in the [filters] array should be formatted like this: `*.txt,*.doc;Text
   * Files`. The description text of the filter is optional and can be omitted. See also
   * [FileDialog.filters].
   * Callbacks have the following arguments: `status: bool, selected_paths: PackedStringArray,
   * selected_filter_index: int`.
   * **Note:** This method is implemented if the display server has the [FEATURE_NATIVE_DIALOG_FILE]
   * feature. Supported platforms include Linux (X11/Wayland), Windows, and macOS.
   * **Note:** [currentDirectory] might be ignored.
   * **Note:** On Linux, [showHidden] is ignored.
   * **Note:** On macOS, native file dialogs have no title.
   * **Note:** On macOS, sandboxed apps will save security-scoped bookmarks to retain access to the
   * opened folders across multiple sessions. Use [OS.getGrantedPermissions] to get a list of saved
   * bookmarks.
   */
  @JvmStatic
  public final fun fileDialogShow(
    title: String,
    currentDirectory: String,
    filename: String,
    showHidden: Boolean,
    mode: FileDialogMode,
    filters: PackedStringArray,
    callback: Callable,
  ): Error {
    TransferContext.writeArguments(STRING to title, STRING to currentDirectory, STRING to filename, BOOL to showHidden, LONG to mode.id, PACKED_STRING_ARRAY to filters, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.fileDialogShowPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Displays OS native dialog for selecting files or directories in the file system with additional
   * user selectable options.
   * Each filter string in the [filters] array should be formatted like this: `*.txt,*.doc;Text
   * Files`. The description text of the filter is optional and can be omitted. See also
   * [FileDialog.filters].
   * [options] is array of [Dictionary]s with the following keys:
   * - `"name"` - option's name [String].
   * - `"values"` - [PackedStringArray] of values. If empty, boolean option (check box) is used.
   * - `"default"` - default selected option index ([int]) or default boolean value ([bool]).
   * Callbacks have the following arguments: `status: bool, selected_paths: PackedStringArray,
   * selected_filter_index: int, selected_option: Dictionary`.
   * **Note:** This method is implemented if the display server has the [FEATURE_NATIVE_DIALOG_FILE]
   * feature. Supported platforms include Linux (X11/Wayland), Windows, and macOS.
   * **Note:** [currentDirectory] might be ignored.
   * **Note:** On Linux (X11), [showHidden] is ignored.
   * **Note:** On macOS, native file dialogs have no title.
   * **Note:** On macOS, sandboxed apps will save security-scoped bookmarks to retain access to the
   * opened folders across multiple sessions. Use [OS.getGrantedPermissions] to get a list of saved
   * bookmarks.
   */
  @JvmStatic
  public final fun fileDialogWithOptionsShow(
    title: String,
    currentDirectory: String,
    root: String,
    filename: String,
    showHidden: Boolean,
    mode: FileDialogMode,
    filters: PackedStringArray,
    options: VariantArray<Dictionary<Any?, Any?>>,
    callback: Callable,
  ): Error {
    TransferContext.writeArguments(STRING to title, STRING to currentDirectory, STRING to root, STRING to filename, BOOL to showHidden, LONG to mode.id, PACKED_STRING_ARRAY to filters, ARRAY to options, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.fileDialogWithOptionsShowPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of keyboard layouts.
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardGetLayoutCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetLayoutCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns active keyboard layout index.
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS, and Windows.
   */
  @JvmStatic
  public final fun keyboardGetCurrentLayout(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetCurrentLayoutPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the active keyboard layout.
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardSetCurrentLayout(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.keyboardSetCurrentLayoutPtr, NIL)
  }

  /**
   * Returns the ISO-639/BCP-47 language code of the keyboard layout at position [index].
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardGetLayoutLanguage(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetLayoutLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the localized name of the keyboard layout at position [index].
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardGetLayoutName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetLayoutNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Converts a physical (US QWERTY) [keycode] to one in the active keyboard layout.
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardGetKeycodeFromPhysical(keycode: Key): Key {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetKeycodeFromPhysicalPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Converts a physical (US QWERTY) [keycode] to localized label printed on the key in the active
   * keyboard layout.
   * **Note:** This method is implemented on Linux (X11/Wayland), macOS and Windows.
   */
  @JvmStatic
  public final fun keyboardGetLabelFromPhysical(keycode: Key): Key {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(ptr, MethodBindings.keyboardGetLabelFromPhysicalPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Perform window manager processing, including input flushing. See also
   * [forceProcessAndDropEvents], [Input.flushBufferedEvents] and [Input.useAccumulatedInput].
   */
  @JvmStatic
  public final fun processEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.processEventsPtr, NIL)
  }

  /**
   * Forces window manager processing while ignoring all [InputEvent]s. See also [processEvents].
   * **Note:** This method is implemented on Windows and macOS.
   */
  @JvmStatic
  public final fun forceProcessAndDropEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceProcessAndDropEventsPtr, NIL)
  }

  /**
   * Sets the window icon (usually displayed in the top-left corner) in the operating system's
   * *native* format. The file at [filename] must be in `.ico` format on Windows or `.icns` on macOS.
   * By using specially crafted `.ico` or `.icns` icons, [setNativeIcon] allows specifying different
   * icons depending on the size the icon is displayed at. This size is determined by the operating
   * system and user preferences (including the display scale factor). To use icons in other formats,
   * use [setIcon] instead.
   * **Note:** Requires support for [FEATURE_NATIVE_ICON].
   */
  @JvmStatic
  public final fun setNativeIcon(filename: String): Unit {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(ptr, MethodBindings.setNativeIconPtr, NIL)
  }

  /**
   * Sets the window icon (usually displayed in the top-left corner) with an [Image]. To use icons
   * in the operating system's native format, use [setNativeIcon] instead.
   * **Note:** Requires support for [FEATURE_ICON].
   */
  @JvmStatic
  public final fun setIcon(image: Image?): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(ptr, MethodBindings.setIconPtr, NIL)
  }

  /**
   * Creates a new application status indicator with the specified icon, tooltip, and activation
   * callback.
   * [callback] should take two arguments: the pressed mouse button (one of the [MouseButton]
   * constants) and the click position in screen coordinates (a [Vector2i]).
   */
  @JvmStatic
  public final fun createStatusIndicator(
    icon: Texture2D?,
    tooltip: String,
    callback: Callable,
  ): Int {
    TransferContext.writeArguments(OBJECT to icon, STRING to tooltip, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.createStatusIndicatorPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the application status indicator icon.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun statusIndicatorSetIcon(id: Int, icon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.statusIndicatorSetIconPtr, NIL)
  }

  /**
   * Sets the application status indicator tooltip.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun statusIndicatorSetTooltip(id: Int, tooltip: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.statusIndicatorSetTooltipPtr, NIL)
  }

  /**
   * Sets the application status indicator native popup menu.
   * **Note:** On macOS, the menu is activated by any mouse button. Its activation callback is *not*
   * triggered.
   * **Note:** On Windows, the menu is activated by the right mouse button, selecting the status
   * icon and pressing [kbd]Shift + F10[/kbd], or the applications key. The menu's activation callback
   * for the other mouse buttons is still triggered.
   * **Note:** Native popup is only supported if [NativeMenu] supports the
   * [NativeMenu.FEATURE_POPUP_MENU] feature.
   */
  @JvmStatic
  public final fun statusIndicatorSetMenu(id: Int, menuRid: RID): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), _RID to menuRid)
    TransferContext.callMethod(ptr, MethodBindings.statusIndicatorSetMenuPtr, NIL)
  }

  /**
   * Sets the application status indicator activation callback. [callback] should take two
   * arguments: [int] mouse button index (one of [MouseButton] values) and [Vector2i] click position in
   * screen coordinates.
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun statusIndicatorSetCallback(id: Int, callback: Callable): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.statusIndicatorSetCallbackPtr, NIL)
  }

  /**
   * Returns the rectangle for the given status indicator [id] in screen coordinates. If the status
   * indicator is not visible, returns an empty [Rect2].
   * **Note:** This method is implemented on macOS and Windows.
   */
  @JvmStatic
  public final fun statusIndicatorGetRect(id: Int): Rect2 {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.statusIndicatorGetRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Removes the application status indicator.
   */
  @JvmStatic
  public final fun deleteStatusIndicator(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deleteStatusIndicatorPtr, NIL)
  }

  /**
   * Returns the total number of available tablet drivers.
   * **Note:** This method is implemented only on Windows.
   */
  @JvmStatic
  public final fun tabletGetDriverCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.tabletGetDriverCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tablet driver name for the given index.
   * **Note:** This method is implemented only on Windows.
   */
  @JvmStatic
  public final fun tabletGetDriverName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.tabletGetDriverNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns current active tablet driver name.
   * **Note:** This method is implemented only on Windows.
   */
  @JvmStatic
  public final fun tabletGetCurrentDriver(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.tabletGetCurrentDriverPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Set active tablet driver name.
   * Supported drivers:
   * - `winink`: Windows Ink API, default (Windows 8.1+ required).
   * - `wintab`: Wacom Wintab API (compatible device driver required).
   * - `dummy`: Dummy driver, tablet input is disabled.
   * **Note:** This method is implemented only on Windows.
   */
  @JvmStatic
  public final fun tabletSetCurrentDriver(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.tabletSetCurrentDriverPtr, NIL)
  }

  /**
   * Returns `true` if the window background can be made transparent. This method returns `false` if
   * [ProjectSettings.display/window/perPixelTransparency/allowed] is set to `false`, or if
   * transparency is not supported by the renderer or OS compositor.
   */
  @JvmStatic
  public final fun isWindowTransparencyAvailable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isWindowTransparencyAvailablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Registers an [Object] which represents an additional output that will be rendered too, beyond
   * normal windows. The [Object] is only used as an identifier, which can be later passed to
   * [unregisterAdditionalOutput].
   * This can be used to prevent Godot from skipping rendering when no normal windows are visible.
   */
  @JvmStatic
  public final fun registerAdditionalOutput(`object`: Object?): Unit {
    TransferContext.writeArguments(OBJECT to `object`)
    TransferContext.callMethod(ptr, MethodBindings.registerAdditionalOutputPtr, NIL)
  }

  /**
   * Unregisters an [Object] representing an additional output, that was registered via
   * [registerAdditionalOutput].
   */
  @JvmStatic
  public final fun unregisterAdditionalOutput(`object`: Object?): Unit {
    TransferContext.writeArguments(OBJECT to `object`)
    TransferContext.callMethod(ptr, MethodBindings.unregisterAdditionalOutputPtr, NIL)
  }

  /**
   * Returns `true` if any additional outputs have been registered via [registerAdditionalOutput].
   */
  @JvmStatic
  public final fun hasAdditionalOutputs(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasAdditionalOutputsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class Feature(
    id: Long,
  ) {
    /**
     * Display server supports global menu. This allows the application to display its menu items in
     * the operating system's top bar. **macOS**
     */
    FEATURE_GLOBAL_MENU(0),
    /**
     * Display server supports multiple windows that can be moved outside of the main window.
     * **Windows, macOS, Linux (X11)**
     */
    FEATURE_SUBWINDOWS(1),
    /**
     * Display server supports touchscreen input. **Windows, Linux (X11), Android, iOS, Web**
     */
    FEATURE_TOUCHSCREEN(2),
    /**
     * Display server supports mouse input. **Windows, macOS, Linux (X11/Wayland), Android, Web**
     */
    FEATURE_MOUSE(3),
    /**
     * Display server supports warping mouse coordinates to keep the mouse cursor constrained within
     * an area, but looping when one of the edges is reached. **Windows, macOS, Linux (X11/Wayland)**
     */
    FEATURE_MOUSE_WARP(4),
    /**
     * Display server supports setting and getting clipboard data. See also
     * [FEATURE_CLIPBOARD_PRIMARY]. **Windows, macOS, Linux (X11/Wayland), Android, iOS, Web**
     */
    FEATURE_CLIPBOARD(5),
    /**
     * Display server supports popping up a virtual keyboard when requested to input text without a
     * physical keyboard. **Android, iOS, Web**
     */
    FEATURE_VIRTUAL_KEYBOARD(6),
    /**
     * Display server supports setting the mouse cursor shape to be different from the default.
     * **Windows, macOS, Linux (X11/Wayland), Android, Web**
     */
    FEATURE_CURSOR_SHAPE(7),
    /**
     * Display server supports setting the mouse cursor shape to a custom image. **Windows, macOS,
     * Linux (X11/Wayland), Web**
     */
    FEATURE_CUSTOM_CURSOR_SHAPE(8),
    /**
     * Display server supports spawning text dialogs using the operating system's native
     * look-and-feel. See [dialogShow]. **Windows, macOS**
     */
    FEATURE_NATIVE_DIALOG(9),
    /**
     * Display server supports [url=https://en.wikipedia.org/wiki/Input_method]Input Method
     * Editor[/url], which is commonly used for inputting Chinese/Japanese/Korean text. This is handled
     * by the operating system, rather than by Godot. **Windows, macOS, Linux (X11)**
     */
    FEATURE_IME(10),
    /**
     * Display server supports windows can use per-pixel transparency to make windows behind them
     * partially or fully visible. **Windows, macOS, Linux (X11/Wayland)**
     */
    FEATURE_WINDOW_TRANSPARENCY(11),
    /**
     * Display server supports querying the operating system's display scale factor. This allows for
     * *reliable* automatic hiDPI display detection, as opposed to guessing based on the screen
     * resolution and reported display DPI (which can be unreliable due to broken monitor EDID).
     * **Windows, Linux (Wayland), macOS**
     */
    FEATURE_HIDPI(12),
    /**
     * Display server supports changing the window icon (usually displayed in the top-left corner).
     * **Windows, macOS, Linux (X11)**
     */
    FEATURE_ICON(13),
    /**
     * Display server supports changing the window icon (usually displayed in the top-left corner).
     * **Windows, macOS**
     */
    FEATURE_NATIVE_ICON(14),
    /**
     * Display server supports changing the screen orientation. **Android, iOS**
     */
    FEATURE_ORIENTATION(15),
    /**
     * Display server supports V-Sync status can be changed from the default (which is forced to be
     * enabled platforms not supporting this feature). **Windows, macOS, Linux (X11/Wayland)**
     */
    FEATURE_SWAP_BUFFERS(16),
    /**
     * Display server supports Primary clipboard can be used. This is a different clipboard from
     * [FEATURE_CLIPBOARD]. **Linux (X11/Wayland)**
     */
    FEATURE_CLIPBOARD_PRIMARY(18),
    /**
     * Display server supports text-to-speech. See `tts_*` methods. **Windows, macOS, Linux
     * (X11/Wayland), Android, iOS, Web**
     */
    FEATURE_TEXT_TO_SPEECH(19),
    /**
     * Display server supports expanding window content to the title. See
     * [WINDOW_FLAG_EXTEND_TO_TITLE]. **macOS**
     */
    FEATURE_EXTEND_TO_TITLE(20),
    /**
     * Display server supports reading screen pixels. See [screenGetPixel].
     */
    FEATURE_SCREEN_CAPTURE(21),
    /**
     * Display server supports application status indicators.
     */
    FEATURE_STATUS_INDICATOR(22),
    /**
     * Display server supports native help system search callbacks. See [helpSetSearchCallbacks].
     */
    FEATURE_NATIVE_HELP(23),
    /**
     * Display server supports spawning text input dialogs using the operating system's native
     * look-and-feel. See [dialogInputText]. **Windows, macOS**
     */
    FEATURE_NATIVE_DIALOG_INPUT(24),
    /**
     * Display server supports spawning dialogs for selecting files or directories using the
     * operating system's native look-and-feel. See [fileDialogShow] and [fileDialogWithOptionsShow].
     * **Windows, macOS, Linux (X11/Wayland)**
     */
    FEATURE_NATIVE_DIALOG_FILE(25),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single { it.id == `value` }
    }
  }

  public enum class MouseMode(
    id: Long,
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
     * Captures the mouse. The mouse will be hidden and its position locked at the center of the
     * window manager's window.
     * **Note:** If you want to process the mouse's movement in this mode, you need to use
     * [InputEventMouseMotion.relative].
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
      public fun from(`value`: Long): MouseMode = entries.single { it.id == `value` }
    }
  }

  public enum class ScreenOrientation(
    id: Long,
  ) {
    /**
     * Default landscape orientation.
     */
    SCREEN_LANDSCAPE(0),
    /**
     * Default portrait orientation.
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
      public fun from(`value`: Long): ScreenOrientation = entries.single { it.id == `value` }
    }
  }

  public enum class VirtualKeyboardType(
    id: Long,
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
     * Virtual keyboard for entering a password. On most platforms, this should disable autocomplete
     * and autocapitalization.
     * **Note:** This is not supported on Web. Instead, this behaves identically to
     * [KEYBOARD_TYPE_DEFAULT].
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
      public fun from(`value`: Long): VirtualKeyboardType = entries.single { it.id == `value` }
    }
  }

  public enum class CursorShape(
    id: Long,
  ) {
    /**
     * Arrow cursor shape. This is the default when not pointing anything that overrides the mouse
     * cursor, such as a [LineEdit] or [TextEdit].
     */
    CURSOR_ARROW(0),
    /**
     * I-beam cursor shape. This is used by default when hovering a control that accepts text input,
     * such as [LineEdit] or [TextEdit].
     */
    CURSOR_IBEAM(1),
    /**
     * Pointing hand cursor shape. This is used by default when hovering a [LinkButton] or a URL tag
     * in a [RichTextLabel].
     */
    CURSOR_POINTING_HAND(2),
    /**
     * Crosshair cursor. This is intended to be displayed when the user needs precise aim over an
     * element, such as a rectangle selection tool or a color picker.
     */
    CURSOR_CROSS(3),
    /**
     * Wait cursor. On most cursor themes, this displays a spinning icon *besides* the arrow.
     * Intended to be used for non-blocking operations (when the user can do something else at the
     * moment). See also [CURSOR_BUSY].
     */
    CURSOR_WAIT(4),
    /**
     * Wait cursor. On most cursor themes, this *replaces* the arrow with a spinning icon. Intended
     * to be used for blocking operations (when the user can't do anything else at the moment). See
     * also [CURSOR_WAIT].
     */
    CURSOR_BUSY(5),
    /**
     * Dragging hand cursor. This is displayed during drag-and-drop operations. See also
     * [CURSOR_CAN_DROP].
     */
    CURSOR_DRAG(6),
    /**
     * "Can drop" cursor. This is displayed during drag-and-drop operations if hovering over a
     * [Control] that can accept the drag-and-drop event. On most cursor themes, this displays a
     * dragging hand with an arrow symbol besides it. See also [CURSOR_DRAG].
     */
    CURSOR_CAN_DROP(7),
    /**
     * Forbidden cursor. This is displayed during drag-and-drop operations if the hovered [Control]
     * can't accept the drag-and-drop event.
     */
    CURSOR_FORBIDDEN(8),
    /**
     * Vertical resize cursor. Intended to be displayed when the hovered [Control] can be vertically
     * resized using the mouse. See also [CURSOR_VSPLIT].
     */
    CURSOR_VSIZE(9),
    /**
     * Horizontal resize cursor. Intended to be displayed when the hovered [Control] can be
     * horizontally resized using the mouse. See also [CURSOR_HSPLIT].
     */
    CURSOR_HSIZE(10),
    /**
     * Secondary diagonal resize cursor (top-right/bottom-left). Intended to be displayed when the
     * hovered [Control] can be resized on both axes at once using the mouse.
     */
    CURSOR_BDIAGSIZE(11),
    /**
     * Main diagonal resize cursor (top-left/bottom-right). Intended to be displayed when the
     * hovered [Control] can be resized on both axes at once using the mouse.
     */
    CURSOR_FDIAGSIZE(12),
    /**
     * Move cursor. Intended to be displayed when the hovered [Control] can be moved using the
     * mouse.
     */
    CURSOR_MOVE(13),
    /**
     * Vertical split cursor. This is displayed when hovering a [Control] with splits that can be
     * vertically resized using the mouse, such as [VSplitContainer]. On some cursor themes, this
     * cursor may have the same appearance as [CURSOR_VSIZE].
     */
    CURSOR_VSPLIT(14),
    /**
     * Horizontal split cursor. This is displayed when hovering a [Control] with splits that can be
     * horizontally resized using the mouse, such as [HSplitContainer]. On some cursor themes, this
     * cursor may have the same appearance as [CURSOR_HSIZE].
     */
    CURSOR_HSPLIT(15),
    /**
     * Help cursor. On most cursor themes, this displays a question mark icon instead of the mouse
     * cursor. Intended to be used when the user has requested help on the next element that will be
     * clicked.
     */
    CURSOR_HELP(16),
    /**
     * Represents the size of the [CursorShape] enum.
     */
    CURSOR_MAX(17),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CursorShape = entries.single { it.id == `value` }
    }
  }

  public enum class FileDialogMode(
    id: Long,
  ) {
    /**
     * The native file dialog allows selecting one, and only one file.
     */
    FILE_DIALOG_MODE_OPEN_FILE(0),
    /**
     * The native file dialog allows selecting multiple files.
     */
    FILE_DIALOG_MODE_OPEN_FILES(1),
    /**
     * The native file dialog only allows selecting a directory, disallowing the selection of any
     * file.
     */
    FILE_DIALOG_MODE_OPEN_DIR(2),
    /**
     * The native file dialog allows selecting one file or directory.
     */
    FILE_DIALOG_MODE_OPEN_ANY(3),
    /**
     * The native file dialog will warn when a file exists.
     */
    FILE_DIALOG_MODE_SAVE_FILE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FileDialogMode = entries.single { it.id == `value` }
    }
  }

  public enum class WindowMode(
    id: Long,
  ) {
    /**
     * Windowed mode, i.e. [Window] doesn't occupy the whole screen (unless set to the size of the
     * screen).
     */
    WINDOW_MODE_WINDOWED(0),
    /**
     * Minimized window mode, i.e. [Window] is not visible and available on window manager's window
     * list. Normally happens when the minimize button is pressed.
     */
    WINDOW_MODE_MINIMIZED(1),
    /**
     * Maximized window mode, i.e. [Window] will occupy whole screen area except task bar and still
     * display its borders. Normally happens when the maximize button is pressed.
     */
    WINDOW_MODE_MAXIMIZED(2),
    /**
     * Full screen mode with full multi-window support.
     * Full screen window covers the entire display area of a screen and has no decorations. The
     * display's video mode is not changed.
     * **On Windows:** Multi-window full-screen mode has a 1px border of the
     * [ProjectSettings.rendering/environment/defaults/defaultClearColor] color.
     * **On macOS:** A new desktop is used to display the running project.
     * **Note:** Regardless of the platform, enabling full screen will change the window size to
     * match the monitor's size. Therefore, make sure your project supports
     * [url=$DOCS_URL/tutorials/rendering/multiple_resolutions.html]multiple resolutions[/url] when
     * enabling full screen mode.
     */
    WINDOW_MODE_FULLSCREEN(3),
    /**
     * A single window full screen mode. This mode has less overhead, but only one window can be
     * open on a given screen at a time (opening a child window or application switching will trigger a
     * full screen transition).
     * Full screen window covers the entire display area of a screen and has no border or
     * decorations. The display's video mode is not changed.
     * **On Windows:** Depending on video driver, full screen transition might cause screens to go
     * black for a moment.
     * **On macOS:** A new desktop is used to display the running project. Exclusive full screen
     * mode prevents Dock and Menu from showing up when the mouse pointer is hovering the edge of the
     * screen.
     * **On Linux (X11):** Exclusive full screen mode bypasses compositor.
     * **Note:** Regardless of the platform, enabling full screen will change the window size to
     * match the monitor's size. Therefore, make sure your project supports
     * [url=$DOCS_URL/tutorials/rendering/multiple_resolutions.html]multiple resolutions[/url] when
     * enabling full screen mode.
     */
    WINDOW_MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowMode = entries.single { it.id == `value` }
    }
  }

  public enum class WindowFlags(
    id: Long,
  ) {
    /**
     * The window can't be resized by dragging its resize grip. It's still possible to resize the
     * window using [windowSetSize]. This flag is ignored for full screen windows.
     */
    WINDOW_FLAG_RESIZE_DISABLED(0),
    /**
     * The window do not have native title bar and other decorations. This flag is ignored for
     * full-screen windows.
     */
    WINDOW_FLAG_BORDERLESS(1),
    /**
     * The window is floating on top of all other windows. This flag is ignored for full-screen
     * windows.
     */
    WINDOW_FLAG_ALWAYS_ON_TOP(2),
    /**
     * The window background can be transparent.
     * **Note:** This flag has no effect if [isWindowTransparencyAvailable] returns `false`.
     * **Note:** Transparency support is implemented on Linux (X11/Wayland), macOS, and Windows, but
     * availability might vary depending on GPU driver, display manager, and compositor capabilities.
     */
    WINDOW_FLAG_TRANSPARENT(3),
    /**
     * The window can't be focused. No-focus window will ignore all input, except mouse clicks.
     */
    WINDOW_FLAG_NO_FOCUS(4),
    /**
     * Window is part of menu or [OptionButton] dropdown. This flag can't be changed when the window
     * is visible. An active popup window will exclusively receive all input, without stealing focus
     * from its parent. Popup windows are automatically closed when uses click outside it, or when an
     * application is switched. Popup window must have transient parent set (see [windowSetTransient]).
     */
    WINDOW_FLAG_POPUP(5),
    /**
     * Window content is expanded to the full size of the window. Unlike borderless window, the
     * frame is left intact and can be used to resize the window, title bar is transparent, but have
     * minimize/maximize/close buttons.
     * Use [windowSetWindowButtonsOffset] to adjust minimize/maximize/close buttons offset.
     * Use [windowGetSafeTitleMargins] to determine area under the title bar that is not covered by
     * decorations.
     * **Note:** This flag is implemented only on macOS.
     */
    WINDOW_FLAG_EXTEND_TO_TITLE(6),
    /**
     * All mouse events are passed to the underlying window of the same application.
     */
    WINDOW_FLAG_MOUSE_PASSTHROUGH(7),
    /**
     * Max value of the [WindowFlags].
     */
    WINDOW_FLAG_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowFlags = entries.single { it.id == `value` }
    }
  }

  public enum class WindowEvent(
    id: Long,
  ) {
    /**
     * Sent when the mouse pointer enters the window.
     */
    WINDOW_EVENT_MOUSE_ENTER(0),
    /**
     * Sent when the mouse pointer exits the window.
     */
    WINDOW_EVENT_MOUSE_EXIT(1),
    /**
     * Sent when the window grabs focus.
     */
    WINDOW_EVENT_FOCUS_IN(2),
    /**
     * Sent when the window loses focus.
     */
    WINDOW_EVENT_FOCUS_OUT(3),
    /**
     * Sent when the user has attempted to close the window (e.g. close button is pressed).
     */
    WINDOW_EVENT_CLOSE_REQUEST(4),
    /**
     * Sent when the device "Back" button is pressed.
     * **Note:** This event is implemented only on Android.
     */
    WINDOW_EVENT_GO_BACK_REQUEST(5),
    /**
     * Sent when the window is moved to the display with different DPI, or display DPI is changed.
     * **Note:** This flag is implemented only on macOS.
     */
    WINDOW_EVENT_DPI_CHANGE(6),
    /**
     * Sent when the window title bar decoration is changed (e.g. [WINDOW_FLAG_EXTEND_TO_TITLE] is
     * set or window entered/exited full screen mode).
     * **Note:** This flag is implemented only on macOS.
     */
    WINDOW_EVENT_TITLEBAR_CHANGE(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowEvent = entries.single { it.id == `value` }
    }
  }

  public enum class VSyncMode(
    id: Long,
  ) {
    /**
     * No vertical synchronization, which means the engine will display frames as fast as possible
     * (tearing may be visible). Framerate is unlimited (regardless of [Engine.maxFps]).
     */
    VSYNC_DISABLED(0),
    /**
     * Default vertical synchronization mode, the image is displayed only on vertical blanking
     * intervals (no tearing is visible). Framerate is limited by the monitor refresh rate (regardless
     * of [Engine.maxFps]).
     */
    VSYNC_ENABLED(1),
    /**
     * Behaves like [VSYNC_DISABLED] when the framerate drops below the screen's refresh rate to
     * reduce stuttering (tearing may be visible). Otherwise, vertical synchronization is enabled to
     * avoid tearing. Framerate is limited by the monitor refresh rate (regardless of [Engine.maxFps]).
     * Behaves like [VSYNC_ENABLED] when using the Compatibility rendering method.
     */
    VSYNC_ADAPTIVE(2),
    /**
     * Displays the most recent image in the queue on vertical blanking intervals, while rendering
     * to the other images (no tearing is visible). Framerate is unlimited (regardless of
     * [Engine.maxFps]).
     * Although not guaranteed, the images can be rendered as fast as possible, which may reduce
     * input lag (also called "Fast" V-Sync mode). [VSYNC_MAILBOX] works best when at least twice as
     * many frames as the display refresh rate are rendered. Behaves like [VSYNC_ENABLED] when using
     * the Compatibility rendering method.
     */
    VSYNC_MAILBOX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VSyncMode = entries.single { it.id == `value` }
    }
  }

  public enum class HandleType(
    id: Long,
  ) {
    /**
     * Display handle:
     * - Linux (X11): `X11::Display*` for the display.
     * - Android: `EGLDisplay` for the display.
     */
    DISPLAY_HANDLE(0),
    /**
     * Window handle:
     * - Windows: `HWND` for the window.
     * - Linux (X11): `X11::Window*` for the window.
     * - macOS: `NSWindow*` for the window.
     * - iOS: `UIViewController*` for the view controller.
     * - Android: `jObject` for the activity.
     */
    WINDOW_HANDLE(1),
    /**
     * Window view:
     * - Windows: `HDC` for the window (only with the GL Compatibility renderer).
     * - macOS: `NSView*` for the window main view.
     * - iOS: `UIView*` for the window main view.
     */
    WINDOW_VIEW(2),
    /**
     * OpenGL context (only with the GL Compatibility renderer):
     * - Windows: `HGLRC` for the window (native GL), or `EGLContext` for the window (ANGLE).
     * - Linux (X11): `GLXContext*` for the window.
     * - macOS: `NSOpenGLContext*` for the window (native GL), or `EGLContext` for the window
     * (ANGLE).
     * - Android: `EGLContext` for the window.
     */
    OPENGL_CONTEXT(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): HandleType = entries.single { it.id == `value` }
    }
  }

  public enum class TTSUtteranceEvent(
    id: Long,
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
      public fun from(`value`: Long): TTSUtteranceEvent = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "has_feature", 334065950)

    public val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_name", 201670096)

    public val helpSetSearchCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "help_set_search_callbacks", 1687350599)

    public val globalMenuSetPopupCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_popup_callbacks", 3893727526)

    public val globalMenuAddSubmenuItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_submenu_item", 2828985934)

    public val globalMenuAddItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_item", 3401266716)

    public val globalMenuAddCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_check_item", 3401266716)

    public val globalMenuAddIconItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_item", 4245856523)

    public val globalMenuAddIconCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_check_item", 4245856523)

    public val globalMenuAddRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_radio_check_item", 3401266716)

    public val globalMenuAddIconRadioCheckItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_icon_radio_check_item", 4245856523)

    public val globalMenuAddMultistateItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_multistate_item", 3431222859)

    public val globalMenuAddSeparatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_add_separator", 3214812433)

    public val globalMenuGetItemIndexFromTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_index_from_text", 2878152881)

    public val globalMenuGetItemIndexFromTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_index_from_tag", 2941063483)

    public val globalMenuIsItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_checked", 3511468594)

    public val globalMenuIsItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_checkable", 3511468594)

    public val globalMenuIsItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_radio_checkable", 3511468594)

    public val globalMenuGetItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_callback", 748666903)

    public val globalMenuGetItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_key_callback", 748666903)

    public val globalMenuGetItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_tag", 330672633)

    public val globalMenuGetItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_text", 591067909)

    public val globalMenuGetItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_submenu", 591067909)

    public val globalMenuGetItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_accelerator", 936065394)

    public val globalMenuIsItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_disabled", 3511468594)

    public val globalMenuIsItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_is_item_hidden", 3511468594)

    public val globalMenuGetItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_tooltip", 591067909)

    public val globalMenuGetItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_state", 3422818498)

    public val globalMenuGetItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_max_states", 3422818498)

    public val globalMenuGetItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_icon", 3591713183)

    public val globalMenuGetItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_indentation_level", 3422818498)

    public val globalMenuSetItemCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_checked", 4108344793)

    public val globalMenuSetItemCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_checkable", 4108344793)

    public val globalMenuSetItemRadioCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_radio_checkable", 4108344793)

    public val globalMenuSetItemCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_callback", 3809915389)

    public val globalMenuSetItemHoverCallbacksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_hover_callbacks", 3809915389)

    public val globalMenuSetItemKeyCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_key_callback", 3809915389)

    public val globalMenuSetItemTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_tag", 453659863)

    public val globalMenuSetItemTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_text", 965966136)

    public val globalMenuSetItemSubmenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_submenu", 965966136)

    public val globalMenuSetItemAcceleratorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_accelerator", 566943293)

    public val globalMenuSetItemDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_disabled", 4108344793)

    public val globalMenuSetItemHiddenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_hidden", 4108344793)

    public val globalMenuSetItemTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_tooltip", 965966136)

    public val globalMenuSetItemStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_state", 3474840532)

    public val globalMenuSetItemMaxStatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_max_states", 3474840532)

    public val globalMenuSetItemIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_icon", 3201338066)

    public val globalMenuSetItemIndentationLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_set_item_indentation_level", 3474840532)

    public val globalMenuGetItemCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_item_count", 1321353865)

    public val globalMenuRemoveItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_remove_item", 2956805083)

    public val globalMenuClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_clear", 83702148)

    public val globalMenuGetSystemMenuRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "global_menu_get_system_menu_roots", 3102165223)

    public val ttsIsSpeakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_is_speaking", 36873697)

    public val ttsIsPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_is_paused", 36873697)

    public val ttsGetVoicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_get_voices", 3995934104)

    public val ttsGetVoicesForLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_get_voices_for_language", 4291131558)

    public val ttsSpeakPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_speak", 903992738)

    public val ttsPausePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_pause", 3218959716)

    public val ttsResumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_resume", 3218959716)

    public val ttsStopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_stop", 3218959716)

    public val ttsSetUtteranceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tts_set_utterance_callback", 109679083)

    public val isDarkModeSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_dark_mode_supported", 36873697)

    public val isDarkModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_dark_mode", 36873697)

    public val getAccentColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_accent_color", 3444240500)

    public val getBaseColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_base_color", 3444240500)

    public val setSystemThemeChangeCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "set_system_theme_change_callback", 1611583062)

    public val mouseSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_set_mode", 348288463)

    public val mouseGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_mode", 1353961651)

    public val warpMousePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "warp_mouse", 1130785943)

    public val mouseGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_position", 3690982128)

    public val mouseGetButtonStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "mouse_get_button_state", 2512161324)

    public val clipboardSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_set", 83702148)

    public val clipboardGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_get", 201670096)

    public val clipboardGetImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_get_image", 4190603485)

    public val clipboardHasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_has", 36873697)

    public val clipboardHasImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_has_image", 36873697)

    public val clipboardSetPrimaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_set_primary", 83702148)

    public val clipboardGetPrimaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "clipboard_get_primary", 201670096)

    public val getDisplayCutoutsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_display_cutouts", 3995934104)

    public val getDisplaySafeAreaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_display_safe_area", 410525958)

    public val getScreenCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_screen_count", 3905245786)

    public val getPrimaryScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_primary_screen", 3905245786)

    public val getKeyboardFocusScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_keyboard_focus_screen", 3905245786)

    public val getScreenFromRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_screen_from_rect", 741354659)

    public val screenGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_position", 1725937825)

    public val screenGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_size", 1725937825)

    public val screenGetUsableRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_usable_rect", 2439012528)

    public val screenGetDpiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_dpi", 181039630)

    public val screenGetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_scale", 909105437)

    public val isTouchscreenAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_touchscreen_available", 3323674545)

    public val screenGetMaxScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_max_scale", 1740695150)

    public val screenGetRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_refresh_rate", 909105437)

    public val screenGetPixelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_pixel", 1532707496)

    public val screenGetImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_image", 3813388802)

    public val screenSetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_set_orientation", 2211511631)

    public val screenGetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_get_orientation", 133818562)

    public val screenSetKeepOnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_set_keep_on", 2586408642)

    public val screenIsKeptOnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "screen_is_kept_on", 36873697)

    public val getWindowListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_window_list", 1930428628)

    public val getWindowAtScreenPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_window_at_screen_position", 2485466453)

    public val windowGetNativeHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_native_handle", 1096425680)

    public val windowGetActivePopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_active_popup", 3905245786)

    public val windowSetPopupSafeRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_popup_safe_rect", 3317281434)

    public val windowGetPopupSafeRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_popup_safe_rect", 2161169500)

    public val windowSetTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_title", 441246282)

    public val windowGetTitleSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_title_size", 2925301799)

    public val windowSetMousePassthroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_mouse_passthrough", 1993637420)

    public val windowGetCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_current_screen", 1591665591)

    public val windowSetCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_current_screen", 2230941749)

    public val windowGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_position", 763922886)

    public val windowGetPositionWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_position_with_decorations", 763922886)

    public val windowSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_position", 2019273902)

    public val windowGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_size", 763922886)

    public val windowSetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_size", 2019273902)

    public val windowSetRectChangedCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_rect_changed_callback", 1091192925)

    public val windowSetWindowEventCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_window_event_callback", 1091192925)

    public val windowSetInputEventCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_input_event_callback", 1091192925)

    public val windowSetInputTextCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_input_text_callback", 1091192925)

    public val windowSetDropFilesCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_drop_files_callback", 1091192925)

    public val windowGetAttachedInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_attached_instance_id", 1591665591)

    public val windowGetMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_max_size", 763922886)

    public val windowSetMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_max_size", 2019273902)

    public val windowGetMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_min_size", 763922886)

    public val windowSetMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_min_size", 2019273902)

    public val windowGetSizeWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_size_with_decorations", 763922886)

    public val windowGetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_mode", 2185728461)

    public val windowSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_mode", 1319965401)

    public val windowSetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_flag", 254894155)

    public val windowGetFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_flag", 802816991)

    public val windowSetWindowButtonsOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_window_buttons_offset", 2019273902)

    public val windowGetSafeTitleMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_safe_title_margins", 2295066620)

    public val windowRequestAttentionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_request_attention", 1995695955)

    public val windowMoveToForegroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_move_to_foreground", 1995695955)

    public val windowIsFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_is_focused", 1051549951)

    public val windowCanDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_can_draw", 1051549951)

    public val windowSetTransientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_transient", 3937882851)

    public val windowSetExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_exclusive", 300928843)

    public val windowSetImeActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_ime_active", 1661950165)

    public val windowSetImePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_ime_position", 2019273902)

    public val windowSetVsyncModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_set_vsync_mode", 2179333492)

    public val windowGetVsyncModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_get_vsync_mode", 578873795)

    public val windowIsMaximizeAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_is_maximize_allowed", 1051549951)

    public val windowMaximizeOnTitleDblClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_maximize_on_title_dbl_click", 36873697)

    public val windowMinimizeOnTitleDblClickPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "window_minimize_on_title_dbl_click", 36873697)

    public val imeGetSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "ime_get_selection", 3690982128)

    public val imeGetTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "ime_get_text", 201670096)

    public val virtualKeyboardShowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_show", 3042891259)

    public val virtualKeyboardHidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_hide", 3218959716)

    public val virtualKeyboardGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "virtual_keyboard_get_height", 3905245786)

    public val cursorSetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_set_shape", 2026291549)

    public val cursorGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_get_shape", 1087724927)

    public val cursorSetCustomImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "cursor_set_custom_image", 1816663697)

    public val getSwapCancelOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "get_swap_cancel_ok", 2240911060)

    public val enableForStealingFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "enable_for_stealing_focus", 1286410249)

    public val dialogShowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "dialog_show", 4115553226)

    public val dialogInputTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "dialog_input_text", 3088703427)

    public val fileDialogShowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "file_dialog_show", 1531299078)

    public val fileDialogWithOptionsShowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "file_dialog_with_options_show", 1305318754)

    public val keyboardGetLayoutCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_count", 3905245786)

    public val keyboardGetCurrentLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_current_layout", 3905245786)

    public val keyboardSetCurrentLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_set_current_layout", 1286410249)

    public val keyboardGetLayoutLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_language", 844755477)

    public val keyboardGetLayoutNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_layout_name", 844755477)

    public val keyboardGetKeycodeFromPhysicalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_keycode_from_physical", 3447613187)

    public val keyboardGetLabelFromPhysicalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "keyboard_get_label_from_physical", 3447613187)

    public val processEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "process_events", 3218959716)

    public val forceProcessAndDropEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "force_process_and_drop_events", 3218959716)

    public val setNativeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "set_native_icon", 83702148)

    public val setIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "set_icon", 532598488)

    public val createStatusIndicatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "create_status_indicator", 1904285171)

    public val statusIndicatorSetIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "status_indicator_set_icon", 666127730)

    public val statusIndicatorSetTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "status_indicator_set_tooltip", 501894301)

    public val statusIndicatorSetMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "status_indicator_set_menu", 4040184819)

    public val statusIndicatorSetCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "status_indicator_set_callback", 957362965)

    public val statusIndicatorGetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "status_indicator_get_rect", 3327874267)

    public val deleteStatusIndicatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "delete_status_indicator", 1286410249)

    public val tabletGetDriverCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_driver_count", 3905245786)

    public val tabletGetDriverNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_driver_name", 844755477)

    public val tabletGetCurrentDriverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_get_current_driver", 201670096)

    public val tabletSetCurrentDriverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "tablet_set_current_driver", 83702148)

    public val isWindowTransparencyAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "is_window_transparency_available", 36873697)

    public val registerAdditionalOutputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "register_additional_output", 3975164845)

    public val unregisterAdditionalOutputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "unregister_additional_output", 3975164845)

    public val hasAdditionalOutputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DisplayServer", "has_additional_outputs", 36873697)
  }
}
