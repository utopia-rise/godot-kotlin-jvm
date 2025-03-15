// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.Signal0
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A node that creates a window. The window can either be a native system window or embedded inside
 * another [Window] (see [Viewport.guiEmbedSubwindows]).
 * At runtime, [Window]s will not close automatically when requested. You need to handle it manually
 * using the [signal close_requested] signal (this applies both to pressing the close button and
 * clicking outside of a popup).
 */
@GodotBaseType
public open class Window : Viewport() {
  /**
   * Emitted when the [Window] is currently focused and receives any input, passing the received
   * event as an argument. The event's position, if present, is in the embedder's coordinate system.
   */
  public val windowInput: Signal1<InputEvent> by Signal1

  /**
   * Emitted when files are dragged from the OS file manager and dropped in the game window. The
   * argument is a list of file paths.
   * [codeblock]
   * func _ready():
   *     get_window().files_dropped.connect(on_files_dropped)
   *
   * func on_files_dropped(files):
   *     print(files)
   * [/codeblock]
   * **Note:** This signal only works with native windows, i.e. the main window and [Window]-derived
   * nodes when [Viewport.guiEmbedSubwindows] is disabled in the main viewport.
   */
  public val filesDropped: Signal1<PackedStringArray> by Signal1

  /**
   * Emitted when the mouse cursor enters the [Window]'s visible area, that is not occluded behind
   * other [Control]s or windows, provided its [Viewport.guiDisableInput] is `false` and regardless if
   * it's currently focused or not.
   */
  public val mouseEntered: Signal0 by Signal0

  /**
   * Emitted when the mouse cursor leaves the [Window]'s visible area, that is not occluded behind
   * other [Control]s or windows, provided its [Viewport.guiDisableInput] is `false` and regardless if
   * it's currently focused or not.
   */
  public val mouseExited: Signal0 by Signal0

  /**
   * Emitted when the [Window] gains focus.
   */
  public val focusEntered: Signal0 by Signal0

  /**
   * Emitted when the [Window] loses its focus.
   */
  public val focusExited: Signal0 by Signal0

  /**
   * Emitted when the [Window]'s close button is pressed or when [popupWindow] is enabled and user
   * clicks outside the window.
   * This signal can be used to handle window closing, e.g. by connecting it to [hide].
   */
  public val closeRequested: Signal0 by Signal0

  /**
   * Emitted when a go back request is sent (e.g. pressing the "Back" button on Android), right
   * after [Node.NOTIFICATION_WM_GO_BACK_REQUEST].
   */
  public val goBackRequested: Signal0 by Signal0

  /**
   * Emitted when [Window] is made visible or disappears.
   */
  public val visibilityChanged: Signal0 by Signal0

  /**
   * Emitted right after [popup] call, before the [Window] appears or does anything.
   */
  public val aboutToPopup: Signal0 by Signal0

  /**
   * Emitted when the [NOTIFICATION_THEME_CHANGED] notification is sent.
   */
  public val themeChanged: Signal0 by Signal0

  /**
   * Emitted when the [Window]'s DPI changes as a result of OS-level changes (e.g. moving the window
   * from a Retina display to a lower resolution one).
   * **Note:** Only implemented on macOS.
   */
  public val dpiChanged: Signal0 by Signal0

  /**
   * Emitted when window title bar decorations are changed, e.g. macOS window enter/exit full screen
   * mode, or extend-to-title flag is changed.
   */
  public val titlebarChanged: Signal0 by Signal0

  /**
   * Emitted when window title bar text is changed.
   */
  public val titleChanged: Signal0 by Signal0

  /**
   * Set's the window's current mode.
   * **Note:** Fullscreen mode is not exclusive full screen on Windows and Linux.
   * **Note:** This method only works with native windows, i.e. the main window and [Window]-derived
   * nodes when [Viewport.guiEmbedSubwindows] is disabled in the main viewport.
   */
  public final inline var mode: Mode
    @JvmName("modeProperty")
    get() = getMode()
    @JvmName("modeProperty")
    set(`value`) {
      setMode(value)
    }

  /**
   * The window's title. If the [Window] is native, title styles set in [Theme] will have no effect.
   */
  public final inline var title: String
    @JvmName("titleProperty")
    get() = getTitle()
    @JvmName("titleProperty")
    set(`value`) {
      setTitle(value)
    }

  /**
   * Specifies the initial type of position for the [Window]. See [WindowInitialPosition] constants.
   */
  public final inline var initialPosition: WindowInitialPosition
    @JvmName("initialPositionProperty")
    get() = getInitialPosition()
    @JvmName("initialPositionProperty")
    set(`value`) {
      setInitialPosition(value)
    }

