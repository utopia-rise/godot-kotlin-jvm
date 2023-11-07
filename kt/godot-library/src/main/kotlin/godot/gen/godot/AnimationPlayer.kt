// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * An animation player is used for general-purpose playback of animations. It contains a dictionary
 * of [AnimationLibrary] resources and custom blend times between animation transitions.
 * Some methods and properties use a single key to reference an animation directly. These keys are
 * formatted as the key for the library, followed by a forward slash, then the key for the animation
 * within the library, for example `"movement/run"`. If the library's key is an empty string (known as
 * the default library), the forward slash is omitted, being the same key used by the library.
 * [AnimationPlayer] is better-suited than [Tween] for more complex animations, for example ones
 * with non-trivial timings. It can also be used over [Tween] if the animation track editor is more
 * convenient than doing it in code.
 * Updating the target properties of animations occurs at the process frame.
 */
@GodotBaseType
public open class AnimationPlayer : AnimationMixer() {
  /**
   * Emitted when [currentAnimation] changes.
   */
  public val currentAnimationChanged: Signal1<String> by signal("name")

  /**
   * Emitted when a queued animation plays after the previous animation finished. See also
   * [AnimationPlayer.queue].
   * **Note:** The signal is not emitted when the animation is changed via [AnimationPlayer.play] or
   * by an [AnimationTree].
   */
  public val animationChanged: Signal2<StringName, StringName> by signal("oldName", "newName")

