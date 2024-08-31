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
  public val finished: Signal0 by signal()

  /**
   * The [AudioStream] resource to be played.
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
   * Decides if audio should get quieter with distance linearly, quadratically, logarithmically, or
   * not be affected by distance, effectively disabling attenuation.
   */
  public var attenuationModel: AttenuationModel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationModelPtr, LONG)
      return AudioStreamPlayer3D.AttenuationModel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationModelPtr, NIL)
    }

  /**
   * The base sound level before attenuation, in decibels.
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
   * The factor for the attenuation effect. Higher values make the sound audible over a larger
   * distance.
   */
  public var unitSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnitSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUnitSizePtr, NIL)
    }

  /**
   * Sets the absolute maximum of the sound level, in decibels.
   */
  public var maxDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDbPtr, NIL)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
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
   * If `true`, audio is playing or is queued to be played (see [play]).
   */
  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

  /**
   * If `true`, audio plays when the AudioStreamPlayer3D node is added to scene tree.
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
   * If `true`, the playback is paused. You can resume it by setting [streamPaused] to `false`.
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
   * The distance past which the sound can no longer be heard at all. Only has an effect if set to a
   * value greater than `0.0`. [maxDistance] works in tandem with [unitSize]. However, unlike
   * [unitSize] whose behavior depends on the [attenuationModel], [maxDistance] always works in a
   * linear fashion. This can be used to prevent the [AudioStreamPlayer3D] from requiring audio mixing
   * when the listener is far away, which saves CPU resources.
   */
  public var maxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds
   * after this value is reached will cut off the oldest sounds.
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
   * Scales the panning strength for this node by multiplying the base
   * [ProjectSettings.audio/general/3dPanningStrength] with this factor. Higher values will pan audio
   * from left to right more dramatically than lower values.
   */
  public var panningStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanningStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPanningStrengthPtr, NIL)
    }

  /**
   * The bus on which this audio is playing.
   * **Note:** When setting this property, keep in mind that no validation is performed to see if
   * the given name matches an existing bus. This is because audio bus layouts might be loaded after
   * this property is set. If this given name can't be resolved at runtime, it will fall back to
   * `"Master"`.
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
   * Determines which [Area3D] layers affect the sound for reverb and audio bus effects. Areas can
   * be used to redirect [AudioStream]s so that they play in a certain audio bus. An example of how you
   * might use this is making a "water" area so that sounds played in the water are redirected through
   * an audio bus to make them sound like they are being played underwater.
   */
  public var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAreaMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAreaMaskPtr, NIL)
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

  /**
   * If `true`, the audio should be attenuated according to the direction of the sound.
   */
  public var emissionAngleEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEmissionAngleEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAngleEnabledPtr, NIL)
    }

  /**
   * The angle in which the audio reaches a listener unattenuated.
   */
  public var emissionAngleDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAnglePtr, NIL)
    }

  /**
   * Attenuation factor used if listener is outside of [emissionAngleDegrees] and
   * [emissionAngleEnabled] is set, in decibels.
   */
  public var emissionAngleFilterAttenuationDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEmissionAngleFilterAttenuationDbPtr,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEmissionAngleFilterAttenuationDbPtr, NIL)
    }

  /**
   * The cutoff frequency of the attenuation low-pass filter, in Hz. A sound above this frequency is
   * attenuated more than a sound below this frequency. To disable this effect, set this to `20500` as
   * this frequency is above the human hearing limit.
   */
  public var attenuationFilterCutoffHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationFilterCutoffHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationFilterCutoffHzPtr, NIL)
    }

  /**
   * Amount how much the filter affects the loudness, in decibels.
   */
  public var attenuationFilterDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationFilterDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationFilterDbPtr, NIL)
    }

  /**
   * Decides in which step the Doppler effect should be calculated.
   */
  public var dopplerTracking: DopplerTracking
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDopplerTrackingPtr, LONG)
      return AudioStreamPlayer3D.DopplerTracking.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDopplerTrackingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER3D, scriptIndex)
  }

  /**
   * Queues the audio to play on the next physics frame, from the given position [fromPosition], in
   * seconds.
   */
  @JvmOverloads
  public fun play(fromPosition: Float = 0.0f): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public fun seek(toPosition: Float): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops the audio.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns the position in the [AudioStream].
   */
  public fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns whether the [AudioStreamPlayer] can return the [AudioStreamPlayback] object or not.
   */
  public fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [AudioStreamPlayback] object associated with this [AudioStreamPlayer3D].
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
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
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_volume_db")

    public val setUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_unit_size")

    public val getUnitSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_unit_size")

    public val setMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_db")

    public val getMaxDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_db")

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_pitch_scale")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "play")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "seek")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_playing")

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_position")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_bus")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_autoplay")

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_autoplay_enabled")

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_distance")

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_distance")

    public val setAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_area_mask")

    public val getAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_area_mask")

    public val setEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle")

    public val getEmissionAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle")

    public val setEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_enabled")

    public val isEmissionAngleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "is_emission_angle_enabled")

    public val setEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db")

    public val getEmissionAngleFilterAttenuationDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db")

    public val setAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz")

    public val getAttenuationFilterCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz")

    public val setAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_filter_db")

    public val getAttenuationFilterDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_filter_db")

    public val setAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_attenuation_model")

    public val getAttenuationModelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_attenuation_model")

    public val setDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_doppler_tracking")

    public val getDopplerTrackingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_doppler_tracking")

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_stream_paused")

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_paused")

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_max_polyphony")

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_max_polyphony")

    public val setPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_panning_strength")

    public val getPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_panning_strength")

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "has_stream_playback")

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_stream_playback")

    public val setPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "set_playback_type")

    public val getPlaybackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer3D", "get_playback_type")
  }
}
