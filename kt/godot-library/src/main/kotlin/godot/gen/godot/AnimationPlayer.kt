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
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Player of [godot.Animation] resources.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * An animation player is used for general-purpose playback of [godot.Animation] resources. It contains a dictionary of [godot.AnimationLibrary] resources and custom blend times between animation transitions.
 *
 * Some methods and properties use a single key to reference an animation directly. These keys are formatted as the key for the library, followed by a forward slash, then the key for the animation within the library, for example `"movement/run"`. If the library's key is an empty string (known as the default library), the forward slash is omitted, being the same key used by the library.
 *
 * [godot.AnimationPlayer] is more suited than [godot.Tween] for animations where you know the final values in advance. For example, fading a screen in and out is more easily done with an [godot.AnimationPlayer] node thanks to the animation tools provided by the editor. That particular example can also be implemented with a [godot.Tween], but it requires doing everything by code.
 *
 * Updating the target properties of animations occurs at process time.
 */
@GodotBaseType
public open class AnimationPlayer : Node() {
  /**
   * Notifies when an animation finished playing.
   *
   * **Note:** This signal is not emitted if an animation is looping.
   */
  public val animationFinished: Signal1<StringName> by signal("animName")

  /**
   * Emitted when a queued animation plays after the previous animation finished. See [queue].
   *
   * **Note:** The signal is not emitted when the animation is changed via [play] or by an [godot.AnimationTree].
   */
  public val animationChanged: Signal2<StringName, StringName> by signal("oldName", "newName")

  /**
   * Notifies when an animation starts playing.
   */
  public val animationStarted: Signal1<StringName> by signal("animName")

  /**
   * Notifies when an animation list is changed.
   */
  public val animationListChanged: Signal0 by signal()

  /**
   * Notifies when the animation libraries have changed.
   */
  public val animationLibrariesUpdated: Signal0 by signal()

  /**
   * Notifies when the caches have been cleared, either automatically, or manually via [clearCaches].
   */
  public val cachesCleared: Signal0 by signal()

