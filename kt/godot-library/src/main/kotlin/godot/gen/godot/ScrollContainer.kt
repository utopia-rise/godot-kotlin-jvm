// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A helper node for displaying scrollable elements such as lists.
 *
 * A ScrollContainer node meant to contain a [godot.Control] child.
 *
 * ScrollContainers will automatically create a scrollbar child ([godot.HScrollBar], [godot.VScrollBar], or both) when needed and will only draw the Control within the ScrollContainer area. Scrollbars will automatically be drawn at the right (for vertical) or bottom (for horizontal) and will enable dragging to move the viewable Control (and its children) within the ScrollContainer. Scrollbars will also automatically resize the grabber based on the [godot.Control.minimumSize] of the Control relative to the ScrollContainer.
 *
 * Works great with a [godot.Panel] control. You can set `EXPAND` on the children's size flags, so they will upscale to the ScrollContainer's size if it's larger (scroll is invisible for the chosen dimension).
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
   * Controls whether horizontal scrollbar can be used and when it should be visible. See [enum ScrollMode] for options.
   */
  public var horizontalScrollMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_HORIZONTAL_SCROLL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_HORIZONTAL_SCROLL_MODE, NIL)
    }

  /**
   * Controls whether vertical scrollbar can be used and when it should be visible. See [enum ScrollMode] for options.
   */
  public var verticalScrollMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_VERTICAL_SCROLL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_VERTICAL_SCROLL_MODE, NIL)
    }

  /**
   *
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCROLLCONTAINER)
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
   * Ensures the given `control` is visible (must be a direct or indirect child of the ScrollContainer). Used by [followFocus].
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
    id: Long
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
