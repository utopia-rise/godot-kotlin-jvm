// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Plays 3D sound in 3D space.
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html](https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html)
 * 
 * Plays a sound effect with directed sound effects, dampens with distance if needed, generates effect of hearable position in space.
 *
 * By default, audio is heard from the camera position. This can be changed by adding a [godot.Listener] node to the scene and enabling it by calling [godot.Listener.makeCurrent] on it.
 */
@GodotBaseType
open class AudioStreamPlayer3D : Spatial() {
  /**
   * Emitted when the audio stops playing.
   */
  val finished: Signal0 by signal()

  /**
   * Areas in which this sound plays.
   */
  open var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_AREA_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_AREA_MASK,
          NIL)
    }

  /**
   * Dampens audio above this frequency, in Hz.
   */
  open var attenuationFilterCutoffHz: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_FILTER_CUTOFF_HZ, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_FILTER_CUTOFF_HZ, NIL)
    }

  /**
   * Amount how much the filter affects the loudness, in dB.
   */
  open var attenuationFilterDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_FILTER_DB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_FILTER_DB, NIL)
    }

  /**
   * Decides if audio should get quieter with distance linearly, quadratically, logarithmically, or not be affected by distance, effectively disabling attenuation.
   */
  open var attenuationModel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_MODEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_MODEL, NIL)
    }

  /**
   * If `true`, audio plays when added to scene tree.
   */
  open var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_AUTOPLAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_AUTOPLAY,
          NIL)
    }

  /**
   * Bus on which this audio is playing.
   */
  open var bus: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_BUS,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_BUS, NIL)
    }

  /**
   * Decides in which step the Doppler effect should be calculated.
   */
  open var dopplerTracking: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_DOPPLER_TRACKING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_DOPPLER_TRACKING, NIL)
    }

  /**
   * The angle in which the audio reaches cameras undampened.
   */
  open var emissionAngleDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_EMISSION_ANGLE_DEGREES, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE_DEGREES, NIL)
    }

  /**
   * If `true`, the audio should be dampened according to the direction of the sound.
   */
  open var emissionAngleEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_EMISSION_ANGLE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE_ENABLED, NIL)
    }

  /**
   * Dampens audio if camera is outside of [emissionAngleDegrees] and [emissionAngleEnabled] is set by this factor, in dB.
   */
  open var emissionAngleFilterAttenuationDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_EMISSION_ANGLE_FILTER_ATTENUATION_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE_FILTER_ATTENUATION_DB,
          NIL)
    }

  /**
   * Sets the absolute maximum of the soundlevel, in dB.
   */
  open var maxDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_MAX_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_MAX_DB,
          NIL)
    }

  /**
   * Sets the distance from which the [outOfRangeMode] takes effect. Has no effect if set to 0.
   */
  open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_MAX_DISTANCE, NIL)
    }

  /**
   * Decides if audio should pause when source is outside of [maxDistance] range.
   */
  open var outOfRangeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_OUT_OF_RANGE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_OUT_OF_RANGE_MODE, NIL)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_PITCH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_PITCH_SCALE, NIL)
    }

  /**
   * If `true`, audio is playing.
   */
  open val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_PLAYING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * The [godot.AudioStream] object to be played.
   */
  open var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_STREAM,
          NIL)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
   */
  open var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_STREAM_PAUSED, NIL)
    }

  /**
   * Base sound level unaffected by dampening, in dB.
   */
  open var unitDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_UNIT_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_UNIT_DB,
          NIL)
    }

  /**
   * Factor for the attenuation effect.
   */
  open var unitSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_UNIT_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_UNIT_SIZE,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER3D)
  }

  open fun _busLayoutChanged() {
  }

  open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer3D")
  }

  open fun _setPlaying(enable: Boolean) {
  }

  /**
   * Returns the position in the [godot.AudioStream].
   */
  open fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_PLAYBACK_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer3D].
   */
  open fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM_PLAYBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  /**
   * Plays the audio from the given position `from_position`, in seconds.
   */
  open fun play(fromPosition: Double = 0.0) {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_PLAY, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  open fun seek(toPosition: Double) {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SEEK, NIL)
  }

  /**
   * Stops the audio.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_STOP, NIL)
  }

  enum class AttenuationModel(
    id: Long
  ) {
    /**
     * Linear dampening of loudness according to distance.
     */
    ATTENUATION_INVERSE_DISTANCE(0),

    /**
     * Squared dampening of loudness according to distance.
     */
    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),

    /**
     * Logarithmic dampening of loudness according to distance.
     */
    ATTENUATION_LOGARITHMIC(2),

    /**
     * No dampening of loudness according to distance.
     */
    ATTENUATION_DISABLED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class OutOfRangeMode(
    id: Long
  ) {
    /**
     * Mix this audio in, even when it's out of range.
     */
    OUT_OF_RANGE_MIX(0),

    /**
     * Pause this audio when it gets out of range.
     */
    OUT_OF_RANGE_PAUSE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DopplerTracking(
    id: Long
  ) {
    /**
     * Disables doppler tracking.
     */
    DOPPLER_TRACKING_DISABLED(0),

    /**
     * Executes doppler tracking in idle step.
     */
    DOPPLER_TRACKING_IDLE_STEP(1),

    /**
     * Executes doppler tracking in physics step.
     */
    DOPPLER_TRACKING_PHYSICS_STEP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * No dampening of loudness according to distance.
     */
    final const val ATTENUATION_DISABLED: Long = 3

    /**
     * Linear dampening of loudness according to distance.
     */
    final const val ATTENUATION_INVERSE_DISTANCE: Long = 0

    /**
     * Squared dampening of loudness according to distance.
     */
    final const val ATTENUATION_INVERSE_SQUARE_DISTANCE: Long = 1

    /**
     * Logarithmic dampening of loudness according to distance.
     */
    final const val ATTENUATION_LOGARITHMIC: Long = 2

    /**
     * Disables doppler tracking.
     */
    final const val DOPPLER_TRACKING_DISABLED: Long = 0

    /**
     * Executes doppler tracking in idle step.
     */
    final const val DOPPLER_TRACKING_IDLE_STEP: Long = 1

    /**
     * Executes doppler tracking in physics step.
     */
    final const val DOPPLER_TRACKING_PHYSICS_STEP: Long = 2

    /**
     * Mix this audio in, even when it's out of range.
     */
    final const val OUT_OF_RANGE_MIX: Long = 0

    /**
     * Pause this audio when it gets out of range.
     */
    final const val OUT_OF_RANGE_PAUSE: Long = 1
  }
}
