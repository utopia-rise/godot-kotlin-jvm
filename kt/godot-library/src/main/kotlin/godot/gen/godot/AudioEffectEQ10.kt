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
 * Adds a 10-band equalizer audio effect to an Audio bus. Gives you control over frequencies from 31 Hz to 16000 Hz.
 *
 * Each frequency can be modulated between -60/+24 dB.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Frequency bands:
 *
 * Band 1: 31 Hz
 *
 * Band 2: 62 Hz
 *
 * Band 3: 125 Hz
 *
 * Band 4: 250 Hz
 *
 * Band 5: 500 Hz
 *
 * Band 6: 1000 Hz
 *
 * Band 7: 2000 Hz
 *
 * Band 8: 4000 Hz
 *
 * Band 9: 8000 Hz
 *
 * Band 10: 16000 Hz
 *
 * See also [godot.AudioEffectEQ], [godot.AudioEffectEQ6], [godot.AudioEffectEQ21].
 */
@GodotBaseType
public open class AudioEffectEQ10 : AudioEffectEQ() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTEQ10, scriptIndex)
    return true
  }

  public companion object
}
