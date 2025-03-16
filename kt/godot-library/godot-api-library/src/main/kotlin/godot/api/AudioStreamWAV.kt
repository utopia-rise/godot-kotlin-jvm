// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * AudioStreamWAV stores sound samples loaded from WAV files. To play the stored sound, use an
 * [AudioStreamPlayer] (for non-positional audio) or [AudioStreamPlayer2D]/[AudioStreamPlayer3D] (for
 * positional audio). The sound can be looped.
 *
 * This class can also be used to store dynamically-generated PCM audio data. See also
 * [AudioStreamGenerator] for procedural audio generation.
 */
@GodotBaseType
public open class AudioStreamWAV : AudioStream() {
  /**
   * Contains the audio data in bytes.
   *
   * **Note:** If [format] is set to [FORMAT_8_BITS], this property expects signed 8-bit PCM data.
   * To convert from unsigned 8-bit PCM, subtract 128 from each byte.
   *
   * **Note:** If [format] is set to [FORMAT_QOA], this property expects data from a full QOA file.
   */
  public final inline var `data`: PackedByteArray
    @JvmName("dataProperty")
    get() = getData()
    @JvmName("dataProperty")
    set(`value`) {
      setData(value)
    }

  /**
   * Audio format. See [Format] constants for values.
   */
  public final inline var format: Format
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  /**
   * The loop mode. See [LoopMode] constants for values.
   */
  public final inline var loopMode: LoopMode
    @JvmName("loopModeProperty")
    get() = getLoopMode()
    @JvmName("loopModeProperty")
    set(`value`) {
      setLoopMode(value)
    }

  /**
   * The loop start point (in number of samples, relative to the beginning of the stream).
   */
  public final inline var loopBegin: Int
    @JvmName("loopBeginProperty")
    get() = getLoopBegin()
    @JvmName("loopBeginProperty")
    set(`value`) {
      setLoopBegin(value)
    }

  /**
   * The loop end point (in number of samples, relative to the beginning of the stream).
   */
  public final inline var loopEnd: Int
    @JvmName("loopEndProperty")
    get() = getLoopEnd()
    @JvmName("loopEndProperty")
    set(`value`) {
      setLoopEnd(value)
    }

  /**
   * The sample rate for mixing this audio. Higher values require more storage space, but result in
   * better quality.
   *
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and
   * `48000`.
   *
   * According to the
   * [url=https://en.wikipedia.org/wiki/Nyquist&#37;E2&#37;80&#37;93Shannon_sampling_theorem]Nyquist-Shannon
   * sampling theorem[/url], there is no quality difference to human hearing when going past 40,000 Hz
   * (since most humans can only hear up to ~20,000 Hz, often less). If you are using lower-pitched
   * sounds such as voices, lower sample rates such as `32000` or `22050` may be usable with no loss in
   * quality.
   */
  public final inline var mixRate: Int
    @JvmName("mixRateProperty")
    get() = getMixRate()
    @JvmName("mixRateProperty")
    set(`value`) {
      setMixRate(value)
    }

  /**
   * If `true`, audio is stereo.
   */
  public final inline var stereo: Boolean
    @JvmName("stereoProperty")
    get() = isStereo()
    @JvmName("stereoProperty")
    set(`value`) {
      setStereo(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(101, scriptIndex)
  }

  public final fun setData(`data`: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.setDataPtr, NIL)
  }

  public final fun getData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun setFormat(format: Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return AudioStreamWAV.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLoopMode(loopMode: LoopMode): Unit {
    TransferContext.writeArguments(LONG to loopMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setLoopModePtr, NIL)
  }

  public final fun getLoopMode(): LoopMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopModePtr, LONG)
    return AudioStreamWAV.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLoopBegin(loopBegin: Int): Unit {
    TransferContext.writeArguments(LONG to loopBegin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLoopBeginPtr, NIL)
  }

  public final fun getLoopBegin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopBeginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLoopEnd(loopEnd: Int): Unit {
    TransferContext.writeArguments(LONG to loopEnd.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLoopEndPtr, NIL)
  }

