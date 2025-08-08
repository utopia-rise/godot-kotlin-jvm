// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.Signal1
import godot.core.Signal2
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedNodePath
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * An animation player is used for general-purpose playback of animations. It contains a dictionary
 * of [AnimationLibrary] resources and custom blend times between animation transitions.
 *
 * Some methods and properties use a single key to reference an animation directly. These keys are
 * formatted as the key for the library, followed by a forward slash, then the key for the animation
 * within the library, for example `"movement/run"`. If the library's key is an empty string (known as
 * the default library), the forward slash is omitted, being the same key used by the library.
 *
 * [AnimationPlayer] is better-suited than [Tween] for more complex animations, for example ones
 * with non-trivial timings. It can also be used over [Tween] if the animation track editor is more
 * convenient than doing it in code.
 *
 * Updating the target properties of animations occurs at the process frame.
 */
@GodotBaseType
public open class AnimationPlayer : AnimationMixer() {
  /**
   * Emitted when [currentAnimation] changes.
   */
  public val currentAnimationChanged: Signal1<String> by Signal1

  /**
   * Emitted when a queued animation plays after the previous animation finished. See also
   * [AnimationPlayer.queue].
   *
   * **Note:** The signal is not emitted when the animation is changed via [AnimationPlayer.play] or
   * by an [AnimationTree].
   */
  public val animationChanged: Signal2<StringName, StringName> by Signal2

  /**
   * The key of the currently playing animation. If no animation is playing, the property's value is
   * an empty string. Changing this value does not restart the animation. See [play] for more
   * information on playing animations.
   *
   * **Note:** While this property appears in the Inspector, it's not meant to be edited, and it's
   * not saved in the scene. This property is mainly used to get the currently playing animation, and
   * internally for animation playback tracks. For more information, see [Animation].
   */
  public final inline var currentAnimation: String
    @JvmName("currentAnimationProperty")
    get() = getCurrentAnimation()
    @JvmName("currentAnimationProperty")
    set(`value`) {
      setCurrentAnimation(value)
    }

