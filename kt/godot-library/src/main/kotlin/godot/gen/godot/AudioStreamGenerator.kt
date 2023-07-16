// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * An audio stream with utilities for procedural sound generation.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/526](https://godotengine.org/asset-library/asset/526)
 *
 * [godot.AudioStreamGenerator] is a type of audio stream that does not play back sounds on its own; instead, it expects a script to generate audio data for it. See also [godot.AudioStreamGeneratorPlayback].
 *
 * Here's a sample on how to use it to generate a sine wave:
 *
 * ```
 * 		var playback # Will hold the AudioStreamGeneratorPlayback.
 * 		@onready var sample_hz = $AudioStreamPlayer.stream.mix_rate
 * 		var pulse_hz = 440.0 # The frequency of the sound wave.
 *
 * 		func _ready():
 * 		    $AudioStreamPlayer.play()
 * 		    playback = $AudioStreamPlayer.get_stream_playback()
 * 		    fill_buffer()
 *
 * 		func fill_buffer():
 * 		    var phase = 0.0
 * 		    var increment = pulse_hz / sample_hz
 * 		    var frames_available = playback.get_frames_available()
 *
 * 		    for i in range(frames_available):
 * 		        playback.push_frame(Vector2.ONE * sin(phase * TAU))
 * 		        phase = fmod(phase + increment, 1.0)
 * 		```
 *
 * In the example above, the "AudioStreamPlayer" node must use an [godot.AudioStreamGenerator] as its stream. The `fill_buffer` function provides audio data for approximating a sine wave.
 *
 * See also [godot.AudioEffectSpectrumAnalyzer] for performing real-time audio spectrum analysis.
 *
 * **Note:** Due to performance constraints, this class is best used from C# or from a compiled language via GDExtension. If you still want to use this class from GDScript, consider using a lower [mixRate] such as 11,025 Hz or 22,050 Hz.
 */
@GodotBaseType
public open class AudioStreamGenerator : AudioStream() {
  /**
   * The sample rate to use (in Hz). Higher values are more demanding for the CPU to generate, but result in better quality.
   *
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and `48000`.
   *
   * According to the [godot.Nyquist-Shannon sampling theorem](https://en.wikipedia.org/wiki/Nyquist%E2%80%93Shannon_sampling_theorem), there is no quality difference to human hearing when going past 40,000 Hz (since most humans can only hear up to ~20,000 Hz, often less). If you are generating lower-pitched sounds such as voices, lower sample rates such as `32000` or `22050` may be usable with no loss in quality.
   */
  public var mixRate: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_GET_MIX_RATE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_SET_MIX_RATE,
          NIL)
    }

  /**
   * The length of the buffer to generate (in seconds). Lower values result in less latency, but require the script to generate audio data faster, resulting in increased CPU usage and more risk for audio cracking if the CPU can't keep up.
   */
  public var bufferLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_GET_BUFFER_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATOR_SET_BUFFER_LENGTH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMGENERATOR, scriptIndex)
    return true
  }

  public companion object
}
