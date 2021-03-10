// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Control
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit

/**
 * All user interface nodes inherit from Control. A control's anchors and margins adapt its position and size relative to its parent.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/gui/index.html](https://docs.godotengine.org/en/latest/tutorials/gui/index.html)
 * [https://docs.godotengine.org/en/latest/tutorials/2d/custom_drawing_in_2d.html](https://docs.godotengine.org/en/latest/tutorials/2d/custom_drawing_in_2d.html)
 *
 * Base class for all UI-related nodes. [godot.Control] features a bounding rectangle that defines its extents, an anchor position relative to its parent control or the current viewport, and margins that represent an offset to the anchor. The margins update automatically when the node, any of its parents, or the screen size change.
 *
 * For more information on Godot's UI system, anchors, margins, and containers, see the related tutorials in the manual. To build flexible UIs, you'll need a mix of UI elements that inherit from [godot.Control] and [godot.Container] nodes.
 *
 * **User Interface nodes and input**
 *
 * Godot sends input events to the scene's root node first, by calling [godot.Node.Input]. [godot.Node.Input] forwards the event down the node tree to the nodes under the mouse cursor, or on keyboard focus. To do so, it calls [godot.MainLoop.InputEvent]. Call [acceptEvent] so no other node receives the event. Once you accepted an input, it becomes handled so [godot.Node.UnhandledInput] will not process it.
 *
 * Only one [godot.Control] node can be in keyboard focus. Only the node in focus will receive keyboard events. To get the focus, call [grabFocus]. [godot.Control] nodes lose focus when another node grabs it, or if you hide the node in focus.
 *
 * Sets [mouseFilter] to [MOUSE_FILTER_IGNORE] to tell a [godot.Control] node to ignore mouse or touch events. You'll need it if you place an icon on top of a button.
 *
 * [godot.Theme] resources change the Control's appearance. If you change the [godot.Theme] on a [godot.Control] node, it affects all of its children. To override some of the theme's parameters, call one of the `add_*_override` methods, like [addFontOverride]. You can override the theme with the inspector.
 *
 * **Note:** Theme items are *not* [godot.Object] properties. This means you can't access their values using [godot.Object.get] and [godot.Object.set]. Instead, use [getColor], [getConstant], [getFont], [getIcon], [getStylebox], and the `add_*_override` methods provided by this class.
 */
@GodotBaseType
open class Control : CanvasItem() {
  /**
   * Emitted when the node gains keyboard focus.
   */
  val focusEntered: Signal0 by signal()

  /**
   * Emitted when the node loses keyboard focus.
   */
  val focusExited: Signal0 by signal()

  /**
   * Emitted when the node receives an [godot.InputEvent].
   */
  val guiInput: Signal1<InputEvent> by signal("event")

  /**
   * Emitted when the node's minimum size changes.
   */
  val minimumSizeChanged: Signal0 by signal()

  /**
   * Emitted when a modal [godot.Control] is closed. See [showModal].
   */
  val modalClosed: Signal0 by signal()

  /**
   * Emitted when the mouse enters the control's `Rect` area, provided its [mouseFilter] lets the event reach it.
   */
  val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse leaves the control's `Rect` area, provided its [mouseFilter] lets the event reach it.
   */
  val mouseExited: Signal0 by signal()

  /**
   * Emitted when the control changes size.
   */
  val resized: Signal0 by signal()

  /**
   * Emitted when one of the size flags changes. See [sizeFlagsHorizontal] and [sizeFlagsVertical].
   */
  val sizeFlagsChanged: Signal0 by signal()