  /**
   * If playing, the current animation's key, otherwise, the animation last played. When set, this
   * changes the animation, but will not play it unless already playing. See also [currentAnimation].
   */
  public final inline var assignedAnimation: String
    @JvmName("assignedAnimationProperty")
    get() = getAssignedAnimation()
    @JvmName("assignedAnimationProperty")
    set(`value`) {
      setAssignedAnimation(value)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public final inline var autoplay: String
    @JvmName("autoplayProperty")
    get() = getAutoplay()
    @JvmName("autoplayProperty")
    set(`value`) {
      setAutoplay(value)
    }

  /**
   * The length (in seconds) of the currently playing animation.
   */
  public final inline val currentAnimationLength: Double
    @JvmName("currentAnimationLengthProperty")
    get() = getCurrentAnimationLength()

  /**
   * The position (in seconds) of the currently playing animation.
   */
  public final inline val currentAnimationPosition: Double
    @JvmName("currentAnimationPositionProperty")
    get() = getCurrentAnimationPosition()

  /**
   * If `true`, performs [AnimationMixer.capture] before playback automatically. This means just
   * [playWithCapture] is executed with default arguments instead of [play].
   *
   * **Note:** Capture interpolation is only performed if the animation contains a capture track.
   * See also [Animation.UPDATE_CAPTURE].
   */
  public final inline var playbackAutoCapture: Boolean
    @JvmName("playbackAutoCaptureProperty")
    get() = isAutoCapture()
    @JvmName("playbackAutoCaptureProperty")
    set(`value`) {
      setAutoCapture(value)
    }

  /**
   * See also [playWithCapture] and [AnimationMixer.capture].
   *
   * If [playbackAutoCaptureDuration] is negative value, the duration is set to the interval between
   * the current position and the first key.
   */
  public final inline var playbackAutoCaptureDuration: Double
    @JvmName("playbackAutoCaptureDurationProperty")
    get() = getAutoCaptureDuration()
    @JvmName("playbackAutoCaptureDurationProperty")
    set(`value`) {
      setAutoCaptureDuration(value)
    }

  /**
   * The transition type of the capture interpolation. See also [Tween.TransitionType].
   */
  public final inline var playbackAutoCaptureTransitionType: Tween.TransitionType
    @JvmName("playbackAutoCaptureTransitionTypeProperty")
    get() = getAutoCaptureTransitionType()
    @JvmName("playbackAutoCaptureTransitionTypeProperty")
    set(`value`) {
      setAutoCaptureTransitionType(value)
    }

  /**
   * The ease type of the capture interpolation. See also [Tween.EaseType].
   */
  public final inline var playbackAutoCaptureEaseType: Tween.EaseType
    @JvmName("playbackAutoCaptureEaseTypeProperty")
    get() = getAutoCaptureEaseType()
    @JvmName("playbackAutoCaptureEaseTypeProperty")
    set(`value`) {
      setAutoCaptureEaseType(value)
    }

  /**
   * The default time in which to blend animations. Ranges from 0 to 4096 with 0.01 precision.
   */
  public final inline var playbackDefaultBlendTime: Double
    @JvmName("playbackDefaultBlendTimeProperty")
    get() = getDefaultBlendTime()
    @JvmName("playbackDefaultBlendTimeProperty")
    set(`value`) {
      setDefaultBlendTime(value)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal
   * speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   *
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation
   * will not advance.
   */
  public final inline var speedScale: Float
    @JvmName("speedScaleProperty")
    get() = getSpeedScale()
    @JvmName("speedScaleProperty")
    set(`value`) {
      setSpeedScale(value)
    }

  /**
   * If `true` and the engine is running in Movie Maker mode (see [MovieWriter]), exits the engine
   * with [SceneTree.quit] as soon as an animation is done playing in this [AnimationPlayer]. A message
   * is printed when the engine quits for this reason.
   *
   * **Note:** This obeys the same logic as the [signal AnimationMixer.animation_finished] signal,
   * so it will not quit the engine if the animation is set to be looping.
   */
  public final inline var movieQuitOnFinish: Boolean
    @JvmName("movieQuitOnFinishProperty")
    get() = isMovieQuitOnFinishEnabled()
    @JvmName("movieQuitOnFinishProperty")
    set(`value`) {
      setMovieQuitOnFinishEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(35, scriptIndex)
  }

  /**
   * Triggers the [animationTo] animation when the [animationFrom] animation completes.
   */
  public final fun animationSetNext(animationFrom: StringName, animationTo: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo)
    TransferContext.callMethod(ptr, MethodBindings.animationSetNextPtr, NIL)
  }

  /**
   * Returns the key of the animation which is queued to play after the [animationFrom] animation.
   */
  public final fun animationGetNext(animationFrom: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to animationFrom)
    TransferContext.callMethod(ptr, MethodBindings.animationGetNextPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their keys.
   */
  public final fun setBlendTime(
    animationFrom: StringName,
    animationTo: StringName,
    sec: Double,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo, DOUBLE to sec)
    TransferContext.callMethod(ptr, MethodBindings.setBlendTimePtr, NIL)
  }

  /**
   * Returns the blend time (in seconds) between two animations, referenced by their keys.
   */
  public final fun getBlendTime(animationFrom: StringName, animationTo: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to animationFrom, STRING_NAME to animationTo)
    TransferContext.callMethod(ptr, MethodBindings.getBlendTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDefaultBlendTime(sec: Double): Unit {
    TransferContext.writeArguments(DOUBLE to sec)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultBlendTimePtr, NIL)
  }

  public final fun getDefaultBlendTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultBlendTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setAutoCapture(autoCapture: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autoCapture)
    TransferContext.callMethod(ptr, MethodBindings.setAutoCapturePtr, NIL)
  }

