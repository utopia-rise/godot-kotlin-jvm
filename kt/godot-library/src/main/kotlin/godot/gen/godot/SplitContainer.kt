// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var splitOffset: Int
    @JvmName("splitOffsetProperty")
    get() = getSplitOffset()
    @JvmName("splitOffsetProperty")
    set(`value`) {
      setSplitOffset(value)
    }

  /**
   * If `true`, the area of the first [Control] will be collapsed and the dragger will be disabled.
   */
  public final inline var collapsed: Boolean
    @JvmName("collapsedProperty")
    get() = isCollapsed()
    @JvmName("collapsedProperty")
    set(`value`) {
      setCollapsed(value)
    }

  /**
   * Determines the dragger's visibility. See [DraggerVisibility] for details.
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
   * Can't be changed when using [HSplitContainer] and [VSplitContainer].
   */
  public final inline var vertical: Boolean
    @JvmName("verticalProperty")
    get() = isVertical()
    @JvmName("verticalProperty")
    set(`value`) {
      setVertical(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPLITCONTAINER, scriptIndex)
  }

  public final fun setSplitOffset(offset: Int): Unit {
    TransferContext.writeArguments(LONG to offset.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSplitOffsetPtr, NIL)
  }

  public final fun getSplitOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSplitOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clamps the [splitOffset] value to not go outside the currently possible minimal and maximum
   * values.
   */
  public final fun clampSplitOffset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clampSplitOffsetPtr, NIL)
  }

  public final fun setCollapsed(collapsed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to collapsed)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
  }

  public final fun isCollapsed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDraggerVisibility(mode: DraggerVisibility): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDraggerVisibilityPtr, NIL)
  }

  public final fun getDraggerVisibility(): DraggerVisibility {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDraggerVisibilityPtr, LONG)
    return SplitContainer.DraggerVisibility.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVertical(vertical: Boolean): Unit {
    TransferContext.writeArguments(BOOL to vertical)
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
      public fun from(`value`: Long): DraggerVisibility = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_split_offset", 1286410249)

    public val getSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_split_offset", 3905245786)

    public val clampSplitOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "clamp_split_offset", 3218959716)

    public val setCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_collapsed", 2586408642)

    public val isCollapsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_collapsed", 36873697)

    public val setDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_dragger_visibility", 1168273952)

    public val getDraggerVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "get_dragger_visibility", 967297479)

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "set_vertical", 2586408642)

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplitContainer", "is_vertical", 36873697)
  }
}
