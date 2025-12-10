// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * Limits the frequencies in a range around the [AudioEffectFilter.cutoffHz] and allows frequencies
 * outside of this range to pass.
 */
@GodotBaseType
public open class AudioEffectBandLimitFilter : AudioEffectFilter() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(48, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
