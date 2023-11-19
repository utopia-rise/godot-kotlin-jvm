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
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
 * This class allows you to define a custom shader program that can be used for various materials to render objects.
 *
 * The visual shader editor creates the shader.
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
      TransferContext.callMethod(rawPtr, MethodBindings.getGraphOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGraphOffsetPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addNodePtr, NIL)
  }

  /**
   * Returns the shader node instance with specified [type] and [id].
   */
  public fun getNode(type: Type, id: Int): VisualShaderNode? {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePtr, OBJECT)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setNodePositionPtr, NIL)
  }

  /**
   * Returns the position of the specified node within the shader graph.
   */
  public fun getNodePosition(type: Type, id: Int): Vector2 {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the list of all nodes in the shader with the specified type.
   */
  public fun getNodeList(type: Type): PackedInt32Array {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns next valid node ID that can be added to the shader graph.
   */
  public fun getValidNodeId(type: Type): Int {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getValidNodeIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the specified node from the shader.
   */
  public fun removeNode(type: Type, id: Int): Unit {
    TransferContext.writeArguments(LONG to type.id, LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeNodePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.replaceNodePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeConnectionPtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.canConnectNodesPtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.connectNodesPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectNodesPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.connectNodesForcedPtr, NIL)
  }

  /**
   * Returns the list of connected nodes with the specified type.
   */
  public fun getNodeConnections(type: Type): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeConnectionsPtr, ARRAY)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addVaryingPtr, NIL)
  }

  /**
   * Removes a varying value node with the given [name]. Prints an error if a node with this name is not found.
   */
  public fun removeVarying(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeVaryingPtr, NIL)
  }

  /**
   * Returns `true` if the shader has a varying with the given [name].
   */
  public fun hasVarying(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasVaryingPtr, BOOL)
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

  internal object MethodBindings {
    public val setModePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "set_mode")

    public val addNodePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "add_node")

    public val getNodePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "get_node")

    public val setNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "set_node_position")

    public val getNodePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "get_node_position")

    public val getNodeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "get_node_list")

    public val getValidNodeIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "get_valid_node_id")

    public val removeNodePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "remove_node")

    public val replaceNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "replace_node")

    public val isNodeConnectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "is_node_connection")

    public val canConnectNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "can_connect_nodes")

    public val connectNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "connect_nodes")

    public val disconnectNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "disconnect_nodes")

    public val connectNodesForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "connect_nodes_forced")

    public val getNodeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "get_node_connections")

    public val setGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "set_graph_offset")

    public val getGraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "get_graph_offset")

    public val addVaryingPtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "add_varying")

    public val removeVaryingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShader", "remove_varying")

    public val hasVaryingPtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShader", "has_varying")
  }
}
