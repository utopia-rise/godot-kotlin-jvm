// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Audio stream that generates sounds procedurally.
 *
 * Tutorials:
 * [Godot 3.2 will get new audio features](Godot 3.2 will get new audio features)
 *
 * This audio stream does not play back sounds, but expects a script to generate audio data for it instead. See also [godot.AudioStreamGeneratorPlayback].
 *
 * See also [godot.AudioEffectSpectrumAnalyzer] for performing real-time audio spectrum analysis.
 *
 * **Note:** Due to performance constraints, this class is best used from C# or from a compiled language via GDNative. If you still want to use this class from GDScript, consider using a lower [mixRate] such as 11,025 Hz or 22,050 Hz.
 */
@GodotBaseType
public open class AudioStreamGenerator : AudioStream() {
  /**
   * The length of the buffer to generate (in seconds). Lower values result in less latency, but require the script to generate audio data faster, resulting in increased CPU usage and more risk for audio cracking if the CPU can't keep up.
   */
  public open var bufferLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_GET_BUFFER_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_SET_BUFFER_LENGTH, NIL)
    }

  /**
   * The sample rate to use (in Hz). Higher values are more demanding for the CPU to generate, but result in better quality.
   *
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and `48000`.
   *
   * According to the [godot.Nyquist-Shannon sampling theorem](https://en.wikipedia.org/wiki/Nyquist%E2%80%93Shannon_sampling_theorem), there is no quality difference to human hearing when going past 40,000 Hz (since most humans can only hear up to ~20,000 Hz, often less). If you are generating lower-pitched sounds such as voices, lower sample rates such as `32000` or `22050` may be usable with no loss in quality.
   */
  public open var mixRate: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_GET_MIX_RATE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_SET_MIX_RATE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMGENERATOR)
  }
}
