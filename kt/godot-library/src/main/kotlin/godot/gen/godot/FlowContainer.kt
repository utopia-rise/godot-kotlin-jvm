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
  public var alignment: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
      return FlowContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
    }

  /**
   * The wrap behavior of the last, partially filled row or column (must be one of
   * [LAST_WRAP_ALIGNMENT_INHERIT], [LAST_WRAP_ALIGNMENT_BEGIN], [LAST_WRAP_ALIGNMENT_CENTER], or
   * [LAST_WRAP_ALIGNMENT_END]).
   */
  public var lastWrapAlignment: LastWrapAlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLastWrapAlignmentPtr, LONG)
      return FlowContainer.LastWrapAlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLastWrapAlignmentPtr, NIL)
    }

  /**
   * If `true`, the [FlowContainer] will arrange its children vertically, rather than horizontally.
   * Can't be changed when using [HFlowContainer] and [VFlowContainer].
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

  /**
   * If `true`, reverses fill direction. Horizontal [FlowContainer]s will fill rows bottom to top,
   * vertical [FlowContainer]s will fill columns right to left.
   * When using a vertical [FlowContainer] with a right to left [Control.layoutDirection], columns
   * will fill left to right instead.
   */
  public var reverseFill: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isReverseFillPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReverseFillPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FLOWCONTAINER, scriptIndex)
    return true
  }

  /**
   * Returns the current line count.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
        TypeManager.getMethodBindPtr("FlowContainer", "get_line_count")

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_alignment")

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_alignment")

    public val setLastWrapAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_last_wrap_alignment")

    public val getLastWrapAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "get_last_wrap_alignment")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_vertical")

    public val isVerticalPtr: VoidPtr = TypeManager.getMethodBindPtr("FlowContainer", "is_vertical")

    public val setReverseFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "set_reverse_fill")

    public val isReverseFillPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FlowContainer", "is_reverse_fill")
  }
}
