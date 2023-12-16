// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.Quaternion
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for [godot.AnimationPlayer] and [godot.AnimationTree].
 *
 * Base class for [godot.AnimationPlayer] and [godot.AnimationTree] to manage animation lists. It also has general properties and methods for playback and blending.
 *
 * After instantiating the playback information data within the extended class, the blending is processed by the [godot.AnimationMixer].
 */
@GodotBaseType
public open class AnimationMixer internal constructor() : Node() {
  /**
   * Editor only. Notifies when the property have been updated to update dummy [godot.AnimationPlayer] in animation player editor.
   */
  public val mixerUpdated: Signal0 by signal()

  /**
   * Notifies when an animation list is changed.
   */
  public val animationListChanged: Signal0 by signal()

  /**
   * Notifies when the animation libraries have changed.
   */
  public val animationLibrariesUpdated: Signal0 by signal()

  /**
   * Notifies when an animation finished playing.
   *
   * **Note:** This signal is not emitted if an animation is looping.
   */
  public val animationFinished: Signal1<StringName> by signal("animName")

  /**
   * Notifies when an animation starts playing.
   */
  public val animationStarted: Signal1<StringName> by signal("animName")

  /**
   * Notifies when the caches have been cleared, either automatically, or manually via [clearCaches].
   */
  public val cachesCleared: Signal0 by signal()

