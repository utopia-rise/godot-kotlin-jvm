// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val scrollStarted: Signal0 by Signal0

  /**
   * Emitted when scrolling stops when dragging the scrollable area *with a touch event*. This
   * signal is *not* emitted when scrolling by dragging the scrollbar, scrolling with the mouse wheel
   * or scrolling with keyboard/gamepad events.
   * **Note:** This signal is only emitted on Android or iOS, or on desktop/web platforms when
   * [ProjectSettings.inputDevices/pointing/emulateTouchFromMouse] is enabled.
   */
  public val scrollEnded: Signal0 by Signal0

  /**
   * If `true`, the ScrollContainer will automatically scroll to focused children (including
   * indirect children) to make sure they are fully visible.
   */
  public final inline var followFocus: Boolean
    @JvmName("followFocusProperty")
    get() = isFollowingFocus()
    @JvmName("followFocusProperty")
    set(`value`) {
      setFollowFocus(value)
    }

  /**
   * If `true`, [theme_item focus] is drawn when the ScrollContainer or one of its descendant nodes
   * is focused.
   */
  public final inline var drawFocusBorder: Boolean
    @JvmName("drawFocusBorderProperty")
    get() = getDrawFocusBorder()
    @JvmName("drawFocusBorderProperty")
    set(`value`) {
      setDrawFocusBorder(value)
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
  public final inline var scrollHorizontal: Int
    @JvmName("scrollHorizontalProperty")
    get() = getHScroll()
    @JvmName("scrollHorizontalProperty")
    set(`value`) {
      setHScroll(value)
    }

  /**
   * The current vertical scroll value.
   * **Note:** Setting it early needs to be deferred, just like in [scrollHorizontal].
   * [codeblock]
   * func _ready():
   *     set_deferred("scroll_vertical", 600)
   * [/codeblock]
   */
  public final inline var scrollVertical: Int
    @JvmName("scrollVerticalProperty")
    get() = getVScroll()
    @JvmName("scrollVerticalProperty")
    set(`value`) {
      setVScroll(value)
    }

  /**
   * Overrides the [ScrollBar.customStep] used when clicking the internal scroll bar's horizontal
   * increment and decrement buttons or when using arrow keys when the [ScrollBar] is focused.
   */
  public final inline var scrollHorizontalCustomStep: Float
    @JvmName("scrollHorizontalCustomStepProperty")
    get() = getHorizontalCustomStep()
    @JvmName("scrollHorizontalCustomStepProperty")
    set(`value`) {
      setHorizontalCustomStep(value)
    }

  /**
   * Overrides the [ScrollBar.customStep] used when clicking the internal scroll bar's vertical
   * increment and decrement buttons or when using arrow keys when the [ScrollBar] is focused.
   */
  public final inline var scrollVerticalCustomStep: Float
    @JvmName("scrollVerticalCustomStepProperty")
    get() = getVerticalCustomStep()
    @JvmName("scrollVerticalCustomStepProperty")
    set(`value`) {
      setVerticalCustomStep(value)
    }

  /**
   * Controls whether horizontal scrollbar can be used and when it should be visible. See
   * [ScrollMode] for options.
   */
  public final inline var horizontalScrollMode: ScrollMode
    @JvmName("horizontalScrollModeProperty")
    get() = getHorizontalScrollMode()
    @JvmName("horizontalScrollModeProperty")
    set(`value`) {
      setHorizontalScrollMode(value)
    }

  /**
   * Controls whether vertical scrollbar can be used and when it should be visible. See [ScrollMode]
   * for options.
   */
  public final inline var verticalScrollMode: ScrollMode
    @JvmName("verticalScrollModeProperty")
    get() = getVerticalScrollMode()
    @JvmName("verticalScrollModeProperty")
    set(`value`) {
      setVerticalScrollMode(value)
    }

  /**
   * Deadzone for touch scrolling. Lower deadzone makes the scrolling more sensitive.
   */
  public final inline var scrollDeadzone: Int
    @JvmName("scrollDeadzoneProperty")
    get() = getDeadzone()
    @JvmName("scrollDeadzoneProperty")
    set(`value`) {
      setDeadzone(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(580, scriptIndex)
  }

  public final fun setHScroll(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHScrollPtr, NIL)
  }

  public final fun getHScroll(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHScrollPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVScroll(`value`: Int): Unit {
    TransferContext.writeArguments(LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setVScrollPtr, NIL)
  }

  public final fun getVScroll(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHorizontalCustomStep(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalCustomStepPtr, NIL)
  }

  public final fun getHorizontalCustomStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalCustomStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVerticalCustomStep(`value`: Float): Unit {
    TransferContext.writeArguments(DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVerticalCustomStepPtr, NIL)
  }

  public final fun getVerticalCustomStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalCustomStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHorizontalScrollMode(enable: ScrollMode): Unit {
    TransferContext.writeArguments(LONG to enable.id)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalScrollModePtr, NIL)
  }

  public final fun getHorizontalScrollMode(): ScrollMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalScrollModePtr, LONG)
    return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalScrollMode(enable: ScrollMode): Unit {
    TransferContext.writeArguments(LONG to enable.id)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalScrollModePtr, NIL)
  }

  public final fun getVerticalScrollMode(): ScrollMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalScrollModePtr, LONG)
    return ScrollContainer.ScrollMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDeadzone(deadzone: Int): Unit {
    TransferContext.writeArguments(LONG to deadzone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDeadzonePtr, NIL)
  }

  public final fun getDeadzone(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDeadzonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFollowFocus(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFollowFocusPtr, NIL)
  }

  public final fun isFollowingFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFollowingFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the horizontal scrollbar [HScrollBar] of this [ScrollContainer].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to disable or hide a scrollbar, you can use [horizontalScrollMode].
   */
  public final fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HScrollBar?)
  }

  /**
   * Returns the vertical scrollbar [VScrollBar] of this [ScrollContainer].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to disable or hide a scrollbar, you can use [verticalScrollMode].
   */
  public final fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as VScrollBar?)
  }

  /**
   * Ensures the given [control] is visible (must be a direct or indirect child of the
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
  public final fun ensureControlVisible(control: Control?): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(ptr, MethodBindings.ensureControlVisiblePtr, NIL)
  }

  public final fun setDrawFocusBorder(draw: Boolean): Unit {
    TransferContext.writeArguments(BOOL to draw)
    TransferContext.callMethod(ptr, MethodBindings.setDrawFocusBorderPtr, NIL)
  }

  public final fun getDrawFocusBorder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawFocusBorderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    /**
     * Combines [SCROLL_MODE_AUTO] and [SCROLL_MODE_SHOW_ALWAYS]. The scrollbar is only visible if
     * necessary, but the content size is adjusted as if it was always visible. It's useful for
     * ensuring that content size stays the same regardless if the scrollbar is visible.
     */
    SCROLL_MODE_RESERVE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScrollMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_h_scroll", 1286410249)

    internal val getHScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll", 3905245786)

    internal val setVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_v_scroll", 1286410249)

    internal val getVScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll", 3905245786)

    internal val setHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_custom_step", 373806689)

    internal val getHorizontalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_custom_step", 1740695150)

    internal val setVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_custom_step", 373806689)

    internal val getVerticalCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_custom_step", 1740695150)

    internal val setHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_horizontal_scroll_mode", 2750506364)

    internal val getHorizontalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_horizontal_scroll_mode", 3987985145)

    internal val setVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_vertical_scroll_mode", 2750506364)

    internal val getVerticalScrollModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_vertical_scroll_mode", 3987985145)

    internal val setDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_deadzone", 1286410249)

    internal val getDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_deadzone", 3905245786)

    internal val setFollowFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_follow_focus", 2586408642)

    internal val isFollowingFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "is_following_focus", 36873697)

    internal val getHScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_h_scroll_bar", 4004517983)

    internal val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_v_scroll_bar", 2630340773)

    internal val ensureControlVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "ensure_control_visible", 1496901182)

    internal val setDrawFocusBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "set_draw_focus_border", 2586408642)

    internal val getDrawFocusBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollContainer", "get_draw_focus_border", 2240911060)
  }
}
