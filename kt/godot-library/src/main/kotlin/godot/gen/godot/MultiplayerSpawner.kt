// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.VariantType.ANY
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class MultiplayerSpawner : Node() {
  public val despawned: Signal1<Node> by signal("node")

  public val spawned: Signal1<Node> by signal("node")

  public var spawnPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWN_PATH,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWN_PATH,
          NIL)
    }

  public var spawnLimit: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWN_LIMIT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWN_LIMIT, NIL)
    }

  public var spawnFunction: Callable
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWN_FUNCTION, CALLABLE)
      return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
    }
    set(`value`) {
      TransferContext.writeArguments(CALLABLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SET_SPAWN_FUNCTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERSPAWNER, scriptIndex)
    return true
  }

  public fun addSpawnableScene(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_ADD_SPAWNABLE_SCENE, NIL)
  }

  public fun getSpawnableSceneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWNABLE_SCENE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSpawnableScene(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_GET_SPAWNABLE_SCENE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun clearSpawnableScenes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_CLEAR_SPAWNABLE_SCENES, NIL)
  }

  @JvmOverloads
  public fun spawn(`data`: Any? = null): Node? {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIPLAYERSPAWNER_SPAWN, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  public companion object
}
