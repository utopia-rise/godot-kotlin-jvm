// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Adds a low-pass filter to the audio bus.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Cuts frequencies higher than the [godot.AudioEffectFilter.cutoffHz] and allows lower frequencies to pass.
 */
@GodotBaseType
public open class AudioEffectLowPassFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTLOWPASSFILTER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
