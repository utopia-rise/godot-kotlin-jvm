// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A node used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * **Note:** When linked with an [godot.AnimationPlayer], several properties and methods of the corresponding [godot.AnimationPlayer] will not function as expected. Playback and transitions should be handled using only the [godot.AnimationTree] and its constituent [godot.AnimationNode](s). The [godot.AnimationPlayer] node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : Node() {
  /**
   * Emitted when the [animPlayer] is changed.
   */
  public val animationPlayerChanged: Signal0 by signal()

  /**
   * Notifies when an animation starts playing.
   *
   * **Note:** This signal is not emitted if an animation is looping or playbacked from the middle. Also be aware of the possibility of unseen playback by sync and xfade.
   */
  public val animationStarted: Signal1<StringName> by signal("animName")

  /**
   * Notifies when an animation finished playing.
   *
   * **Note:** This signal is not emitted if an animation is looping or aborted. Also be aware of the possibility of unseen playback by sync and xfade.
   */
  public val animationFinished: Signal1<StringName> by signal("animName")

  /**
   * The root animation node of this [godot.AnimationTree]. See [godot.AnimationNode].
   */
  public var treeRoot: AnimationNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_TREE_ROOT,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AnimationNode?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_TREE_ROOT, NIL)
    }

  /**
   * The path to the [godot.AnimationPlayer] used for animating.
   */
  public var animPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ANIMATION_PLAYER, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ANIMATION_PLAYER, NIL)
    }

  /**
   * The path to the [godot.Node] used to evaluate the AnimationNode [godot.Expression] if one is not explicitly specified internally.
   */
  public var advanceExpressionBaseNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ADVANCE_EXPRESSION_BASE_NODE, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ADVANCE_EXPRESSION_BASE_NODE, NIL)
    }

  /**
   * If `true`, the [godot.AnimationTree] will be processing.
   */
  public var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_IS_ACTIVE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ACTIVE, NIL)
    }

  /**
   * The process mode of this [godot.AnimationTree]. See [enum AnimationProcessCallback] for available modes.
   */
  public var processCallback: AnimationProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_PROCESS_CALLBACK, LONG)
      return AnimationTree.AnimationProcessCallback.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_PROCESS_CALLBACK, NIL)
    }

  /**
   * The number of possible simultaneous sounds for each of the assigned AudioStreamPlayers.
   *
   * For example, if this value is `32` and the animation has two audio tracks, the two [godot.AudioStreamPlayer]s assigned can play simultaneously up to `32` voices each.
   */
  public var audioMaxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_AUDIO_MAX_POLYPHONY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_AUDIO_MAX_POLYPHONY, NIL)
    }

  /**
   * The path to the Animation track used for root motion. Paths must be valid scene-tree paths to a node, and must be specified starting from the parent node of the node that will reproduce the animation. To specify a track that controls properties or bones, append its name after the path, separated by `":"`. For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   *
   * If the track has type [godot.Animation.TYPE_POSITION_3D], [godot.Animation.TYPE_ROTATION_3D] or [godot.Animation.TYPE_SCALE_3D] the transformation will be canceled visually, and the animation will appear to stay in place. See also [getRootMotionPosition], [getRootMotionRotation], [getRootMotionScale] and [godot.RootMotionView].
   */
  public var rootMotionTrack: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_TRACK, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ROOT_MOTION_TRACK, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONTREE, scriptIndex)
    return true
  }

  /**
   * A virtual function for processing after key getting during playback.
   */
  public open fun _postProcessKeyValue(
    animation: Animation,
    track: Int,
    `value`: Any,
    _object: Object,
    objectIdx: Int,
  ): Any? {
    throw NotImplementedError("_post_process_key_value is not implemented for AnimationTree")
  }

  /**
   * Retrieve the motion delta of position with the [rootMotionTrack] as a [godot.core.Vector3] that can be used elsewhere.
   *
   * If [rootMotionTrack] is not a path to a track of type [godot.Animation.TYPE_POSITION_3D], returns `Vector3(0, 0, 0)`.
   *
   * See also [rootMotionTrack] and [godot.RootMotionView].
   *
   * The most basic example is applying position to [godot.CharacterBody3D]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var current_rotation: Quaternion
   *
   *
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         current_rotation = get_quaternion()
   *
   *         state_machine.travel("Animate")
   *
   *     var velocity: Vector3 = current_rotation * animation_tree.get_root_motion_position() / delta
   *
   *     set_velocity(velocity)
   *
   *     move_and_slide()
   *
   * [/gdscript]
   *
   * [/codeblocks]
   *
   * By using this in combination with [getRootMotionPositionAccumulator], you can apply the root motion position more correctly to account for the rotation of the node.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         state_machine.travel("Animate")
   *
   *     set_quaternion(get_quaternion() * animation_tree.get_root_motion_rotation())
   *
   *     var velocity: Vector3 = (animation_tree.get_root_motion_rotation_accumulator().inverse() * get_quaternion()) * animation_tree.get_root_motion_position() / delta
   *
   *     set_velocity(velocity)
   *
   *     move_and_slide()
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public fun getRootMotionPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_POSITION, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Retrieve the motion delta of rotation with the [rootMotionTrack] as a [godot.Quaternion] that can be used elsewhere.
   *
   * If [rootMotionTrack] is not a path to a track of type [godot.Animation.TYPE_ROTATION_3D], returns `Quaternion(0, 0, 0, 1)`.
   *
   * See also [rootMotionTrack] and [godot.RootMotionView].
   *
   * The most basic example is applying rotation to [godot.CharacterBody3D]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         state_machine.travel("Animate")
   *
   *     set_quaternion(get_quaternion() * animation_tree.get_root_motion_rotation())
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public fun getRootMotionRotation(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_ROTATION, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   * Retrieve the motion delta of scale with the [rootMotionTrack] as a [godot.core.Vector3] that can be used elsewhere.
   *
   * If [rootMotionTrack] is not a path to a track of type [godot.Animation.TYPE_SCALE_3D], returns `Vector3(0, 0, 0)`.
   *
   * See also [rootMotionTrack] and [godot.RootMotionView].
   *
   * The most basic example is applying scale to [godot.CharacterBody3D]:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var current_scale: Vector3 = Vector3(1, 1, 1)
   *
   * var scale_accum: Vector3 = Vector3(1, 1, 1)
   *
   *
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         current_scale = get_scale()
   *
   *         scale_accum = Vector3(1, 1, 1)
   *
   *         state_machine.travel("Animate")
   *
   *     scale_accum += animation_tree.get_root_motion_scale()
   *
   *     set_scale(current_scale * scale_accum)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public fun getRootMotionScale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_SCALE,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Retrieve the blended value of the position tracks with the [rootMotionTrack] as a [godot.core.Vector3] that can be used elsewhere.
   *
   * This is useful in cases where you want to respect the initial key values of the animation.
   *
   * For example, if an animation with only one key `Vector3(0, 0, 0)` is played in the previous frame and then an animation with only one key `Vector3(1, 0, 1)` is played in the next frame, the difference can be calculated as follows:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var prev_root_motion_position_accumulator: Vector3
   *
   *
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         state_machine.travel("Animate")
   *
   *     var current_root_motion_position_accumulator: Vector3 = animation_tree.get_root_motion_position_accumulator()
   *
   *     var difference: Vector3 = current_root_motion_position_accumulator - prev_root_motion_position_accumulator
   *
   *     prev_root_motion_position_accumulator = current_root_motion_position_accumulator
   *
   *     transform.origin += difference
   *
   * [/gdscript]
   *
   * [/codeblocks]
   *
   * However, if the animation loops, an unintended discrete change may occur, so this is only useful for some simple use cases.
   */
  public fun getRootMotionPositionAccumulator(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_POSITION_ACCUMULATOR, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Retrieve the blended value of the rotation tracks with the [rootMotionTrack] as a [godot.Quaternion] that can be used elsewhere.
   *
   * This is necessary to apply the root motion position correctly, taking rotation into account. See also [getRootMotionPosition].
   *
   * Also, this is useful in cases where you want to respect the initial key values of the animation.
   *
   * For example, if an animation with only one key `Quaternion(0, 0, 0, 1)` is played in the previous frame and then an animation with only one key `Quaternion(0, 0.707, 0, 0.707)` is played in the next frame, the difference can be calculated as follows:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var prev_root_motion_rotation_accumulator: Quaternion
   *
   *
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         state_machine.travel("Animate")
   *
   *     var current_root_motion_rotation_accumulator: Quaternion = animation_tree.get_root_motion_Quaternion_accumulator()
   *
   *     var difference: Quaternion = prev_root_motion_rotation_accumulator.inverse() * current_root_motion_rotation_accumulator
   *
   *     prev_root_motion_rotation_accumulator = current_root_motion_rotation_accumulator
   *
   *     transform.basis *= difference
   *
   * [/gdscript]
   *
   * [/codeblocks]
   *
   * However, if the animation loops, an unintended discrete change may occur, so this is only useful for some simple use cases.
   */
  public fun getRootMotionRotationAccumulator(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_ROTATION_ACCUMULATOR, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   * Retrieve the blended value of the scale tracks with the [rootMotionTrack] as a [godot.core.Vector3] that can be used elsewhere.
   *
   * For example, if an animation with only one key `Vector3(1, 1, 1)` is played in the previous frame and then an animation with only one key `Vector3(2, 2, 2)` is played in the next frame, the difference can be calculated as follows:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var prev_root_motion_scale_accumulator: Vector3
   *
   *
   *
   * func _process(delta):
   *
   *     if Input.is_action_just_pressed("animate"):
   *
   *         state_machine.travel("Animate")
   *
   *     var current_root_motion_scale_accumulator: Vector3 = animation_tree.get_root_motion_scale_accumulator()
   *
   *     var difference: Vector3 = current_root_motion_scale_accumulator - prev_root_motion_scale_accumulator
   *
   *     prev_root_motion_scale_accumulator = current_root_motion_scale_accumulator
   *
   *     transform.basis = transform.basis.scaled(difference)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   *
   * However, if the animation loops, an unintended discrete change may occur, so this is only useful for some simple use cases.
   */
  public fun getRootMotionScaleAccumulator(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ROOT_MOTION_SCALE_ACCUMULATOR, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Manually advance the animations by the specified time (in seconds).
   */
  public fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_ADVANCE, NIL)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    /**
     * The animations will progress during physics frames (see [godot.Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * The animations will progress during process frames (see [godot.Node.NOTIFICATION_INTERNAL_PROCESS]).
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
