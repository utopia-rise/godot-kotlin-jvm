// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Combines phase-shifted signals with the original signal. The movement of the phase-shifted signals is controlled using a low-frequency oscillator.
 */
@GodotBaseType
public open class AudioEffectPhaser : AudioEffect() {
  /**
   * Determines the minimum frequency affected by the LFO modulations, in Hz. Value can range from 10 to 10000.
   */
  public final inline var rangeMinHz: Float
    @JvmName("rangeMinHzProperty")
    get() = getRangeMinHz()
    @JvmName("rangeMinHzProperty")
    set(`value`) {
      setRangeMinHz(value)
    }

  /**
   * Determines the maximum frequency affected by the LFO modulations, in Hz. Value can range from 10 to 10000.
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
   * Governs how high the filter frequencies sweep. Low value will primarily affect bass frequencies. High value can sweep high into the treble. Value can range from 0.1 to 4.
   */
  public final inline var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(68, scriptIndex)
  }

  public final fun setRangeMinHz(hz: Float) {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRangeMinHzPtr, NIL)
  }

  public final fun getRangeMinHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRangeMinHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRangeMaxHz(hz: Float) {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRangeMaxHzPtr, NIL)
  }

  public final fun getRangeMaxHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRateHz(hz: Float) {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRateHzPtr, NIL)
  }

  public final fun getRateHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedback(fbk: Float) {
    TransferContext.writeArguments(DOUBLE to fbk.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackPtr, NIL)
  }

  public final fun getFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepth(depth: Float) {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectPhaser::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_min_hz", 373_806_689)

    internal val getRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_min_hz", 1_740_695_150)

    internal val setRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_max_hz", 373_806_689)

    internal val getRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_max_hz", 1_740_695_150)

    internal val setRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_rate_hz", 373_806_689)

    internal val getRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_rate_hz", 1_740_695_150)

    internal val setFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_feedback", 373_806_689)

    internal val getFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_feedback", 1_740_695_150)

    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_depth", 373_806_689)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_depth", 1_740_695_150)
  }
}
