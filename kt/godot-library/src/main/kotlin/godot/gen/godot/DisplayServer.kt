// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.DisplayServer
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
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
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public object DisplayServer : Object() {
  /**
   *
   */
  public final const val SCREEN_OF_MAIN_WINDOW: Long = -1

  /**
   *
   */
  public final const val MAIN_WINDOW_ID: Long = 0

  /**
   *
   */
  public final const val INVALID_WINDOW_ID: Long = -1

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_DISPLAYSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   *
   */
  public open fun hasFeature(feature: DisplayServer.Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public open fun globalMenuAddItem(
    menuRoot: String,
    label: String,
    callback: Callable,
    tag: Any? = null
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, OBJECT to callback, ANY to
        tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_ITEM,
        NIL)
  }

  /**
   *
   */
  public open fun globalMenuAddCheckItem(
    menuRoot: String,
    label: String,
    callback: Callable,
    tag: Any? = null
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, OBJECT to callback, ANY to
        tag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_CHECK_ITEM, NIL)
  }

  /**
   *
   */
  public open fun globalMenuAddSubmenuItem(
    menuRoot: String,
    label: String,
    submenu: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, STRING to label, STRING to submenu)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_SUBMENU_ITEM, NIL)
  }

  /**
   *
   */
  public open fun globalMenuAddSeparator(menuRoot: String): Unit {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_ADD_SEPARATOR, NIL)
  }

  /**
   *
   */
  public open fun globalMenuIsItemChecked(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_CHECKED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun globalMenuIsItemCheckable(menuRoot: String, idx: Long): Boolean {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_IS_ITEM_CHECKABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun globalMenuGetItemCallback(menuRoot: String, idx: Long): Callable? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_CALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Callable?
  }

  /**
   *
   */
  public open fun globalMenuGetItemTag(menuRoot: String, idx: Long): Any? {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_TAG, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   *
   */
  public open fun globalMenuGetItemText(menuRoot: String, idx: Long): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public open fun globalMenuGetItemSubmenu(menuRoot: String, idx: Long): String {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_GET_ITEM_SUBMENU, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public open fun globalMenuSetItemChecked(
    menuRoot: String,
    idx: Long,
    checked: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to checked)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CHECKED, NIL)
  }

  /**
   *
   */
  public open fun globalMenuSetItemCheckable(
    menuRoot: String,
    idx: Long,
    checkable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, BOOL to checkable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CHECKABLE, NIL)
  }

  /**
   *
   */
  public open fun globalMenuSetItemCallback(
    menuRoot: String,
    idx: Long,
    callback: Callable
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, OBJECT to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun globalMenuSetItemTag(
    menuRoot: String,
    idx: Long,
    tag: Any
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, ANY to tag)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_TAG, NIL)
  }

  /**
   *
   */
  public open fun globalMenuSetItemText(
    menuRoot: String,
    idx: Long,
    text: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, STRING to text)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_TEXT, NIL)
  }

  /**
   *
   */
  public open fun globalMenuSetItemSubmenu(
    menuRoot: String,
    idx: Long,
    submenu: String
  ): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx, STRING to submenu)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_SET_ITEM_SUBMENU, NIL)
  }

  /**
   *
   */
  public open fun globalMenuRemoveItem(menuRoot: String, idx: Long): Unit {
    TransferContext.writeArguments(STRING to menuRoot, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_REMOVE_ITEM, NIL)
  }

  /**
   *
   */
  public open fun globalMenuClear(menuRoot: String): Unit {
    TransferContext.writeArguments(STRING to menuRoot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GLOBAL_MENU_CLEAR,
        NIL)
  }

  /**
   *
   */
  public open fun mouseSetMode(mouseMode: DisplayServer.MouseMode): Unit {
    TransferContext.writeArguments(LONG to mouseMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_SET_MODE, NIL)
  }

  /**
   *
   */
  public open fun mouseGetMode(): DisplayServer.MouseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_MODE, LONG)
    return DisplayServer.MouseMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the mouse cursor position to the given `position`.
   */
  public open fun mouseWarpToPosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_WARP_TO_POSITION, NIL)
  }

  /**
   * Returns the mouse cursor's current position.
   */
  public open fun mouseGetPosition(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   *
   */
  public open fun mouseGetButtonState(): MouseButton {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_MOUSE_GET_BUTTON_STATE, LONG)
    return MouseButton.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the user's clipboard content to the given string.
   */
  public open fun clipboardSet(clipboard: String): Unit {
    TransferContext.writeArguments(STRING to clipboard)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_SET, NIL)
  }

  /**
   * Returns the user's clipboard as a string if possible.
   */
  public open fun clipboardGet(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_GET, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if there is content on the user's clipboard.
   */
  public open fun clipboardHas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the user's primary clipboard content to the given string.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public open fun clipboardSetPrimary(clipboardPrimary: String): Unit {
    TransferContext.writeArguments(STRING to clipboardPrimary)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_SET_PRIMARY,
        NIL)
  }

  /**
   * Returns the user's primary clipboard as a string if possible.
   *
   * **Note:** This method is only implemented on Linux.
   */
  public open fun clipboardGetPrimary(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CLIPBOARD_GET_PRIMARY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public open fun getScreenCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_SCREEN_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun screenGetPosition(screen: Long = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   *
   */
  public open fun screenGetSize(screen: Long = -1): Vector2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   *
   */
  public open fun screenGetUsableRect(screen: Long = -1): Rect2i {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_USABLE_RECT, RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * Returns the dots per inch density of the specified screen. If `screen` is `SCREEN_OF_MAIN_WINDOW` (the default value), a screen with the main window will be used.
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
   * **Note:** This method is implemented on Android, Linux, macOS and Windows. Returns `72` on unsupported platforms.
   */
  public open fun screenGetDpi(screen: Long = -1): Long {
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
  public open fun screenGetScale(screen: Long = -1): Double {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public open fun screenIsTouchscreen(screen: Long = -1): Boolean {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_IS_TOUCHSCREEN,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the greatest scale factor of all screens.
   *
   * **Note:** On macOS returned value is `2.0` if there is at least one hiDPI (Retina) screen in the system, and `1.0` in all other cases.
   *
   * **Note:** This method is implemented on macOS.
   */
  public open fun screenGetMaxScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_MAX_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the current refresh rate of the specified screen. If `screen` is `SCREEN_OF_MAIN_WINDOW` (the default value), a screen with the main window will be used.
   *
   * **Note:** Returns `60.0` if the DisplayServer fails to find the refresh rate for the specified screen. On HTML5, [screenGetRefreshRate] will always return `60.0` as there is no way to retrieve the refresh rate on that platform.
   */
  public open fun screenGetRefreshRate(screen: Long = -1): Double {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_REFRESH_RATE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public open fun screenSetOrientation(orientation: DisplayServer.ScreenOrientation, screen: Long
      = -1): Unit {
    TransferContext.writeArguments(LONG to orientation.id, LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_SET_ORIENTATION, NIL)
  }

  /**
   *
   */
  public open fun screenGetOrientation(screen: Long = -1): DisplayServer.ScreenOrientation {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_GET_ORIENTATION, LONG)
    return DisplayServer.ScreenOrientation.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun screenSetKeepOn(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_SET_KEEP_ON,
        NIL)
  }

  /**
   *
   */
  public open fun screenIsKeptOn(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SCREEN_IS_KEPT_ON,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun getWindowList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_WINDOW_LIST,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   *
   */
  public open fun getWindowAtScreenPosition(position: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_WINDOW_AT_SCREEN_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun createSubWindow(
    mode: DisplayServer.WindowMode,
    vsyncMode: DisplayServer.VSyncMode,
    flags: Long,
    rect: Rect2i = Rect2i(0.0, 0.0, 0.0, 0.0)
  ): Long {
    TransferContext.writeArguments(LONG to mode.id, LONG to vsyncMode.id, LONG to flags, RECT2I to
        rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CREATE_SUB_WINDOW,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun deleteSubWindow(windowId: Long): Unit {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_DELETE_SUB_WINDOW,
        NIL)
  }

  /**
   * Returns internal structure pointers for use in plugins.
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   */
  public open fun windowGetNativeHandle(handleType: DisplayServer.HandleType, windowId: Long = 0):
      Long {
    TransferContext.writeArguments(LONG to handleType.id, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_NATIVE_HANDLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the title of the given window to `title`.
   */
  public open fun windowSetTitle(title: String, windowId: Long = 0): Unit {
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
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while on Linux and macOS it is.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun windowSetMousePassthrough(region: PackedVector2Array, windowId: Long = 0): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to region, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MOUSE_PASSTHROUGH, NIL)
  }

  /**
   *
   */
  public open fun windowGetCurrentScreen(windowId: Long = 0): Long {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_CURRENT_SCREEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun windowSetCurrentScreen(screen: Long, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to screen, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_CURRENT_SCREEN, NIL)
  }

  /**
   * Returns the position of the given window to on the screen.
   */
  public open fun windowGetPosition(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_POSITION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the position of the given window to `position`.
   */
  public open fun windowSetPosition(position: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_POSITION,
        NIL)
  }

  /**
   *
   */
  public open fun windowGetSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the size of the given window to `size`.
   */
  public open fun windowSetSize(size: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to size, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_SIZE, NIL)
  }

  /**
   *
   */
  public open fun windowSetRectChangedCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(OBJECT to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_RECT_CHANGED_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun windowSetWindowEventCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(OBJECT to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_WINDOW_EVENT_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun windowSetInputEventCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(OBJECT to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_INPUT_EVENT_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun windowSetInputTextCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(OBJECT to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_INPUT_TEXT_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun windowSetDropFilesCallback(callback: Callable, windowId: Long = 0): Unit {
    TransferContext.writeArguments(OBJECT to callback, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_DROP_FILES_CALLBACK, NIL)
  }

  /**
   *
   */
  public open fun windowAttachInstanceId(instanceId: Long, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to instanceId, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_ATTACH_INSTANCE_ID, NIL)
  }

  /**
   *
   */
  public open fun windowGetAttachedInstanceId(windowId: Long = 0): Long {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_ATTACHED_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun windowGetMaxSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MAX_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   *
   */
  public open fun windowSetMaxSize(maxSize: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to maxSize, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MAX_SIZE,
        NIL)
  }

  /**
   *
   */
  public open fun windowGetMinSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MIN_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the minimum size for the given window to `min_size` (in pixels).
   *
   * **Note:** By default, the main window has a minimum size of `Vector2i(64, 64)`. This prevents issues that can arise when the window is resized to a near-zero size.
   */
  public open fun windowSetMinSize(minSize: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to minSize, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MIN_SIZE,
        NIL)
  }

  /**
   *
   */
  public open fun windowGetRealSize(windowId: Long = 0): Vector2i {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_REAL_SIZE,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the mode of the given window.
   */
  public open fun windowGetMode(windowId: Long = 0): DisplayServer.WindowMode {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_MODE, LONG)
    return DisplayServer.WindowMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets window mode for the given window to `mode`. See [enum WindowMode] for possible values and how each mode behaves.
   *
   * **Note:** Setting the window to fullscreen forcibly sets the borderless flag to `true`, so make sure to set it back to `false` when not wanted.
   */
  public open fun windowSetMode(mode: DisplayServer.WindowMode, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to mode.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_MODE, NIL)
  }

  /**
   * Enables or disables the given window's given `flag`. See [enum WindowFlags] for possible values and their behavior.
   */
  public open fun windowSetFlag(
    flag: DisplayServer.WindowFlags,
    enabled: Boolean,
    windowId: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_FLAG, NIL)
  }

  /**
   * Returns the current value of the given window's `flag`.
   */
  public open fun windowGetFlag(flag: DisplayServer.WindowFlags, windowId: Long = 0): Boolean {
    TransferContext.writeArguments(LONG to flag.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun windowRequestAttention(windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_REQUEST_ATTENTION, NIL)
  }

  /**
   *
   */
  public open fun windowMoveToForeground(windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_MOVE_TO_FOREGROUND, NIL)
  }

  /**
   *
   */
  public open fun windowCanDraw(windowId: Long = 0): Boolean {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun windowSetTransient(windowId: Long, parentWindowId: Long): Unit {
    TransferContext.writeArguments(LONG to windowId, LONG to parentWindowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_TRANSIENT,
        NIL)
  }

  /**
   *
   */
  public open fun windowSetImeActive(active: Boolean, windowId: Long = 0): Unit {
    TransferContext.writeArguments(BOOL to active, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_IME_ACTIVE,
        NIL)
  }

  /**
   *
   */
  public open fun windowSetImePosition(position: Vector2i, windowId: Long = 0): Unit {
    TransferContext.writeArguments(VECTOR2I to position, LONG to windowId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_IME_POSITION, NIL)
  }

  /**
   * Sets the VSync mode of the given window.
   *
   * See [enum DisplayServer.VSyncMode] for possible values and how they affect the behavior of your application.
   *
   * Depending on the platform and used renderer, the engine will fall back to [VSYNC_ENABLED], if the desired mode is not supported.
   */
  public open fun windowSetVsyncMode(vsyncMode: DisplayServer.VSyncMode, windowId: Long = 0): Unit {
    TransferContext.writeArguments(LONG to vsyncMode.id, LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_SET_VSYNC_MODE,
        NIL)
  }

  /**
   * Returns the VSync mode of the given window.
   */
  public open fun windowGetVsyncMode(windowId: Long = 0): DisplayServer.VSyncMode {
    TransferContext.writeArguments(LONG to windowId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_WINDOW_GET_VSYNC_MODE,
        LONG)
    return DisplayServer.VSyncMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun imeGetSelection(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IME_GET_SELECTION,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   *
   */
  public open fun imeGetText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_IME_GET_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Shows the virtual keyboard if the platform has one.
   *
   * `existing_text` parameter is useful for implementing your own [godot.LineEdit] or [godot.TextEdit], as it tells the virtual keyboard what text has already been typed (the virtual keyboard uses it for auto-correct and predictions).
   *
   * `position` parameter is the screen space [godot.core.Rect2] of the edited text.
   *
   * `multiline` parameter needs to be set to `true` to be able to enter multiple lines of text, as in [godot.TextEdit].
   *
   * `max_length` limits the number of characters that can be entered if different from `-1`.
   *
   * `cursor_start` can optionally define the current text cursor position if `cursor_end` is not set.
   *
   * `cursor_start` and `cursor_end` can optionally define the current text selection.
   *
   * **Note:** This method is implemented on Android, iOS and UWP.
   */
  public open fun virtualKeyboardShow(
    existingText: String,
    position: Rect2 = Rect2i(0.0, 0.0, 0.0, 0.0),
    multiline: Boolean = false,
    maxLength: Long = -1,
    cursorStart: Long = -1,
    cursorEnd: Long = -1
  ): Unit {
    TransferContext.writeArguments(STRING to existingText, RECT2 to position, BOOL to multiline,
        LONG to maxLength, LONG to cursorStart, LONG to cursorEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_SHOW,
        NIL)
  }

  /**
   * Hides the virtual keyboard if it is shown, does nothing otherwise.
   */
  public open fun virtualKeyboardHide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_HIDE,
        NIL)
  }

  /**
   * Returns the on-screen keyboard's height in pixels. Returns 0 if there is no keyboard or if it is currently hidden.
   */
  public open fun virtualKeyboardGetHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_VIRTUAL_KEYBOARD_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun cursorSetShape(shape: DisplayServer.CursorShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_SET_SHAPE, NIL)
  }

  /**
   *
   */
  public open fun cursorGetShape(): DisplayServer.CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_GET_SHAPE,
        LONG)
    return DisplayServer.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun cursorSetCustomImage(
    cursor: Resource,
    shape: DisplayServer.CursorShape = CursorShape.CURSOR_ARROW,
    hotspot: Vector2 = Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(OBJECT to cursor, LONG to shape.id, VECTOR2 to hotspot)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_CURSOR_SET_CUSTOM_IMAGE, NIL)
  }

  /**
   *
   */
  public open fun getSwapCancelOk(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_GET_SWAP_CANCEL_OK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun enableForStealingFocus(processId: Long): Unit {
    TransferContext.writeArguments(LONG to processId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_ENABLE_FOR_STEALING_FOCUS, NIL)
  }

  /**
   *
   */
  public open fun dialogShow(
    title: String,
    description: String,
    buttons: PackedStringArray,
    callback: Callable
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, PACKED_STRING_ARRAY to
        buttons, OBJECT to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_DIALOG_SHOW, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun dialogInputText(
    title: String,
    description: String,
    existingText: String,
    callback: Callable
  ): GodotError {
    TransferContext.writeArguments(STRING to title, STRING to description, STRING to existingText,
        OBJECT to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_DIALOG_INPUT_TEXT,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the number of keyboard layouts.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardGetLayoutCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns active keyboard layout index.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardGetCurrentLayout(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_CURRENT_LAYOUT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets active keyboard layout.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardSetCurrentLayout(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_SET_CURRENT_LAYOUT, NIL)
  }

  /**
   * Returns the ISO-639/BCP-47 language code of the keyboard layout at position `index`.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardGetLayoutLanguage(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_LANGUAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the localized name of the keyboard layout at position `index`.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardGetLayoutName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_LAYOUT_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Converts a physical (US QWERTY) `keycode` to one in the active keyboard layout.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun keyboardGetKeycodeFromPhysical(keycode: Key): Key {
    TransferContext.writeArguments(LONG to keycode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_KEYBOARD_GET_KEYCODE_FROM_PHYSICAL, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun processEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_PROCESS_EVENTS, NIL)
  }

  /**
   *
   */
  public open fun forceProcessAndDropEvents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_FORCE_PROCESS_AND_DROP_EVENTS, NIL)
  }

  /**
   *
   */
  public open fun setNativeIcon(filename: String): Unit {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SET_NATIVE_ICON, NIL)
  }

  /**
   *
   */
  public open fun setIcon(image: Image): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_SET_ICON, NIL)
  }

  /**
   * Returns the total number of available tablet drivers.
   *
   * **Note:** This method is implemented on Windows.
   */
  public open fun tabletGetDriverCount(): Long {
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
  public open fun tabletGetDriverName(idx: Long): String {
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
  public open fun tabletGetCurrentDriver(): String {
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
  public open fun tabletSetCurrentDriver(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_DISPLAYSERVER_TABLET_SET_CURRENT_DRIVER, NIL)
  }

  public enum class ScreenOrientation(
    id: Long
  ) {
    /**
     *
     */
    SCREEN_LANDSCAPE(0),
    /**
     *
     */
    SCREEN_PORTRAIT(1),
    /**
     *
     */
    SCREEN_REVERSE_LANDSCAPE(2),
    /**
     *
     */
    SCREEN_REVERSE_PORTRAIT(3),
    /**
     *
     */
    SCREEN_SENSOR_LANDSCAPE(4),
    /**
     *
     */
    SCREEN_SENSOR_PORTRAIT(5),
    /**
     *
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

  public enum class Feature(
    id: Long
  ) {
    /**
     *
     */
    FEATURE_GLOBAL_MENU(0),
    /**
     *
     */
    FEATURE_SUBWINDOWS(1),
    /**
     *
     */
    FEATURE_TOUCHSCREEN(2),
    /**
     *
     */
    FEATURE_MOUSE(3),
    /**
     *
     */
    FEATURE_MOUSE_WARP(4),
    /**
     *
     */
    FEATURE_CLIPBOARD(5),
    /**
     *
     */
    FEATURE_VIRTUAL_KEYBOARD(6),
    /**
     *
     */
    FEATURE_CURSOR_SHAPE(7),
    /**
     *
     */
    FEATURE_CUSTOM_CURSOR_SHAPE(8),
    /**
     *
     */
    FEATURE_NATIVE_DIALOG(9),
    /**
     *
     */
    FEATURE_IME(10),
    /**
     *
     */
    FEATURE_WINDOW_TRANSPARENCY(11),
    /**
     *
     */
    FEATURE_HIDPI(12),
    /**
     *
     */
    FEATURE_ICON(13),
    /**
     *
     */
    FEATURE_NATIVE_ICON(14),
    /**
     *
     */
    FEATURE_ORIENTATION(15),
    /**
     *
     */
    FEATURE_SWAP_BUFFERS(16),
    /**
     *
     */
    FEATURE_CLIPBOARD_PRIMARY(18),
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
     *
     */
    WINDOW_FLAG_RESIZE_DISABLED(0),
    /**
     *
     */
    WINDOW_FLAG_BORDERLESS(1),
    /**
     *
     */
    WINDOW_FLAG_ALWAYS_ON_TOP(2),
    /**
     *
     */
    WINDOW_FLAG_TRANSPARENT(3),
    /**
     *
     */
    WINDOW_FLAG_NO_FOCUS(4),
    /**
     *
     */
    WINDOW_FLAG_MAX(5),
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
     *
     */
    WINDOW_MODE_WINDOWED(0),
    /**
     *
     */
    WINDOW_MODE_MINIMIZED(1),
    /**
     *
     */
    WINDOW_MODE_MAXIMIZED(2),
    /**
     * Fullscreen window mode. Note that this is not *exclusive* fullscreen. On Windows and Linux, a borderless window is used to emulate fullscreen. On macOS, a new desktop is used to display the running project.
     *
     * Regardless of the platform, enabling fullscreen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling fullscreen mode.
     */
    WINDOW_MODE_FULLSCREEN(3),
    /**
     * Exclusive fullscreen window mode. This mode is implemented on Windows only. On other platforms, it is equivalent to [WINDOW_MODE_FULLSCREEN].
     *
     * Only one window in exclusive fullscreen mode can be visible on a given screen at a time. If multiple windows are in exclusive fullscreen mode for the same screen, the last one being set to this mode takes precedence.
     *
     * Regardless of the platform, enabling fullscreen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling fullscreen mode.
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

  public enum class HandleType(
    id: Long
  ) {
    /**
     * Display handle:
     *
     * - Linux: `X11::Display*` for the display.
     */
    DISPLAY_HANDLE(0),
    /**
     * Window handle:
     *
     * - Windows: `HWND` for the window.
     *
     * - Linux: `X11::Window*` for the window.
     *
     * - MacOS: `NSWindow*` for the window.
     *
     * - iOS: `UIViewController*` for the view controller.
     *
     * - Android: `jObject` for the activity.
     */
    WINDOW_HANDLE(1),
    /**
     * Window view:
     *
     * - MacOS: `NSView*` for the window main view.
     *
     * - iOS: `UIView*` for the window main view.
     */
    WINDOW_VIEW(2),
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
     * Captures the mouse. The mouse will be hidden and its position locked at the center of the screen.
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

  public enum class CursorShape(
    id: Long
  ) {
    /**
     *
     */
    CURSOR_ARROW(0),
    /**
     *
     */
    CURSOR_IBEAM(1),
    /**
     *
     */
    CURSOR_POINTING_HAND(2),
    /**
     *
     */
    CURSOR_CROSS(3),
    /**
     *
     */
    CURSOR_WAIT(4),
    /**
     *
     */
    CURSOR_BUSY(5),
    /**
     *
     */
    CURSOR_DRAG(6),
    /**
     *
     */
    CURSOR_CAN_DROP(7),
    /**
     *
     */
    CURSOR_FORBIDDEN(8),
    /**
     *
     */
    CURSOR_VSIZE(9),
    /**
     *
     */
    CURSOR_HSIZE(10),
    /**
     *
     */
    CURSOR_BDIAGSIZE(11),
    /**
     *
     */
    CURSOR_FDIAGSIZE(12),
    /**
     *
     */
    CURSOR_MOVE(13),
    /**
     *
     */
    CURSOR_VSPLIT(14),
    /**
     *
     */
    CURSOR_HSPLIT(15),
    /**
     *
     */
    CURSOR_HELP(16),
    /**
     *
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

  public enum class VSyncMode(
    id: Long
  ) {
    /**
     * No vertical synchronization, which means the engine will display frames as fast as possible (tearing may be visible).
     */
    VSYNC_DISABLED(0),
    /**
     * Default vertical synchronization mode, the image is displayed only on vertical blanking intervals (no tearing is visible).
     */
    VSYNC_ENABLED(1),
    /**
     * Behaves like [VSYNC_DISABLED] when the framerate drops below the screen's refresh rate to reduce stuttering (tearing may be visible), otherwise vertical synchronization is enabled to avoid tearing.
     */
    VSYNC_ADAPTIVE(2),
    /**
     * Displays the most recent image in the queue on vertical blanking intervals, while rendering to the other images (no tearing is visible).
     *
     * Although not guaranteed, the images can be rendered as fast as possible, which may reduce input lag.
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

  public enum class WindowEvent(
    id: Long
  ) {
    /**
     *
     */
    WINDOW_EVENT_MOUSE_ENTER(0),
    /**
     *
     */
    WINDOW_EVENT_MOUSE_EXIT(1),
    /**
     *
     */
    WINDOW_EVENT_FOCUS_IN(2),
    /**
     *
     */
    WINDOW_EVENT_FOCUS_OUT(3),
    /**
     *
     */
    WINDOW_EVENT_CLOSE_REQUEST(4),
    /**
     *
     */
    WINDOW_EVENT_GO_BACK_REQUEST(5),
    /**
     *
     */
    WINDOW_EVENT_DPI_CHANGE(6),
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
