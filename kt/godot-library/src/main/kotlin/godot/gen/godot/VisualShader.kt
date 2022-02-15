// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING_NAME
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
public open class VisualShader : Shader() {
  /**
   * The offset vector of the whole graph.
   */
  public open var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_GRAPH_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_GRAPH_OFFSET,
          NIL)
    }

  /**
   * The Godot version this [godot.VisualShader] was designed for, in the form of a [godot.core.Dictionary] with `major` and `minor` keys with integer values. Example: `{"major": 4, "minor": 0}`
   *
   * This is used by the editor to convert visual shaders from older Godot versions.
   */
  public open var engineVersion: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_ENGINE_VERSION,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_ENGINE_VERSION,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADER)
  }

  /**
   * Sets the mode of this shader.
   */
  public open fun setMode(mode: Shader.Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_MODE, NIL)
  }

  /**
   * Adds the specified node to the shader.
   */
  public open fun addNode(
    type: VisualShader.Type,
    node: VisualShaderNode,
    position: Vector2,
    id: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, OBJECT to node, VECTOR2 to position, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_ADD_NODE, NIL)
  }

  /**
   * Returns the shader node instance with specified `type` and `id`.
   */
  public open fun getNode(type: VisualShader.Type, id: Long): VisualShaderNode? {
    TransferContext.writeArguments(LONG to type.id, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VisualShaderNode?
  }

  /**
   * Sets the position of the specified node.
   */
  public open fun setNodePosition(
    type: VisualShader.Type,
    id: Long,
    position: Vector2
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_NODE_POSITION, NIL)
  }

  /**
   * Returns the position of the specified node within the shader graph.
   */
  public open fun getNodePosition(type: VisualShader.Type, id: Long): Vector2 {
    TransferContext.writeArguments(LONG to type.id, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the list of all nodes in the shader with the specified type.
   */
  public open fun getNodeList(type: VisualShader.Type): PackedInt32Array {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_LIST,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   *
   */
  public open fun getValidNodeId(type: VisualShader.Type): Long {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_VALID_NODE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the specified node from the shader.
   */
  public open fun removeNode(type: VisualShader.Type, id: Long): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REMOVE_NODE, NIL)
  }

  /**
   * Replaces the specified node with a node of new class type.
   */
  public open fun replaceNode(
    type: VisualShader.Type,
    id: Long,
    newClass: StringName
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id, STRING_NAME to newClass)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REPLACE_NODE, NIL)
  }

  /**
   * Returns `true` if the specified node and port connection exist.
   */
  public open fun isNodeConnection(
    type: VisualShader.Type,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_IS_NODE_CONNECTION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the specified nodes and ports can be connected together.
   */
  public open fun canConnectNodes(
    type: VisualShader.Type,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CAN_CONNECT_NODES,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Connects the specified nodes and ports.
   */
  public open fun connectNodes(
    type: VisualShader.Type,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): GodotError {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Connects the specified nodes and ports.
   */
  public open fun disconnectNodes(
    type: VisualShader.Type,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_DISCONNECT_NODES, NIL)
  }

  /**
   * Connects the specified nodes and ports, even if they can't be connected. Such connection is invalid and will not function properly.
   */
  public open fun connectNodesForced(
    type: VisualShader.Type,
    fromNode: Long,
    fromPort: Long,
    toNode: Long,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode, LONG to fromPort, LONG to
        toNode, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES_FORCED,
        NIL)
  }

  /**
   * Returns the list of connected nodes with the specified type.
   */
  public open fun getNodeConnections(type: VisualShader.Type): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class Type(
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
     *
     */
    TYPE_START(3),
    /**
     *
     */
    TYPE_PROCESS(4),
    /**
     *
     */
    TYPE_COLLIDE(5),
    /**
     *
     */
    TYPE_START_CUSTOM(6),
    /**
     *
     */
    TYPE_PROCESS_CUSTOM(7),
    /**
     *
     */
    TYPE_SKY(8),
    /**
     * A compute shader that runs for each froxel of the volumetric fog map.
     */
    TYPE_FOG(9),
    /**
     * Represents the size of the [enum Type] enum.
     */
    TYPE_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     *
     */
    public final const val NODE_ID_INVALID: Long = -1

    /**
     *
     */
    public final const val NODE_ID_OUTPUT: Long = 0
  }
}
