// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for scroll bars.
 *
 * Scrollbars are a [godot.Range]-based [godot.Control], that display a draggable area (the size of the page). Horizontal ([godot.HScrollBar]) and Vertical ([godot.VScrollBar]) versions are available.
 */
@GodotBaseType
public open class ScrollBar : Range() {
  /**
   * Emitted when the scrollbar is being scrolled.
   */
  public val scrolling: Signal0 by signal()

  /**
   * Overrides the step used when clicking increment and decrement buttons or when using arrow keys when the [godot.ScrollBar] is focused.
   */
  public open var customStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLBAR_GET_CUSTOM_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLBAR_SET_CUSTOM_STEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCROLLBAR)
  }

  public companion object
}
