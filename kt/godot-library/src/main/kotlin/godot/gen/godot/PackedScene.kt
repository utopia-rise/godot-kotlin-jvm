// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An abstraction of a serialized scene.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/520](https://godotengine.org/asset-library/asset/520)
 *
 * A simplified interface to a scene file. Provides access to operations and checks that can be performed on the scene resource itself.
 *
 * Can be used to save a node to a file. When saving, the node as well as all the nodes it owns get saved (see [godot.Node.owner] property).
 *
 * **Note:** The node doesn't need to own itself.
 *
 * **Example of loading a saved scene:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Use load() instead of preload() if the path isn't known at compile-time.
 *
 * var scene = preload("res://scene.tscn").instantiate()
 *
 * # Add the node as a child of the node the script is attached to.
 *
 * add_child(scene)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // C# has no preload, so you have to always use ResourceLoader.Load<PackedScene>().
 *
 * var scene = ResourceLoader.Load<PackedScene>("res://scene.tscn").Instantiate();
 *
 * // Add the node as a child of the node the script is attached to.
 *
 * AddChild(scene);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Example of saving a node with different owners:** The following example creates 3 objects: [godot.Node2D] (`node`), [godot.RigidBody2D] (`body`) and [godot.CollisionObject2D] (`collision`). `collision` is a child of `body` which is a child of `node`. Only `body` is owned by `node` and `pack` will therefore only save those two nodes, but not `collision`.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Create the objects.
 *
 * var node = Node2D.new()
 *
 * var body = RigidBody2D.new()
 *
 * var collision = CollisionShape2D.new()
 *
 *
 *
 * # Create the object hierarchy.
 *
 * body.add_child(collision)
 *
 * node.add_child(body)
 *
 *
 *
 * # Change owner of `body`, but not of `collision`.
 *
 * body.owner = node
 *
 * var scene = PackedScene.new()
 *
 *
 *
 * # Only `node` and `body` are now packed.
 *
 * var result = scene.pack(node)
 *
 * if result == OK:
 *
 *     var error = ResourceSaver.save(scene, "res://path/name.tscn")  # Or "user://..."
 *
 *     if error != OK:
 *
 *         push_error("An error occurred while saving the scene to disk.")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Create the objects.
 *
 * var node = new Node2D();
 *
 * var body = new RigidBody2D();
 *
 * var collision = new CollisionShape2D();
 *
 *
 *
 * // Create the object hierarchy.
 *
 * body.AddChild(collision);
 *
 * node.AddChild(body);
 *
 *
 *
 * // Change owner of `body`, but not of `collision`.
 *
 * body.Owner = node;
 *
 * var scene = new PackedScene();
 *
 *
 *
 * // Only `node` and `body` are now packed.
 *
 * Error result = scene.Pack(node);
 *
 * if (result == Error.Ok)
 *
 * {
 *
 *     Error error = ResourceSaver.Save(scene, "res://path/name.tscn"); // Or "user://..."
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.PushError("An error occurred while saving the scene to disk.");
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class PackedScene : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PACKEDSCENE)
  }

  /**
   * Pack will ignore any sub-nodes not owned by given node. See [godot.Node.owner].
   */
  public fun pack(path: Node): GodotError {
    TransferContext.writeArguments(OBJECT to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_PACK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Instantiates the scene's node hierarchy. Triggers child scene instantiation(s). Triggers a [godot.Node.NOTIFICATION_SCENE_INSTANTIATED] notification on the root node.
   */
  public fun instantiate(editState: PackedScene.GenEditState =
      PackedScene.GenEditState.GEN_EDIT_STATE_DISABLED): Node? {
    TransferContext.writeArguments(LONG to editState.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_INSTANTIATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns `true` if the scene file has nodes.
   */
  public fun canInstantiate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_CAN_INSTANTIATE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the `SceneState` representing the scene file contents.
   */
  public fun getState(): SceneState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_GET_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneState?
  }

  public enum class GenEditState(
    id: Long
  ) {
    /**
     * If passed to [instantiate], blocks edits to the scene state.
     */
    GEN_EDIT_STATE_DISABLED(0),
    /**
     * If passed to [instantiate], provides local scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_INSTANCE(1),
    /**
     * If passed to [instantiate], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN(2),
    /**
     * It's similar to [GEN_EDIT_STATE_MAIN], but for the case where the scene is being instantiated to be the base of another one.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN_INHERITED(3),
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
