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
import godot.core.Signal0
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for scrollbars, typically used to navigate through content that extends
 * beyond the visible area of a control. Scrollbars are [Range]-based controls.
 */
@GodotBaseType
public open class ScrollBar internal constructor() : Range() {
  /**
   * Emitted when the scrollbar is being scrolled.
   */
  public val scrolling: Signal0 by Signal0

  /**
   * Overrides the step used when clicking increment and decrement buttons or when using arrow keys
   * when the [ScrollBar] is focused.
   */
  public final inline var customStep: Float
    @JvmName("customStepProperty")
    get() = getCustomStep()
    @JvmName("customStepProperty")
    set(`value`) {
      setCustomStep(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(579, scriptIndex)
  }

  public final fun setCustomStep(step: Float): Unit {
    TransferContext.writeArguments(DOUBLE to step.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCustomStepPtr, NIL)
  }

  public final fun getCustomStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollBar", "set_custom_step", 373806689)

    internal val getCustomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScrollBar", "get_custom_step", 1740695150)
  }
}
