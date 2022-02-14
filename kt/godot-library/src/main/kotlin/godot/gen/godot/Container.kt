// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base node for containers.
 *
 * Base node for containers. A [godot.Container] contains other controls and automatically arranges them in a certain way.
 *
 * A Control can inherit this to create custom container classes.
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONTAINER)
  }

  /**
   * Queue resort of the contained children. This is called automatically anyway, but can be called upon request.
   */
  public open fun queueSort(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_QUEUE_SORT, NIL)
  }

  /**
   * Fit a child control in a given rect. This is mainly a helper for creating custom container classes.
   */
  public open fun fitChildInRect(child: Control, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_FIT_CHILD_IN_RECT, NIL)
  }

  public companion object {
    /**
     * Notification just before children are going to be sorted, in case there's something to process beforehand.
     */
    public final const val NOTIFICATION_PRE_SORT_CHILDREN: Long = 50

    /**
     * Notification for when sorting the children, it must be obeyed immediately.
     */
    public final const val NOTIFICATION_SORT_CHILDREN: Long = 51
  }
}
