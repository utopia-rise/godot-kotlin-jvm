// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Allows control of [AnimationTree] state machines created with [AnimationNodeStateMachine].
 * Retrieve with `$AnimationTree.get("parameters/playback")`.
 * **Example:**
 *
 * gdscript:
 * ```gdscript
 * var state_machine = $AnimationTree.get("parameters/playback")
 * state_machine.travel("some_state")
 * ```
 * csharp:
 * ```csharp
 * var stateMachine =
 * GetNode<AnimationTree>("AnimationTree").Get("parameters/playback").As<AnimationNodeStateMachinePlayback>();
 * stateMachine.Travel("some_state");
 * ```
 */
@GodotBaseType
public open class AnimationNodeStateMachinePlayback : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK, scriptIndex)
  }

  /**
   * Transitions from the current state to another one, following the shortest path.
   * If the path does not connect from the current state, the animation will play after the state
   * teleports.
   * If [resetOnTeleport] is `true`, the animation is played from the beginning when the travel
   * cause a teleportation.
   */
  @JvmOverloads
  public final fun travel(toNode: StringName, resetOnTeleport: Boolean = true): Unit {
    TransferContext.writeArguments(STRING_NAME to toNode, BOOL to resetOnTeleport)
    TransferContext.callMethod(rawPtr, MethodBindings.travelPtr, NIL)
  }

  /**
   * Starts playing the given animation.
   * If [reset] is `true`, the animation is played from the beginning.
   */
  @JvmOverloads
  public final fun start(node: StringName, reset: Boolean = true): Unit {
    TransferContext.writeArguments(STRING_NAME to node, BOOL to reset)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * If there is a next path by travel or auto advance, immediately transitions from the current
   * state to the next state.
   */
  public final fun next(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.nextPtr, NIL)
  }

  /**
   * Stops the currently playing animation.
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if an animation is playing.
   */
  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the currently playing animation state.
   * **Note:** When using a cross-fade, the current state changes to the next state immediately
   * after the cross-fade begins.
   */
  public final fun getCurrentNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the playback position within the current animation state.
   */
  public final fun getCurrentPlayPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPlayPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the current state length.
   * **Note:** It is possible that any [AnimationRootNode] can be nodes as well as animations. This
   * means that there can be multiple animations within a single state. Which animation length has
   * priority depends on the nodes connected inside it. Also, if a transition does not reset, the
   * remaining length at that point will be returned.
   */
  public final fun getCurrentLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the starting state of currently fading animation.
   */
  public final fun getFadingFromNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadingFromNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the current travel path as computed internally by the A* algorithm.
   */
  public final fun getTravelPath(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public companion object

  internal object MethodBindings {
    public val travelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "travel", 3823612587)

    public val startPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "start", 3823612587)

    public val nextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "next", 3218959716)

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "stop", 3218959716)

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "is_playing", 36873697)

    public val getCurrentNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_node", 2002593661)

    public val getCurrentPlayPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_play_position", 1740695150)

    public val getCurrentLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_length", 1740695150)

    public val getFadingFromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_fading_from_node", 2002593661)

    public val getTravelPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_travel_path", 3995934104)
  }
}
