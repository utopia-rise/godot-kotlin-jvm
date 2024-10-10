// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_PROPERTYTWEENER_INDEX: Int = 456

/**
 * [PropertyTweener] is used to interpolate a property in an object. See [Tween.tweenProperty] for
 * more usage information.
 * **Note:** [Tween.tweenProperty] is the only correct way to create [PropertyTweener]. Any
 * [PropertyTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class PropertyTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_PROPERTYTWEENER_INDEX, scriptIndex)
  }

  /**
   * Sets a custom initial value to the [PropertyTweener].
   * **Example:**
   * [codeblock]
   * var tween = get_tree().create_tween()
   * tween.tween_property(self, "position", Vector2(200, 100), 1).from(Vector2(100, 100)) #this will
   * move the node from position (100, 100) to (200, 100)
   * [/codeblock]
   */
  public final fun from(`value`: Any?): PropertyTweener? {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.fromPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * Makes the [PropertyTweener] use the current property value (i.e. at the time of creating this
   * [PropertyTweener]) as a starting point. This is equivalent of using [from] with the current value.
   * These two calls will do the same:
   * [codeblock]
   * tween.tween_property(self, "position", Vector2(200, 100), 1).from(position)
   * tween.tween_property(self, "position", Vector2(200, 100), 1).from_current()
   * [/codeblock]
   */
  public final fun fromCurrent(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fromCurrentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * When called, the final value will be used as a relative value instead.
   * **Example:**
   * [codeblock]
   * var tween = get_tree().create_tween()
   * tween.tween_property(self, "position", Vector2.RIGHT * 100, 1).as_relative() #the node will
   * move by 100 pixels to the right
   * [/codeblock]
   */
  public final fun asRelative(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asRelativePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * Sets the type of used transition from [Tween.TransitionType]. If not set, the default
   * transition is used from the [Tween] that contains this Tweener.
   */
  public final fun setTrans(trans: Tween.TransitionType): PropertyTweener? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * Sets the type of used easing from [Tween.EaseType]. If not set, the default easing is used from
   * the [Tween] that contains this Tweener.
   */
  public final fun setEase(ease: Tween.EaseType): PropertyTweener? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * Allows interpolating the value with a custom easing function. The provided [interpolatorMethod]
   * will be called with a value ranging from `0.0` to `1.0` and is expected to return a value within
   * the same range (values outside the range can be used for overshoot). The return value of the
   * method is then used for interpolation between initial and final value. Note that the parameter
   * passed to the method is still subject to the tweener's own easing.
   * **Example:**
   * [codeblock]
   * @export var curve: Curve
   *
   * func _ready():
   *     var tween = create_tween()
   *     # Interpolate the value using a custom curve.
   *     tween.tween_property(self, "position:x", 300,
   * 1).as_relative().set_custom_interpolator(tween_curve)
   *
   * func tween_curve(v):
   *     return curve.sample_baked(v)
   * [/codeblock]
   */
  public final fun setCustomInterpolator(interpolatorMethod: Callable): PropertyTweener? {
    TransferContext.writeArguments(CALLABLE to interpolatorMethod)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomInterpolatorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  /**
   * Sets the time in seconds after which the [PropertyTweener] will start interpolating. By default
   * there's no delay.
   */
  public final fun setDelay(delay: Double): PropertyTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PropertyTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val fromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "from", 4190193059)

    public val fromCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "from_current", 4279177709)

    public val asRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "as_relative", 4279177709)

    public val setTransPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "set_trans", 1899107404)

    public val setEasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "set_ease", 1080455622)

    public val setCustomInterpolatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "set_custom_interpolator", 3174170268)

    public val setDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "set_delay", 2171559331)
  }
}
