// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class AnimationNodeStateMachine : AnimationRootNode() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE)

  open fun _tree_changed() {
  }

  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_NODE,
        NIL)
  }

  open fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    TransferContext.writeArguments(STRING to from, STRING to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_TRANSITION, NIL)
  }

  open fun getEndNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_END_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_GRAPH_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getNode(name: String): AnimationNode? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  open fun getNodeName(node: AnimationNode): String {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getNodePosition(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getStartNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_START_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTransition(idx: Long): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNodeStateMachineTransition?
  }

  open fun getTransitionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTransitionFrom(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_FROM, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTransitionTo(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_TO, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun hasNode(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasTransition(from: String, to: String): Boolean {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_TRANSITION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_NODE, NIL)
  }

  open fun removeTransition(from: String, to: String) {
    TransferContext.writeArguments(STRING to from, STRING to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION, NIL)
  }

  open fun removeTransitionByIndex(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION_BY_INDEX, NIL)
  }

  open fun renameNode(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_RENAME_NODE, NIL)
  }

  open fun replaceNode(name: String, node: AnimationNode) {
    TransferContext.writeArguments(STRING to name, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REPLACE_NODE, NIL)
  }

  open fun setEndNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_END_NODE, NIL)
  }

  open fun setGraphOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_GRAPH_OFFSET, NIL)
  }

  open fun setNodePosition(name: String, position: Vector2) {
    TransferContext.writeArguments(STRING to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_NODE_POSITION, NIL)
  }

  open fun setStartNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_START_NODE, NIL)
  }
}
