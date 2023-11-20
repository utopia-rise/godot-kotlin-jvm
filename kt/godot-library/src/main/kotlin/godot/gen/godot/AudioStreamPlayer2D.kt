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
 * Plays positional sound in 2D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_streams.html]($DOCS_URL/tutorials/audio/audio_streams.html)
 *
 * Plays audio that is attenuated with distance to the listener.
 *
 * By default, audio is heard from the screen center. This can be changed by adding an [godot.AudioListener2D] node to the scene and enabling it by calling [godot.AudioListener2D.makeCurrent] on it.
 *
 * See also [godot.AudioStreamPlayer] to play a sound non-positionally.
 *
 * **Note:** Hiding an [godot.AudioStreamPlayer2D] node does not disable its audio output. To temporarily disable an [godot.AudioStreamPlayer2D]'s audio output, set [volumeDb] to a very low value like `-100` (which isn't audible to human hearing).
 */
@GodotBaseType
public open class AudioStreamPlayer2D : Node2D() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by signal()

  /**
   * The [godot.AudioStream] object to be played.
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
   * Base volume before attenuation.
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
   * If `true`, audio plays when added to scene tree.
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
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
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
   * Maximum distance from which audio is still hearable.
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
   * The volume is attenuated over distance with this as an exponent.
   */
  public var attenuation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttenuationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttenuationPtr, NIL)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds after this value is reached will cut off the oldest sounds.
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
   * Scales the panning strength for this node by multiplying the base [godot.ProjectSettings.audio/general/2dPanningStrength] with this factor. Higher values will pan audio from left to right more dramatically than lower values.
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
   * Bus on which this audio is playing.
   *
   * **Note:** When setting this property, keep in mind that no validation is performed to see if the given name matches an existing bus. This is because audio bus layouts might be loaded after this property is set. If this given name can't be resolved at runtime, it will fall back to `"Master"`.
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
   * Determines which [godot.Area2D] layers affect the sound for reverb and audio bus effects. Areas can be used to redirect [godot.AudioStream]s so that they play in a certain audio bus. An example of how you might use this is making a "water" area so that sounds played in the water are redirected through an audio bus to make them sound like they are being played underwater.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER2D, scriptIndex)
    return true
  }

  /**
   * Queues the audio to play on the next physics frame, from the given position [fromPosition], in seconds.
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
   * Returns the position in the [godot.AudioStream].
   */
  public fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns whether the [godot.AudioStreamPlayer] can return the [godot.AudioStreamPlayback] object or not.
   */
  public fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer2D].
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_volume_db")

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_pitch_scale")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "play")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "seek")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "is_playing")

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_playback_position")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_bus")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_autoplay")

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "is_autoplay_enabled")

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_max_distance")

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_max_distance")

    public val setAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_attenuation")

    public val getAttenuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_attenuation")

    public val setAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_area_mask")

    public val getAreaMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_area_mask")

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_stream_paused")

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream_paused")

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_max_polyphony")

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_max_polyphony")

    public val setPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "set_panning_strength")

    public val getPanningStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_panning_strength")

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "has_stream_playback")

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer2D", "get_stream_playback")
  }
}
