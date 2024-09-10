// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.Vector3i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Base class for all UI-related nodes. [Control] features a bounding rectangle that defines its
 * extents, an anchor position relative to its parent control or the current viewport, and offsets
 * relative to the anchor. The offsets update automatically when the node, any of its parents, or the
 * screen size change.
 * For more information on Godot's UI system, anchors, offsets, and containers, see the related
 * tutorials in the manual. To build flexible UIs, you'll need a mix of UI elements that inherit from
 * [Control] and [Container] nodes.
 * **User Interface nodes and input**
 * Godot propagates input events via viewports. Each [Viewport] is responsible for propagating
 * [InputEvent]s to their child nodes. As the [SceneTree.root] is a [Window], this already happens
 * automatically for all UI elements in your game.
 * Input events are propagated through the [SceneTree] from the root node to all child nodes by
 * calling [Node.Input]. For UI elements specifically, it makes more sense to override the virtual
 * method [_guiInput], which filters out unrelated input events, such as by checking z-order,
 * [mouseFilter], focus, or if the event was inside of the control's bounding box.
 * Call [acceptEvent] so no other node receives the event. Once you accept an input, it becomes
 * handled so [Node.UnhandledInput] will not process it.
 * Only one [Control] node can be in focus. Only the node in focus will receive events. To get the
 * focus, call [grabFocus]. [Control] nodes lose focus when another node grabs it, or if you hide the
 * node in focus.
 * Sets [mouseFilter] to [MOUSE_FILTER_IGNORE] to tell a [Control] node to ignore mouse or touch
 * events. You'll need it if you place an icon on top of a button.
 * [Theme] resources change the Control's appearance. If you change the [Theme] on a [Control] node,
 * it affects all of its children. To override some of the theme's parameters, call one of the
 * `add_theme_*_override` methods, like [addThemeFontOverride]. You can override the theme with the
 * Inspector.
 * **Note:** Theme items are *not* [Object] properties. This means you can't access their values
 * using [Object.get] and [Object.set]. Instead, use the `get_theme_*` and `add_theme_*_override`
 * methods provided by this class.
 */
@GodotBaseType
public open class Control : CanvasItem() {
  /**
   * Emitted when the control changes size.
   */
  public val resized: Signal0 by signal()

  /**
   * Emitted when the node receives an [InputEvent].
   */
  public val guiInput: Signal1<InputEvent?> by signal("event")

  /**
   * Emitted when the mouse cursor enters the control's (or any child control's) visible area, that
   * is not occluded behind other Controls or Windows, provided its [mouseFilter] lets the event reach
   * it and regardless if it's currently focused or not.
   * **Note:** [CanvasItem.zIndex] doesn't affect, which Control receives the signal.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse cursor leaves the control's (and all child control's) visible area, that
   * is not occluded behind other Controls or Windows, provided its [mouseFilter] lets the event reach
   * it and regardless if it's currently focused or not.
   * **Note:** [CanvasItem.zIndex] doesn't affect, which Control receives the signal.
   * **Note:** If you want to check whether the mouse truly left the area, ignoring any top nodes,
   * you can use code like this:
   * [codeblock]
   * func _on_mouse_exited():
   *     if not Rect2(Vector2(), size).has_point(get_local_mouse_position()):
   *         # Not hovering over area.
   * [/codeblock]
   */
  public val mouseExited: Signal0 by signal()

  /**
   * Emitted when the node gains focus.
   */
  public val focusEntered: Signal0 by signal()

  /**
   * Emitted when the node loses focus.
   */
  public val focusExited: Signal0 by signal()

  /**
   * Emitted when one of the size flags changes. See [sizeFlagsHorizontal] and [sizeFlagsVertical].
   */
  public val sizeFlagsChanged: Signal0 by signal()

  /**
   * Emitted when the node's minimum size changes.
   */
  public val minimumSizeChanged: Signal0 by signal()

  /**
   * Emitted when the [NOTIFICATION_THEME_CHANGED] notification is sent.
   */
  public val themeChanged: Signal0 by signal()

  /**
   * Enables whether rendering of [CanvasItem] based children should be clipped to this control's
   * rectangle. If `true`, parts of a child which would be visibly outside of this control's rectangle
   * will not be rendered and won't receive input.
   */
  public var clipContents: Boolean
    @JvmName("clipContentsProperty")
    get() = isClippingContents()
    @JvmName("clipContentsProperty")
    set(`value`) {
      setClipContents(value)
    }

  /**
   * The minimum size of the node's bounding rectangle. If you set it to a value greater than `(0,
   * 0)`, the node's bounding rectangle will always have at least this size. Note that [Control] nodes
   * have their internal minimum size returned by [getMinimumSize]. It depends on the control's
   * contents, like text, textures, or style boxes. The actual minimum size is the maximum value of
   * this property and the internal minimum size (see [getCombinedMinimumSize]).
   */
  @CoreTypeLocalCopy
  public var customMinimumSize: Vector2
    @JvmName("customMinimumSizeProperty")
    get() = getCustomMinimumSize()
    @JvmName("customMinimumSizeProperty")
    set(`value`) {
      setCustomMinimumSize(value)
    }

  /**
   * Controls layout direction and text writing direction. Right-to-left layouts are necessary for
   * certain languages (e.g. Arabic and Hebrew).
   */
  public var layoutDirection: LayoutDirection
    @JvmName("layoutDirectionProperty")
    get() = getLayoutDirection()
    @JvmName("layoutDirectionProperty")
    set(`value`) {
      setLayoutDirection(value)
    }

  /**
   * Anchors the left edge of the node to the origin, the center or the end of its parent control.
   * It changes how the left offset updates when the node moves or changes size. You can use one of the
   * [Anchor] constants for convenience.
   */
  public val anchorLeft: Float
    @JvmName("anchorLeftProperty")
    get() = getAnchor(Side.SIDE_LEFT)

  /**
   * Anchors the top edge of the node to the origin, the center or the end of its parent control. It
   * changes how the top offset updates when the node moves or changes size. You can use one of the
   * [Anchor] constants for convenience.
   */
  public val anchorTop: Float
    @JvmName("anchorTopProperty")
    get() = getAnchor(Side.SIDE_TOP)

  /**
   * Anchors the right edge of the node to the origin, the center or the end of its parent control.
   * It changes how the right offset updates when the node moves or changes size. You can use one of
   * the [Anchor] constants for convenience.
   */
  public val anchorRight: Float
    @JvmName("anchorRightProperty")
    get() = getAnchor(Side.SIDE_RIGHT)

  /**
   * Anchors the bottom edge of the node to the origin, the center, or the end of its parent
   * control. It changes how the bottom offset updates when the node moves or changes size. You can use
   * one of the [Anchor] constants for convenience.
   */
  public val anchorBottom: Float
    @JvmName("anchorBottomProperty")
    get() = getAnchor(Side.SIDE_BOTTOM)

  /**
   * Distance between the node's left edge and its parent control, based on [anchorLeft].
   * Offsets are often controlled by one or multiple parent [Container] nodes, so you should not
   * modify them manually if your node is a direct child of a [Container]. Offsets update automatically
   * when you move or resize the node.
   */
  public var offsetLeft: Float
    @JvmName("offsetLeftProperty")
    get() = getOffset(Side.SIDE_LEFT)
    @JvmName("offsetLeftProperty")
    set(`value`) {
      setOffset(Side.SIDE_LEFT, value)
    }

  /**
   * Distance between the node's top edge and its parent control, based on [anchorTop].
   * Offsets are often controlled by one or multiple parent [Container] nodes, so you should not
   * modify them manually if your node is a direct child of a [Container]. Offsets update automatically
   * when you move or resize the node.
   */
  public var offsetTop: Float
    @JvmName("offsetTopProperty")
    get() = getOffset(Side.SIDE_TOP)
    @JvmName("offsetTopProperty")
    set(`value`) {
      setOffset(Side.SIDE_TOP, value)
    }

  /**
   * Distance between the node's right edge and its parent control, based on [anchorRight].
   * Offsets are often controlled by one or multiple parent [Container] nodes, so you should not
   * modify them manually if your node is a direct child of a [Container]. Offsets update automatically
   * when you move or resize the node.
   */
  public var offsetRight: Float
    @JvmName("offsetRightProperty")
    get() = getOffset(Side.SIDE_RIGHT)
    @JvmName("offsetRightProperty")
    set(`value`) {
      setOffset(Side.SIDE_RIGHT, value)
    }

  /**
   * Distance between the node's bottom edge and its parent control, based on [anchorBottom].
   * Offsets are often controlled by one or multiple parent [Container] nodes, so you should not
   * modify them manually if your node is a direct child of a [Container]. Offsets update automatically
   * when you move or resize the node.
   */
  public var offsetBottom: Float
    @JvmName("offsetBottomProperty")
    get() = getOffset(Side.SIDE_BOTTOM)
    @JvmName("offsetBottomProperty")
    set(`value`) {
      setOffset(Side.SIDE_BOTTOM, value)
    }

  /**
   * Controls the direction on the horizontal axis in which the control should grow if its
   * horizontal minimum size is changed to be greater than its current size, as the control always has
   * to be at least the minimum size.
   */
  public var growHorizontal: GrowDirection
    @JvmName("growHorizontalProperty")
    get() = getHGrowDirection()
    @JvmName("growHorizontalProperty")
    set(`value`) {
      setHGrowDirection(value)
    }

  /**
   * Controls the direction on the vertical axis in which the control should grow if its vertical
   * minimum size is changed to be greater than its current size, as the control always has to be at
   * least the minimum size.
   */
  public var growVertical: GrowDirection
    @JvmName("growVerticalProperty")
    get() = getVGrowDirection()
    @JvmName("growVerticalProperty")
    set(`value`) {
      setVGrowDirection(value)
    }

  /**
   * The size of the node's bounding rectangle, in the node's coordinate system. [Container] nodes
   * update this property automatically.
   */
  @CoreTypeLocalCopy
  public val size: Vector2
    @JvmName("sizeProperty")
    get() = getSize()

  /**
   * The node's position, relative to its containing node. It corresponds to the rectangle's
   * top-left corner. The property is not affected by [pivotOffset].
   */
  @CoreTypeLocalCopy
  public val position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()

  /**
   * The node's global position, relative to the world (usually to the [CanvasLayer]).
   */
  @CoreTypeLocalCopy
  public val globalPosition: Vector2
    @JvmName("globalPositionProperty")
    get() = getGlobalPosition()

  /**
   * The node's rotation around its pivot, in radians. See [pivotOffset] to change the pivot's
   * position.
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
   */
  public var rotation: Float
    @JvmName("rotationProperty")
    get() = getRotation()
    @JvmName("rotationProperty")
    set(`value`) {
      setRotation(value)
    }

