// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This audio effect does not affect sound output, but can be used for real-time audio
 * visualizations.
 * This resource configures an [AudioEffectSpectrumAnalyzerInstance], which performs the actual
 * analysis at runtime. An instance can be acquired with [AudioServer.getBusEffectInstance].
 * See also [AudioStreamGenerator] for procedurally generating sounds.
 */
@GodotBaseType
public open class AudioEffectSpectrumAnalyzer : AudioEffect() {
  /**
   * The length of the buffer to keep (in seconds). Higher values keep data around for longer, but
   * require more memory.
   */
  public final inline var bufferLength: Float
    @JvmName("bufferLengthProperty")
    get() = getBufferLength()
    @JvmName("bufferLengthProperty")
    set(`value`) {
      setBufferLength(value)
    }

  public final inline var tapBackPos: Float
    @JvmName("tapBackPosProperty")
    get() = getTapBackPos()
    @JvmName("tapBackPosProperty")
    set(`value`) {
      setTapBackPos(value)
    }

  /**
   * The size of the [url=https://en.wikipedia.org/wiki/Fast_Fourier_transform]Fast Fourier
   * transform[/url] buffer. Higher values smooth out the spectrum analysis over time, but have greater
   * latency. The effects of this higher latency are especially noticeable with sudden amplitude
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
    callConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER, scriptIndex)
  }

  public final fun setBufferLength(seconds: Float): Unit {
    TransferContext.writeArguments(DOUBLE to seconds.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBufferLengthPtr, NIL)
  }

  public final fun getBufferLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTapBackPos(seconds: Float): Unit {
    TransferContext.writeArguments(DOUBLE to seconds.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTapBackPosPtr, NIL)
  }

  public final fun getTapBackPos(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTapBackPosPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFftSize(size: FFTSize): Unit {
    TransferContext.writeArguments(LONG to size.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFftSizePtr, NIL)
  }

  public final fun getFftSize(): FFTSize {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFftSizePtr, LONG)
    return AudioEffectSpectrumAnalyzer.FFTSize.from(TransferContext.readReturnValue(LONG) as Long)
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
    FFT_SIZE_MAX(5),
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

  internal object MethodBindings {
    public val setBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "set_buffer_length", 373806689)

    public val getBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "get_buffer_length", 1740695150)

    public val setTapBackPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "set_tap_back_pos", 373806689)

    public val getTapBackPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "get_tap_back_pos", 1740695150)

    public val setFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "set_fft_size", 1202879215)

    public val getFftSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzer", "get_fft_size", 3925405343)
  }
}
