// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * An abstraction of a serialized scene.
 * 
 * A simplified interface to a scene file. Provides access to operations and checks that can be performed on the scene resource itself.
 *
 * Can be used to save a node to a file. When saving, the node as well as all the node it owns get saved (see `owner` property on [godot.Node]).
 *
 * **Note:** The node doesn't need to own itself.
 *
 * **Example of loading a saved scene:**
 *
 * ```
 * 		# Use `load()` instead of `preload()` if the path isn't known at compile-time.
 * 		var scene = preload("res://scene.tscn").instance()
 * 		# Add the node as a child of the node the script is attached to.
 * 		add_child(scene)
 * 		```
 *
 * **Example of saving a node with different owners:** The following example creates 3 objects: `Node2D` (`node`), `RigidBody2D` (`rigid`) and `CollisionObject2D` (`collision`). `collision` is a child of `rigid` which is a child of `node`. Only `rigid` is owned by `node` and `pack` will therefore only save those two nodes, but not `collision`.
 *
 * ```
 * 		# Create the objects.
 * 		var node = Node2D.new()
 * 		var rigid = RigidBody2D.new()
 * 		var collision = CollisionShape2D.new()
 *
 * 		# Create the object hierarchy.
 * 		rigid.add_child(collision)
 * 		node.add_child(rigid)
 *
 * 		# Change owner of `rigid`, but not of `collision`.
 * 		rigid.owner = node
 *
 * 		var scene = PackedScene.new()
 * 		# Only `node` and `rigid` are now packed.
 * 		var result = scene.pack(node)
 * 		if result == OK:
 * 		    var error = ResourceSaver.save("res://path/name.scn", scene)  # Or "user://..."
 * 		    if error != OK:
 * 		        push_error("An error occurred while saving the scene to disk.")
 * 		```
 */
@GodotBaseType
open class PackedScene : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_PACKEDSCENE)
  }

  open fun _getBundledScene(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_bundled_scene is not implemented for PackedScene")
  }

  open fun _setBundledScene(arg0: Dictionary<Any?, Any?>) {
  }

  /**
   * Returns `true` if the scene file has nodes.
   */
  open fun canInstance(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_CAN_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the `SceneState` representing the scene file contents.
   */
  open fun getState(): SceneState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_GET_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneState?
  }

  /**
   * Instantiates the scene's node hierarchy. Triggers child scene instantiation(s). Triggers a [godot.Node.NOTIFICATION_INSTANCED] notification on the root node.
   */
  open fun instance(editState: Long = 0): Node? {
    TransferContext.writeArguments(LONG to editState)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_INSTANCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Pack will ignore any sub-nodes not owned by given node. See [godot.Node.owner].
   */
  open fun pack(path: Node): GodotError {
    TransferContext.writeArguments(OBJECT to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_PACK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class GenEditState(
    id: Long
  ) {
    /**
     * If passed to [instance], blocks edits to the scene state.
     */
    GEN_EDIT_STATE_DISABLED(0),

    /**
     * If passed to [instance], provides local scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_INSTANCE(1),

    /**
     * If passed to [instance], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    GEN_EDIT_STATE_MAIN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * If passed to [instance], blocks edits to the scene state.
     */
    final const val GEN_EDIT_STATE_DISABLED: Long = 0

    /**
     * If passed to [instance], provides local scene resources to the local scene.
     *
     * **Note:** Only available in editor builds.
     */
    final const val GEN_EDIT_STATE_INSTANCE: Long = 1

    /**
     * If passed to [instance], provides local scene resources to the local scene. Only the main scene should receive the main edit state.
     *
     * **Note:** Only available in editor builds.
     */
    final const val GEN_EDIT_STATE_MAIN: Long = 2
  }
}
