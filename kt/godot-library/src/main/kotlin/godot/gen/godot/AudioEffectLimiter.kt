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
 * A limiter is similar to a compressor, but it's less flexible and designed to disallow sound going
 * over a given dB threshold. Adding one in the Master bus is always recommended to reduce the effects
 * of clipping.
 * Soft clipping starts to reduce the peaks a little below the threshold level and progressively
 * increases its effect as the input level increases such that the threshold is never exceeded.
 */
@GodotBaseType
public open class AudioEffectLimiter : AudioEffect() {
  /**
   * The waveform's maximum allowed value, in decibels. Value can range from -20 to -0.1.
   */
  public final inline var ceilingDb: Float
    @JvmName("ceilingDbProperty")
    get() = getCeilingDb()
    @JvmName("ceilingDbProperty")
    set(`value`) {
      setCeilingDb(value)
    }

  /**
   * Threshold from which the limiter begins to be active, in decibels. Value can range from -30 to
   * 0.
   */
  public final inline var thresholdDb: Float
    @JvmName("thresholdDbProperty")
    get() = getThresholdDb()
    @JvmName("thresholdDbProperty")
    set(`value`) {
      setThresholdDb(value)
    }

  /**
   * Applies a gain to the limited waves, in decibels. Value can range from 0 to 6.
   */
  public final inline var softClipDb: Float
    @JvmName("softClipDbProperty")
    get() = getSoftClipDb()
    @JvmName("softClipDbProperty")
    set(`value`) {
      setSoftClipDb(value)
    }

  public final inline var softClipRatio: Float
    @JvmName("softClipRatioProperty")
    get() = getSoftClipRatio()
    @JvmName("softClipRatioProperty")
    set(`value`) {
      setSoftClipRatio(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTLIMITER, scriptIndex)
  }

  public final fun setCeilingDb(ceiling: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ceiling.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCeilingDbPtr, NIL)
  }

  public final fun getCeilingDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCeilingDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setThresholdDb(threshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setThresholdDbPtr, NIL)
  }

  public final fun getThresholdDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThresholdDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSoftClipDb(softClip: Float): Unit {
    TransferContext.writeArguments(DOUBLE to softClip.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSoftClipDbPtr, NIL)
  }

  public final fun getSoftClipDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSoftClipDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSoftClipRatio(softClip: Float): Unit {
    TransferContext.writeArguments(DOUBLE to softClip.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSoftClipRatioPtr, NIL)
  }

  public final fun getSoftClipRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSoftClipRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_ceiling_db", 373806689)

    public val getCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_ceiling_db", 1740695150)

    public val setThresholdDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_threshold_db", 373806689)

    public val getThresholdDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_threshold_db", 1740695150)

    public val setSoftClipDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_soft_clip_db", 373806689)

    public val getSoftClipDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_soft_clip_db", 1740695150)

    public val setSoftClipRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_soft_clip_ratio", 373806689)

    public val getSoftClipRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_soft_clip_ratio", 1740695150)
  }
}
