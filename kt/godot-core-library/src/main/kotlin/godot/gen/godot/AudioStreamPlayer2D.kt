// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
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
 * Plays audio that is attenuated with distance to the listener.
 * By default, audio is heard from the screen center. This can be changed by adding an
 * [AudioListener2D] node to the scene and enabling it by calling [AudioListener2D.makeCurrent] on it.
 * See also [AudioStreamPlayer] to play a sound non-positionally.
 * **Note:** Hiding an [AudioStreamPlayer2D] node does not disable its audio output. To temporarily
 * disable an [AudioStreamPlayer2D]'s audio output, set [volumeDb] to a very low value like `-100`
 * (which isn't audible to human hearing).
 */
@GodotBaseType
public open class AudioStreamPlayer2D : Node2D() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by Signal0

  /**
   * The [AudioStream] object to be played.
   */
  public final inline var stream: AudioStream?
    @JvmName("streamProperty")
    get() = getStream()
    @JvmName("streamProperty")
    set(`value`) {
      setStream(value)
    }

  /**
   * Base volume before attenuation.
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public final inline var pitchScale: Float
    @JvmName("pitchScaleProperty")
    get() = getPitchScale()
    @JvmName("pitchScaleProperty")
    set(`value`) {
      setPitchScale(value)
    }

  /**
   * If `true`, audio is playing or is queued to be played (see [play]).
   */
  public final inline val playing: Boolean
    @JvmName("playingProperty")
    get() = isPlaying()

  /**
   * If `true`, audio plays when added to scene tree.
   */
  public final inline var autoplay: Boolean
    @JvmName("autoplayProperty")
    get() = isAutoplayEnabled()
    @JvmName("autoplayProperty")
    set(`value`) {
      setAutoplay(value)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting [streamPaused] to `false`.
   */
  public final inline var streamPaused: Boolean
    @JvmName("streamPausedProperty")
    get() = getStreamPaused()
    @JvmName("streamPausedProperty")
    set(`value`) {
      setStreamPaused(value)
    }

  /**
   * Maximum distance from which audio is still hearable.
   */
  public final inline var maxDistance: Float
    @JvmName("maxDistanceProperty")
    get() = getMaxDistance()
    @JvmName("maxDistanceProperty")
    set(`value`) {
      setMaxDistance(value)
    }

  /**
   * The volume is attenuated over distance with this as an exponent.
   */
  public final inline var attenuation: Float
    @JvmName("attenuationProperty")
    get() = getAttenuation()
    @JvmName("attenuationProperty")
    set(`value`) {
      setAttenuation(value)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds
   * after this value is reached will cut off the oldest sounds.
   */
  public final inline var maxPolyphony: Int
    @JvmName("maxPolyphonyProperty")
    get() = getMaxPolyphony()
    @JvmName("maxPolyphonyProperty")
    set(`value`) {
      setMaxPolyphony(value)
    }

  /**
   * Scales the panning strength for this node by multiplying the base
   * [ProjectSettings.audio/general/2dPanningStrength] with this factor. Higher values will pan audio
   * from left to right more dramatically than lower values.
   */
  public final inline var panningStrength: Float
    @JvmName("panningStrengthProperty")
    get() = getPanningStrength()
    @JvmName("panningStrengthProperty")
    set(`value`) {
      setPanningStrength(value)
    }

  /**
   * Bus on which this audio is playing.
   * **Note:** When setting this property, keep in mind that no validation is performed to see if
   * the given name matches an existing bus. This is because audio bus layouts might be loaded after
   * this property is set. If this given name can't be resolved at runtime, it will fall back to
   * `"Master"`.
   */
  public final inline var bus: StringName
    @JvmName("busProperty")
    get() = getBus()
    @JvmName("busProperty")
    set(`value`) {
      setBus(value)
    }

  /**
   * Determines which [Area2D] layers affect the sound for reverb and audio bus effects. Areas can
   * be used to redirect [AudioStream]s so that they play in a certain audio bus. An example of how you
   * might use this is making a "water" area so that sounds played in the water are redirected through
   * an audio bus to make them sound like they are being played underwater.
   */
  public final inline var areaMask: Long
    @JvmName("areaMaskProperty")
    get() = getAreaMask()
    @JvmName("areaMaskProperty")
    set(`value`) {
      setAreaMask(value)
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
    MemoryManager.createNativeObject(ENGINECLASS_AUDIOSTREAMPLAYER2D, this, scriptIndex)
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
   * Queues the audio to play on the next physics frame, from the given position [fromPosition], in
   * seconds.
   */
  @JvmOverloads
  public final fun play(fromPosition: Float = 0.0f): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.playPtr, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public final fun seek(toPosition: Float): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops the audio.
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
   * Returns the position in the [AudioStream].
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

  public final fun setMaxDistance(pixels: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pixels.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxDistancePtr, NIL)
  }

  public final fun getMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuation(curve: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curve.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAttenuationPtr, NIL)
  }

  public final fun getAttenuation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttenuationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAreaMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setAreaMaskPtr, NIL)
  }

  public final fun getAreaMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAreaMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setPanningStrength(panningStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to panningStrength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPanningStrengthPtr, NIL)
  }

  public final fun getPanningStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPanningStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns whether the [AudioStreamPlayer] can return the [AudioStreamPlayback] object or not.
   */
  public final fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [AudioStreamPlayback] object associated with this [AudioStreamPlayer2D].
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

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_stream", 2210767741)

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream", 160907539)

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_volume_db", 373806689)

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_volume_db", 1740695150)

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_pitch_scale", 373806689)

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_pitch_scale", 1740695150)

    public val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "play", 1958160172)

    public val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "seek", 373806689)

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "stop", 3218959716)

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "is_playing", 36873697)

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_playback_position", 191475506)

    public val setBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_bus", 3304788590)

    public val getBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_bus", 2002593661)

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_autoplay", 2586408642)

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "is_autoplay_enabled", 36873697)

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_max_distance", 373806689)

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_max_distance", 1740695150)

    public val setAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_attenuation", 373806689)

    public val getAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_attenuation", 1740695150)

    public val setAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_area_mask", 1286410249)

    public val getAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_area_mask", 3905245786)

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_stream_paused", 2586408642)

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream_paused", 36873697)

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_max_polyphony", 1286410249)

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_max_polyphony", 3905245786)

    public val setPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_panning_strength", 373806689)

    public val getPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_panning_strength", 1740695150)

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "has_stream_playback", 2240911060)

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream_playback", 210135309)

    public val setPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_playback_type", 725473817)

    public val getPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_playback_type", 4011264623)
  }
}
