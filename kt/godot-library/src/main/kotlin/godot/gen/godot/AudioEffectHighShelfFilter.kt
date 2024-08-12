// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Reduces all frequencies above the [AudioEffectFilter.cutoffHz].
 */
@GodotBaseType
public open class AudioEffectHighShelfFilter : AudioEffectFilter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTHIGHSHELFFILTER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
