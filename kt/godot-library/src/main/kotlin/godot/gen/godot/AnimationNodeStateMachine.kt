// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Contains multiple [AnimationRootNode]s representing animation states, connected in a graph. State
 * transitions can be configured to happen automatically or via code, using a shortest-path algorithm.
 * Retrieve the [AnimationNodeStateMachinePlayback] object from the [AnimationTree] node to control it
 * programmatically.
 * **Example:**
 *
 * gdscript:
 * ```gdscript
 * var state_machine = $AnimationTree.get("parameters/playback")
 * state_machine.travel("some_state")
 * ```
 * csharp:
 * ```csharp
 * var stateMachine = GetNode<AnimationTree>("AnimationTree").Get("parameters/playback") as
 * AnimationNodeStateMachinePlayback;
 * stateMachine.Travel("some_state");
 * ```
 */
@GodotBaseType
public open class AnimationNodeStateMachine : AnimationRootNode() {
  /**
   * This property can define the process of transitions for different use cases. See also
   * [AnimationNodeStateMachine.StateMachineType].
   */
  public final inline var stateMachineType: StateMachineType
    @JvmName("stateMachineTypeProperty")
    get() = getStateMachineType()
    @JvmName("stateMachineTypeProperty")
    set(`value`) {
      setStateMachineType(value)
    }

  /**
   * If `true`, allows teleport to the self state with [AnimationNodeStateMachinePlayback.travel].
   * When the reset option is enabled in [AnimationNodeStateMachinePlayback.travel], the animation is
   * restarted. If `false`, nothing happens on the teleportation to the self state.
   */
  public final inline var allowTransitionToSelf: Boolean
    @JvmName("allowTransitionToSelfProperty")
    get() = isAllowTransitionToSelf()
    @JvmName("allowTransitionToSelfProperty")
    set(`value`) {
      setAllowTransitionToSelf(value)
    }

  /**
   * If `true`, treat the cross-fade to the start and end nodes as a blend with the RESET animation.
   * In most cases, when additional cross-fades are performed in the parent [AnimationNode] of the
   * state machine, setting this property to `false` and matching the cross-fade time of the parent
   * [AnimationNode] and the state machine's start node and end node gives good results.
   */
  public final inline var resetEnds: Boolean
    @JvmName("resetEndsProperty")
    get() = areEndsReset()
    @JvmName("resetEndsProperty")
    set(`value`) {
      setResetEnds(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE, scriptIndex)
  }

