// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class MultiplayerSynchronizer : Node() {
  public val visibilityChanged: Signal1<Long> by signal("forPeer")

  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_ROOT_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_ROOT_PATH, NIL)
    }

  public var replicationInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_REPLICATION_INTERVAL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_REPLICATION_INTERVAL, NIL)
    }

  public var replicationConfig: SceneReplicationConfig?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_REPLICATION_CONFIG, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SceneReplicationConfig?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_REPLICATION_CONFIG, NIL)
    }

  public var visibilityUpdateMode: MultiplayerSynchronizer.VisibilityUpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_VISIBILITY_UPDATE_MODE, LONG)
      return MultiplayerSynchronizer.VisibilityUpdateMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_VISIBILITY_UPDATE_MODE, NIL)
    }

  public var publicVisibility: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_IS_VISIBILITY_PUBLIC, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_VISIBILITY_PUBLIC, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERSYNCHRONIZER, scriptIndex)
    return true
  }

  public fun updateVisibility(forPeer: Long = 0): Unit {
    TransferContext.writeArguments(LONG to forPeer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_UPDATE_VISIBILITY, NIL)
  }

  public fun addVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_ADD_VISIBILITY_FILTER, NIL)
  }

  public fun removeVisibilityFilter(filter: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to filter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_REMOVE_VISIBILITY_FILTER, NIL)
  }

  public fun setVisibilityFor(peer: Long, visible: Boolean): Unit {
    TransferContext.writeArguments(LONG to peer, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_VISIBILITY_FOR, NIL)
  }

  public fun getVisibilityFor(peer: Long): Boolean {
    TransferContext.writeArguments(LONG to peer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_VISIBILITY_FOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class VisibilityUpdateMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
