// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Calls the specified method after optional delay.
 *
 * [godot.CallbackTweener] is used to call a method in a tweening sequence. See [godot.Tween.tweenCallback] for more usage information.
 *
 * **Note:** [godot.Tween.tweenCallback] is the only correct way to create [godot.CallbackTweener]. Any [godot.CallbackTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class CallbackTweener : Tweener() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CALLBACKTWEENER, scriptIndex)
    return true
  }

  /**
   * Makes the callback call delayed by given time in seconds.
   *
   * **Example:**
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_callback(queue_free).set_delay(2) #this will call queue_free() after 2 seconds
   * 				```
   */
  public fun setDelay(delay: Double): CallbackTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val setDelayPtr: VoidPtr = TypeManager.getMethodBindPtr("CallbackTweener", "set_delay")
  }
}
