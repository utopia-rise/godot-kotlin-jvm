// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Interpolates an [godot.Object]'s property over time.
 *
 * [godot.PropertyTweener] is used to interpolate a property in an object. See [godot.Tween.tweenProperty] for more usage information.
 *
 * **Note:** [godot.Tween.tweenProperty] is the only correct way to create [godot.PropertyTweener]. Any [godot.PropertyTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class PropertyTweener : Tweener() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PROPERTYTWEENER, scriptIndex)
    return true
  }

  /**
   * Sets a custom initial value to the [godot.PropertyTweener].
   *
   * **Example:**
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from(Vector2(100, 100)) #this will move the node from position (100, 100) to (200, 100)
   * 				```
   */
  public fun from(`value`: Any?): PropertyTweener? {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.fromPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * Makes the [godot.PropertyTweener] use the current property value (i.e. at the time of creating this [godot.PropertyTweener]) as a starting point. This is equivalent of using [from] with the current value. These two calls will do the same:
   *
   * ```
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from(position)
   * 				tween.tween_property(self, "position", Vector2(200, 100), 1).from_current()
   * 				```
   */
  public fun fromCurrent(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fromCurrentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * When called, the final value will be used as a relative value instead.
   *
   * **Example:**
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_property(self, "position", Vector2.RIGHT * 100, 1).as_relative() #the node will move by 100 pixels to the right
   * 				```
   */
  public fun asRelative(): PropertyTweener? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asRelativePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * Sets the type of used transition from [enum Tween.TransitionType]. If not set, the default transition is used from the [godot.Tween] that contains this Tweener.
   */
  public fun setTrans(trans: Tween.TransitionType): PropertyTweener? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * Sets the type of used easing from [enum Tween.EaseType]. If not set, the default easing is used from the [godot.Tween] that contains this Tweener.
   */
  public fun setEase(ease: Tween.EaseType): PropertyTweener? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * Sets the time in seconds after which the [godot.PropertyTweener] will start interpolating. By default there's no delay.
   */
  public fun setDelay(delay: Double): PropertyTweener? {
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val fromPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "from")

    public val fromCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "from_current")

    public val asRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PropertyTweener", "as_relative")

    public val setTransPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_trans")

    public val setEasePtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_ease")

    public val setDelayPtr: VoidPtr = TypeManager.getMethodBindPtr("PropertyTweener", "set_delay")
  }
}
