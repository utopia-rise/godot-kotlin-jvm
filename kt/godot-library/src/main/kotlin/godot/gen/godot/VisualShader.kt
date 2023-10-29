// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A custom shader program with a visual editor.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/visual_shaders.html]($DOCS_URL/tutorials/shaders/visual_shaders.html)
 *
 * This class provides a graph-like visual editor for creating a [godot.Shader]. Although [godot.VisualShader]s do not require coding, they share the same logic with script shaders. They use [godot.VisualShaderNode]s that can be connected to each other to control the flow of the shader. The visual shader graph is converted to a script shader behind the scenes.
 */
@GodotBaseType
public open class VisualShader : Shader() {
  /**
   * The offset vector of the whole graph.
   */
  @CoreTypeLocalCopy
  public var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_GRAPH_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_GRAPH_OFFSET,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADER, scriptIndex)
    return true
  }

  /**
   * The offset vector of the whole graph.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshader.graphOffset
   * //Your changes
   * visualshader.graphOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun graphOffsetMutate(block: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      block(this)
      graphOffset = this
  }


  /**
   * Sets the mode of this shader.
   */
  public fun setMode(mode: Shader.Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_MODE, NIL)
  }

  /**
   * Adds the specified [node] to the shader.
   */
  public fun addNode(
    type: Type,
    node: VisualShaderNode,
    position: Vector2,
    id: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, OBJECT to node, VECTOR2 to position, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_ADD_NODE, NIL)
  }

  /**
   * Returns the shader node instance with specified [type] and [id].
   */
  public fun getNode(type: Type, id: Int): VisualShaderNode? {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VisualShaderNode?)
  }

  /**
   * Sets the position of the specified node.
   */
  public fun setNodePosition(
    type: Type,
    id: Int,
    position: Vector2,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_SET_NODE_POSITION, NIL)
  }

  /**
   * Returns the position of the specified node within the shader graph.
   */
  public fun getNodePosition(type: Type, id: Int): Vector2 {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_POSITION,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the list of all nodes in the shader with the specified type.
   */
  public fun getNodeList(type: Type): PackedInt32Array {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_LIST,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns next valid node ID that can be added to the shader graph.
   */
  public fun getValidNodeId(type: Type): Int {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_VALID_NODE_ID,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the specified node from the shader.
   */
  public fun removeNode(type: Type, id: Int): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REMOVE_NODE, NIL)
  }

  /**
   * Replaces the specified node with a node of new class type.
   */
  public fun replaceNode(
    type: Type,
    id: Int,
    newClass: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong(), STRING_NAME to newClass)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REPLACE_NODE, NIL)
  }

  /**
   * Returns `true` if the specified node and port connection exist.
   */
  public fun isNodeConnection(
    type: Type,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode.toLong(), LONG to fromPort.toLong(), LONG to toNode.toLong(), LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_IS_NODE_CONNECTION,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the specified nodes and ports can be connected together.
   */
  public fun canConnectNodes(
    type: Type,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode.toLong(), LONG to fromPort.toLong(), LONG to toNode.toLong(), LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CAN_CONNECT_NODES,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Connects the specified nodes and ports.
   */
  public fun connectNodes(
    type: Type,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int,
  ): GodotError {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode.toLong(), LONG to fromPort.toLong(), LONG to toNode.toLong(), LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Connects the specified nodes and ports.
   */
  public fun disconnectNodes(
    type: Type,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode.toLong(), LONG to fromPort.toLong(), LONG to toNode.toLong(), LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_DISCONNECT_NODES, NIL)
  }

  /**
   * Connects the specified nodes and ports, even if they can't be connected. Such connection is invalid and will not function properly.
   */
  public fun connectNodesForced(
    type: Type,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to fromNode.toLong(), LONG to fromPort.toLong(), LONG to toNode.toLong(), LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_CONNECT_NODES_FORCED,
        NIL)
  }

  /**
   * Returns the list of connected nodes with the specified type.
   */
  public fun getNodeConnections(type: Type): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_GET_NODE_CONNECTIONS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Adds a new varying value node to the shader.
   */
  public fun addVarying(
    name: String,
    mode: VaryingMode,
    type: VaryingType,
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to mode.id, LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_ADD_VARYING, NIL)
  }

  /**
   * Removes a varying value node with the given [name]. Prints an error if a node with this name is not found.
   */
  public fun removeVarying(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_REMOVE_VARYING, NIL)
  }

  /**
   * Returns `true` if the shader has a varying with the given [name].
   */
  public fun hasVarying(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADER_HAS_VARYING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class Type(
    id: Long,
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
     * A function for the "start" stage of particle shader.
     */
    TYPE_START(3),
    /**
     * A function for the "process" stage of particle shader.
     */
    TYPE_PROCESS(4),
    /**
     * A function for the "collide" stage (particle collision handler) of particle shader.
     */
    TYPE_COLLIDE(5),
    /**
     * A function for the "start" stage of particle shader, with customized output.
     */
    TYPE_START_CUSTOM(6),
    /**
     * A function for the "process" stage of particle shader, with customized output.
     */
    TYPE_PROCESS_CUSTOM(7),
    /**
     * A shader for 3D environment's sky.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VaryingMode(
    id: Long,
  ) {
    /**
     * Varying is passed from `Vertex` function to `Fragment` and `Light` functions.
     */
    VARYING_MODE_VERTEX_TO_FRAG_LIGHT(0),
    /**
     * Varying is passed from `Fragment` function to `Light` function.
     */
    VARYING_MODE_FRAG_TO_LIGHT(1),
    /**
     * Represents the size of the [enum VaryingMode] enum.
     */
    VARYING_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VaryingType(
    id: Long,
  ) {
    /**
     * Varying is of type [float].
     */
    VARYING_TYPE_FLOAT(0),
    /**
     * Varying is of type [int].
     */
    VARYING_TYPE_INT(1),
    /**
     * Varying is of type unsigned [int].
     */
    VARYING_TYPE_UINT(2),
    /**
     * Varying is of type [godot.core.Vector2].
     */
    VARYING_TYPE_VECTOR_2D(3),
    /**
     * Varying is of type [godot.core.Vector3].
     */
    VARYING_TYPE_VECTOR_3D(4),
    /**
     * Varying is of type [godot.Vector4].
     */
    VARYING_TYPE_VECTOR_4D(5),
    /**
     * Varying is of type [bool].
     */
    VARYING_TYPE_BOOLEAN(6),
    /**
     * Varying is of type [godot.Transform3D].
     */
    VARYING_TYPE_TRANSFORM(7),
    /**
     * Represents the size of the [enum VaryingType] enum.
     */
    VARYING_TYPE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Denotes invalid [godot.VisualShader] node.
     */
    public final const val NODE_ID_INVALID: Long = -1

    /**
     * Denotes output node of [godot.VisualShader].
     */
    public final const val NODE_ID_OUTPUT: Long = 0
  }
}
