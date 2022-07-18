// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a band limit filter to the audio bus.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Limits the frequencies in a range around the [godot.AudioEffectFilter.cutoffHz] and allows frequencies outside of this range to pass.
 */
@GodotBaseType
public open class AudioEffectBandLimitFilter : AudioEffectFilter() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTBANDLIMITFILTER)
  }

  public companion object
}