  /**
   * If `true`, the [godot.AnimationMixer] will be processing.
   */
  public var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
    }

  /**
   * If `true`, the blending uses the deterministic algorithm. The total weight is not normalized and the result is accumulated with an initial value (`0` or a `"RESET"` animation if present).
   *
   * This means that if the total amount of blending is `0.0`, the result is equal to the `"RESET"` animation.
   *
   * If the number of tracks between the blended animations is different, the animation with the missing track is treated as if it had the initial value.
   *
   * If `false`, The blend does not use the deterministic algorithm. The total weight is normalized and always `1.0`. If the number of tracks between the blended animations is different, nothing is done about the animation that is missing a track.
   *
   * **Note:** In [godot.AnimationTree], the blending with [godot.AnimationNodeAdd2], [godot.AnimationNodeAdd3], [godot.AnimationNodeSub2] or the weight greater than `1.0` may produce unexpected results.
   *
   * For example, if [godot.AnimationNodeAdd2] blends two nodes with the amount `1.0`, then total weight is `2.0` but it will be normalized to make the total amount `1.0` and the result will be equal to [godot.AnimationNodeBlend2] with the amount `0.5`.
   */
  public var deterministic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeterministicPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeterministicPtr, NIL)
    }

  /**
   * This is used by the editor. If set to `true`, the scene will be saved with the effects of the reset animation (the animation with the key `"RESET"`) applied as if it had been seeked to time 0, with the editor keeping the values that the scene had before saving.
   *
   * This makes it more convenient to preview and edit animations in the editor, as changes to the scene will not be saved as long as they are set in the reset animation.
   */
  public var resetOnSave: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResetOnSaveEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResetOnSaveEnabledPtr, NIL)
    }

  /**
   * The node from which node path references will travel.
   */
  public var rootNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootNodePtr, NIL)
    }

  /**
   * The path to the Animation track used for root motion. Paths must be valid scene-tree paths to a node, and must be specified starting from the parent node of the node that will reproduce the animation. To specify a track that controls properties or bones, append its name after the path, separated by `":"`. For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   *
   * If the track has type [godot.Animation.TYPE_POSITION_3D], [godot.Animation.TYPE_ROTATION_3D] or [godot.Animation.TYPE_SCALE_3D] the transformation will be canceled visually, and the animation will appear to stay in place. See also [getRootMotionPosition], [getRootMotionRotation], [getRootMotionScale] and [godot.RootMotionView].
   */
  public var rootMotionTrack: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionTrackPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootMotionTrackPtr, NIL)
    }

  /**
   * The number of possible simultaneous sounds for each of the assigned AudioStreamPlayers.
   *
   * For example, if this value is `32` and the animation has two audio tracks, the two [godot.AudioStreamPlayer]s assigned can play simultaneously up to `32` voices each.
   */
  public var audioMaxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioMaxPolyphonyPtr, NIL)
    }

  /**
   * The process notification in which to update animations.
   */
  public var callbackModeProcess: AnimationCallbackModeProcess
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCallbackModeProcessPtr, LONG)
      return AnimationMixer.AnimationCallbackModeProcess.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCallbackModeProcessPtr, NIL)
    }

  /**
   * The call mode to use for Call Method tracks.
   */
  public var callbackModeMethod: AnimationCallbackModeMethod
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCallbackModeMethodPtr, LONG)
      return AnimationMixer.AnimationCallbackModeMethod.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCallbackModeMethodPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONMIXER, scriptIndex)
    return true
  }

  /**
   * A virtual function for processing after key getting during playback.
   */
  public open fun _postProcessKeyValue(
    animation: Animation,
    track: Int,
    `value`: Any?,
    _object: Object,
    objectIdx: Int,
  ): Any? {
    throw NotImplementedError("_post_process_key_value is not implemented for AnimationMixer")
  }

  /**
   * Adds [library] to the animation player, under the key [name].
   */
  public fun addAnimationLibrary(name: StringName, library: AnimationLibrary): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to library)
    TransferContext.callMethod(rawPtr, MethodBindings.addAnimationLibraryPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the [godot.AnimationLibrary] associated with the key [name].
   */
  public fun removeAnimationLibrary(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.removeAnimationLibraryPtr, NIL)
  }

  /**
   * Moves the [godot.AnimationLibrary] associated with the key [name] to the key [newname].
   */
  public fun renameAnimationLibrary(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, MethodBindings.renameAnimationLibraryPtr, NIL)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.AnimationLibrary] with key [name].
   */
  public fun hasAnimationLibrary(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationLibraryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the first [godot.AnimationLibrary] with key [name] or `null` if not found.
   *
   * To get the [godot.AnimationPlayer]'s global animation library, use `get_animation_library("")`.
   */
  public fun getAnimationLibrary(name: StringName): AnimationLibrary? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationLibrary?)
  }

  /**
   * Returns the list of stored library keys.
   */
  public fun getAnimationLibraryList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationLibraryListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.Animation] with key [name].
   */
  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasAnimationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.Animation] with the key [name]. If the animation does not exist, `null` is returned and an error is logged.
   */
  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Animation?)
  }

  /**
   * Returns the list of stored animation keys.
   */
  public fun getAnimationList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnimationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionPositionPtr, VECTOR3)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionRotationPtr, QUATERNION)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionScalePtr, VECTOR3)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionPositionAccumulatorPtr, VECTOR3)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionRotationAccumulatorPtr,
        QUATERNION)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getRootMotionScaleAccumulatorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * [godot.AnimationMixer] caches animated nodes. It may not notice if a node disappears; [clearCaches] forces it to update the cache again.
   */
  public fun clearCaches(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearCachesPtr, NIL)
  }

  /**
   * Manually advance the animations by the specified time (in seconds).
   */
  public fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.advancePtr, NIL)
  }

  /**
   * Returns the key of [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimation(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the key for the [godot.AnimationLibrary] that contains [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimationLibrary(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, MethodBindings.findAnimationLibraryPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public enum class AnimationCallbackModeProcess(
    id: Long,
  ) {
    /**
     * Process animation during physics frames (see [godot.Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]). This is especially useful when animating physics bodies.
     */
    ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS(0),
    /**
     * Process animation during process frames (see [godot.Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    ANIMATION_CALLBACK_MODE_PROCESS_IDLE(1),
    /**
     * Do not process animation. Use [advance] to process the animation manually.
     */
    ANIMATION_CALLBACK_MODE_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AnimationCallbackModeMethod(
    id: Long,
  ) {
    /**
     * Batch method calls during the animation process, then do the calls after events are processed. This avoids bugs involving deleting nodes or modifying the AnimationPlayer while playing.
     */
    ANIMATION_CALLBACK_MODE_METHOD_DEFERRED(0),
    /**
     * Make method calls immediately when reached in the animation.
     */
    ANIMATION_CALLBACK_MODE_METHOD_IMMEDIATE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _postProcessKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "_post_process_key_value")

    public val addAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "add_animation_library")

    public val removeAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "remove_animation_library")

    public val renameAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "rename_animation_library")

    public val hasAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "has_animation_library")

    public val getAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_animation_library")

    public val getAnimationLibraryListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_animation_library_list")

    public val hasAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "has_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_animation")

    public val getAnimationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_animation_list")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationMixer", "set_active")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationMixer", "is_active")

    public val setDeterministicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_deterministic")

    public val isDeterministicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "is_deterministic")

    public val setRootNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_root_node")

    public val getRootNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_node")

    public val setCallbackModeProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_callback_mode_process")

    public val getCallbackModeProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_callback_mode_process")

    public val setCallbackModeMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_callback_mode_method")

    public val getCallbackModeMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_callback_mode_method")

    public val setAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_audio_max_polyphony")

    public val getAudioMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_audio_max_polyphony")

    public val setRootMotionTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_root_motion_track")

    public val getRootMotionTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_track")

    public val getRootMotionPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_position")

    public val getRootMotionRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_rotation")

    public val getRootMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_scale")

    public val getRootMotionPositionAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_position_accumulator")

    public val getRootMotionRotationAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_rotation_accumulator")

    public val getRootMotionScaleAccumulatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "get_root_motion_scale_accumulator")

    public val clearCachesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "clear_caches")

    public val advancePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationMixer", "advance")

    public val setResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "set_reset_on_save_enabled")

    public val isResetOnSaveEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "is_reset_on_save_enabled")

    public val findAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "find_animation")

    public val findAnimationLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationMixer", "find_animation_library")
  }
}
