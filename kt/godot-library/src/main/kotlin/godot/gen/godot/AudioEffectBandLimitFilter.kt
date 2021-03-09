// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Adds a band limit filter to the audio bus.
 *
 * Limits the frequencies in a range around the [godot.AudioEffectFilter.cutoffHz] and allows frequencies outside of this range to pass.
 */
@GodotBaseType
open class AudioEffectBandLimitFilter : AudioEffectFilter() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTBANDLIMITFILTER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
