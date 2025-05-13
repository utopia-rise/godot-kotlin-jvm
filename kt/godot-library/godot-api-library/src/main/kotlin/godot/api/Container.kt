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
import godot.core.MethodStringName0
import godot.core.MethodStringName2
import godot.core.PackedInt32Array
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

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
    createNativeObject(177, scriptIndex)
  }

  /**
   * Implement to return a list of allowed horizontal [Control.SizeFlags] for child nodes. This
   * doesn't technically prevent the usages of any other size flags, if your implementation requires
   * that. This only limits the options available to the user in the Inspector dock.
   *
   * **Note:** Having no size flags is equal to having [Control.SIZE_SHRINK_BEGIN]. As such, this
   * value is always implicitly allowed.
   */
  public open fun _getAllowedSizeFlagsHorizontal(): PackedInt32Array {
    throw NotImplementedError("_getAllowedSizeFlagsHorizontal is not implemented for Container")
  }

  /**
   * Implement to return a list of allowed vertical [Control.SizeFlags] for child nodes. This
   * doesn't technically prevent the usages of any other size flags, if your implementation requires
   * that. This only limits the options available to the user in the Inspector dock.
   *
   * **Note:** Having no size flags is equal to having [Control.SIZE_SHRINK_BEGIN]. As such, this
   * value is always implicitly allowed.
   */
  public open fun _getAllowedSizeFlagsVertical(): PackedInt32Array {
    throw NotImplementedError("_getAllowedSizeFlagsVertical is not implemented for Container")
  }

  /**
   * Queue resort of the contained children. This is called automatically anyway, but can be called
   * upon request.
   */
  public final fun queueSort(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.queueSortPtr, NIL)
  }

  /**
   * Fit a child control in a given rect. This is mainly a helper for creating custom container
   * classes.
   */
  public final fun fitChildInRect(child: Control?, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.fitChildInRectPtr, NIL)
  }

  public companion object {
    @JvmStatic
    public val queueSortName: MethodStringName0<Container, Unit> =
        MethodStringName0<Container, Unit>("queue_sort")

    @JvmStatic
    public val fitChildInRectName: MethodStringName2<Container, Unit, Control?, Rect2> =
        MethodStringName2<Container, Unit, Control?, Rect2>("fit_child_in_rect")

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

  public object MethodBindings {
    internal val queueSortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "queue_sort", 3218959716)

    internal val fitChildInRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Container", "fit_child_in_rect", 1993438598)
  }
}
