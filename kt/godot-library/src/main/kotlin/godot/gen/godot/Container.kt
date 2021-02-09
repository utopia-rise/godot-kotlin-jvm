// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Container : Control() {
  val sortChildren: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CONTAINER)

  open fun _child_minsize_changed() {
  }

  open fun _sort_children() {
  }

  open fun fitChildInRect(child: Control, rect: Rect2) {
    TransferContext.writeArguments(OBJECT to child, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_FIT_CHILD_IN_RECT, NIL)
  }

  open fun queueSort() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTAINER_QUEUE_SORT, NIL)
  }

  companion object {
    final const val NOTIFICATION_SORT_CHILDREN: Long = 50
  }
}
