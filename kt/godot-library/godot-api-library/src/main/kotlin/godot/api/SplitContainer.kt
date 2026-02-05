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
import godot.core.GodotEnum
import godot.core.PackedInt32Array
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A container that arranges child controls horizontally or vertically and creates grabbers between
 * them. The grabbers can be dragged around to change the size relations between the child controls.
 */
@GodotBaseType
public open class SplitContainer : Container() {
  /**
   * Emitted when any dragger is dragged by user.
   */
  public val dragged: Signal1<Long> by Signal1

  /**
   * Emitted when the user starts dragging.
   */
  public val dragStarted: Signal0 by Signal0

  /**
   * Emitted when the user ends dragging.
   */
  public val dragEnded: Signal0 by Signal0

  /**
   * Offsets for each dragger in pixels. Each one is the offset of the split between the [Control]
   * nodes before and after the dragger, with `0` being the default position. The default position is
   * based on the [Control] nodes expand flags and minimum sizes. See [Control.sizeFlagsHorizontal],
   * [Control.sizeFlagsVertical], and [Control.sizeFlagsStretchRatio].
   *
   * If none of the [Control] nodes before the dragger are expanded, the default position will be at
   * the start of the [SplitContainer]. If none of the [Control] nodes after the dragger are expanded,
   * the default position will be at the end of the [SplitContainer]. If the dragger is in between
   * expanded [Control] nodes, the default position will be in the middle, based on the
   * [Control.sizeFlagsStretchRatio]s and minimum sizes.
   *
   * **Note:** If the split offsets cause [Control] nodes to overlap, the first split will take
   * priority when resolving the positions.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var splitOffsets: PackedInt32Array
    @JvmName("splitOffsetsProperty")
    get() = getSplitOffsets()
    @JvmName("splitOffsetsProperty")
    set(`value`) {
      setSplitOffsets(value)
    }

  /**
   * If `true`, the draggers will be disabled and the children will be sized as if all
   * [splitOffsets] were `0`.
   */
  public final inline var collapsed: Boolean
    @JvmName("collapsedProperty")
    get() = isCollapsed()
    @JvmName("collapsedProperty")
    set(`value`) {
      setCollapsed(value)
    }

  /**
   * Enables or disables split dragging.
   */
  public final inline var draggingEnabled: Boolean
    @JvmName("draggingEnabledProperty")
    get() = isDraggingEnabled()
    @JvmName("draggingEnabledProperty")
    set(`value`) {
      setDraggingEnabled(value)
    }

  /**
   * Determines the dragger's visibility. This property does not determine whether dragging is
   * enabled or not. Use [draggingEnabled] for that.
   */
  public final inline var draggerVisibility: DraggerVisibility
    @JvmName("draggerVisibilityProperty")
    get() = getDraggerVisibility()
    @JvmName("draggerVisibilityProperty")
    set(`value`) {
      setDraggerVisibility(value)
    }

  /**
   * If `true`, the [SplitContainer] will arrange its children vertically, rather than horizontally.
   *
   * Can't be changed when using [HSplitContainer] and [VSplitContainer].
   */
  public final inline var vertical: Boolean
    @JvmName("verticalProperty")
    get() = isVertical()
    @JvmName("verticalProperty")
    set(`value`) {
      setVertical(value)
    }

  /**
   * If `true`, a touch-friendly drag handle will be enabled for better usability on smaller
   * screens. Unlike the standard grabber, this drag handle overlaps the [SplitContainer]'s children
   * and does not affect their minimum separation. The standard grabber will no longer be drawn when
   * this option is enabled.
   */
  public final inline var touchDraggerEnabled: Boolean
    @JvmName("touchDraggerEnabledProperty")
    get() = isTouchDraggerEnabled()
    @JvmName("touchDraggerEnabledProperty")
    set(`value`) {
      setTouchDraggerEnabled(value)
    }

  /**
   * Reduces the size of the drag area and split bar [theme_item split_bar_background] at the
   * beginning of the container.
   */
  public final inline var dragAreaMarginBegin: Int
    @JvmName("dragAreaMarginBeginProperty")
    get() = getDragAreaMarginBegin()
    @JvmName("dragAreaMarginBeginProperty")
    set(`value`) {
      setDragAreaMarginBegin(value)
    }

  /**
   * Reduces the size of the drag area and split bar [theme_item split_bar_background] at the end of
   * the container.
   */
  public final inline var dragAreaMarginEnd: Int
    @JvmName("dragAreaMarginEndProperty")
    get() = getDragAreaMarginEnd()
    @JvmName("dragAreaMarginEndProperty")
    set(`value`) {
      setDragAreaMarginEnd(value)
    }

  /**
   * Shifts the drag area in the axis of the container to prevent the drag area from overlapping the
   * [ScrollBar] or other selectable [Control] of a child node.
   */
  public final inline var dragAreaOffset: Int
    @JvmName("dragAreaOffsetProperty")
    get() = getDragAreaOffset()
    @JvmName("dragAreaOffsetProperty")
    set(`value`) {
      setDragAreaOffset(value)
    }

