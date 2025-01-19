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
 * Limits the frequencies in a range around the [AudioEffectFilter.cutoffHz] and allows frequencies
 * outside of this range to pass.
 */
@GodotBaseType
public open class AudioEffectBandLimitFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(82, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
