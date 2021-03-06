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
 * Adds a low-pass filter to the Audio bus.
 *
 * Cuts frequencies higher than the [godot.AudioEffectFilter.cutoffHz] and allows lower frequencies to pass.
 */
@GodotBaseType
open class AudioEffectLowPassFilter : AudioEffectFilter() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTLOWPASSFILTER)
}
