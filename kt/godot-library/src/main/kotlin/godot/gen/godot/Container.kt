// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all GUI containers. A [Container] automatically arranges its child controls in a
 * certain way. This class can be inherited to make custom container types.
 */
@GodotBaseType
public open class Container : Control() {
  /**
   * Emitted when children are going to be sorted.
   */
  public val preSortChildren: Signal0 by signal()

  /**
   * Emitted when sorting the children is needed.
   */
  public val sortChildren: Signal0 by signal()

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONTAINER, scriptIndex)
  }

  /**
   * Implement to return a list of allowed horizontal [Control.SizeFlags] for child nodes. This
   * doesn't technically prevent the usages of any other size flags, if your implementation requires
   * that. This only limits the options available to the user in the Inspector dock.
   * **Note:** Having no size flags is equal to having [Control.SIZE_SHRINK_BEGIN]. As such, this
   * value is always implicitly allowed.
   */
  public open fun _getAllowedSizeFlagsHorizontal(): PackedInt32Array {
    throw NotImplementedError("_get_allowed_size_flags_horizontal is not implemented for Container")
  }

  /**
   * Implement to return a list of allowed vertical [Control.SizeFlags] for child nodes. This
   * doesn't technically prevent the usages of any other size flags, if your implementation requires
   * that. This only limits the options available to the user in the Inspector dock.
   * **Note:** Having no size flags is equal to having [Control.SIZE_SHRINK_BEGIN]. As such, this
   * value is always implicitly allowed.
   */
  public open fun _getAllowedSizeFlagsVertical(): PackedInt32Array {
    throw NotImplementedError("_get_allowed_size_flags_vertical is not implemented for Container")
  }

  /**
   * Queue resort of the contained children. This is called automatically anyway, but can be called
   * upon request.
   */
  public fun queueSort(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queueSortPtr, NIL)
  }

  /**
   * Fit a child control in a given rect. This is mainly a helper for creating custom container
   * classes.
   */
  public fun fitChildInRect(child: Control, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.fitChildInRectPtr, NIL)
  }

  public companion object {
    /**
     * Notification just before children are going to be sorted, in case there's something to
     * process beforehand.
     */
    public final const val NOTIFICATION_PRE_SORT_CHILDREN: Long = 50

    /**
     * Notification for when sorting the children, it must be obeyed immediately.
     */
    public final const val NOTIFICATION_SORT_CHILDREN: Long = 51
  }

  internal object MethodBindings {
    public val _getAllowedSizeFlagsHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "_get_allowed_size_flags_horizontal")

    public val _getAllowedSizeFlagsVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "_get_allowed_size_flags_vertical")

    public val queueSortPtr: VoidPtr = TypeManager.getMethodBindPtr("Container", "queue_sort")

    public val fitChildInRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "fit_child_in_rect")
  }
}
