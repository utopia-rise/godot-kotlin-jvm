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
 * Adds a 21-band equalizer audio effect to an Audio bus. Gives you control over frequencies from 22 Hz to 22000 Hz.
 *
 * Each frequency can be modulated between -60/+24 dB.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Frequency bands:
 *
 * Band 1: 22 Hz
 *
 * Band 2: 32 Hz
 *
 * Band 3: 44 Hz
 *
 * Band 4: 63 Hz
 *
 * Band 5: 90 Hz
 *
 * Band 6: 125 Hz
 *
 * Band 7: 175 Hz
 *
 * Band 8: 250 Hz
 *
 * Band 9: 350 Hz
 *
 * Band 10: 500 Hz
 *
 * Band 11: 700 Hz
 *
 * Band 12: 1000 Hz
 *
 * Band 13: 1400 Hz
 *
 * Band 14: 2000 Hz
 *
 * Band 15: 2800 Hz
 *
 * Band 16: 4000 Hz
 *
 * Band 17: 5600 Hz
 *
 * Band 18: 8000 Hz
 *
 * Band 19: 11000 Hz
 *
 * Band 20: 16000 Hz
 *
 * Band 21: 22000 Hz
 *
 * See also [godot.AudioEffectEQ], [godot.AudioEffectEQ6], [godot.AudioEffectEQ10].
 */
@GodotBaseType
public open class AudioEffectEQ21 : AudioEffectEQ() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTEQ21, scriptIndex)
  }

  public companion object
}