  /**
   * Highlights the drag area [Rect2] so you can see where it is during development. The drag area
   * is gold if [draggingEnabled] is `true`, and red if `false`.
   */
  public final inline var dragAreaHighlightInEditor: Boolean
    @JvmName("dragAreaHighlightInEditorProperty")
    get() = isDragAreaHighlightInEditorEnabled()
    @JvmName("dragAreaHighlightInEditorProperty")
    set(`value`) {
      setDragAreaHighlightInEditor(value)
    }

  /**
   * The first element of [splitOffsets].
   */
  public final inline var splitOffset: Int
    @JvmName("splitOffsetProperty")
    get() = getSplitOffset()
    @JvmName("splitOffsetProperty")
    set(`value`) {
      setSplitOffset(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(347, scriptPtr)
  }

  /**
   * This is a helper function for [splitOffsets] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = splitcontainer.splitOffsets
   * //Your changes
   * splitcontainer.splitOffsets = myCoreType
   * ``````
   *
   * Offsets for each dragger in pixels. Each one is the offset of the split between the [Control]
   * nodes before and after the dragger, with `0` being the default position. The default position is
   * based on the [Control] nodes expand flags and minimum sizes. See [Control.sizeFlagsHorizontal],
   * [Control.sizeFlagsVertical], and [Control.sizeFlagsStretchRatio].
   *
   * If none of the [Control] nodes before the dragger are expanded, the default position will be at
   * the start of the [SplitContainer]. If none of the [Control] nodes after the dragger are expanded,
   * the default position will be at the end of the [SplitContainer]. If the dragger is in between
   * expanded [Control] nodes, the default position will be in the middle, based on the
   * [Control.sizeFlagsStretchRatio]s and minimum sizes.
   *
   * **Note:** If the split offsets cause [Control] nodes to overlap, the first split will take
   * priority when resolving the positions.
   */
  @CoreTypeHelper
  public final fun splitOffsetsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      splitOffsets.apply {
     block(this)
     splitOffsets = this
  }

  /**
   * This is a helper function for [splitOffsets] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Offsets for each dragger in pixels. Each one is the offset of the split between the [Control]
   * nodes before and after the dragger, with `0` being the default position. The default position is
   * based on the [Control] nodes expand flags and minimum sizes. See [Control.sizeFlagsHorizontal],
   * [Control.sizeFlagsVertical], and [Control.sizeFlagsStretchRatio].
   *
   * If none of the [Control] nodes before the dragger are expanded, the default position will be at
   * the start of the [SplitContainer]. If none of the [Control] nodes after the dragger are expanded,
   * the default position will be at the end of the [SplitContainer]. If the dragger is in between
   * expanded [Control] nodes, the default position will be in the middle, based on the
   * [Control.sizeFlagsStretchRatio]s and minimum sizes.
   *
   * **Note:** If the split offsets cause [Control] nodes to overlap, the first split will take
   * priority when resolving the positions.
   */
  @CoreTypeHelper
  public final fun splitOffsetsMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = splitOffsets.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     splitOffsets = this
  }

