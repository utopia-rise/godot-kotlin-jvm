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
import godot.core.MethodStringName1
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [SubtweenTweener] is used to execute a [Tween] as one step in a sequence defined by another
 * [Tween]. See [Tween.tweenSubtween] for more usage information.
 *
 * **Note:** [Tween.tweenSubtween] is the only correct way to create [SubtweenTweener]. Any
 * [SubtweenTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class SubtweenTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(647, scriptIndex)
  }

  /**
   * Sets the time in seconds after which the [SubtweenTweener] will start running the subtween. By
   * default there's no delay.
   */
  public final fun setDelay(delay: Double): SubtweenTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(ptr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SubtweenTweener?)
  }

  public companion object {
    @JvmStatic
    public val setDelayName: MethodStringName1<SubtweenTweener, SubtweenTweener?, Double> =
        MethodStringName1<SubtweenTweener, SubtweenTweener?, Double>("set_delay")
  }

  public object MethodBindings {
    internal val setDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubtweenTweener", "set_delay", 449181780)
  }
}
