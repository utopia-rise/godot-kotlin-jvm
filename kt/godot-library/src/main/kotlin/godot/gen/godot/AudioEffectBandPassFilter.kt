// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Adds a band pass filter to the audio bus.
 * 
 * Attenuates the frequencies inside of a range around the [godot.AudioEffectFilter.cutoffHz] and cuts frequencies outside of this band.
 */
@GodotBaseType
open class AudioEffectBandPassFilter : AudioEffectFilter() {
  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTBANDPASSFILTER)
  }
}
