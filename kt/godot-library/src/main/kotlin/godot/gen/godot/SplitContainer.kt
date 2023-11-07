// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A container that accepts only two child controls, then arranges them horizontally or vertically
 * and creates a divisor between them. The divisor can be dragged around to change the size relation
 * between the child controls.
 */
@GodotBaseType
public open class SplitContainer : Container() {
  /**
   * Emitted when the dragger is dragged by user.
   */
  public val dragged: Signal1<Long> by signal("offset")

  /**
   * The initial offset of the splitting between the two [Control]s, with `0` being at the end of
   * the first [Control].
   */
  public var splitOffset: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSplitOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSplitOffsetPtr, NIL)
    }

  /**
   * If `true`, the area of the first [Control] will be collapsed and the dragger will be disabled.
   */
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
    }

  /**
   * Determines the dragger's visibility. See [enum DraggerVisibility] for details.
   */
  public var draggerVisibility: DraggerVisibility
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDraggerVisibilityPtr, LONG)
      return SplitContainer.DraggerVisibility.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDraggerVisibilityPtr, NIL)
    }

  /**
   * If `true`, the [SplitContainer] will arrange its children vertically, rather than horizontally.
   * Can't be changed when using [HSplitContainer] and [VSplitContainer].
   */
  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPLITCONTAINER, scriptIndex)
    return true
  }

  /**
   * Clamps the [splitOffset] value to not go outside the currently possible minimal and maximum
   * values.
   */
  public fun clampSplitOffset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clampSplitOffsetPtr, NIL)
  }

  public enum class DraggerVisibility(
    id: Long,
  ) {
    /**
     * The split dragger is visible when the cursor hovers it.
     */
    DRAGGER_VISIBLE(0),
    /**
     * The split dragger is never visible.
     */
    DRAGGER_HIDDEN(1),
    /**
     * The split dragger is never visible and its space collapsed.
     */
    DRAGGER_HIDDEN_COLLAPSED(2),
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
    public val setSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_split_offset")

    public val getSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_split_offset")

    public val clampSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "clamp_split_offset")

    public val setCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_collapsed")

    public val isCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_collapsed")

    public val setDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_dragger_visibility")

    public val getDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_dragger_visibility")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_vertical")

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_vertical")
  }
}
