// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Attenuates the frequencies inside of a range around the [AudioEffectFilter.cutoffHz] and cuts
 * frequencies outside of this band.
 */
@GodotBaseType
public open class AudioEffectBandPassFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(83, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
