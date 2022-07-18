// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * A node that creates a window. The window can either be a native system window or embedded inside another [godot.Window] (see [godot.Viewport.guiEmbedSubwindows]).
 *
 * At runtime, [godot.Window]s will not close automatically when requested. You need to handle it manually using [closeRequested] (this applies both to clicking close button and clicking outside popup).
 */
@GodotBaseType
public open class Window : Viewport() {
  /**
   * Emitted when the mouse cursor exits the [godot.Window]'s area (including when it's hovered over another window on top of this one).
   */
  public val mouseExited: Signal0 by signal()

  /**
   * Emitted when the [theme] is modified or changed to another [godot.Theme].
   */
  public val themeChanged: Signal0 by signal()

  /**
   * Emitted when the [godot.Window] gains focus.
   */
  public val focusEntered: Signal0 by signal()

  /**
   * Emitted when a go back request is sent (e.g. pressing the "Back" button on Android), right after [godot.Node.NOTIFICATION_WM_GO_BACK_REQUEST].
   */
  public val goBackRequested: Signal0 by signal()

  /**
   * Emitted when the [godot.Window]'s close button is pressed or when [popupWindow] is enabled and user clicks outside the window.
   *
   * This signal can be used to handle window closing, e.g. by connecting it to [hide].
   */
  public val closeRequested: Signal0 by signal()

  /**
   * Emitted when the mouse cursor enters the [godot.Window]'s area, regardless if it's currently focused or not.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the [godot.Window] is currently focused and receives any input, passing the received event as an argument.
   */
  public val windowInput: Signal1<InputEvent> by signal("event")

  /**
   * Emitted right after [popup] call, before the [godot.Window] appears or does anything.
   */
  public val aboutToPopup: Signal0 by signal()

  /**
   * Emitted when files are dragged from the OS file manager and dropped in the game window. The argument is a list of file paths.
   *
   * Note that this method only works with non-embedded windows, i.e. the main window and [godot.Window]-derived nodes when [godot.Viewport.guiEmbedSubwindows] is disabled in the main viewport.
   *
   * Example usage:
   *
   * ```
   * 				func _ready():
   * 				    get_viewport().files_dropped.connect(on_files_dropped)
   *
   * 				func on_files_dropped(files):
   * 				    print(files)
   * 				```
   */
  public val filesDropped: Signal1<PackedStringArray> by signal("files")

  /**
   * Emitted when [godot.Window] is made visible or disappears.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Emitted when the [godot.Window] loses its focus.
   */
  public val focusExited: Signal0 by signal()

