// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a pitch-shifting audio effect to an Audio bus.
 *
 * Raises or lowers the pitch of original sound.
 *
 * Allows modulation of pitch independently of tempo. All frequencies can be increased/decreased with minimal effect on transients.
 */
@GodotBaseType
public open class AudioEffectPitchShift : AudioEffect() {
  /**
   * The pitch scale to use. `1.0` is the default pitch and plays sounds unaltered. [pitchScale] can range from `0.0` (infinitely low pitch, inaudible) to `16` (16 times higher than the initial pitch).
   */
  public open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_PITCH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_PITCH_SCALE, NIL)
    }

  /**
   * The oversampling factor to use. Higher values result in better quality, but are more demanding on the CPU and may cause audio cracking if the CPU can't keep up.
   */
  public open var oversampling: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_OVERSAMPLING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_OVERSAMPLING, NIL)
    }

  /**
   * The size of the [godot.Fast Fourier transform](https://en.wikipedia.org/wiki/Fast_Fourier_transform) buffer. Higher values smooth out the effect over time, but have greater latency. The effects of this higher latency are especially noticeable on sounds that have sudden amplitude changes.
   */
  public open var fftSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_FFT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_FFT_SIZE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTPITCHSHIFT)
  }

  public enum class FFTSize(
    id: Long
  ) {
    /**
     * Use a buffer of 256 samples for the Fast Fourier transform. Lowest latency, but least stable over time.
     */
    FFT_SIZE_256(0),
    /**
     * Use a buffer of 512 samples for the Fast Fourier transform. Low latency, but less stable over time.
     */
    FFT_SIZE_512(1),
    /**
     * Use a buffer of 1024 samples for the Fast Fourier transform. This is a compromise between latency and stability over time.
     */
    FFT_SIZE_1024(2),
    /**
     * Use a buffer of 2048 samples for the Fast Fourier transform. High latency, but stable over time.
     */
    FFT_SIZE_2048(3),
    /**
     * Use a buffer of 4096 samples for the Fast Fourier transform. Highest latency, but most stable over time.
     */
    FFT_SIZE_4096(4),
    /**
     * Represents the size of the [enum FFTSize] enum.
     */
    FFT_SIZE_MAX(5),
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
