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
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_BOXCONTAINER_INDEX: Int = 143

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
    Internals.callConstructor(this, ENGINE_CLASS_BOXCONTAINER_INDEX, scriptIndex)
  }

  /**
   * Adds a [Control] node to the box as a spacer. If [begin] is `true`, it will insert the
   * [Control] node in front of all other children.
   */
  public final fun addSpacer(begin: Boolean): Control? {
    Internals.writeArguments(BOOL to begin)
    Internals.callMethod(rawPtr, MethodBindings.addSpacerPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Control?)
  }

  public final fun setAlignment(alignment: AlignmentMode): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlignmentPtr, NIL)
  }

  public final fun getAlignment(): AlignmentMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlignmentPtr, LONG)
    return BoxContainer.AlignmentMode.from(Internals.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val addSpacerPtr: VoidPtr =
        Internals.getMethodBindPtr("BoxContainer", "add_spacer", 1326660695)

    internal val setAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("BoxContainer", "set_alignment", 2456745134)

    internal val getAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("BoxContainer", "get_alignment", 1915476527)

    internal val setVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("BoxContainer", "set_vertical", 2586408642)

    internal val isVerticalPtr: VoidPtr =
        Internals.getMethodBindPtr("BoxContainer", "is_vertical", 36873697)
  }
}
