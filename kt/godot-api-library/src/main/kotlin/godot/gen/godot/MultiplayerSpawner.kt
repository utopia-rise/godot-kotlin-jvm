// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.Signal1
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_MULTIPLAYERSPAWNER_INDEX: Int = 348

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
  public val despawned: Signal1<Node> by Signal1

  /**
   * Emitted when a spawnable scene or custom spawn was spawned by the multiplayer authority. Only
   * called on puppets.
   */
  public val spawned: Signal1<Node> by Signal1

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
    Internals.callConstructor(this, ENGINE_CLASS_MULTIPLAYERSPAWNER_INDEX, scriptIndex)
  }

  /**
   * Adds a scene path to spawnable scenes, making it automatically replicated from the multiplayer
   * authority to other peers when added as children of the node pointed by [spawnPath].
   */
  public final fun addSpawnableScene(path: String): Unit {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.addSpawnableScenePtr, NIL)
  }

  /**
   * Returns the count of spawnable scene paths.
   */
  public final fun getSpawnableSceneCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpawnableSceneCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the spawnable scene path by index.
   */
  public final fun getSpawnableScene(index: Int): String {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSpawnableScenePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Clears all spawnable scenes. Does not despawn existing instances on remote peers.
   */
  public final fun clearSpawnableScenes(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearSpawnableScenesPtr, NIL)
  }

  /**
   * Requests a custom spawn, with [data] passed to [spawnFunction] on all peers. Returns the
   * locally spawned node instance already inside the scene tree, and added as a child of the node
   * pointed by [spawnPath].
   * **Note:** Spawnable scenes are spawned automatically. [spawn] is only needed for custom spawns.
   */
  @JvmOverloads
  public final fun spawn(`data`: Any? = null): Node? {
    Internals.writeArguments(ANY to data)
    Internals.callMethod(rawPtr, MethodBindings.spawnPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Node?)
  }

  public final fun getSpawnPath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpawnPathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setSpawnPath(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setSpawnPathPtr, NIL)
  }

  public final fun getSpawnLimit(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpawnLimitPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSpawnLimit(limit: Long): Unit {
    Internals.writeArguments(LONG to limit)
    Internals.callMethod(rawPtr, MethodBindings.setSpawnLimitPtr, NIL)
  }

  public final fun getSpawnFunction(): Callable {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpawnFunctionPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
  }

  public final fun setSpawnFunction(spawnFunction: Callable): Unit {
    Internals.writeArguments(CALLABLE to spawnFunction)
    Internals.callMethod(rawPtr, MethodBindings.setSpawnFunctionPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val addSpawnableScenePtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "add_spawnable_scene", 83702148)

    public val getSpawnableSceneCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "get_spawnable_scene_count", 3905245786)

    public val getSpawnableScenePtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "get_spawnable_scene", 844755477)

    public val clearSpawnableScenesPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "clear_spawnable_scenes", 3218959716)

    public val spawnPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "spawn", 1991184589)

    public val getSpawnPathPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "get_spawn_path", 4075236667)

    public val setSpawnPathPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "set_spawn_path", 1348162250)

    public val getSpawnLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "get_spawn_limit", 3905245786)

    public val setSpawnLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "set_spawn_limit", 1286410249)

    public val getSpawnFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "get_spawn_function", 1307783378)

    public val setSpawnFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiplayerSpawner", "set_spawn_function", 1611583062)
  }
}
