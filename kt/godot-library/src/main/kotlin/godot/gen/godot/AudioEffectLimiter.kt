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
 * Adds a soft-clip limiter audio effect to an Audio bus.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * A limiter is similar to a compressor, but it's less flexible and designed to disallow sound going over a given dB threshold. Adding one in the Master bus is always recommended to reduce the effects of clipping.
 *
 * Soft clipping starts to reduce the peaks a little below the threshold level and progressively increases its effect as the input level increases such that the threshold is never exceeded.
 */
@GodotBaseType
public open class AudioEffectLimiter : AudioEffect() {
  /**
   * The waveform's maximum allowed value, in decibels. Value can range from -20 to -0.1.
   */
  public var ceilingDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCeilingDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCeilingDbPtr, NIL)
    }

  /**
   * Threshold from which the limiter begins to be active, in decibels. Value can range from -30 to 0.
   */
  public var thresholdDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThresholdDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setThresholdDbPtr, NIL)
    }

  /**
   * Applies a gain to the limited waves, in decibels. Value can range from 0 to 6.
   */
  public var softClipDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSoftClipDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSoftClipDbPtr, NIL)
    }

  /**
   *
   */
  public var softClipRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSoftClipRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSoftClipRatioPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTLIMITER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_ceiling_db")

    public val getCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_ceiling_db")

    public val setThresholdDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_threshold_db")

    public val getThresholdDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_threshold_db")

    public val setSoftClipDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_soft_clip_db")

    public val getSoftClipDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_soft_clip_db")

    public val setSoftClipRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "set_soft_clip_ratio")

    public val getSoftClipRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectLimiter", "get_soft_clip_ratio")
  }
}
