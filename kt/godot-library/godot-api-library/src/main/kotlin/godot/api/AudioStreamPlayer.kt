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
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
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
   * Volume of sound, in decibels. This is an offset of the [stream]'s volume.
   * **Note:** To convert between decibel and linear energy (like most volume sliders do), use
   * [volumeLinear], or [@GlobalScope.dbToLinear] and [@GlobalScope.linearToDb].
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  /**
   * Volume of sound, as a linear value.
   * **Note:** This member modifies [volumeDb] for convenience. The returned value is equivalent to
   * the result of [@GlobalScope.dbToLinear] on [volumeDb]. Setting this member is equivalent to
   * setting [volumeDb] to the result of [@GlobalScope.linearToDb] on a value.
   */
  public final inline var volumeLinear: Float
    @JvmName("volumeLinearProperty")
    get() = getVolumeLinear()
    @JvmName("volumeLinearProperty")
    set(`value`) {
      setVolumeLinear(value)
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
  public final inline var playing: Boolean
    @JvmName("playingProperty")
    get() = isPlaying()
    @JvmName("playingProperty")
    set(`value`) {
      setPlaying(value)
    }

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
    createNativeObject(94, scriptIndex)
  }

  public final fun setStream(stream: AudioStream?): Unit {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(ptr, MethodBindings.setStreamPtr, NIL)
  }

  public final fun getStream(): AudioStream? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStream?)
  }

  public final fun setVolumeDb(volumeDb: Float): Unit {
    TransferContext.writeArguments(DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumeDbPtr, NIL)
  }

  public final fun getVolumeDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumeLinear(volumeLinear: Float): Unit {
    TransferContext.writeArguments(DOUBLE to volumeLinear.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumeLinearPtr, NIL)
  }

  public final fun getVolumeLinear(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumeLinearPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPitchScale(pitchScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPitchScalePtr, NIL)
  }

  public final fun getPitchScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPitchScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Plays a sound from the beginning, or the given [fromPosition] in seconds.
   */
  @JvmOverloads
  public final fun play(fromPosition: Float = 0.0f): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.playPtr, NIL)
  }

  /**
   * Restarts all sounds to be played from the given [toPosition], in seconds. Does nothing if no
   * sounds are playing.
   */
  public final fun seek(toPosition: Float): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops all sounds from this node.
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the position in the [AudioStream] of the latest sound, in seconds. Returns `0.0` if no
   * sounds are playing.
   * **Note:** The position is not always accurate, as the [AudioServer] does not mix audio every
   * processed frame. To get more accurate results, add [AudioServer.getTimeSinceLastMix] to the
   * returned position.
   * **Note:** This method always returns `0.0` if the [stream] is an [AudioStreamInteractive],
   * since it can have multiple clips playing at once.
   */
  public final fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBus(bus: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to bus)
    TransferContext.callMethod(ptr, MethodBindings.setBusPtr, NIL)
  }

  public final fun getBus(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBusPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setAutoplay(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun isAutoplayEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoplayEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMixTarget(mixTarget: MixTarget): Unit {
    TransferContext.writeArguments(LONG to mixTarget.id)
    TransferContext.callMethod(ptr, MethodBindings.setMixTargetPtr, NIL)
  }

  public final fun getMixTarget(): MixTarget {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMixTargetPtr, LONG)
    return AudioStreamPlayer.MixTarget.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPlaying(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPlayingPtr, NIL)
  }

  public final fun setStreamPaused(pause: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pause)
    TransferContext.callMethod(ptr, MethodBindings.setStreamPausedPtr, NIL)
  }

  public final fun getStreamPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMaxPolyphony(maxPolyphony: Int): Unit {
    TransferContext.writeArguments(LONG to maxPolyphony.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxPolyphonyPtr, NIL)
  }

  public final fun getMaxPolyphony(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPolyphonyPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if any sound is active, even if [streamPaused] is set to `true`. See also
   * [playing] and [getStreamPlayback].
   */
  public final fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the latest [AudioStreamPlayback] of this node, usually the most recently created by
   * [play]. If no sounds are playing, this method fails and returns an empty playback.
   */
  public final fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStreamPlayback?)
  }

  public final fun setPlaybackType(playbackType: AudioServer.PlaybackType): Unit {
    TransferContext.writeArguments(LONG to playbackType.id)
    TransferContext.callMethod(ptr, MethodBindings.setPlaybackTypePtr, NIL)
  }

  public final fun getPlaybackType(): AudioServer.PlaybackType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaybackTypePtr, LONG)
    return AudioServer.PlaybackType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class MixTarget(
    id: Long,
  ) {
    /**
     * The audio will be played only on the first channel. This is the default.
     */
    STEREO(0),
    /**
     * The audio will be played on all surround channels.
     */
    SURROUND(1),
    /**
     * The audio will be played on the second channel, which is usually the center.
     */
    CENTER(2),
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

  public object MethodBindings {
    internal val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream", 2210767741)

    internal val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream", 160907539)

    internal val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_volume_db", 373806689)

    internal val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_volume_db", 1740695150)

    internal val setVolumeLinearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_volume_linear", 373806689)

    internal val getVolumeLinearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_volume_linear", 1740695150)

    internal val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_pitch_scale", 373806689)

    internal val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_pitch_scale", 1740695150)

    internal val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "play", 1958160172)

    internal val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "seek", 373806689)

    internal val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "stop", 3218959716)

    internal val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_playing", 36873697)

    internal val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_playback_position", 191475506)

    internal val setBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_bus", 3304788590)

    internal val getBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_bus", 2002593661)

    internal val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_autoplay", 2586408642)

    internal val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_autoplay_enabled", 36873697)

    internal val setMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_mix_target", 2300306138)

    internal val getMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_mix_target", 172807476)

    internal val setPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_playing", 2586408642)

    internal val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream_paused", 2586408642)

    internal val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_paused", 36873697)

    internal val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_max_polyphony", 1286410249)

    internal val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_max_polyphony", 3905245786)

    internal val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "has_stream_playback", 2240911060)

    internal val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_playback", 210135309)

    internal val setPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_playback_type", 725473817)

    internal val getPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_playback_type", 4011264623)
  }
}
