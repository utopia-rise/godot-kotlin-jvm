// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTPHASER_INDEX: Int = 103

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
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTPHASER_INDEX, scriptIndex)
  }

  public final fun setRangeMinHz(hz: Float): Unit {
    Internals.writeArguments(DOUBLE to hz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRangeMinHzPtr, NIL)
  }

  public final fun getRangeMinHz(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRangeMinHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRangeMaxHz(hz: Float): Unit {
    Internals.writeArguments(DOUBLE to hz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRangeMaxHzPtr, NIL)
  }

  public final fun getRangeMaxHz(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRateHz(hz: Float): Unit {
    Internals.writeArguments(DOUBLE to hz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRateHzPtr, NIL)
  }

  public final fun getRateHz(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRateHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedback(fbk: Float): Unit {
    Internals.writeArguments(DOUBLE to fbk.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFeedbackPtr, NIL)
  }

  public final fun getFeedback(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFeedbackPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepth(depth: Float): Unit {
    Internals.writeArguments(DOUBLE to depth.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRangeMinHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "set_range_min_hz", 373806689)

    public val getRangeMinHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "get_range_min_hz", 1740695150)

    public val setRangeMaxHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "set_range_max_hz", 373806689)

    public val getRangeMaxHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "get_range_max_hz", 1740695150)

    public val setRateHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "set_rate_hz", 373806689)

    public val getRateHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "get_rate_hz", 1740695150)

    public val setFeedbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "set_feedback", 373806689)

    public val getFeedbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "get_feedback", 1740695150)

    public val setDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "set_depth", 373806689)

    public val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectPhaser", "get_depth", 1740695150)
  }
}
