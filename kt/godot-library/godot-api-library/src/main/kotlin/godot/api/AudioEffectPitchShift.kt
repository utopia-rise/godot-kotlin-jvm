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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Allows modulation of pitch independently of tempo. All frequencies can be increased/decreased
 * with minimal effect on transients.
 */
@GodotBaseType
public open class AudioEffectPitchShift : AudioEffect() {
  /**
   * The pitch scale to use. `1.0` is the default pitch and plays sounds unaffected. [pitchScale]
   * can range from `0.0` (infinitely low pitch, inaudible) to `16` (16 times higher than the initial
   * pitch).
   */
  public final inline var pitchScale: Float
    @JvmName("pitchScaleProperty")
    get() = getPitchScale()
    @JvmName("pitchScaleProperty")
    set(`value`) {
      setPitchScale(value)
    }

  /**
   * The oversampling factor to use. Higher values result in better quality, but are more demanding
   * on the CPU and may cause audio cracking if the CPU can't keep up.
   */
  public final inline var oversampling: Int
    @JvmName("oversamplingProperty")
    get() = getOversampling()
    @JvmName("oversamplingProperty")
    set(`value`) {
      setOversampling(value)
    }

  /**
   * The size of the [url=https://en.wikipedia.org/wiki/Fast_Fourier_transform]Fast Fourier
   * transform[/url] buffer. Higher values smooth out the effect over time, but have greater latency.
   * The effects of this higher latency are especially noticeable on sounds that have sudden amplitude
   * changes.
   */
  public final inline var fftSize: FFTSize
    @JvmName("fftSizeProperty")
    get() = getFftSize()
    @JvmName("fftSizeProperty")
    set(`value`) {
      setFftSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(69, scriptIndex)
  }

  public final fun setPitchScale(rate: Float): Unit {
    TransferContext.writeArguments(DOUBLE to rate.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPitchScalePtr, NIL)
  }

  public final fun getPitchScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPitchScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOversampling(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOversamplingPtr, NIL)
  }

  public final fun getOversampling(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOversamplingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFftSize(size: FFTSize): Unit {
    TransferContext.writeArguments(LONG to size.id)
    TransferContext.callMethod(ptr, MethodBindings.setFftSizePtr, NIL)
  }

  public final fun getFftSize(): FFTSize {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFftSizePtr, LONG)
    return FFTSize.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class FFTSize(
    id: Long,
  ) {
    /**
     * Use a buffer of 256 samples for the Fast Fourier transform. Lowest latency, but least stable
     * over time.
     */
    FFT_SIZE_256(0),
    /**
     * Use a buffer of 512 samples for the Fast Fourier transform. Low latency, but less stable over
     * time.
     */
    FFT_SIZE_512(1),
    /**
     * Use a buffer of 1024 samples for the Fast Fourier transform. This is a compromise between
     * latency and stability over time.
     */
    FFT_SIZE_1024(2),
    /**
     * Use a buffer of 2048 samples for the Fast Fourier transform. High latency, but stable over
     * time.
     */
    FFT_SIZE_2048(3),
    /**
     * Use a buffer of 4096 samples for the Fast Fourier transform. Highest latency, but most stable
     * over time.
     */
    FFT_SIZE_4096(4),
    /**
     * Represents the size of the [FFTSize] enum.
     */
    MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FFTSize = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_pitch_scale", 373806689)

    internal val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_pitch_scale", 1740695150)

    internal val setOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_oversampling", 1286410249)

    internal val getOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_oversampling", 3905245786)

    internal val setFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "set_fft_size", 2323518741)

    internal val getFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPitchShift", "get_fft_size", 2361246789)
  }
}
