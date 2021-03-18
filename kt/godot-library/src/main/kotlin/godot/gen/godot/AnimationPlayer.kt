// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Container and player of [godot.Animation] resources.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/index.html](https://docs.godotengine.org/en/latest/tutorials/animation/index.html)
 *
 * An animation player is used for general-purpose playback of [godot.Animation] resources. It contains a dictionary of animations (referenced by name) and custom blend times between their transitions. Additionally, animations can be played and blended in different channels.
 *
 * [godot.AnimationPlayer] is more suited than [godot.Tween] for animations where you know the final values in advance. For example, fading a screen in and out is more easily done with an [godot.AnimationPlayer] node thanks to the animation tools provided by the editor. That particular example can also be implemented with a [godot.Tween] node, but it requires doing everything by code.
 *
 * Updating the target properties of animations occurs at process time.
 */
@GodotBaseType
open class AnimationPlayer : Node() {
  /**
   * If the currently being played animation changes, this signal will notify of such change.
   */
  val animationChanged: Signal2<String, String> by signal("old_name", "new_name")

  /**
   * Notifies when an animation finished playing.
   */
  val animationFinished: Signal1<String> by signal("anim_name")

  /**
   * Notifies when an animation starts playing.
   */
  val animationStarted: Signal1<String> by signal("anim_name")

  /**
   * Notifies when the caches have been cleared, either automatically, or manually via [clearCaches].
   */
  val cachesCleared: Signal0 by signal()

