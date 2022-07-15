// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Interpolates an abstract value and supplies it to a method called over time.
 *
 * [godot.MethodTweener] is similar to a combination of [godot.CallbackTweener] and [godot.PropertyTweener]. It calls a method providing an interpolated value as a parameter. See [godot.SceneTreeTween.tweenMethod] for more usage information.
 *
 * **Note:** [godot.SceneTreeTween.tweenMethod] is the only correct way to create [godot.MethodTweener]. Any [godot.MethodTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class MethodTweener : Tweener() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_METHODTWEENER)
  }

  /**
   * Sets the time in seconds after which the [godot.MethodTweener] will start interpolating. By default there's no delay.
   */
  public open fun setDelay(delay: Double): MethodTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_METHODTWEENER_SET_DELAY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MethodTweener?
  }

  /**
   * Sets the type of used easing from [enum Tween.EaseType]. If not set, the default easing is used from the [godot.SceneTreeTween] that contains this Tweener.
   */
  public open fun setEase(ease: Long): MethodTweener? {
    TransferContext.writeArguments(LONG to ease)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_METHODTWEENER_SET_EASE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MethodTweener?
  }

  /**
   * Sets the type of used transition from [enum Tween.TransitionType]. If not set, the default transition is used from the [godot.SceneTreeTween] that contains this Tweener.
   */
  public open fun setTrans(trans: Long): MethodTweener? {
    TransferContext.writeArguments(LONG to trans)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_METHODTWEENER_SET_TRANS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MethodTweener?
  }
}
