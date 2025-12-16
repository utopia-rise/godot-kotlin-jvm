// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.GodotEnum
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * By default, [MultiplayerSynchronizer] synchronizes configured properties to all peers.
 *
 * Visibility can be handled directly with [setVisibilityFor] or as-needed with
 * [addVisibilityFilter] and [updateVisibility].
 *
 * [MultiplayerSpawner]s will handle nodes according to visibility of synchronizers as long as the
 * node at [rootPath] was spawned by one.
 *
 * Internally, [MultiplayerSynchronizer] uses [MultiplayerAPI.objectConfigurationAdd] to notify
 * synchronization start passing the [Node] at [rootPath] as the `object` and itself as the
 * `configuration`, and uses [MultiplayerAPI.objectConfigurationRemove] to notify synchronization end
 * in a similar way.
 *
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
  public val synchronized: Signal0 by Signal0

  /**
   * Emitted when a new delta synchronization state is received by this synchronizer after the
   * properties have been updated.
   */
  public val deltaSynchronized: Signal0 by Signal0

  /**
   * Emitted when visibility of [forPeer] is updated. See [updateVisibility].
   */
  public val visibilityChanged: Signal1<Long> by Signal1

  /**
   * Node path that replicated properties are relative to.
   *
   * If [rootPath] was spawned by a [MultiplayerSpawner], the node will be also be spawned and
   * despawned based on this synchronizer visibility options.
   */
  public final inline var rootPath: NodePath
    @JvmName("rootPathProperty")
    get() = getRootPath()
    @JvmName("rootPathProperty")
    set(`value`) {
      setRootPath(value)
    }

  /**
   * Time interval between synchronizations. Used when the replication is set to
   * [SceneReplicationConfig.REPLICATION_MODE_ALWAYS]. If set to `0.0` (the default), synchronizations
   * happen every network process frame.
   */
  public final inline var replicationInterval: Double
    @JvmName("replicationIntervalProperty")
    get() = getReplicationInterval()
    @JvmName("replicationIntervalProperty")
    set(`value`) {
      setReplicationInterval(value)
    }

  /**
   * Time interval between delta synchronizations. Used when the replication is set to
   * [SceneReplicationConfig.REPLICATION_MODE_ON_CHANGE]. If set to `0.0` (the default), delta
   * synchronizations happen every network process frame.
   */
  public final inline var deltaInterval: Double
    @JvmName("deltaIntervalProperty")
    get() = getDeltaInterval()
    @JvmName("deltaIntervalProperty")
    set(`value`) {
      setDeltaInterval(value)
    }

  /**
   * Resource containing which properties to synchronize.
   */
  public final inline var replicationConfig: SceneReplicationConfig?
    @JvmName("replicationConfigProperty")
    get() = getReplicationConfig()
    @JvmName("replicationConfigProperty")
    set(`value`) {
      setReplicationConfig(value)
    }

  /**
   * Specifies when visibility filters are updated.
   */
  public final inline var visibilityUpdateMode: VisibilityUpdateMode
    @JvmName("visibilityUpdateModeProperty")
    get() = getVisibilityUpdateMode()
    @JvmName("visibilityUpdateModeProperty")
    set(`value`) {
      setVisibilityUpdateMode(value)
    }

  /**
   * Whether synchronization should be visible to all peers by default. See [setVisibilityFor] and
   * [addVisibilityFilter] for ways of configuring fine-grained visibility options.
   */
  public final inline var publicVisibility: Boolean
    @JvmName("publicVisibilityProperty")
    get() = isVisibilityPublic()
    @JvmName("publicVisibilityProperty")
    set(`value`) {
      setVisibilityPublic(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(380, scriptPtr)
  }

  public final fun setRootPath(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setRootPathPtr, NIL)
  }

  public final fun getRootPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setReplicationInterval(milliseconds: Double): Unit {
    TransferContext.writeArguments(DOUBLE to milliseconds)
    TransferContext.callMethod(ptr, MethodBindings.setReplicationIntervalPtr, NIL)
  }

  public final fun getReplicationInterval(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReplicationIntervalPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDeltaInterval(milliseconds: Double): Unit {
    TransferContext.writeArguments(DOUBLE to milliseconds)
    TransferContext.callMethod(ptr, MethodBindings.setDeltaIntervalPtr, NIL)
  }

  public final fun getDeltaInterval(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDeltaIntervalPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setReplicationConfig(config: SceneReplicationConfig?): Unit {
    TransferContext.writeArguments(OBJECT to config)
    TransferContext.callMethod(ptr, MethodBindings.setReplicationConfigPtr, NIL)
  }

  public final fun getReplicationConfig(): SceneReplicationConfig? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReplicationConfigPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SceneReplicationConfig?)
  }

  public final fun setVisibilityUpdateMode(mode: VisibilityUpdateMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityUpdateModePtr, NIL)
  }

  public final fun getVisibilityUpdateMode(): VisibilityUpdateMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityUpdateModePtr, LONG)
    return VisibilityUpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Updates the visibility of [forPeer] according to visibility filters. If [forPeer] is `0` (the
   * default), all peers' visibilties are updated.
   */
  @JvmOverloads
  public final fun updateVisibility(forPeer: Int = 0): Unit {
    TransferContext.writeArguments(LONG to forPeer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.updateVisibilityPtr, NIL)
  }

  public final fun setVisibilityPublic(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityPublicPtr, NIL)
  }

  public final fun isVisibilityPublic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisibilityPublicPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a peer visibility filter for this synchronizer.
   *
   * [filter] should take a peer ID [int] and return a [bool].
   */
  public final fun addVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(ptr, MethodBindings.addVisibilityFilterPtr, NIL)
  }

  /**
   * Removes a peer visibility filter from this synchronizer.
   */
  public final fun removeVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(ptr, MethodBindings.removeVisibilityFilterPtr, NIL)
  }

  /**
   * Sets the visibility of [peer] to [visible]. If [peer] is `0`, the value of [publicVisibility]
   * will be updated instead.
   */
  public final fun setVisibilityFor(peer: Int, visible: Boolean): Unit {
    TransferContext.writeArguments(LONG to peer.toLong(), BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityForPtr, NIL)
  }

  /**
   * Queries the current visibility for peer [peer].
   */
  public final fun getVisibilityFor(peer: Int): Boolean {
    TransferContext.writeArguments(LONG to peer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityForPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRootPath(path: String) = setRootPath(path.asCachedNodePath())

  public enum class VisibilityUpdateMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Visibility filters are updated during process frames (see
     * [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    PROCESS_IDLE(0),
    /**
     * Visibility filters are updated during physics frames (see
     * [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    PROCESS_PHYSICS(1),
    /**
     * Visibility filters are not updated automatically, and must be updated manually by calling
     * [updateVisibility].
     */
    PROCESS_NONE(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): VisibilityUpdateMode =
          entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_root_path", 1348162250)

    internal val getRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_root_path", 4075236667)

    internal val setReplicationIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_interval", 373806689)

    internal val getReplicationIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_interval", 1740695150)

    internal val setDeltaIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_delta_interval", 373806689)

    internal val getDeltaIntervalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_delta_interval", 1740695150)

    internal val setReplicationConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_config", 3889206742)

    internal val getReplicationConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_config", 3200254614)

    internal val setVisibilityUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_update_mode", 3494860300)

    internal val getVisibilityUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_update_mode", 3352241418)

    internal val updateVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "update_visibility", 1995695955)

    internal val setVisibilityPublicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_public", 2586408642)

    internal val isVisibilityPublicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "is_visibility_public", 36873697)

    internal val addVisibilityFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "add_visibility_filter", 1611583062)

    internal val removeVisibilityFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "remove_visibility_filter", 1611583062)

    internal val setVisibilityForPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_for", 300928843)

    internal val getVisibilityForPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_for", 1116898809)
  }
}