  /**
   * The window's title. If the [godot.Window] is non-embedded, title styles set in [godot.Theme] will have no effect.
   */
  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_TITLE, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_TITLE, NIL.ordinal)
    }

  /**
   * The window's position in pixels.
   */
  public var position: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_POSITION, VECTOR2I.ordinal)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_POSITION, NIL.ordinal)
    }

  /**
   * The window's size in pixels.
   */
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_SIZE, VECTOR2I.ordinal)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_SIZE, NIL.ordinal)
    }

  /**
   * Set's the window's current mode.
   *
   * **Note:** Fullscreen mode is not exclusive fullscreen on Windows and Linux.
   */
  public var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MODE, NIL.ordinal)
    }

  /**
   * The screen the window is currently on.
   */
  public var currentScreen: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CURRENT_SCREEN,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CURRENT_SCREEN, NIL.ordinal)
    }

  /**
   * If `true`, the window is visible.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_VISIBLE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_VISIBLE, NIL.ordinal)
    }

  /**
   * If `true`, the window's size will automatically update when a child node is added or removed.
   *
   * If `false`, you need to call [childControlsChanged] manually.
   */
  public var wrapControls: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_WRAPPING_CONTROLS,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_WRAP_CONTROLS, NIL.ordinal)
    }

  /**
   * If `true`, the [godot.Window] is transient, i.e. it's considered a child of another [godot.Window]. Transient windows can't be in fullscreen mode and will return focus to their parent when closed.
   *
   * Note that behavior might be different depending on the platform.
   */
  public var transient: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_TRANSIENT, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_TRANSIENT, NIL.ordinal)
    }

  /**
   * If `true`, the [godot.Window] will be in exclusive mode. Exclusive windows are always on top of their parent and will block all input going to the parent [godot.Window].
   *
   * Needs [transient] enabled to work.
   */
  public var exclusive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_EXCLUSIVE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_EXCLUSIVE, NIL.ordinal)
    }

  /**
   * If non-zero, the [godot.Window] can't be resized to be smaller than this size.
   */
  public var minSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MIN_SIZE, VECTOR2I.ordinal)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MIN_SIZE, NIL.ordinal)
    }

  /**
   * If non-zero, the [godot.Window] can't be resized to be bigger than this size.
   */
  public var maxSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MAX_SIZE, VECTOR2I.ordinal)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MAX_SIZE, NIL.ordinal)
    }

  /**
   * Base size of the content (i.e. nodes that are drawn inside the window). If non-zero, [godot.Window]'s content will be scaled when the window is resized to a different size.
   */
  public var contentScaleSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_SIZE,
          VECTOR2I.ordinal)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_SIZE,
          NIL.ordinal)
    }

  /**
   * Specifies how the content is scaled when the [godot.Window] is resized.
   */
  public var contentScaleMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_MODE,
          NIL.ordinal)
    }

  /**
   * Specifies how the content's aspect behaves when the [godot.Window] is resized. The base aspect is determined by [contentScaleSize].
   */
  public var contentScaleAspect: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_ASPECT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_ASPECT,
          NIL.ordinal)
    }

  /**
   * Specifies the base scale of [godot.Window]'s content when its [size] is equal to [contentScaleSize].
   */
  public var contentScaleFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_FACTOR,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_FACTOR,
          NIL.ordinal)
    }

  /**
   * The [godot.Theme] resource that determines the style of the underlying [godot.Control] nodes.
   *
   * [godot.Window] styles will have no effect unless the window is embedded.
   */
  public var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Theme?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_THEME, NIL.ordinal)
    }

  /**
   * The name of a theme type variation used by this [godot.Window] to look up its own theme items. See [godot.Control.themeTypeVariation] for more details.
   */
  public var themeTypeVariation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_TYPE_VARIATION,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_THEME_TYPE_VARIATION,
          NIL.ordinal)
    }

  /**
   * Toggles if any text should automatically change to its translated version depending on the current locale.
   */
  public var autoTranslate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_AUTO_TRANSLATING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_AUTO_TRANSLATE, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WINDOW)
  }

  /**
   * Resets the size to the minimum size, which is the max of [minSize] and (if [wrapControls] is enabled) [getContentsMinimumSize]. This is equivalent to calling `set_size(Vector2i())` (or any size below the minimum).
   */
  public fun resetSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_RESET_SIZE, NIL.ordinal)
  }

  /**
   * Returns the window's size including its border.
   */
  public fun getRealSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_REAL_SIZE, VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets a specified window flag.
   */
  public fun setFlag(flag: Window.Flags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_FLAG, NIL.ordinal)
  }

  /**
   * Returns `true` if the flag is set.
   */
  public fun getFlag(flag: Window.Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_FLAG, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window can be maximized (the maximize button is enabled).
   */
  public fun isMaximizeAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_MAXIMIZE_ALLOWED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Tells the OS that the [godot.Window] needs an attention. This makes the window stand out in some way depending on the system, e.g. it might blink on the task bar.
   */
  public fun requestAttention(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REQUEST_ATTENTION, NIL.ordinal)
  }

  /**
   * Moves the [godot.Window] on top of other windows and focuses it.
   */
  public fun moveToForeground(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_MOVE_TO_FOREGROUND, NIL.ordinal)
  }

  /**
   * Hides the window. This is not the same as minimized state. Hidden window can't be interacted with and needs to be made visible with [show].
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HIDE, NIL.ordinal)
  }

  /**
   * Makes the [godot.Window] appear. This enables interactions with the [godot.Window] and doesn't change any of its property other than visibility (unlike e.g. [popup]).
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SHOW, NIL.ordinal)
  }

  /**
   * Returns whether the window is being drawn to the screen.
   */
  public fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CAN_DRAW, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window is focused.
   */
  public fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_FOCUS, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Causes the window to grab focus, allowing it to receive user input.
   */
  public fun grabFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GRAB_FOCUS, NIL.ordinal)
  }

  /**
   * If `active` is `true`, enables system's native IME (Input Method Editor).
   */
  public fun setImeActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_ACTIVE, NIL.ordinal)
  }

  /**
   * Moves IME to the given position.
   */
  public fun setImePosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_POSITION, NIL.ordinal)
  }

  /**
   * Returns `true` if the window is currently embedded in another window.
   */
  public fun isEmbedded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_EMBEDDED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the combined minimum size from the child [godot.Control] nodes of the window. Use [childControlsChanged] to update it when children nodes have changed.
   */
  public fun getContentsMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENTS_MINIMUM_SIZE,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Enables font oversampling. This makes fonts look better when they are scaled up.
   */
  public fun setUseFontOversampling(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_USE_FONT_OVERSAMPLING,
        NIL.ordinal)
  }

  /**
   * Returns `true` if font oversampling is enabled. See [setUseFontOversampling].
   */
  public fun isUsingFontOversampling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_USING_FONT_OVERSAMPLING,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Requests an update of the [godot.Window] size to fit underlying [godot.Control] nodes.
   */
  public fun childControlsChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CHILD_CONTROLS_CHANGED,
        NIL.ordinal)
  }

  /**
   * Returns the icon at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeIcon(name: StringName, themeType: StringName = StringName("")): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_ICON, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns the [godot.StyleBox] at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_STYLEBOX,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns the [godot.Font] at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns the font size at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT_SIZE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_COLOR, COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the constant at `name` if the theme has `theme_type`.
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_CONSTANT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if icon with `name` is in `theme_type`.
   */
  public fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_ICON, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.StyleBox] with `name` is in `theme_type`.
   */
  public fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_STYLEBOX, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.Font] with `name` is in `theme_type`.
   */
  public fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if font size with `name` is in `theme_type`.
   */
  public fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT_SIZE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.core.Color] with `name` is in `theme_type`.
   */
  public fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_COLOR, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if constant with `name` is in `theme_type`.
   */
  public fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_CONSTANT, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default base scale defined in the attached [godot.Theme].
   *
   * See [godot.Theme.defaultBaseScale] for more details.
   */
  public fun getThemeDefaultBaseScale(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_BASE_SCALE,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the default [godot.Font] defined in the attached [godot.Theme].
   *
   * See [godot.Theme.defaultFont] for more details.
   */
  public fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns the default font size defined in the attached [godot.Theme].
   *
   * See [godot.Theme.defaultFontSize] for more details.
   */
  public fun getThemeDefaultFontSize(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT_SIZE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets layout direction and text writing direction. Right-to-left layouts are necessary for certain languages (e.g. Arabic and Hebrew).
   */
  public fun setLayoutDirection(direction: Window.LayoutDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_LAYOUT_DIRECTION, NIL.ordinal)
  }

  /**
   * Returns layout direction and text writing direction.
   */
  public fun getLayoutDirection(): Window.LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_LAYOUT_DIRECTION,
        LONG.ordinal)
    return Window.LayoutDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if layout is right-to-left.
   */
  public fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_LAYOUT_RTL, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Shows the [godot.Window] and makes it transient (see [transient]). If `rect` is provided, it will be set as the [godot.Window]'s size.
   *
   * Fails if called on the main window.
   */
  public fun popup(rect: Rect2i = Rect2i(0, 0, 0, 0)): Unit {
    TransferContext.writeArguments(RECT2I to rect)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP, NIL.ordinal)
  }

  /**
   * Popups the [godot.Window] with a position shifted by parent [godot.Window]'s position.
   *
   * If the [godot.Window] is embedded, has the same effect as [popup].
   */
  public fun popupOnParent(parentRect: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to parentRect)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_ON_PARENT, NIL.ordinal)
  }

  /**
   * Popups the [godot.Window] centered inside its parent [godot.Window] and sets its size as a `ratio` of parent's size.
   */
  public fun popupCenteredRatio(ratio: Double = 0.8): Unit {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_RATIO, NIL.ordinal)
  }

  /**
   * Popups the [godot.Window] at the center of the current screen, with optionally given minimum size.
   *
   * If the [godot.Window] is embedded, it will be centered in the parent [godot.Viewport] instead.
   */
  public fun popupCentered(minsize: Vector2i = Vector2i(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED, NIL.ordinal)
  }

  /**
   * Popups the [godot.Window] centered inside its parent [godot.Window].
   *
   * `fallback_ratio` determines the maximum size of the [godot.Window], in relation to its parent.
   */
  public fun popupCenteredClamped(minsize: Vector2i = Vector2i(0, 0), fallbackRatio: Double = 0.75):
      Unit {
    TransferContext.writeArguments(VECTOR2I to minsize, DOUBLE to fallbackRatio)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_CLAMPED,
        NIL.ordinal)
  }

  public enum class ContentScaleAspect(
    id: Long
  ) {
    /**
     * The aspect will be ignored. Scaling will simply stretch the content to fit the target size.
     */
    CONTENT_SCALE_ASPECT_IGNORE(0),
    /**
     * The content's aspect will be preserved. If the target size has different aspect from the base one, the image will be centered and black bars will appear on left and right sides.
     */
    CONTENT_SCALE_ASPECT_KEEP(1),
    /**
     * The content can be expanded vertically. Scaling horizontally will result in keeping the width ratio and then black bars on left and right sides.
     */
    CONTENT_SCALE_ASPECT_KEEP_WIDTH(2),
    /**
     * The content can be expanded horizontally. Scaling vertically will result in keeping the height ratio and then black bars on top and bottom sides.
     */
    CONTENT_SCALE_ASPECT_KEEP_HEIGHT(3),
    /**
     * The content's aspect will be preserved. If the target size has different aspect from the base one, the content will stay in the to-left corner and add an extra visible area in the stretched space.
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
     * The window's ability to be resized. Set with [unresizable].
     */
    FLAG_RESIZE_DISABLED(0),
    /**
     * Borderless window. Set with [borderless].
     */
    FLAG_BORDERLESS(1),
    /**
     * Flag for making the window always on top of all other windows. Set with [alwaysOnTop].
     */
    FLAG_ALWAYS_ON_TOP(2),
    /**
     * Flag for per-pixel transparency. Set with [transparent].
     */
    FLAG_TRANSPARENT(3),
    /**
     * The window's ability to gain focus. Set with [unfocusable].
     */
    FLAG_NO_FOCUS(4),
    /**
     * Whether the window is popup or a regular window. Set with [popupWindow].
     */
    FLAG_POPUP(5),
    /**
     * Max value of the [enum Flags].
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
     * Windowed mode, i.e. [godot.Window] doesn't occupy whole screen (unless set to the size of the screen).
     */
    MODE_WINDOWED(0),
    /**
     * Minimized window mode, i.e. [godot.Window] is not visible and available on window manager's window list. Normally happens when the minimize button is presesd.
     */
    MODE_MINIMIZED(1),
    /**
     * Maximized window mode, i.e. [godot.Window] will occupy whole screen area except task bar and still display its borders. Normally happens when the minimize button is presesd.
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
     * The content will not be scaled to match the [godot.Window]'s size.
     */
    CONTENT_SCALE_MODE_DISABLED(0),
    /**
     * The content will be rendered at the target size. This is more performance-expensive than [CONTENT_SCALE_MODE_VIEWPORT], but provides better results.
     */
    CONTENT_SCALE_MODE_CANVAS_ITEMS(1),
    /**
     * The content will be rendered at the base size and then scaled to the target size. More performant than [CONTENT_SCALE_MODE_CANVAS_ITEMS], but results in pixelated image.
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
     * Emitted when [godot.Window]'s visibility changes, right before [visibilityChanged].
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 30
  }
}
