// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
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
    createNativeObject(56, scriptIndex)
  }

  /**
   * Sets band's gain at the specified index, in dB.
   */
  public final fun setBandGainDb(bandIdx: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to bandIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBandGainDbPtr, NIL)
  }

  /**
   * Returns the band's gain at the specified index, in dB.
   */
  public final fun getBandGainDb(bandIdx: Int): Float {
    TransferContext.writeArguments(LONG to bandIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBandGainDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of bands of the equalizer.
   */
  public final fun getBandCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBandCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectEQ::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setBandGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "set_band_gain_db", 1602489585)

    internal val getBandGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "get_band_gain_db", 2339986948)

    internal val getBandCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectEQ", "get_band_count", 3905245786)
  }
}
