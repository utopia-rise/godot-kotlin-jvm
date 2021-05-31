// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 *
 */
@GodotBaseType
public open class AudioEffectSpectrumAnalyzer : AudioEffect() {
  /**
   *
   */
  public open var bufferLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_BUFFER_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_BUFFER_LENGTH, NIL)
    }

  /**
   *
   */
  public open var fftSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_FFT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_FFT_SIZE, NIL)
    }

  /**
   *
   */
  public open var tapBackPos: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_TAP_BACK_POS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_TAP_BACK_POS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER)
  }

  public enum class FFT_Size(
    id: Long
  ) {
    /**
     *
     */
    FFT_SIZE_256(0),
    /**
     *
     */
    FFT_SIZE_512(1),
    /**
     *
     */
    FFT_SIZE_1024(2),
    /**
     *
     */
    FFT_SIZE_2048(3),
    /**
     *
     */
    FFT_SIZE_4096(4),
    /**
     * Represents the size of the [enum FFT_Size] enum.
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

  public companion object {
    /**
     *
     */
    public final const val FFT_SIZE_1024: Long = 2

    /**
     *
     */
    public final const val FFT_SIZE_2048: Long = 3

    /**
     *
     */
    public final const val FFT_SIZE_256: Long = 0

    /**
     *
     */
    public final const val FFT_SIZE_4096: Long = 4

    /**
     *
     */
    public final const val FFT_SIZE_512: Long = 1

    /**
     * Represents the size of the [enum FFT_Size] enum.
     */
    public final const val FFT_SIZE_MAX: Long = 5
  }
}
