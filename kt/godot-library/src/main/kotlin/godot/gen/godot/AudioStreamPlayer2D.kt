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
 * Plays positional sound in 2D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_streams.html]($DOCS_URL/tutorials/audio/audio_streams.html)
 *
 * Plays audio that dampens with distance from screen center.
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
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM,
          NIL.ordinal)
    }

  /**
   * Base volume without dampening.
   */
  public var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_VOLUME_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_VOLUME_DB,
          NIL.ordinal)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PITCH_SCALE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_PITCH_SCALE,
          NIL.ordinal)
    }

  /**
   * If `true`, audio is playing.
   */
  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_IS_PLAYING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * If `true`, audio plays when added to scene tree.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_IS_AUTOPLAY_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AUTOPLAY,
          NIL.ordinal)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
   */
  public var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PAUSED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM_PAUSED,
          NIL.ordinal)
    }

  /**
   * Maximum distance from which audio is still hearable.
   */
  public var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_MAX_DISTANCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_MAX_DISTANCE,
          NIL.ordinal)
    }

  /**
   * Dampens audio over distance with this as an exponent.
   */
  public var attenuation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_ATTENUATION,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_ATTENUATION,
          NIL.ordinal)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds after this value is reached will cut off the oldest sounds.
   */
  public var maxPolyphony: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_MAX_POLYPHONY,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_MAX_POLYPHONY,
          NIL.ordinal)
    }

  /**
   * Bus on which this audio is playing.
   *
   * **Note:** When setting this property, keep in mind that no validation is performed to see if the given name matches an existing bus. This is because audio bus layouts might be loaded after this property is set. If this given name can't be resolved at runtime, it will fall back to `"Master"`.
   */
  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_BUS,
          STRING_NAME.ordinal)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_BUS,
          NIL.ordinal)
    }

  /**
   * Determines which [godot.Area2D] layers affect the sound for reverb and audio bus effects. Areas can be used to redirect [godot.AudioStream]s so that they play in a certain audio bus. An example of how you might use this is making a "water" area so that sounds played in the water are redirected through an audio bus to make them sound like they are being played underwater.
   */
  public var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_AREA_MASK,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AREA_MASK,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER2D)
  }

  /**
   * Plays the audio from the given position `from_position`, in seconds.
   */
  public fun play(fromPosition: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_PLAY, NIL.ordinal)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public fun seek(toPosition: Double): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SEEK, NIL.ordinal)
  }

  /**
   * Stops the audio.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_STOP, NIL.ordinal)
  }

  /**
   * Returns the position in the [godot.AudioStream].
   */
  public fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PLAYBACK_POSITION, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer2D].
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PLAYBACK,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  public companion object
}
