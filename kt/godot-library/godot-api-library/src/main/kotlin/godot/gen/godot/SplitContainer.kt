// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SPLITCONTAINER_INDEX: Int = 608

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
  public val dragged: Signal1<Long> by Signal1

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
    Internals.callConstructor(this, ENGINE_CLASS_SPLITCONTAINER_INDEX, scriptIndex)
  }

  public final fun setSplitOffset(offset: Int): Unit {
    Internals.writeArguments(LONG to offset.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSplitOffsetPtr, NIL)
  }

  public final fun getSplitOffset(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSplitOffsetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clamps the [splitOffset] value to not go outside the currently possible minimal and maximum
   * values.
   */
  public final fun clampSplitOffset(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clampSplitOffsetPtr, NIL)
  }

  public final fun setCollapsed(collapsed: Boolean): Unit {
    Internals.writeArguments(BOOL to collapsed)
    Internals.callMethod(rawPtr, MethodBindings.setCollapsedPtr, NIL)
  }

  public final fun isCollapsed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollapsedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDraggerVisibility(mode: DraggerVisibility): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDraggerVisibilityPtr, NIL)
  }

  public final fun getDraggerVisibility(): DraggerVisibility {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDraggerVisibilityPtr, LONG)
    return SplitContainer.DraggerVisibility.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVertical(vertical: Boolean): Unit {
    Internals.writeArguments(BOOL to vertical)
    Internals.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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

  public object MethodBindings {
    internal val setSplitOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "set_split_offset", 1286410249)

    internal val getSplitOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "get_split_offset", 3905245786)

    internal val clampSplitOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "clamp_split_offset", 3218959716)

    internal val setCollapsedPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "set_collapsed", 2586408642)

    internal val isCollapsedPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "is_collapsed", 36873697)

    internal val setDraggerVisibilityPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "set_dragger_visibility", 1168273952)

    internal val getDraggerVisibilityPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "get_dragger_visibility", 967297479)

    internal val setVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "set_vertical", 2586408642)

    internal val isVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("SplitContainer", "is_vertical", 36873697)
  }
}
