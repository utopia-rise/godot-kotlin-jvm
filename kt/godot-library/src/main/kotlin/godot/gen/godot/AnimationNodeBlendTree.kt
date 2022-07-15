// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
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
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * This node may contain a sub-tree of any other blend type nodes, such as [godot.AnimationNodeTransition], [godot.AnimationNodeBlend2], [godot.AnimationNodeBlend3], [godot.AnimationNodeOneShot], etc. This is one of the most commonly used roots.
 *
 * An [godot.AnimationNodeOutput] node named `output` is created by default.
 */
@GodotBaseType
public open class AnimationNodeBlendTree : AnimationRootNode() {
  /**
   * The global offset of all sub-nodes.
   */
  public open var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_GRAPH_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_GRAPH_OFFSET, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDTREE)
  }

  @CoreTypeHelper
  public open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  public open fun _nodeChanged(node: String): Unit {
  }

  public open fun _treeChanged(): Unit {
  }

  /**
   * Adds an [godot.AnimationNode] at the given `position`. The `name` is used to identify the created sub-node later.
   */
  public open fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_ADD_NODE,
        NIL)
  }

  /**
   * Connects the output of an [godot.AnimationNode] as input for another [godot.AnimationNode], at the input port specified by `input_index`.
   */
  public open fun connectNode(
    inputNode: String,
    inputIndex: Long,
    outputNode: String
  ): Unit {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex, STRING to outputNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_CONNECT_NODE,
        NIL)
  }

  /**
   * Disconnects the node connected to the specified input.
   */
  public open fun disconnectNode(inputNode: String, inputIndex: Long): Unit {
    TransferContext.writeArguments(STRING to inputNode, LONG to inputIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_DISCONNECT_NODE, NIL)
  }

  /**
   * Returns the sub-node with the specified `name`.
   */
  public open fun getNode(name: String): AnimationNode? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
  }

  /**
   * Returns the position of the sub-node with the specified `name`.
   */
  public open fun getNodePosition(name: String): Vector2 {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if a sub-node with specified `name` exists.
   */
  public open fun hasNode(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_HAS_NODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a sub-node.
   */
  public open fun removeNode(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_REMOVE_NODE,
        NIL)
  }

  /**
   * Changes the name of a sub-node.
   */
  public open fun renameNode(name: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_RENAME_NODE,
        NIL)
  }

  /**
   * Modifies the position of a sub-node.
   */
  public open fun setNodePosition(name: String, position: Vector2): Unit {
    TransferContext.writeArguments(STRING to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_NODE_POSITION, NIL)
  }

  public companion object {
    /**
     * The specified connection already exists.
     */
    public final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5

    /**
     * The input node is `null`.
     */
    public final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    /**
     * The specified input port is out of range.
     */
    public final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    /**
     * The output node is `null`.
     */
    public final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    /**
     * Input and output nodes are the same.
     */
    public final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    /**
     * The connection was successful.
     */
    public final const val CONNECTION_OK: Long = 0
  }
}
