// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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
   *
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
    createNativeObject(109, scriptIndex)
  }

  /**
   * Adds a [Control] node to the box as a spacer. If [begin] is `true`, it will insert the
   * [Control] node in front of all other children.
   */
  public final fun addSpacer(begin: Boolean): Control? {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(ptr, MethodBindings.addSpacerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Control?)
  }

  public final fun setAlignment(alignment: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignment.value)
    TransferContext.callMethod(ptr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlignmentPtr, LONG)
    return AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
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

  public enum class AlignmentMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The child controls will be arranged at the beginning of the container, i.e. top if
     * orientation is vertical, left if orientation is horizontal (right for RTL layout).
     */
    BEGIN(0),
    /**
     * The child controls will be centered in the container.
     */
    CENTER(1),
    /**
     * The child controls will be arranged at the end of the container, i.e. bottom if orientation
     * is vertical, right if orientation is horizontal (left for RTL layout).
     */
    END(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val addSpacerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "add_spacer", 1326660695)

    internal val setAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_alignment", 2456745134)

    internal val getAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "get_alignment", 1915476527)

    internal val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "set_vertical", 2586408642)

    internal val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoxContainer", "is_vertical", 36873697)
  }
}