  /**
   * Helper property to access [rotation] in degrees instead of radians.
   */
  public var rotationDegrees: Float
    @JvmName("rotationDegreesProperty")
    get() = getRotationDegrees()
    @JvmName("rotationDegreesProperty")
    set(`value`) {
      setRotationDegrees(value)
    }

  /**
   * The node's scale, relative to its [size]. Change this property to scale the node around its
   * [pivotOffset]. The Control's [tooltipText] will also scale according to this value.
   * **Note:** This property is mainly intended to be used for animation purposes. To support
   * multiple resolutions in your project, use an appropriate viewport stretch mode as described in the
   * [url=$DOCS_URL/tutorials/rendering/multiple_resolutions.html]documentation[/url] instead of
   * scaling Controls individually.
   * **Note:** [FontFile.oversampling] does *not* take [Control] [scale] into account. This means
   * that scaling up/down will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear
   * blurry or pixelated. To ensure text remains crisp regardless of scale, you can enable MSDF font
   * rendering by enabling [ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField]
   * (applies to the default project font only), or enabling **Multichannel Signed Distance Field** in
   * the import options of a DynamicFont for custom fonts. On system fonts,
   * [SystemFont.multichannelSignedDistanceField] can be enabled in the inspector.
   * **Note:** If the Control node is a child of a [Container] node, the scale will be reset to
   * `Vector2(1, 1)` when the scene is instantiated. To set the Control's scale when it's instantiated,
   * wait for one frame using `await get_tree().process_frame` then set its [scale] property.
   */
  @CoreTypeLocalCopy
  public var scale: Vector2
    @JvmName("scaleProperty")
    get() = getScale()
    @JvmName("scaleProperty")
    set(`value`) {
      setScale(value)
    }

  /**
   * By default, the node's pivot is its top-left corner. When you change its [rotation] or [scale],
   * it will rotate or scale around this pivot. Set this property to [size] / 2 to pivot around the
   * Control's center.
   */
  @CoreTypeLocalCopy
  public var pivotOffset: Vector2
    @JvmName("pivotOffsetProperty")
    get() = getPivotOffset()
    @JvmName("pivotOffsetProperty")
    set(`value`) {
      setPivotOffset(value)
    }

  /**
   * Tells the parent [Container] nodes how they should resize and place the node on the X axis. Use
   * a combination of the [SizeFlags] constants to change the flags. See the constants to learn what
   * each does.
   */
  public var sizeFlagsHorizontal: SizeFlags
    @JvmName("sizeFlagsHorizontalProperty")
    get() = getHSizeFlags()
    @JvmName("sizeFlagsHorizontalProperty")
    set(`value`) {
      setHSizeFlags(value)
    }

  /**
   * Tells the parent [Container] nodes how they should resize and place the node on the Y axis. Use
   * a combination of the [SizeFlags] constants to change the flags. See the constants to learn what
   * each does.
   */
  public var sizeFlagsVertical: SizeFlags
    @JvmName("sizeFlagsVerticalProperty")
    get() = getVSizeFlags()
    @JvmName("sizeFlagsVerticalProperty")
    set(`value`) {
      setVSizeFlags(value)
    }

  /**
   * If the node and at least one of its neighbors uses the [SIZE_EXPAND] size flag, the parent
   * [Container] will let it take more or less space depending on this property. If this node has a
   * stretch ratio of 2 and its neighbor a ratio of 1, this node will take two thirds of the available
   * space.
   */
  public var sizeFlagsStretchRatio: Float
    @JvmName("sizeFlagsStretchRatioProperty")
    get() = getStretchRatio()
    @JvmName("sizeFlagsStretchRatioProperty")
    set(`value`) {
      setStretchRatio(value)
    }

  /**
   * If `true`, automatically converts code line numbers, list indices, [SpinBox] and [ProgressBar]
   * values from the Western Arabic (0..9) to the numeral systems used in current locale.
   * **Note:** Numbers within the text are not automatically converted, it can be done manually,
   * using [TextServer.formatNumber].
   */
  public var localizeNumeralSystem: Boolean
    @JvmName("localizeNumeralSystemProperty")
    get() = isLocalizingNumeralSystem()
    @JvmName("localizeNumeralSystemProperty")
    set(`value`) {
      setLocalizeNumeralSystem(value)
    }

  /**
   * Toggles if any text should automatically change to its translated version depending on the
   * current locale.
   */
  public var autoTranslate: Boolean
    @JvmName("autoTranslateProperty")
    get() = isAutoTranslating()
    @JvmName("autoTranslateProperty")
    set(`value`) {
      setAutoTranslate(value)
    }

