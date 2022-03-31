// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.Window
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all windows.
 *
 * A node that creates a window.
 */
@GodotBaseType
public open class Window : Viewport() {
  /**
   *
   */
  public val mouseExited: Signal0 by signal()

  /**
   *
   */
  public val themeChanged: Signal0 by signal()

  /**
   *
   */
  public val focusEntered: Signal0 by signal()

  /**
   *
   */
  public val goBackRequested: Signal0 by signal()

  /**
   *
   */
  public val closeRequested: Signal0 by signal()

  /**
   *
   */
  public val mouseEntered: Signal0 by signal()

  /**
   *
   */
  public val windowInput: Signal1<InputEvent> by signal("event")

  /**
   *
   */
  public val aboutToPopup: Signal0 by signal()

  /**
   * Emitted when files are dragged from the OS file manager and dropped in the game window. The argument is a list of file paths.
   */
  public val filesDropped: Signal1<PackedStringArray> by signal("files")

  /**
   *
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   *
   */
  public val focusExited: Signal0 by signal()

  /**
   * The window's title.
   */
  public open var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_TITLE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_TITLE, NIL)
    }

  /**
   * The window's position in pixels.
   */
  public open var position: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_POSITION, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_POSITION, NIL)
    }

  /**
   * The window's size in pixels.
   */
  public open var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_SIZE, NIL)
    }

  /**
   * Set's the window's current mode.
   *
   * **Note:** Fullscreen mode is not exclusive fullscreen on Windows and Linux.
   */
  public open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MODE, NIL)
    }

  /**
   * The screen the window is currently on.
   */
  public open var currentScreen: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CURRENT_SCREEN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CURRENT_SCREEN, NIL)
    }

  /**
   * If `true`, the window is visible.
   */
  public open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_VISIBLE, NIL)
    }

  /**
   *
   */
  public open var wrapControls: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_WRAPPING_CONTROLS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_WRAP_CONTROLS, NIL)
    }

  /**
   *
   */
  public open var transient: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_TRANSIENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_TRANSIENT, NIL)
    }

  /**
   *
   */
  public open var exclusive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_EXCLUSIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_EXCLUSIVE, NIL)
    }

  /**
   *
   */
  public open var minSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MIN_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MIN_SIZE, NIL)
    }

  /**
   *
   */
  public open var maxSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MAX_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MAX_SIZE, NIL)
    }

  /**
   *
   */
  public open var contentScaleSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_SIZE,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_SIZE,
          NIL)
    }

  /**
   *
   */
  public open var contentScaleMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_MODE,
          NIL)
    }

  /**
   *
   */
  public open var contentScaleAspect: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_ASPECT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_ASPECT,
          NIL)
    }

  /**
   *
   */
  public open var contentScaleFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_FACTOR,
          NIL)
    }

  /**
   *
   */
  public open var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Theme?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_THEME, NIL)
    }

  /**
   *
   */
  public open var themeTypeVariation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_TYPE_VARIATION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_THEME_TYPE_VARIATION,
          NIL)
    }

  /**
   * Toggles if any text should automatically change to its translated version depending on the current locale.
   */
  public open var autoTranslate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_AUTO_TRANSLATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_AUTO_TRANSLATE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WINDOW)
  }

  /**
   * Resets the size to the minimum size, which is the max of [minSize] and (if [wrapControls] is enabled) [getContentsMinimumSize]. This is equivalent to calling `set_size(Vector2i())` (or any size below the minimum).
   */
  public open fun resetSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_RESET_SIZE, NIL)
  }

  /**
   * Returns the window's size including its border.
   */
  public open fun getRealSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_REAL_SIZE, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets a specified window flag.
   */
  public open fun setFlag(flag: Window.Flags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_FLAG, NIL)
  }

  /**
   * Returns `true` if the flag is set.
   */
  public open fun getFlag(flag: Window.Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun isMaximizeAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_MAXIMIZE_ALLOWED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun requestAttention(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REQUEST_ATTENTION, NIL)
  }

  /**
   *
   */
  public open fun moveToForeground(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_MOVE_TO_FOREGROUND, NIL)
  }

  /**
   *
   */
  public open fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HIDE, NIL)
  }

  /**
   *
   */
  public open fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SHOW, NIL)
  }

  /**
   * Returns whether the window is being drawn to the screen.
   */
  public open fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window is focused.
   */
  public open fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Causes the window to grab focus, allowing it to receive user input.
   */
  public open fun grabFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GRAB_FOCUS, NIL)
  }

  /**
   *
   */
  public open fun setImeActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_ACTIVE, NIL)
  }

  /**
   *
   */
  public open fun setImePosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_POSITION, NIL)
  }

  /**
   * Returns `true` if the window is currently embedded in another window.
   */
  public open fun isEmbedded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_EMBEDDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the combined minimum size from the child [godot.Control] nodes of the window.
   */
  public open fun getContentsMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENTS_MINIMUM_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   *
   */
  public open fun setUseFontOversampling(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_USE_FONT_OVERSAMPLING,
        NIL)
  }

  /**
   *
   */
  public open fun isUsingFontOversampling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_USING_FONT_OVERSAMPLING,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun childControlsChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CHILD_CONTROLS_CHANGED, NIL)
  }

  /**
   *
   */
  public open fun getThemeIcon(name: StringName, themeType: StringName = StringName("")):
      Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   *
   */
  public open fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")):
      StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns the [godot.Font] at `name` if the theme has `theme_type`.
   */
  public open fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns the font size at `name` if the theme has `theme_type`.
   */
  public open fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   *
   */
  public open fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.Font] with `name` is in `theme_type`.
   *
   * Returns `false` if the theme does not have `theme_type`.
   */
  public open fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if font size with `name` is in `theme_type`.
   *
   * Returns `false` if the theme does not have `theme_type`.
   */
  public open fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT_SIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun getThemeDefaultBaseScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_BASE_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public open fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   *
   */
  public open fun getThemeDefaultFontSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT_SIZE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets layout direction and text writing direction. Right-to-left layouts are necessary for certain languages (e.g. Arabic and Hebrew).
   */
  public open fun setLayoutDirection(direction: Window.LayoutDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_LAYOUT_DIRECTION, NIL)
  }

  /**
   * Returns layout direction and text writing direction.
   */
  public open fun getLayoutDirection(): Window.LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_LAYOUT_DIRECTION, LONG)
    return Window.LayoutDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if layout is right-to-left.
   */
  public open fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_LAYOUT_RTL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun popup(rect: Rect2i = Rect2i(0.0, 0.0, 0.0, 0.0)): Unit {
    TransferContext.writeArguments(RECT2I to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP, NIL)
  }

  /**
   *
   */
  public open fun popupOnParent(parentRect: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to parentRect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_ON_PARENT, NIL)
  }

  /**
   *
   */
  public open fun popupCenteredRatio(ratio: Double = 0.8): Unit {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_RATIO, NIL)
  }

  /**
   *
   */
  public open fun popupCentered(minsize: Vector2i = Vector2i(0.0, 0.0)): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED, NIL)
  }

  /**
   *
   */
  public open fun popupCenteredClamped(minsize: Vector2i = Vector2i(0.0, 0.0), fallbackRatio: Double
      = 0.75): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize, DOUBLE to fallbackRatio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_CLAMPED, NIL)
  }

  public enum class ContentScaleAspect(
    id: Long
  ) {
    /**
     *
     */
    CONTENT_SCALE_ASPECT_IGNORE(0),
    /**
     *
     */
    CONTENT_SCALE_ASPECT_KEEP(1),
    /**
     *
     */
    CONTENT_SCALE_ASPECT_KEEP_WIDTH(2),
    /**
     *
     */
    CONTENT_SCALE_ASPECT_KEEP_HEIGHT(3),
    /**
     *
     */
    CONTENT_SCALE_ASPECT_EXPAND(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Flags(
    id: Long
  ) {
    /**
     * The window's ability to be resized.
     */
    FLAG_RESIZE_DISABLED(0),
    /**
     * Borderless window.
     */
    FLAG_BORDERLESS(1),
    /**
     * Flag for making the window always on top of all other windows.
     */
    FLAG_ALWAYS_ON_TOP(2),
    /**
     *
     */
    FLAG_TRANSPARENT(3),
    /**
     *
     */
    FLAG_NO_FOCUS(4),
    /**
     *
     */
    FLAG_POPUP(5),
    /**
     *
     */
    FLAG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * Windowed mode.
     */
    MODE_WINDOWED(0),
    /**
     * Minimized window mode.
     */
    MODE_MINIMIZED(1),
    /**
     * Maximized window mode.
     */
    MODE_MAXIMIZED(2),
    /**
     * Fullscreen window mode. Note that this is not *exclusive* fullscreen. On Windows and Linux, a borderless window is used to emulate fullscreen. On macOS, a new desktop is used to display the running project.
     *
     * Regardless of the platform, enabling fullscreen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling fullscreen mode.
     */
    MODE_FULLSCREEN(3),
    /**
     * Exclusive fullscreen window mode. This mode is implemented on Windows only. On other platforms, it is equivalent to [MODE_FULLSCREEN].
     *
     * Only one window in exclusive fullscreen mode can be visible on a given screen at a time. If multiple windows are in exclusive fullscreen mode for the same screen, the last one being set to this mode takes precedence.
     *
     * Regardless of the platform, enabling fullscreen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling fullscreen mode.
     */
    MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LayoutDirection(
    id: Long
  ) {
    /**
     * Automatic layout direction, determined from the parent window layout direction.
     */
    LAYOUT_DIRECTION_INHERITED(0),
    /**
     * Automatic layout direction, determined from the current locale.
     */
    LAYOUT_DIRECTION_LOCALE(1),
    /**
     * Left-to-right layout direction.
     */
    LAYOUT_DIRECTION_LTR(2),
    /**
     * Right-to-left layout direction.
     */
    LAYOUT_DIRECTION_RTL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ContentScaleMode(
    id: Long
  ) {
    /**
     *
     */
    CONTENT_SCALE_MODE_DISABLED(0),
    /**
     *
     */
    CONTENT_SCALE_MODE_CANVAS_ITEMS(1),
    /**
     *
     */
    CONTENT_SCALE_MODE_VIEWPORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     *
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 30
  }
}
