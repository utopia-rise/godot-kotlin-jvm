// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A container that arranges its child controls horizontally or vertically, rearranging them
 * automatically when their minimum size changes.
 */
@GodotBaseType
public open class BoxContainer : Container() {
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
   * If `true`, the [BoxContainer] will arrange its children vertically, rather than horizontally.
   * Can't be changed when using [HBoxContainer] and [VBoxContainer].
   */
  public final inline var vertical: Boolean
    @JvmName("verticalProperty")
    get() = isVertical()
    @JvmName("verticalProperty")
    set(`value`) {
      setVertical(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BOXCONTAINER, scriptIndex)
  }

  /**
   * Adds a [Control] node to the box as a spacer. If [begin] is `true`, it will insert the
   * [Control] node in front of all other children.
   */
  public final fun addSpacer(begin: Boolean): Control? {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(rawPtr, MethodBindings.addSpacerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Control?)
  }

  public final fun setAlignment(alignment: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return BoxContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public companion object

  internal object MethodBindings {
    public val addSpacerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "add_spacer", 1326660695)

    public val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_alignment", 2456745134)

    public val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "get_alignment", 1915476527)

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_vertical", 2586408642)

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "is_vertical", 36873697)
  }
}
