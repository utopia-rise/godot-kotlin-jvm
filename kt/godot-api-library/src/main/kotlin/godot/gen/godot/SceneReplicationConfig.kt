// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_SCENEREPLICATIONCONFIG_INDEX: Int = 504

@GodotBaseType
public open class SceneReplicationConfig : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SCENEREPLICATIONCONFIG_INDEX, scriptIndex)
  }

  /**
   * Returns a list of synchronized property [NodePath]s.
   */
  public final fun getProperties(): VariantArray<NodePath> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPropertiesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<NodePath>)
  }

  /**
   * Adds the property identified by the given [path] to the list of the properties being
   * synchronized, optionally passing an [index].
   * **Note:** For details on restrictions and limitations on property synchronization, see
   * [MultiplayerSynchronizer].
   */
  @JvmOverloads
  public final fun addProperty(path: NodePath, index: Int = -1): Unit {
    Internals.writeArguments(NODE_PATH to path, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addPropertyPtr, NIL)
  }

  /**
   * Returns `true` if the given [path] is configured for synchronization.
   */
  public final fun hasProperty(path: NodePath): Boolean {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.hasPropertyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the property identified by the given [path] from the configuration.
   */
  public final fun removeProperty(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.removePropertyPtr, NIL)
  }

  /**
   * Finds the index of the given [path].
   */
  public final fun propertyGetIndex(path: NodePath): Int {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.propertyGetIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be synchronized
   * on spawn.
   */
  public final fun propertyGetSpawn(path: NodePath): Boolean {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.propertyGetSpawnPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be synchronized on
   * spawn.
   */
  public final fun propertySetSpawn(path: NodePath, enabled: Boolean): Unit {
    Internals.writeArguments(NODE_PATH to path, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.propertySetSpawnPtr, NIL)
  }

  /**
   * Returns the replication mode for the property identified by the given [path]. See
   * [ReplicationMode].
   */
  public final fun propertyGetReplicationMode(path: NodePath): ReplicationMode {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.propertyGetReplicationModePtr, LONG)
    return SceneReplicationConfig.ReplicationMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the synchronization mode for the property identified by the given [path]. See
   * [ReplicationMode].
   */
  public final fun propertySetReplicationMode(path: NodePath, mode: ReplicationMode): Unit {
    Internals.writeArguments(NODE_PATH to path, LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.propertySetReplicationModePtr, NIL)
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be synchronized
   * on process.
   */
  public final fun propertyGetSync(path: NodePath): Boolean {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.propertyGetSyncPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be synchronized on
   * process.
   */
  public final fun propertySetSync(path: NodePath, enabled: Boolean): Unit {
    Internals.writeArguments(NODE_PATH to path, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.propertySetSyncPtr, NIL)
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be reliably
   * synchronized when changes are detected on process.
   */
  public final fun propertyGetWatch(path: NodePath): Boolean {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.propertyGetWatchPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be reliably
   * synchronized when changes are detected on process.
   */
  public final fun propertySetWatch(path: NodePath, enabled: Boolean): Unit {
    Internals.writeArguments(NODE_PATH to path, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.propertySetWatchPtr, NIL)
  }

  public enum class ReplicationMode(
    id: Long,
  ) {
    /**
     * Do not keep the given property synchronized.
     */
    REPLICATION_MODE_NEVER(0),
    /**
     * Replicate the given property on process by constantly sending updates using unreliable
     * transfer mode.
     */
    REPLICATION_MODE_ALWAYS(1),
    /**
     * Replicate the given property on process by sending updates using reliable transfer mode when
     * its value changes.
     */
    REPLICATION_MODE_ON_CHANGE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ReplicationMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "get_properties", 3995934104)

    public val addPropertyPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "add_property", 4094619021)

    public val hasPropertyPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "has_property", 861721659)

    public val removePropertyPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "remove_property", 1348162250)

    public val propertyGetIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_get_index", 1382022557)

    public val propertyGetSpawnPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_get_spawn", 3456846888)

    public val propertySetSpawnPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_set_spawn", 3868023870)

    public val propertyGetReplicationModePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_get_replication_mode", 2870606336)

    public val propertySetReplicationModePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_set_replication_mode", 3200083865)

    public val propertyGetSyncPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_get_sync", 3456846888)

    public val propertySetSyncPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_set_sync", 3868023870)

    public val propertyGetWatchPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_get_watch", 3456846888)

    public val propertySetWatchPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneReplicationConfig", "property_set_watch", 3868023870)
  }
}
