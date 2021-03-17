// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * State machine for control of animations.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 *
 * Contains multiple nodes representing animation states, connected in a graph. Node transitions can be configured to happen automatically or via code, using a shortest-path algorithm. Retrieve the [godot.AnimationNodeStateMachinePlayback] object from the [godot.AnimationTree] node to control it programmatically.
 *
 * **Example:**
 *
 * ```
 * 		var state_machine = $AnimationTree.get("parameters/playback")
 * 		state_machine.travel("some_state")
 * 		```
 */
@GodotBaseType
open class AnimationNodeStateMachine : AnimationRootNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE)
  }

  open fun _treeChanged() {
  }

  /**
   * Adds a new node to the graph. The `position` is used for display in the editor.
   */
  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_NODE,
        NIL)
  }

  /**
   * Adds a transition between the given nodes.
   */
  open fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    TransferContext.writeArguments(STRING to from, STRING to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_TRANSITION, NIL)
  }

  /**
   * Returns the graph's end node.
   */
  open fun getEndNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_END_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the draw offset of the graph. Used for display in the editor.
   */
  open fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_GRAPH_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the animation node with the given name.
   */
  open fun getNode(name: String): AnimationNode? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  /**
   * Returns the given animation node's name.
   */
  open fun getNodeName(node: AnimationNode): String {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the given node's coordinates. Used for display in the editor.
   */
  open fun getNodePosition(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the graph's end node.
   */
  open fun getStartNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_START_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the given transition.
   */
  open fun getTransition(idx: Long): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNodeStateMachineTransition?
  }

  /**
   * Returns the number of connections in the graph.
   */
  open fun getTransitionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the given transition's start node.
   */
  open fun getTransitionFrom(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_FROM, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the given transition's end node.
   */
  open fun getTransitionTo(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_TO, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the graph contains the given node.
   */
  open fun hasNode(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a transition between the given nodes.
   */
  open fun hasTransition(from: String, to: String): Boolean {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_TRANSITION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Deletes the given node from the graph.
   */
  open fun removeNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_NODE, NIL)
  }

  /**
   * Deletes the transition between the two specified nodes.
   */
  open fun removeTransition(from: String, to: String) {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION, NIL)
  }

  /**
   * Deletes the given transition by index.
   */
  open fun removeTransitionByIndex(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION_BY_INDEX, NIL)
  }

  /**
   * Renames the given node.
   */
  open fun renameNode(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_RENAME_NODE, NIL)
  }

  /**
   * Replaces the node and keeps its transitions unchanged.
   */
  open fun replaceNode(name: String, node: AnimationNode) {
    TransferContext.writeArguments(STRING to name, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REPLACE_NODE, NIL)
  }

  /**
   * Sets the given node as the graph end point.
   */
  open fun setEndNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_END_NODE, NIL)
  }

  /**
   * Sets the draw offset of the graph. Used for display in the editor.
   */
  open fun setGraphOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_GRAPH_OFFSET, NIL)
  }

  /**
   * Sets the node's coordinates. Used for display in the editor.
   */
  open fun setNodePosition(name: String, position: Vector2) {
    TransferContext.writeArguments(STRING to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_NODE_POSITION, NIL)
  }

  /**
   * Sets the given node as the graph start point.
   */
  open fun setStartNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_START_NODE, NIL)
  }
}
