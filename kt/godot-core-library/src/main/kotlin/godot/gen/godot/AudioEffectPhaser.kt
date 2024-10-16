// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Combines phase-shifted signals with the original signal. The movement of the phase-shifted
 * signals is controlled using a low-frequency oscillator.
 */
@GodotBaseType
public open class AudioEffectPhaser : AudioEffect() {
  /**
   * Determines the minimum frequency affected by the LFO modulations, in Hz. Value can range from
   * 10 to 10000.
   */
  public final inline var rangeMinHz: Float
    @JvmName("rangeMinHzProperty")
    get() = getRangeMinHz()
    @JvmName("rangeMinHzProperty")
    set(`value`) {
      setRangeMinHz(value)
    }

  /**
   * Determines the maximum frequency affected by the LFO modulations, in Hz. Value can range from
   * 10 to 10000.
   */
  public final inline var rangeMaxHz: Float
    @JvmName("rangeMaxHzProperty")
    get() = getRangeMaxHz()
    @JvmName("rangeMaxHzProperty")
    set(`value`) {
      setRangeMaxHz(value)
    }

  /**
   * Adjusts the rate in Hz at which the effect sweeps up and down across the frequency range.
   */
  public final inline var rateHz: Float
    @JvmName("rateHzProperty")
    get() = getRateHz()
    @JvmName("rateHzProperty")
    set(`value`) {
      setRateHz(value)
    }

  /**
   * Output percent of modified sound. Value can range from 0.1 to 0.9.
   */
  public final inline var feedback: Float
    @JvmName("feedbackProperty")
    get() = getFeedback()
    @JvmName("feedbackProperty")
    set(`value`) {
      setFeedback(value)
    }

  /**
   * Governs how high the filter frequencies sweep. Low value will primarily affect bass
   * frequencies. High value can sweep high into the treble. Value can range from 0.1 to 4.
   */
  public final inline var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_AUDIOEFFECTPHASER, scriptIndex)
  }

  public final fun setRangeMinHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRangeMinHzPtr, NIL)
  }

  public final fun getRangeMinHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRangeMinHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRangeMaxHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRangeMaxHzPtr, NIL)
  }

  public final fun getRangeMaxHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRateHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRateHzPtr, NIL)
  }

  public final fun getRateHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedback(fbk: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fbk.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackPtr, NIL)
  }

  public final fun getFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepth(depth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_min_hz", 373806689)

    public val getRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_min_hz", 1740695150)

    public val setRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_max_hz", 373806689)

    public val getRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_max_hz", 1740695150)

    public val setRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_rate_hz", 373806689)

    public val getRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_rate_hz", 1740695150)

    public val setFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_feedback", 373806689)

    public val getFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_feedback", 1740695150)

    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_depth", 373806689)

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_depth", 1740695150)
  }
}
