// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
    createNativeObject(ENGINECLASS_AUDIOSTREAMPLAYER3D, scriptIndex)
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

  public final fun setUnitSize(unitSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to unitSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setUnitSizePtr, NIL)
  }

  public final fun getUnitSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUnitSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxDb(maxDb: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxDbPtr, NIL)
  }

  public final fun getMaxDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxDbPtr, DOUBLE)
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

  public final fun setMaxDistance(meters: Float): Unit {
    TransferContext.writeArguments(DOUBLE to meters.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxDistancePtr, NIL)
  }

  public final fun getMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxDistancePtr, DOUBLE)
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

  public final fun setEmissionAngle(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionAnglePtr, NIL)
  }

  public final fun getEmissionAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionAngleEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionAngleEnabledPtr, NIL)
  }

  public final fun isEmissionAngleEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmissionAngleEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEmissionAngleFilterAttenuationDb(db: Float): Unit {
    TransferContext.writeArguments(DOUBLE to db.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionAngleFilterAttenuationDbPtr, NIL)
  }

  public final fun getEmissionAngleFilterAttenuationDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionAngleFilterAttenuationDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationFilterCutoffHz(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAttenuationFilterCutoffHzPtr, NIL)
  }

  public final fun getAttenuationFilterCutoffHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttenuationFilterCutoffHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationFilterDb(db: Float): Unit {
    TransferContext.writeArguments(DOUBLE to db.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAttenuationFilterDbPtr, NIL)
  }

  public final fun getAttenuationFilterDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttenuationFilterDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttenuationModel(model: AttenuationModel): Unit {
    TransferContext.writeArguments(LONG to model.id)
    TransferContext.callMethod(ptr, MethodBindings.setAttenuationModelPtr, NIL)
  }

  public final fun getAttenuationModel(): AttenuationModel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttenuationModelPtr, LONG)
    return AudioStreamPlayer3D.AttenuationModel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDopplerTracking(mode: DopplerTracking): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDopplerTrackingPtr, NIL)
  }

  public final fun getDopplerTracking(): DopplerTracking {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDopplerTrackingPtr, LONG)
    return AudioStreamPlayer3D.DopplerTracking.from(TransferContext.readReturnValue(LONG) as Long)
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
   * Returns the [AudioStreamPlayback] object associated with this [AudioStreamPlayer3D].
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

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream", 2210767741)

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream", 160907539)

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_volume_db", 373806689)

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_volume_db", 1740695150)

    public val setUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_unit_size", 373806689)

    public val getUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_unit_size", 1740695150)

    public val setMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_db", 373806689)

    public val getMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_db", 1740695150)

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_pitch_scale", 373806689)

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_pitch_scale", 1740695150)

    public val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "play", 1958160172)

    public val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "seek", 373806689)

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "stop", 3218959716)

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_playing", 36873697)

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_position", 191475506)

    public val setBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_bus", 3304788590)

    public val getBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_bus", 2002593661)

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_autoplay", 2586408642)

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_autoplay_enabled", 36873697)

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_distance", 373806689)

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_distance", 1740695150)

    public val setAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_area_mask", 1286410249)

    public val getAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_area_mask", 3905245786)

    public val setEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle", 373806689)

    public val getEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle", 1740695150)

    public val setEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_enabled", 2586408642)

    public val isEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_emission_angle_enabled", 36873697)

    public val setEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db", 373806689)

    public val getEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db", 1740695150)

    public val setAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz", 373806689)

    public val getAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz", 1740695150)

    public val setAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_db", 373806689)

    public val getAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_db", 1740695150)

    public val setAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_model", 2988086229)

    public val getAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_model", 3035106060)

    public val setDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_doppler_tracking", 3968161450)

    public val getDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_doppler_tracking", 1702418664)

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream_paused", 2586408642)

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_paused", 36873697)

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_polyphony", 1286410249)

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_polyphony", 3905245786)

    public val setPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_panning_strength", 373806689)

    public val getPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_panning_strength", 1740695150)

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "has_stream_playback", 2240911060)

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_playback", 210135309)

    public val setPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_playback_type", 725473817)

    public val getPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_type", 4011264623)
  }
}
