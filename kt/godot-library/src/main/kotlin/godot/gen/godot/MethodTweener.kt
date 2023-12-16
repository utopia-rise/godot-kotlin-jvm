// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Interpolates an abstract value and supplies it to a method called over time.
 *
 * [godot.MethodTweener] is similar to a combination of [godot.CallbackTweener] and [godot.PropertyTweener]. It calls a method providing an interpolated value as a parameter. See [godot.Tween.tweenMethod] for more usage information.
 *
 * The tweener will finish automatically if the callback's target object is freed.
 *
 * **Note:** [godot.Tween.tweenMethod] is the only correct way to create [godot.MethodTweener]. Any [godot.MethodTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class MethodTweener : Tweener() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_METHODTWEENER, scriptIndex)
    return true
  }

  /**
   * Sets the time in seconds after which the [godot.MethodTweener] will start interpolating. By default there's no delay.
   */
  public fun setDelay(delay: Double): MethodTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MethodTweener?)
  }

  /**
   * Sets the type of used transition from [enum Tween.TransitionType]. If not set, the default transition is used from the [godot.Tween] that contains this Tweener.
   */
  public fun setTrans(trans: Tween.TransitionType): MethodTweener? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MethodTweener?)
  }

  /**
   * Sets the type of used easing from [enum Tween.EaseType]. If not set, the default easing is used from the [godot.Tween] that contains this Tweener.
   */
  public fun setEase(ease: Tween.EaseType): MethodTweener? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MethodTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val setDelayPtr: VoidPtr = TypeManager.getMethodBindPtr("MethodTweener", "set_delay")

    public val setTransPtr: VoidPtr = TypeManager.getMethodBindPtr("MethodTweener", "set_trans")

    public val setEasePtr: VoidPtr = TypeManager.getMethodBindPtr("MethodTweener", "set_ease")
  }
}
