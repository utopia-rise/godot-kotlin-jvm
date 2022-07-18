// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays positional sound in 3D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_streams.html]($DOCS_URL/tutorials/audio/audio_streams.html)
 *
 * Plays a sound effect with directed sound effects, dampens with distance if needed, generates effect of hearable position in space. For greater realism, a low-pass filter is automatically applied to distant sounds. This can be disabled by setting [attenuationFilterCutoffHz] to `20500`.
 *
 * By default, audio is heard from the camera position. This can be changed by adding a [godot.AudioListener3D] node to the scene and enabling it by calling [godot.AudioListener3D.makeCurrent] on it.
 *
 * See also [godot.AudioStreamPlayer] to play a sound non-positionally.
 *
 * **Note:** Hiding an [godot.AudioStreamPlayer3D] node does not disable its audio output. To temporarily disable an [godot.AudioStreamPlayer3D]'s audio output, set [unitDb] to a very low value like `-100` (which isn't audible to human hearing).
 */
@GodotBaseType
public open class AudioStreamPlayer3D : Node3D() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by signal()

  /**
   * The [godot.AudioStream] resource to be played.
   */
  public var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_STREAM,
          NIL.ordinal)
    }

  /**
   * Decides if audio should get quieter with distance linearly, quadratically, logarithmically, or not be affected by distance, effectively disabling attenuation.
   */
  public var attenuationModel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_MODEL, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_MODEL, NIL.ordinal)
    }

  /**
   * The base sound level unaffected by dampening, in decibels.
   */
  public var unitDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_UNIT_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_UNIT_DB,
          NIL.ordinal)
    }

  /**
   * The factor for the attenuation effect. Higher values make the sound audible over a larger distance.
   */
  public var unitSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_UNIT_SIZE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_UNIT_SIZE,
          NIL.ordinal)
    }

  /**
   * Sets the absolute maximum of the soundlevel, in decibels.
   */
  public var maxDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_MAX_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_MAX_DB,
          NIL.ordinal)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_PITCH_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_PITCH_SCALE,
          NIL.ordinal)
    }

  /**
   * If `true`, audio is playing.
   */
  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_IS_PLAYING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * If `true`, audio plays when the AudioStreamPlayer3D node is added to scene tree.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_IS_AUTOPLAY_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_AUTOPLAY,
          NIL.ordinal)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting [streamPaused] to `false`.
   */
  public var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM_PAUSED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_STREAM_PAUSED,
          NIL.ordinal)
    }

  /**
   * The distance past which the sound can no longer be heard at all. Only has an effect if set to a value greater than `0.0`. [maxDistance] works in tandem with [unitSize]. However, unlike [unitSize] whose behavior depends on the [attenuationModel], [maxDistance] always works in a linear fashion. This can be used to prevent the [godot.AudioStreamPlayer3D] from requiring audio mixing when the listener is far away, which saves CPU resources.
   */
  public var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_MAX_DISTANCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_MAX_DISTANCE,
          NIL.ordinal)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds after this value is reached will cut off the oldest sounds.
   */
  public var maxPolyphony: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_MAX_POLYPHONY,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_MAX_POLYPHONY,
          NIL.ordinal)
    }

  /**
   * The bus on which this audio is playing.
   *
   * **Note:** When setting this property, keep in mind that no validation is performed to see if the given name matches an existing bus. This is because audio bus layouts might be loaded after this property is set. If this given name can't be resolved at runtime, it will fall back to `"Master"`.
   */
  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_BUS,
          STRING_NAME.ordinal)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_BUS,
          NIL.ordinal)
    }

  /**
   * Determines which [godot.Area3D] layers affect the sound for reverb and audio bus effects. Areas can be used to redirect [godot.AudioStream]s so that they play in a certain audio bus. An example of how you might use this is making a "water" area so that sounds played in the water are redirected through an audio bus to make them sound like they are being played underwater.
   */
  public var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_AREA_MASK,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_AREA_MASK,
          NIL.ordinal)
    }

  /**
   * If `true`, the audio should be dampened according to the direction of the sound.
   */
  public var emissionAngleEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_IS_EMISSION_ANGLE_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE_ENABLED, NIL.ordinal)
    }

  /**
   * The angle in which the audio reaches cameras undampened.
   */
  public var emissionAngleDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_EMISSION_ANGLE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE,
          NIL.ordinal)
    }

  /**
   * Dampens audio if camera is outside of [emissionAngleDegrees] and [emissionAngleEnabled] is set by this factor, in decibels.
   */
  public var emissionAngleFilterAttenuationDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_EMISSION_ANGLE_FILTER_ATTENUATION_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_EMISSION_ANGLE_FILTER_ATTENUATION_DB,
          NIL.ordinal)
    }

  /**
   * Dampens audio using a low-pass filter above this frequency, in Hz. To disable the dampening effect entirely, set this to `20500` as this frequency is above the human hearing limit.
   */
  public var attenuationFilterCutoffHz: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_FILTER_CUTOFF_HZ,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_FILTER_CUTOFF_HZ,
          NIL.ordinal)
    }

  /**
   * Amount how much the filter affects the loudness, in decibels.
   */
  public var attenuationFilterDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_ATTENUATION_FILTER_DB, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_ATTENUATION_FILTER_DB, NIL.ordinal)
    }

  /**
   * Decides in which step the Doppler effect should be calculated.
   */
  public var dopplerTracking: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_DOPPLER_TRACKING, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SET_DOPPLER_TRACKING, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER3D)
  }

  /**
   * Plays the audio from the given position `from_position`, in seconds.
   */
  public fun play(fromPosition: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_PLAY, NIL.ordinal)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public fun seek(toPosition: Double): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_SEEK, NIL.ordinal)
  }

  /**
   * Stops the audio.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_STOP, NIL.ordinal)
  }

  /**
   * Returns the position in the [godot.AudioStream].
   */
  public fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_PLAYBACK_POSITION, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer3D].
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER3D_GET_STREAM_PLAYBACK,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  public enum class AttenuationModel(
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
     * No dampening of loudness according to distance. The sound will still be heard positionally, unlike an [godot.AudioStreamPlayer]. [ATTENUATION_DISABLED] can be combined with a [maxDistance] value greater than `0.0` to achieve linear attenuation clamped to a sphere of a defined size.
     */
    ATTENUATION_DISABLED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DopplerTracking(
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
    DOPPLER_TRACKING_PHYSICS_STEP(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
