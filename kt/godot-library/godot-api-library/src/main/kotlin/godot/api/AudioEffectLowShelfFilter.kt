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
 * Reduces all frequencies below the [AudioEffectFilter.cutoffHz].
 */
@GodotBaseType
public open class AudioEffectLowShelfFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(100, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
