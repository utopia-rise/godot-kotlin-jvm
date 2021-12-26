// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * One-shot timer.
 *
 * A one-shot timer managed by the scene tree, which emits [timeout] on completion. See also [godot.SceneTree.createTimer].
 *
 * As opposed to [godot.Timer], it does not require the instantiation of a node. Commonly used to create a one-shot delay timer as in the following example:
 *
 * ```
 * 		func some_function():
 * 		    print("Timer started.")
 * 		    yield(get_tree().create_timer(1.0), "timeout")
 * 		    print("Timer ended.")
 * 		```
 *
 * The timer will be automatically freed after its time elapses.
 */
@GodotBaseType
public open class SceneTreeTimer : Reference() {
  /**
   * Emitted when the timer reaches 0.
   */
  public val timeout: Signal0 by signal()

  /**
   * The time remaining (in seconds).
   */
  public open var timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETIMER_GET_TIME_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETIMER_SET_TIME_LEFT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCENETREETIMER)
  }
}
