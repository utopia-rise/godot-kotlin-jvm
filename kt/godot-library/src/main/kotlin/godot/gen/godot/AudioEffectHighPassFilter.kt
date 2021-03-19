// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Adds a high-pass filter to the Audio Bus.
 * 
 * Cuts frequencies lower than the [godot.AudioEffectFilter.cutoffHz] and allows higher frequencies to pass.
 */
@GodotBaseType
open class AudioEffectHighPassFilter : AudioEffectFilter() {
  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTHIGHPASSFILTER)
  }
}
