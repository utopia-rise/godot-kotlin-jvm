// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneReplicationConfig : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENEREPLICATIONCONFIG, scriptIndex)
    return true
  }

  public fun getProperties(): VariantArray<NodePath> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPropertiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<NodePath>)
  }

  @JvmOverloads
  public fun addProperty(path: NodePath, index: Int = -1): Unit {
    TransferContext.writeArguments(NODE_PATH to path, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyPtr, NIL)
  }

  public fun hasProperty(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasPropertyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun removeProperty(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.removePropertyPtr, NIL)
  }

  public fun propertyGetIndex(path: NodePath): Int {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun propertyGetSpawn(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetSpawnPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun propertySetSpawn(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.propertySetSpawnPtr, NIL)
  }

  public fun propertyGetReplicationMode(path: NodePath): ReplicationMode {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetReplicationModePtr, LONG)
    return SceneReplicationConfig.ReplicationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun propertySetReplicationMode(path: NodePath, mode: ReplicationMode): Unit {
    TransferContext.writeArguments(NODE_PATH to path, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.propertySetReplicationModePtr, NIL)
  }

  public fun propertyGetSync(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetSyncPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun propertySetSync(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.propertySetSyncPtr, NIL)
  }

  public fun propertyGetWatch(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.propertyGetWatchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun propertySetWatch(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.propertySetWatchPtr, NIL)
  }

  public enum class ReplicationMode(
    id: Long,
  ) {
    REPLICATION_MODE_NEVER(0),
    REPLICATION_MODE_ALWAYS(1),
    REPLICATION_MODE_ON_CHANGE(2),
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
    public val getPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "get_properties")

    public val addPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "add_property")

    public val hasPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "has_property")

    public val removePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "remove_property")

    public val propertyGetIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_index")

    public val propertyGetSpawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_spawn")

    public val propertySetSpawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_spawn")

    public val propertyGetReplicationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_replication_mode")

    public val propertySetReplicationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_replication_mode")

    public val propertyGetSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_sync")

    public val propertySetSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_sync")

    public val propertyGetWatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_get_watch")

    public val propertySetWatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneReplicationConfig", "property_set_watch")
  }
}