  /**
   * The window's position in pixels.
   * If [ProjectSettings.display/window/subwindows/embedSubwindows] is `false`, the position is in
   * absolute screen coordinates. This typically applies to editor plugins. If the setting is `true`,
   * the window's position is in the coordinates of its parent [Viewport].
   * **Note:** This property only works if [initialPosition] is set to
   * [WINDOW_INITIAL_POSITION_ABSOLUTE].
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2i
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * The window's size in pixels.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector2i
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The screen the window is currently on.
   */
  public final inline var currentScreen: Int
    @JvmName("currentScreenProperty")
    get() = getCurrentScreen()
    @JvmName("currentScreenProperty")
    set(`value`) {
      setCurrentScreen(value)
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
   * $Window.mouse_passthrough_polygon = $Path2D.curve.get_baked_points()
   *
   * # Set region, using Polygon2D node.
   * $Window.mouse_passthrough_polygon = $Polygon2D.polygon
   *
   * # Reset region to default.
   * $Window.mouse_passthrough_polygon = []
   * ```
   * csharp:
   * ```csharp
   * // Set region, using Path2D node.
   * GetNode<Window>("Window").MousePassthroughPolygon =
   * GetNode<Path2D>("Path2D").Curve.GetBakedPoints();
   *
   * // Set region, using Polygon2D node.
   * GetNode<Window>("Window").MousePassthroughPolygon = GetNode<Polygon2D>("Polygon2D").Polygon;
   *
   * // Reset region to default.
   * GetNode<Window>("Window").MousePassthroughPolygon = [];
   * ```
   *
   * **Note:** This property is ignored if [mousePassthrough] is set to `true`.
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while
   * on Linux (X11) and macOS it is.
   * **Note:** This property is implemented on Linux (X11), macOS and Windows.
   */
  public final inline var mousePassthroughPolygon: PackedVector2Array
    @JvmName("mousePassthroughPolygonProperty")
    get() = getMousePassthroughPolygon()
    @JvmName("mousePassthroughPolygonProperty")
    set(`value`) {
      setMousePassthroughPolygon(value)
    }

  /**
   * If `true`, the window is visible.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  /**
   * If `true`, the window's size will automatically update when a child node is added or removed,
   * ignoring [minSize] if the new size is bigger.
   * If `false`, you need to call [childControlsChanged] manually.
   */
  public final inline var wrapControls: Boolean
    @JvmName("wrapControlsProperty")
    get() = isWrappingControls()
    @JvmName("wrapControlsProperty")
    set(`value`) {
      setWrapControls(value)
    }

  /**
   * If `true`, the [Window] is transient, i.e. it's considered a child of another [Window]. The
   * transient window will be destroyed with its transient parent and will return focus to their parent
   * when closed. The transient window is displayed on top of a non-exclusive full-screen parent
   * window. Transient windows can't enter full-screen mode.
   * Note that behavior might be different depending on the platform.
   */
  public final inline var transient: Boolean
    @JvmName("transientProperty")
    get() = isTransient()
    @JvmName("transientProperty")
    set(`value`) {
      setTransient(value)
    }

  /**
   * If `true`, and the [Window] is [transient], this window will (at the time of becoming visible)
   * become transient to the currently focused window instead of the immediate parent window in the
   * hierarchy. Note that the transient parent is assigned at the time this window becomes visible, so
   * changing it afterwards has no effect until re-shown.
   */
  public final inline var transientToFocused: Boolean
    @JvmName("transientToFocusedProperty")
    get() = isTransientToFocused()
    @JvmName("transientToFocusedProperty")
    set(`value`) {
      setTransientToFocused(value)
    }

  /**
   * If `true`, the [Window] will be in exclusive mode. Exclusive windows are always on top of their
   * parent and will block all input going to the parent [Window].
   * Needs [transient] enabled to work.
   */
  public final inline var exclusive: Boolean
    @JvmName("exclusiveProperty")
    get() = isExclusive()
    @JvmName("exclusiveProperty")
    set(`value`) {
      setExclusive(value)
    }

  /**
   * If `true`, the window can't be resized. Minimize and maximize buttons are disabled.
   */
  public final inline var unresizable: Boolean
    @JvmName("unresizableProperty")
    get() = getFlag(Window.Flags.FLAG_RESIZE_DISABLED)
    @JvmName("unresizableProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_RESIZE_DISABLED, value)
    }

  /**
   * If `true`, the window will have no borders.
   */
  public final inline var borderless: Boolean
    @JvmName("borderlessProperty")
    get() = getFlag(Window.Flags.FLAG_BORDERLESS)
    @JvmName("borderlessProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_BORDERLESS, value)
    }

  /**
   * If `true`, the window will be on top of all other windows. Does not work if [transient] is
   * enabled.
   */
  public final inline var alwaysOnTop: Boolean
    @JvmName("alwaysOnTopProperty")
    get() = getFlag(Window.Flags.FLAG_ALWAYS_ON_TOP)
    @JvmName("alwaysOnTopProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_ALWAYS_ON_TOP, value)
    }

  /**
   * If `true`, the [Window]'s background can be transparent. This is best used with embedded
   * windows.
   * **Note:** Transparency support is implemented on Linux, macOS and Windows, but availability
   * might vary depending on GPU driver, display manager, and compositor capabilities.
   * **Note:** This property has no effect if
   * [ProjectSettings.display/window/perPixelTransparency/allowed] is set to `false`.
   */
  public final inline var transparent: Boolean
    @JvmName("transparentProperty")
    get() = getFlag(Window.Flags.FLAG_TRANSPARENT)
    @JvmName("transparentProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_TRANSPARENT, value)
    }

  /**
   * If `true`, the [Window] can't be focused nor interacted with. It can still be visible.
   */
  public final inline var unfocusable: Boolean
    @JvmName("unfocusableProperty")
    get() = getFlag(Window.Flags.FLAG_NO_FOCUS)
    @JvmName("unfocusableProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_NO_FOCUS, value)
    }

  /**
   * If `true`, the [Window] will be considered a popup. Popups are sub-windows that don't show as
   * separate windows in system's window manager's window list and will send close request when
   * anything is clicked outside of them (unless [exclusive] is enabled).
   */
  public final inline var popupWindow: Boolean
    @JvmName("popupWindowProperty")
    get() = getFlag(Window.Flags.FLAG_POPUP)
    @JvmName("popupWindowProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_POPUP, value)
    }

  /**
   * If `true`, the [Window] contents is expanded to the full size of the window, window title bar
   * is transparent.
   * **Note:** This property is implemented only on macOS.
   * **Note:** This property only works with native windows.
   */
  public final inline var extendToTitle: Boolean
    @JvmName("extendToTitleProperty")
    get() = getFlag(Window.Flags.FLAG_EXTEND_TO_TITLE)
    @JvmName("extendToTitleProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_EXTEND_TO_TITLE, value)
    }

  /**
   * If `true`, all mouse events will be passed to the underlying window of the same application.
   * See also [mousePassthroughPolygon].
   * **Note:** This property is implemented on Linux (X11), macOS and Windows.
   * **Note:** This property only works with native windows.
   */
  public final inline var mousePassthrough: Boolean
    @JvmName("mousePassthroughProperty")
    get() = getFlag(Window.Flags.FLAG_MOUSE_PASSTHROUGH)
    @JvmName("mousePassthroughProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_MOUSE_PASSTHROUGH, value)
    }

  /**
   * If `true`, the [Window] will override the OS window style to display sharp corners.
   * **Note:** This property is implemented only on Windows (11).
   * **Note:** This property only works with native windows.
   */
  public final inline var sharpCorners: Boolean
    @JvmName("sharpCornersProperty")
    get() = getFlag(Window.Flags.FLAG_SHARP_CORNERS)
    @JvmName("sharpCornersProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_SHARP_CORNERS, value)
    }

  /**
   * Windows is excluded from screenshots taken by [DisplayServer.screenGetImage],
   * [DisplayServer.screenGetImageRect], and [DisplayServer.screenGetPixel].
   */
  public final inline var excludeFromCapture: Boolean
    @JvmName("excludeFromCaptureProperty")
    get() = getFlag(Window.Flags.FLAG_EXCLUDE_FROM_CAPTURE)
    @JvmName("excludeFromCaptureProperty")
    set(`value`) {
      setFlag(Window.Flags.FLAG_EXCLUDE_FROM_CAPTURE, value)
    }

  /**
   * If `true`, native window will be used regardless of parent viewport and project settings.
   */
  public final inline var forceNative: Boolean
    @JvmName("forceNativeProperty")
    get() = getForceNative()
    @JvmName("forceNativeProperty")
    set(`value`) {
      setForceNative(value)
    }

  /**
   * If non-zero, the [Window] can't be resized to be smaller than this size.
   * **Note:** This property will be ignored in favor of [getContentsMinimumSize] if [wrapControls]
   * is enabled and if its size is bigger.
   */
  @CoreTypeLocalCopy
  public final inline var minSize: Vector2i
    @JvmName("minSizeProperty")
    get() = getMinSize()
    @JvmName("minSizeProperty")
    set(`value`) {
      setMinSize(value)
    }

  /**
   * If non-zero, the [Window] can't be resized to be bigger than this size.
   * **Note:** This property will be ignored if the value is lower than [minSize].
   */
  @CoreTypeLocalCopy
  public final inline var maxSize: Vector2i
    @JvmName("maxSizeProperty")
    get() = getMaxSize()
    @JvmName("maxSizeProperty")
    set(`value`) {
      setMaxSize(value)
    }

  /**
   * If `true`, the [Window] width is expanded to keep the title bar text fully visible.
   */
  public final inline var keepTitleVisible: Boolean
    @JvmName("keepTitleVisibleProperty")
    get() = getKeepTitleVisible()
    @JvmName("keepTitleVisibleProperty")
    set(`value`) {
      setKeepTitleVisible(value)
    }

  /**
   * Base size of the content (i.e. nodes that are drawn inside the window). If non-zero, [Window]'s
   * content will be scaled when the window is resized to a different size.
   */
  @CoreTypeLocalCopy
  public final inline var contentScaleSize: Vector2i
    @JvmName("contentScaleSizeProperty")
    get() = getContentScaleSize()
    @JvmName("contentScaleSizeProperty")
    set(`value`) {
      setContentScaleSize(value)
    }

  /**
   * Specifies how the content is scaled when the [Window] is resized.
   */
  public final inline var contentScaleMode: ContentScaleMode
    @JvmName("contentScaleModeProperty")
    get() = getContentScaleMode()
    @JvmName("contentScaleModeProperty")
    set(`value`) {
      setContentScaleMode(value)
    }

  /**
   * Specifies how the content's aspect behaves when the [Window] is resized. The base aspect is
   * determined by [contentScaleSize].
   */
  public final inline var contentScaleAspect: ContentScaleAspect
    @JvmName("contentScaleAspectProperty")
    get() = getContentScaleAspect()
    @JvmName("contentScaleAspectProperty")
    set(`value`) {
      setContentScaleAspect(value)
    }

  /**
   * The policy to use to determine the final scale factor for 2D elements. This affects how
   * [contentScaleFactor] is applied, in addition to the automatic scale factor determined by
   * [contentScaleSize].
   */
  public final inline var contentScaleStretch: ContentScaleStretch
    @JvmName("contentScaleStretchProperty")
    get() = getContentScaleStretch()
    @JvmName("contentScaleStretchProperty")
    set(`value`) {
      setContentScaleStretch(value)
    }

  /**
   * Specifies the base scale of [Window]'s content when its [size] is equal to [contentScaleSize].
   * See also [Viewport.getStretchTransform].
   */
  public final inline var contentScaleFactor: Float
    @JvmName("contentScaleFactorProperty")
    get() = getContentScaleFactor()
    @JvmName("contentScaleFactorProperty")
    set(`value`) {
      setContentScaleFactor(value)
    }

  /**
   * Toggles if any text should automatically change to its translated version depending on the
   * current locale.
   */
  public final inline var autoTranslate: Boolean
    @JvmName("autoTranslateProperty")
    get() = isAutoTranslating()
    @JvmName("autoTranslateProperty")
    set(`value`) {
      setAutoTranslate(value)
    }

  /**
   * The [Theme] resource this node and all its [Control] and [Window] children use. If a child node
   * has its own [Theme] resource set, theme items are merged with child's definitions having higher
   * priority.
   * **Note:** [Window] styles will have no effect unless the window is embedded.
   */
  public final inline var theme: Theme?
    @JvmName("themeProperty")
    get() = getTheme()
    @JvmName("themeProperty")
    set(`value`) {
      setTheme(value)
    }

  /**
   * The name of a theme type variation used by this [Window] to look up its own theme items. See
   * [Control.themeTypeVariation] for more details.
   */
  public final inline var themeTypeVariation: StringName
    @JvmName("themeTypeVariationProperty")
    get() = getThemeTypeVariation()
    @JvmName("themeTypeVariationProperty")
    set(`value`) {
      setThemeTypeVariation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(852, scriptIndex)
  }

  /**
   * The window's position in pixels.
   * If [ProjectSettings.display/window/subwindows/embedSubwindows] is `false`, the position is in
   * absolute screen coordinates. This typically applies to editor plugins. If the setting is `true`,
   * the window's position is in the coordinates of its parent [Viewport].
   * **Note:** This property only works if [initialPosition] is set to
   * [WINDOW_INITIAL_POSITION_ABSOLUTE].
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.position
   * //Your changes
   * window.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector2i.() -> Unit): Vector2i = position.apply{
      block(this)
      position = this
  }


  /**
   * The window's size in pixels.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.size
   * //Your changes
   * window.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  /**
   * If non-zero, the [Window] can't be resized to be smaller than this size.
   * **Note:** This property will be ignored in favor of [getContentsMinimumSize] if [wrapControls]
   * is enabled and if its size is bigger.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.minSize
   * //Your changes
   * window.minSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun minSizeMutate(block: Vector2i.() -> Unit): Vector2i = minSize.apply{
      block(this)
      minSize = this
  }


  /**
   * If non-zero, the [Window] can't be resized to be bigger than this size.
   * **Note:** This property will be ignored if the value is lower than [minSize].
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.maxSize
   * //Your changes
   * window.maxSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun maxSizeMutate(block: Vector2i.() -> Unit): Vector2i = maxSize.apply{
      block(this)
      maxSize = this
  }


  /**
   * Base size of the content (i.e. nodes that are drawn inside the window). If non-zero, [Window]'s
   * content will be scaled when the window is resized to a different size.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = window.contentScaleSize
   * //Your changes
   * window.contentScaleSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun contentScaleSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      contentScaleSize.apply{
      block(this)
      contentScaleSize = this
  }


  /**
   * Virtual method to be implemented by the user. Overrides the value returned by
   * [getContentsMinimumSize].
   */
  public open fun _getContentsMinimumSize(): Vector2 {
    throw NotImplementedError("_getContentsMinimumSize is not implemented for Window")
  }

  public final fun setTitle(title: String): Unit {
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(ptr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the ID of the window.
   */
  public final fun getWindowId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWindowIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setInitialPosition(initialPosition: WindowInitialPosition): Unit {
    TransferContext.writeArguments(LONG to initialPosition.id)
    TransferContext.callMethod(ptr, MethodBindings.setInitialPositionPtr, NIL)
  }

  public final fun getInitialPosition(): WindowInitialPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInitialPositionPtr, LONG)
    return Window.WindowInitialPosition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCurrentScreen(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCurrentScreenPtr, NIL)
  }

  public final fun getCurrentScreen(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentScreenPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Centers a native window on the current screen and an embedded window on its embedder
   * [Viewport].
   */
  public final fun moveToCenter(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.moveToCenterPtr, NIL)
  }

  public final fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Resets the size to the minimum size, which is the max of [minSize] and (if [wrapControls] is
   * enabled) [getContentsMinimumSize]. This is equivalent to calling `set_size(Vector2i())` (or any
   * size below the minimum).
   */
  public final fun resetSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetSizePtr, NIL)
  }

  /**
   * Returns the window's position including its border.
   * **Note:** If [visible] is `false`, this method returns the same value as [position].
   */
  public final fun getPositionWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the window's size including its border.
   * **Note:** If [visible] is `false`, this method returns the same value as [size].
   */
  public final fun getSizeWithDecorations(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizeWithDecorationsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setMaxSize(maxSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to maxSize)
    TransferContext.callMethod(ptr, MethodBindings.setMaxSizePtr, NIL)
  }

  public final fun getMaxSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setMinSize(minSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to minSize)
    TransferContext.callMethod(ptr, MethodBindings.setMinSizePtr, NIL)
  }

  public final fun getMinSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setMode(mode: Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModePtr, LONG)
    return Window.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets a specified window flag.
   */
  public final fun setFlag(flag: Flags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFlagPtr, NIL)
  }

  /**
   * Returns `true` if the [flag] is set.
   */
  public final fun getFlag(flag: Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(ptr, MethodBindings.getFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the window can be maximized (the maximize button is enabled).
   */
  public final fun isMaximizeAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMaximizeAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Tells the OS that the [Window] needs an attention. This makes the window stand out in some way
   * depending on the system, e.g. it might blink on the task bar.
   */
  public final fun requestAttention(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.requestAttentionPtr, NIL)
  }

  /**
   * Causes the window to grab focus, allowing it to receive user input.
   */
  public final fun moveToForeground(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.moveToForegroundPtr, NIL)
  }

  public final fun setVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Hides the window. This is not the same as minimized state. Hidden window can't be interacted
   * with and needs to be made visible with [show].
   */
  public final fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Makes the [Window] appear. This enables interactions with the [Window] and doesn't change any
   * of its property other than visibility (unlike e.g. [popup]).
   */
  public final fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.showPtr, NIL)
  }

  public final fun setTransient(transient: Boolean): Unit {
    TransferContext.writeArguments(BOOL to transient)
    TransferContext.callMethod(ptr, MethodBindings.setTransientPtr, NIL)
  }

  public final fun isTransient(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTransientPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTransientToFocused(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setTransientToFocusedPtr, NIL)
  }

  public final fun isTransientToFocused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTransientToFocusedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExclusive(exclusive: Boolean): Unit {
    TransferContext.writeArguments(BOOL to exclusive)
    TransferContext.callMethod(ptr, MethodBindings.setExclusivePtr, NIL)
  }

  public final fun isExclusive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isExclusivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [unparent] is `true`, the window is automatically unparented when going invisible.
   * **Note:** Make sure to keep a reference to the node, otherwise it will be orphaned. You also
   * need to manually call [Node.queueFree] to free the window if it's not parented.
   */
  public final fun setUnparentWhenInvisible(unparent: Boolean): Unit {
    TransferContext.writeArguments(BOOL to unparent)
    TransferContext.callMethod(ptr, MethodBindings.setUnparentWhenInvisiblePtr, NIL)
  }

  /**
   * Returns whether the window is being drawn to the screen.
   */
  public final fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.canDrawPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the window is focused.
   */
  public final fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Causes the window to grab focus, allowing it to receive user input.
   */
  public final fun grabFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.grabFocusPtr, NIL)
  }

  /**
   * Starts an interactive drag operation on the window, using the current mouse position. Call this
   * method when handling a mouse button being pressed to simulate a pressed event on the window's
   * title bar. Using this method allows the window to participate in space switching, tiling, and
   * other system features.
   */
  public final fun startDrag(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.startDragPtr, NIL)
  }

  /**
   * Starts an interactive resize operation on the window, using the current mouse position. Call
   * this method when handling a mouse button being pressed to simulate a pressed event on the window's
   * edge.
   */
  public final fun startResize(edge: DisplayServer.WindowResizeEdge): Unit {
    TransferContext.writeArguments(LONG to edge.id)
    TransferContext.callMethod(ptr, MethodBindings.startResizePtr, NIL)
  }

  /**
   * If [active] is `true`, enables system's native IME (Input Method Editor).
   */
  public final fun setImeActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setImeActivePtr, NIL)
  }

  /**
   * Moves IME to the given position.
   */
  public final fun setImePosition(position: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to position)
    TransferContext.callMethod(ptr, MethodBindings.setImePositionPtr, NIL)
  }

  /**
   * Returns `true` if the window is currently embedded in another window.
   */
  public final fun isEmbedded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmbeddedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the combined minimum size from the child [Control] nodes of the window. Use
   * [childControlsChanged] to update it when child nodes have changed.
   * The value returned by this method can be overridden with [_getContentsMinimumSize].
   */
  public final fun getContentsMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentsMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setForceNative(forceNative: Boolean): Unit {
    TransferContext.writeArguments(BOOL to forceNative)
    TransferContext.callMethod(ptr, MethodBindings.setForceNativePtr, NIL)
  }

  public final fun getForceNative(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getForceNativePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContentScaleSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setContentScaleSizePtr, NIL)
  }

  public final fun getContentScaleSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentScaleSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setContentScaleMode(mode: ContentScaleMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setContentScaleModePtr, NIL)
  }

  public final fun getContentScaleMode(): ContentScaleMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentScaleModePtr, LONG)
    return Window.ContentScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setContentScaleAspect(aspect: ContentScaleAspect): Unit {
    TransferContext.writeArguments(LONG to aspect.id)
    TransferContext.callMethod(ptr, MethodBindings.setContentScaleAspectPtr, NIL)
  }

  public final fun getContentScaleAspect(): ContentScaleAspect {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentScaleAspectPtr, LONG)
    return Window.ContentScaleAspect.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setContentScaleStretch(stretch: ContentScaleStretch): Unit {
    TransferContext.writeArguments(LONG to stretch.id)
    TransferContext.callMethod(ptr, MethodBindings.setContentScaleStretchPtr, NIL)
  }

  public final fun getContentScaleStretch(): ContentScaleStretch {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentScaleStretchPtr, LONG)
    return Window.ContentScaleStretch.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setKeepTitleVisible(titleVisible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to titleVisible)
    TransferContext.callMethod(ptr, MethodBindings.setKeepTitleVisiblePtr, NIL)
  }

  public final fun getKeepTitleVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getKeepTitleVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContentScaleFactor(factor: Float): Unit {
    TransferContext.writeArguments(DOUBLE to factor.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setContentScaleFactorPtr, NIL)
  }

  public final fun getContentScaleFactor(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentScaleFactorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Enables font oversampling. This makes fonts look better when they are scaled up.
   */
  public final fun setUseFontOversampling(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseFontOversamplingPtr, NIL)
  }

  /**
   * Returns `true` if font oversampling is enabled. See [setUseFontOversampling].
   */
  public final fun isUsingFontOversampling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingFontOversamplingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMousePassthroughPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setMousePassthroughPolygonPtr, NIL)
  }

  public final fun getMousePassthroughPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMousePassthroughPolygonPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setWrapControls(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setWrapControlsPtr, NIL)
  }

  public final fun isWrappingControls(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isWrappingControlsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Requests an update of the [Window] size to fit underlying [Control] nodes.
   */
  public final fun childControlsChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.childControlsChangedPtr, NIL)
  }

  public final fun setTheme(theme: Theme?): Unit {
    TransferContext.writeArguments(OBJECT to theme)
    TransferContext.callMethod(ptr, MethodBindings.setThemePtr, NIL)
  }

  public final fun getTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Theme?)
  }

  public final fun setThemeTypeVariation(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.setThemeTypeVariationPtr, NIL)
  }

  public final fun getThemeTypeVariation(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThemeTypeVariationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Prevents `*_theme_*_override` methods from emitting [NOTIFICATION_THEME_CHANGED] until
   * [endBulkThemeOverride] is called.
   */
  public final fun beginBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.beginBulkThemeOverridePtr, NIL)
  }

  /**
   * Ends a bulk theme override update. See [beginBulkThemeOverride].
   */
  public final fun endBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.endBulkThemeOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme icon with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeIconOverride].
   * See also [getThemeIcon].
   */
  public final fun addThemeIconOverride(name: StringName, texture: Texture2D?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.addThemeIconOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [StyleBox] with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeStyleboxOverride].
   * See also [getThemeStylebox] and [Control.addThemeStyleboxOverride] for more details.
   */
  public final fun addThemeStyleboxOverride(name: StringName, stylebox: StyleBox?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to stylebox)
    TransferContext.callMethod(ptr, MethodBindings.addThemeStyleboxOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [Font] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontOverride].
   * See also [getThemeFont].
   */
  public final fun addThemeFontOverride(name: StringName, font: Font?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.addThemeFontOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme font size with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontSizeOverride].
   * See also [getThemeFontSize].
   */
  public final fun addThemeFontSizeOverride(name: StringName, fontSize: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addThemeFontSizeOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [Color] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeColorOverride].
   * See also [getThemeColor] and [Control.addThemeColorOverride] for more details.
   */
  public final fun addThemeColorOverride(name: StringName, color: Color): Unit {
    TransferContext.writeArguments(STRING_NAME to name, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.addThemeColorOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme constant with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeConstantOverride].
   * See also [getThemeConstant].
   */
  public final fun addThemeConstantOverride(name: StringName, constant: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to constant.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addThemeConstantOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme icon with the specified [name] previously added by
   * [addThemeIconOverride] or via the Inspector dock.
   */
  public final fun removeThemeIconOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeIconOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [StyleBox] with the specified [name] previously added by
   * [addThemeStyleboxOverride] or via the Inspector dock.
   */
  public final fun removeThemeStyleboxOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeStyleboxOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [Font] with the specified [name] previously added by
   * [addThemeFontOverride] or via the Inspector dock.
   */
  public final fun removeThemeFontOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeFontOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme font size with the specified [name] previously added by
   * [addThemeFontSizeOverride] or via the Inspector dock.
   */
  public final fun removeThemeFontSizeOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeFontSizeOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [Color] with the specified [name] previously added by
   * [addThemeColorOverride] or via the Inspector dock.
   */
  public final fun removeThemeColorOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeColorOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme constant with the specified [name] previously added by
   * [addThemeConstantOverride] or via the Inspector dock.
   */
  public final fun removeThemeConstantOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeThemeConstantOverridePtr, NIL)
  }

  /**
   * Returns an icon from the first matching [Theme] in the tree if that [Theme] has an icon item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeIcon(name: StringName, themeType: StringName = StringName("")):
      Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns a [StyleBox] from the first matching [Theme] in the tree if that [Theme] has a stylebox
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")):
      StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StyleBox?)
  }

  /**
   * Returns a [Font] from the first matching [Theme] in the tree if that [Theme] has a font item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  /**
   * Returns a font size from the first matching [Theme] in the tree if that [Theme] has a font size
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [Color] from the first matching [Theme] in the tree if that [Theme] has a color item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for more details.
   */
  public final fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns a constant from the first matching [Theme] in the tree if that [Theme] has a constant
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for more details.
   */
  public final fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.getThemeConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if there is a local override for a theme icon with the specified [name] in this
   * [Control] node.
   * See [addThemeIconOverride].
   */
  public final fun hasThemeIconOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeIconOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [StyleBox] with the specified [name] in
   * this [Control] node.
   * See [addThemeStyleboxOverride].
   */
  public final fun hasThemeStyleboxOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeStyleboxOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [Font] with the specified [name] in
   * this [Control] node.
   * See [addThemeFontOverride].
   */
  public final fun hasThemeFontOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeFontOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme font size with the specified [name] in
   * this [Control] node.
   * See [addThemeFontSizeOverride].
   */
  public final fun hasThemeFontSizeOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeFontSizeOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [Color] with the specified [name] in
   * this [Control] node.
   * See [addThemeColorOverride].
   */
  public final fun hasThemeColorOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeColorOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme constant with the specified [name] in
   * this [Control] node.
   * See [addThemeConstantOverride].
   */
  public final fun hasThemeConstantOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeConstantOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has an icon item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a stylebox item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font size item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a color item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeColor(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a constant item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")):
      Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(ptr, MethodBindings.hasThemeConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the default base scale value from the first matching [Theme] in the tree if that
   * [Theme] has a valid [Theme.defaultBaseScale] value.
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeDefaultBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThemeDefaultBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the default font from the first matching [Theme] in the tree if that [Theme] has a
   * valid [Theme.defaultFont] value.
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThemeDefaultFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  /**
   * Returns the default font size value from the first matching [Theme] in the tree if that [Theme]
   * has a valid [Theme.defaultFontSize] value.
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeDefaultFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThemeDefaultFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets layout direction and text writing direction. Right-to-left layouts are necessary for
   * certain languages (e.g. Arabic and Hebrew).
   */
  public final fun setLayoutDirection(direction: LayoutDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setLayoutDirectionPtr, NIL)
  }

  /**
   * Returns layout direction and text writing direction.
   */
  public final fun getLayoutDirection(): LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayoutDirectionPtr, LONG)
    return Window.LayoutDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if layout is right-to-left.
   */
  public final fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLayoutRtlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoTranslate(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoTranslatePtr, NIL)
  }

  public final fun isAutoTranslating(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoTranslatingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Shows the [Window] and makes it transient (see [transient]). If [rect] is provided, it will be
   * set as the [Window]'s size. Fails if called on the main window.
   * If [ProjectSettings.display/window/subwindows/embedSubwindows] is `true` (single-window mode),
   * [rect]'s coordinates are global and relative to the main window's top-left corner (excluding
   * window decorations). If [rect]'s position coordinates are negative, the window will be located
   * outside the main window and may not be visible as a result.
   * If [ProjectSettings.display/window/subwindows/embedSubwindows] is `false` (multi-window mode),
   * [rect]'s coordinates are global and relative to the top-left corner of the leftmost screen. If
   * [rect]'s position coordinates are negative, the window will be placed at the top-left corner of
   * the screen.
   * **Note:** [rect] must be in global coordinates if specified.
   */
  @JvmOverloads
  public final fun popup(rect: Rect2i = Rect2i(0, 0, 0, 0)): Unit {
    TransferContext.writeArguments(RECT2I to rect)
    TransferContext.callMethod(ptr, MethodBindings.popupPtr, NIL)
  }

  /**
   * Popups the [Window] with a position shifted by parent [Window]'s position. If the [Window] is
   * embedded, has the same effect as [popup].
   */
  public final fun popupOnParent(parentRect: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to parentRect)
    TransferContext.callMethod(ptr, MethodBindings.popupOnParentPtr, NIL)
  }

  /**
   * Popups the [Window] at the center of the current screen, with optionally given minimum size. If
   * the [Window] is embedded, it will be centered in the parent [Viewport] instead.
   * **Note:** Calling it with the default value of [minsize] is equivalent to calling it with
   * [size].
   */
  @JvmOverloads
  public final fun popupCentered(minsize: Vector2i = Vector2i(0, 0)): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize)
    TransferContext.callMethod(ptr, MethodBindings.popupCenteredPtr, NIL)
  }

  /**
   * If [Window] is embedded, popups the [Window] centered inside its embedder and sets its size as
   * a [ratio] of embedder's size.
   * If [Window] is a native window, popups the [Window] centered inside the screen of its parent
   * [Window] and sets its size as a [ratio] of the screen size.
   */
  @JvmOverloads
  public final fun popupCenteredRatio(ratio: Float = 0.8f): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.popupCenteredRatioPtr, NIL)
  }

  /**
   * Popups the [Window] centered inside its parent [Window]. [fallbackRatio] determines the maximum
   * size of the [Window], in relation to its parent.
   * **Note:** Calling it with the default value of [minsize] is equivalent to calling it with
   * [size].
   */
  @JvmOverloads
  public final fun popupCenteredClamped(minsize: Vector2i = Vector2i(0, 0), fallbackRatio: Float =
      0.75f): Unit {
    TransferContext.writeArguments(VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.popupCenteredClampedPtr, NIL)
  }

  /**
   * Attempts to parent this dialog to the last exclusive window relative to [fromNode], and then
   * calls [Window.popup] on it. The dialog must have no current parent, otherwise the method fails.
   * See also [setUnparentWhenInvisible] and [Node.getLastExclusiveWindow].
   */
  @JvmOverloads
  public final fun popupExclusive(fromNode: Node?, rect: Rect2i = Rect2i(0, 0, 0, 0)): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, RECT2I to rect)
    TransferContext.callMethod(ptr, MethodBindings.popupExclusivePtr, NIL)
  }

  /**
   * Attempts to parent this dialog to the last exclusive window relative to [fromNode], and then
   * calls [Window.popupOnParent] on it. The dialog must have no current parent, otherwise the method
   * fails.
   * See also [setUnparentWhenInvisible] and [Node.getLastExclusiveWindow].
   */
  public final fun popupExclusiveOnParent(fromNode: Node?, parentRect: Rect2i): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, RECT2I to parentRect)
    TransferContext.callMethod(ptr, MethodBindings.popupExclusiveOnParentPtr, NIL)
  }

  /**
   * Attempts to parent this dialog to the last exclusive window relative to [fromNode], and then
   * calls [Window.popupCentered] on it. The dialog must have no current parent, otherwise the method
   * fails.
   * See also [setUnparentWhenInvisible] and [Node.getLastExclusiveWindow].
   */
  @JvmOverloads
  public final fun popupExclusiveCentered(fromNode: Node?, minsize: Vector2i = Vector2i(0, 0)):
      Unit {
    TransferContext.writeArguments(OBJECT to fromNode, VECTOR2I to minsize)
    TransferContext.callMethod(ptr, MethodBindings.popupExclusiveCenteredPtr, NIL)
  }

  /**
   * Attempts to parent this dialog to the last exclusive window relative to [fromNode], and then
   * calls [Window.popupCenteredRatio] on it. The dialog must have no current parent, otherwise the
   * method fails.
   * See also [setUnparentWhenInvisible] and [Node.getLastExclusiveWindow].
   */
  @JvmOverloads
  public final fun popupExclusiveCenteredRatio(fromNode: Node?, ratio: Float = 0.8f): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.popupExclusiveCenteredRatioPtr, NIL)
  }

  /**
   * Attempts to parent this dialog to the last exclusive window relative to [fromNode], and then
   * calls [Window.popupCenteredClamped] on it. The dialog must have no current parent, otherwise the
   * method fails.
   * See also [setUnparentWhenInvisible] and [Node.getLastExclusiveWindow].
   */
  @JvmOverloads
  public final fun popupExclusiveCenteredClamped(
    fromNode: Node?,
    minsize: Vector2i = Vector2i(0, 0),
    fallbackRatio: Float = 0.75f,
  ): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.popupExclusiveCenteredClampedPtr, NIL)
  }

  public final fun setThemeTypeVariation(themeType: String) =
      setThemeTypeVariation(themeType.asCachedStringName())

  /**
   * Creates a local override for a theme icon with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeIconOverride].
   * See also [getThemeIcon].
   */
  public final fun addThemeIconOverride(name: String, texture: Texture2D?) =
      addThemeIconOverride(name.asCachedStringName(), texture)

  /**
   * Creates a local override for a theme [StyleBox] with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeStyleboxOverride].
   * See also [getThemeStylebox] and [Control.addThemeStyleboxOverride] for more details.
   */
  public final fun addThemeStyleboxOverride(name: String, stylebox: StyleBox?) =
      addThemeStyleboxOverride(name.asCachedStringName(), stylebox)

  /**
   * Creates a local override for a theme [Font] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontOverride].
   * See also [getThemeFont].
   */
  public final fun addThemeFontOverride(name: String, font: Font?) =
      addThemeFontOverride(name.asCachedStringName(), font)

  /**
   * Creates a local override for a theme font size with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontSizeOverride].
   * See also [getThemeFontSize].
   */
  public final fun addThemeFontSizeOverride(name: String, fontSize: Int) =
      addThemeFontSizeOverride(name.asCachedStringName(), fontSize)

  /**
   * Creates a local override for a theme [Color] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeColorOverride].
   * See also [getThemeColor] and [Control.addThemeColorOverride] for more details.
   */
  public final fun addThemeColorOverride(name: String, color: Color) =
      addThemeColorOverride(name.asCachedStringName(), color)

  /**
   * Creates a local override for a theme constant with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeConstantOverride].
   * See also [getThemeConstant].
   */
  public final fun addThemeConstantOverride(name: String, constant: Int) =
      addThemeConstantOverride(name.asCachedStringName(), constant)

  /**
   * Removes a local override for a theme icon with the specified [name] previously added by
   * [addThemeIconOverride] or via the Inspector dock.
   */
  public final fun removeThemeIconOverride(name: String) =
      removeThemeIconOverride(name.asCachedStringName())

  /**
   * Removes a local override for a theme [StyleBox] with the specified [name] previously added by
   * [addThemeStyleboxOverride] or via the Inspector dock.
   */
  public final fun removeThemeStyleboxOverride(name: String) =
      removeThemeStyleboxOverride(name.asCachedStringName())

  /**
   * Removes a local override for a theme [Font] with the specified [name] previously added by
   * [addThemeFontOverride] or via the Inspector dock.
   */
  public final fun removeThemeFontOverride(name: String) =
      removeThemeFontOverride(name.asCachedStringName())

  /**
   * Removes a local override for a theme font size with the specified [name] previously added by
   * [addThemeFontSizeOverride] or via the Inspector dock.
   */
  public final fun removeThemeFontSizeOverride(name: String) =
      removeThemeFontSizeOverride(name.asCachedStringName())

  /**
   * Removes a local override for a theme [Color] with the specified [name] previously added by
   * [addThemeColorOverride] or via the Inspector dock.
   */
  public final fun removeThemeColorOverride(name: String) =
      removeThemeColorOverride(name.asCachedStringName())

  /**
   * Removes a local override for a theme constant with the specified [name] previously added by
   * [addThemeConstantOverride] or via the Inspector dock.
   */
  public final fun removeThemeConstantOverride(name: String) =
      removeThemeConstantOverride(name.asCachedStringName())

  /**
   * Returns an icon from the first matching [Theme] in the tree if that [Theme] has an icon item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeIcon(name: String, themeType: String): Texture2D? =
      getThemeIcon(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns a [StyleBox] from the first matching [Theme] in the tree if that [Theme] has a stylebox
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeStylebox(name: String, themeType: String): StyleBox? =
      getThemeStylebox(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns a [Font] from the first matching [Theme] in the tree if that [Theme] has a font item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeFont(name: String, themeType: String): Font? =
      getThemeFont(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns a font size from the first matching [Theme] in the tree if that [Theme] has a font size
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun getThemeFontSize(name: String, themeType: String): Int =
      getThemeFontSize(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns a [Color] from the first matching [Theme] in the tree if that [Theme] has a color item
   * with the specified [name] and [themeType].
   * See [Control.getThemeColor] for more details.
   */
  public final fun getThemeColor(name: String, themeType: String): Color =
      getThemeColor(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns a constant from the first matching [Theme] in the tree if that [Theme] has a constant
   * item with the specified [name] and [themeType].
   * See [Control.getThemeColor] for more details.
   */
  public final fun getThemeConstant(name: String, themeType: String): Int =
      getThemeConstant(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme icon with the specified [name] in this
   * [Control] node.
   * See [addThemeIconOverride].
   */
  public final fun hasThemeIconOverride(name: String): Boolean =
      hasThemeIconOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme [StyleBox] with the specified [name] in
   * this [Control] node.
   * See [addThemeStyleboxOverride].
   */
  public final fun hasThemeStyleboxOverride(name: String): Boolean =
      hasThemeStyleboxOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme [Font] with the specified [name] in
   * this [Control] node.
   * See [addThemeFontOverride].
   */
  public final fun hasThemeFontOverride(name: String): Boolean =
      hasThemeFontOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme font size with the specified [name] in
   * this [Control] node.
   * See [addThemeFontSizeOverride].
   */
  public final fun hasThemeFontSizeOverride(name: String): Boolean =
      hasThemeFontSizeOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme [Color] with the specified [name] in
   * this [Control] node.
   * See [addThemeColorOverride].
   */
  public final fun hasThemeColorOverride(name: String): Boolean =
      hasThemeColorOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a local override for a theme constant with the specified [name] in
   * this [Control] node.
   * See [addThemeConstantOverride].
   */
  public final fun hasThemeConstantOverride(name: String): Boolean =
      hasThemeConstantOverride(name.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has an icon item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeIcon(name: String, themeType: String): Boolean =
      hasThemeIcon(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a stylebox item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeStylebox(name: String, themeType: String): Boolean =
      hasThemeStylebox(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeFont(name: String, themeType: String): Boolean =
      hasThemeFont(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font size item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeFontSize(name: String, themeType: String): Boolean =
      hasThemeFontSize(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a color item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeColor(name: String, themeType: String): Boolean =
      hasThemeColor(name.asCachedStringName(), themeType.asCachedStringName())

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a constant item with the
   * specified [name] and [themeType].
   * See [Control.getThemeColor] for details.
   */
  public final fun hasThemeConstant(name: String, themeType: String): Boolean =
      hasThemeConstant(name.asCachedStringName(), themeType.asCachedStringName())

  public enum class Mode(
    id: Long,
  ) {
    /**
     * Windowed mode, i.e. [Window] doesn't occupy the whole screen (unless set to the size of the
     * screen).
     */
    MODE_WINDOWED(0),
    /**
     * Minimized window mode, i.e. [Window] is not visible and available on window manager's window
     * list. Normally happens when the minimize button is pressed.
     */
    MODE_MINIMIZED(1),
    /**
     * Maximized window mode, i.e. [Window] will occupy whole screen area except task bar and still
     * display its borders. Normally happens when the maximize button is pressed.
     */
    MODE_MAXIMIZED(2),
    /**
     * Full screen mode with full multi-window support.
     * Full screen window covers the entire display area of a screen and has no decorations. The
     * display's video mode is not changed.
     * **On Android:** This enables immersive mode.
     * **On Windows:** Multi-window full-screen mode has a 1px border of the
     * [ProjectSettings.rendering/environment/defaults/defaultClearColor] color.
     * **On macOS:** A new desktop is used to display the running project.
     * **Note:** Regardless of the platform, enabling full screen will change the window size to
     * match the monitor's size. Therefore, make sure your project supports
     * [url=$DOCS_URL/tutorials/rendering/multiple_resolutions.html]multiple resolutions[/url] when
     * enabling full screen mode.
     */
    MODE_FULLSCREEN(3),
    /**
     * A single window full screen mode. This mode has less overhead, but only one window can be
     * open on a given screen at a time (opening a child window or application switching will trigger a
     * full screen transition).
     * Full screen window covers the entire display area of a screen and has no border or
     * decorations. The display's video mode is not changed.
     * **On Android:** This enables immersive mode.
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
    MODE_EXCLUSIVE_FULLSCREEN(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public enum class Flags(
    id: Long,
  ) {
    /**
     * The window can't be resized by dragging its resize grip. It's still possible to resize the
     * window using [size]. This flag is ignored for full screen windows. Set with [unresizable].
     */
    FLAG_RESIZE_DISABLED(0),
    /**
     * The window do not have native title bar and other decorations. This flag is ignored for
     * full-screen windows. Set with [borderless].
     */
    FLAG_BORDERLESS(1),
    /**
     * The window is floating on top of all other windows. This flag is ignored for full-screen
     * windows. Set with [alwaysOnTop].
     */
    FLAG_ALWAYS_ON_TOP(2),
    /**
     * The window background can be transparent. Set with [transparent].
     * **Note:** This flag has no effect if either
     * [ProjectSettings.display/window/perPixelTransparency/allowed], or the window's
     * [Viewport.transparentBg] is set to `false`.
     */
    FLAG_TRANSPARENT(3),
    /**
     * The window can't be focused. No-focus window will ignore all input, except mouse clicks. Set
     * with [unfocusable].
     */
    FLAG_NO_FOCUS(4),
    /**
     * Window is part of menu or [OptionButton] dropdown. This flag can't be changed when the window
     * is visible. An active popup window will exclusively receive all input, without stealing focus
     * from its parent. Popup windows are automatically closed when uses click outside it, or when an
     * application is switched. Popup window must have transient parent set (see [transient]).
     * **Note:** This flag has no effect in embedded windows (unless said window is a [Popup]).
     */
    FLAG_POPUP(5),
    /**
     * Window content is expanded to the full size of the window. Unlike borderless window, the
     * frame is left intact and can be used to resize the window, title bar is transparent, but have
     * minimize/maximize/close buttons. Set with [extendToTitle].
     * **Note:** This flag is implemented only on macOS.
     * **Note:** This flag has no effect in embedded windows.
     */
    FLAG_EXTEND_TO_TITLE(6),
    /**
     * All mouse events are passed to the underlying window of the same application.
     * **Note:** This flag has no effect in embedded windows.
     */
    FLAG_MOUSE_PASSTHROUGH(7),
    /**
     * Window style is overridden, forcing sharp corners.
     * **Note:** This flag has no effect in embedded windows.
     * **Note:** This flag is implemented only on Windows (11).
     */
    FLAG_SHARP_CORNERS(8),
    /**
     * Windows is excluded from screenshots taken by [DisplayServer.screenGetImage],
     * [DisplayServer.screenGetImageRect], and [DisplayServer.screenGetPixel].
     * **Note:** This flag is implemented on macOS and Windows.
     * **Note:** Setting this flag will **NOT** prevent other apps from capturing an image, it
     * should not be used as a security measure.
     */
    FLAG_EXCLUDE_FROM_CAPTURE(9),
    /**
     * Max value of the [Flags].
     */
    FLAG_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flags = entries.single { it.id == `value` }
    }
  }

  public enum class ContentScaleMode(
    id: Long,
  ) {
    /**
     * The content will not be scaled to match the [Window]'s size.
     */
    CONTENT_SCALE_MODE_DISABLED(0),
    /**
     * The content will be rendered at the target size. This is more performance-expensive than
     * [CONTENT_SCALE_MODE_VIEWPORT], but provides better results.
     */
    CONTENT_SCALE_MODE_CANVAS_ITEMS(1),
    /**
     * The content will be rendered at the base size and then scaled to the target size. More
     * performant than [CONTENT_SCALE_MODE_CANVAS_ITEMS], but results in pixelated image.
     */
    CONTENT_SCALE_MODE_VIEWPORT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ContentScaleMode = entries.single { it.id == `value` }
    }
  }

  public enum class ContentScaleAspect(
    id: Long,
  ) {
    /**
     * The aspect will be ignored. Scaling will simply stretch the content to fit the target size.
     */
    CONTENT_SCALE_ASPECT_IGNORE(0),
    /**
     * The content's aspect will be preserved. If the target size has different aspect from the base
     * one, the image will be centered and black bars will appear on left and right sides.
     */
    CONTENT_SCALE_ASPECT_KEEP(1),
    /**
     * The content can be expanded vertically. Scaling horizontally will result in keeping the width
     * ratio and then black bars on left and right sides.
     */
    CONTENT_SCALE_ASPECT_KEEP_WIDTH(2),
    /**
     * The content can be expanded horizontally. Scaling vertically will result in keeping the
     * height ratio and then black bars on top and bottom sides.
     */
    CONTENT_SCALE_ASPECT_KEEP_HEIGHT(3),
    /**
     * The content's aspect will be preserved. If the target size has different aspect from the base
     * one, the content will stay in the top-left corner and add an extra visible area in the stretched
     * space.
     */
    CONTENT_SCALE_ASPECT_EXPAND(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ContentScaleAspect = entries.single { it.id == `value` }
    }
  }

  public enum class ContentScaleStretch(
    id: Long,
  ) {
    /**
     * The content will be stretched according to a fractional factor. This fills all the space
     * available in the window, but allows "pixel wobble" to occur due to uneven pixel scaling.
     */
    CONTENT_SCALE_STRETCH_FRACTIONAL(0),
    /**
     * The content will be stretched only according to an integer factor, preserving sharp pixels.
     * This may leave a black background visible on the window's edges depending on the window size.
     */
    CONTENT_SCALE_STRETCH_INTEGER(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ContentScaleStretch = entries.single { it.id == `value` }
    }
  }

  public enum class LayoutDirection(
    id: Long,
  ) {
    /**
     * Automatic layout direction, determined from the parent window layout direction.
     */
    LAYOUT_DIRECTION_INHERITED(0),
    /**
     * Automatic layout direction, determined from the current locale.
     */
    LAYOUT_DIRECTION_APPLICATION_LOCALE(1),
    /**
     * Left-to-right layout direction.
     */
    LAYOUT_DIRECTION_LTR(2),
    /**
     * Right-to-left layout direction.
     */
    LAYOUT_DIRECTION_RTL(3),
    /**
     * Automatic layout direction, determined from the system locale.
     */
    LAYOUT_DIRECTION_SYSTEM_LOCALE(4),
    /**
     * Represents the size of the [LayoutDirection] enum.
     */
    LAYOUT_DIRECTION_MAX(5),
    LAYOUT_DIRECTION_LOCALE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutDirection = entries.single { it.id == `value` }
    }
  }

  public enum class WindowInitialPosition(
    id: Long,
  ) {
    /**
     * Initial window position is determined by [position].
     */
    WINDOW_INITIAL_POSITION_ABSOLUTE(0),
    /**
     * Initial window position is the center of the primary screen.
     */
    WINDOW_INITIAL_POSITION_CENTER_PRIMARY_SCREEN(1),
    /**
     * Initial window position is the center of the main window screen.
     */
    WINDOW_INITIAL_POSITION_CENTER_MAIN_WINDOW_SCREEN(2),
    /**
     * Initial window position is the center of [currentScreen] screen.
     */
    WINDOW_INITIAL_POSITION_CENTER_OTHER_SCREEN(3),
    /**
     * Initial window position is the center of the screen containing the mouse pointer.
     */
    WINDOW_INITIAL_POSITION_CENTER_SCREEN_WITH_MOUSE_FOCUS(4),
    /**
     * Initial window position is the center of the screen containing the window with the keyboard
     * focus.
     */
    WINDOW_INITIAL_POSITION_CENTER_SCREEN_WITH_KEYBOARD_FOCUS(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WindowInitialPosition = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Emitted when [Window]'s visibility changes, right before [signal visibility_changed].
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 30

    /**
     * Sent when the node needs to refresh its theme items. This happens in one of the following
     * cases:
     * - The [theme] property is changed on this node or any of its ancestors.
     * - The [themeTypeVariation] property is changed on this node.
     * - The node enters the scene tree.
     * **Note:** As an optimization, this notification won't be sent from changes that occur while
     * this node is outside of the scene tree. Instead, all of the theme item updates can be applied at
     * once when the node enters the scene tree.
     */
    public final const val NOTIFICATION_THEME_CHANGED: Long = 32
  }

  public object MethodBindings {
    internal val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_title", 83702148)

    internal val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_title", 201670096)

    internal val getWindowIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_window_id", 3905245786)

    internal val setInitialPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_initial_position", 4084468099)

    internal val getInitialPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_initial_position", 4294066647)

    internal val setCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_current_screen", 1286410249)

    internal val getCurrentScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_current_screen", 3905245786)

    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_position", 1130785943)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_position", 3690982128)

    internal val moveToCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "move_to_center", 3218959716)

    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_size", 1130785943)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_size", 3690982128)

    internal val resetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "reset_size", 3218959716)

    internal val getPositionWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_position_with_decorations", 3690982128)

    internal val getSizeWithDecorationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_size_with_decorations", 3690982128)

    internal val setMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_max_size", 1130785943)

    internal val getMaxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_max_size", 3690982128)

    internal val setMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_min_size", 1130785943)

    internal val getMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_min_size", 3690982128)

    internal val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_mode", 3095236531)

    internal val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_mode", 2566346114)

    internal val setFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_flag", 3426449779)

    internal val getFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_flag", 3062752289)

    internal val isMaximizeAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_maximize_allowed", 36873697)

    internal val requestAttentionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "request_attention", 3218959716)

    internal val moveToForegroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "move_to_foreground", 3218959716)

    internal val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_visible", 2586408642)

    internal val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_visible", 36873697)

    internal val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "hide", 3218959716)

    internal val showPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "show", 3218959716)

    internal val setTransientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_transient", 2586408642)

    internal val isTransientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_transient", 36873697)

    internal val setTransientToFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_transient_to_focused", 2586408642)

    internal val isTransientToFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_transient_to_focused", 36873697)

    internal val setExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_exclusive", 2586408642)

    internal val isExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_exclusive", 36873697)

    internal val setUnparentWhenInvisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_unparent_when_invisible", 2586408642)

    internal val canDrawPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "can_draw", 36873697)

    internal val hasFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_focus", 36873697)

    internal val grabFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "grab_focus", 3218959716)

    internal val startDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "start_drag", 3218959716)

    internal val startResizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "start_resize", 122288853)

    internal val setImeActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_ime_active", 2586408642)

    internal val setImePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_ime_position", 1130785943)

    internal val isEmbeddedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_embedded", 36873697)

    internal val getContentsMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_contents_minimum_size", 3341600327)

    internal val setForceNativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_force_native", 2586408642)

    internal val getForceNativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_force_native", 36873697)

    internal val setContentScaleSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_size", 1130785943)

    internal val getContentScaleSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_size", 3690982128)

    internal val setContentScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_mode", 2937716473)

    internal val getContentScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_mode", 161585230)

    internal val setContentScaleAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_aspect", 2370399418)

    internal val getContentScaleAspectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_aspect", 4158790715)

    internal val setContentScaleStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_stretch", 349355940)

    internal val getContentScaleStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_stretch", 536857316)

    internal val setKeepTitleVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_keep_title_visible", 2586408642)

    internal val getKeepTitleVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_keep_title_visible", 36873697)

    internal val setContentScaleFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_content_scale_factor", 373806689)

    internal val getContentScaleFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_content_scale_factor", 1740695150)

    internal val setUseFontOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_use_font_oversampling", 2586408642)

    internal val isUsingFontOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_using_font_oversampling", 36873697)

    internal val setMousePassthroughPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_mouse_passthrough_polygon", 1509147220)

    internal val getMousePassthroughPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_mouse_passthrough_polygon", 2961356807)

    internal val setWrapControlsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_wrap_controls", 2586408642)

    internal val isWrappingControlsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_wrapping_controls", 36873697)

    internal val childControlsChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "child_controls_changed", 3218959716)

    internal val setThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_theme", 2326690814)

    internal val getThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme", 3846893731)

    internal val setThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_theme_type_variation", 3304788590)

    internal val getThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_type_variation", 2002593661)

    internal val beginBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "begin_bulk_theme_override", 3218959716)

    internal val endBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "end_bulk_theme_override", 3218959716)

    internal val addThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_icon_override", 1373065600)

    internal val addThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_stylebox_override", 4188838905)

    internal val addThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_font_override", 3518018674)

    internal val addThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_font_size_override", 2415702435)

    internal val addThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_color_override", 4260178595)

    internal val addThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "add_theme_constant_override", 2415702435)

    internal val removeThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_icon_override", 3304788590)

    internal val removeThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_stylebox_override", 3304788590)

    internal val removeThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_font_override", 3304788590)

    internal val removeThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_font_size_override", 3304788590)

    internal val removeThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_color_override", 3304788590)

    internal val removeThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "remove_theme_constant_override", 3304788590)

    internal val getThemeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_icon", 3163973443)

    internal val getThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_stylebox", 604739069)

    internal val getThemeFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_font", 2826986490)

    internal val getThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_font_size", 1327056374)

    internal val getThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_color", 2798751242)

    internal val getThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_constant", 1327056374)

    internal val hasThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_icon_override", 2619796661)

    internal val hasThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_stylebox_override", 2619796661)

    internal val hasThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_override", 2619796661)

    internal val hasThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_size_override", 2619796661)

    internal val hasThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_color_override", 2619796661)

    internal val hasThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_constant_override", 2619796661)

    internal val hasThemeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_icon", 866386512)

    internal val hasThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_stylebox", 866386512)

    internal val hasThemeFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font", 866386512)

    internal val hasThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_font_size", 866386512)

    internal val hasThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_color", 866386512)

    internal val hasThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "has_theme_constant", 866386512)

    internal val getThemeDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_base_scale", 1740695150)

    internal val getThemeDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_font", 3229501585)

    internal val getThemeDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_theme_default_font_size", 3905245786)

    internal val setLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_layout_direction", 3094704184)

    internal val getLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "get_layout_direction", 3909617982)

    internal val isLayoutRtlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_layout_rtl", 36873697)

    internal val setAutoTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "set_auto_translate", 2586408642)

    internal val isAutoTranslatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "is_auto_translating", 36873697)

    internal val popupPtr: VoidPtr = TypeManager.getMethodBindPtr("Window", "popup", 1680304321)

    internal val popupOnParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_on_parent", 1763793166)

    internal val popupCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_centered", 3447975422)

    internal val popupCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_centered_ratio", 1014814997)

    internal val popupCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_centered_clamped", 2613752477)

    internal val popupExclusivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive", 2134721627)

    internal val popupExclusiveOnParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_on_parent", 2344671043)

    internal val popupExclusiveCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered", 3357594017)

    internal val popupExclusiveCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered_ratio", 2284776287)

    internal val popupExclusiveCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Window", "popup_exclusive_centered_clamped", 2612708785)
  }
}