  /**
   * Adds a new animation node to the graph. The [position] is used for display in the editor.
   */
  @JvmOverloads
  public final fun addNode(
    name: StringName,
    node: AnimationNode?,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.addNodePtr, NIL)
  }

  /**
   * Replaces the given animation node with a new animation node.
   */
  public final fun replaceNode(name: StringName, node: AnimationNode?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.replaceNodePtr, NIL)
  }

  /**
   * Returns the animation node with the given name.
   */
  public final fun getNode(name: StringName): AnimationNode? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AnimationNode?)
  }

  /**
   * Deletes the given animation node from the graph.
   */
  public final fun removeNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeNodePtr, NIL)
  }

  /**
   * Renames the given animation node.
   */
  public final fun renameNode(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, MethodBindings.renameNodePtr, NIL)
  }

  /**
   * Returns `true` if the graph contains the given animation node.
   */
  public final fun hasNode(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasNodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the given animation node's name.
   */
  public final fun getNodeName(node: AnimationNode?): StringName {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the animation node's coordinates. Used for display in the editor.
   */
  public final fun setNodePosition(name: StringName, position: Vector2): Unit {
    TransferContext.writeArguments(STRING_NAME to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setNodePositionPtr, NIL)
  }

  /**
   * Returns the given animation node's coordinates. Used for display in the editor.
   */
  public final fun getNodePosition(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns `true` if there is a transition between the given animation nodes.
   */
  public final fun hasTransition(from: StringName, to: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr, MethodBindings.hasTransitionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a transition between the given animation nodes.
   */
  public final fun addTransition(
    from: StringName,
    to: StringName,
    transition: AnimationNodeStateMachineTransition?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr, MethodBindings.addTransitionPtr, NIL)
  }

  /**
   * Returns the given transition.
   */
  public final fun getTransition(idx: Int): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AnimationNodeStateMachineTransition?)
  }

  /**
   * Returns the given transition's start node.
   */
  public final fun getTransitionFrom(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFromPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the given transition's end node.
   */
  public final fun getTransitionTo(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionToPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the number of connections in the graph.
   */
  public final fun getTransitionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Deletes the given transition by index.
   */
  public final fun removeTransitionByIndex(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTransitionByIndexPtr, NIL)
  }

  /**
   * Deletes the transition between the two specified animation nodes.
   */
  public final fun removeTransition(from: StringName, to: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTransitionPtr, NIL)
  }

  /**
   * Sets the draw offset of the graph. Used for display in the editor.
   */
  public final fun setGraphOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setGraphOffsetPtr, NIL)
  }

  /**
   * Returns the draw offset of the graph. Used for display in the editor.
   */
  public final fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGraphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setStateMachineType(stateMachineType: StateMachineType): Unit {
    TransferContext.writeArguments(LONG to stateMachineType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStateMachineTypePtr, NIL)
  }

  public final fun getStateMachineType(): StateMachineType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStateMachineTypePtr, LONG)
    return AnimationNodeStateMachine.StateMachineType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAllowTransitionToSelf(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setAllowTransitionToSelfPtr, NIL)
  }

  public final fun isAllowTransitionToSelf(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAllowTransitionToSelfPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setResetEnds(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setResetEndsPtr, NIL)
  }

  public final fun areEndsReset(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.areEndsResetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class StateMachineType(
    id: Long,
  ) {
    /**
     * Seeking to the beginning is treated as playing from the start state. Transition to the end
     * state is treated as exiting the state machine.
     */
    STATE_MACHINE_TYPE_ROOT(0),
    /**
     * Seeking to the beginning is treated as seeking to the beginning of the animation in the
     * current state. Transition to the end state, or the absence of transitions in each state, is
     * treated as exiting the state machine.
     */
    STATE_MACHINE_TYPE_NESTED(1),
    /**
     * This is a grouped state machine that can be controlled from a parent state machine. It does
     * not work independently. There must be a state machine with [stateMachineType] of
     * [STATE_MACHINE_TYPE_ROOT] or [STATE_MACHINE_TYPE_NESTED] in the parent or ancestor.
     */
    STATE_MACHINE_TYPE_GROUPED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StateMachineType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "add_node", 1980270704)

    public val replaceNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "replace_node", 2559412862)

    public val getNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node", 625644256)

    public val removeNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_node", 3304788590)

    public val renameNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "rename_node", 3740211285)

    public val hasNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "has_node", 2619796661)

    public val getNodeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node_name", 739213945)

    public val setNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_node_position", 1999414630)

    public val getNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_node_position", 3100822709)

    public val hasTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "has_transition", 471820014)

    public val addTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "add_transition", 795486887)

    public val getTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition", 4192381260)

    public val getTransitionFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_from", 659327637)

    public val getTransitionToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_to", 659327637)

    public val getTransitionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_transition_count", 3905245786)

    public val removeTransitionByIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_transition_by_index", 1286410249)

    public val removeTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "remove_transition", 3740211285)

    public val setGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_graph_offset", 743155724)

    public val getGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_graph_offset", 3341600327)

    public val setStateMachineTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_state_machine_type", 2584759088)

    public val getStateMachineTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "get_state_machine_type", 1140726469)

    public val setAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_allow_transition_to_self", 2586408642)

    public val isAllowTransitionToSelfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "is_allow_transition_to_self", 36873697)

    public val setResetEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "set_reset_ends", 2586408642)

    public val areEndsResetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachine", "are_ends_reset", 36873697)
  }
}
