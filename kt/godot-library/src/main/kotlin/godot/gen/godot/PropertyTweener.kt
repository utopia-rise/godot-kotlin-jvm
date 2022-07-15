// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Interpolates an [godot.Object]'s property over time.
 *
 * [godot.PropertyTweener] is used to interpolate a property in an object. See [godot.SceneTreeTween.tweenProperty] for more usage information.
 *
 * **Note:** [godot.SceneTreeTween.tweenProperty] is the only correct way to create [godot.PropertyTweener]. Any [godot.PropertyTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class PropertyTweener : Tweener() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PROPERTYTWEENER)
  }

  /**
   * When called, the final value will be used as a relative value instead. Example:
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_property(self, "position", Vector2.RIGHT * 100, 1).as_relative() #the node will move by 100 pixels to the right
   * 				```
   */
  public open fun asRelative(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_AS_RELATIVE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Sets a custom initial value to the [godot.PropertyTweener]. Example:
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from(Vector2(100, 100) #this will move the node from position (100, 100) to (200, 100)
   * 				```
   */
  public open fun from(`value`: Any?): PropertyTweener? {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_FROM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Makes the [godot.PropertyTweener] use the current property value (i.e. at the time of creating this [godot.PropertyTweener]) as a starting point. This is equivalent of using [from] with the current value. These two calls will do the same:
   *
   * ```
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from(position)
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from_current()
   * 				```
   */
  public open fun fromCurrent(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_FROM_CURRENT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Sets the time in seconds after which the [godot.PropertyTweener] will start interpolating. By default there's no delay.
   */
  public open fun setDelay(delay: Double): PropertyTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_SET_DELAY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Sets the type of used easing from [enum Tween.EaseType]. If not set, the default easing is used from the [godot.SceneTreeTween] that contains this Tweener.
   */
  public open fun setEase(ease: Long): PropertyTweener? {
    TransferContext.writeArguments(LONG to ease)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_SET_EASE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Sets the type of used transition from [enum Tween.TransitionType]. If not set, the default transition is used from the [godot.SceneTreeTween] that contains this Tweener.
   */
  public open fun setTrans(trans: Long): PropertyTweener? {
    TransferContext.writeArguments(LONG to trans)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROPERTYTWEENER_SET_TRANS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }
}
