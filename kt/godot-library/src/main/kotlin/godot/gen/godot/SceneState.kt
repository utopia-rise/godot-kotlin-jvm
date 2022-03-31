// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A script interface to a scene file's data.
 *
 * Maintains a list of resources, nodes, exported, and overridden properties, and built-in scripts associated with a scene.
 *
 * This class cannot be instantiated directly, it is retrieved for a given scene as the result of [godot.PackedScene.getState].
 */
@GodotBaseType
public open class SceneState internal constructor() : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCENESTATE)
  }

  /**
   * Returns the number of nodes in the scene.
   *
   * The `idx` argument used to query node data in other `get_node_*` methods in the interval `[0, get_node_count() - 1]`.
   */
  public open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the type of the node at `idx`.
   */
  public open fun getNodeType(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_TYPE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the name of the node at `idx`.
   */
  public open fun getNodeName(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the path to the node at `idx`.
   *
   * If `for_parent` is `true`, returns the path of the `idx` node's parent instead.
   */
  public open fun getNodePath(idx: Long, forParent: Boolean = false): NodePath {
    TransferContext.writeArguments(LONG to idx, BOOL to forParent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the path to the owner of the node at `idx`, relative to the root node.
   */
  public open fun getNodeOwnerPath(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_OWNER_PATH,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns `true` if the node at `idx` is an [godot.InstancePlaceholder].
   */
  public open fun isNodeInstancePlaceholder(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_IS_NODE_INSTANCE_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the path to the represented scene file if the node at `idx` is an [godot.InstancePlaceholder].
   */
  public open fun getNodeInstancePlaceholder(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE_PLACEHOLDER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a [godot.PackedScene] for the node at `idx` (i.e. the whole branch starting at this node, with its child nodes and resources), or `null` if the node is not an instance.
   */
  public open fun getNodeInstance(idx: Long): PackedScene? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PackedScene?
  }

  /**
   * Returns the list of group names associated with the node at `idx`.
   */
  public open fun getNodeGroups(idx: Long): PackedStringArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_GROUPS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns the node's index, which is its position relative to its siblings. This is only relevant and saved in scenes for cases where new nodes are added to an instantiated or inherited scene among siblings from the base scene. Despite the name, this index is not related to the `idx` argument used here and in other methods.
   */
  public open fun getNodeIndex(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of exported or overridden properties for the node at `idx`.
   *
   * The `prop_idx` argument used to query node property data in other `get_node_property_*` methods in the interval `[0, get_node_property_count() - 1]`.
   */
  public open fun getNodePropertyCount(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the property at `prop_idx` for the node at `idx`.
   */
  public open fun getNodePropertyName(idx: Long, propIdx: Long): StringName {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the value of the property at `prop_idx` for the node at `idx`.
   */
  public open fun getNodePropertyValue(idx: Long, propIdx: Long): Any? {
    TransferContext.writeArguments(LONG to idx, LONG to propIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_NODE_PROPERTY_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the number of signal connections in the scene.
   *
   * The `idx` argument used to query connection metadata in other `get_connection_*` methods in the interval `[0, get_connection_count() - 1]`.
   */
  public open fun getConnectionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the path to the node that owns the signal at `idx`, relative to the root node.
   */
  public open fun getConnectionSource(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SOURCE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the name of the signal at `idx`.
   */
  public open fun getConnectionSignal(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_SIGNAL,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the path to the node that owns the method connected to the signal at `idx`, relative to the root node.
   */
  public open fun getConnectionTarget(idx: Long): NodePath {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_TARGET,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the method connected to the signal at `idx`.
   */
  public open fun getConnectionMethod(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_METHOD,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the connection flags for the signal at `idx`. See [enum Object.ConnectFlags] constants.
   */
  public open fun getConnectionFlags(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_FLAGS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the list of bound parameters for the signal at `idx`.
   */
  public open fun getConnectionBinds(idx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_BINDS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the number of unbound parameters for the signal at `idx`.
   */
  public open fun getConnectionUnbinds(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENESTATE_GET_CONNECTION_UNBINDS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class GenEditState(
    id: Long
  ) {
    /**
     * If passed to [godot.PackedScene.instantiate], blocks edits to the scene state.
     */
    GEN_EDIT_STATE_DISABLED(0),
    /**
     * If passed to [godot.PackedScene.instantiate], provides inherited scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_INSTANCE(1),
    /**
     * If passed to [godot.PackedScene.instantiate], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN(2),
    /**
     * If passed to [godot.PackedScene.instantiate], it's similar to [GEN_EDIT_STATE_MAIN], but for the case where the scene is being instantiated to be the base of another one.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
