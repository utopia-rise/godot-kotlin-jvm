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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var dry: Float
    @JvmName("dryProperty")
    get() = getDry()
    @JvmName("dryProperty")
    set(`value`) {
      setDry(value)
    }

  /**
   * If `true`, the first tap will be enabled.
   */
  public final inline var tap1Active: Boolean
    @JvmName("tap1ActiveProperty")
    get() = isTap1Active()
    @JvmName("tap1ActiveProperty")
    set(`value`) {
      setTap1Active(value)
    }

  /**
   * First tap delay time in milliseconds.
   */
  public final inline var tap1DelayMs: Float
    @JvmName("tap1DelayMsProperty")
    get() = getTap1DelayMs()
    @JvmName("tap1DelayMsProperty")
    set(`value`) {
      setTap1DelayMs(value)
    }

  /**
   * Sound level for the first tap.
   */
  public final inline var tap1LevelDb: Float
    @JvmName("tap1LevelDbProperty")
    get() = getTap1LevelDb()
    @JvmName("tap1LevelDbProperty")
    set(`value`) {
      setTap1LevelDb(value)
    }

  /**
   * Pan position for the first tap. Value can range from -1 (fully left) to 1 (fully right).
   */
  public final inline var tap1Pan: Float
    @JvmName("tap1PanProperty")
    get() = getTap1Pan()
    @JvmName("tap1PanProperty")
    set(`value`) {
      setTap1Pan(value)
    }

  /**
   * If `true`, the second tap will be enabled.
   */
  public final inline var tap2Active: Boolean
    @JvmName("tap2ActiveProperty")
    get() = isTap2Active()
    @JvmName("tap2ActiveProperty")
    set(`value`) {
      setTap2Active(value)
    }

  /**
   * Second tap delay time in milliseconds.
   */
  public final inline var tap2DelayMs: Float
    @JvmName("tap2DelayMsProperty")
    get() = getTap2DelayMs()
    @JvmName("tap2DelayMsProperty")
    set(`value`) {
      setTap2DelayMs(value)
    }

  /**
   * Sound level for the second tap.
   */
  public final inline var tap2LevelDb: Float
    @JvmName("tap2LevelDbProperty")
    get() = getTap2LevelDb()
    @JvmName("tap2LevelDbProperty")
    set(`value`) {
      setTap2LevelDb(value)
    }

  /**
   * Pan position for the second tap. Value can range from -1 (fully left) to 1 (fully right).
   */
  public final inline var tap2Pan: Float
    @JvmName("tap2PanProperty")
    get() = getTap2Pan()
    @JvmName("tap2PanProperty")
    set(`value`) {
      setTap2Pan(value)
    }

  /**
   * If `true`, feedback is enabled.
   */
  public final inline var feedbackActive: Boolean
    @JvmName("feedbackActiveProperty")
    get() = isFeedbackActive()
    @JvmName("feedbackActiveProperty")
    set(`value`) {
      setFeedbackActive(value)
    }

  /**
   * Feedback delay time in milliseconds.
   */
  public final inline var feedbackDelayMs: Float
    @JvmName("feedbackDelayMsProperty")
    get() = getFeedbackDelayMs()
    @JvmName("feedbackDelayMsProperty")
    set(`value`) {
      setFeedbackDelayMs(value)
    }

  /**
   * Sound level for feedback.
   */
  public final inline var feedbackLevelDb: Float
    @JvmName("feedbackLevelDbProperty")
    get() = getFeedbackLevelDb()
    @JvmName("feedbackLevelDbProperty")
    set(`value`) {
      setFeedbackLevelDb(value)
    }

  /**
   * Low-pass filter for feedback, in Hz. Frequencies below this value are filtered out of the
   * source signal.
   */
  public final inline var feedbackLowpass: Float
    @JvmName("feedbackLowpassProperty")
    get() = getFeedbackLowpass()
    @JvmName("feedbackLowpassProperty")
    set(`value`) {
      setFeedbackLowpass(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(53, scriptPtr)
  }

  public final fun setDry(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDryPtr, NIL)
  }

  public final fun getDry(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDryPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap1Active(amount: Boolean): Unit {
    TransferContext.writeArguments(BOOL to amount)
    TransferContext.callMethod(ptr, MethodBindings.setTap1ActivePtr, NIL)
  }

  public final fun isTap1Active(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTap1ActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTap1DelayMs(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap1DelayMsPtr, NIL)
  }

  public final fun getTap1DelayMs(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap1DelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap1LevelDb(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap1LevelDbPtr, NIL)
  }

  public final fun getTap1LevelDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap1LevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap1Pan(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap1PanPtr, NIL)
  }

  public final fun getTap1Pan(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap1PanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap2Active(amount: Boolean): Unit {
    TransferContext.writeArguments(BOOL to amount)
    TransferContext.callMethod(ptr, MethodBindings.setTap2ActivePtr, NIL)
  }

  public final fun isTap2Active(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTap2ActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTap2DelayMs(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap2DelayMsPtr, NIL)
  }

  public final fun getTap2DelayMs(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap2DelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap2LevelDb(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap2LevelDbPtr, NIL)
  }

  public final fun getTap2LevelDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap2LevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTap2Pan(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTap2PanPtr, NIL)
  }

  public final fun getTap2Pan(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTap2PanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedbackActive(amount: Boolean): Unit {
    TransferContext.writeArguments(BOOL to amount)
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackActivePtr, NIL)
  }

  public final fun isFeedbackActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFeedbackActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFeedbackDelayMs(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackDelayMsPtr, NIL)
  }

  public final fun getFeedbackDelayMs(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedbackDelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedbackLevelDb(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackLevelDbPtr, NIL)
  }

  public final fun getFeedbackLevelDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedbackLevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFeedbackLowpass(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFeedbackLowpassPtr, NIL)
  }

  public final fun getFeedbackLowpass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedbackLowpassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectDelay::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_dry", 373806689)

    internal val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_dry", 191475506)

    internal val setTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_active", 2586408642)

    internal val isTap1ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap1_active", 36873697)

    internal val setTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_delay_ms", 373806689)

    internal val getTap1DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_delay_ms", 1740695150)

    internal val setTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_level_db", 373806689)

    internal val getTap1LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_level_db", 1740695150)

    internal val setTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap1_pan", 373806689)

    internal val getTap1PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap1_pan", 1740695150)

    internal val setTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_active", 2586408642)

    internal val isTap2ActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_tap2_active", 36873697)

    internal val setTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_delay_ms", 373806689)

    internal val getTap2DelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_delay_ms", 1740695150)

    internal val setTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_level_db", 373806689)

    internal val getTap2LevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_level_db", 1740695150)

    internal val setTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_tap2_pan", 373806689)

    internal val getTap2PanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_tap2_pan", 1740695150)

    internal val setFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_active", 2586408642)

    internal val isFeedbackActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "is_feedback_active", 36873697)

    internal val setFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_delay_ms", 373806689)

    internal val getFeedbackDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_delay_ms", 1740695150)

    internal val setFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_level_db", 373806689)

    internal val getFeedbackLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_level_db", 1740695150)

    internal val setFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "set_feedback_lowpass", 373806689)

    internal val getFeedbackLowpassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDelay", "get_feedback_lowpass", 1740695150)
  }
}
