// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Maintains a list of resources, nodes, exported and overridden properties, and built-in scripts
 * associated with a scene. They cannot be modified from a [SceneState], only accessed. Useful for
 * peeking into what a [PackedScene] contains without instantiating it.
 * This class cannot be instantiated directly, it is retrieved for a given scene as the result of
 * [PackedScene.getState].
 */
@GodotBaseType
public open class SceneState internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SCENESTATE, scriptIndex)
  }

  /**
   * Returns the number of nodes in the scene.
   * The `idx` argument used to query node data in other `get_node_*` methods in the interval `[0,
   * get_node_count() - 1]`.
   */
  public fun getNodeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the type of the node at [idx].
   */
  public fun getNodeType(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeTypePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the name of the node at [idx].
   */
  public fun getNodeName(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the path to the node at [idx].
   * If [forParent] is `true`, returns the path of the [idx] node's parent instead.
   */
  @JvmOverloads
  public fun getNodePath(idx: Int, forParent: Boolean = false): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to forParent)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Returns the path to the owner of the node at [idx], relative to the root node.
   */
  public fun getNodeOwnerPath(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeOwnerPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Returns `true` if the node at [idx] is an [InstancePlaceholder].
   */
  public fun isNodeInstancePlaceholder(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeInstancePlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the path to the represented scene file if the node at [idx] is an
   * [InstancePlaceholder].
   */
  public fun getNodeInstancePlaceholder(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeInstancePlaceholderPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [PackedScene] for the node at [idx] (i.e. the whole branch starting at this node,
   * with its child nodes and resources), or `null` if the node is not an instance.
   */
  public fun getNodeInstance(idx: Int): PackedScene? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PackedScene?)
  }

  /**
   * Returns the list of group names associated with the node at [idx].
   */
  public fun getNodeGroups(idx: Int): PackedStringArray {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeGroupsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the node's index, which is its position relative to its siblings. This is only relevant
   * and saved in scenes for cases where new nodes are added to an instantiated or inherited scene
   * among siblings from the base scene. Despite the name, this index is not related to the [idx]
   * argument used here and in other methods.
   */
  public fun getNodeIndex(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of exported or overridden properties for the node at [idx].
   * The `prop_idx` argument used to query node property data in other `get_node_property_*` methods
   * in the interval `[0, get_node_property_count() - 1]`.
   */
  public fun getNodePropertyCount(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the property at [propIdx] for the node at [idx].
   */
  public fun getNodePropertyName(idx: Int, propIdx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to propIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the value of the property at [propIdx] for the node at [idx].
   */
  public fun getNodePropertyValue(idx: Int, propIdx: Int): Any? {
    TransferContext.writeArguments(LONG to idx.toLong(), LONG to propIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNodePropertyValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the number of signal connections in the scene.
   * The `idx` argument used to query connection metadata in other `get_connection_*` methods in the
   * interval `[0, get_connection_count() - 1]`.
   */
  public fun getConnectionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the path to the node that owns the signal at [idx], relative to the root node.
   */
  public fun getConnectionSource(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionSourcePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Returns the name of the signal at [idx].
   */
  public fun getConnectionSignal(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionSignalPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the path to the node that owns the method connected to the signal at [idx], relative to
   * the root node.
   */
  public fun getConnectionTarget(idx: Int): NodePath {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionTargetPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Returns the method connected to the signal at [idx].
   */
  public fun getConnectionMethod(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionMethodPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the connection flags for the signal at [idx]. See [Object.ConnectFlags] constants.
   */
  public fun getConnectionFlags(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionFlagsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the list of bound parameters for the signal at [idx].
   */
  public fun getConnectionBinds(idx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionBindsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns the number of unbound parameters for the signal at [idx].
   */
  public fun getConnectionUnbinds(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionUnbindsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class GenEditState(
    id: Long,
  ) {
    /**
     * If passed to [PackedScene.instantiate], blocks edits to the scene state.
     */
    GEN_EDIT_STATE_DISABLED(0),
    /**
     * If passed to [PackedScene.instantiate], provides inherited scene resources to the local
     * scene.
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_INSTANCE(1),
    /**
     * If passed to [PackedScene.instantiate], provides local scene resources to the local scene.
     * Only the main scene should receive the main edit state.
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN(2),
    /**
     * If passed to [PackedScene.instantiate], it's similar to [GEN_EDIT_STATE_MAIN], but for the
     * case where the scene is being instantiated to be the base of another one.
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GenEditState = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNodeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_count", 3905245786)

    public val getNodeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_type", 659327637)

    public val getNodeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_name", 659327637)

    public val getNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_path", 2272487792)

    public val getNodeOwnerPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_owner_path", 408788394)

    public val isNodeInstancePlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "is_node_instance_placeholder", 1116898809)

    public val getNodeInstancePlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_instance_placeholder", 844755477)

    public val getNodeInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_instance", 511017218)

    public val getNodeGroupsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_groups", 647634434)

    public val getNodeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_index", 923996154)

    public val getNodePropertyCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_count", 923996154)

    public val getNodePropertyNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_name", 351665558)

    public val getNodePropertyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_node_property_value", 678354945)

    public val getConnectionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_count", 3905245786)

    public val getConnectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_source", 408788394)

    public val getConnectionSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_signal", 659327637)

    public val getConnectionTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_target", 408788394)

    public val getConnectionMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_method", 659327637)

    public val getConnectionFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_flags", 923996154)

    public val getConnectionBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_binds", 663333327)

    public val getConnectionUnbindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneState", "get_connection_unbinds", 923996154)
  }
}
