// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Adds a 6-band equalizer audio effect to an Audio bus. Gives you control over frequencies from 32 Hz to 10000 Hz.
 *
 * Each frequency can be modulated between -60/+24 dB.
 *
 * Frequency bands:
 *
 * Band 1: 32 Hz
 *
 * Band 2: 100 Hz
 *
 * Band 3: 320 Hz
 *
 * Band 4: 1000 Hz
 *
 * Band 5: 3200 Hz
 *
 * Band 6: 10000 Hz
 *
 * See also [godot.AudioEffectEQ], [godot.AudioEffectEQ10], [godot.AudioEffectEQ21].
 */
@GodotBaseType
open class AudioEffectEQ6 : AudioEffectEQ() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTEQ6)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
