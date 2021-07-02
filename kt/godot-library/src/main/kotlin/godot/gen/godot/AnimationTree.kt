// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
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
 * Note: When linked with an [godot.AnimationPlayer], several properties and methods of the corresponding [godot.AnimationPlayer] will not function as expected. Playback and transitions should be handled using only the [godot.AnimationTree] and its constituent [godot.AnimationNode](s). The [godot.AnimationPlayer] node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : Node() {
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
   * The process mode of this [godot.AnimationTree]. See [enum AnimationProcessMode] for available modes.
   */
  public open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_PROCESS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_PROCESS_MODE,
          NIL)
    }

  /**
   * The path to the Animation track used for root motion. Paths must be valid scene-tree paths to a node, and must be specified starting from the parent node of the node that will reproduce the animation. To specify a track that controls properties or bones, append its name after the path, separated by `":"`. For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   *
   * If the track has type [godot.Animation.TYPE_TRANSFORM], the transformation will be cancelled visually, and the animation will appear to stay in place.
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

  /**
   * The root animation node of this [godot.AnimationTree]. See [godot.AnimationNode].
   */
  public open var treeRoot: AnimationNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_TREE_ROOT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationNode?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_TREE_ROOT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONTREE)
  }

  public open fun _clearCaches(): Unit {
  }

  public open fun _nodeRemoved(arg0: Node): Unit {
  }

  public open fun _treeChanged(): Unit {
  }

  public open fun _updateProperties(): Unit {
  }

  /**
   * Manually advance the animations by the specified time (in seconds).
   */
  public open fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_ADVANCE, NIL)
  }

  /**
   * Retrieve the motion of the [rootMotionTrack] as a [godot.core.Transform] that can be used elsewhere. If [rootMotionTrack] is not a path to a track of type [godot.Animation.TYPE_TRANSFORM], returns an identity transformation.
   */
  public open fun getRootMotionTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   *
   */
  public open fun renameParameter(oldName: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_RENAME_PARAMETER, NIL)
  }

  public enum class AnimationProcessMode(
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

  public companion object {
    /**
     * The animations will progress during the idle frame (i.e. [godot.Node.Process]).
     */
    public final const val ANIMATION_PROCESS_IDLE: Long = 1

    /**
     * The animations will only progress manually (see [advance]).
     */
    public final const val ANIMATION_PROCESS_MANUAL: Long = 2

    /**
     * The animations will progress during the physics frame (i.e. [godot.Node.PhysicsProcess]).
     */
    public final const val ANIMATION_PROCESS_PHYSICS: Long = 0
  }
}
