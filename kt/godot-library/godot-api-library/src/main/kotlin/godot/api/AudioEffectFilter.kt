// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import kotlin.jvm.JvmName

/**
 * Allows frequencies other than the [cutoffHz] to pass.
 */
@GodotBaseType
public open class AudioEffectFilter : AudioEffect() {
  /**
   * Threshold frequency for the filter, in Hz.
   */
  public final inline var cutoffHz: Float
    @JvmName("cutoffHzProperty")
    get() = getCutoff()
    @JvmName("cutoffHzProperty")
    set(`value`) {
      setCutoff(value)
    }

  /**
   * Amount of boost in the frequency range near the cutoff frequency.
   */
  public final inline var resonance: Float
    @JvmName("resonanceProperty")
    get() = getResonance()
    @JvmName("resonanceProperty")
    set(`value`) {
      setResonance(value)
    }

  /**
   * Gain amount of the frequencies after the filter.
   */
  public final inline var gain: Float
    @JvmName("gainProperty")
    get() = getGain()
    @JvmName("gainProperty")
    set(`value`) {
      setGain(value)
    }

  /**
   * Steepness of the cutoff curve in dB per octave, also known as the order of the filter. Higher orders have a more aggressive cutoff.
   */
  public final inline var db: FilterDB
    @JvmName("dbProperty")
    get() = getDb()
    @JvmName("dbProperty")
    set(`value`) {
      setDb(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(58, scriptIndex)
  }

  public final fun setCutoff(freq: Float) {
    TransferContext.writeArguments(DOUBLE to freq.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCutoffPtr, NIL)
  }

  public final fun getCutoff(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCutoffPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setResonance(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setResonancePtr, NIL)
  }

  public final fun getResonance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getResonancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGain(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGainPtr, NIL)
  }

  public final fun getGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDb(amount: FilterDB) {
    TransferContext.writeArguments(LONG to amount.id)
    TransferContext.callMethod(ptr, MethodBindings.setDbPtr, NIL)
  }

  public final fun getDb(): FilterDB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDbPtr, LONG)
    return FilterDB.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectFilter::_instantiate can't be called from the JVM.")
  }

  public enum class FilterDB(
    id: Long,
  ) {
    /**
     * Cutting off at 6dB per octave.
     */
    FILTER_6DB(0),
    /**
     * Cutting off at 12dB per octave.
     */
    FILTER_12DB(1),
    /**
     * Cutting off at 18dB per octave.
     */
    FILTER_18DB(2),
    /**
     * Cutting off at 24dB per octave.
     */
    FILTER_24DB(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FilterDB = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setCutoffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_cutoff", 373_806_689)

    internal val getCutoffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_cutoff", 1_740_695_150)

    internal val setResonancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_resonance", 373_806_689)

    internal val getResonancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_resonance", 1_740_695_150)

    internal val setGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_gain", 373_806_689)

    internal val getGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_gain", 1_740_695_150)

    internal val setDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_db", 771_740_901)

    internal val getDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_db", 3_981_721_890)
  }
}
