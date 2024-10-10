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

private const val ENGINE_CLASS_AUDIOEFFECTBANDPASSFILTER_INDEX: Int = 82

/**
 * Attenuates the frequencies inside of a range around the [AudioEffectFilter.cutoffHz] and cuts
 * frequencies outside of this band.
 */
@GodotBaseType
public open class AudioEffectBandPassFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOEFFECTBANDPASSFILTER_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
