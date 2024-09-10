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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_FLOWCONTAINER, scriptIndex)
  }

  /**
   * Returns the current line count.
   */
  public final fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setAlignment(alignment: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return FlowContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLastWrapAlignment(lastWrapAlignment: LastWrapAlignmentMode): Unit {
    TransferContext.writeArguments(LONG to lastWrapAlignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setLastWrapAlignmentPtr, NIL)
  }

  public final fun getLastWrapAlignment(): LastWrapAlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLastWrapAlignmentPtr, LONG)
    return FlowContainer.LastWrapAlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVertical(vertical: Boolean): Unit {
    TransferContext.writeArguments(BOOL to vertical)
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setReverseFill(reverseFill: Boolean): Unit {
    TransferContext.writeArguments(BOOL to reverseFill)
    TransferContext.callMethod(rawPtr, MethodBindings.setReverseFillPtr, NIL)
  }

  public final fun isReverseFill(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isReverseFillPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
        TypeManager.getMethodBindPtr("FlowContainer", "get_line_count", 3905245786)

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_alignment", 575250951)

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_alignment", 3749743559)

    public val setLastWrapAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_last_wrap_alignment", 2899697495)

    public val getLastWrapAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_last_wrap_alignment", 3743456014)

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_vertical", 2586408642)

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "is_vertical", 36873697)

    public val setReverseFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_reverse_fill", 2586408642)

    public val isReverseFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "is_reverse_fill", 36873697)
  }
}
