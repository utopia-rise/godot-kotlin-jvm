// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * Plays back audio non-positionally.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * Plays an audio stream non-positionally.
 *
 * To play audio positionally, use [godot.AudioStreamPlayer2D] or [godot.AudioStreamPlayer3D] instead of [godot.AudioStreamPlayer].
 */
@GodotBaseType
public open class AudioStreamPlayer : Node() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by signal()

  /**
   * If `true`, audio plays when added to scene tree.
   */
  public open var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_AUTOPLAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_AUTOPLAY,
          NIL)
    }

  /**
   * Bus on which this audio is playing.
   *
   * **Note:** When setting this property, keep in mind that no validation is performed to see if the given name matches an existing bus. This is because audio bus layouts might be loaded after this property is set. If this given name can't be resolved at runtime, it will fall back to `"Master"`.
   */
  public open var bus: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_BUS, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_BUS, NIL)
    }

  /**
   * If the audio configuration has more than two speakers, this sets the target channels. See [enum MixTarget] constants.
   */
  public open var mixTarget: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_MIX_TARGET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_MIX_TARGET,
          NIL)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_PITCH_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_PITCH_SCALE,
          NIL)
    }

  /**
   * If `true`, audio is playing.
   */
  public open val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_PLAYING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * The [godot.AudioStream] object to be played.
   */
  public open var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_STREAM,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_STREAM, NIL)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
   */
  public open var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_STREAM_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_STREAM_PAUSED, NIL)
    }

  /**
   * Volume of sound, in dB.
   */
  public open var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_VOLUME_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SET_VOLUME_DB,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER)
  }

  public open fun _busLayoutChanged(): Unit {
  }

  public open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for AudioStreamPlayer")
  }

  public open fun _setPlaying(enable: Boolean): Unit {
  }

  /**
   * Returns the position in the [godot.AudioStream] in seconds.
   */
  public open fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_PLAYBACK_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer].
   */
  public open fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_GET_STREAM_PLAYBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  /**
   * Plays the audio from the given `from_position`, in seconds.
   */
  public open fun play(fromPosition: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_PLAY, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public open fun seek(toPosition: Double): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_SEEK, NIL)
  }

  /**
   * Stops the audio.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER_STOP, NIL)
  }

  public enum class MixTarget(
    id: Long
  ) {
    /**
     * The audio will be played only on the first channel.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The audio will be played on the second channel, which is usually the center.
     */
    public final const val MIX_TARGET_CENTER: Long = 2

    /**
     * The audio will be played only on the first channel.
     */
    public final const val MIX_TARGET_STEREO: Long = 0

    /**
     * The audio will be played on all surround channels.
     */
    public final const val MIX_TARGET_SURROUND: Long = 1
  }
}
