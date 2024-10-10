// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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

private const val ENGINE_CLASS_FLOWCONTAINER_INDEX: Int = 224

/**
 * A container that arranges its child controls horizontally or vertically and wraps them around at
 * the borders. This is similar to how text in a book wraps around when no more words can fit on a
 * line.
 */
@GodotBaseType
public open class FlowContainer : Container() {
  /**
   * The alignment of the container's children (must be one of [ALIGNMENT_BEGIN],
   * [ALIGNMENT_CENTER], or [ALIGNMENT_END]).
   */
  public final inline var alignment: AlignmentMode
    @JvmName("alignmentProperty")
    get() = getAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setAlignment(value)
    }

  /**
   * The wrap behavior of the last, partially filled row or column (must be one of
   * [LAST_WRAP_ALIGNMENT_INHERIT], [LAST_WRAP_ALIGNMENT_BEGIN], [LAST_WRAP_ALIGNMENT_CENTER], or
   * [LAST_WRAP_ALIGNMENT_END]).
   */
  public final inline var lastWrapAlignment: LastWrapAlignmentMode
    @JvmName("lastWrapAlignmentProperty")
    get() = getLastWrapAlignment()
    @JvmName("lastWrapAlignmentProperty")
    set(`value`) {
      setLastWrapAlignment(value)
    }

  /**
   * If `true`, the [FlowContainer] will arrange its children vertically, rather than horizontally.
   * Can't be changed when using [HFlowContainer] and [VFlowContainer].
   */
  public final inline var vertical: Boolean
    @JvmName("verticalProperty")
    get() = isVertical()
    @JvmName("verticalProperty")
    set(`value`) {
      setVertical(value)
    }

  /**
   * If `true`, reverses fill direction. Horizontal [FlowContainer]s will fill rows bottom to top,
   * vertical [FlowContainer]s will fill columns right to left.
   * When using a vertical [FlowContainer] with a right to left [Control.layoutDirection], columns
   * will fill left to right instead.
   */
  public final inline var reverseFill: Boolean
    @JvmName("reverseFillProperty")
    get() = isReverseFill()
    @JvmName("reverseFillProperty")
    set(`value`) {
      setReverseFill(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_FLOWCONTAINER_INDEX, scriptIndex)
  }

  /**
   * Returns the current line count.
   */
  public final fun getLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAlignment(alignment: AlignmentMode): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): AlignmentMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return FlowContainer.AlignmentMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLastWrapAlignment(lastWrapAlignment: LastWrapAlignmentMode): Unit {
    Internals.writeArguments(LONG to lastWrapAlignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setLastWrapAlignmentPtr, NIL)
  }

  public final fun getLastWrapAlignment(): LastWrapAlignmentMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLastWrapAlignmentPtr, LONG)
    return FlowContainer.LastWrapAlignmentMode.from(Internals.readReturnValue(LONG) as Long)
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

  public final fun setReverseFill(reverseFill: Boolean): Unit {
    Internals.writeArguments(BOOL to reverseFill)
    Internals.callMethod(rawPtr, MethodBindings.setReverseFillPtr, NIL)
  }

  public final fun isReverseFill(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isReverseFillPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    /**
     * The child controls will be arranged at the beginning of the container, i.e. top if
     * orientation is vertical, left if orientation is horizontal (right for RTL layout).
     */
    ALIGNMENT_BEGIN(0),
    /**
     * The child controls will be centered in the container.
     */
    ALIGNMENT_CENTER(1),
    /**
     * The child controls will be arranged at the end of the container, i.e. bottom if orientation
     * is vertical, right if orientation is horizontal (left for RTL layout).
     */
    ALIGNMENT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single { it.id == `value` }
    }
  }

  public enum class LastWrapAlignmentMode(
    id: Long,
  ) {
    /**
     * The last partially filled row or column will wrap aligned to the previous row or column in
     * accordance with [alignment].
     */
    LAST_WRAP_ALIGNMENT_INHERIT(0),
    /**
     * The last partially filled row or column will wrap aligned to the beginning of the previous
     * row or column.
     */
    LAST_WRAP_ALIGNMENT_BEGIN(1),
    /**
     * The last partially filled row or column will wrap aligned to the center of the previous row
     * or column.
     */
    LAST_WRAP_ALIGNMENT_CENTER(2),
    /**
     * The last partially filled row or column will wrap aligned to the end of the previous row or
     * column.
     */
    LAST_WRAP_ALIGNMENT_END(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LastWrapAlignmentMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "get_line_count", 3905245786)

    public val setAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "set_alignment", 575250951)

    public val getAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "get_alignment", 3749743559)

    public val setLastWrapAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "set_last_wrap_alignment", 2899697495)

    public val getLastWrapAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "get_last_wrap_alignment", 3743456014)

    public val setVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "set_vertical", 2586408642)

    public val isVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "is_vertical", 36873697)

    public val setReverseFillPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "set_reverse_fill", 2586408642)

    public val isReverseFillPtr: VoidPtr =
        Internals.getMethodBindPtr("FlowContainer", "is_reverse_fill", 36873697)
  }
}