  /**
   * The key of the currently playing animation. If no animation is playing, the property's value is
   * an empty string. Changing this value does not restart the animation. See [play] for more
   * information on playing animations.
   * **Note:** While this property appears in the Inspector, it's not meant to be edited, and it's
   * not saved in the scene. This property is mainly used to get the currently playing animation, and
   * internally for animation playback tracks. For more information, see [Animation].
   */
  public var currentAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentAnimationPtr, NIL)
    }

  /**
   * If playing, the current animation's key, otherwise, the animation last played. When set, this
   * changes the animation, but will not play it unless already playing. See also [currentAnimation].
   */
  public var assignedAnimation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAssignedAnimationPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAssignedAnimationPtr, NIL)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoplayPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * The length (in seconds) of the currently playing animation.
   */
  public val currentAnimationLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  /**
   * The position (in seconds) of the currently playing animation.
   */
  public val currentAnimationPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentAnimationPositionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  public var playbackDefaultBlendTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultBlendTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultBlendTimePtr, NIL)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal
   * speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation
   * will not advance.
   */
  public var speedScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  /**
   * If `true` and the engine is running in Movie Maker mode (see [MovieWriter]), exits the engine
   * with [SceneTree.quit] as soon as an animation is done playing in this [AnimationPlayer]. A message
   * is printed when the engine quits for this reason.
   * **Note:** This obeys the same logic as the [signal AnimationMixer.animation_finished] signal,
   * so it will not quit the engine if the animation is set to be looping.
   */
  public var movieQuitOnFinish: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMovieQuitOnFinishEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMovieQuitOnFinishEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONPLAYER, scriptIndex)
    return true
  }

  /**
   * Triggers the [param animation_to] animation when the [param animation_from] animation
   * completes.
   */
  public fun animationSetNext(animationFrom: StringName, animationTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo)
    TransferContext.callMethod(rawPtr, MethodBindings.animationSetNextPtr, NIL)
  }

  /**
   * Returns the key of the animation which is queued to play after the [param animation_from]
   * animation.
   */
  public fun animationGetNext(animationFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animationFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.animationGetNextPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun setBlendTime(
    animationFrom: StringName,
    animationTo: StringName,
    sec: Double,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo, DOUBLE to sec)
    TransferContext.callMethod(rawPtr, MethodBindings.setBlendTimePtr, NIL)
  }

  /**
   * Returns the blend time (in seconds) between two animations, referenced by their keys.
   */
  public fun getBlendTime(animationFrom: StringName, animationTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo)
    TransferContext.callMethod(rawPtr, MethodBindings.getBlendTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Plays the animation with key [param name]. Custom blend times and speed can be set.
   * The [param from_end] option only affects when switching to a new animation track, or if the
   * same track but at the start or end. It does not affect resuming playback that was paused in the
   * middle of an animation. If [param custom_speed] is negative and [param from_end] is `true`, the
   * animation will play backwards (which is equivalent to calling [playBackwards]).
   * The [AnimationPlayer] keeps track of its current or last played animation with
   * [assignedAnimation]. If this method is called with that same animation [param name], or with no
   * [param name] parameter, the assigned animation will resume playing if it was paused.
   * **Note:** The animation will be updated the next time the [AnimationPlayer] is processed. If
   * other variables are updated at the same time this is called, they may be updated too early. To
   * perform the update immediately, call `advance(0)`.
   */
  @JvmOverloads
  public fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [param name] in reverse.
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  @JvmOverloads
  public fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [currentAnimationPosition] will be kept and calling
   * [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation]
   * will resume the animation.
   * See also [stop].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the
   * `custom_speed` is reset to `1.0`. See also [pause].
   * If [param keep_state] is `true`, the animation state is not updated visually.
   * **Note:** The method / audio / animation playback tracks will not be processed by this method.
   */
  @JvmOverloads
  public fun stop(keepState: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed`
   * are `0`).
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Queues an animation for playback once the current one is done.
   * **Note:** If a looped animation is currently playing, the queued animation will never play
   * unless the looped animation is stopped somehow.
   */
  public fun queue(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.queuePtr, NIL)
  }

  /**
   * Returns a list of the animation keys that are currently queued to play.
   */
  public fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getQueuePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Clears all queued, unplayed animations.
   */
  public fun clearQueue(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearQueuePtr, NIL)
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the
   * [speedScale] property multiplied by `custom_speed` argument specified when calling the [play]
   * method.
   * Returns a negative value if the current animation is playing backwards.
   */
  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Seeks the animation to the [param seconds] point in time (in seconds). If [param update] is
   * `true`, the animation updates too, otherwise it updates at process time. Events between the
   * current frame and [param seconds] are skipped.
   * If [param update_only] is true, the method / audio / animation playback tracks will not be
   * processed.
   * **Note:** Seeking to the end of the animation doesn't emit [signal
   * AnimationMixer.animation_finished]. If you want to skip animation and emit the signal, use
   * [AnimationMixer.advance].
   */
  @JvmOverloads
  public fun seek(
    seconds: Double,
    update: Boolean = false,
    updateOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update, BOOL to updateOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeProcess].
   */
  public fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeProcess].
   */
  public fun getProcessCallback(): AnimationProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
    return AnimationPlayer.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeMethod].
   */
  public fun setMethodCallMode(mode: AnimationMethodCallMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMethodCallModePtr, NIL)
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeMethod].
   */
  public fun getMethodCallMode(): AnimationMethodCallMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMethodCallModePtr, LONG)
    return AnimationPlayer.AnimationMethodCallMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * For backward compatibility. See [AnimationMixer.rootNode].
   */
  public fun setRoot(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setRootPtr, NIL)
  }

  /**
   * For backward compatibility. See [AnimationMixer.rootNode].
   */
  public fun getRoot(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    /**
     * For backward compatibility. See [constant
     * AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS].
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * For backward compatibility. See [constant
     * AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_IDLE].
     */
    ANIMATION_PROCESS_IDLE(1),
    /**
     * For backward compatibility. See [constant
     * AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_MANUAL].
     */
    ANIMATION_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AnimationMethodCallMode(
    id: Long,
  ) {
    /**
     * For backward compatibility. See [constant
     * AnimationMixer.ANIMATION_CALLBACK_MODE_METHOD_DEFERRED].
     */
    ANIMATION_METHOD_CALL_DEFERRED(0),
    /**
     * For backward compatibility. See [constant
     * AnimationMixer.ANIMATION_CALLBACK_MODE_METHOD_IMMEDIATE].
     */
    ANIMATION_METHOD_CALL_IMMEDIATE(1),
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
    public val animationSetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_set_next")

    public val animationGetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_get_next")

    public val setBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_blend_time")

    public val getBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_blend_time")

    public val setDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_default_blend_time")

    public val getDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_default_blend_time")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "play")

    public val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_backwards")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "pause")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "stop")

    public val isPlayingPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "is_playing")

    public val setCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_current_animation")

    public val getCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation")

    public val setAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_assigned_animation")

    public val getAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_assigned_animation")

    public val queuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "queue")

    public val getQueuePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_queue")

    public val clearQueuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_queue")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_speed_scale")

    public val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_playing_speed")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_autoplay")

    public val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_autoplay")

    public val setMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_movie_quit_on_finish_enabled")

    public val isMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_movie_quit_on_finish_enabled")

    public val getCurrentAnimationPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_position")

    public val getCurrentAnimationLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_length")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "seek")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_process_callback")

    public val setMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_method_call_mode")

    public val getMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_method_call_mode")

    public val setRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "set_root")

    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimationPlayer", "get_root")
  }
}
