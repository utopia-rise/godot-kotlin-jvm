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

/**
 * A limiter is an effect designed to disallow sound from going over a given dB threshold. Hard
 * limiters predict volume peaks, and will smoothly apply gain reduction when a peak crosses the
 * ceiling threshold to prevent clipping and distortion. It preserves the waveform and prevents it from
 * crossing the ceiling threshold. Adding one in the Master bus is recommended as a safety measure to
 * prevent sudden volume peaks from occurring, and to prevent distortion caused by clipping.
 */
@GodotBaseType
public open class AudioEffectHardLimiter : AudioEffect() {
  /**
   * Gain to apply before limiting, in decibels.
   */
  public var preGainDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreGainDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPreGainDbPtr, NIL)
    }

  /**
   * The waveform's maximum allowed value, in decibels. This value can range from `-24.0` to `0.0`.
   * The default value of `-0.3` prevents potential inter-sample peaks (ISP) from crossing over 0
   * dB, which can cause slight distortion on some older hardware.
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
   * Time it takes in seconds for the gain reduction to fully release.
   */
  public var release: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReleasePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReleasePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTHARDLIMITER, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_ceiling_db")

    public val getCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_ceiling_db")

    public val setPreGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_pre_gain_db")

    public val getPreGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_pre_gain_db")

    public val setReleasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_release")

    public val getReleasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_release")
  }
}
