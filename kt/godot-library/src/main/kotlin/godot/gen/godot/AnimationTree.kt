// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A node to be used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A node to be used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * **Note:** When linked with an [godot.AnimationPlayer], several properties and methods of the corresponding [godot.AnimationPlayer] will not function as expected. Playback and transitions should be handled using only the [godot.AnimationTree] and its constituent [godot.AnimationNode](s). The [godot.AnimationPlayer] node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : Node() {
  /**
   * The root animation node of this [godot.AnimationTree]. See [godot.AnimationNode].
   */
  public open var treeRoot: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_TREE_ROOT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_TREE_ROOT, NIL)
    }

  /**
   * The path to the [godot.AnimationPlayer] used for animating.
   */
  public open var animPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ANIM_PLAYER,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ANIM_PLAYER,
          NIL)
    }

  /**
   * If `true`, the [godot.AnimationTree] will be processing.
   */
  public open var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ACTIVE, NIL)
    }

  /**
   * The process mode of this [godot.AnimationTree]. See [enum AnimationProcessCallback] for available modes.
   */
  public open var processCallback: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_PROCESS_CALLBACK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_PROCESS_CALLBACK, NIL)
    }

  /**
   * The path to the Animation track used for root motion. Paths must be valid scene-tree paths to a node, and must be specified starting from the parent node of the node that will reproduce the animation. To specify a track that controls properties or bones, append its name after the path, separated by `":"`. For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   *
   * If the track has type [godot.Animation.TYPE_POSITION_3D], [godot.Animation.TYPE_ROTATION_3D] or [godot.Animation.TYPE_SCALE_3D] the transformation will be cancelled visually, and the animation will appear to stay in place. See also [getRootMotionTransform] and [godot.RootMotionView].
   */
  public open var rootMotionTrack: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_TRACK, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ROOT_MOTION_TRACK, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONTREE)
  }

  /**
   * Retrieve the motion of the [rootMotionTrack] as a [godot.Transform3D] that can be used elsewhere. If [rootMotionTrack] is not a path to a track of type [godot.Animation.TYPE_POSITION_3D], [godot.Animation.TYPE_SCALE_3D] or [godot.Animation.TYPE_ROTATION_3D], returns an identity transformation. See also [rootMotionTrack] and [godot.RootMotionView].
   */
  public open fun getRootMotionTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_TRANSFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   *
   */
  public open fun renameParameter(oldName: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_RENAME_PARAMETER, NIL)
  }

  /**
   * Manually advance the animations by the specified time (in seconds).
   */
  public open fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_ADVANCE, NIL)
  }

  public enum class AnimationProcessCallback(
    id: Long
  ) {
    /**
     * The animations will progress during the physics frame (i.e. [godot.Node.PhysicsProcess]).
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * The animations will progress during the idle frame (i.e. [godot.Node.Process]).
     */
    ANIMATION_PROCESS_IDLE(1),
    /**
     * The animations will only progress manually (see [advance]).
     */
    ANIMATION_PROCESS_MANUAL(2),
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
