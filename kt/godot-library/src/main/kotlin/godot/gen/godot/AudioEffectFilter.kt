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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Allows frequencies other than the [cutoffHz] to pass.
 */
@GodotBaseType
public open class AudioEffectFilter : AudioEffect() {
  /**
   * Threshold frequency for the filter, in Hz.
   */
  public var cutoffHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCutoffPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCutoffPtr, NIL)
    }

  /**
   * Amount of boost in the frequency range near the cutoff frequency.
   */
  public var resonance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getResonancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setResonancePtr, NIL)
    }

  /**
   * Gain amount of the frequencies after the filter.
   */
  public var gain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
    }

  public var db: FilterDB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDbPtr, LONG)
      return AudioEffectFilter.FilterDB.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDbPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTFILTER, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCutoffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_cutoff")

    public val getCutoffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_cutoff")

    public val setResonancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "set_resonance")

    public val getResonancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectFilter", "get_resonance")

    public val setGainPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectFilter", "set_gain")

    public val getGainPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectFilter", "get_gain")

    public val setDbPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectFilter", "set_db")

    public val getDbPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectFilter", "get_db")
  }
}
