// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_AUDIOSTREAMPLAYER_INDEX: Int = 128

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
  public val finished: Signal0 by Signal0

  /**
   * The [AudioStream] resource to be played. Setting this property stops all currently playing
   * sounds. If left empty, the [AudioStreamPlayer] does not work.
   */
  public final inline var stream: AudioStream?
    @JvmName("streamProperty")
    get() = getStream()
    @JvmName("streamProperty")
    set(`value`) {
      setStream(value)
    }

  /**
   * Volume of sound, in decibel. This is an offset of the [stream]'s volume.
   * **Note:** To convert between decibel and linear energy (like most volume sliders do), use
   * [@GlobalScope.dbToLinear] and [@GlobalScope.linearToDb].
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  /**
   * The audio's pitch and tempo, as a multiplier of the [stream]'s sample rate. A value of `2.0`
   * doubles the audio's pitch, while a value of `0.5` halves the pitch.
   */
  public final inline var pitchScale: Float
    @JvmName("pitchScaleProperty")
    get() = getPitchScale()
    @JvmName("pitchScaleProperty")
    set(`value`) {
      setPitchScale(value)
    }

  /**
   * If `true`, this node is playing sounds. Setting this property has the same effect as [play] and
   * [stop].
   */
  public final inline val playing: Boolean
    @JvmName("playingProperty")
    get() = isPlaying()

  /**
   * If `true`, this node calls [play] when entering the tree.
   */
  public final inline var autoplay: Boolean
    @JvmName("autoplayProperty")
    get() = isAutoplayEnabled()
    @JvmName("autoplayProperty")
    set(`value`) {
      setAutoplay(value)
    }

  /**
   * If `true`, the sounds are paused. Setting [streamPaused] to `false` resumes all sounds.
   * **Note:** This property is automatically changed when exiting or entering the tree, or this
   * node is paused (see [Node.processMode]).
   */
  public final inline var streamPaused: Boolean
    @JvmName("streamPausedProperty")
    get() = getStreamPaused()
    @JvmName("streamPausedProperty")
    set(`value`) {
      setStreamPaused(value)
    }

  /**
   * The mix target channels, as one of the [MixTarget] constants. Has no effect when two speakers
   * or less are detected (see [AudioServer.SpeakerMode]).
   */
  public final inline var mixTarget: MixTarget
    @JvmName("mixTargetProperty")
    get() = getMixTarget()
    @JvmName("mixTargetProperty")
    set(`value`) {
      setMixTarget(value)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Calling [play] after this
   * value is reached will cut off the oldest sounds.
   */
  public final inline var maxPolyphony: Int
    @JvmName("maxPolyphonyProperty")
    get() = getMaxPolyphony()
    @JvmName("maxPolyphonyProperty")
    set(`value`) {
      setMaxPolyphony(value)
    }

  /**
   * The target bus name. All sounds from this node will be playing on this bus.
   * **Note:** At runtime, if no bus with the given name exists, all sounds will fall back on
   * `"Master"`. See also [AudioServer.getBusName].
   */
  public final inline var bus: StringName
    @JvmName("busProperty")
    get() = getBus()
    @JvmName("busProperty")
    set(`value`) {
      setBus(value)
    }

  /**
   * The playback type of the stream player. If set other than to the default value, it will force
   * that playback type.
   */
  public final inline var playbackType: AudioServer.PlaybackType
    @JvmName("playbackTypeProperty")
    get() = getPlaybackType()
    @JvmName("playbackTypeProperty")
    set(`value`) {
      setPlaybackType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMPLAYER_INDEX, scriptIndex)
  }

  public final fun setStream(stream: AudioStream?): Unit {
    Internals.writeArguments(OBJECT to stream)
    Internals.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
  }

  public final fun getStream(): AudioStream? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioStream?)
  }

  public final fun setVolumeDb(volumeDb: Float): Unit {
    Internals.writeArguments(DOUBLE to volumeDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
  }

  public final fun getVolumeDb(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPitchScale(pitchScale: Float): Unit {
    Internals.writeArguments(DOUBLE to pitchScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPitchScalePtr, NIL)
  }

  public final fun getPitchScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPitchScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Plays a sound from the beginning, or the given [fromPosition] in seconds.
   */
  @JvmOverloads
  public final fun play(fromPosition: Float = 0.0f): Unit {
    Internals.writeArguments(DOUBLE to fromPosition.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Restarts all sounds to be played from the given [toPosition], in seconds. Does nothing if no
   * sounds are playing.
   */
  public final fun seek(toPosition: Float): Unit {
    Internals.writeArguments(DOUBLE to toPosition.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops all sounds from this node.
   */
  public final fun stop(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public final fun isPlaying(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the position in the [AudioStream] of the latest sound, in seconds. Returns `0.0` if no
   * sounds are playing.
   * **Note:** The position is not always accurate, as the [AudioServer] does not mix audio every
   * processed frame. To get more accurate results, add [AudioServer.getTimeSinceLastMix] to the
   * returned position.
   */
  public final fun getPlaybackPosition(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBus(bus: StringName): Unit {
    Internals.writeArguments(STRING_NAME to bus)
    Internals.callMethod(rawPtr, MethodBindings.setBusPtr, NIL)
  }

  public final fun getBus(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBusPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setAutoplay(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun isAutoplayEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAutoplayEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMixTarget(mixTarget: MixTarget): Unit {
    Internals.writeArguments(LONG to mixTarget.id)
    Internals.callMethod(rawPtr, MethodBindings.setMixTargetPtr, NIL)
  }

  public final fun getMixTarget(): MixTarget {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMixTargetPtr, LONG)
    return AudioStreamPlayer.MixTarget.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setStreamPaused(pause: Boolean): Unit {
    Internals.writeArguments(BOOL to pause)
    Internals.callMethod(rawPtr, MethodBindings.setStreamPausedPtr, NIL)
  }

  public final fun getStreamPaused(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStreamPausedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaxPolyphony(maxPolyphony: Int): Unit {
    Internals.writeArguments(LONG to maxPolyphony.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxPolyphonyPtr, NIL)
  }

  public final fun getMaxPolyphony(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxPolyphonyPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if any sound is active, even if [streamPaused] is set to `true`. See also
   * [playing] and [getStreamPlayback].
   */
  public final fun hasStreamPlayback(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the latest [AudioStreamPlayback] of this node, usually the most recently created by
   * [play]. If no sounds are playing, this method fails and returns an empty playback.
   */
  public final fun getStreamPlayback(): AudioStreamPlayback? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioStreamPlayback?)
  }

  public final fun setPlaybackType(playbackType: AudioServer.PlaybackType): Unit {
    Internals.writeArguments(LONG to playbackType.id)
    Internals.callMethod(rawPtr, MethodBindings.setPlaybackTypePtr, NIL)
  }

  public final fun getPlaybackType(): AudioServer.PlaybackType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaybackTypePtr, LONG)
    return AudioServer.PlaybackType.from(Internals.readReturnValue(LONG) as Long)
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
      public fun from(`value`: Long): MixTarget = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_stream", 2210767741)

    public val getStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_stream", 160907539)

    public val setVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_volume_db", 373806689)

    public val getVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_volume_db", 1740695150)

    public val setPitchScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_pitch_scale", 373806689)

    public val getPitchScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_pitch_scale", 1740695150)

    public val playPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "play", 1958160172)

    public val seekPtr: VoidPtr = Internals.getMethodBindPtr("AudioStreamPlayer", "seek", 373806689)

    public val stopPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "stop", 3218959716)

    public val isPlayingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "is_playing", 36873697)

    public val getPlaybackPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_playback_position", 191475506)

    public val setBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_bus", 3304788590)

    public val getBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_bus", 2002593661)

    public val setAutoplayPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_autoplay", 2586408642)

    public val isAutoplayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "is_autoplay_enabled", 36873697)

    public val setMixTargetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_mix_target", 2300306138)

    public val getMixTargetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_mix_target", 172807476)

    public val setStreamPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_stream_paused", 2586408642)

    public val getStreamPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_stream_paused", 36873697)

    public val setMaxPolyphonyPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_max_polyphony", 1286410249)

    public val getMaxPolyphonyPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_max_polyphony", 3905245786)

    public val hasStreamPlaybackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "has_stream_playback", 2240911060)

    public val getStreamPlaybackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_stream_playback", 210135309)

    public val setPlaybackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "set_playback_type", 725473817)

    public val getPlaybackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer", "get_playback_type", 4011264623)
  }
}
