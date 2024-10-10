// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
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
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_MULTIPLAYERSYNCHRONIZER_INDEX: Int = 349

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
   * Time interval between synchronizations. When set to `0.0` (the default), synchronizations
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
   * Time interval between delta synchronizations. When set to `0.0` (the default), delta
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
   * Specifies when visibility filters are updated (see [VisibilityUpdateMode] for options).
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MULTIPLAYERSYNCHRONIZER_INDEX, scriptIndex)
  }

  public final fun setRootPath(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setRootPathPtr, NIL)
  }

  public final fun getRootPath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootPathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setReplicationInterval(milliseconds: Double): Unit {
    Internals.writeArguments(DOUBLE to milliseconds)
    Internals.callMethod(rawPtr, MethodBindings.setReplicationIntervalPtr, NIL)
  }

  public final fun getReplicationInterval(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getReplicationIntervalPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDeltaInterval(milliseconds: Double): Unit {
    Internals.writeArguments(DOUBLE to milliseconds)
    Internals.callMethod(rawPtr, MethodBindings.setDeltaIntervalPtr, NIL)
  }

  public final fun getDeltaInterval(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDeltaIntervalPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setReplicationConfig(config: SceneReplicationConfig?): Unit {
    Internals.writeArguments(OBJECT to config)
    Internals.callMethod(rawPtr, MethodBindings.setReplicationConfigPtr, NIL)
  }

  public final fun getReplicationConfig(): SceneReplicationConfig? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getReplicationConfigPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SceneReplicationConfig?)
  }

  public final fun setVisibilityUpdateMode(mode: VisibilityUpdateMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityUpdateModePtr, NIL)
  }

  public final fun getVisibilityUpdateMode(): VisibilityUpdateMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityUpdateModePtr, LONG)
    return MultiplayerSynchronizer.VisibilityUpdateMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Updates the visibility of [forPeer] according to visibility filters. If [forPeer] is `0` (the
   * default), all peers' visibilties are updated.
   */
  @JvmOverloads
  public final fun updateVisibility(forPeer: Int = 0): Unit {
    Internals.writeArguments(LONG to forPeer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.updateVisibilityPtr, NIL)
  }

  public final fun setVisibilityPublic(visible: Boolean): Unit {
    Internals.writeArguments(BOOL to visible)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityPublicPtr, NIL)
  }

  public final fun isVisibilityPublic(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVisibilityPublicPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a peer visibility filter for this synchronizer.
   * [filter] should take a peer ID [int] and return a [bool].
   */
  public final fun addVisibilityFilter(filter: Callable): Unit {
    Internals.writeArguments(CALLABLE to filter)
    Internals.callMethod(rawPtr, MethodBindings.addVisibilityFilterPtr, NIL)
  }

  /**
   * Removes a peer visibility filter from this synchronizer.
   */
  public final fun removeVisibilityFilter(filter: Callable): Unit {
    Internals.writeArguments(CALLABLE to filter)
    Internals.callMethod(rawPtr, MethodBindings.removeVisibilityFilterPtr, NIL)
  }

  /**
   * Sets the visibility of [peer] to [visible]. If [peer] is `0`, the value of [publicVisibility]
   * will be updated instead.
   */
  public final fun setVisibilityFor(peer: Int, visible: Boolean): Unit {
    Internals.writeArguments(LONG to peer.toLong(), BOOL to visible)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityForPtr, NIL)
  }

  /**
   * Queries the current visibility for peer [peer].
   */
  public final fun getVisibilityFor(peer: Int): Boolean {
    Internals.writeArguments(LONG to peer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityForPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public enum class VisibilityUpdateMode(
    id: Long,
  ) {
    /**
     * Visibility filters are updated during process frames (see
     * [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    VISIBILITY_PROCESS_IDLE(0),
    /**
     * Visibility filters are updated during physics frames (see
     * [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
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
      public fun from(`value`: Long): VisibilityUpdateMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRootPathPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_root_path", 1348162250)

    public val getRootPathPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_root_path", 4075236667)

    public val setReplicationIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_interval", 373806689)

    public val getReplicationIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_interval", 1740695150)

    public val setDeltaIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_delta_interval", 373806689)

    public val getDeltaIntervalPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_delta_interval", 1740695150)

    public val setReplicationConfigPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_replication_config", 3889206742)

    public val getReplicationConfigPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_replication_config", 3200254614)

    public val setVisibilityUpdateModePtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_update_mode", 3494860300)

    public val getVisibilityUpdateModePtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_update_mode", 3352241418)

    public val updateVisibilityPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "update_visibility", 1995695955)

    public val setVisibilityPublicPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_public", 2586408642)

    public val isVisibilityPublicPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "is_visibility_public", 36873697)

    public val addVisibilityFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "add_visibility_filter", 1611583062)

    public val removeVisibilityFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "remove_visibility_filter", 1611583062)

    public val setVisibilityForPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "set_visibility_for", 300928843)

    public val getVisibilityForPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSynchronizer", "get_visibility_for", 1116898809)
  }
}
