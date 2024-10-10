// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOSTREAMGENERATOR_INDEX: Int = 113

/**
 * [AudioStreamGenerator] is a type of audio stream that does not play back sounds on its own;
 * instead, it expects a script to generate audio data for it. See also [AudioStreamGeneratorPlayback].
 * Here's a sample on how to use it to generate a sine wave:
 *
 * gdscript:
 * ```gdscript
 * var playback # Will hold the AudioStreamGeneratorPlayback.
 * @onready var sample_hz = $AudioStreamPlayer.stream.mix_rate
 * var pulse_hz = 440.0 # The frequency of the sound wave.
 *
 * func _ready():
 *     $AudioStreamPlayer.play()
 *     playback = $AudioStreamPlayer.get_stream_playback()
 *     fill_buffer()
 *
 * func fill_buffer():
 *     var phase = 0.0
 *     var increment = pulse_hz / sample_hz
 *     var frames_available = playback.get_frames_available()
 *
 *     for i in range(frames_available):
 *         playback.push_frame(Vector2.ONE * sin(phase * TAU))
 *         phase = fmod(phase + increment, 1.0)
 * ```
 * csharp:
 * ```csharp
 * [Export] public AudioStreamPlayer Player { get; set; }
 *
 * private AudioStreamGeneratorPlayback _playback; // Will hold the AudioStreamGeneratorPlayback.
 * private float _sampleHz;
 * private float _pulseHz = 440.0f; // The frequency of the sound wave.
 *
 * public override void _Ready()
 * {
 *     if (Player.Stream is AudioStreamGenerator generator) // Type as a generator to access
 * MixRate.
 *     {
 *         _sampleHz = generator.MixRate;
 *         Player.Play();
 *         _playback = (AudioStreamGeneratorPlayback)Player.GetStreamPlayback();
 *         FillBuffer();
 *     }
 * }
 *
 * public void FillBuffer()
 * {
 *     double phase = 0.0;
 *     float increment = _pulseHz / _sampleHz;
 *     int framesAvailable = _playback.GetFramesAvailable();
 *
 *     for (int i = 0; i < framesAvailable; i++)
 *     {
 *         _playback.PushFrame(Vector2.One * (float)Mathf.Sin(phase * Mathf.Tau));
 *         phase = Mathf.PosMod(phase + increment, 1.0);
 *     }
 * }
 * ```
 *
 * In the example above, the "AudioStreamPlayer" node must use an [AudioStreamGenerator] as its
 * stream. The `fill_buffer` function provides audio data for approximating a sine wave.
 * See also [AudioEffectSpectrumAnalyzer] for performing real-time audio spectrum analysis.
 * **Note:** Due to performance constraints, this class is best used from C# or from a compiled
 * language via GDExtension. If you still want to use this class from GDScript, consider using a lower
 * [mixRate] such as 11,025 Hz or 22,050 Hz.
 */
@GodotBaseType
public open class AudioStreamGenerator : AudioStream() {
  /**
   * The sample rate to use (in Hz). Higher values are more demanding for the CPU to generate, but
   * result in better quality.
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and
   * `48000`.
   * According to the
   * [url=https://en.wikipedia.org/wiki/Nyquist&#37;E2&#37;80&#37;93Shannon_sampling_theorem]Nyquist-Shannon
   * sampling theorem[/url], there is no quality difference to human hearing when going past 40,000 Hz
   * (since most humans can only hear up to ~20,000 Hz, often less). If you are generating
   * lower-pitched sounds such as voices, lower sample rates such as `32000` or `22050` may be usable
   * with no loss in quality.
   */
  public final inline var mixRate: Float
    @JvmName("mixRateProperty")
    get() = getMixRate()
    @JvmName("mixRateProperty")
    set(`value`) {
      setMixRate(value)
    }

  /**
   * The length of the buffer to generate (in seconds). Lower values result in less latency, but
   * require the script to generate audio data faster, resulting in increased CPU usage and more risk
   * for audio cracking if the CPU can't keep up.
   */
  public final inline var bufferLength: Float
    @JvmName("bufferLengthProperty")
    get() = getBufferLength()
    @JvmName("bufferLengthProperty")
    set(`value`) {
      setBufferLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMGENERATOR_INDEX, scriptIndex)
  }

  public final fun setMixRate(hz: Float): Unit {
    Internals.writeArguments(DOUBLE to hz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMixRatePtr, NIL)
  }

  public final fun getMixRate(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMixRatePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBufferLength(seconds: Float): Unit {
    Internals.writeArguments(DOUBLE to seconds.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBufferLengthPtr, NIL)
  }

  public final fun getBufferLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setMixRatePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGenerator", "set_mix_rate", 373806689)

    public val getMixRatePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGenerator", "get_mix_rate", 1740695150)

    public val setBufferLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGenerator", "set_buffer_length", 373806689)

    public val getBufferLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGenerator", "get_buffer_length", 1740695150)
  }
}
