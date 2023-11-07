// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * By default, [MultiplayerSynchronizer] synchronizes configured properties to all peers.
 * Visibility can be handled directly with [setVisibilityFor] or as-needed with
 * [addVisibilityFilter] and [updateVisibility].
 * [MultiplayerSpawner]s will handle nodes according to visibility of synchronizers as long as the
 * node at [rootPath] was spawned by one.
 * Internally, [MultiplayerSynchronizer] uses [MultiplayerAPI.objectConfigurationAdd] to notify
 * synchronization start passing the [Node] at [rootPath] as the `object` and itself as the
 * `configuration`, and uses [MultiplayerAPI.objectConfigurationRemove] to notify synchronization end
 * in a similar way.
 * **Note:** Synchronization is not supported for [Object] type properties, like [Resource].
 * Properties that are unique to each peer, like the instance IDs of [Object]s (see
 * [Object.getInstanceId]) or [RID]s, will also not work in synchronization.
 */
@GodotBaseType
public open class MultiplayerSynchronizer : Node() {
  /**
   * Emitted when a new synchronization state is received by this synchronizer after the properties
   * have been updated.
   */
  public val synchronized: Signal0 by signal()

  /**
   * Emitted when a new delta synchronization state is received by this synchronizer after the
   * properties have been updated.
   */
  public val deltaSynchronized: Signal0 by signal()

  /**
   * Emitted when visibility of [param for_peer] is updated. See [updateVisibility].
   */
  public val visibilityChanged: Signal1<Long> by signal("forPeer")

  /**
   * Node path that replicated properties are relative to.
   * If [rootPath] was spawned by a [MultiplayerSpawner], the node will be also be spawned and
   * despawned based on this synchronizer visibility options.
   */
  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootPathPtr, NIL)
    }

  /**
   * Time interval between synchronizations. When set to `0.0` (the default), synchronizations
   * happen every network process frame.
   */
  public var replicationInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReplicationIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReplicationIntervalPtr, NIL)
    }

  /**
   * Time interval between delta synchronizations. When set to `0.0` (the default), delta
   * synchronizations happen every network process frame.
   */
  public var deltaInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDeltaIntervalPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeltaIntervalPtr, NIL)
    }

  /**
   * Resource containing which properties to synchronize.
   */
  public var replicationConfig: SceneReplicationConfig?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReplicationConfigPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SceneReplicationConfig?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReplicationConfigPtr, NIL)
    }

  /**
   * Specifies when visibility filters are updated (see [enum VisibilityUpdateMode] for options).
   */
  public var visibilityUpdateMode: VisibilityUpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityUpdateModePtr, LONG)
      return MultiplayerSynchronizer.VisibilityUpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityUpdateModePtr, NIL)
    }

  /**
   * Whether synchronization should be visible to all peers by default. See [setVisibilityFor] and
   * [addVisibilityFilter] for ways of configuring fine-grained visibility options.
   */
  public var publicVisibility: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisibilityPublicPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityPublicPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERSYNCHRONIZER, scriptIndex)
    return true
  }

  /**
   * Updates the visibility of [param for_peer] according to visibility filters. If [param for_peer]
   * is `0` (the default), all peers' visibilties are updated.
   */
  @JvmOverloads
  public fun updateVisibility(forPeer: Int = 0): Unit {
    TransferContext.writeArguments(LONG to forPeer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.updateVisibilityPtr, NIL)
  }

  /**
   * Adds a peer visibility filter for this synchronizer.
   * [param filter] should take a peer ID [int] and return a [bool].
   */
  public fun addVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr, MethodBindings.addVisibilityFilterPtr, NIL)
  }

  /**
   * Removes a peer visibility filter from this synchronizer.
   */
  public fun removeVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr, MethodBindings.removeVisibilityFilterPtr, NIL)
  }

  /**
   * Sets the visibility of [param peer] to [param visible]. If [param peer] is `0`, the value of
   * [publicVisibility] will be updated instead.
   */
  public fun setVisibilityFor(peer: Int, visible: Boolean): Unit {
    TransferContext.writeArguments(LONG to peer.toLong(), BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityForPtr, NIL)
  }

  /**
   * Queries the current visibility for peer [param peer].
   */
  public fun getVisibilityFor(peer: Int): Boolean {
    TransferContext.writeArguments(LONG to peer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityForPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class VisibilityUpdateMode(
    id: Long,
  ) {
    /**
     * Visibility filters are updated during process frames (see [constant
     * Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    VISIBILITY_PROCESS_IDLE(0),
    /**
     * Visibility filters are updated during physics frames (see [constant
     * Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    VISIBILITY_PROCESS_PHYSICS(1),
    /**
     * Visibility filters are not updated automatically, and must be updated manually by calling
     * [updateVisibility].
     */
    VISIBILITY_PROCESS_NONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_root_path")

    public val getRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_root_path")

    public val setReplicationIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_interval")

    public val getReplicationIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_interval")

    public val setDeltaIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_delta_interval")

    public val getDeltaIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_delta_interval")

    public val setReplicationConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_config")

    public val getReplicationConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_config")

    public val setVisibilityUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_update_mode")

    public val getVisibilityUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_update_mode")

    public val updateVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "update_visibility")

    public val setVisibilityPublicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_public")

    public val isVisibilityPublicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "is_visibility_public")

    public val addVisibilityFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "add_visibility_filter")

    public val removeVisibilityFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "remove_visibility_filter")

    public val setVisibilityForPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_for")

    public val getVisibilityForPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_for")
  }
}
