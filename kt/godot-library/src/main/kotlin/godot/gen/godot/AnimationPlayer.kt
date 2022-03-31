// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Container and player of [godot.Animation] resources.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * An animation player is used for general-purpose playback of [godot.Animation] resources. It contains a dictionary of animations (referenced by name) and custom blend times between their transitions. Additionally, animations can be played and blended in different channels.
 *
 * [godot.AnimationPlayer] is more suited than [godot.Tween] for animations where you know the final values in advance. For example, fading a screen in and out is more easily done with an [godot.AnimationPlayer] node thanks to the animation tools provided by the editor. That particular example can also be implemented with a [godot.Tween] node, but it requires doing everything by code.
 *
 * Updating the target properties of animations occurs at process time.
 */
@GodotBaseType
public open class AnimationPlayer : Node() {
  /**
   * Notifies when the caches have been cleared, either automatically, or manually via [clearCaches].
   */
  public val cachesCleared: Signal0 by signal()

  /**
   * Notifies when an animation starts playing.
   */
  public val animationStarted: Signal1<StringName> by signal("animName")

  /**
   * Emitted when a queued animation plays after the previous animation was finished. See [queue].
   *
   * **Note:** The signal is not emitted when the animation is changed via [play] or from [godot.AnimationTree].
   */
  public val animationChanged: Signal2<StringName, StringName> by signal("oldName", "newName")

  /**
   * Notifies when an animation finished playing.
   */
  public val animationFinished: Signal1<StringName> by signal("animName")

