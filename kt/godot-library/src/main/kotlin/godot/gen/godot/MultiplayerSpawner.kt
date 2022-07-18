// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class MultiplayerSpawner : Node() {
  /**
   *
   */
  public val despawned: Signal2<Long, Node> by signal("sceneId", "node")

  /**
   *
   */
  public val spawned: Signal2<Long, Node> by signal("sceneId", "node")

  public var replication: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWNABLE_SCENES, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWNABLE_SCENES, NIL.ordinal)
    }

  /**
   *
   */
  public var spawnPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWN_PATH,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWN_PATH,
          NIL.ordinal)
    }

  /**
   *
   */
  public var spawnLimit: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWN_LIMIT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWN_LIMIT,
          NIL.ordinal)
    }

  /**
   *
   */
  public var autoSpawn: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_IS_AUTO_SPAWNING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_AUTO_SPAWNING,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERSPAWNER)
  }

  /**
   *
   */
  public open fun _spawnCustom(`data`: Any): Object? {
    throw NotImplementedError("_spawn_custom is not implemented for MultiplayerSpawner")
  }

  /**
   *
   */
  public fun spawn(`data`: Any? = null): Node? {
    TransferContext.writeArguments(ANY to data)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SPAWN, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public companion object
}
