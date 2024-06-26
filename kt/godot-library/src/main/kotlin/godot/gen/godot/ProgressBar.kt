// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A control used for visual representation of a percentage.
 *
 * A control used for visual representation of a percentage. Shows fill percentage from right to left.
 */
@GodotBaseType
public open class ProgressBar : Range() {
  /**
   * The fill direction. See [enum FillMode] for possible values.
   */
  public var fillMode: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFillModePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFillModePtr, NIL)
    }

  /**
   * If `true`, the fill percentage is displayed on the bar.
   */
  public var showPercentage: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPercentageShownPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowPercentagePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PROGRESSBAR, scriptIndex)
    return true
  }

  public enum class FillMode(
    id: Long,
  ) {
    /**
     * The progress bar fills from begin to end horizontally, according to the language direction. If [godot.Control.isLayoutRtl] returns `false`, it fills from left to right, and if it returns `true`, it fills from right to left.
     */
    FILL_BEGIN_TO_END(0),
    /**
     * The progress bar fills from end to begin horizontally, according to the language direction. If [godot.Control.isLayoutRtl] returns `false`, it fills from right to left, and if it returns `true`, it fills from left to right.
     */
    FILL_END_TO_BEGIN(1),
    /**
     * The progress fills from top to bottom.
     */
    FILL_TOP_TO_BOTTOM(2),
    /**
     * The progress fills from bottom to top.
     */
    FILL_BOTTOM_TO_TOP(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_fill_mode")

    public val getFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "get_fill_mode")

    public val setShowPercentagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_show_percentage")

    public val isPercentageShownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "is_percentage_shown")
  }
}
