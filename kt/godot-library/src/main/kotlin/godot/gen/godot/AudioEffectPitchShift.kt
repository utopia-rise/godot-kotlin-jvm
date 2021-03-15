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
 * Adds a pitch-shifting audio effect to an Audio bus.
 *
 * Raises or lowers the pitch of original sound.
 *
 * Allows modulation of pitch independently of tempo. All frequencies can be increased/decreased with minimal effect on transients.
 */
@GodotBaseType
open class AudioEffectPitchShift : AudioEffect() {
  /**
   *
   */
  open var fftSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_FFT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_FFT_SIZE, NIL)
    }

  /**
   *
   */
  open var oversampling: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_OVERSAMPLING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_OVERSAMPLING, NIL)
    }

  /**
   * Pitch value. Can range from 0 (-1 octave) to 16 (+16 octaves).
   */
  open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_GET_PITCH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTPITCHSHIFT_SET_PITCH_SCALE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTPITCHSHIFT,
        ____DO_NOT_TOUCH_THIS_isRef____())
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