  public final fun setSplitOffsets(offsets: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to offsets)
    TransferContext.callMethod(ptr, MethodBindings.setSplitOffsetsPtr, NIL)
  }

  public final fun getSplitOffsets(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSplitOffsetsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Clamps the [splitOffsets] values to ensure they are within valid ranges and do not overlap with
   * each other. When overlaps occur, this method prioritizes one split offset (at index
   * [priorityIndex]) by clamping any overlapping split offsets to it.
   */
  @JvmOverloads
  public final fun clampSplitOffset(priorityIndex: Int = 0): Unit {
    TransferContext.writeArguments(LONG to priorityIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.clampSplitOffsetPtr, NIL)
  }

  public final fun setCollapsed(collapsed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to collapsed)
    TransferContext.callMethod(ptr, MethodBindings.setCollapsedPtr, NIL)
  }

  public final fun isCollapsed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollapsedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDraggerVisibility(mode: DraggerVisibility): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setDraggerVisibilityPtr, NIL)
  }

  public final fun getDraggerVisibility(): DraggerVisibility {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDraggerVisibilityPtr, LONG)
    return DraggerVisibility.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVertical(vertical: Boolean): Unit {
    TransferContext.writeArguments(BOOL to vertical)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVerticalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDraggingEnabled(draggingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to draggingEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setDraggingEnabledPtr, NIL)
  }

  public final fun isDraggingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDraggingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragAreaMarginBegin(margin: Int): Unit {
    TransferContext.writeArguments(LONG to margin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDragAreaMarginBeginPtr, NIL)
  }

  public final fun getDragAreaMarginBegin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragAreaMarginBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDragAreaMarginEnd(margin: Int): Unit {
    TransferContext.writeArguments(LONG to margin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDragAreaMarginEndPtr, NIL)
  }

  public final fun getDragAreaMarginEnd(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragAreaMarginEndPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDragAreaOffset(offset: Int): Unit {
    TransferContext.writeArguments(LONG to offset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDragAreaOffsetPtr, NIL)
  }

  public final fun getDragAreaOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragAreaOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDragAreaHighlightInEditor(dragAreaHighlightInEditor: Boolean): Unit {
    TransferContext.writeArguments(BOOL to dragAreaHighlightInEditor)
    TransferContext.callMethod(ptr, MethodBindings.setDragAreaHighlightInEditorPtr, NIL)
  }

  public final fun isDragAreaHighlightInEditorEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDragAreaHighlightInEditorEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an [Array] of the drag area [Control]s. These are the interactable [Control] nodes
   * between each child. For example, this can be used to add a pre-configured button to a drag area
   * [Control] so that it rides along with the split bar. Try setting the [Button] anchors to `center`
   * prior to the [Node.reparent] call.
   *
   * ```
   * $BarnacleButton.reparent($SplitContainer.get_drag_area_controls()[0])
   * ```
   *
   * **Note:** The drag area [Control]s are drawn over the [SplitContainer]'s children, so
   * [CanvasItem] draw objects called from a drag area and children added to it will also appear over
   * the [SplitContainer]'s children. Try setting [Control.mouseFilter] of custom children to
   * [Control.MOUSE_FILTER_IGNORE] to prevent blocking the mouse from dragging if desired.
   *
   * **Warning:** These are required internal nodes, removing or freeing them may cause a crash.
   */
  public final fun getDragAreaControls(): VariantArray<Control> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragAreaControlsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Control>)
  }

  public final fun setTouchDraggerEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setTouchDraggerEnabledPtr, NIL)
  }

  public final fun isTouchDraggerEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTouchDraggerEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the drag area [Control]. For example, you can move a pre-configured button into the
   * drag area [Control] so that it rides along with the split bar. Try setting the [Button] anchors to
   * `center` prior to the `reparent()` call.
   *
   * ```
   * $BarnacleButton.reparent($SplitContainer.get_drag_area_control())
   * ```
   *
   * **Note:** The drag area [Control] is drawn over the [SplitContainer]'s children, so
   * [CanvasItem] draw objects called from the [Control] and children added to the [Control] will also
   * appear over the [SplitContainer]'s children. Try setting [Control.mouseFilter] of custom children
   * to [Control.MOUSE_FILTER_IGNORE] to prevent blocking the mouse from dragging if desired.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash.
   */
  public final fun getDragAreaControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragAreaControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Control?)
  }

  public final fun setSplitOffset(offset: Int): Unit {
    TransferContext.writeArguments(LONG to offset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSplitOffsetPtr, NIL)
  }

  public final fun getSplitOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSplitOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public enum class DraggerVisibility(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The split dragger icon is always visible when [theme_item autohide] is `false`, otherwise
     * visible only when the cursor hovers it.
     *
     * The size of the grabber icon determines the minimum [theme_item separation].
     *
     * The dragger icon is automatically hidden if the length of the grabber icon is longer than the
     * split bar.
     */
    VISIBLE(0),
    /**
     * The split dragger icon is never visible regardless of the value of [theme_item autohide].
     *
     * The size of the grabber icon determines the minimum [theme_item separation].
     */
    HIDDEN(1),
    /**
     * The split dragger icon is not visible, and the split bar is collapsed to zero thickness.
     */
    HIDDEN_COLLAPSED(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): DraggerVisibility = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSplitOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_split_offsets", 3614634198)

    internal val getSplitOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_split_offsets", 1930428628)

    internal val clampSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "clamp_split_offset", 1995695955)

    internal val setCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_collapsed", 2586408642)

    internal val isCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_collapsed", 36873697)

    internal val setDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_dragger_visibility", 1168273952)

    internal val getDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_dragger_visibility", 967297479)

    internal val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_vertical", 2586408642)

    internal val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_vertical", 36873697)

    internal val setDraggingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_dragging_enabled", 2586408642)

    internal val isDraggingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_dragging_enabled", 36873697)

    internal val setDragAreaMarginBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_drag_area_margin_begin", 1286410249)

    internal val getDragAreaMarginBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_drag_area_margin_begin", 3905245786)

    internal val setDragAreaMarginEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_drag_area_margin_end", 1286410249)

    internal val getDragAreaMarginEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_drag_area_margin_end", 3905245786)

    internal val setDragAreaOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_drag_area_offset", 1286410249)

    internal val getDragAreaOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_drag_area_offset", 3905245786)

    internal val setDragAreaHighlightInEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_drag_area_highlight_in_editor", 2586408642)

    internal val isDragAreaHighlightInEditorEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_drag_area_highlight_in_editor_enabled", 36873697)

    internal val getDragAreaControlsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_drag_area_controls", 2915620761)

    internal val setTouchDraggerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_touch_dragger_enabled", 2586408642)

    internal val isTouchDraggerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_touch_dragger_enabled", 36873697)

    internal val getDragAreaControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_drag_area_control", 829782337)

    internal val setSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_split_offset", 1286410249)

    internal val getSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_split_offset", 3905245786)
  }
}
