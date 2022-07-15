// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Calls the specified method after optional delay.
 *
 * [godot.CallbackTweener] is used to call a method in a tweening sequence. See [godot.Tween.tweenCallback] for more usage information.
 *
 * **Note:** [godot.Tween.tweenCallback] is the only correct way to create [godot.CallbackTweener]. Any [godot.CallbackTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class CallbackTweener : Tweener() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CALLBACKTWEENER)
  }

  /**
   * Makes the callback call delayed by given time in seconds. Example:
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_callback(queue_free).set_delay(2) #this will call queue_free() after 2 seconds
   * 				```
   */
  public fun setDelay(delay: Double): CallbackTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CALLBACKTWEENER_SET_DELAY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?
  }

  public companion object
}
