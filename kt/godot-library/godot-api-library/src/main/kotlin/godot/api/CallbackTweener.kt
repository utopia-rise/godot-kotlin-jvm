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
 * [CallbackTweener] is used to call a method in a tweening sequence. See [Tween.tweenCallback] for
 * more usage information.
 *
 * The tweener will finish automatically if the callback's target object is freed.
 *
 * **Note:** [Tween.tweenCallback] is the only correct way to create [CallbackTweener]. Any
 * [CallbackTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class CallbackTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(126, scriptIndex)
  }

  /**
   * Makes the callback call delayed by given time in seconds.
   *
   * **Example:** Call [Node.queueFree] after 2 seconds:
   *
   * ```
   * var tween = get_tree().create_tween()
   * tween.tween_callback(queue_free).set_delay(2)
   * ```
   */
  public final fun setDelay(delay: Double): CallbackTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(ptr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CallbackTweener?)
  }

  public companion object {
    @JvmStatic
    public val setDelayName: MethodStringName1<CallbackTweener, CallbackTweener?, Double> =
        MethodStringName1<CallbackTweener, CallbackTweener?, Double>("set_delay")
  }

  public object MethodBindings {
    internal val setDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CallbackTweener", "set_delay", 3008182292)
  }
}