  /**
   * The node from which node path references will travel.
   */
  public open var rootNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ROOT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ROOT, NIL)
    }

  /**
   * The name of the currently playing animation. If no animation is playing, the property's value is an empty string. Changing this value does not restart the animation. See [play] for more information on playing animations.
   *
   * **Note:** while this property appears in the inspector, it's not meant to be edited, and it's not saved in the scene. This property is mainly used to get the currently playing animation, and internally for animation playback tracks. For more information, see [godot.Animation].
   */
  public open var currentAnimation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_CURRENT_ANIMATION, NIL)
    }

  /**
   * If playing, the current animation; otherwise, the animation last played. When set, would change the animation, but would not play it unless currently playing. See also [currentAnimation].
   */
  public open var assignedAnimation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ASSIGNED_ANIMATION, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ASSIGNED_ANIMATION, NIL)
    }

  /**
   * The name of the animation to play when the scene loads.
   */
  public open var autoplay: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_AUTOPLAY,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_AUTOPLAY, NIL)
    }

  /**
   * This is used by the editor. If set to `true`, the scene will be saved with the effects of the reset animation applied (as if it had been seeked to time 0), then reverted after saving.
   *
   * In other words, the saved scene file will contain the "default pose", as defined by the reset animation, if any, with the editor keeping the values that the nodes had before saving.
   */
  public open var resetOnSave: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_RESET_ON_SAVE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_RESET_ON_SAVE_ENABLED, NIL)
    }

  /**
   * The length (in seconds) of the currently being played animation.
   */
  public open val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The position (in seconds) of the currently playing animation.
   */
  public open val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The process notification in which to update animations.
   */
  public open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PROCESS_CALLBACK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PROCESS_CALLBACK, NIL)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  public open var playbackDefaultBlendTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_DEFAULT_BLEND_TIME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_DEFAULT_BLEND_TIME, NIL)
    }

  /**
   * If `true`, updates animations in response to process-related notifications.
   */
  public open var playbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ACTIVE, NIL)
    }

  /**
   * The speed scaling ratio. For instance, if this value is 1, then the animation plays at normal speed. If it's 0.5, then it plays at half speed. If it's 2, then it plays at double speed.
   */
  public open var playbackSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_SPEED_SCALE,
          NIL)
    }

  /**
   * The call mode to use for Call Method tracks.
   */
  public open var methodCallMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_METHOD_CALL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_METHOD_CALL_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONPLAYER)
  }

  /**
   * Adds `animation` to the player accessible with the key `name`.
   */
  public open fun addAnimation(name: StringName, animation: Animation): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ADD_ANIMATION, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the animation with key `name`.
   */
  public open fun removeAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_REMOVE_ANIMATION,
        NIL)
  }

  /**
   * Renames an existing animation with key `name` to `newname`.
   */
  public open fun renameAnimation(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_RENAME_ANIMATION,
        NIL)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.Animation] with key `name`.
   */
  public open fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Animation] with key `name` or `null` if not found.
   */
  public open fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  /**
   * Returns the list of stored animation names.
   */
  public open fun getAnimationList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Triggers the `anim_to` animation when the `anim_from` animation completes.
   */
  public open fun animationSetNext(animFrom: StringName, animTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_SET_NEXT,
        NIL)
  }

  /**
   * Returns the name of the next animation in the queue.
   */
  public open fun animationGetNext(animFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_GET_NEXT,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their names.
   */
  public open fun setBlendTime(
    animFrom: StringName,
    animTo: StringName,
    sec: Double
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_BLEND_TIME, NIL)
  }

  /**
   * Gets the blend time (in seconds) between two animations, referenced by their names.
   */
  public open fun getBlendTime(animFrom: StringName, animTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_BLEND_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Plays the animation with key `name`. Custom blend times and speed can be set. If `custom_speed` is negative and `from_end` is `true`, the animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * The [godot.AnimationPlayer] keeps track of its current or last played animation with [assignedAnimation]. If this method is called with that same animation `name`, or with no `name` parameter, the assigned animation will resume playing if it was paused, or restart if it was stopped (see [stop] for both pause and stop). If the animation was already playing, it will keep playing.
   *
   * **Note:** The animation will be updated the next time the [godot.AnimationPlayer] is processed. If other variables are updated at the same time this is called, they may be updated too early. To perform the update immediately, call `advance(0)`.
   */
  public open fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Double = 1.0,
    fromEnd: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to
        customSpeed, BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY, NIL)
  }

  /**
   * Plays the animation with key `name` in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see its description for more information.
   */
  public open fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0):
      Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY_BACKWARDS, NIL)
  }

  /**
   * Stops or pauses the currently playing animation. If `reset` is `true`, the animation position is reset to `0` and the playback speed is reset to `1.0`.
   *
   * If `reset` is `false`, the [currentAnimationPosition] will be kept and calling [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation] will resume the animation.
   */
  public open fun stop(reset: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to reset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_STOP, NIL)
  }

  /**
   * Returns `true` if playing an animation.
   */
  public open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Queues an animation for playback once the current one is done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play unless the looped animation is stopped somehow.
   */
  public open fun queue(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_QUEUE, NIL)
  }

  /**
   * Returns a list of the animation names that are currently queued to play.
   */
  public open fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_QUEUE,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Clears all queued, unplayed animations.
   */
  public open fun clearQueue(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_QUEUE, NIL)
  }

  /**
   * Gets the actual playing speed of current animation or 0 if not playing. This speed is the [playbackSpeed] property multiplied by `custom_speed` argument specified when calling the [play] method.
   */
  public open fun getPlayingSpeed(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYING_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the name of `animation` or an empty string if not found.
   */
  public open fun findAnimation(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_FIND_ANIMATION,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * [godot.AnimationPlayer] caches animated nodes. It may not notice if a node disappears; [clearCaches] forces it to update the cache again.
   */
  public open fun clearCaches(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_CACHES, NIL)
  }

  /**
   * Seeks the animation to the `seconds` point in time (in seconds). If `update` is `true`, the animation updates too, otherwise it updates at process time. Events between the current frame and `seconds` are skipped.
   */
  public open fun seek(seconds: Double, update: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SEEK, NIL)
  }

  /**
   * Shifts position in the animation timeline and immediately updates the animation. `delta` is the time in seconds to shift. Events between the current frame and `delta` are handled.
   */
  public open fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ADVANCE, NIL)
  }

  public enum class AnimationProcessCallback(
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

  public enum class AnimationMethodCallMode(
    id: Long
  ) {
    /**
     * Batch method calls during the animation process, then do the calls after events are processed. This avoids bugs involving deleting nodes or modifying the AnimationPlayer while playing.
     */
    ANIMATION_METHOD_CALL_DEFERRED(0),
    /**
     * Make method calls immediately when reached in the animation.
     */
    ANIMATION_METHOD_CALL_IMMEDIATE(1),
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
