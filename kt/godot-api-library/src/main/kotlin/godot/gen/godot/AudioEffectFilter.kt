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
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTFILTER_INDEX: Int = 93

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

  public final inline var db: FilterDB
    @JvmName("dbProperty")
    get() = getDb()
    @JvmName("dbProperty")
    set(`value`) {
      setDb(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTFILTER_INDEX, scriptIndex)
  }

  public final fun setCutoff(freq: Float): Unit {
    Internals.writeArguments(DOUBLE to freq.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCutoffPtr, NIL)
  }

  public final fun getCutoff(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCutoffPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setResonance(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setResonancePtr, NIL)
  }

  public final fun getResonance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getResonancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGain(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
  }

  public final fun getGain(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDb(amount: FilterDB): Unit {
    Internals.writeArguments(LONG to amount.id)
    Internals.callMethod(rawPtr, MethodBindings.setDbPtr, NIL)
  }

  public final fun getDb(): FilterDB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDbPtr, LONG)
    return AudioEffectFilter.FilterDB.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class FilterDB(
    id: Long,
  ) {
    FILTER_6DB(0),
    FILTER_12DB(1),
    FILTER_18DB(2),
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

  internal object MethodBindings {
    public val setCutoffPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "set_cutoff", 373806689)

    public val getCutoffPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "get_cutoff", 1740695150)

    public val setResonancePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "set_resonance", 373806689)

    public val getResonancePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "get_resonance", 1740695150)

    public val setGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "set_gain", 373806689)

    public val getGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "get_gain", 1740695150)

    public val setDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "set_db", 771740901)

    public val getDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectFilter", "get_db", 3981721890)
  }
}
