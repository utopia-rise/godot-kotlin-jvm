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
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * [godot.AnimationTree] node resource that contains many blend type nodes.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/latest/tutorials/animation/animation_tree.html)
 *
 * This node may contain a sub-tree of any other blend type nodes, such as mix, blend2, blend3, one shot, etc. This is one of the most commonly used roots.
 */
@GodotBaseType
open class AnimationNodeBlendTree : AnimationRootNode() {
  /**
   * The global offset of all sub-nodes.
   */
  open var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_GRAPH_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_GRAPH_OFFSET, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODEBLENDTREE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  open fun _nodeChanged(node: String) {
  }

  open fun _treeChanged() {
  }

  /**
   * Adds an [godot.AnimationNode] at the given `position`. The `name` is used to identify the created sub-node later.
   */
  open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_ADD_NODE,
        NIL)
  }

  /**
   * Connects the output of an [godot.AnimationNode] as input for another [godot.AnimationNode], at the input port specified by `input_index`.
   */
  open fun connectNode(
    inputNode: String,
    inputIndex: Long,
    outputNode: String
  ) {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex, STRING to outputNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_CONNECT_NODE,
        NIL)
  }

  /**
   * Disconnects the node connected to the specified input.
   */
  open fun disconnectNode(inputNode: String, inputIndex: Long) {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_DISCONNECT_NODE, NIL)
  }

  /**
   * Returns the sub-node with the specified `name`.
   */
  open fun getNode(name: String): AnimationNode? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  /**
   * Returns the position of the sub-node with the specified `name`.
   */
  open fun getNodePosition(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if a sub-node with specified `name` exists.
   */
  open fun hasNode(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a sub-node.
   */
  open fun removeNode(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_REMOVE_NODE,
        NIL)
  }

  /**
   * Changes the name of a sub-node.
   */
  open fun renameNode(name: String, newName: String) {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_RENAME_NODE,
        NIL)
  }

  /**
   * Modifies the position of a sub-node.
   */
  open fun setNodePosition(name: String, position: Vector2) {
    TransferContext.writeArguments(STRING to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_NODE_POSITION, NIL)
  }

  companion object {
    /**
     * The specified connection already exists.
     */
    final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5

    /**
     * The input node is `null`.
     */
    final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    /**
     * The specified input port is out of range.
     */
    final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    /**
     * The output node is `null`.
     */
    final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    /**
     * Input and output nodes are the same.
     */
    final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    /**
     * The connection was successful.
     */
    final const val CONNECTION_OK: Long = 0
  }
}
