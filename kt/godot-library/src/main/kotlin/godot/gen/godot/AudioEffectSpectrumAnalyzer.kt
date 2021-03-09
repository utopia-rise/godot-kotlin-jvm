// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class AudioEffectSpectrumAnalyzer : AudioEffect() {
  /**
   *
   */
  open var bufferLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_BUFFER_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_BUFFER_LENGTH, NIL)
    }

  /**
   *
   */
  open var fftSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_FFT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_FFT_SIZE, NIL)
    }

  /**
   *
   */
  open var tapBackPos: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_GET_TAP_BACK_POS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER_SET_TAP_BACK_POS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class FFT_Size(
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
    FFT_SIZE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     *
     */
    final const val FFT_SIZE_1024: Long = 2

    /**
     *
     */
    final const val FFT_SIZE_2048: Long = 3

    /**
     *
     */
    final const val FFT_SIZE_256: Long = 0

    /**
     *
     */
    final const val FFT_SIZE_4096: Long = 4

    /**
     *
     */
    final const val FFT_SIZE_512: Long = 1

    /**
     * Represents the size of the [enum FFT_Size] enum.
     */
    final const val FFT_SIZE_MAX: Long = 5
  }
}
