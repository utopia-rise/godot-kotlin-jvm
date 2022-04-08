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
 * Adds a low-pass filter to the Audio bus.
 *
 * Cuts frequencies higher than the [godot.AudioEffectFilter.cutoffHz] and allows lower frequencies to pass.
 */
@GodotBaseType
public open class AudioEffectLowPassFilter : AudioEffectFilter() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTLOWPASSFILTER)
  }

  public companion object
}
