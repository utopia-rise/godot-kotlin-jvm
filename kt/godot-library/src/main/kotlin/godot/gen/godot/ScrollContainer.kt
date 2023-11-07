// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A container used to provide a child control with scrollbars when needed. Scrollbars will
 * automatically be drawn at the right (for vertical) or bottom (for horizontal) and will enable
 * dragging to move the viewable Control (and its children) within the ScrollContainer. Scrollbars will
 * also automatically resize the grabber based on the [Control.customMinimumSize] of the Control
 * relative to the ScrollContainer.
 */
@GodotBaseType
public open class ScrollContainer : Container() {
  /**
   * Emitted when scrolling starts when dragging the scrollable area w*ith a touch event*. This
   * signal is *not* emitted when scrolling by dragging the scrollbar, scrolling with the mouse wheel
   * or scrolling with keyboard/gamepad events.
   * **Note:** This signal is only emitted on Android or iOS, or on desktop/web platforms when
   * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is enabled.
   */
  public val scrollStarted: Signal0 by signal()

  /**
   * Emitted when scrolling stops when dragging the scrollable area *with a touch event*. This
   * signal is *not* emitted when scrolling by dragging the scrollbar, scrolling with the mouse wheel
   * or scrolling with keyboard/gamepad events.
   * **Note:** This signal is only emitted on Android or iOS, or on desktop/web platforms when
   * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is enabled.
   */
  public val scrollEnded: Signal0 by signal()

  /**
   * If `true`, the ScrollContainer will automatically scroll to focused children (including
   * indirect children) to make sure they are fully visible.
   */
  public var followFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFollowingFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFollowFocusPtr, NIL)
    }

  /**
   * The current horizontal scroll value.
   * **Note:** If you are setting this value in the [Node.Ready] function or earlier, it needs to be
   * wrapped with [Object.setDeferred], since scroll bar's [Range.maxValue] is not initialized yet.
   * [codeblock]
   * func _ready():
   *     set_deferred("scroll_horizontal", 600)
   * [/codeblock]
   */
  public var scrollHorizontal: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHScrollPtr, NIL)
    }

  /**
   * The current vertical scroll value.
   * **Note:** Setting it early needs to be deferred, just like in [scrollHorizontal].
   * [codeblock]
   * func _ready():
   *     set_deferred("scroll_vertical", 600)
   * [/codeblock]
   */
  public var scrollVertical: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVScrollPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVScrollPtr, NIL)
    }

  /**
   * Overrides the [ScrollBar.customStep] used when clicking the internal scroll bar's horizontal
   * increment and decrement buttons or when using arrow keys when the [ScrollBar] is focused.
   */
  public var scrollHorizontalCustomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalCustomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalCustomStepPtr, NIL)
    }

  /**
   * Overrides the [ScrollBar.customStep] used when clicking the internal scroll bar's vertical
   * increment and decrement buttons or when using arrow keys when the [ScrollBar] is focused.
   */
  public var scrollVerticalCustomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalCustomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalCustomStepPtr, NIL)
    }

  /**
   * Controls whether horizontal scrollbar can be used and when it should be visible. See [enum
   * ScrollMode] for options.
   */
  public var horizontalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalScrollModePtr, LONG)
      return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalScrollModePtr, NIL)
    }

  /**
   * Controls whether vertical scrollbar can be used and when it should be visible. See [enum
   * ScrollMode] for options.
   */
  public var verticalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalScrollModePtr, LONG)
      return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalScrollModePtr, NIL)
    }

  /**
   * Deadzone for touch scrolling. Lower deadzone makes the scrolling more sensitive.
   */
  public var scrollDeadzone: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDeadzonePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDeadzonePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCROLLCONTAINER, scriptIndex)
    return true
  }

  /**
   * Returns the horizontal scrollbar [HScrollBar] of this [ScrollContainer].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to disable or hide a scrollbar, you can use [horizontalScrollMode].
   */
  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HScrollBar?)
  }

  /**
   * Returns the vertical scrollbar [VScrollBar] of this [ScrollContainer].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to disable or hide a scrollbar, you can use [verticalScrollMode].
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  /**
   * Ensures the given [param control] is visible (must be a direct or indirect child of the
   * ScrollContainer). Used by [followFocus].
   * **Note:** This will not work on a node that was just added during the same frame. If you want
   * to scroll to a newly added child, you must wait until the next frame using [signal
   * SceneTree.process_frame]:
   * [codeblock]
   * add_child(child_node)
   * await get_tree().process_frame
   * ensure_control_visible(child_node)
   * [/codeblock]
   */
  public fun ensureControlVisible(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.ensureControlVisiblePtr, NIL)
  }

  public enum class ScrollMode(
    id: Long,
  ) {
    /**
     * Scrolling disabled, scrollbar will be invisible.
     */
    SCROLL_MODE_DISABLED(0),
    /**
     * Scrolling enabled, scrollbar will be visible only if necessary, i.e. container's content is
     * bigger than the container.
     */
    SCROLL_MODE_AUTO(1),
    /**
     * Scrolling enabled, scrollbar will be always visible.
     */
    SCROLL_MODE_SHOW_ALWAYS(2),
    /**
     * Scrolling enabled, scrollbar will be hidden.
     */
    SCROLL_MODE_SHOW_NEVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_h_scroll")

    public val getHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll")

    public val setVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_v_scroll")

    public val getVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll")

    public val setHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_custom_step")

    public val getHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_custom_step")

    public val setVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_custom_step")

    public val getVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_custom_step")

    public val setHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_scroll_mode")

    public val getHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_scroll_mode")

    public val setVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_scroll_mode")

    public val getVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_scroll_mode")

    public val setDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_deadzone")

    public val getDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_deadzone")

    public val setFollowFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_follow_focus")

    public val isFollowingFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "is_following_focus")

    public val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll_bar")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll_bar")

    public val ensureControlVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "ensure_control_visible")
  }
}
