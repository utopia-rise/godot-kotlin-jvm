// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A one-shot timer managed by the scene tree, which emits [signal timeout] on completion. See also
 * [SceneTree.createTimer].
 * As opposed to [Timer], it does not require the instantiation of a node. Commonly used to create a
 * one-shot delay timer as in the following example:
 *
 * gdscript:
 * ```gdscript
 * func some_function():
 *     print("Timer started.")
 *     await get_tree().create_timer(1.0).timeout
 *     print("Timer ended.")
 * ```
 * csharp:
 * ```csharp
 * public async Task SomeFunction()
 * {
 *     GD.Print("Timer started.");
 *     await ToSignal(GetTree().CreateTimer(1.0f), SceneTreeTimer.SignalName.Timeout);
 *     GD.Print("Timer ended.");
 * }
 * ```
 *
 * The timer will be dereferenced after its time elapses. To preserve the timer, you can keep a
 * reference to it. See [RefCounted].
 * **Note:** The timer is processed after all of the nodes in the current frame, i.e. node's
 * [Node.Process] method would be called before the timer (or [Node.PhysicsProcess] if
 * `process_in_physics` in [SceneTree.createTimer] has been set to `true`).
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
      TransferContext.callMethod(rawPtr, MethodBindings.getTimeLeftPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTimeLeftPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SCENETREETIMER, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setTimeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTreeTimer", "set_time_left", 373806689)

    public val getTimeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTreeTimer", "get_time_left", 1740695150)
  }
}
