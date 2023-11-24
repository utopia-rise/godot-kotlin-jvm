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

@GodotBaseType
public open class MultiplayerSynchronizer : Node() {
  public val synchronized: Signal0 by signal()

  public val deltaSynchronized: Signal0 by signal()

  public val visibilityChanged: Signal1<Long> by signal("forPeer")

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

  @JvmOverloads
  public fun updateVisibility(forPeer: Int = 0): Unit {
    TransferContext.writeArguments(LONG to forPeer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.updateVisibilityPtr, NIL)
  }

  public fun addVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr, MethodBindings.addVisibilityFilterPtr, NIL)
  }

  public fun removeVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr, MethodBindings.removeVisibilityFilterPtr, NIL)
  }

  public fun setVisibilityFor(peer: Int, visible: Boolean): Unit {
    TransferContext.writeArguments(LONG to peer.toLong(), BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityForPtr, NIL)
  }

  public fun getVisibilityFor(peer: Int): Boolean {
    TransferContext.writeArguments(LONG to peer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityForPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class VisibilityUpdateMode(
    id: Long,
  ) {
    VISIBILITY_PROCESS_IDLE(0),
    VISIBILITY_PROCESS_PHYSICS(1),
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
