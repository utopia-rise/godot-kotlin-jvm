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
 * Reduces all frequencies above the [AudioEffectFilter.cutoffHz].
 */
@GodotBaseType
public open class AudioEffectHighShelfFilter : AudioEffectFilter() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(62, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