  /**
   * The default tooltip text. The tooltip appears when the user's mouse cursor stays idle over this
   * control for a few moments, provided that the [mouseFilter] property is not [MOUSE_FILTER_IGNORE].
   * The time required for the tooltip to appear can be changed with the
   * [ProjectSettings.gui/timers/tooltipDelaySec] option. See also [getTooltip].
   * The tooltip popup will use either a default implementation, or a custom one that you can
   * provide by overriding [_makeCustomTooltip]. The default tooltip includes a [PopupPanel] and
   * [Label] whose theme properties can be customized using [Theme] methods with the `"TooltipPanel"`
   * and `"TooltipLabel"` respectively. For example:
   *
   * gdscript:
   * ```gdscript
   * var style_box = StyleBoxFlat.new()
   * style_box.set_bg_color(Color(1, 1, 0))
   * style_box.set_border_width_all(2)
   * # We assume here that the `theme` property has been assigned a custom Theme beforehand.
   * theme.set_stylebox("panel", "TooltipPanel", style_box)
   * theme.set_color("font_color", "TooltipLabel", Color(0, 1, 1))
   * ```
   * csharp:
   * ```csharp
   * var styleBox = new StyleBoxFlat();
   * styleBox.SetBgColor(new Color(1, 1, 0));
   * styleBox.SetBorderWidthAll(2);
   * // We assume here that the `Theme` property has been assigned a custom Theme beforehand.
   * Theme.SetStyleBox("panel", "TooltipPanel", styleBox);
   * Theme.SetColor("font_color", "TooltipLabel", new Color(0, 1, 1));
   * ```
   */
  public var tooltipText: String
    @JvmName("tooltipTextProperty")
    get() = getTooltipText()
    @JvmName("tooltipTextProperty")
    set(`value`) {
      setTooltipText(value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses the left arrow on the
   * keyboard or left on a gamepad by default. You can change the key by editing the
   * [ProjectSettings.input/uiLeft] input action. The node must be a [Control]. If this property is not
   * set, Godot will give focus to the closest [Control] to the left of this one.
   */
  public var focusNeighborLeft: NodePath
    @JvmName("focusNeighborLeftProperty")
    get() = getFocusNeighbor(Side.SIDE_LEFT)
    @JvmName("focusNeighborLeftProperty")
    set(`value`) {
      setFocusNeighbor(Side.SIDE_LEFT, value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses the top arrow on the
   * keyboard or top on a gamepad by default. You can change the key by editing the
   * [ProjectSettings.input/uiUp] input action. The node must be a [Control]. If this property is not
   * set, Godot will give focus to the closest [Control] to the top of this one.
   */
  public var focusNeighborTop: NodePath
    @JvmName("focusNeighborTopProperty")
    get() = getFocusNeighbor(Side.SIDE_TOP)
    @JvmName("focusNeighborTopProperty")
    set(`value`) {
      setFocusNeighbor(Side.SIDE_TOP, value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses the right arrow on the
   * keyboard or right on a gamepad by default. You can change the key by editing the
   * [ProjectSettings.input/uiRight] input action. The node must be a [Control]. If this property is
   * not set, Godot will give focus to the closest [Control] to the right of this one.
   */
  public var focusNeighborRight: NodePath
    @JvmName("focusNeighborRightProperty")
    get() = getFocusNeighbor(Side.SIDE_RIGHT)
    @JvmName("focusNeighborRightProperty")
    set(`value`) {
      setFocusNeighbor(Side.SIDE_RIGHT, value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses the down arrow on the
   * keyboard or down on a gamepad by default. You can change the key by editing the
   * [ProjectSettings.input/uiDown] input action. The node must be a [Control]. If this property is not
   * set, Godot will give focus to the closest [Control] to the bottom of this one.
   */
  public var focusNeighborBottom: NodePath
    @JvmName("focusNeighborBottomProperty")
    get() = getFocusNeighbor(Side.SIDE_BOTTOM)
    @JvmName("focusNeighborBottomProperty")
    set(`value`) {
      setFocusNeighbor(Side.SIDE_BOTTOM, value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses [kbd]Tab[/kbd] on a keyboard
   * by default. You can change the key by editing the [ProjectSettings.input/uiFocusNext] input
   * action.
   * If this property is not set, Godot will select a "best guess" based on surrounding nodes in the
   * scene tree.
   */
  public var focusNext: NodePath
    @JvmName("focusNextProperty")
    get() = getFocusNext()
    @JvmName("focusNextProperty")
    set(`value`) {
      setFocusNext(value)
    }

  /**
   * Tells Godot which node it should give focus to if the user presses [kbd]Shift + Tab[/kbd] on a
   * keyboard by default. You can change the key by editing the [ProjectSettings.input/uiFocusPrev]
   * input action.
   * If this property is not set, Godot will select a "best guess" based on surrounding nodes in the
   * scene tree.
   */
  public var focusPrevious: NodePath
    @JvmName("focusPreviousProperty")
    get() = getFocusPrevious()
    @JvmName("focusPreviousProperty")
    set(`value`) {
      setFocusPrevious(value)
    }

  /**
   * The focus access mode for the control (None, Click or All). Only one Control can be focused at
   * the same time, and it will receive keyboard, gamepad, and mouse signals.
   */
  public var focusMode: FocusMode
    @JvmName("focusModeProperty")
    get() = getFocusMode()
    @JvmName("focusModeProperty")
    set(`value`) {
      setFocusMode(value)
    }

  /**
   * Controls whether the control will be able to receive mouse button input events through
   * [_guiInput] and how these events should be handled. Also controls whether the control can receive
   * the [signal mouse_entered], and [signal mouse_exited] signals. See the constants to learn what
   * each does.
   */
  public var mouseFilter: MouseFilter
    @JvmName("mouseFilterProperty")
    get() = getMouseFilter()
    @JvmName("mouseFilterProperty")
    set(`value`) {
      setMouseFilter(value)
    }

  /**
   * When enabled, scroll wheel events processed by [_guiInput] will be passed to the parent control
   * even if [mouseFilter] is set to [MOUSE_FILTER_STOP]. As it defaults to true, this allows nested
   * scrollable containers to work out of the box.
   * You should disable it on the root of your UI if you do not want scroll events to go to the
   * [Node.UnhandledInput] processing.
   */
  public var mouseForcePassScrollEvents: Boolean
    @JvmName("mouseForcePassScrollEventsProperty")
    get() = isForcePassScrollEvents()
    @JvmName("mouseForcePassScrollEventsProperty")
    set(`value`) {
      setForcePassScrollEvents(value)
    }

  /**
   * The default cursor shape for this control. Useful for Godot plugins and applications or games
   * that use the system's mouse cursors.
   * **Note:** On Linux, shapes may vary depending on the cursor theme of the system.
   */
  public var mouseDefaultCursorShape: CursorShape
    @JvmName("mouseDefaultCursorShapeProperty")
    get() = getDefaultCursorShape()
    @JvmName("mouseDefaultCursorShapeProperty")
    set(`value`) {
      setDefaultCursorShape(value)
    }

  /**
   * The [Node] which must be a parent of the focused [Control] for the shortcut to be activated. If
   * `null`, the shortcut can be activated when any control is focused (a global shortcut). This allows
   * shortcuts to be accepted only when the user has a certain area of the GUI focused.
   */
  public var shortcutContext: Node?
    @JvmName("shortcutContextProperty")
    get() = getShortcutContext()
    @JvmName("shortcutContextProperty")
    set(`value`) {
      setShortcutContext(value)
    }

  /**
   * The [Theme] resource this node and all its [Control] and [Window] children use. If a child node
   * has its own [Theme] resource set, theme items are merged with child's definitions having higher
   * priority.
   * **Note:** [Window] styles will have no effect unless the window is embedded.
   */
  public var theme: Theme?
    @JvmName("themeProperty")
    get() = getTheme()
    @JvmName("themeProperty")
    set(`value`) {
      setTheme(value)
    }

  /**
   * The name of a theme type variation used by this [Control] to look up its own theme items. When
   * empty, the class name of the node is used (e.g. [code skip-lint]Button[/code] for the [Button]
   * control), as well as the class names of all parent classes (in order of inheritance).
   * When set, this property gives the highest priority to the type of the specified name. This type
   * can in turn extend another type, forming a dependency chain. See [Theme.setTypeVariation]. If the
   * theme item cannot be found using this type or its base types, lookup falls back on the class
   * names.
   * **Note:** To look up [Control]'s own items use various `get_theme_*` methods without specifying
   * `theme_type`.
   * **Note:** Theme items are looked for in the tree order, from branch to root, where each
   * [Control] node is checked for its [theme] property. The earliest match against any type/class name
   * is returned. The project-level Theme and the default Theme are checked last.
   */
  public var themeTypeVariation: StringName
    @JvmName("themeTypeVariationProperty")
    get() = getThemeTypeVariation()
    @JvmName("themeTypeVariationProperty")
    set(`value`) {
      setThemeTypeVariation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONTROL, scriptIndex)
  }

  /**
   * The minimum size of the node's bounding rectangle. If you set it to a value greater than `(0,
   * 0)`, the node's bounding rectangle will always have at least this size. Note that [Control] nodes
   * have their internal minimum size returned by [getMinimumSize]. It depends on the control's
   * contents, like text, textures, or style boxes. The actual minimum size is the maximum value of
   * this property and the internal minimum size (see [getCombinedMinimumSize]).
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
   * val myCoreType = control.customMinimumSize
   * //Your changes
   * control.customMinimumSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customMinimumSizeMutate(block: Vector2.() -> Unit): Vector2 =
      customMinimumSize.apply{
      block(this)
      customMinimumSize = this
  }


  /**
   * The node's scale, relative to its [size]. Change this property to scale the node around its
   * [pivotOffset]. The Control's [tooltipText] will also scale according to this value.
   * **Note:** This property is mainly intended to be used for animation purposes. To support
   * multiple resolutions in your project, use an appropriate viewport stretch mode as described in the
   * [url=$DOCS_URL/tutorials/rendering/multiple_resolutions.html]documentation[/url] instead of
   * scaling Controls individually.
   * **Note:** [FontFile.oversampling] does *not* take [Control] [scale] into account. This means
   * that scaling up/down will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear
   * blurry or pixelated. To ensure text remains crisp regardless of scale, you can enable MSDF font
   * rendering by enabling [ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField]
   * (applies to the default project font only), or enabling **Multichannel Signed Distance Field** in
   * the import options of a DynamicFont for custom fonts. On system fonts,
   * [SystemFont.multichannelSignedDistanceField] can be enabled in the inspector.
   * **Note:** If the Control node is a child of a [Container] node, the scale will be reset to
   * `Vector2(1, 1)` when the scene is instantiated. To set the Control's scale when it's instantiated,
   * wait for one frame using `await get_tree().process_frame` then set its [scale] property.
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
   * val myCoreType = control.scale
   * //Your changes
   * control.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * By default, the node's pivot is its top-left corner. When you change its [rotation] or [scale],
   * it will rotate or scale around this pivot. Set this property to [size] / 2 to pivot around the
   * Control's center.
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
   * val myCoreType = control.pivotOffset
   * //Your changes
   * control.pivotOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun pivotOffsetMutate(block: Vector2.() -> Unit): Vector2 = pivotOffset.apply{
      block(this)
      pivotOffset = this
  }


  /**
   * Virtual method to be implemented by the user. Returns whether the given [point] is inside this
   * control.
   * If not overridden, default behavior is checking if the point is within control's Rect.
   * **Note:** If you want to check if a point is inside the control, you can use
   * `Rect2(Vector2.ZERO, size).has_point(point)`.
   */
  public open fun _hasPoint(point: Vector2): Boolean {
    throw NotImplementedError("_has_point is not implemented for Control")
  }

  /**
   * User defined BiDi algorithm override function.
   * Returns an [Array] of [Vector3i] text ranges and text base directions, in the left-to-right
   * order. Ranges should cover full source [text] without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public open fun _structuredTextParser(args: VariantArray<Any?>, text: String):
      VariantArray<Vector3i> {
    throw NotImplementedError("_structured_text_parser is not implemented for Control")
  }

  /**
   * Virtual method to be implemented by the user. Returns the minimum size for this control.
   * Alternative to [customMinimumSize] for controlling minimum size via code. The actual minimum size
   * will be the max value of these two (in each axis separately).
   * If not overridden, defaults to [Vector2.ZERO].
   * **Note:** This method will not be called when the script is attached to a [Control] node that
   * already overrides its minimum size (e.g. [Label], [Button], [PanelContainer] etc.). It can only be
   * used with most basic GUI nodes, like [Control], [Container], [Panel] etc.
   */
  public open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for Control")
  }

  /**
   * Virtual method to be implemented by the user. Returns the tooltip text for the position
   * [atPosition] in control's local coordinates, which will typically appear when the cursor is
   * resting over this control. See [getTooltip].
   * **Note:** If this method returns an empty [String], no tooltip is displayed.
   */
  public open fun _getTooltip(atPosition: Vector2): String {
    throw NotImplementedError("_get_tooltip is not implemented for Control")
  }

  /**
   * Godot calls this method to get data that can be dragged and dropped onto controls that expect
   * drop data. Returns `null` if there is no data to drag. Controls that want to receive drop data
   * should implement [_canDropData] and [_dropData]. [atPosition] is local to this control. Drag may
   * be forced with [forceDrag].
   * A preview that will follow the mouse that should represent the data can be set with
   * [setDragPreview]. A good time to set the preview is in this method.
   *
   * gdscript:
   * ```gdscript
   * func _get_drag_data(position):
   *     var mydata = make_data() # This is your custom method generating the drag data.
   *     set_drag_preview(make_preview(mydata)) # This is your custom method generating the preview
   * of the drag data.
   *     return mydata
   * ```
   * csharp:
   * ```csharp
   * public override Variant _GetDragData(Vector2 atPosition)
   * {
   *     var myData = MakeData(); // This is your custom method generating the drag data.
   *     SetDragPreview(MakePreview(myData)); // This is your custom method generating the preview
   * of the drag data.
   *     return myData;
   * }
   * ```
   */
  public open fun _getDragData(atPosition: Vector2): Any? {
    throw NotImplementedError("_get_drag_data is not implemented for Control")
  }

  /**
   * Godot calls this method to test if [data] from a control's [_getDragData] can be dropped at
   * [atPosition]. [atPosition] is local to this control.
   * This method should only be used to test the data. Process the data in [_dropData].
   *
   * gdscript:
   * ```gdscript
   * func _can_drop_data(position, data):
   *     # Check position if it is relevant to you
   *     # Otherwise, just check data
   *     return typeof(data) == TYPE_DICTIONARY and data.has("expected")
   * ```
   * csharp:
   * ```csharp
   * public override bool _CanDropData(Vector2 atPosition, Variant data)
   * {
   *     // Check position if it is relevant to you
   *     // Otherwise, just check data
   *     return data.VariantType == Variant.Type.Dictionary &&
   * data.AsGodotDictionary().ContainsKey("expected");
   * }
   * ```
   */
  public open fun _canDropData(atPosition: Vector2, `data`: Any?): Boolean {
    throw NotImplementedError("_can_drop_data is not implemented for Control")
  }

  /**
   * Godot calls this method to pass you the [data] from a control's [_getDragData] result. Godot
   * first calls [_canDropData] to test if [data] is allowed to drop at [atPosition] where [atPosition]
   * is local to this control.
   *
   * gdscript:
   * ```gdscript
   * func _can_drop_data(position, data):
   *     return typeof(data) == TYPE_DICTIONARY and data.has("color")
   *
   * func _drop_data(position, data):
   *     var color = data["color"]
   * ```
   * csharp:
   * ```csharp
   * public override bool _CanDropData(Vector2 atPosition, Variant data)
   * {
   *     return data.VariantType == Variant.Type.Dictionary &&
   * dict.AsGodotDictionary().ContainsKey("color");
   * }
   *
   * public override void _DropData(Vector2 atPosition, Variant data)
   * {
   *     Color color = data.AsGodotDictionary()["color"].AsColor();
   * }
   * ```
   */
  public open fun _dropData(atPosition: Vector2, `data`: Any?): Unit {
  }

  /**
   * Virtual method to be implemented by the user. Returns a [Control] node that should be used as a
   * tooltip instead of the default one. The [forText] includes the contents of the [tooltipText]
   * property.
   * The returned node must be of type [Control] or Control-derived. It can have child nodes of any
   * type. It is freed when the tooltip disappears, so make sure you always provide a new instance (if
   * you want to use a pre-existing node from your scene tree, you can duplicate it and pass the
   * duplicated instance). When `null` or a non-Control node is returned, the default tooltip will be
   * used instead.
   * The returned node will be added as child to a [PopupPanel], so you should only provide the
   * contents of that panel. That [PopupPanel] can be themed using [Theme.setStylebox] for the type
   * `"TooltipPanel"` (see [tooltipText] for an example).
   * **Note:** The tooltip is shrunk to minimal size. If you want to ensure it's fully visible, you
   * might want to set its [customMinimumSize] to some non-zero value.
   * **Note:** The node (and any relevant children) should be [CanvasItem.visible] when returned,
   * otherwise, the viewport that instantiates it will not be able to calculate its minimum size
   * reliably.
   * **Example of usage with a custom-constructed node:**
   *
   * gdscript:
   * ```gdscript
   * func _make_custom_tooltip(for_text):
   *     var label = Label.new()
   *     label.text = for_text
   *     return label
   * ```
   * csharp:
   * ```csharp
   * public override Control _MakeCustomTooltip(string forText)
   * {
   *     var label = new Label();
   *     label.Text = forText;
   *     return label;
   * }
   * ```
   *
   * **Example of usage with a custom scene instance:**
   *
   * gdscript:
   * ```gdscript
   * func _make_custom_tooltip(for_text):
   *     var tooltip = preload("res://some_tooltip_scene.tscn").instantiate()
   *     tooltip.get_node("Label").text = for_text
   *     return tooltip
   * ```
   * csharp:
   * ```csharp
   * public override Control _MakeCustomTooltip(string forText)
   * {
   *     Node tooltip =
   * ResourceLoader.Load<PackedScene>("res://some_tooltip_scene.tscn").Instantiate();
   *     tooltip.GetNode<Label>("Label").Text = forText;
   *     return tooltip;
   * }
   * ```
   */
  public open fun _makeCustomTooltip(forText: String): Object? {
    throw NotImplementedError("_make_custom_tooltip is not implemented for Control")
  }

  /**
   * Virtual method to be implemented by the user. Use this method to process and accept inputs on
   * UI elements. See [acceptEvent].
   * **Example usage for clicking a control:**
   *
   * gdscript:
   * ```gdscript
   * func _gui_input(event):
   *     if event is InputEventMouseButton:
   *         if event.button_index == MOUSE_BUTTON_LEFT and event.pressed:
   *             print("I've been clicked D:")
   * ```
   * csharp:
   * ```csharp
   * public override void _GuiInput(InputEvent @event)
   * {
   *     if (@event is InputEventMouseButton mb)
   *     {
   *         if (mb.ButtonIndex == MouseButton.Left && mb.Pressed)
   *         {
   *             GD.Print("I've been clicked D:");
   *         }
   *     }
   * }
   * ```
   *
   * The event won't trigger if:
   * * clicking outside the control (see [_hasPoint]);
   * * control has [mouseFilter] set to [MOUSE_FILTER_IGNORE];
   * * control is obstructed by another [Control] on top of it, which doesn't have [mouseFilter] set
   * to [MOUSE_FILTER_IGNORE];
   * * control's parent has [mouseFilter] set to [MOUSE_FILTER_STOP] or has accepted the event;
   * * it happens outside the parent's rectangle and the parent has either [clipContents] enabled.
   * **Note:** Event position is relative to the control origin.
   */
  public open fun _guiInput(event: InputEvent?): Unit {
  }

  /**
   * Marks an input event as handled. Once you accept an input event, it stops propagating, even to
   * nodes listening to [Node.UnhandledInput] or [Node.UnhandledKeyInput].
   * **Note:** This does not affect the methods in [Input], only the way events are propagated.
   */
  public fun acceptEvent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.acceptEventPtr, NIL)
  }

  /**
   * Returns the minimum size for this control. See [customMinimumSize].
   */
  public fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns combined minimum size from [customMinimumSize] and [getMinimumSize].
   */
  public fun getCombinedMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCombinedMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the anchors to a [preset] from [Control.LayoutPreset] enum. This is the code equivalent to
   * using the Layout menu in the 2D editor.
   * If [keepOffsets] is `true`, control's position will also be updated.
   */
  @JvmOverloads
  public fun setAnchorsPreset(preset: LayoutPreset, keepOffsets: Boolean = false): Unit {
    TransferContext.writeArguments(LONG to preset.id, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorsPresetPtr, NIL)
  }

  /**
   * Sets the offsets to a [preset] from [Control.LayoutPreset] enum. This is the code equivalent to
   * using the Layout menu in the 2D editor.
   * Use parameter [resizeMode] with constants from [Control.LayoutPresetMode] to better determine
   * the resulting size of the [Control]. Constant size will be ignored if used with presets that
   * change size, e.g. [PRESET_LEFT_WIDE].
   * Use parameter [margin] to determine the gap between the [Control] and the edges.
   */
  @JvmOverloads
  public fun setOffsetsPreset(
    preset: LayoutPreset,
    resizeMode: LayoutPresetMode = Control.LayoutPresetMode.PRESET_MODE_MINSIZE,
    margin: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to preset.id, LONG to resizeMode.id, LONG to margin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetsPresetPtr, NIL)
  }

  /**
   * Sets both anchor preset and offset preset. See [setAnchorsPreset] and [setOffsetsPreset].
   */
  @JvmOverloads
  public fun setAnchorsAndOffsetsPreset(
    preset: LayoutPreset,
    resizeMode: LayoutPresetMode = Control.LayoutPresetMode.PRESET_MODE_MINSIZE,
    margin: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to preset.id, LONG to resizeMode.id, LONG to margin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorsAndOffsetsPresetPtr, NIL)
  }

  /**
   * Sets the anchor for the specified [Side] to [anchor]. A setter method for [anchorBottom],
   * [anchorLeft], [anchorRight] and [anchorTop].
   * If [keepOffset] is `true`, offsets aren't updated after this operation.
   * If [pushOppositeAnchor] is `true` and the opposite anchor overlaps this anchor, the opposite
   * one will have its value overridden. For example, when setting left anchor to 1 and the right
   * anchor has value of 0.5, the right anchor will also get value of 1. If [pushOppositeAnchor] was
   * `false`, the left anchor would get value 0.5.
   */
  @JvmOverloads
  public fun setAnchor(
    side: Side,
    anchor: Float,
    keepOffset: Boolean = false,
    pushOppositeAnchor: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to side.id, DOUBLE to anchor.toDouble(), BOOL to keepOffset, BOOL to pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorPtr, NIL)
  }

  /**
   * Returns the anchor for the specified [Side]. A getter method for [anchorBottom], [anchorLeft],
   * [anchorRight] and [anchorTop].
   */
  public fun getAnchor(side: Side): Float {
    TransferContext.writeArguments(LONG to side.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnchorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the offset for the specified [Side] to [offset]. A setter method for [offsetBottom],
   * [offsetLeft], [offsetRight] and [offsetTop].
   */
  public fun setOffset(side: Side, offset: Float): Unit {
    TransferContext.writeArguments(LONG to side.id, DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  /**
   * Returns the offset for the specified [Side]. A getter method for [offsetBottom], [offsetLeft],
   * [offsetRight] and [offsetTop].
   */
  public fun getOffset(offset: Side): Float {
    TransferContext.writeArguments(LONG to offset.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Works the same as [setAnchor], but instead of `keep_offset` argument and automatic update of
   * offset, it allows to set the offset yourself (see [setOffset]).
   */
  @JvmOverloads
  public fun setAnchorAndOffset(
    side: Side,
    anchor: Float,
    offset: Float,
    pushOppositeAnchor: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to side.id, DOUBLE to anchor.toDouble(), DOUBLE to offset.toDouble(), BOOL to pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, MethodBindings.setAnchorAndOffsetPtr, NIL)
  }

  /**
   * Sets [offsetLeft] and [offsetTop] at the same time. Equivalent of changing [position].
   */
  public fun setBegin(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setBeginPtr, NIL)
  }

  /**
   * Sets [offsetRight] and [offsetBottom] at the same time.
   */
  public fun setEnd(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setEndPtr, NIL)
  }

  /**
   * Sets the [position] to given [position].
   * If [keepOffsets] is `true`, control's anchors will be updated instead of offsets.
   */
  @JvmOverloads
  public fun setPosition(position: Vector2, keepOffsets: Boolean = false): Unit {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  /**
   * Sets the size (see [size]).
   * If [keepOffsets] is `true`, control's anchors will be updated instead of offsets.
   */
  @JvmOverloads
  public fun setSize(size: Vector2, keepOffsets: Boolean = false): Unit {
    TransferContext.writeArguments(VECTOR2 to size, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  /**
   * Resets the size to [getCombinedMinimumSize]. This is equivalent to calling
   * `set_size(Vector2())` (or any size below the minimum).
   */
  public fun resetSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetSizePtr, NIL)
  }

  public fun setCustomMinimumSize(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomMinimumSizePtr, NIL)
  }

  /**
   * Sets the [globalPosition] to given [position].
   * If [keepOffsets] is `true`, control's anchors will be updated instead of offsets.
   */
  @JvmOverloads
  public fun setGlobalPosition(position: Vector2, keepOffsets: Boolean = false): Unit {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepOffsets)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public fun setRotation(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
  }

  public fun setRotationDegrees(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
  }

  public fun setScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
  }

  public fun setPivotOffset(pivotOffset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to pivotOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setPivotOffsetPtr, NIL)
  }

  /**
   * Returns [offsetLeft] and [offsetTop]. See also [position].
   */
  public fun getBegin(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBeginPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns [offsetRight] and [offsetBottom].
   */
  public fun getEnd(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEndPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getRotationDegrees(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun getScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getPivotOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPivotOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getCustomMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomMinimumSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the width/height occupied in the parent control.
   */
  public fun getParentAreaSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentAreaSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public fun getGlobalPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the position of this [Control] in global screen coordinates (i.e. taking window
   * position into account). Mostly useful for editor plugins.
   * Equals to [globalPosition] if the window is embedded (see [Viewport.guiEmbedSubwindows]).
   * **Example usage for showing a popup:**
   * [codeblock]
   * popup_menu.position = get_screen_position() + get_local_mouse_position()
   * popup_menu.reset_size()
   * popup_menu.popup()
   * [/codeblock]
   */
  public fun getScreenPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the position and size of the control in the coordinate system of the containing node.
   * See [position], [scale] and [size].
   * **Note:** If [rotation] is not the default rotation, the resulting size is not meaningful.
   * **Note:** Setting [Viewport.guiSnapControlsToPixels] to `true` can lead to rounding
   * inaccuracies between the displayed control and the returned [Rect2].
   */
  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns the position and size of the control relative to the containing canvas. See
   * [globalPosition] and [size].
   * **Note:** If the node itself or any parent [CanvasItem] between the node and the canvas have a
   * non default rotation or skew, the resulting size is likely not meaningful.
   * **Note:** Setting [Viewport.guiSnapControlsToPixels] to `true` can lead to rounding
   * inaccuracies between the displayed control and the returned [Rect2].
   */
  public fun getGlobalRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setFocusMode(mode: FocusMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusModePtr, NIL)
  }

  public fun getFocusMode(): FocusMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusModePtr, LONG)
    return Control.FocusMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if this is the current focused control. See [focusMode].
   */
  public fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Steal the focus from another control and become the focused control (see [focusMode]).
   * **Note:** Using this method together with [Callable.callDeferred] makes it more reliable,
   * especially when called inside [Node.Ready].
   */
  public fun grabFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.grabFocusPtr, NIL)
  }

  /**
   * Give up the focus. No other control will be able to receive input.
   */
  public fun releaseFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.releaseFocusPtr, NIL)
  }

  /**
   * Finds the previous (above in the tree) [Control] that can receive the focus.
   */
  public fun findPrevValidFocus(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findPrevValidFocusPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Finds the next (below in the tree) [Control] that can receive the focus.
   */
  public fun findNextValidFocus(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.findNextValidFocusPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Finds the next [Control] that can receive the focus on the specified [Side].
   * **Note:** This is different from [getFocusNeighbor], which returns the path of a specified
   * focus neighbor.
   */
  public fun findValidFocusNeighbor(side: Side): Control? {
    TransferContext.writeArguments(LONG to side.id)
    TransferContext.callMethod(rawPtr, MethodBindings.findValidFocusNeighborPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun setHSizeFlags(flags: SizeFlags): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setHSizeFlagsPtr, NIL)
  }

  public fun getHSizeFlags(): SizeFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHSizeFlagsPtr, LONG)
    return SizeFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setStretchRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStretchRatioPtr, NIL)
  }