  /**
   * Anchors the bottom edge of the node to the origin, the center, or the end of its parent control. It changes how the bottom margin updates when the node moves or changes size. You can use one of the [enum Anchor] constants for convenience.
   */
  open val anchorBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * Anchors the left edge of the node to the origin, the center or the end of its parent control. It changes how the left margin updates when the node moves or changes size. You can use one of the [enum Anchor] constants for convenience.
   */
  open val anchorLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * Anchors the right edge of the node to the origin, the center or the end of its parent control. It changes how the right margin updates when the node moves or changes size. You can use one of the [enum Anchor] constants for convenience.
   */
  open val anchorRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * Anchors the top edge of the node to the origin, the center or the end of its parent control. It changes how the top margin updates when the node moves or changes size. You can use  one of the [enum Anchor] constants for convenience.
   */
  open val anchorTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The focus access mode for the control (None, Click or All). Only one Control can be focused at the same time, and it will receive keyboard signals.
   */
  open var focusMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_MODE, NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses the down arrow on the keyboard or down on a gamepad by default. You can change the key by editing the `ui_down` input action. The node must be a [godot.Control]. If this property is not set, Godot will give focus to the closest [godot.Control] to the bottom of this one.
   */
  open var focusNeighbourBottom: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_BOTTOM, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_BOTTOM, NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses the left arrow on the keyboard or left on a gamepad by default. You can change the key by editing the `ui_left` input action. The node must be a [godot.Control]. If this property is not set, Godot will give focus to the closest [godot.Control] to the left of this one.
   */
  open var focusNeighbourLeft: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_LEFT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_LEFT,
          NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses the right arrow on the keyboard or right on a gamepad  by default. You can change the key by editing the `ui_right` input action. The node must be a [godot.Control]. If this property is not set, Godot will give focus to the closest [godot.Control] to the bottom of this one.
   */
  open var focusNeighbourRight: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_RIGHT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_RIGHT,
          NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses the top arrow on the keyboard or top on a gamepad by default. You can change the key by editing the `ui_top` input action. The node must be a [godot.Control]. If this property is not set, Godot will give focus to the closest [godot.Control] to the bottom of this one.
   */
  open var focusNeighbourTop: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_TOP,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_TOP,
          NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses Tab on a keyboard by default. You can change the key by editing the `ui_focus_next` input action.
   *
   * If this property is not set, Godot will select a "best guess" based on surrounding nodes in the scene tree.
   */
  open var focusNext: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEXT, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEXT, NIL)
    }

  /**
   * Tells Godot which node it should give keyboard focus to if the user presses Shift+Tab on a keyboard by default. You can change the key by editing the `ui_focus_prev` input action.
   *
   * If this property is not set, Godot will select a "best guess" based on surrounding nodes in the scene tree.
   */
  open var focusPrevious: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_PREVIOUS,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_PREVIOUS, NIL)
    }

  /**
   * Controls the direction on the horizontal axis in which the control should grow if its horizontal minimum size is changed to be greater than its current size, as the control always has to be at least the minimum size.
   */
  open var growHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GROW_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GROW_HORIZONTAL, NIL)
    }

  /**
   * Controls the direction on the vertical axis in which the control should grow if its vertical minimum size is changed to be greater than its current size, as the control always has to be at least the minimum size.
   */
  open var growVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GROW_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GROW_VERTICAL, NIL)
    }

  /**
   * Changes the tooltip text. The tooltip appears when the user's mouse cursor stays idle over this control for a few moments, provided that the [mouseFilter] property is not [MOUSE_FILTER_IGNORE]. You can change the time required for the tooltip to appear with `gui/timers/tooltip_delay_sec` option in Project Settings.
   */
  open var hintTooltip: String
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property hintTooltip: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_HINT_TOOLTIP, NIL)
    }

  /**
   * Distance between the node's bottom edge and its parent control, based on [anchorBottom].
   *
   * Margins are often controlled by one or multiple parent [godot.Container] nodes, so you should not modify them manually if your node is a direct child of a [godot.Container]. Margins update automatically when you move or resize the node.
   */
  open var marginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_BOTTOM, NIL)
    }

  /**
   * Distance between the node's left edge and its parent control, based on [anchorLeft].
   *
   * Margins are often controlled by one or multiple parent [godot.Container] nodes, so you should not modify them manually if your node is a direct child of a [godot.Container]. Margins update automatically when you move or resize the node.
   */
  open var marginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_LEFT, NIL)
    }

  /**
   * Distance between the node's right edge and its parent control, based on [anchorRight].
   *
   * Margins are often controlled by one or multiple parent [godot.Container] nodes, so you should not modify them manually if your node is a direct child of a [godot.Container]. Margins update automatically when you move or resize the node.
   */
  open var marginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_RIGHT, NIL)
    }

  /**
   * Distance between the node's top edge and its parent control, based on [anchorTop].
   *
   * Margins are often controlled by one or multiple parent [godot.Container] nodes, so you should not modify them manually if your node is a direct child of a [godot.Container]. Margins update automatically when you move or resize the node.
   */
  open var marginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_TOP, NIL)
    }

  /**
   * The default cursor shape for this control. Useful for Godot plugins and applications or games that use the system's mouse cursors.
   *
   * **Note:** On Linux, shapes may vary depending on the cursor theme of the system.
   */
  open var mouseDefaultCursorShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MOUSE_DEFAULT_CURSOR_SHAPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MOUSE_DEFAULT_CURSOR_SHAPE, NIL)
    }

  /**
   * Controls whether the control will be able to receive mouse button input events through [_guiInput] and how these events should be handled. Also controls whether the control can receive the [mouseEntered], and [mouseExited] signals. See the constants to learn what each does.
   */
  open var mouseFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MOUSE_FILTER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MOUSE_FILTER, NIL)
    }

  /**
   * Enables whether rendering of [godot.CanvasItem] based children should be clipped to this control's rectangle. If `true`, parts of a child which would be visibly outside of this control's rectangle will not be rendered.
   */
  open var rectClipContent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_CLIP_CONTENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_CLIP_CONTENT,
          NIL)
    }

  /**
   * The node's global position, relative to the world (usually to the top-left corner of the window).
   */
  open val rectGlobalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_GLOBAL_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The minimum size of the node's bounding rectangle. If you set it to a value greater than (0, 0), the node's bounding rectangle will always have at least this size, even if its content is smaller. If it's set to (0, 0), the node sizes automatically to fit its content, be it a texture or child nodes.
   */
  open var rectMinSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_MIN_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_MIN_SIZE, NIL)
    }

  /**
   * By default, the node's pivot is its top-left corner. When you change its [rectScale], it will scale around this pivot. Set this property to [rectSize] / 2 to center the pivot in the node's rectangle.
   */
  open var rectPivotOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_PIVOT_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_PIVOT_OFFSET,
          NIL)
    }

  /**
   * The node's position, relative to its parent. It corresponds to the rectangle's top-left corner. The property is not affected by [rectPivotOffset].
   */
  open val rectPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The node's rotation around its pivot, in degrees. See [rectPivotOffset] to change the pivot's position.
   */
  open var rectRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_ROTATION, NIL)
    }

  /**
   * The node's scale, relative to its [rectSize]. Change this property to scale the node around its [rectPivotOffset]. The Control's [hintTooltip] will also scale according to this value.
   *
   * **Note:** This property is mainly intended to be used for animation purposes. Text inside the Control will look pixelated or blurry when the Control is scaled. To support multiple resolutions in your project, use an appropriate viewport stretch mode as described in the [documentation](https://docs.godotengine.org/en/latest/tutorials/viewports/multiple_resolutions.html) instead of scaling Controls individually.
   *
   * **Note:** If the Control node is a child of a [godot.Container] node, the scale will be reset to `Vector2(1, 1)` when the scene is instanced. To set the Control's scale when it's instanced, wait for one frame using `yield(get_tree(), "idle_frame")` then set its [rectScale] property.
   */
  open var rectScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_SCALE, NIL)
    }

  /**
   * The size of the node's bounding rectangle, in pixels. [godot.Container] nodes update this property automatically.
   */
  open val rectSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * Tells the parent [godot.Container] nodes how they should resize and place the node on the X axis. Use one of the [enum SizeFlags] constants to change the flags. See the constants to learn what each does.
   */
  open var sizeFlagsHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_HORIZONTAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_HORIZONTAL,
          NIL)
    }

  /**
   * If the node and at least one of its neighbours uses the [SIZE_EXPAND] size flag, the parent [godot.Container] will let it take more or less space depending on this property. If this node has a stretch ratio of 2 and its neighbour a ratio of 1, this node will take two thirds of the available space.
   */
  open var sizeFlagsStretchRatio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_STRETCH_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_STRETCH_RATIO, NIL)
    }

  /**
   * Tells the parent [godot.Container] nodes how they should resize and place the node on the Y axis. Use one of the [enum SizeFlags] constants to change the flags. See the constants to learn what each does.
   */
  open var sizeFlagsVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_VERTICAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_VERTICAL,
          NIL)
    }

  /**
   * Changing this property replaces the current [godot.Theme] resource this node and all its [godot.Control] children use.
   */
  open var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_THEME, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Theme?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_THEME, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CONTROL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun rectMinSize(schedule: Vector2.() -> Unit): Vector2 = rectMinSize.apply{
      schedule(this)
      rectMinSize = this
  }


  open fun rectPivotOffset(schedule: Vector2.() -> Unit): Vector2 = rectPivotOffset.apply{
      schedule(this)
      rectPivotOffset = this
  }


  open fun rectScale(schedule: Vector2.() -> Unit): Vector2 = rectScale.apply{
      schedule(this)
      rectScale = this
  }


  /**
   * Virtual method to be implemented by the user. Returns whether [_guiInput] should not be called for children controls outside this control's rectangle. Input will be clipped to the Rect of this [godot.Control]. Similar to [rectClipContent], but doesn't affect visibility.
   *
   * If not overridden, defaults to `false`.
   */
  open fun _clipsInput(): Boolean {
    throw NotImplementedError("_clips_input is not implemented for Control")
  }

  /**
   * Virtual method to be implemented by the user. Returns the minimum size for this control. Alternative to [rectMinSize] for controlling minimum size via code. The actual minimum size will be the max value of these two (in each axis separately).
   *
   * If not overridden, defaults to [godot.Vector2.ZERO].
   */
  open fun _getMinimumSize(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for Control")
  }

  open fun _getTooltip(): String {
    throw NotImplementedError("_get_tooltip is not implemented for Control")
  }

  /**
   * Virtual method to be implemented by the user. Use this method to process and accept inputs on UI elements. See [acceptEvent].
   *
   * Example: clicking a control.
   *
   * ```
   * 				func _gui_input(event):
   * 				    if event is InputEventMouseButton:
   * 				        if event.button_index == BUTTON_LEFT and event.pressed:
   * 				            print("I've been clicked D:")
   * 				```
   *
   * The event won't trigger if:
   *
   * * clicking outside the control (see [hasPoint]);
   *
   * * control has [mouseFilter] set to [MOUSE_FILTER_IGNORE];
   *
   * * control is obstructed by another [godot.Control] on top of it, which doesn't have [mouseFilter] set to [MOUSE_FILTER_IGNORE];
   *
   * * control's parent has [mouseFilter] set to [MOUSE_FILTER_STOP] or has accepted the event;
   *
   * * it happens outside parent's rectangle and the parent has either [rectClipContent] or [_clipsInput] enabled.
   */
  open fun _guiInput(event: InputEvent) {
  }

  /**
   * Virtual method to be implemented by the user. Returns a [godot.Control] node that should be used as a tooltip instead of the default one. Use `for_text` parameter to determine what text the tooltip should contain (likely the contents of [hintTooltip]).
   *
   * The returned node must be of type [godot.Control] or Control-derieved. It can have child nodes of any type. It is freed when the tooltip disappears, so make sure you always provide a new instance, not e.g. a node from scene. When `null` or non-Control node is returned, the default tooltip will be used instead.
   *
   * **Note:** The tooltip is shrunk to minimal size. If you want to ensure it's fully visible, you might want to set its [rectMinSize] to some non-zero value.
   *
   * Example of usage with custom-constructed node:
   *
   * ```
   * 				func _make_custom_tooltip(for_text):
   * 				    var label = Label.new()
   * 				    label.text = for_text
   * 				    return label
   * 				```
   *
   * Example of usage with custom scene instance:
   *
   * ```
   * 				func _make_custom_tooltip(for_text):
   * 				    var tooltip = preload("SomeTooltipScene.tscn").instance()
   * 				    tooltip.get_node("Label").text = for_text
   * 				    return tooltip
   * 				```
   */
  open fun _makeCustomTooltip(forText: String): Object? {
    throw NotImplementedError("_make_custom_tooltip is not implemented for Control")
  }

  open fun _overrideChanged() {
  }

  open fun _setAnchor(margin: Long, anchor: Double) {
  }

  open fun _setGlobalPosition(position: Vector2) {
  }

  open fun _setPosition(margin: Vector2) {
  }

  open fun _setSize(size: Vector2) {
  }

  open fun _sizeChanged() {
  }

  open fun _themeChanged() {
  }

  open fun _updateMinimumSize() {
  }

  /**
   * Marks an input event as handled. Once you accept an input event, it stops propagating, even to nodes listening to [godot.Node.UnhandledInput] or [godot.Node.UnhandledKeyInput].
   */
  open fun acceptEvent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ACCEPT_EVENT, NIL)
  }

  /**
   * Overrides the [godot.core.Color] with given `name` in the [theme] resource the control uses.
   *
   * **Note:** Unlike other theme overrides, there is no way to undo a color override without manually assigning the previous color.
   *
   * **Example of overriding a label's color and resetting it later:**
   *
   * ```
   * 				# Override the child node "MyLabel"'s font color to orange.
   * 				$MyLabel.add_color_override("font_color", Color(1, 0.5, 0))
   *
   * 				# Reset the color by creating a new node to get the default value:
   * 				var default_label_color = Label.new().get_color("font_color")
   * 				$MyLabel.add_color_override("font_color", default_label_color)
   * 				```
   */
  open fun addColorOverride(name: String, color: Color) {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_COLOR_OVERRIDE, NIL)
  }

  /**
   * Overrides an integer constant with given `name` in the [theme] resource the control uses. If the `constant` is `0`, the override is cleared and the constant from assigned [godot.Theme] is used.
   */
  open fun addConstantOverride(name: String, constant: Long) {
    TransferContext.writeArguments(STRING to name, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_CONSTANT_OVERRIDE, NIL)
  }

  /**
   * Overrides the font with given `name` in the [theme] resource the control uses. If `font` is `null` or invalid, the override is cleared and the font from assigned [godot.Theme] is used.
   */
  open fun addFontOverride(name: String, font: Font) {
    TransferContext.writeArguments(STRING to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_FONT_OVERRIDE, NIL)
  }

  /**
   * Overrides the icon with given `name` in the [theme] resource the control uses. If `icon` is `null` or invalid, the override is cleared and the icon from assigned [godot.Theme] is used.
   */
  open fun addIconOverride(name: String, texture: Texture) {
    TransferContext.writeArguments(STRING to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_ICON_OVERRIDE, NIL)
  }

  /**
   * Overrides the [godot.Shader] with given `name` in the [theme] resource the control uses. If `shader` is `null` or invalid, the override is cleared and the shader from assigned [godot.Theme] is used.
   */
  open fun addShaderOverride(name: String, shader: Shader) {
    TransferContext.writeArguments(STRING to name, OBJECT to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_SHADER_OVERRIDE, NIL)
  }

  /**
   * Overrides the [godot.StyleBox] with given `name` in the [theme] resource the control uses. If `stylebox` is empty or invalid, the override is cleared and the [godot.StyleBox] from assigned [godot.Theme] is used.
   *
   * **Example of modifying a property in a StyleBox by duplicating it:**
   *
   * ```
   * 				# The snippet below assumes the child node MyButton has a StyleBoxFlat assigned.
   * 				# Resources are shared across instances, so we need to duplicate it
   * 				# to avoid modifying the appearance of all other buttons.
   * 				var new_stylebox_normal = $MyButton.get_stylebox("normal").duplicate()
   * 				new_stylebox_normal.border_width_top = 3
   * 				new_stylebox_normal.border_color = Color(0, 1, 0.5)
   * 				$MyButton.add_stylebox_override("normal", new_stylebox_normal)
   *
   * 				# Remove the stylebox override:
   * 				$MyButton.add_stylebox_override("normal", null)
   * 				```
   */
  open fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    TransferContext.writeArguments(STRING to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_STYLEBOX_OVERRIDE, NIL)
  }

  /**
   * Godot calls this method to test if `data` from a control's [getDragData] can be dropped at `position`. `position` is local to this control.
   *
   * This method should only be used to test the data. Process the data in [dropData].
   *
   * ```
   * 				func can_drop_data(position, data):
   * 				    # Check position if it is relevant to you
   * 				    # Otherwise, just check data
   * 				    return typeof(data) == TYPE_DICTIONARY and data.has("expected")
   * 				```
   */
  open fun _canDropData(position: Vector2, data: Any?): Boolean {
    throw NotImplementedError("can_drop_data is not implemented for Control")
  }

  /**
   * Godot calls this method to pass you the `data` from a control's [getDragData] result. Godot first calls [canDropData] to test if `data` is allowed to drop at `position` where `position` is local to this control.
   *
   * ```
   * 				func can_drop_data(position, data):
   * 				    return typeof(data) == TYPE_DICTIONARY and data.has("color")
   *
   * 				func drop_data(position, data):
   * 				    color = data["color"]
   * 				```
   */
  open fun _dropData(position: Vector2, data: Any?) {
  }

  /**
   * Forces drag and bypasses [getDragData] and [setDragPreview] by passing `data` and `preview`. Drag will start even if the mouse is neither over nor pressed on this control.
   *
   * The methods [canDropData] and [dropData] must be implemented on controls that want to receive drop data.
   */
  open fun forceDrag(data: Any?, preview: Control) {
    TransferContext.writeArguments(ANY to data, OBJECT to preview)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_FORCE_DRAG, NIL)
  }

  /**
   * Returns [marginLeft] and [marginTop]. See also [rectPosition].
   */
  open fun getBegin(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_BEGIN, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns a color from assigned [godot.Theme] with given `name` and associated with [godot.Control] of given `type`.
   *
   * ```
   * 				func _ready():
   * 				    modulate = get_color("font_color", "Button") #get the color defined for button fonts
   * 				```
   */
  open fun getColor(name: String, type: String = ""): Color {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns combined minimum size from [rectMinSize] and [getMinimumSize].
   */
  open fun getCombinedMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_COMBINED_MINIMUM_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns a constant from assigned [godot.Theme] with given `name` and associated with [godot.Control] of given `type`.
   */
  open fun getConstant(name: String, type: String = ""): Long {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the mouse cursor shape the control displays on mouse hover. See [enum CursorShape].
   */
  open fun getCursorShape(position: Vector2 = Vector2(0.0, 0.0)): Control.CursorShape {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_CURSOR_SHAPE, LONG)
    return Control.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Godot calls this method to get data that can be dragged and dropped onto controls that expect drop data. Returns `null` if there is no data to drag. Controls that want to receive drop data should implement [canDropData] and [dropData]. `position` is local to this control. Drag may be forced with [forceDrag].
   *
   * A preview that will follow the mouse that should represent the data can be set with [setDragPreview]. A good time to set the preview is in this method.
   *
   * ```
   * 				func get_drag_data(position):
   * 				    var mydata = make_data()
   * 				    set_drag_preview(make_preview(mydata))
   * 				    return mydata
   * 				```
   */
  open fun _getDragData(position: Vector2): Any? {
    throw NotImplementedError("get_drag_data is not implemented for Control")
  }

  /**
   * Returns [marginRight] and [marginBottom].
   */
  open fun getEnd(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_END, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the control that has the keyboard focus or `null` if none.
   */
  open fun getFocusOwner(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns a font from assigned [godot.Theme] with given `name` and associated with [godot.Control] of given `type`.
   */
  open fun getFont(name: String, type: String = ""): Font? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  /**
   * Returns the position and size of the control relative to the top-left corner of the screen. See [rectPosition] and [rectSize].
   */
  open fun getGlobalRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GLOBAL_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns an icon from assigned [godot.Theme] with given `name` and associated with [godot.Control] of given `type`.
   */
  open fun getIcon(name: String, type: String = ""): Texture? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the minimum size for this control. See [rectMinSize].
   */
  open fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MINIMUM_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the width/height occupied in the parent control.
   */
  open fun getParentAreaSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_PARENT_AREA_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the parent control node.
   */
  open fun getParentControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_PARENT_CONTROL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the position and size of the control relative to the top-left corner of the parent Control. See [rectPosition] and [rectSize].
   */
  open fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the rotation (in radians).
   */
  open fun getRotation(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ROTATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a [godot.StyleBox] from assigned [godot.Theme] with given `name` and associated with [godot.Control] of given `type`.
   */
  open fun getStylebox(name: String, type: String = ""): StyleBox? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  /**
   * Returns the tooltip, which will appear when the cursor is resting over this control. See [hintTooltip].
   */
  open fun getTooltip(atPosition: Vector2 = Vector2(0.0, 0.0)): String {
    TransferContext.writeArguments(VECTOR2 to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Creates an [godot.InputEventMouseButton] that attempts to click the control. If the event is received, the control acquires focus.
   *
   * ```
   * 				func _process(delta):
   * 				    grab_click_focus() #when clicking another Control node, this node will be clicked instead
   * 				```
   */
  open fun grabClickFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GRAB_CLICK_FOCUS, NIL)
  }

  /**
   * Steal the focus from another control and become the focused control (see [focusMode]).
   */
  open fun grabFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GRAB_FOCUS, NIL)
  }

  /**
   * Returns `true` if [godot.core.Color] with given `name` and associated with [godot.Control] of given `type` exists in assigned [godot.Theme].
   */
  open fun hasColor(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.core.Color] with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasColorOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_COLOR_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if constant with given `name` and associated with [godot.Control] of given `type` exists in assigned [godot.Theme].
   */
  open fun hasConstant(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if constant with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasConstantOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_CONSTANT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this is the current focused control. See [focusMode].
   */
  open fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if font with given `name` and associated with [godot.Control] of given `type` exists in assigned [godot.Theme].
   */
  open fun hasFont(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if font with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasFontOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FONT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if icon with given `name` and associated with [godot.Control] of given `type` exists in assigned [godot.Theme].
   */
  open fun hasIcon(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if icon with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasIconOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_ICON_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Virtual method to be implemented by the user. Returns whether the given `point` is inside this control.
   *
   * If not overridden, default behavior is checking if the point is within control's Rect.
   *
   * **Note:** If you want to check if a point is inside the control, you can use `get_rect().has_point(point)`.
   */
  open fun _hasPoint(point: Vector2): Boolean {
    throw NotImplementedError("has_point is not implemented for Control")
  }

  /**
   * Returns `true` if [godot.Shader] with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasShaderOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_SHADER_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.StyleBox] with given `name` and associated with [godot.Control] of given `type` exists in assigned [godot.Theme].
   */
  open fun hasStylebox(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if [godot.StyleBox] with given `name` has a valid override in this [godot.Control] node.
   */
  open fun hasStyleboxOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_STYLEBOX_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Invalidates the size cache in this node and in parent nodes up to toplevel. Intended to be used with [getMinimumSize] when the return value is changed. Setting [rectMinSize] directly calls this method automatically.
   */
  open fun minimumSizeChanged() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_MINIMUM_SIZE_CHANGED, NIL)
  }

  /**
   * Give up the focus. No other control will be able to receive keyboard input.
   */
  open fun releaseFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_RELEASE_FOCUS, NIL)
  }

  /**
   * Sets the anchor identified by `margin` constant from [enum Margin] enum to value `anchor`. A setter method for [anchorBottom], [anchorLeft], [anchorRight] and [anchorTop].
   *
   * If `keep_margin` is `true`, margins aren't updated after this operation.
   *
   * If `push_opposite_anchor` is `true` and the opposite anchor overlaps this anchor, the opposite one will have its value overridden. For example, when setting left anchor to 1 and the right anchor has value of 0.5, the right anchor will also get value of 1. If `push_opposite_anchor` was `false`, the left anchor would get value 0.5.
   */
  open fun setAnchor(
    margin: Long,
    anchor: Double,
    keepMargin: Boolean = false,
    pushOppositeAnchor: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to margin, DOUBLE to anchor, BOOL to keepMargin, BOOL to
        pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHOR, NIL)
  }

  /**
   * Works the same as [setAnchor], but instead of `keep_margin` argument and automatic update of margin, it allows to set the margin offset yourself (see [setMargin]).
   */
  open fun setAnchorAndMargin(
    margin: Long,
    anchor: Double,
    offset: Double,
    pushOppositeAnchor: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to margin, DOUBLE to anchor, DOUBLE to offset, BOOL to
        pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHOR_AND_MARGIN, NIL)
  }

  /**
   * Sets both anchor preset and margin preset. See [setAnchorsPreset] and [setMarginsPreset].
   */
  open fun setAnchorsAndMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    TransferContext.writeArguments(LONG to preset, LONG to resizeMode, LONG to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHORS_AND_MARGINS_PRESET, NIL)
  }

  /**
   * Sets the anchors to a `preset` from [enum Control.LayoutPreset] enum. This is code equivalent of using the Layout menu in 2D editor.
   *
   * If `keep_margins` is `true`, control's position will also be updated.
   */
  open fun setAnchorsPreset(preset: Long, keepMargins: Boolean = false) {
    TransferContext.writeArguments(LONG to preset, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHORS_PRESET, NIL)
  }

  /**
   * Sets [marginLeft] and [marginTop] at the same time. Equivalent of changing [rectPosition].
   */
  open fun setBegin(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_BEGIN, NIL)
  }

  /**
   * Forwards the handling of this control's drag and drop to `target` control.
   *
   * Forwarding can be implemented in the target control similar to the methods [getDragData], [canDropData], and [dropData] but with two differences:
   *
   * 1. The function name must be suffixed with **_fw**
   *
   * 2. The function must take an extra argument that is the control doing the forwarding
   *
   * ```
   * 				# ThisControl.gd
   * 				extends Control
   * 				func _ready():
   * 				    set_drag_forwarding(target_control)
   *
   * 				# TargetControl.gd
   * 				extends Control
   * 				func can_drop_data_fw(position, data, from_control):
   * 				    return true
   *
   * 				func drop_data_fw(position, data, from_control):
   * 				    my_handle_data(data)
   *
   * 				func get_drag_data_fw(position, from_control):
   * 				    set_drag_preview(my_preview)
   * 				    return my_data()
   * 				```
   */
  open fun setDragForwarding(target: Control) {
    TransferContext.writeArguments(OBJECT to target)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_DRAG_FORWARDING, NIL)
  }

  /**
   * Shows the given control at the mouse pointer. A good time to call this method is in [getDragData]. The control must not be in the scene tree.
   *
   * ```
   * 				export (Color, RGBA) var color = Color(1, 0, 0, 1)
   *
   * 				func get_drag_data(position):
   * 				    # Use a control that is not in the tree
   * 				    var cpb = ColorPickerButton.new()
   * 				    cpb.color = color
   * 				    cpb.rect_size = Vector2(50, 50)
   * 				    set_drag_preview(cpb)
   * 				    return color
   * 				```
   */
  open fun setDragPreview(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_DRAG_PREVIEW, NIL)
  }

  /**
   * Sets [marginRight] and [marginBottom] at the same time.
   */
  open fun setEnd(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_END, NIL)
  }

  /**
   * Sets the [rectGlobalPosition] to given `position`.
   *
   * If `keep_margins` is `true`, control's anchors will be updated instead of margins.
   */
  open fun setGlobalPosition(position: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GLOBAL_POSITION, NIL)
  }

  /**
   * Sets the margins to a `preset` from [enum Control.LayoutPreset] enum. This is code equivalent of using the Layout menu in 2D editor.
   *
   * Use parameter `resize_mode` with constants from [enum Control.LayoutPresetMode] to better determine the resulting size of the [godot.Control]. Constant size will be ignored if used with presets that change size, e.g. `PRESET_LEFT_WIDE`.
   *
   * Use parameter `margin` to determine the gap between the [godot.Control] and the edges.
   */
  open fun setMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    TransferContext.writeArguments(LONG to preset, LONG to resizeMode, LONG to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGINS_PRESET, NIL)
  }

  /**
   * Sets the [rectPosition] to given `position`.
   *
   * If `keep_margins` is `true`, control's anchors will be updated instead of margins.
   */
  open fun setPosition(position: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_POSITION, NIL)
  }

  /**
   * Sets the rotation (in radians).
   */
  open fun setRotation(radians: Double) {
    TransferContext.writeArguments(DOUBLE to radians)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ROTATION, NIL)
  }

  /**
   * Sets the size (see [rectSize]).
   *
   * If `keep_margins` is `true`, control's anchors will be updated instead of margins.
   */
  open fun setSize(size: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to size, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE, NIL)
  }

  /**
   * Displays a control as modal. Control must be a subwindow. Modal controls capture the input signals until closed or the area outside them is accessed. When a modal control loses focus, or the ESC key is pressed, they automatically hide. Modal controls are used extensively for popup dialogs and menus.
   *
   * If `exclusive` is `true`, other controls will not receive input and clicking outside this control will not close it.
   */
  open fun showModal(exclusive: Boolean = false) {
    TransferContext.writeArguments(BOOL to exclusive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SHOW_MODAL, NIL)
  }

  /**
   * Moves the mouse cursor to `to_position`, relative to [rectPosition] of this [godot.Control].
   */
  open fun warpMouse(toPosition: Vector2) {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_WARP_MOUSE, NIL)
  }

  enum class Anchor(
    id: Long
  ) {
    /**
     * Snaps one of the 4 anchor's sides to the origin of the node's `Rect`, in the top left. Use it with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at once, use [setAnchorsPreset].
     */
    ANCHOR_BEGIN(0),

    /**
     * Snaps one of the 4 anchor's sides to the end of the node's `Rect`, in the bottom right. Use it with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at once, use [setAnchorsPreset].
     */
    ANCHOR_END(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class FocusMode(
    id: Long
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
     * The node can grab focus on mouse click or using the arrows and the Tab keys on the keyboard. Use with [focusMode].
     */
    FOCUS_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPresetMode(
    id: Long
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
    PRESET_MODE_KEEP_SIZE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MouseFilter(
    id: Long
  ) {
    /**
     * The control will receive mouse button input events through [_guiInput] if clicked on. And the control will receive the [mouseEntered] and [mouseExited] signals. These events are automatically marked as handled, and they will not propagate further to other controls. This also results in blocking signals in other controls.
     */
    MOUSE_FILTER_STOP(0),

    /**
     * The control will receive mouse button input events through [_guiInput] if clicked on. And the control will receive the [mouseEntered] and [mouseExited] signals. If this control does not handle the event, the parent control (if any) will be considered, and so on until there is no more parent control to potentially handle it. This also allows signals to fire in other controls. Even if no control handled it at all, the event will still be handled automatically, so unhandled input will not be fired.
     */
    MOUSE_FILTER_PASS(1),

    /**
     * The control will not receive mouse button input events through [_guiInput]. The control will also not receive the [mouseEntered] nor [mouseExited] signals. This will not block other controls from receiving these events or firing the signals. Ignored events will not be handled automatically.
     */
    MOUSE_FILTER_IGNORE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CursorShape(
    id: Long
  ) {
    /**
     * Show the system's arrow mouse cursor when the user hovers the node. Use with [mouseDefaultCursorShape].
     */
    CURSOR_ARROW(0),

    /**
     * Show the system's I-beam mouse cursor when the user hovers the node. The I-beam pointer has a shape similar to "I". It tells the user they can highlight or insert text.
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
     * Show the system's wait mouse cursor, often an hourglass, when the user hovers the node.
     */
    CURSOR_WAIT(4),

    /**
     * Show the system's busy mouse cursor when the user hovers the node. Often an hourglass.
     */
    CURSOR_BUSY(5),

    /**
     * Show the system's drag mouse cursor, often a closed fist or a cross symbol, when the user hovers the node. It tells the user they're currently dragging an item, like a node in the Scene dock.
     */
    CURSOR_DRAG(6),

    /**
     * Show the system's drop mouse cursor when the user hovers the node. It can be an open hand. It tells the user they can drop an item they're currently grabbing, like a node in the Scene dock.
     */
    CURSOR_CAN_DROP(7),

    /**
     * Show the system's forbidden mouse cursor when the user hovers the node. Often a crossed circle.
     */
    CURSOR_FORBIDDEN(8),

    /**
     * Show the system's vertical resize mouse cursor when the user hovers the node. A double-headed vertical arrow. It tells the user they can resize the window or the panel vertically.
     */
    CURSOR_VSIZE(9),

    /**
     * Show the system's horizontal resize mouse cursor when the user hovers the node. A double-headed horizontal arrow. It tells the user they can resize the window or the panel horizontally.
     */
    CURSOR_HSIZE(10),

    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a double-headed arrow that goes from the bottom left to the top right. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    CURSOR_BDIAGSIZE(11),

    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a double-headed arrow that goes from the top left to the bottom right, the opposite of [CURSOR_BDIAGSIZE]. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    CURSOR_FDIAGSIZE(12),

    /**
     * Show the system's move mouse cursor when the user hovers the node. It shows 2 double-headed arrows at a 90 degree angle. It tells the user they can move a UI element freely.
     */
    CURSOR_MOVE(13),

    /**
     * Show the system's vertical split mouse cursor when the user hovers the node. On Windows, it's the same as [CURSOR_VSIZE].
     */
    CURSOR_VSPLIT(14),

    /**
     * Show the system's horizontal split mouse cursor when the user hovers the node. On Windows, it's the same as [CURSOR_HSIZE].
     */
    CURSOR_HSPLIT(15),

    /**
     * Show the system's help mouse cursor when the user hovers the node, a question mark.
     */
    CURSOR_HELP(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GrowDirection(
    id: Long
  ) {
    /**
     * The control will grow to the left or top to make up if its minimum size is changed to be greater than its current size on the respective axis.
     */
    GROW_DIRECTION_BEGIN(0),

    /**
     * The control will grow to the right or bottom to make up if its minimum size is changed to be greater than its current size on the respective axis.
     */
    GROW_DIRECTION_END(1),

    /**
     * The control will grow in both directions equally to make up if its minimum size is changed to be greater than its current size.
     */
    GROW_DIRECTION_BOTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SizeFlags(
    id: Long
  ) {
    /**
     * Tells the parent [godot.Container] to expand the bounds of this node to fill all the available space without pushing any other node. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    SIZE_FILL(1),

    /**
     * Tells the parent [godot.Container] to let this node take all the available space on the axis you flag. If multiple neighboring nodes are set to expand, they'll share the space based on their stretch ratio. See [sizeFlagsStretchRatio]. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    SIZE_EXPAND(2),

    /**
     * Sets the node's size flags to both fill and expand. See the 2 constants above for more information.
     */
    SIZE_EXPAND_FILL(3),

    /**
     * Tells the parent [godot.Container] to center the node in itself. It centers the control based on its bounding box, so it doesn't work with the fill or expand size flags. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    SIZE_SHRINK_CENTER(4),

    /**
     * Tells the parent [godot.Container] to align the node with its end, either the bottom or the right edge. It doesn't work with the fill or expand size flags. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    SIZE_SHRINK_END(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPreset(
    id: Long
  ) {
    /**
     * Snap all 4 anchors to the top-left of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_TOP_LEFT(0),

    /**
     * Snap all 4 anchors to the top-right of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_TOP_RIGHT(1),

    /**
     * Snap all 4 anchors to the bottom-left of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_BOTTOM_LEFT(2),

    /**
     * Snap all 4 anchors to the bottom-right of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_BOTTOM_RIGHT(3),

    /**
     * Snap all 4 anchors to the center of the left edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER_LEFT(4),

    /**
     * Snap all 4 anchors to the center of the top edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER_TOP(5),

    /**
     * Snap all 4 anchors to the center of the right edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER_RIGHT(6),

    /**
     * Snap all 4 anchors to the center of the bottom edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER_BOTTOM(7),

    /**
     * Snap all 4 anchors to the center of the parent control's bounds. Use with [setAnchorsPreset].
     */
    PRESET_CENTER(8),

    /**
     * Snap all 4 anchors to the left edge of the parent control. The left margin becomes relative to the left edge and the top margin relative to the top left corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_LEFT_WIDE(9),

    /**
     * Snap all 4 anchors to the top edge of the parent control. The left margin becomes relative to the top left corner, the top margin relative to the top edge, and the right margin relative to the top right corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_TOP_WIDE(10),

    /**
     * Snap all 4 anchors to the right edge of the parent control. The right margin becomes relative to the right edge and the top margin relative to the top right corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_RIGHT_WIDE(11),

    /**
     * Snap all 4 anchors to the bottom edge of the parent control. The left margin becomes relative to the bottom left corner, the bottom margin relative to the bottom edge, and the right margin relative to the bottom right corner of the node's parent. Use with [setAnchorsPreset].
     */
    PRESET_BOTTOM_WIDE(12),

    /**
     * Snap all 4 anchors to a vertical line that cuts the parent control in half. Use with [setAnchorsPreset].
     */
    PRESET_VCENTER_WIDE(13),

    /**
     * Snap all 4 anchors to a horizontal line that cuts the parent control in half. Use with [setAnchorsPreset].
     */
    PRESET_HCENTER_WIDE(14),

    /**
     * Snap all 4 anchors to the respective corners of the parent control. Set all 4 margins to 0 after you applied this preset and the [godot.Control] will fit its parent control. This is equivalent to the "Full Rect" layout option in the editor. Use with [setAnchorsPreset].
     */
    PRESET_WIDE(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Snaps one of the 4 anchor's sides to the origin of the node's `Rect`, in the top left. Use it with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at once, use [setAnchorsPreset].
     */
    final const val ANCHOR_BEGIN: Long = 0

    /**
     * Snaps one of the 4 anchor's sides to the end of the node's `Rect`, in the bottom right. Use it with one of the `anchor_*` member variables, like [anchorLeft]. To change all 4 anchors at once, use [setAnchorsPreset].
     */
    final const val ANCHOR_END: Long = 1

    /**
     * Show the system's arrow mouse cursor when the user hovers the node. Use with [mouseDefaultCursorShape].
     */
    final const val CURSOR_ARROW: Long = 0

    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a double-headed arrow that goes from the bottom left to the top right. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    final const val CURSOR_BDIAGSIZE: Long = 11

    /**
     * Show the system's busy mouse cursor when the user hovers the node. Often an hourglass.
     */
    final const val CURSOR_BUSY: Long = 5

    /**
     * Show the system's drop mouse cursor when the user hovers the node. It can be an open hand. It tells the user they can drop an item they're currently grabbing, like a node in the Scene dock.
     */
    final const val CURSOR_CAN_DROP: Long = 7

    /**
     * Show the system's cross mouse cursor when the user hovers the node.
     */
    final const val CURSOR_CROSS: Long = 3

    /**
     * Show the system's drag mouse cursor, often a closed fist or a cross symbol, when the user hovers the node. It tells the user they're currently dragging an item, like a node in the Scene dock.
     */
    final const val CURSOR_DRAG: Long = 6

    /**
     * Show the system's window resize mouse cursor when the user hovers the node. The cursor is a double-headed arrow that goes from the top left to the bottom right, the opposite of [CURSOR_BDIAGSIZE]. It tells the user they can resize the window or the panel both horizontally and vertically.
     */
    final const val CURSOR_FDIAGSIZE: Long = 12

    /**
     * Show the system's forbidden mouse cursor when the user hovers the node. Often a crossed circle.
     */
    final const val CURSOR_FORBIDDEN: Long = 8

    /**
     * Show the system's help mouse cursor when the user hovers the node, a question mark.
     */
    final const val CURSOR_HELP: Long = 16

    /**
     * Show the system's horizontal resize mouse cursor when the user hovers the node. A double-headed horizontal arrow. It tells the user they can resize the window or the panel horizontally.
     */
    final const val CURSOR_HSIZE: Long = 10

    /**
     * Show the system's horizontal split mouse cursor when the user hovers the node. On Windows, it's the same as [CURSOR_HSIZE].
     */
    final const val CURSOR_HSPLIT: Long = 15

    /**
     * Show the system's I-beam mouse cursor when the user hovers the node. The I-beam pointer has a shape similar to "I". It tells the user they can highlight or insert text.
     */
    final const val CURSOR_IBEAM: Long = 1

    /**
     * Show the system's move mouse cursor when the user hovers the node. It shows 2 double-headed arrows at a 90 degree angle. It tells the user they can move a UI element freely.
     */
    final const val CURSOR_MOVE: Long = 13

    /**
     * Show the system's pointing hand mouse cursor when the user hovers the node.
     */
    final const val CURSOR_POINTING_HAND: Long = 2

    /**
     * Show the system's vertical resize mouse cursor when the user hovers the node. A double-headed vertical arrow. It tells the user they can resize the window or the panel vertically.
     */
    final const val CURSOR_VSIZE: Long = 9

    /**
     * Show the system's vertical split mouse cursor when the user hovers the node. On Windows, it's the same as [CURSOR_VSIZE].
     */
    final const val CURSOR_VSPLIT: Long = 14

    /**
     * Show the system's wait mouse cursor, often an hourglass, when the user hovers the node.
     */
    final const val CURSOR_WAIT: Long = 4

    /**
     * The node can grab focus on mouse click or using the arrows and the Tab keys on the keyboard. Use with [focusMode].
     */
    final const val FOCUS_ALL: Long = 2

    /**
     * The node can only grab focus on mouse clicks. Use with [focusMode].
     */
    final const val FOCUS_CLICK: Long = 1

    /**
     * The node cannot grab focus. Use with [focusMode].
     */
    final const val FOCUS_NONE: Long = 0

    /**
     * The control will grow to the left or top to make up if its minimum size is changed to be greater than its current size on the respective axis.
     */
    final const val GROW_DIRECTION_BEGIN: Long = 0

    /**
     * The control will grow in both directions equally to make up if its minimum size is changed to be greater than its current size.
     */
    final const val GROW_DIRECTION_BOTH: Long = 2

    /**
     * The control will grow to the right or bottom to make up if its minimum size is changed to be greater than its current size on the respective axis.
     */
    final const val GROW_DIRECTION_END: Long = 1

    /**
     * The control will not receive mouse button input events through [_guiInput]. The control will also not receive the [mouseEntered] nor [mouseExited] signals. This will not block other controls from receiving these events or firing the signals. Ignored events will not be handled automatically.
     */
    final const val MOUSE_FILTER_IGNORE: Long = 2

    /**
     * The control will receive mouse button input events through [_guiInput] if clicked on. And the control will receive the [mouseEntered] and [mouseExited] signals. If this control does not handle the event, the parent control (if any) will be considered, and so on until there is no more parent control to potentially handle it. This also allows signals to fire in other controls. Even if no control handled it at all, the event will still be handled automatically, so unhandled input will not be fired.
     */
    final const val MOUSE_FILTER_PASS: Long = 1

    /**
     * The control will receive mouse button input events through [_guiInput] if clicked on. And the control will receive the [mouseEntered] and [mouseExited] signals. These events are automatically marked as handled, and they will not propagate further to other controls. This also results in blocking signals in other controls.
     */
    final const val MOUSE_FILTER_STOP: Long = 0

    /**
     * Sent when the node grabs focus.
     */
    final const val NOTIFICATION_FOCUS_ENTER: Long = 43

    /**
     * Sent when the node loses focus.
     */
    final const val NOTIFICATION_FOCUS_EXIT: Long = 44

    /**
     * Sent when an open modal dialog closes. See [showModal].
     */
    final const val NOTIFICATION_MODAL_CLOSE: Long = 46

    /**
     * Sent when the mouse pointer enters the node.
     */
    final const val NOTIFICATION_MOUSE_ENTER: Long = 41

    /**
     * Sent when the mouse pointer exits the node.
     */
    final const val NOTIFICATION_MOUSE_EXIT: Long = 42

    /**
     * Sent when the node changes size. Use [rectSize] to get the new size.
     */
    final const val NOTIFICATION_RESIZED: Long = 40

    /**
     * Sent when this node is inside a [godot.ScrollContainer] which has begun being scrolled.
     */
    final const val NOTIFICATION_SCROLL_BEGIN: Long = 47

    /**
     * Sent when this node is inside a [godot.ScrollContainer] which has stopped being scrolled.
     */
    final const val NOTIFICATION_SCROLL_END: Long = 48

    /**
     * Sent when the node's [theme] changes, right before Godot redraws the control. Happens when you call one of the `add_*_override` methods.
     */
    final const val NOTIFICATION_THEME_CHANGED: Long = 45

    /**
     * Snap all 4 anchors to the bottom-left of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_BOTTOM_LEFT: Long = 2

    /**
     * Snap all 4 anchors to the bottom-right of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_BOTTOM_RIGHT: Long = 3

    /**
     * Snap all 4 anchors to the bottom edge of the parent control. The left margin becomes relative to the bottom left corner, the bottom margin relative to the bottom edge, and the right margin relative to the bottom right corner of the node's parent. Use with [setAnchorsPreset].
     */
    final const val PRESET_BOTTOM_WIDE: Long = 12

    /**
     * Snap all 4 anchors to the center of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_CENTER: Long = 8

    /**
     * Snap all 4 anchors to the center of the bottom edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_CENTER_BOTTOM: Long = 7

    /**
     * Snap all 4 anchors to the center of the left edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_CENTER_LEFT: Long = 4

    /**
     * Snap all 4 anchors to the center of the right edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_CENTER_RIGHT: Long = 6

    /**
     * Snap all 4 anchors to the center of the top edge of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_CENTER_TOP: Long = 5

    /**
     * Snap all 4 anchors to a horizontal line that cuts the parent control in half. Use with [setAnchorsPreset].
     */
    final const val PRESET_HCENTER_WIDE: Long = 14

    /**
     * Snap all 4 anchors to the left edge of the parent control. The left margin becomes relative to the left edge and the top margin relative to the top left corner of the node's parent. Use with [setAnchorsPreset].
     */
    final const val PRESET_LEFT_WIDE: Long = 9

    /**
     * The control's height will not change.
     */
    final const val PRESET_MODE_KEEP_HEIGHT: Long = 2

    /**
     * The control's size will not change.
     */
    final const val PRESET_MODE_KEEP_SIZE: Long = 3

    /**
     * The control's width will not change.
     */
    final const val PRESET_MODE_KEEP_WIDTH: Long = 1

    /**
     * The control will be resized to its minimum size.
     */
    final const val PRESET_MODE_MINSIZE: Long = 0

    /**
     * Snap all 4 anchors to the right edge of the parent control. The right margin becomes relative to the right edge and the top margin relative to the top right corner of the node's parent. Use with [setAnchorsPreset].
     */
    final const val PRESET_RIGHT_WIDE: Long = 11

    /**
     * Snap all 4 anchors to the top-left of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_TOP_LEFT: Long = 0

    /**
     * Snap all 4 anchors to the top-right of the parent control's bounds. Use with [setAnchorsPreset].
     */
    final const val PRESET_TOP_RIGHT: Long = 1

    /**
     * Snap all 4 anchors to the top edge of the parent control. The left margin becomes relative to the top left corner, the top margin relative to the top edge, and the right margin relative to the top right corner of the node's parent. Use with [setAnchorsPreset].
     */
    final const val PRESET_TOP_WIDE: Long = 10

    /**
     * Snap all 4 anchors to a vertical line that cuts the parent control in half. Use with [setAnchorsPreset].
     */
    final const val PRESET_VCENTER_WIDE: Long = 13

    /**
     * Snap all 4 anchors to the respective corners of the parent control. Set all 4 margins to 0 after you applied this preset and the [godot.Control] will fit its parent control. This is equivalent to the "Full Rect" layout option in the editor. Use with [setAnchorsPreset].
     */
    final const val PRESET_WIDE: Long = 15

    /**
     * Tells the parent [godot.Container] to let this node take all the available space on the axis you flag. If multiple neighboring nodes are set to expand, they'll share the space based on their stretch ratio. See [sizeFlagsStretchRatio]. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    final const val SIZE_EXPAND: Long = 2

    /**
     * Sets the node's size flags to both fill and expand. See the 2 constants above for more information.
     */
    final const val SIZE_EXPAND_FILL: Long = 3

    /**
     * Tells the parent [godot.Container] to expand the bounds of this node to fill all the available space without pushing any other node. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    final const val SIZE_FILL: Long = 1

    /**
     * Tells the parent [godot.Container] to center the node in itself. It centers the control based on its bounding box, so it doesn't work with the fill or expand size flags. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    final const val SIZE_SHRINK_CENTER: Long = 4

    /**
     * Tells the parent [godot.Container] to align the node with its end, either the bottom or the right edge. It doesn't work with the fill or expand size flags. Use with [sizeFlagsHorizontal] and [sizeFlagsVertical].
     */
    final const val SIZE_SHRINK_END: Long = 8
  }
}
