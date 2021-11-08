// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores audio data loaded from WAV files.
 *
 * AudioStreamSample stores sound samples loaded from WAV files. To play the stored sound, use an [godot.AudioStreamPlayer] (for non-positional audio) or [godot.AudioStreamPlayer2D]/[godot.AudioStreamPlayer3D] (for positional audio). The sound can be looped.
 *
 * This class can also be used to store dynamically-generated PCM audio data. See also [godot.AudioStreamGenerator] for procedural audio generation.
 */
@GodotBaseType
public open class AudioStreamSample : AudioStream() {
  /**
   * Contains the audio data in bytes.
   *
   * **Note:** This property expects signed PCM8 data. To convert unsigned PCM8 to signed PCM8, subtract 128 from each byte.
   */
  public open var `data`: PoolByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_DATA,
          POOL_BYTE_ARRAY)
      return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_DATA, NIL)
    }

  /**
   * Audio format. See [enum Format] constants for values.
   */
  public open var format: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_FORMAT, NIL)
    }

  /**
   * The loop start point (in number of samples, relative to the beginning of the sample). This information will be imported automatically from the WAV file if present.
   */
  public open var loopBegin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_LOOP_BEGIN,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_LOOP_BEGIN,
          NIL)
    }

  /**
   * The loop end point (in number of samples, relative to the beginning of the sample). This information will be imported automatically from the WAV file if present.
   */
  public open var loopEnd: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_LOOP_END,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_LOOP_END,
          NIL)
    }

  /**
   * The loop mode. This information will be imported automatically from the WAV file if present. See [enum LoopMode] constants for values.
   */
  public open var loopMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_LOOP_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_LOOP_MODE,
          NIL)
    }

  /**
   * The sample rate for mixing this audio. Higher values require more storage space, but result in better quality.
   *
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and `48000`.
   *
   * According to the [godot.Nyquist-Shannon sampling theorem](https://en.wikipedia.org/wiki/Nyquist%E2%80%93Shannon_sampling_theorem), there is no quality difference to human hearing when going past 40,000 Hz (since most humans can only hear up to ~20,000 Hz, often less). If you are using lower-pitched sounds such as voices, lower sample rates such as `32000` or `22050` may be usable with no loss in quality.
   */
  public open var mixRate: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_MIX_RATE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_MIX_RATE,
          NIL)
    }

  /**
   * If `true`, audio is stereo.
   */
  public open var stereo: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_GET_STEREO,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SET_STEREO, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMSAMPLE)
  }

  /**
   * Saves the AudioStreamSample as a WAV file to `path`. Samples with IMA ADPCM format can't be saved.
   *
   * **Note:** A `.wav` extension is automatically appended to `path` if it is missing.
   */
  public open fun saveToWav(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMSAMPLE_SAVE_TO_WAV, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class LoopMode(
    id: Long
  ) {
    /**
     * Audio does not loop.
     */
    LOOP_DISABLED(0),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing forward only.
     */
    LOOP_FORWARD(1),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing back and forth.
     */
    LOOP_PING_PONG(2),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing backward only.
     */
    LOOP_BACKWARD(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Format(
    id: Long
  ) {
    /**
     * 8-bit audio codec.
     */
    FORMAT_8_BITS(0),
    /**
     * 16-bit audio codec.
     */
    FORMAT_16_BITS(1),
    /**
     * Audio is compressed using IMA ADPCM.
     */
    FORMAT_IMA_ADPCM(2),
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
     * 16-bit audio codec.
     */
    public final const val FORMAT_16_BITS: Long = 1

    /**
     * 8-bit audio codec.
     */
    public final const val FORMAT_8_BITS: Long = 0

    /**
     * Audio is compressed using IMA ADPCM.
     */
    public final const val FORMAT_IMA_ADPCM: Long = 2

    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing backward only.
     */
    public final const val LOOP_BACKWARD: Long = 3

    /**
     * Audio does not loop.
     */
    public final const val LOOP_DISABLED: Long = 0

    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing forward only.
     */
    public final const val LOOP_FORWARD: Long = 1

    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing back and forth.
     */
    public final const val LOOP_PING_PONG: Long = 2
  }
}