  public fun getStretchRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStretchRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVSizeFlags(flags: SizeFlags): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setVSizeFlagsPtr, NIL)
  }

  public fun getVSizeFlags(): SizeFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVSizeFlagsPtr, LONG)
    return SizeFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setTheme(theme: Theme?): Unit {
    TransferContext.writeArguments(OBJECT to theme)
    TransferContext.callMethod(rawPtr, MethodBindings.setThemePtr, NIL)
  }

  public fun getTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Theme?)
  }

  public fun setThemeTypeVariation(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.setThemeTypeVariationPtr, NIL)
  }

  public fun getThemeTypeVariation(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeTypeVariationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Prevents `*_theme_*_override` methods from emitting [NOTIFICATION_THEME_CHANGED] until
   * [endBulkThemeOverride] is called.
   */
  public fun beginBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.beginBulkThemeOverridePtr, NIL)
  }

  /**
   * Ends a bulk theme override update. See [beginBulkThemeOverride].
   */
  public fun endBulkThemeOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endBulkThemeOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme icon with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeIconOverride].
   * See also [getThemeIcon].
   */
  public fun addThemeIconOverride(name: StringName, texture: Texture2D?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeIconOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [StyleBox] with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeStyleboxOverride].
   * See also [getThemeStylebox].
   * **Example of modifying a property in a StyleBox by duplicating it:**
   *
   * gdscript:
   * ```gdscript
   * # The snippet below assumes the child node MyButton has a StyleBoxFlat assigned.
   * # Resources are shared across instances, so we need to duplicate it
   * # to avoid modifying the appearance of all other buttons.
   * var new_stylebox_normal = $MyButton.get_theme_stylebox("normal").duplicate()
   * new_stylebox_normal.border_width_top = 3
   * new_stylebox_normal.border_color = Color(0, 1, 0.5)
   * $MyButton.add_theme_stylebox_override("normal", new_stylebox_normal)
   * # Remove the stylebox override.
   * $MyButton.remove_theme_stylebox_override("normal")
   * ```
   * csharp:
   * ```csharp
   * // The snippet below assumes the child node MyButton has a StyleBoxFlat assigned.
   * // Resources are shared across instances, so we need to duplicate it
   * // to avoid modifying the appearance of all other buttons.
   * StyleBoxFlat newStyleboxNormal =
   * GetNode<Button>("MyButton").GetThemeStylebox("normal").Duplicate() as StyleBoxFlat;
   * newStyleboxNormal.BorderWidthTop = 3;
   * newStyleboxNormal.BorderColor = new Color(0, 1, 0.5f);
   * GetNode<Button>("MyButton").AddThemeStyleboxOverride("normal", newStyleboxNormal);
   * // Remove the stylebox override.
   * GetNode<Button>("MyButton").RemoveThemeStyleboxOverride("normal");
   * ```
   */
  public fun addThemeStyleboxOverride(name: StringName, stylebox: StyleBox?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeStyleboxOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [Font] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontOverride].
   * See also [getThemeFont].
   */
  public fun addThemeFontOverride(name: StringName, font: Font?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme font size with the specified [name]. Local overrides
   * always take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeFontSizeOverride].
   * See also [getThemeFontSize].
   */
  public fun addThemeFontSizeOverride(name: StringName, fontSize: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeFontSizeOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme [Color] with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeColorOverride].
   * See also [getThemeColor].
   * **Example of overriding a label's color and resetting it later:**
   *
   * gdscript:
   * ```gdscript
   * # Given the child Label node "MyLabel", override its font color with a custom value.
   * $MyLabel.add_theme_color_override("font_color", Color(1, 0.5, 0))
   * # Reset the font color of the child label.
   * $MyLabel.remove_theme_color_override("font_color")
   * # Alternatively it can be overridden with the default value from the Label type.
   * $MyLabel.add_theme_color_override("font_color", get_theme_color("font_color", "Label"))
   * ```
   * csharp:
   * ```csharp
   * // Given the child Label node "MyLabel", override its font color with a custom value.
   * GetNode<Label>("MyLabel").AddThemeColorOverride("font_color", new Color(1, 0.5f, 0));
   * // Reset the font color of the child label.
   * GetNode<Label>("MyLabel").RemoveThemeColorOverride("font_color");
   * // Alternatively it can be overridden with the default value from the Label type.
   * GetNode<Label>("MyLabel").AddThemeColorOverride("font_color", GetThemeColor("font_color",
   * "Label"));
   * ```
   */
  public fun addThemeColorOverride(name: StringName, color: Color): Unit {
    TransferContext.writeArguments(STRING_NAME to name, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeColorOverridePtr, NIL)
  }

  /**
   * Creates a local override for a theme constant with the specified [name]. Local overrides always
   * take precedence when fetching theme items for the control. An override can be removed with
   * [removeThemeConstantOverride].
   * See also [getThemeConstant].
   */
  public fun addThemeConstantOverride(name: StringName, constant: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to name, LONG to constant.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addThemeConstantOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme icon with the specified [name] previously added by
   * [addThemeIconOverride] or via the Inspector dock.
   */
  public fun removeThemeIconOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeIconOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [StyleBox] with the specified [name] previously added by
   * [addThemeStyleboxOverride] or via the Inspector dock.
   */
  public fun removeThemeStyleboxOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeStyleboxOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [Font] with the specified [name] previously added by
   * [addThemeFontOverride] or via the Inspector dock.
   */
  public fun removeThemeFontOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme font size with the specified [name] previously added by
   * [addThemeFontSizeOverride] or via the Inspector dock.
   */
  public fun removeThemeFontSizeOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeFontSizeOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme [Color] with the specified [name] previously added by
   * [addThemeColorOverride] or via the Inspector dock.
   */
  public fun removeThemeColorOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeColorOverridePtr, NIL)
  }

  /**
   * Removes a local override for a theme constant with the specified [name] previously added by
   * [addThemeConstantOverride] or via the Inspector dock.
   */
  public fun removeThemeConstantOverride(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeThemeConstantOverridePtr, NIL)
  }

  /**
   * Returns an icon from the first matching [Theme] in the tree if that [Theme] has an icon item
   * with the specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun getThemeIcon(name: StringName, themeType: StringName = StringName("")): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns a [StyleBox] from the first matching [Theme] in the tree if that [Theme] has a stylebox
   * item with the specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun getThemeStylebox(name: StringName, themeType: StringName = StringName("")): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StyleBox?)
  }

  /**
   * Returns a [Font] from the first matching [Theme] in the tree if that [Theme] has a font item
   * with the specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun getThemeFont(name: StringName, themeType: StringName = StringName("")): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  /**
   * Returns a font size from the first matching [Theme] in the tree if that [Theme] has a font size
   * item with the specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun getThemeFontSize(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [Color] from the first matching [Theme] in the tree if that [Theme] has a color item
   * with the specified [name] and [themeType]. If [themeType] is omitted the class name of the current
   * control is used as the type, or [themeTypeVariation] if it is defined. If the type is a class name
   * its parent classes are also checked, in order of inheritance. If the type is a variation its base
   * types are checked, in order of dependency, then the control's class name and its parent classes
   * are checked.
   * For the current control its local overrides are considered first (see [addThemeColorOverride]),
   * then its assigned [theme]. After the current control, each parent control and its assigned [theme]
   * are considered; controls without a [theme] assigned are skipped. If no matching [Theme] is found
   * in the tree, the custom project [Theme] (see [ProjectSettings.gui/theme/custom]) and the default
   * [Theme] are used (see [ThemeDB]).
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     # Get the font color defined for the current Control's class, if it exists.
   *     modulate = get_theme_color("font_color")
   *     # Get the font color defined for the Button class.
   *     modulate = get_theme_color("font_color", "Button")
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     // Get the font color defined for the current Control's class, if it exists.
   *     Modulate = GetThemeColor("font_color");
   *     // Get the font color defined for the Button class.
   *     Modulate = GetThemeColor("font_color", "Button");
   * }
   * ```
   */
  @JvmOverloads
  public fun getThemeColor(name: StringName, themeType: StringName = StringName("")): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns a constant from the first matching [Theme] in the tree if that [Theme] has a constant
   * item with the specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun getThemeConstant(name: StringName, themeType: StringName = StringName("")): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if there is a local override for a theme icon with the specified [name] in this
   * [Control] node.
   * See [addThemeIconOverride].
   */
  public fun hasThemeIconOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [StyleBox] with the specified [name] in
   * this [Control] node.
   * See [addThemeStyleboxOverride].
   */
  public fun hasThemeStyleboxOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [Font] with the specified [name] in
   * this [Control] node.
   * See [addThemeFontOverride].
   */
  public fun hasThemeFontOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme font size with the specified [name] in
   * this [Control] node.
   * See [addThemeFontSizeOverride].
   */
  public fun hasThemeFontSizeOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizeOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme [Color] with the specified [name] in
   * this [Control] node.
   * See [addThemeColorOverride].
   */
  public fun hasThemeColorOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a local override for a theme constant with the specified [name] in
   * this [Control] node.
   * See [addThemeConstantOverride].
   */
  public fun hasThemeConstantOverride(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has an icon item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeIcon(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a stylebox item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeStylebox(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeFont(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a font size item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeFontSize(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a color item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeColor(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if there is a matching [Theme] in the tree that has a constant item with the
   * specified [name] and [themeType].
   * See [getThemeColor] for details.
   */
  @JvmOverloads
  public fun hasThemeConstant(name: StringName, themeType: StringName = StringName("")): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the default base scale value from the first matching [Theme] in the tree if that
   * [Theme] has a valid [Theme.defaultBaseScale] value.
   * See [getThemeColor] for details.
   */
  public fun getThemeDefaultBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the default font from the first matching [Theme] in the tree if that [Theme] has a
   * valid [Theme.defaultFont] value.
   * See [getThemeColor] for details.
   */
  public fun getThemeDefaultFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  /**
   * Returns the default font size value from the first matching [Theme] in the tree if that [Theme]
   * has a valid [Theme.defaultFontSize] value.
   * See [getThemeColor] for details.
   */
  public fun getThemeDefaultFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeDefaultFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the parent control node.
   */
  public fun getParentControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  public fun setHGrowDirection(direction: GrowDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setHGrowDirectionPtr, NIL)
  }

  public fun getHGrowDirection(): GrowDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHGrowDirectionPtr, LONG)
    return Control.GrowDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setVGrowDirection(direction: GrowDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setVGrowDirectionPtr, NIL)
  }

  public fun getVGrowDirection(): GrowDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVGrowDirectionPtr, LONG)
    return Control.GrowDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setTooltipText(hint: String): Unit {
    TransferContext.writeArguments(STRING to hint)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipTextPtr, NIL)
  }

  public fun getTooltipText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the tooltip text for the position [atPosition] in control's local coordinates, which
   * will typically appear when the cursor is resting over this control. By default, it returns
   * [tooltipText].
   * This method can be overridden to customize its behavior. See [_getTooltip].
   * **Note:** If this method returns an empty [String], no tooltip is displayed.
   */
  @JvmOverloads
  public fun getTooltip(atPosition: Vector2 = Vector2(0, 0)): String {
    TransferContext.writeArguments(VECTOR2 to atPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setDefaultCursorShape(shape: CursorShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultCursorShapePtr, NIL)
  }

  public fun getDefaultCursorShape(): CursorShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultCursorShapePtr, LONG)
    return Control.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the mouse cursor shape the control displays on mouse hover. See [CursorShape].
   */
  @JvmOverloads
  public fun getCursorShape(position: Vector2 = Vector2(0, 0)): CursorShape {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getCursorShapePtr, LONG)
    return Control.CursorShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the focus neighbor for the specified [Side] to the [Control] at [neighbor] node path. A
   * setter method for [focusNeighborBottom], [focusNeighborLeft], [focusNeighborRight] and
   * [focusNeighborTop].
   */
  public fun setFocusNeighbor(side: Side, neighbor: NodePath): Unit {
    TransferContext.writeArguments(LONG to side.id, NODE_PATH to neighbor)
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusNeighborPtr, NIL)
  }

  /**
   * Returns the focus neighbor for the specified [Side]. A getter method for [focusNeighborBottom],
   * [focusNeighborLeft], [focusNeighborRight] and [focusNeighborTop].
   * **Note:** To find the next [Control] on the specific [Side], even if a neighbor is not
   * assigned, use [findValidFocusNeighbor].
   */
  public fun getFocusNeighbor(side: Side): NodePath {
    TransferContext.writeArguments(LONG to side.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusNeighborPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setFocusNext(next: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to next)
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusNextPtr, NIL)
  }

  public fun getFocusNext(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusNextPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setFocusPrevious(previous: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to previous)
    TransferContext.callMethod(rawPtr, MethodBindings.setFocusPreviousPtr, NIL)
  }

  public fun getFocusPrevious(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFocusPreviousPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Forces drag and bypasses [_getDragData] and [setDragPreview] by passing [data] and [preview].
   * Drag will start even if the mouse is neither over nor pressed on this control.
   * The methods [_canDropData] and [_dropData] must be implemented on controls that want to receive
   * drop data.
   */
  public fun forceDrag(`data`: Any?, preview: Control?): Unit {
    TransferContext.writeArguments(ANY to data, OBJECT to preview)
    TransferContext.callMethod(rawPtr, MethodBindings.forceDragPtr, NIL)
  }

  public fun setMouseFilter(filter: MouseFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMouseFilterPtr, NIL)
  }

  public fun getMouseFilter(): MouseFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMouseFilterPtr, LONG)
    return Control.MouseFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setForcePassScrollEvents(forcePassScrollEvents: Boolean): Unit {
    TransferContext.writeArguments(BOOL to forcePassScrollEvents)
    TransferContext.callMethod(rawPtr, MethodBindings.setForcePassScrollEventsPtr, NIL)
  }

  public fun isForcePassScrollEvents(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isForcePassScrollEventsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setClipContents(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setClipContentsPtr, NIL)
  }

  public fun isClippingContents(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isClippingContentsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates an [InputEventMouseButton] that attempts to click the control. If the event is
   * received, the control acquires focus.
   *
   * gdscript:
   * ```gdscript
   * func _process(delta):
   *     grab_click_focus() # When clicking another Control node, this node will be clicked instead.
   * ```
   * csharp:
   * ```csharp
   * public override void _Process(double delta)
   * {
   *     GrabClickFocus(); // When clicking another Control node, this node will be clicked instead.
   * }
   * ```
   */
  public fun grabClickFocus(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.grabClickFocusPtr, NIL)
  }

  /**
   * Forwards the handling of this control's [_getDragData],  [_canDropData] and [_dropData] virtual
   * functions to delegate callables.
   * For each argument, if not empty, the delegate callable is used, otherwise the local (virtual)
   * function is used.
   * The function format for each callable should be exactly the same as the virtual functions
   * described above.
   */
  public fun setDragForwarding(
    dragFunc: Callable,
    canDropFunc: Callable,
    dropFunc: Callable,
  ): Unit {
    TransferContext.writeArguments(CALLABLE to dragFunc, CALLABLE to canDropFunc, CALLABLE to dropFunc)
    TransferContext.callMethod(rawPtr, MethodBindings.setDragForwardingPtr, NIL)
  }

  /**
   * Shows the given control at the mouse pointer. A good time to call this method is in
   * [_getDragData]. The control must not be in the scene tree. You should not free the control, and
   * you should not keep a reference to the control beyond the duration of the drag. It will be deleted
   * automatically after the drag has ended.
   *
   * gdscript:
   * ```gdscript
   * @export var color = Color(1, 0, 0, 1)
   *
   * func _get_drag_data(position):
   *     # Use a control that is not in the tree
   *     var cpb = ColorPickerButton.new()
   *     cpb.color = color
   *     cpb.size = Vector2(50, 50)
   *     set_drag_preview(cpb)
   *     return color
   * ```
   * csharp:
   * ```csharp
   * [Export]
   * private Color _color = new Color(1, 0, 0, 1);
   *
   * public override Variant _GetDragData(Vector2 atPosition)
   * {
   *     // Use a control that is not in the tree
   *     var cpb = new ColorPickerButton();
   *     cpb.Color = _color;
   *     cpb.Size = new Vector2(50, 50);
   *     SetDragPreview(cpb);
   *     return _color;
   * }
   * ```
   */
  public fun setDragPreview(control: Control?): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.setDragPreviewPtr, NIL)
  }

  /**
   * Returns `true` if a drag operation is successful. Alternative to
   * [Viewport.guiIsDragSuccessful].
   * Best used with [Node.NOTIFICATION_DRAG_END].
   */
  public fun isDragSuccessful(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDragSuccessfulPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Moves the mouse cursor to [position], relative to [position] of this [Control].
   * **Note:** [warpMouse] is only supported on Windows, macOS and Linux. It has no effect on
   * Android, iOS and Web.
   */
  public fun warpMouse(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.warpMousePtr, NIL)
  }

  public fun setShortcutContext(node: Node?): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setShortcutContextPtr, NIL)
  }

  public fun getShortcutContext(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShortcutContextPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Invalidates the size cache in this node and in parent nodes up to top level. Intended to be
   * used with [getMinimumSize] when the return value is changed. Setting [customMinimumSize] directly
   * calls this method automatically.
   */
  public fun updateMinimumSize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateMinimumSizePtr, NIL)
  }

  public fun setLayoutDirection(direction: LayoutDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayoutDirectionPtr, NIL)
  }

  public fun getLayoutDirection(): LayoutDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayoutDirectionPtr, LONG)
    return Control.LayoutDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if layout is right-to-left.
   */
  public fun isLayoutRtl(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLayoutRtlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setAutoTranslate(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoTranslatePtr, NIL)
  }

  public fun isAutoTranslating(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAutoTranslatingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLocalizeNumeralSystem(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLocalizeNumeralSystemPtr, NIL)
  }

  public fun isLocalizingNumeralSystem(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLocalizingNumeralSystemPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class FocusMode(
    id: Long,
  ) {
    /**
     * The node cannot grab focus. Use with [focusMode].
     */
    FOCUS_NONE(0),
    /**
     * The node can only grab focus on mouse clicks. Use with [focusMode].
     */
    FOCUS_CLICK(1),
    /**
     * The node can grab focus on mouse click, using the arrows and the Tab keys on the keyboard, or
     * using the D-pad buttons on a gamepad. Use with [focusMode].
     */
    FOCUS_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FocusMode = entries.single { it.id == `value` }
    }
  }

  public enum class CursorShape(
    id: Long,
  ) {
    /**
     * Show the system's arrow mouse cursor when the user hovers the node. Use with
     * [mouseDefaultCursorShape].
     */
    CURSOR_ARROW(0),
    /**
     * Show the system's I-beam mouse cursor when the user hovers the node. The I-beam pointer has a
     * shape similar to "I". It tells the user they can highlight or insert text.
     */
    CURSOR_IBEAM(1),
    /**
     * Show the system's pointing hand mouse cursor when the user hovers the node.
     */
    CURSOR_POINTING_HAND(2),
    /**
     * Show the system's cross mouse cursor when the user hovers the node.
     */
    CURSOR_CROSS(3),
    /**
     * Show the system's wait mouse cursor when the user hovers the node. Often an hourglass.
     */
    CURSOR_WAIT(4),
    /**
     * Show the system's busy mouse cursor when the user hovers the node. Often an arrow with a
     * small hourglass.
     */
    CURSOR_BUSY(5),
    /**
     * Show the system's drag mouse cursor, often a closed fist or a cross symbol, when the user
     * hovers the node. It tells the user they're currently dragging an item, like a node in the Scene
     * dock.
     */
    CURSOR_DRAG(6),
    /**
     * Show the system's drop mouse cursor when the user hovers the node. It can be an open hand. It
     * tells the user they can drop an item they're currently grabbing, like a node in the Scene dock.
     */
    CURSOR_CAN_DROP(7),
    /**
     * Show the system's forbidden mouse cursor when the user hovers the node. Often a crossed
     * circle.
     */
    CURSOR_FORBIDDEN(8),
    /**
     * Show the system's vertical resize mouse cursor when the user hovers the node. A double-headed
     * vertical arrow. It tells the user they can resize the window or the panel vertically.
     */
    CURSOR_VSIZE(9),
    /**
     * Show the system's horizontal resize mouse cursor when the user hovers the node. A
     * double-headed horizontal arrow. It tells the user they can resize the window or the panel
     * horizontally.
     */
    CURSOR_HSIZE(10),
    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a
     * double-headed arrow that goes from the bottom left to the top right. It tells the user they can
     * resize the window or the panel both horizontally and vertically.
     */
    CURSOR_BDIAGSIZE(11),
    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a
     * double-headed arrow that goes from the top left to the bottom right, the opposite of
     * [CURSOR_BDIAGSIZE]. It tells the user they can resize the window or the panel both horizontally
     * and vertically.
     */
    CURSOR_FDIAGSIZE(12),
    /**
     * Show the system's move mouse cursor when the user hovers the node. It shows 2 double-headed
     * arrows at a 90 degree angle. It tells the user they can move a UI element freely.
     */
    CURSOR_MOVE(13),
    /**
     * Show the system's vertical split mouse cursor when the user hovers the node. On Windows, it's
     * the same as [CURSOR_VSIZE].
     */
    CURSOR_VSPLIT(14),
    /**
     * Show the system's horizontal split mouse cursor when the user hovers the node. On Windows,
     * it's the same as [CURSOR_HSIZE].
     */
    CURSOR_HSPLIT(15),
    /**
     * Show the system's help mouse cursor when the user hovers the node, a question mark.
     */
    CURSOR_HELP(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CursorShape = entries.single { it.id == `value` }
    }
  }

  public enum class LayoutPreset(
    id: Long,
  ) {
    /**
     * Snap all 4 anchors to the top-left of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_TOP_LEFT(0),
    /**
     * Snap all 4 anchors to the top-right of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_TOP_RIGHT(1),
    /**
     * Snap all 4 anchors to the bottom-left of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_BOTTOM_LEFT(2),
    /**
     * Snap all 4 anchors to the bottom-right of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_BOTTOM_RIGHT(3),
    /**
     * Snap all 4 anchors to the center of the left edge of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_CENTER_LEFT(4),
    /**
     * Snap all 4 anchors to the center of the top edge of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_CENTER_TOP(5),
    /**
     * Snap all 4 anchors to the center of the right edge of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_CENTER_RIGHT(6),
    /**
     * Snap all 4 anchors to the center of the bottom edge of the parent control's bounds. Use with
     * [setAnchorsPreset].
     */
    PRESET_CENTER_BOTTOM(7),
    /**
     * Snap all 4 anchors to the center of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER(8),
    /**
     * Snap all 4 anchors to the left edge of the parent control. The left offset becomes relative
     * to the left edge and the top offset relative to the top left corner of the node's parent. Use
     * with [setAnchorsPreset].
     */
    PRESET_LEFT_WIDE(9),
    /**
     * Snap all 4 anchors to the top edge of the parent control. The left offset becomes relative to
     * the top left corner, the top offset relative to the top edge, and the right offset relative to
     * the top right corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_TOP_WIDE(10),
    /**
     * Snap all 4 anchors to the right edge of the parent control. The right offset becomes relative
     * to the right edge and the top offset relative to the top right corner of the node's parent. Use
     * with [setAnchorsPreset].
     */
    PRESET_RIGHT_WIDE(11),
    /**
     * Snap all 4 anchors to the bottom edge of the parent control. The left offset becomes relative
     * to the bottom left corner, the bottom offset relative to the bottom edge, and the right offset
     * relative to the bottom right corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_BOTTOM_WIDE(12),
    /**
     * Snap all 4 anchors to a vertical line that cuts the parent control in half. Use with
     * [setAnchorsPreset].
     */
    PRESET_VCENTER_WIDE(13),
    /**
     * Snap all 4 anchors to a horizontal line that cuts the parent control in half. Use with
     * [setAnchorsPreset].
     */
    PRESET_HCENTER_WIDE(14),
    /**
     * Snap all 4 anchors to the respective corners of the parent control. Set all 4 offsets to 0
     * after you applied this preset and the [Control] will fit its parent control. Use with
     * [setAnchorsPreset].
     */
    PRESET_FULL_RECT(15),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutPreset = entries.single { it.id == `value` }
    }
  }

  public enum class LayoutPresetMode(
    id: Long,
  ) {
    /**
     * The control will be resized to its minimum size.
     */
    PRESET_MODE_MINSIZE(0),
    /**
     * The control's width will not change.
     */
    PRESET_MODE_KEEP_WIDTH(1),
    /**
     * The control's height will not change.
     */
    PRESET_MODE_KEEP_HEIGHT(2),
    /**
     * The control's size will not change.
     */
    PRESET_MODE_KEEP_SIZE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayoutPresetMode = entries.single { it.id == `value` }
    }
  }

  public sealed interface SizeFlags {
    public val flag: Long

    public infix fun or(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): SizeFlags = SizeFlagsValue(flag.or(other))

    public infix fun xor(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): SizeFlags = SizeFlagsValue(flag.xor(other))

    public infix fun and(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): SizeFlags = SizeFlagsValue(flag.and(other))

    public operator fun plus(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): SizeFlags = SizeFlagsValue(flag.plus(other))

    public operator fun minus(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): SizeFlags = SizeFlagsValue(flag.minus(other))

    public operator fun times(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): SizeFlags = SizeFlagsValue(flag.times(other))

    public operator fun div(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): SizeFlags = SizeFlagsValue(flag.div(other))

    public operator fun rem(other: SizeFlags): SizeFlags = SizeFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): SizeFlags = SizeFlagsValue(flag.rem(other))

    public fun unaryPlus(): SizeFlags = SizeFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): SizeFlags = SizeFlagsValue(flag.unaryMinus())

    public fun inv(): SizeFlags = SizeFlagsValue(flag.inv())

    public infix fun shl(bits: Int): SizeFlags = SizeFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): SizeFlags = SizeFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): SizeFlags = SizeFlagsValue(flag ushr bits)

    public companion object {
      public val SIZE_SHRINK_BEGIN: SizeFlags = SizeFlagsValue(0)

      public val SIZE_FILL: SizeFlags = SizeFlagsValue(1)

      public val SIZE_EXPAND: SizeFlags = SizeFlagsValue(2)

      public val SIZE_EXPAND_FILL: SizeFlags = SizeFlagsValue(3)

      public val SIZE_SHRINK_CENTER: SizeFlags = SizeFlagsValue(4)

      public val SIZE_SHRINK_END: SizeFlags = SizeFlagsValue(8)
    }
  }

  @JvmInline
  internal value class SizeFlagsValue internal constructor(
    public override val flag: Long,
  ) : SizeFlags

  public enum class MouseFilter(
    id: Long,
  ) {
    /**
     * The control will receive mouse movement input events and mouse button input events if clicked
     * on through [_guiInput]. And the control will receive the [signal mouse_entered] and [signal
     * mouse_exited] signals. These events are automatically marked as handled, and they will not
     * propagate further to other controls. This also results in blocking signals in other controls.
     */
    MOUSE_FILTER_STOP(0),
    /**
     * The control will receive mouse movement input events and mouse button input events if clicked
     * on through [_guiInput]. And the control will receive the [signal mouse_entered] and [signal
     * mouse_exited] signals. If this control does not handle the event, the parent control (if any)
     * will be considered, and so on until there is no more parent control to potentially handle it.
     * This also allows signals to fire in other controls. If no control handled it, the event will be
     * passed to [Node.ShortcutInput] for further processing.
     */
    MOUSE_FILTER_PASS(1),
    /**
     * The control will not receive mouse movement input events and mouse button input events if
     * clicked on through [_guiInput]. The control will also not receive the [signal mouse_entered] nor
     * [signal mouse_exited] signals. This will not block other controls from receiving these events or
     * firing the signals. Ignored events will not be handled automatically.
     * **Note:** If the control has received [signal mouse_entered] but not [signal mouse_exited],
     * changing the [mouseFilter] to [MOUSE_FILTER_IGNORE] will cause [signal mouse_exited] to be
     * emitted.
     */
    MOUSE_FILTER_IGNORE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MouseFilter = entries.single { it.id == `value` }
    }
  }

  public enum class GrowDirection(
    id: Long,
  ) {
    /**
     * The control will grow to the left or top to make up if its minimum size is changed to be
     * greater than its current size on the respective axis.
     */
    GROW_DIRECTION_BEGIN(0),
    /**
     * The control will grow to the right or bottom to make up if its minimum size is changed to be
     * greater than its current size on the respective axis.
     */
    GROW_DIRECTION_END(1),
    /**
     * The control will grow in both directions equally to make up if its minimum size is changed to
     * be greater than its current size.
     */
    GROW_DIRECTION_BOTH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GrowDirection = entries.single { it.id == `value` }
    }
  }

  public enum class Anchor(
    id: Long,
  ) {
    /**
     * Snaps one of the 4 anchor's sides to the origin of the node's `Rect`, in the top left. Use it
     * with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at once,
     * use [setAnchorsPreset].
     */
    ANCHOR_BEGIN(0),
    /**
     * Snaps one of the 4 anchor's sides to the end of the node's `Rect`, in the bottom right. Use
     * it with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at
     * once, use [setAnchorsPreset].
     */
    ANCHOR_END(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Anchor = entries.single { it.id == `value` }
    }
  }

  public enum class LayoutDirection(
    id: Long,
  ) {
    /**
     * Automatic layout direction, determined from the parent control layout direction.
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
      public fun from(`value`: Long): LayoutDirection = entries.single { it.id == `value` }
    }
  }

  public enum class TextDirection(
    id: Long,
  ) {
    /**
     * Text writing direction is the same as layout direction.
     */
    TEXT_DIRECTION_INHERITED(3),
    /**
     * Automatic text writing direction, determined from the current locale and text content.
     */
    TEXT_DIRECTION_AUTO(0),
    /**
     * Left-to-right text writing direction.
     */
    TEXT_DIRECTION_LTR(1),
    /**
     * Right-to-left text writing direction.
     */
    TEXT_DIRECTION_RTL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextDirection = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sent when the node changes size. Use [size] to get the new size.
     */
    public final const val NOTIFICATION_RESIZED: Long = 40

    /**
     * Sent when the mouse cursor enters the control's (or any child control's) visible area, that
     * is not occluded behind other Controls or Windows, provided its [mouseFilter] lets the event
     * reach it and regardless if it's currently focused or not.
     * **Note:** [CanvasItem.zIndex] doesn't affect which Control receives the notification.
     * See also [NOTIFICATION_MOUSE_ENTER_SELF].
     */
    public final const val NOTIFICATION_MOUSE_ENTER: Long = 41

    /**
     * Sent when the mouse cursor leaves the control's (and all child control's) visible area, that
     * is not occluded behind other Controls or Windows, provided its [mouseFilter] lets the event
     * reach it and regardless if it's currently focused or not.
     * **Note:** [CanvasItem.zIndex] doesn't affect which Control receives the notification.
     * See also [NOTIFICATION_MOUSE_EXIT_SELF].
     */
    public final const val NOTIFICATION_MOUSE_EXIT: Long = 42

    /**
     * Sent when the mouse cursor enters the control's visible area, that is not occluded behind
     * other Controls or Windows, provided its [mouseFilter] lets the event reach it and regardless if
     * it's currently focused or not.
     * **Note:** [CanvasItem.zIndex] doesn't affect which Control receives the notification.
     * See also [NOTIFICATION_MOUSE_ENTER].
     */
    public final const val NOTIFICATION_MOUSE_ENTER_SELF: Long = 60

    /**
     * Sent when the mouse cursor leaves the control's visible area, that is not occluded behind
     * other Controls or Windows, provided its [mouseFilter] lets the event reach it and regardless if
     * it's currently focused or not.
     * **Note:** [CanvasItem.zIndex] doesn't affect which Control receives the notification.
     * See also [NOTIFICATION_MOUSE_EXIT].
     */
    public final const val NOTIFICATION_MOUSE_EXIT_SELF: Long = 61

    /**
     * Sent when the node grabs focus.
     */
    public final const val NOTIFICATION_FOCUS_ENTER: Long = 43

    /**
     * Sent when the node loses focus.
     */
    public final const val NOTIFICATION_FOCUS_EXIT: Long = 44

    /**
     * Sent when the node needs to refresh its theme items. This happens in one of the following
     * cases:
     * - The [theme] property is changed on this node or any of its ancestors.
     * - The [themeTypeVariation] property is changed on this node.
     * - One of the node's theme property overrides is changed.
     * - The node enters the scene tree.
     * **Note:** As an optimization, this notification won't be sent from changes that occur while
     * this node is outside of the scene tree. Instead, all of the theme item updates can be applied at
     * once when the node enters the scene tree.
     * **Note:** This notification is received alongside [Node.NOTIFICATION_ENTER_TREE], so if you
     * are instantiating a scene, the child nodes will not be initialized yet. You can use it to setup
     * theming for this node, child nodes created from script, or if you want to access child nodes
     * added in the editor, make sure the node is ready using [Node.isNodeReady].
     * [codeblock]
     * func _notification(what):
     *     if what == NOTIFICATION_THEME_CHANGED:
     *         if not is_node_ready():
     *             await ready # Wait until ready signal.
     *         $Label.add_theme_color_override("font_color", Color.YELLOW)
     * [/codeblock]
     */
    public final const val NOTIFICATION_THEME_CHANGED: Long = 45

    /**
     * Sent when this node is inside a [ScrollContainer] which has begun being scrolled when
     * dragging the scrollable area *with a touch event*. This notification is *not* sent when
     * scrolling by dragging the scrollbar, scrolling with the mouse wheel or scrolling with
     * keyboard/gamepad events.
     * **Note:** This signal is only emitted on Android or iOS, or on desktop/web platforms when
     * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is enabled.
     */
    public final const val NOTIFICATION_SCROLL_BEGIN: Long = 47

    /**
     * Sent when this node is inside a [ScrollContainer] which has stopped being scrolled when
     * dragging the scrollable area *with a touch event*. This notification is *not* sent when
     * scrolling by dragging the scrollbar, scrolling with the mouse wheel or scrolling with
     * keyboard/gamepad events.
     * **Note:** This signal is only emitted on Android or iOS, or on desktop/web platforms when
     * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is enabled.
     */
    public final const val NOTIFICATION_SCROLL_END: Long = 48

    /**
     * Sent when control layout direction is changed.
     */
    public final const val NOTIFICATION_LAYOUT_DIRECTION_CHANGED: Long = 49
  }

  internal object MethodBindings {
    public val acceptEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "accept_event", 3218959716)

    public val getMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_minimum_size", 3341600327)

    public val getCombinedMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_combined_minimum_size", 3341600327)

    public val setAnchorsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchors_preset", 509135270)

    public val setOffsetsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_offsets_preset", 3724524307)

    public val setAnchorsAndOffsetsPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchors_and_offsets_preset", 3724524307)

    public val setAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchor", 2302782885)

    public val getAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_anchor", 2869120046)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_offset", 4290182280)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_offset", 2869120046)

    public val setAnchorAndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_anchor_and_offset", 4031722181)

    public val setBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_begin", 743155724)

    public val setEndPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_end", 743155724)

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_position", 2436320129)

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "set_size", 2436320129)

    public val resetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "reset_size", 3218959716)

    public val setCustomMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_custom_minimum_size", 743155724)

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_global_position", 2436320129)

    public val setRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_rotation", 373806689)

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_rotation_degrees", 373806689)

    public val setScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_scale", 743155724)

    public val setPivotOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_pivot_offset", 743155724)

    public val getBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_begin", 3341600327)

    public val getEndPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_end", 3341600327)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_position", 3341600327)

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_size", 3341600327)

    public val getRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_rotation", 1740695150)

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_rotation_degrees", 1740695150)

    public val getScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_scale", 3341600327)

    public val getPivotOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_pivot_offset", 3341600327)

    public val getCustomMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_custom_minimum_size", 3341600327)

    public val getParentAreaSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_parent_area_size", 3341600327)

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_global_position", 3341600327)

    public val getScreenPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_screen_position", 3341600327)

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "get_rect", 1639390495)

    public val getGlobalRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_global_rect", 1639390495)

    public val setFocusModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_mode", 3232914922)

    public val getFocusModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_mode", 2132829277)

    public val hasFocusPtr: VoidPtr = TypeManager.getMethodBindPtr("Control", "has_focus", 36873697)

    public val grabFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "grab_focus", 3218959716)

    public val releaseFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "release_focus", 3218959716)

    public val findPrevValidFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "find_prev_valid_focus", 2783021301)

    public val findNextValidFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "find_next_valid_focus", 2783021301)

    public val findValidFocusNeighborPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "find_valid_focus_neighbor", 1543910170)

    public val setHSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_h_size_flags", 394851643)

    public val getHSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_h_size_flags", 3781367401)

    public val setStretchRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_stretch_ratio", 373806689)

    public val getStretchRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_stretch_ratio", 1740695150)

    public val setVSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_v_size_flags", 394851643)

    public val getVSizeFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_v_size_flags", 3781367401)

    public val setThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_theme", 2326690814)

    public val getThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme", 3846893731)

    public val setThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_theme_type_variation", 3304788590)

    public val getThemeTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_type_variation", 2002593661)

    public val beginBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "begin_bulk_theme_override", 3218959716)

    public val endBulkThemeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "end_bulk_theme_override", 3218959716)

    public val addThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_icon_override", 1373065600)

    public val addThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_stylebox_override", 4188838905)

    public val addThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_font_override", 3518018674)

    public val addThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_font_size_override", 2415702435)

    public val addThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_color_override", 4260178595)

    public val addThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "add_theme_constant_override", 2415702435)

    public val removeThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_icon_override", 3304788590)

    public val removeThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_stylebox_override", 3304788590)

    public val removeThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_font_override", 3304788590)

    public val removeThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_font_size_override", 3304788590)

    public val removeThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_color_override", 3304788590)

    public val removeThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "remove_theme_constant_override", 3304788590)

    public val getThemeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_icon", 2336455395)

    public val getThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_stylebox", 2759935355)

    public val getThemeFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_font", 387378635)

    public val getThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_font_size", 229578101)

    public val getThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_color", 2377051548)

    public val getThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_constant", 229578101)

    public val hasThemeIconOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_icon_override", 2619796661)

    public val hasThemeStyleboxOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_stylebox_override", 2619796661)

    public val hasThemeFontOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_override", 2619796661)

    public val hasThemeFontSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_size_override", 2619796661)

    public val hasThemeColorOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_color_override", 2619796661)

    public val hasThemeConstantOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_constant_override", 2619796661)

    public val hasThemeIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_icon", 1187511791)

    public val hasThemeStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_stylebox", 1187511791)

    public val hasThemeFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font", 1187511791)

    public val hasThemeFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_font_size", 1187511791)

    public val hasThemeColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_color", 1187511791)

    public val hasThemeConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "has_theme_constant", 1187511791)

    public val getThemeDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_base_scale", 1740695150)

    public val getThemeDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_font", 3229501585)

    public val getThemeDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_theme_default_font_size", 3905245786)

    public val getParentControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_parent_control", 2783021301)

    public val setHGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_h_grow_direction", 2022385301)

    public val getHGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_h_grow_direction", 3635610155)

    public val setVGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_v_grow_direction", 2022385301)

    public val getVGrowDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_v_grow_direction", 3635610155)

    public val setTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_tooltip_text", 83702148)

    public val getTooltipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_tooltip_text", 201670096)

    public val getTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_tooltip", 2895288280)

    public val setDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_default_cursor_shape", 217062046)

    public val getDefaultCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_default_cursor_shape", 2359535750)

    public val getCursorShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_cursor_shape", 1395773853)

    public val setFocusNeighborPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_neighbor", 2024461774)

    public val getFocusNeighborPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_neighbor", 2757935761)

    public val setFocusNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_next", 1348162250)

    public val getFocusNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_next", 4075236667)

    public val setFocusPreviousPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_focus_previous", 1348162250)

    public val getFocusPreviousPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_focus_previous", 4075236667)

    public val forceDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "force_drag", 3191844692)

    public val setMouseFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_mouse_filter", 3891156122)

    public val getMouseFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_mouse_filter", 1572545674)

    public val setForcePassScrollEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_force_pass_scroll_events", 2586408642)

    public val isForcePassScrollEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_force_pass_scroll_events", 36873697)

    public val setClipContentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_clip_contents", 2586408642)

    public val isClippingContentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_clipping_contents", 2240911060)

    public val grabClickFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "grab_click_focus", 3218959716)

    public val setDragForwardingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_drag_forwarding", 1076571380)

    public val setDragPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_drag_preview", 1496901182)

    public val isDragSuccessfulPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_drag_successful", 36873697)

    public val warpMousePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "warp_mouse", 743155724)

    public val setShortcutContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_shortcut_context", 1078189570)

    public val getShortcutContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_shortcut_context", 3160264692)

    public val updateMinimumSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "update_minimum_size", 3218959716)

    public val setLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_layout_direction", 3310692370)

    public val getLayoutDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "get_layout_direction", 1546772008)

    public val isLayoutRtlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_layout_rtl", 36873697)

    public val setAutoTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_auto_translate", 2586408642)

    public val isAutoTranslatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_auto_translating", 36873697)

    public val setLocalizeNumeralSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "set_localize_numeral_system", 2586408642)

    public val isLocalizingNumeralSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Control", "is_localizing_numeral_system", 36873697)
  }
}

public infix fun Long.or(other: godot.Control.SizeFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.Control.SizeFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.Control.SizeFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.Control.SizeFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.Control.SizeFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: godot.Control.SizeFlags): Long = this.times(other.flag)

public operator fun Long.div(other: godot.Control.SizeFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.Control.SizeFlags): Long = this.rem(other.flag)
