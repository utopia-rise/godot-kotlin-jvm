// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOEFFECTLOWPASSFILTER_INDEX: Int = 98

/**
 * Cuts frequencies higher than the [AudioEffectFilter.cutoffHz] and allows lower frequencies to
 * pass.
 */
@GodotBaseType
public open class AudioEffectLowPassFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOEFFECTLOWPASSFILTER_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
