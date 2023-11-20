// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Abstract base class for scrollbars.
 *
 * Abstract base class for scrollbars, typically used to navigate through content that extends beyond the visible area of a control. Scrollbars are [godot.Range]-based controls.
 */
@GodotBaseType
public open class ScrollBar internal constructor() : Range() {
  /**
   * Emitted when the scrollbar is being scrolled.
   */
  public val scrolling: Signal0 by signal()

  /**
   * Overrides the step used when clicking increment and decrement buttons or when using arrow keys when the [godot.ScrollBar] is focused.
   */
  public var customStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomStepPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCROLLBAR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollBar", "set_custom_step")

    public val getCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollBar", "get_custom_step")
  }
}