  public final fun getLoopEnd(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopEndPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMixRate(mixRate: Int): Unit {
    TransferContext.writeArguments(LONG to mixRate.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMixRatePtr, NIL)
  }

  public final fun getMixRate(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMixRatePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStereo(stereo: Boolean): Unit {
    TransferContext.writeArguments(BOOL to stereo)
    TransferContext.callMethod(ptr, MethodBindings.setStereoPtr, NIL)
  }

  public final fun isStereo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isStereoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Saves the AudioStreamWAV as a WAV file to [path]. Samples with IMA ADPCM or Quite OK Audio
   * formats can't be saved.
   *
   * **Note:** A `.wav` extension is automatically appended to [path] if it is missing.
   */
  public final fun saveToWav(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.saveToWavPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Format(
    id: Long,
  ) {
    /**
     * 8-bit PCM audio codec.
     */
    FORMAT_8_BITS(0),
    /**
     * 16-bit PCM audio codec.
     */
    FORMAT_16_BITS(1),
    /**
     * Audio is lossily compressed as IMA ADPCM.
     */
    IMA_ADPCM(2),
    /**
     * Audio is lossily compressed as [url=https://qoaformat.org/]Quite OK Audio[/url].
     */
    QOA(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Format = entries.single { it.id == `value` }
    }
  }

  public enum class LoopMode(
    id: Long,
  ) {
    /**
     * Audio does not loop.
     */
    DISABLED(0),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing forward only.
     */
    FORWARD(1),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing back and forth.
     */
    PINGPONG(2),
    /**
     * Audio loops the data between [loopBegin] and [loopEnd], playing backward only.
     */
    BACKWARD(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LoopMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Creates a new [AudioStreamWAV] instance from the given buffer. The buffer must contain WAV
     * data.
     *
     * The keys and values of [options] match the properties of [ResourceImporterWAV]. The usage of
     * [options] is identical to [AudioStreamWAV.loadFromFile].
     */
    @JvmOverloads
    @JvmStatic
    public final fun loadFromBuffer(streamData: PackedByteArray, options: Dictionary<Any?, Any?> =
        Dictionary()): AudioStreamWAV? {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to streamData, DICTIONARY to options)
      TransferContext.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as AudioStreamWAV?)
    }

    /**
     * Creates a new [AudioStreamWAV] instance from the given file path. The file must be in WAV
     * format.
     *
     * The keys and values of [options] match the properties of [ResourceImporterWAV].
     *
     * **Example:** Load the first file dropped as a WAV and play it:
     *
     * ```
     * @onready var audio_player = $AudioStreamPlayer
     *
     * func _ready():
     *     get_window().files_dropped.connect(_on_files_dropped)
     *
     * func _on_files_dropped(files):
     *     if files[0].get_extension() == "wav":
     *         audio_player.stream = AudioStreamWAV.load_from_file(files[0], {
     *                 "force/max_rate": true,
     *                 "force/max_rate_hz": 11025
     *             })
     *         audio_player.play()
     * ```
     */
    @JvmOverloads
    @JvmStatic
    public final fun loadFromFile(path: String, options: Dictionary<Any?, Any?> = Dictionary()):
        AudioStreamWAV? {
      TransferContext.writeArguments(STRING to path, DICTIONARY to options)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as AudioStreamWAV?)
    }
  }

  public object MethodBindings {
    internal val loadFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "load_from_buffer", 4266838938)

    internal val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "load_from_file", 4015802384)

    internal val setDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_data", 2971499966)

    internal val getDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_data", 2362200018)

    internal val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_format", 60648488)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_format", 3151724922)

    internal val setLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_mode", 2444882972)

    internal val getLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_mode", 393560655)

    internal val setLoopBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_begin", 1286410249)

    internal val getLoopBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_begin", 3905245786)

    internal val setLoopEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_loop_end", 1286410249)

    internal val getLoopEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_loop_end", 3905245786)

    internal val setMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_mix_rate", 1286410249)

    internal val getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "get_mix_rate", 3905245786)

    internal val setStereoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "set_stereo", 2586408642)

    internal val isStereoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "is_stereo", 36873697)

    internal val saveToWavPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamWAV", "save_to_wav", 166001499)
  }
}
