// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Horizontal scroll bar.
 *
 * Horizontal version of [godot.ScrollBar], which goes from left (min) to right (max).
 */
@GodotBaseType
open class HScrollBar : ScrollBar() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_HSCROLLBAR, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
