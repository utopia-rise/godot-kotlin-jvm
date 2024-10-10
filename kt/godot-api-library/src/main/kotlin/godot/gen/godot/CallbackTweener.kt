// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_CALLBACKTWEENER_INDEX: Int = 150

/**
 * [CallbackTweener] is used to call a method in a tweening sequence. See [Tween.tweenCallback] for
 * more usage information.
 * The tweener will finish automatically if the callback's target object is freed.
 * **Note:** [Tween.tweenCallback] is the only correct way to create [CallbackTweener]. Any
 * [CallbackTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class CallbackTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CALLBACKTWEENER_INDEX, scriptIndex)
  }

  /**
   * Makes the callback call delayed by given time in seconds.
   * **Example:**
   * [codeblock]
   * var tween = get_tree().create_tween()
   * tween.tween_callback(queue_free).set_delay(2) #this will call queue_free() after 2 seconds
   * [/codeblock]
   */
  public final fun setDelay(delay: Double): CallbackTweener? {
    Internals.writeArguments(DOUBLE to delay)
    Internals.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as CallbackTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val setDelayPtr: VoidPtr =
        Internals.getMethodBindPtr("CallbackTweener", "set_delay", 3008182292)
  }
}
