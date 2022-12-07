// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * [codeblocks]
 *
 * [gdscript]
 *
 * func some_function():
 *
 *     print("Timer started.")
 *
 *     await get_tree().create_timer(1.0).timeout
 *
 *     print("Timer ended.")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public async void SomeFunction()
 *
 * {
 *
 *     GD.Print("Timer started.");
 *
 *     await ToSignal(GetTree().CreateTimer(1.0f), "timeout");
 *
 *     GD.Print("Timer ended.");
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The timer will be dereferenced after its time elapses. To preserve the timer, you can keep a reference to it. See [godot.RefCounted].
 */
@GodotBaseType
public open class SceneTreeTimer internal constructor() : RefCounted() {
  /**
   * Emitted when the timer reaches 0.
   */
  public val timeout: Signal0 by signal()

  /**
   * The time remaining (in seconds).
   */
  public var timeLeft: Double
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

  public companion object
}
