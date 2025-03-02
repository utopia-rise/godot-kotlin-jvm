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
import godot.core.NodePath
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneReplicationConfig : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(577, scriptIndex)
  }

  /**
   * Returns a list of synchronized property [NodePath]s.
   */
  public final fun getProperties(): VariantArray<NodePath> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPropertiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<NodePath>)
  }

  /**
   * Adds the property identified by the given [path] to the list of the properties being
   * synchronized, optionally passing an [index].
   * **Note:** For details on restrictions and limitations on property synchronization, see
   * [MultiplayerSynchronizer].
   */
  @JvmOverloads
  public final fun addProperty(path: NodePath, index: Int = -1): Unit {
    TransferContext.writeArguments(NODE_PATH to path, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addPropertyPtr, NIL)
  }

  /**
   * Returns `true` if the given [path] is configured for synchronization.
   */
  public final fun hasProperty(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.hasPropertyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the property identified by the given [path] from the configuration.
   */
  public final fun removeProperty(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.removePropertyPtr, NIL)
  }

  /**
   * Finds the index of the given [path].
   */
  public final fun propertyGetIndex(path: NodePath): Int {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be synchronized
   * on spawn.
   */
  public final fun propertyGetSpawn(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetSpawnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be synchronized on
   * spawn.
   */
  public final fun propertySetSpawn(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.propertySetSpawnPtr, NIL)
  }

  /**
   * Returns the replication mode for the property identified by the given [path]. See
   * [ReplicationMode].
   */
  public final fun propertyGetReplicationMode(path: NodePath): ReplicationMode {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetReplicationModePtr, LONG)
    return SceneReplicationConfig.ReplicationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the synchronization mode for the property identified by the given [path]. See
   * [ReplicationMode].
   */
  public final fun propertySetReplicationMode(path: NodePath, mode: ReplicationMode): Unit {
    TransferContext.writeArguments(NODE_PATH to path, LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.propertySetReplicationModePtr, NIL)
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be synchronized
   * on process.
   */
  public final fun propertyGetSync(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetSyncPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be synchronized on
   * process.
   */
  public final fun propertySetSync(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.propertySetSyncPtr, NIL)
  }

  /**
   * Returns `true` if the property identified by the given [path] is configured to be reliably
   * synchronized when changes are detected on process.
   */
  public final fun propertyGetWatch(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetWatchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the property identified by the given [path] is configured to be reliably
   * synchronized when changes are detected on process.
   */
  public final fun propertySetWatch(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.propertySetWatchPtr, NIL)
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

  public object MethodBindings {
    internal val getPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "get_properties", 3995934104)

    internal val addPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "add_property", 4094619021)

    internal val hasPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "has_property", 861721659)

    internal val removePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "remove_property", 1348162250)

    internal val propertyGetIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_index", 1382022557)

    internal val propertyGetSpawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_spawn", 3456846888)

    internal val propertySetSpawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_spawn", 3868023870)

    internal val propertyGetReplicationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_replication_mode", 2870606336)

    internal val propertySetReplicationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_replication_mode", 3200083865)

    internal val propertyGetSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_sync", 3456846888)

    internal val propertySetSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_sync", 3868023870)

    internal val propertyGetWatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_watch", 3456846888)

    internal val propertySetWatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_watch", 3868023870)
  }
}