  /**
   * If playing, the current animation; otherwise, the animation last played. When set, would change the animation, but would not play it unless currently playing. See also [currentAnimation].
   */
  open var assignedAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ASSIGNED_ANIMATION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ASSIGNED_ANIMATION, NIL)
    }

  /**
   * The name of the animation to play when the scene loads.
   */
  open var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_AUTOPLAY,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_AUTOPLAY, NIL)
    }

  /**
   * The name of the currently playing animation. If no animation is playing, the property's value is an empty string. Changing this value does not restart the animation. See [play] for more information on playing animations.
   *
   * **Note**: while this property appears in the inspector, it's not meant to be edited and it's not saved in the scene. This property is mainly used to get the currently playing animation, and internally for animation playback tracks. For more information, see [godot.Animation].
   */
  open var currentAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_CURRENT_ANIMATION, NIL)
    }

  /**
   * The length (in seconds) of the currently being played animation.
   */
  open val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The position (in seconds) of the currently playing animation.
   */
  open val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The call mode to use for Call Method tracks.
   */
  open var methodCallMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_METHOD_CALL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_METHOD_CALL_MODE, NIL)
    }

  /**
   * If `true`, updates animations in response to process-related notifications.
   */
  open var playbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYBACK_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PLAYBACK_ACTIVE, NIL)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  open var playbackDefaultBlendTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYBACK_DEFAULT_BLEND_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PLAYBACK_DEFAULT_BLEND_TIME, NIL)
    }

  /**
   * The process notification in which to update animations.
   */
  open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYBACK_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PLAYBACK_PROCESS_MODE, NIL)
    }

  /**
   * The speed scaling ratio. For instance, if this value is 1, then the animation plays at normal speed. If it's 0.5, then it plays at half speed. If it's 2, then it plays at double speed.
   */
  open var playbackSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYBACK_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PLAYBACK_SPEED, NIL)
    }

  /**
   * The node from which node path references will travel.
   */
  open var rootNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ROOT_NODE,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ROOT_NODE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONPLAYER)

  open fun _animationChanged() {
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  /**
   * Adds `animation` to the player accessible with the key `name`.
   */
  open fun addAnimation(name: String, animation: Animation): GodotError {
    TransferContext.writeArguments(STRING to name, OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ADD_ANIMATION, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Shifts position in the animation timeline and immediately updates the animation. `delta` is the time in seconds to shift. Events between the current frame and `delta` are handled.
   */
  open fun advance(delta: Double) {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ADVANCE, NIL)
  }

  /**
   * Returns the name of the next animation in the queue.
   */
  open fun animationGetNext(animFrom: String): String {
    TransferContext.writeArguments(STRING to animFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_GET_NEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Triggers the `anim_to` animation when the `anim_from` animation completes.
   */
  open fun animationSetNext(animFrom: String, animTo: String) {
    TransferContext.writeArguments(STRING to animFrom, STRING to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_SET_NEXT,
        NIL)
  }

  /**
   * [godot.AnimationPlayer] caches animated nodes. It may not notice if a node disappears; [clearCaches] forces it to update the cache again.
   */
  open fun clearCaches() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_CACHES, NIL)
  }

  /**
   * Clears all queued, unplayed animations.
   */
  open fun clearQueue() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_QUEUE, NIL)
  }

  /**
   * Returns the name of `animation` or an empty string if not found.
   */
  open fun findAnimation(animation: Animation): String {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_FIND_ANIMATION,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the [godot.Animation] with key `name` or `null` if not found.
   */
  open fun getAnimation(name: String): Animation? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  /**
   * Returns the list of stored animation names.
   */
  open fun getAnimationList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Gets the blend time (in seconds) between two animations, referenced by their names.
   */
  open fun getBlendTime(animFrom: String, animTo: String): Double {
    TransferContext.writeArguments(STRING to animFrom, STRING to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_BLEND_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Gets the actual playing speed of current animation or 0 if not playing. This speed is the [playbackSpeed] property multiplied by `custom_speed` argument specified when calling the [play] method.
   */
  open fun getPlayingSpeed(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYING_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a list of the animation names that are currently queued to play.
   */
  open fun getQueue(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_QUEUE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.Animation] with key `name`.
   */
  open fun hasAnimation(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if playing an animation.
   */
  open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Plays the animation with key `name`. Custom blend times and speed can be set. If `custom_speed` is negative and `from_end` is `true`, the animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * The [godot.AnimationPlayer] keeps track of its current or last played animation with [assignedAnimation]. If this method is called with that same animation `name`, or with no `name` parameter, the assigned animation will resume playing if it was paused, or restart if it was stopped (see [stop] for both pause and stop). If the animation was already playing, it will keep playing.
   *
   * **Note:** The animation will be updated the next time the [godot.AnimationPlayer] is processed. If other variables are updated at the same time this is called, they may be updated too early. To perform the update immediately, call `advance(0)`.
   */
  open fun play(
    name: String = "",
    customBlend: Double = -1.0,
    customSpeed: Double = 1.0,
    fromEnd: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to name, DOUBLE to customBlend, DOUBLE to customSpeed,
        BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY, NIL)
  }

  /**
   * Plays the animation with key `name` in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see its description for more information.
   */
  open fun playBackwards(name: String = "", customBlend: Double = -1.0) {
    TransferContext.writeArguments(STRING to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY_BACKWARDS, NIL)
  }

  /**
   * Queues an animation for playback once the current one is done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play unless the looped animation is stopped somehow.
   */
  open fun queue(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_QUEUE, NIL)
  }

  /**
   * Removes the animation with key `name`.
   */
  open fun removeAnimation(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_REMOVE_ANIMATION,
        NIL)
  }

  /**
   * Renames an existing animation with key `name` to `newname`.
   */
  open fun renameAnimation(name: String, newname: String) {
    TransferContext.writeArguments(STRING to name, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_RENAME_ANIMATION,
        NIL)
  }

  /**
   * Seeks the animation to the `seconds` point in time (in seconds). If `update` is `true`, the animation updates too, otherwise it updates at process time. Events between the current frame and `seconds` are skipped.
   */
  open fun seek(seconds: Double, update: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SEEK, NIL)
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their names.
   */
  open fun setBlendTime(
    animFrom: String,
    animTo: String,
    sec: Double
  ) {
    TransferContext.writeArguments(STRING to animFrom, STRING to animTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_BLEND_TIME, NIL)
  }

  /**
   * Stops or pauses the currently playing animation. If `reset` is `true`, the animation position is reset to `0` and the playback speed is reset to `1.0`.
   *
   * If `reset` is `false`, the [currentAnimationPosition] will be kept and calling [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation] will resume the animation.
   */
  open fun stop(reset: Boolean = true) {
    TransferContext.writeArguments(BOOL to reset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_STOP, NIL)
  }

  enum class AnimationProcessMode(
    id: Long
  ) {
    /**
     * Process animation during the physics process. This is especially useful when animating physics bodies.
     */
    ANIMATION_PROCESS_PHYSICS(0),

    /**
     * Process animation during the idle process.
     */
    ANIMATION_PROCESS_IDLE(1),

    /**
     * Do not process animation. Use [advance] to process the animation manually.
     */
    ANIMATION_PROCESS_MANUAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AnimationMethodCallMode(
    id: Long
  ) {
    /**
     * Batch method calls during the animation process, then do the calls after events are processed. This avoids bugs involving deleting nodes or modifying the AnimationPlayer while playing.
     */
    ANIMATION_METHOD_CALL_DEFERRED(0),

    /**
     * Make method calls immediately when reached in the animation.
     */
    ANIMATION_METHOD_CALL_IMMEDIATE(1);

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
     * Batch method calls during the animation process, then do the calls after events are processed. This avoids bugs involving deleting nodes or modifying the AnimationPlayer while playing.
     */
    final const val ANIMATION_METHOD_CALL_DEFERRED: Long = 0

    /**
     * Make method calls immediately when reached in the animation.
     */
    final const val ANIMATION_METHOD_CALL_IMMEDIATE: Long = 1

    /**
     * Process animation during the idle process.
     */
    final const val ANIMATION_PROCESS_IDLE: Long = 1

    /**
     * Do not process animation. Use [advance] to process the animation manually.
     */
    final const val ANIMATION_PROCESS_MANUAL: Long = 2

    /**
     * Process animation during the physics process. This is especially useful when animating physics bodies.
     */
    final const val ANIMATION_PROCESS_PHYSICS: Long = 0
  }
}
