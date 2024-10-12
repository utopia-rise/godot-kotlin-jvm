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

private const val ENGINE_CLASS_AUDIOSTREAMPLAYER3D_INDEX: Int = 130

/**
 * Plays audio with positional sound effects, based on the relative position of the audio listener.
 * Positional effects include distance attenuation, directionality, and the Doppler effect. For greater
 * realism, a low-pass filter is applied to distant sounds. This can be disabled by setting
 * [attenuationFilterCutoffHz] to `20500`.
 * By default, audio is heard from the camera position. This can be changed by adding an
 * [AudioListener3D] node to the scene and enabling it by calling [AudioListener3D.makeCurrent] on it.
 * See also [AudioStreamPlayer] to play a sound non-positionally.
 * **Note:** Hiding an [AudioStreamPlayer3D] node does not disable its audio output. To temporarily
 * disable an [AudioStreamPlayer3D]'s audio output, set [volumeDb] to a very low value like `-100`
 * (which isn't audible to human hearing).
 */
@GodotBaseType
public open class AudioStreamPlayer3D : Node3D() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by Signal0

  /**
   * The [AudioStream] resource to be played.
   */
  public final inline var stream: AudioStream?
    @JvmName("streamProperty")
    get() = getStream()
    @JvmName("streamProperty")
    set(`value`) {
      setStream(value)
    }

  /**
   * Decides if audio should get quieter with distance linearly, quadratically, logarithmically, or
   * not be affected by distance, effectively disabling attenuation.
   */
  public final inline var attenuationModel: AttenuationModel
    @JvmName("attenuationModelProperty")
    get() = getAttenuationModel()
    @JvmName("attenuationModelProperty")
    set(`value`) {
      setAttenuationModel(value)
    }

  /**
   * The base sound level before attenuation, in decibels.
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  /**
   * The factor for the attenuation effect. Higher values make the sound audible over a larger
   * distance.
   */
  public final inline var unitSize: Float
    @JvmName("unitSizeProperty")
    get() = getUnitSize()
    @JvmName("unitSizeProperty")
    set(`value`) {
      setUnitSize(value)
    }

  /**
   * Sets the absolute maximum of the sound level, in decibels.
   */
  public final inline var maxDb: Float
    @JvmName("maxDbProperty")
    get() = getMaxDb()
    @JvmName("maxDbProperty")
    set(`value`) {
      setMaxDb(value)
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
   * If `true`, audio plays when the AudioStreamPlayer3D node is added to scene tree.
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
   * The distance past which the sound can no longer be heard at all. Only has an effect if set to a
   * value greater than `0.0`. [maxDistance] works in tandem with [unitSize]. However, unlike
   * [unitSize] whose behavior depends on the [attenuationModel], [maxDistance] always works in a
   * linear fashion. This can be used to prevent the [AudioStreamPlayer3D] from requiring audio mixing
   * when the listener is far away, which saves CPU resources.
   */
  public final inline var maxDistance: Float
    @JvmName("maxDistanceProperty")
    get() = getMaxDistance()
    @JvmName("maxDistanceProperty")
    set(`value`) {
      setMaxDistance(value)
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
   * [ProjectSettings.audio/general/3dPanningStrength] with this factor. Higher values will pan audio
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
   * The bus on which this audio is playing.
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
   * Determines which [Area3D] layers affect the sound for reverb and audio bus effects. Areas can
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

  /**
   * If `true`, the audio should be attenuated according to the direction of the sound.
   */
  public final inline var emissionAngleEnabled: Boolean
    @JvmName("emissionAngleEnabledProperty")
    get() = isEmissionAngleEnabled()
    @JvmName("emissionAngleEnabledProperty")
    set(`value`) {
      setEmissionAngleEnabled(value)
    }

  /**
   * The angle in which the audio reaches a listener unattenuated.
   */
  public final inline var emissionAngleDegrees: Float
    @JvmName("emissionAngleDegreesProperty")
    get() = getEmissionAngle()
    @JvmName("emissionAngleDegreesProperty")
    set(`value`) {
      setEmissionAngle(value)
    }

  /**
   * Attenuation factor used if listener is outside of [emissionAngleDegrees] and
   * [emissionAngleEnabled] is set, in decibels.
   */
  public final inline var emissionAngleFilterAttenuationDb: Float
    @JvmName("emissionAngleFilterAttenuationDbProperty")
    get() = getEmissionAngleFilterAttenuationDb()
    @JvmName("emissionAngleFilterAttenuationDbProperty")
    set(`value`) {
      setEmissionAngleFilterAttenuationDb(value)
    }

  /**
   * The cutoff frequency of the attenuation low-pass filter, in Hz. A sound above this frequency is
   * attenuated more than a sound below this frequency. To disable this effect, set this to `20500` as
   * this frequency is above the human hearing limit.
   */
  public final inline var attenuationFilterCutoffHz: Float
    @JvmName("attenuationFilterCutoffHzProperty")
    get() = getAttenuationFilterCutoffHz()
    @JvmName("attenuationFilterCutoffHzProperty")
    set(`value`) {
      setAttenuationFilterCutoffHz(value)
    }

  /**
   * Amount how much the filter affects the loudness, in decibels.
   */
  public final inline var attenuationFilterDb: Float
    @JvmName("attenuationFilterDbProperty")
    get() = getAttenuationFilterDb()
    @JvmName("attenuationFilterDbProperty")
    set(`value`) {
      setAttenuationFilterDb(value)
    }

  /**
   * Decides in which step the Doppler effect should be calculated.
   */
  public final inline var dopplerTracking: DopplerTracking
    @JvmName("dopplerTrackingProperty")
    get() = getDopplerTracking()
    @JvmName("dopplerTrackingProperty")
    set(`value`) {
      setDopplerTracking(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMPLAYER3D_INDEX, scriptIndex)
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

  public final fun setUnitSize(unitSize: Float): Unit {
    Internals.writeArguments(DOUBLE to unitSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setUnitSizePtr, NIL)
  }

  public final fun getUnitSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUnitSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxDb(maxDb: Float): Unit {
    Internals.writeArguments(DOUBLE to maxDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxDbPtr, NIL)
  }

  public final fun getMaxDb(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxDbPtr, DOUBLE)
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
   * Queues the audio to play on the next physics frame, from the given position [fromPosition], in
   * seconds.
   */
  @JvmOverloads
  public final fun play(fromPosition: Float = 0.0f): Unit {
    Internals.writeArguments(DOUBLE to fromPosition.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public final fun seek(toPosition: Float): Unit {
    Internals.writeArguments(DOUBLE to toPosition.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops the audio.
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
   * Returns the position in the [AudioStream].
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

  public final fun setMaxDistance(meters: Float): Unit {
    Internals.writeArguments(DOUBLE to meters.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
  }

  public final fun getMaxDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAreaMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setAreaMaskPtr, NIL)
  }

  public final fun getAreaMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAreaMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEmissionAngle(degrees: Float): Unit {
    Internals.writeArguments(DOUBLE to degrees.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionAnglePtr, NIL)
  }

  public final fun getEmissionAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionAngleEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionAngleEnabledPtr, NIL)
  }

  public final fun isEmissionAngleEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEmissionAngleEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmissionAngleFilterAttenuationDb(db: Float): Unit {
    Internals.writeArguments(DOUBLE to db.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionAngleFilterAttenuationDbPtr, NIL)
  }

  public final fun getEmissionAngleFilterAttenuationDb(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionAngleFilterAttenuationDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationFilterCutoffHz(degrees: Float): Unit {
    Internals.writeArguments(DOUBLE to degrees.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAttenuationFilterCutoffHzPtr, NIL)
  }

  public final fun getAttenuationFilterCutoffHz(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttenuationFilterCutoffHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationFilterDb(db: Float): Unit {
    Internals.writeArguments(DOUBLE to db.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAttenuationFilterDbPtr, NIL)
  }

  public final fun getAttenuationFilterDb(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttenuationFilterDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationModel(model: AttenuationModel): Unit {
    Internals.writeArguments(LONG to model.id)
    Internals.callMethod(rawPtr, MethodBindings.setAttenuationModelPtr, NIL)
  }

  public final fun getAttenuationModel(): AttenuationModel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttenuationModelPtr, LONG)
    return AudioStreamPlayer3D.AttenuationModel.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDopplerTracking(mode: DopplerTracking): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDopplerTrackingPtr, NIL)
  }

  public final fun getDopplerTracking(): DopplerTracking {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDopplerTrackingPtr, LONG)
    return AudioStreamPlayer3D.DopplerTracking.from(Internals.readReturnValue(LONG) as Long)
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

  public final fun setPanningStrength(panningStrength: Float): Unit {
    Internals.writeArguments(DOUBLE to panningStrength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPanningStrengthPtr, NIL)
  }

  public final fun getPanningStrength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPanningStrengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns whether the [AudioStreamPlayer] can return the [AudioStreamPlayback] object or not.
   */
  public final fun hasStreamPlayback(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [AudioStreamPlayback] object associated with this [AudioStreamPlayer3D].
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

  public enum class AttenuationModel(
    id: Long,
  ) {
    /**
     * Attenuation of loudness according to linear distance.
     */
    ATTENUATION_INVERSE_DISTANCE(0),
    /**
     * Attenuation of loudness according to squared distance.
     */
    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),
    /**
     * Attenuation of loudness according to logarithmic distance.
     */
    ATTENUATION_LOGARITHMIC(2),
    /**
     * No attenuation of loudness according to distance. The sound will still be heard positionally,
     * unlike an [AudioStreamPlayer]. [ATTENUATION_DISABLED] can be combined with a [maxDistance] value
     * greater than `0.0` to achieve linear attenuation clamped to a sphere of a defined size.
     */
    ATTENUATION_DISABLED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AttenuationModel = entries.single { it.id == `value` }
    }
  }

  public enum class DopplerTracking(
    id: Long,
  ) {
    /**
     * Disables doppler tracking.
     */
    DOPPLER_TRACKING_DISABLED(0),
    /**
     * Executes doppler tracking during process frames (see [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    DOPPLER_TRACKING_IDLE_STEP(1),
    /**
     * Executes doppler tracking during physics frames (see
     * [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    DOPPLER_TRACKING_PHYSICS_STEP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DopplerTracking = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_stream", 2210767741)

    internal val getStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_stream", 160907539)

    internal val setVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_volume_db", 373806689)

    internal val getVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_volume_db", 1740695150)

    internal val setUnitSizePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_unit_size", 373806689)

    internal val getUnitSizePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_unit_size", 1740695150)

    internal val setMaxDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_max_db", 373806689)

    internal val getMaxDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_max_db", 1740695150)

    internal val setPitchScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_pitch_scale", 373806689)

    internal val getPitchScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_pitch_scale", 1740695150)

    internal val playPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "play", 1958160172)

    internal val seekPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "seek", 373806689)

    internal val stopPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "stop", 3218959716)

    internal val isPlayingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "is_playing", 36873697)

    internal val getPlaybackPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_position", 191475506)

    internal val setBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_bus", 3304788590)

    internal val getBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_bus", 2002593661)

    internal val setAutoplayPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_autoplay", 2586408642)

    internal val isAutoplayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "is_autoplay_enabled", 36873697)

    internal val setMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_max_distance", 373806689)

    internal val getMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_max_distance", 1740695150)

    internal val setAreaMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_area_mask", 1286410249)

    internal val getAreaMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_area_mask", 3905245786)

    internal val setEmissionAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle", 373806689)

    internal val getEmissionAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle", 1740695150)

    internal val setEmissionAngleEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_enabled", 2586408642)

    internal val isEmissionAngleEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "is_emission_angle_enabled", 36873697)

    internal val setEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db", 373806689)

    internal val getEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db", 1740695150)

    internal val setAttenuationFilterCutoffHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz", 373806689)

    internal val getAttenuationFilterCutoffHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz", 1740695150)

    internal val setAttenuationFilterDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_db", 373806689)

    internal val getAttenuationFilterDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_db", 1740695150)

    internal val setAttenuationModelPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_model", 2988086229)

    internal val getAttenuationModelPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_model", 3035106060)

    internal val setDopplerTrackingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_doppler_tracking", 3968161450)

    internal val getDopplerTrackingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_doppler_tracking", 1702418664)

    internal val setStreamPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_stream_paused", 2586408642)

    internal val getStreamPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_paused", 36873697)

    internal val setMaxPolyphonyPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_max_polyphony", 1286410249)

    internal val getMaxPolyphonyPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_max_polyphony", 3905245786)

    internal val setPanningStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_panning_strength", 373806689)

    internal val getPanningStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_panning_strength", 1740695150)

    internal val hasStreamPlaybackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "has_stream_playback", 2240911060)

    internal val getStreamPlaybackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_playback", 210135309)

    internal val setPlaybackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "set_playback_type", 725473817)

    internal val getPlaybackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_type", 4011264623)
  }
}
