// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * AudioEffectEQ gives you control over frequencies. Use it to compensate for existing deficiencies
 * in audio. AudioEffectEQs are useful on the Master bus to completely master a mix and give it more
 * character. They are also useful when a game is run on a mobile device, to adjust the mix to that
 * kind of speakers (it can be added but disabled when headphones are plugged).
 */
@GodotBaseType
public open class AudioEffectEQ : AudioEffect() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTEQ, scriptIndex)
  }

  /**
   * Sets band's gain at the specified index, in dB.
   */
  public final fun setBandGainDb(bandIdx: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to bandIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBandGainDbPtr, NIL)
  }

  /**
   * Returns the band's gain at the specified index, in dB.
   */
  public final fun getBandGainDb(bandIdx: Int): Float {
    TransferContext.writeArguments(LONG to bandIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBandGainDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of bands of the equalizer.
   */
  public final fun getBandCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBandCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setBandGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "set_band_gain_db", 1602489585)

    public val getBandGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "get_band_gain_db", 2339986948)

    public val getBandCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "get_band_count", 3905245786)
  }
}
