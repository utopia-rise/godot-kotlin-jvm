// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * Adds a band pass filter to the audio bus.
 *
 * Attenuates the frequencies inside of a range around the [godot.AudioEffectFilter.cutoffHz] and cuts frequencies outside of this band.
 */
@GodotBaseType
open class AudioEffectBandPassFilter : AudioEffectFilter() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTBANDPASSFILTER)
}
