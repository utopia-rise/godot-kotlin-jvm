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

private const val ENGINECLASS_AUDIOEFFECTNOTCHFILTER: Int = 101

/**
 * Attenuates frequencies in a narrow band around the [AudioEffectFilter.cutoffHz] and cuts
 * frequencies outside of this range.
 */
@GodotBaseType
public open class AudioEffectNotchFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_AUDIOEFFECTNOTCHFILTER, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
