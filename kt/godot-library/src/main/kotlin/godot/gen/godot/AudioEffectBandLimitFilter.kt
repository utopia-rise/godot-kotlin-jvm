// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Adds a band limit filter to the audio bus.
 *
 * Limits the frequencies in a range around the [godot.AudioEffectFilter.cutoffHz] and allows frequencies outside of this range to pass.
 */
@GodotBaseType
open class AudioEffectBandLimitFilter : AudioEffectFilter() {
  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTBANDLIMITFILTER)
  }
}
