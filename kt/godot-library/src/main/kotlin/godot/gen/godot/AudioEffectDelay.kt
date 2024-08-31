// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays input signal back after a period of time. The delayed signal may be played back multiple
 * times to create the sound of a repeating, decaying echo. Delay effects range from a subtle echo
 * effect to a pronounced blending of previous sounds with new sounds.
 */
@GodotBaseType
public open class AudioEffectDelay : AudioEffect() {
  /**
   * Output percent of original sound. At 0, only delayed sounds are output. Value can range from 0
   * to 1.
   */
  public var dry: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
    }

  /**
   * If `true`, the first tap will be enabled.
   */
  public var tap1Active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTap1ActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1ActivePtr, NIL)
    }

  /**
   * First tap delay time in milliseconds.
   */
  public var tap1DelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1DelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1DelayMsPtr, NIL)
    }

  /**
   * Sound level for the first tap.
   */
  public var tap1LevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1LevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1LevelDbPtr, NIL)
    }

  /**
   * Pan position for the first tap. Value can range from -1 (fully left) to 1 (fully right).
   */
  public var tap1Pan: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap1PanPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap1PanPtr, NIL)
    }

  /**
   * If `true`, the second tap will be enabled.
   */
  public var tap2Active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTap2ActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2ActivePtr, NIL)
    }

  /**
   * Second tap delay time in milliseconds.
   */
  public var tap2DelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2DelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2DelayMsPtr, NIL)
    }

  /**
   * Sound level for the second tap.
   */
  public var tap2LevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2LevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2LevelDbPtr, NIL)
    }

  /**
   * Pan position for the second tap. Value can range from -1 (fully left) to 1 (fully right).
   */
  public var tap2Pan: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTap2PanPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTap2PanPtr, NIL)
    }

  /**
   * If `true`, feedback is enabled.
   */
  public var feedbackActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFeedbackActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackActivePtr, NIL)
    }

  /**
   * Feedback delay time in milliseconds.
   */
  public var feedbackDelayMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackDelayMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackDelayMsPtr, NIL)
    }

  /**
   * Sound level for feedback.
   */
  public var feedbackLevelDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackLevelDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackLevelDbPtr, NIL)
    }

  /**
   * Low-pass filter for feedback, in Hz. Frequencies below this value are filtered out of the
   * source signal.
   */
  public var feedbackLowpass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFeedbackLowpassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFeedbackLowpassPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTDELAY, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectDelay", "set_dry")

    public val getDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectDelay", "get_dry")

    public val setTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_active")

    public val isTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap1_active")

    public val setTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_delay_ms")

    public val getTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_delay_ms")

    public val setTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_level_db")

    public val getTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_level_db")

    public val setTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_pan")

    public val getTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_pan")

    public val setTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_active")

    public val isTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap2_active")

    public val setTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_delay_ms")

    public val getTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_delay_ms")

    public val setTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_level_db")

    public val getTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_level_db")

    public val setTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_pan")

    public val getTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_pan")

    public val setFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_active")

    public val isFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_feedback_active")

    public val setFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_delay_ms")

    public val getFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_delay_ms")

    public val setFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_level_db")

    public val getFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_level_db")

    public val setFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_lowpass")

    public val getFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_lowpass")
  }
}
