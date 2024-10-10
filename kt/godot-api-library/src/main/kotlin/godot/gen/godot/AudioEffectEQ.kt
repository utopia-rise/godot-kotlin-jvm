// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOEFFECTEQ_INDEX: Int = 89

/**
 * AudioEffectEQ gives you control over frequencies. Use it to compensate for existing deficiencies
 * in audio. AudioEffectEQs are useful on the Master bus to completely master a mix and give it more
 * character. They are also useful when a game is run on a mobile device, to adjust the mix to that
 * kind of speakers (it can be added but disabled when headphones are plugged).
 */
@GodotBaseType
public open class AudioEffectEQ : AudioEffect() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTEQ_INDEX, scriptIndex)
  }

  /**
   * Sets band's gain at the specified index, in dB.
   */
  public final fun setBandGainDb(bandIdx: Int, volumeDb: Float): Unit {
    Internals.writeArguments(LONG to bandIdx.toLong(), DOUBLE to volumeDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBandGainDbPtr, NIL)
  }

  /**
   * Returns the band's gain at the specified index, in dB.
   */
  public final fun getBandGainDb(bandIdx: Int): Float {
    Internals.writeArguments(LONG to bandIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBandGainDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of bands of the equalizer.
   */
  public final fun getBandCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBandCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setBandGainDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectEQ", "set_band_gain_db", 1602489585)

    public val getBandGainDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectEQ", "get_band_gain_db", 2339986948)

    public val getBandCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectEQ", "get_band_count", 3905245786)
  }
}
