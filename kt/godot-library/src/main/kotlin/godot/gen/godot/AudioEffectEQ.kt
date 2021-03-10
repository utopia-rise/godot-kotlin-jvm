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
 * Base class for audio equalizers. Gives you control over frequencies.
 *
 * Use it to create a custom equalizer if [godot.AudioEffectEQ6], [godot.AudioEffectEQ10] or [godot.AudioEffectEQ21] don't fit your needs.
 *
 * AudioEffectEQ gives you control over frequencies. Use it to compensate for existing deficiencies in audio. AudioEffectEQs are useful on the Master bus to completely master a mix and give it more character. They are also useful when a game is run on a mobile device, to adjust the mix to that kind of speakers (it can be added but disabled when headphones are plugged).
 */
@GodotBaseType
open class AudioEffectEQ : AudioEffect() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTEQ)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the number of bands of the equalizer.
   */
  open fun getBandCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_GET_BAND_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the band's gain at the specified index, in dB.
   */
  open fun getBandGainDb(bandIdx: Long): Double {
    TransferContext.writeArguments(LONG to bandIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_GET_BAND_GAIN_DB,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets band's gain at the specified index, in dB.
   */
  open fun setBandGainDb(bandIdx: Long, volumeDb: Double) {
    TransferContext.writeArguments(LONG to bandIdx, DOUBLE to volumeDb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTEQ_SET_BAND_GAIN_DB, NIL)
  }
}
