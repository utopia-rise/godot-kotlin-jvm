// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A container used to provide scrollbars to a child control when needed.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * A container used to provide a child control with scrollbars when needed. Scrollbars will automatically be drawn at the right (for vertical) or bottom (for horizontal) and will enable dragging to move the viewable Control (and its children) within the ScrollContainer. Scrollbars will also automatically resize the grabber based on the [godot.Control.customMinimumSize] of the Control relative to the ScrollContainer.
 */
@GodotBaseType
public open class ScrollContainer : Container() {
  /**
   * Emitted when scrolling is started.
   */
  public val scrollStarted: Signal0 by signal()

  /**
   * Emitted when scrolling stops.
   */
  public val scrollEnded: Signal0 by signal()

  /**
   * If `true`, the ScrollContainer will automatically scroll to focused children (including indirect children) to make sure they are fully visible.
   */
  public var followFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_IS_FOLLOWING_FOCUS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_FOLLOW_FOCUS,
          NIL)
    }

  /**
   * The current horizontal scroll value. 
   *
   * **Note:** If you are setting this value in the [godot.Node.Ready] function or earlier, it needs to be wrapped with [godot.Object.setDeferred], since scroll bar's [godot.Range.maxValue] is not initialized yet.
   *
   * ```
   * 			func _ready():
   * 			    set_deferred("scroll_horizontal", 600)
   * 			```
   */
  public var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_H_SCROLL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_H_SCROLL, NIL)
    }

  /**
   * The current vertical scroll value.
   *
   * **Note:** Setting it early needs to be deferred, just like in [scrollHorizontal].
   *
   * ```
   * 			func _ready():
   * 			    set_deferred("scroll_vertical", 600)
   * 			```
   */
  public var scrollVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_V_SCROLL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_V_SCROLL, NIL)
    }

  /**
   * Overrides the [godot.ScrollBar.customStep] used when clicking the internal scroll bar's horizontal increment and decrement buttons or when using arrow keys when the [godot.ScrollBar] is focused.
   */
  public var scrollHorizontalCustomStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_HORIZONTAL_CUSTOM_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_HORIZONTAL_CUSTOM_STEP, NIL)
    }

  /**
   * Overrides the [godot.ScrollBar.customStep] used when clicking the internal scroll bar's vertical increment and decrement buttons or when using arrow keys when the [godot.ScrollBar] is focused.
   */
  public var scrollVerticalCustomStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_VERTICAL_CUSTOM_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_VERTICAL_CUSTOM_STEP, NIL)
    }

  /**
   * Controls whether horizontal scrollbar can be used and when it should be visible. See [enum ScrollMode] for options.
   */
  public var horizontalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_HORIZONTAL_SCROLL_MODE, LONG)
      return ScrollContainer.ScrollMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_HORIZONTAL_SCROLL_MODE, NIL)
    }

  /**
   * Controls whether vertical scrollbar can be used and when it should be visible. See [enum ScrollMode] for options.
   */
  public var verticalScrollMode: ScrollMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_VERTICAL_SCROLL_MODE, LONG)
      return ScrollContainer.ScrollMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_VERTICAL_SCROLL_MODE, NIL)
    }

  /**
   * Deadzone for touch scrolling. Lower deadzone makes the scrolling more sensitive.
   */
  public var scrollDeadzone: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_DEADZONE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_DEADZONE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCROLLCONTAINER, scriptIndex)
    return true
  }

  /**
   * Returns the horizontal scrollbar [godot.HScrollBar] of this [godot.ScrollContainer].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to disable or hide a scrollbar, you can use [horizontalScrollMode].
   */
  public fun getHScrollBar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_H_SCROLL_BAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HScrollBar?
  }

  /**
   * Returns the vertical scrollbar [godot.VScrollBar] of this [godot.ScrollContainer].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to disable or hide a scrollbar, you can use [verticalScrollMode].
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_V_SCROLL_BAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  /**
   * Ensures the given [control] is visible (must be a direct or indirect child of the ScrollContainer). Used by [followFocus].
   *
   * **Note:** This will not work on a node that was just added during the same frame. If you want to scroll to a newly added child, you must wait until the next frame using [godot.SceneTree.processFrame]:
   *
   * ```
   * 				add_child(child_node)
   * 				await get_tree().process_frame
   * 				ensure_control_visible(child_node)
   * 				```
   */
  public fun ensureControlVisible(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_ENSURE_CONTROL_VISIBLE, NIL)
  }

  public enum class ScrollMode(
    id: Long,
  ) {
    /**
     * Scrolling disabled, scrollbar will be invisible.
     */
    SCROLL_MODE_DISABLED(0),
    /**
     * Scrolling enabled, scrollbar will be visible only if necessary, i.e. container's content is bigger than the container.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
