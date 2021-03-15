// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Double
import kotlin.Suppress

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
 */
@GodotBaseType
open class SceneTreeTimer : Reference() {
  /**
   * Emitted when the timer reaches 0.
   */
  val timeout: Signal0 by signal()

  /**
   * The time remaining.
   */
  open var timeLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETIMER_GET_TIME_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETIMER_SET_TIME_LEFT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SCENETREETIMER, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
