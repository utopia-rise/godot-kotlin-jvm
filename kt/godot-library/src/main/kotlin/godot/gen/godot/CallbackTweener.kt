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
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

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
    callConstructor(ENGINECLASS_CALLBACKTWEENER, scriptIndex)
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
    TransferContext.writeArguments(DOUBLE to delay)
    TransferContext.callMethod(rawPtr, MethodBindings.setDelayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CallbackTweener?)
  }

  public companion object

  internal object MethodBindings {
    public val setDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CallbackTweener", "set_delay", 3008182292)
  }
}
