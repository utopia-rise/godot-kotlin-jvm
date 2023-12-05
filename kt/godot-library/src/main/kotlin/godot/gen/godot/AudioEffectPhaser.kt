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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Adds a phaser audio effect to an audio bus.
 *
 * Combines the original signal with a copy that is slightly out of phase with the original.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Combines phase-shifted signals with the original signal. The movement of the phase-shifted signals is controlled using a low-frequency oscillator.
 */
@GodotBaseType
public open class AudioEffectPhaser : AudioEffect() {
  /**
   * Determines the minimum frequency affected by the LFO modulations, in Hz. Value can range from 10 to 10000.
   */
  public var rangeMinHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangeMinHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRangeMinHzPtr, NIL)
    }

  /**
   * Determines the maximum frequency affected by the LFO modulations, in Hz. Value can range from 10 to 10000.
   */
  public var rangeMaxHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangeMaxHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRangeMaxHzPtr, NIL)
    }

  /**
   * Adjusts the rate in Hz at which the effect sweeps up and down across the frequency range.
   */
  public var rateHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRateHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRateHzPtr, NIL)
    }

  /**
   * Output percent of modified sound. Value can range from 0.1 to 0.9.
   */
  public var feedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackPtr, NIL)
    }

  /**
   * Governs how high the filter frequencies sweep. Low value will primarily affect bass frequencies. High value can sweep high into the treble. Value can range from 0.1 to 4.
   */
  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTPHASER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_min_hz")

    public val getRangeMinHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_min_hz")

    public val setRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_range_max_hz")

    public val getRangeMaxHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_range_max_hz")

    public val setRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_rate_hz")

    public val getRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_rate_hz")

    public val setFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_feedback")

    public val getFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_feedback")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectPhaser", "set_depth")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectPhaser", "get_depth")
  }
}
