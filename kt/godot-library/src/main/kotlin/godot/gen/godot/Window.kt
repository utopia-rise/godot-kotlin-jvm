// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
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
   * Emitted when the [godot.Window] is currently focused and receives any input, passing the received event as an argument. The event's position, if present, is in the embedder's coordinate system.
   */
  public val windowInput: Signal1<InputEvent> by signal("event")

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
   * Emitted when the mouse cursor enters the [godot.Window]'s area, regardless if it's currently focused or not.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse cursor exits the [godot.Window]'s area (including when it's hovered over another window on top of this one).
   */
  public val mouseExited: Signal0 by signal()

  /**
   * Emitted when the [godot.Window] gains focus.
   */
  public val focusEntered: Signal0 by signal()

  /**
   * Emitted when the [godot.Window] loses its focus.
   */
  public val focusExited: Signal0 by signal()

  /**
   * Emitted when the [godot.Window]'s close button is pressed or when [popupWindow] is enabled and user clicks outside the window.
   *
   * This signal can be used to handle window closing, e.g. by connecting it to [hide].
   */
  public val closeRequested: Signal0 by signal()

  /**
   * Emitted when a go back request is sent (e.g. pressing the "Back" button on Android), right after [godot.Node.NOTIFICATION_WM_GO_BACK_REQUEST].
   */
  public val goBackRequested: Signal0 by signal()

  /**
   * Emitted when [godot.Window] is made visible or disappears.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Emitted right after [popup] call, before the [godot.Window] appears or does anything.
   */
  public val aboutToPopup: Signal0 by signal()

  /**
   * Emitted when the [NOTIFICATION_THEME_CHANGED] notification is sent.
   */
  public val themeChanged: Signal0 by signal()

  /**
   * Emitted when window title bar decorations are changed, e.g. macOS window enter/exit full screen mode, or extend-to-title flag is changed.
   */
  public val titlebarChanged: Signal0 by signal()

  /**
   *
   */
  public var initialPosition: WindowInitialPosition
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_INITIAL_POSITION, LONG)
      return Window.WindowInitialPosition.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_INITIAL_POSITION, NIL)
    }

  /**
   * The window's title. If the [godot.Window] is non-embedded, title styles set in [godot.Theme] will have no effect.
   */
  public var title: String
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
  public var position: Vector2i
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
  public var size: Vector2i
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
   * **Note:** Fullscreen mode is not exclusive full screen on Windows and Linux.
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MODE, LONG)
      return Window.Mode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MODE, NIL)
    }

  /**
   * The screen the window is currently on.
   */
  public var currentScreen: Long
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
   * $Window.mouse_passthrough_polygon = $Path2D.curve.get_baked_points()
   *
   *
   *
   * # Set region, using Polygon2D node.
   *
   * $Window.mouse_passthrough_polygon = $Polygon2D.polygon
   *
   *
   *
   * # Reset region to default.
   *
   * $Window.mouse_passthrough_polygon = []
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Set region, using Path2D node.
   *
   * GetNode<Window>("Window").MousePassthrough = GetNode<Path2D>("Path2D").Curve.GetBakedPoints();
   *
   *
   *
   * // Set region, using Polygon2D node.
   *
   * GetNode<Window>("Window").MousePassthrough = GetNode<Polygon2D>("Polygon2D").Polygon;
   *
   *
   *
   * // Reset region to default.
   *
   * GetNode<Window>("Window").MousePassthrough = new Vector2[] {};
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** This property is ignored if [mousePassthrough] is set to `true`.
   *
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while on Linux (X11) and macOS it is.
   *
   * **Note:** This property is implemented on Linux (X11), macOS and Windows.
   */
  public var mousePassthroughPolygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WINDOW_GET_MOUSE_PASSTHROUGH_POLYGON, PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WINDOW_SET_MOUSE_PASSTHROUGH_POLYGON, NIL)
    }

  /**
   * If `true`, the window is visible.
   */
  public var visible: Boolean
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
   * If `true`, the window's size will automatically update when a child node is added or removed, ignoring [minSize] if the new size is bigger.
   *
   * If `false`, you need to call [childControlsChanged] manually.
   */
  public var wrapControls: Boolean
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
   * If `true`, the [godot.Window] is transient, i.e. it's considered a child of another [godot.Window]. Transient window is will be destroyed with its transient parent and will return focus to their parent when closed. The transient window is displayed on top of a non-exclusive full-screen parent window. Transient windows can't enter full-screen mode.
   *
   * Note that behavior might be different depending on the platform.
   */
  public var transient: Boolean
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
   * If `true`, the [godot.Window] will be in exclusive mode. Exclusive windows are always on top of their parent and will block all input going to the parent [godot.Window].
   *
   * Needs [transient] enabled to work.
   */
  public var exclusive: Boolean
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
   * If non-zero, the [godot.Window] can't be resized to be smaller than this size.
   *
   * **Note:** This property will be ignored in favor of [getContentsMinimumSize] if [wrapControls] is enabled and if its size is bigger.
   */
  public var minSize: Vector2i
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
   * If non-zero, the [godot.Window] can't be resized to be bigger than this size.
   *
   * **Note:** This property will be ignored if the value is lower than [minSize].
   */
  public var maxSize: Vector2i
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
   * Base size of the content (i.e. nodes that are drawn inside the window). If non-zero, [godot.Window]'s content will be scaled when the window is resized to a different size.
   */
  public var contentScaleSize: Vector2i
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
   * Specifies how the content is scaled when the [godot.Window] is resized.
   */
  public var contentScaleMode: ContentScaleMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_MODE,
          LONG)
      return Window.ContentScaleMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_MODE,
          NIL)
    }

  /**
   * Specifies how the content's aspect behaves when the [godot.Window] is resized. The base aspect is determined by [contentScaleSize].
   */
  public var contentScaleAspect: ContentScaleAspect
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENT_SCALE_ASPECT,
          LONG)
      return Window.ContentScaleAspect.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_CONTENT_SCALE_ASPECT,
          NIL)
    }

  /**
   * Specifies the base scale of [godot.Window]'s content when its [size] is equal to [contentScaleSize].
   */
  public var contentScaleFactor: Double
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
   * Toggles if any text should automatically change to its translated version depending on the current locale.
   */
  public var autoTranslate: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_AUTO_TRANSLATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_AUTO_TRANSLATE, NIL)
    }

  /**
   * The [godot.Theme] resource this node and all its [godot.Control] and [godot.Window] children use. If a child node has its own [godot.Theme] resource set, theme items are merged with child's definitions having higher priority.
   *
   * **Note:** [godot.Window] styles will have no effect unless the window is embedded.
   */
  public var theme: Theme?
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
   * The name of a theme type variation used by this [godot.Window] to look up its own theme items. See [godot.Control.themeTypeVariation] for more details.
   */
  public var themeTypeVariation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_TYPE_VARIATION,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_THEME_TYPE_VARIATION,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WINDOW, scriptIndex)
    return true
  }

  /**
   * Resets the size to the minimum size, which is the max of [minSize] and (if [wrapControls] is enabled) [getContentsMinimumSize]. This is equivalent to calling `set_size(Vector2i())` (or any size below the minimum).
   */
  public fun resetSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_RESET_SIZE, NIL)
  }

  /**
   * Returns the window's position including its border.
   */
  public fun getPositionWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WINDOW_GET_POSITION_WITH_DECORATIONS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the window's size including its border.
   */
  public fun getSizeWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_SIZE_WITH_DECORATIONS,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets a specified window flag.
   */
  public fun setFlag(flag: Flags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_FLAG, NIL)
  }

  /**
   * Returns `true` if the [flag] is set.
   */
  public fun getFlag(flag: Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window can be maximized (the maximize button is enabled).
   */
  public fun isMaximizeAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_MAXIMIZE_ALLOWED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Tells the OS that the [godot.Window] needs an attention. This makes the window stand out in some way depending on the system, e.g. it might blink on the task bar.
   */
  public fun requestAttention(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REQUEST_ATTENTION, NIL)
  }

  /**
   * Moves the [godot.Window] on top of other windows and focuses it.
   */
  public fun moveToForeground(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_MOVE_TO_FOREGROUND, NIL)
  }

  /**
   * Hides the window. This is not the same as minimized state. Hidden window can't be interacted with and needs to be made visible with [show].
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HIDE, NIL)
  }

  /**
   * Makes the [godot.Window] appear. This enables interactions with the [godot.Window] and doesn't change any of its property other than visibility (unlike e.g. [popup]).
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SHOW, NIL)
  }

  /**
   * Returns whether the window is being drawn to the screen.
   */
  public fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window is focused.
   */
  public fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Causes the window to grab focus, allowing it to receive user input.
   */
  public fun grabFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GRAB_FOCUS, NIL)
  }

  /**
   * If [active] is `true`, enables system's native IME (Input Method Editor).
   */
  public fun setImeActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_ACTIVE, NIL)
  }

  /**
   * Moves IME to the given position.
   */
  public fun setImePosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_IME_POSITION, NIL)
  }

  /**
   * Returns `true` if the window is currently embedded in another window.
   */
  public fun isEmbedded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_EMBEDDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the combined minimum size from the child [godot.Control] nodes of the window. Use [childControlsChanged] to update it when children nodes have changed.
   */
  public fun getContentsMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_CONTENTS_MINIMUM_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Enables font oversampling. This makes fonts look better when they are scaled up.
   */
  public fun setUseFontOversampling(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_USE_FONT_OVERSAMPLING,
        NIL)
  }

  /**
   * Returns `true` if font oversampling is enabled. See [setUseFontOversampling].
   */
  public fun isUsingFontOversampling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_USING_FONT_OVERSAMPLING,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Requests an update of the [godot.Window] size to fit underlying [godot.Control] nodes.
   */
  public fun childControlsChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_CHILD_CONTROLS_CHANGED, NIL)
  }

  /**
   * Prevents `*_theme_*_override` methods from emitting [NOTIFICATION_THEME_CHANGED] until [endBulkThemeOverride] is called.
   */
  public fun beginBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_BEGIN_BULK_THEME_OVERRIDE,
        NIL)
  }

  /**
   * Ends a bulk theme override update. See [beginBulkThemeOverride].
   */
  public fun endBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_END_BULK_THEME_OVERRIDE, NIL)
  }

  /**
   * Creates a local override for a theme icon with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeIconOverride].
   *
   * See also [getThemeIcon].
   */
  public fun addThemeIconOverride(name: StringName, texture: Texture2D): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_ICON_OVERRIDE, NIL)
  }

  /**
   * Creates a local override for a theme [godot.StyleBox] with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeStyleboxOverride].
   *
   * See also [getThemeStylebox] and [godot.Control.addThemeStyleboxOverride] for more details.
   */
  public fun addThemeStyleboxOverride(name: StringName, stylebox: StyleBox): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_STYLEBOX_OVERRIDE,
        NIL)
  }

  /**
   * Creates a local override for a theme [godot.Font] with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeFontOverride].
   *
   * See also [getThemeFont].
   */
  public fun addThemeFontOverride(name: StringName, font: Font): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_FONT_OVERRIDE, NIL)
  }

  /**
   * Creates a local override for a theme font size with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeFontSizeOverride].
   *
   * See also [getThemeFontSize].
   */
  public fun addThemeFontSizeOverride(name: StringName, fontSize: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_FONT_SIZE_OVERRIDE,
        NIL)
  }

  /**
   * Creates a local override for a theme [godot.core.Color] with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeColorOverride].
   *
   * See also [getThemeColor] and [godot.Control.addThemeColorOverride] for more details.
   */
  public fun addThemeColorOverride(name: StringName, color: Color): Unit {
    TransferContext.writeArguments(STRING_NAME to name, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_COLOR_OVERRIDE,
        NIL)
  }

  /**
   * Creates a local override for a theme constant with the specified [name]. Local overrides always take precedence when fetching theme items for the control. An override can be removed with [removeThemeConstantOverride].
   *
   * See also [getThemeConstant].
   */
  public fun addThemeConstantOverride(name: StringName, constant: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_ADD_THEME_CONSTANT_OVERRIDE,
        NIL)
  }

  /**
   * Removes a local override for a theme icon with the specified [name] previously added by [addThemeIconOverride] or via the Inspector dock.
   */
  public fun removeThemeIconOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_ICON_OVERRIDE,
        NIL)
  }

  /**
   * Removes a local override for a theme [godot.StyleBox] with the specified [name] previously added by [addThemeStyleboxOverride] or via the Inspector dock.
   */
  public fun removeThemeStyleboxOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_STYLEBOX_OVERRIDE, NIL)
  }

  /**
   * Removes a local override for a theme [godot.Font] with the specified [name] previously added by [addThemeFontOverride] or via the Inspector dock.
   */
  public fun removeThemeFontOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_FONT_OVERRIDE,
        NIL)
  }

  /**
   * Removes a local override for a theme font size with the specified [name] previously added by [addThemeFontSizeOverride] or via the Inspector dock.
   */
  public fun removeThemeFontSizeOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_FONT_SIZE_OVERRIDE, NIL)
  }

  /**
   * Removes a local override for a theme [godot.core.Color] with the specified [name] previously added by [addThemeColorOverride] or via the Inspector dock.
   */
  public fun removeThemeColorOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_COLOR_OVERRIDE,
        NIL)
  }

  /**
   * Removes a local override for a theme constant with the specified [name] previously added by [addThemeConstantOverride] or via the Inspector dock.
   */
  public fun removeThemeConstantOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WINDOW_REMOVE_THEME_CONSTANT_OVERRIDE, NIL)
  }

  /**
   * Returns an icon from the first matching [godot.Theme] in the tree if that [godot.Theme] has an icon item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeIcon(name: StringName, themeType: StringName = StringName("")): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns a [godot.StyleBox] from the first matching [godot.Theme] in the tree if that [godot.Theme] has a stylebox item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns a [godot.Font] from the first matching [godot.Theme] in the tree if that [godot.Theme] has a font item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns a font size from the first matching [godot.Theme] in the tree if that [godot.Theme] has a font size item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_FONT_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.core.Color] from the first matching [godot.Theme] in the tree if that [godot.Theme] has a color item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns a constant from the first matching [godot.Theme] in the tree if that [godot.Theme] has a constant item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for more details.
   */
  public fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Long {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if there is a local override for a theme icon with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeIconOverride].
   */
  public fun hasThemeIconOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_ICON_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a local override for a theme [godot.StyleBox] with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeStyleboxOverride].
   */
  public fun hasThemeStyleboxOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_STYLEBOX_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a local override for a theme [godot.Font] with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeFontOverride].
   */
  public fun hasThemeFontOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a local override for a theme font size with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeFontSizeOverride].
   */
  public fun hasThemeFontSizeOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT_SIZE_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a local override for a theme [godot.core.Color] with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeColorOverride].
   */
  public fun hasThemeColorOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_COLOR_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a local override for a theme constant with the specified [name] in this [godot.Control] node.
   *
   * See [addThemeConstantOverride].
   */
  public fun hasThemeConstantOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_CONSTANT_OVERRIDE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has an icon item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has a stylebox item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has a font item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has a font size item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_FONT_SIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has a color item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a matching [godot.Theme] in the tree that has a constant item with the specified [name] and [themeType].
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_HAS_THEME_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default base scale value from the first matching [godot.Theme] in the tree if that [godot.Theme] has a valid [godot.Theme.defaultBaseScale] value.
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeDefaultBaseScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_BASE_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the default font from the first matching [godot.Theme] in the tree if that [godot.Theme] has a valid [godot.Theme.defaultFont] value.
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns the default font size value from the first matching [godot.Theme] in the tree if that [godot.Theme] has a valid [godot.Theme.defaultFontSize] value.
   *
   * See [godot.Control.getThemeColor] for details.
   */
  public fun getThemeDefaultFontSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_THEME_DEFAULT_FONT_SIZE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets layout direction and text writing direction. Right-to-left layouts are necessary for certain languages (e.g. Arabic and Hebrew).
   */
  public fun setLayoutDirection(direction: LayoutDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_SET_LAYOUT_DIRECTION, NIL)
  }

  /**
   * Returns layout direction and text writing direction.
   */
  public fun getLayoutDirection(): LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_GET_LAYOUT_DIRECTION, LONG)
    return Window.LayoutDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if layout is right-to-left.
   */
  public fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_IS_LAYOUT_RTL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Shows the [godot.Window] and makes it transient (see [transient]). If [rect] is provided, it will be set as the [godot.Window]'s size.
   *
   * Fails if called on the main window.
   */
  public fun popup(rect: Rect2i = Rect2i(0, 0, 0, 0)): Unit {
    TransferContext.writeArguments(RECT2I to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP, NIL)
  }

  /**
   * Popups the [godot.Window] with a position shifted by parent [godot.Window]'s position.
   *
   * If the [godot.Window] is embedded, has the same effect as [popup].
   */
  public fun popupOnParent(parentRect: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to parentRect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_ON_PARENT, NIL)
  }

  /**
   * Popups the [godot.Window] centered inside its parent [godot.Window] and sets its size as a [ratio] of parent's size.
   */
  public fun popupCenteredRatio(ratio: Double = 0.8): Unit {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_RATIO, NIL)
  }

  /**
   * Popups the [godot.Window] at the center of the current screen, with optionally given minimum size.
   *
   * If the [godot.Window] is embedded, it will be centered in the parent [godot.Viewport] instead.
   */
  public fun popupCentered(minsize: Vector2i = Vector2i(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED, NIL)
  }

  /**
   * Popups the [godot.Window] centered inside its parent [godot.Window].
   *
   * `fallback_ratio` determines the maximum size of the [godot.Window], in relation to its parent.
   */
  public fun popupCenteredClamped(minsize: Vector2i = Vector2i(0, 0), fallbackRatio: Double = 0.75):
      Unit {
    TransferContext.writeArguments(VECTOR2I to minsize, DOUBLE to fallbackRatio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WINDOW_POPUP_CENTERED_CLAMPED, NIL)
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * Windowed mode, i.e. [godot.Window] doesn't occupy the whole screen (unless set to the size of the screen).
     */
    MODE_WINDOWED(0),
    /**
     * Minimized window mode, i.e. [godot.Window] is not visible and available on window manager's window list. Normally happens when the minimize button is pressed.
     */
    MODE_MINIMIZED(1),
    /**
     * Maximized window mode, i.e. [godot.Window] will occupy whole screen area except task bar and still display its borders. Normally happens when the maximize button is pressed.
     */
    MODE_MAXIMIZED(2),
    /**
     * Full screen window mode. Note that this is not *exclusive* full screen. On Windows and Linux, a borderless window is used to emulate full screen. On macOS, a new desktop is used to display the running project.
     *
     * Regardless of the platform, enabling full screen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling full screen mode.
     */
    MODE_FULLSCREEN(3),
    /**
     * Exclusive full screen window mode. This mode is implemented on Windows only. On other platforms, it is equivalent to [MODE_FULLSCREEN].
     *
     * Only one window in exclusive full screen mode can be visible on a given screen at a time. If multiple windows are in exclusive full screen mode for the same screen, the last one being set to this mode takes precedence.
     *
     * Regardless of the platform, enabling full screen will change the window size to match the monitor's size. Therefore, make sure your project supports [multiple resolutions]($DOCS_URL/tutorials/rendering/multiple_resolutions.html) when enabling full screen mode.
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

  public enum class Flags(
    id: Long
  ) {
    /**
     * The window can't be resizing by dragging its resize grip. It's still possible to resize the window using [size]. This flag is ignored for full screen windows. Set with [unresizable].
     */
    FLAG_RESIZE_DISABLED(0),
    /**
     * The window do not have native title bar and other decorations. This flag is ignored for full-screen windows. Set with [borderless].
     */
    FLAG_BORDERLESS(1),
    /**
     * The window is floating on top of all other windows. This flag is ignored for full-screen windows. Set with [alwaysOnTop].
     */
    FLAG_ALWAYS_ON_TOP(2),
    /**
     * The window background can be transparent.
     *
     * **Note:** This flag has no effect if [godot.ProjectSettings.display/window/perPixelTransparency/allowed] is set to `false`. Set with [transparent].
     */
    FLAG_TRANSPARENT(3),
    /**
     * The window can't be focused. No-focus window will ignore all input, except mouse clicks. Set with [unfocusable].
     */
    FLAG_NO_FOCUS(4),
    /**
     * Window is part of menu or [godot.OptionButton] dropdown. This flag can't be changed when the window is visible. An active popup window will exclusively receive all input, without stealing focus from its parent. Popup windows are automatically closed when uses click outside it, or when an application is switched. Popup window must have `transient parent` set (see [transient]).
     */
    FLAG_POPUP(5),
    /**
     * Window content is expanded to the full size of the window. Unlike borderless window, the frame is left intact and can be used to resize the window, title bar is transparent, but have minimize/maximize/close buttons. Set with [extendToTitle].
     *
     * **Note:** This flag is implemented on macOS.
     */
    FLAG_EXTEND_TO_TITLE(6),
    /**
     * All mouse events are passed to the underlying window of the same application.
     */
    FLAG_MOUSE_PASSTHROUGH(7),
    /**
     * Max value of the [enum Flags].
     */
    FLAG_MAX(8),
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

  public enum class WindowInitialPosition(
    id: Long
  ) {
    /**
     *
     */
    WINDOW_INITIAL_POSITION_ABSOLUTE(0),
    /**
     *
     */
    WINDOW_INITIAL_POSITION_CENTER_SCREEN(1),
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

    /**
     * Sent when the node needs to refresh its theme items. This happens in one of the following cases:
     *
     * - The [theme] property is changed on this node or any of its ancestors.
     *
     * - The [themeTypeVariation] property is changed on this node.
     *
     * - The node enters the scene tree.
     *
     * **Note:** As an optimization, this notification won't be sent from changes that occur while this node is outside of the scene tree. Instead, all of the theme item updates can be applied at once when the node enters the scene tree.
     */
    public final const val NOTIFICATION_THEME_CHANGED: Long = 32
  }
}
