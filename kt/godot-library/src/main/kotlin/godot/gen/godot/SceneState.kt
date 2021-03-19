// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A script interface to a scene file's data.
 *
 * Maintains a list of resources, nodes, exported, and overridden properties, and built-in scripts associated with a scene.
 *
 * This class cannot be instantiated directly, it is retrieved for a given scene as the result of [godot.PackedScene.getState].
 */
@GodotBaseType
open class SceneState : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_SCENESTATE)
  }

  /**
   * Returns the list of bound parameters for the signal at `idx`.
   */
  open fun getConnectionBinds(idx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_BINDS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the number of signal connections in the scene.
   *
   * The `idx` argument used to query connection metadata in other `get_connection_*` methods in the interval `[0, get_connection_count() - 1]`.
   */
  open fun getConnectionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the connection flags for the signal at `idx`. See [enum Object.ConnectFlags] constants.
   */
  open fun getConnectionFlags(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_FLAGS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the method connected to the signal at `idx`.
   */
  open fun getConnectionMethod(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_METHOD,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the signal at `idx`.
   */
  open fun getConnectionSignal(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SIGNAL,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the node that owns the signal at `idx`, relative to the root node.
   */
  open fun getConnectionSource(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SOURCE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the path to the node that owns the method connected to the signal at `idx`, relative to the root node.
   */
  open fun getConnectionTarget(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_TARGET,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the number of nodes in the scene.
   *
   * The `idx` argument used to query node data in other `get_node_*` methods in the interval `[0, get_node_count() - 1]`.
   */
  open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the list of group names associated with the node at `idx`.
   */
  open fun getNodeGroups(idx: Long): PoolStringArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_GROUPS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the node's index, which is its position relative to its siblings. This is only relevant and saved in scenes for cases where new nodes are added to an instanced or inherited scene among siblings from the base scene. Despite the name, this index is not related to the `idx` argument used here and in other methods.
   */
  open fun getNodeIndex(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.PackedScene] for the node at `idx` (i.e. the whole branch starting at this node, with its child nodes and resources), or `null` if the node is not an instance.
   */
  open fun getNodeInstance(idx: Long): PackedScene? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PackedScene?
  }

  /**
   * Returns the path to the represented scene file if the node at `idx` is an [godot.InstancePlaceholder].
   */
  open fun getNodeInstancePlaceholder(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE_PLACEHOLDER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the node at `idx`.
   */
  open fun getNodeName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the owner of the node at `idx`, relative to the root node.
   */
  open fun getNodeOwnerPath(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_OWNER_PATH,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the path to the node at `idx`.
   *
   * If `for_parent` is `true`, returns the path of the `idx` node's parent instead.
   */
  open fun getNodePath(idx: Long, forParent: Boolean = false): NodePath {
    TransferContext.writeArguments(LONG to idx, BOOL to forParent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the number of exported or overridden properties for the node at `idx`.
   *
   * The `prop_idx` argument used to query node property data in other `get_node_property_*` methods in the interval `[0, get_node_property_count() - 1]`.
   */
  open fun getNodePropertyCount(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the property at `prop_idx` for the node at `idx`.
   */
  open fun getNodePropertyName(idx: Long, propIdx: Long): String {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the value of the property at `prop_idx` for the node at `idx`.
   */
  open fun getNodePropertyValue(idx: Long, propIdx: Long): Any? {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the type of the node at `idx`.
   */
  open fun getNodeType(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_TYPE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the node at `idx` is an [godot.InstancePlaceholder].
   */
  open fun isNodeInstancePlaceholder(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_IS_NODE_INSTANCE_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class GenEditState(
    id: Long
  ) {
    /**
     * If passed to [godot.PackedScene.instance], blocks edits to the scene state.
     */
    GEN_EDIT_STATE_DISABLED(0),

    /**
     * If passed to [godot.PackedScene.instance], provides inherited scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_INSTANCE(1),

    /**
     * If passed to [godot.PackedScene.instance], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN(2);

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
     * If passed to [godot.PackedScene.instance], blocks edits to the scene state.
     */
    final const val GEN_EDIT_STATE_DISABLED: Long = 0

    /**
     * If passed to [godot.PackedScene.instance], provides inherited scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    final const val GEN_EDIT_STATE_INSTANCE: Long = 1

    /**
     * If passed to [godot.PackedScene.instance], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    final const val GEN_EDIT_STATE_MAIN: Long = 2
  }
}