  public final fun isAutoCapture(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoCapturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoCaptureDuration(autoCaptureDuration: Double): Unit {
    TransferContext.writeArguments(DOUBLE to autoCaptureDuration)
    TransferContext.callMethod(ptr, MethodBindings.setAutoCaptureDurationPtr, NIL)
  }

  public final fun getAutoCaptureDuration(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoCaptureDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setAutoCaptureTransitionType(autoCaptureTransitionType: Tween.TransitionType):
      Unit {
    TransferContext.writeArguments(LONG to autoCaptureTransitionType.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutoCaptureTransitionTypePtr, NIL)
  }

  public final fun getAutoCaptureTransitionType(): Tween.TransitionType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoCaptureTransitionTypePtr, LONG)
    return Tween.TransitionType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAutoCaptureEaseType(autoCaptureEaseType: Tween.EaseType): Unit {
    TransferContext.writeArguments(LONG to autoCaptureEaseType.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutoCaptureEaseTypePtr, NIL)
  }

  public final fun getAutoCaptureEaseType(): Tween.EaseType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoCaptureEaseTypePtr, LONG)
    return Tween.EaseType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Plays the animation with key [name]. Custom blend times and speed can be set.
   *
   * The [fromEnd] option only affects when switching to a new animation track, or if the same track
   * but at the start or end. It does not affect resuming playback that was paused in the middle of an
   * animation. If [customSpeed] is negative and [fromEnd] is `true`, the animation will play backwards
   * (which is equivalent to calling [playBackwards]).
   *
   * The [AnimationPlayer] keeps track of its current or last played animation with
   * [assignedAnimation]. If this method is called with that same animation [name], or with no [name]
   * parameter, the assigned animation will resume playing if it was paused.
   *
   * **Note:** The animation will be updated the next time the [AnimationPlayer] is processed. If
   * other variables are updated at the same time this is called, they may be updated too early. To
   * perform the update immediately, call `advance(0)`.
   */
  @JvmOverloads
  public final fun play(
    name: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(ptr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [name] and the section starting from [startMarker] and ending on
   * [endMarker].
   *
   * If the start marker is empty, the section starts from the beginning of the animation. If the
   * end marker is empty, the section ends on the end of the animation. See also [play].
   */
  @JvmOverloads
  public final fun playSectionWithMarkers(
    name: StringName = StringName(""),
    startMarker: StringName = StringName(""),
    endMarker: StringName = StringName(""),
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to startMarker, STRING_NAME to endMarker, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(ptr, MethodBindings.playSectionWithMarkersPtr, NIL)
  }

  /**
   * Plays the animation with key [name] and the section starting from [startTime] and ending on
   * [endTime]. See also [play].
   *
   * Setting [startTime] to a value outside the range of the animation means the start of the
   * animation will be used instead, and setting [endTime] to a value outside the range of the
   * animation means the end of the animation will be used instead. [startTime] cannot be equal to
   * [endTime].
   */
  @JvmOverloads
  public final fun playSection(
    name: StringName = StringName(""),
    startTime: Double = -1.0,
    endTime: Double = -1.0,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to startTime, DOUBLE to endTime, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(ptr, MethodBindings.playSectionPtr, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  @JvmOverloads
  public final fun playBackwards(name: StringName = StringName(""), customBlend: Double = -1.0):
      Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customBlend)
    TransferContext.callMethod(ptr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Plays the animation with key [name] and the section starting from [startMarker] and ending on
   * [endMarker] in reverse.
   *
   * This method is a shorthand for [playSectionWithMarkers] with `custom_speed = -1.0` and
   * `from_end = true`, see its description for more information.
   */
  @JvmOverloads
  public final fun playSectionWithMarkersBackwards(
    name: StringName = StringName(""),
    startMarker: StringName = StringName(""),
    endMarker: StringName = StringName(""),
    customBlend: Double = -1.0,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to startMarker, STRING_NAME to endMarker, DOUBLE to customBlend)
    TransferContext.callMethod(ptr, MethodBindings.playSectionWithMarkersBackwardsPtr, NIL)
  }

  /**
   * Plays the animation with key [name] and the section starting from [startTime] and ending on
   * [endTime] in reverse.
   *
   * This method is a shorthand for [playSection] with `custom_speed = -1.0` and `from_end = true`,
   * see its description for more information.
   */
  @JvmOverloads
  public final fun playSectionBackwards(
    name: StringName = StringName(""),
    startTime: Double = -1.0,
    endTime: Double = -1.0,
    customBlend: Double = -1.0,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to startTime, DOUBLE to endTime, DOUBLE to customBlend)
    TransferContext.callMethod(ptr, MethodBindings.playSectionBackwardsPtr, NIL)
  }

  /**
   * See also [AnimationMixer.capture].
   *
   * You can use this method to use more detailed options for capture than those performed by
   * [playbackAutoCapture]. When [playbackAutoCapture] is `false`, this method is almost the same as
   * the following:
   *
   * ```
   * capture(name, duration, trans_type, ease_type)
   * play(name, custom_blend, custom_speed, from_end)
   * ```
   *
   * If [name] is blank, it specifies [assignedAnimation].
   *
   * If [duration] is a negative value, the duration is set to the interval between the current
   * position and the first key, when [fromEnd] is `true`, uses the interval between the current
   * position and the last key instead.
   *
   * **Note:** The [duration] takes [speedScale] into account, but [customSpeed] does not, because
   * the capture cache is interpolated with the blend result and the result may contain multiple
   * animations.
   */
  @JvmOverloads
  public final fun playWithCapture(
    name: StringName = StringName(""),
    duration: Double = -1.0,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
    transType: Tween.TransitionType = Tween.TransitionType.LINEAR,
    easeType: Tween.EaseType = Tween.EaseType.IN,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to duration, DOUBLE to customBlend, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd, LONG to transType.id, LONG to easeType.id)
    TransferContext.callMethod(ptr, MethodBindings.playWithCapturePtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [currentAnimationPosition] will be kept and calling
   * [play] or [playBackwards] without arguments or with the same animation name as [assignedAnimation]
   * will resume the animation.
   *
   * See also [stop].
   */
  public final fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the
   * `custom_speed` is reset to `1.0`. See also [pause].
   *
   * If [keepState] is `true`, the animation state is not updated visually.
   *
   * **Note:** The method / audio / animation playback tracks will not be processed by this method.
   */
  @JvmOverloads
  public final fun stop(keepState: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed`
   * are `0`).
   */
  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCurrentAnimation(animation: String): Unit {
    TransferContext.writeArguments(STRING to animation)
    TransferContext.callMethod(ptr, MethodBindings.setCurrentAnimationPtr, NIL)
  }

  public final fun getCurrentAnimation(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentAnimationPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setAssignedAnimation(animation: String): Unit {
    TransferContext.writeArguments(STRING to animation)
    TransferContext.callMethod(ptr, MethodBindings.setAssignedAnimationPtr, NIL)
  }

  public final fun getAssignedAnimation(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAssignedAnimationPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Queues an animation for playback once the current animation and all previously queued
   * animations are done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play
   * unless the looped animation is stopped somehow.
   */
  public final fun queue(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.queuePtr, NIL)
  }

  /**
   * Returns a list of the animation keys that are currently queued to play.
   */
  public final fun getQueue(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getQueuePtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Clears all queued, unplayed animations.
   */
  public final fun clearQueue(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearQueuePtr, NIL)
  }

  public final fun setSpeedScale(speed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun getSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the
   * [speedScale] property multiplied by `custom_speed` argument specified when calling the [play]
   * method.
   *
   * Returns a negative value if the current animation is playing backwards.
   */
  public final fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutoplay(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun getAutoplay(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoplayPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setMovieQuitOnFinishEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setMovieQuitOnFinishEnabledPtr, NIL)
  }

  public final fun isMovieQuitOnFinishEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMovieQuitOnFinishEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getCurrentAnimationPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentAnimationPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getCurrentAnimationLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentAnimationLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Changes the start and end markers of the section being played. The current playback position
   * will be clamped within the new section. See also [playSectionWithMarkers].
   *
   * If the argument is empty, the section uses the beginning or end of the animation. If both are
   * empty, it means that the section is not set.
   */
  public final fun setSectionWithMarkers(startMarker: StringName = StringName(""),
      endMarker: StringName = StringName("")): Unit {
    TransferContext.writeArguments(STRING_NAME to startMarker, STRING_NAME to endMarker)
    TransferContext.callMethod(ptr, MethodBindings.setSectionWithMarkersPtr, NIL)
  }

  /**
   * Changes the start and end times of the section being played. The current playback position will
   * be clamped within the new section. See also [playSection].
   */
  @JvmOverloads
  public final fun setSection(startTime: Double = -1.0, endTime: Double = -1.0): Unit {
    TransferContext.writeArguments(DOUBLE to startTime, DOUBLE to endTime)
    TransferContext.callMethod(ptr, MethodBindings.setSectionPtr, NIL)
  }

  /**
   * Resets the current section if section is set.
   */
  public final fun resetSection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetSectionPtr, NIL)
  }

  /**
   * Returns the start time of the section currently being played.
   */
  public final fun getSectionStartTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionStartTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the end time of the section currently being played.
   */
  public final fun getSectionEndTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSectionEndTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns `true` if an animation is currently playing with section.
   */
  public final fun hasSection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasSectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Seeks the animation to the [seconds] point in time (in seconds). If [update] is `true`, the
   * animation updates too, otherwise it updates at process time. Events between the current frame and
   * [seconds] are skipped.
   *
   * If [updateOnly] is `true`, the method / audio / animation playback tracks will not be
   * processed.
   *
   * **Note:** Seeking to the end of the animation doesn't emit [signal
   * AnimationMixer.animation_finished]. If you want to skip animation and emit the signal, use
   * [AnimationMixer.advance].
   */
  @JvmOverloads
  public final fun seek(
    seconds: Double,
    update: Boolean = false,
    updateOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to seconds, BOOL to update, BOOL to updateOnly)
    TransferContext.callMethod(ptr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Sets the process notification in which to update animations.
   */
  public final fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  /**
   * Returns the process notification in which to update animations.
   */
  public final fun getProcessCallback(): AnimationProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessCallbackPtr, LONG)
    return AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the call mode used for "Call Method" tracks.
   */
  public final fun setMethodCallMode(mode: AnimationMethodCallMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setMethodCallModePtr, NIL)
  }

  /**
   * Returns the call mode used for "Call Method" tracks.
   */
  public final fun getMethodCallMode(): AnimationMethodCallMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMethodCallModePtr, LONG)
    return AnimationMethodCallMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the node which node path references will travel from.
   */
  public final fun setRoot(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setRootPtr, NIL)
  }

  /**
   * Returns the node which node path references will travel from.
   */
  public final fun getRoot(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Triggers the [animationTo] animation when the [animationFrom] animation completes.
   */
  public final fun animationSetNext(animationFrom: String, animationTo: String): Unit =
      animationSetNext(animationFrom.asCachedStringName(), animationTo.asCachedStringName())

  /**
   * Returns the key of the animation which is queued to play after the [animationFrom] animation.
   */
  public final fun animationGetNext(animationFrom: String): StringName =
      animationGetNext(animationFrom.asCachedStringName())

  /**
   * Specifies a blend time (in seconds) between two animations, referenced by their keys.
   */
  public final fun setBlendTime(
    animationFrom: String,
    animationTo: String,
    sec: Double,
  ): Unit = setBlendTime(animationFrom.asCachedStringName(), animationTo.asCachedStringName(), sec)

  /**
   * Returns the blend time (in seconds) between two animations, referenced by their keys.
   */
  public final fun getBlendTime(animationFrom: String, animationTo: String): Double =
      getBlendTime(animationFrom.asCachedStringName(), animationTo.asCachedStringName())

  /**
   * Plays the animation with key [name]. Custom blend times and speed can be set.
   *
   * The [fromEnd] option only affects when switching to a new animation track, or if the same track
   * but at the start or end. It does not affect resuming playback that was paused in the middle of an
   * animation. If [customSpeed] is negative and [fromEnd] is `true`, the animation will play backwards
   * (which is equivalent to calling [playBackwards]).
   *
   * The [AnimationPlayer] keeps track of its current or last played animation with
   * [assignedAnimation]. If this method is called with that same animation [name], or with no [name]
   * parameter, the assigned animation will resume playing if it was paused.
   *
   * **Note:** The animation will be updated the next time the [AnimationPlayer] is processed. If
   * other variables are updated at the same time this is called, they may be updated too early. To
   * perform the update immediately, call `advance(0)`.
   */
  @JvmOverloads
  public final fun play(
    name: String,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit = play(name.asCachedStringName(), customBlend, customSpeed, fromEnd)

  /**
   * Plays the animation with key [name] and the section starting from [startMarker] and ending on
   * [endMarker].
   *
   * If the start marker is empty, the section starts from the beginning of the animation. If the
   * end marker is empty, the section ends on the end of the animation. See also [play].
   */
  @JvmOverloads
  public final fun playSectionWithMarkers(
    name: String,
    startMarker: String,
    endMarker: String,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit =
      playSectionWithMarkers(name.asCachedStringName(), startMarker.asCachedStringName(), endMarker.asCachedStringName(), customBlend, customSpeed, fromEnd)

  /**
   * Plays the animation with key [name] and the section starting from [startTime] and ending on
   * [endTime]. See also [play].
   *
   * Setting [startTime] to a value outside the range of the animation means the start of the
   * animation will be used instead, and setting [endTime] to a value outside the range of the
   * animation means the end of the animation will be used instead. [startTime] cannot be equal to
   * [endTime].
   */
  @JvmOverloads
  public final fun playSection(
    name: String,
    startTime: Double = -1.0,
    endTime: Double = -1.0,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit =
      playSection(name.asCachedStringName(), startTime, endTime, customBlend, customSpeed, fromEnd)

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  @JvmOverloads
  public final fun playBackwards(name: String, customBlend: Double = -1.0): Unit =
      playBackwards(name.asCachedStringName(), customBlend)

  /**
   * Plays the animation with key [name] and the section starting from [startMarker] and ending on
   * [endMarker] in reverse.
   *
   * This method is a shorthand for [playSectionWithMarkers] with `custom_speed = -1.0` and
   * `from_end = true`, see its description for more information.
   */
  @JvmOverloads
  public final fun playSectionWithMarkersBackwards(
    name: String,
    startMarker: String,
    endMarker: String,
    customBlend: Double = -1.0,
  ): Unit =
      playSectionWithMarkersBackwards(name.asCachedStringName(), startMarker.asCachedStringName(), endMarker.asCachedStringName(), customBlend)

  /**
   * Plays the animation with key [name] and the section starting from [startTime] and ending on
   * [endTime] in reverse.
   *
   * This method is a shorthand for [playSection] with `custom_speed = -1.0` and `from_end = true`,
   * see its description for more information.
   */
  @JvmOverloads
  public final fun playSectionBackwards(
    name: String,
    startTime: Double = -1.0,
    endTime: Double = -1.0,
    customBlend: Double = -1.0,
  ): Unit = playSectionBackwards(name.asCachedStringName(), startTime, endTime, customBlend)

  /**
   * See also [AnimationMixer.capture].
   *
   * You can use this method to use more detailed options for capture than those performed by
   * [playbackAutoCapture]. When [playbackAutoCapture] is `false`, this method is almost the same as
   * the following:
   *
   * ```
   * capture(name, duration, trans_type, ease_type)
   * play(name, custom_blend, custom_speed, from_end)
   * ```
   *
   * If [name] is blank, it specifies [assignedAnimation].
   *
   * If [duration] is a negative value, the duration is set to the interval between the current
   * position and the first key, when [fromEnd] is `true`, uses the interval between the current
   * position and the last key instead.
   *
   * **Note:** The [duration] takes [speedScale] into account, but [customSpeed] does not, because
   * the capture cache is interpolated with the blend result and the result may contain multiple
   * animations.
   */
  @JvmOverloads
  public final fun playWithCapture(
    name: String,
    duration: Double = -1.0,
    customBlend: Double = -1.0,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
    transType: Tween.TransitionType = Tween.TransitionType.LINEAR,
    easeType: Tween.EaseType = Tween.EaseType.IN,
  ): Unit =
      playWithCapture(name.asCachedStringName(), duration, customBlend, customSpeed, fromEnd, transType, easeType)

  /**
   * Queues an animation for playback once the current animation and all previously queued
   * animations are done.
   *
   * **Note:** If a looped animation is currently playing, the queued animation will never play
   * unless the looped animation is stopped somehow.
   */
  public final fun queue(name: String): Unit = queue(name.asCachedStringName())

  /**
   * Changes the start and end markers of the section being played. The current playback position
   * will be clamped within the new section. See also [playSectionWithMarkers].
   *
   * If the argument is empty, the section uses the beginning or end of the animation. If both are
   * empty, it means that the section is not set.
   */
  public final fun setSectionWithMarkers(startMarker: String, endMarker: String): Unit =
      setSectionWithMarkers(startMarker.asCachedStringName(), endMarker.asCachedStringName())

  /**
   * Sets the node which node path references will travel from.
   */
  public final fun setRoot(path: String): Unit = setRoot(path.asCachedNodePath())

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    PHYSICS(0),
    IDLE(1),
    MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationProcessCallback = entries.single { it.id == `value` }
    }
  }

  public enum class AnimationMethodCallMode(
    id: Long,
  ) {
    DEFERRED(0),
    IMMEDIATE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationMethodCallMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val animationSetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_set_next", 3740211285)

    internal val animationGetNextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "animation_get_next", 1965194235)

    internal val setBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_blend_time", 3231131886)

    internal val getBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_blend_time", 1958752504)

    internal val setDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_default_blend_time", 373806689)

    internal val getDefaultBlendTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_default_blend_time", 1740695150)

    internal val setAutoCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_auto_capture", 2586408642)

    internal val isAutoCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_auto_capture", 36873697)

    internal val setAutoCaptureDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_auto_capture_duration", 373806689)

    internal val getAutoCaptureDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_auto_capture_duration", 1740695150)

    internal val setAutoCaptureTransitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_auto_capture_transition_type", 1058637742)

    internal val getAutoCaptureTransitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_auto_capture_transition_type", 3842314528)

    internal val setAutoCaptureEaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_auto_capture_ease_type", 1208105857)

    internal val getAutoCaptureEaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_auto_capture_ease_type", 631880200)

    internal val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play", 3118260607)

    internal val playSectionWithMarkersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_section_with_markers", 1421431412)

    internal val playSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_section", 284774635)

    internal val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_backwards", 2787282401)

    internal val playSectionWithMarkersBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_section_with_markers_backwards", 910195100)

    internal val playSectionBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_section_backwards", 831955981)

    internal val playWithCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "play_with_capture", 1572969103)

    internal val pausePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "pause", 3218959716)

    internal val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "stop", 107499316)

    internal val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_playing", 36873697)

    internal val setCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_current_animation", 83702148)

    internal val getCurrentAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation", 201670096)

    internal val setAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_assigned_animation", 83702148)

    internal val getAssignedAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_assigned_animation", 201670096)

    internal val queuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "queue", 3304788590)

    internal val getQueuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_queue", 2981934095)

    internal val clearQueuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "clear_queue", 3218959716)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_speed_scale", 373806689)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_speed_scale", 1740695150)

    internal val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_playing_speed", 1740695150)

    internal val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_autoplay", 83702148)

    internal val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_autoplay", 201670096)

    internal val setMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_movie_quit_on_finish_enabled", 2586408642)

    internal val isMovieQuitOnFinishEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "is_movie_quit_on_finish_enabled", 36873697)

    internal val getCurrentAnimationPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_position", 1740695150)

    internal val getCurrentAnimationLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_current_animation_length", 1740695150)

    internal val setSectionWithMarkersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_section_with_markers", 794792241)

    internal val setSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_section", 3749779719)

    internal val resetSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "reset_section", 3218959716)

    internal val getSectionStartTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_section_start_time", 1740695150)

    internal val getSectionEndTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_section_end_time", 1740695150)

    internal val hasSectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "has_section", 36873697)

    internal val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "seek", 1807872683)

    internal val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_process_callback", 1663839457)

    internal val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_process_callback", 4207496604)

    internal val setMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_method_call_mode", 3413514846)

    internal val getMethodCallModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_method_call_mode", 3583380054)

    internal val setRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "set_root", 1348162250)

    internal val getRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationPlayer", "get_root", 4075236667)
  }
}
