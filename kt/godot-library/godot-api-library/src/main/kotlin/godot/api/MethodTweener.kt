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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [MethodTweener] is similar to a combination of [CallbackTweener] and [PropertyTweener]. It calls
 * a method providing an interpolated value as a parameter. See [Tween.tweenMethod] for more usage
 * information.
 *
 * The tweener will finish automatically if the callback's target object is freed.
 *
 * **Note:** [Tween.tweenMethod] is the only correct way to create [MethodTweener]. Any
 * [MethodTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class MethodTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(358, scriptIndex)
  }

  /**
   * Sets the time in seconds after which the [MethodTweener] will start interpolating. By default
   * there's no delay.
   */
  public final fun setDelay(delay: Double): MethodTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(ptr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MethodTweener?)
  }

  /**
   * Sets the type of used transition from [Tween.TransitionType]. If not set, the default
   * transition is used from the [Tween] that contains this Tweener.
   */
  public final fun setTrans(trans: Tween.TransitionType): MethodTweener? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(ptr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MethodTweener?)
  }

  /**
   * Sets the type of used easing from [Tween.EaseType]. If not set, the default easing is used from
   * the [Tween] that contains this Tweener.
   */
  public final fun setEase(ease: Tween.EaseType): MethodTweener? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(ptr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MethodTweener?)
  }

  public companion object {
    @JvmStatic
    public val setDelayName: MethodStringName1<MethodTweener, MethodTweener?, Double> =
        MethodStringName1<MethodTweener, MethodTweener?, Double>("set_delay")

    @JvmStatic
    public val setTransName: MethodStringName1<MethodTweener, MethodTweener?, Tween.TransitionType>
        = MethodStringName1<MethodTweener, MethodTweener?, Tween.TransitionType>("set_trans")

    @JvmStatic
    public val setEaseName: MethodStringName1<MethodTweener, MethodTweener?, Tween.EaseType> =
        MethodStringName1<MethodTweener, MethodTweener?, Tween.EaseType>("set_ease")
  }

  public object MethodBindings {
    internal val setDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MethodTweener", "set_delay", 266477812)

    internal val setTransPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MethodTweener", "set_trans", 3740975367)

    internal val setEasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MethodTweener", "set_ease", 315540545)
  }
}
