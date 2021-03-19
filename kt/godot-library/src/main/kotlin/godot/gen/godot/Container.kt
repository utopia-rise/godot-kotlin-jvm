// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Long
import kotlin.Suppress

/**
 * Base node for containers.
 * 
 * Base node for containers. A [godot.Container] contains other controls and automatically arranges them in a certain way.
 *
 * A Control can inherit this to create custom container classes.
 */
@GodotBaseType
open class Container : Control() {
  /**
   * Emitted when sorting the children is needed.
   */
  val sortChildren: Signal0 by signal()

  override fun __new() {
    callConstructor(ENGINECLASS_CONTAINER)
  }

  open fun _childMinsizeChanged() {
  }

  open fun _sortChildren() {
  }

  /**
   * Fit a child control in a given rect. This is mainly a helper for creating custom container classes.
   */
  open fun fitChildInRect(child: Control, rect: Rect2) {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_FIT_CHILD_IN_RECT, NIL)
  }

  /**
   * Queue resort of the contained children. This is called automatically anyway, but can be called upon request.
   */
  open fun queueSort() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_QUEUE_SORT, NIL)
  }

  companion object {
    /**
     * Notification for when sorting the children, it must be obeyed immediately.
     */
    final const val NOTIFICATION_SORT_CHILDREN: Long = 50
  }
}
