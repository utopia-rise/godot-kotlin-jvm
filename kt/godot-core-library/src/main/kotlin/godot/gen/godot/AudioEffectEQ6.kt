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

/**
 * Frequency bands:
 * Band 1: 32 Hz
 * Band 2: 100 Hz
 * Band 3: 320 Hz
 * Band 4: 1000 Hz
 * Band 5: 3200 Hz
 * Band 6: 10000 Hz
 * See also [AudioEffectEQ], [AudioEffectEQ10], [AudioEffectEQ21].
 */
@GodotBaseType
public open class AudioEffectEQ6 : AudioEffectEQ() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_AUDIOEFFECTEQ6, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
