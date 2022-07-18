// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class MultiplayerSynchronizer : Node() {
  /**
   *
   */
  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_ROOT_PATH,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_ROOT_PATH,
          NIL.ordinal)
    }

  /**
   *
   */
  public var replicationInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_REPLICATION_INTERVAL, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_REPLICATION_INTERVAL, NIL.ordinal)
    }

  public var resource: SceneReplicationConfig?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_GET_REPLICATION_CONFIG, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as SceneReplicationConfig?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSYNCHRONIZER_SET_REPLICATION_CONFIG, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERSYNCHRONIZER)
  }

  public companion object
}
