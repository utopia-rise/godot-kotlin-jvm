// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_CONTAINER_INDEX: Int = 194

/**
 * Base class for all GUI containers. A [Container] automatically arranges its child controls in a
 * certain way. This class can be inherited to make custom container types.
 */
@GodotBaseType
public open class Container : Control() {
  /**
   * Emitted when children are going to be sorted.
   */
  public val preSortChildren: Signal0 by Signal0

  /**
   * Emitted when sorting the children is needed.
   */
  public val sortChildren: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CONTAINER_INDEX, scriptIndex)
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
  public final fun queueSort(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.queueSortPtr, NIL)
  }

  /**
   * Fit a child control in a given rect. This is mainly a helper for creating custom container
   * classes.
   */
  public final fun fitChildInRect(child: Control?, rect: Rect2): Unit {
    Internals.writeArguments(OBJECT to child, RECT2 to rect)
    Internals.callMethod(rawPtr, MethodBindings.fitChildInRectPtr, NIL)
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
    public val queueSortPtr: VoidPtr =
        Internals.getMethodBindPtr("Container", "queue_sort", 3218959716)

    public val fitChildInRectPtr: VoidPtr =
        Internals.getMethodBindPtr("Container", "fit_child_in_rect", 1993438598)
  }
}
