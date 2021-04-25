// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A custom shader program with a visual editor.
 *
 * This class allows you to define a custom shader program that can be used for various materials to render objects.
 *
 * The visual shader editor creates the shader.
 */
@GodotBaseType
open class VisualShader : Shader() {
  /**
   * The offset vector of the whole graph.
   */
  open var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_GRAPH_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_GRAPH_OFFSET,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADER)
  }

  @CoreTypeHelper
  open fun graphOffset(schedule: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      schedule(this)
      graphOffset = this
  }


  open fun _inputTypeChanged(arg0: Long, arg1: Long) {
  }

  open fun _queueUpdate() {
  }

  open fun _updateShader() {
  }

  /**
   * Adds the specified node to the shader.
   */
  open fun addNode(
    type: Long,
    node: VisualShaderNode,
    position: Vector2,
    id: Long
  ) {
    TransferContext.writeArguments(LONG to type, OBJECT to node, VECTOR2 to position, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_ADD_NODE, NIL)
  }

  /**
   * Returns `true` if the specified nodes and ports can be connected together.
   */
  open fun canConnectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to type, LONG to fromNode, LONG to fromPort, LONG to toNode,
        LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CAN_CONNECT_NODES,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Connects the specified nodes and ports.
   */
  open fun connectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): GodotError {
    TransferContext.writeArguments(LONG to type, LONG to fromNode, LONG to fromPort, LONG to toNode,
        LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects the specified nodes and ports, even if they can't be connected. Such connection is invalid and will not function properly.
   */
  open fun connectNodesForced(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    TransferContext.writeArguments(LONG to type, LONG to fromNode, LONG to fromPort, LONG to toNode,
        LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES_FORCED,
        NIL)
  }

  /**
   * Connects the specified nodes and ports.
   */
  open fun disconnectNodes(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ) {
    TransferContext.writeArguments(LONG to type, LONG to fromNode, LONG to fromPort, LONG to toNode,
        LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_DISCONNECT_NODES, NIL)
  }

  /**
   * Returns the shader node instance with specified `type` and `id`.
   */
  open fun getNode(type: Long, id: Long): VisualShaderNode? {
    TransferContext.writeArguments(LONG to type, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualShaderNode?
  }

  /**
   * Returns the list of connected nodes with the specified type.
   */
  open fun getNodeConnections(type: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the list of all nodes in the shader with the specified type.
   */
  open fun getNodeList(type: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_LIST,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the position of the specified node within the shader graph.
   */
  open fun getNodePosition(type: Long, id: Long): Vector2 {
    TransferContext.writeArguments(LONG to type, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   *
   */
  open fun getValidNodeId(type: Long): Long {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_VALID_NODE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the specified node and port connection exist.
   */
  open fun isNodeConnection(
    type: Long,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to type, LONG to fromNode, LONG to fromPort, LONG to toNode,
        LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_IS_NODE_CONNECTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the specified node from the shader.
   */
  open fun removeNode(type: Long, id: Long) {
    TransferContext.writeArguments(LONG to type, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REMOVE_NODE, NIL)
  }

  /**
   * Sets the mode of this shader.
   */
  open fun setMode(mode: Long) {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_MODE, NIL)
  }

  /**
   * Sets the position of the specified node.
   */
  open fun setNodePosition(
    type: Long,
    id: Long,
    position: Vector2
  ) {
    TransferContext.writeArguments(LONG to type, LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_NODE_POSITION, NIL)
  }

  enum class Type(
    id: Long
  ) {
    /**
     * A vertex shader, operating on vertices.
     */
    TYPE_VERTEX(0),

    /**
     * A fragment shader, operating on fragments (pixels).
     */
    TYPE_FRAGMENT(1),

    /**
     * A shader for light calculations.
     */
    TYPE_LIGHT(2),

    /**
     * Represents the size of the [enum Type] enum.
     */
    TYPE_MAX(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     *
     */
    final const val NODE_ID_INVALID: Long = -1

    /**
     *
     */
    final const val NODE_ID_OUTPUT: Long = 0

    /**
     * A fragment shader, operating on fragments (pixels).
     */
    final const val TYPE_FRAGMENT: Long = 1

    /**
     * A shader for light calculations.
     */
    final const val TYPE_LIGHT: Long = 2

    /**
     * Represents the size of the [enum Type] enum.
     */
    final const val TYPE_MAX: Long = 3

    /**
     * A vertex shader, operating on vertices.
     */
    final const val TYPE_VERTEX: Long = 0
  }
}
