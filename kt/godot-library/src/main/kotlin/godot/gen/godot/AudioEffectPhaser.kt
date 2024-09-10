// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
  public var rangeMinHz: Float
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
  public var rangeMaxHz: Float
    @JvmName("rangeMaxHzProperty")
    get() = getRangeMaxHz()
    @JvmName("rangeMaxHzProperty")
    set(`value`) {
      setRangeMaxHz(value)
    }

  /**
   * Adjusts the rate in Hz at which the effect sweeps up and down across the frequency range.
   */
  public var rateHz: Float
    @JvmName("rateHzProperty")
    get() = getRateHz()
    @JvmName("rateHzProperty")
    set(`value`) {
      setRateHz(value)
    }

  /**
   * Output percent of modified sound. Value can range from 0.1 to 0.9.
   */
  public var feedback: Float
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
  public var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTPHASER, scriptIndex)
  }

  public fun setRangeMinHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRangeMinHzPtr, NIL)
  }

  public fun getRangeMinHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRangeMinHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRangeMaxHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRangeMaxHzPtr, NIL)
  }

  public fun getRangeMaxHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRateHz(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRateHzPtr, NIL)
  }

  public fun getRateHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFeedback(fbk: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fbk.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackPtr, NIL)
  }

  public fun getFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDepth(depth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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
