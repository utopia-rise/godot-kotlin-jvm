// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Double
import kotlin.Suppress

/**
 * Base class for scroll bars.
 *
 * Scrollbars are a [godot.Range]-based [godot.Control], that display a draggable area (the size of the page). Horizontal ([godot.HScrollBar]) and Vertical ([godot.VScrollBar]) versions are available.
 */
@GodotBaseType
open class ScrollBar : Range() {
  /**
   * Emitted when the scrollbar is being scrolled.
   */
  val scrolling: Signal0 by signal()

  /**
   * Overrides the step used when clicking increment and decrement buttons or when using arrow keys when the [godot.ScrollBar] is focused.
   */
  open var customStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLBAR_GET_CUSTOM_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLBAR_SET_CUSTOM_STEP, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SCROLLBAR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _dragNodeExit() {
  }

  open fun _dragNodeInput(arg0: InputEvent) {
  }

  override fun _guiInput(event: InputEvent) {
  }
}