  /**
   * The node from which node path references will travel.
   */
  public var rootNode: NodePath
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
   * The key of the currently playing animation. If no animation is playing, the property's value is an empty string. Changing this value does not restart the animation. See [play] for more information on playing animations.
   *
   * **Note:** While this property appears in the Inspector, it's not meant to be edited, and it's not saved in the scene. This property is mainly used to get the currently playing animation, and internally for animation playback tracks. For more information, see [godot.Animation].
   */
  public var currentAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_CURRENT_ANIMATION, NIL)
    }

  /**
   * If playing, the the current animation's key, otherwise, the animation last played. When set, this changes the animation, but will not play it unless already playing. See also [currentAnimation].
   */
  public var assignedAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ASSIGNED_ANIMATION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_ASSIGNED_ANIMATION, NIL)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_AUTOPLAY,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_AUTOPLAY, NIL)
    }

  /**
   * This is used by the editor. If set to `true`, the scene will be saved with the effects of the reset animation (the animation with the key `"RESET"`) applied as if it had been seeked to time 0, with the editor keeping the values that the scene had before saving.
   *
   * This makes it more convenient to preview and edit animations in the editor, as changes to the scene will not be saved as long as they are set in the reset animation.
   */
  public var resetOnSave: Boolean
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
   * The length (in seconds) of the currently playing animation.
   */
  public val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The position (in seconds) of the currently playing animation.
   */
  public val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_CURRENT_ANIMATION_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The process notification in which to update animations.
   */
  public var playbackProcessMode: AnimationProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PROCESS_CALLBACK, LONG)
      return AnimationPlayer.AnimationProcessCallback.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_PROCESS_CALLBACK, NIL)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  public var playbackDefaultBlendTime: Double
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
  public var playbackActive: Boolean
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
   * The speed scaling ratio. For example, if this value is 1, then the animation plays at normal speed. If it's 0.5, then it plays at half speed. If it's 2, then it plays at double speed.
   */
  public var playbackSpeed: Double
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
  public var methodCallMode: AnimationMethodCallMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_METHOD_CALL_MODE, LONG)
      return AnimationPlayer.AnimationMethodCallMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_METHOD_CALL_MODE, NIL)
    }

  /**
   * If `true` and the engine is running in Movie Maker mode (see [godot.MovieWriter]), exits the engine with [godot.SceneTree.quit] as soon as an animation is done playing in this [godot.AnimationPlayer]. A message is printed when the engine quits for this reason.
   *
   * **Note:** This obeys the same logic as the [animationFinished] signal, so it will not quit the engine if the animation is set to be looping.
   */
  public var movieQuitOnFinish: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_MOVIE_QUIT_ON_FINISH_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_MOVIE_QUIT_ON_FINISH_ENABLED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONPLAYER, scriptIndex)
    return true
  }

  /**
   * Adds [library] to the animation player, under the key [name].
   */
  public fun addAnimationLibrary(name: StringName, library: AnimationLibrary): GodotError {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to library)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ADD_ANIMATION_LIBRARY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the [godot.AnimationLibrary] associated with the key [name].
   */
  public fun removeAnimationLibrary(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_REMOVE_ANIMATION_LIBRARY, NIL)
  }

  /**
   * Moves the [godot.AnimationLibrary] associated with the key [name] to the key [newname].
   */
  public fun renameAnimationLibrary(name: StringName, newname: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_RENAME_ANIMATION_LIBRARY, NIL)
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.AnimationLibrary] with key [name].
   */
  public fun hasAnimationLibrary(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_HAS_ANIMATION_LIBRARY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the first [godot.AnimationLibrary] with key [name] or `null` if not found.
   */
  public fun getAnimationLibrary(name: StringName): AnimationLibrary? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION_LIBRARY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationLibrary?
  }

  /**
   * Returns the list of stored library keys.
   */
  public fun getAnimationLibraryList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION_LIBRARY_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>
  }

  /**
   * Returns `true` if the [godot.AnimationPlayer] stores an [godot.Animation] with key [name].
   */
  public fun hasAnimation(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_HAS_ANIMATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Animation] with the key [name]. If the animation does not exist, `null` is returned and an error is logged.
   */
  public fun getAnimation(name: StringName): Animation? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  /**
   * Returns the list of stored animation keys.
   */
  public fun getAnimationList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_ANIMATION_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Triggers the [animTo] animation when the [animFrom] animation completes.
   */
  public fun animationSetNext(animFrom: StringName, animTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_SET_NEXT,
        NIL)
  }

  /**
   * Returns the key of the animation which is queued to play after the [animFrom] animation.
   */
  public fun animationGetNext(animFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_ANIMATION_GET_NEXT,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun setBlendTime(
    animFrom: StringName,
    animTo: StringName,
    sec: Double
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SET_BLEND_TIME, NIL)
  }

  /**
   * Gets the blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun getBlendTime(animFrom: StringName, animTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animFrom, STRING_NAME to animTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_BLEND_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Plays the animation with key [name]. Custom blend times and speed can be set. If [customSpeed] is negative and [fromEnd] is `true`, the animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * The [godot.AnimationPlayer] keeps track of its current or last played animation with [assignedAnimation]. If this method is called with that same animation [name], or with no [name] parameter, the assigned animation will resume playing if it was paused, or restart if it was stopped (see [stop] for both pause and stop). If the animation was already playing, it will keep playing.
   *
   * **Note:** The animation will be updated the next time the [godot.AnimationPlayer] is processed. If other variables are updated at the same time this is called, they may be updated too early. To perform the update immediately, call `advance(0)`.
   */
  public fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Double = 1.0,
    fromEnd: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to customSpeed, BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see its description for more information.
   */
  public fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PLAY_BACKWARDS, NIL)
  }

  /**
   * Pauses the currently playing animation. The [currentAnimationPosition] will be kept and calling [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation] will resume the animation.
   *
   * See also [stop].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_PAUSE, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the playback speed is reset to `1.0`.
   *
   * See also [pause].
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_STOP, NIL)
  }

  /**
   * Returns `true` if playing an animation.
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Queues an animation for playback once the current one is done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play unless the looped animation is stopped somehow.
   */
  public fun queue(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_QUEUE, NIL)
  }

  /**
   * Returns a list of the animation keys that are currently queued to play.
   */
  public fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_QUEUE,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Clears all queued, unplayed animations.
   */
  public fun clearQueue(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_QUEUE, NIL)
  }

  /**
   * Gets the actual playing speed of current animation or 0 if not playing. This speed is the [playbackSpeed] property multiplied by `custom_speed` argument specified when calling the [play] method.
   */
  public fun getPlayingSpeed(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_GET_PLAYING_SPEED,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the key of [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimation(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_FIND_ANIMATION,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the key for the [godot.AnimationLibrary] that contains [animation] or an empty [godot.StringName] if not found.
   */
  public fun findAnimationLibrary(animation: Animation): StringName {
    TransferContext.writeArguments(OBJECT to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_FIND_ANIMATION_LIBRARY, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * [godot.AnimationPlayer] caches animated nodes. It may not notice if a node disappears; [clearCaches] forces it to update the cache again.
   */
  public fun clearCaches(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_CLEAR_CACHES, NIL)
  }

  /**
   * Seeks the animation to the [seconds] point in time (in seconds). If [update] is `true`, the animation updates too, otherwise it updates at process time. Events between the current frame and [seconds] are skipped.
   *
   * **Note:** Seeking to the end of the animation doesn't emit [animationFinished]. If you want to skip animation and emit the signal, use [advance].
   */
  public fun seek(seconds: Double, update: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONPLAYER_SEEK, NIL)
  }

  /**
   * Shifts position in the animation timeline and immediately updates the animation. [delta] is the time in seconds to shift. Events between the current frame and [delta] are handled.
   */
  public fun advance(delta: Double): Unit {
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
