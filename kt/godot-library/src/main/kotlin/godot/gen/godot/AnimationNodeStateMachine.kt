// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * State machine for control of animations.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * Contains multiple nodes representing animation states, connected in a graph. Node transitions can be configured to happen automatically or via code, using a shortest-path algorithm. Retrieve the [godot.AnimationNodeStateMachinePlayback] object from the [godot.AnimationTree] node to control it programmatically.
 *
 * **Example:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var state_machine = $AnimationTree.get("parameters/playback")
 *
 * state_machine.travel("some_state")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var stateMachine = GetNode<AnimationTree>("AnimationTree").Get("parameters/playback") as AnimationNodeStateMachinePlayback;
 *
 * stateMachine.Travel("some_state");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeStateMachine : AnimationRootNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE)
  }

  /**
   * Adds a new node to the graph. The `position` is used for display in the editor.
   */
  public open fun addNode(
    name: StringName,
    node: AnimationNode,
    position: Vector2 = Vector2Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_NODE,
        NIL)
  }

  /**
   *
   */
  public open fun replaceNode(name: StringName, node: AnimationNode): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REPLACE_NODE, NIL)
  }

  /**
   * Returns the animation node with the given name.
   */
  public open fun getNode(name: StringName): AnimationNode? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  /**
   * Deletes the given node from the graph.
   */
  public open fun removeNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_NODE, NIL)
  }

  /**
   * Renames the given node.
   */
  public open fun renameNode(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_RENAME_NODE, NIL)
  }

  /**
   * Returns `true` if the graph contains the given node.
   */
  public open fun hasNode(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the given animation node's name.
   */
  public open fun getNodeName(node: AnimationNode): StringName {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_NAME, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the node's coordinates. Used for display in the editor.
   */
  public open fun setNodePosition(name: StringName, position: Vector2): Unit {
    TransferContext.writeArguments(STRING_NAME to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_NODE_POSITION, NIL)
  }

  /**
   * Returns the given node's coordinates. Used for display in the editor.
   */
  public open fun getNodePosition(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if there is a transition between the given nodes.
   */
  public open fun hasTransition(from: StringName, to: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_TRANSITION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a transition between the given nodes.
   */
  public open fun addTransition(
    from: StringName,
    to: StringName,
    transition: AnimationNodeStateMachineTransition
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_TRANSITION, NIL)
  }

  /**
   * Returns the given transition.
   */
  public open fun getTransition(idx: Long): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNodeStateMachineTransition?
  }

  /**
   * Returns the given transition's start node.
   */
  public open fun getTransitionFrom(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_FROM, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the given transition's end node.
   */
  public open fun getTransitionTo(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_TO, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the number of connections in the graph.
   */
  public open fun getTransitionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deletes the given transition by index.
   */
  public open fun removeTransitionByIndex(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION_BY_INDEX, NIL)
  }

  /**
   * Deletes the transition between the two specified nodes.
   */
  public open fun removeTransition(from: StringName, to: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION, NIL)
  }

  /**
   * Sets the given node as the graph start point.
   */
  public open fun setStartNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_START_NODE, NIL)
  }

  /**
   * Returns the graph's end node.
   */
  public open fun getStartNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_START_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the given node as the graph end point.
   */
  public open fun setEndNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_END_NODE, NIL)
  }

  /**
   * Returns the graph's end node.
   */
  public open fun getEndNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_END_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the draw offset of the graph. Used for display in the editor.
   */
  public open fun setGraphOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_GRAPH_OFFSET, NIL)
  }

  /**
   * Returns the draw offset of the graph. Used for display in the editor.
   */
  public open fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_GRAPH_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public companion object
}
