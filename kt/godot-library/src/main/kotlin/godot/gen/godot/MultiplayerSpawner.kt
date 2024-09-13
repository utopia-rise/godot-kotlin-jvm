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
import godot.core.VariantCaster.ANY
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Spawnable scenes can be configured in the editor or through code (see [addSpawnableScene]).
 * Also supports custom node spawns through [spawn], calling [spawnFunction] on all peers.
 * Internally, [MultiplayerSpawner] uses [MultiplayerAPI.objectConfigurationAdd] to notify spawns
 * passing the spawned node as the `object` and itself as the `configuration`, and
 * [MultiplayerAPI.objectConfigurationRemove] to notify despawns in a similar way.
 */
@GodotBaseType
public open class MultiplayerSpawner : Node() {
  /**
   * Emitted when a spawnable scene or custom spawn was despawned by the multiplayer authority. Only
   * called on puppets.
   */
  public val despawned: Signal1<Node> by signal("node")

  /**
   * Emitted when a spawnable scene or custom spawn was spawned by the multiplayer authority. Only
   * called on puppets.
   */
  public val spawned: Signal1<Node> by signal("node")

  /**
   * Path to the spawn root. Spawnable scenes that are added as direct children are replicated to
   * other peers.
   */
  public final inline var spawnPath: NodePath
    @JvmName("spawnPathProperty")
    get() = getSpawnPath()
    @JvmName("spawnPathProperty")
    set(`value`) {
      setSpawnPath(value)
    }

  /**
   * Maximum nodes that is allowed to be spawned by this spawner. Includes both spawnable scenes and
   * custom spawns.
   * When set to `0` (the default), there is no limit.
   */
  public final inline var spawnLimit: Long
    @JvmName("spawnLimitProperty")
    get() = getSpawnLimit()
    @JvmName("spawnLimitProperty")
    set(`value`) {
      setSpawnLimit(value)
    }

  /**
   * Method called on all peers when for every custom [spawn] requested by the authority. Will
   * receive the `data` parameter, and should return a [Node] that is not in the scene tree.
   * **Note:** The returned node should **not** be added to the scene with [Node.addChild]. This is
   * done automatically.
   */
  public final inline var spawnFunction: Callable
    @JvmName("spawnFunctionProperty")
    get() = getSpawnFunction()
    @JvmName("spawnFunctionProperty")
    set(`value`) {
      setSpawnFunction(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MULTIPLAYERSPAWNER, scriptIndex)
  }

  /**
   * Adds a scene path to spawnable scenes, making it automatically replicated from the multiplayer
   * authority to other peers when added as children of the node pointed by [spawnPath].
   */
  public final fun addSpawnableScene(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addSpawnableScenePtr, NIL)
  }

  /**
   * Returns the count of spawnable scene paths.
   */
  public final fun getSpawnableSceneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpawnableSceneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the spawnable scene path by index.
   */
  public final fun getSpawnableScene(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSpawnableScenePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Clears all spawnable scenes. Does not despawn existing instances on remote peers.
   */
  public final fun clearSpawnableScenes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSpawnableScenesPtr, NIL)
  }

  /**
   * Requests a custom spawn, with [data] passed to [spawnFunction] on all peers. Returns the
   * locally spawned node instance already inside the scene tree, and added as a child of the node
   * pointed by [spawnPath].
   * **Note:** Spawnable scenes are spawned automatically. [spawn] is only needed for custom spawns.
   */
  @JvmOverloads
  public final fun spawn(`data`: Any? = null): Node? {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.spawnPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  public final fun getSpawnPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpawnPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setSpawnPath(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpawnPathPtr, NIL)
  }

  public final fun getSpawnLimit(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpawnLimitPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSpawnLimit(limit: Long): Unit {
    TransferContext.writeArguments(LONG to limit)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpawnLimitPtr, NIL)
  }

  public final fun getSpawnFunction(): Callable {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpawnFunctionPtr, CALLABLE)
    return (TransferContext.readReturnValue(CALLABLE) as Callable)
  }

  public final fun setSpawnFunction(spawnFunction: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to spawnFunction)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpawnFunctionPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addSpawnableScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "add_spawnable_scene", 83702148)

    public val getSpawnableSceneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "get_spawnable_scene_count", 3905245786)

    public val getSpawnableScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "get_spawnable_scene", 844755477)

    public val clearSpawnableScenesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "clear_spawnable_scenes", 3218959716)

    public val spawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "spawn", 1991184589)

    public val getSpawnPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "get_spawn_path", 4075236667)

    public val setSpawnPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "set_spawn_path", 1348162250)

    public val getSpawnLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "get_spawn_limit", 3905245786)

    public val setSpawnLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "set_spawn_limit", 1286410249)

    public val getSpawnFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "get_spawn_function", 1307783378)

    public val setSpawnFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerSpawner", "set_spawn_function", 1611583062)
  }
}
