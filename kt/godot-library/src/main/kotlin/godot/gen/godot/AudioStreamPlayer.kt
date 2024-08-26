// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [AudioStreamPlayer] node plays an audio stream non-positionally. It is ideal for user
 * interfaces, menus, or background music.
 * To use this node, [stream] needs to be set to a valid [AudioStream] resource. Playing more than
 * one sound at the same time is also supported, see [maxPolyphony].
 * If you need to play audio at a specific position, use [AudioStreamPlayer2D] or
 * [AudioStreamPlayer3D] instead.
 */
@GodotBaseType
public open class AudioStreamPlayer : Node() {
  /**
   * Emitted when a sound finishes playing without interruptions. This signal is *not* emitted when
   * calling [stop], or when exiting the tree while sounds are playing.
   */
  public val finished: Signal0 by signal()

  /**
   * The [AudioStream] resource to be played. Setting this property stops all currently playing
   * sounds. If left empty, the [AudioStreamPlayer] does not work.
   */
  public var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
    }

  /**
   * Volume of sound, in decibel. This is an offset of the [stream]'s volume.
   * **Note:** To convert between decibel and linear energy (like most volume sliders do), use
   * [@GlobalScope.dbToLinear] and [@GlobalScope.linearToDb].
   */
  public var volumeDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
    }

  /**
   * The audio's pitch and tempo, as a multiplier of the [stream]'s sample rate. A value of `2.0`
   * doubles the audio's pitch, while a value of `0.5` halves the pitch.
   */
  public var pitchScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPitchScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPitchScalePtr, NIL)
    }

  /**
   * If `true`, this node is playing sounds. Setting this property has the same effect as [play] and
   * [stop].
   */
  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

  /**
   * If `true`, this node calls [play] when entering the tree.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoplayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * If `true`, the sounds are paused. Setting [streamPaused] to `false` resumes all sounds.
   * **Note:** This property is automatically changed when exiting or entering the tree, or this
   * node is paused (see [Node.processMode]).
   */
  public var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPausedPtr, NIL)
    }

  /**
   * The mix target channels, as one of the [MixTarget] constants. Has no effect when two speakers
   * or less are detected (see [AudioServer.SpeakerMode]).
   */
  public var mixTarget: MixTarget
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixTargetPtr, LONG)
      return AudioStreamPlayer.MixTarget.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMixTargetPtr, NIL)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Calling [play] after this
   * value is reached will cut off the oldest sounds.
   */
  public var maxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPolyphonyPtr, NIL)
    }

  /**
   * The target bus name. All sounds from this node will be playing on this bus.
   * **Note:** At runtime, if no bus with the given name exists, all sounds will fall back on
   * `"Master"`. See also [AudioServer.getBusName].
   */
  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBusPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBusPtr, NIL)
    }

  /**
   * The playback type of the stream player. If set other than to the default value, it will force
   * that playback type.
   */
  public var playbackType: AudioServer.PlaybackType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackTypePtr, LONG)
      return AudioServer.PlaybackType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlaybackTypePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER, scriptIndex)
  }

  /**
   * Plays a sound from the beginning, or the given [fromPosition] in seconds.
   */
  @JvmOverloads
  public fun play(fromPosition: Float = 0.0f): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Restarts all sounds to be played from the given [toPosition], in seconds. Does nothing if no
   * sounds are playing.
   */
  public fun seek(toPosition: Float): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops all sounds from this node.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns the position in the [AudioStream] of the latest sound, in seconds. Returns `0.0` if no
   * sounds are playing.
   * **Note:** The position is not always accurate, as the [AudioServer] does not mix audio every
   * processed frame. To get more accurate results, add [AudioServer.getTimeSinceLastMix] to the
   * returned position.
   */
  public fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns `true` if any sound is active, even if [streamPaused] is set to `true`. See also
   * [playing] and [getStreamPlayback].
   */
  public fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the latest [AudioStreamPlayback] of this node, usually the most recently created by
   * [play]. If no sounds are playing, this method fails and returns an empty playback.
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
  }

  public enum class MixTarget(
    id: Long,
  ) {
    /**
     * The audio will be played only on the first channel. This is the default.
     */
    MIX_TARGET_STEREO(0),
    /**
     * The audio will be played on all surround channels.
     */
    MIX_TARGET_SURROUND(1),
    /**
     * The audio will be played on the second channel, which is usually the center.
     */
    MIX_TARGET_CENTER(2),
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
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_volume_db")

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_pitch_scale")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "play")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "seek")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_playing")

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_playback_position")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_bus")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_autoplay")

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_autoplay_enabled")

    public val setMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_mix_target")

    public val getMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_mix_target")

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream_paused")

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_paused")

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_max_polyphony")

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_max_polyphony")

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "has_stream_playback")

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_playback")

    public val setPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_playback_type")

    public val getPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_playback_type")
  }
}
